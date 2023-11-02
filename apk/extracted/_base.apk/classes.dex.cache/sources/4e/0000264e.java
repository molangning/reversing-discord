package com.facebook.react.packagerconnection;

import android.net.Uri;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.ReconnectingWebSocket;
import java.util.Map;
import okio.ByteString;
import org.json.JSONObject;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class JSPackagerClient implements ReconnectingWebSocket.MessageCallback {
    private static final int PROTOCOL_VERSION = 2;
    private static final String TAG = "JSPackagerClient";
    private Map<String, RequestHandler> mRequestHandlers;
    private ReconnectingWebSocket mWebSocket;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class ResponderImpl implements Responder {
        private Object mId;

        public ResponderImpl(Object obj) {
            JSPackagerClient.this = r1;
            this.mId = obj;
        }

        @Override // com.facebook.react.packagerconnection.Responder
        public void error(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.mId);
                jSONObject.put("error", obj);
                JSPackagerClient.this.mWebSocket.sendMessage(jSONObject.toString());
            } catch (Exception e) {
                C13677a.m1853k(JSPackagerClient.TAG, "Responding with error failed", e);
            }
        }

        @Override // com.facebook.react.packagerconnection.Responder
        public void respond(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.mId);
                jSONObject.put("result", obj);
                JSPackagerClient.this.mWebSocket.sendMessage(jSONObject.toString());
            } catch (Exception e) {
                C13677a.m1853k(JSPackagerClient.TAG, "Responding failed", e);
            }
        }
    }

    public JSPackagerClient(String str, PackagerConnectionSettings packagerConnectionSettings, Map<String, RequestHandler> map) {
        this(str, packagerConnectionSettings, map, null);
    }

    private void abortOnMessage(Object obj, String str) {
        if (obj != null) {
            new ResponderImpl(obj).error(str);
        }
        String str2 = TAG;
        C13677a.m1854j(str2, "Handling the message failed with reason: " + str);
    }

    public void close() {
        this.mWebSocket.closeQuietly();
    }

    public void init() {
        this.mWebSocket.connect();
    }

    @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.MessageCallback
    public void onMessage(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("version");
            String optString = jSONObject.optString("method");
            Object opt = jSONObject.opt("id");
            Object opt2 = jSONObject.opt("params");
            if (optInt != 2) {
                String str2 = TAG;
                C13677a.m1854j(str2, "Message with incompatible or missing version of protocol received: " + optInt);
            } else if (optString == null) {
                abortOnMessage(opt, "No method provided");
            } else {
                RequestHandler requestHandler = this.mRequestHandlers.get(optString);
                if (requestHandler == null) {
                    abortOnMessage(opt, "No request handler for method: " + optString);
                } else if (opt == null) {
                    requestHandler.onNotification(opt2);
                } else {
                    requestHandler.onRequest(opt2, new ResponderImpl(opt));
                }
            }
        } catch (Exception e) {
            C13677a.m1853k(TAG, "Handling the message failed", e);
        }
    }

    public JSPackagerClient(String str, PackagerConnectionSettings packagerConnectionSettings, Map<String, RequestHandler> map, ReconnectingWebSocket.ConnectionCallback connectionCallback) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("ws").encodedAuthority(packagerConnectionSettings.getDebugServerHost()).appendPath("message").appendQueryParameter("device", AndroidInfoHelpers.getFriendlyDeviceName()).appendQueryParameter("app", packagerConnectionSettings.getPackageName()).appendQueryParameter("clientid", str);
        this.mWebSocket = new ReconnectingWebSocket(builder.build().toString(), this, connectionCallback);
        this.mRequestHandlers = map;
    }

    @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.MessageCallback
    public void onMessage(ByteString byteString) {
        C13677a.m1870H(TAG, "Websocket received message with payload of unexpected type binary");
    }
}
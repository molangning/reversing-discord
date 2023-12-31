package com.facebook.react.devsupport;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.facebook.react.common.JavascriptException;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import p058d5.C5743a;
import p164j$.util.concurrent.ConcurrentHashMap;
import p328rj.AbstractC12317s;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class JSDebuggerWebSocketClient extends AbstractC12317s {
    private static final String TAG = "JSDebuggerWebSocketClient";
    private JSDebuggerCallback mConnectCallback;
    private OkHttpClient mHttpClient;
    private WebSocket mWebSocket;
    private final AtomicInteger mRequestID = new AtomicInteger();
    private final ConcurrentHashMap<Integer, JSDebuggerCallback> mCallbacks = new ConcurrentHashMap<>();

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface JSDebuggerCallback {
        void onFailure(Throwable th2);

        void onSuccess(String str);
    }

    private void abort(String str, Throwable th2) {
        C13677a.m1853k(TAG, "Error occurred, shutting down websocket connection: " + str, th2);
        closeQuietly();
        JSDebuggerCallback jSDebuggerCallback = this.mConnectCallback;
        if (jSDebuggerCallback != null) {
            jSDebuggerCallback.onFailure(th2);
            this.mConnectCallback = null;
        }
        for (JSDebuggerCallback jSDebuggerCallback2 : this.mCallbacks.values()) {
            jSDebuggerCallback2.onFailure(th2);
        }
        this.mCallbacks.clear();
    }

    private void sendMessage(int i, String str) {
        WebSocket webSocket = this.mWebSocket;
        if (webSocket == null) {
            triggerRequestFailure(i, new IllegalStateException("WebSocket connection no longer valid"));
            return;
        }
        try {
            webSocket.mo8660b(str);
        } catch (Exception e) {
            triggerRequestFailure(i, e);
        }
    }

    private void triggerRequestFailure(int i, Throwable th2) {
        JSDebuggerCallback jSDebuggerCallback = this.mCallbacks.get(Integer.valueOf(i));
        if (jSDebuggerCallback != null) {
            this.mCallbacks.remove(Integer.valueOf(i));
            jSDebuggerCallback.onFailure(th2);
        }
    }

    private void triggerRequestSuccess(int i, String str) {
        JSDebuggerCallback jSDebuggerCallback = this.mCallbacks.get(Integer.valueOf(i));
        if (jSDebuggerCallback != null) {
            this.mCallbacks.remove(Integer.valueOf(i));
            jSDebuggerCallback.onSuccess(str);
        }
    }

    public void closeQuietly() {
        WebSocket webSocket = this.mWebSocket;
        if (webSocket != null) {
            try {
                webSocket.mo8659g(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, "End of session");
            } catch (Exception unused) {
            }
            this.mWebSocket = null;
        }
    }

    public void connect(String str, JSDebuggerCallback jSDebuggerCallback) {
        if (this.mHttpClient == null) {
            this.mConnectCallback = jSDebuggerCallback;
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.mHttpClient = builder.m8769e(10L, timeUnit).m8774P(10L, timeUnit).m8775O(0L, TimeUnit.MINUTES).m8771c();
            this.mHttpClient.m8824C(new Request.Builder().m8722l(str).m8732b(), this);
            return;
        }
        throw new IllegalStateException("JSDebuggerWebSocketClient is already initialized.");
    }

    public void executeJSCall(String str, String str2, JSDebuggerCallback jSDebuggerCallback) {
        int andIncrement = this.mRequestID.getAndIncrement();
        this.mCallbacks.put(Integer.valueOf(andIncrement), jSDebuggerCallback);
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject().name("id").value(andIncrement).name("method").value(str);
            stringWriter.append((CharSequence) ",\"arguments\":").append((CharSequence) str2);
            jsonWriter.endObject().close();
            sendMessage(andIncrement, stringWriter.toString());
        } catch (IOException e) {
            triggerRequestFailure(andIncrement, e);
        }
    }

    public void loadBundle(String str, HashMap<String, String> hashMap, JSDebuggerCallback jSDebuggerCallback) {
        int andIncrement = this.mRequestID.getAndIncrement();
        this.mCallbacks.put(Integer.valueOf(andIncrement), jSDebuggerCallback);
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter beginObject = new JsonWriter(stringWriter).beginObject().name("id").value(andIncrement).name("method").value("executeApplicationScript").name("url").value(str).name("inject").beginObject();
            for (String str2 : hashMap.keySet()) {
                beginObject.name(str2).value(hashMap.get(str2));
            }
            beginObject.endObject().endObject().close();
            sendMessage(andIncrement, stringWriter.toString());
        } catch (IOException e) {
            triggerRequestFailure(andIncrement, e);
        }
    }

    @Override // p328rj.AbstractC12317s
    public void onClosed(WebSocket webSocket, int i, String str) {
        this.mWebSocket = null;
    }

    @Override // p328rj.AbstractC12317s
    public void onFailure(WebSocket webSocket, Throwable th2, Response response) {
        abort("Websocket exception", th2);
    }

    @Override // p328rj.AbstractC12317s
    public void onMessage(WebSocket webSocket, String str) {
        Integer num = null;
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            jsonReader.beginObject();
            String str2 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (JsonToken.NULL == jsonReader.peek()) {
                    jsonReader.skipValue();
                } else if ("replyID".equals(nextName)) {
                    num = Integer.valueOf(jsonReader.nextInt());
                } else if ("result".equals(nextName)) {
                    str2 = jsonReader.nextString();
                } else if ("error".equals(nextName)) {
                    String nextString = jsonReader.nextString();
                    abort(nextString, new JavascriptException(nextString));
                }
            }
            if (num != null) {
                triggerRequestSuccess(num.intValue(), str2);
            }
        } catch (IOException e) {
            if (num != null) {
                triggerRequestFailure(num.intValue(), e);
            } else {
                abort("Parsing response message from websocket failed", e);
            }
        }
    }

    @Override // p328rj.AbstractC12317s
    public void onOpen(WebSocket webSocket, Response response) {
        this.mWebSocket = webSocket;
        ((JSDebuggerCallback) C5743a.m24583c(this.mConnectCallback)).onSuccess(null);
        this.mConnectCallback = null;
    }

    public void prepareJSRuntime(JSDebuggerCallback jSDebuggerCallback) {
        int andIncrement = this.mRequestID.getAndIncrement();
        this.mCallbacks.put(Integer.valueOf(andIncrement), jSDebuggerCallback);
        try {
            StringWriter stringWriter = new StringWriter();
            new JsonWriter(stringWriter).beginObject().name("id").value(andIncrement).name("method").value("prepareJSRuntime").endObject().close();
            sendMessage(andIncrement, stringWriter.toString());
        } catch (IOException e) {
            triggerRequestFailure(andIncrement, e);
        }
    }
}
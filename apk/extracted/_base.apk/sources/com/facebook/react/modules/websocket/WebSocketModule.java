package com.facebook.react.modules.websocket;

import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okio.ByteString;
import p164j$.util.concurrent.ConcurrentHashMap;
import p328rj.AbstractC12317s;
import p414x2.C13677a;

@ReactModule(hasConstants = false, name = NativeWebSocketModuleSpec.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class WebSocketModule extends NativeWebSocketModuleSpec {
    private final Map<Integer, ContentHandler> mContentHandlers;
    private ForwardingCookieHandler mCookieHandler;
    public OnOpenHandler mOnOpenHandler;
    private final Map<Integer, WebSocket> mWebSocketConnections;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface ContentHandler {
        void onMessage(String str, WritableMap writableMap);

        void onMessage(ByteString byteString, WritableMap writableMap);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface OnOpenHandler {
        void onOpen(WebSocket webSocket, int i);
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOnOpenHandler = null;
        this.mWebSocketConnections = new ConcurrentHashMap();
        this.mContentHandlers = new ConcurrentHashMap();
        this.mCookieHandler = new ForwardingCookieHandler(reactApplicationContext);
    }

    private String getCookie(String str) {
        try {
            List<String> list = this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get("Cookie");
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        }
    }

    private static String getDefaultOrigin(String str) {
        boolean z;
        try {
            String str2 = "";
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            int hashCode = scheme.hashCode();
            if (hashCode != 3804) {
                if (hashCode != 118039) {
                    if (hashCode != 3213448) {
                        if (hashCode == 99617003 && scheme.equals("https")) {
                            z = true;
                        }
                        z = true;
                    } else {
                        if (scheme.equals("http")) {
                            z = true;
                        }
                        z = true;
                    }
                } else {
                    if (scheme.equals("wss")) {
                        z = false;
                    }
                    z = true;
                }
            } else {
                if (scheme.equals("ws")) {
                    z = true;
                }
                z = true;
            }
            if (z) {
                if (!z) {
                    if (z || z) {
                        str2 = "" + uri.getScheme();
                    }
                } else {
                    str2 = "http";
                }
            } else {
                str2 = "https";
            }
            if (uri.getPort() != -1) {
                return String.format("%s://%s:%s", str2, uri.getHost(), Integer.valueOf(uri.getPort()));
            }
            return String.format("%s://%s", str2, uri.getHost());
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to set " + str + " as default origin header");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyWebSocketFailed(int i, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("message", str);
        sendEvent("websocketFailed", createMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(str, writableMap);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double d, String str, double d2) {
        int i = (int) d2;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            return;
        }
        try {
            webSocket.mo8659g((int) d, str);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
        } catch (Exception e) {
            C13677a.m1853k(ReactConstants.TAG, "Could not close WebSocket connection for id " + i, e);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d) {
        boolean z;
        final int i = (int) d;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient m8771c = builder.m8769e(10L, timeUnit).m8774P(10L, timeUnit).m8775O(0L, TimeUnit.MINUTES).m8771c();
        Request.Builder m8722l = new Request.Builder().m8723k(Integer.valueOf(i)).m8722l(str);
        String cookie = getCookie(str);
        if (cookie != null) {
            m8722l.m8733a("Cookie", cookie);
        }
        if (readableMap != null && readableMap.hasKey("headers") && readableMap.getType("headers").equals(ReadableType.Map)) {
            ReadableMap map = readableMap.getMap("headers");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            z = false;
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (ReadableType.String.equals(map.getType(nextKey))) {
                    if (nextKey.equalsIgnoreCase("origin")) {
                        z = true;
                    }
                    m8722l.m8733a(nextKey, map.getString(nextKey));
                } else {
                    C13677a.m1870H(ReactConstants.TAG, "Ignoring: requested " + nextKey + ", value not a string");
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            m8722l.m8733a("origin", getDefaultOrigin(str));
        }
        if (readableArray != null && readableArray.size() > 0) {
            StringBuilder sb2 = new StringBuilder("");
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                String trim = readableArray.getString(i2).trim();
                if (!trim.isEmpty() && !trim.contains(",")) {
                    sb2.append(trim);
                    sb2.append(",");
                }
            }
            if (sb2.length() > 0) {
                sb2.replace(sb2.length() - 1, sb2.length(), "");
                m8722l.m8733a("Sec-WebSocket-Protocol", sb2.toString());
            }
        }
        m8771c.m8824C(m8722l.m8732b(), new AbstractC12317s() { // from class: com.facebook.react.modules.websocket.WebSocketModule.1
            @Override // p328rj.AbstractC12317s
            public void onClosed(WebSocket webSocket, int i3, String str2) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", i);
                createMap.putInt("code", i3);
                createMap.putString("reason", str2);
                WebSocketModule.this.sendEvent("websocketClosed", createMap);
            }

            @Override // p328rj.AbstractC12317s
            public void onClosing(WebSocket webSocket, int i3, String str2) {
                webSocket.mo8659g(i3, str2);
            }

            @Override // p328rj.AbstractC12317s
            public void onFailure(WebSocket webSocket, Throwable th2, Response response) {
                WebSocketModule.this.notifyWebSocketFailed(i, th2.getMessage());
            }

            @Override // p328rj.AbstractC12317s
            public void onMessage(WebSocket webSocket, String str2) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", i);
                createMap.putString("type", "text");
                ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
                if (contentHandler != null) {
                    contentHandler.onMessage(str2, createMap);
                } else {
                    createMap.putString("data", str2);
                }
                WebSocketModule.this.sendEvent("websocketMessage", createMap);
            }

            @Override // p328rj.AbstractC12317s
            public void onOpen(WebSocket webSocket, Response response) {
                WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(i), webSocket);
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", i);
                createMap.putString("protocol", response.m8691t("Sec-WebSocket-Protocol", ""));
                WebSocketModule.this.sendEvent("websocketOpen", createMap);
                OnOpenHandler onOpenHandler = WebSocketModule.this.mOnOpenHandler;
                if (onOpenHandler != null) {
                    onOpenHandler.onOpen(webSocket, i);
                }
            }

            @Override // p328rj.AbstractC12317s
            public void onMessage(WebSocket webSocket, ByteString byteString) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", i);
                createMap.putString("type", "binary");
                ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
                if (contentHandler != null) {
                    contentHandler.onMessage(byteString, createMap);
                } else {
                    createMap.putString("data", byteString.mo8572a());
                }
                WebSocketModule.this.sendEvent("websocketMessage", createMap);
            }
        });
        m8771c.m8798r().m8941d().shutdown();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        for (WebSocket webSocket : this.mWebSocketConnections.values()) {
            webSocket.mo8659g(RNCWebViewManager.COMMAND_CLEAR_CACHE, null);
        }
        this.mWebSocketConnections.clear();
        this.mContentHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double d) {
        int i = (int) d;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.mo8661a(ByteString.f29481m);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(String str, double d) {
        int i = (int) d;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.mo8660b(str);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(String str, double d) {
        int i = (int) d;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.mo8661a(ByteString.m8570c(str));
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    public void setContentHandler(int i, ContentHandler contentHandler) {
        if (contentHandler != null) {
            this.mContentHandlers.put(Integer.valueOf(i), contentHandler);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i));
        }
    }

    public void sendBinary(ByteString byteString, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.mo8661a(byteString);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }
}

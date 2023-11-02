package com.facebook.react.modules.network;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.StandardCharsets;
import com.facebook.react.common.network.OkHttpCallUtil;
import com.facebook.react.module.annotations.ReactModule;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.ByteString;
import p122gk.C6835i;
import p122gk.C6840m;
import p328rj.C12311o;
import p328rj.InterfaceC12283d;
import p414x2.C13677a;

@ReactModule(name = "Networking")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "Networking";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private static CustomClientBuilder customClientBuilder;
    private final OkHttpClient mClient;
    private final ForwardingCookieHandler mCookieHandler;
    private final CookieJarContainer mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<RequestBodyHandler> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    private final List<ResponseHandler> mResponseHandlers;
    private boolean mShuttingDown;
    private final List<UriHandler> mUriHandlers;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface CustomClientBuilder {
        void apply(OkHttpClient.Builder builder);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface RequestBodyHandler {
        boolean supports(ReadableMap readableMap);

        RequestBody toRequestBody(ReadableMap readableMap, String str);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface ResponseHandler {
        boolean supports(String str);

        WritableMap toResponseData(ResponseBody responseBody);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface UriHandler {
        WritableMap fetch(Uri uri);

        boolean supports(Uri uri, String str);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient, List<NetworkInterceptorCreator> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            OkHttpClient.Builder m8825B = okHttpClient.m8825B();
            for (NetworkInterceptorCreator networkInterceptorCreator : list) {
                m8825B.m8772b(networkInterceptorCreator.create());
            }
            okHttpClient = m8825B.m8771c();
        }
        this.mClient = okHttpClient;
        this.mCookieHandler = new ForwardingCookieHandler(reactApplicationContext);
        this.mCookieJarContainer = (CookieJarContainer) okHttpClient.m8799q();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    private synchronized void addRequest(int i) {
        this.mRequestIds.add(Integer.valueOf(i));
    }

    private static void applyCustomBuilder(OkHttpClient.Builder builder) {
        CustomClientBuilder customClientBuilder2 = customClientBuilder;
        if (customClientBuilder2 != null) {
            customClientBuilder2.apply(builder);
        }
    }

    private synchronized void cancelAllRequests() {
        for (Integer num : this.mRequestIds) {
            cancelRequest(num.intValue());
        }
        this.mRequestIds.clear();
    }

    private void cancelRequest(final int i) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.network.NetworkingModule.4
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public void doInBackgroundGuarded(Void... voidArr) {
                OkHttpCallUtil.cancelTag(NetworkingModule.this.mClient, Integer.valueOf(i));
            }
        }.execute(new Void[0]);
    }

    private MultipartBody.Builder constructMultipartBody(ReadableArray readableArray, String str, int i) {
        MediaType mediaType;
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.m8830d(MediaType.m8839f(str));
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReadableMap map = readableArray.getMap(i2);
            Headers extractHeaders = extractHeaders(map.getArray("headers"), null);
            if (extractHeaders == null) {
                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, "Missing or invalid header format for FormData part.", null);
                return null;
            }
            String m8929a = extractHeaders.m8929a(CONTENT_TYPE_HEADER_NAME);
            if (m8929a != null) {
                mediaType = MediaType.m8839f(m8929a);
                extractHeaders = extractHeaders.m8927h().m8916g(CONTENT_TYPE_HEADER_NAME).m8919d();
            } else {
                mediaType = null;
            }
            if (map.hasKey(REQUEST_BODY_KEY_STRING)) {
                builder.m8833a(extractHeaders, RequestBody.create(mediaType, map.getString(REQUEST_BODY_KEY_STRING)));
            } else if (map.hasKey(REQUEST_BODY_KEY_URI)) {
                if (mediaType == null) {
                    ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, "Binary FormData part needs a content-type header.", null);
                    return null;
                }
                String string = map.getString(REQUEST_BODY_KEY_URI);
                InputStream fileInputStream = RequestBodyUtil.getFileInputStream(getReactApplicationContext(), string);
                if (fileInputStream == null) {
                    ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, "Could not retrieve file for uri " + string, null);
                    return null;
                }
                builder.m8833a(extractHeaders, RequestBodyUtil.create(mediaType, fileInputStream));
            } else {
                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, "Unrecognized FormData part.", null);
            }
        }
        return builder;
    }

    private Headers extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        Headers.C11194a c11194a = new Headers.C11194a();
        int size = readableArray.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ReadableArray array = readableArray.getArray(i);
            if (array != null && array.size() == 2) {
                String stripHeaderName = HeaderUtil.stripHeaderName(array.getString(0));
                String stripHeaderValue = HeaderUtil.stripHeaderValue(array.getString(1));
                if (stripHeaderName != null && stripHeaderValue != null) {
                    c11194a.m8922a(stripHeaderName, stripHeaderValue);
                }
            }
            return null;
        }
        if (c11194a.m8918e(USER_AGENT_HEADER_NAME) == null && (str = this.mDefaultUserAgent) != null) {
            c11194a.m8922a(USER_AGENT_HEADER_NAME, str);
        }
        if (readableMap != null && readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
            z = true;
        }
        if (!z) {
            c11194a.m8916g(CONTENT_ENCODING_HEADER_NAME);
        }
        return c11194a.m8919d();
    }

    public void readWithProgress(int i, ResponseBody responseBody) {
        long j;
        Charset m8842c;
        long j2 = -1;
        try {
            ProgressResponseBody progressResponseBody = (ProgressResponseBody) responseBody;
            j = progressResponseBody.totalBytesRead();
            try {
                j2 = progressResponseBody.contentLength();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j = -1;
        }
        if (responseBody.contentType() == null) {
            m8842c = StandardCharsets.UTF_8;
        } else {
            m8842c = responseBody.contentType().m8842c(StandardCharsets.UTF_8);
        }
        ProgressiveStringDecoder progressiveStringDecoder = new ProgressiveStringDecoder(m8842c);
        InputStream byteStream = responseBody.byteStream();
        try {
            byte[] bArr = new byte[MAX_CHUNK_SIZE_BETWEEN_FLUSHES];
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            while (true) {
                int read = byteStream.read(bArr);
                if (read != -1) {
                    ResponseUtil.onIncrementalDataReceived(reactApplicationContextIfActiveOrWarn, i, progressiveStringDecoder.decodeNext(bArr, read), j, j2);
                } else {
                    return;
                }
            }
        } finally {
            byteStream.close();
        }
    }

    public synchronized void removeRequest(int i) {
        this.mRequestIds.remove(Integer.valueOf(i));
    }

    public static void setCustomClientBuilder(CustomClientBuilder customClientBuilder2) {
        customClientBuilder = customClientBuilder2;
    }

    public static boolean shouldDispatch(long j, long j2) {
        return j2 + 100000000 < j;
    }

    public static WritableMap translateHeaders(Headers headers) {
        Bundle bundle = new Bundle();
        for (int i = 0; i < headers.size(); i++) {
            String m8928e = headers.m8928e(i);
            if (bundle.containsKey(m8928e)) {
                bundle.putString(m8928e, bundle.getString(m8928e) + ", " + headers.m8924o(i));
            } else {
                bundle.putString(m8928e, headers.m8924o(i));
            }
        }
        return Arguments.fromBundle(bundle);
    }

    private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, final int i) {
        if (requestBody == null) {
            return null;
        }
        final ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        return RequestBodyUtil.createProgressRequest(requestBody, new ProgressListener() { // from class: com.facebook.react.modules.network.NetworkingModule.3
            long last = System.nanoTime();

            @Override // com.facebook.react.modules.network.ProgressListener
            public void onProgress(long j, long j2, boolean z) {
                long nanoTime = System.nanoTime();
                if (z || NetworkingModule.shouldDispatch(nanoTime, this.last)) {
                    ResponseUtil.onDataSend(reactApplicationContextIfActiveOrWarn, i, j, j2);
                    this.last = nanoTime;
                }
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double d) {
        int i = (int) d;
        cancelRequest(i);
        removeRequest(i);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(String str) {
    }

    public void addRequestBodyHandler(RequestBodyHandler requestBodyHandler) {
        this.mRequestBodyHandlers.add(requestBodyHandler);
    }

    public void addResponseHandler(ResponseHandler responseHandler) {
        this.mResponseHandlers.add(responseHandler);
    }

    public void addUriHandler(UriHandler uriHandler) {
        this.mUriHandlers.add(uriHandler);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    @ReactMethod
    public void clearCookies(Callback callback) {
        this.mCookieHandler.clearCookies(callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.mCookieJarContainer.setCookieJar(new C12311o(this.mCookieHandler));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.destroy();
        this.mCookieJarContainer.removeCookieJar();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double d) {
    }

    public void removeRequestBodyHandler(RequestBodyHandler requestBodyHandler) {
        this.mRequestBodyHandlers.remove(requestBodyHandler);
    }

    public void removeResponseHandler(ResponseHandler responseHandler) {
        this.mResponseHandlers.remove(responseHandler);
    }

    public void removeUriHandler(UriHandler uriHandler) {
        this.mUriHandlers.remove(uriHandler);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(String str, String str2, double d, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, double d2, boolean z2) {
        int i = (int) d;
        try {
            sendRequestInternal(str, str2, i, readableArray, readableMap, str3, z, (int) d2, z2);
        } catch (Throwable th2) {
            C13677a.m1853k("Networking", "Failed to send url request: " + str2, th2);
            ResponseUtil.onRequestError(getReactApplicationContextIfActiveOrWarn(), i, th2.getMessage(), th2);
        }
    }

    public void sendRequestInternal(String str, String str2, final int i, ReadableArray readableArray, ReadableMap readableMap, final String str3, final boolean z, int i2, boolean z2) {
        RequestBodyHandler requestBodyHandler;
        RequestBody emptyBody;
        Charset m8842c;
        final ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        try {
            Uri parse = Uri.parse(str2);
            for (UriHandler uriHandler : this.mUriHandlers) {
                if (uriHandler.supports(parse, str3)) {
                    ResponseUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, i, uriHandler.fetch(parse));
                    ResponseUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, i);
                    return;
                }
            }
            try {
                Request.Builder m8722l = new Request.Builder().m8722l(str2);
                if (i != 0) {
                    m8722l.m8723k(Integer.valueOf(i));
                }
                OkHttpClient.Builder m8825B = this.mClient.m8825B();
                applyCustomBuilder(m8825B);
                if (!z2) {
                    m8825B.m8768f(CookieJar.f29286a);
                }
                if (z) {
                    m8825B.m8772b(new Interceptor() { // from class: com.facebook.react.modules.network.NetworkingModule.1
                        @Override // okhttp3.Interceptor
                        public Response intercept(Interceptor.Chain chain) {
                            Response mo1422b = chain.mo1422b(chain.mo1423a());
                            return mo1422b.m8706Q().m8688b(new ProgressResponseBody(mo1422b.m8699a(), new ProgressListener() { // from class: com.facebook.react.modules.network.NetworkingModule.1.1
                                long last = System.nanoTime();

                                @Override // com.facebook.react.modules.network.ProgressListener
                                public void onProgress(long j, long j2, boolean z3) {
                                    long nanoTime = System.nanoTime();
                                    if ((!z3 && !NetworkingModule.shouldDispatch(nanoTime, this.last)) || str3.equals("text")) {
                                        return;
                                    }
                                    C41461 c41461 = C41461.this;
                                    ResponseUtil.onDataReceivedProgress(reactApplicationContextIfActiveOrWarn, i, j, j2);
                                    this.last = nanoTime;
                                }
                            })).m8687c();
                        }
                    });
                }
                if (i2 != this.mClient.m8802m()) {
                    m8825B.m8769e(i2, TimeUnit.MILLISECONDS);
                }
                OkHttpClient m8771c = m8825B.m8771c();
                Headers extractHeaders = extractHeaders(readableArray, readableMap);
                if (extractHeaders == null) {
                    ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, "Unrecognized headers format", null);
                    return;
                }
                String m8929a = extractHeaders.m8929a(CONTENT_TYPE_HEADER_NAME);
                String m8929a2 = extractHeaders.m8929a(CONTENT_ENCODING_HEADER_NAME);
                m8722l.m8728f(extractHeaders);
                if (readableMap != null) {
                    Iterator<RequestBodyHandler> it = this.mRequestBodyHandlers.iterator();
                    while (it.hasNext()) {
                        requestBodyHandler = it.next();
                        if (requestBodyHandler.supports(readableMap)) {
                            break;
                        }
                    }
                }
                requestBodyHandler = null;
                if (readableMap != null) {
                    Locale locale = Locale.ROOT;
                    if (!str.toLowerCase(locale).equals("get") && !str.toLowerCase(locale).equals("head")) {
                        if (requestBodyHandler != null) {
                            emptyBody = requestBodyHandler.toRequestBody(readableMap, m8929a);
                        } else if (readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
                            if (m8929a == null) {
                                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, "Payload is set but no content-type header specified", null);
                                return;
                            }
                            String string = readableMap.getString(REQUEST_BODY_KEY_STRING);
                            MediaType m8839f = MediaType.m8839f(m8929a);
                            if (RequestBodyUtil.isGzipEncoding(m8929a2)) {
                                emptyBody = RequestBodyUtil.createGzip(m8839f, string);
                                if (emptyBody == null) {
                                    ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, "Failed to gzip request body", null);
                                    return;
                                }
                            } else {
                                if (m8839f == null) {
                                    m8842c = StandardCharsets.UTF_8;
                                } else {
                                    m8842c = m8839f.m8842c(StandardCharsets.UTF_8);
                                }
                                emptyBody = RequestBody.create(m8839f, string.getBytes(m8842c));
                            }
                        } else if (readableMap.hasKey(REQUEST_BODY_KEY_BASE64)) {
                            if (m8929a == null) {
                                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, "Payload is set but no content-type header specified", null);
                                return;
                            }
                            emptyBody = RequestBody.create(MediaType.m8839f(m8929a), ByteString.m8570c(readableMap.getString(REQUEST_BODY_KEY_BASE64)));
                        } else if (readableMap.hasKey(REQUEST_BODY_KEY_URI)) {
                            if (m8929a == null) {
                                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, "Payload is set but no content-type header specified", null);
                                return;
                            }
                            String string2 = readableMap.getString(REQUEST_BODY_KEY_URI);
                            InputStream fileInputStream = RequestBodyUtil.getFileInputStream(getReactApplicationContext(), string2);
                            if (fileInputStream == null) {
                                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, "Could not retrieve file for uri " + string2, null);
                                return;
                            }
                            emptyBody = RequestBodyUtil.create(MediaType.m8839f(m8929a), fileInputStream);
                        } else if (readableMap.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                            if (m8929a == null) {
                                m8929a = "multipart/form-data";
                            }
                            MultipartBody.Builder constructMultipartBody = constructMultipartBody(readableMap.getArray(REQUEST_BODY_KEY_FORMDATA), m8929a, i);
                            if (constructMultipartBody == null) {
                                return;
                            }
                            emptyBody = constructMultipartBody.m8831c();
                        } else {
                            emptyBody = RequestBodyUtil.getEmptyBody(str);
                        }
                        m8722l.m8727g(str, wrapRequestBodyWithProgressEmitter(emptyBody, i));
                        addRequest(i);
                        m8771c.mo8811b(m8722l.m8732b()).mo1994i(new InterfaceC12283d() { // from class: com.facebook.react.modules.network.NetworkingModule.2
                            @Override // p328rj.InterfaceC12283d
                            public void onFailure(Call call, IOException iOException) {
                                String str4;
                                if (NetworkingModule.this.mShuttingDown) {
                                    return;
                                }
                                NetworkingModule.this.removeRequest(i);
                                if (iOException.getMessage() != null) {
                                    str4 = iOException.getMessage();
                                } else {
                                    str4 = "Error while executing request: " + iOException.getClass().getSimpleName();
                                }
                                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, str4, iOException);
                            }

                            @Override // p328rj.InterfaceC12283d
                            public void onResponse(Call call, Response response) {
                                MediaType mediaType;
                                if (NetworkingModule.this.mShuttingDown) {
                                    return;
                                }
                                NetworkingModule.this.removeRequest(i);
                                ResponseUtil.onResponseReceived(reactApplicationContextIfActiveOrWarn, i, response.m8695m(), NetworkingModule.translateHeaders(response.m8710A()), response.m8702V().m8734l().toString());
                                try {
                                    ResponseBody m8699a = response.m8699a();
                                    if ("gzip".equalsIgnoreCase(response.m8692s("Content-Encoding")) && m8699a != null) {
                                        C6835i c6835i = new C6835i(m8699a.source());
                                        String m8692s = response.m8692s("Content-Type");
                                        if (m8692s != null) {
                                            mediaType = MediaType.m8839f(m8692s);
                                        } else {
                                            mediaType = null;
                                        }
                                        m8699a = ResponseBody.create(mediaType, -1L, C6840m.m21829d(c6835i));
                                    }
                                    for (ResponseHandler responseHandler : NetworkingModule.this.mResponseHandlers) {
                                        if (responseHandler.supports(str3)) {
                                            ResponseUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, i, responseHandler.toResponseData(m8699a));
                                            ResponseUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, i);
                                            return;
                                        }
                                    }
                                    if (z && str3.equals("text")) {
                                        NetworkingModule.this.readWithProgress(i, m8699a);
                                        ResponseUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, i);
                                        return;
                                    }
                                    String str4 = "";
                                    if (str3.equals("text")) {
                                        try {
                                            str4 = m8699a.string();
                                        } catch (IOException e) {
                                            if (!response.m8702V().m8738h().equalsIgnoreCase("HEAD")) {
                                                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, e.getMessage(), e);
                                            }
                                        }
                                    } else if (str3.equals(NetworkingModule.REQUEST_BODY_KEY_BASE64)) {
                                        str4 = Base64.encodeToString(m8699a.bytes(), 2);
                                    }
                                    ResponseUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, i, str4);
                                    ResponseUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, i);
                                } catch (IOException e2) {
                                    ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, e2.getMessage(), e2);
                                }
                            }
                        });
                    }
                }
                emptyBody = RequestBodyUtil.getEmptyBody(str);
                m8722l.m8727g(str, wrapRequestBodyWithProgressEmitter(emptyBody, i));
                addRequest(i);
                m8771c.mo8811b(m8722l.m8732b()).mo1994i(new InterfaceC12283d() { // from class: com.facebook.react.modules.network.NetworkingModule.2
                    @Override // p328rj.InterfaceC12283d
                    public void onFailure(Call call, IOException iOException) {
                        String str4;
                        if (NetworkingModule.this.mShuttingDown) {
                            return;
                        }
                        NetworkingModule.this.removeRequest(i);
                        if (iOException.getMessage() != null) {
                            str4 = iOException.getMessage();
                        } else {
                            str4 = "Error while executing request: " + iOException.getClass().getSimpleName();
                        }
                        ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, str4, iOException);
                    }

                    @Override // p328rj.InterfaceC12283d
                    public void onResponse(Call call, Response response) {
                        MediaType mediaType;
                        if (NetworkingModule.this.mShuttingDown) {
                            return;
                        }
                        NetworkingModule.this.removeRequest(i);
                        ResponseUtil.onResponseReceived(reactApplicationContextIfActiveOrWarn, i, response.m8695m(), NetworkingModule.translateHeaders(response.m8710A()), response.m8702V().m8734l().toString());
                        try {
                            ResponseBody m8699a = response.m8699a();
                            if ("gzip".equalsIgnoreCase(response.m8692s("Content-Encoding")) && m8699a != null) {
                                C6835i c6835i = new C6835i(m8699a.source());
                                String m8692s = response.m8692s("Content-Type");
                                if (m8692s != null) {
                                    mediaType = MediaType.m8839f(m8692s);
                                } else {
                                    mediaType = null;
                                }
                                m8699a = ResponseBody.create(mediaType, -1L, C6840m.m21829d(c6835i));
                            }
                            for (ResponseHandler responseHandler : NetworkingModule.this.mResponseHandlers) {
                                if (responseHandler.supports(str3)) {
                                    ResponseUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, i, responseHandler.toResponseData(m8699a));
                                    ResponseUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, i);
                                    return;
                                }
                            }
                            if (z && str3.equals("text")) {
                                NetworkingModule.this.readWithProgress(i, m8699a);
                                ResponseUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, i);
                                return;
                            }
                            String str4 = "";
                            if (str3.equals("text")) {
                                try {
                                    str4 = m8699a.string();
                                } catch (IOException e) {
                                    if (!response.m8702V().m8738h().equalsIgnoreCase("HEAD")) {
                                        ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, e.getMessage(), e);
                                    }
                                }
                            } else if (str3.equals(NetworkingModule.REQUEST_BODY_KEY_BASE64)) {
                                str4 = Base64.encodeToString(m8699a.bytes(), 2);
                            }
                            ResponseUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, i, str4);
                            ResponseUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, i);
                        } catch (IOException e2) {
                            ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, e2.getMessage(), e2);
                        }
                    }
                });
            } catch (Exception e) {
                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, e.getMessage(), null);
            }
        } catch (IOException e2) {
            ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i, e2.getMessage(), e2);
        }
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, OkHttpClientProvider.createClient(reactApplicationContext), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<NetworkInterceptorCreator> list) {
        this(reactApplicationContext, null, OkHttpClientProvider.createClient(reactApplicationContext), list);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, OkHttpClientProvider.createClient(reactApplicationContext), null);
    }
}
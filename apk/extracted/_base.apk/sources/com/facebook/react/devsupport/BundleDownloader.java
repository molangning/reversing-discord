package com.facebook.react.devsupport;

import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.MultipartStreamReader;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import org.json.JSONException;
import org.json.JSONObject;
import p058d5.C5743a;
import p122gk.C6840m;
import p328rj.InterfaceC12283d;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class BundleDownloader {
    private static final int FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER = -2;
    private static final String TAG = "BundleDownloader";
    private final OkHttpClient mClient;
    private Call mDownloadBundleFromURLCall;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class BundleInfo {
        private int mFilesChangedCount;
        private String mUrl;

        public static BundleInfo fromJSONString(String str) {
            if (str == null) {
                return null;
            }
            BundleInfo bundleInfo = new BundleInfo();
            try {
                JSONObject jSONObject = new JSONObject(str);
                bundleInfo.mUrl = jSONObject.getString("url");
                bundleInfo.mFilesChangedCount = jSONObject.getInt("filesChangedCount");
                return bundleInfo;
            } catch (JSONException e) {
                C13677a.m1853k(BundleDownloader.TAG, "Invalid bundle info: ", e);
                return null;
            }
        }

        public int getFilesChangedCount() {
            return this.mFilesChangedCount;
        }

        public String getUrl() {
            String str = this.mUrl;
            return str != null ? str : "unknown";
        }

        public String toJSONString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", this.mUrl);
                jSONObject.put("filesChangedCount", this.mFilesChangedCount);
                return jSONObject.toString();
            } catch (JSONException e) {
                C13677a.m1853k(BundleDownloader.TAG, "Can't serialize bundle info: ", e);
                return null;
            }
        }
    }

    public BundleDownloader(OkHttpClient okHttpClient) {
        this.mClient = okHttpClient;
    }

    private static void populateBundleInfo(String str, Headers headers, BundleInfo bundleInfo) {
        bundleInfo.mUrl = str;
        String m8929a = headers.m8929a("X-Metro-Files-Changed-Count");
        if (m8929a != null) {
            try {
                bundleInfo.mFilesChangedCount = Integer.parseInt(m8929a);
            } catch (NumberFormatException unused) {
                bundleInfo.mFilesChangedCount = FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processBundleResult(String str, int i, Headers headers, BufferedSource bufferedSource, File file, BundleInfo bundleInfo, DevBundleDownloadListener devBundleDownloadListener) {
        if (i != 200) {
            String mo8584p0 = bufferedSource.mo8584p0();
            DebugServerException parse = DebugServerException.parse(str, mo8584p0);
            if (parse != null) {
                devBundleDownloadListener.onFailure(parse);
                return;
            }
            devBundleDownloadListener.onFailure(new DebugServerException("The development server returned response error code: " + i + "\n\nURL: " + str + "\n\nBody:\n" + mo8584p0));
            return;
        }
        if (bundleInfo != null) {
            populateBundleInfo(str, headers, bundleInfo);
        }
        File file2 = new File(file.getPath() + ".tmp");
        if (storePlainJSInFile(bufferedSource, file2) && !file2.renameTo(file)) {
            throw new IOException("Couldn't rename " + file2 + " to " + file);
        }
        devBundleDownloadListener.onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMultipartResponse(final String str, final Response response, String str2, final File file, final BundleInfo bundleInfo, final DevBundleDownloadListener devBundleDownloadListener) {
        if (!new MultipartStreamReader(response.m8699a().source(), str2).readAllParts(new MultipartStreamReader.ChunkListener() { // from class: com.facebook.react.devsupport.BundleDownloader.2
            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkComplete(Map<String, String> map, Buffer buffer, boolean z) {
                String str3;
                Integer num;
                if (z) {
                    int m8695m = response.m8695m();
                    if (map.containsKey("X-Http-Status")) {
                        m8695m = Integer.parseInt(map.get("X-Http-Status"));
                    }
                    BundleDownloader.this.processBundleResult(str, m8695m, Headers.m8926i(map), buffer, file, bundleInfo, devBundleDownloadListener);
                } else if (map.containsKey("Content-Type") && map.get("Content-Type").equals("application/json")) {
                    try {
                        JSONObject jSONObject = new JSONObject(buffer.mo8584p0());
                        if (jSONObject.has("status")) {
                            str3 = jSONObject.getString("status");
                        } else {
                            str3 = "Bundling";
                        }
                        Integer num2 = null;
                        if (jSONObject.has("done")) {
                            num = Integer.valueOf(jSONObject.getInt("done"));
                        } else {
                            num = null;
                        }
                        if (jSONObject.has("total")) {
                            num2 = Integer.valueOf(jSONObject.getInt("total"));
                        }
                        devBundleDownloadListener.onProgress(str3, num, num2);
                    } catch (JSONException e) {
                        C13677a.m1854j(ReactConstants.TAG, "Error parsing progress JSON. " + e.toString());
                    }
                }
            }

            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkProgress(Map<String, String> map, long j, long j2) {
                if ("application/javascript".equals(map.get("Content-Type"))) {
                    devBundleDownloadListener.onProgress("Downloading", Integer.valueOf((int) (j / 1024)), Integer.valueOf((int) (j2 / 1024)));
                }
            }
        })) {
            devBundleDownloadListener.onFailure(new DebugServerException("Error while reading multipart response.\n\nResponse code: " + response.m8695m() + "\n\nURL: " + str.toString() + "\n\n"));
        }
    }

    private static boolean storePlainJSInFile(BufferedSource bufferedSource, File file) {
        Sink sink;
        try {
            sink = C6840m.m21827f(file);
            try {
                bufferedSource.mo8583u0(sink);
                if (sink != null) {
                    sink.close();
                    return true;
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
                if (sink != null) {
                    sink.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            sink = null;
        }
    }

    public void downloadBundleFromURL(DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleInfo bundleInfo) {
        downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, new Request.Builder());
    }

    public void downloadBundleFromURL(final DevBundleDownloadListener devBundleDownloadListener, final File file, String str, final BundleInfo bundleInfo, Request.Builder builder) {
        Call call = (Call) C5743a.m24583c(this.mClient.mo8811b(builder.m8722l(str).m8733a("Accept", "multipart/mixed").m8732b()));
        this.mDownloadBundleFromURLCall = call;
        call.mo1994i(new InterfaceC12283d() { // from class: com.facebook.react.devsupport.BundleDownloader.1
            @Override // p328rj.InterfaceC12283d
            public void onFailure(Call call2, IOException iOException) {
                if (BundleDownloader.this.mDownloadBundleFromURLCall != null && !BundleDownloader.this.mDownloadBundleFromURLCall.mo1988o()) {
                    BundleDownloader.this.mDownloadBundleFromURLCall = null;
                    String httpUrl = call2.mo2001a().m8734l().toString();
                    DevBundleDownloadListener devBundleDownloadListener2 = devBundleDownloadListener;
                    devBundleDownloadListener2.onFailure(DebugServerException.makeGeneric(httpUrl, "Could not connect to development server.", "URL: " + httpUrl, iOException));
                    return;
                }
                BundleDownloader.this.mDownloadBundleFromURLCall = null;
            }

            @Override // p328rj.InterfaceC12283d
            public void onResponse(Call call2, Response response) {
                if (BundleDownloader.this.mDownloadBundleFromURLCall != null && !BundleDownloader.this.mDownloadBundleFromURLCall.mo1988o()) {
                    BundleDownloader.this.mDownloadBundleFromURLCall = null;
                    String httpUrl = response.m8702V().m8734l().toString();
                    Matcher matcher = Pattern.compile("multipart/mixed;.*boundary=\"([^\"]+)\"").matcher(response.m8692s("content-type"));
                    try {
                        if (matcher.find()) {
                            BundleDownloader.this.processMultipartResponse(httpUrl, response, matcher.group(1), file, bundleInfo, devBundleDownloadListener);
                        } else {
                            BundleDownloader.this.processBundleResult(httpUrl, response.m8695m(), response.m8710A(), C6840m.m21829d(response.m8699a().source()), file, bundleInfo, devBundleDownloadListener);
                        }
                        response.close();
                        return;
                    } catch (Throwable th2) {
                        try {
                            response.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                BundleDownloader.this.mDownloadBundleFromURLCall = null;
            }
        });
    }
}

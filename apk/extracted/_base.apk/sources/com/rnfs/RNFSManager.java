package com.rnfs;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.SparseArray;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.rnfs.C5504a;
import com.rnfs.C5515h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = RNFSManager.MODULE_NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RNFSManager extends ReactContextBaseJavaModule {
    static final String MODULE_NAME = "RNFSManager";
    private static final String RNFSCachesDirectoryPath = "RNFSCachesDirectoryPath";
    private static final String RNFSDocumentDirectory = "RNFSDocumentDirectory";
    private static final String RNFSDocumentDirectoryPath = "RNFSDocumentDirectoryPath";
    private static final String RNFSDownloadDirectoryPath = "RNFSDownloadDirectoryPath";
    private static final String RNFSExternalCachesDirectoryPath = "RNFSExternalCachesDirectoryPath";
    private static final String RNFSExternalDirectoryPath = "RNFSExternalDirectoryPath";
    private static final String RNFSExternalStorageDirectoryPath = "RNFSExternalStorageDirectoryPath";
    private static final String RNFSFileTypeDirectory = "RNFSFileTypeDirectory";
    private static final String RNFSFileTypeRegular = "RNFSFileTypeRegular";
    private static final String RNFSPicturesDirectoryPath = "RNFSPicturesDirectoryPath";
    private static final String RNFSTemporaryDirectoryPath = "RNFSTemporaryDirectoryPath";
    private SparseArray<AsyncTaskC5510d> downloaders;
    private ReactApplicationContext reactContext;
    private SparseArray<AsyncTaskC5520j> uploaders;

    /* renamed from: com.rnfs.RNFSManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class AsyncTaskC5494a extends AsyncTaskC5503j {

        /* renamed from: b */
        final /* synthetic */ File f15460b;

        /* renamed from: c */
        final /* synthetic */ Promise f15461c;

        /* renamed from: d */
        final /* synthetic */ String f15462d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AsyncTaskC5494a(File file, Promise promise, String str) {
            super();
            this.f15460b = file;
            this.f15461c = promise;
            this.f15462d = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Exception exc) {
            if (exc == null) {
                this.f15460b.delete();
                this.f15461c.resolve(Boolean.TRUE);
                return;
            }
            exc.printStackTrace();
            RNFSManager.this.reject(this.f15461c, this.f15462d, exc);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class AsyncTaskC5495b extends AsyncTaskC5503j {

        /* renamed from: b */
        final /* synthetic */ Promise f15464b;

        /* renamed from: c */
        final /* synthetic */ String f15465c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AsyncTaskC5495b(Promise promise, String str) {
            super();
            this.f15464b = promise;
            this.f15465c = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Exception exc) {
            if (exc == null) {
                this.f15464b.resolve(null);
                return;
            }
            exc.printStackTrace();
            RNFSManager.this.reject(this.f15464b, this.f15465c, exc);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5496c implements C5504a.InterfaceC5507c {

        /* renamed from: a */
        final /* synthetic */ int f15467a;

        /* renamed from: b */
        final /* synthetic */ Promise f15468b;

        /* renamed from: c */
        final /* synthetic */ ReadableMap f15469c;

        C5496c(int i, Promise promise, ReadableMap readableMap) {
            this.f15467a = i;
            this.f15468b = promise;
            this.f15469c = readableMap;
        }

        @Override // com.rnfs.C5504a.InterfaceC5507c
        /* renamed from: a */
        public void mo25109a(C5508b c5508b) {
            if (c5508b.f15498c == null) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("jobId", this.f15467a);
                createMap.putInt("statusCode", c5508b.f15496a);
                createMap.putDouble("bytesWritten", c5508b.f15497b);
                this.f15468b.resolve(createMap);
                return;
            }
            RNFSManager.this.reject(this.f15468b, this.f15469c.getString("toFile"), c5508b.f15498c);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5497d implements C5504a.InterfaceC5505a {

        /* renamed from: a */
        final /* synthetic */ int f15471a;

        C5497d(int i) {
            this.f15471a = i;
        }

        @Override // com.rnfs.C5504a.InterfaceC5505a
        /* renamed from: a */
        public void mo25111a(int i, long j, Map<String, String> map) {
            WritableMap createMap = Arguments.createMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                createMap.putString(entry.getKey(), entry.getValue());
            }
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("jobId", this.f15471a);
            createMap2.putInt("statusCode", i);
            createMap2.putDouble("contentLength", j);
            createMap2.putMap("headers", createMap);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "DownloadBegin", createMap2);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5498e implements C5504a.InterfaceC5506b {

        /* renamed from: a */
        final /* synthetic */ int f15473a;

        C5498e(int i) {
            this.f15473a = i;
        }

        @Override // com.rnfs.C5504a.InterfaceC5506b
        /* renamed from: a */
        public void mo25110a(long j, long j2) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("jobId", this.f15473a);
            createMap.putDouble("contentLength", j);
            createMap.putDouble("bytesWritten", j2);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "DownloadProgress", createMap);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5499f implements C5515h.InterfaceC5517b {

        /* renamed from: a */
        final /* synthetic */ int f15475a;

        /* renamed from: b */
        final /* synthetic */ Promise f15476b;

        /* renamed from: c */
        final /* synthetic */ ReadableMap f15477c;

        C5499f(int i, Promise promise, ReadableMap readableMap) {
            this.f15475a = i;
            this.f15476b = promise;
            this.f15477c = readableMap;
        }

        @Override // com.rnfs.C5515h.InterfaceC5517b
        /* renamed from: a */
        public void mo25098a(C5519i c5519i) {
            if (c5519i.f15515c == null) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("jobId", this.f15475a);
                createMap.putInt("statusCode", c5519i.f15513a);
                createMap.putMap("headers", c5519i.f15514b);
                createMap.putString("body", c5519i.f15516d);
                this.f15476b.resolve(createMap);
                return;
            }
            RNFSManager.this.reject(this.f15476b, this.f15477c.getString("toUrl"), c5519i.f15515c);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5500g implements C5515h.InterfaceC5516a {

        /* renamed from: a */
        final /* synthetic */ int f15479a;

        C5500g(int i) {
            this.f15479a = i;
        }

        @Override // com.rnfs.C5515h.InterfaceC5516a
        /* renamed from: a */
        public void mo25099a() {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("jobId", this.f15479a);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "UploadBegin", createMap);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5501h implements C5515h.InterfaceC5518c {

        /* renamed from: a */
        final /* synthetic */ int f15481a;

        C5501h(int i) {
            this.f15481a = i;
        }

        @Override // com.rnfs.C5515h.InterfaceC5518c
        /* renamed from: a */
        public void mo25097a(int i, int i2) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("jobId", this.f15481a);
            createMap.putInt("totalBytesExpectedToSend", i);
            createMap.putInt("totalBytesSent", i2);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "UploadProgress", createMap);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5502i implements MediaScannerConnection.MediaScannerConnectionClient {

        /* renamed from: a */
        final /* synthetic */ Promise f15483a;

        C5502i(Promise promise) {
            this.f15483a = promise;
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public void onMediaScannerConnected() {
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            this.f15483a.resolve(str);
        }
    }

    /* renamed from: com.rnfs.RNFSManager$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private class AsyncTaskC5503j extends AsyncTask<String, Void, Exception> {
        private AsyncTaskC5503j() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Exception doInBackground(String... strArr) {
            try {
                String str = strArr[0];
                String str2 = strArr[1];
                InputStream inputStream = RNFSManager.this.getInputStream(str);
                OutputStream outputStream = RNFSManager.this.getOutputStream(str2, false);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        Thread.yield();
                    } else {
                        inputStream.close();
                        outputStream.close();
                        return null;
                    }
                }
            } catch (Exception e) {
                return e;
            }
        }
    }

    public RNFSManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.downloaders = new SparseArray<>();
        this.uploaders = new SparseArray<>();
        this.reactContext = reactApplicationContext;
    }

    private void DeleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                DeleteRecursive(file2);
            }
        }
        file.delete();
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0022: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:15:0x0022 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void copyInputStream(java.io.InputStream r8, java.lang.String r9, java.lang.String r10, com.facebook.react.bridge.Promise r11) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            java.io.OutputStream r2 = r7.getOutputStream(r10, r0)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r3 = 10240(0x2800, float:1.4349E-41)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
        La:
            int r4 = r8.read(r3)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r5 = -1
            if (r4 == r5) goto L15
            r2.write(r3, r0, r4)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            goto La
        L15:
            r11.resolve(r1)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r8.close()     // Catch: java.io.IOException -> L1b
        L1b:
            if (r2 == 0) goto L51
        L1d:
            r2.close()     // Catch: java.io.IOException -> L51
            goto L51
        L21:
            r9 = move-exception
            r1 = r2
            goto L52
        L24:
            r1 = move-exception
            goto L2c
        L26:
            r9 = move-exception
            goto L52
        L28:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L2c:
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L21
            java.lang.String r4 = "Failed to copy '%s' to %s (%s)"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L21
            r5[r0] = r9     // Catch: java.lang.Throwable -> L21
            r0 = 1
            r5[r0] = r10     // Catch: java.lang.Throwable -> L21
            java.lang.String r10 = r1.getLocalizedMessage()     // Catch: java.lang.Throwable -> L21
            r0 = 2
            r5[r0] = r10     // Catch: java.lang.Throwable -> L21
            java.lang.String r10 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L21
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L21
            r7.reject(r11, r9, r3)     // Catch: java.lang.Throwable -> L21
            if (r8 == 0) goto L4e
            r8.close()     // Catch: java.io.IOException -> L4e
        L4e:
            if (r2 == 0) goto L51
            goto L1d
        L51:
            return
        L52:
            if (r8 == 0) goto L57
            r8.close()     // Catch: java.io.IOException -> L57
        L57:
            if (r1 == 0) goto L5c
            r1.close()     // Catch: java.io.IOException -> L5c
        L5c:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnfs.RNFSManager.copyInputStream(java.io.InputStream, java.lang.String, java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    private Uri getFileUri(String str, boolean z) {
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            File file = new File(str);
            if (!z && file.isDirectory()) {
                throw new C5512e("EISDIR", "EISDIR: illegal operation on a directory, read '" + str + "'");
            }
            return Uri.parse("file://" + str);
        }
        return parse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream getInputStream(String str) {
        try {
            InputStream openInputStream = this.reactContext.getContentResolver().openInputStream(getFileUri(str, false));
            if (openInputStream != null) {
                return openInputStream;
            }
            throw new C5512e("ENOENT", "ENOENT: could not open an input stream for '" + str + "'");
        } catch (FileNotFoundException e) {
            throw new C5512e("ENOENT", "ENOENT: " + e.getMessage() + ", open '" + str + "'");
        }
    }

    private static byte[] getInputStreamBytes(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private String getOriginalFilepath(String str, boolean z) {
        Uri fileUri = getFileUri(str, z);
        if (fileUri.getScheme().equals("content")) {
            try {
                Cursor query = this.reactContext.getContentResolver().query(fileUri, null, null, null, null);
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow("_data"));
                }
                query.close();
            } catch (IllegalArgumentException unused) {
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OutputStream getOutputStream(String str, boolean z) {
        String writeAccessByAPILevel;
        Uri fileUri = getFileUri(str, false);
        try {
            ContentResolver contentResolver = this.reactContext.getContentResolver();
            if (z) {
                writeAccessByAPILevel = "wa";
            } else {
                writeAccessByAPILevel = getWriteAccessByAPILevel();
            }
            OutputStream openOutputStream = contentResolver.openOutputStream(fileUri, writeAccessByAPILevel);
            if (openOutputStream != null) {
                return openOutputStream;
            }
            throw new C5512e("ENOENT", "ENOENT: could not open an output stream for '" + str + "'");
        } catch (FileNotFoundException e) {
            throw new C5512e("ENOENT", "ENOENT: " + e.getMessage() + ", open '" + str + "'");
        }
    }

    private int getResIdentifier(String str) {
        String str2;
        boolean z = true;
        String substring = str.substring(str.lastIndexOf(".") + 1);
        String substring2 = str.substring(0, str.lastIndexOf("."));
        if (!substring.equals("png") && !substring.equals("jpg") && !substring.equals("jpeg") && !substring.equals("bmp") && !substring.equals("gif") && !substring.equals("webp") && !substring.equals("psd") && !substring.equals("svg") && !substring.equals("tiff")) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        Resources resources = getReactApplicationContext().getResources();
        if (valueOf.booleanValue()) {
            str2 = "drawable";
        } else {
            str2 = "raw";
        }
        return resources.getIdentifier(substring2, str2, getReactApplicationContext().getPackageName());
    }

    private String getWriteAccessByAPILevel() {
        return Build.VERSION.SDK_INT <= 28 ? "w" : "rwt";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reject(Promise promise, String str, Exception exc) {
        if (exc instanceof FileNotFoundException) {
            rejectFileNotFound(promise, str);
        } else if (exc instanceof C5512e) {
            C5512e c5512e = (C5512e) exc;
            promise.reject(c5512e.m25100a(), c5512e.getMessage());
        } else {
            promise.reject((String) null, exc.getMessage());
        }
    }

    private void rejectFileIsDirectory(Promise promise) {
        promise.reject("EISDIR", "EISDIR: illegal operation on a directory, read");
    }

    private void rejectFileNotFound(Promise promise, String str) {
        promise.reject("ENOENT", "ENOENT: no such file or directory, open '" + str + "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void appendFile(String str, String str2, Promise promise) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            OutputStream outputStream = getOutputStream(str, true);
            outputStream.write(decode);
            outputStream.close();
            promise.resolve(null);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void copyFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        new AsyncTaskC5495b(promise, str).execute(str, str2);
    }

    @ReactMethod
    public void copyFileAssets(String str, String str2, Promise promise) {
        try {
            copyInputStream(getReactApplicationContext().getAssets().open(str), str, str2, promise);
        } catch (IOException unused) {
            reject(promise, str, new Exception(String.format("Asset '%s' could not be opened", str)));
        }
    }

    @ReactMethod
    public void copyFileRes(String str, String str2, Promise promise) {
        try {
            copyInputStream(getReactApplicationContext().getResources().openRawResource(getResIdentifier(str)), str, str2, promise);
        } catch (Exception unused) {
            reject(promise, str, new Exception(String.format("Res '%s' could not be opened", str)));
        }
    }

    @ReactMethod
    public void downloadFile(ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(readableMap.getString("toFile"));
            URL url = new URL(readableMap.getString("fromUrl"));
            int i = readableMap.getInt("jobId");
            ReadableMap map = readableMap.getMap("headers");
            int i2 = readableMap.getInt("progressInterval");
            int i3 = readableMap.getInt("progressDivider");
            int i4 = readableMap.getInt("readTimeout");
            int i5 = readableMap.getInt("connectionTimeout");
            boolean z = readableMap.getBoolean("hasBeginCallback");
            boolean z2 = readableMap.getBoolean("hasProgressCallback");
            C5504a c5504a = new C5504a();
            c5504a.f15486a = url;
            c5504a.f15487b = file;
            c5504a.f15488c = map;
            c5504a.f15489d = i2;
            c5504a.f15490e = i3;
            c5504a.f15491f = i4;
            c5504a.f15492g = i5;
            c5504a.f15493h = new C5496c(i, promise, readableMap);
            if (z) {
                c5504a.f15494i = new C5497d(i);
            }
            if (z2) {
                c5504a.f15495j = new C5498e(i);
            }
            AsyncTaskC5510d asyncTaskC5510d = new AsyncTaskC5510d();
            asyncTaskC5510d.execute(c5504a);
            this.downloaders.put(i, asyncTaskC5510d);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, readableMap.getString("toFile"), e);
        }
    }

    @ReactMethod
    public void exists(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(new File(str).exists()));
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void existsAssets(String str, Promise promise) {
        try {
            AssetManager assets = getReactApplicationContext().getAssets();
            try {
                String[] list = assets.list(str);
                if (list != null && list.length > 0) {
                    promise.resolve(Boolean.TRUE);
                    return;
                }
            } catch (Exception unused) {
            }
            InputStream inputStream = null;
            try {
                inputStream = assets.open(str);
                promise.resolve(Boolean.TRUE);
                if (inputStream == null) {
                    return;
                }
            } catch (Exception unused2) {
                promise.resolve(Boolean.FALSE);
                if (inputStream == null) {
                    return;
                }
            }
            try {
                inputStream.close();
            } catch (Exception unused3) {
            }
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void existsRes(String str, Promise promise) {
        try {
            if (getResIdentifier(str) > 0) {
                promise.resolve(Boolean.TRUE);
            } else {
                promise.resolve(Boolean.FALSE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void getAllExternalFilesDirs(Promise promise) {
        File[] externalFilesDirs = getReactApplicationContext().getExternalFilesDirs(null);
        WritableArray createArray = Arguments.createArray();
        for (File file : externalFilesDirs) {
            if (file != null) {
                createArray.pushString(file.getAbsolutePath());
            }
        }
        promise.resolve(createArray);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(RNFSDocumentDirectory, 0);
        hashMap.put(RNFSDocumentDirectoryPath, getReactApplicationContext().getFilesDir().getAbsolutePath());
        hashMap.put(RNFSTemporaryDirectoryPath, getReactApplicationContext().getCacheDir().getAbsolutePath());
        hashMap.put(RNFSPicturesDirectoryPath, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        hashMap.put(RNFSCachesDirectoryPath, getReactApplicationContext().getCacheDir().getAbsolutePath());
        hashMap.put(RNFSDownloadDirectoryPath, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        hashMap.put(RNFSFileTypeRegular, 0);
        hashMap.put(RNFSFileTypeDirectory, 1);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            hashMap.put(RNFSExternalStorageDirectoryPath, externalStorageDirectory.getAbsolutePath());
        } else {
            hashMap.put(RNFSExternalStorageDirectoryPath, null);
        }
        File externalFilesDir = getReactApplicationContext().getExternalFilesDir(null);
        if (externalFilesDir != null) {
            hashMap.put(RNFSExternalDirectoryPath, externalFilesDir.getAbsolutePath());
        } else {
            hashMap.put(RNFSExternalDirectoryPath, null);
        }
        File externalCacheDir = getReactApplicationContext().getExternalCacheDir();
        if (externalCacheDir != null) {
            hashMap.put(RNFSExternalCachesDirectoryPath, externalCacheDir.getAbsolutePath());
        } else {
            hashMap.put(RNFSExternalCachesDirectoryPath, null);
        }
        return hashMap;
    }

    @ReactMethod
    public void getFSInfo(Promise promise) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long totalBytes = statFs.getTotalBytes();
        long freeBytes = statFs.getFreeBytes();
        long totalBytes2 = statFs2.getTotalBytes();
        long freeBytes2 = statFs2.getFreeBytes();
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("totalSpace", totalBytes);
        createMap.putDouble("freeSpace", freeBytes);
        createMap.putDouble("totalSpaceEx", totalBytes2);
        createMap.putDouble("freeSpaceEx", freeBytes2);
        promise.resolve(createMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public void hash(String str, String str2, Promise promise) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("md5", "MD5");
            hashMap.put("sha1", "SHA-1");
            hashMap.put("sha224", "SHA-224");
            hashMap.put("sha256", "SHA-256");
            hashMap.put("sha384", "SHA-384");
            hashMap.put("sha512", "SHA-512");
            if (hashMap.containsKey(str2)) {
                File file = new File(str);
                if (file.isDirectory()) {
                    rejectFileIsDirectory(promise);
                    return;
                } else if (!file.exists()) {
                    rejectFileNotFound(promise, str);
                    return;
                } else {
                    MessageDigest messageDigest = MessageDigest.getInstance((String) hashMap.get(str2));
                    FileInputStream fileInputStream = new FileInputStream(str);
                    byte[] bArr = new byte[10240];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, read);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    byte[] digest = messageDigest.digest();
                    int length = digest.length;
                    for (int i = 0; i < length; i++) {
                        sb2.append(String.format("%02x", Byte.valueOf(digest[i])));
                    }
                    promise.resolve(sb2.toString());
                    return;
                }
            }
            throw new Exception("Invalid hash algorithm");
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void mkdir(String str, ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(str);
            file.mkdirs();
            if (file.exists()) {
                promise.resolve(null);
                return;
            }
            throw new Exception("Directory could not be created");
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void moveFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(str);
            if (!file.renameTo(new File(str2))) {
                new AsyncTaskC5494a(file, promise, str).execute(str, str2);
            } else {
                promise.resolve(Boolean.TRUE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void pathForBundle(String str, Promise promise) {
    }

    @ReactMethod
    public void pathForGroup(String str, Promise promise) {
    }

    @ReactMethod
    public void read(String str, int i, int i2, Promise promise) {
        try {
            InputStream inputStream = getInputStream(str);
            byte[] bArr = new byte[i];
            inputStream.skip(i2);
            promise.resolve(Base64.encodeToString(bArr, 0, inputStream.read(bArr, 0, i), 2));
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void readDir(String str, Promise promise) {
        int i;
        try {
            File file = new File(str);
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                WritableArray createArray = Arguments.createArray();
                for (File file2 : listFiles) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putDouble("mtime", file2.lastModified() / 1000.0d);
                    createMap.putString(ZeroconfModule.KEY_SERVICE_NAME, file2.getName());
                    createMap.putString("path", file2.getAbsolutePath());
                    createMap.putDouble("size", file2.length());
                    if (file2.isDirectory()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    createMap.putInt("type", i);
                    createArray.pushMap(createMap);
                }
                promise.resolve(createArray);
                return;
            }
            throw new Exception("Folder does not exist");
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void readDirAssets(java.lang.String r13, com.facebook.react.bridge.Promise r14) {
        /*
            r12 = this;
            com.facebook.react.bridge.ReactApplicationContext r0 = r12.getReactApplicationContext()     // Catch: java.io.IOException -> L74
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.io.IOException -> L74
            java.lang.String[] r1 = r0.list(r13)     // Catch: java.io.IOException -> L74
            com.facebook.react.bridge.WritableArray r2 = com.facebook.react.bridge.Arguments.createArray()     // Catch: java.io.IOException -> L74
            int r3 = r1.length     // Catch: java.io.IOException -> L74
            r4 = 0
            r5 = r4
        L13:
            if (r5 >= r3) goto L70
            r6 = r1[r5]     // Catch: java.io.IOException -> L74
            com.facebook.react.bridge.WritableMap r7 = com.facebook.react.bridge.Arguments.createMap()     // Catch: java.io.IOException -> L74
            java.lang.String r8 = "name"
            r7.putString(r8, r6)     // Catch: java.io.IOException -> L74
            boolean r8 = r13.isEmpty()     // Catch: java.io.IOException -> L74
            r9 = 1
            if (r8 == 0) goto L28
            goto L35
        L28:
            java.lang.String r8 = "%s/%s"
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.io.IOException -> L74
            r10[r4] = r13     // Catch: java.io.IOException -> L74
            r10[r9] = r6     // Catch: java.io.IOException -> L74
            java.lang.String r6 = java.lang.String.format(r8, r10)     // Catch: java.io.IOException -> L74
        L35:
            java.lang.String r8 = "path"
            r7.putString(r8, r6)     // Catch: java.io.IOException -> L74
            android.content.res.AssetFileDescriptor r6 = r0.openFd(r6)     // Catch: java.io.IOException -> L4f
            if (r6 == 0) goto L4c
            long r10 = r6.getLength()     // Catch: java.io.IOException -> L4f
            int r8 = (int) r10
            r6.close()     // Catch: java.io.IOException -> L4a
            r6 = r4
            goto L5c
        L4a:
            r6 = move-exception
            goto L51
        L4c:
            r8 = r4
            r6 = r9
            goto L5c
        L4f:
            r6 = move-exception
            r8 = r4
        L51:
            java.lang.String r6 = r6.getMessage()     // Catch: java.io.IOException -> L74
            java.lang.String r10 = "compressed"
            boolean r6 = r6.contains(r10)     // Catch: java.io.IOException -> L74
            r6 = r6 ^ r9
        L5c:
            java.lang.String r10 = "size"
            r7.putInt(r10, r8)     // Catch: java.io.IOException -> L74
            java.lang.String r8 = "type"
            if (r6 == 0) goto L66
            goto L67
        L66:
            r9 = r4
        L67:
            r7.putInt(r8, r9)     // Catch: java.io.IOException -> L74
            r2.pushMap(r7)     // Catch: java.io.IOException -> L74
            int r5 = r5 + 1
            goto L13
        L70:
            r14.resolve(r2)     // Catch: java.io.IOException -> L74
            goto L78
        L74:
            r0 = move-exception
            r12.reject(r14, r13, r0)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnfs.RNFSManager.readDirAssets(java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    @ReactMethod
    public void readFile(String str, Promise promise) {
        try {
            promise.resolve(Base64.encodeToString(getInputStreamBytes(getInputStream(str)), 2));
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void readFileAssets(String str, Promise promise) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = getReactApplicationContext().getAssets().open(str, 0);
            } catch (Exception e) {
                e.printStackTrace();
                reject(promise, str, e);
                if (0 == 0) {
                    return;
                }
            }
            if (inputStream == null) {
                reject(promise, str, new Exception("Failed to open file"));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            }
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            promise.resolve(Base64.encodeToString(bArr, 2));
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th2;
        }
    }

    @ReactMethod
    public void readFileRes(String str, Promise promise) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = getReactApplicationContext().getResources().openRawResource(getResIdentifier(str));
            } catch (Exception e) {
                e.printStackTrace();
                reject(promise, str, e);
                if (0 == 0) {
                    return;
                }
            }
            if (inputStream == null) {
                reject(promise, str, new Exception("Failed to open file"));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            }
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            promise.resolve(Base64.encodeToString(bArr, 2));
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th2;
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void scanFile(String str, Promise promise) {
        MediaScannerConnection.scanFile(getReactApplicationContext(), new String[]{str}, null, new C5502i(promise));
    }

    @ReactMethod
    public void setReadable(String str, Boolean bool, Boolean bool2, Promise promise) {
        try {
            File file = new File(str);
            if (file.exists()) {
                file.setReadable(bool.booleanValue(), bool2.booleanValue());
                promise.resolve(Boolean.TRUE);
                return;
            }
            throw new Exception("File does not exist");
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void stat(String str, Promise promise) {
        int i = 1;
        try {
            String originalFilepath = getOriginalFilepath(str, true);
            File file = new File(originalFilepath);
            if (file.exists()) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("ctime", (int) (file.lastModified() / 1000));
                createMap.putInt("mtime", (int) (file.lastModified() / 1000));
                createMap.putDouble("size", file.length());
                if (!file.isDirectory()) {
                    i = 0;
                }
                createMap.putInt("type", i);
                createMap.putString("originalFilepath", originalFilepath);
                promise.resolve(createMap);
                return;
            }
            throw new Exception("File does not exist");
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void stopDownload(int i) {
        AsyncTaskC5510d asyncTaskC5510d = this.downloaders.get(i);
        if (asyncTaskC5510d != null) {
            asyncTaskC5510d.m25101g();
        }
    }

    @ReactMethod
    public void stopUpload(int i) {
        AsyncTaskC5520j asyncTaskC5520j = this.uploaders.get(i);
        if (asyncTaskC5520j != null) {
            asyncTaskC5520j.m25091f();
        }
    }

    @ReactMethod
    public void touch(String str, double d, double d2, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(new File(str).setLastModified((long) d)));
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void unlink(String str, Promise promise) {
        try {
            File file = new File(str);
            if (file.exists()) {
                DeleteRecursive(file);
                promise.resolve(null);
                return;
            }
            throw new Exception("File does not exist");
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void uploadFiles(ReadableMap readableMap, Promise promise) {
        String str;
        try {
            ReadableArray array = readableMap.getArray("files");
            URL url = new URL(readableMap.getString("toUrl"));
            int i = readableMap.getInt("jobId");
            ReadableMap map = readableMap.getMap("headers");
            ReadableMap map2 = readableMap.getMap("fields");
            String string = readableMap.getString("method");
            boolean z = readableMap.getBoolean("binaryStreamOnly");
            boolean z2 = readableMap.getBoolean("hasBeginCallback");
            boolean z3 = readableMap.getBoolean("hasProgressCallback");
            ArrayList<ReadableMap> arrayList = new ArrayList<>();
            C5515h c5515h = new C5515h();
            str = "toUrl";
            for (int i2 = 0; i2 < array.size(); i2++) {
                try {
                    arrayList.add(array.getMap(i2));
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    reject(promise, readableMap.getString(str), e);
                    return;
                }
            }
            c5515h.f15504a = url;
            c5515h.f15505b = arrayList;
            c5515h.f15507d = map;
            c5515h.f15509f = string;
            c5515h.f15508e = map2;
            c5515h.f15506c = z;
            c5515h.f15510g = new C5499f(i, promise, readableMap);
            if (z2) {
                c5515h.f15512i = new C5500g(i);
            }
            if (z3) {
                c5515h.f15511h = new C5501h(i);
            }
            AsyncTaskC5520j asyncTaskC5520j = new AsyncTaskC5520j();
            asyncTaskC5520j.execute(c5515h);
            this.uploaders.put(i, asyncTaskC5520j);
        } catch (Exception e2) {
            e = e2;
            str = "toUrl";
        }
    }

    @ReactMethod
    public void write(String str, String str2, int i, Promise promise) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            if (i < 0) {
                OutputStream outputStream = getOutputStream(str, true);
                outputStream.write(decode);
                outputStream.close();
            } else {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
                randomAccessFile.seek(i);
                randomAccessFile.write(decode);
                randomAccessFile.close();
            }
            promise.resolve(null);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void writeFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            OutputStream outputStream = getOutputStream(str, false);
            outputStream.write(decode);
            outputStream.close();
            promise.resolve(null);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }
}

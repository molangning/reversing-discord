package p370ue;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.util.JSStackTrace;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.BufferedSource;
import okio.Sink;
import p122gk.C6840m;
import p354te.C12670c;
import se.InterfaceC12461b;
import ve.C13256a;

/* renamed from: ue.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AsyncTaskC12957a extends AsyncTask<Void, Void, C12958a> {

    /* renamed from: a */
    private final Context f33704a;

    /* renamed from: b */
    private Uri f33705b;

    /* renamed from: c */
    private Uri f33706c;

    /* renamed from: d */
    private final int f33707d;

    /* renamed from: e */
    private final int f33708e;

    /* renamed from: f */
    private final InterfaceC12461b f33709f;

    public AsyncTaskC12957a(Context context, Uri uri, Uri uri2, int i, int i2, InterfaceC12461b interfaceC12461b) {
        this.f33704a = context;
        this.f33705b = uri;
        this.f33706c = uri2;
        this.f33707d = i;
        this.f33708e = i2;
        this.f33709f = interfaceC12461b;
    }

    /* renamed from: a */
    private boolean m3587a(Bitmap bitmap, BitmapFactory.Options options) {
        int i;
        if (bitmap != null) {
            i = bitmap.getByteCount();
        } else {
            i = 0;
        }
        if (i <= 104857600) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    /* renamed from: b */
    private void m3586b(Uri uri, Uri uri2) {
        InputStream inputStream;
        Log.d("BitmapWorkerTask", "copyFile");
        if (uri2 != null) {
            FileOutputStream fileOutputStream = null;
            try {
                inputStream = this.f33704a.getContentResolver().openInputStream(uri);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(new File(uri2.getPath()));
                    try {
                        if (inputStream != null) {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read > 0) {
                                    fileOutputStream2.write(bArr, 0, read);
                                } else {
                                    C13256a.m2914c(fileOutputStream2);
                                    C13256a.m2914c(inputStream);
                                    this.f33705b = this.f33706c;
                                    return;
                                }
                            }
                        } else {
                            throw new NullPointerException("InputStream for given input Uri is null");
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        C13256a.m2914c(fileOutputStream);
                        C13256a.m2914c(inputStream);
                        this.f33705b = this.f33706c;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } else {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
    }

    /* renamed from: d */
    private void m3584d(Uri uri, Uri uri2) {
        Closeable closeable;
        Response response;
        Response execute;
        BufferedSource source;
        Log.d("BitmapWorkerTask", "downloadFile");
        if (uri2 != null) {
            OkHttpClient okHttpClient = new OkHttpClient();
            BufferedSource bufferedSource = null;
            try {
                execute = okHttpClient.mo8811b(new Request.Builder().m8722l(uri.toString()).m8732b()).execute();
                try {
                    source = execute.m8699a().source();
                } catch (Throwable th2) {
                    th = th2;
                    response = execute;
                    closeable = null;
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
                response = null;
            }
            try {
                OutputStream openOutputStream = this.f33704a.getContentResolver().openOutputStream(uri2);
                if (openOutputStream != null) {
                    Sink m21825h = C6840m.m21825h(openOutputStream);
                    source.mo8583u0(m21825h);
                    C13256a.m2914c(source);
                    C13256a.m2914c(m21825h);
                    C13256a.m2914c(execute.m8699a());
                    okHttpClient.m8798r().m8944a();
                    this.f33705b = this.f33706c;
                    return;
                }
                throw new NullPointerException("OutputStream for given output Uri is null");
            } catch (Throwable th4) {
                th = th4;
                response = execute;
                closeable = null;
                bufferedSource = source;
                C13256a.m2914c(bufferedSource);
                C13256a.m2914c(closeable);
                if (response != null) {
                    C13256a.m2914c(response.m8699a());
                }
                okHttpClient.m8798r().m8944a();
                this.f33705b = this.f33706c;
                throw th;
            }
        }
        throw new NullPointerException("Output Uri is null - cannot download image");
    }

    /* renamed from: f */
    private void m3582f() {
        String scheme = this.f33705b.getScheme();
        Log.d("BitmapWorkerTask", "Uri scheme: " + scheme);
        if (!"http".equals(scheme) && !"https".equals(scheme)) {
            if ("content".equals(scheme)) {
                try {
                    m3586b(this.f33705b, this.f33706c);
                    return;
                } catch (IOException | NullPointerException e) {
                    Log.e("BitmapWorkerTask", "Copying failed", e);
                    throw e;
                }
            } else if (!JSStackTrace.FILE_KEY.equals(scheme)) {
                Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme);
                throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
            } else {
                return;
            }
        }
        try {
            m3584d(this.f33705b, this.f33706c);
        } catch (IOException | NullPointerException e2) {
            Log.e("BitmapWorkerTask", "Downloading failed", e2);
            throw e2;
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: c */
    public C12958a doInBackground(Void... voidArr) {
        InputStream openInputStream;
        if (this.f33705b == null) {
            return new C12958a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            m3582f();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = C13256a.m2916a(options, this.f33707d, this.f33708e);
            boolean z = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmap = null;
            while (!z) {
                try {
                    openInputStream = this.f33704a.getContentResolver().openInputStream(this.f33705b);
                } catch (IOException e) {
                    Log.e("BitmapWorkerTask", "doInBackground: ImageDecoder.createSource: ", e);
                    return new C12958a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f33705b + "]", e));
                } catch (OutOfMemoryError e2) {
                    Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e2);
                    options.inSampleSize *= 2;
                }
                try {
                    bitmap = BitmapFactory.decodeStream(openInputStream, null, options);
                    if (options.outWidth != -1 && options.outHeight != -1) {
                        C13256a.m2914c(openInputStream);
                        if (!m3587a(bitmap, options)) {
                            z = true;
                        }
                    } else {
                        return new C12958a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.f33705b + "]"));
                    }
                } finally {
                    C13256a.m2914c(openInputStream);
                }
            }
            if (bitmap == null) {
                return new C12958a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f33705b + "]"));
            }
            int m2910g = C13256a.m2910g(this.f33704a, this.f33705b);
            int m2912e = C13256a.m2912e(m2910g);
            int m2911f = C13256a.m2911f(m2910g);
            C12670c c12670c = new C12670c(m2910g, m2912e, m2911f);
            Matrix matrix = new Matrix();
            if (m2912e != 0) {
                matrix.preRotate(m2912e);
            }
            if (m2911f != 1) {
                matrix.postScale(m2911f, 1.0f);
            }
            if (!matrix.isIdentity()) {
                return new C12958a(C13256a.m2909h(bitmap, matrix), c12670c);
            }
            return new C12958a(bitmap, c12670c);
        } catch (IOException | NullPointerException e3) {
            return new C12958a(e3);
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: e */
    public void onPostExecute(C12958a c12958a) {
        String path;
        Exception exc = c12958a.f33712c;
        if (exc == null) {
            InterfaceC12461b interfaceC12461b = this.f33709f;
            Bitmap bitmap = c12958a.f33710a;
            C12670c c12670c = c12958a.f33711b;
            String path2 = this.f33705b.getPath();
            Uri uri = this.f33706c;
            if (uri == null) {
                path = null;
            } else {
                path = uri.getPath();
            }
            interfaceC12461b.mo5218a(bitmap, c12670c, path2, path);
            return;
        }
        this.f33709f.onFailure(exc);
    }

    /* renamed from: ue.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C12958a {

        /* renamed from: a */
        Bitmap f33710a;

        /* renamed from: b */
        C12670c f33711b;

        /* renamed from: c */
        Exception f33712c;

        public C12958a(Bitmap bitmap, C12670c c12670c) {
            this.f33710a = bitmap;
            this.f33711b = c12670c;
        }

        public C12958a(Exception exc) {
            this.f33712c = exc;
        }
    }
}
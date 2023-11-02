package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.core.provider.C1090g;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.core.graphics.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1007d0 {

    /* renamed from: androidx.core.graphics.d0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1008a {
        /* renamed from: a */
        static ParcelFileDescriptor m38139a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    /* renamed from: a */
    public static void m38147a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static ByteBuffer m38146b(Context context, Resources resources, int i) {
        File m38143e = m38143e(context);
        if (m38143e == null) {
            return null;
        }
        try {
            if (!m38145c(m38143e, resources, i)) {
                return null;
            }
            return m38141g(m38143e);
        } finally {
            m38143e.delete();
        }
    }

    /* renamed from: c */
    public static boolean m38145c(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            boolean m38144d = m38144d(file, inputStream);
            m38147a(inputStream);
            return m38144d;
        } catch (Throwable th3) {
            th = th3;
            m38147a(inputStream);
            throw th;
        }
    }

    /* renamed from: d */
    public static boolean m38144d(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            m38147a(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m38147a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    m38147a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    /* renamed from: e */
    public static File m38143e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static ByteBuffer m38142f(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor m38139a = C1008a.m38139a(context.getContentResolver(), uri, "r", cancellationSignal);
            if (m38139a == null) {
                if (m38139a != null) {
                    m38139a.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(m38139a.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                m38139a.close();
                return map;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static ByteBuffer m38141g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            fileInputStream.close();
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Map<Uri, ByteBuffer> m38140h(Context context, C1090g.C1092b[] c1092bArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C1090g.C1092b c1092b : c1092bArr) {
            if (c1092b.m37915b() == 0) {
                Uri m37913d = c1092b.m37913d();
                if (!hashMap.containsKey(m37913d)) {
                    hashMap.put(m37913d, m38142f(context, cancellationSignal, m37913d));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
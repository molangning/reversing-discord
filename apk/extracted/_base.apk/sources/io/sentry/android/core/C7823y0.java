package io.sentry.android.core;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: io.sentry.android.core.y0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C7823y0 {

    /* renamed from: a */
    static String f21386a;

    /* renamed from: b */
    private static final Charset f21387b = Charset.forName("UTF-8");

    /* renamed from: a */
    public static synchronized String m19620a(Context context) {
        synchronized (C7823y0.class) {
            if (f21386a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                if (!file.exists()) {
                    String m19618c = m19618c(file);
                    f21386a = m19618c;
                    return m19618c;
                }
                f21386a = m19619b(file);
            }
            return f21386a;
        }
    }

    /* renamed from: b */
    static String m19619b(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, f21387b);
            randomAccessFile.close();
            return str;
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: c */
    static String m19618c(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String uuid = UUID.randomUUID().toString();
            fileOutputStream.write(uuid.getBytes(f21387b));
            fileOutputStream.flush();
            fileOutputStream.close();
            return uuid;
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}

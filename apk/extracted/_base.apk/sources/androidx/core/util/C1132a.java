package androidx.core.util;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: androidx.core.util.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1132a {

    /* renamed from: a */
    private final File f3505a;

    /* renamed from: b */
    private final File f3506b;

    /* renamed from: c */
    private final File f3507c;

    public C1132a(File file) {
        this.f3505a = file;
        this.f3506b = new File(file.getPath() + ".new");
        this.f3507c = new File(file.getPath() + ".bak");
    }

    /* renamed from: d */
    private static void m37839d(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    /* renamed from: f */
    private static boolean m37837f(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void m37842a(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!m37837f(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        if (!this.f3506b.delete()) {
            Log.e("AtomicFile", "Failed to delete new file " + this.f3506b);
        }
    }

    /* renamed from: b */
    public void m37841b(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!m37837f(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        m37839d(this.f3506b, this.f3505a);
    }

    /* renamed from: c */
    public File m37840c() {
        return this.f3505a;
    }

    /* renamed from: e */
    public FileOutputStream m37838e() {
        if (this.f3507c.exists()) {
            m37839d(this.f3507c, this.f3505a);
        }
        try {
            return new FileOutputStream(this.f3506b);
        } catch (FileNotFoundException unused) {
            if (this.f3506b.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.f3506b);
                } catch (FileNotFoundException e) {
                    throw new IOException("Failed to create new file " + this.f3506b, e);
                }
            }
            throw new IOException("Failed to create directory for " + this.f3506b);
        }
    }
}

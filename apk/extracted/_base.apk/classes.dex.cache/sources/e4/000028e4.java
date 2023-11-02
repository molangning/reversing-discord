package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* renamed from: com.facebook.soloader.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4317k implements Closeable {

    /* renamed from: j */
    private FileOutputStream f10982j;

    /* renamed from: k */
    private FileLock f10983k;

    private C4317k(File file, boolean z) {
        m30112a(file, z);
    }

    /* renamed from: a */
    private void m30112a(File file, boolean z) {
        FileLock fileLock;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f10982j = fileOutputStream;
        try {
            if (z) {
                try {
                    fileLock = fileOutputStream.getChannel().tryLock();
                } catch (IOException unused) {
                    fileLock = null;
                }
            } else {
                fileLock = fileOutputStream.getChannel().lock();
            }
            if (fileLock == null) {
            }
            this.f10983k = fileLock;
        } finally {
            this.f10982j.close();
        }
    }

    /* renamed from: h */
    public static C4317k m30111h(File file) {
        return new C4317k(file, false);
    }

    /* renamed from: i */
    public static C4317k m30110i(File file) {
        C4317k c4317k = new C4317k(file, true);
        if (c4317k.f10983k == null) {
            c4317k.close();
            return null;
        }
        return c4317k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            FileLock fileLock = this.f10983k;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f10982j.close();
        }
    }
}
package com.facebook.react.modules.network;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class CountingOutputStream extends FilterOutputStream {
    private long mCount;

    public CountingOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.mCount = 0L;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out.close();
    }

    public long getCount() {
        return this.mCount;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.mCount += i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        this.mCount++;
    }
}
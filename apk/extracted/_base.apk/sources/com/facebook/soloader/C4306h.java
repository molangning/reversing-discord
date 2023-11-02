package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.facebook.soloader.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4306h implements InterfaceC4304f {

    /* renamed from: j */
    private InputStream f10961j;

    /* renamed from: k */
    private final ZipEntry f10962k;

    /* renamed from: l */
    private final ZipFile f10963l;

    /* renamed from: m */
    private final long f10964m;

    /* renamed from: n */
    private boolean f10965n = true;

    /* renamed from: o */
    private long f10966o = 0;

    public C4306h(ZipFile zipFile, ZipEntry zipEntry) {
        this.f10963l = zipFile;
        this.f10962k = zipEntry;
        this.f10964m = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f10961j = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    @Override // com.facebook.soloader.InterfaceC4304f
    /* renamed from: G */
    public int mo30120G(ByteBuffer byteBuffer, long j) {
        if (this.f10961j != null) {
            int remaining = byteBuffer.remaining();
            long j2 = this.f10964m - j;
            if (j2 <= 0) {
                return -1;
            }
            int i = (int) j2;
            if (remaining > i) {
                remaining = i;
            }
            m30119a(j);
            if (byteBuffer.hasArray()) {
                this.f10961j.read(byteBuffer.array(), 0, remaining);
                byteBuffer.position(byteBuffer.position() + remaining);
            } else {
                byte[] bArr = new byte[remaining];
                this.f10961j.read(bArr, 0, remaining);
                byteBuffer.put(bArr, 0, remaining);
            }
            this.f10966o += remaining;
            return remaining;
        }
        throw new IOException("InputStream is null");
    }

    /* renamed from: a */
    public InterfaceC4304f m30119a(long j) {
        InputStream inputStream = this.f10961j;
        if (inputStream != null) {
            long j2 = this.f10966o;
            if (j == j2) {
                return this;
            }
            long j3 = this.f10964m;
            if (j > j3) {
                j = j3;
            }
            if (j >= j2) {
                inputStream.skip(j - j2);
            } else {
                inputStream.close();
                InputStream inputStream2 = this.f10963l.getInputStream(this.f10962k);
                this.f10961j = inputStream2;
                if (inputStream2 != null) {
                    inputStream2.skip(j);
                } else {
                    throw new IOException(this.f10962k.getName() + "'s InputStream is null");
                }
            }
            this.f10966o = j;
            return this;
        }
        throw new IOException(this.f10962k.getName() + "'s InputStream is null");
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.f10961j;
        if (inputStream != null) {
            inputStream.close();
            this.f10965n = false;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f10965n;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return mo30120G(byteBuffer, this.f10966o);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}

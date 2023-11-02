package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: com.facebook.soloader.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4305g implements InterfaceC4304f {

    /* renamed from: j */
    private File f10958j;

    /* renamed from: k */
    private FileInputStream f10959k;

    /* renamed from: l */
    private FileChannel f10960l;

    public C4305g(File file) {
        this.f10958j = file;
        m30121a();
    }

    @Override // com.facebook.soloader.InterfaceC4304f
    /* renamed from: G */
    public int mo30120G(ByteBuffer byteBuffer, long j) {
        return this.f10960l.read(byteBuffer, j);
    }

    /* renamed from: a */
    public void m30121a() {
        FileInputStream fileInputStream = new FileInputStream(this.f10958j);
        this.f10959k = fileInputStream;
        this.f10960l = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10959k.close();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f10960l.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return this.f10960l.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        return this.f10960l.write(byteBuffer);
    }
}
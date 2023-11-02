package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p129h5.C7018a;
import p394w2.C13379j;
import p394w2.InterfaceC13370d;
import p437y4.InterfaceC13896s;

@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class NativeMemoryChunk implements InterfaceC13896s, Closeable {

    /* renamed from: j */
    private final long f10487j;

    /* renamed from: k */
    private final int f10488k;

    /* renamed from: l */
    private boolean f10489l;

    static {
        C7018a.m21531d("imagepipeline");
    }

    public NativeMemoryChunk(int i) {
        C13379j.m2682b(Boolean.valueOf(i > 0));
        this.f10488k = i;
        this.f10487j = nativeAllocate(i);
        this.f10489l = false;
    }

    /* renamed from: a */
    private void m31013a(int i, InterfaceC13896s interfaceC13896s, int i2, int i3) {
        if (interfaceC13896s instanceof NativeMemoryChunk) {
            C13379j.m2675i(!isClosed());
            C13379j.m2675i(!interfaceC13896s.isClosed());
            C3731i.m30964b(i, interfaceC13896s.getSize(), i2, i3, this.f10488k);
            nativeMemcpy(interfaceC13896s.mo1284l() + i2, this.f10487j + i, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @InterfaceC13370d
    private static native long nativeAllocate(int i);

    @InterfaceC13370d
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @InterfaceC13370d
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @InterfaceC13370d
    private static native void nativeFree(long j);

    @InterfaceC13370d
    private static native void nativeMemcpy(long j, long j2, int i);

    @InterfaceC13370d
    private static native byte nativeReadByte(long j);

    @Override // p437y4.InterfaceC13896s, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f10489l) {
            this.f10489l = true;
            nativeFree(this.f10487j);
        }
    }

    @Override // p437y4.InterfaceC13896s
    /* renamed from: e */
    public synchronized int mo1287e(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int m30965a;
        C13379j.m2677g(bArr);
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2675i(z);
        m30965a = C3731i.m30965a(i, i3, this.f10488k);
        C3731i.m30964b(i, bArr.length, i2, m30965a, this.f10488k);
        nativeCopyToByteArray(this.f10487j + i, bArr, i2, m30965a);
        return m30965a;
    }

    @Override // p437y4.InterfaceC13896s
    /* renamed from: f */
    public ByteBuffer mo1286f() {
        return null;
    }

    protected void finalize() {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // p437y4.InterfaceC13896s
    public int getSize() {
        return this.f10488k;
    }

    @Override // p437y4.InterfaceC13896s
    public synchronized boolean isClosed() {
        return this.f10489l;
    }

    @Override // p437y4.InterfaceC13896s
    /* renamed from: k */
    public synchronized byte mo1285k(int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2675i(z);
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z2));
        if (i >= this.f10488k) {
            z3 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z3));
        return nativeReadByte(this.f10487j + i);
    }

    @Override // p437y4.InterfaceC13896s
    /* renamed from: l */
    public long mo1284l() {
        return this.f10487j;
    }

    @Override // p437y4.InterfaceC13896s
    /* renamed from: m */
    public long mo1283m() {
        return this.f10487j;
    }

    @Override // p437y4.InterfaceC13896s
    /* renamed from: o */
    public synchronized int mo1282o(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int m30965a;
        C13379j.m2677g(bArr);
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2675i(z);
        m30965a = C3731i.m30965a(i, i3, this.f10488k);
        C3731i.m30964b(i, bArr.length, i2, m30965a, this.f10488k);
        nativeCopyFromByteArray(this.f10487j + i, bArr, i2, m30965a);
        return m30965a;
    }

    @Override // p437y4.InterfaceC13896s
    /* renamed from: q */
    public void mo1281q(int i, InterfaceC13896s interfaceC13896s, int i2, int i3) {
        C13379j.m2677g(interfaceC13896s);
        if (interfaceC13896s.mo1283m() == mo1283m()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(interfaceC13896s)) + " which share the same address " + Long.toHexString(this.f10487j));
            C13379j.m2682b(Boolean.FALSE);
        }
        if (interfaceC13896s.mo1283m() < mo1283m()) {
            synchronized (interfaceC13896s) {
                synchronized (this) {
                    m31013a(i, interfaceC13896s, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (interfaceC13896s) {
                m31013a(i, interfaceC13896s, i2, i3);
            }
        }
    }

    public NativeMemoryChunk() {
        this.f10488k = 0;
        this.f10487j = 0L;
        this.f10489l = true;
    }
}

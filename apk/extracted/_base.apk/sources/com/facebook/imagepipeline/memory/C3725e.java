package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p394w2.C13379j;
import p437y4.InterfaceC13896s;

/* renamed from: com.facebook.imagepipeline.memory.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3725e implements InterfaceC13896s, Closeable {

    /* renamed from: j */
    private ByteBuffer f10510j;

    /* renamed from: k */
    private final int f10511k;

    /* renamed from: l */
    private final long f10512l = System.identityHashCode(this);

    public C3725e(int i) {
        this.f10510j = ByteBuffer.allocateDirect(i);
        this.f10511k = i;
    }

    /* renamed from: a */
    private void m30984a(int i, InterfaceC13896s interfaceC13896s, int i2, int i3) {
        if (interfaceC13896s instanceof C3725e) {
            C13379j.m2675i(!isClosed());
            C13379j.m2675i(!interfaceC13896s.isClosed());
            C3731i.m30964b(i, interfaceC13896s.getSize(), i2, i3, this.f10511k);
            this.f10510j.position(i);
            interfaceC13896s.mo1286f().position(i2);
            byte[] bArr = new byte[i3];
            this.f10510j.get(bArr, 0, i3);
            interfaceC13896s.mo1286f().put(bArr, 0, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @Override // p437y4.InterfaceC13896s, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f10510j = null;
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
        m30965a = C3731i.m30965a(i, i3, this.f10511k);
        C3731i.m30964b(i, bArr.length, i2, m30965a, this.f10511k);
        this.f10510j.position(i);
        this.f10510j.get(bArr, i2, m30965a);
        return m30965a;
    }

    @Override // p437y4.InterfaceC13896s
    /* renamed from: f */
    public synchronized ByteBuffer mo1286f() {
        return this.f10510j;
    }

    @Override // p437y4.InterfaceC13896s
    public int getSize() {
        return this.f10511k;
    }

    @Override // p437y4.InterfaceC13896s
    public synchronized boolean isClosed() {
        boolean z;
        if (this.f10510j == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
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
        if (i >= this.f10511k) {
            z3 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z3));
        return this.f10510j.get(i);
    }

    @Override // p437y4.InterfaceC13896s
    /* renamed from: l */
    public long mo1284l() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // p437y4.InterfaceC13896s
    /* renamed from: m */
    public long mo1283m() {
        return this.f10512l;
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
        m30965a = C3731i.m30965a(i, i3, this.f10511k);
        C3731i.m30964b(i, bArr.length, i2, m30965a, this.f10511k);
        this.f10510j.position(i);
        this.f10510j.put(bArr, i2, m30965a);
        return m30965a;
    }

    @Override // p437y4.InterfaceC13896s
    /* renamed from: q */
    public void mo1281q(int i, InterfaceC13896s interfaceC13896s, int i2, int i3) {
        C13379j.m2677g(interfaceC13896s);
        if (interfaceC13896s.mo1283m() == mo1283m()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(mo1283m()) + " to BufferMemoryChunk " + Long.toHexString(interfaceC13896s.mo1283m()) + " which are the same ");
            C13379j.m2682b(Boolean.FALSE);
        }
        if (interfaceC13896s.mo1283m() < mo1283m()) {
            synchronized (interfaceC13896s) {
                synchronized (this) {
                    m30984a(i, interfaceC13896s, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (interfaceC13896s) {
                m30984a(i, interfaceC13896s, i2, i3);
            }
        }
    }
}

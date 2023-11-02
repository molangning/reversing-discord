package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p394w2.C13379j;
import p437y4.InterfaceC13896s;

@TargetApi(27)
/* renamed from: com.facebook.imagepipeline.memory.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3718a implements InterfaceC13896s, Closeable {

    /* renamed from: j */
    private SharedMemory f10490j;

    /* renamed from: k */
    private ByteBuffer f10491k;

    /* renamed from: l */
    private final long f10492l;

    public C3718a(int i) {
        boolean z;
        SharedMemory create;
        ByteBuffer mapReadWrite;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        try {
            create = SharedMemory.create("AshmemMemoryChunk", i);
            this.f10490j = create;
            mapReadWrite = create.mapReadWrite();
            this.f10491k = mapReadWrite;
            this.f10492l = System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw new RuntimeException("Fail to create AshmemMemory", e);
        }
    }

    /* renamed from: a */
    private void m31011a(int i, InterfaceC13896s interfaceC13896s, int i2, int i3) {
        if (interfaceC13896s instanceof C3718a) {
            C13379j.m2675i(!isClosed());
            C13379j.m2675i(!interfaceC13896s.isClosed());
            C3731i.m30964b(i, interfaceC13896s.getSize(), i2, i3, getSize());
            this.f10491k.position(i);
            interfaceC13896s.mo1286f().position(i2);
            byte[] bArr = new byte[i3];
            this.f10491k.get(bArr, 0, i3);
            interfaceC13896s.mo1286f().put(bArr, 0, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @Override // p437y4.InterfaceC13896s, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!isClosed()) {
            SharedMemory.unmap(this.f10491k);
            this.f10490j.close();
            this.f10491k = null;
            this.f10490j = null;
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
        m30965a = C3731i.m30965a(i, i3, getSize());
        C3731i.m30964b(i, bArr.length, i2, m30965a, getSize());
        this.f10491k.position(i);
        this.f10491k.get(bArr, i2, m30965a);
        return m30965a;
    }

    @Override // p437y4.InterfaceC13896s
    /* renamed from: f */
    public ByteBuffer mo1286f() {
        return this.f10491k;
    }

    @Override // p437y4.InterfaceC13896s
    public int getSize() {
        int size;
        C13379j.m2675i(!isClosed());
        size = this.f10490j.getSize();
        return size;
    }

    @Override // p437y4.InterfaceC13896s
    public synchronized boolean isClosed() {
        boolean z;
        if (this.f10491k != null) {
            if (this.f10490j != null) {
                z = false;
            }
        }
        z = true;
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
        if (i >= getSize()) {
            z3 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z3));
        return this.f10491k.get(i);
    }

    @Override // p437y4.InterfaceC13896s
    /* renamed from: l */
    public long mo1284l() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // p437y4.InterfaceC13896s
    /* renamed from: m */
    public long mo1283m() {
        return this.f10492l;
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
        m30965a = C3731i.m30965a(i, i3, getSize());
        C3731i.m30964b(i, bArr.length, i2, m30965a, getSize());
        this.f10491k.position(i);
        this.f10491k.put(bArr, i2, m30965a);
        return m30965a;
    }

    @Override // p437y4.InterfaceC13896s
    /* renamed from: q */
    public void mo1281q(int i, InterfaceC13896s interfaceC13896s, int i2, int i3) {
        C13379j.m2677g(interfaceC13896s);
        if (interfaceC13896s.mo1283m() == mo1283m()) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(mo1283m()) + " to AshmemMemoryChunk " + Long.toHexString(interfaceC13896s.mo1283m()) + " which are the same ");
            C13379j.m2682b(Boolean.FALSE);
        }
        if (interfaceC13896s.mo1283m() < mo1283m()) {
            synchronized (interfaceC13896s) {
                synchronized (this) {
                    m31011a(i, interfaceC13896s, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (interfaceC13896s) {
                m31011a(i, interfaceC13896s, i2, i3);
            }
        }
    }
}
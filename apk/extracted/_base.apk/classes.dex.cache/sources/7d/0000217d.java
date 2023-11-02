package com.facebook.common.references;

import com.facebook.common.references.CloseableReference;
import p004a3.InterfaceC0016c;
import p414x2.C13677a;

/* renamed from: com.facebook.common.references.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3566b<T> extends CloseableReference<T> {
    public C3566b(T t, InterfaceC0016c<T> interfaceC0016c, CloseableReference.InterfaceC3564c interfaceC3564c, Throwable th2) {
        super(t, interfaceC0016c, interfaceC3564c, th2);
    }

    @Override // com.facebook.common.references.CloseableReference, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.facebook.common.references.CloseableReference
    public void finalize() {
        String name;
        try {
            synchronized (this) {
                if (this.f9699j) {
                    return;
                }
                T m41392f = this.f9700k.m41392f();
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(System.identityHashCode(this));
                objArr[1] = Integer.valueOf(System.identityHashCode(this.f9700k));
                if (m41392f == null) {
                    name = null;
                } else {
                    name = m41392f.getClass().getName();
                }
                objArr[2] = name;
                C13677a.m1868J("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", objArr);
                this.f9700k.m41394d();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.common.references.CloseableReference
    /* renamed from: m */
    public CloseableReference<T> clone() {
        return this;
    }
}
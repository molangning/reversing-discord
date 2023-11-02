package com.facebook.common.references;

import com.facebook.common.references.CloseableReference;
import p004a3.C0017d;
import p004a3.InterfaceC0016c;
import p394w2.C13379j;
import p414x2.C13677a;

/* renamed from: com.facebook.common.references.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3565a<T> extends CloseableReference<T> {
    private C3565a(C0017d<T> c0017d, CloseableReference.InterfaceC3564c interfaceC3564c, Throwable th2) {
        super(c0017d, interfaceC3564c, th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                C13677a.m1868J("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", objArr);
                this.f9701l.mo6464a(this.f9700k, this.f9702m);
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.common.references.CloseableReference
    /* renamed from: m */
    public CloseableReference<T> clone() {
        Throwable th2;
        C13379j.m2675i(m31728I());
        C0017d<T> c0017d = this.f9700k;
        CloseableReference.InterfaceC3564c interfaceC3564c = this.f9701l;
        if (this.f9702m != null) {
            th2 = new Throwable(this.f9702m);
        } else {
            th2 = null;
        }
        return new C3565a(c0017d, interfaceC3564c, th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3565a(T t, InterfaceC0016c<T> interfaceC0016c, CloseableReference.InterfaceC3564c interfaceC3564c, Throwable th2) {
        super(t, interfaceC0016c, interfaceC3564c, th2);
    }
}

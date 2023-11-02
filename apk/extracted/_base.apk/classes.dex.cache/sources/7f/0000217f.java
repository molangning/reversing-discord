package com.facebook.common.references;

import com.facebook.common.references.CloseableReference;
import p004a3.C0017d;
import p004a3.InterfaceC0016c;
import p394w2.C13379j;

/* renamed from: com.facebook.common.references.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3568d<T> extends CloseableReference<T> {
    private C3568d(C0017d<T> c0017d, CloseableReference.InterfaceC3564c interfaceC3564c, Throwable th2) {
        super(c0017d, interfaceC3564c, th2);
    }

    @Override // com.facebook.common.references.CloseableReference
    /* renamed from: m */
    public CloseableReference<T> clone() {
        C13379j.m2675i(m31728I());
        return new C3568d(this.f9700k, this.f9701l, this.f9702m);
    }

    public C3568d(T t, InterfaceC0016c<T> interfaceC0016c, CloseableReference.InterfaceC3564c interfaceC3564c, Throwable th2) {
        super(t, interfaceC0016c, interfaceC3564c, th2);
    }
}
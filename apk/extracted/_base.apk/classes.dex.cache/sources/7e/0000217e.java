package com.facebook.common.references;

import com.facebook.common.references.CloseableReference;
import p004a3.InterfaceC0016c;

/* renamed from: com.facebook.common.references.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3567c<T> extends CloseableReference<T> {
    public C3567c(T t, InterfaceC0016c<T> interfaceC0016c, CloseableReference.InterfaceC3564c interfaceC3564c, Throwable th2) {
        super(t, interfaceC0016c, interfaceC3564c, th2);
    }

    @Override // com.facebook.common.references.CloseableReference, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.facebook.common.references.CloseableReference
    /* renamed from: m */
    public CloseableReference<T> clone() {
        return this;
    }
}
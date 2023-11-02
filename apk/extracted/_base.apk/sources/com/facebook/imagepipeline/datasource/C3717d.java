package com.facebook.imagepipeline.datasource;

import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.producers.C3835r0;
import com.facebook.imagepipeline.producers.InterfaceC3810l0;
import p416x4.InterfaceC13689d;

/* renamed from: com.facebook.imagepipeline.datasource.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3717d<T> extends AbstractC3713a<T> {
    private C3717d(InterfaceC3810l0<T> interfaceC3810l0, C3835r0 c3835r0, InterfaceC13689d interfaceC13689d) {
        super(interfaceC3810l0, c3835r0, interfaceC13689d);
    }

    /* renamed from: H */
    public static <T> DataSource<T> m31016H(InterfaceC3810l0<T> interfaceC3810l0, C3835r0 c3835r0, InterfaceC13689d interfaceC13689d) {
        return new C3717d(interfaceC3810l0, c3835r0, interfaceC13689d);
    }
}

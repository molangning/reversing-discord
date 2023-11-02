package net.time4j;

import p162ij.C7642g0;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7670v;

/* renamed from: net.time4j.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C10764i extends AbstractC10782o<C10697f0> {

    /* renamed from: l */
    private final Object f28083l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10764i(InterfaceC7664p<?> interfaceC7664p, int i) {
        this(interfaceC7664p, i, null);
    }

    /* renamed from: c */
    private static <V> Object m10313c(InterfaceC7664p<V> interfaceC7664p, Object obj) {
        return C10797t0.m10182a(C7642g0.m20184o(interfaceC7664p.getType().cast(obj), interfaceC7664p), obj);
    }

    /* renamed from: d */
    private static <V> Object m10312d(InterfaceC7664p<V> interfaceC7664p, Object obj) {
        return C10797t0.m10182a(C7642g0.m20185n(interfaceC7664p.getType().cast(obj), interfaceC7664p), obj);
    }

    @Override // p162ij.InterfaceC7670v
    /* renamed from: b */
    public C10697f0 apply(C10697f0 c10697f0) {
        return (C10697f0) ((InterfaceC7670v) this.f28083l).apply(c10697f0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10764i(InterfaceC7664p<?> interfaceC7664p, int i, Object obj) {
        super(interfaceC7664p, i);
        switch (i) {
            case -1:
                this.f28083l = m10312d(interfaceC7664p, obj);
                return;
            case 0:
                this.f28083l = C7642g0.m20187l(interfaceC7664p);
                return;
            case 1:
                this.f28083l = C7642g0.m20189j(interfaceC7664p);
                return;
            case 2:
                this.f28083l = C7642g0.m20193f(interfaceC7664p);
                return;
            case 3:
                this.f28083l = C7642g0.m20191h(interfaceC7664p);
                return;
            case 4:
                this.f28083l = C7642g0.m20195d(interfaceC7664p);
                return;
            case 5:
                this.f28083l = C7642g0.m20196c(interfaceC7664p);
                return;
            case 6:
                this.f28083l = m10313c(interfaceC7664p, obj);
                return;
            default:
                throw new AssertionError("Unknown: " + m10244a());
        }
    }
}

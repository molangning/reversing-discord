package net.time4j;

import p162ij.AbstractC7665q;
import p162ij.C7642g0;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7670v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.r0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10791r0 extends AbstractC10782o<C10711g0> {

    /* renamed from: l */
    private final Object f28167l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10791r0(InterfaceC7664p<?> interfaceC7664p, int i) {
        this(interfaceC7664p, i, null);
    }

    /* renamed from: c */
    private static <V, T extends AbstractC7665q<T>> InterfaceC7670v<T> m10207c(InterfaceC7664p<V> interfaceC7664p, boolean z) {
        String name = interfaceC7664p.name();
        if (!name.equals("MILLI_OF_SECOND") && !name.equals("MILLI_OF_DAY")) {
            if (!name.equals("MICRO_OF_SECOND") && !name.equals("MICRO_OF_DAY")) {
                if (!name.equals("NANO_OF_SECOND") && !name.equals("NANO_OF_DAY")) {
                    if (z) {
                        return C7642g0.m20196c(interfaceC7664p);
                    }
                    return C7642g0.m20195d(interfaceC7664p);
                }
                return new C10788q('9', z);
            }
            return new C10788q('6', z);
        }
        return new C10788q('3', z);
    }

    /* renamed from: d */
    private static <V> Object m10206d(InterfaceC7664p<V> interfaceC7664p, Object obj) {
        return C10797t0.m10182a(C7642g0.m20184o(interfaceC7664p.getType().cast(obj), interfaceC7664p), obj);
    }

    /* renamed from: e */
    private static <V> Object m10205e(InterfaceC7664p<V> interfaceC7664p, Object obj) {
        return C10797t0.m10182a(C7642g0.m20185n(interfaceC7664p.getType().cast(obj), interfaceC7664p), obj);
    }

    @Override // p162ij.InterfaceC7670v
    /* renamed from: b */
    public C10711g0 apply(C10711g0 c10711g0) {
        return (C10711g0) ((InterfaceC7670v) this.f28167l).apply(c10711g0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10791r0(InterfaceC7664p<?> interfaceC7664p, int i, Object obj) {
        super(interfaceC7664p, i);
        switch (i) {
            case -1:
                this.f28167l = m10205e(interfaceC7664p, obj);
                return;
            case 0:
                this.f28167l = C7642g0.m20187l(interfaceC7664p);
                return;
            case 1:
                this.f28167l = C7642g0.m20189j(interfaceC7664p);
                return;
            case 2:
                this.f28167l = C7642g0.m20193f(interfaceC7664p);
                return;
            case 3:
                this.f28167l = C7642g0.m20191h(interfaceC7664p);
                return;
            case 4:
                this.f28167l = m10207c(interfaceC7664p, false);
                return;
            case 5:
                this.f28167l = m10207c(interfaceC7664p, true);
                return;
            case 6:
                this.f28167l = m10206d(interfaceC7664p, obj);
                return;
            default:
                throw new AssertionError("Unknown: " + m10244a());
        }
    }
}

package p005a4;

import p414x2.C13677a;
import p415x3.InterfaceC13680a;
import p436y3.InterfaceC13872b;

/* renamed from: a4.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C0023d implements InterfaceC0019a {

    /* renamed from: b */
    private static final Class<?> f37b = C0023d.class;

    /* renamed from: a */
    private final int f38a;

    public C0023d() {
        this(3);
    }

    @Override // p005a4.InterfaceC0019a
    /* renamed from: a */
    public void mo41379a(InterfaceC0020b interfaceC0020b, InterfaceC13872b interfaceC13872b, InterfaceC13680a interfaceC13680a, int i) {
        for (int i2 = 1; i2 <= this.f38a; i2++) {
            int mo1347a = (i + i2) % interfaceC13680a.mo1347a();
            if (C13677a.m1842v(2)) {
                C13677a.m1839y(f37b, "Preparing frame %d, last drawn: %d", Integer.valueOf(mo1347a), Integer.valueOf(i));
            }
            if (!interfaceC0020b.mo41388a(interfaceC13872b, interfaceC13680a, mo1347a)) {
                return;
            }
        }
    }

    public C0023d(int i) {
        this.f38a = i;
    }
}
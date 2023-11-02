package p164j$.time.chrono;

import p164j$.time.C8332r;
import p164j$.time.temporal.AbstractC8342j;
import p164j$.time.temporal.C8348p;
import p164j$.time.temporal.EnumC8333a;

/* renamed from: j$.time.chrono.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract /* synthetic */ class AbstractC8290d {
    /* renamed from: a */
    public static int m17899a(InterfaceC8292f interfaceC8292f, EnumC8333a enumC8333a) {
        if (enumC8333a instanceof EnumC8333a) {
            int i = AbstractC8291e.f22291a[enumC8333a.ordinal()];
            if (i != 1) {
                C8332r c8332r = (C8332r) interfaceC8292f;
                return i != 2 ? c8332r.m17826j().mo17801e(enumC8333a) : c8332r.m17830f().m17907g();
            }
            throw new C8348p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return AbstractC8342j.m17815a(interfaceC8292f, enumC8333a);
    }
}
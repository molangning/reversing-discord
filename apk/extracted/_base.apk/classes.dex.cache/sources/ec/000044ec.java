package net.time4j.p249tz.model;

import net.time4j.C10697f0;
import net.time4j.C10711g0;
import net.time4j.C10766j;
import net.time4j.EnumC10704g;
import net.time4j.base.InterfaceC10614a;
import p184jj.InterfaceC8977c;

/* renamed from: net.time4j.tz.model.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public abstract class AbstractC10819d {

    /* renamed from: j */
    private final transient long f28262j;

    /* renamed from: k */
    private final transient C10711g0 f28263k;

    /* renamed from: l */
    private final transient EnumC10824i f28264l;

    /* renamed from: m */
    private final transient int f28265m;

    public AbstractC10819d(int i, EnumC10824i enumC10824i, int i2) {
        if (enumC10824i != null) {
            if (i2 != Integer.MAX_VALUE && (i2 < -64800 || i2 > 64800)) {
                throw new IllegalArgumentException("DST out of range: " + i2);
            }
            if (i == 86400) {
                this.f28262j = 0L;
                this.f28263k = C10711g0.m10615I0();
            } else {
                C10766j m10600T0 = C10711g0.m10614J0().m10600T0(i, EnumC10704g.f27926l);
                this.f28262j = m10600T0.m10308a();
                this.f28263k = m10600T0.m10307b();
            }
            this.f28264l = enumC10824i;
            this.f28265m = i2 == Integer.MAX_VALUE ? 0 : i2;
            return;
        }
        throw new NullPointerException("Missing offset indicator.");
    }

    /* renamed from: a */
    public String mo10072a() {
        InterfaceC8977c interfaceC8977c = (InterfaceC8977c) getClass().getAnnotation(InterfaceC8977c.class);
        if (interfaceC8977c != null) {
            return interfaceC8977c.value();
        }
        throw new IllegalStateException("Cannot find calendar type annotation: " + getClass());
    }

    /* renamed from: b */
    public abstract C10697f0 mo10071b(int i);

    /* renamed from: c */
    public final long m10077c() {
        return this.f28262j;
    }

    /* renamed from: d */
    public final EnumC10824i m10076d() {
        return this.f28264l;
    }

    /* renamed from: e */
    public final int m10075e() {
        return this.f28265m;
    }

    /* renamed from: f */
    public final C10711g0 m10074f() {
        return this.f28263k;
    }

    /* renamed from: g */
    public int mo10066g() {
        return 0;
    }

    /* renamed from: h */
    public abstract int mo10070h(long j);

    /* renamed from: i */
    public abstract int mo10069i(InterfaceC10614a interfaceC10614a);
}
package net.time4j.p249tz.model;

import java.io.Serializable;
import net.time4j.C10697f0;
import net.time4j.EnumC10612b0;
import net.time4j.EnumC10686f;
import net.time4j.base.C10615b;
import net.time4j.base.InterfaceC10614a;
import p184jj.InterfaceC8977c;

@InterfaceC8977c("iso8601")
/* renamed from: net.time4j.tz.model.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C10822g extends AbstractC10819d implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: n */
    private final transient byte f28267n;

    public C10822g(EnumC10612b0 enumC10612b0, int i, EnumC10824i enumC10824i, int i2) {
        super(i, enumC10824i, i2);
        this.f28267n = (byte) enumC10612b0.m11060b();
    }

    @Override // net.time4j.p249tz.model.AbstractC10819d
    /* renamed from: a */
    public String mo10072a() {
        return "iso8601";
    }

    @Override // net.time4j.p249tz.model.AbstractC10819d
    /* renamed from: b */
    public final C10697f0 mo10071b(int i) {
        return (C10697f0) mo10065j(i).m20145L(m10077c(), EnumC10686f.f27878q);
    }

    @Override // net.time4j.p249tz.model.AbstractC10819d
    /* renamed from: h */
    public int mo10070h(long j) {
        return C10615b.m11046i(C10615b.m11043l(j));
    }

    @Override // net.time4j.p249tz.model.AbstractC10819d
    /* renamed from: i */
    public int mo10069i(InterfaceC10614a interfaceC10614a) {
        return interfaceC10614a.mo10482o();
    }

    /* renamed from: j */
    protected C10697f0 mo10065j(int i) {
        throw null;
    }

    /* renamed from: k */
    public byte m10068k() {
        return this.f28267n;
    }

    /* renamed from: l */
    public boolean m10067l(C10822g c10822g) {
        if (m10074f().equals(c10822g.m10074f()) && m10077c() == c10822g.m10077c() && m10076d() == c10822g.m10076d() && m10075e() == c10822g.m10075e() && this.f28267n == c10822g.f28267n) {
            return true;
        }
        return false;
    }
}
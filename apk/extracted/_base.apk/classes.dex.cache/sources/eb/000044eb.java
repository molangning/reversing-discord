package net.time4j.p249tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.C10697f0;
import net.time4j.EnumC10612b0;
import net.time4j.EnumC10686f;
import net.time4j.EnumC10846x0;
import net.time4j.base.C10615b;

/* renamed from: net.time4j.tz.model.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10818c extends C10822g {
    private static final long serialVersionUID = -7354650946442523175L;

    /* renamed from: o */
    private final transient byte f28259o;

    /* renamed from: p */
    private final transient byte f28260p;

    /* renamed from: q */
    private final transient boolean f28261q;

    public C10818c(EnumC10612b0 enumC10612b0, int i, EnumC10846x0 enumC10846x0, int i2, EnumC10824i enumC10824i, int i3, boolean z) {
        super(enumC10612b0, i2, enumC10824i, i3);
        C10615b.m11054a(2000, enumC10612b0.m11060b(), i);
        this.f28259o = (byte) i;
        this.f28260p = (byte) enumC10846x0.m9997b();
        this.f28261q = z;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, mo10066g());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10818c)) {
            return false;
        }
        C10818c c10818c = (C10818c) obj;
        if (this.f28259o == c10818c.f28259o && this.f28260p == c10818c.f28260p && this.f28261q == c10818c.f28261q && super.m10067l(c10818c)) {
            return true;
        }
        return false;
    }

    @Override // net.time4j.p249tz.model.AbstractC10819d
    /* renamed from: g */
    public int mo10066g() {
        return 121;
    }

    public int hashCode() {
        return this.f28259o + ((this.f28260p + (m10068k() * 37)) * 17) + (this.f28261q ? 1 : 0);
    }

    @Override // net.time4j.p249tz.model.C10822g
    /* renamed from: j */
    protected C10697f0 mo10065j(int i) {
        int i2;
        byte m10068k = m10068k();
        int m11052c = C10615b.m11052c(i, m10068k, this.f28259o);
        C10697f0 m10713M0 = C10697f0.m10713M0(i, m10068k, this.f28259o);
        byte b = this.f28260p;
        if (m11052c == b) {
            return m10713M0;
        }
        int i3 = m11052c - b;
        if (this.f28261q) {
            i3 = -i3;
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (i3 < 0) {
            i3 += 7;
        }
        return (C10697f0) m10713M0.m20145L(i3 * i2, EnumC10686f.f27878q);
    }

    /* renamed from: m */
    public int m10080m() {
        return this.f28259o;
    }

    /* renamed from: n */
    public byte m10079n() {
        return this.f28260p;
    }

    /* renamed from: o */
    public boolean m10078o() {
        return this.f28261q;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("DayOfWeekInMonthPattern:[month=");
        sb2.append((int) m10068k());
        sb2.append(",dayOfMonth=");
        sb2.append((int) this.f28259o);
        sb2.append(",dayOfWeek=");
        sb2.append(EnumC10846x0.m9993f(this.f28260p));
        sb2.append(",day-overflow=");
        sb2.append(m10077c());
        sb2.append(",time-of-day=");
        sb2.append(m10074f());
        sb2.append(",offset-indicator=");
        sb2.append(m10076d());
        sb2.append(",dst-offset=");
        sb2.append(m10075e());
        sb2.append(",after=");
        sb2.append(this.f28261q);
        sb2.append(']');
        return sb2.toString();
    }
}
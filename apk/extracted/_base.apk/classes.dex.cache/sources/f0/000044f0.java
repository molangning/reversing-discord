package net.time4j.p249tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.C10697f0;
import net.time4j.EnumC10612b0;
import net.time4j.EnumC10846x0;
import net.time4j.base.C10615b;

/* renamed from: net.time4j.tz.model.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10823h extends C10822g {
    private static final long serialVersionUID = -946839310332554772L;

    /* renamed from: o */
    private final transient byte f28268o;

    public C10823h(EnumC10612b0 enumC10612b0, EnumC10846x0 enumC10846x0, int i, EnumC10824i enumC10824i, int i2) {
        super(enumC10612b0, i, enumC10824i, i2);
        this.f28268o = (byte) enumC10846x0.m9997b();
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
        if (!(obj instanceof C10823h)) {
            return false;
        }
        C10823h c10823h = (C10823h) obj;
        if (this.f28268o == c10823h.f28268o && super.m10067l(c10823h)) {
            return true;
        }
        return false;
    }

    @Override // net.time4j.p249tz.model.AbstractC10819d
    /* renamed from: g */
    public int mo10066g() {
        return 122;
    }

    public int hashCode() {
        return (this.f28268o * 17) + (m10068k() * 37);
    }

    @Override // net.time4j.p249tz.model.C10822g
    /* renamed from: j */
    protected C10697f0 mo10065j(int i) {
        byte m10068k = m10068k();
        int m11051d = C10615b.m11051d(i, m10068k);
        int m11052c = C10615b.m11052c(i, m10068k, m11051d) - this.f28268o;
        if (m11052c < 0) {
            m11052c += 7;
        }
        return C10697f0.m10713M0(i, m10068k, m11051d - m11052c);
    }

    /* renamed from: m */
    public byte m10064m() {
        return this.f28268o;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LastDayOfWeekPattern:[month=");
        sb2.append((int) m10068k());
        sb2.append(",day-of-week=");
        sb2.append(EnumC10846x0.m9993f(this.f28268o));
        sb2.append(",day-overflow=");
        sb2.append(m10077c());
        sb2.append(",time-of-day=");
        sb2.append(m10074f());
        sb2.append(",offset-indicator=");
        sb2.append(m10076d());
        sb2.append(",dst-offset=");
        sb2.append(m10075e());
        sb2.append(']');
        return sb2.toString();
    }
}
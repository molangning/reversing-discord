package net.time4j.p249tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.C10697f0;
import net.time4j.EnumC10612b0;
import net.time4j.base.C10615b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.model.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10821f extends C10822g {
    private static final long serialVersionUID = 3957240859230862745L;

    /* renamed from: o */
    private final transient byte f28266o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10821f(EnumC10612b0 enumC10612b0, int i, int i2, EnumC10824i enumC10824i, int i3) {
        super(enumC10612b0, i2, enumC10824i, i3);
        C10615b.m11054a(2000, enumC10612b0.m11060b(), i);
        this.f28266o = (byte) i;
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
        if (!(obj instanceof C10821f)) {
            return false;
        }
        C10821f c10821f = (C10821f) obj;
        if (this.f28266o == c10821f.f28266o && super.m10067l(c10821f)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // net.time4j.p249tz.model.AbstractC10819d
    /* renamed from: g */
    public int mo10066g() {
        return 120;
    }

    public int hashCode() {
        return this.f28266o + (m10068k() * 37);
    }

    @Override // net.time4j.p249tz.model.C10822g
    /* renamed from: j */
    protected C10697f0 mo10065j(int i) {
        return C10697f0.m10713M0(i, m10068k(), this.f28266o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m10073m() {
        return this.f28266o;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("FixedDayPattern:[month=");
        sb2.append((int) m10068k());
        sb2.append(",day-of-month=");
        sb2.append((int) this.f28266o);
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

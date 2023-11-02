package net.time4j.history;

import java.io.DataInput;
import java.io.DataOutput;
import net.time4j.C10697f0;
import p162ij.EnumC7627a0;

/* renamed from: net.time4j.history.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10740g {

    /* renamed from: d */
    static final C10740g f28044d = new C10740g();

    /* renamed from: e */
    private static final C10741h f28045e = C10741h.m10379g(EnumC10744j.AD, 1, 1, 1);

    /* renamed from: f */
    private static final C10741h f28046f = C10741h.m10379g(EnumC10744j.BC, 38, 1, 1);

    /* renamed from: g */
    private static final C10697f0 f28047g = C10697f0.m10714L0(2000, 1);

    /* renamed from: a */
    private final EnumC10744j f28048a;

    /* renamed from: b */
    private final C10697f0 f28049b;

    /* renamed from: c */
    private final C10697f0 f28050c;

    private C10740g() {
        this.f28048a = null;
        this.f28049b = C10697f0.m10673w0().m20170O();
        this.f28050c = C10697f0.m10673w0().m20171N();
    }

    /* renamed from: a */
    public static C10740g m10393a(C10697f0 c10697f0, C10697f0 c10697f02) {
        return new C10740g(EnumC10744j.AB_URBE_CONDITA, c10697f0, c10697f02);
    }

    /* renamed from: b */
    public static C10740g m10392b(C10697f0 c10697f0, C10697f0 c10697f02) {
        return new C10740g(EnumC10744j.BYZANTINE, c10697f0, c10697f02);
    }

    /* renamed from: c */
    public static C10740g m10391c(C10697f0 c10697f0) {
        return m10392b(C10697f0.m10673w0().m20170O(), c10697f0);
    }

    /* renamed from: e */
    public static C10740g m10389e(C10697f0 c10697f0, C10697f0 c10697f02) {
        return new C10740g(EnumC10744j.HISPANIC, c10697f0, c10697f02);
    }

    /* renamed from: f */
    public static C10740g m10388f(C10697f0 c10697f0) {
        return m10389e(C10697f0.m10673w0().m20170O(), c10697f0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C10740g m10387g(DataInput dataInput) {
        if (dataInput.readByte() == Byte.MAX_VALUE) {
            EnumC10744j valueOf = EnumC10744j.valueOf(dataInput.readUTF());
            long readLong = dataInput.readLong();
            long readLong2 = dataInput.readLong();
            C10697f0 c10697f0 = f28047g;
            EnumC7627a0 enumC7627a0 = EnumC7627a0.MODIFIED_JULIAN_DATE;
            return new C10740g(valueOf, (C10697f0) c10697f0.m20121E(enumC7627a0, readLong), (C10697f0) c10697f0.m20121E(enumC7627a0, readLong2));
        }
        return f28044d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public EnumC10744j m10390d(C10741h c10741h, C10697f0 c10697f0) {
        if (this.f28048a != null && !c10697f0.m20131U(this.f28049b) && !c10697f0.m20132S(this.f28050c)) {
            if (this.f28048a == EnumC10744j.HISPANIC && c10741h.compareTo(f28046f) < 0) {
                return EnumC10744j.BC;
            }
            return this.f28048a;
        } else if (c10741h.compareTo(f28045e) < 0) {
            return EnumC10744j.BC;
        } else {
            return EnumC10744j.AD;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10740g)) {
            return false;
        }
        C10740g c10740g = (C10740g) obj;
        C10740g c10740g2 = f28044d;
        if (this == c10740g2) {
            if (c10740g == c10740g2) {
                return true;
            }
            return false;
        } else if (this.f28048a == c10740g.f28048a && this.f28049b.equals(c10740g.f28049b) && this.f28050c.equals(c10740g.f28050c)) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m10386h(DataOutput dataOutput) {
        if (this == f28044d) {
            dataOutput.writeByte(0);
            return;
        }
        dataOutput.writeByte(127);
        dataOutput.writeUTF(this.f28048a.name());
        C10697f0 c10697f0 = this.f28049b;
        EnumC7627a0 enumC7627a0 = EnumC7627a0.MODIFIED_JULIAN_DATE;
        dataOutput.writeLong(((Long) c10697f0.mo10212i(enumC7627a0)).longValue());
        dataOutput.writeLong(((Long) this.f28050c.mo10212i(enumC7627a0)).longValue());
    }

    public int hashCode() {
        return (this.f28048a.hashCode() * 17) + (this.f28049b.hashCode() * 31) + (this.f28050c.hashCode() * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        if (this == f28044d) {
            sb2.append("default");
        } else {
            sb2.append("era->");
            sb2.append(this.f28048a);
            sb2.append(",start->");
            sb2.append(this.f28049b);
            sb2.append(",end->");
            sb2.append(this.f28050c);
        }
        sb2.append(']');
        return sb2.toString();
    }

    private C10740g(EnumC10744j enumC10744j, C10697f0 c10697f0, C10697f0 c10697f02) {
        if (enumC10744j.compareTo(EnumC10744j.AD) > 0) {
            if (!c10697f02.m20131U(c10697f0)) {
                this.f28048a = enumC10744j;
                this.f28049b = c10697f0;
                this.f28050c = c10697f02;
                return;
            }
            throw new IllegalArgumentException("End before start: " + c10697f0 + "/" + c10697f02);
        }
        throw new UnsupportedOperationException(enumC10744j.name());
    }
}

package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p231m9.EnumC10366b;

/* renamed from: m9.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10390j extends AbstractC2461a {
    public static final Parcelable.Creator<C10390j> CREATOR = new C10409q0();

    /* renamed from: j */
    private final EnumC10366b f27141j;

    /* renamed from: k */
    private final Boolean f27142k;

    /* renamed from: l */
    private final EnumC10384g0 f27143l;

    /* renamed from: m9.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10391a {

        /* renamed from: a */
        private EnumC10366b f27144a;

        /* renamed from: a */
        public C10390j m11632a() {
            String enumC10366b;
            EnumC10366b enumC10366b2 = this.f27144a;
            if (enumC10366b2 == null) {
                enumC10366b = null;
            } else {
                enumC10366b = enumC10366b2.toString();
            }
            return new C10390j(enumC10366b, null, null);
        }

        /* renamed from: b */
        public C10391a m11631b(EnumC10366b enumC10366b) {
            this.f27144a = enumC10366b;
            return this;
        }
    }

    public C10390j(String str, Boolean bool, String str2) {
        if (str == null) {
            this.f27141j = null;
        } else {
            try {
                this.f27141j = EnumC10366b.m11656a(str);
            } catch (EnumC10366b.C10367a e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.f27142k = bool;
        if (str2 == null) {
            this.f27143l = null;
            return;
        }
        try {
            this.f27143l = EnumC10384g0.m11639a(str2);
        } catch (C10387h0 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10390j)) {
            return false;
        }
        C10390j c10390j = (C10390j) obj;
        if (!C2190n.m34004b(this.f27141j, c10390j.f27141j) || !C2190n.m34004b(this.f27142k, c10390j.f27142k) || !C2190n.m34004b(this.f27143l, c10390j.f27143l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2190n.m34003c(this.f27141j, this.f27142k, this.f27143l);
    }

    /* renamed from: r */
    public String m11634r() {
        EnumC10366b enumC10366b = this.f27141j;
        if (enumC10366b == null) {
            return null;
        }
        return enumC10366b.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String enumC10384g0;
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33168p(parcel, 2, m11634r(), false);
        C2464c.m33180d(parcel, 3, m11633z(), false);
        EnumC10384g0 enumC10384g02 = this.f27143l;
        if (enumC10384g02 == null) {
            enumC10384g0 = null;
        } else {
            enumC10384g0 = enumC10384g02.toString();
        }
        C2464c.m33168p(parcel, 4, enumC10384g0, false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public Boolean m11633z() {
        return this.f27142k;
    }
}
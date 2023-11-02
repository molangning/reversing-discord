package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p231m9.C10393k;
import p231m9.EnumC10417u;

/* renamed from: m9.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10410r extends AbstractC2461a {
    public static final Parcelable.Creator<C10410r> CREATOR = new C10369b1();

    /* renamed from: j */
    private final EnumC10417u f27201j;

    /* renamed from: k */
    private final C10393k f27202k;

    public C10410r(String str, int i) {
        C2198p.m33985j(str);
        try {
            this.f27201j = EnumC10417u.m11590a(str);
            C2198p.m33985j(Integer.valueOf(i));
            try {
                this.f27202k = C10393k.m11630a(i);
            } catch (C10393k.C10394a e) {
                throw new IllegalArgumentException(e);
            }
        } catch (EnumC10417u.C10418a e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10410r)) {
            return false;
        }
        C10410r c10410r = (C10410r) obj;
        if (!this.f27201j.equals(c10410r.f27201j) || !this.f27202k.equals(c10410r.f27202k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2190n.m34003c(this.f27201j, this.f27202k);
    }

    /* renamed from: r */
    public int m11602r() {
        return this.f27202k.m11629b();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33168p(parcel, 2, m11601z(), false);
        C2464c.m33172l(parcel, 3, Integer.valueOf(m11602r()), false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public String m11601z() {
        return this.f27201j.toString();
    }
}
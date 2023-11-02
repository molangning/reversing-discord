package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: m9.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10415t extends AbstractC2461a {
    public static final Parcelable.Creator<C10415t> CREATOR = new C10376d1();

    /* renamed from: j */
    private final String f27222j;

    /* renamed from: k */
    private final String f27223k;

    /* renamed from: l */
    private final String f27224l;

    public C10415t(String str, String str2, String str3) {
        this.f27222j = (String) C2198p.m33985j(str);
        this.f27223k = (String) C2198p.m33985j(str2);
        this.f27224l = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10415t)) {
            return false;
        }
        C10415t c10415t = (C10415t) obj;
        if (!C2190n.m34004b(this.f27222j, c10415t.f27222j) || !C2190n.m34004b(this.f27223k, c10415t.f27223k) || !C2190n.m34004b(this.f27224l, c10415t.f27224l)) {
            return false;
        }
        return true;
    }

    public String getId() {
        return this.f27222j;
    }

    public int hashCode() {
        return C2190n.m34003c(this.f27222j, this.f27223k, this.f27224l);
    }

    /* renamed from: r */
    public String m11592r() {
        return this.f27224l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33168p(parcel, 2, getId(), false);
        C2464c.m33168p(parcel, 3, m11591z(), false);
        C2464c.m33168p(parcel, 4, m11592r(), false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public String m11591z() {
        return this.f27223k;
    }
}

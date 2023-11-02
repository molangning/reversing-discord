package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: m9.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10401n extends AbstractC2461a {
    public static final Parcelable.Creator<C10401n> CREATOR = new C10425x0();

    /* renamed from: j */
    private final String f27167j;

    public C10401n(String str) {
        this.f27167j = (String) C2198p.m33985j(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10401n)) {
            return false;
        }
        return this.f27167j.equals(((C10401n) obj).f27167j);
    }

    public int hashCode() {
        return C2190n.m34003c(this.f27167j);
    }

    /* renamed from: r */
    public String m11625r() {
        return this.f27167j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33168p(parcel, 2, m11625r(), false);
        C2464c.m33182b(parcel, m33183a);
    }
}

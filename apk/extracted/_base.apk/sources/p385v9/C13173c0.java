package p385v9;

import android.os.Parcel;
import android.os.Parcelable;
import p011aa.C0135g;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: v9.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13173c0 extends AbstractC2461a {
    public static final Parcelable.Creator<C13173c0> CREATOR = new C13176d0();

    /* renamed from: j */
    private String f34186j;

    /* renamed from: k */
    private int f34187k;

    /* renamed from: l */
    private C0135g f34188l;

    private C13173c0() {
    }

    /* renamed from: A */
    public final String m3061A() {
        return this.f34186j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13173c0) {
            C13173c0 c13173c0 = (C13173c0) obj;
            if (C2190n.m34004b(this.f34186j, c13173c0.f34186j) && C2190n.m34004b(Integer.valueOf(this.f34187k), Integer.valueOf(c13173c0.f34187k)) && C2190n.m34004b(this.f34188l, c13173c0.f34188l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2190n.m34003c(this.f34186j, Integer.valueOf(this.f34187k), this.f34188l);
    }

    /* renamed from: r */
    public final int m3060r() {
        return this.f34187k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33168p(parcel, 1, this.f34186j, false);
        C2464c.m33174j(parcel, 2, this.f34187k);
        C2464c.m33170n(parcel, 3, this.f34188l, i, false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public final C0135g m3059z() {
        return this.f34188l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13173c0(String str, int i, C0135g c0135g) {
        this.f34186j = str;
        this.f34187k = i;
        this.f34188l = c0135g;
    }
}

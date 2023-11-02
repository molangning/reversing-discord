package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: m9.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10374d extends AbstractC2461a {
    public static final Parcelable.Creator<C10374d> CREATOR = new C10400m0();

    /* renamed from: j */
    private final C10401n f27122j;

    /* renamed from: k */
    private final C10416t0 f27123k;

    /* renamed from: l */
    private final C10430z f27124l;

    public C10374d(C10401n c10401n, C10416t0 c10416t0, C10430z c10430z) {
        this.f27122j = c10401n;
        this.f27124l = c10430z;
        this.f27123k = c10416t0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10374d)) {
            return false;
        }
        C10374d c10374d = (C10374d) obj;
        if (!C2190n.m34004b(this.f27122j, c10374d.f27122j) || !C2190n.m34004b(this.f27123k, c10374d.f27123k) || !C2190n.m34004b(this.f27124l, c10374d.f27124l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2190n.m34003c(this.f27122j, this.f27123k, this.f27124l);
    }

    /* renamed from: r */
    public C10401n m11650r() {
        return this.f27122j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33170n(parcel, 2, m11650r(), i, false);
        C2464c.m33170n(parcel, 3, this.f27123k, i, false);
        C2464c.m33170n(parcel, 4, m11649z(), i, false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public C10430z m11649z() {
        return this.f27124l;
    }
}
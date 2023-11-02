package p029b9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p029b9.InterfaceC2177j;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p441y8.C13930a;

/* renamed from: b9.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2202q0 extends AbstractC2461a {
    public static final Parcelable.Creator<C2202q0> CREATOR = new C2205r0();

    /* renamed from: j */
    final int f6197j;

    /* renamed from: k */
    final IBinder f6198k;

    /* renamed from: l */
    private final C13930a f6199l;

    /* renamed from: m */
    private final boolean f6200m;

    /* renamed from: n */
    private final boolean f6201n;

    public C2202q0(int i, IBinder iBinder, C13930a c13930a, boolean z, boolean z2) {
        this.f6197j = i;
        this.f6198k = iBinder;
        this.f6199l = c13930a;
        this.f6200m = z;
        this.f6201n = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2202q0)) {
            return false;
        }
        C2202q0 c2202q0 = (C2202q0) obj;
        if (!this.f6199l.equals(c2202q0.f6199l) || !C2190n.m34004b(m33973z(), c2202q0.m33973z())) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final C13930a m33974r() {
        return this.f6199l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f6197j);
        C2464c.m33175i(parcel, 2, this.f6198k, false);
        C2464c.m33170n(parcel, 3, this.f6199l, i, false);
        C2464c.m33181c(parcel, 4, this.f6200m);
        C2464c.m33181c(parcel, 5, this.f6201n);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public final InterfaceC2177j m33973z() {
        IBinder iBinder = this.f6198k;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC2177j.AbstractBinderC2178a.m34026c(iBinder);
    }
}
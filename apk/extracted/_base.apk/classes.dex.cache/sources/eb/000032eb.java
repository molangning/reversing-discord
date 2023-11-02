package p101fa;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2202q0;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p441y8.C13930a;

/* renamed from: fa.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6363l extends AbstractC2461a {
    public static final Parcelable.Creator<C6363l> CREATOR = new C6364m();

    /* renamed from: j */
    final int f18007j;

    /* renamed from: k */
    private final C13930a f18008k;

    /* renamed from: l */
    private final C2202q0 f18009l;

    public C6363l(int i, C13930a c13930a, C2202q0 c2202q0) {
        this.f18007j = i;
        this.f18008k = c13930a;
        this.f18009l = c2202q0;
    }

    /* renamed from: r */
    public final C13930a m22858r() {
        return this.f18008k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f18007j);
        C2464c.m33170n(parcel, 2, this.f18008k, i, false);
        C2464c.m33170n(parcel, 3, this.f18009l, i, false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public final C2202q0 m22857z() {
        return this.f18009l;
    }
}
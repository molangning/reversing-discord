package p101fa;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2196o0;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: fa.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6361j extends AbstractC2461a {
    public static final Parcelable.Creator<C6361j> CREATOR = new C6362k();

    /* renamed from: j */
    final int f18005j;

    /* renamed from: k */
    final C2196o0 f18006k;

    public C6361j(int i, C2196o0 c2196o0) {
        this.f18005j = i;
        this.f18006k = c2196o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f18005j);
        C2464c.m33170n(parcel, 2, this.f18006k, i, false);
        C2464c.m33182b(parcel, m33183a);
    }
}
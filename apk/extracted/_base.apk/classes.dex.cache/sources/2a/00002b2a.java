package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p063da.C5793f;
import p063da.InterfaceC5805r;

/* renamed from: com.google.android.gms.nearby.messages.internal.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4675b0 extends AbstractC2461a {
    public static final Parcelable.Creator<C4675b0> CREATOR = new C4677c0();

    /* renamed from: j */
    final int f12858j;

    /* renamed from: k */
    public final C5793f f12859k;

    /* renamed from: l */
    public final InterfaceC5805r f12860l;
    @Deprecated

    /* renamed from: m */
    public final String f12861m;
    @Deprecated

    /* renamed from: n */
    public final String f12862n;
    @Deprecated

    /* renamed from: o */
    public final boolean f12863o;
    @Deprecated

    /* renamed from: p */
    public final ClientAppContext f12864p;

    public C4675b0(int i, C5793f c5793f, IBinder iBinder, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        InterfaceC5805r c4691j0;
        this.f12858j = i;
        this.f12859k = c5793f;
        if (iBinder == null) {
            c4691j0 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            if (queryLocalInterface instanceof InterfaceC5805r) {
                c4691j0 = (InterfaceC5805r) queryLocalInterface;
            } else {
                c4691j0 = new C4691j0(iBinder);
            }
        }
        this.f12860l = c4691j0;
        this.f12861m = str;
        this.f12862n = str2;
        this.f12863o = z;
        this.f12864p = ClientAppContext.m28047r(clientAppContext, str2, str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f12858j);
        C2464c.m33170n(parcel, 2, this.f12859k, i, false);
        C2464c.m33175i(parcel, 3, this.f12860l.asBinder(), false);
        C2464c.m33168p(parcel, 4, this.f12861m, false);
        C2464c.m33168p(parcel, 5, this.f12862n, false);
        C2464c.m33181c(parcel, 6, this.f12863o);
        C2464c.m33170n(parcel, 7, this.f12864p, i, false);
        C2464c.m33182b(parcel, m33183a);
    }
}
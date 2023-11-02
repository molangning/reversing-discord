package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p063da.InterfaceC5805r;
import p063da.InterfaceC5809v;

/* renamed from: com.google.android.gms.nearby.messages.internal.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4711z extends AbstractC2461a {
    public static final Parcelable.Creator<C4711z> CREATOR = new C4673a0();

    /* renamed from: j */
    final int f12922j;

    /* renamed from: k */
    public final InterfaceC5805r f12923k;

    /* renamed from: l */
    public final InterfaceC5809v f12924l;

    /* renamed from: m */
    public boolean f12925m;
    @Deprecated

    /* renamed from: n */
    public String f12926n;
    @Deprecated

    /* renamed from: o */
    public final ClientAppContext f12927o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4711z(int i, IBinder iBinder, IBinder iBinder2, boolean z, String str, ClientAppContext clientAppContext) {
        InterfaceC5805r c4691j0;
        InterfaceC5809v c4697m0;
        this.f12922j = i;
        if (iBinder == null) {
            c4691j0 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            c4691j0 = queryLocalInterface instanceof InterfaceC5805r ? (InterfaceC5805r) queryLocalInterface : new C4691j0(iBinder);
        }
        this.f12923k = c4691j0;
        if (iBinder2 == null) {
            c4697m0 = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
            c4697m0 = queryLocalInterface2 instanceof InterfaceC5809v ? (InterfaceC5809v) queryLocalInterface2 : new C4697m0(iBinder2);
        }
        this.f12924l = c4697m0;
        this.f12925m = z;
        this.f12926n = str;
        this.f12927o = ClientAppContext.m28047r(clientAppContext, null, str, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f12922j);
        C2464c.m33175i(parcel, 2, this.f12923k.asBinder(), false);
        C2464c.m33175i(parcel, 3, this.f12924l.asBinder(), false);
        C2464c.m33181c(parcel, 4, this.f12925m);
        C2464c.m33168p(parcel, 5, this.f12926n, false);
        C2464c.m33170n(parcel, 6, this.f12927o, i, false);
        C2464c.m33182b(parcel, m33183a);
    }

    public C4711z(IBinder iBinder, IBinder iBinder2) {
        this(1, iBinder, iBinder2, false, null, null);
    }
}

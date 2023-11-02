package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p063da.C5799l;
import p063da.InterfaceC5803p;
import p063da.InterfaceC5805r;

/* renamed from: com.google.android.gms.nearby.messages.internal.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4679d0 extends AbstractC2461a {
    public static final Parcelable.Creator<C4679d0> CREATOR = new C5799l();

    /* renamed from: j */
    final int f12867j;

    /* renamed from: k */
    public final InterfaceC5803p f12868k;

    /* renamed from: l */
    public final InterfaceC5805r f12869l;

    /* renamed from: m */
    public final PendingIntent f12870m;
    @Deprecated

    /* renamed from: n */
    public final int f12871n;
    @Deprecated

    /* renamed from: o */
    public final String f12872o;
    @Deprecated

    /* renamed from: p */
    public final String f12873p;
    @Deprecated

    /* renamed from: q */
    public final boolean f12874q;
    @Deprecated

    /* renamed from: r */
    public final ClientAppContext f12875r;

    public C4679d0(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, int i2, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        InterfaceC5803p c4689i0;
        this.f12867j = i;
        InterfaceC5805r interfaceC5805r = null;
        if (iBinder == null) {
            c4689i0 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            c4689i0 = queryLocalInterface instanceof InterfaceC5803p ? (InterfaceC5803p) queryLocalInterface : new C4689i0(iBinder);
        }
        this.f12868k = c4689i0;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            interfaceC5805r = queryLocalInterface2 instanceof InterfaceC5805r ? (InterfaceC5805r) queryLocalInterface2 : new C4691j0(iBinder2);
        }
        this.f12869l = interfaceC5805r;
        this.f12870m = pendingIntent;
        this.f12871n = i2;
        this.f12872o = str;
        this.f12873p = str2;
        this.f12874q = z;
        this.f12875r = ClientAppContext.m28047r(clientAppContext, str2, str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f12867j);
        InterfaceC5803p interfaceC5803p = this.f12868k;
        if (interfaceC5803p == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC5803p.asBinder();
        }
        C2464c.m33175i(parcel, 2, asBinder, false);
        C2464c.m33175i(parcel, 3, this.f12869l.asBinder(), false);
        C2464c.m33170n(parcel, 4, this.f12870m, i, false);
        C2464c.m33174j(parcel, 5, this.f12871n);
        C2464c.m33168p(parcel, 6, this.f12872o, false);
        C2464c.m33168p(parcel, 7, this.f12873p, false);
        C2464c.m33181c(parcel, 8, this.f12874q);
        C2464c.m33170n(parcel, 9, this.f12875r, i, false);
        C2464c.m33182b(parcel, m33183a);
    }

    public C4679d0(IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent) {
        this(1, iBinder, iBinder2, pendingIntent, 0, null, null, false, null);
    }
}

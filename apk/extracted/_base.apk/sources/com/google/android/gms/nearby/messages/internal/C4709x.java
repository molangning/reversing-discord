package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import ca.C2477i;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p063da.C5793f;
import p063da.InterfaceC5805r;
import p063da.InterfaceC5807t;

/* renamed from: com.google.android.gms.nearby.messages.internal.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4709x extends AbstractC2461a {
    public static final Parcelable.Creator<C4709x> CREATOR = new C4710y();

    /* renamed from: j */
    final int f12911j;

    /* renamed from: k */
    public final C5793f f12912k;

    /* renamed from: l */
    public final C2477i f12913l;

    /* renamed from: m */
    public final InterfaceC5805r f12914m;
    @Deprecated

    /* renamed from: n */
    public final String f12915n;
    @Deprecated

    /* renamed from: o */
    public final String f12916o;
    @Deprecated

    /* renamed from: p */
    public final boolean f12917p;

    /* renamed from: q */
    public final InterfaceC5807t f12918q;
    @Deprecated

    /* renamed from: r */
    public final boolean f12919r;
    @Deprecated

    /* renamed from: s */
    public final ClientAppContext f12920s;

    /* renamed from: t */
    public final int f12921t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4709x(int i, C5793f c5793f, C2477i c2477i, IBinder iBinder, String str, String str2, boolean z, IBinder iBinder2, boolean z2, ClientAppContext clientAppContext, int i2) {
        InterfaceC5805r c4691j0;
        this.f12911j = i;
        this.f12912k = c5793f;
        this.f12913l = c2477i;
        InterfaceC5807t interfaceC5807t = null;
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
        this.f12914m = c4691j0;
        this.f12915n = str;
        this.f12916o = str2;
        this.f12917p = z;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
            if (queryLocalInterface2 instanceof InterfaceC5807t) {
                interfaceC5807t = (InterfaceC5807t) queryLocalInterface2;
            } else {
                interfaceC5807t = new C4695l0(iBinder2);
            }
        }
        this.f12918q = interfaceC5807t;
        this.f12919r = z2;
        this.f12920s = ClientAppContext.m28047r(clientAppContext, str2, str, z2);
        this.f12921t = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f12911j);
        C2464c.m33170n(parcel, 2, this.f12912k, i, false);
        C2464c.m33170n(parcel, 3, this.f12913l, i, false);
        C2464c.m33175i(parcel, 4, this.f12914m.asBinder(), false);
        C2464c.m33168p(parcel, 5, this.f12915n, false);
        C2464c.m33168p(parcel, 6, this.f12916o, false);
        C2464c.m33181c(parcel, 7, this.f12917p);
        InterfaceC5807t interfaceC5807t = this.f12918q;
        if (interfaceC5807t == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC5807t.asBinder();
        }
        C2464c.m33175i(parcel, 8, asBinder, false);
        C2464c.m33181c(parcel, 9, this.f12919r);
        C2464c.m33170n(parcel, 10, this.f12920s, i, false);
        C2464c.m33174j(parcel, 11, this.f12921t);
        C2464c.m33182b(parcel, m33183a);
    }
}

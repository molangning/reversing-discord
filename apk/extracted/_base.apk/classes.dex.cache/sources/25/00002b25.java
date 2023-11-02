package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import ca.C2467a;
import ca.C2477i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p063da.C5798k;
import p063da.InterfaceC5790c;
import p063da.InterfaceC5803p;
import p063da.InterfaceC5805r;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SubscribeRequest extends AbstractC2461a implements ReflectedParcelable {
    public static final Parcelable.Creator<SubscribeRequest> CREATOR = new C5798k();

    /* renamed from: j */
    final int f12829j;

    /* renamed from: k */
    public final InterfaceC5803p f12830k;

    /* renamed from: l */
    public final C2477i f12831l;

    /* renamed from: m */
    public final InterfaceC5805r f12832m;

    /* renamed from: n */
    public final C2467a f12833n;

    /* renamed from: o */
    public final PendingIntent f12834o;
    @Deprecated

    /* renamed from: p */
    public final int f12835p;
    @Deprecated

    /* renamed from: q */
    public final String f12836q;
    @Deprecated

    /* renamed from: r */
    public final String f12837r;

    /* renamed from: s */
    public final byte[] f12838s;
    @Deprecated

    /* renamed from: t */
    public final boolean f12839t;

    /* renamed from: u */
    public final InterfaceC5790c f12840u;
    @Deprecated

    /* renamed from: v */
    public final boolean f12841v;
    @Deprecated

    /* renamed from: w */
    public final ClientAppContext f12842w;

    /* renamed from: x */
    public final boolean f12843x;

    /* renamed from: y */
    public final int f12844y;

    /* renamed from: z */
    public final int f12845z;

    public SubscribeRequest(int i, IBinder iBinder, C2477i c2477i, IBinder iBinder2, C2467a c2467a, PendingIntent pendingIntent, int i2, String str, String str2, byte[] bArr, boolean z, IBinder iBinder3, boolean z2, ClientAppContext clientAppContext, boolean z3, int i3, int i4) {
        InterfaceC5803p c4689i0;
        InterfaceC5805r c4691j0;
        this.f12829j = i;
        InterfaceC5790c interfaceC5790c = null;
        if (iBinder == null) {
            c4689i0 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            c4689i0 = queryLocalInterface instanceof InterfaceC5803p ? (InterfaceC5803p) queryLocalInterface : new C4689i0(iBinder);
        }
        this.f12830k = c4689i0;
        this.f12831l = c2477i;
        if (iBinder2 == null) {
            c4691j0 = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            c4691j0 = queryLocalInterface2 instanceof InterfaceC5805r ? (InterfaceC5805r) queryLocalInterface2 : new C4691j0(iBinder2);
        }
        this.f12832m = c4691j0;
        this.f12833n = c2467a;
        this.f12834o = pendingIntent;
        this.f12835p = i2;
        this.f12836q = str;
        this.f12837r = str2;
        this.f12838s = bArr;
        this.f12839t = z;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
            interfaceC5790c = queryLocalInterface3 instanceof InterfaceC5790c ? (InterfaceC5790c) queryLocalInterface3 : new C4699n0(iBinder3);
        }
        this.f12840u = interfaceC5790c;
        this.f12841v = z2;
        this.f12842w = ClientAppContext.m28047r(clientAppContext, str2, str, z2);
        this.f12843x = z3;
        this.f12844y = i3;
        this.f12845z = i4;
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.f12830k);
        String valueOf2 = String.valueOf(this.f12831l);
        String valueOf3 = String.valueOf(this.f12832m);
        String valueOf4 = String.valueOf(this.f12833n);
        String valueOf5 = String.valueOf(this.f12834o);
        byte[] bArr = this.f12838s;
        if (bArr == null) {
            str = null;
        } else {
            str = "<" + bArr.length + " bytes>";
        }
        return "SubscribeRequest{messageListener=" + valueOf + ", strategy=" + valueOf2 + ", callback=" + valueOf3 + ", filter=" + valueOf4 + ", pendingIntent=" + valueOf5 + ", hint=" + str + ", subscribeCallback=" + String.valueOf(this.f12840u) + ", useRealClientApiKey=" + this.f12841v + ", clientAppContext=" + String.valueOf(this.f12842w) + ", isDiscardPendingIntent=" + this.f12843x + ", zeroPartyPackageName=" + this.f12836q + ", realClientPackageName=" + this.f12837r + ", isIgnoreNearbyPermission=" + this.f12839t + ", callingContext=" + this.f12845z + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f12829j);
        InterfaceC5803p interfaceC5803p = this.f12830k;
        IBinder iBinder = null;
        if (interfaceC5803p == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC5803p.asBinder();
        }
        C2464c.m33175i(parcel, 2, asBinder, false);
        C2464c.m33170n(parcel, 3, this.f12831l, i, false);
        InterfaceC5805r interfaceC5805r = this.f12832m;
        if (interfaceC5805r == null) {
            asBinder2 = null;
        } else {
            asBinder2 = interfaceC5805r.asBinder();
        }
        C2464c.m33175i(parcel, 4, asBinder2, false);
        C2464c.m33170n(parcel, 5, this.f12833n, i, false);
        C2464c.m33170n(parcel, 6, this.f12834o, i, false);
        C2464c.m33174j(parcel, 7, this.f12835p);
        C2464c.m33168p(parcel, 8, this.f12836q, false);
        C2464c.m33168p(parcel, 9, this.f12837r, false);
        C2464c.m33178f(parcel, 10, this.f12838s, false);
        C2464c.m33181c(parcel, 11, this.f12839t);
        InterfaceC5790c interfaceC5790c = this.f12840u;
        if (interfaceC5790c != null) {
            iBinder = interfaceC5790c.asBinder();
        }
        C2464c.m33175i(parcel, 12, iBinder, false);
        C2464c.m33181c(parcel, 13, this.f12841v);
        C2464c.m33170n(parcel, 14, this.f12842w, i, false);
        C2464c.m33181c(parcel, 15, this.f12843x);
        C2464c.m33174j(parcel, 16, this.f12844y);
        C2464c.m33174j(parcel, 17, this.f12845z);
        C2464c.m33182b(parcel, m33183a);
    }

    public SubscribeRequest(IBinder iBinder, C2477i c2477i, IBinder iBinder2, C2467a c2467a, PendingIntent pendingIntent, byte[] bArr, IBinder iBinder3, boolean z, int i, int i2) {
        this(3, iBinder, c2477i, iBinder2, c2467a, pendingIntent, 0, null, null, null, false, iBinder3, false, null, false, 0, i2);
    }
}
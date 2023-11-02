package p401w9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: w9.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13451l extends C13454o implements InterfaceC13453n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C13451l(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // p401w9.InterfaceC13453n
    /* renamed from: B */
    public final Bundle mo2458B(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel m2446b = m2446b();
        m2446b.writeInt(9);
        m2446b.writeString(str);
        m2446b.writeString(str2);
        m2446b.writeString(str3);
        C13456q.m2443b(m2446b, bundle);
        Parcel m2445c = m2445c(11, m2446b);
        Bundle bundle2 = (Bundle) C13456q.m2444a(m2445c, Bundle.CREATOR);
        m2445c.recycle();
        return bundle2;
    }

    @Override // p401w9.InterfaceC13453n
    /* renamed from: I */
    public final Bundle mo2457I(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel m2446b = m2446b();
        m2446b.writeInt(i);
        m2446b.writeString(str);
        m2446b.writeString(str2);
        C13456q.m2443b(m2446b, bundle);
        C13456q.m2443b(m2446b, bundle2);
        Parcel m2445c = m2445c(901, m2446b);
        Bundle bundle3 = (Bundle) C13456q.m2444a(m2445c, Bundle.CREATOR);
        m2445c.recycle();
        return bundle3;
    }

    @Override // p401w9.InterfaceC13453n
    /* renamed from: J */
    public final Bundle mo2456J(int i, String str, String str2, Bundle bundle) {
        Parcel m2446b = m2446b();
        m2446b.writeInt(9);
        m2446b.writeString(str);
        m2446b.writeString(str2);
        C13456q.m2443b(m2446b, bundle);
        Parcel m2445c = m2445c(12, m2446b);
        Bundle bundle2 = (Bundle) C13456q.m2444a(m2445c, Bundle.CREATOR);
        m2445c.recycle();
        return bundle2;
    }

    @Override // p401w9.InterfaceC13453n
    /* renamed from: K */
    public final Bundle mo2455K(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel m2446b = m2446b();
        m2446b.writeInt(6);
        m2446b.writeString(str);
        m2446b.writeString(str2);
        m2446b.writeString(str3);
        C13456q.m2443b(m2446b, bundle);
        Parcel m2445c = m2445c(9, m2446b);
        Bundle bundle2 = (Bundle) C13456q.m2444a(m2445c, Bundle.CREATOR);
        m2445c.recycle();
        return bundle2;
    }

    @Override // p401w9.InterfaceC13453n
    /* renamed from: N */
    public final Bundle mo2454N(int i, String str, String str2, String str3, String str4) {
        Parcel m2446b = m2446b();
        m2446b.writeInt(3);
        m2446b.writeString(str);
        m2446b.writeString(str2);
        m2446b.writeString(str3);
        m2446b.writeString(null);
        Parcel m2445c = m2445c(3, m2446b);
        Bundle bundle = (Bundle) C13456q.m2444a(m2445c, Bundle.CREATOR);
        m2445c.recycle();
        return bundle;
    }

    @Override // p401w9.InterfaceC13453n
    /* renamed from: X */
    public final int mo2453X(int i, String str, String str2, Bundle bundle) {
        Parcel m2446b = m2446b();
        m2446b.writeInt(i);
        m2446b.writeString(str);
        m2446b.writeString(str2);
        C13456q.m2443b(m2446b, bundle);
        Parcel m2445c = m2445c(10, m2446b);
        int readInt = m2445c.readInt();
        m2445c.recycle();
        return readInt;
    }

    @Override // p401w9.InterfaceC13453n
    /* renamed from: c0 */
    public final Bundle mo2452c0(int i, String str, String str2, Bundle bundle) {
        Parcel m2446b = m2446b();
        m2446b.writeInt(9);
        m2446b.writeString(str);
        m2446b.writeString(str2);
        C13456q.m2443b(m2446b, bundle);
        Parcel m2445c = m2445c(902, m2446b);
        Bundle bundle2 = (Bundle) C13456q.m2444a(m2445c, Bundle.CREATOR);
        m2445c.recycle();
        return bundle2;
    }

    @Override // p401w9.InterfaceC13453n
    /* renamed from: f */
    public final int mo2451f(int i, String str, String str2) {
        Parcel m2446b = m2446b();
        m2446b.writeInt(i);
        m2446b.writeString(str);
        m2446b.writeString(str2);
        Parcel m2445c = m2445c(1, m2446b);
        int readInt = m2445c.readInt();
        m2445c.recycle();
        return readInt;
    }

    @Override // p401w9.InterfaceC13453n
    /* renamed from: h */
    public final int mo2450h(int i, String str, String str2) {
        Parcel m2446b = m2446b();
        m2446b.writeInt(3);
        m2446b.writeString(str);
        m2446b.writeString(str2);
        Parcel m2445c = m2445c(5, m2446b);
        int readInt = m2445c.readInt();
        m2445c.recycle();
        return readInt;
    }

    @Override // p401w9.InterfaceC13453n
    /* renamed from: p */
    public final Bundle mo2449p(int i, String str, String str2, String str3) {
        Parcel m2446b = m2446b();
        m2446b.writeInt(3);
        m2446b.writeString(str);
        m2446b.writeString(str2);
        m2446b.writeString(str3);
        Parcel m2445c = m2445c(4, m2446b);
        Bundle bundle = (Bundle) C13456q.m2444a(m2445c, Bundle.CREATOR);
        m2445c.recycle();
        return bundle;
    }

    @Override // p401w9.InterfaceC13453n
    /* renamed from: u */
    public final Bundle mo2448u(int i, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel m2446b = m2446b();
        m2446b.writeInt(i);
        m2446b.writeString(str);
        m2446b.writeString(str2);
        m2446b.writeString(str3);
        m2446b.writeString(null);
        C13456q.m2443b(m2446b, bundle);
        Parcel m2445c = m2445c(8, m2446b);
        Bundle bundle2 = (Bundle) C13456q.m2444a(m2445c, Bundle.CREATOR);
        m2445c.recycle();
        return bundle2;
    }

    @Override // p401w9.InterfaceC13453n
    /* renamed from: v */
    public final Bundle mo2447v(int i, String str, String str2, Bundle bundle) {
        Parcel m2446b = m2446b();
        m2446b.writeInt(3);
        m2446b.writeString(str);
        m2446b.writeString(str2);
        C13456q.m2443b(m2446b, bundle);
        Parcel m2445c = m2445c(2, m2446b);
        Bundle bundle2 = (Bundle) C13456q.m2444a(m2445c, Bundle.CREATOR);
        m2445c.recycle();
        return bundle2;
    }
}

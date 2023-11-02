package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p441y8.C13930a;
import p461z8.C14120d;
import p461z8.InterfaceC14132k;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class Status extends AbstractC2461a implements InterfaceC14132k, ReflectedParcelable {

    /* renamed from: j */
    final int f12655j;

    /* renamed from: k */
    private final int f12656k;

    /* renamed from: l */
    private final String f12657l;

    /* renamed from: m */
    private final PendingIntent f12658m;

    /* renamed from: n */
    private final C13930a f12659n;

    /* renamed from: o */
    public static final Status f12648o = new Status(0);

    /* renamed from: p */
    public static final Status f12649p = new Status(14);

    /* renamed from: q */
    public static final Status f12650q = new Status(8);

    /* renamed from: r */
    public static final Status f12651r = new Status(15);

    /* renamed from: s */
    public static final Status f12652s = new Status(16);

    /* renamed from: u */
    public static final Status f12654u = new Status(17);

    /* renamed from: t */
    public static final Status f12653t = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new C4607b();

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent, C13930a c13930a) {
        this.f12655j = i;
        this.f12656k = i2;
        this.f12657l = str;
        this.f12658m = pendingIntent;
        this.f12659n = c13930a;
    }

    /* renamed from: A */
    public String m28242A() {
        return this.f12657l;
    }

    /* renamed from: G */
    public boolean m28241G() {
        return this.f12658m != null;
    }

    /* renamed from: H */
    public boolean m28240H() {
        return this.f12656k <= 0;
    }

    /* renamed from: J */
    public void m28239J(Activity activity, int i) {
        if (!m28241G()) {
            return;
        }
        PendingIntent pendingIntent = this.f12658m;
        C2198p.m33985j(pendingIntent);
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
    }

    /* renamed from: M */
    public final String m28238M() {
        String str = this.f12657l;
        return str != null ? str : C14120d.m632a(this.f12656k);
    }

    @Override // p461z8.InterfaceC14132k
    /* renamed from: b */
    public Status mo596b() {
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f12655j != status.f12655j || this.f12656k != status.f12656k || !C2190n.m34004b(this.f12657l, status.f12657l) || !C2190n.m34004b(this.f12658m, status.f12658m) || !C2190n.m34004b(this.f12659n, status.f12659n)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2190n.m34003c(Integer.valueOf(this.f12655j), Integer.valueOf(this.f12656k), this.f12657l, this.f12658m, this.f12659n);
    }

    /* renamed from: r */
    public C13930a m28237r() {
        return this.f12659n;
    }

    public String toString() {
        C2190n.C2191a m34002d = C2190n.m34002d(this);
        m34002d.m34001a("statusCode", m28238M());
        m34002d.m34001a("resolution", this.f12658m);
        return m34002d.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, m28236z());
        C2464c.m33168p(parcel, 2, m28242A(), false);
        C2464c.m33170n(parcel, 3, this.f12658m, i, false);
        C2464c.m33170n(parcel, 4, m28237r(), i, false);
        C2464c.m33174j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f12655j);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public int m28236z() {
        return this.f12656k;
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this(i, i2, str, pendingIntent, null);
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public Status(C13930a c13930a, String str) {
        this(c13930a, str, 17);
    }

    @Deprecated
    public Status(C13930a c13930a, String str, int i) {
        this(1, i, str, c13930a.m1148A(), c13930a);
    }
}
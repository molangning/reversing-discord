package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

@Deprecated
/* renamed from: com.google.android.gms.auth.api.credentials.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4591a extends AbstractC2461a {
    public static final Parcelable.Creator<C4591a> CREATOR = new C4596e();

    /* renamed from: j */
    final int f12572j;

    /* renamed from: k */
    private final boolean f12573k;

    /* renamed from: l */
    private final String[] f12574l;

    /* renamed from: m */
    private final CredentialPickerConfig f12575m;

    /* renamed from: n */
    private final CredentialPickerConfig f12576n;

    /* renamed from: o */
    private final boolean f12577o;

    /* renamed from: p */
    private final String f12578p;

    /* renamed from: q */
    private final String f12579q;

    /* renamed from: r */
    private final boolean f12580r;

    /* renamed from: com.google.android.gms.auth.api.credentials.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4592a {

        /* renamed from: a */
        private boolean f12581a;

        /* renamed from: b */
        private String[] f12582b;

        /* renamed from: c */
        private CredentialPickerConfig f12583c;

        /* renamed from: d */
        private CredentialPickerConfig f12584d;

        /* renamed from: e */
        private boolean f12585e = false;

        /* renamed from: f */
        private String f12586f = null;

        /* renamed from: g */
        private String f12587g;

        /* renamed from: a */
        public C4591a m28304a() {
            if (this.f12582b == null) {
                this.f12582b = new String[0];
            }
            if (!this.f12581a && this.f12582b.length == 0) {
                throw new IllegalStateException("At least one authentication method must be specified");
            }
            return new C4591a(4, this.f12581a, this.f12582b, this.f12583c, this.f12584d, this.f12585e, this.f12586f, this.f12587g, false);
        }

        /* renamed from: b */
        public C4592a m28303b(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.f12582b = strArr;
            return this;
        }

        /* renamed from: c */
        public C4592a m28302c(boolean z) {
            this.f12581a = z;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4591a(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.f12572j = i;
        this.f12573k = z;
        this.f12574l = (String[]) C2198p.m33985j(strArr);
        this.f12575m = credentialPickerConfig == null ? new CredentialPickerConfig.C4590a().m28317a() : credentialPickerConfig;
        this.f12576n = credentialPickerConfig2 == null ? new CredentialPickerConfig.C4590a().m28317a() : credentialPickerConfig2;
        if (i < 3) {
            this.f12577o = true;
            this.f12578p = null;
            this.f12579q = null;
        } else {
            this.f12577o = z2;
            this.f12578p = str;
            this.f12579q = str2;
        }
        this.f12580r = z3;
    }

    /* renamed from: A */
    public CredentialPickerConfig m28311A() {
        return this.f12575m;
    }

    /* renamed from: G */
    public String m28310G() {
        return this.f12579q;
    }

    /* renamed from: H */
    public String m28309H() {
        return this.f12578p;
    }

    /* renamed from: J */
    public boolean m28308J() {
        return this.f12577o;
    }

    /* renamed from: M */
    public boolean m28307M() {
        return this.f12573k;
    }

    /* renamed from: r */
    public String[] m28306r() {
        return this.f12574l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33181c(parcel, 1, m28307M());
        C2464c.m33167q(parcel, 2, m28306r(), false);
        C2464c.m33170n(parcel, 3, m28311A(), i, false);
        C2464c.m33170n(parcel, 4, m28305z(), i, false);
        C2464c.m33181c(parcel, 5, m28308J());
        C2464c.m33168p(parcel, 6, m28309H(), false);
        C2464c.m33168p(parcel, 7, m28310G(), false);
        C2464c.m33181c(parcel, 8, this.f12580r);
        C2464c.m33174j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f12572j);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public CredentialPickerConfig m28305z() {
        return this.f12576n;
    }
}

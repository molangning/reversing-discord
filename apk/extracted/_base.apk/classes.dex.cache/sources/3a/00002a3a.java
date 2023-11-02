package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

@Deprecated
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class CredentialPickerConfig extends AbstractC2461a implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new C4595d();

    /* renamed from: j */
    final int f12563j;

    /* renamed from: k */
    private final boolean f12564k;

    /* renamed from: l */
    private final boolean f12565l;

    /* renamed from: m */
    private final int f12566m;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4590a {

        /* renamed from: a */
        private boolean f12567a = false;

        /* renamed from: b */
        private boolean f12568b = true;

        /* renamed from: c */
        private int f12569c = 1;

        /* renamed from: a */
        public CredentialPickerConfig m28317a() {
            return new CredentialPickerConfig(2, this.f12567a, this.f12568b, false, this.f12569c);
        }
    }

    public CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.f12563j = i;
        this.f12564k = z;
        this.f12565l = z2;
        if (i < 2) {
            this.f12566m = true == z3 ? 3 : 1;
        } else {
            this.f12566m = i2;
        }
    }

    /* renamed from: A */
    public boolean m28320A() {
        return this.f12565l;
    }

    @Deprecated
    /* renamed from: r */
    public boolean m28319r() {
        return this.f12566m == 3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33181c(parcel, 1, m28318z());
        C2464c.m33181c(parcel, 2, m28320A());
        C2464c.m33181c(parcel, 3, m28319r());
        C2464c.m33174j(parcel, 4, this.f12566m);
        C2464c.m33174j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f12563j);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public boolean m28318z() {
        return this.f12564k;
    }
}
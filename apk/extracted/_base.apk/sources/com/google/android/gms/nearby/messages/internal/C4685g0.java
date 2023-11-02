package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: com.google.android.gms.nearby.messages.internal.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4685g0 extends AbstractC2461a {
    public static final Parcelable.Creator<C4685g0> CREATOR = new C4687h0();

    /* renamed from: j */
    public final int f12881j;
    @Deprecated

    /* renamed from: k */
    public final ClientAppContext f12882k;

    /* renamed from: l */
    public final int f12883l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4685g0(int i, ClientAppContext clientAppContext, int i2) {
        this.f12881j = i;
        this.f12882k = clientAppContext;
        this.f12883l = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f12881j);
        C2464c.m33170n(parcel, 2, this.f12882k, i, false);
        C2464c.m33174j(parcel, 3, this.f12883l);
        C2464c.m33182b(parcel, m33183a);
    }
}

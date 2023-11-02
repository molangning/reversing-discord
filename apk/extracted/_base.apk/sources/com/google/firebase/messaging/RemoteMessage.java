package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.C5071c;
import java.util.Map;
import p042c9.AbstractC2461a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class RemoteMessage extends AbstractC2461a {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C5099m0();

    /* renamed from: j */
    Bundle f14287j;

    /* renamed from: k */
    private Map<String, String> f14288k;

    public RemoteMessage(Bundle bundle) {
        this.f14287j = bundle;
    }

    /* renamed from: r */
    public Map<String, String> m26351r() {
        if (this.f14288k == null) {
            this.f14288k = C5071c.C5072a.m26318a(this.f14287j);
        }
        return this.f14288k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5099m0.m26203c(this, parcel, i);
    }
}

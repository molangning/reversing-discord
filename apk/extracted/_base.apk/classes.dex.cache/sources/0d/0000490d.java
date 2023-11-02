package p283p9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: p9.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11485t extends AbstractC2461a {
    public static final Parcelable.Creator<C11485t> CREATOR = new C11486u();

    /* renamed from: j */
    private final Credential f29814j;

    public C11485t(Credential credential) {
        this.f29814j = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33170n(parcel, 1, this.f29814j, i, false);
        C2464c.m33182b(parcel, m33183a);
    }
}
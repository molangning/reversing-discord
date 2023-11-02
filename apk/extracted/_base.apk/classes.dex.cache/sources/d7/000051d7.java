package p420x8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: x8.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13735a extends AbstractC2461a {
    public static final Parcelable.Creator<C13735a> CREATOR = new C13741d();

    /* renamed from: j */
    Intent f35451j;

    public C13735a(Intent intent) {
        this.f35451j = intent;
    }

    /* renamed from: r */
    public Intent m1615r() {
        return this.f35451j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33170n(parcel, 1, this.f35451j, i, false);
        C2464c.m33182b(parcel, m33183a);
    }
}
package p029b9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p441y8.C13932c;

/* renamed from: b9.e1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2164e1 extends AbstractC2461a {
    public static final Parcelable.Creator<C2164e1> CREATOR = new C2167f1();

    /* renamed from: j */
    Bundle f6114j;

    /* renamed from: k */
    C13932c[] f6115k;

    /* renamed from: l */
    int f6116l;

    /* renamed from: m */
    C2162e f6117m;

    public C2164e1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2164e1(Bundle bundle, C13932c[] c13932cArr, int i, C2162e c2162e) {
        this.f6114j = bundle;
        this.f6115k = c13932cArr;
        this.f6116l = i;
        this.f6117m = c2162e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33179e(parcel, 1, this.f6114j, false);
        C2464c.m33165s(parcel, 2, this.f6115k, i, false);
        C2464c.m33174j(parcel, 3, this.f6116l);
        C2464c.m33170n(parcel, 4, this.f6117m, i, false);
        C2464c.m33182b(parcel, m33183a);
    }
}

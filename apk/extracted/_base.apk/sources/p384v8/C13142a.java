package p384v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: v8.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13142a extends AbstractC2461a {
    public static final Parcelable.Creator<C13142a> CREATOR = new C13145d();

    /* renamed from: j */
    final int f34156j;

    /* renamed from: k */
    private int f34157k;

    /* renamed from: l */
    private Bundle f34158l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13142a(int i, int i2, Bundle bundle) {
        this.f34156j = i;
        this.f34157k = i2;
        this.f34158l = bundle;
    }

    /* renamed from: r */
    public int m3106r() {
        return this.f34157k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f34156j);
        C2464c.m33174j(parcel, 2, m3106r());
        C2464c.m33179e(parcel, 3, this.f34158l, false);
        C2464c.m33182b(parcel, m33183a);
    }
}

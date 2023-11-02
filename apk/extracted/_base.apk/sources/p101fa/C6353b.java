package p101fa;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p461z8.InterfaceC14132k;

/* renamed from: fa.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6353b extends AbstractC2461a implements InterfaceC14132k {
    public static final Parcelable.Creator<C6353b> CREATOR = new C6354c();

    /* renamed from: j */
    final int f18000j;

    /* renamed from: k */
    private int f18001k;

    /* renamed from: l */
    private Intent f18002l;

    public C6353b() {
        this(2, 0, null);
    }

    @Override // p461z8.InterfaceC14132k
    /* renamed from: b */
    public final Status mo596b() {
        if (this.f18001k == 0) {
            return Status.f12648o;
        }
        return Status.f12652s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f18000j);
        C2464c.m33174j(parcel, 2, this.f18001k);
        C2464c.m33170n(parcel, 3, this.f18002l, i, false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6353b(int i, int i2, Intent intent) {
        this.f18000j = i;
        this.f18001k = i2;
        this.f18002l = intent;
    }
}

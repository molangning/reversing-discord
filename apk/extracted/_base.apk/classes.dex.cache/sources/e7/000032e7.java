package p101fa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p461z8.InterfaceC14132k;

/* renamed from: fa.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6359h extends AbstractC2461a implements InterfaceC14132k {
    public static final Parcelable.Creator<C6359h> CREATOR = new C6360i();

    /* renamed from: j */
    private final List<String> f18003j;

    /* renamed from: k */
    private final String f18004k;

    public C6359h(List<String> list, String str) {
        this.f18003j = list;
        this.f18004k = str;
    }

    @Override // p461z8.InterfaceC14132k
    /* renamed from: b */
    public final Status mo596b() {
        if (this.f18004k != null) {
            return Status.f12648o;
        }
        return Status.f12652s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33166r(parcel, 1, this.f18003j, false);
        C2464c.m33168p(parcel, 2, this.f18004k, false);
        C2464c.m33182b(parcel, m33183a);
    }
}
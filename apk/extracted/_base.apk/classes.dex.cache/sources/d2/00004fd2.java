package p385v9;

import android.os.Parcel;
import android.os.Parcelable;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: v9.v0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13218v0 extends AbstractC2461a {
    public static final Parcelable.Creator<C13218v0> CREATOR = new C13220w0();

    /* renamed from: m */
    public static final C13218v0 f34268m = new C13218v0(1, "", null);

    /* renamed from: j */
    final int f34269j;

    /* renamed from: k */
    private final String f34270k;

    /* renamed from: l */
    private final String f34271l;

    public C13218v0(int i, String str, String str2) {
        this.f34269j = ((Integer) C2198p.m33985j(Integer.valueOf(i))).intValue();
        this.f34270k = str == null ? "" : str;
        this.f34271l = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13218v0)) {
            return false;
        }
        C13218v0 c13218v0 = (C13218v0) obj;
        if (C2190n.m34004b(this.f34270k, c13218v0.f34270k) && C2190n.m34004b(this.f34271l, c13218v0.f34271l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C2190n.m34003c(this.f34270k, this.f34271l);
    }

    public final String toString() {
        String str = this.f34270k;
        String str2 = this.f34271l;
        return "NearbyDevice{handle=" + str + ", bluetoothAddress=" + str2 + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33168p(parcel, 3, this.f34270k, false);
        C2464c.m33168p(parcel, 6, this.f34271l, false);
        C2464c.m33174j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f34269j);
        C2464c.m33182b(parcel, m33183a);
    }
}
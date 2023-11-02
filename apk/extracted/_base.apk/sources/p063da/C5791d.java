package p063da;

import android.os.Parcel;
import android.os.Parcelable;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: da.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5791d extends AbstractC2461a {
    public static final Parcelable.Creator<C5791d> CREATOR = new C5792e();

    /* renamed from: j */
    final int f16619j;

    /* renamed from: k */
    public final String f16620k;

    /* renamed from: l */
    public final String f16621l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5791d(int i, String str, String str2) {
        this.f16619j = i;
        this.f16620k = str;
        this.f16621l = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5791d) && hashCode() == obj.hashCode()) {
            C5791d c5791d = (C5791d) obj;
            if (C2190n.m34004b(this.f16620k, c5791d.f16620k) && C2190n.m34004b(this.f16621l, c5791d.f16621l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2190n.m34003c(this.f16620k, this.f16621l);
    }

    public final String toString() {
        String str = this.f16620k;
        String str2 = this.f16621l;
        return "namespace=" + str + ", type=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33168p(parcel, 1, this.f16620k, false);
        C2464c.m33168p(parcel, 2, this.f16621l, false);
        C2464c.m33174j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f16619j);
        C2464c.m33182b(parcel, m33183a);
    }
}

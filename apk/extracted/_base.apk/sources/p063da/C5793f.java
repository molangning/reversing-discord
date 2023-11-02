package p063da;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.Message;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: da.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5793f extends AbstractC2461a {
    public static final Parcelable.Creator<C5793f> CREATOR = new C5794g();

    /* renamed from: j */
    final int f16622j;

    /* renamed from: k */
    public final Message f16623k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5793f(int i, Message message) {
        this.f16622j = i;
        this.f16623k = (Message) C2198p.m33985j(message);
    }

    /* renamed from: r */
    public static final C5793f m24504r(Message message) {
        return new C5793f(1, message);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5793f)) {
            return false;
        }
        return C2190n.m34004b(this.f16623k, ((C5793f) obj).f16623k);
    }

    public final int hashCode() {
        return C2190n.m34003c(this.f16623k);
    }

    public final String toString() {
        String message = this.f16623k.toString();
        return "MessageWrapper{message=" + message + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33170n(parcel, 1, this.f16623k, i, false);
        C2464c.m33174j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f16622j);
        C2464c.m33182b(parcel, m33183a);
    }
}

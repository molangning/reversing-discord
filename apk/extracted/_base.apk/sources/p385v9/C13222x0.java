package p385v9;

import android.os.Parcel;
import android.os.Parcelable;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: v9.x0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13222x0 extends AbstractC2461a {
    public static final Parcelable.Creator<C13222x0> CREATOR = new C13224y0();

    /* renamed from: j */
    final int f34274j;

    /* renamed from: k */
    final int f34275k;

    /* renamed from: l */
    final byte[] f34276l;

    /* renamed from: m */
    final boolean f34277m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13222x0(int i, int i2, byte[] bArr, boolean z) {
        this.f34274j = i;
        this.f34275k = i2;
        this.f34276l = bArr;
        this.f34277m = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f34275k);
        C2464c.m33178f(parcel, 2, this.f34276l, false);
        C2464c.m33181c(parcel, 3, this.f34277m);
        C2464c.m33174j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f34274j);
        C2464c.m33182b(parcel, m33183a);
    }
}

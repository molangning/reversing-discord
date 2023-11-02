package p010a9;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: a9.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class RunnableC0112k0 implements Runnable {

    /* renamed from: j */
    final /* synthetic */ LifecycleCallback f474j;

    /* renamed from: k */
    final /* synthetic */ String f475k;

    /* renamed from: l */
    final /* synthetic */ C0114l0 f476l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0112k0(C0114l0 c0114l0, LifecycleCallback lifecycleCallback, String str) {
        this.f476l = c0114l0;
        this.f474j = lifecycleCallback;
        this.f475k = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        C0114l0 c0114l0 = this.f476l;
        i = c0114l0.f479k;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f474j;
            bundle = c0114l0.f480l;
            if (bundle != null) {
                bundle3 = c0114l0.f480l;
                bundle2 = bundle3.getBundle(this.f475k);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo28125f(bundle2);
        }
        i2 = this.f476l.f479k;
        if (i2 >= 2) {
            this.f474j.mo28123j();
        }
        i3 = this.f476l.f479k;
        if (i3 >= 3) {
            this.f474j.mo28132h();
        }
        i4 = this.f476l.f479k;
        if (i4 >= 4) {
            this.f474j.mo28122k();
        }
        i5 = this.f476l.f479k;
        if (i5 >= 5) {
            this.f474j.m28230g();
        }
    }
}

package p010a9;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: a9.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class RunnableC0108i0 implements Runnable {

    /* renamed from: j */
    final /* synthetic */ LifecycleCallback f467j;

    /* renamed from: k */
    final /* synthetic */ String f468k;

    /* renamed from: l */
    final /* synthetic */ FragmentC0110j0 f469l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0108i0(FragmentC0110j0 fragmentC0110j0, LifecycleCallback lifecycleCallback, String str) {
        this.f469l = fragmentC0110j0;
        this.f467j = lifecycleCallback;
        this.f468k = str;
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
        FragmentC0110j0 fragmentC0110j0 = this.f469l;
        i = fragmentC0110j0.f472k;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f467j;
            bundle = fragmentC0110j0.f473l;
            if (bundle != null) {
                bundle3 = fragmentC0110j0.f473l;
                bundle2 = bundle3.getBundle(this.f468k);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo28125f(bundle2);
        }
        i2 = this.f469l.f472k;
        if (i2 >= 2) {
            this.f467j.mo28123j();
        }
        i3 = this.f469l.f472k;
        if (i3 >= 3) {
            this.f467j.mo28132h();
        }
        i4 = this.f469l.f472k;
        if (i4 >= 4) {
            this.f467j.mo28122k();
        }
        i5 = this.f469l.f472k;
        if (i5 >= 5) {
            this.f467j.m28230g();
        }
    }
}

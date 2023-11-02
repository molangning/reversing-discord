package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.InterfaceC1695l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class FragmentStateAdapter$5 implements InterfaceC1695l {

    /* renamed from: j */
    final /* synthetic */ Handler f5331j;

    /* renamed from: k */
    final /* synthetic */ Runnable f5332k;

    @Override // androidx.lifecycle.InterfaceC1695l
    /* renamed from: a */
    public void mo11423a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
        if (enumC1651b == Lifecycle.EnumC1651b.ON_DESTROY) {
            this.f5331j.removeCallbacks(this.f5332k);
            lifecycleOwner.getLifecycle().mo36123c(this);
        }
    }
}
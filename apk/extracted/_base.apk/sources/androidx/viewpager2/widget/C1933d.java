package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.C1936f;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class C1933d extends C1936f.AbstractC1945i {

    /* renamed from: a */
    private final LinearLayoutManager f5340a;

    /* renamed from: b */
    private C1936f.InterfaceC1950k f5341b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1933d(LinearLayoutManager linearLayoutManager) {
        this.f5340a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.C1936f.AbstractC1945i
    /* renamed from: a */
    public void mo25156a(int i) {
    }

    @Override // androidx.viewpager2.widget.C1936f.AbstractC1945i
    /* renamed from: b */
    public void mo25155b(int i, float f, int i2) {
        if (this.f5341b == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.f5340a.m35736U(); i3++) {
            View m35739T = this.f5340a.m35739T(i3);
            if (m35739T != null) {
                this.f5341b.mo25151a(m35739T, (this.f5340a.m35705o0(m35739T) - i) + f2);
            } else {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.f5340a.m35736U())));
            }
        }
    }

    @Override // androidx.viewpager2.widget.C1936f.AbstractC1945i
    /* renamed from: c */
    public void mo25154c(int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C1936f.InterfaceC1950k m34960d() {
        return this.f5341b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m34959e(C1936f.InterfaceC1950k interfaceC1950k) {
        this.f5341b = interfaceC1950k;
    }
}

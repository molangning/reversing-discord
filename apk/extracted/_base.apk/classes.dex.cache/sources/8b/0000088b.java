package androidx.viewpager2.widget;

import androidx.viewpager2.widget.C1936f;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.viewpager2.widget.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1931b extends C1936f.AbstractC1945i {

    /* renamed from: a */
    private final List<C1936f.AbstractC1945i> f5336a;

    public C1931b(int i) {
        this.f5336a = new ArrayList(i);
    }

    /* renamed from: e */
    private void m34962e(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.C1936f.AbstractC1945i
    /* renamed from: a */
    public void mo25156a(int i) {
        try {
            for (C1936f.AbstractC1945i abstractC1945i : this.f5336a) {
                abstractC1945i.mo25156a(i);
            }
        } catch (ConcurrentModificationException e) {
            m34962e(e);
        }
    }

    @Override // androidx.viewpager2.widget.C1936f.AbstractC1945i
    /* renamed from: b */
    public void mo25155b(int i, float f, int i2) {
        try {
            for (C1936f.AbstractC1945i abstractC1945i : this.f5336a) {
                abstractC1945i.mo25155b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m34962e(e);
        }
    }

    @Override // androidx.viewpager2.widget.C1936f.AbstractC1945i
    /* renamed from: c */
    public void mo25154c(int i) {
        try {
            for (C1936f.AbstractC1945i abstractC1945i : this.f5336a) {
                abstractC1945i.mo25154c(i);
            }
        } catch (ConcurrentModificationException e) {
            m34962e(e);
        }
    }

    /* renamed from: d */
    public void m34963d(C1936f.AbstractC1945i abstractC1945i) {
        this.f5336a.add(abstractC1945i);
    }
}
package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C1304n2;
import androidx.core.view.C1316p2;
import androidx.core.view.InterfaceC1311o2;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.appcompat.view.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0367g {

    /* renamed from: c */
    private Interpolator f1202c;

    /* renamed from: d */
    InterfaceC1311o2 f1203d;

    /* renamed from: e */
    private boolean f1204e;

    /* renamed from: b */
    private long f1201b = -1;

    /* renamed from: f */
    private final C1316p2 f1205f = new C0368a();

    /* renamed from: a */
    final ArrayList<C1304n2> f1200a = new ArrayList<>();

    /* renamed from: androidx.appcompat.view.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0368a extends C1316p2 {

        /* renamed from: a */
        private boolean f1206a = false;

        /* renamed from: b */
        private int f1207b = 0;

        C0368a() {
        }

        @Override // androidx.core.view.InterfaceC1311o2
        /* renamed from: b */
        public void mo37354b(View view) {
            int i = this.f1207b + 1;
            this.f1207b = i;
            if (i == C0367g.this.f1200a.size()) {
                InterfaceC1311o2 interfaceC1311o2 = C0367g.this.f1203d;
                if (interfaceC1311o2 != null) {
                    interfaceC1311o2.mo37354b(null);
                }
                m40439d();
            }
        }

        @Override // androidx.core.view.C1316p2, androidx.core.view.InterfaceC1311o2
        /* renamed from: c */
        public void mo37349c(View view) {
            if (this.f1206a) {
                return;
            }
            this.f1206a = true;
            InterfaceC1311o2 interfaceC1311o2 = C0367g.this.f1203d;
            if (interfaceC1311o2 != null) {
                interfaceC1311o2.mo37349c(null);
            }
        }

        /* renamed from: d */
        void m40439d() {
            this.f1207b = 0;
            this.f1206a = false;
            C0367g.this.m40446b();
        }
    }

    /* renamed from: a */
    public void m40447a() {
        if (!this.f1204e) {
            return;
        }
        Iterator<C1304n2> it = this.f1200a.iterator();
        while (it.hasNext()) {
            it.next().m37369c();
        }
        this.f1204e = false;
    }

    /* renamed from: b */
    void m40446b() {
        this.f1204e = false;
    }

    /* renamed from: c */
    public C0367g m40445c(C1304n2 c1304n2) {
        if (!this.f1204e) {
            this.f1200a.add(c1304n2);
        }
        return this;
    }

    /* renamed from: d */
    public C0367g m40444d(C1304n2 c1304n2, C1304n2 c1304n22) {
        this.f1200a.add(c1304n2);
        c1304n22.m37362j(c1304n2.m37368d());
        this.f1200a.add(c1304n22);
        return this;
    }

    /* renamed from: e */
    public C0367g m40443e(long j) {
        if (!this.f1204e) {
            this.f1201b = j;
        }
        return this;
    }

    /* renamed from: f */
    public C0367g m40442f(Interpolator interpolator) {
        if (!this.f1204e) {
            this.f1202c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C0367g m40441g(InterfaceC1311o2 interfaceC1311o2) {
        if (!this.f1204e) {
            this.f1203d = interfaceC1311o2;
        }
        return this;
    }

    /* renamed from: h */
    public void m40440h() {
        if (this.f1204e) {
            return;
        }
        Iterator<C1304n2> it = this.f1200a.iterator();
        while (it.hasNext()) {
            C1304n2 next = it.next();
            long j = this.f1201b;
            if (j >= 0) {
                next.m37366f(j);
            }
            Interpolator interpolator = this.f1202c;
            if (interpolator != null) {
                next.m37365g(interpolator);
            }
            if (this.f1203d != null) {
                next.m37364h(this.f1205f);
            }
            next.m37360l();
        }
        this.f1204e = true;
    }
}

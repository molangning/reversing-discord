package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.C1084f;
import androidx.core.provider.C1090g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.provider.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1076a {

    /* renamed from: a */
    private final C1090g.C1093c f3411a;

    /* renamed from: b */
    private final Handler f3412b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1077a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C1090g.C1093c f3413j;

        /* renamed from: k */
        final /* synthetic */ Typeface f3414k;

        RunnableC1077a(C1090g.C1093c c1093c, Typeface typeface) {
            this.f3413j = c1093c;
            this.f3414k = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3413j.mo37909b(this.f3414k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1078b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C1090g.C1093c f3416j;

        /* renamed from: k */
        final /* synthetic */ int f3417k;

        RunnableC1078b(C1090g.C1093c c1093c, int i) {
            this.f3416j = c1093c;
            this.f3417k = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3416j.mo37910a(this.f3417k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1076a(C1090g.C1093c c1093c, Handler handler) {
        this.f3411a = c1093c;
        this.f3412b = handler;
    }

    /* renamed from: a */
    private void m37952a(int i) {
        this.f3412b.post(new RunnableC1078b(this.f3411a, i));
    }

    /* renamed from: c */
    private void m37950c(Typeface typeface) {
        this.f3412b.post(new RunnableC1077a(this.f3411a, typeface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m37951b(C1084f.C1089e c1089e) {
        if (c1089e.m37923a()) {
            m37950c(c1089e.f3440a);
        } else {
            m37952a(c1089e.f3441b);
        }
    }
}

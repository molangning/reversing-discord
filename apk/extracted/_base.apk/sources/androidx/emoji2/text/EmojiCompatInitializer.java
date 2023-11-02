package androidx.emoji2.text;

import android.content.Context;
import androidx.core.p018os.C1071r;
import androidx.emoji2.text.C1500e;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.C1678c;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.C1828a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p274p0.InterfaceC11363a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class EmojiCompatInitializer implements InterfaceC11363a<Boolean> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1487a extends C1500e.AbstractC1504c {
        protected C1487a(Context context) {
            super(new C1488b(context));
            m36631b(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1488b implements C1500e.InterfaceC1508g {

        /* renamed from: a */
        private final Context f3895a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public class C1489a extends C1500e.AbstractC1509h {

            /* renamed from: a */
            final /* synthetic */ C1500e.AbstractC1509h f3896a;

            /* renamed from: b */
            final /* synthetic */ ThreadPoolExecutor f3897b;

            C1489a(C1500e.AbstractC1509h abstractC1509h, ThreadPoolExecutor threadPoolExecutor) {
                this.f3896a = abstractC1509h;
                this.f3897b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.C1500e.AbstractC1509h
            /* renamed from: a */
            public void mo36628a(Throwable th2) {
                try {
                    this.f3896a.mo36628a(th2);
                } finally {
                    this.f3897b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.C1500e.AbstractC1509h
            /* renamed from: b */
            public void mo36627b(C1525m c1525m) {
                try {
                    this.f3896a.mo36627b(c1525m);
                } finally {
                    this.f3897b.shutdown();
                }
            }
        }

        C1488b(Context context) {
            this.f3895a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.C1500e.InterfaceC1508g
        /* renamed from: a */
        public void mo36590a(final C1500e.AbstractC1509h abstractC1509h) {
            final ThreadPoolExecutor m36674b = C1492b.m36674b("EmojiCompatInitializer");
            m36674b.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.C1488b.this.m36676d(abstractC1509h, m36674b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public void m36676d(C1500e.AbstractC1509h abstractC1509h, ThreadPoolExecutor threadPoolExecutor) {
            try {
                C1517j m36670a = C1494c.m36670a(this.f3895a);
                if (m36670a != null) {
                    m36670a.m36594c(threadPoolExecutor);
                    m36670a.m36632a().mo36590a(new C1489a(abstractC1509h, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th2) {
                abstractC1509h.mo36628a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class RunnableC1490c implements Runnable {
        RunnableC1490c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C1071r.m37959a("EmojiCompat.EmojiCompatInitializer.run");
                if (C1500e.m36650h()) {
                    C1500e.m36656b().m36647k();
                }
            } finally {
                C1071r.m37958b();
            }
        }
    }

    @Override // p274p0.InterfaceC11363a
    /* renamed from: a */
    public List<Class<? extends InterfaceC11363a<?>>> mo8249a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p274p0.InterfaceC11363a
    /* renamed from: c */
    public Boolean mo8248b(Context context) {
        C1500e.m36651g(new C1487a(context));
        m36680d(context);
        return Boolean.TRUE;
    }

    /* renamed from: d */
    void m36680d(Context context) {
        final Lifecycle lifecycle = ((LifecycleOwner) C1828a.m35286e(context).m35285f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.mo36125a(new DefaultLifecycleObserver() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC1682e
            public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                C1678c.m36056a(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC1682e
            public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                C1678c.m36055b(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC1682e
            public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                C1678c.m36054c(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC1682e
            public void onResume(LifecycleOwner lifecycleOwner) {
                EmojiCompatInitializer.this.m36679e();
                lifecycle.mo36123c(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC1682e
            public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                C1678c.m36052e(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.InterfaceC1682e
            public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                C1678c.m36051f(this, lifecycleOwner);
            }
        });
    }

    /* renamed from: e */
    void m36679e() {
        C1492b.m36672d().postDelayed(new RunnableC1490c(), 500L);
    }
}

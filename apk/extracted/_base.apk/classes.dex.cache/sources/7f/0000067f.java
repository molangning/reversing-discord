package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.graphics.C1007d0;
import androidx.core.p018os.C1071r;
import androidx.core.provider.C1083e;
import androidx.core.provider.C1090g;
import androidx.core.util.C1138f;
import androidx.emoji2.text.C1500e;
import androidx.emoji2.text.C1517j;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1517j extends C1500e.AbstractC1504c {

    /* renamed from: j */
    private static final C1518a f3960j = new C1518a();

    /* renamed from: androidx.emoji2.text.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1518a {
        /* renamed from: a */
        public Typeface m36593a(Context context, C1090g.C1092b c1092b) {
            return C1090g.m37922a(context, null, new C1090g.C1092b[]{c1092b});
        }

        /* renamed from: b */
        public C1090g.C1091a m36592b(Context context, C1083e c1083e) {
            return C1090g.m37921b(context, null, c1083e);
        }

        /* renamed from: c */
        public void m36591c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* renamed from: androidx.emoji2.text.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1519b implements C1500e.InterfaceC1508g {

        /* renamed from: a */
        private final Context f3961a;

        /* renamed from: b */
        private final C1083e f3962b;

        /* renamed from: c */
        private final C1518a f3963c;

        /* renamed from: d */
        private final Object f3964d = new Object();

        /* renamed from: e */
        private Handler f3965e;

        /* renamed from: f */
        private Executor f3966f;

        /* renamed from: g */
        private ThreadPoolExecutor f3967g;

        /* renamed from: h */
        C1500e.AbstractC1509h f3968h;

        /* renamed from: i */
        private ContentObserver f3969i;

        /* renamed from: j */
        private Runnable f3970j;

        C1519b(Context context, C1083e c1083e, C1518a c1518a) {
            C1138f.m37823g(context, "Context cannot be null");
            C1138f.m37823g(c1083e, "FontRequest cannot be null");
            this.f3961a = context.getApplicationContext();
            this.f3962b = c1083e;
            this.f3963c = c1518a;
        }

        /* renamed from: b */
        private void m36589b() {
            synchronized (this.f3964d) {
                this.f3968h = null;
                ContentObserver contentObserver = this.f3969i;
                if (contentObserver != null) {
                    this.f3963c.m36591c(this.f3961a, contentObserver);
                    this.f3969i = null;
                }
                Handler handler = this.f3965e;
                if (handler != null) {
                    handler.removeCallbacks(this.f3970j);
                }
                this.f3965e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f3967g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f3966f = null;
                this.f3967g = null;
            }
        }

        /* renamed from: e */
        private C1090g.C1092b m36586e() {
            try {
                C1090g.C1091a m36592b = this.f3963c.m36592b(this.f3961a, this.f3962b);
                if (m36592b.m37917c() == 0) {
                    C1090g.C1092b[] m37918b = m36592b.m37918b();
                    if (m37918b != null && m37918b.length != 0) {
                        return m37918b[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + m36592b.m37917c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        @Override // androidx.emoji2.text.C1500e.InterfaceC1508g
        /* renamed from: a */
        public void mo36590a(C1500e.AbstractC1509h abstractC1509h) {
            C1138f.m37823g(abstractC1509h, "LoaderCallback cannot be null");
            synchronized (this.f3964d) {
                this.f3968h = abstractC1509h;
            }
            m36587d();
        }

        /* renamed from: c */
        public void m36588c() {
            synchronized (this.f3964d) {
                if (this.f3968h == null) {
                    return;
                }
                try {
                    C1090g.C1092b m36586e = m36586e();
                    int m37915b = m36586e.m37915b();
                    if (m37915b == 2) {
                        synchronized (this.f3964d) {
                        }
                    }
                    if (m37915b == 0) {
                        C1071r.m37959a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Typeface m36593a = this.f3963c.m36593a(this.f3961a, m36586e);
                        ByteBuffer m38142f = C1007d0.m38142f(this.f3961a, null, m36586e.m37913d());
                        if (m38142f != null && m36593a != null) {
                            C1525m m36575b = C1525m.m36575b(m36593a, m38142f);
                            C1071r.m37958b();
                            synchronized (this.f3964d) {
                                C1500e.AbstractC1509h abstractC1509h = this.f3968h;
                                if (abstractC1509h != null) {
                                    abstractC1509h.mo36627b(m36575b);
                                }
                            }
                            m36589b();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + m37915b + ")");
                } catch (Throwable th2) {
                    synchronized (this.f3964d) {
                        C1500e.AbstractC1509h abstractC1509h2 = this.f3968h;
                        if (abstractC1509h2 != null) {
                            abstractC1509h2.mo36628a(th2);
                        }
                        m36589b();
                    }
                }
            }
        }

        /* renamed from: d */
        void m36587d() {
            synchronized (this.f3964d) {
                if (this.f3968h == null) {
                    return;
                }
                if (this.f3966f == null) {
                    ThreadPoolExecutor m36674b = C1492b.m36674b("emojiCompat");
                    this.f3967g = m36674b;
                    this.f3966f = m36674b;
                }
                this.f3966f.execute(new Runnable() { // from class: androidx.emoji2.text.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1517j.C1519b.this.m36588c();
                    }
                });
            }
        }

        /* renamed from: f */
        public void m36585f(Executor executor) {
            synchronized (this.f3964d) {
                this.f3966f = executor;
            }
        }
    }

    public C1517j(Context context, C1083e c1083e) {
        super(new C1519b(context, c1083e, f3960j));
    }

    /* renamed from: c */
    public C1517j m36594c(Executor executor) {
        ((C1519b) m36632a()).m36585f(executor);
        return this;
    }
}
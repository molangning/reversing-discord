package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* renamed from: androidx.dynamicanimation.animation.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1460a {

    /* renamed from: g */
    public static final ThreadLocal<C1460a> f3843g = new ThreadLocal<>();

    /* renamed from: d */
    private AbstractC1463c f3847d;

    /* renamed from: a */
    private final SimpleArrayMap<InterfaceC1462b, Long> f3844a = new SimpleArrayMap<>();

    /* renamed from: b */
    final ArrayList<InterfaceC1462b> f3845b = new ArrayList<>();

    /* renamed from: c */
    private final C1461a f3846c = new C1461a();

    /* renamed from: e */
    long f3848e = 0;

    /* renamed from: f */
    private boolean f3849f = false;

    /* renamed from: androidx.dynamicanimation.animation.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1461a {
        C1461a() {
            C1460a.this = r1;
        }

        /* renamed from: a */
        void m36734a() {
            C1460a.this.f3848e = SystemClock.uptimeMillis();
            C1460a c1460a = C1460a.this;
            c1460a.m36739c(c1460a.f3848e);
            if (C1460a.this.f3845b.size() > 0) {
                C1460a.this.m36737e().mo36733a();
            }
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1462b {
        /* renamed from: a */
        boolean mo36732a(long j);
    }

    /* renamed from: androidx.dynamicanimation.animation.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC1463c {

        /* renamed from: a */
        final C1461a f3851a;

        AbstractC1463c(C1461a c1461a) {
            this.f3851a = c1461a;
        }

        /* renamed from: a */
        abstract void mo36733a();
    }

    /* renamed from: androidx.dynamicanimation.animation.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1464d extends AbstractC1463c {

        /* renamed from: b */
        private final Choreographer f3852b;

        /* renamed from: c */
        private final Choreographer.FrameCallback f3853c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.dynamicanimation.animation.a$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public class Choreographer$FrameCallbackC1465a implements Choreographer.FrameCallback {
            Choreographer$FrameCallbackC1465a() {
                C1464d.this = r1;
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                C1464d.this.f3851a.m36734a();
            }
        }

        C1464d(C1461a c1461a) {
            super(c1461a);
            this.f3852b = Choreographer.getInstance();
            this.f3853c = new Choreographer$FrameCallbackC1465a();
        }

        @Override // androidx.dynamicanimation.animation.C1460a.AbstractC1463c
        /* renamed from: a */
        void mo36733a() {
            this.f3852b.postFrameCallback(this.f3853c);
        }
    }

    C1460a() {
    }

    /* renamed from: b */
    private void m36740b() {
        if (this.f3849f) {
            for (int size = this.f3845b.size() - 1; size >= 0; size--) {
                if (this.f3845b.get(size) == null) {
                    this.f3845b.remove(size);
                }
            }
            this.f3849f = false;
        }
    }

    /* renamed from: d */
    public static C1460a m36738d() {
        ThreadLocal<C1460a> threadLocal = f3843g;
        if (threadLocal.get() == null) {
            threadLocal.set(new C1460a());
        }
        return threadLocal.get();
    }

    /* renamed from: f */
    private boolean m36736f(InterfaceC1462b interfaceC1462b, long j) {
        Long l = this.f3844a.get(interfaceC1462b);
        if (l == null) {
            return true;
        }
        if (l.longValue() < j) {
            this.f3844a.remove(interfaceC1462b);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m36741a(InterfaceC1462b interfaceC1462b, long j) {
        if (this.f3845b.size() == 0) {
            m36737e().mo36733a();
        }
        if (!this.f3845b.contains(interfaceC1462b)) {
            this.f3845b.add(interfaceC1462b);
        }
        if (j > 0) {
            this.f3844a.put(interfaceC1462b, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* renamed from: c */
    void m36739c(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f3845b.size(); i++) {
            InterfaceC1462b interfaceC1462b = this.f3845b.get(i);
            if (interfaceC1462b != null && m36736f(interfaceC1462b, uptimeMillis)) {
                interfaceC1462b.mo36732a(j);
            }
        }
        m36740b();
    }

    /* renamed from: e */
    AbstractC1463c m36737e() {
        if (this.f3847d == null) {
            this.f3847d = new C1464d(this.f3846c);
        }
        return this.f3847d;
    }

    /* renamed from: g */
    public void m36735g(InterfaceC1462b interfaceC1462b) {
        this.f3844a.remove(interfaceC1462b);
        int indexOf = this.f3845b.indexOf(interfaceC1462b);
        if (indexOf >= 0) {
            this.f3845b.set(indexOf, null);
            this.f3849f = true;
        }
    }
}
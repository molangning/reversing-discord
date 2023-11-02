package p125h1;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import p073e1.C6043e;
import p311r1.C12020a;
import p311r1.C12022c;

/* renamed from: h1.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC6861a<K, A> {

    /* renamed from: c */
    private final InterfaceC6865d<K> f19115c;

    /* renamed from: e */
    protected C12022c<A> f19117e;

    /* renamed from: a */
    final List<InterfaceC6863b> f19113a = new ArrayList(1);

    /* renamed from: b */
    private boolean f19114b = false;

    /* renamed from: d */
    protected float f19116d = 0.0f;

    /* renamed from: f */
    private A f19118f = null;

    /* renamed from: g */
    private float f19119g = -1.0f;

    /* renamed from: h */
    private float f19120h = -1.0f;

    /* renamed from: h1.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC6863b {
        /* renamed from: a */
        void mo12107a();
    }

    /* renamed from: h1.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C6864c<T> implements InterfaceC6865d<T> {
        private C6864c() {
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        /* renamed from: a */
        public boolean mo21764a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        /* renamed from: b */
        public C12020a<T> mo21763b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        /* renamed from: c */
        public boolean mo21762c(float f) {
            return false;
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        /* renamed from: d */
        public float mo21761d() {
            return 0.0f;
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        /* renamed from: e */
        public float mo21760e() {
            return 1.0f;
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        public boolean isEmpty() {
            return true;
        }
    }

    /* renamed from: h1.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC6865d<T> {
        /* renamed from: a */
        boolean mo21764a(float f);

        /* renamed from: b */
        C12020a<T> mo21763b();

        /* renamed from: c */
        boolean mo21762c(float f);

        /* renamed from: d */
        float mo21761d();

        /* renamed from: e */
        float mo21760e();

        boolean isEmpty();
    }

    /* renamed from: h1.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C6866e<T> implements InterfaceC6865d<T> {

        /* renamed from: a */
        private final List<? extends C12020a<T>> f19121a;

        /* renamed from: c */
        private C12020a<T> f19123c = null;

        /* renamed from: d */
        private float f19124d = -1.0f;

        /* renamed from: b */
        private C12020a<T> f19122b = m21765f(0.0f);

        C6866e(List<? extends C12020a<T>> list) {
            this.f19121a = list;
        }

        /* renamed from: f */
        private C12020a<T> m21765f(float f) {
            List<? extends C12020a<T>> list = this.f19121a;
            C12020a<T> c12020a = list.get(list.size() - 1);
            if (f >= c12020a.m6580f()) {
                return c12020a;
            }
            for (int size = this.f19121a.size() - 2; size >= 1; size--) {
                C12020a<T> c12020a2 = this.f19121a.get(size);
                if (this.f19122b != c12020a2 && c12020a2.m6585a(f)) {
                    return c12020a2;
                }
            }
            return this.f19121a.get(0);
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        /* renamed from: a */
        public boolean mo21764a(float f) {
            C12020a<T> c12020a = this.f19123c;
            C12020a<T> c12020a2 = this.f19122b;
            if (c12020a == c12020a2 && this.f19124d == f) {
                return true;
            }
            this.f19123c = c12020a2;
            this.f19124d = f;
            return false;
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        /* renamed from: b */
        public C12020a<T> mo21763b() {
            return this.f19122b;
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        /* renamed from: c */
        public boolean mo21762c(float f) {
            if (this.f19122b.m6585a(f)) {
                return !this.f19122b.m6577i();
            }
            this.f19122b = m21765f(f);
            return true;
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        /* renamed from: d */
        public float mo21761d() {
            return this.f19121a.get(0).m6580f();
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        /* renamed from: e */
        public float mo21760e() {
            List<? extends C12020a<T>> list = this.f19121a;
            return list.get(list.size() - 1).m6583c();
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        public boolean isEmpty() {
            return false;
        }
    }

    /* renamed from: h1.a$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C6867f<T> implements InterfaceC6865d<T> {

        /* renamed from: a */
        private final C12020a<T> f19125a;

        /* renamed from: b */
        private float f19126b = -1.0f;

        C6867f(List<? extends C12020a<T>> list) {
            this.f19125a = list.get(0);
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        /* renamed from: a */
        public boolean mo21764a(float f) {
            if (this.f19126b == f) {
                return true;
            }
            this.f19126b = f;
            return false;
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        /* renamed from: b */
        public C12020a<T> mo21763b() {
            return this.f19125a;
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        /* renamed from: c */
        public boolean mo21762c(float f) {
            return !this.f19125a.m6577i();
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        /* renamed from: d */
        public float mo21761d() {
            return this.f19125a.m6580f();
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        /* renamed from: e */
        public float mo21760e() {
            return this.f19125a.m6583c();
        }

        @Override // p125h1.AbstractC6861a.InterfaceC6865d
        public boolean isEmpty() {
            return false;
        }
    }

    public AbstractC6861a(List<? extends C12020a<K>> list) {
        this.f19115c = m21766o(list);
    }

    /* renamed from: g */
    private float m21769g() {
        if (this.f19119g == -1.0f) {
            this.f19119g = this.f19115c.mo21761d();
        }
        return this.f19119g;
    }

    /* renamed from: o */
    private static <T> InterfaceC6865d<T> m21766o(List<? extends C12020a<T>> list) {
        if (list.isEmpty()) {
            return new C6864c();
        }
        if (list.size() == 1) {
            return new C6867f(list);
        }
        return new C6866e(list);
    }

    /* renamed from: a */
    public void m21774a(InterfaceC6863b interfaceC6863b) {
        this.f19113a.add(interfaceC6863b);
    }

    /* renamed from: b */
    public C12020a<K> m21773b() {
        C6043e.m23828b("BaseKeyframeAnimation#getCurrentKeyframe");
        C12020a<K> mo21763b = this.f19115c.mo21763b();
        C6043e.m23827c("BaseKeyframeAnimation#getCurrentKeyframe");
        return mo21763b;
    }

    /* renamed from: c */
    float mo21713c() {
        if (this.f19120h == -1.0f) {
            this.f19120h = this.f19115c.mo21760e();
        }
        return this.f19120h;
    }

    /* renamed from: d */
    public float m21772d() {
        C12020a<K> m21773b = m21773b();
        if (m21773b != null && !m21773b.m6577i()) {
            return m21773b.f31018d.getInterpolation(m21771e());
        }
        return 0.0f;
    }

    /* renamed from: e */
    public float m21771e() {
        if (this.f19114b) {
            return 0.0f;
        }
        C12020a<K> m21773b = m21773b();
        if (m21773b.m6577i()) {
            return 0.0f;
        }
        return (this.f19116d - m21773b.m6580f()) / (m21773b.m6583c() - m21773b.m6580f());
    }

    /* renamed from: f */
    public float m21770f() {
        return this.f19116d;
    }

    /* renamed from: h */
    public A mo21712h() {
        A mo21711i;
        float m21771e = m21771e();
        if (this.f19117e == null && this.f19115c.mo21764a(m21771e)) {
            return this.f19118f;
        }
        C12020a<K> m21773b = m21773b();
        Interpolator interpolator = m21773b.f31019e;
        if (interpolator != null && m21773b.f31020f != null) {
            mo21711i = mo21736j(m21773b, m21771e, interpolator.getInterpolation(m21771e), m21773b.f31020f.getInterpolation(m21771e));
        } else {
            mo21711i = mo21711i(m21773b, m21772d());
        }
        this.f19118f = mo21711i;
        return mo21711i;
    }

    /* renamed from: i */
    abstract A mo21711i(C12020a<K> c12020a, float f);

    /* renamed from: j */
    protected A mo21736j(C12020a<K> c12020a, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* renamed from: k */
    public void mo21710k() {
        C6043e.m23828b("BaseKeyframeAnimation#notifyListeners");
        for (int i = 0; i < this.f19113a.size(); i++) {
            this.f19113a.get(i).mo12107a();
        }
        C6043e.m23827c("BaseKeyframeAnimation#notifyListeners");
    }

    /* renamed from: l */
    public void m21768l() {
        this.f19114b = true;
    }

    /* renamed from: m */
    public void mo21709m(float f) {
        C6043e.m23828b("BaseKeyframeAnimation#setProgress");
        if (this.f19115c.isEmpty()) {
            C6043e.m23827c("BaseKeyframeAnimation#setProgress");
            return;
        }
        if (f < m21769g()) {
            f = m21769g();
        } else if (f > mo21713c()) {
            f = mo21713c();
        }
        if (f == this.f19116d) {
            C6043e.m23827c("BaseKeyframeAnimation#setProgress");
            return;
        }
        this.f19116d = f;
        if (this.f19115c.mo21762c(f)) {
            mo21710k();
        }
        C6043e.m23827c("BaseKeyframeAnimation#setProgress");
    }

    /* renamed from: n */
    public void m21767n(C12022c<A> c12022c) {
        C12022c<A> c12022c2 = this.f19117e;
        if (c12022c2 != null) {
            c12022c2.m6566c(null);
        }
        this.f19117e = c12022c;
        if (c12022c != null) {
            c12022c.m6566c(this);
        }
    }
}
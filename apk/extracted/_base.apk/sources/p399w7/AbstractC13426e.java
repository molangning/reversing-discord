package p399w7;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p195k8.C9149a;
import p195k8.C9191p0;
import p228m6.AbstractC10273h;
import p383v7.AbstractC13139k;
import p383v7.C13138j;
import p383v7.InterfaceC13133f;
import p383v7.InterfaceC13134g;
import p399w7.AbstractC13426e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w7.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13426e implements InterfaceC13134g {

    /* renamed from: a */
    private final ArrayDeque<C13428b> f34623a = new ArrayDeque<>();

    /* renamed from: b */
    private final ArrayDeque<AbstractC13139k> f34624b;

    /* renamed from: c */
    private final PriorityQueue<C13428b> f34625c;

    /* renamed from: d */
    private C13428b f34626d;

    /* renamed from: e */
    private long f34627e;

    /* renamed from: f */
    private long f34628f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w7.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13428b extends C13138j implements Comparable<C13428b> {

        /* renamed from: s */
        private long f34629s;

        private C13428b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: z */
        public int compareTo(C13428b c13428b) {
            if (m11988l() != c13428b.m11988l()) {
                if (m11988l()) {
                    return 1;
                }
                return -1;
            }
            long j = this.f26745n - c13428b.f26745n;
            if (j == 0) {
                j = this.f34629s - c13428b.f34629s;
                if (j == 0) {
                    return 0;
                }
            }
            if (j > 0) {
                return 1;
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w7.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13429c extends AbstractC13139k {

        /* renamed from: o */
        private AbstractC10273h.InterfaceC10274a<C13429c> f34630o;

        public C13429c(AbstractC10273h.InterfaceC10274a<C13429c> interfaceC10274a) {
            this.f34630o = interfaceC10274a;
        }

        @Override // p228m6.AbstractC10273h
        /* renamed from: o */
        public final void mo2498o() {
            this.f34630o.mo2515a(this);
        }
    }

    public AbstractC13426e() {
        for (int i = 0; i < 10; i++) {
            this.f34623a.add(new C13428b());
        }
        this.f34624b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f34624b.add(new C13429c(new AbstractC10273h.InterfaceC10274a() { // from class: w7.d
                @Override // p228m6.AbstractC10273h.InterfaceC10274a
                /* renamed from: a */
                public final void mo2515a(AbstractC10273h abstractC10273h) {
                    AbstractC13426e.this.m2501n((AbstractC13426e.C13429c) abstractC10273h);
                }
            }));
        }
        this.f34625c = new PriorityQueue<>();
    }

    /* renamed from: m */
    private void m2502m(C13428b c13428b) {
        c13428b.mo3126f();
        this.f34623a.add(c13428b);
    }

    @Override // p383v7.InterfaceC13134g
    /* renamed from: a */
    public void mo2514a(long j) {
        this.f34627e = j;
    }

    /* renamed from: e */
    protected abstract InterfaceC13133f mo2510e();

    /* renamed from: f */
    protected abstract void mo2509f(C13138j c13138j);

    @Override // p228m6.InterfaceC10269e
    public void flush() {
        this.f34628f = 0L;
        this.f34627e = 0L;
        while (!this.f34625c.isEmpty()) {
            m2502m((C13428b) C9191p0.m16243j(this.f34625c.poll()));
        }
        C13428b c13428b = this.f34626d;
        if (c13428b != null) {
            m2502m(c13428b);
            this.f34626d = null;
        }
    }

    @Override // p228m6.InterfaceC10269e
    /* renamed from: g */
    public C13138j mo2511d() {
        boolean z;
        if (this.f34626d == null) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        if (this.f34623a.isEmpty()) {
            return null;
        }
        C13428b pollFirst = this.f34623a.pollFirst();
        this.f34626d = pollFirst;
        return pollFirst;
    }

    @Override // p228m6.InterfaceC10269e
    /* renamed from: h */
    public AbstractC13139k mo2513b() {
        if (this.f34624b.isEmpty()) {
            return null;
        }
        while (!this.f34625c.isEmpty() && ((C13428b) C9191p0.m16243j(this.f34625c.peek())).f26745n <= this.f34627e) {
            C13428b c13428b = (C13428b) C9191p0.m16243j(this.f34625c.poll());
            if (c13428b.m11988l()) {
                AbstractC13139k abstractC13139k = (AbstractC13139k) C9191p0.m16243j(this.f34624b.pollFirst());
                abstractC13139k.m11993e(4);
                m2502m(c13428b);
                return abstractC13139k;
            }
            mo2509f(c13428b);
            if (mo2504k()) {
                InterfaceC13133f mo2510e = mo2510e();
                AbstractC13139k abstractC13139k2 = (AbstractC13139k) C9191p0.m16243j(this.f34624b.pollFirst());
                abstractC13139k2.m3125p(c13428b.f26745n, mo2510e, Long.MAX_VALUE);
                m2502m(c13428b);
                return abstractC13139k2;
            }
            m2502m(c13428b);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final AbstractC13139k m2506i() {
        return this.f34624b.pollFirst();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final long m2505j() {
        return this.f34627e;
    }

    /* renamed from: k */
    protected abstract boolean mo2504k();

    @Override // p228m6.InterfaceC10269e
    /* renamed from: l */
    public void mo2512c(C13138j c13138j) {
        boolean z;
        if (c13138j == this.f34626d) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        C13428b c13428b = (C13428b) c13138j;
        if (c13428b.m11989k()) {
            m2502m(c13428b);
        } else {
            long j = this.f34628f;
            this.f34628f = 1 + j;
            c13428b.f34629s = j;
            this.f34625c.add(c13428b);
        }
        this.f34626d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void m2501n(AbstractC13139k abstractC13139k) {
        abstractC13139k.mo3126f();
        this.f34624b.add(abstractC13139k);
    }

    @Override // p228m6.InterfaceC10269e
    public void release() {
    }
}

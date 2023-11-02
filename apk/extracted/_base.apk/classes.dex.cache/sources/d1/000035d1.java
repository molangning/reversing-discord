package p139hf;

import cf.C2528b;
import gf.InterfaceC6740a;
import gf.InterfaceC6742c;
import lk.InterfaceC10220b;
import lk.InterfaceC10221c;
import nf.C10859a;
import p067df.InterfaceC5830a;
import p217lf.AbstractC10139a;
import p217lf.EnumC10143e;
import ye.AbstractC14010b;
import ye.InterfaceC14013e;

/* renamed from: hf.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7105c<T> extends AbstractC7095a<T, T> {

    /* renamed from: l */
    final InterfaceC5830a f19405l;

    /* renamed from: hf.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C7106a<T> extends AbstractC10139a<T> implements InterfaceC6740a<T> {

        /* renamed from: j */
        final InterfaceC6740a<? super T> f19406j;

        /* renamed from: k */
        final InterfaceC5830a f19407k;

        /* renamed from: l */
        InterfaceC10221c f19408l;

        /* renamed from: m */
        InterfaceC6742c<T> f19409m;

        /* renamed from: n */
        boolean f19410n;

        C7106a(InterfaceC6740a<? super T> interfaceC6740a, InterfaceC5830a interfaceC5830a) {
            this.f19406j = interfaceC6740a;
            this.f19407k = interfaceC5830a;
        }

        @Override // ye.InterfaceC14013e, lk.InterfaceC10220b
        /* renamed from: a */
        public void mo905a(InterfaceC10221c interfaceC10221c) {
            if (EnumC10143e.m12177h(this.f19408l, interfaceC10221c)) {
                this.f19408l = interfaceC10221c;
                if (interfaceC10221c instanceof InterfaceC6742c) {
                    this.f19409m = (InterfaceC6742c) interfaceC10221c;
                }
                this.f19406j.mo905a(this);
            }
        }

        /* renamed from: b */
        void m21414b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f19407k.run();
                } catch (Throwable th2) {
                    C2528b.m33061b(th2);
                    C10859a.m9887j(th2);
                }
            }
        }

        @Override // gf.InterfaceC6741b
        /* renamed from: c */
        public int mo12184c(int i) {
            InterfaceC6742c<T> interfaceC6742c = this.f19409m;
            boolean z = false;
            if (interfaceC6742c == null || (i & 4) != 0) {
                return 0;
            }
            int mo12184c = interfaceC6742c.mo12184c(i);
            if (mo12184c != 0) {
                if (mo12184c == 1) {
                    z = true;
                }
                this.f19410n = z;
            }
            return mo12184c;
        }

        @Override // lk.InterfaceC10221c
        public void cancel() {
            this.f19408l.cancel();
            m21414b();
        }

        @Override // gf.InterfaceC6745f
        public void clear() {
            this.f19409m.clear();
        }

        @Override // lk.InterfaceC10220b
        /* renamed from: d */
        public void mo12122d() {
            this.f19406j.mo12122d();
            m21414b();
        }

        @Override // gf.InterfaceC6740a
        /* renamed from: e */
        public boolean mo21413e(T t) {
            return this.f19406j.mo21413e(t);
        }

        @Override // lk.InterfaceC10220b
        /* renamed from: f */
        public void mo12121f(T t) {
            this.f19406j.mo12121f(t);
        }

        @Override // lk.InterfaceC10221c
        /* renamed from: g */
        public void mo12120g(long j) {
            this.f19408l.mo12120g(j);
        }

        @Override // gf.InterfaceC6745f
        public boolean isEmpty() {
            return this.f19409m.isEmpty();
        }

        @Override // lk.InterfaceC10220b
        public void onError(Throwable th2) {
            this.f19406j.onError(th2);
            m21414b();
        }

        @Override // gf.InterfaceC6745f
        public T poll() {
            T poll = this.f19409m.poll();
            if (poll == null && this.f19410n) {
                m21414b();
            }
            return poll;
        }
    }

    /* renamed from: hf.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C7107b<T> extends AbstractC10139a<T> implements InterfaceC14013e<T> {

        /* renamed from: j */
        final InterfaceC10220b<? super T> f19411j;

        /* renamed from: k */
        final InterfaceC5830a f19412k;

        /* renamed from: l */
        InterfaceC10221c f19413l;

        /* renamed from: m */
        InterfaceC6742c<T> f19414m;

        /* renamed from: n */
        boolean f19415n;

        C7107b(InterfaceC10220b<? super T> interfaceC10220b, InterfaceC5830a interfaceC5830a) {
            this.f19411j = interfaceC10220b;
            this.f19412k = interfaceC5830a;
        }

        @Override // ye.InterfaceC14013e, lk.InterfaceC10220b
        /* renamed from: a */
        public void mo905a(InterfaceC10221c interfaceC10221c) {
            if (EnumC10143e.m12177h(this.f19413l, interfaceC10221c)) {
                this.f19413l = interfaceC10221c;
                if (interfaceC10221c instanceof InterfaceC6742c) {
                    this.f19414m = (InterfaceC6742c) interfaceC10221c;
                }
                this.f19411j.mo905a(this);
            }
        }

        /* renamed from: b */
        void m21412b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f19412k.run();
                } catch (Throwable th2) {
                    C2528b.m33061b(th2);
                    C10859a.m9887j(th2);
                }
            }
        }

        @Override // gf.InterfaceC6741b
        /* renamed from: c */
        public int mo12184c(int i) {
            InterfaceC6742c<T> interfaceC6742c = this.f19414m;
            boolean z = false;
            if (interfaceC6742c == null || (i & 4) != 0) {
                return 0;
            }
            int mo12184c = interfaceC6742c.mo12184c(i);
            if (mo12184c != 0) {
                if (mo12184c == 1) {
                    z = true;
                }
                this.f19415n = z;
            }
            return mo12184c;
        }

        @Override // lk.InterfaceC10221c
        public void cancel() {
            this.f19413l.cancel();
            m21412b();
        }

        @Override // gf.InterfaceC6745f
        public void clear() {
            this.f19414m.clear();
        }

        @Override // lk.InterfaceC10220b
        /* renamed from: d */
        public void mo12122d() {
            this.f19411j.mo12122d();
            m21412b();
        }

        @Override // lk.InterfaceC10220b
        /* renamed from: f */
        public void mo12121f(T t) {
            this.f19411j.mo12121f(t);
        }

        @Override // lk.InterfaceC10221c
        /* renamed from: g */
        public void mo12120g(long j) {
            this.f19413l.mo12120g(j);
        }

        @Override // gf.InterfaceC6745f
        public boolean isEmpty() {
            return this.f19414m.isEmpty();
        }

        @Override // lk.InterfaceC10220b
        public void onError(Throwable th2) {
            this.f19411j.onError(th2);
            m21412b();
        }

        @Override // gf.InterfaceC6745f
        public T poll() {
            T poll = this.f19414m.poll();
            if (poll == null && this.f19415n) {
                m21412b();
            }
            return poll;
        }
    }

    public C7105c(AbstractC14010b<T> abstractC14010b, InterfaceC5830a interfaceC5830a) {
        super(abstractC14010b);
        this.f19405l = interfaceC5830a;
    }

    @Override // ye.AbstractC14010b
    /* renamed from: t */
    protected void mo909t(InterfaceC10220b<? super T> interfaceC10220b) {
        if (interfaceC10220b instanceof InterfaceC6740a) {
            this.f19391k.m910s(new C7106a((InterfaceC6740a) interfaceC10220b, this.f19405l));
        } else {
            this.f19391k.m910s(new C7107b(interfaceC10220b, this.f19405l));
        }
    }
}
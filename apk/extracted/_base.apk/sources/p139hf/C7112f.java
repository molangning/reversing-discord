package p139hf;

import gf.InterfaceC6740a;
import lk.InterfaceC10220b;
import p106ff.C6421b;
import p217lf.AbstractC10140b;
import p217lf.EnumC10143e;
import p233mf.C10448b;
import ye.AbstractC14010b;

/* renamed from: hf.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7112f<T> extends AbstractC14010b<T> {

    /* renamed from: k */
    final T[] f19448k;

    /* renamed from: hf.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C7113a<T> extends AbstractC7115c<T> {

        /* renamed from: m */
        final InterfaceC6740a<? super T> f19449m;

        C7113a(InterfaceC6740a<? super T> interfaceC6740a, T[] tArr) {
            super(tArr);
            this.f19449m = interfaceC6740a;
        }

        @Override // p139hf.C7112f.AbstractC7115c
        /* renamed from: a */
        void mo21397a() {
            T[] tArr = this.f19451j;
            int length = tArr.length;
            InterfaceC6740a<? super T> interfaceC6740a = this.f19449m;
            for (int i = this.f19452k; i != length; i++) {
                if (this.f19453l) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    interfaceC6740a.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                interfaceC6740a.mo21413e(t);
            }
            if (this.f19453l) {
                return;
            }
            interfaceC6740a.mo12122d();
        }

        @Override // p139hf.C7112f.AbstractC7115c
        /* renamed from: b */
        void mo21396b(long j) {
            T[] tArr = this.f19451j;
            int length = tArr.length;
            int i = this.f19452k;
            InterfaceC6740a<? super T> interfaceC6740a = this.f19449m;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j && i != length) {
                        if (this.f19453l) {
                            return;
                        }
                        T t = tArr[i];
                        if (t == null) {
                            interfaceC6740a.onError(new NullPointerException("The element at index " + i + " is null"));
                            return;
                        }
                        if (interfaceC6740a.mo21413e(t)) {
                            j2++;
                        }
                        i++;
                    } else if (i == length) {
                        if (!this.f19453l) {
                            interfaceC6740a.mo12122d();
                            return;
                        }
                        return;
                    } else {
                        j = get();
                        if (j2 == j) {
                            this.f19452k = i;
                            j = addAndGet(-j2);
                        }
                    }
                }
            } while (j != 0);
        }
    }

    /* renamed from: hf.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C7114b<T> extends AbstractC7115c<T> {

        /* renamed from: m */
        final InterfaceC10220b<? super T> f19450m;

        C7114b(InterfaceC10220b<? super T> interfaceC10220b, T[] tArr) {
            super(tArr);
            this.f19450m = interfaceC10220b;
        }

        @Override // p139hf.C7112f.AbstractC7115c
        /* renamed from: a */
        void mo21397a() {
            T[] tArr = this.f19451j;
            int length = tArr.length;
            InterfaceC10220b<? super T> interfaceC10220b = this.f19450m;
            for (int i = this.f19452k; i != length; i++) {
                if (this.f19453l) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    interfaceC10220b.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                interfaceC10220b.mo12121f(t);
            }
            if (this.f19453l) {
                return;
            }
            interfaceC10220b.mo12122d();
        }

        @Override // p139hf.C7112f.AbstractC7115c
        /* renamed from: b */
        void mo21396b(long j) {
            T[] tArr = this.f19451j;
            int length = tArr.length;
            int i = this.f19452k;
            InterfaceC10220b<? super T> interfaceC10220b = this.f19450m;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j && i != length) {
                        if (this.f19453l) {
                            return;
                        }
                        T t = tArr[i];
                        if (t == null) {
                            interfaceC10220b.onError(new NullPointerException("The element at index " + i + " is null"));
                            return;
                        }
                        interfaceC10220b.mo12121f(t);
                        j2++;
                        i++;
                    } else if (i == length) {
                        if (!this.f19453l) {
                            interfaceC10220b.mo12122d();
                            return;
                        }
                        return;
                    } else {
                        j = get();
                        if (j2 == j) {
                            this.f19452k = i;
                            j = addAndGet(-j2);
                        }
                    }
                }
            } while (j != 0);
        }
    }

    /* renamed from: hf.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static abstract class AbstractC7115c<T> extends AbstractC10140b<T> {

        /* renamed from: j */
        final T[] f19451j;

        /* renamed from: k */
        int f19452k;

        /* renamed from: l */
        volatile boolean f19453l;

        AbstractC7115c(T[] tArr) {
            this.f19451j = tArr;
        }

        /* renamed from: a */
        abstract void mo21397a();

        /* renamed from: b */
        abstract void mo21396b(long j);

        @Override // gf.InterfaceC6741b
        /* renamed from: c */
        public final int mo12184c(int i) {
            return i & 1;
        }

        @Override // lk.InterfaceC10221c
        public final void cancel() {
            this.f19453l = true;
        }

        @Override // gf.InterfaceC6745f
        public final void clear() {
            this.f19452k = this.f19451j.length;
        }

        @Override // lk.InterfaceC10221c
        /* renamed from: g */
        public final void mo12120g(long j) {
            if (EnumC10143e.m12178f(j) && C10448b.m11528a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo21397a();
                } else {
                    mo21396b(j);
                }
            }
        }

        @Override // gf.InterfaceC6745f
        public final boolean isEmpty() {
            return this.f19452k == this.f19451j.length;
        }

        @Override // gf.InterfaceC6745f
        public final T poll() {
            int i = this.f19452k;
            T[] tArr = this.f19451j;
            if (i == tArr.length) {
                return null;
            }
            this.f19452k = i + 1;
            return (T) C6421b.m22784c(tArr[i], "array element is null");
        }
    }

    public C7112f(T[] tArr) {
        this.f19448k = tArr;
    }

    @Override // ye.AbstractC14010b
    /* renamed from: t */
    public void mo909t(InterfaceC10220b<? super T> interfaceC10220b) {
        if (interfaceC10220b instanceof InterfaceC6740a) {
            interfaceC10220b.mo905a(new C7113a((InterfaceC6740a) interfaceC10220b, this.f19448k));
        } else {
            interfaceC10220b.mo905a(new C7114b(interfaceC10220b, this.f19448k));
        }
    }
}

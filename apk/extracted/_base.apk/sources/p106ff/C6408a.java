package p106ff;

import cf.C2530d;
import java.util.Comparator;
import java.util.concurrent.Callable;
import lk.InterfaceC10221c;
import nf.C10859a;
import p067df.InterfaceC5830a;
import p067df.InterfaceC5832c;
import p067df.InterfaceC5833d;
import p067df.InterfaceC5834e;
import p067df.InterfaceC5835f;

/* renamed from: ff.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6408a {

    /* renamed from: a */
    static final InterfaceC5833d<Object, Object> f18045a = new C6415g();

    /* renamed from: b */
    public static final Runnable f18046b = new RunnableC6412d();

    /* renamed from: c */
    public static final InterfaceC5830a f18047c = new C6409a();

    /* renamed from: d */
    static final InterfaceC5832c<Object> f18048d = new C6410b();

    /* renamed from: e */
    public static final InterfaceC5832c<Throwable> f18049e = new C6413e();

    /* renamed from: f */
    public static final InterfaceC5832c<Throwable> f18050f = new C6419k();

    /* renamed from: g */
    public static final InterfaceC5834e f18051g = new C6411c();

    /* renamed from: h */
    static final InterfaceC5835f<Object> f18052h = new C6420l();

    /* renamed from: i */
    static final InterfaceC5835f<Object> f18053i = new C6414f();

    /* renamed from: j */
    static final Callable<Object> f18054j = new CallableC6418j();

    /* renamed from: k */
    static final Comparator<Object> f18055k = new C6417i();

    /* renamed from: l */
    public static final InterfaceC5832c<InterfaceC10221c> f18056l = new C6416h();

    /* renamed from: ff.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C6409a implements InterfaceC5830a {
        C6409a() {
        }

        @Override // p067df.InterfaceC5830a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: ff.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C6410b implements InterfaceC5832c<Object> {
        C6410b() {
        }

        @Override // p067df.InterfaceC5832c
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: ff.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C6411c implements InterfaceC5834e {
        C6411c() {
        }
    }

    /* renamed from: ff.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class RunnableC6412d implements Runnable {
        RunnableC6412d() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: ff.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C6413e implements InterfaceC5832c<Throwable> {
        C6413e() {
        }

        @Override // p067df.InterfaceC5832c
        /* renamed from: a */
        public void accept(Throwable th2) {
            C10859a.m9887j(th2);
        }
    }

    /* renamed from: ff.a$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C6414f implements InterfaceC5835f<Object> {
        C6414f() {
        }
    }

    /* renamed from: ff.a$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C6415g implements InterfaceC5833d<Object, Object> {
        C6415g() {
        }

        @Override // p067df.InterfaceC5833d
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: ff.a$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C6416h implements InterfaceC5832c<InterfaceC10221c> {
        C6416h() {
        }

        @Override // p067df.InterfaceC5832c
        /* renamed from: a */
        public void accept(InterfaceC10221c interfaceC10221c) {
            interfaceC10221c.mo12120g(Long.MAX_VALUE);
        }
    }

    /* renamed from: ff.a$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C6417i implements Comparator<Object> {
        C6417i() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: ff.a$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class CallableC6418j implements Callable<Object> {
        CallableC6418j() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    /* renamed from: ff.a$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C6419k implements InterfaceC5832c<Throwable> {
        C6419k() {
        }

        @Override // p067df.InterfaceC5832c
        /* renamed from: a */
        public void accept(Throwable th2) {
            C10859a.m9887j(new C2530d(th2));
        }
    }

    /* renamed from: ff.a$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C6420l implements InterfaceC5835f<Object> {
        C6420l() {
        }
    }

    /* renamed from: a */
    public static <T> InterfaceC5833d<T, T> m22790a() {
        return (InterfaceC5833d<T, T>) f18045a;
    }
}

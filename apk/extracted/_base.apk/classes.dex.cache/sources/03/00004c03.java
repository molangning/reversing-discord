package p327ri;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* renamed from: ri.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12243b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ri.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C12244a<N> extends AbstractC12245b<N, Boolean> {

        /* renamed from: a */
        final /* synthetic */ Function1 f31844a;

        /* renamed from: b */
        final /* synthetic */ boolean[] f31845b;

        C12244a(Function1 function1, boolean[] zArr) {
            this.f31844a = function1;
            this.f31845b = zArr;
        }

        @Override // p327ri.C12243b.InterfaceC12247d
        /* renamed from: c */
        public boolean mo1489c(N n) {
            if (((Boolean) this.f31844a.invoke(n)).booleanValue()) {
                this.f31845b[0] = true;
            }
            return !this.f31845b[0];
        }

        @Override // p327ri.C12243b.InterfaceC12247d
        /* renamed from: d */
        public Boolean mo1491a() {
            return Boolean.valueOf(this.f31845b[0]);
        }
    }

    /* renamed from: ri.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static abstract class AbstractC12245b<N, R> implements InterfaceC12247d<N, R> {
        @Override // p327ri.C12243b.InterfaceC12247d
        /* renamed from: b */
        public void mo1490b(N n) {
        }
    }

    /* renamed from: ri.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public interface InterfaceC12246c<N> {
        /* renamed from: a */
        Iterable<? extends N> mo1515a(N n);
    }

    /* renamed from: ri.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public interface InterfaceC12247d<N, R> {
        /* renamed from: a */
        R mo1491a();

        /* renamed from: b */
        void mo1490b(N n);

        /* renamed from: c */
        boolean mo1489c(N n);
    }

    /* renamed from: ri.b$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public interface InterfaceC12248e<N> {
        /* renamed from: a */
        boolean mo5662a(N n);
    }

    /* renamed from: ri.b$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C12249f<N> implements InterfaceC12248e<N> {

        /* renamed from: a */
        private final Set<N> f31846a;

        public C12249f() {
            this(new HashSet());
        }

        /* renamed from: b */
        private static /* synthetic */ void m5661b(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // p327ri.C12243b.InterfaceC12248e
        /* renamed from: a */
        public boolean mo5662a(N n) {
            return this.f31846a.add(n);
        }

        public C12249f(Set<N> set) {
            if (set == null) {
                m5661b(0);
            }
            this.f31846a = set;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m5668a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static <N, R> R m5667b(Collection<N> collection, InterfaceC12246c<N> interfaceC12246c, InterfaceC12247d<N, R> interfaceC12247d) {
        if (collection == null) {
            m5668a(4);
        }
        if (interfaceC12246c == null) {
            m5668a(5);
        }
        if (interfaceC12247d == null) {
            m5668a(6);
        }
        return (R) m5666c(collection, interfaceC12246c, new C12249f(), interfaceC12247d);
    }

    /* renamed from: c */
    public static <N, R> R m5666c(Collection<N> collection, InterfaceC12246c<N> interfaceC12246c, InterfaceC12248e<N> interfaceC12248e, InterfaceC12247d<N, R> interfaceC12247d) {
        if (collection == null) {
            m5668a(0);
        }
        if (interfaceC12246c == null) {
            m5668a(1);
        }
        if (interfaceC12248e == null) {
            m5668a(2);
        }
        if (interfaceC12247d == null) {
            m5668a(3);
        }
        for (N n : collection) {
            m5665d(n, interfaceC12246c, interfaceC12248e, interfaceC12247d);
        }
        return interfaceC12247d.mo1491a();
    }

    /* renamed from: d */
    public static <N> void m5665d(N n, InterfaceC12246c<N> interfaceC12246c, InterfaceC12248e<N> interfaceC12248e, InterfaceC12247d<N, ?> interfaceC12247d) {
        if (n == null) {
            m5668a(22);
        }
        if (interfaceC12246c == null) {
            m5668a(23);
        }
        if (interfaceC12248e == null) {
            m5668a(24);
        }
        if (interfaceC12247d == null) {
            m5668a(25);
        }
        if (!interfaceC12248e.mo5662a(n) || !interfaceC12247d.mo1489c(n)) {
            return;
        }
        for (N n2 : interfaceC12246c.mo1515a(n)) {
            m5665d(n2, interfaceC12246c, interfaceC12248e, interfaceC12247d);
        }
        interfaceC12247d.mo1490b(n);
    }

    /* renamed from: e */
    public static <N> Boolean m5664e(Collection<N> collection, InterfaceC12246c<N> interfaceC12246c, Function1<N, Boolean> function1) {
        if (collection == null) {
            m5668a(7);
        }
        if (interfaceC12246c == null) {
            m5668a(8);
        }
        if (function1 == null) {
            m5668a(9);
        }
        return (Boolean) m5667b(collection, interfaceC12246c, new C12244a(function1, new boolean[1]));
    }
}
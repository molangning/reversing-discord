package p409wi;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087@\u0018\u0000 \u001b*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0012\u001b\u001aB\u0016\b\u0001\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0004J\r\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0088\u0001\u0016\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m14357d2 = {"Lwi/i;", "T", "", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "", "g", "(Ljava/lang/Object;)I", "other", "", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getHolder$annotations", "()V", "holder", "h", "(Ljava/lang/Object;)Z", "isClosed", "c", "b", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: wi.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13608i<T> {

    /* renamed from: b */
    public static final C13610b f35011b = new C13610b(null);

    /* renamed from: c */
    private static final C13611c f35012c = new C13611c();

    /* renamed from: a */
    private final Object f35013a;

    @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lwi/i$a;", "Lwi/i$c;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "Ljava/lang/Throwable;", "cause", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: wi.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13609a extends C13611c {

        /* renamed from: a */
        public final Throwable f35014a;

        public C13609a(Throwable th2) {
            this.f35014a = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C13609a) && C9612q.m13922c(this.f35014a, ((C13609a) obj).f35014a);
        }

        public int hashCode() {
            Throwable th2 = this.f35014a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // p409wi.C13608i.C13611c
        public String toString() {
            return "Closed(" + this.f35014a + ')';
        }
    }

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u0002H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m14357d2 = {"Lwi/i$b;", "", "E", "value", "Lwi/i;", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "", "cause", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lwi/i$c;", "failed", "Lwi/i$c;", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: wi.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13610b {
        private C13610b() {
        }

        public /* synthetic */ C13610b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <E> Object m2091a(Throwable th2) {
            return C13608i.m2099c(new C13609a(th2));
        }

        /* renamed from: b */
        public final <E> Object m2090b() {
            return C13608i.m2099c(C13608i.f35012c);
        }

        /* renamed from: c */
        public final <E> Object m2089c(E e) {
            return C13608i.m2099c(e);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m14357d2 = {"Lwi/i$c;", "", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: wi.i$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C13611c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ C13608i(Object obj) {
        this.f35013a = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ C13608i m2100b(Object obj) {
        return new C13608i(obj);
    }

    /* renamed from: c */
    public static <T> Object m2099c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static boolean m2098d(Object obj, Object obj2) {
        return (obj2 instanceof C13608i) && C9612q.m13922c(obj, ((C13608i) obj2).m2092j());
    }

    /* renamed from: e */
    public static final Throwable m2097e(Object obj) {
        C13609a c13609a = obj instanceof C13609a ? (C13609a) obj : null;
        if (c13609a != null) {
            return c13609a.f35014a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static final T m2096f(Object obj) {
        Throwable th2;
        if (!(obj instanceof C13611c)) {
            return obj;
        }
        if ((obj instanceof C13609a) && (th2 = ((C13609a) obj).f35014a) != null) {
            throw th2;
        }
        throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
    }

    /* renamed from: g */
    public static int m2095g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    public static final boolean m2094h(Object obj) {
        return obj instanceof C13609a;
    }

    /* renamed from: i */
    public static String m2093i(Object obj) {
        if (obj instanceof C13609a) {
            return ((C13609a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m2098d(this.f35013a, obj);
    }

    public int hashCode() {
        return m2095g(this.f35013a);
    }

    /* renamed from: j */
    public final /* synthetic */ Object m2092j() {
        return this.f35013a;
    }

    public String toString() {
        return m2093i(this.f35013a);
    }
}
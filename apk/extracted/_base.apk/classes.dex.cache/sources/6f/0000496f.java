package pf;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087@\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u001f\u001cB\u0016\b\u0001\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\rø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018\u0088\u0001\u0016\u0092\u0001\u0004\u0018\u00010\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m14357d2 = {"Lpf/s;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "", "f", "(Ljava/lang/Object;)I", "", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "j", "Ljava/lang/Object;", "getValue$annotations", "()V", "value", "h", "(Ljava/lang/Object;)Z", "isSuccess", "g", "isFailure", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "a", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pf.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11583s<T> implements Serializable {

    /* renamed from: k */
    public static final C11584a f30090k = new C11584a(null);

    /* renamed from: j */
    private final Object f30091j;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m14357d2 = {"Lpf/s$a;", "", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pf.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11584a {
        private C11584a() {
        }

        public /* synthetic */ C11584a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m14357d2 = {"Lpf/s$b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "j", "Ljava/lang/Throwable;", "exception", "<init>", "(Ljava/lang/Throwable;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pf.s$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11585b implements Serializable {

        /* renamed from: j */
        public final Throwable f30092j;

        public C11585b(Throwable exception) {
            C9612q.m13917h(exception, "exception");
            this.f30092j = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C11585b) && C9612q.m13922c(this.f30092j, ((C11585b) obj).f30092j);
        }

        public int hashCode() {
            return this.f30092j.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f30092j + ')';
        }
    }

    private /* synthetic */ C11583s(Object obj) {
        this.f30091j = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11583s m7597a(Object obj) {
        return new C11583s(obj);
    }

    /* renamed from: b */
    public static <T> Object m7596b(Object obj) {
        return obj;
    }

    /* renamed from: c */
    public static boolean m7595c(Object obj, Object obj2) {
        return (obj2 instanceof C11583s) && C9612q.m13922c(obj, ((C11583s) obj2).m7588j());
    }

    /* renamed from: d */
    public static final boolean m7594d(Object obj, Object obj2) {
        return C9612q.m13922c(obj, obj2);
    }

    /* renamed from: e */
    public static final Throwable m7593e(Object obj) {
        if (obj instanceof C11585b) {
            return ((C11585b) obj).f30092j;
        }
        return null;
    }

    /* renamed from: f */
    public static int m7592f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: g */
    public static final boolean m7591g(Object obj) {
        return obj instanceof C11585b;
    }

    /* renamed from: h */
    public static final boolean m7590h(Object obj) {
        return !(obj instanceof C11585b);
    }

    /* renamed from: i */
    public static String m7589i(Object obj) {
        if (obj instanceof C11585b) {
            return ((C11585b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m7595c(this.f30091j, obj);
    }

    public int hashCode() {
        return m7592f(this.f30091j);
    }

    /* renamed from: j */
    public final /* synthetic */ Object m7588j() {
        return this.f30091j;
    }

    public String toString() {
        return m7589i(this.f30091j);
    }
}
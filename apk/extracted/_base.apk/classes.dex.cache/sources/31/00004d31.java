package si;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m14358d1 = {"\u0000(\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000\u001a\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002\u001aE\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0011\u001a?\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a<\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00102\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b¨\u0006\u0019"}, m14357d2 = {"T", "", "Lkotlin/sequences/Sequence;", "c", "", "elements", "k", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "e", "f", "R", "Lkotlin/Function1;", "iterator", "g", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "d", "", "Lkotlin/Function0;", "nextFunction", "i", "seed", "h", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "seedFunction", "j", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/sequences/SequencesKt")
/* renamed from: si.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12545m extends C12544l {

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m14357d2 = {"si/m$a", "Lkotlin/sequences/Sequence;", "", "iterator", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: si.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12546a<T> implements Sequence<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f32590a;

        public C12546a(Iterator it) {
            this.f32590a = it;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return this.f32590a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"T", "Lkotlin/sequences/Sequence;", "it", "", "a", "(Lkotlin/sequences/Sequence;)Ljava/util/Iterator;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: si.m$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12547b<T> extends AbstractC9614s implements Function1<Sequence<? extends T>, Iterator<? extends T>> {

        /* renamed from: j */
        public static final C12547b f32591j = new C12547b();

        C12547b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Iterator<T> invoke(Sequence<? extends T> it) {
            C9612q.m13917h(it, "it");
            return (Iterator<? extends T>) it.iterator();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "T", "R", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: si.m$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12548c<T> extends AbstractC9614s implements Function1<T, T> {

        /* renamed from: j */
        public static final C12548c f32592j = new C12548c();

        C12548c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t) {
            return t;
        }
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: si.m$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12549d<T> extends AbstractC9614s implements Function1<T, T> {

        /* renamed from: j */
        final /* synthetic */ Function0<T> f32593j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C12549d(Function0<? extends T> function0) {
            super(1);
            this.f32593j = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T it) {
            C9612q.m13917h(it, "it");
            return this.f32593j.invoke();
        }
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: si.m$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12550e<T> extends AbstractC9614s implements Function0<T> {

        /* renamed from: j */
        final /* synthetic */ T f32594j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12550e(T t) {
            super(0);
            this.f32594j = t;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return this.f32594j;
        }
    }

    /* renamed from: c */
    public static <T> Sequence<T> m4881c(Iterator<? extends T> it) {
        Sequence<T> m4880d;
        C9612q.m13917h(it, "<this>");
        m4880d = m4880d(new C12546a(it));
        return m4880d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static <T> Sequence<T> m4880d(Sequence<? extends T> sequence) {
        C9612q.m13917h(sequence, "<this>");
        if (!(sequence instanceof C12528a)) {
            return new C12528a(sequence);
        }
        return sequence;
    }

    /* renamed from: e */
    public static <T> Sequence<T> m4879e() {
        return C12532d.f32566a;
    }

    /* renamed from: f */
    public static final <T> Sequence<T> m4878f(Sequence<? extends Sequence<? extends T>> sequence) {
        C9612q.m13917h(sequence, "<this>");
        return m4877g(sequence, C12547b.f32591j);
    }

    /* renamed from: g */
    private static final <T, R> Sequence<R> m4877g(Sequence<? extends T> sequence, Function1<? super T, ? extends Iterator<? extends R>> function1) {
        if (sequence instanceof C12558q) {
            return ((C12558q) sequence).m4842d(function1);
        }
        return new C12535f(sequence, C12548c.f32592j, function1);
    }

    /* renamed from: h */
    public static <T> Sequence<T> m4876h(T t, Function1<? super T, ? extends T> nextFunction) {
        C9612q.m13917h(nextFunction, "nextFunction");
        if (t == null) {
            return C12532d.f32566a;
        }
        return new C12537g(new C12550e(t), nextFunction);
    }

    /* renamed from: i */
    public static <T> Sequence<T> m4875i(Function0<? extends T> nextFunction) {
        Sequence<T> m4880d;
        C9612q.m13917h(nextFunction, "nextFunction");
        m4880d = m4880d(new C12537g(nextFunction, new C12549d(nextFunction)));
        return m4880d;
    }

    /* renamed from: j */
    public static <T> Sequence<T> m4874j(Function0<? extends T> seedFunction, Function1<? super T, ? extends T> nextFunction) {
        C9612q.m13917h(seedFunction, "seedFunction");
        C9612q.m13917h(nextFunction, "nextFunction");
        return new C12537g(seedFunction, nextFunction);
    }

    /* renamed from: k */
    public static final <T> Sequence<T> m4873k(T... elements) {
        boolean z;
        Sequence<T> m14198u;
        Sequence<T> m4879e;
        C9612q.m13917h(elements, "elements");
        if (elements.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m4879e = m4879e();
            return m4879e;
        }
        m14198u = C9538f.m14198u(elements);
        return m14198u;
    }
}
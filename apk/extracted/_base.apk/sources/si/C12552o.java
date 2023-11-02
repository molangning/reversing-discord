package si;

import cg.InterfaceC2533a;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import kotlin.text.C9643g;
import p304qf.C11894z;

@Metadata(m14358d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0003\u001a$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00020\u0005\u001a0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u001a0\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u001a\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\r*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001a0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u001a7\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u000f*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a<\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\b\u001a6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u001a<\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0018*\u00020\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\b\u001a\u0016\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a,\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\u0005H\u0007\u001a.\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b \u0010!\u001a-\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0086\u0002\u001a@\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\tH\u0007\u001a}\u00101\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010$*\u00060(j\u0002`)*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010*\u001a\u00028\u00012\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020+2\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020+\u0018\u00010\b¢\u0006\u0004\b1\u00102\u001a`\u00104\u001a\u000203\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020+2\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020+\u0018\u00010\b\u001a\u001c\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u00066"}, m14357d2 = {"T", "Lkotlin/sequences/Sequence;", "s", "(Lkotlin/sequences/Sequence;)Ljava/lang/Object;", "x", "", "n", "o", "Lkotlin/Function1;", "", "predicate", "p", "q", "", "r", "C", "", "destination", "D", "(Lkotlin/sequences/Sequence;Ljava/util/Collection;)Ljava/util/Collection;", "", "E", "", "F", "R", ViewProps.TRANSFORM, "t", "y", "z", "size", "m", "element", "B", "(Lkotlin/sequences/Sequence;Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "", "elements", "A", "step", "partialWindows", "G", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "u", "(Lkotlin/sequences/Sequence;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "v", "l", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/sequences/SequencesKt")
/* renamed from: si.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12552o extends C12551n {

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m14357d2 = {"si/o$a", "", "", "iterator", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: si.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12553a<T> implements Iterable<T>, InterfaceC2533a {

        /* renamed from: j */
        final /* synthetic */ Sequence f32595j;

        public C12553a(Sequence sequence) {
            this.f32595j = sequence;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f32595j.iterator();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"", "T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: si.o$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12554b<T> extends AbstractC9614s implements Function1<T, Boolean> {

        /* renamed from: j */
        public static final C12554b f32596j = new C12554b();

        C12554b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(T t) {
            return Boolean.valueOf(t == null);
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: si.o$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C12555c<R> extends C9609n implements Function1<Sequence<? extends R>, Iterator<? extends R>> {

        /* renamed from: j */
        public static final C12555c f32597j = new C12555c();

        C12555c() {
            super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final Iterator<R> invoke(Sequence<? extends R> p0) {
            C9612q.m13917h(p0, "p0");
            return (Iterator<? extends R>) p0.iterator();
        }
    }

    /* renamed from: A */
    public static <T> Sequence<T> m4871A(Sequence<? extends T> sequence, Iterable<? extends T> elements) {
        Sequence m14066K;
        C9612q.m13917h(sequence, "<this>");
        C9612q.m13917h(elements, "elements");
        m14066K = C9553r.m14066K(elements);
        return C12545m.m4878f(C12545m.m4873k(sequence, m14066K));
    }

    /* renamed from: B */
    public static <T> Sequence<T> m4870B(Sequence<? extends T> sequence, T t) {
        C9612q.m13917h(sequence, "<this>");
        return C12545m.m4878f(C12545m.m4873k(sequence, C12545m.m4873k(t)));
    }

    /* renamed from: C */
    public static <T> Sequence<T> m4869C(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        C9612q.m13917h(sequence, "<this>");
        C9612q.m13917h(predicate, "predicate");
        return new C12556p(sequence, predicate);
    }

    /* renamed from: D */
    public static final <T, C extends Collection<? super T>> C m4868D(Sequence<? extends T> sequence, C destination) {
        C9612q.m13917h(sequence, "<this>");
        C9612q.m13917h(destination, "destination");
        for (T t : sequence) {
            destination.add(t);
        }
        return destination;
    }

    /* renamed from: E */
    public static <T> List<T> m4867E(Sequence<? extends T> sequence) {
        List m4866F;
        List<T> m14097p;
        C9612q.m13917h(sequence, "<this>");
        m4866F = m4866F(sequence);
        m14097p = C9545j.m14097p(m4866F);
        return m14097p;
    }

    /* renamed from: F */
    public static <T> List<T> m4866F(Sequence<? extends T> sequence) {
        C9612q.m13917h(sequence, "<this>");
        return (List) m4868D(sequence, new ArrayList());
    }

    /* renamed from: G */
    public static final <T> Sequence<List<T>> m4865G(Sequence<? extends T> sequence, int i, int i2, boolean z) {
        C9612q.m13917h(sequence, "<this>");
        return C11894z.m6730c(sequence, i, i2, z, false);
    }

    /* renamed from: l */
    public static <T> Iterable<T> m4864l(Sequence<? extends T> sequence) {
        C9612q.m13917h(sequence, "<this>");
        return new C12553a(sequence);
    }

    /* renamed from: m */
    public static <T> Sequence<List<T>> m4863m(Sequence<? extends T> sequence, int i) {
        C9612q.m13917h(sequence, "<this>");
        return m4865G(sequence, i, i, true);
    }

    /* renamed from: n */
    public static <T> int m4862n(Sequence<? extends T> sequence) {
        C9612q.m13917h(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                C9545j.m14095r();
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static <T> Sequence<T> m4861o(Sequence<? extends T> sequence, int i) {
        boolean z;
        C9612q.m13917h(sequence, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i != 0) {
                if (sequence instanceof InterfaceC12531c) {
                    return ((InterfaceC12531c) sequence).mo4926a(i);
                }
                return new C12529b(sequence, i);
            }
            return sequence;
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: p */
    public static <T> Sequence<T> m4860p(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        C9612q.m13917h(sequence, "<this>");
        C9612q.m13917h(predicate, "predicate");
        return new C12533e(sequence, true, predicate);
    }

    /* renamed from: q */
    public static <T> Sequence<T> m4859q(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        C9612q.m13917h(sequence, "<this>");
        C9612q.m13917h(predicate, "predicate");
        return new C12533e(sequence, false, predicate);
    }

    /* renamed from: r */
    public static <T> Sequence<T> m4858r(Sequence<? extends T> sequence) {
        Sequence<T> m4859q;
        C9612q.m13917h(sequence, "<this>");
        m4859q = m4859q(sequence, C12554b.f32596j);
        C9612q.m13919f(m4859q, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return m4859q;
    }

    /* renamed from: s */
    public static <T> T m4857s(Sequence<? extends T> sequence) {
        C9612q.m13917h(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: t */
    public static <T, R> Sequence<R> m4856t(Sequence<? extends T> sequence, Function1<? super T, ? extends Sequence<? extends R>> transform) {
        C9612q.m13917h(sequence, "<this>");
        C9612q.m13917h(transform, "transform");
        return new C12535f(sequence, transform, C12555c.f32597j);
    }

    /* renamed from: u */
    public static final <T, A extends Appendable> A m4855u(Sequence<? extends T> sequence, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        C9612q.m13917h(sequence, "<this>");
        C9612q.m13917h(buffer, "buffer");
        C9612q.m13917h(separator, "separator");
        C9612q.m13917h(prefix, "prefix");
        C9612q.m13917h(postfix, "postfix");
        C9612q.m13917h(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (T t : sequence) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C9643g.m13783a(buffer, t, function1);
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: v */
    public static final <T> String m4854v(Sequence<? extends T> sequence, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        C9612q.m13917h(sequence, "<this>");
        C9612q.m13917h(separator, "separator");
        C9612q.m13917h(prefix, "prefix");
        C9612q.m13917h(postfix, "postfix");
        C9612q.m13917h(truncated, "truncated");
        String sb2 = ((StringBuilder) m4855u(sequence, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
        C9612q.m13918g(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: w */
    public static /* synthetic */ String m4853w(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return m4854v(sequence, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    /* renamed from: x */
    public static <T> T m4852x(Sequence<? extends T> sequence) {
        C9612q.m13917h(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* renamed from: y */
    public static <T, R> Sequence<R> m4851y(Sequence<? extends T> sequence, Function1<? super T, ? extends R> transform) {
        C9612q.m13917h(sequence, "<this>");
        C9612q.m13917h(transform, "transform");
        return new C12558q(sequence, transform);
    }

    /* renamed from: z */
    public static <T, R> Sequence<R> m4850z(Sequence<? extends T> sequence, Function1<? super T, ? extends R> transform) {
        Sequence<R> m4858r;
        C9612q.m13917h(sequence, "<this>");
        C9612q.m13917h(transform, "transform");
        m4858r = m4858r(new C12558q(sequence, transform));
        return m4858r;
    }
}

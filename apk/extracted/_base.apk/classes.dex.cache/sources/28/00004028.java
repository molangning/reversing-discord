package kotlin.text;

import cg.InterfaceC2533a;
import gg.C6759j;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012&\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00100\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR4\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m14357d2 = {"Lkotlin/text/d;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "", "iterator", "", "a", "Ljava/lang/CharSequence;", "input", "", "b", "I", "startIndex", "c", "limit", "Lkotlin/Function2;", "Lkotlin/Pair;", "d", "Lkotlin/jvm/functions/Function2;", "getNextMatch", "<init>", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlin.text.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9639d implements Sequence<IntRange> {

    /* renamed from: a */
    private final CharSequence f25378a;

    /* renamed from: b */
    private final int f25379b;

    /* renamed from: c */
    private final int f25380c;

    /* renamed from: d */
    private final Function2<CharSequence, Integer, Pair<Integer, Integer>> f25381d;

    @Metadata(m14358d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0002R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u0017\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000e¨\u0006#"}, m14357d2 = {"kotlin/text/d$a", "", "Lkotlin/ranges/IntRange;", "", "a", "e", "", "hasNext", "", "j", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "k", "getCurrentStartIndex", "setCurrentStartIndex", "currentStartIndex", "l", "getNextSearchIndex", "setNextSearchIndex", "nextSearchIndex", "m", "Lkotlin/ranges/IntRange;", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextItem", "n", "getCounter", "setCounter", "counter", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.text.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9640a implements Iterator<IntRange>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private int f25382j = -1;

        /* renamed from: k */
        private int f25383k;

        /* renamed from: l */
        private int f25384l;

        /* renamed from: m */
        private IntRange f25385m;

        /* renamed from: n */
        private int f25386n;

        C9640a() {
            int m21923j;
            C9639d.this = r3;
            m21923j = C6759j.m21923j(r3.f25379b, 0, r3.f25378a.length());
            this.f25383k = m21923j;
            this.f25384l = m21923j;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0021, code lost:
            if (r0 < kotlin.text.C9639d.this.f25380c) goto L13;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m13843a() {
            /*
                r6 = this;
                int r0 = r6.f25384l
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f25382j = r1
                r0 = 0
                r6.f25385m = r0
                goto L9e
            Lc:
                kotlin.text.d r0 = kotlin.text.C9639d.this
                int r0 = kotlin.text.C9639d.m13845d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f25386n
                int r0 = r0 + r3
                r6.f25386n = r0
                kotlin.text.d r4 = kotlin.text.C9639d.this
                int r4 = kotlin.text.C9639d.m13845d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f25384l
                kotlin.text.d r4 = kotlin.text.C9639d.this
                java.lang.CharSequence r4 = kotlin.text.C9639d.m13846c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
                int r1 = r6.f25383k
                kotlin.text.d r4 = kotlin.text.C9639d.this
                java.lang.CharSequence r4 = kotlin.text.C9639d.m13846c(r4)
                int r4 = kotlin.text.C9642f.m13822T(r4)
                r0.<init>(r1, r4)
                r6.f25385m = r0
                r6.f25384l = r2
                goto L9c
            L47:
                kotlin.text.d r0 = kotlin.text.C9639d.this
                kotlin.jvm.functions.Function2 r0 = kotlin.text.C9639d.m13847b(r0)
                kotlin.text.d r4 = kotlin.text.C9639d.this
                java.lang.CharSequence r4 = kotlin.text.C9639d.m13846c(r4)
                int r5 = r6.f25384l
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L77
                kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
                int r1 = r6.f25383k
                kotlin.text.d r4 = kotlin.text.C9639d.this
                java.lang.CharSequence r4 = kotlin.text.C9639d.m13846c(r4)
                int r4 = kotlin.text.C9642f.m13822T(r4)
                r0.<init>(r1, r4)
                r6.f25385m = r0
                r6.f25384l = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.m14351a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m14350b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f25383k
                kotlin.ranges.IntRange r4 = gg.C6757h.m21933q(r4, r2)
                r6.f25385m = r4
                int r2 = r2 + r0
                r6.f25383k = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f25384l = r2
            L9c:
                r6.f25382j = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C9639d.C9640a.m13843a():void");
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: e */
        public IntRange next() {
            if (this.f25382j == -1) {
                m13843a();
            }
            if (this.f25382j != 0) {
                IntRange intRange = this.f25385m;
                C9612q.m13919f(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f25385m = null;
                this.f25382j = -1;
                return intRange;
            }
            throw new NoSuchElementException();
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super IntRange> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            if (this.f25382j == -1) {
                m13843a();
            }
            if (this.f25382j == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9639d(CharSequence input, int i, int i2, Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> getNextMatch) {
        C9612q.m13917h(input, "input");
        C9612q.m13917h(getNextMatch, "getNextMatch");
        this.f25378a = input;
        this.f25379b = i;
        this.f25380c = i2;
        this.f25381d = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<IntRange> iterator() {
        return new C9640a();
    }
}
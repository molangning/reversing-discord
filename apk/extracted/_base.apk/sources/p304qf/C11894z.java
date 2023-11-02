package p304qf;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9577j;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import si.AbstractC12540i;
import si.C12542k;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010(\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001aD\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0006\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000\u001aH\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\f\"\u0004\b\u0000\u0010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¨\u0006\u000f"}, m14357d2 = {"", "size", "step", "", "a", "T", "Lkotlin/sequences/Sequence;", "", "partialWindows", "reuseBuffer", "", "c", "", "iterator", "b", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: qf.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11894z {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, m14357d2 = {"T", "Lsi/i;", "", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m13986f = "SlidingWindow.kt", m13985l = {34, 40, 49, 55, 58}, m13984m = "invokeSuspend")
    /* renamed from: qf.z$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11895a<T> extends AbstractC9577j implements Function2<AbstractC12540i<? super List<? extends T>>, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        Object f30886k;

        /* renamed from: l */
        Object f30887l;

        /* renamed from: m */
        int f30888m;

        /* renamed from: n */
        int f30889n;

        /* renamed from: o */
        private /* synthetic */ Object f30890o;

        /* renamed from: p */
        final /* synthetic */ int f30891p;

        /* renamed from: q */
        final /* synthetic */ int f30892q;

        /* renamed from: r */
        final /* synthetic */ Iterator<T> f30893r;

        /* renamed from: s */
        final /* synthetic */ boolean f30894s;

        /* renamed from: t */
        final /* synthetic */ boolean f30895t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C11895a(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, Continuation<? super C11895a> continuation) {
            super(2, continuation);
            this.f30891p = i;
            this.f30892q = i2;
            this.f30893r = it;
            this.f30894s = z;
            this.f30895t = z2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b */
        public final Object invoke(AbstractC12540i<? super List<? extends T>> abstractC12540i, Continuation<? super Unit> continuation) {
            return ((C11895a) create(abstractC12540i, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11895a c11895a = new C11895a(this.f30891p, this.f30892q, this.f30893r, this.f30894s, this.f30895t, continuation);
            c11895a.f30890o = obj;
            return c11895a;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00dc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a6 -> B:16:0x0058). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x011d -> B:59:0x0120). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x014b -> B:72:0x014e). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 365
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p304qf.C11894z.C11895a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m14357d2 = {"qf/z$b", "Lkotlin/sequences/Sequence;", "", "iterator", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: qf.z$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11896b<T> implements Sequence<List<? extends T>> {

        /* renamed from: a */
        final /* synthetic */ Sequence f30896a;

        /* renamed from: b */
        final /* synthetic */ int f30897b;

        /* renamed from: c */
        final /* synthetic */ int f30898c;

        /* renamed from: d */
        final /* synthetic */ boolean f30899d;

        /* renamed from: e */
        final /* synthetic */ boolean f30900e;

        public C11896b(Sequence sequence, int i, int i2, boolean z, boolean z2) {
            this.f30896a = sequence;
            this.f30897b = i;
            this.f30898c = i2;
            this.f30899d = z;
            this.f30900e = z2;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<List<? extends T>> iterator() {
            return C11894z.m6731b(this.f30896a.iterator(), this.f30897b, this.f30898c, this.f30899d, this.f30900e);
        }
    }

    /* renamed from: a */
    public static final void m6732a(int i, int i2) {
        boolean z;
        String str;
        if (i > 0 && i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (i != i2) {
                str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                str = "size " + i + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    /* renamed from: b */
    public static final <T> Iterator<List<T>> m6731b(Iterator<? extends T> iterator, int i, int i2, boolean z, boolean z2) {
        Iterator<List<T>> m4883a;
        C9612q.m13917h(iterator, "iterator");
        if (!iterator.hasNext()) {
            return C11875h.f30870j;
        }
        m4883a = C12542k.m4883a(new C11895a(i, i2, iterator, z2, z, null));
        return m4883a;
    }

    /* renamed from: c */
    public static final <T> Sequence<List<T>> m6730c(Sequence<? extends T> sequence, int i, int i2, boolean z, boolean z2) {
        C9612q.m13917h(sequence, "<this>");
        m6732a(i, i2);
        return new C11896b(sequence, i, i2, z, z2);
    }
}

package p324rf;

import cg.InterfaceC2533a;
import gg.C6759j;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9533b;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;
import p304qf.AbstractC11883p;

@Metadata(m14358d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\r\b\u0000\u0018\u0000 \u001a*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006xyz{|}BG\b\u0002\u0012\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f\u0012\u0006\u0010O\u001a\u00020M\u0012\u0006\u0010P\u001a\u00020M\u0012\u0006\u0010Q\u001a\u00020\u0006\u0012\u0006\u0010R\u001a\u00020\u0006¢\u0006\u0004\bt\u0010uB\t\b\u0016¢\u0006\u0004\bt\u0010:B\u0011\b\u0016\u0012\u0006\u0010v\u001a\u00020\u0006¢\u0006\u0004\bt\u0010wJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\bH\u0002J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\u0018\u0010!\u001a\u00020\u00162\u000e\u0010 \u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001fH\u0002J\u001c\u0010$\u001a\u00020\u00162\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0002J\"\u0010'\u001a\u00020\u00162\u0018\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"0%H\u0002J\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fJ\b\u0010)\u001a\u00020\u0016H\u0016J\u0017\u0010*\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0004\b,\u0010+J\u001a\u0010-\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0004\b/\u00100J\u001e\u00101\u001a\u00020\b2\u0014\u0010&\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fH\u0016J\u0019\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b2\u0010.J\b\u00103\u001a\u00020\bH\u0016J\u0013\u00105\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u000104H\u0096\u0002J\b\u00106\u001a\u00020\u0006H\u0016J\b\u00108\u001a\u000207H\u0016J\u000f\u00109\u001a\u00020\bH\u0000¢\u0006\u0004\b9\u0010:J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0011J#\u0010;\u001a\u00020\u00162\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0000¢\u0006\u0004\b;\u0010<J\u001b\u0010\u0007\u001a\u00020\u00162\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030%H\u0000¢\u0006\u0004\b\u0007\u0010=J#\u0010>\u001a\u00020\u00162\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0000¢\u0006\u0004\b>\u0010<J\u0017\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00028\u0001H\u0000¢\u0006\u0004\b@\u0010+J\u001b\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010AH\u0000¢\u0006\u0004\bB\u0010CJ\u001b\u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010DH\u0000¢\u0006\u0004\bE\u0010FJ\u001b\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010GH\u0000¢\u0006\u0004\bH\u0010IR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010JR\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010JR\u0016\u0010O\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010NR\u0016\u0010P\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010NR\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0016\u0010R\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010>R\u0016\u0010S\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010>R$\u0010X\u001a\u00020\u00062\u0006\u0010T\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bU\u0010>\u001a\u0004\bV\u0010WR\u001e\u0010[\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010ZR\u001e\u0010^\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010]R$\u0010a\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010`R$\u0010e\u001a\u00020\u00162\u0006\u0010T\u001a\u00020\u00168\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0018\u0010b\u001a\u0004\bc\u0010dR\u0014\u0010\n\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010WR\u0014\u0010h\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010WR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000i8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00010m8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR&\u0010s\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010q0i8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010k¨\u0006~"}, m14357d2 = {"Lrf/d;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "n", "", "s", "capacity", "r", "", "j", "()[Ljava/lang/Object;", "key", "C", "(Ljava/lang/Object;)I", "m", "newHashSize", "H", "i", "", "G", "u", "value", "v", "index", "L", "removedHash", "J", "", "other", "p", "", "entry", "F", "", "from", "E", "k", "isEmpty", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "clear", "", "equals", "hashCode", "", "toString", "l", "()V", "o", "(Ljava/util/Map$Entry;)Z", "(Ljava/util/Collection;)Z", "I", "element", "M", "Lrf/d$e;", "D", "()Lrf/d$e;", "Lrf/d$f;", "N", "()Lrf/d$f;", "Lrf/d$b;", "t", "()Lrf/d$b;", "[Ljava/lang/Object;", "keysArray", "valuesArray", "", "[I", "presenceArray", "hashArray", "maxProbeDistance", "length", "hashShift", "<set-?>", "q", "A", "()I", "size", "Lrf/f;", "Lrf/f;", "keysView", "Lrf/g;", "Lrf/g;", "valuesView", "Lrf/e;", "Lrf/e;", "entriesView", "Z", "isReadOnly$kotlin_stdlib", "()Z", "isReadOnly", "w", "y", "hashSize", "", "z", "()Ljava/util/Set;", "keys", "", "B", "()Ljava/util/Collection;", "values", "", "x", "entries", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "initialCapacity", "(I)V", "a", "b", "c", "d", "e", "f", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: rf.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12136d<K, V> implements Map<K, V>, Serializable, InterfaceC2533a {

    /* renamed from: v */
    private static final C12137a f31560v = new C12137a(null);

    /* renamed from: j */
    private K[] f31561j;

    /* renamed from: k */
    private V[] f31562k;

    /* renamed from: l */
    private int[] f31563l;

    /* renamed from: m */
    private int[] f31564m;

    /* renamed from: n */
    private int f31565n;

    /* renamed from: o */
    private int f31566o;

    /* renamed from: p */
    private int f31567p;

    /* renamed from: q */
    private int f31568q;

    /* renamed from: r */
    private C12144f<K> f31569r;

    /* renamed from: s */
    private C12145g<V> f31570s;

    /* renamed from: t */
    private C12143e<K, V> f31571t;

    /* renamed from: u */
    private boolean f31572u;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, m14357d2 = {"Lrf/d$a;", "", "", "capacity", "c", "hashSize", "d", "INITIAL_CAPACITY", "I", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: rf.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12137a {
        private C12137a() {
        }

        public /* synthetic */ C12137a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final int m6063c(int i) {
            int m21930c;
            m21930c = C6759j.m21930c(i, 1);
            return Integer.highestOneBit(m21930c * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final int m6062d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }
    }

    @Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006H\u0096\u0002J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\f¨\u0006\u0014"}, m14357d2 = {"Lrf/d$b;", "K", "V", "Lrf/d$d;", "", "", "Lrf/d$c;", "j", "", "l", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "", "k", "Lrf/d;", "map", "<init>", "(Lrf/d;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: rf.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12138b<K, V> extends C12140d<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC2533a, p164j$.util.Iterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12138b(C12136d<K, V> map) {
            super(map);
            C9612q.m13917h(map, "map");
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: j */
        public C12139c<K, V> next() {
            if (m6058a() < ((C12136d) m6056f()).f31566o) {
                int m6058a = m6058a();
                m6054h(m6058a + 1);
                m6053i(m6058a);
                C12139c<K, V> c12139c = new C12139c<>(m6056f(), m6057e());
                m6055g();
                return c12139c;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: k */
        public final void m6060k(StringBuilder sb2) {
            C9612q.m13917h(sb2, "sb");
            if (m6058a() < ((C12136d) m6056f()).f31566o) {
                int m6058a = m6058a();
                m6054h(m6058a + 1);
                m6053i(m6058a);
                Object obj = ((C12136d) m6056f()).f31561j[m6057e()];
                if (C9612q.m13922c(obj, m6056f())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] objArr = ((C12136d) m6056f()).f31562k;
                C9612q.m13920e(objArr);
                Object obj2 = objArr[m6057e()];
                if (C9612q.m13922c(obj2, m6056f())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                m6055g();
                return;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: l */
        public final int m6059l() {
            int i;
            if (m6058a() < ((C12136d) m6056f()).f31566o) {
                int m6058a = m6058a();
                m6054h(m6058a + 1);
                m6053i(m6058a);
                Object obj = ((C12136d) m6056f()).f31561j[m6057e()];
                int i2 = 0;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] objArr = ((C12136d) m6056f()).f31562k;
                C9612q.m13920e(objArr);
                Object obj2 = objArr[m6057e()];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                }
                int i3 = i ^ i2;
                m6055g();
                return i3;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, m14357d2 = {"Lrf/d$c;", "K", "V", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lrf/d;", "j", "Lrf/d;", "map", "k", "I", "index", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "<init>", "(Lrf/d;I)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: rf.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12139c<K, V> implements Map.Entry<K, V>, InterfaceC2533a {

        /* renamed from: j */
        private final C12136d<K, V> f31573j;

        /* renamed from: k */
        private final int f31574k;

        public C12139c(C12136d<K, V> map, int i) {
            C9612q.m13917h(map, "map");
            this.f31573j = map;
            this.f31574k = i;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (C9612q.m13922c(entry.getKey(), getKey()) && C9612q.m13922c(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((C12136d) this.f31573j).f31561j[this.f31574k];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((C12136d) this.f31573j).f31562k;
            C9612q.m13920e(objArr);
            return (V) objArr[this.f31574k];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            this.f31573j.m6079l();
            Object[] m6081j = this.f31573j.m6081j();
            int i = this.f31574k;
            V v2 = (V) m6081j[i];
            m6081j[i] = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    @Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0004R&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001e"}, m14357d2 = {"Lrf/d$d;", "K", "V", "", "", "g", "()V", "", "hasNext", "remove", "Lrf/d;", "j", "Lrf/d;", "f", "()Lrf/d;", "map", "", "k", "I", "a", "()I", "h", "(I)V", "index", "l", "e", "i", "lastIndex", "<init>", "(Lrf/d;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: rf.d$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C12140d<K, V> {

        /* renamed from: j */
        private final C12136d<K, V> f31575j;

        /* renamed from: k */
        private int f31576k;

        /* renamed from: l */
        private int f31577l;

        public C12140d(C12136d<K, V> map) {
            C9612q.m13917h(map, "map");
            this.f31575j = map;
            this.f31577l = -1;
            m6055g();
        }

        /* renamed from: a */
        public final int m6058a() {
            return this.f31576k;
        }

        /* renamed from: e */
        public final int m6057e() {
            return this.f31577l;
        }

        /* renamed from: f */
        public final C12136d<K, V> m6056f() {
            return this.f31575j;
        }

        /* renamed from: g */
        public final void m6055g() {
            while (this.f31576k < ((C12136d) this.f31575j).f31566o) {
                int[] iArr = ((C12136d) this.f31575j).f31563l;
                int i = this.f31576k;
                if (iArr[i] < 0) {
                    this.f31576k = i + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: h */
        public final void m6054h(int i) {
            this.f31576k = i;
        }

        public final boolean hasNext() {
            return this.f31576k < ((C12136d) this.f31575j).f31566o;
        }

        /* renamed from: i */
        public final void m6053i(int i) {
            this.f31577l = i;
        }

        public final void remove() {
            boolean z;
            if (this.f31577l != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f31575j.m6079l();
                this.f31575j.m6091L(this.f31577l);
                this.f31577l = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m14357d2 = {"Lrf/d$e;", "K", "V", "Lrf/d$d;", "", "next", "()Ljava/lang/Object;", "Lrf/d;", "map", "<init>", "(Lrf/d;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: rf.d$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12141e<K, V> extends C12140d<K, V> implements java.util.Iterator<K>, InterfaceC2533a, p164j$.util.Iterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12141e(C12136d<K, V> map) {
            super(map);
            C9612q.m13917h(map, "map");
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public K next() {
            if (m6058a() < ((C12136d) m6056f()).f31566o) {
                int m6058a = m6058a();
                m6054h(m6058a + 1);
                m6053i(m6058a);
                K k = (K) ((C12136d) m6056f()).f31561j[m6057e()];
                m6055g();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m14357d2 = {"Lrf/d$f;", "K", "V", "Lrf/d$d;", "", "next", "()Ljava/lang/Object;", "Lrf/d;", "map", "<init>", "(Lrf/d;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: rf.d$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12142f<K, V> extends C12140d<K, V> implements java.util.Iterator<V>, InterfaceC2533a, p164j$.util.Iterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12142f(C12136d<K, V> map) {
            super(map);
            C9612q.m13917h(map, "map");
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public V next() {
            if (m6058a() < ((C12136d) m6056f()).f31566o) {
                int m6058a = m6058a();
                m6054h(m6058a + 1);
                m6053i(m6058a);
                Object[] objArr = ((C12136d) m6056f()).f31562k;
                C9612q.m13920e(objArr);
                V v = (V) objArr[m6057e()];
                m6055g();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    private C12136d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.f31561j = kArr;
        this.f31562k = vArr;
        this.f31563l = iArr;
        this.f31564m = iArr2;
        this.f31565n = i;
        this.f31566o = i2;
        this.f31567p = f31560v.m6062d(m6067y());
    }

    /* renamed from: C */
    private final int m6100C(K k) {
        return ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.f31567p;
    }

    /* renamed from: E */
    private final boolean m6098E(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        m6073s(collection.size());
        for (Map.Entry<? extends K, ? extends V> entry : collection) {
            if (m6097F(entry)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: F */
    private final boolean m6097F(Map.Entry<? extends K, ? extends V> entry) {
        int m6082i = m6082i(entry.getKey());
        V[] m6081j = m6081j();
        if (m6082i >= 0) {
            m6081j[m6082i] = entry.getValue();
            return true;
        }
        int i = (-m6082i) - 1;
        if (!C9612q.m13922c(entry.getValue(), m6081j[i])) {
            m6081j[i] = entry.getValue();
            return true;
        }
        return false;
    }

    /* renamed from: G */
    private final boolean m6096G(int i) {
        int m6100C = m6100C(this.f31561j[i]);
        int i2 = this.f31565n;
        while (true) {
            int[] iArr = this.f31564m;
            if (iArr[m6100C] == 0) {
                iArr[m6100C] = i + 1;
                this.f31563l[i] = m6100C;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            int i3 = m6100C - 1;
            if (m6100C == 0) {
                m6100C = m6067y() - 1;
            } else {
                m6100C = i3;
            }
        }
    }

    /* renamed from: H */
    private final void m6095H(int i) {
        if (this.f31566o > size()) {
            m6078m();
        }
        int i2 = 0;
        if (i != m6067y()) {
            this.f31564m = new int[i];
            this.f31567p = f31560v.m6062d(i);
        } else {
            C9533b.m14304k(this.f31564m, 0, 0, m6067y());
        }
        while (i2 < this.f31566o) {
            int i3 = i2 + 1;
            if (m6096G(i2)) {
                i2 = i3;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* renamed from: J */
    private final void m6093J(int i) {
        int m21926g;
        m21926g = C6759j.m21926g(this.f31565n * 2, m6067y() / 2);
        int i2 = m21926g;
        int i3 = 0;
        int i4 = i;
        do {
            int i5 = i - 1;
            if (i == 0) {
                i = m6067y() - 1;
            } else {
                i = i5;
            }
            i3++;
            if (i3 > this.f31565n) {
                this.f31564m[i4] = 0;
                return;
            }
            int[] iArr = this.f31564m;
            int i6 = iArr[i];
            if (i6 == 0) {
                iArr[i4] = 0;
                return;
            }
            if (i6 < 0) {
                iArr[i4] = -1;
            } else {
                int i7 = i6 - 1;
                if (((m6100C(this.f31561j[i7]) - i) & (m6067y() - 1)) >= i3) {
                    this.f31564m[i4] = i6;
                    this.f31563l[i7] = i4;
                }
                i2--;
            }
            i4 = i;
            i3 = 0;
            i2--;
        } while (i2 >= 0);
        this.f31564m[i4] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final void m6091L(int i) {
        C12135c.m6107f(this.f31561j, i);
        m6093J(this.f31563l[i]);
        this.f31563l[i] = -1;
        this.f31568q = size() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final V[] m6081j() {
        V[] vArr = this.f31562k;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) C12135c.m6109d(m6069w());
        this.f31562k = vArr2;
        return vArr2;
    }

    /* renamed from: m */
    private final void m6078m() {
        int i;
        V[] vArr = this.f31562k;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f31566o;
            if (i2 >= i) {
                break;
            }
            if (this.f31563l[i2] >= 0) {
                K[] kArr = this.f31561j;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                i3++;
            }
            i2++;
        }
        C12135c.m6106g(this.f31561j, i3, i);
        if (vArr != null) {
            C12135c.m6106g(vArr, i3, this.f31566o);
        }
        this.f31566o = i3;
    }

    /* renamed from: p */
    private final boolean m6075p(Map<?, ?> map) {
        return size() == map.size() && m6077n(map.entrySet());
    }

    /* renamed from: r */
    private final void m6074r(int i) {
        V[] vArr;
        if (i >= 0) {
            if (i > m6069w()) {
                int m6069w = (m6069w() * 3) / 2;
                if (i <= m6069w) {
                    i = m6069w;
                }
                this.f31561j = (K[]) C12135c.m6108e(this.f31561j, i);
                V[] vArr2 = this.f31562k;
                if (vArr2 != null) {
                    vArr = (V[]) C12135c.m6108e(vArr2, i);
                } else {
                    vArr = null;
                }
                this.f31562k = vArr;
                int[] copyOf = Arrays.copyOf(this.f31563l, i);
                C9612q.m13918g(copyOf, "copyOf(this, newSize)");
                this.f31563l = copyOf;
                int m6063c = f31560v.m6063c(i);
                if (m6063c > m6067y()) {
                    m6095H(m6063c);
                    return;
                }
                return;
            } else if ((this.f31566o + i) - size() > m6069w()) {
                m6095H(m6067y());
                return;
            } else {
                return;
            }
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: s */
    private final void m6073s(int i) {
        m6074r(this.f31566o + i);
    }

    /* renamed from: u */
    private final int m6071u(K k) {
        int m6100C = m6100C(k);
        int i = this.f31565n;
        while (true) {
            int i2 = this.f31564m[m6100C];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (C9612q.m13922c(this.f31561j[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = m6100C - 1;
            if (m6100C == 0) {
                m6100C = m6067y() - 1;
            } else {
                m6100C = i4;
            }
        }
    }

    /* renamed from: v */
    private final int m6070v(V v) {
        int i = this.f31566o;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f31563l[i] >= 0) {
                V[] vArr = this.f31562k;
                C9612q.m13920e(vArr);
                if (C9612q.m13922c(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    /* renamed from: w */
    private final int m6069w() {
        return this.f31561j.length;
    }

    /* renamed from: y */
    private final int m6067y() {
        return this.f31564m.length;
    }

    /* renamed from: A */
    public int m6102A() {
        return this.f31568q;
    }

    /* renamed from: B */
    public Collection<V> m6101B() {
        C12145g<V> c12145g = this.f31570s;
        if (c12145g == null) {
            C12145g<V> c12145g2 = new C12145g<>(this);
            this.f31570s = c12145g2;
            return c12145g2;
        }
        return c12145g;
    }

    /* renamed from: D */
    public final C12141e<K, V> m6099D() {
        return new C12141e<>(this);
    }

    /* renamed from: I */
    public final boolean m6094I(Map.Entry<? extends K, ? extends V> entry) {
        C9612q.m13917h(entry, "entry");
        m6079l();
        int m6071u = m6071u(entry.getKey());
        if (m6071u < 0) {
            return false;
        }
        V[] vArr = this.f31562k;
        C9612q.m13920e(vArr);
        if (!C9612q.m13922c(vArr[m6071u], entry.getValue())) {
            return false;
        }
        m6091L(m6071u);
        return true;
    }

    /* renamed from: K */
    public final int m6092K(K k) {
        m6079l();
        int m6071u = m6071u(k);
        if (m6071u < 0) {
            return -1;
        }
        m6091L(m6071u);
        return m6071u;
    }

    /* renamed from: M */
    public final boolean m6090M(V v) {
        m6079l();
        int m6070v = m6070v(v);
        if (m6070v < 0) {
            return false;
        }
        m6091L(m6070v);
        return true;
    }

    /* renamed from: N */
    public final C12142f<K, V> m6089N() {
        return new C12142f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        m6079l();
        AbstractC11883p it = new IntRange(0, this.f31566o - 1).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            int[] iArr = this.f31563l;
            int i = iArr[nextInt];
            if (i >= 0) {
                this.f31564m[i] = 0;
                iArr[nextInt] = -1;
            }
        }
        C12135c.m6106g(this.f31561j, 0, this.f31566o);
        V[] vArr = this.f31562k;
        if (vArr != null) {
            C12135c.m6106g(vArr, 0, this.f31566o);
        }
        this.f31568q = 0;
        this.f31566o = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m6071u(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m6070v(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m6068x();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof Map) || !m6075p((Map) obj))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int m6071u = m6071u(obj);
        if (m6071u < 0) {
            return null;
        }
        V[] vArr = this.f31562k;
        C9612q.m13920e(vArr);
        return vArr[m6071u];
    }

    @Override // java.util.Map
    public int hashCode() {
        C12138b<K, V> m6072t = m6072t();
        int i = 0;
        while (m6072t.hasNext()) {
            i += m6072t.m6059l();
        }
        return i;
    }

    /* renamed from: i */
    public final int m6082i(K k) {
        int m21926g;
        m6079l();
        while (true) {
            int m6100C = m6100C(k);
            m21926g = C6759j.m21926g(this.f31565n * 2, m6067y() / 2);
            int i = 0;
            while (true) {
                int i2 = this.f31564m[m6100C];
                if (i2 <= 0) {
                    if (this.f31566o >= m6069w()) {
                        m6073s(1);
                    } else {
                        int i3 = this.f31566o;
                        int i4 = i3 + 1;
                        this.f31566o = i4;
                        this.f31561j[i3] = k;
                        this.f31563l[i3] = m6100C;
                        this.f31564m[m6100C] = i4;
                        this.f31568q = size() + 1;
                        if (i > this.f31565n) {
                            this.f31565n = i;
                        }
                        return i3;
                    }
                } else if (C9612q.m13922c(this.f31561j[i2 - 1], k)) {
                    return -i2;
                } else {
                    i++;
                    if (i > m21926g) {
                        m6095H(m6067y() * 2);
                        break;
                    }
                    int i5 = m6100C - 1;
                    if (m6100C == 0) {
                        m6100C = m6067y() - 1;
                    } else {
                        m6100C = i5;
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: k */
    public final Map<K, V> m6080k() {
        m6079l();
        this.f31572u = true;
        return this;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return m6066z();
    }

    /* renamed from: l */
    public final void m6079l() {
        if (this.f31572u) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: n */
    public final boolean m6077n(Collection<?> m) {
        C9612q.m13917h(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!m6076o((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean m6076o(Map.Entry<? extends K, ? extends V> entry) {
        C9612q.m13917h(entry, "entry");
        int m6071u = m6071u(entry.getKey());
        if (m6071u < 0) {
            return false;
        }
        V[] vArr = this.f31562k;
        C9612q.m13920e(vArr);
        return C9612q.m13922c(vArr[m6071u], entry.getValue());
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        m6079l();
        int m6082i = m6082i(k);
        V[] m6081j = m6081j();
        if (m6082i < 0) {
            int i = (-m6082i) - 1;
            V v2 = m6081j[i];
            m6081j[i] = v;
            return v2;
        }
        m6081j[m6082i] = v;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        C9612q.m13917h(from, "from");
        m6079l();
        m6098E(from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        int m6092K = m6092K(obj);
        if (m6092K < 0) {
            return null;
        }
        V[] vArr = this.f31562k;
        C9612q.m13920e(vArr);
        V v = vArr[m6092K];
        C12135c.m6107f(vArr, m6092K);
        return v;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m6102A();
    }

    /* renamed from: t */
    public final C12138b<K, V> m6072t() {
        return new C12138b<>(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        C12138b<K, V> m6072t = m6072t();
        int i = 0;
        while (m6072t.hasNext()) {
            if (i > 0) {
                sb2.append(", ");
            }
            m6072t.m6060k(sb2);
            i++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "sb.toString()");
        return sb3;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m6101B();
    }

    /* renamed from: x */
    public Set<Map.Entry<K, V>> m6068x() {
        C12143e<K, V> c12143e = this.f31571t;
        if (c12143e == null) {
            C12143e<K, V> c12143e2 = new C12143e<>(this);
            this.f31571t = c12143e2;
            return c12143e2;
        }
        return c12143e;
    }

    /* renamed from: z */
    public Set<K> m6066z() {
        C12144f<K> c12144f = this.f31569r;
        if (c12144f == null) {
            C12144f<K> c12144f2 = new C12144f<>(this);
            this.f31569r = c12144f2;
            return c12144f2;
        }
        return c12144f;
    }

    public C12136d() {
        this(8);
    }

    public C12136d(int i) {
        this(C12135c.m6109d(i), null, new int[i], new int[f31560v.m6063c(i)], 2, 0);
    }
}

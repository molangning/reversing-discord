package p409wi;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9536e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.internal.C9768d0;
import kotlinx.coroutines.internal.C9787l0;
import kotlinx.coroutines.internal.C9806x;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020&\u0012 \u0010F\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010Dj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`E¢\u0006\u0004\bG\u0010HJ\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001dH\u0014¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010.\u001a\u00060*j\u0002`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010$R\u0014\u00107\u001a\u00020\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010;\u001a\u00020\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b:\u00106R\u0014\u0010=\u001a\u00020\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b<\u00106R\u0014\u0010?\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u00106R\u0014\u0010C\u001a\u00020@8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006I"}, m14357d2 = {"Lwi/d;", "E", "Lwi/a;", "", "currentSize", "Lkotlinx/coroutines/internal/d0;", "c0", "(I)Lkotlinx/coroutines/internal/d0;", "element", "", "a0", "(ILjava/lang/Object;)V", "b0", "(I)V", "", "y", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lwi/w;", "send", "j", "(Lwi/w;)Ljava/lang/Object;", "U", "()Ljava/lang/Object;", "Lkotlinx/coroutines/selects/d;", "select", "V", "(Lkotlinx/coroutines/selects/d;)Ljava/lang/Object;", "Lwi/s;", "receive", "", "K", "(Lwi/s;)Z", "wasClosed", "Q", "(Z)V", "m", "I", "capacity", "Lwi/e;", "n", "Lwi/e;", "onBufferOverflow", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "o", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "p", "[Ljava/lang/Object;", "buffer", "q", "head", "M", "()Z", "isBufferAlwaysEmpty", "N", "isBufferEmpty", "t", "isBufferAlwaysFull", "u", "isBufferFull", "O", "isClosedForReceive", "", "k", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILwi/e;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: wi.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C13601d<E> extends AbstractC13588a<E> {

    /* renamed from: m */
    private final int f34997m;

    /* renamed from: n */
    private final EnumC13603e f34998n;

    /* renamed from: o */
    private final ReentrantLock f34999o;

    /* renamed from: p */
    private Object[] f35000p;

    /* renamed from: q */
    private int f35001q;
    private volatile /* synthetic */ int size;

    @Metadata(m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    /* renamed from: wi.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C13602a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35002a;

        static {
            int[] iArr = new int[EnumC13603e.values().length];
            iArr[EnumC13603e.SUSPEND.ordinal()] = 1;
            iArr[EnumC13603e.DROP_LATEST.ordinal()] = 2;
            iArr[EnumC13603e.DROP_OLDEST.ordinal()] = 3;
            f35002a = iArr;
        }
    }

    public C13601d(int i, EnumC13603e enumC13603e, Function1<? super E, Unit> function1) {
        super(function1);
        this.f34997m = i;
        this.f34998n = enumC13603e;
        if (i >= 1) {
            this.f34999o = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            C9536e.m14265m(objArr, C13597b.f34986a, 0, 0, 6, null);
            this.f35000p = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* renamed from: a0 */
    private final void m2112a0(int i, E e) {
        if (i < this.f34997m) {
            m2111b0(i);
            Object[] objArr = this.f35000p;
            objArr[(this.f35001q + i) % objArr.length] = e;
            return;
        }
        Object[] objArr2 = this.f35000p;
        int i2 = this.f35001q;
        objArr2[i2 % objArr2.length] = null;
        objArr2[(i + i2) % objArr2.length] = e;
        this.f35001q = (i2 + 1) % objArr2.length;
    }

    /* renamed from: b0 */
    private final void m2111b0(int i) {
        Object[] objArr = this.f35000p;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f34997m);
            Object[] objArr2 = new Object[min];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.f35000p;
                objArr2[i2] = objArr3[(this.f35001q + i2) % objArr3.length];
            }
            C9536e.m14266l(objArr2, C13597b.f34986a, i, min);
            this.f35000p = objArr2;
            this.f35001q = 0;
        }
    }

    /* renamed from: c0 */
    private final C9768d0 m2110c0(int i) {
        if (i < this.f34997m) {
            this.size = i + 1;
            return null;
        }
        int i2 = C13602a.f35002a[this.f34998n.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return null;
                }
                throw new C11581q();
            }
            return C13597b.f34987b;
        }
        return C13597b.f34988c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p409wi.AbstractC13588a
    /* renamed from: K */
    public boolean mo2082K(AbstractC13623s<? super E> abstractC13623s) {
        ReentrantLock reentrantLock = this.f34999o;
        reentrantLock.lock();
        try {
            return super.mo2082K(abstractC13623s);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p409wi.AbstractC13588a
    /* renamed from: M */
    protected final boolean mo2056M() {
        return false;
    }

    @Override // p409wi.AbstractC13588a
    /* renamed from: N */
    protected final boolean mo2055N() {
        return this.size == 0;
    }

    @Override // p409wi.AbstractC13588a
    /* renamed from: O */
    public boolean mo2113O() {
        ReentrantLock reentrantLock = this.f34999o;
        reentrantLock.lock();
        try {
            return super.mo2113O();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p409wi.AbstractC13588a
    /* renamed from: Q */
    public void mo2081Q(boolean z) {
        Function1<E, Unit> function1 = this.f34993j;
        ReentrantLock reentrantLock = this.f34999o;
        reentrantLock.lock();
        try {
            int i = this.size;
            C9787l0 c9787l0 = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.f35000p[this.f35001q];
                if (function1 != null && obj != C13597b.f34986a) {
                    c9787l0 = C9806x.m13199c(function1, obj, c9787l0);
                }
                Object[] objArr = this.f35000p;
                int i3 = this.f35001q;
                objArr[i3] = C13597b.f34986a;
                this.f35001q = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            Unit unit = Unit.f25302a;
            reentrantLock.unlock();
            super.mo2081Q(z);
            if (c9787l0 == null) {
                return;
            }
            throw c9787l0;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // p409wi.AbstractC13588a
    /* renamed from: U */
    protected Object mo2080U() {
        ReentrantLock reentrantLock = this.f34999o;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object m2124m = m2124m();
                if (m2124m == null) {
                    m2124m = C13597b.f34989d;
                }
                return m2124m;
            }
            Object[] objArr = this.f35000p;
            int i2 = this.f35001q;
            Object obj = objArr[i2];
            AbstractC13627w abstractC13627w = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = C13597b.f34989d;
            boolean z = false;
            if (i == this.f34997m) {
                AbstractC13627w abstractC13627w2 = null;
                while (true) {
                    AbstractC13627w m2129D = m2129D();
                    if (m2129D == null) {
                        abstractC13627w = abstractC13627w2;
                        break;
                    }
                    C9612q.m13920e(m2129D);
                    if (m2129D.mo2043Z(null) != null) {
                        obj2 = m2129D.mo2045X();
                        z = true;
                        abstractC13627w = m2129D;
                        break;
                    }
                    m2129D.mo2041a0();
                    abstractC13627w2 = m2129D;
                }
            }
            if (obj2 != C13597b.f34989d && !(obj2 instanceof C13614l)) {
                this.size = i;
                Object[] objArr2 = this.f35000p;
                objArr2[(this.f35001q + i) % objArr2.length] = obj2;
            }
            this.f35001q = (this.f35001q + 1) % this.f35000p.length;
            Unit unit = Unit.f25302a;
            if (z) {
                C9612q.m13920e(abstractC13627w);
                abstractC13627w.mo2046W();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #0 {all -> 0x00c4, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:10:0x0015, B:12:0x0029, B:14:0x0033, B:30:0x0081, B:32:0x0085, B:34:0x0089, B:40:0x00ab, B:35:0x0095, B:37:0x009b, B:15:0x0043, B:17:0x0047, B:19:0x004b, B:21:0x0051, B:24:0x005d, B:27:0x0065, B:28:0x007f), top: B:48:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    @Override // p409wi.AbstractC13588a
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object mo2079V(kotlinx.coroutines.selects.InterfaceC9881d<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.f34999o
            r0.lock()
            int r1 = r8.size     // Catch: java.lang.Throwable -> Lc4
            if (r1 != 0) goto L15
            wi.l r9 = r8.m2124m()     // Catch: java.lang.Throwable -> Lc4
            if (r9 != 0) goto L11
            kotlinx.coroutines.internal.d0 r9 = p409wi.C13597b.f34989d     // Catch: java.lang.Throwable -> Lc4
        L11:
            r0.unlock()
            return r9
        L15:
            java.lang.Object[] r2 = r8.f35000p     // Catch: java.lang.Throwable -> Lc4
            int r3 = r8.f35001q     // Catch: java.lang.Throwable -> Lc4
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lc4
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> Lc4
            int r2 = r1 + (-1)
            r8.size = r2     // Catch: java.lang.Throwable -> Lc4
            kotlinx.coroutines.internal.d0 r2 = p409wi.C13597b.f34989d     // Catch: java.lang.Throwable -> Lc4
            int r3 = r8.f34997m     // Catch: java.lang.Throwable -> Lc4
            r6 = 1
            if (r1 != r3) goto L80
        L29:
            wi.a$e r3 = r8.m2149I()     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r7 = r9.mo13015y(r3)     // Catch: java.lang.Throwable -> Lc4
            if (r7 != 0) goto L43
            java.lang.Object r5 = r3.m13230o()     // Catch: java.lang.Throwable -> Lc4
            kotlin.jvm.internal.C9612q.m13920e(r5)     // Catch: java.lang.Throwable -> Lc4
            r2 = r5
            wi.w r2 = (p409wi.AbstractC13627w) r2     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r2 = r2.mo2045X()     // Catch: java.lang.Throwable -> Lc4
            r3 = r6
            goto L81
        L43:
            kotlinx.coroutines.internal.d0 r3 = p409wi.C13597b.f34989d     // Catch: java.lang.Throwable -> Lc4
            if (r7 == r3) goto L80
            java.lang.Object r3 = kotlinx.coroutines.internal.C9765c.f25569b     // Catch: java.lang.Throwable -> Lc4
            if (r7 == r3) goto L29
            java.lang.Object r2 = kotlinx.coroutines.selects.C9882e.m13011d()     // Catch: java.lang.Throwable -> Lc4
            if (r7 != r2) goto L5d
            r8.size = r1     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object[] r9 = r8.f35000p     // Catch: java.lang.Throwable -> Lc4
            int r1 = r8.f35001q     // Catch: java.lang.Throwable -> Lc4
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lc4
            r0.unlock()
            return r7
        L5d:
            boolean r2 = r7 instanceof p409wi.C13614l     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto L65
            r3 = r6
            r2 = r7
            r5 = r2
            goto L81
        L65:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r1.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = "performAtomicTrySelect(describeTryOffer) returned "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc4
            r1.append(r7)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc4
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lc4
            throw r9     // Catch: java.lang.Throwable -> Lc4
        L80:
            r3 = 0
        L81:
            kotlinx.coroutines.internal.d0 r7 = p409wi.C13597b.f34989d     // Catch: java.lang.Throwable -> Lc4
            if (r2 == r7) goto L95
            boolean r7 = r2 instanceof p409wi.C13614l     // Catch: java.lang.Throwable -> Lc4
            if (r7 != 0) goto L95
            r8.size = r1     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object[] r9 = r8.f35000p     // Catch: java.lang.Throwable -> Lc4
            int r7 = r8.f35001q     // Catch: java.lang.Throwable -> Lc4
            int r7 = r7 + r1
            int r1 = r9.length     // Catch: java.lang.Throwable -> Lc4
            int r7 = r7 % r1
            r9[r7] = r2     // Catch: java.lang.Throwable -> Lc4
            goto Lab
        L95:
            boolean r9 = r9.mo13018s()     // Catch: java.lang.Throwable -> Lc4
            if (r9 != 0) goto Lab
            r8.size = r1     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object[] r9 = r8.f35000p     // Catch: java.lang.Throwable -> Lc4
            int r1 = r8.f35001q     // Catch: java.lang.Throwable -> Lc4
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r9 = kotlinx.coroutines.selects.C9882e.m13011d()     // Catch: java.lang.Throwable -> Lc4
            r0.unlock()
            return r9
        Lab:
            int r9 = r8.f35001q     // Catch: java.lang.Throwable -> Lc4
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.f35000p     // Catch: java.lang.Throwable -> Lc4
            int r1 = r1.length     // Catch: java.lang.Throwable -> Lc4
            int r9 = r9 % r1
            r8.f35001q = r9     // Catch: java.lang.Throwable -> Lc4
            kotlin.Unit r9 = kotlin.Unit.f25302a     // Catch: java.lang.Throwable -> Lc4
            r0.unlock()
            if (r3 == 0) goto Lc3
            kotlin.jvm.internal.C9612q.m13920e(r5)
            wi.w r5 = (p409wi.AbstractC13627w) r5
            r5.mo2046W()
        Lc3:
            return r4
        Lc4:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p409wi.C13601d.mo2079V(kotlinx.coroutines.selects.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p409wi.AbstractC13598c
    /* renamed from: j */
    public Object mo2109j(AbstractC13627w abstractC13627w) {
        ReentrantLock reentrantLock = this.f34999o;
        reentrantLock.lock();
        try {
            return super.mo2109j(abstractC13627w);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p409wi.AbstractC13598c
    /* renamed from: k */
    protected String mo2077k() {
        return "(buffer:capacity=" + this.f34997m + ",size=" + this.size + ')';
    }

    @Override // p409wi.AbstractC13598c
    /* renamed from: t */
    protected final boolean mo2054t() {
        return false;
    }

    @Override // p409wi.AbstractC13598c
    /* renamed from: u */
    protected final boolean mo2053u() {
        return this.size == this.f34997m && this.f34998n == EnumC13603e.SUSPEND;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p409wi.AbstractC13598c
    /* renamed from: y */
    public Object mo2075y(E e) {
        InterfaceC13625u<E> mo2130C;
        ReentrantLock reentrantLock = this.f34999o;
        reentrantLock.lock();
        try {
            int i = this.size;
            C13614l<?> m2124m = m2124m();
            if (m2124m != null) {
                return m2124m;
            }
            C9768d0 m2110c0 = m2110c0(i);
            if (m2110c0 != null) {
                return m2110c0;
            }
            if (i == 0) {
                do {
                    mo2130C = mo2130C();
                    if (mo2130C != null) {
                        if (mo2130C instanceof C13614l) {
                            this.size = i;
                            return mo2130C;
                        }
                        C9612q.m13920e(mo2130C);
                    }
                } while (mo2130C.mo2057z(e, null) == null);
                this.size = i;
                Unit unit = Unit.f25302a;
                reentrantLock.unlock();
                mo2130C.mo2058j(e);
                return mo2130C.mo2059b();
            }
            m2112a0(i, e);
            return C13597b.f34987b;
        } finally {
            reentrantLock.unlock();
        }
    }
}

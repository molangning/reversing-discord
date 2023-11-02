package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.internal.C9768d0;
import p409wi.EnumC13603e;
import p430xi.AbstractC13805a;
import p430xi.C13823m;
import p430xi.InterfaceC13820k;

@Metadata(m14358d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010-\u001a\u00020\u0005¢\u0006\u0004\b.\u0010*J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R*\u0010\f\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, m14357d2 = {"Lkotlinx/coroutines/flow/p;", "T", "Lxi/a;", "Lkotlinx/coroutines/flow/r;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lxi/k;", "expectedState", "newState", "", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "()Lkotlinx/coroutines/flow/r;", "", "size", "", "k", "(I)[Lkotlinx/coroutines/flow/r;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lwi/e;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "a", "(Lkotlin/coroutines/CoroutineContext;ILwi/e;)Lkotlinx/coroutines/flow/Flow;", "m", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", "initialState", "<init>", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9734p<T> extends AbstractC13805a<C9737r> implements MutableStateFlow<T>, Flow, InterfaceC13820k<T> {
    private volatile /* synthetic */ Object _state;

    /* renamed from: m */
    private int f25520m;

    @Metadata(m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "kotlinx.coroutines.flow.StateFlowImpl", m13986f = "StateFlow.kt", m13985l = {386, 398, 403}, m13984m = "collect")
    /* renamed from: kotlinx.coroutines.flow.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9735a extends AbstractC9570d {

        /* renamed from: j */
        Object f25521j;

        /* renamed from: k */
        Object f25522k;

        /* renamed from: l */
        Object f25523l;

        /* renamed from: m */
        Object f25524m;

        /* renamed from: n */
        Object f25525n;

        /* renamed from: o */
        /* synthetic */ Object f25526o;

        /* renamed from: p */
        final /* synthetic */ C9734p<T> f25527p;

        /* renamed from: q */
        int f25528q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9735a(C9734p<T> c9734p, Continuation<? super C9735a> continuation) {
            super(continuation);
            this.f25527p = c9734p;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f25526o = obj;
            this.f25528q |= Integer.MIN_VALUE;
            return this.f25527p.collect(null, this);
        }
    }

    public C9734p(Object obj) {
        this._state = obj;
    }

    /* renamed from: l */
    private final boolean m13397l(Object obj, Object obj2) {
        int i;
        C9737r[] m1477i;
        m1477i();
        synchronized (this) {
            Object obj3 = this._state;
            if (obj != null && !C9612q.m13922c(obj3, obj)) {
                return false;
            }
            if (C9612q.m13922c(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i2 = this.f25520m;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.f25520m = i3;
                C9737r[] m1477i2 = m1477i();
                Unit unit = Unit.f25302a;
                while (true) {
                    C9737r[] c9737rArr = m1477i2;
                    if (c9737rArr != null) {
                        for (C9737r c9737r : c9737rArr) {
                            if (c9737r != null) {
                                c9737r.m13389f();
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.f25520m;
                        if (i == i3) {
                            this.f25520m = i3 + 1;
                            return true;
                        }
                        m1477i = m1477i();
                        Unit unit2 = Unit.f25302a;
                    }
                    m1477i2 = m1477i;
                    i3 = i;
                }
            } else {
                this.f25520m = i2 + 2;
                return true;
            }
        }
    }

    @Override // p430xi.InterfaceC13820k
    /* renamed from: a */
    public Flow<T> mo1452a(CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e) {
        return C9736q.m13393d(this, coroutineContext, i, enumC13603e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00b3, code lost:
        if (kotlin.jvm.internal.C9612q.m13922c(r11, r12) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00d6 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:75:0x003e, B:95:0x00a6, B:97:0x00aa, B:99:0x00af, B:109:0x00d0, B:111:0x00d6, B:101:0x00b5, B:105:0x00bc, B:80:0x005c, B:83:0x006f, B:94:0x0097), top: B:118:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00aa A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:75:0x003e, B:95:0x00a6, B:97:0x00aa, B:99:0x00af, B:109:0x00d0, B:111:0x00d6, B:101:0x00b5, B:105:0x00bc, B:80:0x005c, B:83:0x006f, B:94:0x0097), top: B:118:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00af A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:75:0x003e, B:95:0x00a6, B:97:0x00aa, B:99:0x00af, B:109:0x00d0, B:111:0x00d6, B:101:0x00b5, B:105:0x00bc, B:80:0x005c, B:83:0x006f, B:94:0x0097), top: B:118:0x0024 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [xi.c] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x00d4 -> B:95:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x00e6 -> B:95:0x00a6). Please submit an issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r11, kotlin.coroutines.Continuation<?> r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C9734p.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> continuation) {
        setValue(t);
        return Unit.f25302a;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public T getValue() {
        C9768d0 c9768d0 = C13823m.f35602a;
        T t = (T) this._state;
        if (t == c9768d0) {
            return null;
        }
        return t;
    }

    @Override // p430xi.AbstractC13805a
    /* renamed from: j */
    public C9737r mo1481e() {
        return new C9737r();
    }

    @Override // p430xi.AbstractC13805a
    /* renamed from: k */
    public C9737r[] mo1480f(int i) {
        return new C9737r[i];
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(T t) {
        if (t == null) {
            t = (T) C13823m.f35602a;
        }
        m13397l(null, t);
    }
}
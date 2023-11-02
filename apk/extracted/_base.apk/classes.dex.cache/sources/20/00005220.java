package p430xi;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9553r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9824m0;
import kotlinx.coroutines.C9839p0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.EnumC9828n0;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.C9711d;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p371uf.C12967f;
import p388vf.C13277d;
import p409wi.C13619q;
import p409wi.EnumC13603e;
import p409wi.InterfaceC13624t;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b*\u0010+J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$J!\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH¤@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\r\u001a\u00020\u0011H\u0016J!\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u001a\u001a\u00020\u0018H\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R9\u0010&\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\"\u0012\u0006\u0012\u0004\u0018\u00010#0!8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, m14357d2 = {"Lxi/d;", "T", "Lxi/k;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lwi/e;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "a", "e", "Lkotlinx/coroutines/channels/ProducerScope;", "scope", "", "d", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "Lwi/t;", "h", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "toString", "j", "Lkotlin/coroutines/CoroutineContext;", "k", "I", "l", "Lwi/e;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "f", "()Lkotlin/jvm/functions/Function2;", "collectToFun", "g", "()I", "produceCapacity", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILwi/e;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: xi.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC13808d<T> implements InterfaceC13820k<T> {

    /* renamed from: j */
    public final CoroutineContext f35579j;

    /* renamed from: k */
    public final int f35580k;

    /* renamed from: l */
    public final EnumC13603e f35581l;

    @Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m14357d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 6, 0})
    @InterfaceC9571e(m13987c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m13986f = "ChannelFlow.kt", m13985l = {123}, m13984m = "invokeSuspend")
    /* renamed from: xi.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13809a extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        int f35582j;

        /* renamed from: k */
        private /* synthetic */ Object f35583k;

        /* renamed from: l */
        final /* synthetic */ FlowCollector<T> f35584l;

        /* renamed from: m */
        final /* synthetic */ AbstractC13808d<T> f35585m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13809a(FlowCollector<? super T> flowCollector, AbstractC13808d<T> abstractC13808d, Continuation<? super C13809a> continuation) {
            super(2, continuation);
            this.f35584l = flowCollector;
            this.f35585m = abstractC13808d;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13809a c13809a = new C13809a(this.f35584l, this.f35585m, continuation);
            c13809a.f35583k = obj;
            return c13809a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C13809a) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            m2869d = C13277d.m2869d();
            int i = this.f35582j;
            if (i != 0) {
                if (i == 1) {
                    C11586t.m7586b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C11586t.m7586b(obj);
                FlowCollector<T> flowCollector = this.f35584l;
                InterfaceC13624t<T> m1470h = this.f35585m.m1470h((CoroutineScope) this.f35583k);
                this.f35582j = 1;
                if (C9711d.m13462c(flowCollector, m1470h, this) == m2869d) {
                    return m2869d;
                }
            }
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m14357d2 = {"T", "Lkotlinx/coroutines/channels/ProducerScope;", "it", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 6, 0})
    @InterfaceC9571e(m13987c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", m13986f = "ChannelFlow.kt", m13985l = {60}, m13984m = "invokeSuspend")
    /* renamed from: xi.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13810b extends AbstractC9578k implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        int f35586j;

        /* renamed from: k */
        /* synthetic */ Object f35587k;

        /* renamed from: l */
        final /* synthetic */ AbstractC13808d<T> f35588l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13810b(AbstractC13808d<T> abstractC13808d, Continuation<? super C13810b> continuation) {
            super(2, continuation);
            this.f35588l = abstractC13808d;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13810b c13810b = new C13810b(this.f35588l, continuation);
            c13810b.f35587k = obj;
            return c13810b;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((ProducerScope) ((ProducerScope) obj), continuation);
        }

        public final Object invoke(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
            return ((C13810b) create(producerScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            m2869d = C13277d.m2869d();
            int i = this.f35586j;
            if (i != 0) {
                if (i == 1) {
                    C11586t.m7586b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C11586t.m7586b(obj);
                AbstractC13808d<T> abstractC13808d = this.f35588l;
                this.f35586j = 1;
                if (abstractC13808d.mo1465d((ProducerScope) this.f35587k, this) == m2869d) {
                    return m2869d;
                }
            }
            return Unit.f25302a;
        }
    }

    public AbstractC13808d(CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e) {
        this.f35579j = coroutineContext;
        this.f35580k = i;
        this.f35581l = enumC13603e;
    }

    /* renamed from: c */
    static /* synthetic */ Object m1473c(AbstractC13808d abstractC13808d, FlowCollector flowCollector, Continuation continuation) {
        Object m2869d;
        Object m13168g = C9824m0.m13168g(new C13809a(flowCollector, abstractC13808d, null), continuation);
        m2869d = C13277d.m2869d();
        return m13168g == m2869d ? m13168g : Unit.f25302a;
    }

    @Override // p430xi.InterfaceC13820k
    /* renamed from: a */
    public Flow<T> mo1452a(CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e) {
        CoroutineContext mo1459e0 = coroutineContext.mo1459e0(this.f35579j);
        if (enumC13603e == EnumC13603e.SUSPEND) {
            int i2 = this.f35580k;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2 && (i2 = i2 + i) < 0) {
                            i = ViewDefaults.NUMBER_OF_LINES;
                        }
                    }
                }
                i = i2;
            }
            enumC13603e = this.f35581l;
        }
        if (C9612q.m13922c(mo1459e0, this.f35579j) && i == this.f35580k && enumC13603e == this.f35581l) {
            return this;
        }
        return mo1461e(mo1459e0, i, enumC13603e);
    }

    /* renamed from: b */
    protected String m1474b() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return m1473c(this, flowCollector, continuation);
    }

    /* renamed from: d */
    protected abstract Object mo1465d(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation);

    /* renamed from: e */
    protected abstract AbstractC13808d<T> mo1461e(CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e);

    /* renamed from: f */
    public final Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> m1472f() {
        return new C13810b(this, null);
    }

    /* renamed from: g */
    public final int m1471g() {
        int i = this.f35580k;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    /* renamed from: h */
    public InterfaceC13624t<T> m1470h(CoroutineScope coroutineScope) {
        return C13619q.m2070e(coroutineScope, this.f35579j, m1471g(), this.f35581l, EnumC9828n0.ATOMIC, null, m1472f(), 16, null);
    }

    public String toString() {
        String m14046d0;
        ArrayList arrayList = new ArrayList(4);
        String m1474b = m1474b();
        if (m1474b != null) {
            arrayList.add(m1474b);
        }
        if (this.f35579j != C12967f.f33721j) {
            arrayList.add("context=" + this.f35579j);
        }
        if (this.f35580k != -3) {
            arrayList.add("capacity=" + this.f35580k);
        }
        if (this.f35581l != EnumC13603e.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f35581l);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C9839p0.m13120a(this));
        sb2.append('[');
        m14046d0 = C9553r.m14046d0(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb2.append(m14046d0);
        sb2.append(']');
        return sb2.toString();
    }
}
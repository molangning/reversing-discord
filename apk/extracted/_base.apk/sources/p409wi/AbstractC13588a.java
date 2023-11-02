package p409wi;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC9741g;
import kotlinx.coroutines.C9838p;
import kotlinx.coroutines.C9839p0;
import kotlinx.coroutines.C9842q;
import kotlinx.coroutines.C9846r;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.InterfaceC9688d1;
import kotlinx.coroutines.internal.C9765c;
import kotlinx.coroutines.internal.C9766c0;
import kotlinx.coroutines.internal.C9768d0;
import kotlinx.coroutines.internal.C9784k;
import kotlinx.coroutines.internal.C9789n;
import kotlinx.coroutines.internal.C9790o;
import kotlinx.coroutines.internal.C9791p;
import kotlinx.coroutines.internal.C9797q;
import kotlinx.coroutines.internal.C9806x;
import kotlinx.coroutines.selects.C9882e;
import kotlinx.coroutines.selects.InterfaceC9880c;
import kotlinx.coroutines.selects.InterfaceC9881d;
import p388vf.C13272c;
import p388vf.C13277d;
import p409wi.C13608i;
import p450yi.C14031a;
import p450yi.C14032b;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0005KLMNCB)\u0012 \u0010H\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010Fj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`G¢\u0006\u0004\bI\u0010JJ!\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002JT\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JZ\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u0004* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\u00132\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0014J\u0016\u0010 \u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0014J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\"\u0010#J\u0016\u0010'\u001a\u00020\u00132\u000e\u0010&\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%J\u0019\u0010)\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010(H\u0000¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u000bH\u0014J/\u0010\u0004\u001a\u00020\u00132\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\n\u00101\u001a\u0006\u0012\u0002\b\u000300H\u0014ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0004\u00102J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003H\u0004J\u0010\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u000105H\u0014J\b\u00107\u001a\u00020\u0013H\u0014J\b\u00108\u001a\u00020\u0013H\u0014R\u0014\u0010;\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0014\u0010?\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010:R\u0014\u0010A\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b@\u0010:R \u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!0B8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\bC\u0010D\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006O"}, m14357d2 = {"Lwi/a;", "E", "Lwi/c;", "Lwi/f;", "R", "", "receiveMode", "W", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwi/s;", "receive", "", "J", "Lkotlinx/coroutines/selects/d;", "select", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "block", "", "X", "(Lkotlinx/coroutines/selects/d;ILkotlin/jvm/functions/Function2;)V", "value", "Z", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/selects/d;ILjava/lang/Object;)V", "L", "(Lkotlinx/coroutines/selects/d;Lkotlin/jvm/functions/Function2;I)Z", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "Y", "U", "V", "K", "Lwi/i;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "h", "", "H", "(Ljava/lang/Throwable;)Z", "wasClosed", "Q", "Lkotlinx/coroutines/internal/k;", "Lwi/w;", "list", "Lwi/l;", "closed", "(Ljava/lang/Object;Lwi/l;)V", "Lwi/a$e;", "I", "Lwi/u;", "C", "T", "S", "M", "()Z", "isBufferAlwaysEmpty", "N", "isBufferEmpty", "O", "isClosedForReceive", "P", "isEmptyImpl", "Lkotlinx/coroutines/selects/c;", "e", "()Lkotlinx/coroutines/selects/c;", "onReceiveCatching", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "a", "b", "c", "d", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: wi.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC13588a<E> extends AbstractC13598c<E> implements InterfaceC13604f<E> {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m14357d2 = {"Lwi/a$a;", "E", "Lwi/s;", "value", "", "Z", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/p$c;", "otherOp", "Lkotlinx/coroutines/internal/d0;", "z", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/p$c;)Lkotlinx/coroutines/internal/d0;", "", "j", "(Ljava/lang/Object;)V", "Lwi/l;", "closed", "Y", "", "toString", "Lkotlinx/coroutines/CancellableContinuation;", "m", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "", "n", "I", "receiveMode", "<init>", "(Lkotlinx/coroutines/CancellableContinuation;I)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: wi.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C13589a<E> extends AbstractC13623s<E> {

        /* renamed from: m */
        public final CancellableContinuation<Object> f34972m;

        /* renamed from: n */
        public final int f34973n;

        public C13589a(CancellableContinuation<Object> cancellableContinuation, int i) {
            this.f34972m = cancellableContinuation;
            this.f34973n = i;
        }

        @Override // p409wi.AbstractC13623s
        /* renamed from: Y */
        public void mo2063Y(C13614l<?> c13614l) {
            if (this.f34973n == 1) {
                this.f34972m.resumeWith(C11583s.m7596b(C13608i.m2100b(C13608i.f35011b.m2091a(c13614l.f35015m))));
                return;
            }
            CancellableContinuation<Object> cancellableContinuation = this.f34972m;
            C11583s.C11584a c11584a = C11583s.f30090k;
            cancellableContinuation.resumeWith(C11583s.m7596b(C11586t.m7587a(c13614l.m2084d0())));
        }

        /* renamed from: Z */
        public final Object m2139Z(E e) {
            if (this.f34973n == 1) {
                return C13608i.m2100b(C13608i.f35011b.m2089c(e));
            }
            return e;
        }

        @Override // p409wi.InterfaceC13625u
        /* renamed from: j */
        public void mo2058j(E e) {
            this.f34972m.mo13156B(C9842q.f25662a);
        }

        @Override // kotlinx.coroutines.internal.C9791p
        public String toString() {
            return "ReceiveElement@" + C9839p0.m13119b(this) + "[receiveMode=" + this.f34973n + ']';
        }

        @Override // p409wi.InterfaceC13625u
        /* renamed from: z */
        public C9768d0 mo2057z(E e, C9791p.C9794c c9794c) {
            C9791p.AbstractC9792a abstractC9792a;
            CancellableContinuation<Object> cancellableContinuation = this.f34972m;
            Object m2139Z = m2139Z(e);
            if (c9794c != null) {
                abstractC9792a = c9794c.f25612c;
            } else {
                abstractC9792a = null;
            }
            if (cancellableContinuation.mo13126u(m2139Z, abstractC9792a, mo2064X(e)) == null) {
                return null;
            }
            if (c9794c != null) {
                c9794c.m13238d();
            }
            return C9842q.f25662a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B=\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m14357d2 = {"Lwi/a$b;", "E", "Lwi/a$a;", "value", "Lkotlin/Function1;", "", "", "X", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "o", "Lkotlin/jvm/functions/Function1;", "onUndeliveredElement", "Lkotlinx/coroutines/CancellableContinuation;", "", "cont", "", "receiveMode", "<init>", "(Lkotlinx/coroutines/CancellableContinuation;ILkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: wi.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13590b<E> extends C13589a<E> {

        /* renamed from: o */
        public final Function1<E, Unit> f34974o;

        /* JADX WARN: Multi-variable type inference failed */
        public C13590b(CancellableContinuation<Object> cancellableContinuation, int i, Function1<? super E, Unit> function1) {
            super(cancellableContinuation, i);
            this.f34974o = function1;
        }

        @Override // p409wi.AbstractC13623s
        /* renamed from: X */
        public Function1<Throwable, Unit> mo2064X(E e) {
            return C9806x.m13201a(this.f34974o, e, this.f34972m.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u00028\u00020\u00032\u00020\u0004BT\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0018\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c\u0012$\u0010%\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\u0006\u0010)\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b*\u0010+J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00028\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0010\u001a\u00020\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR5\u0010%\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010!0 8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, m14357d2 = {"Lwi/a$c;", "R", "E", "Lwi/s;", "Lkotlinx/coroutines/d1;", "value", "Lkotlinx/coroutines/internal/p$c;", "otherOp", "Lkotlinx/coroutines/internal/d0;", "z", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/p$c;)Lkotlinx/coroutines/internal/d0;", "", "j", "(Ljava/lang/Object;)V", "Lwi/l;", "closed", "Y", "dispose", "Lkotlin/Function1;", "", "X", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "", "toString", "Lwi/a;", "m", "Lwi/a;", "channel", "Lkotlinx/coroutines/selects/d;", "n", "Lkotlinx/coroutines/selects/d;", "select", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "o", "Lkotlin/jvm/functions/Function2;", "block", "", "p", "I", "receiveMode", "<init>", "(Lwi/a;Lkotlinx/coroutines/selects/d;Lkotlin/jvm/functions/Function2;I)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: wi.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13591c<R, E> extends AbstractC13623s<E> implements InterfaceC9688d1 {

        /* renamed from: m */
        public final AbstractC13588a<E> f34975m;

        /* renamed from: n */
        public final InterfaceC9881d<R> f34976n;

        /* renamed from: o */
        public final Function2<Object, Continuation<? super R>, Object> f34977o;

        /* renamed from: p */
        public final int f34978p;

        /* JADX WARN: Multi-variable type inference failed */
        public C13591c(AbstractC13588a<E> abstractC13588a, InterfaceC9881d<? super R> interfaceC9881d, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, int i) {
            this.f34975m = abstractC13588a;
            this.f34976n = interfaceC9881d;
            this.f34977o = function2;
            this.f34978p = i;
        }

        @Override // p409wi.AbstractC13623s
        /* renamed from: X */
        public Function1<Throwable, Unit> mo2064X(E e) {
            Function1<E, Unit> function1 = this.f34975m.f34993j;
            if (function1 != null) {
                return C9806x.m13201a(function1, e, this.f34976n.mo13017w().getContext());
            }
            return null;
        }

        @Override // p409wi.AbstractC13623s
        /* renamed from: Y */
        public void mo2063Y(C13614l<?> c13614l) {
            if (!this.f34976n.mo13018s()) {
                return;
            }
            int i = this.f34978p;
            if (i != 0) {
                if (i == 1) {
                    C14031a.m861e(this.f34977o, C13608i.m2100b(C13608i.f35011b.m2091a(c13614l.f35015m)), this.f34976n.mo13017w(), null, 4, null);
                    return;
                }
                return;
            }
            this.f34976n.mo13016x(c13614l.m2084d0());
        }

        @Override // kotlinx.coroutines.InterfaceC9688d1
        public void dispose() {
            if (mo2042R()) {
                this.f34975m.m2145S();
            }
        }

        @Override // p409wi.InterfaceC13625u
        /* renamed from: j */
        public void mo2058j(E e) {
            Object obj;
            Function2<Object, Continuation<? super R>, Object> function2 = this.f34977o;
            if (this.f34978p == 1) {
                obj = C13608i.m2100b(C13608i.f35011b.m2089c(e));
            } else {
                obj = e;
            }
            C14031a.m862d(function2, obj, this.f34976n.mo13017w(), mo2064X(e));
        }

        @Override // kotlinx.coroutines.internal.C9791p
        public String toString() {
            return "ReceiveSelect@" + C9839p0.m13119b(this) + '[' + this.f34976n + ",receiveMode=" + this.f34978p + ']';
        }

        @Override // p409wi.InterfaceC13625u
        /* renamed from: z */
        public C9768d0 mo2057z(E e, C9791p.C9794c c9794c) {
            return (C9768d0) this.f34976n.mo13019q(c9794c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m14357d2 = {"Lwi/a$d;", "Lkotlinx/coroutines/g;", "", "cause", "", "a", "", "toString", "Lwi/s;", "j", "Lwi/s;", "receive", "<init>", "(Lwi/a;Lwi/s;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: wi.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public final class C13592d extends AbstractC9741g {

        /* renamed from: j */
        private final AbstractC13623s<?> f34979j;

        public C13592d(AbstractC13623s<?> abstractC13623s) {
            this.f34979j = abstractC13623s;
        }

        @Override // kotlinx.coroutines.AbstractC9834o
        /* renamed from: a */
        public void mo2138a(Throwable th2) {
            if (this.f34979j.mo2042R()) {
                AbstractC13588a.this.m2145S();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            mo2138a(th2);
            return Unit.f25302a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f34979j + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, m14357d2 = {"Lwi/a$e;", "E", "Lkotlinx/coroutines/internal/p$d;", "Lwi/w;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lkotlinx/coroutines/internal/p;", "affected", "", "e", "Lkotlinx/coroutines/internal/p$c;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "j", "", "k", "Lkotlinx/coroutines/internal/n;", "queue", "<init>", "(Lkotlinx/coroutines/internal/n;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: wi.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13593e<E> extends C9791p.C9795d<AbstractC13627w> {
        public C13593e(C9789n c9789n) {
            super(c9789n);
        }

        @Override // kotlinx.coroutines.internal.C9791p.C9795d, kotlinx.coroutines.internal.C9791p.AbstractC9792a
        /* renamed from: e */
        protected Object mo2137e(C9791p c9791p) {
            if (!(c9791p instanceof C13614l)) {
                if (!(c9791p instanceof AbstractC13627w)) {
                    return C13597b.f34989d;
                }
                return null;
            }
            return c9791p;
        }

        @Override // kotlinx.coroutines.internal.C9791p.AbstractC9792a
        /* renamed from: j */
        public Object mo2136j(C9791p.C9794c c9794c) {
            C9768d0 mo2043Z = ((AbstractC13627w) c9794c.f25610a).mo2043Z(c9794c);
            if (mo2043Z == null) {
                return C9797q.f25616a;
            }
            Object obj = C9765c.f25569b;
            if (mo2043Z == obj) {
                return obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.C9791p.AbstractC9792a
        /* renamed from: k */
        public void mo2135k(C9791p c9791p) {
            ((AbstractC13627w) c9791p).mo2041a0();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, m14357d2 = {"wi/a$f", "Lkotlinx/coroutines/internal/p$b;", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: wi.a$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13594f extends C9791p.AbstractC9793b {

        /* renamed from: d */
        final /* synthetic */ AbstractC13588a f34981d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13594f(C9791p c9791p, AbstractC13588a abstractC13588a) {
            super(c9791p);
            this.f34981d = abstractC13588a;
        }

        @Override // kotlinx.coroutines.internal.AbstractC9767d
        /* renamed from: k */
        public Object mo2115i(C9791p c9791p) {
            if (this.f34981d.mo2055N()) {
                return null;
            }
            return C9790o.m13263a();
        }
    }

    @Metadata(m14358d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JS\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m14357d2 = {"wi/a$g", "Lkotlinx/coroutines/selects/c;", "Lwi/i;", "R", "Lkotlinx/coroutines/selects/d;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "", "b", "(Lkotlinx/coroutines/selects/d;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: wi.a$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13595g implements InterfaceC9880c<C13608i<? extends E>> {

        /* renamed from: j */
        final /* synthetic */ AbstractC13588a<E> f34982j;

        C13595g(AbstractC13588a<E> abstractC13588a) {
            this.f34982j = abstractC13588a;
        }

        @Override // kotlinx.coroutines.selects.InterfaceC9880c
        /* renamed from: b */
        public <R> void mo2133b(InterfaceC9881d<? super R> interfaceC9881d, Function2<? super C13608i<? extends E>, ? super Continuation<? super R>, ? extends Object> function2) {
            this.f34982j.m2142X(interfaceC9881d, 1, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "kotlinx.coroutines.channels.AbstractChannel", m13986f = "AbstractChannel.kt", m13985l = {633}, m13984m = "receiveCatching-JP2dKIU")
    /* renamed from: wi.a$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13596h extends AbstractC9570d {

        /* renamed from: j */
        /* synthetic */ Object f34983j;

        /* renamed from: k */
        final /* synthetic */ AbstractC13588a<E> f34984k;

        /* renamed from: l */
        int f34985l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13596h(AbstractC13588a<E> abstractC13588a, Continuation<? super C13596h> continuation) {
            super(continuation);
            this.f34984k = abstractC13588a;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            this.f34983j = obj;
            this.f34985l |= Integer.MIN_VALUE;
            Object mo2061f = this.f34984k.mo2061f(this);
            m2869d = C13277d.m2869d();
            return mo2061f == m2869d ? mo2061f : C13608i.m2100b(mo2061f);
        }
    }

    public AbstractC13588a(Function1<? super E, Unit> function1) {
        super(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final boolean m2148J(AbstractC13623s<? super E> abstractC13623s) {
        boolean mo2082K = mo2082K(abstractC13623s);
        if (mo2082K) {
            m2144T();
        }
        return mo2082K;
    }

    /* renamed from: L */
    private final <R> boolean m2147L(InterfaceC9881d<? super R> interfaceC9881d, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, int i) {
        C13591c c13591c = new C13591c(this, interfaceC9881d, function2, i);
        boolean m2148J = m2148J(c13591c);
        if (m2148J) {
            interfaceC9881d.mo13020m(c13591c);
        }
        return m2148J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [wi.a$a] */
    /* renamed from: W */
    private final <R> Object m2143W(int i, Continuation<? super R> continuation) {
        Continuation m2870c;
        C13590b c13590b;
        Object m2869d;
        m2870c = C13272c.m2870c(continuation);
        C9838p m13105b = C9846r.m13105b(m2870c);
        if (this.f34993j == null) {
            c13590b = new C13589a(m13105b, i);
        } else {
            c13590b = new C13590b(m13105b, i, this.f34993j);
        }
        while (true) {
            if (m2148J(c13590b)) {
                m2141Y(m13105b, c13590b);
                break;
            }
            Object mo2080U = mo2080U();
            if (mo2080U instanceof C13614l) {
                c13590b.mo2063Y((C13614l) mo2080U);
                break;
            } else if (mo2080U != C13597b.f34989d) {
                m13105b.mo13131p(c13590b.m2139Z(mo2080U), c13590b.mo2064X(mo2080U));
                break;
            }
        }
        Object m13122y = m13105b.m13122y();
        m2869d = C13277d.m2869d();
        if (m13122y == m2869d) {
            C9573g.m13976c(continuation);
        }
        return m13122y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public final <R> void m2142X(InterfaceC9881d<? super R> interfaceC9881d, int i, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2) {
        while (!interfaceC9881d.mo13021e()) {
            if (m2146P()) {
                if (m2147L(interfaceC9881d, function2, i)) {
                    return;
                }
            } else {
                Object mo2079V = mo2079V(interfaceC9881d);
                if (mo2079V == C9882e.m13011d()) {
                    return;
                }
                if (mo2079V != C13597b.f34989d && mo2079V != C9765c.f25569b) {
                    m2140Z(function2, interfaceC9881d, i, mo2079V);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public final void m2141Y(CancellableContinuation<?> cancellableContinuation, AbstractC13623s<?> abstractC13623s) {
        cancellableContinuation.mo13135l(new C13592d(abstractC13623s));
    }

    /* renamed from: Z */
    private final <R> void m2140Z(Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, InterfaceC9881d<? super R> interfaceC9881d, int i, Object obj) {
        Object m2089c;
        boolean z = obj instanceof C13614l;
        if (z) {
            if (i != 0) {
                if (i != 1 || !interfaceC9881d.mo13018s()) {
                    return;
                }
                C14032b.m858c(function2, C13608i.m2100b(C13608i.f35011b.m2091a(((C13614l) obj).f35015m)), interfaceC9881d.mo13017w());
                return;
            }
            throw C9766c0.m13332a(((C13614l) obj).m2084d0());
        } else if (i == 1) {
            C13608i.C13610b c13610b = C13608i.f35011b;
            if (z) {
                m2089c = c13610b.m2091a(((C13614l) obj).f35015m);
            } else {
                m2089c = c13610b.m2089c(obj);
            }
            C14032b.m858c(function2, C13608i.m2100b(m2089c), interfaceC9881d.mo13017w());
        } else {
            C14032b.m858c(function2, obj, interfaceC9881d.mo13017w());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p409wi.AbstractC13598c
    /* renamed from: C */
    public InterfaceC13625u<E> mo2130C() {
        InterfaceC13625u<E> mo2130C = super.mo2130C();
        if (mo2130C != null && !(mo2130C instanceof C13614l)) {
            m2145S();
        }
        return mo2130C;
    }

    /* renamed from: H */
    public final boolean m2150H(Throwable th2) {
        boolean mo2050g = mo2050g(th2);
        mo2081Q(mo2050g);
        return mo2050g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public final C13593e<E> m2149I() {
        return new C13593e<>(m2123n());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public boolean mo2082K(AbstractC13623s<? super E> abstractC13623s) {
        int m13242V;
        C9791p m13249N;
        if (mo2056M()) {
            C9791p m2123n = m2123n();
            do {
                m13249N = m2123n.m13249N();
                if (!(!(m13249N instanceof AbstractC13627w))) {
                    return false;
                }
            } while (!m13249N.m13256G(abstractC13623s, m2123n));
        } else {
            C9791p m2123n2 = m2123n();
            C13594f c13594f = new C13594f(abstractC13623s, this);
            do {
                C9791p m13249N2 = m2123n2.m13249N();
                if (!(!(m13249N2 instanceof AbstractC13627w))) {
                    return false;
                }
                m13242V = m13249N2.m13242V(abstractC13623s, m2123n2, c13594f);
                if (m13242V != 1) {
                }
            } while (m13242V != 2);
            return false;
        }
        return true;
    }

    /* renamed from: M */
    protected abstract boolean mo2056M();

    /* renamed from: N */
    protected abstract boolean mo2055N();

    /* renamed from: O */
    public boolean mo2113O() {
        return m2125l() != null && mo2055N();
    }

    /* renamed from: P */
    protected final boolean m2146P() {
        return !(m2123n().m13250M() instanceof AbstractC13627w) && mo2055N();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo2081Q(boolean z) {
        C13614l<?> m2124m = m2124m();
        if (m2124m != null) {
            Object m13272b = C9784k.m13272b(null, 1, null);
            while (true) {
                C9791p m13249N = m2124m.m13249N();
                if (m13249N instanceof C9789n) {
                    mo2076R(m13272b, m2124m);
                    return;
                } else if (!m13249N.mo2042R()) {
                    m13249N.m13248O();
                } else {
                    m13272b = C9784k.m13271c(m13272b, (AbstractC13627w) m13249N);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    /* renamed from: R */
    protected void mo2076R(Object obj, C13614l<?> c13614l) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((AbstractC13627w) obj).mo2044Y(c13614l);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((AbstractC13627w) arrayList.get(size)).mo2044Y(c13614l);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: S */
    protected void m2145S() {
    }

    /* renamed from: T */
    protected void m2144T() {
    }

    /* renamed from: U */
    protected Object mo2080U() {
        while (true) {
            AbstractC13627w m2129D = m2129D();
            if (m2129D == null) {
                return C13597b.f34989d;
            }
            if (m2129D.mo2043Z(null) != null) {
                m2129D.mo2046W();
                return m2129D.mo2045X();
            }
            m2129D.mo2041a0();
        }
    }

    /* renamed from: V */
    protected Object mo2079V(InterfaceC9881d<?> interfaceC9881d) {
        C13593e<E> m2149I = m2149I();
        Object mo13015y = interfaceC9881d.mo13015y(m2149I);
        if (mo13015y != null) {
            return mo13015y;
        }
        m2149I.m13230o().mo2046W();
        return m2149I.m13230o().mo2045X();
    }

    @Override // p409wi.InterfaceC13624t
    /* renamed from: e */
    public final InterfaceC9880c<C13608i<E>> mo2062e() {
        return new C13595g(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // p409wi.InterfaceC13624t
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2061f(kotlin.coroutines.Continuation<? super p409wi.C13608i<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p409wi.AbstractC13588a.C13596h
            if (r0 == 0) goto L13
            r0 = r5
            wi.a$h r0 = (p409wi.AbstractC13588a.C13596h) r0
            int r1 = r0.f34985l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34985l = r1
            goto L18
        L13:
            wi.a$h r0 = new wi.a$h
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f34983j
            java.lang.Object r1 = p388vf.C13271b.m2873d()
            int r2 = r0.f34985l
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            pf.C11586t.m7586b(r5)
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            pf.C11586t.m7586b(r5)
            java.lang.Object r5 = r4.mo2080U()
            kotlinx.coroutines.internal.d0 r2 = p409wi.C13597b.f34989d
            if (r5 == r2) goto L52
            boolean r0 = r5 instanceof p409wi.C13614l
            if (r0 == 0) goto L4b
            wi.i$b r0 = p409wi.C13608i.f35011b
            wi.l r5 = (p409wi.C13614l) r5
            java.lang.Throwable r5 = r5.f35015m
            java.lang.Object r5 = r0.m2091a(r5)
            goto L51
        L4b:
            wi.i$b r0 = p409wi.C13608i.f35011b
            java.lang.Object r5 = r0.m2089c(r5)
        L51:
            return r5
        L52:
            r0.f34985l = r3
            java.lang.Object r5 = r4.m2143W(r3, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            wi.i r5 = (p409wi.C13608i) r5
            java.lang.Object r5 = r5.m2092j()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p409wi.AbstractC13588a.mo2061f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // p409wi.InterfaceC13624t
    /* renamed from: h */
    public final void mo2060h(CancellationException cancellationException) {
        if (mo2113O()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(C9839p0.m13120a(this) + " was cancelled");
        }
        m2150H(cancellationException);
    }
}

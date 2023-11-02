package kotlinx.coroutines;

import androidx.concurrent.futures.C0647b;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9577j;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.AbstractC9808y;
import kotlinx.coroutines.internal.C9768d0;
import kotlinx.coroutines.internal.C9790o;
import kotlinx.coroutines.internal.C9791p;
import kotlinx.coroutines.selects.InterfaceC9881d;
import p388vf.C13271b;
import p450yi.C14031a;
import p450yi.C14032b;
import pf.C11560f;
import si.AbstractC12540i;
import si.C12542k;

@Metadata(m14358d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006\u009d\u0001°\u0001±\u0001B\u0012\u0012\u0007\u0010\u00ad\u0001\u001a\u00020\u0015¢\u0006\u0006\b®\u0001\u0010¯\u0001J#\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u0010*\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b!\u0010\u001eJ\u0019\u0010#\u001a\u00020\"2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b#\u0010$J1\u0010*\u001a\u00020)2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&2\u0006\u0010(\u001a\u00020\u0015H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020)H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020)H\u0002¢\u0006\u0004\b3\u00104J\u001b\u00105\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b9\u00106J\u0019\u0010:\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b<\u0010=J%\u0010>\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b>\u0010?J#\u0010@\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\bC\u0010DJ*\u0010F\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010E\u001a\u00020B2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0082\u0010¢\u0006\u0004\bF\u0010GJ)\u0010I\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010H\u001a\u00020B2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u0004\u0018\u00010B*\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ\u0019\u0010O\u001a\u00020N2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u0004\u0018\u00010\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ\u0019\u0010T\u001a\u00020\u00102\b\u0010S\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bT\u0010UJ\r\u0010V\u001a\u00020\u0015¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u0010H\u0014¢\u0006\u0004\bX\u0010YJ\u0011\u0010\\\u001a\u00060Zj\u0002`[¢\u0006\u0004\b\\\u0010]J#\u0010_\u001a\u00060Zj\u0002`[*\u00020\u000b2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010NH\u0004¢\u0006\u0004\b_\u0010`J'\u0010b\u001a\u00020a2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&¢\u0006\u0004\bb\u0010cJ7\u0010e\u001a\u00020a2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010d\u001a\u00020\u00152\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&¢\u0006\u0004\be\u0010fJ\u0017\u0010g\u001a\u00020\u00102\u0006\u0010-\u001a\u00020)H\u0000¢\u0006\u0004\bg\u00104J\u001f\u0010h\u001a\u00020\u00102\u000e\u0010\u001c\u001a\n\u0018\u00010Zj\u0004\u0018\u0001`[H\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020NH\u0014¢\u0006\u0004\bj\u0010kJ\u0017\u0010l\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\bl\u0010mJ\u0015\u0010o\u001a\u00020\u00102\u0006\u0010n\u001a\u00020\u0003¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\bq\u0010 J\u0017\u0010r\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\br\u0010 J\u0019\u0010s\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bs\u0010tJ\u0013\u0010u\u001a\u00060Zj\u0002`[H\u0016¢\u0006\u0004\bu\u0010]J\u0019\u0010v\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bv\u0010tJ\u001b\u0010w\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bw\u00106J\u0015\u0010y\u001a\u00020x2\u0006\u0010E\u001a\u00020\u0002¢\u0006\u0004\by\u0010zJ\u0017\u0010|\u001a\u00020\u00102\u0006\u0010{\u001a\u00020\u000bH\u0010¢\u0006\u0004\b|\u0010mJ\u0019\u0010}\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b}\u0010mJ\u0017\u0010~\u001a\u00020\u00152\u0006\u0010{\u001a\u00020\u000bH\u0014¢\u0006\u0004\b~\u0010 J\u001a\u0010\u007f\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001c\u0010\u0081\u0001\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0006\b\u0081\u0001\u0010\u0080\u0001J\u0011\u0010\u0082\u0001\u001a\u00020NH\u0016¢\u0006\u0005\b\u0082\u0001\u0010kJ\u0011\u0010\u0083\u0001\u001a\u00020NH\u0007¢\u0006\u0005\b\u0083\u0001\u0010kJ\u0011\u0010\u0084\u0001\u001a\u00020NH\u0010¢\u0006\u0005\b\u0084\u0001\u0010kJ\u0014\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0017\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0004H\u0080@ø\u0001\u0000¢\u0006\u0005\b\u0087\u0001\u0010RJX\u0010\u008d\u0001\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010q2\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0088\u00012%\u0010\u008c\u0001\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u008a\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001JX\u0010\u008f\u0001\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010q2\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0088\u00012%\u0010\u008c\u0001\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u008a\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u008e\u0001R\u001e\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u00108R\u0019\u0010\u0095\u0001\u001a\u0007\u0012\u0002\b\u00030\u0092\u00018F¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R.\u0010\u009b\u0001\u001a\u0004\u0018\u00010x2\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010x8@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u0086\u0001R\u0016\u0010\u009e\u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010WR\u0013\u0010 \u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010WR\u0013\u0010¢\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010WR\u0016\u0010¤\u0001\u001a\u00020\u00158PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010WR\u001b\u0010¨\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010¥\u00018F¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010ª\u0001\u001a\u00020\u00158TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010WR\u0016\u0010¬\u0001\u001a\u00020\u00158PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010W\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006²\u0001"}, m14357d2 = {"Lkotlinx/coroutines/e2;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/w;", "Lkotlinx/coroutines/m2;", "", "Lkotlinx/coroutines/e2$c;", "state", "proposedUpdate", "Z", "(Lkotlinx/coroutines/e2$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "f0", "(Lkotlinx/coroutines/e2$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "", "E", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lkotlinx/coroutines/s1;", "update", "", "Q0", "(Lkotlinx/coroutines/s1;Ljava/lang/Object;)Z", "T", "(Lkotlinx/coroutines/s1;Ljava/lang/Object;)V", "Lkotlinx/coroutines/j2;", "list", "cause", "z0", "(Lkotlinx/coroutines/j2;Ljava/lang/Throwable;)V", "O", "(Ljava/lang/Throwable;)Z", "B0", "", "L0", "(Ljava/lang/Object;)I", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "Lkotlinx/coroutines/d2;", "v0", "(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/d2;", "expect", "node", "C", "(Ljava/lang/Object;Lkotlinx/coroutines/j2;Lkotlinx/coroutines/d2;)Z", "Lkotlinx/coroutines/g1;", "F0", "(Lkotlinx/coroutines/g1;)V", "G0", "(Lkotlinx/coroutines/d2;)V", "N", "(Ljava/lang/Object;)Ljava/lang/Object;", "X", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "r0", "i0", "(Lkotlinx/coroutines/s1;)Lkotlinx/coroutines/j2;", "R0", "(Lkotlinx/coroutines/s1;Ljava/lang/Throwable;)Z", "S0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "T0", "(Lkotlinx/coroutines/s1;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/v;", "a0", "(Lkotlinx/coroutines/s1;)Lkotlinx/coroutines/v;", "child", "U0", "(Lkotlinx/coroutines/e2$c;Lkotlinx/coroutines/v;Ljava/lang/Object;)Z", "lastChild", "W", "(Lkotlinx/coroutines/e2$c;Lkotlinx/coroutines/v;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/p;", "y0", "(Lkotlinx/coroutines/internal/p;)Lkotlinx/coroutines/v;", "", "M0", "(Ljava/lang/Object;)Ljava/lang/String;", "J", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parent", "o0", "(Lkotlinx/coroutines/Job;)V", ViewProps.START, "()Z", "E0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "D", "()Ljava/util/concurrent/CancellationException;", "message", "N0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/d1;", "Q", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/d1;", "invokeImmediately", "A", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/d1;", "I0", "h", "(Ljava/util/concurrent/CancellationException;)V", "P", "()Ljava/lang/String;", "M", "(Ljava/lang/Throwable;)V", "parentJob", "I", "(Lkotlinx/coroutines/m2;)V", "R", "K", "L", "(Ljava/lang/Object;)Z", "Y", "s0", "u0", "Lkotlinx/coroutines/u;", "A0", "(Lkotlinx/coroutines/w;)Lkotlinx/coroutines/u;", "exception", "n0", "C0", "m0", "D0", "(Ljava/lang/Object;)V", "F", "toString", "P0", "x0", "c0", "()Ljava/lang/Object;", "G", "Lkotlinx/coroutines/selects/d;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "H0", "(Lkotlinx/coroutines/selects/d;Lkotlin/jvm/functions/Function2;)V", "J0", "d0", "exceptionOrNull", "Lkotlin/coroutines/CoroutineContext$c;", "getKey", "()Lkotlin/coroutines/CoroutineContext$c;", "key", "value", "k0", "()Lkotlinx/coroutines/u;", "K0", "(Lkotlinx/coroutines/u;)V", "parentHandle", "l0", "a", "isActive", "i", "isCompleted", "p0", "isCancelled", "h0", "onCancelComplete", "Lkotlin/sequences/Sequence;", "t", "()Lkotlin/sequences/Sequence;", "children", "q0", "isScopedCoroutine", "g0", "handlesException", AppStateModule.APP_STATE_ACTIVE, "<init>", "(Z)V", "b", "c", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.e2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9696e2 implements Job, InterfaceC9907w, InterfaceC9826m2 {

    /* renamed from: j */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f25436j = AtomicReferenceFieldUpdater.newUpdater(C9696e2.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m14357d2 = {"Lkotlinx/coroutines/e2$a;", "T", "Lkotlinx/coroutines/p;", "Lkotlinx/coroutines/Job;", "parent", "", "x", "", "H", "Lkotlinx/coroutines/e2;", "r", "Lkotlinx/coroutines/e2;", "job", "Lkotlin/coroutines/Continuation;", "delegate", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/e2;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.e2$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9697a<T> extends C9838p<T> {

        /* renamed from: r */
        private final C9696e2 f25437r;

        public C9697a(Continuation<? super T> continuation, C9696e2 c9696e2) {
            super(continuation, 1);
            this.f25437r = c9696e2;
        }

        @Override // kotlinx.coroutines.C9838p
        /* renamed from: H */
        protected String mo13150H() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.C9838p
        /* renamed from: x */
        public Throwable mo13123x(Job job) {
            Throwable m13488f;
            Object m13504l0 = this.f25437r.m13504l0();
            if ((m13504l0 instanceof C9699c) && (m13488f = ((C9699c) m13504l0).m13488f()) != null) {
                return m13488f;
            }
            if (m13504l0 instanceof C9676b0) {
                return ((C9676b0) m13504l0).f25415a;
            }
            return job.mo13542D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m14357d2 = {"Lkotlinx/coroutines/e2$b;", "Lkotlinx/coroutines/d2;", "", "cause", "", "W", "Lkotlinx/coroutines/e2;", "n", "Lkotlinx/coroutines/e2;", "parent", "Lkotlinx/coroutines/e2$c;", "o", "Lkotlinx/coroutines/e2$c;", "state", "Lkotlinx/coroutines/v;", "p", "Lkotlinx/coroutines/v;", "child", "", "q", "Ljava/lang/Object;", "proposedUpdate", "<init>", "(Lkotlinx/coroutines/e2;Lkotlinx/coroutines/e2$c;Lkotlinx/coroutines/v;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.e2$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9698b extends AbstractC9689d2 {

        /* renamed from: n */
        private final C9696e2 f25438n;

        /* renamed from: o */
        private final C9699c f25439o;

        /* renamed from: p */
        private final C9903v f25440p;

        /* renamed from: q */
        private final Object f25441q;

        public C9698b(C9696e2 c9696e2, C9699c c9699c, C9903v c9903v, Object obj) {
            this.f25438n = c9696e2;
            this.f25439o = c9699c;
            this.f25440p = c9903v;
            this.f25441q = obj;
        }

        @Override // kotlinx.coroutines.AbstractC9687d0
        /* renamed from: W */
        public void mo12976W(Throwable th2) {
            this.f25438n.m13514W(this.f25439o, this.f25440p, this.f25441q);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            mo12976W(th2);
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b/\u00100J\u001f\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010(\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0010R\u0011\u0010*\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b)\u0010!R\u0011\u0010,\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b+\u0010!R\u0014\u0010.\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010!¨\u00061"}, m14357d2 = {"Lkotlinx/coroutines/e2$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/s1;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "c", "()Ljava/util/ArrayList;", "proposedException", "", "j", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/j2;", "Lkotlinx/coroutines/j2;", "d", "()Lkotlinx/coroutines/j2;", "list", "value", "e", "()Ljava/lang/Object;", "l", "(Ljava/lang/Object;)V", "exceptionsHolder", "", "h", "()Z", "k", "(Z)V", "isCompleting", "f", "()Ljava/lang/Throwable;", "m", "rootCause", "i", "isSealed", "g", "isCancelling", "a", "isActive", "<init>", "(Lkotlinx/coroutines/j2;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.e2$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9699c implements InterfaceC9852s1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: j */
        private final C9813j2 f25442j;

        public C9699c(C9813j2 c9813j2, boolean z, Throwable th2) {
            this.f25442j = c9813j2;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th2;
        }

        /* renamed from: c */
        private final ArrayList<Throwable> m13490c() {
            return new ArrayList<>(4);
        }

        /* renamed from: e */
        private final Object m13489e() {
            return this._exceptionsHolder;
        }

        /* renamed from: l */
        private final void m13482l(Object obj) {
            this._exceptionsHolder = obj;
        }

        @Override // kotlinx.coroutines.InterfaceC9852s1
        /* renamed from: a */
        public boolean mo13099a() {
            return m13488f() == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public final void m13491b(Throwable th2) {
            Throwable m13488f = m13488f();
            if (m13488f == null) {
                m13481m(th2);
            } else if (th2 == m13488f) {
            } else {
                Object m13489e = m13489e();
                if (m13489e == null) {
                    m13482l(th2);
                } else if (m13489e instanceof Throwable) {
                    if (th2 == m13489e) {
                        return;
                    }
                    ArrayList<Throwable> m13490c = m13490c();
                    m13490c.add(m13489e);
                    m13490c.add(th2);
                    m13482l(m13490c);
                } else if (m13489e instanceof ArrayList) {
                    ((ArrayList) m13489e).add(th2);
                } else {
                    throw new IllegalStateException(("State is " + m13489e).toString());
                }
            }
        }

        @Override // kotlinx.coroutines.InterfaceC9852s1
        /* renamed from: d */
        public C9813j2 mo13098d() {
            return this.f25442j;
        }

        /* renamed from: f */
        public final Throwable m13488f() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: g */
        public final boolean m13487g() {
            return m13488f() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        /* renamed from: h */
        public final boolean m13486h() {
            return this._isCompleting;
        }

        /* renamed from: i */
        public final boolean m13485i() {
            C9768d0 c9768d0;
            Object m13489e = m13489e();
            c9768d0 = C9705f2.f25455e;
            return m13489e == c9768d0;
        }

        /* renamed from: j */
        public final List<Throwable> m13484j(Throwable th2) {
            ArrayList<Throwable> arrayList;
            C9768d0 c9768d0;
            Object m13489e = m13489e();
            if (m13489e == null) {
                arrayList = m13490c();
            } else if (m13489e instanceof Throwable) {
                ArrayList<Throwable> m13490c = m13490c();
                m13490c.add(m13489e);
                arrayList = m13490c;
            } else if (m13489e instanceof ArrayList) {
                arrayList = (ArrayList) m13489e;
            } else {
                throw new IllegalStateException(("State is " + m13489e).toString());
            }
            Throwable m13488f = m13488f();
            if (m13488f != null) {
                arrayList.add(0, m13488f);
            }
            if (th2 != null && !C9612q.m13922c(th2, m13488f)) {
                arrayList.add(th2);
            }
            c9768d0 = C9705f2.f25455e;
            m13482l(c9768d0);
            return arrayList;
        }

        /* renamed from: k */
        public final void m13483k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* renamed from: m */
        public final void m13481m(Throwable th2) {
            this._rootCause = th2;
        }

        public String toString() {
            return "Finishing[cancelling=" + m13487g() + ", completing=" + m13486h() + ", rootCause=" + m13488f() + ", exceptions=" + m13489e() + ", list=" + mo13098d() + ']';
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, m14357d2 = {"kotlinx/coroutines/e2$d", "Lkotlinx/coroutines/internal/p$b;", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.e2$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9700d extends C9791p.AbstractC9793b {

        /* renamed from: d */
        final /* synthetic */ C9696e2 f25443d;

        /* renamed from: e */
        final /* synthetic */ Object f25444e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9700d(C9791p c9791p, C9696e2 c9696e2, Object obj) {
            super(c9791p);
            this.f25443d = c9696e2;
            this.f25444e = obj;
        }

        @Override // kotlinx.coroutines.internal.AbstractC9767d
        /* renamed from: k */
        public Object mo2115i(C9791p c9791p) {
            if (this.f25443d.m13504l0() == this.f25444e) {
                return null;
            }
            return C9790o.m13263a();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m14357d2 = {"Lsi/i;", "Lkotlinx/coroutines/Job;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 6, 0})
    @InterfaceC9571e(m13987c = "kotlinx.coroutines.JobSupport$children$1", m13986f = "JobSupport.kt", m13985l = {952, 954}, m13984m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.e2$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C9701e extends AbstractC9577j implements Function2<AbstractC12540i<? super Job>, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        Object f25445k;

        /* renamed from: l */
        Object f25446l;

        /* renamed from: m */
        int f25447m;

        /* renamed from: n */
        private /* synthetic */ Object f25448n;

        C9701e(Continuation<? super C9701e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b */
        public final Object invoke(AbstractC12540i<? super Job> abstractC12540i, Continuation<? super Unit> continuation) {
            return ((C9701e) create(abstractC12540i, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C9701e c9701e = new C9701e(continuation);
            c9701e.f25448n = obj;
            return c9701e;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0068 -> B:27:0x007e). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:27:0x007e). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p388vf.C13271b.m2873d()
                int r1 = r7.f25447m
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.f25446l
                kotlinx.coroutines.internal.p r1 = (kotlinx.coroutines.internal.C9791p) r1
                java.lang.Object r3 = r7.f25445k
                kotlinx.coroutines.internal.n r3 = (kotlinx.coroutines.internal.C9789n) r3
                java.lang.Object r4 = r7.f25448n
                si.i r4 = (si.AbstractC12540i) r4
                pf.C11586t.m7586b(r8)
                r8 = r7
                goto L7e
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                pf.C11586t.m7586b(r8)
                goto L83
            L2b:
                pf.C11586t.m7586b(r8)
                java.lang.Object r8 = r7.f25448n
                si.i r8 = (si.AbstractC12540i) r8
                kotlinx.coroutines.e2 r1 = kotlinx.coroutines.C9696e2.this
                java.lang.Object r1 = r1.m13504l0()
                boolean r4 = r1 instanceof kotlinx.coroutines.C9903v
                if (r4 == 0) goto L49
                kotlinx.coroutines.v r1 = (kotlinx.coroutines.C9903v) r1
                kotlinx.coroutines.w r1 = r1.f25763n
                r7.f25447m = r3
                java.lang.Object r8 = r8.mo4910e(r1, r7)
                if (r8 != r0) goto L83
                return r0
            L49:
                boolean r3 = r1 instanceof kotlinx.coroutines.InterfaceC9852s1
                if (r3 == 0) goto L83
                kotlinx.coroutines.s1 r1 = (kotlinx.coroutines.InterfaceC9852s1) r1
                kotlinx.coroutines.j2 r1 = r1.mo13098d()
                if (r1 == 0) goto L83
                java.lang.Object r3 = r1.m13251L()
                kotlinx.coroutines.internal.p r3 = (kotlinx.coroutines.internal.C9791p) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L60:
                boolean r5 = kotlin.jvm.internal.C9612q.m13922c(r1, r3)
                if (r5 != 0) goto L83
                boolean r5 = r1 instanceof kotlinx.coroutines.C9903v
                if (r5 == 0) goto L7e
                r5 = r1
                kotlinx.coroutines.v r5 = (kotlinx.coroutines.C9903v) r5
                kotlinx.coroutines.w r5 = r5.f25763n
                r8.f25448n = r4
                r8.f25445k = r3
                r8.f25446l = r1
                r8.f25447m = r2
                java.lang.Object r5 = r4.mo4910e(r5, r8)
                if (r5 != r0) goto L7e
                return r0
            L7e:
                kotlinx.coroutines.internal.p r1 = r1.m13250M()
                goto L60
            L83:
                kotlin.Unit r8 = kotlin.Unit.f25302a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C9696e2.C9701e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C9696e2(boolean z) {
        C9743g1 c9743g1;
        if (z) {
            c9743g1 = C9705f2.f25457g;
        } else {
            c9743g1 = C9705f2.f25456f;
        }
        this._state = c9743g1;
        this._parentHandle = null;
    }

    /* renamed from: B0 */
    private final void m13545B0(C9813j2 c9813j2, Throwable th2) {
        C9694e0 c9694e0 = null;
        for (C9791p c9791p = (C9791p) c9813j2.m13251L(); !C9612q.m13922c(c9791p, c9813j2); c9791p = c9791p.m13250M()) {
            if (c9791p instanceof AbstractC9689d2) {
                AbstractC9689d2 abstractC9689d2 = (AbstractC9689d2) c9791p;
                try {
                    abstractC9689d2.mo12976W(th2);
                } catch (Throwable th3) {
                    if (c9694e0 != null) {
                        C11560f.m7637a(c9694e0, th3);
                    } else {
                        c9694e0 = new C9694e0("Exception in completion handler " + abstractC9689d2 + " for " + this, th3);
                        Unit unit = Unit.f25302a;
                    }
                }
            }
        }
        if (c9694e0 != null) {
            mo13503n0(c9694e0);
        }
    }

    /* renamed from: C */
    private final boolean m13544C(Object obj, C9813j2 c9813j2, AbstractC9689d2 abstractC9689d2) {
        int m13242V;
        C9700d c9700d = new C9700d(abstractC9689d2, this, obj);
        do {
            m13242V = c9813j2.m13249N().m13242V(abstractC9689d2, c9813j2, c9700d);
            if (m13242V == 1) {
                return true;
            }
        } while (m13242V != 2);
        return false;
    }

    /* renamed from: E */
    private final void m13540E(Throwable th2, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th3 : list) {
            if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                C11560f.m7637a(th2, th3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.r1] */
    /* renamed from: F0 */
    private final void m13539F0(C9743g1 c9743g1) {
        C9813j2 c9813j2 = new C9813j2();
        if (!c9743g1.mo13099a()) {
            c9813j2 = new C9848r1(c9813j2);
        }
        C0647b.m39437a(f25436j, this, c9743g1, c9813j2);
    }

    /* renamed from: G0 */
    private final void m13537G0(AbstractC9689d2 abstractC9689d2) {
        abstractC9689d2.m13255H(new C9813j2());
        C0647b.m39437a(f25436j, this, abstractC9689d2, abstractC9689d2.m13250M());
    }

    /* renamed from: J */
    private final Object m13534J(Continuation<Object> continuation) {
        C9697a c9697a = new C9697a(C13271b.m2874c(continuation), this);
        c9697a.m13155C();
        C9846r.m13106a(c9697a, mo13521Q(new C9837o2(c9697a)));
        Object m13122y = c9697a.m13122y();
        if (m13122y == C13271b.m2873d()) {
            C9573g.m13976c(continuation);
        }
        return m13122y;
    }

    /* renamed from: L0 */
    private final int m13529L0(Object obj) {
        C9743g1 c9743g1;
        if (obj instanceof C9743g1) {
            if (((C9743g1) obj).mo13099a()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25436j;
            c9743g1 = C9705f2.f25457g;
            if (!C0647b.m39437a(atomicReferenceFieldUpdater, this, obj, c9743g1)) {
                return -1;
            }
            mo13363E0();
            return 1;
        } else if (!(obj instanceof C9848r1)) {
            return 0;
        } else {
            if (!C0647b.m39437a(f25436j, this, obj, ((C9848r1) obj).mo13098d())) {
                return -1;
            }
            mo13363E0();
            return 1;
        }
    }

    /* renamed from: M0 */
    private final String m13528M0(Object obj) {
        if (obj instanceof C9699c) {
            C9699c c9699c = (C9699c) obj;
            if (c9699c.m13487g()) {
                return "Cancelling";
            }
            if (!c9699c.m13486h()) {
                return "Active";
            }
            return "Completing";
        } else if (obj instanceof InterfaceC9852s1) {
            if (((InterfaceC9852s1) obj).mo13099a()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C9676b0) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    /* renamed from: N */
    private final Object m13527N(Object obj) {
        C9768d0 c9768d0;
        Object m13518S0;
        C9768d0 c9768d02;
        do {
            Object m13504l0 = m13504l0();
            if ((m13504l0 instanceof InterfaceC9852s1) && (!(m13504l0 instanceof C9699c) || !((C9699c) m13504l0).m13486h())) {
                m13518S0 = m13518S0(m13504l0, new C9676b0(m13513X(obj), false, 2, null));
                c9768d02 = C9705f2.f25453c;
            } else {
                c9768d0 = C9705f2.f25451a;
                return c9768d0;
            }
        } while (m13518S0 == c9768d02);
        return m13518S0;
    }

    /* renamed from: O */
    private final boolean m13525O(Throwable th2) {
        if (mo13333q0()) {
            return true;
        }
        boolean z = th2 instanceof CancellationException;
        InterfaceC9898u m13505k0 = m13505k0();
        if (m13505k0 != null && m13505k0 != C9817k2.f25638j) {
            if (m13505k0.mo12986c(th2) || z) {
                return true;
            }
            return false;
        }
        return z;
    }

    /* renamed from: O0 */
    public static /* synthetic */ CancellationException m13524O0(C9696e2 c9696e2, Throwable th2, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return c9696e2.m13526N0(th2, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: Q0 */
    private final boolean m13520Q0(InterfaceC9852s1 interfaceC9852s1, Object obj) {
        if (!C0647b.m39437a(f25436j, this, interfaceC9852s1, C9705f2.m13467g(obj))) {
            return false;
        }
        m13543C0(null);
        mo13541D0(obj);
        m13517T(interfaceC9852s1, obj);
        return true;
    }

    /* renamed from: R0 */
    private final boolean m13519R0(InterfaceC9852s1 interfaceC9852s1, Throwable th2) {
        C9813j2 m13506i0 = m13506i0(interfaceC9852s1);
        if (m13506i0 == null) {
            return false;
        }
        if (!C0647b.m39437a(f25436j, this, interfaceC9852s1, new C9699c(m13506i0, false, th2))) {
            return false;
        }
        m13492z0(m13506i0, th2);
        return true;
    }

    /* renamed from: S0 */
    private final Object m13518S0(Object obj, Object obj2) {
        C9768d0 c9768d0;
        C9768d0 c9768d02;
        if (!(obj instanceof InterfaceC9852s1)) {
            c9768d02 = C9705f2.f25451a;
            return c9768d02;
        } else if (((obj instanceof C9743g1) || (obj instanceof AbstractC9689d2)) && !(obj instanceof C9903v) && !(obj2 instanceof C9676b0)) {
            if (m13520Q0((InterfaceC9852s1) obj, obj2)) {
                return obj2;
            }
            c9768d0 = C9705f2.f25453c;
            return c9768d0;
        } else {
            return m13516T0((InterfaceC9852s1) obj, obj2);
        }
    }

    /* renamed from: T */
    private final void m13517T(InterfaceC9852s1 interfaceC9852s1, Object obj) {
        C9676b0 c9676b0;
        InterfaceC9898u m13505k0 = m13505k0();
        if (m13505k0 != null) {
            m13505k0.dispose();
            m13531K0(C9817k2.f25638j);
        }
        Throwable th2 = null;
        if (obj instanceof C9676b0) {
            c9676b0 = (C9676b0) obj;
        } else {
            c9676b0 = null;
        }
        if (c9676b0 != null) {
            th2 = c9676b0.f25415a;
        }
        if (interfaceC9852s1 instanceof AbstractC9689d2) {
            try {
                ((AbstractC9689d2) interfaceC9852s1).mo12976W(th2);
                return;
            } catch (Throwable th3) {
                mo13503n0(new C9694e0("Exception in completion handler " + interfaceC9852s1 + " for " + this, th3));
                return;
            }
        }
        C9813j2 mo13098d = interfaceC9852s1.mo13098d();
        if (mo13098d != null) {
            m13545B0(mo13098d, th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* renamed from: T0 */
    private final Object m13516T0(InterfaceC9852s1 interfaceC9852s1, Object obj) {
        C9699c c9699c;
        C9676b0 c9676b0;
        C9768d0 c9768d0;
        C9768d0 c9768d02;
        C9768d0 c9768d03;
        C9813j2 m13506i0 = m13506i0(interfaceC9852s1);
        if (m13506i0 == null) {
            c9768d03 = C9705f2.f25453c;
            return c9768d03;
        }
        ?? r2 = 0;
        if (interfaceC9852s1 instanceof C9699c) {
            c9699c = (C9699c) interfaceC9852s1;
        } else {
            c9699c = null;
        }
        boolean z = false;
        if (c9699c == null) {
            c9699c = new C9699c(m13506i0, false, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (c9699c) {
            if (c9699c.m13486h()) {
                c9768d02 = C9705f2.f25451a;
                return c9768d02;
            }
            c9699c.m13483k(true);
            if (c9699c != interfaceC9852s1 && !C0647b.m39437a(f25436j, this, interfaceC9852s1, c9699c)) {
                c9768d0 = C9705f2.f25453c;
                return c9768d0;
            }
            boolean m13487g = c9699c.m13487g();
            if (obj instanceof C9676b0) {
                c9676b0 = (C9676b0) obj;
            } else {
                c9676b0 = null;
            }
            if (c9676b0 != null) {
                c9699c.m13491b(c9676b0.f25415a);
            }
            Throwable m13488f = c9699c.m13488f();
            if (!m13487g) {
                z = true;
            }
            if (Boolean.valueOf(z).booleanValue()) {
                r2 = m13488f;
            }
            ref$ObjectRef.f25329j = r2;
            Unit unit = Unit.f25302a;
            if (r2 != 0) {
                m13492z0(m13506i0, r2);
            }
            C9903v m13511a0 = m13511a0(interfaceC9852s1);
            if (m13511a0 != null && m13515U0(c9699c, m13511a0, obj)) {
                return C9705f2.f25452b;
            }
            return m13512Z(c9699c, obj);
        }
    }

    /* renamed from: U0 */
    private final boolean m13515U0(C9699c c9699c, C9903v c9903v, Object obj) {
        while (Job.C9668a.m13591d(c9903v.f25763n, false, false, new C9698b(this, c9699c, c9903v, obj), 1, null) == C9817k2.f25638j) {
            c9903v = m13494y0(c9903v);
            if (c9903v == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public final void m13514W(C9699c c9699c, C9903v c9903v, Object obj) {
        C9903v m13494y0 = m13494y0(c9903v);
        if (m13494y0 != null && m13515U0(c9699c, m13494y0, obj)) {
            return;
        }
        mo12972F(m13512Z(c9699c, obj));
    }

    /* renamed from: X */
    private final Throwable m13513X(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        if (z) {
            Throwable th2 = (Throwable) obj;
            if (th2 == null) {
                return new C9913x1(mo13523P(), null, this);
            }
            return th2;
        } else if (obj != null) {
            return ((InterfaceC9826m2) obj).mo13164Y();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* renamed from: Z */
    private final Object m13512Z(C9699c c9699c, Object obj) {
        C9676b0 c9676b0;
        Throwable th2;
        boolean m13487g;
        Throwable m13508f0;
        if (obj instanceof C9676b0) {
            c9676b0 = (C9676b0) obj;
        } else {
            c9676b0 = null;
        }
        if (c9676b0 != null) {
            th2 = c9676b0.f25415a;
        } else {
            th2 = null;
        }
        synchronized (c9699c) {
            m13487g = c9699c.m13487g();
            List<Throwable> m13484j = c9699c.m13484j(th2);
            m13508f0 = m13508f0(c9699c, m13484j);
            if (m13508f0 != null) {
                m13540E(m13508f0, m13484j);
            }
        }
        boolean z = false;
        if (m13508f0 != null && m13508f0 != th2) {
            obj = new C9676b0(m13508f0, false, 2, null);
        }
        if (m13508f0 != null) {
            if ((m13525O(m13508f0) || mo13101m0(m13508f0)) ? true : true) {
                if (obj != null) {
                    ((C9676b0) obj).m13571b();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        if (!m13487g) {
            m13543C0(m13508f0);
        }
        mo13541D0(obj);
        C0647b.m39437a(f25436j, this, c9699c, C9705f2.m13467g(obj));
        m13517T(c9699c, obj);
        return obj;
    }

    /* renamed from: a0 */
    private final C9903v m13511a0(InterfaceC9852s1 interfaceC9852s1) {
        C9903v c9903v = interfaceC9852s1 instanceof C9903v ? (C9903v) interfaceC9852s1 : null;
        if (c9903v == null) {
            C9813j2 mo13098d = interfaceC9852s1.mo13098d();
            if (mo13098d != null) {
                return m13494y0(mo13098d);
            }
            return null;
        }
        return c9903v;
    }

    /* renamed from: d0 */
    private final Throwable m13509d0(Object obj) {
        C9676b0 c9676b0 = obj instanceof C9676b0 ? (C9676b0) obj : null;
        if (c9676b0 != null) {
            return c9676b0.f25415a;
        }
        return null;
    }

    /* renamed from: f0 */
    private final Throwable m13508f0(C9699c c9699c, List<? extends Throwable> list) {
        Object obj;
        boolean z;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (!c9699c.m13487g()) {
                return null;
            }
            return new C9913x1(mo13523P(), null, this);
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = list.get(0);
        if (th3 instanceof C9910w2) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th4 = (Throwable) next;
                if (th4 != th3 && (th4 instanceof C9910w2)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    /* renamed from: i0 */
    private final C9813j2 m13506i0(InterfaceC9852s1 interfaceC9852s1) {
        C9813j2 mo13098d = interfaceC9852s1.mo13098d();
        if (mo13098d == null) {
            if (interfaceC9852s1 instanceof C9743g1) {
                return new C9813j2();
            }
            if (interfaceC9852s1 instanceof AbstractC9689d2) {
                m13537G0((AbstractC9689d2) interfaceC9852s1);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + interfaceC9852s1).toString());
        }
        return mo13098d;
    }

    /* renamed from: r0 */
    private final Object m13500r0(Object obj) {
        C9768d0 c9768d0;
        C9768d0 c9768d02;
        C9768d0 c9768d03;
        C9768d0 c9768d04;
        C9768d0 c9768d05;
        C9768d0 c9768d06;
        Throwable th2 = null;
        Throwable th3 = null;
        while (true) {
            Object m13504l0 = m13504l0();
            if (m13504l0 instanceof C9699c) {
                synchronized (m13504l0) {
                    if (((C9699c) m13504l0).m13485i()) {
                        c9768d02 = C9705f2.f25454d;
                        return c9768d02;
                    }
                    boolean m13487g = ((C9699c) m13504l0).m13487g();
                    if (obj != null || !m13487g) {
                        if (th3 == null) {
                            th3 = m13513X(obj);
                        }
                        ((C9699c) m13504l0).m13491b(th3);
                    }
                    Throwable m13488f = ((C9699c) m13504l0).m13488f();
                    if (!m13487g) {
                        th2 = m13488f;
                    }
                    if (th2 != null) {
                        m13492z0(((C9699c) m13504l0).mo13098d(), th2);
                    }
                    c9768d0 = C9705f2.f25451a;
                    return c9768d0;
                }
            } else if (m13504l0 instanceof InterfaceC9852s1) {
                if (th3 == null) {
                    th3 = m13513X(obj);
                }
                InterfaceC9852s1 interfaceC9852s1 = (InterfaceC9852s1) m13504l0;
                if (interfaceC9852s1.mo13099a()) {
                    if (m13519R0(interfaceC9852s1, th3)) {
                        c9768d04 = C9705f2.f25451a;
                        return c9768d04;
                    }
                } else {
                    Object m13518S0 = m13518S0(m13504l0, new C9676b0(th3, false, 2, null));
                    c9768d05 = C9705f2.f25451a;
                    if (m13518S0 != c9768d05) {
                        c9768d06 = C9705f2.f25453c;
                        if (m13518S0 != c9768d06) {
                            return m13518S0;
                        }
                    } else {
                        throw new IllegalStateException(("Cannot happen in " + m13504l0).toString());
                    }
                }
            } else {
                c9768d03 = C9705f2.f25454d;
                return c9768d03;
            }
        }
    }

    /* renamed from: v0 */
    private final AbstractC9689d2 m13496v0(Function1<? super Throwable, Unit> function1, boolean z) {
        AbstractC9689d2 abstractC9689d2 = null;
        if (z) {
            if (function1 instanceof AbstractC9917y1) {
                abstractC9689d2 = (AbstractC9917y1) function1;
            }
            if (abstractC9689d2 == null) {
                abstractC9689d2 = new C9905v1(function1);
            }
        } else {
            if (function1 instanceof AbstractC9689d2) {
                abstractC9689d2 = (AbstractC9689d2) function1;
            }
            if (abstractC9689d2 == null) {
                abstractC9689d2 = new C9909w1(function1);
            }
        }
        abstractC9689d2.m13556Y(this);
        return abstractC9689d2;
    }

    /* renamed from: y0 */
    private final C9903v m13494y0(C9791p c9791p) {
        while (c9791p.mo13246Q()) {
            c9791p = c9791p.m13249N();
        }
        while (true) {
            c9791p = c9791p.m13250M();
            if (!c9791p.mo13246Q()) {
                if (c9791p instanceof C9903v) {
                    return (C9903v) c9791p;
                }
                if (c9791p instanceof C9813j2) {
                    return null;
                }
            }
        }
    }

    /* renamed from: z0 */
    private final void m13492z0(C9813j2 c9813j2, Throwable th2) {
        m13543C0(th2);
        C9694e0 c9694e0 = null;
        for (C9791p c9791p = (C9791p) c9813j2.m13251L(); !C9612q.m13922c(c9791p, c9813j2); c9791p = c9791p.m13250M()) {
            if (c9791p instanceof AbstractC9917y1) {
                AbstractC9689d2 abstractC9689d2 = (AbstractC9689d2) c9791p;
                try {
                    abstractC9689d2.mo12976W(th2);
                } catch (Throwable th3) {
                    if (c9694e0 != null) {
                        C11560f.m7637a(c9694e0, th3);
                    } else {
                        c9694e0 = new C9694e0("Exception in completion handler " + abstractC9689d2 + " for " + this, th3);
                        Unit unit = Unit.f25302a;
                    }
                }
            }
        }
        if (c9694e0 != null) {
            mo13503n0(c9694e0);
        }
        m13525O(th2);
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: A */
    public final InterfaceC9688d1 mo13547A(boolean z, boolean z2, Function1<? super Throwable, Unit> function1) {
        C9676b0 c9676b0;
        AbstractC9689d2 m13496v0 = m13496v0(function1, z);
        while (true) {
            Object m13504l0 = m13504l0();
            if (m13504l0 instanceof C9743g1) {
                C9743g1 c9743g1 = (C9743g1) m13504l0;
                if (c9743g1.mo13099a()) {
                    if (C0647b.m39437a(f25436j, this, m13504l0, m13496v0)) {
                        return m13496v0;
                    }
                } else {
                    m13539F0(c9743g1);
                }
            } else {
                Throwable th2 = null;
                if (m13504l0 instanceof InterfaceC9852s1) {
                    C9813j2 mo13098d = ((InterfaceC9852s1) m13504l0).mo13098d();
                    if (mo13098d == null) {
                        if (m13504l0 != null) {
                            m13537G0((AbstractC9689d2) m13504l0);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        }
                    } else {
                        InterfaceC9688d1 interfaceC9688d1 = C9817k2.f25638j;
                        if (z && (m13504l0 instanceof C9699c)) {
                            synchronized (m13504l0) {
                                th2 = ((C9699c) m13504l0).m13488f();
                                if (th2 == null || ((function1 instanceof C9903v) && !((C9699c) m13504l0).m13486h())) {
                                    if (m13544C(m13504l0, mo13098d, m13496v0)) {
                                        if (th2 == null) {
                                            return m13496v0;
                                        }
                                        interfaceC9688d1 = m13496v0;
                                    }
                                }
                                Unit unit = Unit.f25302a;
                            }
                        }
                        if (th2 != null) {
                            if (z2) {
                                function1.invoke(th2);
                            }
                            return interfaceC9688d1;
                        } else if (m13544C(m13504l0, mo13098d, m13496v0)) {
                            return m13496v0;
                        }
                    }
                } else {
                    if (z2) {
                        if (m13504l0 instanceof C9676b0) {
                            c9676b0 = (C9676b0) m13504l0;
                        } else {
                            c9676b0 = null;
                        }
                        if (c9676b0 != null) {
                            th2 = c9676b0.f25415a;
                        }
                        function1.invoke(th2);
                    }
                    return C9817k2.f25638j;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: A0 */
    public final InterfaceC9898u mo13546A0(InterfaceC9907w interfaceC9907w) {
        return (InterfaceC9898u) Job.C9668a.m13591d(this, true, false, new C9903v(interfaceC9907w), 2, null);
    }

    /* renamed from: C0 */
    protected void m13543C0(Throwable th2) {
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: D */
    public final CancellationException mo13542D() {
        Object m13504l0 = m13504l0();
        if (m13504l0 instanceof C9699c) {
            Throwable m13488f = ((C9699c) m13504l0).m13488f();
            if (m13488f != null) {
                CancellationException m13526N0 = m13526N0(m13488f, C9839p0.m13120a(this) + " is cancelling");
                if (m13526N0 != null) {
                    return m13526N0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(m13504l0 instanceof InterfaceC9852s1)) {
            if (m13504l0 instanceof C9676b0) {
                return m13524O0(this, ((C9676b0) m13504l0).f25415a, null, 1, null);
            }
            return new C9913x1(C9839p0.m13120a(this) + " has completed normally", null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    /* renamed from: D0 */
    protected void mo13541D0(Object obj) {
    }

    /* renamed from: E0 */
    protected void mo13363E0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public void mo12972F(Object obj) {
    }

    /* renamed from: G */
    public final Object m13538G(Continuation<Object> continuation) {
        Object m13504l0;
        do {
            m13504l0 = m13504l0();
            if (!(m13504l0 instanceof InterfaceC9852s1)) {
                if (!(m13504l0 instanceof C9676b0)) {
                    return C9705f2.m13466h(m13504l0);
                }
                throw ((C9676b0) m13504l0).f25415a;
            }
        } while (m13529L0(m13504l0) < 0);
        return m13534J(continuation);
    }

    /* renamed from: H0 */
    public final <T, R> void m13536H0(InterfaceC9881d<? super R> interfaceC9881d, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        Object m13504l0;
        do {
            m13504l0 = m13504l0();
            if (interfaceC9881d.mo13021e()) {
                return;
            }
            if (!(m13504l0 instanceof InterfaceC9852s1)) {
                if (interfaceC9881d.mo13018s()) {
                    if (m13504l0 instanceof C9676b0) {
                        interfaceC9881d.mo13016x(((C9676b0) m13504l0).f25415a);
                        return;
                    } else {
                        C14032b.m858c(function2, C9705f2.m13466h(m13504l0), interfaceC9881d.mo13017w());
                        return;
                    }
                }
                return;
            }
        } while (m13529L0(m13504l0) != 0);
        interfaceC9881d.mo13020m(mo13521Q(new C9845q2(interfaceC9881d, function2)));
    }

    @Override // kotlinx.coroutines.InterfaceC9907w
    /* renamed from: I */
    public final void mo12977I(InterfaceC9826m2 interfaceC9826m2) {
        m13530L(interfaceC9826m2);
    }

    /* renamed from: I0 */
    public final void m13535I0(AbstractC9689d2 abstractC9689d2) {
        Object m13504l0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C9743g1 c9743g1;
        do {
            m13504l0 = m13504l0();
            if (m13504l0 instanceof AbstractC9689d2) {
                if (m13504l0 != abstractC9689d2) {
                    return;
                }
                atomicReferenceFieldUpdater = f25436j;
                c9743g1 = C9705f2.f25457g;
            } else if ((m13504l0 instanceof InterfaceC9852s1) && ((InterfaceC9852s1) m13504l0).mo13098d() != null) {
                abstractC9689d2.mo2042R();
                return;
            } else {
                return;
            }
        } while (!C0647b.m39437a(atomicReferenceFieldUpdater, this, m13504l0, c9743g1));
    }

    /* renamed from: J0 */
    public final <T, R> void m13533J0(InterfaceC9881d<? super R> interfaceC9881d, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        Object m13504l0 = m13504l0();
        if (m13504l0 instanceof C9676b0) {
            interfaceC9881d.mo13016x(((C9676b0) m13504l0).f25415a);
        } else {
            C14031a.m861e(function2, C9705f2.m13466h(m13504l0), interfaceC9881d.mo13017w(), null, 4, null);
        }
    }

    /* renamed from: K */
    public final boolean m13532K(Throwable th2) {
        return m13530L(th2);
    }

    /* renamed from: K0 */
    public final void m13531K0(InterfaceC9898u interfaceC9898u) {
        this._parentHandle = interfaceC9898u;
    }

    /* renamed from: L */
    public final boolean m13530L(Object obj) {
        Object obj2;
        C9768d0 c9768d0;
        C9768d0 c9768d02;
        C9768d0 c9768d03;
        obj2 = C9705f2.f25451a;
        if (mo12948h0() && (obj2 = m13527N(obj)) == C9705f2.f25452b) {
            return true;
        }
        c9768d0 = C9705f2.f25451a;
        if (obj2 == c9768d0) {
            obj2 = m13500r0(obj);
        }
        c9768d02 = C9705f2.f25451a;
        if (obj2 == c9768d02 || obj2 == C9705f2.f25452b) {
            return true;
        }
        c9768d03 = C9705f2.f25454d;
        if (obj2 == c9768d03) {
            return false;
        }
        mo12972F(obj2);
        return true;
    }

    /* renamed from: M */
    public void mo2106M(Throwable th2) {
        m13530L(th2);
    }

    /* renamed from: N0 */
    protected final CancellationException m13526N0(Throwable th2, String str) {
        CancellationException cancellationException;
        if (th2 instanceof CancellationException) {
            cancellationException = (CancellationException) th2;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = mo13523P();
            }
            cancellationException = new C9913x1(str, th2, this);
        }
        return cancellationException;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: P */
    public String mo13523P() {
        return "Job was cancelled";
    }

    /* renamed from: P0 */
    public final String m13522P0() {
        return mo12967x0() + '{' + m13528M0(m13504l0()) + '}';
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: Q */
    public final InterfaceC9688d1 mo13521Q(Function1<? super Throwable, Unit> function1) {
        return mo13547A(false, true, function1);
    }

    /* renamed from: R */
    public boolean mo1455R(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        if (m13530L(th2) && mo12949g0()) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC9826m2
    /* renamed from: Y */
    public CancellationException mo13164Y() {
        Throwable th2;
        Object m13504l0 = m13504l0();
        CancellationException cancellationException = null;
        if (m13504l0 instanceof C9699c) {
            th2 = ((C9699c) m13504l0).m13488f();
        } else if (m13504l0 instanceof C9676b0) {
            th2 = ((C9676b0) m13504l0).f25415a;
        } else if (!(m13504l0 instanceof InterfaceC9852s1)) {
            th2 = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + m13504l0).toString());
        }
        if (th2 instanceof CancellationException) {
            cancellationException = th2;
        }
        if (cancellationException == null) {
            return new C9913x1("Parent job is " + m13528M0(m13504l0), th2, this);
        }
        return cancellationException;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: a */
    public boolean mo2067a() {
        Object m13504l0 = m13504l0();
        if ((m13504l0 instanceof InterfaceC9852s1) && ((InterfaceC9852s1) m13504l0).mo13099a()) {
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    public final Object m13510c0() {
        Object m13504l0 = m13504l0();
        if (!(m13504l0 instanceof InterfaceC9852s1)) {
            if (!(m13504l0 instanceof C9676b0)) {
                return C9705f2.m13466h(m13504l0);
            }
            throw ((C9676b0) m13504l0).f25415a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: e0 */
    public CoroutineContext mo1459e0(CoroutineContext coroutineContext) {
        return Job.C9668a.m13589f(this, coroutineContext);
    }

    /* renamed from: g0 */
    public boolean mo12949g0() {
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.InterfaceC9564b
    public final CoroutineContext.InterfaceC9566c<?> getKey() {
        return Job.f25404c;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: h */
    public void mo2104h(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C9913x1(mo13523P(), null, this);
        }
        mo2106M(cancellationException);
    }

    /* renamed from: h0 */
    public boolean mo12948h0() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: i */
    public final boolean mo13507i() {
        return !(m13504l0() instanceof InterfaceC9852s1);
    }

    @Override // kotlin.coroutines.CoroutineContext.InterfaceC9564b, kotlin.coroutines.CoroutineContext
    /* renamed from: j */
    public <E extends CoroutineContext.InterfaceC9564b> E mo1458j(CoroutineContext.InterfaceC9566c<E> interfaceC9566c) {
        return (E) Job.C9668a.m13592c(this, interfaceC9566c);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: j0 */
    public CoroutineContext mo1457j0(CoroutineContext.InterfaceC9566c<?> interfaceC9566c) {
        return Job.C9668a.m13590e(this, interfaceC9566c);
    }

    /* renamed from: k0 */
    public final InterfaceC9898u m13505k0() {
        return (InterfaceC9898u) this._parentHandle;
    }

    /* renamed from: l0 */
    public final Object m13504l0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC9808y)) {
                return obj;
            }
            ((AbstractC9808y) obj).mo13022c(this);
        }
    }

    /* renamed from: m0 */
    protected boolean mo13101m0(Throwable th2) {
        return false;
    }

    /* renamed from: n0 */
    public void mo13503n0(Throwable th2) {
        throw th2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o0 */
    public final void m13502o0(Job job) {
        if (job == null) {
            m13531K0(C9817k2.f25638j);
            return;
        }
        job.start();
        InterfaceC9898u mo13546A0 = job.mo13546A0(this);
        m13531K0(mo13546A0);
        if (mo13507i()) {
            mo13546A0.dispose();
            m13531K0(C9817k2.f25638j);
        }
    }

    /* renamed from: p0 */
    public final boolean m13501p0() {
        Object m13504l0 = m13504l0();
        if (!(m13504l0 instanceof C9676b0) && (!(m13504l0 instanceof C9699c) || !((C9699c) m13504l0).m13487g())) {
            return false;
        }
        return true;
    }

    /* renamed from: q0 */
    protected boolean mo13333q0() {
        return false;
    }

    /* renamed from: s0 */
    public final boolean m13499s0(Object obj) {
        Object m13518S0;
        C9768d0 c9768d0;
        C9768d0 c9768d02;
        do {
            m13518S0 = m13518S0(m13504l0(), obj);
            c9768d0 = C9705f2.f25451a;
            if (m13518S0 == c9768d0) {
                return false;
            }
            if (m13518S0 == C9705f2.f25452b) {
                return true;
            }
            c9768d02 = C9705f2.f25453c;
        } while (m13518S0 == c9768d02);
        mo12972F(m13518S0);
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int m13529L0;
        do {
            m13529L0 = m13529L0(m13504l0());
            if (m13529L0 == 0) {
                return false;
            }
        } while (m13529L0 != 1);
        return true;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: t */
    public final Sequence<Job> mo13498t() {
        Sequence<Job> m4882b;
        m4882b = C12542k.m4882b(new C9701e(null));
        return m4882b;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: t0 */
    public <R> R mo1456t0(R r, Function2<? super R, ? super CoroutineContext.InterfaceC9564b, ? extends R> function2) {
        return (R) Job.C9668a.m13593b(this, r, function2);
    }

    public String toString() {
        return m13522P0() + '@' + C9839p0.m13119b(this);
    }

    /* renamed from: u0 */
    public final Object m13497u0(Object obj) {
        Object m13518S0;
        C9768d0 c9768d0;
        C9768d0 c9768d02;
        do {
            m13518S0 = m13518S0(m13504l0(), obj);
            c9768d0 = C9705f2.f25451a;
            if (m13518S0 != c9768d0) {
                c9768d02 = C9705f2.f25453c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m13509d0(obj));
            }
        } while (m13518S0 == c9768d02);
        return m13518S0;
    }

    /* renamed from: x0 */
    public String mo12967x0() {
        return C9839p0.m13120a(this);
    }
}

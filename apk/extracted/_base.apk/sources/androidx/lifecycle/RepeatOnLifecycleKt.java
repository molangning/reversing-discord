package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9824m0;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aC\u0010\f\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m14357d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "block", "a", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "b", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, m14356k = 2, m14355mv = {1, 6, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class RepeatOnLifecycleKt {
    /* renamed from: a */
    public static final Object m36085a(Lifecycle lifecycle, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        boolean z;
        Object m2869d;
        if (state != Lifecycle.State.INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (lifecycle.mo36124b() == Lifecycle.State.DESTROYED) {
                return Unit.f25302a;
            }
            Object m13168g = C9824m0.m13168g(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, function2, null), continuation);
            m2869d = C13277d.m2869d();
            if (m13168g == m2869d) {
                return m13168g;
            }
            return Unit.f25302a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }

    /* renamed from: b */
    public static final Object m36084b(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object m2869d;
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C9612q.m13918g(lifecycle, "lifecycle");
        Object m36085a = m36085a(lifecycle, state, function2, continuation);
        m2869d = C13277d.m2869d();
        return m36085a == m2869d ? m36085a : Unit.f25302a;
    }
}

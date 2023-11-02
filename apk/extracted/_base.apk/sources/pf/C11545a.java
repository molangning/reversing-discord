package pf;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B@\u00124\u0010\n\u001a0\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fRK\u0010\n\u001a0\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00048\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m14357d2 = {"Lpf/a;", "T", "R", "", "Lkotlin/Function3;", "Lpf/c;", "Lkotlin/coroutines/Continuation;", "a", "Lkotlin/jvm/functions/Function3;", "()Lkotlin/jvm/functions/Function3;", "block", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pf.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11545a<T, R> {

    /* renamed from: a */
    private final Function3<AbstractC11551c<T, R>, T, Continuation<? super R>, Object> f30050a;

    /* JADX WARN: Multi-variable type inference failed */
    public C11545a(Function3<? super AbstractC11551c<T, R>, ? super T, ? super Continuation<? super R>, ? extends Object> block) {
        C9612q.m13917h(block, "block");
        this.f30050a = block;
    }

    /* renamed from: a */
    public final Function3<AbstractC11551c<T, R>, T, Continuation<? super R>, Object> m7707a() {
        return this.f30050a;
    }
}

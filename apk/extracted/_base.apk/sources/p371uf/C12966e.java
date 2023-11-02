package p371uf;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import p388vf.C13272c;
import pf.C11583s;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aT\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m14357d2 = {"R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "receiver", "completion", "", "a", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: uf.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12966e {
    /* renamed from: a */
    public static final <R, T> void m3571a(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> completion) {
        Continuation m2871b;
        Continuation m2870c;
        C9612q.m13917h(function2, "<this>");
        C9612q.m13917h(completion, "completion");
        m2871b = C13272c.m2871b(function2, r, completion);
        m2870c = C13272c.m2870c(m2871b);
        C11583s.C11584a c11584a = C11583s.f30090k;
        m2870c.resumeWith(C11583s.m7596b(Unit.f25302a));
    }
}

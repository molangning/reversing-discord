package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004JQ\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001e¨\u0006\""}, m14357d2 = {"Lkotlinx/coroutines/a0;", "", "Lkotlinx/coroutines/p;", "cont", "", "cause", "", "d", "result", "Lkotlinx/coroutines/n;", "cancelHandler", "Lkotlin/Function1;", "onCancellation", "idempotentResume", "cancelCause", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "b", "Lkotlinx/coroutines/n;", "c", "Lkotlin/jvm/functions/Function1;", "e", "Ljava/lang/Throwable;", "()Z", "cancelled", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/n;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C9671a0 {

    /* renamed from: a */
    public final Object f25407a;

    /* renamed from: b */
    public final AbstractC9827n f25408b;

    /* renamed from: c */
    public final Function1<Throwable, Unit> f25409c;

    /* renamed from: d */
    public final Object f25410d;

    /* renamed from: e */
    public final Throwable f25411e;

    /* JADX WARN: Multi-variable type inference failed */
    public C9671a0(Object obj, AbstractC9827n abstractC9827n, Function1<? super Throwable, Unit> function1, Object obj2, Throwable th2) {
        this.f25407a = obj;
        this.f25408b = abstractC9827n;
        this.f25409c = function1;
        this.f25410d = obj2;
        this.f25411e = th2;
    }

    /* renamed from: b */
    public static /* synthetic */ C9671a0 m13586b(C9671a0 c9671a0, Object obj, AbstractC9827n abstractC9827n, Function1 function1, Object obj2, Throwable th2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = c9671a0.f25407a;
        }
        if ((i & 2) != 0) {
            abstractC9827n = c9671a0.f25408b;
        }
        AbstractC9827n abstractC9827n2 = abstractC9827n;
        Function1<Throwable, Unit> function12 = function1;
        if ((i & 4) != 0) {
            function12 = c9671a0.f25409c;
        }
        Function1 function13 = function12;
        if ((i & 8) != 0) {
            obj2 = c9671a0.f25410d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th2 = c9671a0.f25411e;
        }
        return c9671a0.m13587a(obj, abstractC9827n2, function13, obj4, th2);
    }

    /* renamed from: a */
    public final C9671a0 m13587a(Object obj, AbstractC9827n abstractC9827n, Function1<? super Throwable, Unit> function1, Object obj2, Throwable th2) {
        return new C9671a0(obj, abstractC9827n, function1, obj2, th2);
    }

    /* renamed from: c */
    public final boolean m13585c() {
        return this.f25411e != null;
    }

    /* renamed from: d */
    public final void m13584d(C9838p<?> c9838p, Throwable th2) {
        AbstractC9827n abstractC9827n = this.f25408b;
        if (abstractC9827n != null) {
            c9838p.m13134m(abstractC9827n, th2);
        }
        Function1<Throwable, Unit> function1 = this.f25409c;
        if (function1 != null) {
            c9838p.m13132o(function1, th2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9671a0) {
            C9671a0 c9671a0 = (C9671a0) obj;
            return C9612q.m13922c(this.f25407a, c9671a0.f25407a) && C9612q.m13922c(this.f25408b, c9671a0.f25408b) && C9612q.m13922c(this.f25409c, c9671a0.f25409c) && C9612q.m13922c(this.f25410d, c9671a0.f25410d) && C9612q.m13922c(this.f25411e, c9671a0.f25411e);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f25407a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC9827n abstractC9827n = this.f25408b;
        int hashCode2 = (hashCode + (abstractC9827n == null ? 0 : abstractC9827n.hashCode())) * 31;
        Function1<Throwable, Unit> function1 = this.f25409c;
        int hashCode3 = (hashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.f25410d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f25411e;
        return hashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f25407a + ", cancelHandler=" + this.f25408b + ", onCancellation=" + this.f25409c + ", idempotentResume=" + this.f25410d + ", cancelCause=" + this.f25411e + ')';
    }

    public /* synthetic */ C9671a0(Object obj, AbstractC9827n abstractC9827n, Function1 function1, Object obj2, Throwable th2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : abstractC9827n, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th2);
    }
}

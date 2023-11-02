package p045cj;

import ag.C0156a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\f\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R/\u0010\f\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0013"}, m14357d2 = {"Lcj/p;", "T", "Lcj/x1;", "Lkotlin/reflect/KClass;", "", "key", "Lkotlinx/serialization/KSerializer;", "a", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "b", "()Lkotlin/jvm/functions/Function1;", "compute", "Lcj/r;", "Lcj/k;", "Lcj/r;", "classValue", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C2625p<T> implements InterfaceC2655x1<T> {

    /* renamed from: a */
    private final Function1<KClass<?>, KSerializer<T>> f7100a;

    /* renamed from: b */
    private final C2633r<C2605k<T>> f7101b;

    @Metadata(m14358d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m14357d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: cj.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C2626a extends AbstractC9614s implements Function0<T> {

        /* renamed from: k */
        final /* synthetic */ KClass f7103k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2626a(KClass kClass) {
            super(0);
            this.f7103k = kClass;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) new C2605k(C2625p.this.m32830b().invoke(this.f7103k));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2625p(Function1<? super KClass<?>, ? extends KSerializer<T>> compute) {
        C9612q.m13917h(compute, "compute");
        this.f7100a = compute;
        this.f7101b = new C2633r<>();
    }

    @Override // p045cj.InterfaceC2655x1
    /* renamed from: a */
    public KSerializer<T> mo32770a(KClass<Object> key) {
        C9612q.m13917h(key, "key");
        Object obj = this.f7101b.get(C0156a.m41055b(key));
        C9612q.m13918g(obj, "get(key)");
        C2559a1 c2559a1 = (C2559a1) obj;
        T t = c2559a1.f7012a.get();
        if (t == null) {
            t = (T) c2559a1.m32981a(new C2626a(key));
        }
        return ((C2605k) t).f7079a;
    }

    /* renamed from: b */
    public final Function1<KClass<?>, KSerializer<T>> m32830b() {
        return this.f7100a;
    }
}

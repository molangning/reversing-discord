package p045cj;

import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0005\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, m14357d2 = {"Lcj/a1;", "T", "", "Lkotlin/Function0;", "factory", "a", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/lang/ref/SoftReference;", "Ljava/lang/ref/SoftReference;", "reference", "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.a1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C2559a1<T> {

    /* renamed from: a */
    public volatile SoftReference<T> f7012a = new SoftReference<>(null);

    /* renamed from: a */
    public final synchronized T m32981a(Function0<? extends T> factory) {
        C9612q.m13917h(factory, "factory");
        T t = this.f7012a.get();
        if (t != null) {
            return t;
        }
        T invoke = factory.invoke();
        this.f7012a = new SoftReference<>(invoke);
        return invoke;
    }
}

package kg;

import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001f\u0012\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\t\u0010\nR$\u0010\b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00028\u00000\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m14357d2 = {"Lkg/e;", "V", "Ljava/lang/ClassValue;", "Ljava/lang/ref/SoftReference;", "Lkotlin/Function1;", "Ljava/lang/Class;", "a", "Lkotlin/jvm/functions/Function1;", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class C9244e<V> extends ClassValue<SoftReference<V>> {

    /* renamed from: a */
    public final Function1<Class<?>, V> f24302a;

    /* JADX WARN: Multi-variable type inference failed */
    public C9244e(Function1<? super Class<?>, ? extends V> compute) {
        C9612q.m13917h(compute, "compute");
        this.f24302a = compute;
    }
}

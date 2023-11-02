package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p324rf.C12146h;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0001\u001a\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0001¨\u0006\n"}, m14357d2 = {"T", "element", "", "c", "(Ljava/lang/Object;)Ljava/util/Set;", "E", "", "b", "builder", "a", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/collections/SetsKt")
/* renamed from: kotlin.collections.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9559v {
    /* renamed from: a */
    public static <E> Set<E> m14010a(Set<E> builder) {
        C9612q.m13917h(builder, "builder");
        return ((C12146h) builder).m6047e();
    }

    /* renamed from: b */
    public static <E> Set<E> m14009b() {
        return new C12146h();
    }

    /* renamed from: c */
    public static <T> Set<T> m14008c(T t) {
        Set<T> singleton = Collections.singleton(t);
        C9612q.m13918g(singleton, "singleton(element)");
        return singleton;
    }
}

package kotlin.jvm.internal;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m14357d2 = {"T", "", "array", "", "a", "([Ljava/lang/Object;)Ljava/util/Iterator;", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: kotlin.jvm.internal.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9581b {
    /* renamed from: a */
    public static final <T> Iterator<T> m13973a(T[] array) {
        C9612q.m13917h(array, "array");
        return new C9579a(array);
    }
}
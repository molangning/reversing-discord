package kotlin.collections;

import java.lang.reflect.Array;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¨\u0006\n"}, m14357d2 = {"T", "", "reference", "", "size", "a", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "toIndex", "", "b", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/collections/ArraysKt")
/* renamed from: kotlin.collections.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C9534c {
    /* renamed from: a */
    public static final <T> T[] m14277a(T[] reference, int i) {
        C9612q.m13917h(reference, "reference");
        Object newInstance = Array.newInstance(reference.getClass().getComponentType(), i);
        C9612q.m13919f(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }

    /* renamed from: b */
    public static final void m14276b(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }
}
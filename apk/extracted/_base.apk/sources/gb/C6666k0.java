package gb;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* renamed from: gb.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C6666k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> T[] m22192a(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> T[] m22191b(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <K, V> Map<K, V> m22190c(int i) {
        return C6657k.m22206r(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static <K, V> Map<K, V> m22189d() {
        return C6657k.m22211m();
    }
}

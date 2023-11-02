package p164j$.util.concurrent;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* renamed from: j$.util.concurrent.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
abstract class AbstractC8408w {

    /* renamed from: a */
    private static final Unsafe f22526a;

    static {
        Field m17725b = m17725b();
        m17725b.setAccessible(true);
        try {
            f22526a = (Unsafe) m17725b.get(null);
        } catch (IllegalAccessException e) {
            throw new Error("Couldn't get the Unsafe", e);
        }
    }

    /* renamed from: a */
    public static final int m17726a(Unsafe unsafe, Object obj, long j) {
        int intVolatile;
        do {
            intVolatile = unsafe.getIntVolatile(obj, j);
        } while (!unsafe.compareAndSwapInt(obj, j, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    /* renamed from: b */
    private static Field m17725b() {
        Field[] declaredFields;
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new Error("Couldn't find the Unsafe", e);
        }
    }

    /* renamed from: c */
    public static Unsafe m17724c() {
        return f22526a;
    }
}

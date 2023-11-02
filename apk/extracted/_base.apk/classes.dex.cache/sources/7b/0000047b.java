package androidx.core.graphics;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1033m extends C1032l {
    @Override // androidx.core.graphics.C1032l
    /* renamed from: i */
    protected Typeface mo38020i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3375g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3381m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.core.graphics.C1032l
    /* renamed from: u */
    protected Method mo38019u(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
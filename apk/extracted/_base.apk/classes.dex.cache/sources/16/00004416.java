package net.time4j.android.spi;

import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.time4j.base.C10616c;
import p288pj.InterfaceC11650e;

/* renamed from: net.time4j.android.spi.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
class C10610a implements InterfaceC11650e {

    /* renamed from: a */
    private static final Class[] f27677a;

    /* renamed from: b */
    private static final Object[] f27678b;

    /* renamed from: c */
    private static final Method f27679c;

    static {
        Class[] clsArr = new Class[0];
        f27677a = clsArr;
        Object[] objArr = new Object[0];
        f27678b = objArr;
        Method method = null;
        try {
            Method method2 = SystemClock.class.getMethod("elapsedRealtimeNanos", clsArr);
            method2.invoke(null, objArr);
            method = method2;
        } catch (IllegalAccessException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        f27679c = method;
    }

    @Override // p288pj.InterfaceC11650e
    /* renamed from: a */
    public long mo7354a() {
        Method method = f27679c;
        if (method != null) {
            try {
                return ((Long) method.invoke(null, f27678b)).longValue();
            } catch (IllegalAccessException e) {
                e.printStackTrace(System.err);
            } catch (InvocationTargetException e2) {
                e2.printStackTrace(System.err);
            }
        }
        return C10616c.m11033i(SystemClock.elapsedRealtime(), 1000000L);
    }

    @Override // p288pj.InterfaceC11650e
    /* renamed from: b */
    public String mo7353b() {
        return "Dalvik";
    }
}
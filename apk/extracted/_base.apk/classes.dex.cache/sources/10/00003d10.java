package p175j9;

import android.os.IBinder;
import java.lang.reflect.Field;
import p029b9.C2198p;
import p175j9.InterfaceC8875a;

/* renamed from: j9.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class BinderC8877b<T> extends InterfaceC8875a.AbstractBinderC8876a {

    /* renamed from: c */
    private final T f23259c;

    private BinderC8877b(T t) {
        this.f23259c = t;
    }

    /* renamed from: c */
    public static <T> T m17114c(InterfaceC8875a interfaceC8875a) {
        if (interfaceC8875a instanceof BinderC8877b) {
            return ((BinderC8877b) interfaceC8875a).f23259c;
        }
        IBinder asBinder = interfaceC8875a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C2198p.m33985j(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        int length = declaredFields.length;
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("Unexpected number of IObjectWrapper declared fields: ");
        sb2.append(length);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: e */
    public static <T> InterfaceC8875a m17113e(T t) {
        return new BinderC8877b(t);
    }
}
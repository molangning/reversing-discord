package vg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C9612q;
import p407wg.C13548d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: vg.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13293m {

    /* renamed from: a */
    public static final C13293m f34374a = new C13293m();

    private C13293m() {
    }

    /* renamed from: a */
    public final String m2832a(Constructor<?> constructor) {
        C9612q.m13917h(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        C9612q.m13918g(parameterTypes, "constructor.parameterTypes");
        for (Class<?> parameterType : parameterTypes) {
            C9612q.m13918g(parameterType, "parameterType");
            sb2.append(C13548d.m2245b(parameterType));
        }
        sb2.append(")V");
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "sb.toString()");
        return sb3;
    }

    /* renamed from: b */
    public final String m2831b(Field field) {
        C9612q.m13917h(field, "field");
        Class<?> type = field.getType();
        C9612q.m13918g(type, "field.type");
        return C13548d.m2245b(type);
    }

    /* renamed from: c */
    public final String m2830c(Method method) {
        C9612q.m13917h(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        C9612q.m13918g(parameterTypes, "method.parameterTypes");
        for (Class<?> parameterType : parameterTypes) {
            C9612q.m13918g(parameterType, "parameterType");
            sb2.append(C13548d.m2245b(parameterType));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        C9612q.m13918g(returnType, "method.returnType");
        sb2.append(C13548d.m2245b(returnType));
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "sb.toString()");
        return sb3;
    }
}
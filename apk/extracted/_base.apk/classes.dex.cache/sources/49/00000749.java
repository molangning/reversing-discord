package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\u001aK\u0010\t\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a6\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0010\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000bH\u0000\"\u001e\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, m14357d2 = {"Landroidx/lifecycle/d0;", "T", "Ljava/lang/Class;", "modelClass", "Ljava/lang/reflect/Constructor;", "constructor", "", "", "params", "d", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/d0;", "", "signature", "c", "a", "Ljava/util/List;", "ANDROID_VIEWMODEL_SIGNATURE", "b", "VIEWMODEL_SIGNATURE", "lifecycle-viewmodel-savedstate_release"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: androidx.lifecycle.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1679c0 {

    /* renamed from: a */
    private static final List<Class<?>> f4505a;

    /* renamed from: b */
    private static final List<Class<?>> f4506b;

    static {
        List<Class<?>> m14101l;
        List<Class<?>> m14109d;
        m14101l = C9545j.m14101l(Application.class, C1711x.class);
        f4505a = m14101l;
        m14109d = C9544i.m14109d(C1711x.class);
        f4506b = m14109d;
    }

    /* renamed from: c */
    public static final <T> Constructor<T> m36048c(Class<T> modelClass, List<? extends Class<?>> signature) {
        List m14197u0;
        C9612q.m13917h(modelClass, "modelClass");
        C9612q.m13917h(signature, "signature");
        Constructor<?>[] constructors = modelClass.getConstructors();
        C9612q.m13918g(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            C9612q.m13918g(parameterTypes, "constructor.parameterTypes");
            m14197u0 = C9538f.m14197u0(parameterTypes);
            if (C9612q.m13922c(signature, m14197u0)) {
                return constructor2;
            }
            if (signature.size() == m14197u0.size() && m14197u0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final <T extends AbstractC1681d0> T m36047d(Class<T> modelClass, Constructor<T> constructor, Object... params) {
        C9612q.m13917h(modelClass, "modelClass");
        C9612q.m13917h(constructor, "constructor");
        C9612q.m13917h(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + modelClass, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e3.getCause());
        }
    }
}
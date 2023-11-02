package p181jg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kg.AbstractC9231c0;
import kg.AbstractC9282l;
import kg.C9245e0;
import kg.C9336p0;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import p140hg.C7149n;
import p140hg.InterfaceC7131d;
import p218lg.InterfaceC10153e;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\b\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\f\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"/\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\r8F¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m14357d2 = {"Lkotlin/reflect/KProperty;", "Ljava/lang/reflect/Field;", "b", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Field;", "javaField", "Ljava/lang/reflect/Method;", "c", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Method;", "javaGetter", "Lhg/d;", "e", "(Lhg/d;)Ljava/lang/reflect/Method;", "javaSetter", "Lkotlin/reflect/KFunction;", "d", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Method;", "javaMethod", "T", "Ljava/lang/reflect/Constructor;", "a", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Constructor;", "getJavaConstructor$annotations", "(Lkotlin/reflect/KFunction;)V", "javaConstructor", "Lkotlin/reflect/KType;", "Ljava/lang/reflect/Type;", "f", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "javaType", "kotlin-reflection"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: jg.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C8939c {
    /* renamed from: a */
    public static final <T> Constructor<T> m17023a(KFunction<? extends T> kFunction) {
        Object obj;
        InterfaceC10153e<?> mo15829u;
        C9612q.m13917h(kFunction, "<this>");
        AbstractC9282l<?> m15858b = C9336p0.m15858b(kFunction);
        if (m15858b != null && (mo15829u = m15858b.mo15829u()) != null) {
            obj = mo15829u.mo12138b();
        } else {
            obj = null;
        }
        if (!(obj instanceof Constructor)) {
            return null;
        }
        return (Constructor) obj;
    }

    /* renamed from: b */
    public static final Field m17022b(KProperty<?> kProperty) {
        C9612q.m13917h(kProperty, "<this>");
        AbstractC9231c0<?> m15856d = C9336p0.m15856d(kProperty);
        if (m15856d != null) {
            return m15856d.m16019F();
        }
        return null;
    }

    /* renamed from: c */
    public static final Method m17021c(KProperty<?> kProperty) {
        C9612q.m13917h(kProperty, "<this>");
        return m17020d(kProperty.mo13882f());
    }

    /* renamed from: d */
    public static final Method m17020d(KFunction<?> kFunction) {
        Object obj;
        InterfaceC10153e<?> mo15829u;
        C9612q.m13917h(kFunction, "<this>");
        AbstractC9282l<?> m15858b = C9336p0.m15858b(kFunction);
        if (m15858b != null && (mo15829u = m15858b.mo15829u()) != null) {
            obj = mo15829u.mo12138b();
        } else {
            obj = null;
        }
        if (!(obj instanceof Method)) {
            return null;
        }
        return (Method) obj;
    }

    /* renamed from: e */
    public static final Method m17019e(InterfaceC7131d<?> interfaceC7131d) {
        C9612q.m13917h(interfaceC7131d, "<this>");
        return m17020d(interfaceC7131d.mo13897h());
    }

    /* renamed from: f */
    public static final Type m17018f(KType kType) {
        C9612q.m13917h(kType, "<this>");
        Type mo13899c = ((C9245e0) kType).mo13899c();
        if (mo13899c == null) {
            return C7149n.m21369g(kType);
        }
        return mo13899c;
    }
}
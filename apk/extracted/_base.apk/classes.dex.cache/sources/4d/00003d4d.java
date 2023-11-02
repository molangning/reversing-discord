package p181jg;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kg.AbstractC9282l;
import kg.C9336p0;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import p140hg.InterfaceC7131d;
import p218lg.InterfaceC10153e;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\",\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m14357d2 = {"Lkotlin/reflect/KCallable;", "", "value", "a", "(Lkotlin/reflect/KCallable;)Z", "setAccessible", "(Lkotlin/reflect/KCallable;Z)V", "isAccessible", "kotlin-reflection"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: jg.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C8937a {
    /* renamed from: a */
    public static final boolean m17026a(KCallable<?> kCallable) {
        boolean z;
        Object obj;
        boolean z2;
        boolean z3;
        InterfaceC10153e<?> mo15827w;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        C9612q.m13917h(kCallable, "<this>");
        if (kCallable instanceof InterfaceC7131d) {
            KProperty kProperty = (KProperty) kCallable;
            Field m17022b = C8939c.m17022b(kProperty);
            if (m17022b != null) {
                z10 = m17022b.isAccessible();
            } else {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
            Method m17021c = C8939c.m17021c(kProperty);
            if (m17021c != null) {
                z11 = m17021c.isAccessible();
            } else {
                z11 = true;
            }
            if (!z11) {
                return false;
            }
            Method m17019e = C8939c.m17019e((InterfaceC7131d) kCallable);
            if (m17019e != null) {
                z12 = m17019e.isAccessible();
            } else {
                z12 = true;
            }
            if (!z12) {
                return false;
            }
        } else if (kCallable instanceof KProperty) {
            KProperty kProperty2 = (KProperty) kCallable;
            Field m17022b2 = C8939c.m17022b(kProperty2);
            if (m17022b2 != null) {
                z8 = m17022b2.isAccessible();
            } else {
                z8 = true;
            }
            if (!z8) {
                return false;
            }
            Method m17021c2 = C8939c.m17021c(kProperty2);
            if (m17021c2 != null) {
                z9 = m17021c2.isAccessible();
            } else {
                z9 = true;
            }
            if (!z9) {
                return false;
            }
        } else if (kCallable instanceof KProperty.InterfaceC9630b) {
            Field m17022b3 = C8939c.m17022b(((KProperty.InterfaceC9630b) kCallable).mo13881e());
            if (m17022b3 != null) {
                z6 = m17022b3.isAccessible();
            } else {
                z6 = true;
            }
            if (!z6) {
                return false;
            }
            Method m17020d = C8939c.m17020d((KFunction) kCallable);
            if (m17020d != null) {
                z7 = m17020d.isAccessible();
            } else {
                z7 = true;
            }
            if (!z7) {
                return false;
            }
        } else if (kCallable instanceof InterfaceC7131d.InterfaceC7132a) {
            Field m17022b4 = C8939c.m17022b(((InterfaceC7131d.InterfaceC7132a) kCallable).mo13881e());
            if (m17022b4 != null) {
                z4 = m17022b4.isAccessible();
            } else {
                z4 = true;
            }
            if (!z4) {
                return false;
            }
            Method m17020d2 = C8939c.m17020d((KFunction) kCallable);
            if (m17020d2 != null) {
                z5 = m17020d2.isAccessible();
            } else {
                z5 = true;
            }
            if (!z5) {
                return false;
            }
        } else if (kCallable instanceof KFunction) {
            KFunction kFunction = (KFunction) kCallable;
            Method m17020d3 = C8939c.m17020d(kFunction);
            if (m17020d3 != null) {
                z = m17020d3.isAccessible();
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            AbstractC9282l<?> m15858b = C9336p0.m15858b(kCallable);
            AccessibleObject accessibleObject = null;
            if (m15858b != null && (mo15827w = m15858b.mo15827w()) != null) {
                obj = mo15827w.mo12138b();
            } else {
                obj = null;
            }
            if (obj instanceof AccessibleObject) {
                accessibleObject = (AccessibleObject) obj;
            }
            if (accessibleObject != null) {
                z2 = accessibleObject.isAccessible();
            } else {
                z2 = true;
            }
            if (!z2) {
                return false;
            }
            Constructor m17023a = C8939c.m17023a(kFunction);
            if (m17023a != null) {
                z3 = m17023a.isAccessible();
            } else {
                z3 = true;
            }
            if (!z3) {
                return false;
            }
        } else {
            throw new UnsupportedOperationException("Unknown callable: " + kCallable + " (" + kCallable.getClass() + ')');
        }
        return true;
    }
}
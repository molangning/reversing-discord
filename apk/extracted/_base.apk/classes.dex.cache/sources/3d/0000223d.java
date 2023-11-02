package com.facebook.hermes.intl;

import java.util.Arrays;
import p128h4.C6935j;
import p128h4.C6947l;

/* renamed from: com.facebook.hermes.intl.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3681j {

    /* renamed from: com.facebook.hermes.intl.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC3682a {
        BOOLEAN,
        STRING
    }

    /* renamed from: a */
    public static Object m31259a(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C6935j.m21631n(obj)) {
            return obj4;
        }
        if (C6935j.m21634k(obj)) {
            double m21639f = C6935j.m21639f(obj);
            if (!Double.isNaN(m21639f) && m21639f <= C6935j.m21639f(obj3) && m21639f >= C6935j.m21639f(obj2)) {
                return obj;
            }
            throw new C6947l("Invalid number value !");
        }
        throw new C6947l("Invalid number value !");
    }

    /* renamed from: b */
    public static Object m31258b(Object obj, String str, Object obj2, Object obj3, Object obj4) {
        return m31259a(C6935j.m21644a(obj, str), obj2, obj3, obj4);
    }

    /* renamed from: c */
    public static Object m31257c(Object obj, String str, EnumC3682a enumC3682a, Object obj2, Object obj3) {
        Object m21644a = C6935j.m21644a(obj, str);
        if (C6935j.m21631n(m21644a)) {
            return obj3;
        }
        if (C6935j.m21635j(m21644a)) {
            m21644a = "";
        }
        if (enumC3682a == EnumC3682a.BOOLEAN && !C6935j.m21636i(m21644a)) {
            throw new C6947l("Boolean option expected but not found");
        }
        if (enumC3682a == EnumC3682a.STRING && !C6935j.m21632m(m21644a)) {
            throw new C6947l("String option expected but not found");
        }
        if (!C6935j.m21631n(obj2) && !Arrays.asList((Object[]) obj2).contains(m21644a)) {
            throw new C6947l("String option expected but not found");
        }
        return m21644a;
    }

    /* renamed from: d */
    public static <T extends Enum<T>> T m31256d(Class<T> cls, Object obj) {
        T[] enumConstants;
        if (C6935j.m21631n(obj)) {
            return (T) Enum.valueOf(cls, "UNDEFINED");
        }
        if (C6935j.m21635j(obj)) {
            return null;
        }
        String m21637h = C6935j.m21637h(obj);
        if (m21637h.equals("2-digit")) {
            return (T) Enum.valueOf(cls, "DIGIT2");
        }
        for (T t : cls.getEnumConstants()) {
            if (t.name().compareToIgnoreCase(m21637h) == 0) {
                return t;
            }
        }
        return null;
    }
}
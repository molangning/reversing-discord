package p270oh;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import wf.C13538c;

/* renamed from: oh.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11110b {

    /* renamed from: a */
    public static final C11110b f29075a = new C11110b();

    /* renamed from: b */
    private static final String f29076b;

    /* renamed from: c */
    private static final Map<String, String> f29077c;

    static {
        List m14101l;
        String m14046d0;
        List m14101l2;
        List<String> m14101l3;
        List<String> m14101l4;
        List<String> m14101l5;
        int i;
        m14101l = C9545j.m14101l('k', 'o', 't', 'l', 'i', 'n');
        m14046d0 = C9553r.m14046d0(m14101l, "", null, null, 0, null, null, 62, null);
        f29076b = m14046d0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m14101l2 = C9545j.m14101l("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int m2277c = C13538c.m2277c(0, m14101l2.size() - 1, 2);
        if (m2277c >= 0) {
            int i2 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f29076b;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) m14101l2.get(i2));
                linkedHashMap.put(sb2.toString(), m14101l2.get(i2 + 1));
                linkedHashMap.put(str + '/' + ((String) m14101l2.get(i2)) + "Array", '[' + ((String) m14101l2.get(i)));
                if (i2 == m2277c) {
                    break;
                }
                i2 += 2;
            }
        }
        linkedHashMap.put(f29076b + "/Unit", "V");
        m9145a(linkedHashMap, "Any", "java/lang/Object");
        m9145a(linkedHashMap, "Nothing", "java/lang/Void");
        m9145a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        m14101l3 = C9545j.m14101l("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum");
        for (String str2 : m14101l3) {
            m9145a(linkedHashMap, str2, "java/lang/" + str2);
        }
        m14101l4 = C9545j.m14101l("Iterator", "Collection", "List", "Set", "Map", "ListIterator");
        for (String str3 : m14101l4) {
            m9145a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            m9145a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        m9145a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m9145a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m9145a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m9145a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            StringBuilder sb3 = new StringBuilder();
            String str4 = f29076b;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            m9145a(linkedHashMap, "Function" + i3, sb3.toString());
            m9145a(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        m14101l5 = C9545j.m14101l("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum");
        for (String str5 : m14101l5) {
            m9145a(linkedHashMap, str5 + ".Companion", f29076b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f29077c = linkedHashMap;
    }

    private C11110b() {
    }

    /* renamed from: a */
    private static final void m9145a(Map<String, String> map, String str, String str2) {
        map.put(f29076b + '/' + str, 'L' + str2 + ';');
    }

    /* renamed from: b */
    public static final String m9144b(String classId) {
        String m13763C;
        C9612q.m13917h(classId, "classId");
        String str = f29077c.get(classId);
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            m13763C = C9653o.m13763C(classId, '.', '$', false, 4, null);
            sb2.append(m13763C);
            sb2.append(';');
            return sb2.toString();
        }
        return str;
    }
}

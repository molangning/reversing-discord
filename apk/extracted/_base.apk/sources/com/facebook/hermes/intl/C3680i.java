package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.C3677g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p128h4.C6935j;
import p128h4.C6971p3;

/* renamed from: com.facebook.hermes.intl.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3680i {
    /* renamed from: a */
    public static HashMap<String, Object> m31260a(List<String> list, Object obj, List<String> list2) {
        C3677g.C3678a m31270f;
        HashMap<String, Object> hashMap = new HashMap<>();
        String m21637h = C6935j.m21637h(C6935j.m21644a(obj, "localeMatcher"));
        if (Build.VERSION.SDK_INT >= 24 && !m21637h.equals("lookup")) {
            m31270f = C3677g.m31273c((String[]) list.toArray(new String[list.size()]));
        } else {
            m31270f = C3677g.m31270f((String[]) list.toArray(new String[list.size()]));
        }
        HashSet<String> hashSet = new HashSet();
        for (String str : list2) {
            Object m21643b = C6935j.m21643b();
            Object obj2 = m21643b;
            if (!m31270f.f10226b.isEmpty()) {
                obj2 = m21643b;
                if (m31270f.f10226b.containsKey(str)) {
                    String str2 = m31270f.f10226b.get(str);
                    boolean isEmpty = str2.isEmpty();
                    String str3 = str2;
                    if (isEmpty) {
                        str3 = C6935j.m21627r("true");
                    }
                    hashSet.add(str);
                    obj2 = str3;
                }
            }
            if (C6935j.m21638g(obj).containsKey(str)) {
                Object m21644a = C6935j.m21644a(obj, str);
                if (C6935j.m21632m(m21644a) && C6935j.m21637h(m21644a).isEmpty()) {
                    m21644a = C6935j.m21630o(true);
                }
                if (!C6935j.m21631n(m21644a) && !m21644a.equals(obj2)) {
                    hashSet.remove(str);
                    obj2 = m21644a;
                }
            }
            if (!C6935j.m21635j(obj2)) {
                obj2 = C6971p3.m21589f(str, obj2);
            }
            if (C6935j.m21632m(obj2) && !C6971p3.m21592c(str, C6935j.m21637h(obj2), m31270f.f10225a)) {
                hashMap.put(str, C6935j.m21643b());
            } else {
                hashMap.put(str, obj2);
            }
        }
        for (String str4 : hashSet) {
            ArrayList<String> arrayList = new ArrayList<>();
            String m21637h2 = C6935j.m21637h(C6971p3.m21589f(str4, C6935j.m21627r(m31270f.f10226b.get(str4))));
            if (!C6935j.m21632m(m21637h2) || C6971p3.m21592c(str4, C6935j.m21637h(m21637h2), m31270f.f10225a)) {
                arrayList.add(m21637h2);
                m31270f.f10225a.mo21546f(str4, arrayList);
            }
        }
        hashMap.put("locale", m31270f.f10225a);
        return hashMap;
    }
}

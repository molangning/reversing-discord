package p164j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8316s {

    /* renamed from: a */
    private final Map f22346a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8316s(Map map) {
        Comparator comparator;
        Comparator comparator2;
        this.f22346a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                int i = C8299b.f22305c;
                hashMap2.put((String) entry2.getValue(), new AbstractMap.SimpleImmutableEntry((String) entry2.getValue(), (Long) entry2.getKey()));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            comparator2 = C8299b.f22304b;
            Collections.sort(arrayList2, comparator2);
            hashMap.put((EnumC8320w) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        comparator = C8299b.f22304b;
        Collections.sort(arrayList, comparator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final String m17855a(long j, EnumC8320w enumC8320w) {
        Map map = (Map) this.f22346a.get(enumC8320w);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }
}

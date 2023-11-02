package p445yc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p424xc.C13777a;

/* renamed from: yc.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13973b {

    /* renamed from: a */
    private final Map<Integer, Integer> f35951a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] m1046a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry<Integer, Integer> entry : this.f35951a.entrySet()) {
            if (entry.getValue().intValue() > i) {
                i = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == i) {
                arrayList.add(entry.getKey());
            }
        }
        return C13777a.m1568b(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1045b(int i) {
        Integer num = this.f35951a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f35951a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}

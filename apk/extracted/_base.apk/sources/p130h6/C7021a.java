package p130h6;

import android.util.SparseArray;
import java.util.HashMap;
import p347t5.EnumC12590d;

/* renamed from: h6.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7021a {

    /* renamed from: a */
    private static SparseArray<EnumC12590d> f19208a = new SparseArray<>();

    /* renamed from: b */
    private static HashMap<EnumC12590d, Integer> f19209b;

    static {
        HashMap<EnumC12590d, Integer> hashMap = new HashMap<>();
        f19209b = hashMap;
        hashMap.put(EnumC12590d.DEFAULT, 0);
        f19209b.put(EnumC12590d.VERY_LOW, 1);
        f19209b.put(EnumC12590d.HIGHEST, 2);
        for (EnumC12590d enumC12590d : f19209b.keySet()) {
            f19208a.append(f19209b.get(enumC12590d).intValue(), enumC12590d);
        }
    }

    /* renamed from: a */
    public static int m21528a(EnumC12590d enumC12590d) {
        Integer num = f19209b.get(enumC12590d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC12590d);
    }

    /* renamed from: b */
    public static EnumC12590d m21527b(int i) {
        EnumC12590d enumC12590d = f19208a.get(i);
        if (enumC12590d != null) {
            return enumC12590d;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}

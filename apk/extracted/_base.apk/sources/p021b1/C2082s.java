package p021b1;

import java.util.HashMap;
import java.util.Map;

/* renamed from: b1.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2082s {

    /* renamed from: a */
    Boolean f5826a;

    /* renamed from: b */
    Map<String, Map<String, String>> f5827b = new HashMap();

    public C2082s(Boolean bool) {
        this.f5826a = bool;
    }

    /* renamed from: a */
    public void m34343a(String str, String str2, String str3) {
        if (str != null && str2 != null && str3 != null) {
            Map<String, String> map = this.f5827b.get(str);
            if (map == null) {
                map = new HashMap<>();
                this.f5827b.put(str, map);
            }
            map.put(str2, str3);
            return;
        }
        C2055l.m34422j().mo34444b("Cannot add granular option with any null value", new Object[0]);
    }
}

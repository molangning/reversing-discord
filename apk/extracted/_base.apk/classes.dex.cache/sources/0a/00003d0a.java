package p174j8;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p195k8.C9149a;

/* renamed from: j8.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8871g {

    /* renamed from: a */
    private final Map<String, Object> f23251a = new HashMap();

    /* renamed from: b */
    private final List<String> f23252b = new ArrayList();

    /* renamed from: a */
    private C8871g m17140a(String str, Object obj) {
        this.f23251a.put((String) C9149a.m16448e(str), C9149a.m16448e(obj));
        this.f23252b.remove(str);
        return this;
    }

    /* renamed from: g */
    public static C8871g m17134g(C8871g c8871g, long j) {
        return c8871g.m17136e("exo_len", j);
    }

    /* renamed from: h */
    public static C8871g m17133h(C8871g c8871g, Uri uri) {
        if (uri == null) {
            return c8871g.m17137d("exo_redir");
        }
        return c8871g.m17135f("exo_redir", uri.toString());
    }

    /* renamed from: b */
    public Map<String, Object> m17139b() {
        HashMap hashMap = new HashMap(this.f23251a);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: c */
    public List<String> m17138c() {
        return Collections.unmodifiableList(new ArrayList(this.f23252b));
    }

    /* renamed from: d */
    public C8871g m17137d(String str) {
        this.f23252b.add(str);
        this.f23251a.remove(str);
        return this;
    }

    /* renamed from: e */
    public C8871g m17136e(String str, long j) {
        return m17140a(str, Long.valueOf(j));
    }

    /* renamed from: f */
    public C8871g m17135f(String str, String str2) {
        return m17140a(str, str2);
    }
}
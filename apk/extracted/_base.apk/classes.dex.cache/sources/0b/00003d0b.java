package p174j8;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p102fb.C6374d;

/* renamed from: j8.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8872h implements InterfaceC8870f {

    /* renamed from: c */
    public static final C8872h f23253c = new C8872h(Collections.emptyMap());

    /* renamed from: a */
    private int f23254a;

    /* renamed from: b */
    private final Map<String, byte[]> f23255b;

    public C8872h() {
        this(Collections.emptyMap());
    }

    /* renamed from: c */
    private static void m17130c(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), m17126g(entry.getValue()));
        }
    }

    /* renamed from: d */
    private static Map<String, byte[]> m17129d(Map<String, byte[]> map, C8871g c8871g) {
        HashMap hashMap = new HashMap(map);
        m17124i(hashMap, c8871g.m17138c());
        m17130c(hashMap, c8871g.m17139b());
        return hashMap;
    }

    /* renamed from: g */
    private static byte[] m17126g(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(C6374d.f18023c);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    private static boolean m17125h(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    private static void m17124i(HashMap<String, byte[]> hashMap, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            hashMap.remove(list.get(i));
        }
    }

    @Override // p174j8.InterfaceC8870f
    /* renamed from: a */
    public final long mo17132a(String str, long j) {
        byte[] bArr = this.f23255b.get(str);
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return j;
    }

    @Override // p174j8.InterfaceC8870f
    /* renamed from: b */
    public final String mo17131b(String str, String str2) {
        byte[] bArr = this.f23255b.get(str);
        if (bArr != null) {
            return new String(bArr, C6374d.f18023c);
        }
        return str2;
    }

    /* renamed from: e */
    public C8872h m17128e(C8871g c8871g) {
        Map<String, byte[]> m17129d = m17129d(this.f23255b, c8871g);
        if (m17125h(this.f23255b, m17129d)) {
            return this;
        }
        return new C8872h(m17129d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8872h.class == obj.getClass()) {
            return m17125h(this.f23255b, ((C8872h) obj).f23255b);
        }
        return false;
    }

    /* renamed from: f */
    public Set<Map.Entry<String, byte[]>> m17127f() {
        return this.f23255b.entrySet();
    }

    public int hashCode() {
        if (this.f23254a == 0) {
            int i = 0;
            for (Map.Entry<String, byte[]> entry : this.f23255b.entrySet()) {
                i += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f23254a = i;
        }
        return this.f23254a;
    }

    public C8872h(Map<String, byte[]> map) {
        this.f23255b = Collections.unmodifiableMap(map);
    }
}
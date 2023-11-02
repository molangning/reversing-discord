package p292q2;

import com.facebook.cache.common.CacheKey;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import p075e3.C6100c;

/* renamed from: q2.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11690d {
    /* renamed from: a */
    public static String m7174a(CacheKey cacheKey) {
        try {
            if (cacheKey instanceof C11691e) {
                return m7172c(((C11691e) cacheKey).m7171d().get(0));
            }
            return m7172c(cacheKey);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static List<String> m7173b(CacheKey cacheKey) {
        ArrayList arrayList;
        String m7172c;
        try {
            if (cacheKey instanceof C11691e) {
                List<CacheKey> m7171d = ((C11691e) cacheKey).m7171d();
                arrayList = new ArrayList(m7171d.size());
                for (int i = 0; i < m7171d.size(); i++) {
                    arrayList.add(m7172c(m7171d.get(i)));
                }
            } else {
                arrayList = new ArrayList(1);
                if (cacheKey.mo712c()) {
                    m7172c = cacheKey.mo714a();
                } else {
                    m7172c = m7172c(cacheKey);
                }
                arrayList.add(m7172c);
            }
            return arrayList;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static String m7172c(CacheKey cacheKey) {
        return C6100c.m23577a(cacheKey.mo714a().getBytes("UTF-8"));
    }
}

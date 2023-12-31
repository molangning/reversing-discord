package p328rj;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R%\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00070\t8G¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00078G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0015¨\u0006\u0019"}, m14357d2 = {"Lrj/f;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "Ljava/util/Map;", "authParams", "()Ljava/util/Map;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "scheme", "realm", "Ljava/nio/charset/Charset;", "()Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: rj.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C12289f {

    /* renamed from: a */
    private final Map<String, String> f31931a;

    /* renamed from: b */
    private final String f31932b;

    public C12289f(String scheme, Map<String, String> authParams) {
        String str;
        C9612q.m13917h(scheme, "scheme");
        C9612q.m13917h(authParams, "authParams");
        this.f31932b = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                C9612q.m13918g(US, "US");
                str = key.toLowerCase(US);
                C9612q.m13918g(str, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            linkedHashMap.put(str, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C9612q.m13918g(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f31931a = unmodifiableMap;
    }

    /* renamed from: a */
    public final Charset m5577a() {
        String str = this.f31931a.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                C9612q.m13918g(forName, "Charset.forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        C9612q.m13918g(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    /* renamed from: b */
    public final String m5576b() {
        return this.f31931a.get("realm");
    }

    /* renamed from: c */
    public final String m5575c() {
        return this.f31932b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12289f) {
            C12289f c12289f = (C12289f) obj;
            if (C9612q.m13922c(c12289f.f31932b, this.f31932b) && C9612q.m13922c(c12289f.f31931a, this.f31931a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f31932b.hashCode()) * 31) + this.f31931a.hashCode();
    }

    public String toString() {
        return this.f31932b + " authParams=" + this.f31931a;
    }
}

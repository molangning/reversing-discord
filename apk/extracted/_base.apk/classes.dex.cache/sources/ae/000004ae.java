package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.C1138f;
import java.util.List;

/* renamed from: androidx.core.provider.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1083e {

    /* renamed from: a */
    private final String f3420a;

    /* renamed from: b */
    private final String f3421b;

    /* renamed from: c */
    private final String f3422c;

    /* renamed from: d */
    private final List<List<byte[]>> f3423d;

    /* renamed from: e */
    private final int f3424e = 0;

    /* renamed from: f */
    private final String f3425f;

    public C1083e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f3420a = (String) C1138f.m37824f(str);
        this.f3421b = (String) C1138f.m37824f(str2);
        this.f3422c = (String) C1138f.m37824f(str3);
        this.f3423d = (List) C1138f.m37824f(list);
        this.f3425f = m37939a(str, str2, str3);
    }

    /* renamed from: a */
    private String m37939a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> m37938b() {
        return this.f3423d;
    }

    /* renamed from: c */
    public int m37937c() {
        return this.f3424e;
    }

    /* renamed from: d */
    public String m37936d() {
        return this.f3425f;
    }

    /* renamed from: e */
    public String m37935e() {
        return this.f3420a;
    }

    /* renamed from: f */
    public String m37934f() {
        return this.f3421b;
    }

    /* renamed from: g */
    public String m37933g() {
        return this.f3422c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f3420a + ", mProviderPackage: " + this.f3421b + ", mQuery: " + this.f3422c + ", mCertificates:");
        for (int i = 0; i < this.f3423d.size(); i++) {
            sb2.append(" [");
            List<byte[]> list = this.f3423d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i2), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f3424e);
        return sb2.toString();
    }
}
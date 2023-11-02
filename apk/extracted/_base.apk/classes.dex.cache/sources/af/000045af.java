package p259o6;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.InterfaceC4540f;
import gb.AbstractC6701u;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p151i6.C7390b;
import p153i8.C7456m;
import p153i8.C7470v;
import p195k8.C9149a;
import p195k8.C9191p0;
import p259o6.InterfaceC10993c0;

/* renamed from: o6.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11014h0 implements InterfaceC11025j0 {

    /* renamed from: a */
    private final InterfaceC4540f.InterfaceC4543c f28837a;

    /* renamed from: b */
    private final String f28838b;

    /* renamed from: c */
    private final boolean f28839c;

    /* renamed from: d */
    private final Map<String, String> f28840d;

    public C11014h0(String str, InterfaceC4540f.InterfaceC4543c interfaceC4543c) {
        this(str, false, interfaceC4543c);
    }

    /* renamed from: c */
    private static byte[] m9357c(InterfaceC4540f.InterfaceC4543c interfaceC4543c, String str, byte[] bArr, Map<String, String> map) {
        C7470v c7470v = new C7470v(interfaceC4543c.createDataSource());
        C4515a m28765a = new C4515a.C4517b().m28756j(str).m28761e(map).m28762d(2).m28763c(bArr).m28764b(1).m28765a();
        int i = 0;
        C4515a c4515a = m28765a;
        while (true) {
            try {
                C7456m c7456m = new C7456m(c7470v, c4515a);
                try {
                    byte[] m16276S0 = C9191p0.m16276S0(c7456m);
                    C9191p0.m16233o(c7456m);
                    return m16276S0;
                } catch (InterfaceC4540f.C4546f e) {
                    String m9356d = m9356d(e, i);
                    if (m9356d != null) {
                        i++;
                        c4515a = c4515a.m28771a().m28756j(m9356d).m28765a();
                        C9191p0.m16233o(c7456m);
                    } else {
                        throw e;
                    }
                }
            } catch (Exception e2) {
                throw new C11027k0(m28765a, (Uri) C9149a.m16448e(c7470v.m20613p()), c7470v.mo6321d(), c7470v.m20614o(), e2);
            }
        }
    }

    /* renamed from: d */
    private static String m9356d(InterfaceC4540f.C4546f c4546f, int i) {
        boolean z;
        Map<String, List<String>> map;
        List<String> list;
        int i2 = c4546f.f12375l;
        if ((i2 == 307 || i2 == 308) && i < 5) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (map = c4546f.f12377n) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // p259o6.InterfaceC11025j0
    /* renamed from: a */
    public byte[] mo9324a(UUID uuid, InterfaceC10993c0.C10998e c10998e) {
        return m9357c(this.f28837a, c10998e.m9399b() + "&signedRequest=" + C9191p0.m16305E(c10998e.m9400a()), null, Collections.emptyMap());
    }

    @Override // p259o6.InterfaceC11025j0
    /* renamed from: b */
    public byte[] mo9323b(UUID uuid, InterfaceC10993c0.C10995b c10995b) {
        String str;
        String m9401b = c10995b.m9401b();
        if (this.f28839c || TextUtils.isEmpty(m9401b)) {
            m9401b = this.f28838b;
        }
        if (!TextUtils.isEmpty(m9401b)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = C7390b.f19882e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (C7390b.f19880c.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f28840d) {
                hashMap.putAll(this.f28840d);
            }
            return m9357c(this.f28837a, m9401b, c10995b.m9402a(), hashMap);
        }
        throw new C11027k0(new C4515a.C4517b().m28757i(Uri.EMPTY).m28765a(), Uri.EMPTY, AbstractC6701u.m22104k(), 0L, new IllegalStateException("No license URL"));
    }

    /* renamed from: e */
    public void m9355e(String str, String str2) {
        C9149a.m16448e(str);
        C9149a.m16448e(str2);
        synchronized (this.f28840d) {
            this.f28840d.put(str, str2);
        }
    }

    public C11014h0(String str, boolean z, InterfaceC4540f.InterfaceC4543c interfaceC4543c) {
        C9149a.m16452a((z && TextUtils.isEmpty(str)) ? false : true);
        this.f28837a = interfaceC4543c;
        this.f28838b = str;
        this.f28839c = z;
        this.f28840d = new HashMap();
    }
}
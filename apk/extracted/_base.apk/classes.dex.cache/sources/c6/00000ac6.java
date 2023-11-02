package cd;

import java.util.Map;
import lc.C10120b;
import lc.C10123e;
import nc.C10568a;
import nc.C10570c;
import nc.C10571d;
import p136hc.C7058d;
import p136hc.C7060f;
import p136hc.EnumC7059e;

/* renamed from: cd.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2502e {

    /* renamed from: a */
    private final C10570c f6862a = new C10570c(C10568a.f27575l);

    /* renamed from: a */
    private void m33122a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f6862a.m11203a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C10571d unused) {
            throw C7058d.m21472a();
        }
    }

    /* renamed from: b */
    private C10123e m33121b(C2489a c2489a, Map<EnumC7059e, ?> map) {
        C2507j m33138e = c2489a.m33138e();
        EnumC2503f m33115d = c2489a.m33139d().m33115d();
        C2490b[] m33134b = C2490b.m33134b(c2489a.m33140c(), m33138e, m33115d);
        int i = 0;
        for (C2490b c2490b : m33134b) {
            i += c2490b.m33133c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C2490b c2490b2 : m33134b) {
            byte[] m33135a = c2490b2.m33135a();
            int m33133c = c2490b2.m33133c();
            m33122a(m33135a, m33133c);
            int i3 = 0;
            while (i3 < m33133c) {
                bArr[i2] = m33135a[i3];
                i3++;
                i2++;
            }
        }
        return C2500d.m33130a(bArr, m33138e, m33115d, map);
    }

    /* renamed from: c */
    public C10123e m33120c(C10120b c10120b, Map<EnumC7059e, ?> map) {
        C7058d e;
        C2489a c2489a = new C2489a(c10120b);
        C7060f c7060f = null;
        try {
            return m33121b(c2489a, map);
        } catch (C7058d e2) {
            e = e2;
            try {
                c2489a.m33137f();
                c2489a.m33136g(true);
                c2489a.m33138e();
                c2489a.m33139d();
                c2489a.m33141b();
                C10123e m33121b = m33121b(c2489a, map);
                m33121b.m12223m(new C2506i(true));
                return m33121b;
            } catch (C7058d | C7060f unused) {
                if (c7060f != null) {
                    throw c7060f;
                }
                throw e;
            }
        } catch (C7060f e3) {
            e = null;
            c7060f = e3;
            c2489a.m33137f();
            c2489a.m33136g(true);
            c2489a.m33138e();
            c2489a.m33139d();
            c2489a.m33141b();
            C10123e m33121b2 = m33121b(c2489a, map);
            m33121b2.m12223m(new C2506i(true));
            return m33121b2;
        }
    }
}
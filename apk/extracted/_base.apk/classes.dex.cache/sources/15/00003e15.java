package p194k7;

import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import p060d7.AbstractC5780f;
import p060d7.C5778d;
import p195k8.C9183l0;
import p195k8.C9207x;
import p195k8.C9208y;

/* renamed from: k7.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9137c extends AbstractC5780f {

    /* renamed from: a */
    private final C9208y f24066a = new C9208y();

    /* renamed from: b */
    private final C9207x f24067b = new C9207x();

    /* renamed from: c */
    private C9183l0 f24068c;

    @Override // p060d7.AbstractC5780f
    /* renamed from: b */
    protected Metadata mo16477b(C5778d c5778d, ByteBuffer byteBuffer) {
        Metadata.InterfaceC4429b c9141e;
        C9183l0 c9183l0 = this.f24068c;
        if (c9183l0 == null || c5778d.f16600r != c9183l0.m16342e()) {
            C9183l0 c9183l02 = new C9183l0(c5778d.f26745n);
            this.f24068c = c9183l02;
            c9183l02.m16346a(c5778d.f26745n - c5778d.f16600r);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f24066a.m16101N(array, limit);
        this.f24067b.m16119o(array, limit);
        this.f24067b.m16116r(39);
        long m16126h = (this.f24067b.m16126h(1) << 32) | this.f24067b.m16126h(32);
        this.f24067b.m16116r(20);
        int m16126h2 = this.f24067b.m16126h(12);
        int m16126h3 = this.f24067b.m16126h(8);
        this.f24066a.m16098Q(14);
        if (m16126h3 != 0) {
            if (m16126h3 != 255) {
                if (m16126h3 != 4) {
                    if (m16126h3 != 5) {
                        if (m16126h3 != 6) {
                            c9141e = null;
                        } else {
                            c9141e = C9147g.m16456a(this.f24066a, m16126h, this.f24068c);
                        }
                    } else {
                        c9141e = C9138d.m16476a(this.f24066a, m16126h, this.f24068c);
                    }
                } else {
                    c9141e = C9143f.m16469a(this.f24066a);
                }
            } else {
                c9141e = C9134a.m16480a(this.f24066a, m16126h2, m16126h);
            }
        } else {
            c9141e = new C9141e();
        }
        if (c9141e == null) {
            return new Metadata(new Metadata.InterfaceC4429b[0]);
        }
        return new Metadata(c9141e);
    }
}
package p348t6;

import com.google.android.exoplayer2.Format;
import java.util.Collections;
import p193k6.C9062a;
import p195k8.C9208y;
import p296q6.InterfaceC11732b0;
import p348t6.AbstractC12599e;

/* renamed from: t6.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12595a extends AbstractC12599e {

    /* renamed from: e */
    private static final int[] f32665e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f32666b;

    /* renamed from: c */
    private boolean f32667c;

    /* renamed from: d */
    private int f32668d;

    public C12595a(InterfaceC11732b0 interfaceC11732b0) {
        super(interfaceC11732b0);
    }

    @Override // p348t6.AbstractC12599e
    /* renamed from: b */
    protected boolean mo4727b(C9208y c9208y) {
        String str;
        if (!this.f32666b) {
            int m16111D = c9208y.m16111D();
            int i = (m16111D >> 4) & 15;
            this.f32668d = i;
            if (i == 2) {
                this.f32689a.mo6168c(new Format.C4362b().m29883e0("audio/mpeg").m29911H(1).m29881f0(f32665e[(m16111D >> 2) & 3]).m29914E());
                this.f32667c = true;
            } else if (i != 7 && i != 8) {
                if (i != 10) {
                    throw new AbstractC12599e.C12600a("Audio format not supported: " + this.f32668d);
                }
            } else {
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                this.f32689a.mo6168c(new Format.C4362b().m29883e0(str).m29911H(1).m29881f0(8000).m29914E());
                this.f32667c = true;
            }
            this.f32666b = true;
        } else {
            c9208y.m16098Q(1);
        }
        return true;
    }

    @Override // p348t6.AbstractC12599e
    /* renamed from: c */
    protected boolean mo4726c(C9208y c9208y, long j) {
        if (this.f32668d == 2) {
            int m16097a = c9208y.m16097a();
            this.f32689a.mo6170a(c9208y, m16097a);
            this.f32689a.mo6162f(j, 1, m16097a, 0, null);
            return true;
        }
        int m16111D = c9208y.m16111D();
        if (m16111D == 0 && !this.f32667c) {
            int m16097a2 = c9208y.m16097a();
            byte[] bArr = new byte[m16097a2];
            c9208y.m16088j(bArr, 0, m16097a2);
            C9062a.C9064b m16782g = C9062a.m16782g(bArr);
            this.f32689a.mo6168c(new Format.C4362b().m29883e0("audio/mp4a-latm").m29910I(m16782g.f23780c).m29911H(m16782g.f23779b).m29881f0(m16782g.f23778a).m29899T(Collections.singletonList(bArr)).m29914E());
            this.f32667c = true;
            return false;
        } else if (this.f32668d == 10 && m16111D != 1) {
            return false;
        } else {
            int m16097a3 = c9208y.m16097a();
            this.f32689a.mo6170a(c9208y, m16097a3);
            this.f32689a.mo6162f(j, 1, m16097a3, 0, null);
            return true;
        }
    }
}
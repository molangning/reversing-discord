package p027b7;

import android.util.Pair;
import p151i6.C7402m;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9208y;
import p296q6.InterfaceC11747j;

/* renamed from: b7.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C2139d {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b7.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2140a {

        /* renamed from: a */
        public final int f6033a;

        /* renamed from: b */
        public final long f6034b;

        private C2140a(int i, long j) {
            this.f6033a = i;
            this.f6034b = j;
        }

        /* renamed from: a */
        public static C2140a m34130a(InterfaceC11747j interfaceC11747j, C9208y c9208y) {
            interfaceC11747j.mo6963n(c9208y.m16094d(), 0, 8);
            c9208y.m16099P(0);
            return new C2140a(c9208y.m16084n(), c9208y.m16078t());
        }
    }

    /* renamed from: a */
    public static C2138c m34132a(InterfaceC11747j interfaceC11747j) {
        boolean z;
        byte[] bArr;
        C9149a.m16448e(interfaceC11747j);
        C9208y c9208y = new C9208y(16);
        if (C2140a.m34130a(interfaceC11747j, c9208y).f6033a != 1380533830) {
            return null;
        }
        interfaceC11747j.mo6963n(c9208y.m16094d(), 0, 4);
        c9208y.m16099P(0);
        int m16084n = c9208y.m16084n();
        if (m16084n != 1463899717) {
            C9197r.m16183c("WavHeaderReader", "Unsupported RIFF format: " + m16084n);
            return null;
        }
        C2140a m34130a = C2140a.m34130a(interfaceC11747j, c9208y);
        while (m34130a.f6033a != 1718449184) {
            interfaceC11747j.mo6967i((int) m34130a.f6034b);
            m34130a = C2140a.m34130a(interfaceC11747j, c9208y);
        }
        if (m34130a.f6034b >= 16) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        interfaceC11747j.mo6963n(c9208y.m16094d(), 0, 16);
        c9208y.m16099P(0);
        int m16076v = c9208y.m16076v();
        int m16076v2 = c9208y.m16076v();
        int m16077u = c9208y.m16077u();
        int m16077u2 = c9208y.m16077u();
        int m16076v3 = c9208y.m16076v();
        int m16076v4 = c9208y.m16076v();
        int i = ((int) m34130a.f6034b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            interfaceC11747j.mo6963n(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = C9191p0.f24176f;
        }
        return new C2138c(m16076v, m16076v2, m16077u, m16077u2, m16076v3, m16076v4, bArr);
    }

    /* renamed from: b */
    public static Pair<Long, Long> m34131b(InterfaceC11747j interfaceC11747j) {
        C9149a.m16448e(interfaceC11747j);
        interfaceC11747j.mo6969e();
        C9208y c9208y = new C9208y(8);
        C2140a m34130a = C2140a.m34130a(interfaceC11747j, c9208y);
        while (true) {
            int i = m34130a.f6033a;
            if (i != 1684108385) {
                if (i != 1380533830 && i != 1718449184) {
                    C9197r.m16178h("WavHeaderReader", "Ignoring unknown WAV chunk: " + m34130a.f6033a);
                }
                long j = m34130a.f6034b + 8;
                if (m34130a.f6033a == 1380533830) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    interfaceC11747j.mo6965k((int) j);
                    m34130a = C2140a.m34130a(interfaceC11747j, c9208y);
                } else {
                    throw new C7402m("Chunk is too large (~2GB+) to skip; id: " + m34130a.f6033a);
                }
            } else {
                interfaceC11747j.mo6965k(8);
                long position = interfaceC11747j.getPosition();
                long j2 = m34130a.f6034b + position;
                long length = interfaceC11747j.getLength();
                if (length != -1 && j2 > length) {
                    C9197r.m16178h("WavHeaderReader", "Data exceeds input length: " + j2 + ", " + length);
                    j2 = length;
                }
                return Pair.create(Long.valueOf(position), Long.valueOf(j2));
            }
        }
    }
}
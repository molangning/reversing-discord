package p382v6;

import p195k8.C9208y;
import p296q6.InterfaceC11747j;

/* renamed from: v6.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13124f {

    /* renamed from: a */
    private final C9208y f34088a = new C9208y(8);

    /* renamed from: b */
    private int f34089b;

    /* renamed from: a */
    private long m3166a(InterfaceC11747j interfaceC11747j) {
        int i = 0;
        interfaceC11747j.mo6963n(this.f34088a.m16094d(), 0, 1);
        int i2 = this.f34088a.m16094d()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        interfaceC11747j.mo6963n(this.f34088a.m16094d(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f34088a.m16094d()[i] & 255) + (i5 << 8);
        }
        this.f34089b += i4 + 1;
        return i5;
    }

    /* renamed from: b */
    public boolean m3165b(InterfaceC11747j interfaceC11747j) {
        long m3166a;
        int i;
        long length = interfaceC11747j.getLength();
        int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j = 1024;
        if (i2 != 0 && length <= 1024) {
            j = length;
        }
        int i3 = (int) j;
        interfaceC11747j.mo6963n(this.f34088a.m16094d(), 0, 4);
        long m16109F = this.f34088a.m16109F();
        this.f34089b = 4;
        while (m16109F != 440786851) {
            int i4 = this.f34089b + 1;
            this.f34089b = i4;
            if (i4 == i3) {
                return false;
            }
            interfaceC11747j.mo6963n(this.f34088a.m16094d(), 0, 1);
            m16109F = ((m16109F << 8) & (-256)) | (this.f34088a.m16094d()[0] & 255);
        }
        long m3166a2 = m3166a(interfaceC11747j);
        long j2 = this.f34089b;
        if (m3166a2 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j2 + m3166a2 >= length) {
            return false;
        }
        while (true) {
            int i5 = this.f34089b;
            long j3 = j2 + m3166a2;
            if (i5 < j3) {
                if (m3166a(interfaceC11747j) != Long.MIN_VALUE && (m3166a(interfaceC11747j)) >= 0 && m3166a <= 2147483647L) {
                    if (i != 0) {
                        int i6 = (int) m3166a;
                        interfaceC11747j.mo6967i(i6);
                        this.f34089b += i6;
                    }
                }
            } else if (i5 != j3) {
                return false;
            } else {
                return true;
            }
        }
    }
}
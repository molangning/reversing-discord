package p439y6;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p193k6.C9106l0;
import p195k8.C9149a;
import p195k8.C9208y;
import p439y6.AbstractC13921i;

/* renamed from: y6.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13920h extends AbstractC13921i {

    /* renamed from: o */
    private static final byte[] f35829o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    private boolean f35830n;

    /* renamed from: n */
    private long m1186n(byte[] bArr) {
        int i;
        int i2;
        int i3 = bArr[0] & 255;
        int i4 = i3 & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = bArr[1] & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i6 & 1);
        } else if (i6 == 3) {
            i2 = 60000;
        } else {
            i2 = 10000 << i6;
        }
        return i * i2;
    }

    /* renamed from: o */
    public static boolean m1185o(C9208y c9208y) {
        int m16097a = c9208y.m16097a();
        byte[] bArr = f35829o;
        if (m16097a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        c9208y.m16088j(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p439y6.AbstractC13921i
    /* renamed from: f */
    protected long mo1171f(C9208y c9208y) {
        return m1182c(m1186n(c9208y.m16094d()));
    }

    @Override // p439y6.AbstractC13921i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: h */
    protected boolean mo1170h(C9208y c9208y, long j, AbstractC13921i.C13923b c13923b) {
        boolean z = true;
        if (!this.f35830n) {
            byte[] copyOf = Arrays.copyOf(c9208y.m16094d(), c9208y.m16092f());
            c13923b.f35844a = new Format.C4362b().m29883e0("audio/opus").m29911H(C9106l0.m16643c(copyOf)).m29881f0(48000).m29899T(C9106l0.m16645a(copyOf)).m29914E();
            this.f35830n = true;
            return true;
        }
        C9149a.m16448e(c13923b.f35844a);
        if (c9208y.m16084n() != 1332770163) {
            z = false;
        }
        c9208y.m16099P(0);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y6.AbstractC13921i
    /* renamed from: l */
    public void mo1169l(boolean z) {
        super.mo1169l(z);
        if (z) {
            this.f35830n = false;
        }
    }
}

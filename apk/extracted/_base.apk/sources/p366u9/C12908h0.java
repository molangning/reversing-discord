package p366u9;

import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: u9.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C12908h0 extends AbstractC12900d0 {

    /* renamed from: f */
    final C12906g0 f33600f;

    /* renamed from: g */
    private final Character f33601g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12908h0(String str, String str2, Character ch2) {
        this(new C12906g0(str, str2.toCharArray()), ch2);
    }

    @Override // p366u9.AbstractC12900d0
    /* renamed from: a */
    final int mo3687a(int i) {
        C12906g0 c12906g0 = this.f33600f;
        return c12906g0.f33596e * C12914k0.m3680a(i, c12906g0.f33597f, RoundingMode.CEILING);
    }

    @Override // p366u9.AbstractC12900d0
    /* renamed from: e */
    void mo3682e(Appendable appendable, byte[] bArr, int i, int i2) {
        C12919n.m3674b(appendable);
        int i3 = 0;
        C12919n.m3672d(0, i2 + 0, bArr.length);
        while (i3 < i2) {
            m3686f(appendable, bArr, i3 + 0, Math.min(this.f33600f.f33597f, i2 - i3));
            i3 += this.f33600f.f33597f;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12908h0) {
            C12908h0 c12908h0 = (C12908h0) obj;
            if (this.f33600f.equals(c12908h0.f33600f) && C12913k.m3681a(this.f33601g, c12908h0.f33601g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m3686f(Appendable appendable, byte[] bArr, int i, int i2) {
        boolean z;
        C12919n.m3674b(appendable);
        C12919n.m3672d(i, i + i2, bArr.length);
        int i3 = 0;
        if (i2 <= this.f33600f.f33597f) {
            z = true;
        } else {
            z = false;
        }
        C12919n.m3671e(z);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & 255)) << 8;
        }
        int i5 = ((i2 + 1) << 3) - this.f33600f.f33595d;
        while (i3 < (i2 << 3)) {
            C12906g0 c12906g0 = this.f33600f;
            appendable.append(c12906g0.m3690a(((int) (j >>> (i5 - i3))) & c12906g0.f33594c));
            i3 += this.f33600f.f33595d;
        }
        if (this.f33601g != null) {
            while (i3 < (this.f33600f.f33597f << 3)) {
                appendable.append(this.f33601g.charValue());
                i3 += this.f33600f.f33595d;
            }
        }
    }

    public int hashCode() {
        return this.f33600f.hashCode() ^ Arrays.hashCode(new Object[]{this.f33601g});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.f33600f.toString());
        if (8 % this.f33600f.f33595d != 0) {
            if (this.f33601g == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.f33601g);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12908h0(C12906g0 c12906g0, Character ch2) {
        this.f33600f = (C12906g0) C12919n.m3674b(c12906g0);
        if (ch2 == null || !c12906g0.m3689b(ch2.charValue())) {
            this.f33601g = ch2;
            return;
        }
        throw new IllegalArgumentException(C12917m.m3677b("Padding character %s was already in alphabet", ch2));
    }
}

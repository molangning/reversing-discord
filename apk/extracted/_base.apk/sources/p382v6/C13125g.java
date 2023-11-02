package p382v6;

import p296q6.InterfaceC11747j;

/* renamed from: v6.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13125g {

    /* renamed from: d */
    private static final long[] f34090d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f34091a = new byte[8];

    /* renamed from: b */
    private int f34092b;

    /* renamed from: c */
    private int f34093c;

    /* renamed from: a */
    public static long m3164a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f34090d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    /* renamed from: c */
    public static int m3162c(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f34090d;
            if (i2 < jArr.length) {
                if ((jArr[i2] & i) != 0) {
                    return i2 + 1;
                }
                i2++;
            } else {
                return -1;
            }
        }
    }

    /* renamed from: b */
    public int m3163b() {
        return this.f34093c;
    }

    /* renamed from: d */
    public long m3161d(InterfaceC11747j interfaceC11747j, boolean z, boolean z2, int i) {
        if (this.f34092b == 0) {
            if (!interfaceC11747j.mo6968g(this.f34091a, 0, 1, z)) {
                return -1L;
            }
            int m3162c = m3162c(this.f34091a[0] & 255);
            this.f34093c = m3162c;
            if (m3162c != -1) {
                this.f34092b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f34093c;
        if (i2 > i) {
            this.f34092b = 0;
            return -2L;
        }
        if (i2 != 1) {
            interfaceC11747j.readFully(this.f34091a, 1, i2 - 1);
        }
        this.f34092b = 0;
        return m3164a(this.f34091a, this.f34093c, z2);
    }

    /* renamed from: e */
    public void m3160e() {
        this.f34092b = 0;
        this.f34093c = 0;
    }
}

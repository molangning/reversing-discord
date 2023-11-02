package p289q;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: q.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C11665h {

    /* renamed from: o */
    private static int f30393o = 1;

    /* renamed from: a */
    public boolean f30394a;

    /* renamed from: b */
    private String f30395b;

    /* renamed from: f */
    public float f30399f;

    /* renamed from: j */
    EnumC11666a f30403j;

    /* renamed from: c */
    public int f30396c = -1;

    /* renamed from: d */
    int f30397d = -1;

    /* renamed from: e */
    public int f30398e = 0;

    /* renamed from: g */
    public boolean f30400g = false;

    /* renamed from: h */
    float[] f30401h = new float[9];

    /* renamed from: i */
    float[] f30402i = new float[9];

    /* renamed from: k */
    C11654b[] f30404k = new C11654b[16];

    /* renamed from: l */
    int f30405l = 0;

    /* renamed from: m */
    public int f30406m = 0;

    /* renamed from: n */
    HashSet<C11654b> f30407n = null;

    /* renamed from: q.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC11666a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C11665h(EnumC11666a enumC11666a, String str) {
        this.f30403j = enumC11666a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m7275b() {
        f30393o++;
    }

    /* renamed from: a */
    public final void m7276a(C11654b c11654b) {
        int i = 0;
        while (true) {
            int i2 = this.f30405l;
            if (i < i2) {
                if (this.f30404k[i] == c11654b) {
                    return;
                }
                i++;
            } else {
                C11654b[] c11654bArr = this.f30404k;
                if (i2 >= c11654bArr.length) {
                    this.f30404k = (C11654b[]) Arrays.copyOf(c11654bArr, c11654bArr.length * 2);
                }
                C11654b[] c11654bArr2 = this.f30404k;
                int i3 = this.f30405l;
                c11654bArr2[i3] = c11654b;
                this.f30405l = i3 + 1;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m7274c(C11654b c11654b) {
        int i = this.f30405l;
        int i2 = 0;
        while (i2 < i) {
            if (this.f30404k[i2] == c11654b) {
                while (i2 < i - 1) {
                    C11654b[] c11654bArr = this.f30404k;
                    int i3 = i2 + 1;
                    c11654bArr[i2] = c11654bArr[i3];
                    i2 = i3;
                }
                this.f30405l--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: d */
    public void m7273d() {
        this.f30395b = null;
        this.f30403j = EnumC11666a.UNKNOWN;
        this.f30398e = 0;
        this.f30396c = -1;
        this.f30397d = -1;
        this.f30399f = 0.0f;
        this.f30400g = false;
        int i = this.f30405l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f30404k[i2] = null;
        }
        this.f30405l = 0;
        this.f30406m = 0;
        this.f30394a = false;
        Arrays.fill(this.f30402i, 0.0f);
    }

    /* renamed from: e */
    public void m7272e(C11657d c11657d, float f) {
        this.f30399f = f;
        this.f30400g = true;
        int i = this.f30405l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f30404k[i2].m7346B(c11657d, this, false);
        }
        this.f30405l = 0;
    }

    /* renamed from: f */
    public void m7271f(EnumC11666a enumC11666a, String str) {
        this.f30403j = enumC11666a;
    }

    /* renamed from: g */
    public final void m7270g(C11654b c11654b) {
        int i = this.f30405l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f30404k[i2].mo7288C(c11654b, false);
        }
        this.f30405l = 0;
    }

    public String toString() {
        if (this.f30395b != null) {
            return "" + this.f30395b;
        }
        return "" + this.f30396c;
    }
}

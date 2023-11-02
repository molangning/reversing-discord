package p164j$.time.format;

import p164j$.time.C8295d;
import p164j$.time.temporal.InterfaceC8344l;

/* renamed from: j$.time.format.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8307j implements InterfaceC8304g {

    /* renamed from: f */
    static final long[] f22315f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a */
    final InterfaceC8344l f22316a;

    /* renamed from: b */
    final int f22317b;

    /* renamed from: c */
    final int f22318c;

    /* renamed from: d */
    private final EnumC8319v f22319d;

    /* renamed from: e */
    final int f22320e;

    public C8307j(InterfaceC8344l interfaceC8344l, int i, int i2, EnumC8319v enumC8319v) {
        this.f22316a = interfaceC8344l;
        this.f22317b = i;
        this.f22318c = i2;
        this.f22319d = enumC8319v;
        this.f22320e = 0;
    }

    protected C8307j(InterfaceC8344l interfaceC8344l, int i, int i2, EnumC8319v enumC8319v, int i3) {
        this.f22316a = interfaceC8344l;
        this.f22317b = i;
        this.f22318c = i2;
        this.f22319d = enumC8319v;
        this.f22320e = i3;
    }

    @Override // p164j$.time.format.InterfaceC8304g
    /* renamed from: a */
    public final boolean mo17882a(C8315r c8315r, StringBuilder sb2) {
        InterfaceC8344l interfaceC8344l = this.f22316a;
        Long m17858e = c8315r.m17858e(interfaceC8344l);
        if (m17858e == null) {
            return false;
        }
        long longValue = m17858e.longValue();
        C8317t m17861b = c8315r.m17861b();
        String l = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        int length = l.length();
        int i = this.f22318c;
        if (length > i) {
            throw new C8295d("Field " + interfaceC8344l + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + i);
        }
        m17861b.getClass();
        int i2 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
        int i3 = this.f22317b;
        EnumC8319v enumC8319v = this.f22319d;
        if (i2 >= 0) {
            int i4 = AbstractC8301d.f22307a[enumC8319v.ordinal()];
            if (i4 == 1 ? !(i3 >= 19 || longValue < f22315f[i3]) : i4 == 2) {
                sb2.append('+');
            }
        } else {
            int i5 = AbstractC8301d.f22307a[enumC8319v.ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                sb2.append('-');
            } else if (i5 == 4) {
                throw new C8295d("Field " + interfaceC8344l + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i6 = 0; i6 < i3 - l.length(); i6++) {
            sb2.append('0');
        }
        sb2.append(l);
        return true;
    }

    /* renamed from: c */
    public final C8307j m17884c() {
        return this.f22320e == -1 ? this : new C8307j(this.f22316a, this.f22317b, this.f22318c, this.f22319d, -1);
    }

    /* renamed from: d */
    public final C8307j m17883d(int i) {
        return new C8307j(this.f22316a, this.f22317b, this.f22318c, this.f22319d, this.f22320e + i);
    }

    public final String toString() {
        EnumC8319v enumC8319v = this.f22319d;
        InterfaceC8344l interfaceC8344l = this.f22316a;
        int i = this.f22318c;
        int i2 = this.f22317b;
        if (i2 == 1 && i == 19 && enumC8319v == EnumC8319v.NORMAL) {
            return "Value(" + interfaceC8344l + ")";
        } else if (i2 == i && enumC8319v == EnumC8319v.NOT_NEGATIVE) {
            return "Value(" + interfaceC8344l + "," + i2 + ")";
        } else {
            return "Value(" + interfaceC8344l + "," + i2 + "," + i + "," + enumC8319v + ")";
        }
    }
}
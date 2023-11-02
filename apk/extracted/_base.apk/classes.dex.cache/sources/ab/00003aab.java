package p164j$.time.format;

import p164j$.time.temporal.EnumC8333a;

/* renamed from: j$.time.format.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8308k implements InterfaceC8304g {

    /* renamed from: c */
    static final String[] f22321c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

    /* renamed from: d */
    static final C8308k f22322d = new C8308k("+HH:MM:ss", "Z");

    /* renamed from: a */
    private final String f22323a;

    /* renamed from: b */
    private final int f22324b;

    static {
        new C8308k("+HH:MM:ss", "0");
    }

    public C8308k(String str, String str2) {
        int i = 0;
        while (true) {
            String[] strArr = f22321c;
            if (i >= 9) {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
            if (strArr[i].equals(str)) {
                this.f22324b = i;
                this.f22323a = str2;
                return;
            }
            i++;
        }
    }

    @Override // p164j$.time.format.InterfaceC8304g
    /* renamed from: a */
    public final boolean mo17882a(C8315r c8315r, StringBuilder sb2) {
        Long m17858e = c8315r.m17858e(EnumC8333a.OFFSET_SECONDS);
        if (m17858e == null) {
            return false;
        }
        long longValue = m17858e.longValue();
        int i = (int) longValue;
        if (longValue == i) {
            if (i != 0) {
                int abs = Math.abs((i / 3600) % 100);
                int abs2 = Math.abs((i / 60) % 60);
                int abs3 = Math.abs(i % 60);
                int length = sb2.length();
                sb2.append(i < 0 ? "-" : "+");
                sb2.append((char) ((abs / 10) + 48));
                sb2.append((char) ((abs % 10) + 48));
                int i2 = this.f22324b;
                if (i2 >= 3 || (i2 >= 1 && abs2 > 0)) {
                    int i3 = i2 % 2;
                    sb2.append(i3 == 0 ? ":" : "");
                    sb2.append((char) ((abs2 / 10) + 48));
                    sb2.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    if (i2 >= 7 || (i2 >= 5 && abs3 > 0)) {
                        sb2.append(i3 != 0 ? "" : ":");
                        sb2.append((char) ((abs3 / 10) + 48));
                        sb2.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb2.setLength(length);
                }
                return true;
            }
            sb2.append(this.f22323a);
            return true;
        }
        throw new ArithmeticException();
    }

    public final String toString() {
        String replace = this.f22323a.replace("'", "''");
        return "Offset(" + f22321c[this.f22324b] + ",'" + replace + "')";
    }
}
package p279p5;

import java.io.UnsupportedEncodingException;

/* renamed from: p5.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11442r {

    /* renamed from: a */
    protected byte[] f29749a = new byte[0];

    /* renamed from: a */
    public String m8059a(int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte[] bArr = this.f29749a;
            if (i3 >= bArr.length) {
                break;
            }
            i3 += bArr[i3] + 1;
        }
        byte[] bArr2 = this.f29749a;
        if (i3 < bArr2.length) {
            byte b = bArr2[i3];
            while (i2 < b && this.f29749a[i3 + i2 + 1] != 61) {
                i2++;
            }
            return new String(this.f29749a, i3 + 1, i2);
        }
        return null;
    }

    /* renamed from: b */
    public byte[] m8058b(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr = this.f29749a;
            if (i2 >= bArr.length) {
                break;
            }
            i2 += bArr[i2] + 1;
        }
        byte[] bArr2 = this.f29749a;
        if (i2 < bArr2.length) {
            int i4 = bArr2[i2];
            for (int i5 = 0; i5 < i4; i5++) {
                byte[] bArr3 = this.f29749a;
                int i6 = i2 + i5;
                if (bArr3[i6 + 1] == 61) {
                    int i7 = (i4 - i5) - 1;
                    byte[] bArr4 = new byte[i7];
                    System.arraycopy(bArr3, i6 + 2, bArr4, 0, i7);
                    return bArr4;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public String m8057c(int i) {
        byte[] m8058b = m8058b(i);
        if (m8058b != null) {
            return new String(m8058b);
        }
        return null;
    }

    /* renamed from: d */
    protected void m8056d(byte[] bArr, byte[] bArr2, int i) {
        int i2;
        int i3;
        byte[] bArr3 = this.f29749a;
        if (bArr2 != null) {
            i2 = bArr2.length;
        } else {
            i2 = 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            byte[] bArr4 = this.f29749a;
            if (i4 >= bArr4.length) {
                break;
            }
            i4 += (bArr4[i4] + 1) & 255;
        }
        int length = bArr.length + i2;
        if (bArr2 != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i6 = length + i3;
        int length2 = bArr3.length + i6 + 1;
        byte[] bArr5 = new byte[length2];
        this.f29749a = bArr5;
        System.arraycopy(bArr3, 0, bArr5, 0, i4);
        int length3 = bArr3.length - i4;
        System.arraycopy(bArr3, i4, this.f29749a, length2 - length3, length3);
        byte[] bArr6 = this.f29749a;
        bArr6[i4] = (byte) i6;
        int i7 = i4 + 1;
        System.arraycopy(bArr, 0, bArr6, i7, bArr.length);
        if (bArr2 != null) {
            byte[] bArr7 = this.f29749a;
            bArr7[i7 + bArr.length] = 61;
            System.arraycopy(bArr2, 0, bArr7, i4 + bArr.length + 2, i2);
        }
    }

    /* renamed from: e */
    public int m8055e(String str) {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f29749a;
            if (i < bArr.length) {
                int i3 = bArr[i];
                if (str.length() <= i3 && ((str.length() == i3 || this.f29749a[str.length() + i + 1] == 61) && str.compareToIgnoreCase(new String(this.f29749a, i + 1, str.length())) == 0)) {
                    byte[] bArr2 = this.f29749a;
                    byte[] bArr3 = new byte[(bArr2.length - i3) - 1];
                    this.f29749a = bArr3;
                    System.arraycopy(bArr2, 0, bArr3, 0, i);
                    System.arraycopy(bArr2, i + i3 + 1, this.f29749a, i, ((bArr2.length - i) - i3) - 1);
                    return i2;
                }
                i += (i3 + 1) & 255;
                i2++;
            } else {
                return -1;
            }
        }
    }

    /* renamed from: f */
    public void m8054f(String str, String str2) {
        byte[] bArr;
        if (str2 != null) {
            bArr = str2.getBytes();
        } else {
            bArr = null;
        }
        m8053g(str, bArr);
    }

    /* renamed from: g */
    public void m8053g(String str, byte[] bArr) {
        int i;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        try {
            byte[] bytes = str.getBytes("US-ASCII");
            for (byte b : bytes) {
                if (b == 61) {
                    throw new IllegalArgumentException();
                }
            }
            if (bytes.length + i < 255) {
                int m8055e = m8055e(str);
                if (m8055e == -1) {
                    m8055e = m8052h();
                }
                m8056d(bytes, bArr, m8055e);
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: h */
    public int m8052h() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f29749a;
            if (i < bArr.length) {
                i += (bArr[i] + 1) & 255;
                i2++;
            } else {
                return i2;
            }
        }
    }

    public String toString() {
        String str;
        String str2 = null;
        int i = 0;
        while (true) {
            String m8059a = m8059a(i);
            if (m8059a == null) {
                break;
            }
            String str3 = String.valueOf(i) + "={" + m8059a;
            String m8057c = m8057c(i);
            if (m8057c != null) {
                str = str3 + "=" + m8057c + "}";
            } else {
                str = str3 + "}";
            }
            if (str2 == null) {
                str2 = str;
            } else {
                str2 = str2 + ", " + str;
            }
            i++;
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
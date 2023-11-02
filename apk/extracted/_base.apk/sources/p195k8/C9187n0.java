package p195k8;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: k8.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9187n0 {
    /* renamed from: a */
    private static int[] m16317a(String str) {
        boolean z;
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    /* renamed from: b */
    private static String m16316b(StringBuilder sb2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (i >= i2) {
            return sb2.toString();
        }
        if (sb2.charAt(i) == '/') {
            i++;
        }
        int i6 = i;
        int i7 = i6;
        while (i6 <= i2) {
            if (i6 == i2) {
                i3 = i6;
            } else if (sb2.charAt(i6) == '/') {
                i3 = i6 + 1;
            } else {
                i6++;
            }
            int i8 = i7 + 1;
            if (i6 == i8 && sb2.charAt(i7) == '.') {
                sb2.delete(i7, i3);
                i2 -= i3 - i7;
            } else {
                if (i6 == i7 + 2 && sb2.charAt(i7) == '.' && sb2.charAt(i8) == '.') {
                    i4 = sb2.lastIndexOf("/", i7 - 2) + 1;
                    if (i4 > i) {
                        i5 = i4;
                    } else {
                        i5 = i;
                    }
                    sb2.delete(i5, i3);
                    i2 -= i3 - i5;
                } else {
                    i4 = i6 + 1;
                }
                i7 = i4;
            }
            i6 = i7;
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public static String m16315c(String str, String str2) {
        int i;
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] m16317a = m16317a(str2);
        if (m16317a[0] != -1) {
            sb2.append(str2);
            m16316b(sb2, m16317a[1], m16317a[2]);
            return sb2.toString();
        }
        int[] m16317a2 = m16317a(str);
        if (m16317a[3] == 0) {
            sb2.append((CharSequence) str, 0, m16317a2[3]);
            sb2.append(str2);
            return sb2.toString();
        } else if (m16317a[2] == 0) {
            sb2.append((CharSequence) str, 0, m16317a2[2]);
            sb2.append(str2);
            return sb2.toString();
        } else {
            int i2 = m16317a[1];
            if (i2 != 0) {
                int i3 = m16317a2[0] + 1;
                sb2.append((CharSequence) str, 0, i3);
                sb2.append(str2);
                return m16316b(sb2, m16317a[1] + i3, i3 + m16317a[2]);
            } else if (str2.charAt(i2) == '/') {
                sb2.append((CharSequence) str, 0, m16317a2[1]);
                sb2.append(str2);
                int i4 = m16317a2[1];
                return m16316b(sb2, i4, m16317a[2] + i4);
            } else {
                int i5 = m16317a2[0] + 2;
                int i6 = m16317a2[1];
                if (i5 < i6 && i6 == m16317a2[2]) {
                    sb2.append((CharSequence) str, 0, i6);
                    sb2.append('/');
                    sb2.append(str2);
                    int i7 = m16317a2[1];
                    return m16316b(sb2, i7, m16317a[2] + i7 + 1);
                }
                int lastIndexOf = str.lastIndexOf(47, m16317a2[2] - 1);
                if (lastIndexOf == -1) {
                    i = m16317a2[1];
                } else {
                    i = lastIndexOf + 1;
                }
                sb2.append((CharSequence) str, 0, i);
                sb2.append(str2);
                return m16316b(sb2, m16317a2[1], i + m16317a[2]);
            }
        }
    }

    /* renamed from: d */
    public static Uri m16314d(String str, String str2) {
        return Uri.parse(m16315c(str, str2));
    }
}

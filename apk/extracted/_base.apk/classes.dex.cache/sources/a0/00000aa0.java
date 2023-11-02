package p042c9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: c9.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2464c {
    /* renamed from: a */
    public static int m33183a(Parcel parcel) {
        return m33163u(parcel, 20293);
    }

    /* renamed from: b */
    public static void m33182b(Parcel parcel, int i) {
        m33162v(parcel, i);
    }

    /* renamed from: c */
    public static void m33181c(Parcel parcel, int i, boolean z) {
        m33161w(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m33180d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool == null) {
            if (z) {
                m33161w(parcel, i, 0);
                return;
            }
            return;
        }
        m33161w(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    /* renamed from: e */
    public static void m33179e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                m33161w(parcel, i, 0);
                return;
            }
            return;
        }
        int m33163u = m33163u(parcel, i);
        parcel.writeBundle(bundle);
        m33162v(parcel, m33163u);
    }

    /* renamed from: f */
    public static void m33178f(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m33161w(parcel, i, 0);
                return;
            }
            return;
        }
        int m33163u = m33163u(parcel, i);
        parcel.writeByteArray(bArr);
        m33162v(parcel, m33163u);
    }

    /* renamed from: g */
    public static void m33177g(Parcel parcel, int i, double d) {
        m33161w(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: h */
    public static void m33176h(Parcel parcel, int i, Double d, boolean z) {
        if (d == null) {
            if (z) {
                m33161w(parcel, i, 0);
                return;
            }
            return;
        }
        m33161w(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    /* renamed from: i */
    public static void m33175i(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                m33161w(parcel, i, 0);
                return;
            }
            return;
        }
        int m33163u = m33163u(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m33162v(parcel, m33163u);
    }

    /* renamed from: j */
    public static void m33174j(Parcel parcel, int i, int i2) {
        m33161w(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: k */
    public static void m33173k(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                m33161w(parcel, i, 0);
                return;
            }
            return;
        }
        int m33163u = m33163u(parcel, i);
        parcel.writeIntArray(iArr);
        m33162v(parcel, m33163u);
    }

    /* renamed from: l */
    public static void m33172l(Parcel parcel, int i, Integer num, boolean z) {
        if (num == null) {
            if (z) {
                m33161w(parcel, i, 0);
                return;
            }
            return;
        }
        m33161w(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    /* renamed from: m */
    public static void m33171m(Parcel parcel, int i, long j) {
        m33161w(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: n */
    public static void m33170n(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m33161w(parcel, i, 0);
                return;
            }
            return;
        }
        int m33163u = m33163u(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m33162v(parcel, m33163u);
    }

    /* renamed from: o */
    public static void m33169o(Parcel parcel, int i, short s) {
        m33161w(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: p */
    public static void m33168p(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m33161w(parcel, i, 0);
                return;
            }
            return;
        }
        int m33163u = m33163u(parcel, i);
        parcel.writeString(str);
        m33162v(parcel, m33163u);
    }

    /* renamed from: q */
    public static void m33167q(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                m33161w(parcel, i, 0);
                return;
            }
            return;
        }
        int m33163u = m33163u(parcel, i);
        parcel.writeStringArray(strArr);
        m33162v(parcel, m33163u);
    }

    /* renamed from: r */
    public static void m33166r(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                m33161w(parcel, i, 0);
                return;
            }
            return;
        }
        int m33163u = m33163u(parcel, i);
        parcel.writeStringList(list);
        m33162v(parcel, m33163u);
    }

    /* renamed from: s */
    public static <T extends Parcelable> void m33165s(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                m33161w(parcel, i, 0);
                return;
            }
            return;
        }
        int m33163u = m33163u(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m33160x(parcel, t, i2);
            }
        }
        m33162v(parcel, m33163u);
    }

    /* renamed from: t */
    public static <T extends Parcelable> void m33164t(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m33161w(parcel, i, 0);
                return;
            }
            return;
        }
        int m33163u = m33163u(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m33160x(parcel, t, 0);
            }
        }
        m33162v(parcel, m33163u);
    }

    /* renamed from: u */
    private static int m33163u(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: v */
    private static void m33162v(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: w */
    private static void m33161w(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: x */
    private static <T extends Parcelable> void m33160x(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
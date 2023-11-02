package p042c9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: c9.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2462b {

    /* renamed from: c9.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C2463a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C2463a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 41
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p042c9.C2462b.C2463a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: a */
    public static Bundle m33209a(Parcel parcel, int i) {
        int m33188v = m33188v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33188v == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m33188v);
        return readBundle;
    }

    /* renamed from: b */
    public static byte[] m33208b(Parcel parcel, int i) {
        int m33188v = m33188v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33188v == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m33188v);
        return createByteArray;
    }

    /* renamed from: c */
    public static int[] m33207c(Parcel parcel, int i) {
        int m33188v = m33188v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33188v == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + m33188v);
        return createIntArray;
    }

    /* renamed from: d */
    public static <T extends Parcelable> T m33206d(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m33188v = m33188v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33188v == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m33188v);
        return createFromParcel;
    }

    /* renamed from: e */
    public static String m33205e(Parcel parcel, int i) {
        int m33188v = m33188v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33188v == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m33188v);
        return readString;
    }

    /* renamed from: f */
    public static String[] m33204f(Parcel parcel, int i) {
        int m33188v = m33188v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33188v == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + m33188v);
        return createStringArray;
    }

    /* renamed from: g */
    public static ArrayList<String> m33203g(Parcel parcel, int i) {
        int m33188v = m33188v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33188v == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m33188v);
        return createStringArrayList;
    }

    /* renamed from: h */
    public static <T> T[] m33202h(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m33188v = m33188v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33188v == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m33188v);
        return tArr;
    }

    /* renamed from: i */
    public static <T> ArrayList<T> m33201i(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m33188v = m33188v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33188v == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m33188v);
        return createTypedArrayList;
    }

    /* renamed from: j */
    public static void m33200j(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Overread allowed size end=");
        sb2.append(i);
        throw new C2463a(sb2.toString(), parcel);
    }

    /* renamed from: k */
    public static int m33199k(int i) {
        return (char) i;
    }

    /* renamed from: l */
    public static boolean m33198l(Parcel parcel, int i) {
        m33184z(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static Boolean m33197m(Parcel parcel, int i) {
        boolean z;
        int m33188v = m33188v(parcel, i);
        if (m33188v == 0) {
            return null;
        }
        m33185y(parcel, i, m33188v, 4);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: n */
    public static double m33196n(Parcel parcel, int i) {
        m33184z(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: o */
    public static Double m33195o(Parcel parcel, int i) {
        int m33188v = m33188v(parcel, i);
        if (m33188v == 0) {
            return null;
        }
        m33185y(parcel, i, m33188v, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: p */
    public static int m33194p(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: q */
    public static IBinder m33193q(Parcel parcel, int i) {
        int m33188v = m33188v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m33188v == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m33188v);
        return readStrongBinder;
    }

    /* renamed from: r */
    public static int m33192r(Parcel parcel, int i) {
        m33184z(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: s */
    public static Integer m33191s(Parcel parcel, int i) {
        int m33188v = m33188v(parcel, i);
        if (m33188v == 0) {
            return null;
        }
        m33185y(parcel, i, m33188v, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: t */
    public static long m33190t(Parcel parcel, int i) {
        m33184z(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: u */
    public static short m33189u(Parcel parcel, int i) {
        m33184z(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: v */
    public static int m33188v(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* renamed from: w */
    public static void m33187w(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m33188v(parcel, i));
    }

    /* renamed from: x */
    public static int m33186x(Parcel parcel) {
        String str;
        int m33194p = m33194p(parcel);
        int m33188v = m33188v(parcel, m33194p);
        int dataPosition = parcel.dataPosition();
        if (m33199k(m33194p) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(m33194p));
            if (valueOf.length() != 0) {
                str = "Expected object header. Got 0x".concat(valueOf);
            } else {
                str = new String("Expected object header. Got 0x");
            }
            throw new C2463a(str, parcel);
        }
        int i = m33188v + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Size read is invalid start=");
        sb2.append(dataPosition);
        sb2.append(" end=");
        sb2.append(i);
        throw new C2463a(sb2.toString(), parcel);
    }

    /* renamed from: y */
    private static void m33185y(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb2.append("Expected size ");
        sb2.append(i3);
        sb2.append(" got ");
        sb2.append(i2);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new C2463a(sb2.toString(), parcel);
    }

    /* renamed from: z */
    private static void m33184z(Parcel parcel, int i, int i2) {
        int m33188v = m33188v(parcel, i);
        if (m33188v == i2) {
            return;
        }
        String hexString = Integer.toHexString(m33188v);
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb2.append("Expected size ");
        sb2.append(i2);
        sb2.append(" got ");
        sb2.append(m33188v);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new C2463a(sb2.toString(), parcel);
    }
}

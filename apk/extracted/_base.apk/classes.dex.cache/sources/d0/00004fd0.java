package p385v9;

import android.os.ParcelUuid;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p119g9.C6584g;

/* renamed from: v9.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13216u0 {

    /* renamed from: h */
    private static final ParcelUuid f34260h = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");

    /* renamed from: a */
    private final int f34261a;

    /* renamed from: b */
    private final List f34262b;

    /* renamed from: c */
    private final SparseArray f34263c;

    /* renamed from: d */
    private final Map f34264d;

    /* renamed from: e */
    private final int f34265e;

    /* renamed from: f */
    private final String f34266f;

    /* renamed from: g */
    private final byte[] f34267g;

    private C13216u0(List list, SparseArray sparseArray, Map map, int i, int i2, String str, byte[] bArr) {
        this.f34262b = list;
        this.f34263c = sparseArray;
        this.f34264d = map;
        this.f34266f = str;
        this.f34261a = i;
        this.f34265e = i2;
        this.f34267g = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p385v9.C13216u0 m3020a(byte[] r13) {
        /*
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r2 = -1
            r3 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r0
            r7 = r6
            r6 = r2
        L1a:
            int r2 = r13.length     // Catch: java.lang.Exception -> L98
            if (r3 >= r2) goto L86
            int r2 = r3 + 1
            r3 = r13[r3]     // Catch: java.lang.Exception -> L98
            r9 = 255(0xff, float:3.57E-43)
            r3 = r3 & r9
            if (r3 != 0) goto L27
            goto L86
        L27:
            int r3 = r3 + (-1)
            int r10 = r2 + 1
            r2 = r13[r2]     // Catch: java.lang.Exception -> L98
            r2 = r2 & r9
            r11 = 22
            r12 = 2
            if (r2 == r11) goto L71
            if (r2 == r9) goto L5a
            switch(r2) {
                case 1: goto L55;
                case 2: goto L51;
                case 3: goto L51;
                case 4: goto L4c;
                case 5: goto L4c;
                case 6: goto L46;
                case 7: goto L46;
                case 8: goto L3c;
                case 9: goto L3c;
                case 10: goto L39;
                default: goto L38;
            }     // Catch: java.lang.Exception -> L98
        L38:
            goto L84
        L39:
            r7 = r13[r10]     // Catch: java.lang.Exception -> L98
            goto L84
        L3c:
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Exception -> L98
            byte[] r2 = m3017d(r13, r10, r3)     // Catch: java.lang.Exception -> L98
            r8.<init>(r2)     // Catch: java.lang.Exception -> L98
            goto L84
        L46:
            r2 = 16
            m3019b(r13, r10, r3, r2, r1)     // Catch: java.lang.Exception -> L98
            goto L84
        L4c:
            r2 = 4
            m3019b(r13, r10, r3, r2, r1)     // Catch: java.lang.Exception -> L98
            goto L84
        L51:
            m3019b(r13, r10, r3, r12, r1)     // Catch: java.lang.Exception -> L98
            goto L84
        L55:
            r2 = r13[r10]     // Catch: java.lang.Exception -> L98
            r6 = r2 & 255(0xff, float:3.57E-43)
            goto L84
        L5a:
            int r2 = r10 + 1
            r2 = r13[r2]     // Catch: java.lang.Exception -> L98
            r2 = r2 & r9
            int r2 = r2 << 8
            r11 = r13[r10]     // Catch: java.lang.Exception -> L98
            r9 = r9 & r11
            int r2 = r2 + r9
            int r9 = r10 + 2
            int r11 = r3 + (-2)
            byte[] r9 = m3017d(r13, r9, r11)     // Catch: java.lang.Exception -> L98
            r4.put(r2, r9)     // Catch: java.lang.Exception -> L98
            goto L84
        L71:
            byte[] r2 = m3017d(r13, r10, r12)     // Catch: java.lang.Exception -> L98
            android.os.ParcelUuid r2 = m3018c(r2)     // Catch: java.lang.Exception -> L98
            int r9 = r10 + 2
            int r11 = r3 + (-2)
            byte[] r9 = m3017d(r13, r9, r11)     // Catch: java.lang.Exception -> L98
            r5.put(r2, r9)     // Catch: java.lang.Exception -> L98
        L84:
            int r3 = r3 + r10
            goto L1a
        L86:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L98
            r3 = 1
            if (r3 == r2) goto L8f
            r3 = r1
            goto L90
        L8f:
            r3 = r0
        L90:
            v9.u0 r1 = new v9.u0     // Catch: java.lang.Exception -> L98
            r2 = r1
            r9 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L98
            return r1
        L98:
            r1 = move-exception
            java.lang.String r13 = java.util.Arrays.toString(r13)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r2 = "Unable to parse scan record: "
            java.lang.String r13 = r2.concat(r13)
            java.lang.String r2 = "BleRecord"
            android.util.Log.w(r2, r13, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p385v9.C13216u0.m3020a(byte[]):v9.u0");
    }

    /* renamed from: b */
    private static int m3019b(byte[] bArr, int i, int i2, int i3, List list) {
        while (i2 > 0) {
            list.add(m3018c(m3017d(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    /* renamed from: c */
    private static ParcelUuid m3018c(byte[] bArr) {
        long j;
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new IllegalArgumentException("uuidBytes length invalid - " + length);
        } else if (length == 16) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(order.getLong(8), order.getLong(0)));
        } else {
            if (length == 2) {
                j = (bArr[0] & 255) + ((bArr[1] & 255) << 8);
            } else {
                j = ((bArr[3] & 255) << 24) + (bArr[0] & 255) + ((bArr[1] & 255) << 8) + ((bArr[2] & 255) << 16);
            }
            ParcelUuid parcelUuid = f34260h;
            return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j << 32), parcelUuid.getUuid().getLeastSignificantBits()));
        }
    }

    /* renamed from: d */
    private static byte[] m3017d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13216u0)) {
            return false;
        }
        return Arrays.equals(this.f34267g, ((C13216u0) obj).f34267g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f34267g);
    }

    public final String toString() {
        String sb2;
        String m22373a;
        String m22373a2;
        int i = this.f34261a;
        String valueOf = String.valueOf(this.f34262b);
        SparseArray sparseArray = this.f34263c;
        StringBuilder sb3 = new StringBuilder();
        String str = "{}";
        int i2 = 0;
        if (sparseArray.size() <= 0) {
            sb2 = "{}";
        } else {
            sb3.append('{');
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                if (i3 > 0) {
                    sb3.append(", ");
                }
                int keyAt = sparseArray.keyAt(i3);
                byte[] bArr = (byte[]) sparseArray.valueAt(i3);
                sb3.append(keyAt);
                sb3.append('=');
                if (bArr == null) {
                    m22373a = null;
                } else {
                    m22373a = C6584g.m22373a(bArr);
                }
                sb3.append(m22373a);
            }
            sb3.append('}');
            sb2 = sb3.toString();
        }
        Map map = this.f34264d;
        StringBuilder sb4 = new StringBuilder();
        if (map.keySet().size() > 0) {
            sb4.append('{');
            for (Map.Entry entry : map.entrySet()) {
                if (i2 > 0) {
                    sb4.append(", ");
                }
                sb4.append(entry.getKey());
                sb4.append('=');
                byte[] bArr2 = (byte[]) entry.getValue();
                if (bArr2 == null) {
                    m22373a2 = null;
                } else {
                    m22373a2 = C6584g.m22373a(bArr2);
                }
                sb4.append(m22373a2);
                i2++;
            }
            sb4.append('}');
            str = sb4.toString();
        }
        return "BleRecord [mAdvertiseFlags=" + i + ", mServiceUuids=" + valueOf + ", mManufacturerSpecificData=" + sb2 + ", mServiceData=" + str + ", mTxPowerLevel=" + this.f34265e + ", mDeviceName=" + this.f34266f + "]";
    }
}
package com.facebook.soloader;

import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.soloader.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4322n {

    /* renamed from: a */
    private static final int f10992a = 3;

    /* renamed from: b */
    private static final int f10993b = 3;

    /* renamed from: d */
    private static volatile boolean f10995d = false;

    /* renamed from: e */
    private static byte[] f10996e = null;

    /* renamed from: f */
    private static List<Integer> f10997f = null;

    /* renamed from: g */
    private static Map<Integer, List<Integer>> f10998g = null;

    /* renamed from: h */
    private static volatile boolean f10999h = false;

    /* renamed from: c */
    private static final int f10994c = 3 + 3;

    /* renamed from: i */
    private static final ReentrantReadWriteLock f11000i = new ReentrantReadWriteLock();

    /* renamed from: a */
    private static String[] m30098a(String str) {
        if (f10995d) {
            return m30091h(str);
        }
        if (f10999h) {
            ReentrantReadWriteLock reentrantReadWriteLock = f11000i;
            reentrantReadWriteLock.readLock().lock();
            try {
                String[] m30091h = m30091h(str);
                reentrantReadWriteLock.readLock().unlock();
                return m30091h;
            } catch (Throwable th2) {
                f11000i.readLock().unlock();
                throw th2;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String[] m30097b(String str, InterfaceC4304f interfaceC4304f) {
        String[] m30098a = m30098a(str);
        if (m30098a != null) {
            return m30098a;
        }
        return C4319m.m30107a(interfaceC4304f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x003d, code lost:
        return null;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String[] m30096c(int r6, int r7) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r6 = r6 + r7
            int r7 = com.facebook.soloader.C4322n.f10994c
            int r6 = r6 - r7
            r7 = 0
            r1 = r7
            r2 = r1
        Lc:
            byte[] r3 = com.facebook.soloader.C4322n.f10996e
            int r4 = r3.length
            r5 = 0
            if (r6 >= r4) goto L3e
            r3 = r3[r6]
            r4 = 10
            if (r3 == r4) goto L3e
            r4 = 32
            if (r3 != r4) goto L2b
            if (r2 == 0) goto L3a
            java.lang.String r1 = m30095d(r1)
            if (r1 != 0) goto L25
            return r5
        L25:
            r0.add(r1)
            r1 = r7
            r2 = r1
            goto L3a
        L2b:
            r2 = 48
            if (r3 < r2) goto L3d
            r2 = 57
            if (r3 <= r2) goto L34
            goto L3d
        L34:
            int r1 = r1 * 10
            int r3 = r3 + (-48)
            int r1 = r1 + r3
            r2 = 1
        L3a:
            int r6 = r6 + 1
            goto Lc
        L3d:
            return r5
        L3e:
            if (r2 == 0) goto L4a
            java.lang.String r6 = m30095d(r1)
            if (r6 != 0) goto L47
            return r5
        L47:
            r0.add(r6)
        L4a:
            int r6 = r0.size()
            if (r6 != 0) goto L51
            return r5
        L51:
            int r6 = r0.size()
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r6 = r0.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C4322n.m30096c(int, int):java.lang.String[]");
    }

    /* renamed from: d */
    private static String m30095d(int i) {
        if (i >= f10997f.size()) {
            return null;
        }
        int intValue = f10997f.get(i).intValue();
        int i2 = intValue;
        while (true) {
            byte[] bArr = f10996e;
            if (i2 >= bArr.length || bArr[i2] <= 32) {
                break;
            }
            i2++;
        }
        int i3 = (i2 - intValue) + f10994c;
        char[] cArr = new char[i3];
        cArr[0] = 'l';
        cArr[1] = 'i';
        cArr[2] = 'b';
        for (int i4 = 0; i4 < i3 - f10994c; i4++) {
            cArr[f10992a + i4] = (char) f10996e[intValue + i4];
        }
        cArr[i3 - 3] = '.';
        cArr[i3 - 2] = 's';
        cArr[i3 - 1] = 'o';
        return new String(cArr);
    }

    /* renamed from: e */
    private static int m30094e(String str) {
        List<Integer> list = f10998g.get(Integer.valueOf(m30093f(str)));
        if (list == null) {
            return -1;
        }
        for (Integer num : list) {
            int intValue = num.intValue();
            if (m30092g(str, intValue)) {
                return intValue;
            }
        }
        return -1;
    }

    /* renamed from: f */
    private static int m30093f(String str) {
        int i = 5381;
        for (int i2 = f10992a; i2 < str.length() - f10993b; i2++) {
            i = str.codePointAt(i2) + (i << 5) + i;
        }
        return i;
    }

    /* renamed from: g */
    private static boolean m30092g(String str, int i) {
        int i2;
        int i3 = f10992a;
        while (true) {
            int length = str.length();
            i2 = f10993b;
            if (i3 >= length - i2 || i >= f10996e.length || (str.codePointAt(i3) & 255) != f10996e[i]) {
                break;
            }
            i3++;
            i++;
        }
        if (i3 == str.length() - i2) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    static String[] m30091h(String str) {
        int m30094e;
        if (!f10995d || str.length() <= f10994c || (m30094e = m30094e(str)) == -1) {
            return null;
        }
        return m30096c(m30094e, str.length());
    }
}
package io.sentry.vendor;

import java.io.UnsupportedEncodingException;

/* renamed from: io.sentry.vendor.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8250a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.vendor.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC8251a {

        /* renamed from: a */
        public byte[] f22172a;

        /* renamed from: b */
        public int f22173b;

        AbstractC8251a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.vendor.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C8252b extends AbstractC8251a {

        /* renamed from: j */
        private static final byte[] f22174j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k */
        private static final byte[] f22175k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c */
        private final byte[] f22176c;

        /* renamed from: d */
        int f22177d;

        /* renamed from: e */
        private int f22178e;

        /* renamed from: f */
        public final boolean f22179f;

        /* renamed from: g */
        public final boolean f22180g;

        /* renamed from: h */
        public final boolean f22181h;

        /* renamed from: i */
        private final byte[] f22182i;

        public C8252b(int i, byte[] bArr) {
            boolean z;
            boolean z2;
            byte[] bArr2;
            int i2;
            this.f22172a = bArr;
            if ((i & 1) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f22179f = z;
            if ((i & 2) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f22180g = z2;
            this.f22181h = (i & 4) != 0;
            if ((i & 8) == 0) {
                bArr2 = f22174j;
            } else {
                bArr2 = f22175k;
            }
            this.f22182i = bArr2;
            this.f22176c = new byte[2];
            this.f22177d = 0;
            if (z2) {
                i2 = 19;
            } else {
                i2 = -1;
            }
            this.f22178e = i2;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00e6 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00dd -> B:22:0x008a). Please submit an issue!!! */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m18125a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 478
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.C8250a.C8252b.m18125a(byte[], int, int, boolean):boolean");
        }
    }

    /* renamed from: a */
    public static byte[] m18128a(byte[] bArr, int i) {
        return m18127b(bArr, 0, bArr.length, i);
    }

    /* renamed from: b */
    public static byte[] m18127b(byte[] bArr, int i, int i2, int i3) {
        C8252b c8252b = new C8252b(i3, null);
        int i4 = (i2 / 3) * 4;
        int i5 = 2;
        if (c8252b.f22179f) {
            if (i2 % 3 > 0) {
                i4 += 4;
            }
        } else {
            int i6 = i2 % 3;
            if (i6 != 1) {
                if (i6 == 2) {
                    i4 += 3;
                }
            } else {
                i4 += 2;
            }
        }
        if (c8252b.f22180g && i2 > 0) {
            int i7 = ((i2 - 1) / 57) + 1;
            if (!c8252b.f22181h) {
                i5 = 1;
            }
            i4 += i7 * i5;
        }
        c8252b.f22172a = new byte[i4];
        c8252b.m18125a(bArr, i, i2, true);
        return c8252b.f22172a;
    }

    /* renamed from: c */
    public static String m18126c(byte[] bArr, int i) {
        try {
            return new String(m18128a(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}

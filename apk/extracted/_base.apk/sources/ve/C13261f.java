package ve;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p110g0.C6509a;

/* renamed from: ve.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13261f {

    /* renamed from: b */
    private static final byte[] f34327b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c */
    private static final int[] f34328c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a */
    private final InterfaceC13263b f34329a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ve.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C13262a {

        /* renamed from: a */
        private final ByteBuffer f34330a;

        public C13262a(byte[] bArr, int i) {
            this.f34330a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        public short m2893a(int i) {
            return this.f34330a.getShort(i);
        }

        /* renamed from: b */
        public int m2892b(int i) {
            return this.f34330a.getInt(i);
        }

        /* renamed from: c */
        public int m2891c() {
            return this.f34330a.remaining();
        }

        /* renamed from: d */
        public void m2890d(ByteOrder byteOrder) {
            this.f34330a.order(byteOrder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ve.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC13263b {
        /* renamed from: a */
        int mo2889a();

        /* renamed from: b */
        int mo2888b(byte[] bArr, int i);

        /* renamed from: c */
        short mo2887c();

        long skip(long j);
    }

    /* renamed from: ve.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C13264c implements InterfaceC13263b {

        /* renamed from: a */
        private final InputStream f34331a;

        public C13264c(InputStream inputStream) {
            this.f34331a = inputStream;
        }

        @Override // ve.C13261f.InterfaceC13263b
        /* renamed from: a */
        public int mo2889a() {
            return ((this.f34331a.read() << 8) & 65280) | (this.f34331a.read() & 255);
        }

        @Override // ve.C13261f.InterfaceC13263b
        /* renamed from: b */
        public int mo2888b(byte[] bArr, int i) {
            int i2 = i;
            while (i2 > 0) {
                int read = this.f34331a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }

        @Override // ve.C13261f.InterfaceC13263b
        /* renamed from: c */
        public short mo2887c() {
            return (short) (this.f34331a.read() & 255);
        }

        @Override // ve.C13261f.InterfaceC13263b
        public long skip(long j) {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f34331a.skip(j2);
                if (skip <= 0) {
                    if (this.f34331a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    public C13261f(InputStream inputStream) {
        this.f34329a = new C13264c(inputStream);
    }

    /* renamed from: a */
    private static int m2901a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: b */
    public static void m2900b(C6509a c6509a, int i, int i2, String str) {
        String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
        try {
            C6509a c6509a2 = new C6509a(str);
            for (int i3 = 0; i3 < 22; i3++) {
                String str2 = strArr[i3];
                String m22510j = c6509a.m22510j(str2);
                if (!TextUtils.isEmpty(m22510j)) {
                    c6509a2.m22526Z(str2, m22510j);
                }
            }
            c6509a2.m22526Z("ImageWidth", String.valueOf(i));
            c6509a2.m22526Z("ImageLength", String.valueOf(i2));
            c6509a2.m22526Z("Orientation", "0");
            c6509a2.m22530V();
        } catch (IOException e) {
            Log.d("ImageHeaderParser", e.getMessage());
        }
    }

    /* renamed from: d */
    private static boolean m2898d(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: e */
    private boolean m2897e(byte[] bArr, int i) {
        boolean z;
        if (bArr != null && i > f34327b.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f34327b;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: f */
    private int m2896f() {
        short mo2887c;
        short mo2887c2;
        int mo2889a;
        long j;
        long skip;
        do {
            if (this.f34329a.mo2887c() != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unknown segmentId=" + ((int) mo2887c));
                }
                return -1;
            }
            mo2887c2 = this.f34329a.mo2887c();
            if (mo2887c2 == 218) {
                return -1;
            }
            if (mo2887c2 == 217) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            mo2889a = this.f34329a.mo2889a() - 2;
            if (mo2887c2 != 225) {
                j = mo2889a;
                skip = this.f34329a.skip(j);
            } else {
                return mo2889a;
            }
        } while (skip == j);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to skip enough data, type: " + ((int) mo2887c2) + ", wanted to skip: " + mo2889a + ", but actually skipped: " + skip);
        }
        return -1;
    }

    /* renamed from: g */
    private static int m2895g(C13262a c13262a) {
        ByteOrder byteOrder;
        short m2893a = c13262a.m2893a(6);
        if (m2893a == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (m2893a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Unknown endianness = " + ((int) m2893a));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        c13262a.m2890d(byteOrder);
        int m2892b = c13262a.m2892b(10) + 6;
        short m2893a2 = c13262a.m2893a(m2892b);
        for (int i = 0; i < m2893a2; i++) {
            int m2901a = m2901a(m2892b, i);
            short m2893a3 = c13262a.m2893a(m2901a);
            if (m2893a3 == 274) {
                short m2893a4 = c13262a.m2893a(m2901a + 2);
                if (m2893a4 >= 1 && m2893a4 <= 12) {
                    int m2892b2 = c13262a.m2892b(m2901a + 4);
                    if (m2892b2 < 0) {
                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                            Log.d("ImageHeaderParser", "Negative tiff component count");
                        }
                    } else {
                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                            Log.d("ImageHeaderParser", "Got tagIndex=" + i + " tagType=" + ((int) m2893a3) + " formatCode=" + ((int) m2893a4) + " componentCount=" + m2892b2);
                        }
                        int i2 = m2892b2 + f34328c[m2893a4];
                        if (i2 > 4) {
                            if (Log.isLoggable("ImageHeaderParser", 3)) {
                                Log.d("ImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) m2893a4));
                            }
                        } else {
                            int i3 = m2901a + 8;
                            if (i3 >= 0 && i3 <= c13262a.m2891c()) {
                                if (i2 >= 0 && i2 + i3 <= c13262a.m2891c()) {
                                    return c13262a.m2893a(i3);
                                }
                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    Log.d("ImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) m2893a3));
                                }
                            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                Log.d("ImageHeaderParser", "Illegal tagValueOffset=" + i3 + " tagType=" + ((int) m2893a3));
                            }
                        }
                    }
                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Got invalid format code = " + ((int) m2893a4));
                }
            }
        }
        return -1;
    }

    /* renamed from: h */
    private int m2894h(byte[] bArr, int i) {
        int mo2888b = this.f34329a.mo2888b(bArr, i);
        if (mo2888b != i) {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + mo2888b);
            }
            return -1;
        } else if (m2897e(bArr, i)) {
            return m2895g(new C13262a(bArr, i));
        } else {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    /* renamed from: c */
    public int m2899c() {
        int mo2889a = this.f34329a.mo2889a();
        if (!m2898d(mo2889a)) {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Parser doesn't handle magic number: " + mo2889a);
            }
            return -1;
        }
        int m2896f = m2896f();
        if (m2896f == -1) {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        return m2894h(new byte[m2896f], m2896f);
    }
}

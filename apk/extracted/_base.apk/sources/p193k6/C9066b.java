package p193k6;

import com.discord.media.utils.DiscordVideoMediaSource;
import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
import p195k8.C9191p0;
import p195k8.C9207x;
import p195k8.C9208y;
import p259o6.C11028l;

/* renamed from: k6.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9066b {

    /* renamed from: a */
    private static final int[] f23781a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f23782b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f23783c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f23784d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f23785e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, DiscordVideoMediaSource.DEFAULT_WIDTH};

    /* renamed from: f */
    private static final int[] f23786f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: k6.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9068b {

        /* renamed from: a */
        public final String f23787a;

        /* renamed from: b */
        public final int f23788b;

        /* renamed from: c */
        public final int f23789c;

        /* renamed from: d */
        public final int f23790d;

        /* renamed from: e */
        public final int f23791e;

        /* renamed from: f */
        public final int f23792f;

        private C9068b(String str, int i, int i2, int i3, int i4, int i5) {
            this.f23787a = str;
            this.f23788b = i;
            this.f23790d = i2;
            this.f23789c = i3;
            this.f23791e = i4;
            this.f23792f = i5;
        }
    }

    /* renamed from: a */
    public static int m16779a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((C9191p0.m16299H(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - position;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private static int m16778b(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0) {
            int[] iArr = f23782b;
            if (i < iArr.length && i2 >= 0) {
                int[] iArr2 = f23786f;
                if (i3 < iArr2.length) {
                    int i4 = iArr[i];
                    if (i4 == 44100) {
                        return (iArr2[i3] + (i2 % 2)) * 2;
                    }
                    int i5 = f23785e[i3];
                    if (i4 == 32000) {
                        return i5 * 6;
                    }
                    return i5 * 4;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: c */
    public static Format m16777c(C9208y c9208y, String str, String str2, C11028l c11028l) {
        int i = f23782b[(c9208y.m16111D() & 192) >> 6];
        int m16111D = c9208y.m16111D();
        int i2 = f23784d[(m16111D & 56) >> 3];
        if ((m16111D & 4) != 0) {
            i2++;
        }
        return new Format.C4362b().m29900S(str).m29883e0("audio/ac3").m29911H(i2).m29881f0(i).m29907L(c11028l).m29897V(str2).m29914E();
    }

    /* renamed from: d */
    public static int m16776d(ByteBuffer byteBuffer) {
        boolean z;
        int i = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
            }
            return f23781a[i] * 256;
        }
        return 1536;
    }

    /* renamed from: e */
    public static C9068b m16775e(C9207x c9207x) {
        boolean z;
        String str;
        int m16778b;
        int i;
        int i2;
        int i3;
        int i4;
        String str2;
        int m16126h;
        int i5;
        int i6;
        String str3;
        int i7;
        int i8;
        int m16129e = c9207x.m16129e();
        c9207x.m16116r(40);
        if (c9207x.m16126h(5) > 10) {
            z = true;
        } else {
            z = false;
        }
        c9207x.m16118p(m16129e);
        int i9 = -1;
        if (z) {
            c9207x.m16116r(16);
            int m16126h2 = c9207x.m16126h(2);
            if (m16126h2 != 0) {
                if (m16126h2 != 1) {
                    if (m16126h2 == 2) {
                        i9 = 2;
                    }
                } else {
                    i9 = 1;
                }
            } else {
                i9 = 0;
            }
            c9207x.m16116r(3);
            m16778b = (c9207x.m16126h(11) + 1) * 2;
            int m16126h3 = c9207x.m16126h(2);
            if (m16126h3 == 3) {
                i = f23783c[c9207x.m16126h(2)];
                i5 = 6;
                m16126h = 3;
            } else {
                m16126h = c9207x.m16126h(2);
                i5 = f23781a[m16126h];
                i = f23782b[m16126h3];
            }
            i3 = i5 * 256;
            int m16126h4 = c9207x.m16126h(3);
            boolean m16127g = c9207x.m16127g();
            i2 = f23784d[m16126h4] + (m16127g ? 1 : 0);
            c9207x.m16116r(10);
            if (c9207x.m16127g()) {
                c9207x.m16116r(8);
            }
            if (m16126h4 == 0) {
                c9207x.m16116r(5);
                if (c9207x.m16127g()) {
                    c9207x.m16116r(8);
                }
            }
            if (i9 == 1 && c9207x.m16127g()) {
                c9207x.m16116r(16);
            }
            if (c9207x.m16127g()) {
                if (m16126h4 > 2) {
                    c9207x.m16116r(2);
                }
                if ((m16126h4 & 1) != 0 && m16126h4 > 2) {
                    i7 = 6;
                    c9207x.m16116r(6);
                } else {
                    i7 = 6;
                }
                if ((m16126h4 & 4) != 0) {
                    c9207x.m16116r(i7);
                }
                if (m16127g && c9207x.m16127g()) {
                    c9207x.m16116r(5);
                }
                if (i9 == 0) {
                    if (c9207x.m16127g()) {
                        i8 = 6;
                        c9207x.m16116r(6);
                    } else {
                        i8 = 6;
                    }
                    if (m16126h4 == 0 && c9207x.m16127g()) {
                        c9207x.m16116r(i8);
                    }
                    if (c9207x.m16127g()) {
                        c9207x.m16116r(i8);
                    }
                    int m16126h5 = c9207x.m16126h(2);
                    if (m16126h5 == 1) {
                        c9207x.m16116r(5);
                    } else if (m16126h5 == 2) {
                        c9207x.m16116r(12);
                    } else if (m16126h5 == 3) {
                        int m16126h6 = c9207x.m16126h(5);
                        if (c9207x.m16127g()) {
                            c9207x.m16116r(5);
                            if (c9207x.m16127g()) {
                                c9207x.m16116r(4);
                            }
                            if (c9207x.m16127g()) {
                                c9207x.m16116r(4);
                            }
                            if (c9207x.m16127g()) {
                                c9207x.m16116r(4);
                            }
                            if (c9207x.m16127g()) {
                                c9207x.m16116r(4);
                            }
                            if (c9207x.m16127g()) {
                                c9207x.m16116r(4);
                            }
                            if (c9207x.m16127g()) {
                                c9207x.m16116r(4);
                            }
                            if (c9207x.m16127g()) {
                                c9207x.m16116r(4);
                            }
                            if (c9207x.m16127g()) {
                                if (c9207x.m16127g()) {
                                    c9207x.m16116r(4);
                                }
                                if (c9207x.m16127g()) {
                                    c9207x.m16116r(4);
                                }
                            }
                        }
                        if (c9207x.m16127g()) {
                            c9207x.m16116r(5);
                            if (c9207x.m16127g()) {
                                c9207x.m16116r(7);
                                if (c9207x.m16127g()) {
                                    c9207x.m16116r(8);
                                }
                            }
                        }
                        c9207x.m16116r((m16126h6 + 2) * 8);
                        c9207x.m16131c();
                    }
                    if (m16126h4 < 2) {
                        if (c9207x.m16127g()) {
                            c9207x.m16116r(14);
                        }
                        if (m16126h4 == 0 && c9207x.m16127g()) {
                            c9207x.m16116r(14);
                        }
                    }
                    if (c9207x.m16127g()) {
                        if (m16126h == 0) {
                            c9207x.m16116r(5);
                        } else {
                            for (int i10 = 0; i10 < i5; i10++) {
                                if (c9207x.m16127g()) {
                                    c9207x.m16116r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c9207x.m16127g()) {
                c9207x.m16116r(5);
                if (m16126h4 == 2) {
                    c9207x.m16116r(4);
                }
                if (m16126h4 >= 6) {
                    c9207x.m16116r(2);
                }
                if (c9207x.m16127g()) {
                    c9207x.m16116r(8);
                }
                if (m16126h4 == 0 && c9207x.m16127g()) {
                    c9207x.m16116r(8);
                }
                if (m16126h3 < 3) {
                    c9207x.m16117q();
                }
            }
            if (i9 == 0 && m16126h != 3) {
                c9207x.m16117q();
            }
            if (i9 == 2 && (m16126h == 3 || c9207x.m16127g())) {
                i6 = 6;
                c9207x.m16116r(6);
            } else {
                i6 = 6;
            }
            if (c9207x.m16127g() && c9207x.m16126h(i6) == 1 && c9207x.m16126h(8) == 1) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
            str2 = str3;
            i4 = i9;
        } else {
            c9207x.m16116r(32);
            int m16126h7 = c9207x.m16126h(2);
            if (m16126h7 == 3) {
                str = null;
            } else {
                str = "audio/ac3";
            }
            m16778b = m16778b(m16126h7, c9207x.m16126h(6));
            c9207x.m16116r(8);
            int m16126h8 = c9207x.m16126h(3);
            if ((m16126h8 & 1) != 0 && m16126h8 != 1) {
                c9207x.m16116r(2);
            }
            if ((m16126h8 & 4) != 0) {
                c9207x.m16116r(2);
            }
            if (m16126h8 == 2) {
                c9207x.m16116r(2);
            }
            int[] iArr = f23782b;
            if (m16126h7 < iArr.length) {
                i = iArr[m16126h7];
            } else {
                i = -1;
            }
            i2 = f23784d[m16126h8] + (c9207x.m16127g() ? 1 : 0);
            i3 = 1536;
            i4 = -1;
            str2 = str;
        }
        return new C9068b(str2, i4, i2, i, m16778b, i3);
    }

    /* renamed from: f */
    public static int m16774f(byte[] bArr) {
        boolean z;
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b = bArr[4];
        return m16778b((b & 192) >> 6, b & 63);
    }

    /* renamed from: g */
    public static Format m16773g(C9208y c9208y, String str, String str2, C11028l c11028l) {
        String str3;
        c9208y.m16098Q(2);
        int i = f23782b[(c9208y.m16111D() & 192) >> 6];
        int m16111D = c9208y.m16111D();
        int i2 = f23784d[(m16111D & 14) >> 1];
        if ((m16111D & 1) != 0) {
            i2++;
        }
        if (((c9208y.m16111D() & 30) >> 1) > 0 && (2 & c9208y.m16111D()) != 0) {
            i2 += 2;
        }
        if (c9208y.m16097a() > 0 && (c9208y.m16111D() & 1) != 0) {
            str3 = "audio/eac3-joc";
        } else {
            str3 = "audio/eac3";
        }
        return new Format.C4362b().m29900S(str).m29883e0(str3).m29911H(i2).m29881f0(i).m29907L(c11028l).m29897V(str2).m29914E();
    }

    /* renamed from: h */
    public static int m16772h(ByteBuffer byteBuffer, int i) {
        boolean z;
        int i2;
        if ((byteBuffer.get(byteBuffer.position() + i + 7) & 255) == 187) {
            z = true;
        } else {
            z = false;
        }
        int position = byteBuffer.position() + i;
        if (z) {
            i2 = 9;
        } else {
            i2 = 8;
        }
        return 40 << ((byteBuffer.get(position + i2) >> 4) & 7);
    }

    /* renamed from: i */
    public static int m16771i(byte[] bArr) {
        char c;
        boolean z = false;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                if ((b & 255) == 187) {
                    z = true;
                }
                if (z) {
                    c = '\t';
                } else {
                    c = '\b';
                }
                return 40 << ((bArr[c] >> 4) & 7);
            }
        }
        return 0;
    }
}

package p419x7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9207x;
import p383v7.C13127b;

/* renamed from: x7.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13725b {

    /* renamed from: h */
    private static final byte[] f35394h = {0, 7, 8, 15};

    /* renamed from: i */
    private static final byte[] f35395i = {0, 119, -120, -1};

    /* renamed from: j */
    private static final byte[] f35396j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    private final Paint f35397a;

    /* renamed from: b */
    private final Paint f35398b;

    /* renamed from: c */
    private final Canvas f35399c;

    /* renamed from: d */
    private final C13727b f35400d;

    /* renamed from: e */
    private final C13726a f35401e;

    /* renamed from: f */
    private final C13733h f35402f;

    /* renamed from: g */
    private Bitmap f35403g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x7.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13726a {

        /* renamed from: a */
        public final int f35404a;

        /* renamed from: b */
        public final int[] f35405b;

        /* renamed from: c */
        public final int[] f35406c;

        /* renamed from: d */
        public final int[] f35407d;

        public C13726a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f35404a = i;
            this.f35405b = iArr;
            this.f35406c = iArr2;
            this.f35407d = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x7.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13727b {

        /* renamed from: a */
        public final int f35408a;

        /* renamed from: b */
        public final int f35409b;

        /* renamed from: c */
        public final int f35410c;

        /* renamed from: d */
        public final int f35411d;

        /* renamed from: e */
        public final int f35412e;

        /* renamed from: f */
        public final int f35413f;

        public C13727b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f35408a = i;
            this.f35409b = i2;
            this.f35410c = i3;
            this.f35411d = i4;
            this.f35412e = i5;
            this.f35413f = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x7.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13728c {

        /* renamed from: a */
        public final int f35414a;

        /* renamed from: b */
        public final boolean f35415b;

        /* renamed from: c */
        public final byte[] f35416c;

        /* renamed from: d */
        public final byte[] f35417d;

        public C13728c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f35414a = i;
            this.f35415b = z;
            this.f35416c = bArr;
            this.f35417d = bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x7.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13729d {

        /* renamed from: a */
        public final int f35418a;

        /* renamed from: b */
        public final int f35419b;

        /* renamed from: c */
        public final int f35420c;

        /* renamed from: d */
        public final SparseArray<C13730e> f35421d;

        public C13729d(int i, int i2, int i3, SparseArray<C13730e> sparseArray) {
            this.f35418a = i;
            this.f35419b = i2;
            this.f35420c = i3;
            this.f35421d = sparseArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x7.b$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13730e {

        /* renamed from: a */
        public final int f35422a;

        /* renamed from: b */
        public final int f35423b;

        public C13730e(int i, int i2) {
            this.f35422a = i;
            this.f35423b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x7.b$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13731f {

        /* renamed from: a */
        public final int f35424a;

        /* renamed from: b */
        public final boolean f35425b;

        /* renamed from: c */
        public final int f35426c;

        /* renamed from: d */
        public final int f35427d;

        /* renamed from: e */
        public final int f35428e;

        /* renamed from: f */
        public final int f35429f;

        /* renamed from: g */
        public final int f35430g;

        /* renamed from: h */
        public final int f35431h;

        /* renamed from: i */
        public final int f35432i;

        /* renamed from: j */
        public final int f35433j;

        /* renamed from: k */
        public final SparseArray<C13732g> f35434k;

        public C13731f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C13732g> sparseArray) {
            this.f35424a = i;
            this.f35425b = z;
            this.f35426c = i2;
            this.f35427d = i3;
            this.f35428e = i4;
            this.f35429f = i5;
            this.f35430g = i6;
            this.f35431h = i7;
            this.f35432i = i8;
            this.f35433j = i9;
            this.f35434k = sparseArray;
        }

        /* renamed from: a */
        public void m1617a(C13731f c13731f) {
            SparseArray<C13732g> sparseArray = c13731f.f35434k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f35434k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x7.b$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13732g {

        /* renamed from: a */
        public final int f35435a;

        /* renamed from: b */
        public final int f35436b;

        /* renamed from: c */
        public final int f35437c;

        /* renamed from: d */
        public final int f35438d;

        /* renamed from: e */
        public final int f35439e;

        /* renamed from: f */
        public final int f35440f;

        public C13732g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f35435a = i;
            this.f35436b = i2;
            this.f35437c = i3;
            this.f35438d = i4;
            this.f35439e = i5;
            this.f35440f = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x7.b$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13733h {

        /* renamed from: a */
        public final int f35441a;

        /* renamed from: b */
        public final int f35442b;

        /* renamed from: c */
        public final SparseArray<C13731f> f35443c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<C13726a> f35444d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C13728c> f35445e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<C13726a> f35446f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<C13728c> f35447g = new SparseArray<>();

        /* renamed from: h */
        public C13727b f35448h;

        /* renamed from: i */
        public C13729d f35449i;

        public C13733h(int i, int i2) {
            this.f35441a = i;
            this.f35442b = i2;
        }

        /* renamed from: a */
        public void m1616a() {
            this.f35443c.clear();
            this.f35444d.clear();
            this.f35445e.clear();
            this.f35446f.clear();
            this.f35447g.clear();
            this.f35448h = null;
            this.f35449i = null;
        }
    }

    public C13725b(int i, int i2) {
        Paint paint = new Paint();
        this.f35397a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f35398b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f35399c = new Canvas();
        this.f35400d = new C13727b(719, 575, 0, 719, 0, 575);
        this.f35401e = new C13726a(0, m1633c(), m1632d(), m1631e());
        this.f35402f = new C13733h(i, i2);
    }

    /* renamed from: a */
    private static byte[] m1635a(int i, int i2, C9207x c9207x) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c9207x.m16126h(i2);
        }
        return bArr;
    }

    /* renamed from: c */
    private static int[] m1633c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* renamed from: d */
    private static int[] m1632d() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i6 = 1; i6 < 16; i6++) {
            if (i6 < 8) {
                if ((i6 & 1) != 0) {
                    i3 = 255;
                } else {
                    i3 = 0;
                }
                if ((i6 & 2) != 0) {
                    i4 = 255;
                } else {
                    i4 = 0;
                }
                if ((i6 & 4) != 0) {
                    i5 = 255;
                } else {
                    i5 = 0;
                }
                iArr[i6] = m1630f(255, i3, i4, i5);
            } else {
                int i7 = 127;
                if ((i6 & 1) != 0) {
                    i = 127;
                } else {
                    i = 0;
                }
                if ((i6 & 2) != 0) {
                    i2 = 127;
                } else {
                    i2 = 0;
                }
                if ((i6 & 4) == 0) {
                    i7 = 0;
                }
                iArr[i6] = m1630f(255, i, i2, i7);
            }
        }
        return iArr;
    }

    /* renamed from: e */
    private static int[] m1631e() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i19 = 0; i19 < 256; i19++) {
            int i20 = 255;
            if (i19 < 8) {
                if ((i19 & 1) != 0) {
                    i17 = 255;
                } else {
                    i17 = 0;
                }
                if ((i19 & 2) != 0) {
                    i18 = 255;
                } else {
                    i18 = 0;
                }
                if ((i19 & 4) == 0) {
                    i20 = 0;
                }
                iArr[i19] = m1630f(63, i17, i18, i20);
            } else {
                int i21 = i19 & 136;
                int i22 = 170;
                int i23 = 85;
                if (i21 != 0) {
                    if (i21 != 8) {
                        int i24 = 43;
                        if (i21 != 128) {
                            if (i21 == 136) {
                                if ((i19 & 1) != 0) {
                                    i13 = 43;
                                } else {
                                    i13 = 0;
                                }
                                if ((i19 & 16) != 0) {
                                    i14 = 85;
                                } else {
                                    i14 = 0;
                                }
                                int i25 = i13 + i14;
                                if ((i19 & 2) != 0) {
                                    i15 = 43;
                                } else {
                                    i15 = 0;
                                }
                                if ((i19 & 32) != 0) {
                                    i16 = 85;
                                } else {
                                    i16 = 0;
                                }
                                int i26 = i15 + i16;
                                if ((i19 & 4) == 0) {
                                    i24 = 0;
                                }
                                if ((i19 & 64) == 0) {
                                    i23 = 0;
                                }
                                iArr[i19] = m1630f(255, i25, i26, i24 + i23);
                            }
                        } else {
                            if ((i19 & 1) != 0) {
                                i9 = 43;
                            } else {
                                i9 = 0;
                            }
                            int i27 = i9 + 127;
                            if ((i19 & 16) != 0) {
                                i10 = 85;
                            } else {
                                i10 = 0;
                            }
                            int i28 = i27 + i10;
                            if ((i19 & 2) != 0) {
                                i11 = 43;
                            } else {
                                i11 = 0;
                            }
                            int i29 = i11 + 127;
                            if ((i19 & 32) != 0) {
                                i12 = 85;
                            } else {
                                i12 = 0;
                            }
                            int i30 = i29 + i12;
                            if ((i19 & 4) == 0) {
                                i24 = 0;
                            }
                            int i31 = i24 + 127;
                            if ((i19 & 64) == 0) {
                                i23 = 0;
                            }
                            iArr[i19] = m1630f(255, i28, i30, i31 + i23);
                        }
                    } else {
                        if ((i19 & 1) != 0) {
                            i5 = 85;
                        } else {
                            i5 = 0;
                        }
                        if ((i19 & 16) != 0) {
                            i6 = 170;
                        } else {
                            i6 = 0;
                        }
                        int i32 = i5 + i6;
                        if ((i19 & 2) != 0) {
                            i7 = 85;
                        } else {
                            i7 = 0;
                        }
                        if ((i19 & 32) != 0) {
                            i8 = 170;
                        } else {
                            i8 = 0;
                        }
                        int i33 = i7 + i8;
                        if ((i19 & 4) == 0) {
                            i23 = 0;
                        }
                        if ((i19 & 64) == 0) {
                            i22 = 0;
                        }
                        iArr[i19] = m1630f(127, i32, i33, i23 + i22);
                    }
                } else {
                    if ((i19 & 1) != 0) {
                        i = 85;
                    } else {
                        i = 0;
                    }
                    if ((i19 & 16) != 0) {
                        i2 = 170;
                    } else {
                        i2 = 0;
                    }
                    int i34 = i + i2;
                    if ((i19 & 2) != 0) {
                        i3 = 85;
                    } else {
                        i3 = 0;
                    }
                    if ((i19 & 32) != 0) {
                        i4 = 170;
                    } else {
                        i4 = 0;
                    }
                    int i35 = i3 + i4;
                    if ((i19 & 4) == 0) {
                        i23 = 0;
                    }
                    if ((i19 & 64) == 0) {
                        i22 = 0;
                    }
                    iArr[i19] = m1630f(255, i34, i35, i23 + i22);
                }
            }
        }
        return iArr;
    }

    /* renamed from: f */
    private static int m1630f(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: g */
    private static int m1629g(C9207x c9207x, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int i3;
        int m16126h;
        int m16126h2;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            byte m16126h3 = c9207x.m16126h(2);
            if (m16126h3 != 0) {
                z = z2;
                i3 = 1;
            } else {
                if (c9207x.m16127g()) {
                    m16126h = c9207x.m16126h(3) + 3;
                    m16126h2 = c9207x.m16126h(2);
                } else {
                    if (c9207x.m16127g()) {
                        z = z2;
                        i3 = 1;
                    } else {
                        int m16126h4 = c9207x.m16126h(2);
                        if (m16126h4 != 0) {
                            if (m16126h4 != 1) {
                                if (m16126h4 != 2) {
                                    if (m16126h4 != 3) {
                                        z = z2;
                                    } else {
                                        m16126h = c9207x.m16126h(8) + 29;
                                        m16126h2 = c9207x.m16126h(2);
                                    }
                                } else {
                                    m16126h = c9207x.m16126h(4) + 12;
                                    m16126h2 = c9207x.m16126h(2);
                                }
                            } else {
                                z = z2;
                                i3 = 2;
                            }
                        } else {
                            z = true;
                        }
                        m16126h3 = 0;
                        i3 = 0;
                    }
                    m16126h3 = 0;
                }
                z = z2;
                i3 = m16126h;
                m16126h3 = m16126h2;
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    m16126h3 = bArr[m16126h3];
                }
                paint.setColor(iArr[m16126h3]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    /* renamed from: h */
    private static int m1628h(C9207x c9207x, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int i3;
        int m16126h;
        int m16126h2;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            byte m16126h3 = c9207x.m16126h(4);
            if (m16126h3 != 0) {
                z = z2;
                i3 = 1;
            } else if (!c9207x.m16127g()) {
                int m16126h4 = c9207x.m16126h(3);
                if (m16126h4 != 0) {
                    z = z2;
                    i3 = m16126h4 + 2;
                    m16126h3 = 0;
                } else {
                    z = true;
                    m16126h3 = 0;
                    i3 = 0;
                }
            } else {
                if (!c9207x.m16127g()) {
                    m16126h = c9207x.m16126h(2) + 4;
                    m16126h2 = c9207x.m16126h(4);
                } else {
                    int m16126h5 = c9207x.m16126h(2);
                    if (m16126h5 != 0) {
                        if (m16126h5 != 1) {
                            if (m16126h5 != 2) {
                                if (m16126h5 != 3) {
                                    z = z2;
                                    m16126h3 = 0;
                                    i3 = 0;
                                } else {
                                    m16126h = c9207x.m16126h(8) + 25;
                                    m16126h2 = c9207x.m16126h(4);
                                }
                            } else {
                                m16126h = c9207x.m16126h(4) + 9;
                                m16126h2 = c9207x.m16126h(4);
                            }
                        } else {
                            z = z2;
                            i3 = 2;
                        }
                    } else {
                        z = z2;
                        i3 = 1;
                    }
                    m16126h3 = 0;
                }
                z = z2;
                i3 = m16126h;
                m16126h3 = m16126h2;
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    m16126h3 = bArr[m16126h3];
                }
                paint.setColor(iArr[m16126h3]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    /* renamed from: i */
    private static int m1627i(C9207x c9207x, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int m16126h;
        int i3 = i;
        boolean z2 = false;
        while (true) {
            byte m16126h2 = c9207x.m16126h(8);
            if (m16126h2 != 0) {
                z = z2;
                m16126h = 1;
            } else if (!c9207x.m16127g()) {
                int m16126h3 = c9207x.m16126h(7);
                if (m16126h3 != 0) {
                    z = z2;
                    m16126h = m16126h3;
                    m16126h2 = 0;
                } else {
                    z = true;
                    m16126h2 = 0;
                    m16126h = 0;
                }
            } else {
                z = z2;
                m16126h = c9207x.m16126h(7);
                m16126h2 = c9207x.m16126h(8);
            }
            if (m16126h != 0 && paint != null) {
                if (bArr != null) {
                    m16126h2 = bArr[m16126h2];
                }
                paint.setColor(iArr[m16126h2]);
                canvas.drawRect(i3, i2, i3 + m16126h, i2 + 1, paint);
            }
            i3 += m16126h;
            if (z) {
                return i3;
            }
            z2 = z;
        }
    }

    /* renamed from: j */
    private static void m1626j(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        C9207x c9207x = new C9207x(bArr);
        int i4 = i2;
        int i5 = i3;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        while (c9207x.m16132b() != 0) {
            int m16126h = c9207x.m16126h(8);
            if (m16126h != 240) {
                switch (m16126h) {
                    case 16:
                        if (i == 3) {
                            if (bArr6 == null) {
                                bArr3 = f35395i;
                            } else {
                                bArr3 = bArr6;
                            }
                        } else if (i == 2) {
                            if (bArr8 == null) {
                                bArr3 = f35394h;
                            } else {
                                bArr3 = bArr8;
                            }
                        } else {
                            bArr2 = null;
                            i4 = m1629g(c9207x, iArr, bArr2, i4, i5, paint, canvas);
                            c9207x.m16131c();
                            continue;
                        }
                        bArr2 = bArr3;
                        i4 = m1629g(c9207x, iArr, bArr2, i4, i5, paint, canvas);
                        c9207x.m16131c();
                        continue;
                    case 17:
                        if (i == 3) {
                            if (bArr7 == null) {
                                bArr5 = f35396j;
                            } else {
                                bArr5 = bArr7;
                            }
                            bArr4 = bArr5;
                        } else {
                            bArr4 = null;
                        }
                        i4 = m1628h(c9207x, iArr, bArr4, i4, i5, paint, canvas);
                        c9207x.m16131c();
                        continue;
                    case 18:
                        i4 = m1627i(c9207x, iArr, null, i4, i5, paint, canvas);
                        continue;
                    default:
                        switch (m16126h) {
                            case 32:
                                bArr8 = m1635a(4, 4, c9207x);
                                continue;
                            case 33:
                                bArr6 = m1635a(4, 8, c9207x);
                                continue;
                            case 34:
                                bArr7 = m1635a(16, 8, c9207x);
                                continue;
                            default:
                                continue;
                        }
                }
            } else {
                i5 += 2;
                i4 = i2;
            }
        }
    }

    /* renamed from: k */
    private static void m1625k(C13728c c13728c, C13726a c13726a, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = c13726a.f35407d;
        } else if (i == 2) {
            iArr = c13726a.f35406c;
        } else {
            iArr = c13726a.f35405b;
        }
        int[] iArr2 = iArr;
        m1626j(c13728c.f35416c, iArr2, i, i2, i3, paint, canvas);
        m1626j(c13728c.f35417d, iArr2, i, i2, i3 + 1, paint, canvas);
    }

    /* renamed from: l */
    private static C13726a m1624l(C9207x c9207x, int i) {
        int[] iArr;
        int m16126h;
        int i2;
        int m16126h2;
        int m16126h3;
        int i3;
        int i4 = 8;
        int m16126h4 = c9207x.m16126h(8);
        c9207x.m16116r(8);
        int i5 = 2;
        int i6 = i - 2;
        int[] m1633c = m1633c();
        int[] m1632d = m1632d();
        int[] m1631e = m1631e();
        while (i6 > 0) {
            int m16126h5 = c9207x.m16126h(i4);
            int m16126h6 = c9207x.m16126h(i4);
            int i7 = i6 - 2;
            if ((m16126h6 & 128) != 0) {
                iArr = m1633c;
            } else if ((m16126h6 & 64) != 0) {
                iArr = m1632d;
            } else {
                iArr = m1631e;
            }
            if ((m16126h6 & 1) != 0) {
                m16126h3 = c9207x.m16126h(i4);
                i3 = c9207x.m16126h(i4);
                m16126h = c9207x.m16126h(i4);
                m16126h2 = c9207x.m16126h(i4);
                i2 = i7 - 4;
            } else {
                int m16126h7 = c9207x.m16126h(4) << 4;
                m16126h = c9207x.m16126h(4) << 4;
                i2 = i7 - 2;
                m16126h2 = c9207x.m16126h(i5) << 6;
                m16126h3 = c9207x.m16126h(6) << i5;
                i3 = m16126h7;
            }
            if (m16126h3 == 0) {
                m16126h2 = 255;
                i3 = 0;
                m16126h = 0;
            }
            double d = m16126h3;
            double d2 = i3 - 128;
            double d3 = m16126h - 128;
            iArr[m16126h5] = m1630f((byte) (255 - (m16126h2 & 255)), C9191p0.m16227r((int) (d + (1.402d * d2)), 0, 255), C9191p0.m16227r((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), C9191p0.m16227r((int) (d + (d3 * 1.772d)), 0, 255));
            i6 = i2;
            m16126h4 = m16126h4;
            i4 = 8;
            i5 = 2;
        }
        return new C13726a(m16126h4, m1633c, m1632d, m1631e);
    }

    /* renamed from: m */
    private static C13727b m1623m(C9207x c9207x) {
        int i;
        int i2;
        int i3;
        int i4;
        c9207x.m16116r(4);
        boolean m16127g = c9207x.m16127g();
        c9207x.m16116r(3);
        int m16126h = c9207x.m16126h(16);
        int m16126h2 = c9207x.m16126h(16);
        if (m16127g) {
            int m16126h3 = c9207x.m16126h(16);
            int m16126h4 = c9207x.m16126h(16);
            int m16126h5 = c9207x.m16126h(16);
            i4 = c9207x.m16126h(16);
            i3 = m16126h4;
            i2 = m16126h5;
            i = m16126h3;
        } else {
            i = 0;
            i2 = 0;
            i3 = m16126h;
            i4 = m16126h2;
        }
        return new C13727b(m16126h, m16126h2, i, i3, i2, i4);
    }

    /* renamed from: n */
    private static C13728c m1622n(C9207x c9207x) {
        byte[] bArr;
        int m16126h = c9207x.m16126h(16);
        c9207x.m16116r(4);
        int m16126h2 = c9207x.m16126h(2);
        boolean m16127g = c9207x.m16127g();
        c9207x.m16116r(1);
        byte[] bArr2 = C9191p0.f24176f;
        if (m16126h2 == 1) {
            c9207x.m16116r(c9207x.m16126h(8) * 16);
        } else if (m16126h2 == 0) {
            int m16126h3 = c9207x.m16126h(16);
            int m16126h4 = c9207x.m16126h(16);
            if (m16126h3 > 0) {
                bArr2 = new byte[m16126h3];
                c9207x.m16123k(bArr2, 0, m16126h3);
            }
            if (m16126h4 > 0) {
                bArr = new byte[m16126h4];
                c9207x.m16123k(bArr, 0, m16126h4);
                return new C13728c(m16126h, m16127g, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C13728c(m16126h, m16127g, bArr2, bArr);
    }

    /* renamed from: o */
    private static C13729d m1621o(C9207x c9207x, int i) {
        int m16126h = c9207x.m16126h(8);
        int m16126h2 = c9207x.m16126h(4);
        int m16126h3 = c9207x.m16126h(2);
        c9207x.m16116r(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int m16126h4 = c9207x.m16126h(8);
            c9207x.m16116r(8);
            i2 -= 6;
            sparseArray.put(m16126h4, new C13730e(c9207x.m16126h(16), c9207x.m16126h(16)));
        }
        return new C13729d(m16126h, m16126h2, m16126h3, sparseArray);
    }

    /* renamed from: p */
    private static C13731f m1620p(C9207x c9207x, int i) {
        int m16126h;
        int m16126h2;
        int m16126h3 = c9207x.m16126h(8);
        c9207x.m16116r(4);
        boolean m16127g = c9207x.m16127g();
        c9207x.m16116r(3);
        int i2 = 16;
        int m16126h4 = c9207x.m16126h(16);
        int m16126h5 = c9207x.m16126h(16);
        int m16126h6 = c9207x.m16126h(3);
        int m16126h7 = c9207x.m16126h(3);
        int i3 = 2;
        c9207x.m16116r(2);
        int m16126h8 = c9207x.m16126h(8);
        int m16126h9 = c9207x.m16126h(8);
        int m16126h10 = c9207x.m16126h(4);
        int m16126h11 = c9207x.m16126h(2);
        c9207x.m16116r(2);
        int i4 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i4 > 0) {
            int m16126h12 = c9207x.m16126h(i2);
            int m16126h13 = c9207x.m16126h(i3);
            int m16126h14 = c9207x.m16126h(i3);
            int m16126h15 = c9207x.m16126h(12);
            int i5 = m16126h11;
            c9207x.m16116r(4);
            int m16126h16 = c9207x.m16126h(12);
            i4 -= 6;
            if (m16126h13 != 1 && m16126h13 != 2) {
                m16126h = 0;
                m16126h2 = 0;
            } else {
                i4 -= 2;
                m16126h = c9207x.m16126h(8);
                m16126h2 = c9207x.m16126h(8);
            }
            sparseArray.put(m16126h12, new C13732g(m16126h13, m16126h14, m16126h15, m16126h16, m16126h, m16126h2));
            m16126h11 = i5;
            i3 = 2;
            i2 = 16;
        }
        return new C13731f(m16126h3, m16127g, m16126h4, m16126h5, m16126h6, m16126h7, m16126h8, m16126h9, m16126h10, m16126h11, sparseArray);
    }

    /* renamed from: q */
    private static void m1619q(C9207x c9207x, C13733h c13733h) {
        C13731f c13731f;
        int m16126h = c9207x.m16126h(8);
        int m16126h2 = c9207x.m16126h(16);
        int m16126h3 = c9207x.m16126h(16);
        int m16130d = c9207x.m16130d() + m16126h3;
        if (m16126h3 * 8 > c9207x.m16132b()) {
            C9197r.m16178h("DvbParser", "Data field length exceeds limit");
            c9207x.m16116r(c9207x.m16132b());
            return;
        }
        switch (m16126h) {
            case 16:
                if (m16126h2 == c13733h.f35441a) {
                    C13729d c13729d = c13733h.f35449i;
                    C13729d m1621o = m1621o(c9207x, m16126h3);
                    if (m1621o.f35420c != 0) {
                        c13733h.f35449i = m1621o;
                        c13733h.f35443c.clear();
                        c13733h.f35444d.clear();
                        c13733h.f35445e.clear();
                        break;
                    } else if (c13729d != null && c13729d.f35419b != m1621o.f35419b) {
                        c13733h.f35449i = m1621o;
                        break;
                    }
                }
                break;
            case 17:
                C13729d c13729d2 = c13733h.f35449i;
                if (m16126h2 == c13733h.f35441a && c13729d2 != null) {
                    C13731f m1620p = m1620p(c9207x, m16126h3);
                    if (c13729d2.f35420c == 0 && (c13731f = c13733h.f35443c.get(m1620p.f35424a)) != null) {
                        m1620p.m1617a(c13731f);
                    }
                    c13733h.f35443c.put(m1620p.f35424a, m1620p);
                    break;
                }
                break;
            case 18:
                if (m16126h2 == c13733h.f35441a) {
                    C13726a m1624l = m1624l(c9207x, m16126h3);
                    c13733h.f35444d.put(m1624l.f35404a, m1624l);
                    break;
                } else if (m16126h2 == c13733h.f35442b) {
                    C13726a m1624l2 = m1624l(c9207x, m16126h3);
                    c13733h.f35446f.put(m1624l2.f35404a, m1624l2);
                    break;
                }
                break;
            case 19:
                if (m16126h2 == c13733h.f35441a) {
                    C13728c m1622n = m1622n(c9207x);
                    c13733h.f35445e.put(m1622n.f35414a, m1622n);
                    break;
                } else if (m16126h2 == c13733h.f35442b) {
                    C13728c m1622n2 = m1622n(c9207x);
                    c13733h.f35447g.put(m1622n2.f35414a, m1622n2);
                    break;
                }
                break;
            case 20:
                if (m16126h2 == c13733h.f35441a) {
                    c13733h.f35448h = m1623m(c9207x);
                    break;
                }
                break;
        }
        c9207x.m16115s(m16130d - c9207x.m16130d());
    }

    /* renamed from: b */
    public List<C13127b> m1634b(byte[] bArr, int i) {
        int i2;
        C13728c c13728c;
        int i3;
        SparseArray<C13732g> sparseArray;
        Paint paint;
        C9207x c9207x = new C9207x(bArr, i);
        while (c9207x.m16132b() >= 48 && c9207x.m16126h(8) == 15) {
            m1619q(c9207x, this.f35402f);
        }
        C13733h c13733h = this.f35402f;
        C13729d c13729d = c13733h.f35449i;
        if (c13729d == null) {
            return Collections.emptyList();
        }
        C13727b c13727b = c13733h.f35448h;
        if (c13727b == null) {
            c13727b = this.f35400d;
        }
        Bitmap bitmap = this.f35403g;
        if (bitmap == null || c13727b.f35408a + 1 != bitmap.getWidth() || c13727b.f35409b + 1 != this.f35403g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(c13727b.f35408a + 1, c13727b.f35409b + 1, Bitmap.Config.ARGB_8888);
            this.f35403g = createBitmap;
            this.f35399c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C13730e> sparseArray2 = c13729d.f35421d;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            this.f35399c.save();
            C13730e valueAt = sparseArray2.valueAt(i4);
            C13731f c13731f = this.f35402f.f35443c.get(sparseArray2.keyAt(i4));
            int i5 = valueAt.f35422a + c13727b.f35410c;
            int i6 = valueAt.f35423b + c13727b.f35412e;
            this.f35399c.clipRect(i5, i6, Math.min(c13731f.f35426c + i5, c13727b.f35411d), Math.min(c13731f.f35427d + i6, c13727b.f35413f));
            C13726a c13726a = this.f35402f.f35444d.get(c13731f.f35430g);
            if (c13726a == null && (c13726a = this.f35402f.f35446f.get(c13731f.f35430g)) == null) {
                c13726a = this.f35401e;
            }
            SparseArray<C13732g> sparseArray3 = c13731f.f35434k;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i7);
                C13732g valueAt2 = sparseArray3.valueAt(i7);
                C13728c c13728c2 = this.f35402f.f35445e.get(keyAt);
                if (c13728c2 == null) {
                    c13728c = this.f35402f.f35447g.get(keyAt);
                } else {
                    c13728c = c13728c2;
                }
                if (c13728c != null) {
                    if (c13728c.f35415b) {
                        paint = null;
                    } else {
                        paint = this.f35397a;
                    }
                    i3 = i7;
                    sparseArray = sparseArray3;
                    m1625k(c13728c, c13726a, c13731f.f35429f, valueAt2.f35437c + i5, i6 + valueAt2.f35438d, paint, this.f35399c);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (c13731f.f35425b) {
                int i8 = c13731f.f35429f;
                if (i8 == 3) {
                    i2 = c13726a.f35407d[c13731f.f35431h];
                } else if (i8 == 2) {
                    i2 = c13726a.f35406c[c13731f.f35432i];
                } else {
                    i2 = c13726a.f35405b[c13731f.f35433j];
                }
                this.f35398b.setColor(i2);
                this.f35399c.drawRect(i5, i6, c13731f.f35426c + i5, c13731f.f35427d + i6, this.f35398b);
            }
            arrayList.add(new C13127b.C13129b().m3150f(Bitmap.createBitmap(this.f35403g, i5, i6, c13731f.f35426c, c13731f.f35427d)).m3146j(i5 / c13727b.f35408a).m3145k(0).m3148h(i6 / c13727b.f35409b, 0).m3147i(0).m3143m(c13731f.f35426c / c13727b.f35408a).m3149g(c13731f.f35427d / c13727b.f35409b).m3155a());
            this.f35399c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f35399c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: r */
    public void m1618r() {
        this.f35402f.m1616a();
    }
}

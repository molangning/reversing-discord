package p193k6;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.media.utils.DiscordVideoMediaSource;
import com.google.android.exoplayer2.Format;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p195k8.C9207x;
import p259o6.C11028l;

/* renamed from: k6.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9095h0 {

    /* renamed from: a */
    private static final int[] f23892a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f23893b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f23894c = {64, 112, 128, 192, 224, 256, 384, 448, 512, DiscordVideoMediaSource.DEFAULT_WIDTH, 768, 896, 1024, 1152, 1280, 1536, 1920, RecyclerView.ItemAnimator.FLAG_MOVED, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 6144, 7680};

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m16679a(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4a
            r2 = -1
            if (r1 == r2) goto L32
            r2 = 31
            if (r1 == r2) goto L21
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L58
        L21:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
            goto L42
        L32:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
        L42:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5d
        L4a:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L58:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L5d:
            if (r0 == 0) goto L63
            int r7 = r7 * 16
            int r7 = r7 / 14
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p193k6.C9095h0.m16679a(byte[]):int");
    }

    /* renamed from: b */
    private static C9207x m16678b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C9207x(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (m16677c(copyOf)) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b;
            }
        }
        C9207x c9207x = new C9207x(copyOf);
        if (copyOf[0] == 31) {
            C9207x c9207x2 = new C9207x(copyOf);
            while (c9207x2.m16132b() >= 16) {
                c9207x2.m16116r(2);
                c9207x.m16128f(c9207x2.m16126h(14), 14);
            }
        }
        c9207x.m16120n(copyOf);
        return c9207x;
    }

    /* renamed from: c */
    private static boolean m16677c(byte[] bArr) {
        byte b = bArr[0];
        return b == -2 || b == -1;
    }

    /* renamed from: d */
    public static boolean m16676d(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    /* renamed from: e */
    public static int m16675e(ByteBuffer byteBuffer) {
        int i;
        byte b;
        int i2;
        byte b2;
        int position = byteBuffer.position();
        byte b3 = byteBuffer.get(position);
        if (b3 != -2) {
            if (b3 != -1) {
                if (b3 != 31) {
                    i = (byteBuffer.get(position + 4) & 1) << 6;
                    b = byteBuffer.get(position + 5);
                } else {
                    i = (byteBuffer.get(position + 5) & 7) << 4;
                    b2 = byteBuffer.get(position + 6);
                }
            } else {
                i = (byteBuffer.get(position + 4) & 7) << 4;
                b2 = byteBuffer.get(position + 7);
            }
            i2 = b2 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(position + 5) & 1) << 6;
        b = byteBuffer.get(position + 4);
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    /* renamed from: f */
    public static int m16674f(byte[] bArr) {
        int i;
        byte b;
        int i2;
        byte b2;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 != -1) {
                if (b3 != 31) {
                    i = (bArr[4] & 1) << 6;
                    b = bArr[5];
                } else {
                    i = (bArr[5] & 7) << 4;
                    b2 = bArr[6];
                }
            } else {
                i = (bArr[4] & 7) << 4;
                b2 = bArr[7];
            }
            i2 = b2 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b = bArr[4];
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    /* renamed from: g */
    public static Format m16673g(byte[] bArr, String str, String str2, C11028l c11028l) {
        int i;
        int i2;
        C9207x m16678b = m16678b(bArr);
        m16678b.m16116r(60);
        int i3 = f23892a[m16678b.m16126h(6)];
        int i4 = f23893b[m16678b.m16126h(4)];
        int m16126h = m16678b.m16126h(5);
        int[] iArr = f23894c;
        if (m16126h >= iArr.length) {
            i = -1;
        } else {
            i = (iArr[m16126h] * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) / 2;
        }
        m16678b.m16116r(10);
        if (m16678b.m16126h(2) > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        return new Format.C4362b().m29900S(str).m29883e0("audio/vnd.dts").m29912G(i).m29911H(i3 + i2).m29881f0(i4).m29907L(c11028l).m29897V(str2).m29914E();
    }
}

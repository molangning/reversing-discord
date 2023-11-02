package p193k6;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.media.utils.DiscordVideoMediaSource;
import com.facebook.react.views.text.TypefaceStyle;
import com.google.android.exoplayer2.Format;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.nio.ByteBuffer;
import p195k8.C9207x;
import p195k8.C9208y;
import p259o6.C11028l;

/* renamed from: k6.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9070c {

    /* renamed from: a */
    private static final int[] f23793a = {2002, 2000, 1920, 1601, 1600, RNCWebViewManager.COMMAND_CLEAR_CACHE, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 960, 800, 800, DiscordVideoMediaSource.DEFAULT_HEIGHT, TypefaceStyle.NORMAL, TypefaceStyle.NORMAL, RecyclerView.ItemAnimator.FLAG_MOVED};

    /* renamed from: k6.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9072b {

        /* renamed from: a */
        public final int f23794a;

        /* renamed from: b */
        public final int f23795b;

        /* renamed from: c */
        public final int f23796c;

        /* renamed from: d */
        public final int f23797d;

        /* renamed from: e */
        public final int f23798e;

        private C9072b(int i, int i2, int i3, int i4, int i5) {
            this.f23794a = i;
            this.f23796c = i2;
            this.f23795b = i3;
            this.f23797d = i4;
            this.f23798e = i5;
        }
    }

    /* renamed from: a */
    public static void m16769a(int i, C9208y c9208y) {
        c9208y.m16103L(7);
        byte[] m16094d = c9208y.m16094d();
        m16094d[0] = -84;
        m16094d[1] = 64;
        m16094d[2] = -1;
        m16094d[3] = -1;
        m16094d[4] = (byte) ((i >> 16) & 255);
        m16094d[5] = (byte) ((i >> 8) & 255);
        m16094d[6] = (byte) (i & 255);
    }

    /* renamed from: b */
    public static Format m16768b(C9208y c9208y, String str, String str2, C11028l c11028l) {
        int i;
        c9208y.m16098Q(1);
        if (((c9208y.m16111D() & 32) >> 5) == 1) {
            i = 48000;
        } else {
            i = 44100;
        }
        return new Format.C4362b().m29900S(str).m29883e0("audio/ac4").m29911H(2).m29881f0(i).m29907L(c11028l).m29897V(str2).m29914E();
    }

    /* renamed from: c */
    public static int m16767c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return m16766d(new C9207x(bArr)).f23798e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0080, code lost:
        if (r11 != 11) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0085, code lost:
        if (r11 != 11) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x008a, code lost:
        if (r11 != 8) goto L39;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p193k6.C9070c.C9072b m16766d(p195k8.C9207x r11) {
        /*
            r0 = 16
            int r1 = r11.m16126h(r0)
            int r0 = r11.m16126h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.m16126h(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.m16126h(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = m16764f(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.m16126h(r1)
            boolean r4 = r11.m16127g()
            if (r4 == 0) goto L45
            int r4 = r11.m16126h(r2)
            if (r4 <= 0) goto L45
            r11.m16116r(r0)
        L45:
            boolean r4 = r11.m16127g()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            if (r4 == 0) goto L53
            r9 = r6
            goto L54
        L53:
            r9 = r7
        L54:
            int r11 = r11.m16126h(r3)
            if (r9 != r7) goto L63
            r4 = 13
            if (r11 != r4) goto L63
            int[] r0 = p193k6.C9070c.f23793a
            r11 = r0[r11]
            goto L93
        L63:
            if (r9 != r6) goto L92
            int[] r4 = p193k6.C9070c.f23793a
            int r6 = r4.length
            if (r11 >= r6) goto L92
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r7 = 1
            if (r1 == r7) goto L88
            r7 = 11
            if (r1 == r0) goto L83
            if (r1 == r2) goto L88
            if (r1 == r3) goto L7c
            goto L8d
        L7c:
            if (r11 == r2) goto L8f
            if (r11 == r6) goto L8f
            if (r11 != r7) goto L8d
            goto L8f
        L83:
            if (r11 == r6) goto L8f
            if (r11 != r7) goto L8d
            goto L8f
        L88:
            if (r11 == r2) goto L8f
            if (r11 != r6) goto L8d
            goto L8f
        L8d:
            r11 = r4
            goto L93
        L8f:
            int r4 = r4 + 1
            goto L8d
        L92:
            r11 = 0
        L93:
            k6.c$b r0 = new k6.c$b
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p193k6.C9070c.m16766d(k8.x):k6.c$b");
    }

    /* renamed from: e */
    public static int m16765e(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    /* renamed from: f */
    private static int m16764f(C9207x c9207x, int i) {
        int i2 = 0;
        while (true) {
            int m16126h = i2 + c9207x.m16126h(i);
            if (!c9207x.m16127g()) {
                return m16126h;
            }
            i2 = (m16126h + 1) << i;
        }
    }
}
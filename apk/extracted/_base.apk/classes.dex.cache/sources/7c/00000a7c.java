package p040c7;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9200u;

/* renamed from: c7.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2428m {

    /* renamed from: a */
    public final String f6634a;

    /* renamed from: b */
    public final String f6635b;

    /* renamed from: c */
    public final String f6636c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f6637d;

    /* renamed from: e */
    public final boolean f6638e;

    /* renamed from: f */
    public final boolean f6639f;

    /* renamed from: g */
    public final boolean f6640g;

    /* renamed from: h */
    public final boolean f6641h;

    /* renamed from: i */
    public final boolean f6642i;

    /* renamed from: j */
    public final boolean f6643j;

    /* renamed from: k */
    private final boolean f6644k;

    C2428m(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f6634a = (String) C9149a.m16448e(str);
        this.f6635b = str2;
        this.f6636c = str3;
        this.f6637d = codecCapabilities;
        this.f6641h = z;
        this.f6642i = z2;
        this.f6643j = z3;
        this.f6638e = z4;
        this.f6639f = z5;
        this.f6640g = z6;
        this.f6644k = C9200u.m16151s(str2);
    }

    /* renamed from: A */
    public static C2428m m33430A(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8;
        if (!z4 && codecCapabilities != null && m33422h(codecCapabilities) && !m33405y(str)) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (codecCapabilities != null && m33412r(codecCapabilities)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z5 && (codecCapabilities == null || !m33414p(codecCapabilities))) {
            z8 = false;
        } else {
            z8 = true;
        }
        return new C2428m(str, str2, str3, codecCapabilities, z, z2, z3, z6, z7, z8);
    }

    /* renamed from: a */
    private static int m33429a(String str, String str2, int i) {
        int i2;
        if (i <= 1 && ((C9191p0.f24171a < 26 || i <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            if ("audio/ac3".equals(str2)) {
                i2 = 6;
            } else if ("audio/eac3".equals(str2)) {
                i2 = 16;
            } else {
                i2 = 30;
            }
            C9197r.m16178h("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
            return i2;
        }
        return i;
    }

    /* renamed from: c */
    private static Point m33427c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(C9191p0.m16239l(i, widthAlignment) * widthAlignment, C9191p0.m16239l(i2, heightAlignment) * heightAlignment);
    }

    /* renamed from: d */
    private static boolean m33426d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point m33427c = m33427c(videoCapabilities, i, i2);
        int i3 = m33427c.x;
        int i4 = m33427c.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }

    /* renamed from: f */
    private static MediaCodecInfo.CodecProfileLevel[] m33424f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i;
        int i2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
            i = videoCapabilities.getBitrateRange().getUpper().intValue();
        } else {
            i = 0;
        }
        if (i >= 180000000) {
            i2 = 1024;
        } else if (i >= 120000000) {
            i2 = 512;
        } else if (i >= 60000000) {
            i2 = 256;
        } else if (i >= 30000000) {
            i2 = 128;
        } else if (i >= 18000000) {
            i2 = 64;
        } else if (i >= 12000000) {
            i2 = 32;
        } else if (i >= 7200000) {
            i2 = 16;
        } else if (i >= 3600000) {
            i2 = 8;
        } else if (i >= 1800000) {
            i2 = 4;
        } else if (i >= 800000) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i2;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    /* renamed from: h */
    private static boolean m33422h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C9191p0.f24171a >= 19 && m33421i(codecCapabilities);
    }

    /* renamed from: i */
    private static boolean m33421i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: p */
    private static boolean m33414p(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C9191p0.f24171a >= 21 && m33413q(codecCapabilities);
    }

    /* renamed from: q */
    private static boolean m33413q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: r */
    private static boolean m33412r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C9191p0.f24171a >= 21 && m33411s(codecCapabilities);
    }

    /* renamed from: s */
    private static boolean m33411s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: u */
    private void m33409u(String str) {
        C9197r.m16184b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f6634a + ", " + this.f6635b + "] [" + C9191p0.f24175e + "]");
    }

    /* renamed from: v */
    private void m33408v(String str) {
        C9197r.m16184b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f6634a + ", " + this.f6635b + "] [" + C9191p0.f24175e + "]");
    }

    /* renamed from: w */
    private static boolean m33407w(String str) {
        return "audio/opus".equals(str);
    }

    /* renamed from: x */
    private static boolean m33406x(String str) {
        return C9191p0.f24174d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* renamed from: y */
    private static boolean m33405y(String str) {
        if (C9191p0.f24171a <= 22) {
            String str2 = C9191p0.f24174d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    private static final boolean m33404z(String str) {
        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(C9191p0.f24172b)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public Point m33428b(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6637d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m33427c(videoCapabilities, i, i2);
    }

    /* renamed from: e */
    public DecoderReuseEvaluation m33425e(Format format, Format format2) {
        int i;
        int i2;
        if (!C9191p0.m16257c(format.f11197u, format2.f11197u)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.f6644k) {
            if (format.f11173C != format2.f11173C) {
                i |= 1024;
            }
            if (!this.f6638e && (format.f11202z != format2.f11202z || format.f11171A != format2.f11171A)) {
                i |= 512;
            }
            if (!C9191p0.m16257c(format.f11177G, format2.f11177G)) {
                i |= RecyclerView.ItemAnimator.FLAG_MOVED;
            }
            if (m33406x(this.f6634a) && !format.m29922h(format2)) {
                i |= 2;
            }
            if (i == 0) {
                String str = this.f6634a;
                if (format.m29922h(format2)) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                return new DecoderReuseEvaluation(str, format, format2, i2, 0);
            }
        } else {
            if (format.f11178H != format2.f11178H) {
                i |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
            if (format.f11179I != format2.f11179I) {
                i |= 8192;
            }
            if (format.f11180J != format2.f11180J) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f6635b)) {
                Pair<Integer, Integer> m33305p = C2440x.m33305p(format);
                Pair<Integer, Integer> m33305p2 = C2440x.m33305p(format2);
                if (m33305p != null && m33305p2 != null) {
                    int intValue = ((Integer) m33305p.first).intValue();
                    int intValue2 = ((Integer) m33305p2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new DecoderReuseEvaluation(this.f6634a, format, format2, 3, 0);
                    }
                }
            }
            if (!format.m29922h(format2)) {
                i |= 32;
            }
            if (m33407w(this.f6635b)) {
                i |= 2;
            }
            if (i == 0) {
                return new DecoderReuseEvaluation(this.f6634a, format, format2, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.f6634a, format, format2, 0, i);
    }

    /* renamed from: g */
    public MediaCodecInfo.CodecProfileLevel[] m33423g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6637d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    /* renamed from: j */
    public boolean m33420j(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6637d;
        if (codecCapabilities == null) {
            m33408v("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m33408v("channelCount.aCaps");
            return false;
        } else if (m33429a(this.f6634a, this.f6635b, audioCapabilities.getMaxInputChannelCount()) < i) {
            m33408v("channelCount.support, " + i);
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: k */
    public boolean m33419k(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6637d;
        if (codecCapabilities == null) {
            m33408v("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m33408v("sampleRate.aCaps");
            return false;
        } else if (!audioCapabilities.isSampleRateSupported(i)) {
            m33408v("sampleRate.support, " + i);
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: l */
    public boolean m33418l(Format format) {
        String m16163g;
        String str = format.f11194r;
        if (str == null || this.f6635b == null || (m16163g = C9200u.m16163g(str)) == null) {
            return true;
        }
        if (!this.f6635b.equals(m16163g)) {
            m33408v("codec.mime " + format.f11194r + ", " + m16163g);
            return false;
        }
        Pair<Integer, Integer> m33305p = C2440x.m33305p(format);
        if (m33305p == null) {
            return true;
        }
        int intValue = ((Integer) m33305p.first).intValue();
        int intValue2 = ((Integer) m33305p.second).intValue();
        if (!this.f6644k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] m33423g = m33423g();
        if (C9191p0.f24171a <= 23 && "video/x-vnd.on2.vp9".equals(this.f6635b) && m33423g.length == 0) {
            m33423g = m33424f(this.f6637d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m33423g) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                return true;
            }
        }
        m33408v("codec.profileLevel, " + format.f11194r + ", " + m16163g);
        return false;
    }

    /* renamed from: m */
    public boolean m33417m(Format format) {
        int i;
        boolean z = false;
        if (!m33418l(format)) {
            return false;
        }
        if (this.f6644k) {
            int i2 = format.f11202z;
            if (i2 <= 0 || (i = format.f11171A) <= 0) {
                return true;
            }
            if (C9191p0.f24171a >= 21) {
                return m33410t(i2, i, format.f11172B);
            }
            if (i2 * i <= C2440x.m33325M()) {
                z = true;
            }
            if (!z) {
                m33408v("legacyFrameSize, " + format.f11202z + "x" + format.f11171A);
            }
            return z;
        }
        if (C9191p0.f24171a >= 21) {
            int i3 = format.f11179I;
            if (i3 != -1 && !m33419k(i3)) {
                return false;
            }
            int i4 = format.f11178H;
            if (i4 != -1 && !m33420j(i4)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public boolean m33416n() {
        if (C9191p0.f24171a >= 29 && "video/x-vnd.on2.vp9".equals(this.f6635b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m33423g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: o */
    public boolean m33415o(Format format) {
        if (this.f6644k) {
            return this.f6638e;
        }
        Pair<Integer, Integer> m33305p = C2440x.m33305p(format);
        if (m33305p != null && ((Integer) m33305p.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean m33410t(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6637d;
        if (codecCapabilities == null) {
            m33408v("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m33408v("sizeAndRate.vCaps");
            return false;
        } else if (!m33426d(videoCapabilities, i, i2, d)) {
            if (i < i2 && m33404z(this.f6634a) && m33426d(videoCapabilities, i2, i, d)) {
                m33409u("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
                return true;
            }
            m33408v("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        return this.f6634a;
    }
}
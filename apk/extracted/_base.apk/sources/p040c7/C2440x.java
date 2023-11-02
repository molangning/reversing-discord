package p040c7;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.nearby.NearbyManager;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p040c7.C2440x;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9200u;
import p213l8.C10064b;

@SuppressLint({"InlinedApi"})
/* renamed from: c7.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2440x {

    /* renamed from: a */
    private static final Pattern f6727a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    private static final HashMap<C2442b, List<C2428m>> f6728b = new HashMap<>();

    /* renamed from: c */
    private static int f6729c = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c7.x$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2442b {

        /* renamed from: a */
        public final String f6730a;

        /* renamed from: b */
        public final boolean f6731b;

        /* renamed from: c */
        public final boolean f6732c;

        public C2442b(String str, boolean z, boolean z2) {
            this.f6730a = str;
            this.f6731b = z;
            this.f6732c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C2442b.class) {
                return false;
            }
            C2442b c2442b = (C2442b) obj;
            if (TextUtils.equals(this.f6730a, c2442b.f6730a) && this.f6731b == c2442b.f6731b && this.f6732c == c2442b.f6732c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = (this.f6730a.hashCode() + 31) * 31;
            int i2 = 1231;
            if (this.f6731b) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i3 = (hashCode + i) * 31;
            if (!this.f6732c) {
                i2 = 1237;
            }
            return i3 + i2;
        }
    }

    /* renamed from: c7.x$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C2443c extends Exception {
        private C2443c(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c7.x$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC2444d {
        /* renamed from: a */
        MediaCodecInfo mo33294a(int i);

        /* renamed from: b */
        boolean mo33293b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: c */
        boolean mo33292c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: d */
        int mo33291d();

        /* renamed from: e */
        boolean mo33290e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c7.x$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2445e implements InterfaceC2444d {
        private C2445e() {
        }

        @Override // p040c7.C2440x.InterfaceC2444d
        /* renamed from: a */
        public MediaCodecInfo mo33294a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // p040c7.C2440x.InterfaceC2444d
        /* renamed from: b */
        public boolean mo33293b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
                return true;
            }
            return false;
        }

        @Override // p040c7.C2440x.InterfaceC2444d
        /* renamed from: c */
        public boolean mo33292c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // p040c7.C2440x.InterfaceC2444d
        /* renamed from: d */
        public int mo33291d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // p040c7.C2440x.InterfaceC2444d
        /* renamed from: e */
        public boolean mo33290e() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c7.x$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2446f implements InterfaceC2444d {

        /* renamed from: a */
        private final int f6733a;

        /* renamed from: b */
        private MediaCodecInfo[] f6734b;

        public C2446f(boolean z, boolean z2) {
            int i;
            if (!z && !z2) {
                i = 0;
            } else {
                i = 1;
            }
            this.f6733a = i;
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        /* renamed from: f */
        private void m33289f() {
            if (this.f6734b == null) {
                this.f6734b = new MediaCodecList(this.f6733a).getCodecInfos();
            }
        }

        @Override // p040c7.C2440x.InterfaceC2444d
        /* renamed from: a */
        public MediaCodecInfo mo33294a(int i) {
            m33289f();
            return this.f6734b[i];
        }

        @Override // p040c7.C2440x.InterfaceC2444d
        /* renamed from: b */
        public boolean mo33293b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // p040c7.C2440x.InterfaceC2444d
        /* renamed from: c */
        public boolean mo33292c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // p040c7.C2440x.InterfaceC2444d
        /* renamed from: d */
        public int mo33291d() {
            m33289f();
            return this.f6734b.length;
        }

        @Override // p040c7.C2440x.InterfaceC2444d
        /* renamed from: e */
        public boolean mo33290e() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c7.x$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC2447g<T> {
        /* renamed from: a */
        int mo33288a(T t);
    }

    /* renamed from: A */
    private static boolean m33337A(MediaCodecInfo mediaCodecInfo) {
        boolean isAlias;
        isAlias = mediaCodecInfo.isAlias();
        return isAlias;
    }

    /* renamed from: B */
    private static boolean m33336B(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = C9191p0.f24171a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = C9191p0.f24172b;
            if ("a70".equals(str3) || ("Xiaomi".equals(C9191p0.f24173c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = C9191p0.f24172b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = C9191p0.f24172b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(C9191p0.f24173c))) {
            String str6 = C9191p0.f24172b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(C9191p0.f24173c)) {
            String str7 = C9191p0.f24172b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && C9191p0.f24172b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    private static boolean m33335C(MediaCodecInfo mediaCodecInfo) {
        if (C9191p0.f24171a >= 29) {
            return m33334D(mediaCodecInfo);
        }
        return !m33333E(mediaCodecInfo);
    }

    /* renamed from: D */
    private static boolean m33334D(MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
        return isHardwareAccelerated;
    }

    /* renamed from: E */
    private static boolean m33333E(MediaCodecInfo mediaCodecInfo) {
        if (C9191p0.f24171a >= 29) {
            return m33332F(mediaCodecInfo);
        }
        String m16272U0 = C9191p0.m16272U0(mediaCodecInfo.getName());
        if (m16272U0.startsWith("arc.")) {
            return false;
        }
        if (!m16272U0.startsWith("omx.google.") && !m16272U0.startsWith("omx.ffmpeg.") && ((!m16272U0.startsWith("omx.sec.") || !m16272U0.contains(".sw.")) && !m16272U0.equals("omx.qcom.video.decoder.hevcswvdec") && !m16272U0.startsWith("c2.android.") && !m16272U0.startsWith("c2.google.") && (m16272U0.startsWith("omx.") || m16272U0.startsWith("c2.")))) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    private static boolean m33332F(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }

    /* renamed from: G */
    private static boolean m33331G(MediaCodecInfo mediaCodecInfo) {
        if (C9191p0.f24171a >= 29) {
            return m33330H(mediaCodecInfo);
        }
        String m16272U0 = C9191p0.m16272U0(mediaCodecInfo.getName());
        if (!m16272U0.startsWith("omx.google.") && !m16272U0.startsWith("c2.android.") && !m16272U0.startsWith("c2.google.")) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    private static boolean m33330H(MediaCodecInfo mediaCodecInfo) {
        boolean isVendor;
        isVendor = mediaCodecInfo.isVendor();
        return isVendor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static /* synthetic */ int m33329I(C2428m c2428m) {
        String str = c2428m.f6634a;
        if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
            if (C9191p0.f24171a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                return -1;
            }
            return 0;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static /* synthetic */ int m33328J(C2428m c2428m) {
        return c2428m.f6634a.startsWith("OMX.google") ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static /* synthetic */ int m33327K(Format format, C2428m c2428m) {
        try {
            return c2428m.m33417m(format) ? 1 : 0;
        } catch (C2443c unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static /* synthetic */ int m33326L(InterfaceC2447g interfaceC2447g, Object obj, Object obj2) {
        return interfaceC2447g.mo33288a(obj2) - interfaceC2447g.mo33288a(obj);
    }

    /* renamed from: M */
    public static int m33325M() {
        int i;
        if (f6729c == -1) {
            int i2 = 0;
            C2428m m33304q = m33304q("video/avc", false, false);
            if (m33304q != null) {
                MediaCodecInfo.CodecProfileLevel[] m33423g = m33304q.m33423g();
                int length = m33423g.length;
                int i3 = 0;
                while (i2 < length) {
                    i3 = Math.max(m33313h(m33423g[i2].level), i3);
                    i2++;
                }
                if (C9191p0.f24171a >= 21) {
                    i = 345600;
                } else {
                    i = 172800;
                }
                i2 = Math.max(i3, i);
            }
            f6729c = i2;
        }
        return f6729c;
    }

    /* renamed from: N */
    private static int m33324N(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: O */
    private static <T> void m33323O(List<T> list, final InterfaceC2447g<T> interfaceC2447g) {
        Collections.sort(list, new Comparator() { // from class: c7.w
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m33326L;
                m33326L = C2440x.m33326L(C2440x.InterfaceC2447g.this, obj, obj2);
                return m33326L;
            }
        });
    }

    /* renamed from: P */
    private static int m33322P(int i) {
        if (i != 10) {
            if (i != 11) {
                if (i != 20) {
                    if (i != 21) {
                        if (i != 30) {
                            if (i != 31) {
                                if (i != 40) {
                                    if (i != 41) {
                                        if (i != 50) {
                                            if (i != 51) {
                                                switch (i) {
                                                    case 60:
                                                        return RecyclerView.ItemAnimator.FLAG_MOVED;
                                                    case 61:
                                                        return RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                                                    case 62:
                                                        return 8192;
                                                    default:
                                                        return -1;
                                                }
                                            }
                                            return 512;
                                        }
                                        return 256;
                                    }
                                    return 128;
                                }
                                return 64;
                            }
                            return 32;
                        }
                        return 16;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: Q */
    private static int m33321Q(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return i != 3 ? -1 : 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: e */
    private static void m33316e(String str, List<C2428m> list) {
        if ("audio/raw".equals(str)) {
            if (C9191p0.f24171a < 26 && C9191p0.f24172b.equals("R9") && list.size() == 1 && list.get(0).f6634a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(C2428m.m33430A("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            m33323O(list, new InterfaceC2447g() { // from class: c7.t
                @Override // p040c7.C2440x.InterfaceC2447g
                /* renamed from: a */
                public final int mo33288a(Object obj) {
                    int m33329I;
                    m33329I = C2440x.m33329I((C2428m) obj);
                    return m33329I;
                }
            });
        }
        int i = C9191p0.f24171a;
        if (i < 21 && list.size() > 1) {
            String str2 = list.get(0).f6634a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                m33323O(list, new InterfaceC2447g() { // from class: c7.u
                    @Override // p040c7.C2440x.InterfaceC2447g
                    /* renamed from: a */
                    public final int mo33288a(Object obj) {
                        int m33328J;
                        m33328J = C2440x.m33328J((C2428m) obj);
                        return m33328J;
                    }
                });
            }
        }
        if (i < 30 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(list.get(0).f6634a)) {
            list.add(list.remove(0));
        }
    }

    /* renamed from: f */
    private static int m33315f(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return RecyclerView.ItemAnimator.FLAG_MOVED;
            case 12:
                return RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    /* renamed from: g */
    private static int m33314g(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return RecyclerView.ItemAnimator.FLAG_MOVED;
                                    case 41:
                                        return RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: h */
    private static int m33313h(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case RecyclerView.ItemAnimator.FLAG_MOVED /* 2048 */:
            case RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT /* 4096 */:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    /* renamed from: i */
    private static int m33312i(int i) {
        if (i != 66) {
            if (i != 77) {
                if (i != 88) {
                    if (i != 100) {
                        if (i != 110) {
                            if (i != 122) {
                                return i != 244 ? -1 : 64;
                            }
                            return 32;
                        }
                        return 16;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: j */
    private static Integer m33311j(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = '\b';
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c = '\t';
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c = '\n';
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return 256;
            case '\t':
                return 512;
            case '\n':
                return 1024;
            case 11:
                return Integer.valueOf((int) RecyclerView.ItemAnimator.FLAG_MOVED);
            case '\f':
                return Integer.valueOf((int) RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            default:
                return null;
        }
    }

    /* renamed from: k */
    private static Integer m33310k(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = '\b';
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = '\t';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return 256;
            case '\t':
                return 512;
            default:
                return null;
        }
    }

    /* renamed from: l */
    private static Pair<Integer, Integer> m33309l(String str, String[] strArr) {
        int m33324N;
        if (strArr.length != 3) {
            C9197r.m16178h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(C9200u.m16162h(Integer.parseInt(strArr[1], 16))) && (m33324N = m33324N(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(m33324N), 0);
            }
        } catch (NumberFormatException unused) {
            C9197r.m16178h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    /* renamed from: m */
    private static Pair<Integer, Integer> m33308m(String str, String[] strArr, C10064b c10064b) {
        int i;
        if (strArr.length < 4) {
            C9197r.m16178h("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i2 = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                C9197r.m16178h("MediaCodecUtil", "Unknown AV1 profile: " + parseInt);
                return null;
            } else if (parseInt3 != 8 && parseInt3 != 10) {
                C9197r.m16178h("MediaCodecUtil", "Unknown AV1 bit depth: " + parseInt3);
                return null;
            } else {
                if (parseInt3 != 8) {
                    if (c10064b != null && (c10064b.f26168m != null || (i = c10064b.f26167l) == 7 || i == 6)) {
                        i2 = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                    } else {
                        i2 = 2;
                    }
                }
                int m33315f = m33315f(parseInt2);
                if (m33315f == -1) {
                    C9197r.m16178h("MediaCodecUtil", "Unknown AV1 level: " + parseInt2);
                    return null;
                }
                return new Pair<>(Integer.valueOf(i2), Integer.valueOf(m33315f));
            }
        } catch (NumberFormatException unused) {
            C9197r.m16178h("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    /* renamed from: n */
    private static Pair<Integer, Integer> m33307n(String str, String[] strArr) {
        int parseInt;
        int i;
        if (strArr.length < 2) {
            C9197r.m16178h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt2 = Integer.parseInt(strArr[1]);
                parseInt = Integer.parseInt(strArr[2]);
                i = parseInt2;
            } else {
                C9197r.m16178h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int m33312i = m33312i(i);
            if (m33312i == -1) {
                C9197r.m16178h("MediaCodecUtil", "Unknown AVC profile: " + i);
                return null;
            }
            int m33314g = m33314g(parseInt);
            if (m33314g == -1) {
                C9197r.m16178h("MediaCodecUtil", "Unknown AVC level: " + parseInt);
                return null;
            }
            return new Pair<>(Integer.valueOf(m33312i), Integer.valueOf(m33314g));
        } catch (NumberFormatException unused) {
            C9197r.m16178h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    /* renamed from: o */
    private static String m33306o(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
        if (r3.equals("av01") == false) goto L11;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m33305p(com.google.android.exoplayer2.Format r6) {
        /*
            java.lang.String r0 = r6.f11194r
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = "video/dolby-vision"
            java.lang.String r3 = r6.f11197u
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1d
            java.lang.String r6 = r6.f11194r
            android.util.Pair r6 = m33299v(r6, r0)
            return r6
        L1d:
            r2 = 0
            r3 = r0[r2]
            r3.hashCode()
            int r4 = r3.hashCode()
            r5 = -1
            switch(r4) {
                case 3004662: goto L6f;
                case 3006243: goto L64;
                case 3006244: goto L59;
                case 3199032: goto L4e;
                case 3214780: goto L43;
                case 3356560: goto L38;
                case 3624515: goto L2d;
                default: goto L2b;
            }
        L2b:
            r2 = r5
            goto L78
        L2d:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L36
            goto L2b
        L36:
            r2 = 6
            goto L78
        L38:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L41
            goto L2b
        L41:
            r2 = 5
            goto L78
        L43:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L4c
            goto L2b
        L4c:
            r2 = 4
            goto L78
        L4e:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L57
            goto L2b
        L57:
            r2 = 3
            goto L78
        L59:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L62
            goto L2b
        L62:
            r2 = 2
            goto L78
        L64:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L6d
            goto L2b
        L6d:
            r2 = 1
            goto L78
        L6f:
            java.lang.String r4 = "av01"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L78
            goto L2b
        L78:
            switch(r2) {
                case 0: goto L98;
                case 1: goto L91;
                case 2: goto L91;
                case 3: goto L8a;
                case 4: goto L8a;
                case 5: goto L83;
                case 6: goto L7c;
                default: goto L7b;
            }
        L7b:
            return r1
        L7c:
            java.lang.String r6 = r6.f11194r
            android.util.Pair r6 = m33297x(r6, r0)
            return r6
        L83:
            java.lang.String r6 = r6.f11194r
            android.util.Pair r6 = m33309l(r6, r0)
            return r6
        L8a:
            java.lang.String r6 = r6.f11194r
            android.util.Pair r6 = m33298w(r6, r0)
            return r6
        L91:
            java.lang.String r6 = r6.f11194r
            android.util.Pair r6 = m33307n(r6, r0)
            return r6
        L98:
            java.lang.String r1 = r6.f11194r
            l8.b r6 = r6.f11177G
            android.util.Pair r6 = m33308m(r1, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c7.C2440x.m33305p(com.google.android.exoplayer2.Format):android.util.Pair");
    }

    /* renamed from: q */
    public static C2428m m33304q(String str, boolean z, boolean z2) {
        List<C2428m> m33303r = m33303r(str, z, z2);
        if (m33303r.isEmpty()) {
            return null;
        }
        return m33303r.get(0);
    }

    /* renamed from: r */
    public static synchronized List<C2428m> m33303r(String str, boolean z, boolean z2) {
        InterfaceC2444d c2445e;
        synchronized (C2440x.class) {
            C2442b c2442b = new C2442b(str, z, z2);
            HashMap<C2442b, List<C2428m>> hashMap = f6728b;
            List<C2428m> list = hashMap.get(c2442b);
            if (list != null) {
                return list;
            }
            int i = C9191p0.f24171a;
            if (i >= 21) {
                c2445e = new C2446f(z, z2);
            } else {
                c2445e = new C2445e();
            }
            ArrayList<C2428m> m33302s = m33302s(c2442b, c2445e);
            if (z && m33302s.isEmpty() && 21 <= i && i <= 23) {
                m33302s = m33302s(c2442b, new C2445e());
                if (!m33302s.isEmpty()) {
                    C9197r.m16178h("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + m33302s.get(0).f6634a);
                }
            }
            m33316e(str, m33302s);
            List<C2428m> unmodifiableList = Collections.unmodifiableList(m33302s);
            hashMap.put(c2442b, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:28|(4:(2:72|73)|53|(9:56|57|58|59|60|61|62|64|65)|9)|32|33|34|36|9) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r1.f6731b == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
        r1 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101 A[Catch: Exception -> 0x014f, TRY_ENTER, TryCatch #1 {Exception -> 0x014f, blocks: (B:3:0x0008, B:5:0x001b, B:60:0x0120, B:8:0x002d, B:11:0x0038, B:54:0x00f9, B:57:0x0101, B:59:0x0107, B:61:0x012a, B:62:0x014d), top: B:69:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012a A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<p040c7.C2428m> m33302s(p040c7.C2440x.C2442b r24, p040c7.C2440x.InterfaceC2444d r25) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c7.C2440x.m33302s(c7.x$b, c7.x$d):java.util.ArrayList");
    }

    /* renamed from: t */
    public static List<C2428m> m33301t(List<C2428m> list, final Format format) {
        ArrayList arrayList = new ArrayList(list);
        m33323O(arrayList, new InterfaceC2447g() { // from class: c7.v
            @Override // p040c7.C2440x.InterfaceC2447g
            /* renamed from: a */
            public final int mo33288a(Object obj) {
                int m33327K;
                m33327K = C2440x.m33327K(Format.this, (C2428m) obj);
                return m33327K;
            }
        });
        return arrayList;
    }

    /* renamed from: u */
    public static C2428m m33300u() {
        return m33304q("audio/raw", false, false);
    }

    /* renamed from: v */
    private static Pair<Integer, Integer> m33299v(String str, String[] strArr) {
        if (strArr.length < 3) {
            C9197r.m16178h("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f6727a.matcher(strArr[1]);
        if (!matcher.matches()) {
            C9197r.m16178h("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer m33310k = m33310k(group);
        if (m33310k == null) {
            C9197r.m16178h("MediaCodecUtil", "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer m33311j = m33311j(str2);
        if (m33311j == null) {
            C9197r.m16178h("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
            return null;
        }
        return new Pair<>(m33310k, m33311j);
    }

    /* renamed from: w */
    private static Pair<Integer, Integer> m33298w(String str, String[] strArr) {
        if (strArr.length < 4) {
            C9197r.m16178h("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        Matcher matcher = f6727a.matcher(strArr[1]);
        if (!matcher.matches()) {
            C9197r.m16178h("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if (!NearbyManager.PERMISSION_DENIED.equals(group)) {
            if ("2".equals(group)) {
                i = 2;
            } else {
                C9197r.m16178h("MediaCodecUtil", "Unknown HEVC profile string: " + group);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer m33296y = m33296y(str2);
        if (m33296y == null) {
            C9197r.m16178h("MediaCodecUtil", "Unknown HEVC level string: " + str2);
            return null;
        }
        return new Pair<>(Integer.valueOf(i), m33296y);
    }

    /* renamed from: x */
    private static Pair<Integer, Integer> m33297x(String str, String[] strArr) {
        if (strArr.length < 3) {
            C9197r.m16178h("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int m33321Q = m33321Q(parseInt);
            if (m33321Q == -1) {
                C9197r.m16178h("MediaCodecUtil", "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int m33322P = m33322P(parseInt2);
            if (m33322P == -1) {
                C9197r.m16178h("MediaCodecUtil", "Unknown VP9 level: " + parseInt2);
                return null;
            }
            return new Pair<>(Integer.valueOf(m33321Q), Integer.valueOf(m33322P));
        } catch (NumberFormatException unused) {
            C9197r.m16178h("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    /* renamed from: y */
    private static Integer m33296y(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c = '\b';
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c = '\t';
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c = '\n';
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c = '\f';
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c = '\r';
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c = 25;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case '\b':
                return 64;
            case '\t':
                return 256;
            case '\n':
                return Integer.valueOf((int) RecyclerView.ItemAnimator.FLAG_MOVED);
            case 11:
                return 8192;
            case '\f':
                return 32768;
            case '\r':
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return Integer.valueOf((int) RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            case 20:
                return 16384;
            case 21:
                return 65536;
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }

    /* renamed from: z */
    private static boolean m33295z(MediaCodecInfo mediaCodecInfo) {
        return C9191p0.f24171a >= 29 && m33337A(mediaCodecInfo);
    }
}

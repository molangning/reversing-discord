package p195k8;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import p193k6.C9062a;

/* renamed from: k8.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9200u {

    /* renamed from: a */
    private static final ArrayList<C9201a> f24202a = new ArrayList<>();

    /* renamed from: b */
    private static final Pattern f24203b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: k8.u$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9201a {

        /* renamed from: a */
        public final String f24204a;

        /* renamed from: b */
        public final String f24205b;

        /* renamed from: c */
        public final int f24206c;
    }

    /* renamed from: k8.u$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9202b {

        /* renamed from: a */
        public final int f24207a;

        /* renamed from: b */
        public final int f24208b;

        public C9202b(int i, int i2) {
            this.f24207a = i;
            this.f24208b = i2;
        }
    }

    /* renamed from: a */
    public static boolean m16169a(String str, String str2) {
        C9202b m16161i;
        int m16785d;
        if (str == null) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                if (str2 == null || (m16161i = m16161i(str2)) == null || (m16785d = C9062a.m16785d(m16161i.f24208b)) == 0 || m16785d == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static boolean m16168b(String str, String str2) {
        return m16166d(str, str2) != null;
    }

    /* renamed from: c */
    public static String m16167c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C9191p0.m16282P0(str)) {
            String m16163g = m16163g(str2);
            if (m16163g != null && m16154p(m16163g)) {
                return m16163g;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String m16166d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] m16282P0 = C9191p0.m16282P0(str);
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : m16282P0) {
            if (str2.equals(m16163g(str3))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
        }
        if (sb2.length() <= 0) {
            return null;
        }
        return sb2.toString();
    }

    /* renamed from: e */
    private static String m16165e(String str) {
        int size = f24202a.size();
        for (int i = 0; i < size; i++) {
            C9201a c9201a = f24202a.get(i);
            if (str.startsWith(c9201a.f24205b)) {
                return c9201a.f24204a;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static int m16164f(String str, String str2) {
        C9202b m16161i;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (m16161i = m16161i(str2)) == null) {
                    return 0;
                }
                return C9062a.m16785d(m16161i.f24208b);
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: g */
    public static String m16163g(String str) {
        C9202b m16161i;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String m16272U0 = C9191p0.m16272U0(str.trim());
        if (!m16272U0.startsWith("avc1") && !m16272U0.startsWith("avc3")) {
            if (!m16272U0.startsWith("hev1") && !m16272U0.startsWith("hvc1")) {
                if (!m16272U0.startsWith("dvav") && !m16272U0.startsWith("dva1") && !m16272U0.startsWith("dvhe") && !m16272U0.startsWith("dvh1")) {
                    if (m16272U0.startsWith("av01")) {
                        return "video/av01";
                    }
                    if (!m16272U0.startsWith("vp9") && !m16272U0.startsWith("vp09")) {
                        if (!m16272U0.startsWith("vp8") && !m16272U0.startsWith("vp08")) {
                            if (m16272U0.startsWith("mp4a")) {
                                if (m16272U0.startsWith("mp4a.") && (m16161i = m16161i(m16272U0)) != null) {
                                    str2 = m16162h(m16161i.f24207a);
                                }
                                if (str2 == null) {
                                    return "audio/mp4a-latm";
                                }
                                return str2;
                            } else if (!m16272U0.startsWith("ac-3") && !m16272U0.startsWith("dac3")) {
                                if (!m16272U0.startsWith("ec-3") && !m16272U0.startsWith("dec3")) {
                                    if (m16272U0.startsWith("ec+3")) {
                                        return "audio/eac3-joc";
                                    }
                                    if (!m16272U0.startsWith("ac-4") && !m16272U0.startsWith("dac4")) {
                                        if (!m16272U0.startsWith("dtsc") && !m16272U0.startsWith("dtse")) {
                                            if (!m16272U0.startsWith("dtsh") && !m16272U0.startsWith("dtsl")) {
                                                if (m16272U0.startsWith("opus")) {
                                                    return "audio/opus";
                                                }
                                                if (m16272U0.startsWith("vorbis")) {
                                                    return "audio/vorbis";
                                                }
                                                if (m16272U0.startsWith("flac")) {
                                                    return "audio/flac";
                                                }
                                                if (m16272U0.startsWith("stpp")) {
                                                    return "application/ttml+xml";
                                                }
                                                if (m16272U0.startsWith("wvtt")) {
                                                    return "text/vtt";
                                                }
                                                if (m16272U0.contains("cea708")) {
                                                    return "application/cea-708";
                                                }
                                                if (!m16272U0.contains("eia608") && !m16272U0.contains("cea608")) {
                                                    return m16165e(m16272U0);
                                                }
                                                return "application/cea-608";
                                            }
                                            return "audio/vnd.dts.hd";
                                        }
                                        return "audio/vnd.dts";
                                    }
                                    return "audio/ac4";
                                }
                                return "audio/eac3";
                            } else {
                                return "audio/ac3";
                            }
                        }
                        return "video/x-vnd.on2.vp8";
                    }
                    return "video/x-vnd.on2.vp9";
                }
                return "video/dolby-vision";
            }
            return "video/hevc";
        }
        return "video/avc";
    }

    /* renamed from: h */
    public static String m16162h(int i) {
        if (i != 32) {
            if (i != 33) {
                if (i != 35) {
                    if (i != 64) {
                        if (i != 163) {
                            if (i != 177) {
                                if (i != 165) {
                                    if (i != 166) {
                                        switch (i) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return "video/mpeg2";
                                            case 102:
                                            case 103:
                                            case 104:
                                                return "audio/mp4a-latm";
                                            case 105:
                                            case 107:
                                                return "audio/mpeg";
                                            case 106:
                                                return "video/mpeg";
                                            default:
                                                switch (i) {
                                                    case 169:
                                                    case 172:
                                                        return "audio/vnd.dts";
                                                    case 170:
                                                    case 171:
                                                        return "audio/vnd.dts.hd";
                                                    case 173:
                                                        return "audio/opus";
                                                    case 174:
                                                        return "audio/ac4";
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    /* renamed from: i */
    static C9202b m16161i(String str) {
        int i;
        Matcher matcher = f24203b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) C9149a.m16448e(matcher.group(1));
        String group = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i = Integer.parseInt(group);
            } else {
                i = 0;
            }
            return new C9202b(parseInt, i);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static String m16160j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C9191p0.m16282P0(str)) {
            String m16163g = m16163g(str2);
            if (m16163g != null && m16152r(m16163g)) {
                return m16163g;
            }
        }
        return null;
    }

    /* renamed from: k */
    private static String m16159k(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: l */
    public static int m16158l(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m16154p(str)) {
            return 1;
        }
        if (m16151s(str)) {
            return 2;
        }
        if (m16152r(str)) {
            return 3;
        }
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str)) {
            if ("application/x-camera-motion".equals(str)) {
                return 6;
            }
            return m16157m(str);
        }
        return 5;
    }

    /* renamed from: m */
    private static int m16157m(String str) {
        int size = f24202a.size();
        for (int i = 0; i < size; i++) {
            C9201a c9201a = f24202a.get(i);
            if (str.equals(c9201a.f24204a)) {
                return c9201a.f24206c;
            }
        }
        return -1;
    }

    /* renamed from: n */
    public static int m16156n(String str) {
        return m16158l(m16163g(str));
    }

    /* renamed from: o */
    public static String m16155o(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C9191p0.m16282P0(str)) {
            String m16163g = m16163g(str2);
            if (m16163g != null && m16151s(m16163g)) {
                return m16163g;
            }
        }
        return null;
    }

    /* renamed from: p */
    public static boolean m16154p(String str) {
        return MediaStreamTrack.AUDIO_TRACK_KIND.equals(m16159k(str));
    }

    /* renamed from: q */
    public static boolean m16153q(String str) {
        if (str == null) {
            return false;
        }
        if (!str.startsWith("video/webm") && !str.startsWith("audio/webm") && !str.startsWith("application/webm") && !str.startsWith("video/x-matroska") && !str.startsWith("audio/x-matroska") && !str.startsWith("application/x-matroska")) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m16152r(String str) {
        if (!"text".equals(m16159k(str)) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public static boolean m16151s(String str) {
        return MediaStreamTrack.VIDEO_TRACK_KIND.equals(m16159k(str));
    }

    /* renamed from: t */
    public static String m16150t(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "audio/flac";
            case 1:
                return "audio/wav";
            case 2:
                return "audio/mpeg";
            default:
                return str;
        }
    }
}
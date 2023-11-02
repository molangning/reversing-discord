package p337s7;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.nearby.NearbyManager;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.upstream.C4559i;
import gb.C6712x;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p151i6.C7390b;
import p151i6.C7402m;
import p195k8.C9149a;
import p195k8.C9187n0;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9200u;
import p229m7.C10347t0;
import p259o6.C11028l;
import p317r7.C12099r;
import p337s7.C12413f;
import p337s7.C12416g;
import p418x6.C13715l;

/* renamed from: s7.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12424i implements C4559i.InterfaceC4560a<AbstractC12423h> {

    /* renamed from: a */
    private final C12413f f32365a;

    /* renamed from: b */
    private final C12416g f32366b;

    /* renamed from: c */
    private static final Pattern f32341c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d */
    private static final Pattern f32342d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e */
    private static final Pattern f32343e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f */
    private static final Pattern f32344f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g */
    private static final Pattern f32345g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h */
    private static final Pattern f32346h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i */
    private static final Pattern f32347i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j */
    private static final Pattern f32348j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k */
    private static final Pattern f32349k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l */
    private static final Pattern f32350l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m */
    private static final Pattern f32351m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n */
    private static final Pattern f32352n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o */
    private static final Pattern f32353o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p */
    private static final Pattern f32354p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q */
    private static final Pattern f32355q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r */
    private static final Pattern f32356r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s */
    private static final Pattern f32357s = m5325c("CAN-SKIP-DATERANGES");

    /* renamed from: t */
    private static final Pattern f32358t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u */
    private static final Pattern f32359u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v */
    private static final Pattern f32360v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w */
    private static final Pattern f32361w = m5325c("CAN-BLOCK-RELOAD");

    /* renamed from: x */
    private static final Pattern f32362x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y */
    private static final Pattern f32363y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z */
    private static final Pattern f32364z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: A */
    private static final Pattern f32314A = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: B */
    private static final Pattern f32315B = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: C */
    private static final Pattern f32316C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: D */
    private static final Pattern f32317D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: E */
    private static final Pattern f32318E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: F */
    private static final Pattern f32319F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: G */
    private static final Pattern f32320G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: H */
    private static final Pattern f32321H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: I */
    private static final Pattern f32322I = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: J */
    private static final Pattern f32323J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: K */
    private static final Pattern f32324K = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: L */
    private static final Pattern f32325L = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: M */
    private static final Pattern f32326M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: N */
    private static final Pattern f32327N = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: O */
    private static final Pattern f32328O = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: P */
    private static final Pattern f32329P = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: Q */
    private static final Pattern f32330Q = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: R */
    private static final Pattern f32331R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: S */
    private static final Pattern f32332S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: T */
    private static final Pattern f32333T = m5325c("AUTOSELECT");

    /* renamed from: U */
    private static final Pattern f32334U = m5325c("DEFAULT");

    /* renamed from: V */
    private static final Pattern f32335V = m5325c("FORCED");

    /* renamed from: W */
    private static final Pattern f32336W = m5325c("INDEPENDENT");

    /* renamed from: X */
    private static final Pattern f32337X = m5325c("GAP");

    /* renamed from: Y */
    private static final Pattern f32338Y = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: Z */
    private static final Pattern f32339Z = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: a0 */
    private static final Pattern f32340a0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: s7.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12425a extends IOException {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s7.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C12426b {

        /* renamed from: a */
        private final BufferedReader f32367a;

        /* renamed from: b */
        private final Queue<String> f32368b;

        /* renamed from: c */
        private String f32369c;

        public C12426b(Queue<String> queue, BufferedReader bufferedReader) {
            this.f32368b = queue;
            this.f32367a = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        /* renamed from: a */
        public boolean m5301a() {
            String trim;
            if (this.f32369c != null) {
                return true;
            }
            if (!this.f32368b.isEmpty()) {
                this.f32369c = (String) C9149a.m16448e(this.f32368b.poll());
                return true;
            }
            do {
                String readLine = this.f32367a.readLine();
                this.f32369c = readLine;
                if (readLine != null) {
                    trim = readLine.trim();
                    this.f32369c = trim;
                } else {
                    return false;
                }
            } while (trim.isEmpty());
            return true;
        }

        /* renamed from: b */
        public String m5300b() {
            if (m5301a()) {
                String str = this.f32369c;
                this.f32369c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public C12424i() {
        this(C12413f.f32250n, null);
    }

    /* renamed from: A */
    private static String m5328A(String str, Map<String, String> map) {
        Matcher matcher = f32340a0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: B */
    private static int m5327B(BufferedReader bufferedReader, boolean z, int i) {
        while (i != -1 && Character.isWhitespace(i) && (z || !C9191p0.m16228q0(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* renamed from: b */
    private static boolean m5326b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int m5327B = m5327B(bufferedReader, true, read);
        for (int i = 0; i < 7; i++) {
            if (m5327B != "#EXTM3U".charAt(i)) {
                return false;
            }
            m5327B = bufferedReader.read();
        }
        return C9191p0.m16228q0(m5327B(bufferedReader, false, m5327B));
    }

    /* renamed from: c */
    private static Pattern m5325c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    /* renamed from: d */
    private static C11028l m5324d(String str, C11028l.C11030b[] c11030bArr) {
        C11028l.C11030b[] c11030bArr2 = new C11028l.C11030b[c11030bArr.length];
        for (int i = 0; i < c11030bArr.length; i++) {
            c11030bArr2[i] = c11030bArr[i].m9312b(null);
        }
        return new C11028l(str, c11030bArr2);
    }

    /* renamed from: e */
    private static String m5323e(long j, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    /* renamed from: f */
    private static C12413f.C12415b m5322f(ArrayList<C12413f.C12415b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C12413f.C12415b c12415b = arrayList.get(i);
            if (str.equals(c12415b.f32268d)) {
                return c12415b;
            }
        }
        return null;
    }

    /* renamed from: g */
    private static C12413f.C12415b m5321g(ArrayList<C12413f.C12415b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C12413f.C12415b c12415b = arrayList.get(i);
            if (str.equals(c12415b.f32269e)) {
                return c12415b;
            }
        }
        return null;
    }

    /* renamed from: h */
    private static C12413f.C12415b m5320h(ArrayList<C12413f.C12415b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C12413f.C12415b c12415b = arrayList.get(i);
            if (str.equals(c12415b.f32267c)) {
                return c12415b;
            }
        }
        return null;
    }

    /* renamed from: j */
    private static double m5318j(String str, Pattern pattern) {
        return Double.parseDouble(m5302z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: k */
    private static C11028l.C11030b m5317k(String str, String str2, Map<String, String> map) {
        String m5307u = m5307u(str, f32323J, NearbyManager.PERMISSION_DENIED, map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String m5302z = m5302z(str, f32324K, map);
            return new C11028l.C11030b(C7390b.f19881d, "video/mp4", Base64.decode(m5302z.substring(m5302z.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new C11028l.C11030b(C7390b.f19881d, "hls", C9191p0.m16238l0(str));
        } else {
            if ("com.microsoft.playready".equals(str2) && NearbyManager.PERMISSION_DENIED.equals(m5307u)) {
                String m5302z2 = m5302z(str, f32324K, map);
                byte[] decode = Base64.decode(m5302z2.substring(m5302z2.indexOf(44)), 0);
                UUID uuid = C7390b.f19882e;
                return new C11028l.C11030b(uuid, "video/mp4", C13715l.m1667a(uuid, decode));
            }
            return null;
        }
    }

    /* renamed from: l */
    private static String m5316l(String str) {
        if (!"SAMPLE-AES-CENC".equals(str) && !"SAMPLE-AES-CTR".equals(str)) {
            return "cbcs";
        }
        return "cenc";
    }

    /* renamed from: m */
    private static int m5315m(String str, Pattern pattern) {
        return Integer.parseInt(m5302z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: n */
    private static long m5314n(String str, Pattern pattern) {
        return Long.parseLong(m5302z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* renamed from: o */
    private static C12413f m5313o(C12426b c12426b, String str) {
        Uri uri;
        char c;
        Format format;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        String str4;
        boolean z;
        int i;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i2;
        int i3;
        ArrayList arrayList9;
        ArrayList arrayList10;
        Uri m16314d;
        HashMap hashMap;
        int i4;
        String str5 = str;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            String str6 = "application/x-mpegURL";
            if (c12426b.m5301a()) {
                String m5300b = c12426b.m5300b();
                if (m5300b.startsWith("#EXT")) {
                    arrayList18.add(m5300b);
                }
                boolean startsWith = m5300b.startsWith("#EXT-X-I-FRAME-STREAM-INF");
                boolean z4 = z2;
                if (m5300b.startsWith("#EXT-X-DEFINE")) {
                    hashMap3.put(m5302z(m5300b, f32329P, hashMap3), m5302z(m5300b, f32338Y, hashMap3));
                } else {
                    if (m5300b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                        hashMap = hashMap2;
                        arrayList10 = arrayList16;
                        arrayList9 = arrayList12;
                        arrayList8 = arrayList13;
                        arrayList7 = arrayList14;
                        arrayList5 = arrayList15;
                        arrayList6 = arrayList18;
                        arrayList4 = arrayList17;
                        z2 = true;
                    } else if (m5300b.startsWith("#EXT-X-MEDIA")) {
                        arrayList16.add(m5300b);
                    } else if (m5300b.startsWith("#EXT-X-SESSION-KEY")) {
                        C11028l.C11030b m5317k = m5317k(m5300b, m5307u(m5300b, f32322I, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, hashMap3), hashMap3);
                        if (m5317k != null) {
                            arrayList17.add(new C11028l(m5316l(m5302z(m5300b, f32321H, hashMap3)), m5317k));
                        }
                    } else if (m5300b.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                        boolean contains = z3 | m5300b.contains("CLOSED-CAPTIONS=NONE");
                        if (startsWith) {
                            i = 16384;
                            z = contains;
                        } else {
                            z = contains;
                            i = 0;
                        }
                        int m5315m = m5315m(m5300b, f32346h);
                        arrayList4 = arrayList17;
                        arrayList5 = arrayList15;
                        int m5309s = m5309s(m5300b, f32341c, -1);
                        String m5306v = m5306v(m5300b, f32348j, hashMap3);
                        arrayList6 = arrayList18;
                        String m5306v2 = m5306v(m5300b, f32349k, hashMap3);
                        if (m5306v2 != null) {
                            arrayList7 = arrayList14;
                            String[] m16286N0 = C9191p0.m16286N0(m5306v2, "x");
                            int parseInt2 = Integer.parseInt(m16286N0[0]);
                            int parseInt3 = Integer.parseInt(m16286N0[1]);
                            if (parseInt2 <= 0 || parseInt3 <= 0) {
                                parseInt3 = -1;
                                i4 = -1;
                            } else {
                                i4 = parseInt2;
                            }
                            arrayList8 = arrayList13;
                            i3 = parseInt3;
                            i2 = i4;
                        } else {
                            arrayList7 = arrayList14;
                            arrayList8 = arrayList13;
                            i2 = -1;
                            i3 = -1;
                        }
                        String m5306v3 = m5306v(m5300b, f32350l, hashMap3);
                        float parseFloat = m5306v3 != null ? Float.parseFloat(m5306v3) : -1.0f;
                        arrayList9 = arrayList12;
                        String m5306v4 = m5306v(m5300b, f32342d, hashMap3);
                        arrayList10 = arrayList16;
                        String m5306v5 = m5306v(m5300b, f32343e, hashMap3);
                        HashMap hashMap4 = hashMap2;
                        String m5306v6 = m5306v(m5300b, f32344f, hashMap3);
                        String m5306v7 = m5306v(m5300b, f32345g, hashMap3);
                        if (startsWith) {
                            m16314d = C9187n0.m16314d(str5, m5302z(m5300b, f32324K, hashMap3));
                        } else if (c12426b.m5301a()) {
                            m16314d = C9187n0.m16314d(str5, m5328A(c12426b.m5300b(), hashMap3));
                        } else {
                            throw new C7402m("#EXT-X-STREAM-INF must be followed by another line");
                        }
                        arrayList11.add(new C12413f.C12415b(m16314d, new Format.C4362b().m29901R(arrayList11.size()).m29908K("application/x-mpegURL").m29910I(m5306v).m29912G(m5309s).m29893Z(m5315m).m29873j0(i2).m29902Q(i3).m29903P(parseFloat).m29887c0(i).m29914E(), m5306v4, m5306v5, m5306v6, m5306v7));
                        hashMap = hashMap4;
                        ArrayList arrayList19 = (ArrayList) hashMap.get(m16314d);
                        if (arrayList19 == null) {
                            arrayList19 = new ArrayList();
                            hashMap.put(m16314d, arrayList19);
                        }
                        arrayList19.add(new C12099r.C12101b(m5309s, m5315m, m5306v4, m5306v5, m5306v6, m5306v7));
                        z2 = z4;
                        z3 = z;
                    }
                    hashMap2 = hashMap;
                    arrayList17 = arrayList4;
                    arrayList15 = arrayList5;
                    arrayList18 = arrayList6;
                    arrayList14 = arrayList7;
                    arrayList13 = arrayList8;
                    arrayList12 = arrayList9;
                    arrayList16 = arrayList10;
                    str5 = str;
                }
                hashMap = hashMap2;
                arrayList10 = arrayList16;
                arrayList9 = arrayList12;
                arrayList8 = arrayList13;
                arrayList7 = arrayList14;
                arrayList5 = arrayList15;
                arrayList6 = arrayList18;
                arrayList4 = arrayList17;
                z2 = z4;
                hashMap2 = hashMap;
                arrayList17 = arrayList4;
                arrayList15 = arrayList5;
                arrayList18 = arrayList6;
                arrayList14 = arrayList7;
                arrayList13 = arrayList8;
                arrayList12 = arrayList9;
                arrayList16 = arrayList10;
                str5 = str;
            } else {
                HashMap hashMap5 = hashMap2;
                ArrayList arrayList20 = arrayList16;
                ArrayList arrayList21 = arrayList12;
                ArrayList arrayList22 = arrayList13;
                ArrayList arrayList23 = arrayList14;
                ArrayList arrayList24 = arrayList15;
                ArrayList arrayList25 = arrayList18;
                boolean z5 = z2;
                ArrayList arrayList26 = arrayList17;
                ArrayList arrayList27 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i5 = 0;
                while (true) {
                    uri = null;
                    if (i5 >= arrayList11.size()) {
                        break;
                    }
                    C12413f.C12415b c12415b = (C12413f.C12415b) arrayList11.get(i5);
                    if (hashSet.add(c12415b.f32265a)) {
                        C9149a.m16447f(c12415b.f32266b.f11195s == null);
                        arrayList27.add(c12415b.m5338a(c12415b.f32266b.m29926a().m29895X(new Metadata(new C12099r(null, null, (List) C9149a.m16448e((ArrayList) hashMap5.get(c12415b.f32265a))))).m29914E()));
                    }
                    i5++;
                }
                ArrayList arrayList28 = null;
                Format format2 = null;
                int i6 = 0;
                while (i6 < arrayList20.size()) {
                    ArrayList arrayList29 = arrayList20;
                    String str7 = (String) arrayList29.get(i6);
                    String m5302z = m5302z(str7, f32330Q, hashMap3);
                    String m5302z2 = m5302z(str7, f32329P, hashMap3);
                    Format.C4362b m29897V = new Format.C4362b().m29900S(m5302z + ":" + m5302z2).m29898U(m5302z2).m29908K(str6).m29879g0(m5304x(str7)).m29887c0(m5305w(str7, hashMap3)).m29897V(m5306v(str7, f32328O, hashMap3));
                    String m5306v8 = m5306v(str7, f32324K, hashMap3);
                    Uri m16314d2 = m5306v8 == null ? uri : C9187n0.m16314d(str, m5306v8);
                    arrayList20 = arrayList29;
                    String str8 = str6;
                    Metadata metadata = new Metadata(new C12099r(m5302z, m5302z2, Collections.emptyList()));
                    String m5302z3 = m5302z(str7, f32326M, hashMap3);
                    m5302z3.hashCode();
                    switch (m5302z3.hashCode()) {
                        case -959297733:
                            if (m5302z3.equals("SUBTITLES")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -333210994:
                            if (m5302z3.equals("CLOSED-CAPTIONS")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 62628790:
                            if (m5302z3.equals("AUDIO")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 81665115:
                            if (m5302z3.equals("VIDEO")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            format = format2;
                            arrayList = arrayList22;
                            arrayList2 = arrayList21;
                            C12413f.C12415b m5321g = m5321g(arrayList11, m5302z);
                            if (m5321g != null) {
                                String m16293K = C9191p0.m16293K(m5321g.f32266b.f11194r, 3);
                                m29897V.m29910I(m16293K);
                                str2 = C9200u.m16163g(m16293K);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            m29897V.m29883e0(str2).m29895X(metadata);
                            if (m16314d2 != null) {
                                arrayList3 = arrayList23;
                                arrayList3.add(new C12413f.C12414a(m16314d2, m29897V.m29914E(), m5302z, m5302z2));
                                break;
                            } else {
                                arrayList3 = arrayList23;
                                C9197r.m16178h("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                        case 1:
                            format = format2;
                            arrayList = arrayList22;
                            arrayList2 = arrayList21;
                            String m5302z4 = m5302z(str7, f32332S, hashMap3);
                            if (m5302z4.startsWith("CC")) {
                                parseInt = Integer.parseInt(m5302z4.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(m5302z4.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (arrayList28 == null) {
                                arrayList28 = new ArrayList();
                            }
                            m29897V.m29883e0(str3).m29913F(parseInt);
                            arrayList28.add(m29897V.m29914E());
                            arrayList3 = arrayList23;
                            break;
                        case 2:
                            arrayList2 = arrayList21;
                            C12413f.C12415b m5322f = m5322f(arrayList11, m5302z);
                            if (m5322f != null) {
                                format = format2;
                                String m16293K2 = C9191p0.m16293K(m5322f.f32266b.f11194r, 1);
                                m29897V.m29910I(m16293K2);
                                str4 = C9200u.m16163g(m16293K2);
                            } else {
                                format = format2;
                                str4 = null;
                            }
                            String m5306v9 = m5306v(str7, f32347i, hashMap3);
                            if (m5306v9 != null) {
                                m29897V.m29911H(Integer.parseInt(C9191p0.m16284O0(m5306v9, "/")[0]));
                                if ("audio/eac3".equals(str4) && m5306v9.endsWith("/JOC")) {
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            m29897V.m29883e0(str4);
                            if (m16314d2 != null) {
                                m29897V.m29895X(metadata);
                                arrayList = arrayList22;
                                arrayList.add(new C12413f.C12414a(m16314d2, m29897V.m29914E(), m5302z, m5302z2));
                            } else {
                                arrayList = arrayList22;
                                if (m5322f != null) {
                                    format = m29897V.m29914E();
                                }
                            }
                            arrayList3 = arrayList23;
                            break;
                        case 3:
                            C12413f.C12415b m5320h = m5320h(arrayList11, m5302z);
                            if (m5320h != null) {
                                Format format3 = m5320h.f32266b;
                                String m16293K3 = C9191p0.m16293K(format3.f11194r, 2);
                                m29897V.m29910I(m16293K3).m29883e0(C9200u.m16163g(m16293K3)).m29873j0(format3.f11202z).m29902Q(format3.f11171A).m29903P(format3.f11172B);
                            }
                            if (m16314d2 != null) {
                                m29897V.m29895X(metadata);
                                arrayList2 = arrayList21;
                                arrayList2.add(new C12413f.C12414a(m16314d2, m29897V.m29914E(), m5302z, m5302z2));
                                format = format2;
                                arrayList3 = arrayList23;
                                arrayList = arrayList22;
                                break;
                            }
                        default:
                            format = format2;
                            arrayList3 = arrayList23;
                            arrayList = arrayList22;
                            arrayList2 = arrayList21;
                            break;
                    }
                    i6++;
                    arrayList23 = arrayList3;
                    arrayList22 = arrayList;
                    arrayList21 = arrayList2;
                    str6 = str8;
                    format2 = format;
                    uri = null;
                }
                return new C12413f(str, arrayList25, arrayList27, arrayList21, arrayList22, arrayList23, arrayList24, format2, z3 ? Collections.emptyList() : arrayList28, z5, hashMap3, arrayList26);
            }
        }
    }

    /* renamed from: p */
    private static C12416g m5312p(C12413f c12413f, C12416g c12416g, C12426b c12426b, String str) {
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2;
        String str2;
        HashMap hashMap;
        C12416g.C12418b c12418b;
        String str3;
        long j;
        String str4;
        boolean z2;
        boolean z3;
        boolean z4;
        List<C12416g.C12418b> list;
        int i;
        long j2;
        C12416g.C12420d c12420d;
        boolean z5;
        C11028l c11028l;
        C12416g.C12420d c12420d2;
        boolean z6;
        long j3;
        String str5;
        long j4;
        String str6;
        C12413f c12413f2 = c12413f;
        C12416g c12416g2 = c12416g;
        boolean z7 = c12413f2.f32313c;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        C12416g.C12422f c12422f = new C12416g.C12422f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        boolean z8 = false;
        String str7 = "";
        boolean z9 = z7;
        C12416g.C12422f c12422f2 = c12422f;
        boolean z10 = false;
        int i2 = 0;
        int i3 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i4 = 0;
        boolean z13 = false;
        String str8 = "";
        long j5 = -9223372036854775807L;
        long j6 = 0;
        long j7 = 0;
        int i5 = 1;
        long j8 = -9223372036854775807L;
        long j9 = -9223372036854775807L;
        C11028l c11028l2 = null;
        long j10 = 0;
        C11028l c11028l3 = null;
        long j11 = 0;
        C12416g.C12418b c12418b2 = null;
        String str9 = null;
        long j12 = -1;
        String str10 = null;
        String str11 = null;
        long j13 = 0;
        long j14 = 0;
        C12416g.C12420d c12420d3 = null;
        long j15 = 0;
        long j16 = 0;
        while (c12426b.m5301a()) {
            String m5300b = c12426b.m5300b();
            if (m5300b.startsWith("#EXT")) {
                arrayList5.add(m5300b);
            }
            if (m5300b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String m5302z = m5302z(m5300b, f32355q, hashMap2);
                if ("VOD".equals(m5302z)) {
                    i2 = 1;
                } else if ("EVENT".equals(m5302z)) {
                    i2 = 2;
                }
            } else if (m5300b.equals("#EXT-X-I-FRAMES-ONLY")) {
                z13 = true;
            } else if (m5300b.startsWith("#EXT-X-START")) {
                j5 = (long) (m5318j(m5300b, f32316C) * 1000000.0d);
            } else if (m5300b.startsWith("#EXT-X-SERVER-CONTROL")) {
                c12422f2 = m5303y(m5300b);
            } else if (m5300b.startsWith("#EXT-X-PART-INF")) {
                j9 = (long) (m5318j(m5300b, f32353o) * 1000000.0d);
            } else if (m5300b.startsWith("#EXT-X-MAP")) {
                String m5302z2 = m5302z(m5300b, f32324K, hashMap2);
                String m5306v = m5306v(m5300b, f32318E, hashMap2);
                if (m5306v != null) {
                    String[] m16286N0 = C9191p0.m16286N0(m5306v, "@");
                    j12 = Long.parseLong(m16286N0[z8 ? 1 : 0]);
                    if (m16286N0.length > 1) {
                        j10 = Long.parseLong(m16286N0[1]);
                    }
                }
                int i6 = (j12 > (-1L) ? 1 : (j12 == (-1L) ? 0 : -1));
                String str12 = str9;
                if (i6 == 0) {
                    j10 = 0;
                }
                String str13 = str10;
                if (str12 != null && str13 == null) {
                    throw new C7402m("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                }
                c12420d3 = new C12416g.C12420d(m5302z2, j10, j12, str12, str13);
                if (i6 != 0) {
                    j10 += j12;
                }
                str10 = str13;
                str9 = str12;
                j12 = -1;
            } else {
                String str14 = str9;
                String str15 = str10;
                if (m5300b.startsWith("#EXT-X-TARGETDURATION")) {
                    j8 = 1000000 * m5315m(m5300b, f32351m);
                } else if (m5300b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                    j14 = m5314n(m5300b, f32362x);
                    str9 = str14;
                    j7 = j14;
                    str10 = str15;
                    z8 = false;
                } else if (m5300b.startsWith("#EXT-X-VERSION")) {
                    i5 = m5315m(m5300b, f32354p);
                } else {
                    if (m5300b.startsWith("#EXT-X-DEFINE")) {
                        String m5306v2 = m5306v(m5300b, f32339Z, hashMap2);
                        if (m5306v2 != null) {
                            String str16 = c12413f2.f32259l.get(m5306v2);
                            if (str16 != null) {
                                hashMap2.put(m5306v2, str16);
                            }
                        } else {
                            hashMap2.put(m5302z(m5300b, f32329P, hashMap2), m5302z(m5300b, f32338Y, hashMap2));
                        }
                        arrayList2 = arrayList5;
                        str2 = str7;
                        hashMap = hashMap4;
                        c12418b = c12418b2;
                        str3 = str11;
                    } else if (m5300b.startsWith("#EXTINF")) {
                        str8 = m5307u(m5300b, f32364z, str7, hashMap2);
                        c12413f2 = c12413f;
                        j15 = (long) (m5318j(m5300b, f32363y) * 1000000.0d);
                    } else {
                        if (m5300b.startsWith("#EXT-X-SKIP")) {
                            int m5315m = m5315m(m5300b, f32358t);
                            if (c12416g2 != null && arrayList3.isEmpty()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            C9149a.m16447f(z4);
                            int i7 = (int) (j7 - ((C12416g) C9191p0.m16243j(c12416g)).f32276i);
                            int i8 = m5315m + i7;
                            if (i7 >= 0 && i8 <= c12416g2.f32283p.size()) {
                                String str17 = str7;
                                long j17 = j13;
                                str10 = str15;
                                while (i7 < i8) {
                                    C12416g.C12420d c12420d4 = c12416g2.f32283p.get(i7);
                                    HashMap hashMap5 = hashMap4;
                                    if (j7 != c12416g2.f32276i) {
                                        c12420d4 = c12420d4.m5330b(j17, (c12416g2.f32275h - i3) + c12420d4.f32298m);
                                    }
                                    arrayList3.add(c12420d4);
                                    j17 += c12420d4.f32297l;
                                    long j18 = c12420d4.f32304s;
                                    int i9 = i8;
                                    if (j18 != -1) {
                                        j10 = c12420d4.f32303r + j18;
                                    }
                                    int i10 = c12420d4.f32298m;
                                    C12416g.C12420d c12420d5 = c12420d4.f32296k;
                                    C11028l c11028l4 = c12420d4.f32300o;
                                    String str18 = c12420d4.f32301p;
                                    String str19 = c12420d4.f32302q;
                                    if (str19 == null || !str19.equals(Long.toHexString(j14))) {
                                        str10 = c12420d4.f32302q;
                                    }
                                    j14++;
                                    i7++;
                                    c12416g2 = c12416g;
                                    j11 = j17;
                                    i4 = i10;
                                    i8 = i9;
                                    c12420d3 = c12420d5;
                                    c11028l3 = c11028l4;
                                    str14 = str18;
                                    hashMap4 = hashMap5;
                                }
                                c12413f2 = c12413f;
                                c12416g2 = c12416g;
                                j13 = j17;
                                str9 = str14;
                                str7 = str17;
                            } else {
                                throw new C12425a();
                            }
                        } else {
                            str2 = str7;
                            hashMap = hashMap4;
                            if (m5300b.startsWith("#EXT-X-KEY")) {
                                String m5302z3 = m5302z(m5300b, f32321H, hashMap2);
                                String m5307u = m5307u(m5300b, f32322I, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, hashMap2);
                                if ("NONE".equals(m5302z3)) {
                                    treeMap.clear();
                                    str6 = null;
                                    c11028l3 = null;
                                    str10 = null;
                                } else {
                                    String m5306v3 = m5306v(m5300b, f32325L, hashMap2);
                                    if (InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY.equals(m5307u)) {
                                        if ("AES-128".equals(m5302z3)) {
                                            str6 = m5302z(m5300b, f32324K, hashMap2);
                                            str10 = m5306v3;
                                        }
                                        str10 = m5306v3;
                                        str6 = null;
                                    } else {
                                        String str20 = str11;
                                        if (str20 == null) {
                                            str11 = m5316l(m5302z3);
                                        } else {
                                            str11 = str20;
                                        }
                                        C11028l.C11030b m5317k = m5317k(m5300b, m5307u, hashMap2);
                                        if (m5317k != null) {
                                            treeMap.put(m5307u, m5317k);
                                            str10 = m5306v3;
                                            str6 = null;
                                            c11028l3 = null;
                                        }
                                        str10 = m5306v3;
                                        str6 = null;
                                    }
                                }
                                c12416g2 = c12416g;
                                str9 = str6;
                                str7 = str2;
                                hashMap4 = hashMap;
                                z8 = false;
                                c12413f2 = c12413f;
                            } else {
                                str3 = str11;
                                if (m5300b.startsWith("#EXT-X-BYTERANGE")) {
                                    String[] m16286N02 = C9191p0.m16286N0(m5302z(m5300b, f32317D, hashMap2), "@");
                                    j12 = Long.parseLong(m16286N02[0]);
                                    if (m16286N02.length > 1) {
                                        j10 = Long.parseLong(m16286N02[1]);
                                    }
                                } else if (m5300b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    i3 = Integer.parseInt(m5300b.substring(m5300b.indexOf(58) + 1));
                                    c12413f2 = c12413f;
                                    c12416g2 = c12416g;
                                    str11 = str3;
                                    str9 = str14;
                                    str10 = str15;
                                    str7 = str2;
                                    hashMap4 = hashMap;
                                    z10 = true;
                                } else if (m5300b.equals("#EXT-X-DISCONTINUITY")) {
                                    i4++;
                                } else if (m5300b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                    if (j6 == 0) {
                                        j6 = C7390b.m20792c(C9191p0.m16306D0(m5300b.substring(m5300b.indexOf(58) + 1))) - j13;
                                    } else {
                                        arrayList2 = arrayList5;
                                        c12418b = c12418b2;
                                    }
                                } else if (m5300b.equals("#EXT-X-GAP")) {
                                    c12413f2 = c12413f;
                                    c12416g2 = c12416g;
                                    str11 = str3;
                                    str9 = str14;
                                    str10 = str15;
                                    str7 = str2;
                                    hashMap4 = hashMap;
                                    z8 = false;
                                    z12 = true;
                                } else if (m5300b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                    c12413f2 = c12413f;
                                    c12416g2 = c12416g;
                                    str11 = str3;
                                    str9 = str14;
                                    str10 = str15;
                                    str7 = str2;
                                    hashMap4 = hashMap;
                                    z8 = false;
                                    z9 = true;
                                } else if (m5300b.equals("#EXT-X-ENDLIST")) {
                                    c12413f2 = c12413f;
                                    c12416g2 = c12416g;
                                    str11 = str3;
                                    str9 = str14;
                                    str10 = str15;
                                    str7 = str2;
                                    hashMap4 = hashMap;
                                    z8 = false;
                                    z11 = true;
                                } else if (m5300b.startsWith("#EXT-X-RENDITION-REPORT")) {
                                    long m5308t = m5308t(m5300b, f32314A, (j7 + arrayList3.size()) - (arrayList4.isEmpty() ? 1L : 0L));
                                    if (arrayList4.isEmpty()) {
                                        list = ((C12416g.C12420d) C6712x.m22059c(arrayList3)).f32294v;
                                    } else {
                                        list = arrayList4;
                                    }
                                    if (j9 != -9223372036854775807L) {
                                        i = list.size() - 1;
                                    } else {
                                        i = -1;
                                    }
                                    int m5309s = m5309s(m5300b, f32315B, i);
                                    Uri parse = Uri.parse(C9187n0.m16315c(str, m5302z(m5300b, f32324K, hashMap2)));
                                    hashMap.put(parse, new C12416g.C12419c(parse, m5308t, m5309s));
                                    arrayList2 = arrayList5;
                                    c12418b = c12418b2;
                                    j = j14;
                                    str4 = str15;
                                    z2 = false;
                                    z3 = z10;
                                    j14 = j;
                                    str11 = str3;
                                    z8 = z2;
                                    str9 = str14;
                                    z10 = z3;
                                    arrayList5 = arrayList2;
                                    c12413f2 = c12413f;
                                    c12416g2 = c12416g;
                                    c12418b2 = c12418b;
                                    str10 = str4;
                                    str7 = str2;
                                    hashMap4 = hashMap;
                                } else {
                                    if (m5300b.startsWith("#EXT-X-PRELOAD-HINT")) {
                                        C12416g.C12418b c12418b3 = c12418b2;
                                        if (c12418b3 != null || !"PART".equals(m5302z(m5300b, f32327N, hashMap2))) {
                                            hashMap = hashMap;
                                            c12418b = c12418b3;
                                            z3 = z10;
                                            arrayList2 = arrayList5;
                                            j = j14;
                                            str4 = str15;
                                        } else {
                                            String m5302z4 = m5302z(m5300b, f32324K, hashMap2);
                                            long m5308t2 = m5308t(m5300b, f32319F, -1L);
                                            long m5308t3 = m5308t(m5300b, f32320G, -1L);
                                            long j19 = j14;
                                            String m5323e = m5323e(j19, str14, str15);
                                            if (c11028l3 == null && !treeMap.isEmpty()) {
                                                str5 = str15;
                                                C11028l.C11030b[] c11030bArr = (C11028l.C11030b[]) treeMap.values().toArray(new C11028l.C11030b[0]);
                                                C11028l c11028l5 = new C11028l(str3, c11030bArr);
                                                if (c11028l2 == null) {
                                                    c11028l2 = m5324d(str3, c11030bArr);
                                                }
                                                c11028l3 = c11028l5;
                                            } else {
                                                str5 = str15;
                                            }
                                            int i11 = (m5308t2 > (-1L) ? 1 : (m5308t2 == (-1L) ? 0 : -1));
                                            if (i11 != 0 && m5308t3 == -1) {
                                                c12418b2 = c12418b3;
                                            } else {
                                                if (i11 != 0) {
                                                    j4 = m5308t2;
                                                } else {
                                                    j4 = 0;
                                                }
                                                c12418b2 = new C12416g.C12418b(m5302z4, c12420d3, 0L, i4, j11, c11028l3, str14, m5323e, j4, m5308t3, false, false, true);
                                            }
                                            j14 = j19;
                                            str11 = str3;
                                            str9 = str14;
                                            str10 = str5;
                                            str7 = str2;
                                            hashMap4 = hashMap;
                                            z8 = false;
                                            c12413f2 = c12413f;
                                            c12416g2 = c12416g;
                                        }
                                    } else {
                                        hashMap = hashMap;
                                        c12418b = c12418b2;
                                        long j20 = j14;
                                        str4 = str15;
                                        z3 = z10;
                                        if (m5300b.startsWith("#EXT-X-PART")) {
                                            String m5323e2 = m5323e(j20, str14, str4);
                                            String m5302z5 = m5302z(m5300b, f32324K, hashMap2);
                                            long m5318j = (long) (m5318j(m5300b, f32352n) * 1000000.0d);
                                            ArrayList arrayList6 = arrayList5;
                                            boolean m5311q = m5311q(m5300b, f32336W, false);
                                            if (z9 && arrayList4.isEmpty()) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            boolean z14 = m5311q | z6;
                                            boolean m5311q2 = m5311q(m5300b, f32337X, false);
                                            String m5306v4 = m5306v(m5300b, f32318E, hashMap2);
                                            if (m5306v4 != null) {
                                                String[] m16286N03 = C9191p0.m16286N0(m5306v4, "@");
                                                j3 = Long.parseLong(m16286N03[0]);
                                                if (m16286N03.length > 1) {
                                                    j16 = Long.parseLong(m16286N03[1]);
                                                }
                                            } else {
                                                j3 = -1;
                                            }
                                            int i12 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
                                            if (i12 == 0) {
                                                j16 = 0;
                                            }
                                            if (c11028l3 == null && !treeMap.isEmpty()) {
                                                C11028l.C11030b[] c11030bArr2 = (C11028l.C11030b[]) treeMap.values().toArray(new C11028l.C11030b[0]);
                                                C11028l c11028l6 = new C11028l(str3, c11030bArr2);
                                                if (c11028l2 == null) {
                                                    c11028l2 = m5324d(str3, c11030bArr2);
                                                }
                                                c11028l3 = c11028l6;
                                            }
                                            arrayList4.add(new C12416g.C12418b(m5302z5, c12420d3, m5318j, i4, j11, c11028l3, str14, m5323e2, j16, j3, m5311q2, z14, false));
                                            j11 += m5318j;
                                            if (i12 != 0) {
                                                j16 += j3;
                                            }
                                            c12413f2 = c12413f;
                                            c12416g2 = c12416g;
                                            str11 = str3;
                                            str9 = str14;
                                            j14 = j20;
                                            z10 = z3;
                                            arrayList5 = arrayList6;
                                            z8 = false;
                                            c12418b2 = c12418b;
                                            str10 = str4;
                                            str7 = str2;
                                            hashMap4 = hashMap;
                                        } else {
                                            arrayList2 = arrayList5;
                                            if (!m5300b.startsWith("#")) {
                                                String m5323e3 = m5323e(j20, str14, str4);
                                                j14 = j20 + 1;
                                                String m5328A = m5328A(m5300b, hashMap2);
                                                C12416g.C12420d c12420d6 = (C12416g.C12420d) hashMap3.get(m5328A);
                                                int i13 = (j12 > (-1L) ? 1 : (j12 == (-1L) ? 0 : -1));
                                                if (i13 == 0) {
                                                    j2 = 0;
                                                } else {
                                                    if (z13 && c12420d3 == null && c12420d6 == null) {
                                                        c12420d6 = new C12416g.C12420d(m5328A, 0L, j10, null, null);
                                                        hashMap3.put(m5328A, c12420d6);
                                                    }
                                                    j2 = j10;
                                                }
                                                if (c11028l3 == null && !treeMap.isEmpty()) {
                                                    c12420d = c12420d6;
                                                    z5 = false;
                                                    C11028l.C11030b[] c11030bArr3 = (C11028l.C11030b[]) treeMap.values().toArray(new C11028l.C11030b[0]);
                                                    c11028l = new C11028l(str3, c11030bArr3);
                                                    if (c11028l2 == null) {
                                                        c11028l2 = m5324d(str3, c11030bArr3);
                                                    }
                                                } else {
                                                    c12420d = c12420d6;
                                                    z5 = false;
                                                    c11028l = c11028l3;
                                                }
                                                if (c12420d3 != null) {
                                                    c12420d2 = c12420d3;
                                                } else {
                                                    c12420d2 = c12420d;
                                                }
                                                arrayList3.add(new C12416g.C12420d(m5328A, c12420d2, str8, j15, i4, j13, c11028l, str14, m5323e3, j2, j12, z12, arrayList4));
                                                j11 = j13 + j15;
                                                arrayList4 = new ArrayList();
                                                if (i13 != 0) {
                                                    j2 += j12;
                                                }
                                                j10 = j2;
                                                c12413f2 = c12413f;
                                                c12416g2 = c12416g;
                                                str11 = str3;
                                                c11028l3 = c11028l;
                                                z8 = z5;
                                                z12 = z8 ? 1 : 0;
                                                str9 = str14;
                                                j13 = j11;
                                                z10 = z3;
                                                j12 = -1;
                                                arrayList5 = arrayList2;
                                                str8 = str2;
                                                j15 = 0;
                                                c12418b2 = c12418b;
                                                str10 = str4;
                                                str7 = str8;
                                                hashMap4 = hashMap;
                                            } else {
                                                j = j20;
                                            }
                                        }
                                    }
                                    z2 = false;
                                    j14 = j;
                                    str11 = str3;
                                    z8 = z2;
                                    str9 = str14;
                                    z10 = z3;
                                    arrayList5 = arrayList2;
                                    c12413f2 = c12413f;
                                    c12416g2 = c12416g;
                                    c12418b2 = c12418b;
                                    str10 = str4;
                                    str7 = str2;
                                    hashMap4 = hashMap;
                                }
                                c12413f2 = c12413f;
                                c12416g2 = c12416g;
                                str11 = str3;
                                str9 = str14;
                                str10 = str15;
                                str7 = str2;
                                hashMap4 = hashMap;
                            }
                        }
                        z8 = false;
                    }
                    j = j14;
                    str4 = str15;
                    z2 = false;
                    z3 = z10;
                    j14 = j;
                    str11 = str3;
                    z8 = z2;
                    str9 = str14;
                    z10 = z3;
                    arrayList5 = arrayList2;
                    c12413f2 = c12413f;
                    c12416g2 = c12416g;
                    c12418b2 = c12418b;
                    str10 = str4;
                    str7 = str2;
                    hashMap4 = hashMap;
                }
                str9 = str14;
                str10 = str15;
                z8 = false;
            }
        }
        ArrayList arrayList7 = arrayList5;
        boolean z15 = z8 ? 1 : 0;
        HashMap hashMap6 = hashMap4;
        C12416g.C12418b c12418b4 = c12418b2;
        boolean z16 = z10;
        if (c12418b4 != null) {
            arrayList4.add(c12418b4);
        }
        if (j6 != 0) {
            arrayList = arrayList4;
            z = true;
        } else {
            arrayList = arrayList4;
            z = z15;
        }
        return new C12416g(i2, str, arrayList7, j5, j6, z16, i3, j7, i5, j8, j9, z9, z11, z, c11028l2, arrayList3, arrayList, c12422f2, hashMap6);
    }

    /* renamed from: q */
    private static boolean m5311q(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return z;
    }

    /* renamed from: r */
    private static double m5310r(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Double.parseDouble((String) C9149a.m16448e(matcher.group(1)));
        }
        return d;
    }

    /* renamed from: s */
    private static int m5309s(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt((String) C9149a.m16448e(matcher.group(1)));
        }
        return i;
    }

    /* renamed from: t */
    private static long m5308t(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Long.parseLong((String) C9149a.m16448e(matcher.group(1)));
        }
        return j;
    }

    /* renamed from: u */
    private static String m5307u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) C9149a.m16448e(matcher.group(1));
        }
        if (!map.isEmpty() && str2 != null) {
            return m5328A(str2, map);
        }
        return str2;
    }

    /* renamed from: v */
    private static String m5306v(String str, Pattern pattern, Map<String, String> map) {
        return m5307u(str, pattern, null, map);
    }

    /* renamed from: w */
    private static int m5305w(String str, Map<String, String> map) {
        String m5306v = m5306v(str, f32331R, map);
        int i = 0;
        if (TextUtils.isEmpty(m5306v)) {
            return 0;
        }
        String[] m16286N0 = C9191p0.m16286N0(m5306v, ",");
        if (C9191p0.m16223t(m16286N0, "public.accessibility.describes-video")) {
            i = 512;
        }
        if (C9191p0.m16223t(m16286N0, "public.accessibility.transcribes-spoken-dialog")) {
            i |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        }
        if (C9191p0.m16223t(m16286N0, "public.accessibility.describes-music-and-sound")) {
            i |= 1024;
        }
        if (C9191p0.m16223t(m16286N0, "public.easy-to-read")) {
            return i | 8192;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* renamed from: x */
    private static int m5304x(String str) {
        boolean m5311q = m5311q(str, f32334U, false);
        ?? r0 = m5311q;
        if (m5311q(str, f32335V, false)) {
            r0 = (m5311q ? 1 : 0) | true;
        }
        if (m5311q(str, f32333T, false)) {
            return r0 | 4;
        }
        return r0;
    }

    /* renamed from: y */
    private static C12416g.C12422f m5303y(String str) {
        long j;
        long j2;
        double m5310r = m5310r(str, f32356r, -9.223372036854776E18d);
        long j3 = -9223372036854775807L;
        if (m5310r == -9.223372036854776E18d) {
            j = -9223372036854775807L;
        } else {
            j = (long) (m5310r * 1000000.0d);
        }
        boolean m5311q = m5311q(str, f32357s, false);
        double m5310r2 = m5310r(str, f32359u, -9.223372036854776E18d);
        if (m5310r2 == -9.223372036854776E18d) {
            j2 = -9223372036854775807L;
        } else {
            j2 = (long) (m5310r2 * 1000000.0d);
        }
        double m5310r3 = m5310r(str, f32360v, -9.223372036854776E18d);
        if (m5310r3 != -9.223372036854776E18d) {
            j3 = (long) (m5310r3 * 1000000.0d);
        }
        return new C12416g.C12422f(j, m5311q, j2, j3, m5311q(str, f32361w, false));
    }

    /* renamed from: z */
    private static String m5302z(String str, Pattern pattern, Map<String, String> map) {
        String m5306v = m5306v(str, pattern, map);
        if (m5306v != null) {
            return m5306v;
        }
        throw new C7402m("Couldn't match " + pattern.pattern() + " in " + str);
    }

    @Override // com.google.android.exoplayer2.upstream.C4559i.InterfaceC4560a
    /* renamed from: i */
    public AbstractC12423h mo3724a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (m5326b(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (trim.startsWith("#EXT-X-STREAM-INF")) {
                                arrayDeque.add(trim);
                                return m5313o(new C12426b(arrayDeque, bufferedReader), uri.toString());
                            } else if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                break;
                            } else {
                                arrayDeque.add(trim);
                            }
                        }
                    } else {
                        C9191p0.m16233o(bufferedReader);
                        throw new C7402m("Failed to parse the playlist, could not identify any tags.");
                    }
                }
                arrayDeque.add(trim);
                return m5312p(this.f32365a, this.f32366b, new C12426b(arrayDeque, bufferedReader), uri.toString());
            }
            throw new C10347t0("Input does not start with the #EXTM3U header.", uri);
        } finally {
            C9191p0.m16233o(bufferedReader);
        }
    }

    public C12424i(C12413f c12413f, C12416g c12416g) {
        this.f32365a = c12413f;
        this.f32366b = c12416g;
    }
}

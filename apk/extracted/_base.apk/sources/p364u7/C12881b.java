package p364u7;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.C4559i;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p151i6.C7402m;
import p193k6.C9062a;
import p195k8.C9149a;
import p195k8.C9157d;
import p195k8.C9191p0;
import p259o6.C11028l;
import p364u7.C12878a;
import p418x6.C13715l;
import p418x6.C13721p;

/* renamed from: u7.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12881b implements C4559i.InterfaceC4560a<C12878a> {

    /* renamed from: a */
    private final XmlPullParserFactory f33547a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u7.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC12882a {

        /* renamed from: a */
        private final String f33548a;

        /* renamed from: b */
        private final String f33549b;

        /* renamed from: c */
        private final AbstractC12882a f33550c;

        /* renamed from: d */
        private final List<Pair<String, Object>> f33551d = new LinkedList();

        public AbstractC12882a(AbstractC12882a abstractC12882a, String str, String str2) {
            this.f33550c = abstractC12882a;
            this.f33548a = str;
            this.f33549b = str2;
        }

        /* renamed from: e */
        private AbstractC12882a m3721e(AbstractC12882a abstractC12882a, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new C12885d(abstractC12882a, str2);
            }
            if ("Protection".equals(str)) {
                return new C12884c(abstractC12882a, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new C12887f(abstractC12882a, str2);
            }
            return null;
        }

        /* renamed from: a */
        protected void mo3704a(Object obj) {
        }

        /* renamed from: b */
        protected abstract Object mo3703b();

        /* renamed from: c */
        protected final Object m3722c(String str) {
            for (int i = 0; i < this.f33551d.size(); i++) {
                Pair<String, Object> pair = this.f33551d.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            AbstractC12882a abstractC12882a = this.f33550c;
            if (abstractC12882a == null) {
                return null;
            }
            return abstractC12882a.m3722c(str);
        }

        /* renamed from: d */
        protected boolean mo3702d(String str) {
            return false;
        }

        /* renamed from: f */
        public final Object m3720f(XmlPullParser xmlPullParser) {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType != 1) {
                    if (eventType != 2) {
                        if (eventType != 3) {
                            if (eventType == 4 && z && i == 0) {
                                mo3711o(xmlPullParser);
                            }
                        } else if (!z) {
                            continue;
                        } else if (i > 0) {
                            i--;
                        } else {
                            String name = xmlPullParser.getName();
                            mo3712h(xmlPullParser);
                            if (!mo3702d(name)) {
                                return mo3703b();
                            }
                        }
                    } else {
                        String name2 = xmlPullParser.getName();
                        if (this.f33549b.equals(name2)) {
                            mo3701n(xmlPullParser);
                            z = true;
                        } else if (z) {
                            if (i > 0) {
                                i++;
                            } else if (mo3702d(name2)) {
                                mo3701n(xmlPullParser);
                            } else {
                                AbstractC12882a m3721e = m3721e(this, name2, this.f33548a);
                                if (m3721e == null) {
                                    i = 1;
                                } else {
                                    mo3704a(m3721e.m3720f(xmlPullParser));
                                }
                            }
                        }
                    }
                    xmlPullParser.next();
                } else {
                    return null;
                }
            }
        }

        /* renamed from: g */
        protected final boolean m3719g(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return Boolean.parseBoolean(attributeValue);
            }
            return z;
        }

        /* renamed from: h */
        protected void mo3712h(XmlPullParser xmlPullParser) {
        }

        /* renamed from: i */
        protected final int m3718i(XmlPullParser xmlPullParser, String str, int i) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e) {
                    throw new C7402m(e);
                }
            }
            return i;
        }

        /* renamed from: j */
        protected final long m3717j(XmlPullParser xmlPullParser, String str, long j) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e) {
                    throw new C7402m(e);
                }
            }
            return j;
        }

        /* renamed from: k */
        protected final int m3716k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e) {
                    throw new C7402m(e);
                }
            }
            throw new C12883b(str);
        }

        /* renamed from: l */
        protected final long m3715l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e) {
                    throw new C7402m(e);
                }
            }
            throw new C12883b(str);
        }

        /* renamed from: m */
        protected final String m3714m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C12883b(str);
        }

        /* renamed from: n */
        protected abstract void mo3701n(XmlPullParser xmlPullParser);

        /* renamed from: o */
        protected void mo3711o(XmlPullParser xmlPullParser) {
        }

        /* renamed from: p */
        protected final void m3713p(String str, Object obj) {
            this.f33551d.add(Pair.create(str, obj));
        }
    }

    /* renamed from: u7.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C12883b extends C7402m {
        public C12883b(String str) {
            super("Missing required field: " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u7.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C12884c extends AbstractC12882a {

        /* renamed from: e */
        private boolean f33552e;

        /* renamed from: f */
        private UUID f33553f;

        /* renamed from: g */
        private byte[] f33554g;

        public C12884c(AbstractC12882a abstractC12882a, String str) {
            super(abstractC12882a, str, "Protection");
        }

        /* renamed from: q */
        private static C13721p[] m3710q(byte[] bArr) {
            return new C13721p[]{new C13721p(true, null, 8, m3709r(bArr), 0, 0, null)};
        }

        /* renamed from: r */
        private static byte[] m3709r(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < bArr.length; i += 2) {
                sb2.append((char) bArr[i]);
            }
            String sb3 = sb2.toString();
            byte[] decode = Base64.decode(sb3.substring(sb3.indexOf("<KID>") + 5, sb3.indexOf("</KID>")), 0);
            m3707t(decode, 0, 3);
            m3707t(decode, 1, 2);
            m3707t(decode, 4, 5);
            m3707t(decode, 6, 7);
            return decode;
        }

        /* renamed from: s */
        private static String m3708s(String str) {
            if (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') {
                return str.substring(1, str.length() - 1);
            }
            return str;
        }

        /* renamed from: t */
        private static void m3707t(byte[] bArr, int i, int i2) {
            byte b = bArr[i];
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }

        @Override // p364u7.C12881b.AbstractC12882a
        /* renamed from: b */
        public Object mo3703b() {
            UUID uuid = this.f33553f;
            return new C12878a.C12879a(uuid, C13715l.m1667a(uuid, this.f33554g), m3710q(this.f33554g));
        }

        @Override // p364u7.C12881b.AbstractC12882a
        /* renamed from: d */
        public boolean mo3702d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // p364u7.C12881b.AbstractC12882a
        /* renamed from: h */
        public void mo3712h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f33552e = false;
            }
        }

        @Override // p364u7.C12881b.AbstractC12882a
        /* renamed from: n */
        public void mo3701n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f33552e = true;
                this.f33553f = UUID.fromString(m3708s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // p364u7.C12881b.AbstractC12882a
        /* renamed from: o */
        public void mo3711o(XmlPullParser xmlPullParser) {
            if (this.f33552e) {
                this.f33554g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u7.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C12885d extends AbstractC12882a {

        /* renamed from: e */
        private Format f33555e;

        public C12885d(AbstractC12882a abstractC12882a, String str) {
            super(abstractC12882a, str, "QualityLevel");
        }

        /* renamed from: q */
        private static List<byte[]> m3706q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] m16297I = C9191p0.m16297I(str);
                byte[][] m16423i = C9157d.m16423i(m16297I);
                if (m16423i == null) {
                    arrayList.add(m16297I);
                } else {
                    Collections.addAll(arrayList, m16423i);
                }
            }
            return arrayList;
        }

        /* renamed from: r */
        private static String m3705r(String str) {
            if (!str.equalsIgnoreCase("H264") && !str.equalsIgnoreCase("X264") && !str.equalsIgnoreCase("AVC1") && !str.equalsIgnoreCase("DAVC")) {
                if (!str.equalsIgnoreCase("AAC") && !str.equalsIgnoreCase("AACL") && !str.equalsIgnoreCase("AACH") && !str.equalsIgnoreCase("AACP")) {
                    if (!str.equalsIgnoreCase("TTML") && !str.equalsIgnoreCase("DFXP")) {
                        if (!str.equalsIgnoreCase("ac-3") && !str.equalsIgnoreCase("dac3")) {
                            if (!str.equalsIgnoreCase("ec-3") && !str.equalsIgnoreCase("dec3")) {
                                if (str.equalsIgnoreCase("dtsc")) {
                                    return "audio/vnd.dts";
                                }
                                if (!str.equalsIgnoreCase("dtsh") && !str.equalsIgnoreCase("dtsl")) {
                                    if (str.equalsIgnoreCase("dtse")) {
                                        return "audio/vnd.dts.hd;profile=lbr";
                                    }
                                    if (str.equalsIgnoreCase("opus")) {
                                        return "audio/opus";
                                    }
                                    return null;
                                }
                                return "audio/vnd.dts.hd";
                            }
                            return "audio/eac3";
                        }
                        return "audio/ac3";
                    }
                    return "application/ttml+xml";
                }
                return "audio/mp4a-latm";
            }
            return "video/avc";
        }

        @Override // p364u7.C12881b.AbstractC12882a
        /* renamed from: b */
        public Object mo3703b() {
            return this.f33555e;
        }

        @Override // p364u7.C12881b.AbstractC12882a
        /* renamed from: n */
        public void mo3701n(XmlPullParser xmlPullParser) {
            int i;
            Format.C4362b c4362b = new Format.C4362b();
            String m3705r = m3705r(m3714m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) m3722c("Type")).intValue();
            if (intValue == 2) {
                c4362b.m29908K("video/mp4").m29873j0(m3716k(xmlPullParser, "MaxWidth")).m29902Q(m3716k(xmlPullParser, "MaxHeight")).m29899T(m3706q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (intValue == 1) {
                if (m3705r == null) {
                    m3705r = "audio/mp4a-latm";
                }
                int m3716k = m3716k(xmlPullParser, "Channels");
                int m3716k2 = m3716k(xmlPullParser, "SamplingRate");
                List<byte[]> m3706q = m3706q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (m3706q.isEmpty() && "audio/mp4a-latm".equals(m3705r)) {
                    m3706q = Collections.singletonList(C9062a.m16788a(m3716k2, m3716k));
                }
                c4362b.m29908K("audio/mp4").m29911H(m3716k).m29881f0(m3716k2).m29899T(m3706q);
            } else if (intValue == 3) {
                String str = (String) m3722c("Subtype");
                if (str != null) {
                    if (!str.equals("CAPT")) {
                        if (str.equals("DESC")) {
                            i = 1024;
                        }
                    } else {
                        i = 64;
                    }
                    c4362b.m29908K("application/mp4").m29887c0(i);
                }
                i = 0;
                c4362b.m29908K("application/mp4").m29887c0(i);
            } else {
                c4362b.m29908K("application/mp4");
            }
            this.f33555e = c4362b.m29900S(xmlPullParser.getAttributeValue(null, "Index")).m29898U((String) m3722c("Name")).m29883e0(m3705r).m29912G(m3716k(xmlPullParser, "Bitrate")).m29897V((String) m3722c("Language")).m29914E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u7.b$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C12886e extends AbstractC12882a {

        /* renamed from: e */
        private final List<C12878a.C12880b> f33556e;

        /* renamed from: f */
        private int f33557f;

        /* renamed from: g */
        private int f33558g;

        /* renamed from: h */
        private long f33559h;

        /* renamed from: i */
        private long f33560i;

        /* renamed from: j */
        private long f33561j;

        /* renamed from: k */
        private int f33562k;

        /* renamed from: l */
        private boolean f33563l;

        /* renamed from: m */
        private C12878a.C12879a f33564m;

        public C12886e(AbstractC12882a abstractC12882a, String str) {
            super(abstractC12882a, str, "SmoothStreamingMedia");
            this.f33562k = -1;
            this.f33564m = null;
            this.f33556e = new LinkedList();
        }

        @Override // p364u7.C12881b.AbstractC12882a
        /* renamed from: a */
        public void mo3704a(Object obj) {
            boolean z;
            if (obj instanceof C12878a.C12880b) {
                this.f33556e.add((C12878a.C12880b) obj);
            } else if (obj instanceof C12878a.C12879a) {
                if (this.f33564m == null) {
                    z = true;
                } else {
                    z = false;
                }
                C9149a.m16447f(z);
                this.f33564m = (C12878a.C12879a) obj;
            }
        }

        @Override // p364u7.C12881b.AbstractC12882a
        /* renamed from: b */
        public Object mo3703b() {
            int size = this.f33556e.size();
            C12878a.C12880b[] c12880bArr = new C12878a.C12880b[size];
            this.f33556e.toArray(c12880bArr);
            if (this.f33564m != null) {
                C12878a.C12879a c12879a = this.f33564m;
                C11028l c11028l = new C11028l(new C11028l.C11030b(c12879a.f33528a, "video/mp4", c12879a.f33529b));
                for (int i = 0; i < size; i++) {
                    C12878a.C12880b c12880b = c12880bArr[i];
                    int i2 = c12880b.f33531a;
                    if (i2 == 2 || i2 == 1) {
                        Format[] formatArr = c12880b.f33540j;
                        for (int i3 = 0; i3 < formatArr.length; i3++) {
                            formatArr[i3] = formatArr[i3].m29926a().m29907L(c11028l).m29914E();
                        }
                    }
                }
            }
            return new C12878a(this.f33557f, this.f33558g, this.f33559h, this.f33560i, this.f33561j, this.f33562k, this.f33563l, this.f33564m, c12880bArr);
        }

        @Override // p364u7.C12881b.AbstractC12882a
        /* renamed from: n */
        public void mo3701n(XmlPullParser xmlPullParser) {
            this.f33557f = m3716k(xmlPullParser, "MajorVersion");
            this.f33558g = m3716k(xmlPullParser, "MinorVersion");
            this.f33559h = m3717j(xmlPullParser, "TimeScale", 10000000L);
            this.f33560i = m3715l(xmlPullParser, "Duration");
            this.f33561j = m3717j(xmlPullParser, "DVRWindowLength", 0L);
            this.f33562k = m3718i(xmlPullParser, "LookaheadCount", -1);
            this.f33563l = m3719g(xmlPullParser, "IsLive", false);
            m3713p("TimeScale", Long.valueOf(this.f33559h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u7.b$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C12887f extends AbstractC12882a {

        /* renamed from: e */
        private final String f33565e;

        /* renamed from: f */
        private final List<Format> f33566f;

        /* renamed from: g */
        private int f33567g;

        /* renamed from: h */
        private String f33568h;

        /* renamed from: i */
        private long f33569i;

        /* renamed from: j */
        private String f33570j;

        /* renamed from: k */
        private String f33571k;

        /* renamed from: l */
        private int f33572l;

        /* renamed from: m */
        private int f33573m;

        /* renamed from: n */
        private int f33574n;

        /* renamed from: o */
        private int f33575o;

        /* renamed from: p */
        private String f33576p;

        /* renamed from: q */
        private ArrayList<Long> f33577q;

        /* renamed from: r */
        private long f33578r;

        public C12887f(AbstractC12882a abstractC12882a, String str) {
            super(abstractC12882a, str, "StreamIndex");
            this.f33565e = str;
            this.f33566f = new LinkedList();
        }

        /* renamed from: q */
        private void m3700q(XmlPullParser xmlPullParser) {
            int m3698s = m3698s(xmlPullParser);
            this.f33567g = m3698s;
            m3713p("Type", Integer.valueOf(m3698s));
            if (this.f33567g == 3) {
                this.f33568h = m3714m(xmlPullParser, "Subtype");
            } else {
                this.f33568h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            m3713p("Subtype", this.f33568h);
            this.f33570j = xmlPullParser.getAttributeValue(null, "Name");
            this.f33571k = m3714m(xmlPullParser, "Url");
            this.f33572l = m3718i(xmlPullParser, "MaxWidth", -1);
            this.f33573m = m3718i(xmlPullParser, "MaxHeight", -1);
            this.f33574n = m3718i(xmlPullParser, "DisplayWidth", -1);
            this.f33575o = m3718i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Language");
            this.f33576p = attributeValue;
            m3713p("Language", attributeValue);
            long m3718i = m3718i(xmlPullParser, "TimeScale", -1);
            this.f33569i = m3718i;
            if (m3718i == -1) {
                this.f33569i = ((Long) m3722c("TimeScale")).longValue();
            }
            this.f33577q = new ArrayList<>();
        }

        /* renamed from: r */
        private void m3699r(XmlPullParser xmlPullParser) {
            int size = this.f33577q.size();
            long m3717j = m3717j(xmlPullParser, "t", -9223372036854775807L);
            int i = 1;
            if (m3717j == -9223372036854775807L) {
                if (size == 0) {
                    m3717j = 0;
                } else if (this.f33578r != -1) {
                    m3717j = this.f33578r + this.f33577q.get(size - 1).longValue();
                } else {
                    throw new C7402m("Unable to infer start time");
                }
            }
            this.f33577q.add(Long.valueOf(m3717j));
            this.f33578r = m3717j(xmlPullParser, "d", -9223372036854775807L);
            long m3717j2 = m3717j(xmlPullParser, "r", 1L);
            if (m3717j2 > 1 && this.f33578r == -9223372036854775807L) {
                throw new C7402m("Repeated chunk with unspecified duration");
            }
            while (true) {
                long j = i;
                if (j < m3717j2) {
                    this.f33577q.add(Long.valueOf((this.f33578r * j) + m3717j));
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: s */
        private int m3698s(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue != null) {
                if (MediaStreamTrack.AUDIO_TRACK_KIND.equalsIgnoreCase(attributeValue)) {
                    return 1;
                }
                if (MediaStreamTrack.VIDEO_TRACK_KIND.equalsIgnoreCase(attributeValue)) {
                    return 2;
                }
                if ("text".equalsIgnoreCase(attributeValue)) {
                    return 3;
                }
                throw new C7402m("Invalid key value[" + attributeValue + "]");
            }
            throw new C12883b("Type");
        }

        @Override // p364u7.C12881b.AbstractC12882a
        /* renamed from: a */
        public void mo3704a(Object obj) {
            if (obj instanceof Format) {
                this.f33566f.add((Format) obj);
            }
        }

        @Override // p364u7.C12881b.AbstractC12882a
        /* renamed from: b */
        public Object mo3703b() {
            Format[] formatArr = new Format[this.f33566f.size()];
            this.f33566f.toArray(formatArr);
            return new C12878a.C12880b(this.f33565e, this.f33571k, this.f33567g, this.f33568h, this.f33569i, this.f33570j, this.f33572l, this.f33573m, this.f33574n, this.f33575o, this.f33576p, formatArr, this.f33577q, this.f33578r);
        }

        @Override // p364u7.C12881b.AbstractC12882a
        /* renamed from: d */
        public boolean mo3702d(String str) {
            return "c".equals(str);
        }

        @Override // p364u7.C12881b.AbstractC12882a
        /* renamed from: n */
        public void mo3701n(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                m3699r(xmlPullParser);
            } else {
                m3700q(xmlPullParser);
            }
        }
    }

    public C12881b() {
        try {
            this.f33547a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C4559i.InterfaceC4560a
    /* renamed from: b */
    public C12878a mo3724a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f33547a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (C12878a) new C12886e(null, uri.toString()).m3720f(newPullParser);
        } catch (XmlPullParserException e) {
            throw new C7402m(e);
        }
    }
}

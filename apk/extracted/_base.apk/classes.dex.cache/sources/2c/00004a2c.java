package p297q7;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.nearby.NearbyManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.TouchesHelper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.C4559i;
import gb.AbstractC6693s;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p098f7.C6314a;
import p102fb.C6368b;
import p102fb.C6374d;
import p151i6.C7390b;
import p151i6.C7402m;
import p195k8.C9149a;
import p195k8.C9187n0;
import p195k8.C9191p0;
import p195k8.C9196q0;
import p195k8.C9197r;
import p195k8.C9200u;
import p259o6.C11028l;
import p297q7.AbstractC11783j;

/* renamed from: q7.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11772c extends DefaultHandler implements C4559i.InterfaceC4560a<C11771b> {

    /* renamed from: b */
    private static final Pattern f30695b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c */
    private static final Pattern f30696c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d */
    private static final Pattern f30697d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e */
    private static final int[] f30698e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a */
    private final XmlPullParserFactory f30699a;

    /* renamed from: q7.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11773a {

        /* renamed from: a */
        public final Format f30700a;

        /* renamed from: b */
        public final String f30701b;

        /* renamed from: c */
        public final AbstractC11783j f30702c;

        /* renamed from: d */
        public final String f30703d;

        /* renamed from: e */
        public final ArrayList<C11028l.C11030b> f30704e;

        /* renamed from: f */
        public final ArrayList<C11774d> f30705f;

        /* renamed from: g */
        public final long f30706g;

        public C11773a(Format format, String str, AbstractC11783j abstractC11783j, String str2, ArrayList<C11028l.C11030b> arrayList, ArrayList<C11774d> arrayList2, long j) {
            this.f30700a = format;
            this.f30701b = str;
            this.f30702c = abstractC11783j;
            this.f30703d = str2;
            this.f30704e = arrayList;
            this.f30705f = arrayList2;
            this.f30706g = j;
        }
    }

    public C11772c() {
        try {
            this.f30699a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: B */
    protected static int m6950B(List<C11774d> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            C11774d c11774d = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(c11774d.f30707a) && (str = c11774d.f30708b) != null) {
                Matcher matcher = f30696c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                C9197r.m16178h("MpdParser", "Unable to parse CEA-608 channel number from: " + c11774d.f30708b);
            }
        }
        return -1;
    }

    /* renamed from: C */
    protected static int m6949C(List<C11774d> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            C11774d c11774d = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(c11774d.f30707a) && (str = c11774d.f30708b) != null) {
                Matcher matcher = f30697d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                C9197r.m16178h("MpdParser", "Unable to parse CEA-708 service block number from: " + c11774d.f30708b);
            }
        }
        return -1;
    }

    /* renamed from: F */
    protected static long m6946F(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        return C9191p0.m16306D0(attributeValue);
    }

    /* renamed from: G */
    protected static C11774d m6945G(XmlPullParser xmlPullParser, String str) {
        String m6901m0 = m6901m0(xmlPullParser, "schemeIdUri", "");
        String m6901m02 = m6901m0(xmlPullParser, "value", null);
        String m6901m03 = m6901m0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!C9196q0.m16190d(xmlPullParser, str));
        return new C11774d(m6901m0, m6901m02, m6901m03);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: H */
    protected static int m6944H(XmlPullParser xmlPullParser) {
        char c;
        String m16272U0 = C9191p0.m16272U0(xmlPullParser.getAttributeValue(null, "value"));
        if (m16272U0 == null) {
            return -1;
        }
        switch (m16272U0.hashCode()) {
            case 1596796:
                if (m16272U0.equals("4000")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2937391:
                if (m16272U0.equals("a000")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3094035:
                if (m16272U0.equals("f801")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3133436:
                if (m16272U0.equals("fa01")) {
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
                return 1;
            case 1:
                return 2;
            case 2:
                return 6;
            case 3:
                return 8;
            default:
                return -1;
        }
    }

    /* renamed from: I */
    protected static long m6943I(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        return C9191p0.m16304E0(attributeValue);
    }

    /* renamed from: J */
    protected static String m6942J(List<C11774d> list) {
        for (int i = 0; i < list.size(); i++) {
            C11774d c11774d = list.get(i);
            String str = c11774d.f30707a;
            if (!"tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) || !"JOC".equals(c11774d.f30708b)) {
                if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(c11774d.f30708b)) {
                    return "audio/eac3-joc";
                }
            } else {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    /* renamed from: N */
    protected static float m6938N(XmlPullParser xmlPullParser, String str, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Float.parseFloat(attributeValue);
        }
        return f;
    }

    /* renamed from: O */
    protected static float m6937O(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f30695b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                String group = matcher.group(2);
                if (!TextUtils.isEmpty(group)) {
                    return parseInt / Integer.parseInt(group);
                }
                return parseInt;
            }
            return f;
        }
        return f;
    }

    /* renamed from: Q */
    protected static int m6935Q(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Integer.parseInt(attributeValue);
        }
        return i;
    }

    /* renamed from: S */
    protected static long m6933S(List<C11774d> list) {
        for (int i = 0; i < list.size(); i++) {
            C11774d c11774d = list.get(i);
            if (C6368b.m22854a("http://dashif.org/guidelines/last-segment-number", c11774d.f30707a)) {
                return Long.parseLong(c11774d.f30708b);
            }
        }
        return -1L;
    }

    /* renamed from: T */
    protected static long m6932T(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Long.parseLong(attributeValue);
        }
        return j;
    }

    /* renamed from: V */
    protected static int m6930V(XmlPullParser xmlPullParser) {
        int m6935Q = m6935Q(xmlPullParser, "value", -1);
        if (m6935Q < 0) {
            return -1;
        }
        int[] iArr = f30698e;
        if (m6935Q >= iArr.length) {
            return -1;
        }
        return iArr[m6935Q];
    }

    /* renamed from: b */
    private long m6924b(List<AbstractC11783j.C11787d> list, long j, long j2, int i, long j3) {
        int m16237m;
        if (i >= 0) {
            m16237m = i + 1;
        } else {
            m16237m = (int) C9191p0.m16237m(j3 - j, j2);
        }
        for (int i2 = 0; i2 < m16237m; i2++) {
            list.add(m6902m(j, j2));
            j += j2;
        }
        return j;
    }

    /* renamed from: m0 */
    protected static String m6901m0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* renamed from: n0 */
    protected static String m6899n0(XmlPullParser xmlPullParser, String str) {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                m6889u(xmlPullParser);
            }
        } while (!C9196q0.m16190d(xmlPullParser, str));
        return str2;
    }

    /* renamed from: p */
    private static int m6896p(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        C9149a.m16447f(i == i2);
        return i;
    }

    /* renamed from: q */
    private static String m6894q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        C9149a.m16447f(str.equals(str2));
        return str;
    }

    /* renamed from: r */
    private static void m6892r(ArrayList<C11028l.C11030b> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C11028l.C11030b c11030b = arrayList.get(size);
            if (!c11030b.m9311d()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (arrayList.get(i).m9313a(c11030b)) {
                        arrayList.remove(size);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    /* renamed from: s */
    private static long m6891s(long j, long j2) {
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: t */
    private static String m6890t(String str, String str2) {
        if (C9200u.m16154p(str)) {
            return C9200u.m16167c(str2);
        }
        if (C9200u.m16151s(str)) {
            return C9200u.m16155o(str2);
        }
        if (C9200u.m16152r(str)) {
            if ("application/x-rawcc".equals(str)) {
                return C9200u.m16160j(str2);
            }
            return str;
        } else if ("application/mp4".equals(str)) {
            String m16163g = C9200u.m16163g(str2);
            if ("text/vtt".equals(m16163g)) {
                return "application/x-mp4-vtt";
            }
            return m16163g;
        } else {
            return null;
        }
    }

    /* renamed from: u */
    public static void m6889u(XmlPullParser xmlPullParser) {
        if (!C9196q0.m16189e(xmlPullParser)) {
            return;
        }
        int i = 1;
        while (i != 0) {
            xmlPullParser.next();
            if (C9196q0.m16189e(xmlPullParser)) {
                i++;
            } else if (C9196q0.m16191c(xmlPullParser)) {
                i--;
            }
        }
    }

    /* renamed from: A */
    protected String m6951A(XmlPullParser xmlPullParser, String str) {
        return C9187n0.m16315c(str, m6899n0(xmlPullParser, "BaseURL"));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00f7  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected android.util.Pair<java.lang.String, p259o6.C11028l.C11030b> m6948D(org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p297q7.C11772c.m6948D(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: E */
    protected int m6947E(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue)) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(attributeValue)) {
            return 2;
        }
        if (!"text".equals(attributeValue)) {
            return -1;
        }
        return 3;
    }

    /* renamed from: K */
    protected Pair<Long, C6314a> m6941K(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) {
        long m6932T = m6932T(xmlPullParser, "id", 0L);
        long m6932T2 = m6932T(xmlPullParser, "duration", -9223372036854775807L);
        long m6932T3 = m6932T(xmlPullParser, "presentationTime", 0L);
        long m16296I0 = C9191p0.m16296I0(m6932T2, 1000L, j);
        long m16296I02 = C9191p0.m16296I0(m6932T3, 1000000L, j);
        String m6901m0 = m6901m0(xmlPullParser, "messageData", null);
        byte[] m6940L = m6940L(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(m16296I02);
        if (m6901m0 != null) {
            m6940L = C9191p0.m16238l0(m6901m0);
        }
        return Pair.create(valueOf, m6920d(str, str2, m6932T, m16296I0, m6940L));
    }

    /* renamed from: L */
    protected byte[] m6940L(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, C6374d.f18023c.name());
        xmlPullParser.nextToken();
        while (!C9196q0.m16190d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: M */
    protected C11775e m6939M(XmlPullParser xmlPullParser) {
        String m6901m0 = m6901m0(xmlPullParser, "schemeIdUri", "");
        String m6901m02 = m6901m0(xmlPullParser, "value", "");
        long m6932T = m6932T(xmlPullParser, "timescale", 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (C9196q0.m16188f(xmlPullParser, "Event")) {
                arrayList.add(m6941K(xmlPullParser, m6901m0, m6901m02, m6932T, byteArrayOutputStream));
            } else {
                m6889u(xmlPullParser);
            }
        } while (!C9196q0.m16190d(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        C6314a[] c6314aArr = new C6314a[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            c6314aArr[i] = (C6314a) pair.second;
        }
        return m6918e(m6901m0, m6901m02, m6932T, jArr, c6314aArr);
    }

    /* renamed from: P */
    protected C11778h m6936P(XmlPullParser xmlPullParser) {
        return m6927Y(xmlPullParser, "sourceURL", "range");
    }

    /* renamed from: R */
    protected String m6934R(XmlPullParser xmlPullParser) {
        return m6899n0(xmlPullParser, "Label");
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0197  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected p297q7.C11771b m6931U(org.xmlpull.v1.XmlPullParser r43, java.lang.String r44) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p297q7.C11772c.m6931U(org.xmlpull.v1.XmlPullParser, java.lang.String):q7.b");
    }

    /* renamed from: W */
    protected Pair<C11776f, Long> m6929W(XmlPullParser xmlPullParser, String str, long j, long j2, long j3, long j4) {
        long j5;
        long j6;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        long j7;
        AbstractC11783j m6913g0;
        C11772c c11772c = this;
        Object obj2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        long m6943I = m6943I(xmlPullParser, ViewProps.START, j);
        long j8 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            j5 = j3 + m6943I;
        } else {
            j5 = -9223372036854775807L;
        }
        long m6943I2 = m6943I(xmlPullParser, "duration", -9223372036854775807L);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String str3 = str;
        long j9 = j2;
        boolean z = false;
        long j10 = -9223372036854775807L;
        AbstractC11783j.C11788e c11788e = null;
        C11774d c11774d = null;
        while (true) {
            xmlPullParser.next();
            if (C9196q0.m16188f(xmlPullParser, "BaseURL")) {
                if (!z) {
                    j9 = c11772c.m6884z(xmlPullParser, j9);
                    str3 = c11772c.m6951A(xmlPullParser, str3);
                    z = true;
                    arrayList2 = arrayList4;
                    j7 = j8;
                    obj = obj2;
                    arrayList = arrayList3;
                } else {
                    j6 = j9;
                    arrayList2 = arrayList4;
                    str2 = str3;
                    j7 = j8;
                    obj = obj2;
                    arrayList = arrayList3;
                    j9 = j6;
                    str3 = str2;
                }
            } else {
                if (C9196q0.m16188f(xmlPullParser, "AdaptationSet")) {
                    j6 = j9;
                    str2 = str3;
                    arrayList = arrayList3;
                    arrayList.add(m6887w(xmlPullParser, str3, c11788e, m6943I2, j9, j10, j5, j4));
                    arrayList2 = arrayList4;
                } else {
                    j6 = j9;
                    ArrayList arrayList5 = arrayList4;
                    str2 = str3;
                    arrayList = arrayList3;
                    if (C9196q0.m16188f(xmlPullParser, "EventStream")) {
                        arrayList5.add(m6939M(xmlPullParser));
                        arrayList2 = arrayList5;
                    } else if (C9196q0.m16188f(xmlPullParser, "SegmentBase")) {
                        arrayList2 = arrayList5;
                        c11788e = m6917e0(xmlPullParser, null);
                        obj = null;
                        j9 = j6;
                        str3 = str2;
                        j7 = -9223372036854775807L;
                    } else {
                        arrayList2 = arrayList5;
                        if (C9196q0.m16188f(xmlPullParser, "SegmentList")) {
                            long m6884z = m6884z(xmlPullParser, -9223372036854775807L);
                            obj = null;
                            m6913g0 = m6915f0(xmlPullParser, null, j5, m6943I2, j6, m6884z, j4);
                            j10 = m6884z;
                            j9 = j6;
                            str3 = str2;
                            j7 = -9223372036854775807L;
                        } else {
                            obj = null;
                            if (C9196q0.m16188f(xmlPullParser, "SegmentTemplate")) {
                                long m6884z2 = m6884z(xmlPullParser, -9223372036854775807L);
                                j7 = -9223372036854775807L;
                                m6913g0 = m6913g0(xmlPullParser, null, AbstractC6693s.m22131x(), j5, m6943I2, j6, m6884z2, j4);
                                j10 = m6884z2;
                                j9 = j6;
                                str3 = str2;
                            } else {
                                j7 = -9223372036854775807L;
                                if (C9196q0.m16188f(xmlPullParser, "AssetIdentifier")) {
                                    c11774d = m6945G(xmlPullParser, "AssetIdentifier");
                                } else {
                                    m6889u(xmlPullParser);
                                }
                                j9 = j6;
                                str3 = str2;
                            }
                        }
                        c11788e = m6913g0;
                    }
                }
                obj = null;
                j7 = -9223372036854775807L;
                j9 = j6;
                str3 = str2;
            }
            if (C9196q0.m16190d(xmlPullParser, "Period")) {
                return Pair.create(m6912h(attributeValue, m6943I, arrayList, arrayList2, c11774d), Long.valueOf(m6943I2));
            }
            arrayList3 = arrayList;
            obj2 = obj;
            arrayList4 = arrayList2;
            j8 = j7;
            c11772c = this;
        }
    }

    /* renamed from: X */
    protected C11777g m6928X(XmlPullParser xmlPullParser) {
        String str = null;
        String m6901m0 = m6901m0(xmlPullParser, "moreInformationURL", null);
        String m6901m02 = m6901m0(xmlPullParser, "lang", null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (C9196q0.m16188f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (C9196q0.m16188f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (C9196q0.m16188f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                m6889u(xmlPullParser);
            }
            String str4 = str3;
            if (C9196q0.m16190d(xmlPullParser, "ProgramInformation")) {
                return new C11777g(str, str2, str4, m6901m0, m6901m02);
            }
            str3 = str4;
        }
    }

    /* renamed from: Y */
    protected C11778h m6927Y(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
                return m6910i(attributeValue, j, j2);
            }
        } else {
            j = 0;
        }
        j2 = -1;
        return m6910i(attributeValue, j, j2);
    }

    /* renamed from: Z */
    protected C11773a m6926Z(XmlPullParser xmlPullParser, String str, String str2, String str3, int i, int i2, float f, int i3, int i4, String str4, List<C11774d> list, List<C11774d> list2, List<C11774d> list3, List<C11774d> list4, AbstractC11783j abstractC11783j, long j, long j2, long j3, long j4, long j5) {
        long j6;
        String str5;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i5;
        long m6884z;
        AbstractC11783j.C11788e c11788e;
        C11772c c11772c = this;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        int m6935Q = m6935Q(xmlPullParser, "bandwidth", -1);
        String m6901m0 = m6901m0(xmlPullParser, "mimeType", str2);
        String m6901m02 = m6901m0(xmlPullParser, "codecs", str3);
        int m6935Q2 = m6935Q(xmlPullParser, "width", i);
        int m6935Q3 = m6935Q(xmlPullParser, "height", i2);
        float m6937O = m6937O(xmlPullParser, f);
        int m6935Q4 = m6935Q(xmlPullParser, "audioSamplingRate", i4);
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList(list3);
        ArrayList arrayList10 = new ArrayList(list4);
        String str6 = str;
        int i6 = i3;
        long j7 = j3;
        boolean z = false;
        String str7 = null;
        AbstractC11783j abstractC11783j2 = abstractC11783j;
        long j8 = j4;
        while (true) {
            xmlPullParser.next();
            if (!C9196q0.m16188f(xmlPullParser, "BaseURL")) {
                if (C9196q0.m16188f(xmlPullParser, "AudioChannelConfiguration")) {
                    c11788e = abstractC11783j2;
                    str5 = str6;
                    arrayList4 = arrayList7;
                    i5 = m6885y(xmlPullParser);
                } else if (C9196q0.m16188f(xmlPullParser, "SegmentBase")) {
                    AbstractC11783j.C11788e m6917e0 = c11772c.m6917e0(xmlPullParser, (AbstractC11783j.C11788e) abstractC11783j2);
                    str5 = str6;
                    arrayList4 = arrayList7;
                    i5 = i6;
                    c11788e = m6917e0;
                } else {
                    if (C9196q0.m16188f(xmlPullParser, "SegmentList")) {
                        m6884z = c11772c.m6884z(xmlPullParser, j8);
                        j6 = j7;
                        str5 = str6;
                        arrayList = arrayList10;
                        arrayList2 = arrayList8;
                        arrayList3 = arrayList9;
                        abstractC11783j2 = m6915f0(xmlPullParser, (AbstractC11783j.C11785b) abstractC11783j2, j, j2, j6, m6884z, j5);
                        arrayList4 = arrayList7;
                    } else {
                        j6 = j7;
                        str5 = str6;
                        arrayList = arrayList10;
                        arrayList2 = arrayList8;
                        arrayList3 = arrayList9;
                        if (C9196q0.m16188f(xmlPullParser, "SegmentTemplate")) {
                            m6884z = c11772c.m6884z(xmlPullParser, j8);
                            arrayList4 = arrayList7;
                            abstractC11783j2 = m6913g0(xmlPullParser, (AbstractC11783j.C11786c) abstractC11783j2, list4, j, j2, j6, m6884z, j5);
                        } else {
                            arrayList4 = arrayList7;
                            if (C9196q0.m16188f(xmlPullParser, "ContentProtection")) {
                                Pair<String, C11028l.C11030b> m6948D = m6948D(xmlPullParser);
                                Object obj = m6948D.first;
                                if (obj != null) {
                                    str7 = (String) obj;
                                }
                                Object obj2 = m6948D.second;
                                if (obj2 != null) {
                                    arrayList4.add((C11028l.C11030b) obj2);
                                }
                                i5 = i6;
                                j7 = j6;
                                arrayList6 = arrayList;
                                arrayList5 = arrayList2;
                                arrayList9 = arrayList3;
                                c11788e = abstractC11783j2;
                            } else {
                                if (C9196q0.m16188f(xmlPullParser, "InbandEventStream")) {
                                    arrayList5 = arrayList2;
                                    arrayList5.add(m6945G(xmlPullParser, "InbandEventStream"));
                                    arrayList6 = arrayList;
                                    arrayList9 = arrayList3;
                                } else {
                                    arrayList5 = arrayList2;
                                    if (C9196q0.m16188f(xmlPullParser, "EssentialProperty")) {
                                        arrayList9 = arrayList3;
                                        arrayList9.add(m6945G(xmlPullParser, "EssentialProperty"));
                                        arrayList6 = arrayList;
                                    } else {
                                        arrayList9 = arrayList3;
                                        if (C9196q0.m16188f(xmlPullParser, "SupplementalProperty")) {
                                            arrayList6 = arrayList;
                                            arrayList6.add(m6945G(xmlPullParser, "SupplementalProperty"));
                                        } else {
                                            arrayList6 = arrayList;
                                            m6889u(xmlPullParser);
                                        }
                                    }
                                }
                                i5 = i6;
                                j7 = j6;
                                c11788e = abstractC11783j2;
                            }
                        }
                    }
                    i5 = i6;
                    j8 = m6884z;
                    j7 = j6;
                    arrayList6 = arrayList;
                    arrayList5 = arrayList2;
                    arrayList9 = arrayList3;
                    c11788e = abstractC11783j2;
                }
                arrayList5 = arrayList8;
                arrayList6 = arrayList10;
            } else if (z) {
                j6 = j7;
                str5 = str6;
                arrayList4 = arrayList7;
                arrayList5 = arrayList8;
                arrayList6 = arrayList10;
                i5 = i6;
                j7 = j6;
                c11788e = abstractC11783j2;
            } else {
                long m6884z2 = c11772c.m6884z(xmlPullParser, j7);
                str5 = c11772c.m6951A(xmlPullParser, str6);
                z = true;
                arrayList4 = arrayList7;
                i5 = i6;
                c11788e = abstractC11783j2;
                j7 = m6884z2;
                arrayList5 = arrayList8;
                arrayList6 = arrayList10;
            }
            if (C9196q0.m16190d(xmlPullParser, "Representation")) {
                break;
            }
            arrayList10 = arrayList6;
            arrayList8 = arrayList5;
            arrayList7 = arrayList4;
            abstractC11783j2 = c11788e;
            c11772c = this;
            i6 = i5;
            str6 = str5;
        }
        ArrayList arrayList11 = arrayList5;
        Format m6916f = m6916f(attributeValue, m6901m0, m6935Q2, m6935Q3, m6937O, i5, m6935Q4, m6935Q, str4, list, list2, m6901m02, arrayList9, arrayList6);
        if (c11788e == null) {
            c11788e = new AbstractC11783j.C11788e();
        }
        return new C11773a(m6916f, str5, c11788e, str7, arrayList4, arrayList11, -1L);
    }

    /* renamed from: a0 */
    protected int m6925a0(List<C11774d> list) {
        int m6897o0;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C11774d c11774d = list.get(i2);
            if (C6368b.m22854a("urn:mpeg:dash:role:2011", c11774d.f30707a)) {
                m6897o0 = m6923b0(c11774d.f30708b);
            } else if (C6368b.m22854a("urn:tva:metadata:cs:AudioPurposeCS:2007", c11774d.f30707a)) {
                m6897o0 = m6897o0(c11774d.f30708b);
            }
            i |= m6897o0;
        }
        return i;
    }

    /* renamed from: b0 */
    protected int m6923b0(String str) {
        if (str == null) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c = 4;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c = 5;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c = 6;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c = 7;
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c = '\b';
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c = '\t';
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c = '\n';
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 3:
                return 128;
            case 1:
                return 512;
            case 2:
                return RecyclerView.ItemAnimator.FLAG_MOVED;
            case 4:
                return 2;
            case 5:
                return 16;
            case 6:
                return 1;
            case 7:
                return 256;
            case '\b':
                return 64;
            case '\t':
                return 8;
            case '\n':
                return 32;
            case 11:
                return 4;
            default:
                return 0;
        }
    }

    /* renamed from: c */
    protected C11770a m6922c(int i, int i2, List<AbstractC11779i> list, List<C11774d> list2, List<C11774d> list3, List<C11774d> list4) {
        return new C11770a(i, i2, list, list2, list3, list4);
    }

    /* renamed from: c0 */
    protected int m6921c0(List<C11774d> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (C6368b.m22854a("http://dashif.org/guidelines/trickmode", list.get(i2).f30707a)) {
                i |= 16384;
            }
        }
        return i;
    }

    /* renamed from: d */
    protected C6314a m6920d(String str, String str2, long j, long j2, byte[] bArr) {
        return new C6314a(str, str2, j2, j, bArr);
    }

    /* renamed from: d0 */
    protected int m6919d0(List<C11774d> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C11774d c11774d = list.get(i2);
            if (C6368b.m22854a("urn:mpeg:dash:role:2011", c11774d.f30707a)) {
                i |= m6923b0(c11774d.f30708b);
            }
        }
        return i;
    }

    /* renamed from: e */
    protected C11775e m6918e(String str, String str2, long j, long[] jArr, C6314a[] c6314aArr) {
        return new C11775e(str, str2, j, jArr, c6314aArr);
    }

    /* renamed from: e0 */
    protected AbstractC11783j.C11788e m6917e0(XmlPullParser xmlPullParser, AbstractC11783j.C11788e c11788e) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        if (c11788e != null) {
            j = c11788e.f30742b;
        } else {
            j = 1;
        }
        long m6932T = m6932T(xmlPullParser, "timescale", j);
        long j6 = 0;
        if (c11788e != null) {
            j2 = c11788e.f30743c;
        } else {
            j2 = 0;
        }
        long m6932T2 = m6932T(xmlPullParser, "presentationTimeOffset", j2);
        if (c11788e != null) {
            j3 = c11788e.f30756d;
        } else {
            j3 = 0;
        }
        if (c11788e != null) {
            j6 = c11788e.f30757e;
        }
        C11778h c11778h = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j5 = Long.parseLong(split[0]);
            j4 = (Long.parseLong(split[1]) - j5) + 1;
        } else {
            j4 = j6;
            j5 = j3;
        }
        if (c11788e != null) {
            c11778h = c11788e.f30741a;
        }
        do {
            xmlPullParser.next();
            if (C9196q0.m16188f(xmlPullParser, "Initialization")) {
                c11778h = m6936P(xmlPullParser);
            } else {
                m6889u(xmlPullParser);
            }
        } while (!C9196q0.m16190d(xmlPullParser, "SegmentBase"));
        return m6900n(c11778h, m6932T, m6932T2, j5, j4);
    }

    /* renamed from: f */
    protected Format m6916f(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, List<C11774d> list, List<C11774d> list2, String str4, List<C11774d> list3, List<C11774d> list4) {
        int i6;
        String m6890t = m6890t(str2, str4);
        if ("audio/eac3".equals(m6890t)) {
            m6890t = m6942J(list4);
        }
        int m6905k0 = m6905k0(list);
        Format.C4362b m29897V = new Format.C4362b().m29900S(str).m29908K(str2).m29883e0(m6890t).m29910I(str4).m29893Z(i5).m29879g0(m6905k0).m29887c0(m6919d0(list) | m6925a0(list2) | m6921c0(list3) | m6921c0(list4)).m29897V(str3);
        if (C9200u.m16151s(m6890t)) {
            m29897V.m29873j0(i).m29902Q(i2).m29903P(f);
        } else if (C9200u.m16154p(m6890t)) {
            m29897V.m29911H(i3).m29881f0(i4);
        } else if (C9200u.m16152r(m6890t)) {
            if ("application/cea-608".equals(m6890t)) {
                i6 = m6950B(list2);
            } else if ("application/cea-708".equals(m6890t)) {
                i6 = m6949C(list2);
            } else {
                i6 = -1;
            }
            m29897V.m29913F(i6);
        }
        return m29897V.m29914E();
    }

    /* renamed from: f0 */
    protected AbstractC11783j.C11785b m6915f0(XmlPullParser xmlPullParser, AbstractC11783j.C11785b c11785b, long j, long j2, long j3, long j4, long j5) {
        long j6;
        long j7;
        long j8;
        long j9 = 1;
        if (c11785b != null) {
            j6 = c11785b.f30742b;
        } else {
            j6 = 1;
        }
        long m6932T = m6932T(xmlPullParser, "timescale", j6);
        if (c11785b != null) {
            j7 = c11785b.f30743c;
        } else {
            j7 = 0;
        }
        long m6932T2 = m6932T(xmlPullParser, "presentationTimeOffset", j7);
        if (c11785b != null) {
            j8 = c11785b.f30745e;
        } else {
            j8 = -9223372036854775807L;
        }
        long m6932T3 = m6932T(xmlPullParser, "duration", j8);
        if (c11785b != null) {
            j9 = c11785b.f30744d;
        }
        long m6932T4 = m6932T(xmlPullParser, "startNumber", j9);
        long m6891s = m6891s(j3, j4);
        List<AbstractC11783j.C11787d> list = null;
        List<C11778h> list2 = null;
        C11778h c11778h = null;
        do {
            xmlPullParser.next();
            if (C9196q0.m16188f(xmlPullParser, "Initialization")) {
                c11778h = m6936P(xmlPullParser);
            } else if (C9196q0.m16188f(xmlPullParser, "SegmentTimeline")) {
                list = m6911h0(xmlPullParser, m6932T, j2);
            } else if (C9196q0.m16188f(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList<>();
                }
                list2.add(m6909i0(xmlPullParser));
            } else {
                m6889u(xmlPullParser);
            }
        } while (!C9196q0.m16190d(xmlPullParser, "SegmentList"));
        if (c11785b != null) {
            if (c11778h == null) {
                c11778h = c11785b.f30741a;
            }
            if (list == null) {
                list = c11785b.f30746f;
            }
            if (list2 == null) {
                list2 = c11785b.f30750j;
            }
        }
        return m6906k(c11778h, m6932T, m6932T2, m6932T4, m6932T3, list, m6891s, list2, j5, j);
    }

    /* renamed from: g */
    protected C11771b m6914g(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C11777g c11777g, C11792n c11792n, C11789k c11789k, Uri uri, List<C11776f> list) {
        return new C11771b(j, j2, j3, z, j4, j5, j6, j7, c11777g, c11792n, c11789k, uri, list);
    }

    /* renamed from: g0 */
    protected AbstractC11783j.C11786c m6913g0(XmlPullParser xmlPullParser, AbstractC11783j.C11786c c11786c, List<C11774d> list, long j, long j2, long j3, long j4, long j5) {
        long j6;
        long j7;
        long j8;
        C11791m c11791m;
        C11791m c11791m2;
        long j9 = 1;
        if (c11786c != null) {
            j6 = c11786c.f30742b;
        } else {
            j6 = 1;
        }
        long m6932T = m6932T(xmlPullParser, "timescale", j6);
        if (c11786c != null) {
            j7 = c11786c.f30743c;
        } else {
            j7 = 0;
        }
        long m6932T2 = m6932T(xmlPullParser, "presentationTimeOffset", j7);
        if (c11786c != null) {
            j8 = c11786c.f30745e;
        } else {
            j8 = -9223372036854775807L;
        }
        long m6932T3 = m6932T(xmlPullParser, "duration", j8);
        if (c11786c != null) {
            j9 = c11786c.f30744d;
        }
        long m6932T4 = m6932T(xmlPullParser, "startNumber", j9);
        long m6933S = m6933S(list);
        long m6891s = m6891s(j3, j4);
        List<AbstractC11783j.C11787d> list2 = null;
        if (c11786c != null) {
            c11791m = c11786c.f30752k;
        } else {
            c11791m = null;
        }
        C11791m m6895p0 = m6895p0(xmlPullParser, "media", c11791m);
        if (c11786c != null) {
            c11791m2 = c11786c.f30751j;
        } else {
            c11791m2 = null;
        }
        C11791m m6895p02 = m6895p0(xmlPullParser, "initialization", c11791m2);
        C11778h c11778h = null;
        while (true) {
            xmlPullParser.next();
            if (C9196q0.m16188f(xmlPullParser, "Initialization")) {
                c11778h = m6936P(xmlPullParser);
            } else if (C9196q0.m16188f(xmlPullParser, "SegmentTimeline")) {
                list2 = m6911h0(xmlPullParser, m6932T, j2);
            } else {
                m6889u(xmlPullParser);
            }
            if (C9196q0.m16190d(xmlPullParser, "SegmentTemplate")) {
                break;
            }
        }
        if (c11786c != null) {
            if (c11778h == null) {
                c11778h = c11786c.f30741a;
            }
            if (list2 == null) {
                list2 = c11786c.f30746f;
            }
        }
        return m6904l(c11778h, m6932T, m6932T2, m6932T4, m6933S, m6932T3, list2, m6891s, m6895p02, m6895p0, j5, j);
    }

    /* renamed from: h */
    protected C11776f m6912h(String str, long j, List<C11770a> list, List<C11775e> list2, C11774d c11774d) {
        return new C11776f(str, j, list, list2, c11774d);
    }

    /* renamed from: h0 */
    protected List<AbstractC11783j.C11787d> m6911h0(XmlPullParser xmlPullParser, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (C9196q0.m16188f(xmlPullParser, "S")) {
                long m6932T = m6932T(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    j3 = m6924b(arrayList, j3, j4, i, m6932T);
                }
                if (m6932T == -9223372036854775807L) {
                    m6932T = j3;
                }
                j4 = m6932T(xmlPullParser, "d", -9223372036854775807L);
                i = m6935Q(xmlPullParser, "r", 0);
                z = true;
                j3 = m6932T;
            } else {
                m6889u(xmlPullParser);
            }
        } while (!C9196q0.m16190d(xmlPullParser, "SegmentTimeline"));
        if (z) {
            m6924b(arrayList, j3, j4, i, C9191p0.m16296I0(j2, j, 1000L));
        }
        return arrayList;
    }

    /* renamed from: i */
    protected C11778h m6910i(String str, long j, long j2) {
        return new C11778h(str, j, j2);
    }

    /* renamed from: i0 */
    protected C11778h m6909i0(XmlPullParser xmlPullParser) {
        return m6927Y(xmlPullParser, "media", "mediaRange");
    }

    /* renamed from: j */
    protected AbstractC11779i m6908j(C11773a c11773a, String str, String str2, ArrayList<C11028l.C11030b> arrayList, ArrayList<C11774d> arrayList2) {
        Format.C4362b m29926a = c11773a.f30700a.m29926a();
        if (str != null) {
            m29926a.m29898U(str);
        }
        String str3 = c11773a.f30703d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<C11028l.C11030b> arrayList3 = c11773a.f30704e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            m6892r(arrayList3);
            m29926a.m29907L(new C11028l(str2, arrayList3));
        }
        ArrayList<C11774d> arrayList4 = c11773a.f30705f;
        arrayList4.addAll(arrayList2);
        return AbstractC11779i.m6877o(c11773a.f30706g, m29926a.m29914E(), c11773a.f30701b, c11773a.f30702c, arrayList4);
    }

    /* renamed from: j0 */
    protected int m6907j0(String str) {
        if (str == null) {
            return 0;
        }
        if (!str.equals("forced_subtitle")) {
            if (!str.equals("main")) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    /* renamed from: k */
    protected AbstractC11783j.C11785b m6906k(C11778h c11778h, long j, long j2, long j3, long j4, List<AbstractC11783j.C11787d> list, long j5, List<C11778h> list2, long j6, long j7) {
        return new AbstractC11783j.C11785b(c11778h, j, j2, j3, j4, list, j5, list2, C7390b.m20792c(j6), C7390b.m20792c(j7));
    }

    /* renamed from: k0 */
    protected int m6905k0(List<C11774d> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C11774d c11774d = list.get(i2);
            if (C6368b.m22854a("urn:mpeg:dash:role:2011", c11774d.f30707a)) {
                i |= m6907j0(c11774d.f30708b);
            }
        }
        return i;
    }

    /* renamed from: l */
    protected AbstractC11783j.C11786c m6904l(C11778h c11778h, long j, long j2, long j3, long j4, long j5, List<AbstractC11783j.C11787d> list, long j6, C11791m c11791m, C11791m c11791m2, long j7, long j8) {
        return new AbstractC11783j.C11786c(c11778h, j, j2, j3, j4, j5, list, j6, c11791m, c11791m2, C7390b.m20792c(j7), C7390b.m20792c(j8));
    }

    /* renamed from: l0 */
    protected C11789k m6903l0(XmlPullParser xmlPullParser) {
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f = -3.4028235E38f;
        float f2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (C9196q0.m16188f(xmlPullParser, "Latency")) {
                j = m6932T(xmlPullParser, TouchesHelper.TARGET_KEY, -9223372036854775807L);
                j2 = m6932T(xmlPullParser, "min", -9223372036854775807L);
                j3 = m6932T(xmlPullParser, "max", -9223372036854775807L);
            } else if (C9196q0.m16188f(xmlPullParser, "PlaybackRate")) {
                f = m6938N(xmlPullParser, "min", -3.4028235E38f);
                f2 = m6938N(xmlPullParser, "max", -3.4028235E38f);
            }
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float f3 = f;
            float f4 = f2;
            if (C9196q0.m16190d(xmlPullParser, "ServiceDescription")) {
                return new C11789k(j4, j5, j6, f3, f4);
            }
            j = j4;
            j2 = j5;
            j3 = j6;
            f = f3;
            f2 = f4;
        }
    }

    /* renamed from: m */
    protected AbstractC11783j.C11787d m6902m(long j, long j2) {
        return new AbstractC11783j.C11787d(j, j2);
    }

    /* renamed from: n */
    protected AbstractC11783j.C11788e m6900n(C11778h c11778h, long j, long j2, long j3, long j4) {
        return new AbstractC11783j.C11788e(c11778h, j, j2, j3, j4);
    }

    /* renamed from: o */
    protected C11792n m6898o(String str, String str2) {
        return new C11792n(str, str2);
    }

    /* renamed from: o0 */
    protected int m6897o0(String str) {
        if (str == null) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals(NearbyManager.PERMISSION_DENIED)) {
                    c = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c = 2;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 512;
            case 1:
                return RecyclerView.ItemAnimator.FLAG_MOVED;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    /* renamed from: p0 */
    protected C11791m m6895p0(XmlPullParser xmlPullParser, String str, C11791m c11791m) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return C11791m.m6848b(attributeValue);
        }
        return c11791m;
    }

    /* renamed from: q0 */
    protected C11792n m6893q0(XmlPullParser xmlPullParser) {
        return m6898o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // com.google.android.exoplayer2.upstream.C4559i.InterfaceC4560a
    /* renamed from: v */
    public C11771b mo3724a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f30699a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return m6931U(newPullParser, uri.toString());
            }
            throw new C7402m("inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e) {
            throw new C7402m(e);
        }
    }

    /* renamed from: w */
    protected C11770a m6887w(XmlPullParser xmlPullParser, String str, AbstractC11783j abstractC11783j, long j, long j2, long j3, long j4, long j5) {
        String str2;
        long j6;
        String str3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList<C11028l.C11030b> arrayList5;
        String str4;
        Object obj;
        ArrayList arrayList6;
        int i;
        ArrayList<C11774d> arrayList7;
        long m6884z;
        C11772c c11772c = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int m6935Q = m6935Q(xmlPullParser2, "id", -1);
        int m6947E = m6947E(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        int m6935Q2 = m6935Q(xmlPullParser2, "width", -1);
        int m6935Q3 = m6935Q(xmlPullParser2, "height", -1);
        float m6937O = m6937O(xmlPullParser2, -1.0f);
        int m6935Q4 = m6935Q(xmlPullParser2, "audioSamplingRate", -1);
        String str5 = "lang";
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "lang");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "label");
        ArrayList<C11028l.C11030b> arrayList8 = new ArrayList<>();
        ArrayList<C11774d> arrayList9 = new ArrayList<>();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        String str6 = str;
        AbstractC11783j.C11788e c11788e = abstractC11783j;
        int i2 = m6947E;
        int i3 = -1;
        String str7 = attributeValue3;
        String str8 = attributeValue4;
        String str9 = null;
        boolean z = false;
        long j7 = j2;
        long j8 = j3;
        while (true) {
            xmlPullParser.next();
            if (C9196q0.m16188f(xmlPullParser2, "BaseURL")) {
                if (!z) {
                    j7 = c11772c.m6884z(xmlPullParser2, j7);
                    str6 = c11772c.m6951A(xmlPullParser2, str6);
                    z = true;
                    j6 = j7;
                    arrayList6 = arrayList14;
                    arrayList = arrayList13;
                    arrayList2 = arrayList12;
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList10;
                    arrayList7 = arrayList9;
                    arrayList5 = arrayList8;
                    str4 = str5;
                    obj = null;
                } else {
                    j6 = j7;
                    arrayList6 = arrayList14;
                    arrayList = arrayList13;
                    arrayList2 = arrayList12;
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList10;
                    arrayList7 = arrayList9;
                    arrayList5 = arrayList8;
                    str4 = str5;
                    i = i2;
                    str2 = str7;
                    obj = null;
                    str3 = str6;
                    str6 = str3;
                    str7 = str2;
                    i2 = i;
                }
            } else if (C9196q0.m16188f(xmlPullParser2, "ContentProtection")) {
                Pair<String, C11028l.C11030b> m6948D = m6948D(xmlPullParser);
                long j9 = j8;
                Object obj2 = m6948D.first;
                if (obj2 != null) {
                    str9 = (String) obj2;
                }
                Object obj3 = m6948D.second;
                if (obj3 != null) {
                    arrayList8.add((C11028l.C11030b) obj3);
                }
                j8 = j9;
                j6 = j7;
                arrayList6 = arrayList14;
                arrayList = arrayList13;
                arrayList2 = arrayList12;
                arrayList3 = arrayList11;
                arrayList4 = arrayList10;
                arrayList7 = arrayList9;
                arrayList5 = arrayList8;
                str4 = str5;
                obj = null;
            } else {
                long j10 = j8;
                if (C9196q0.m16188f(xmlPullParser2, "ContentComponent")) {
                    str7 = m6894q(str7, xmlPullParser2.getAttributeValue(null, str5));
                    i2 = m6896p(i2, m6947E(xmlPullParser));
                    j6 = j7;
                    arrayList6 = arrayList14;
                    arrayList = arrayList13;
                    arrayList2 = arrayList12;
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList10;
                    arrayList7 = arrayList9;
                    arrayList5 = arrayList8;
                    str4 = str5;
                    obj = null;
                    j8 = j10;
                } else {
                    int i4 = i2;
                    String str10 = str7;
                    if (C9196q0.m16188f(xmlPullParser2, "Role")) {
                        arrayList11.add(m6945G(xmlPullParser2, "Role"));
                    } else if (C9196q0.m16188f(xmlPullParser2, "AudioChannelConfiguration")) {
                        i3 = m6885y(xmlPullParser);
                        str7 = str10;
                        j6 = j7;
                        arrayList = arrayList13;
                        arrayList2 = arrayList12;
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList10;
                        arrayList7 = arrayList9;
                        arrayList5 = arrayList8;
                        str4 = str5;
                        obj = null;
                        i2 = i4;
                        j8 = j10;
                        arrayList6 = arrayList14;
                    } else if (C9196q0.m16188f(xmlPullParser2, "Accessibility")) {
                        arrayList10.add(m6945G(xmlPullParser2, "Accessibility"));
                    } else if (C9196q0.m16188f(xmlPullParser2, "EssentialProperty")) {
                        arrayList12.add(m6945G(xmlPullParser2, "EssentialProperty"));
                    } else if (C9196q0.m16188f(xmlPullParser2, "SupplementalProperty")) {
                        arrayList13.add(m6945G(xmlPullParser2, "SupplementalProperty"));
                    } else if (C9196q0.m16188f(xmlPullParser2, "Representation")) {
                        j6 = j7;
                        arrayList = arrayList13;
                        arrayList2 = arrayList12;
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList10;
                        arrayList5 = arrayList8;
                        str4 = str5;
                        obj = null;
                        C11773a m6926Z = m6926Z(xmlPullParser, str6, attributeValue, attributeValue2, m6935Q2, m6935Q3, m6937O, i3, m6935Q4, str10, arrayList3, arrayList4, arrayList2, arrayList, c11788e, j4, j, j6, j10, j5);
                        int m6896p = m6896p(i4, C9200u.m16158l(m6926Z.f30700a.f11197u));
                        arrayList6 = arrayList14;
                        arrayList6.add(m6926Z);
                        xmlPullParser2 = xmlPullParser;
                        str6 = str6;
                        arrayList7 = arrayList9;
                        str7 = str10;
                        i2 = m6896p;
                        j8 = j10;
                    } else {
                        str2 = str10;
                        j6 = j7;
                        str3 = str6;
                        arrayList = arrayList13;
                        arrayList2 = arrayList12;
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList10;
                        ArrayList<C11774d> arrayList15 = arrayList9;
                        arrayList5 = arrayList8;
                        str4 = str5;
                        obj = null;
                        arrayList6 = arrayList14;
                        if (C9196q0.m16188f(xmlPullParser, "SegmentBase")) {
                            c11788e = m6917e0(xmlPullParser, (AbstractC11783j.C11788e) c11788e);
                            str6 = str3;
                            arrayList7 = arrayList15;
                            j8 = j10;
                            str7 = str2;
                            i2 = i4;
                            xmlPullParser2 = xmlPullParser;
                        } else {
                            if (C9196q0.m16188f(xmlPullParser, "SegmentList")) {
                                m6884z = m6884z(xmlPullParser, j10);
                                i = i4;
                                c11788e = m6915f0(xmlPullParser, (AbstractC11783j.C11785b) c11788e, j4, j, j6, m6884z, j5);
                                xmlPullParser2 = xmlPullParser;
                            } else {
                                j8 = j10;
                                i = i4;
                                if (C9196q0.m16188f(xmlPullParser, "SegmentTemplate")) {
                                    m6884z = m6884z(xmlPullParser, j8);
                                    xmlPullParser2 = xmlPullParser;
                                    c11788e = m6913g0(xmlPullParser, (AbstractC11783j.C11786c) c11788e, arrayList, j4, j, j6, m6884z, j5);
                                } else {
                                    xmlPullParser2 = xmlPullParser;
                                    if (C9196q0.m16188f(xmlPullParser2, "InbandEventStream")) {
                                        arrayList7 = arrayList15;
                                        arrayList7.add(m6945G(xmlPullParser2, "InbandEventStream"));
                                    } else {
                                        arrayList7 = arrayList15;
                                        if (C9196q0.m16188f(xmlPullParser2, "Label")) {
                                            str8 = m6934R(xmlPullParser);
                                        } else if (C9196q0.m16189e(xmlPullParser)) {
                                            m6886x(xmlPullParser);
                                        }
                                    }
                                    str6 = str3;
                                    str7 = str2;
                                    i2 = i;
                                }
                            }
                            j8 = m6884z;
                            str6 = str3;
                            arrayList7 = arrayList15;
                            str7 = str2;
                            i2 = i;
                        }
                    }
                    str2 = str10;
                    j6 = j7;
                    str3 = str6;
                    arrayList = arrayList13;
                    arrayList2 = arrayList12;
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList10;
                    arrayList7 = arrayList9;
                    arrayList5 = arrayList8;
                    str4 = str5;
                    obj = null;
                    i = i4;
                    j8 = j10;
                    arrayList6 = arrayList14;
                    str6 = str3;
                    str7 = str2;
                    i2 = i;
                }
            }
            if (C9196q0.m16190d(xmlPullParser2, "AdaptationSet")) {
                break;
            }
            arrayList9 = arrayList7;
            arrayList14 = arrayList6;
            j7 = j6;
            arrayList13 = arrayList;
            arrayList12 = arrayList2;
            arrayList11 = arrayList3;
            arrayList10 = arrayList4;
            arrayList8 = arrayList5;
            str5 = str4;
            c11772c = this;
        }
        ArrayList arrayList16 = new ArrayList(arrayList6.size());
        for (int i5 = 0; i5 < arrayList6.size(); i5++) {
            arrayList16.add(m6908j((C11773a) arrayList6.get(i5), str8, str9, arrayList5, arrayList7));
        }
        return m6922c(m6935Q, i2, arrayList16, arrayList4, arrayList2, arrayList);
    }

    /* renamed from: x */
    protected void m6886x(XmlPullParser xmlPullParser) {
        m6889u(xmlPullParser);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: y */
    protected int m6885y(XmlPullParser xmlPullParser) {
        char c;
        String m6901m0 = m6901m0(xmlPullParser, "schemeIdUri", null);
        m6901m0.hashCode();
        int i = -1;
        switch (m6901m0.hashCode()) {
            case -1352850286:
                if (m6901m0.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1138141449:
                if (m6901m0.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -986633423:
                if (m6901m0.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2036691300:
                if (m6901m0.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
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
                i = m6935Q(xmlPullParser, "value", -1);
                break;
            case 1:
            case 3:
                i = m6944H(xmlPullParser);
                break;
            case 2:
                i = m6930V(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!C9196q0.m16190d(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    /* renamed from: z */
    protected long m6884z(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }
}
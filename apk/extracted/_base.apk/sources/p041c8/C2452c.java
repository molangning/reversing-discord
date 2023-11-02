package p041c8;

import com.facebook.react.uimanager.ViewProps;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9196q0;
import p195k8.C9197r;
import p383v7.AbstractC13131d;
import p383v7.C13135h;
import p383v7.InterfaceC13133f;

/* renamed from: c8.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2452c extends AbstractC13131d {

    /* renamed from: p */
    private static final Pattern f6745p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q */
    private static final Pattern f6746q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r */
    private static final Pattern f6747r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s */
    static final Pattern f6748s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t */
    static final Pattern f6749t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u */
    private static final Pattern f6750u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v */
    private static final Pattern f6751v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w */
    private static final C2454b f6752w = new C2454b(30.0f, 1, 1);

    /* renamed from: x */
    private static final C2453a f6753x = new C2453a(32, 15);

    /* renamed from: o */
    private final XmlPullParserFactory f6754o;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c8.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2453a {

        /* renamed from: a */
        final int f6755a;

        /* renamed from: b */
        final int f6756b;

        C2453a(int i, int i2) {
            this.f6755a = i;
            this.f6756b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c8.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2454b {

        /* renamed from: a */
        final float f6757a;

        /* renamed from: b */
        final int f6758b;

        /* renamed from: c */
        final int f6759c;

        C2454b(float f, int i, int i2) {
            this.f6757a = f;
            this.f6758b = i;
            this.f6759c = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c8.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2455c {

        /* renamed from: a */
        final int f6760a;

        /* renamed from: b */
        final int f6761b;

        C2455c(int i, int i2) {
            this.f6760a = i;
            this.f6761b = i2;
        }
    }

    public C2452c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f6754o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: B */
    private static C2459g m33280B(C2459g c2459g) {
        return c2459g == null ? new C2459g() : c2459g;
    }

    /* renamed from: C */
    private static boolean m33279C(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals("p") && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    private static C2453a m33278D(XmlPullParser xmlPullParser, C2453a c2453a) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return c2453a;
        }
        Matcher matcher = f6751v.matcher(attributeValue);
        if (!matcher.matches()) {
            C9197r.m16178h("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return c2453a;
        }
        try {
            int parseInt = Integer.parseInt((String) C9149a.m16448e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) C9149a.m16448e(matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new C2453a(parseInt, parseInt2);
            }
            throw new C13135h("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            C9197r.m16178h("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return c2453a;
        }
    }

    /* renamed from: E */
    private static void m33277E(String str, C2459g c2459g) {
        Matcher matcher;
        String[] m16286N0 = C9191p0.m16286N0(str, "\\s+");
        if (m16286N0.length == 1) {
            matcher = f6747r.matcher(str);
        } else if (m16286N0.length == 2) {
            matcher = f6747r.matcher(m16286N0[1]);
            C9197r.m16178h("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new C13135h("Invalid number of entries for fontSize: " + m16286N0.length + ".");
        }
        if (matcher.matches()) {
            String str2 = (String) C9149a.m16448e(matcher.group(3));
            str2.hashCode();
            char c = 65535;
            switch (str2.hashCode()) {
                case 37:
                    if (str2.equals("%")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str2.equals("em")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str2.equals("px")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    c2459g.m33211y(3);
                    break;
                case 1:
                    c2459g.m33211y(2);
                    break;
                case 2:
                    c2459g.m33211y(1);
                    break;
                default:
                    throw new C13135h("Invalid unit for fontSize: '" + str2 + "'.");
            }
            c2459g.m33212x(Float.parseFloat((String) C9149a.m16448e(matcher.group(1))));
            return;
        }
        throw new C13135h("Invalid expression for fontSize: '" + str + "'.");
    }

    /* renamed from: F */
    private static C2454b m33276F(XmlPullParser xmlPullParser) {
        int i;
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] m16286N0 = C9191p0.m16286N0(attributeValue2, " ");
            if (m16286N0.length == 2) {
                f = Integer.parseInt(m16286N0[0]) / Integer.parseInt(m16286N0[1]);
            } else {
                throw new C13135h("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f = 1.0f;
        }
        C2454b c2454b = f6752w;
        int i2 = c2454b.f6758b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = c2454b.f6759c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new C2454b(i * f, i2, i3);
    }

    /* renamed from: G */
    private static Map<String, C2459g> m33275G(XmlPullParser xmlPullParser, Map<String, C2459g> map, C2453a c2453a, C2455c c2455c, Map<String, C2457e> map2, Map<String, String> map3) {
        do {
            xmlPullParser.next();
            if (C9196q0.m16188f(xmlPullParser, "style")) {
                String m16193a = C9196q0.m16193a(xmlPullParser, "style");
                C2459g m33270L = m33270L(xmlPullParser, new C2459g());
                if (m16193a != null) {
                    for (String str : m33269M(m16193a)) {
                        m33270L.m33235a(map.get(str));
                    }
                }
                String m33229g = m33270L.m33229g();
                if (m33229g != null) {
                    map.put(m33229g, m33270L);
                }
            } else if (C9196q0.m16188f(xmlPullParser, "region")) {
                C2457e m33272J = m33272J(xmlPullParser, c2453a, c2455c);
                if (m33272J != null) {
                    map2.put(m33272J.f6775a, m33272J);
                }
            } else if (C9196q0.m16188f(xmlPullParser, "metadata")) {
                m33274H(xmlPullParser, map3);
            }
        } while (!C9196q0.m16190d(xmlPullParser, "head"));
        return map;
    }

    /* renamed from: H */
    private static void m33274H(XmlPullParser xmlPullParser, Map<String, String> map) {
        String m16193a;
        do {
            xmlPullParser.next();
            if (C9196q0.m16188f(xmlPullParser, "image") && (m16193a = C9196q0.m16193a(xmlPullParser, "id")) != null) {
                map.put(m16193a, xmlPullParser.nextText());
            }
        } while (!C9196q0.m16190d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: I */
    private static C2456d m33273I(XmlPullParser xmlPullParser, C2456d c2456d, Map<String, C2457e> map, C2454b c2454b) {
        long j;
        long j2;
        char c;
        int attributeCount = xmlPullParser.getAttributeCount();
        C2459g m33270L = m33270L(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (attributeName.equals(ViewProps.END)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c = 5;
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
                    if (map.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j5 = m33268N(attributeValue, c2454b);
                    break;
                case 2:
                    j4 = m33268N(attributeValue, c2454b);
                    break;
                case 3:
                    j3 = m33268N(attributeValue, c2454b);
                    break;
                case 4:
                    String[] m33269M = m33269M(attributeValue);
                    if (m33269M.length > 0) {
                        strArr = m33269M;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (c2456d != null) {
            long j6 = c2456d.f6765d;
            j = -9223372036854775807L;
            if (j6 != -9223372036854775807L) {
                if (j3 != -9223372036854775807L) {
                    j3 += j6;
                }
                if (j4 != -9223372036854775807L) {
                    j4 += j6;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        long j7 = j3;
        if (j4 == j) {
            if (j5 != j) {
                j2 = j7 + j5;
            } else if (c2456d != null) {
                long j8 = c2456d.f6766e;
                if (j8 != j) {
                    j2 = j8;
                }
            }
            return C2456d.m33264c(xmlPullParser.getName(), j7, j2, m33270L, strArr, str2, str, c2456d);
        }
        j2 = j4;
        return C2456d.m33264c(xmlPullParser.getName(), j7, j2, m33270L, strArr, str2, str, c2456d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a9, code lost:
        if (r0.equals("tb") == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017c  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p041c8.C2457e m33272J(org.xmlpull.v1.XmlPullParser r17, p041c8.C2452c.C2453a r18, p041c8.C2452c.C2455c r19) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p041c8.C2452c.m33272J(org.xmlpull.v1.XmlPullParser, c8.c$a, c8.c$c):c8.e");
    }

    /* renamed from: K */
    private static float m33271K(String str) {
        Matcher matcher = f6748s.matcher(str);
        if (!matcher.matches()) {
            C9197r.m16178h("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) C9149a.m16448e(matcher.group(1)))));
        } catch (NumberFormatException e) {
            C9197r.m16177i("TtmlDecoder", "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02d1, code lost:
        if (r3.equals(com.facebook.react.uimanager.ViewProps.START) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c8, code lost:
        if (r3.equals("text") == false) goto L47;
     */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p041c8.C2459g m33270L(org.xmlpull.v1.XmlPullParser r12, p041c8.C2459g r13) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p041c8.C2452c.m33270L(org.xmlpull.v1.XmlPullParser, c8.g):c8.g");
    }

    /* renamed from: M */
    private static String[] m33269M(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        return C9191p0.m16286N0(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bc, code lost:
        if (r13.equals("ms") == false) goto L21;
     */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long m33268N(java.lang.String r13, p041c8.C2452c.C2454b r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p041c8.C2452c.m33268N(java.lang.String, c8.c$b):long");
    }

    /* renamed from: O */
    private static C2455c m33267O(XmlPullParser xmlPullParser) {
        String m16193a = C9196q0.m16193a(xmlPullParser, "extent");
        if (m16193a == null) {
            return null;
        }
        Matcher matcher = f6750u.matcher(m16193a);
        if (!matcher.matches()) {
            C9197r.m16178h("TtmlDecoder", "Ignoring non-pixel tts extent: " + m16193a);
            return null;
        }
        try {
            return new C2455c(Integer.parseInt((String) C9149a.m16448e(matcher.group(1))), Integer.parseInt((String) C9149a.m16448e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            C9197r.m16178h("TtmlDecoder", "Ignoring malformed tts extent: " + m16193a);
            return null;
        }
    }

    @Override // p383v7.AbstractC13131d
    /* renamed from: z */
    protected InterfaceC13133f mo1161z(byte[] bArr, int i, boolean z) {
        C2454b c2454b;
        try {
            XmlPullParser newPullParser = this.f6754o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C2457e(""));
            C2455c c2455c = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C2454b c2454b2 = f6752w;
            C2453a c2453a = f6753x;
            int i2 = 0;
            C2460h c2460h = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C2456d c2456d = (C2456d) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c2454b2 = m33276F(newPullParser);
                            c2453a = m33278D(newPullParser, f6753x);
                            c2455c = m33267O(newPullParser);
                        }
                        C2455c c2455c2 = c2455c;
                        C2454b c2454b3 = c2454b2;
                        C2453a c2453a2 = c2453a;
                        if (!m33279C(name)) {
                            C9197r.m16180f("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i2++;
                            c2454b2 = c2454b3;
                        } else {
                            if ("head".equals(name)) {
                                c2454b = c2454b3;
                                m33275G(newPullParser, hashMap, c2453a2, c2455c2, hashMap2, hashMap3);
                            } else {
                                c2454b = c2454b3;
                                try {
                                    C2456d m33273I = m33273I(newPullParser, c2456d, hashMap2, c2454b);
                                    arrayDeque.push(m33273I);
                                    if (c2456d != null) {
                                        c2456d.m33266a(m33273I);
                                    }
                                } catch (C13135h e) {
                                    C9197r.m16177i("TtmlDecoder", "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            c2454b2 = c2454b;
                        }
                        c2455c = c2455c2;
                        c2453a = c2453a2;
                    } else if (eventType == 4) {
                        ((C2456d) C9149a.m16448e(c2456d)).m33266a(C2456d.m33263d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c2460h = new C2460h((C2456d) C9149a.m16448e((C2456d) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            if (c2460h != null) {
                return c2460h;
            }
            throw new C13135h("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new C13135h("Unable to decode source", e3);
        }
    }
}

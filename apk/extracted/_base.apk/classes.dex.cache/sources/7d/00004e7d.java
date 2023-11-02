package p363u6;

import gb.AbstractC6693s;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p151i6.C7402m;
import p195k8.C9196q0;
import p195k8.C9197r;
import p363u6.C12872b;

/* renamed from: u6.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12877e {

    /* renamed from: a */
    private static final String[] f33517a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f33518b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f33519c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static C12872b m3737a(String str) {
        try {
            return m3736b(str);
        } catch (C7402m | NumberFormatException | XmlPullParserException unused) {
            C9197r.m16178h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    private static C12872b m3736b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (C9196q0.m16188f(newPullParser, "x:xmpmeta")) {
            AbstractC6693s<C12872b.C12873a> m22131x = AbstractC6693s.m22131x();
            long j = -9223372036854775807L;
            do {
                newPullParser.next();
                if (C9196q0.m16188f(newPullParser, "rdf:Description")) {
                    if (!m3734d(newPullParser)) {
                        return null;
                    }
                    long m3733e = m3733e(newPullParser);
                    m22131x = m3735c(newPullParser);
                    j = m3733e;
                } else if (C9196q0.m16188f(newPullParser, "Container:Directory")) {
                    m22131x = m3732f(newPullParser, "Container", "Item");
                } else if (C9196q0.m16188f(newPullParser, "GContainer:Directory")) {
                    m22131x = m3732f(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!C9196q0.m16190d(newPullParser, "x:xmpmeta"));
            if (m22131x.isEmpty()) {
                return null;
            }
            return new C12872b(j, m22131x);
        }
        throw new C7402m("Couldn't find xmp metadata");
    }

    /* renamed from: c */
    private static AbstractC6693s<C12872b.C12873a> m3735c(XmlPullParser xmlPullParser) {
        for (String str : f33519c) {
            String m16193a = C9196q0.m16193a(xmlPullParser, str);
            if (m16193a != null) {
                return AbstractC6693s.m22129z(new C12872b.C12873a("image/jpeg", "Primary", 0L, 0L), new C12872b.C12873a("video/mp4", "MotionPhoto", Long.parseLong(m16193a), 0L));
            }
        }
        return AbstractC6693s.m22131x();
    }

    /* renamed from: d */
    private static boolean m3734d(XmlPullParser xmlPullParser) {
        for (String str : f33517a) {
            String m16193a = C9196q0.m16193a(xmlPullParser, str);
            if (m16193a != null) {
                if (Integer.parseInt(m16193a) != 1) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private static long m3733e(XmlPullParser xmlPullParser) {
        for (String str : f33518b) {
            String m16193a = C9196q0.m16193a(xmlPullParser, str);
            if (m16193a != null) {
                long parseLong = Long.parseLong(m16193a);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: f */
    private static AbstractC6693s<C12872b.C12873a> m3732f(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        AbstractC6693s.C6694a m22136s = AbstractC6693s.m22136s();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (C9196q0.m16188f(xmlPullParser, str3)) {
                String m16193a = C9196q0.m16193a(xmlPullParser, str2 + ":Mime");
                String m16193a2 = C9196q0.m16193a(xmlPullParser, str2 + ":Semantic");
                String m16193a3 = C9196q0.m16193a(xmlPullParser, str2 + ":Length");
                String m16193a4 = C9196q0.m16193a(xmlPullParser, str2 + ":Padding");
                if (m16193a != null && m16193a2 != null) {
                    if (m16193a3 != null) {
                        j = Long.parseLong(m16193a3);
                    } else {
                        j = 0;
                    }
                    if (m16193a4 != null) {
                        j2 = Long.parseLong(m16193a4);
                    } else {
                        j2 = 0;
                    }
                    m22136s.m22128d(new C12872b.C12873a(m16193a, m16193a2, j, j2));
                } else {
                    return AbstractC6693s.m22131x();
                }
            }
        } while (!C9196q0.m16190d(xmlPullParser, str4));
        return m22136s.m22127e();
    }
}
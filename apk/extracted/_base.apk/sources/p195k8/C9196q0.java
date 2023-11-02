package p195k8;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: k8.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9196q0 {
    /* renamed from: a */
    public static String m16193a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m16192b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (m16186h(xmlPullParser.getAttributeName(i)).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m16191c(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: d */
    public static boolean m16190d(XmlPullParser xmlPullParser, String str) {
        return m16191c(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: e */
    public static boolean m16189e(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: f */
    public static boolean m16188f(XmlPullParser xmlPullParser, String str) {
        return m16189e(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: g */
    public static boolean m16187g(XmlPullParser xmlPullParser, String str) {
        return m16189e(xmlPullParser) && m16186h(xmlPullParser.getName()).equals(str);
    }

    /* renamed from: h */
    private static String m16186h(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            return str.substring(indexOf + 1);
        }
        return str;
    }
}

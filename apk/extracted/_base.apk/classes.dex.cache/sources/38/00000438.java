package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p411x.C13657a;

/* renamed from: androidx.core.content.res.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0969c {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f3296a = new ThreadLocal<>();

    /* renamed from: a */
    public static ColorStateList m38293a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m38292b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static ColorStateList m38292b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m38289e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: c */
    private static TypedValue m38291c() {
        ThreadLocal<TypedValue> threadLocal = f3296a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: d */
    public static ColorStateList m38290d(Resources resources, int i, Resources.Theme theme) {
        try {
            return m38293a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00a8  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.res.ColorStateList m38289e(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0969c.m38289e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: f */
    private static boolean m38288f(Resources resources, int i) {
        TypedValue m38291c = m38291c();
        resources.getValue(i, m38291c, true);
        int i2 = m38291c.type;
        if (i2 >= 28 && i2 <= 31) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static int m38287g(int i, float f, float f2) {
        boolean z;
        if (f2 >= 0.0f && f2 <= 100.0f) {
            z = true;
        } else {
            z = false;
        }
        if (f == 1.0f && !z) {
            return i;
        }
        int m1915b = C13657a.m1915b((int) ((Color.alpha(i) * f) + 0.5f), 0, 255);
        if (z) {
            C0967a m38315c = C0967a.m38315c(i);
            i = C0967a.m38305m(m38315c.m38308j(), m38315c.m38309i(), f2);
        }
        return (i & 16777215) | (m1915b << 24);
    }

    /* renamed from: h */
    private static TypedArray m38286h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.res.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0992l {
    /* renamed from: a */
    public static boolean m38216a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!m38207j(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m38215b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m38207j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    /* renamed from: c */
    public static ColorStateList m38214c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (m38207j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 != 2) {
                if (i2 >= 28 && i2 <= 31) {
                    return m38213d(typedValue);
                }
                return C0969c.m38290d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        }
        return null;
    }

    /* renamed from: d */
    private static ColorStateList m38213d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static C0970d m38212e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m38207j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C0970d.m38284b(typedValue.data);
            }
            C0970d m38279g = C0970d.m38279g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (m38279g != null) {
                return m38279g;
            }
        }
        return C0970d.m38284b(i2);
    }

    /* renamed from: f */
    public static float m38211f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m38207j(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: g */
    public static int m38210g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m38207j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: h */
    public static int m38209h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m38207j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    /* renamed from: i */
    public static String m38208i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m38207j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: j */
    public static boolean m38207j(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static TypedArray m38206k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m38205l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m38207j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }
}

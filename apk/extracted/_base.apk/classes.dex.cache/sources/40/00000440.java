package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p356u.C12814i;

/* renamed from: androidx.core.content.res.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0977f {
    /* renamed from: a */
    private static C0978a m38253a(C0978a c0978a, int i, int i2, boolean z, int i3) {
        if (c0978a != null) {
            return c0978a;
        }
        if (z) {
            return new C0978a(i, i3, i2);
        }
        return new C0978a(i, i2);
    }

    /* renamed from: b */
    public static Shader m38252b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray m38206k = C0992l.m38206k(resources, theme, attributeSet, C12814i.f33272A);
            float m38211f = C0992l.m38211f(m38206k, xmlPullParser, "startX", C12814i.f33281J, 0.0f);
            float m38211f2 = C0992l.m38211f(m38206k, xmlPullParser, "startY", C12814i.f33282K, 0.0f);
            float m38211f3 = C0992l.m38211f(m38206k, xmlPullParser, "endX", C12814i.f33283L, 0.0f);
            float m38211f4 = C0992l.m38211f(m38206k, xmlPullParser, "endY", C12814i.f33284M, 0.0f);
            float m38211f5 = C0992l.m38211f(m38206k, xmlPullParser, "centerX", C12814i.f33276E, 0.0f);
            float m38211f6 = C0992l.m38211f(m38206k, xmlPullParser, "centerY", C12814i.f33277F, 0.0f);
            int m38210g = C0992l.m38210g(m38206k, xmlPullParser, "type", C12814i.f33275D, 0);
            int m38215b = C0992l.m38215b(m38206k, xmlPullParser, "startColor", C12814i.f33273B, 0);
            boolean m38207j = C0992l.m38207j(xmlPullParser, "centerColor");
            int m38215b2 = C0992l.m38215b(m38206k, xmlPullParser, "centerColor", C12814i.f33280I, 0);
            int m38215b3 = C0992l.m38215b(m38206k, xmlPullParser, "endColor", C12814i.f33274C, 0);
            int m38210g2 = C0992l.m38210g(m38206k, xmlPullParser, "tileMode", C12814i.f33279H, 0);
            float m38211f7 = C0992l.m38211f(m38206k, xmlPullParser, "gradientRadius", C12814i.f33278G, 0.0f);
            m38206k.recycle();
            C0978a m38253a = m38253a(m38251c(resources, xmlPullParser, attributeSet, theme), m38215b, m38215b3, m38207j, m38215b2);
            if (m38210g != 1) {
                if (m38210g != 2) {
                    return new LinearGradient(m38211f, m38211f2, m38211f3, m38211f4, m38253a.f3311a, m38253a.f3312b, m38250d(m38210g2));
                }
                return new SweepGradient(m38211f5, m38211f6, m38253a.f3311a, m38253a.f3312b);
            } else if (m38211f7 > 0.0f) {
                return new RadialGradient(m38211f5, m38211f6, m38211f7, m38253a.f3311a, m38253a.f3312b, m38250d(m38210g2));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.core.content.res.C0977f.C0978a m38251c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = p356u.C12814i.f33285N
            android.content.res.TypedArray r3 = androidx.core.content.res.C0992l.m38206k(r9, r12, r11, r3)
            int r5 = p356u.C12814i.f33286O
            boolean r6 = r3.hasValue(r5)
            int r7 = p356u.C12814i.f33287P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            androidx.core.content.res.f$a r9 = new androidx.core.content.res.f$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0977f.m38251c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    /* renamed from: d */
    private static Shader.TileMode m38250d(int i) {
        if (i != 1) {
            if (i != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* renamed from: androidx.core.content.res.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0978a {

        /* renamed from: a */
        final int[] f3311a;

        /* renamed from: b */
        final float[] f3312b;

        C0978a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f3311a = new int[size];
            this.f3312b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f3311a[i] = list.get(i).intValue();
                this.f3312b[i] = list2.get(i).floatValue();
            }
        }

        C0978a(int i, int i2) {
            this.f3311a = new int[]{i, i2};
            this.f3312b = new float[]{0.0f, 1.0f};
        }

        C0978a(int i, int i2, int i3) {
            this.f3311a = new int[]{i, i2, i3};
            this.f3312b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.res.C0992l;
import androidx.core.graphics.C1004d;
import com.facebook.react.views.image.ReactImageView;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.vectordrawable.graphics.drawable.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1911e {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1912a implements TypeEvaluator<C1004d.C1006b[]> {

        /* renamed from: a */
        private C1004d.C1006b[] f5247a;

        C1912a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public C1004d.C1006b[] evaluate(float f, C1004d.C1006b[] c1006bArr, C1004d.C1006b[] c1006bArr2) {
            if (C1004d.m38161b(c1006bArr, c1006bArr2)) {
                if (!C1004d.m38161b(this.f5247a, c1006bArr)) {
                    this.f5247a = C1004d.m38157f(c1006bArr);
                }
                for (int i = 0; i < c1006bArr.length; i++) {
                    this.f5247a[i].m38149d(c1006bArr[i], c1006bArr2[i], f);
                }
                return this.f5247a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    private static Animator m35074a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return m35073b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator m35073b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1911e.m35073b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: c */
    private static Keyframe m35072c(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    /* renamed from: d */
    private static void m35071d(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: e */
    private static PropertyValuesHolder m35070e(TypedArray typedArray, int i, int i2, int i3, String str) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        C1913f c1913f;
        int i6;
        int i7;
        int i8;
        float f;
        PropertyValuesHolder ofFloat;
        float f2;
        float f3;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i4 = peekValue.type;
        } else {
            i4 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i3);
        if (peekValue2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i5 = peekValue2.type;
        } else {
            i5 = 0;
        }
        if (i == 4) {
            if ((z && m35067h(i4)) || (z2 && m35067h(i5))) {
                i = 3;
            } else {
                i = 0;
            }
        }
        if (i == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C1004d.C1006b[] m38159d = C1004d.m38159d(string);
            C1004d.C1006b[] m38159d2 = C1004d.m38159d(string2);
            if (m38159d == null && m38159d2 == null) {
                return null;
            }
            if (m38159d != null) {
                C1912a c1912a = new C1912a();
                if (m38159d2 != null) {
                    if (C1004d.m38161b(m38159d, m38159d2)) {
                        ofObject = PropertyValuesHolder.ofObject(str, c1912a, m38159d, m38159d2);
                    } else {
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, c1912a, m38159d);
                }
                return ofObject;
            } else if (m38159d2 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new C1912a(), m38159d2);
            }
        }
        if (i == 3) {
            c1913f = C1913f.m35054a();
        } else {
            c1913f = null;
        }
        if (z3) {
            if (z) {
                if (i4 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z2) {
                    if (i5 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f2, f3);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i5 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f);
            }
            propertyValuesHolder = ofFloat;
        } else if (z) {
            if (i4 == 5) {
                i7 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (m35067h(i4)) {
                i7 = typedArray.getColor(i2, 0);
            } else {
                i7 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i5 == 5) {
                    i8 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (m35067h(i5)) {
                    i8 = typedArray.getColor(i3, 0);
                } else {
                    i8 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i7, i8);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i7);
            }
        } else if (z2) {
            if (i5 == 5) {
                i6 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (m35067h(i5)) {
                i6 = typedArray.getColor(i3, 0);
            } else {
                i6 = typedArray.getInt(i3, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i6);
        }
        if (propertyValuesHolder != null && c1913f != null) {
            propertyValuesHolder.setEvaluator(c1913f);
            return propertyValuesHolder;
        }
        return propertyValuesHolder;
    }

    /* renamed from: f */
    private static int m35069f(TypedArray typedArray, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z2 = true;
        if (peekValue != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = peekValue.type;
        } else {
            i3 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z2 = false;
        }
        if (z2) {
            i4 = peekValue2.type;
        } else {
            i4 = 0;
        }
        if ((!z || !m35067h(i3)) && (!z2 || !m35067h(i4))) {
            return 0;
        }
        return 3;
    }

    /* renamed from: g */
    private static int m35068g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        boolean z;
        TypedArray m38206k = C0992l.m38206k(resources, theme, attributeSet, C1904a.f5231j);
        int i = 0;
        TypedValue m38205l = C0992l.m38205l(m38206k, xmlPullParser, "value", 0);
        if (m38205l != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && m35067h(m38205l.type)) {
            i = 3;
        }
        m38206k.recycle();
        return i;
    }

    /* renamed from: h */
    private static boolean m35067h(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: i */
    public static Animator m35066i(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        return m35065j(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: j */
    public static Animator m35065j(Context context, Resources resources, Resources.Theme theme, int i) {
        return m35064k(context, resources, theme, i, 1.0f);
    }

    /* renamed from: k */
    public static Animator m35064k(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i);
                    return m35074a(context, resources, theme, xmlResourceParser, f);
                } catch (IOException e) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: l */
    private static ValueAnimator m35063l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray m38206k = C0992l.m38206k(resources, theme, attributeSet, C1904a.f5228g);
        TypedArray m38206k2 = C0992l.m38206k(resources, theme, attributeSet, C1904a.f5232k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m35058q(valueAnimator, m38206k, m38206k2, f, xmlPullParser);
        int m38209h = C0992l.m38209h(m38206k, xmlPullParser, "interpolator", 0, 0);
        if (m38209h > 0) {
            valueAnimator.setInterpolator(C1910d.m35075a(context, m38209h));
        }
        m38206k.recycle();
        if (m38206k2 != null) {
            m38206k2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: m */
    private static Keyframe m35062m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        boolean z;
        Keyframe ofInt;
        TypedArray m38206k = C0992l.m38206k(resources, theme, attributeSet, C1904a.f5231j);
        float m38211f = C0992l.m38211f(m38206k, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue m38205l = C0992l.m38205l(m38206k, xmlPullParser, "value", 0);
        if (m38205l != null) {
            z = true;
        } else {
            z = false;
        }
        if (i == 4) {
            if (z && m35067h(m38205l.type)) {
                i = 3;
            } else {
                i = 0;
            }
        }
        if (z) {
            if (i != 0) {
                if (i != 1 && i != 3) {
                    ofInt = null;
                } else {
                    ofInt = Keyframe.ofInt(m38211f, C0992l.m38210g(m38206k, xmlPullParser, "value", 0, 0));
                }
            } else {
                ofInt = Keyframe.ofFloat(m38211f, C0992l.m38211f(m38206k, xmlPullParser, "value", 0, 0.0f));
            }
        } else if (i == 0) {
            ofInt = Keyframe.ofFloat(m38211f);
        } else {
            ofInt = Keyframe.ofInt(m38211f);
        }
        int m38209h = C0992l.m38209h(m38206k, xmlPullParser, "interpolator", 1, 0);
        if (m38209h > 0) {
            ofInt.setInterpolator(C1910d.m35075a(context, m38209h));
        }
        m38206k.recycle();
        return ofInt;
    }

    /* renamed from: n */
    private static ObjectAnimator m35061n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m35063l(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: o */
    private static PropertyValuesHolder m35060o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i == 4) {
                    i = m35068g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m35062m = m35062m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
                if (m35062m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m35062m);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m35072c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m35072c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i2 = 0; i2 < size; i2++) {
                Keyframe keyframe3 = keyframeArr[i2];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i2 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i3 = size - 1;
                        if (i2 == i3) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i4 = i2;
                            for (int i5 = i2 + 1; i5 < i3 && keyframeArr[i5].getFraction() < 0.0f; i5++) {
                                i4 = i5;
                            }
                            m35071d(keyframeArr, keyframeArr[i4 + 1].getFraction() - keyframeArr[i2 - 1].getFraction(), i2, i4);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i == 3) {
                propertyValuesHolder.setEvaluator(C1913f.m35054a());
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: p */
    private static PropertyValuesHolder[] m35059p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            } else if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray m38206k = C0992l.m38206k(resources, theme, attributeSet, C1904a.f5230i);
                    String m38208i = C0992l.m38208i(m38206k, xmlPullParser, "propertyName", 3);
                    int m38210g = C0992l.m38210g(m38206k, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder m35060o = m35060o(context, resources, theme, xmlPullParser, m38208i, m38210g);
                    if (m35060o == null) {
                        m35060o = m35070e(m38206k, m38210g, 0, 1, m38208i);
                    }
                    if (m35060o != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(m35060o);
                    }
                    m38206k.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i = 0; i < size; i++) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
            }
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: q */
    private static void m35058q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long m38210g = C0992l.m38210g(typedArray, xmlPullParser, "duration", 1, ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS);
        long m38210g2 = C0992l.m38210g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int m38210g3 = C0992l.m38210g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0992l.m38207j(xmlPullParser, "valueFrom") && C0992l.m38207j(xmlPullParser, "valueTo")) {
            if (m38210g3 == 4) {
                m38210g3 = m35069f(typedArray, 5, 6);
            }
            PropertyValuesHolder m35070e = m35070e(typedArray, m38210g3, 5, 6, "");
            if (m35070e != null) {
                valueAnimator.setValues(m35070e);
            }
        }
        valueAnimator.setDuration(m38210g);
        valueAnimator.setStartDelay(m38210g2);
        valueAnimator.setRepeatCount(C0992l.m38210g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0992l.m38210g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m35057r(valueAnimator, typedArray2, m38210g3, f, xmlPullParser);
        }
    }

    /* renamed from: r */
    private static void m35057r(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m38208i = C0992l.m38208i(typedArray, xmlPullParser, "pathData", 1);
        if (m38208i != null) {
            String m38208i2 = C0992l.m38208i(typedArray, xmlPullParser, "propertyXName", 2);
            String m38208i3 = C0992l.m38208i(typedArray, xmlPullParser, "propertyYName", 3);
            if (i != 2) {
            }
            if (m38208i2 == null && m38208i3 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            m35056s(C1004d.m38158e(m38208i), objectAnimator, f * 0.5f, m38208i2, m38208i3);
            return;
        }
        objectAnimator.setPropertyName(C0992l.m38208i(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: s */
    private static void m35056s(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / (min - 1);
        int i = 0;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        if (str != null) {
            propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str, fArr);
        } else {
            propertyValuesHolder2 = null;
        }
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (propertyValuesHolder2 == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(propertyValuesHolder2);
        } else {
            objectAnimator.setValues(propertyValuesHolder2, propertyValuesHolder);
        }
    }
}

package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C1365w0;
import com.facebook.react.uimanager.ViewDefaults;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p052d.C5715j;
import p164j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0507f0 {

    /* renamed from: l */
    private static final RectF f1790l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m */
    private static ConcurrentHashMap<String, Method> f1791m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: n */
    private static ConcurrentHashMap<String, Field> f1792n = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1793a = 0;

    /* renamed from: b */
    private boolean f1794b = false;

    /* renamed from: c */
    private float f1795c = -1.0f;

    /* renamed from: d */
    private float f1796d = -1.0f;

    /* renamed from: e */
    private float f1797e = -1.0f;

    /* renamed from: f */
    private int[] f1798f = new int[0];

    /* renamed from: g */
    private boolean f1799g = false;

    /* renamed from: h */
    private TextPaint f1800h;

    /* renamed from: i */
    private final TextView f1801i;

    /* renamed from: j */
    private final Context f1802j;

    /* renamed from: k */
    private final C0513f f1803k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.f0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0508a {
        /* renamed from: a */
        static StaticLayout m39901a(CharSequence charSequence, Layout.Alignment alignment, int i, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        /* renamed from: b */
        static int m39900b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.f0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0509b {
        /* renamed from: a */
        static boolean m39899a(View view) {
            return view.isInLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.f0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0510c {
        /* renamed from: a */
        static StaticLayout m39898a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, C0513f c0513f) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = ViewDefaults.NUMBER_OF_LINES;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                c0513f.mo39897a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C0511d extends C0513f {
        C0511d() {
        }

        @Override // androidx.appcompat.widget.C0507f0.C0513f
        /* renamed from: a */
        void mo39897a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0507f0.m39915m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C0512e extends C0511d {
        C0512e() {
        }

        @Override // androidx.appcompat.widget.C0507f0.C0511d, androidx.appcompat.widget.C0507f0.C0513f
        /* renamed from: a */
        void mo39897a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.C0507f0.C0513f
        /* renamed from: b */
        boolean mo39896b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.f0$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0513f {
        C0513f() {
        }

        /* renamed from: a */
        void mo39897a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        /* renamed from: b */
        boolean mo39896b(TextView textView) {
            return ((Boolean) C0507f0.m39915m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0507f0(TextView textView) {
        this.f1801i = textView;
        this.f1802j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1803k = new C0512e();
        } else {
            this.f1803k = new C0511d();
        }
    }

    /* renamed from: b */
    private int[] m39926b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    private void m39925c() {
        this.f1793a = 0;
        this.f1796d = -1.0f;
        this.f1797e = -1.0f;
        this.f1795c = -1.0f;
        this.f1798f = new int[0];
        this.f1794b = false;
    }

    /* renamed from: e */
    private int m39923e(RectF rectF) {
        int length = this.f1798f.length;
        if (length != 0) {
            int i = 1;
            int i2 = length - 1;
            int i3 = 0;
            while (i <= i2) {
                int i4 = (i + i2) / 2;
                if (m39904x(this.f1798f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i;
                    i = i5;
                } else {
                    i3 = i4 - 1;
                    i2 = i3;
                }
            }
            return this.f1798f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: k */
    private static Method m39917k(String str) {
        try {
            Method method = f1791m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1791m.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: m */
    static <T> T m39915m(Object obj, String str, T t) {
        try {
            return (T) m39917k(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: s */
    private void m39909s(float f) {
        if (f != this.f1801i.getPaint().getTextSize()) {
            this.f1801i.getPaint().setTextSize(f);
            boolean m39899a = C0509b.m39899a(this.f1801i);
            if (this.f1801i.getLayout() != null) {
                this.f1794b = false;
                try {
                    Method m39917k = m39917k("nullLayouts");
                    if (m39917k != null) {
                        m39917k.invoke(this.f1801i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!m39899a) {
                    this.f1801i.requestLayout();
                } else {
                    this.f1801i.forceLayout();
                }
                this.f1801i.invalidate();
            }
        }
    }

    /* renamed from: u */
    private boolean m39907u() {
        if (m39903y() && this.f1793a == 1) {
            if (!this.f1799g || this.f1798f.length == 0) {
                int floor = ((int) Math.floor((this.f1797e - this.f1796d) / this.f1795c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1796d + (i * this.f1795c));
                }
                this.f1798f = m39926b(iArr);
            }
            this.f1794b = true;
        } else {
            this.f1794b = false;
        }
        return this.f1794b;
    }

    /* renamed from: v */
    private void m39906v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1798f = m39926b(iArr);
            m39905w();
        }
    }

    /* renamed from: w */
    private boolean m39905w() {
        int[] iArr;
        int length;
        boolean z;
        if (this.f1798f.length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f1799g = z;
        if (z) {
            this.f1793a = 1;
            this.f1796d = iArr[0];
            this.f1797e = iArr[length - 1];
            this.f1795c = -1.0f;
        }
        return z;
    }

    /* renamed from: x */
    private boolean m39904x(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1801i.getText();
        TransformationMethod transformationMethod = this.f1801i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1801i)) != null) {
            text = transformation;
        }
        int m39900b = C0508a.m39900b(this.f1801i);
        m39916l(i);
        StaticLayout m39924d = m39924d(text, (Layout.Alignment) m39915m(this.f1801i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), m39900b);
        if ((m39900b != -1 && (m39924d.getLineCount() > m39900b || m39924d.getLineEnd(m39924d.getLineCount() - 1) != text.length())) || m39924d.getHeight() > rectF.bottom) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private boolean m39903y() {
        return !(this.f1801i instanceof AppCompatEditText);
    }

    /* renamed from: z */
    private void m39902z(float f, float f2, float f3) {
        if (f > 0.0f) {
            if (f2 > f) {
                if (f3 > 0.0f) {
                    this.f1793a = 1;
                    this.f1796d = f;
                    this.f1797e = f2;
                    this.f1795c = f3;
                    this.f1799g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m39927a() {
        int measuredWidth;
        if (!m39914n()) {
            return;
        }
        if (this.f1794b) {
            if (this.f1801i.getMeasuredHeight() > 0 && this.f1801i.getMeasuredWidth() > 0) {
                if (this.f1803k.mo39896b(this.f1801i)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.f1801i.getMeasuredWidth() - this.f1801i.getTotalPaddingLeft()) - this.f1801i.getTotalPaddingRight();
                }
                int height = (this.f1801i.getHeight() - this.f1801i.getCompoundPaddingBottom()) - this.f1801i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f1790l;
                    synchronized (rectF) {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float m39923e = m39923e(rectF);
                        if (m39923e != this.f1801i.getTextSize()) {
                            m39908t(0, m39923e);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f1794b = true;
    }

    /* renamed from: d */
    StaticLayout m39924d(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        return C0510c.m39898a(charSequence, alignment, i, i2, this.f1801i, this.f1800h, this.f1803k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m39922f() {
        return Math.round(this.f1797e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m39921g() {
        return Math.round(this.f1796d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m39920h() {
        return Math.round(this.f1795c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int[] m39919i() {
        return this.f1798f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m39918j() {
        return this.f1793a;
    }

    /* renamed from: l */
    void m39916l(int i) {
        TextPaint textPaint = this.f1800h;
        if (textPaint == null) {
            this.f1800h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1800h.set(this.f1801i.getPaint());
        this.f1800h.setTextSize(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m39914n() {
        return m39903y() && this.f1793a != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m39913o(AttributeSet attributeSet, int i) {
        float f;
        float f2;
        float f3;
        int resourceId;
        Context context = this.f1802j;
        int[] iArr = C5715j.f16376g0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f1801i;
        C1365w0.m37189o0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = C5715j.f16401l0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f1793a = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = C5715j.f16396k0;
        if (obtainStyledAttributes.hasValue(i3)) {
            f = obtainStyledAttributes.getDimension(i3, -1.0f);
        } else {
            f = -1.0f;
        }
        int i4 = C5715j.f16386i0;
        if (obtainStyledAttributes.hasValue(i4)) {
            f2 = obtainStyledAttributes.getDimension(i4, -1.0f);
        } else {
            f2 = -1.0f;
        }
        int i5 = C5715j.f16381h0;
        if (obtainStyledAttributes.hasValue(i5)) {
            f3 = obtainStyledAttributes.getDimension(i5, -1.0f);
        } else {
            f3 = -1.0f;
        }
        int i6 = C5715j.f16391j0;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m39906v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (m39903y()) {
            if (this.f1793a == 1) {
                if (!this.f1799g) {
                    DisplayMetrics displayMetrics = this.f1802j.getResources().getDisplayMetrics();
                    if (f2 == -1.0f) {
                        f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (f3 == -1.0f) {
                        f3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (f == -1.0f) {
                        f = 1.0f;
                    }
                    m39902z(f2, f3, f);
                }
                m39907u();
                return;
            }
            return;
        }
        this.f1793a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m39912p(int i, int i2, int i3, int i4) {
        if (m39903y()) {
            DisplayMetrics displayMetrics = this.f1802j.getResources().getDisplayMetrics();
            m39902z(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m39907u()) {
                m39927a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m39911q(int[] iArr, int i) {
        if (m39903y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1802j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f1798f = m39926b(iArr2);
                if (!m39905w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1799g = false;
            }
            if (m39907u()) {
                m39927a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m39910r(int i) {
        if (m39903y()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = this.f1802j.getResources().getDisplayMetrics();
                    m39902z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (m39907u()) {
                        m39927a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            m39925c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m39908t(int i, float f) {
        Resources resources;
        Context context = this.f1802j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m39909s(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }
}

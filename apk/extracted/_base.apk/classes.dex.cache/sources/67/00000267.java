package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.C0980h;
import p071e.C6029a;

/* renamed from: androidx.appcompat.widget.n1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0544n1 {

    /* renamed from: a */
    private final Context f1897a;

    /* renamed from: b */
    private final TypedArray f1898b;

    /* renamed from: c */
    private TypedValue f1899c;

    private C0544n1(Context context, TypedArray typedArray) {
        this.f1897a = context;
        this.f1898b = typedArray;
    }

    /* renamed from: t */
    public static C0544n1 m39782t(Context context, int i, int[] iArr) {
        return new C0544n1(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: u */
    public static C0544n1 m39781u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0544n1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static C0544n1 m39780v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0544n1(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean m39801a(int i, boolean z) {
        return this.f1898b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int m39800b(int i, int i2) {
        return this.f1898b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList m39799c(int i) {
        int resourceId;
        ColorStateList m23854a;
        if (this.f1898b.hasValue(i) && (resourceId = this.f1898b.getResourceId(i, 0)) != 0 && (m23854a = C6029a.m23854a(this.f1897a, resourceId)) != null) {
            return m23854a;
        }
        return this.f1898b.getColorStateList(i);
    }

    /* renamed from: d */
    public float m39798d(int i, float f) {
        return this.f1898b.getDimension(i, f);
    }

    /* renamed from: e */
    public int m39797e(int i, int i2) {
        return this.f1898b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int m39796f(int i, int i2) {
        return this.f1898b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: g */
    public Drawable m39795g(int i) {
        int resourceId;
        if (this.f1898b.hasValue(i) && (resourceId = this.f1898b.getResourceId(i, 0)) != 0) {
            return C6029a.m23853b(this.f1897a, resourceId);
        }
        return this.f1898b.getDrawable(i);
    }

    /* renamed from: h */
    public Drawable m39794h(int i) {
        int resourceId;
        if (this.f1898b.hasValue(i) && (resourceId = this.f1898b.getResourceId(i, 0)) != 0) {
            return C0529j.m39839b().m39837d(this.f1897a, resourceId, true);
        }
        return null;
    }

    /* renamed from: i */
    public float m39793i(int i, float f) {
        return this.f1898b.getFloat(i, f);
    }

    /* renamed from: j */
    public Typeface m39792j(int i, int i2, C0980h.AbstractC0985e abstractC0985e) {
        int resourceId = this.f1898b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1899c == null) {
            this.f1899c = new TypedValue();
        }
        return C0980h.m38238i(this.f1897a, resourceId, this.f1899c, i2, abstractC0985e);
    }

    /* renamed from: k */
    public int m39791k(int i, int i2) {
        return this.f1898b.getInt(i, i2);
    }

    /* renamed from: l */
    public int m39790l(int i, int i2) {
        return this.f1898b.getInteger(i, i2);
    }

    /* renamed from: m */
    public int m39789m(int i, int i2) {
        return this.f1898b.getLayoutDimension(i, i2);
    }

    /* renamed from: n */
    public int m39788n(int i, int i2) {
        return this.f1898b.getResourceId(i, i2);
    }

    /* renamed from: o */
    public String m39787o(int i) {
        return this.f1898b.getString(i);
    }

    /* renamed from: p */
    public CharSequence m39786p(int i) {
        return this.f1898b.getText(i);
    }

    /* renamed from: q */
    public CharSequence[] m39785q(int i) {
        return this.f1898b.getTextArray(i);
    }

    /* renamed from: r */
    public TypedArray m39784r() {
        return this.f1898b;
    }

    /* renamed from: s */
    public boolean m39783s(int i) {
        return this.f1898b.hasValue(i);
    }

    /* renamed from: w */
    public void m39779w() {
        this.f1898b.recycle();
    }
}
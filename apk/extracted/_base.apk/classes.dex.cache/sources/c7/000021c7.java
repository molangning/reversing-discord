package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.react.views.image.ReactImageView;
import java.util.Arrays;
import java.util.List;
import p394w2.C13379j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class GenericDraweeHierarchyBuilder {

    /* renamed from: t */
    public static final ScalingUtils.ScaleType f9964t = ScalingUtils.ScaleType.f9843h;

    /* renamed from: u */
    public static final ScalingUtils.ScaleType f9965u = ScalingUtils.ScaleType.f9844i;

    /* renamed from: a */
    private Resources f9966a;

    /* renamed from: b */
    private int f9967b;

    /* renamed from: c */
    private float f9968c;

    /* renamed from: d */
    private Drawable f9969d;

    /* renamed from: e */
    private ScalingUtils.ScaleType f9970e;

    /* renamed from: f */
    private Drawable f9971f;

    /* renamed from: g */
    private ScalingUtils.ScaleType f9972g;

    /* renamed from: h */
    private Drawable f9973h;

    /* renamed from: i */
    private ScalingUtils.ScaleType f9974i;

    /* renamed from: j */
    private Drawable f9975j;

    /* renamed from: k */
    private ScalingUtils.ScaleType f9976k;

    /* renamed from: l */
    private ScalingUtils.ScaleType f9977l;

    /* renamed from: m */
    private Matrix f9978m;

    /* renamed from: n */
    private PointF f9979n;

    /* renamed from: o */
    private ColorFilter f9980o;

    /* renamed from: p */
    private Drawable f9981p;

    /* renamed from: q */
    private List<Drawable> f9982q;

    /* renamed from: r */
    private Drawable f9983r;

    /* renamed from: s */
    private C3628a f9984s;

    public GenericDraweeHierarchyBuilder(Resources resources) {
        this.f9966a = resources;
        m31428t();
    }

    /* renamed from: L */
    private void m31448L() {
        List<Drawable> list = this.f9982q;
        if (list != null) {
            for (Drawable drawable : list) {
                C13379j.m2677g(drawable);
            }
        }
    }

    /* renamed from: t */
    private void m31428t() {
        this.f9967b = ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS;
        this.f9968c = 0.0f;
        this.f9969d = null;
        ScalingUtils.ScaleType scaleType = f9964t;
        this.f9970e = scaleType;
        this.f9971f = null;
        this.f9972g = scaleType;
        this.f9973h = null;
        this.f9974i = scaleType;
        this.f9975j = null;
        this.f9976k = scaleType;
        this.f9977l = f9965u;
        this.f9978m = null;
        this.f9979n = null;
        this.f9980o = null;
        this.f9981p = null;
        this.f9982q = null;
        this.f9983r = null;
        this.f9984s = null;
    }

    /* renamed from: u */
    public static GenericDraweeHierarchyBuilder m31427u(Resources resources) {
        return new GenericDraweeHierarchyBuilder(resources);
    }

    /* renamed from: A */
    public GenericDraweeHierarchyBuilder m31459A(Drawable drawable) {
        this.f9973h = drawable;
        return this;
    }

    /* renamed from: B */
    public GenericDraweeHierarchyBuilder m31458B(ScalingUtils.ScaleType scaleType) {
        this.f9974i = scaleType;
        return this;
    }

    /* renamed from: C */
    public GenericDraweeHierarchyBuilder m31457C(Drawable drawable) {
        if (drawable == null) {
            this.f9982q = null;
        } else {
            this.f9982q = Arrays.asList(drawable);
        }
        return this;
    }

    /* renamed from: D */
    public GenericDraweeHierarchyBuilder m31456D(Drawable drawable) {
        this.f9969d = drawable;
        return this;
    }

    /* renamed from: E */
    public GenericDraweeHierarchyBuilder m31455E(ScalingUtils.ScaleType scaleType) {
        this.f9970e = scaleType;
        return this;
    }

    /* renamed from: F */
    public GenericDraweeHierarchyBuilder m31454F(Drawable drawable) {
        if (drawable == null) {
            this.f9983r = null;
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, drawable);
            this.f9983r = stateListDrawable;
        }
        return this;
    }

    /* renamed from: G */
    public GenericDraweeHierarchyBuilder m31453G(Drawable drawable) {
        this.f9975j = drawable;
        return this;
    }

    /* renamed from: H */
    public GenericDraweeHierarchyBuilder m31452H(ScalingUtils.ScaleType scaleType) {
        this.f9976k = scaleType;
        return this;
    }

    /* renamed from: I */
    public GenericDraweeHierarchyBuilder m31451I(Drawable drawable) {
        this.f9971f = drawable;
        return this;
    }

    /* renamed from: J */
    public GenericDraweeHierarchyBuilder m31450J(ScalingUtils.ScaleType scaleType) {
        this.f9972g = scaleType;
        return this;
    }

    /* renamed from: K */
    public GenericDraweeHierarchyBuilder m31449K(C3628a c3628a) {
        this.f9984s = c3628a;
        return this;
    }

    /* renamed from: a */
    public GenericDraweeHierarchy m31447a() {
        m31448L();
        return new GenericDraweeHierarchy(this);
    }

    /* renamed from: b */
    public ColorFilter m31446b() {
        return this.f9980o;
    }

    /* renamed from: c */
    public PointF m31445c() {
        return this.f9979n;
    }

    /* renamed from: d */
    public ScalingUtils.ScaleType m31444d() {
        return this.f9977l;
    }

    /* renamed from: e */
    public Drawable m31443e() {
        return this.f9981p;
    }

    /* renamed from: f */
    public float m31442f() {
        return this.f9968c;
    }

    /* renamed from: g */
    public int m31441g() {
        return this.f9967b;
    }

    /* renamed from: h */
    public Drawable m31440h() {
        return this.f9973h;
    }

    /* renamed from: i */
    public ScalingUtils.ScaleType m31439i() {
        return this.f9974i;
    }

    /* renamed from: j */
    public List<Drawable> m31438j() {
        return this.f9982q;
    }

    /* renamed from: k */
    public Drawable m31437k() {
        return this.f9969d;
    }

    /* renamed from: l */
    public ScalingUtils.ScaleType m31436l() {
        return this.f9970e;
    }

    /* renamed from: m */
    public Drawable m31435m() {
        return this.f9983r;
    }

    /* renamed from: n */
    public Drawable m31434n() {
        return this.f9975j;
    }

    /* renamed from: o */
    public ScalingUtils.ScaleType m31433o() {
        return this.f9976k;
    }

    /* renamed from: p */
    public Resources m31432p() {
        return this.f9966a;
    }

    /* renamed from: q */
    public Drawable m31431q() {
        return this.f9971f;
    }

    /* renamed from: r */
    public ScalingUtils.ScaleType m31430r() {
        return this.f9972g;
    }

    /* renamed from: s */
    public C3628a m31429s() {
        return this.f9984s;
    }

    /* renamed from: v */
    public GenericDraweeHierarchyBuilder m31426v(ColorFilter colorFilter) {
        this.f9980o = colorFilter;
        return this;
    }

    /* renamed from: w */
    public GenericDraweeHierarchyBuilder m31425w(ScalingUtils.ScaleType scaleType) {
        this.f9977l = scaleType;
        this.f9978m = null;
        return this;
    }

    /* renamed from: x */
    public GenericDraweeHierarchyBuilder m31424x(Drawable drawable) {
        this.f9981p = drawable;
        return this;
    }

    /* renamed from: y */
    public GenericDraweeHierarchyBuilder m31423y(float f) {
        this.f9968c = f;
        return this;
    }

    /* renamed from: z */
    public GenericDraweeHierarchyBuilder m31422z(int i) {
        this.f9967b = i;
        return this;
    }
}
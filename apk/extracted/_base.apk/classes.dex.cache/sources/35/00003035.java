package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0017J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0015H\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, m14357d2 = {"Lcom/th3rdwave/safeareacontext/n;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "", "c", "Lcom/th3rdwave/safeareacontext/j;", "edgeMode", "", "insetValue", "edgeValue", "a", "Lcom/th3rdwave/safeareacontext/m;", "mode", "b", "Lcom/facebook/react/uimanager/NativeViewHierarchyOptimizer;", "nativeViewHierarchyOptimizer", "onBeforeLayout", "", "data", "setLocalData", "", "index", "Lcom/facebook/react/bridge/Dynamic;", ViewProps.PADDING, "setPaddings", ViewProps.MARGIN, "setMargins", "Lcom/th3rdwave/safeareacontext/l;", "Lcom/th3rdwave/safeareacontext/l;", "mLocalData", "", "[F", "mPaddings", "mMargins", "", "d", "Z", "mNeedsUpdate", "<init>", "()V", "react-native-safe-area-context_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.th3rdwave.safeareacontext.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5680n extends LayoutShadowNode {

    /* renamed from: a */
    private C5678l f15862a;

    /* renamed from: b */
    private final float[] f15863b;

    /* renamed from: c */
    private final float[] f15864c;

    /* renamed from: d */
    private boolean f15865d;

    public C5680n() {
        int[] iArr = ViewProps.PADDING_MARGIN_SPACING_TYPES;
        this.f15863b = new float[iArr.length];
        this.f15864c = new float[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            this.f15863b[i] = Float.NaN;
            this.f15864c[i] = Float.NaN;
        }
    }

    /* renamed from: a */
    private final float m24755a(EnumC5676j enumC5676j, float f, float f2) {
        if (enumC5676j == EnumC5676j.OFF) {
            return f2;
        }
        if (enumC5676j == EnumC5676j.MAXIMUM) {
            return Math.max(f, f2);
        }
        return f + f2;
    }

    /* renamed from: b */
    private final void m24754b(EnumC5679m enumC5679m) {
        if (enumC5679m == EnumC5679m.PADDING) {
            super.setPadding(1, this.f15863b[1]);
            super.setPadding(2, this.f15863b[1]);
            super.setPadding(3, this.f15863b[3]);
            super.setPadding(0, this.f15863b[0]);
        } else {
            super.setMargin(1, this.f15864c[1]);
            super.setMargin(2, this.f15864c[1]);
            super.setMargin(3, this.f15864c[3]);
            super.setMargin(0, this.f15864c[0]);
        }
        markUpdated();
    }

    /* renamed from: c */
    private final void m24753c() {
        float[] fArr;
        C5678l c5678l = this.f15862a;
        if (c5678l == null) {
            return;
        }
        EnumC5679m m24757c = c5678l.m24757c();
        EnumC5679m enumC5679m = EnumC5679m.PADDING;
        if (m24757c == enumC5679m) {
            fArr = this.f15863b;
        } else {
            fArr = this.f15864c;
        }
        float f = fArr[8];
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        float f2 = f;
        float f3 = f2;
        float f4 = f3;
        float f5 = fArr[7];
        if (!Float.isNaN(f5)) {
            f = f5;
            f3 = f;
        }
        float f6 = fArr[6];
        if (!Float.isNaN(f6)) {
            f2 = f6;
            f4 = f2;
        }
        float f7 = fArr[1];
        if (!Float.isNaN(f7)) {
            f = f7;
        }
        float f8 = fArr[2];
        if (!Float.isNaN(f8)) {
            f2 = f8;
        }
        float f9 = fArr[3];
        if (!Float.isNaN(f9)) {
            f3 = f9;
        }
        float f10 = fArr[0];
        if (!Float.isNaN(f10)) {
            f4 = f10;
        }
        float pixelFromDIP = PixelUtil.toPixelFromDIP(f);
        float pixelFromDIP2 = PixelUtil.toPixelFromDIP(f2);
        float pixelFromDIP3 = PixelUtil.toPixelFromDIP(f3);
        float pixelFromDIP4 = PixelUtil.toPixelFromDIP(f4);
        C5677k m24759a = c5678l.m24759a();
        EdgeInsets m24758b = c5678l.m24758b();
        if (c5678l.m24757c() == enumC5679m) {
            super.setPadding(1, m24755a(m24759a.m24760d(), m24758b.m24790d(), pixelFromDIP));
            super.setPadding(2, m24755a(m24759a.m24761c(), m24758b.m24791c(), pixelFromDIP2));
            super.setPadding(3, m24755a(m24759a.m24763a(), m24758b.m24793a(), pixelFromDIP3));
            super.setPadding(0, m24755a(m24759a.m24762b(), m24758b.m24792b(), pixelFromDIP4));
            return;
        }
        super.setMargin(1, m24755a(m24759a.m24760d(), m24758b.m24790d(), pixelFromDIP));
        super.setMargin(2, m24755a(m24759a.m24761c(), m24758b.m24791c(), pixelFromDIP2));
        super.setMargin(3, m24755a(m24759a.m24763a(), m24758b.m24793a(), pixelFromDIP3));
        super.setMargin(0, m24755a(m24759a.m24762b(), m24758b.m24792b(), pixelFromDIP4));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        C9612q.m13917h(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        if (this.f15865d) {
            this.f15865d = false;
            m24753c();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(Object data) {
        C9612q.m13917h(data, "data");
        if (!(data instanceof C5678l)) {
            return;
        }
        C5678l c5678l = this.f15862a;
        if (c5678l != null && c5678l.m24757c() != ((C5678l) data).m24757c()) {
            m24754b(c5678l.m24757c());
        }
        this.f15862a = (C5678l) data;
        this.f15865d = false;
        m24753c();
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    @ReactPropGroup(names = {ViewProps.MARGIN, ViewProps.MARGIN_VERTICAL, ViewProps.MARGIN_HORIZONTAL, ViewProps.MARGIN_START, ViewProps.MARGIN_END, ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, ViewProps.MARGIN_LEFT, ViewProps.MARGIN_RIGHT})
    public void setMargins(int i, Dynamic margin) {
        float f;
        C9612q.m13917h(margin, "margin");
        int i2 = ViewProps.PADDING_MARGIN_SPACING_TYPES[i];
        float[] fArr = this.f15864c;
        if (margin.getType() == ReadableType.Number) {
            f = (float) margin.asDouble();
        } else {
            f = Float.NaN;
        }
        fArr[i2] = f;
        super.setMargins(i, margin);
        this.f15865d = true;
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    @ReactPropGroup(names = {ViewProps.PADDING, ViewProps.PADDING_VERTICAL, ViewProps.PADDING_HORIZONTAL, ViewProps.PADDING_START, ViewProps.PADDING_END, ViewProps.PADDING_TOP, ViewProps.PADDING_BOTTOM, ViewProps.PADDING_LEFT, ViewProps.PADDING_RIGHT})
    public void setPaddings(int i, Dynamic padding) {
        float f;
        C9612q.m13917h(padding, "padding");
        int i2 = ViewProps.PADDING_MARGIN_SPACING_TYPES[i];
        float[] fArr = this.f15863b;
        if (padding.getType() == ReadableType.Number) {
            f = (float) padding.asDouble();
        } else {
            f = Float.NaN;
        }
        fArr[i2] = f;
        super.setPaddings(i, padding);
        this.f15865d = true;
    }
}
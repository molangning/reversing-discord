package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import p414x2.C13677a;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5207c extends C5227l {
    public C5207c(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5227l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        C13677a.m1870H(ReactConstants.TAG, "RNSVG: ClipPath can't be drawn, it should be defined as a child component for `Defs` ");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5227l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public boolean isResponsible() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView
    public void mergeProperties(RenderableView renderableView) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5227l, com.horcrux.svg.RenderableView
    public void resetProperties() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5227l, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        getSvgView().defineClipPath(this, this.mName);
    }
}

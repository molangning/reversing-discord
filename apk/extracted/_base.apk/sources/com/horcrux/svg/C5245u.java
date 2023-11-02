package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5245u extends RenderableView {

    /* renamed from: j */
    private Path f14855j;

    public C5245u(ReactContext reactContext) {
        super(reactContext);
        C5243t.f14831a = this.mScale;
        this.f14855j = new Path();
    }

    /* renamed from: b */
    public void m25693b(String str) {
        C5249w[] c5249wArr;
        this.f14855j = C5243t.m25735o(str);
        ArrayList<C5241s> arrayList = C5243t.f14836f;
        this.elements = arrayList;
        Iterator<C5241s> it = arrayList.iterator();
        while (it.hasNext()) {
            for (C5249w c5249w : it.next().f14827b) {
                double d = c5249w.f14875a;
                float f = this.mScale;
                c5249w.f14875a = d * f;
                c5249w.f14876b *= f;
            }
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        return this.f14855j;
    }
}

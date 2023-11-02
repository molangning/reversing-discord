package com.facebook.react.views.traceupdateoverlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.uimanager.PixelUtil;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class TraceUpdateOverlay extends View {
    private final Paint mOverlayPaint;
    private List<Overlay> mOverlays;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class Overlay {
        private final int mColor;
        private final RectF mRect;

        public Overlay(int i, RectF rectF) {
            this.mColor = i;
            this.mRect = rectF;
        }

        public int getColor() {
            return this.mColor;
        }

        public RectF getPixelRect() {
            return new RectF(PixelUtil.toPixelFromDIP(this.mRect.left), PixelUtil.toPixelFromDIP(this.mRect.top), PixelUtil.toPixelFromDIP(this.mRect.right), PixelUtil.toPixelFromDIP(this.mRect.bottom));
        }
    }

    public TraceUpdateOverlay(Context context) {
        super(context);
        Paint paint = new Paint();
        this.mOverlayPaint = paint;
        this.mOverlays = new ArrayList();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mOverlays.isEmpty()) {
            for (Overlay overlay : this.mOverlays) {
                this.mOverlayPaint.setColor(overlay.getColor());
                canvas.drawRect(overlay.getPixelRect(), this.mOverlayPaint);
            }
        }
    }

    public void setOverlays(List<Overlay> list) {
        this.mOverlays = list;
        invalidate();
    }
}
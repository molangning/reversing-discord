package com.discord.animatable_underlay;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0000¢\u0006\u0002\b+R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR$\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR$\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m14357d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlayBorders;", "", "()V", "value", "", ViewProps.BORDER_BOTTOM_LEFT_RADIUS, "getBorderBottomLeftRadius", "()F", "setBorderBottomLeftRadius", "(F)V", ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, "getBorderBottomRightRadius", "setBorderBottomRightRadius", ViewProps.BORDER_COLOR, "", "getBorderColor", "()I", "setBorderColor", "(I)V", "borderRadiusRadii", "", "getBorderRadiusRadii", "()[F", "borderStrokeRadiusRadii", ViewProps.BORDER_TOP_LEFT_RADIUS, "getBorderTopLeftRadius", "setBorderTopLeftRadius", ViewProps.BORDER_TOP_RIGHT_RADIUS, "getBorderTopRightRadius", "setBorderTopRightRadius", ViewProps.BORDER_WIDTH, "getBorderWidth", "setBorderWidth", "path", "Landroid/graphics/Path;", "drawBorderStroke", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "pathRect", "Landroid/graphics/RectF;", "drawBorderStroke$animatable_underlay_release", "animatable_underlay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class AnimatableUnderlayBorders {
    private float borderBottomRightRadius;
    private int borderColor;
    private final float[] borderRadiusRadii;
    private final float[] borderStrokeRadiusRadii;
    private float borderWidth;
    private final Path path = new Path();
    private float borderTopLeftRadius = SizeUtilsKt.getDpToPx(0);
    private float borderTopRightRadius = SizeUtilsKt.getDpToPx(0);
    private float borderBottomLeftRadius = SizeUtilsKt.getDpToPx(0);

    public AnimatableUnderlayBorders() {
        float dpToPx = SizeUtilsKt.getDpToPx(0);
        this.borderBottomRightRadius = dpToPx;
        float f = this.borderTopLeftRadius;
        float f2 = this.borderTopRightRadius;
        float f3 = this.borderBottomLeftRadius;
        this.borderRadiusRadii = new float[]{f, f, f2, f2, dpToPx, dpToPx, f3, f3};
        float f4 = this.borderWidth;
        this.borderStrokeRadiusRadii = new float[]{f - f4, f - f4, f2 - f4, f2 - f4, dpToPx - f4, dpToPx - f4, f3 - f4, f3 - f4};
    }

    public final void drawBorderStroke$animatable_underlay_release(Canvas canvas, Paint paint, RectF pathRect) {
        C9612q.m13917h(canvas, "canvas");
        C9612q.m13917h(paint, "paint");
        C9612q.m13917h(pathRect, "pathRect");
        float f = this.borderWidth;
        if (f <= 0.0f) {
            return;
        }
        pathRect.left += f / 2.0f;
        pathRect.top += f / 2.0f;
        pathRect.right -= f / 2.0f;
        pathRect.bottom -= f / 2.0f;
        this.path.reset();
        this.path.addRoundRect(pathRect, this.borderStrokeRadiusRadii, Path.Direction.CW);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.borderWidth);
        paint.setColor(this.borderColor);
        canvas.drawPath(this.path, paint);
        paint.setStyle(Paint.Style.FILL);
    }

    public final float getBorderBottomLeftRadius() {
        return this.borderBottomLeftRadius;
    }

    public final float getBorderBottomRightRadius() {
        return this.borderBottomRightRadius;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final float[] getBorderRadiusRadii() {
        return this.borderRadiusRadii;
    }

    public final float getBorderTopLeftRadius() {
        return this.borderTopLeftRadius;
    }

    public final float getBorderTopRightRadius() {
        return this.borderTopRightRadius;
    }

    public final float getBorderWidth() {
        return this.borderWidth;
    }

    public final void setBorderBottomLeftRadius(float f) {
        this.borderBottomLeftRadius = f;
        float[] fArr = this.borderRadiusRadii;
        fArr[6] = f;
        fArr[7] = f;
        float[] fArr2 = this.borderStrokeRadiusRadii;
        float f2 = this.borderWidth;
        fArr2[6] = f - f2;
        fArr2[7] = f - f2;
    }

    public final void setBorderBottomRightRadius(float f) {
        this.borderBottomRightRadius = f;
        float[] fArr = this.borderRadiusRadii;
        fArr[4] = f;
        fArr[5] = f;
        float[] fArr2 = this.borderStrokeRadiusRadii;
        float f2 = this.borderWidth;
        fArr2[4] = f - f2;
        fArr2[5] = f - f2;
    }

    public final void setBorderColor(int i) {
        this.borderColor = i;
    }

    public final void setBorderTopLeftRadius(float f) {
        this.borderTopLeftRadius = f;
        float[] fArr = this.borderRadiusRadii;
        fArr[0] = f;
        fArr[1] = f;
        float[] fArr2 = this.borderStrokeRadiusRadii;
        float f2 = this.borderWidth;
        fArr2[0] = f - f2;
        fArr2[1] = f - f2;
    }

    public final void setBorderTopRightRadius(float f) {
        this.borderTopRightRadius = f;
        float[] fArr = this.borderRadiusRadii;
        fArr[2] = f;
        fArr[3] = f;
        float[] fArr2 = this.borderStrokeRadiusRadii;
        float f2 = this.borderWidth;
        fArr2[2] = f - f2;
        fArr2[3] = f - f2;
    }

    public final void setBorderWidth(float f) {
        this.borderWidth = f;
        float[] fArr = this.borderStrokeRadiusRadii;
        float f2 = this.borderTopLeftRadius;
        fArr[0] = f2 - f;
        fArr[1] = f2 - f;
        float f3 = this.borderTopRightRadius;
        fArr[2] = f3 - f;
        fArr[3] = f3 - f;
        float f4 = this.borderBottomRightRadius;
        fArr[4] = f4 - f;
        fArr[5] = f4 - f;
        float f5 = this.borderBottomLeftRadius;
        fArr[6] = f5 - f;
        fArr[7] = f5 - f;
    }
}

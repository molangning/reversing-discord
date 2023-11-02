package com.discord.chat.presentation.list;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u001e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m14357d2 = {"Lcom/discord/chat/presentation/list/MaskedShadowView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "borderRadius", "", "path", "Landroid/graphics/Path;", ViewProps.SHADOW_COLOR, "", "shadowElevation", "shadowPaint", "Landroid/graphics/Paint;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setParams", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MaskedShadowView extends View {
    private float borderRadius;
    private final Path path;
    private String shadowColor;
    private float shadowElevation;
    private final Paint shadowPaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskedShadowView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ MaskedShadowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        C9612q.m13917h(canvas, "canvas");
        super.onDraw(canvas);
        if (getVisibility() == 0 && getWidth() != 0 && getHeight() != 0) {
            this.path.reset();
            float f = this.borderRadius;
            this.path.addRoundRect(0.0f, 0.0f, getWidth(), getHeight(), f, f, Path.Direction.CW);
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.path);
            } else {
                canvas.clipPath(this.path, Region.Op.DIFFERENCE);
            }
            float f2 = this.shadowElevation / 2;
            float f3 = this.borderRadius;
            canvas.drawRoundRect(-f2, 0.0f, getWidth() + f2, getHeight() + f2, f3, f3, this.shadowPaint);
        }
    }

    public final void setParams(float f, float f2, String shadowColor) {
        C9612q.m13917h(shadowColor, "shadowColor");
        this.borderRadius = f2;
        this.shadowElevation = f;
        this.shadowColor = shadowColor;
        this.shadowPaint.setShadowLayer(f, 0.0f, f / 2, Color.parseColor(shadowColor));
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskedShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        this.shadowColor = "#28000000";
        this.shadowElevation = SizeUtilsKt.getDpToPx(10);
        this.path = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        float f = this.shadowElevation;
        paint.setShadowLayer(f, 0.0f, f / 2, Color.parseColor(this.shadowColor));
        this.shadowPaint = paint;
    }
}

package com.discord.clip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rJ.\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rJ\u000e\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J(\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0014J\u0006\u0010\u001d\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m14357d2 = {"Lcom/discord/clip/ClipView;", "Lcom/facebook/react/views/view/ReactViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clipToCircle", "", "clipToCirclePath", "Landroid/graphics/Path;", "cutoutPath", "addCircleCutout", "", "x", "", "y", "size", "addRoundedRectCutout", "width", "height", "cornerRadius", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "", "h", "oldw", "oldh", "resetCutouts", "clip_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ClipView extends ReactViewGroup {
    private boolean clipToCircle;
    private final Path clipToCirclePath;
    private final Path cutoutPath;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipView(Context context) {
        super(context);
        C9612q.m13917h(context, "context");
        this.cutoutPath = new Path();
        this.clipToCirclePath = new Path();
        setWillNotDraw(false);
    }

    public final void addCircleCutout(float f, float f2, float f3) {
        float f4 = f3 / 2;
        this.cutoutPath.addCircle(f + f4, f2 + f4, f4, Path.Direction.CCW);
        invalidate();
    }

    public final void addRoundedRectCutout(float f, float f2, float f3, float f4, float f5) {
        this.cutoutPath.addRoundRect(f, f2, f + f3, f2 + f4, f5, f5, Path.Direction.CCW);
        invalidate();
    }

    public final void clipToCircle(boolean z) {
        this.clipToCircle = z;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        C9612q.m13917h(canvas, "canvas");
        if (!this.clipToCirclePath.isEmpty()) {
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipPath(this.clipToCirclePath);
            } else {
                canvas.clipPath(this.clipToCirclePath, Region.Op.INTERSECT);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(this.cutoutPath);
        } else {
            canvas.clipPath(this.cutoutPath, Region.Op.DIFFERENCE);
        }
        super.onDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.clipToCircle) {
            this.clipToCirclePath.rewind();
            this.clipToCirclePath.addOval(0.0f, 0.0f, i, i2, Path.Direction.CCW);
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    public final void resetCutouts() {
        this.cutoutPath.rewind();
        invalidate();
    }
}

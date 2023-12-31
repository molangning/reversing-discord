package com.discord.channel_spine;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import gg.C6759j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00012B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010#\u001a\u00020\u0018H\u0002J\u0006\u0010$\u001a\u00020%J \u0010&\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,H\u0014J\u0018\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH\u0014J\b\u00100\u001a\u00020%H\u0002J\u0018\u00101\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0018@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000e¨\u00063"}, m14357d2 = {"Lcom/discord/channel_spine/ChannelSpineView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "arcRect", "Landroid/graphics/RectF;", "horizontalPadding", "", "getHorizontalPadding", "()I", "setHorizontalPadding", "(I)V", "isReplySpline", "", "value", "numRows", "getNumRows", "setNumRows", "paths", "", "Landroid/graphics/Path;", "", "rowHeight", "getRowHeight", "()F", "setRowHeight", "(F)V", "spinePaint", "Landroid/graphics/Paint;", "verticalPadding", "getVerticalPadding", "setVerticalPadding", "arcPercent", "configureAsReplySpline", "", "createSpinePath", "rowIndex", "direction", "Lcom/discord/channel_spine/ChannelSpineView$SpineDirection;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "rebuildLayout", "yOfRow", "SpineDirection", "channel_spine_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChannelSpineView extends View {
    private final RectF arcRect;
    private int horizontalPadding;
    private boolean isReplySpline;
    private int numRows;
    private List<? extends Path> paths;
    private float rowHeight;
    private final Paint spinePaint;
    private int verticalPadding;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m14357d2 = {"Lcom/discord/channel_spine/ChannelSpineView$SpineDirection;", "", "arcSweepAngle", "", "(Ljava/lang/String;IF)V", "getArcSweepAngle", "()F", "TOP_TO_BOTTOM", "BOTTOM_TO_TOP", "channel_spine_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum SpineDirection {
        TOP_TO_BOTTOM(-90.0f),
        BOTTOM_TO_TOP(90.0f);
        
        private final float arcSweepAngle;

        SpineDirection(float f) {
            this.arcSweepAngle = f;
        }

        public final float getArcSweepAngle() {
            return this.arcSweepAngle;
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpineDirection.values().length];
            try {
                iArr[SpineDirection.TOP_TO_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpineDirection.BOTTOM_TO_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelSpineView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ ChannelSpineView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final float arcPercent() {
        return this.isReplySpline ? 0.25f : 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureAsReplySpline$lambda$1(ChannelSpineView this$0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C9612q.m13917h(this$0, "this$0");
        this$0.setRowHeight(SizeUtilsKt.getPxToDp(i4 - i2));
    }

    private final Path createSpinePath(float f, int i, SpineDirection spineDirection) {
        float yOfRow;
        float f2;
        Path path = new Path();
        float strokeWidth = this.spinePaint.getStrokeWidth() / 2.0f;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[spineDirection.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                yOfRow = yOfRow(f, i + 1);
            } else {
                throw new C11581q();
            }
        } else {
            yOfRow = yOfRow(f, i);
        }
        if (this.isReplySpline) {
            f2 = SizeUtilsKt.getDpToPx(9);
        } else {
            f2 = 0.5f * f;
        }
        float yOfRow2 = ((yOfRow(f, i) - this.verticalPadding) - strokeWidth) + f2;
        float measuredWidth = getMeasuredWidth() - this.horizontalPadding;
        float arcPercent = arcPercent() * getMeasuredWidth();
        int i3 = iArr[spineDirection.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                this.arcRect.set(strokeWidth, yOfRow2, strokeWidth + arcPercent, arcPercent + yOfRow2);
            }
        } else {
            this.arcRect.set(strokeWidth, yOfRow2 - arcPercent, arcPercent + strokeWidth, yOfRow2);
        }
        path.moveTo(strokeWidth, yOfRow);
        path.arcTo(this.arcRect, 180.0f, spineDirection.getArcSweepAngle(), false);
        path.lineTo(measuredWidth, yOfRow2);
        return path;
    }

    private final void rebuildLayout() {
        List<? extends Path> m14104i;
        SpineDirection spineDirection;
        int i = this.numRows;
        float dpToPx = SizeUtilsKt.getDpToPx(this.rowHeight);
        if (i != 0 && dpToPx > 1.0E-4f) {
            int i2 = 1;
            if (i <= 1) {
                i2 = 0;
            }
            ArrayList arrayList = new ArrayList(i + i2);
            int i3 = i - 1;
            for (int i4 = 0; i4 < i; i4++) {
                if (this.isReplySpline) {
                    spineDirection = SpineDirection.BOTTOM_TO_TOP;
                } else {
                    spineDirection = SpineDirection.TOP_TO_BOTTOM;
                }
                arrayList.add(createSpinePath(dpToPx, i4, spineDirection));
                if (i4 < i3) {
                    arrayList.add(createSpinePath(dpToPx, i4, SpineDirection.BOTTOM_TO_TOP));
                }
            }
            if (i2 != 0) {
                Path path = new Path();
                float strokeWidth = this.spinePaint.getStrokeWidth() / 2.0f;
                path.moveTo(strokeWidth, this.verticalPadding);
                path.lineTo(strokeWidth, yOfRow(dpToPx, i - 2) + (dpToPx / 2.0f));
                arrayList.add(path);
            }
            this.paths = arrayList;
            return;
        }
        m14104i = C9545j.m14104i();
        this.paths = m14104i;
    }

    private final float yOfRow(float f, int i) {
        return this.verticalPadding + (i * f);
    }

    public final void configureAsReplySpline() {
        this.isReplySpline = true;
        this.verticalPadding = SizeUtilsKt.getDpToPx(0);
        this.horizontalPadding = SizeUtilsKt.getDpToPx(0);
        setNumRows(1);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.discord.channel_spine.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ChannelSpineView.configureAsReplySpline$lambda$1(ChannelSpineView.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    public final int getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final int getNumRows() {
        return this.numRows;
    }

    public final float getRowHeight() {
        return this.rowHeight;
    }

    public final int getVerticalPadding() {
        return this.verticalPadding;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        C9612q.m13917h(canvas, "canvas");
        super.onDraw(canvas);
        int save = canvas.save();
        for (Path path : this.paths) {
            canvas.drawPath(path, this.spinePaint);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z;
        int size;
        float m21927f;
        Number valueOf;
        if (this.numRows != 0) {
            boolean z2 = true;
            if (this.rowHeight == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int mode = View.MeasureSpec.getMode(i);
                if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                    size = 0;
                } else {
                    size = View.MeasureSpec.getSize(i);
                }
                float f = this.numRows * this.rowHeight;
                int mode2 = View.MeasureSpec.getMode(i2);
                if (mode2 != Integer.MIN_VALUE) {
                    if (mode2 != 1073741824) {
                        valueOf = Float.valueOf(f);
                    } else {
                        valueOf = Integer.valueOf(View.MeasureSpec.getSize(i2));
                    }
                } else {
                    m21927f = C6759j.m21927f(f, View.MeasureSpec.getSize(i2));
                    valueOf = Float.valueOf(m21927f);
                }
                if (size == getMeasuredWidth()) {
                    z2 = false;
                }
                setMeasuredDimension(size, valueOf.intValue());
                if (z2) {
                    rebuildLayout();
                    invalidate();
                    return;
                }
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public final void setHorizontalPadding(int i) {
        this.horizontalPadding = i;
    }

    public final void setNumRows(int i) {
        boolean z;
        if (this.numRows != i) {
            z = true;
        } else {
            z = false;
        }
        this.numRows = i;
        if (z && this.rowHeight > 0.0f) {
            rebuildLayout();
            invalidate();
            requestLayout();
        }
    }

    public final void setRowHeight(float f) {
        boolean z;
        if (this.rowHeight == f) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        this.rowHeight = f;
        if (z2 && this.numRows > 0) {
            rebuildLayout();
            invalidate();
            requestLayout();
        }
    }

    public final void setVerticalPadding(int i) {
        this.verticalPadding = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelSpineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int colorCompat;
        List<? extends Path> m14104i;
        C9612q.m13917h(context, "context");
        Paint paint = new Paint();
        if (!isInEditMode()) {
            colorCompat = ThemeManagerKt.getTheme().getBackgroundAccent();
        } else {
            colorCompat = ColorUtilsKt.getColorCompat(context, C2908R.color.primary_500);
        }
        paint.setColor(colorCompat);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(getResources().getDimension(C2908R.dimen.spine_width));
        paint.setStyle(Paint.Style.STROKE);
        this.spinePaint = paint;
        this.verticalPadding = SizeUtilsKt.getDpToPx(8);
        this.horizontalPadding = SizeUtilsKt.getDpToPx(0);
        this.arcRect = new RectF();
        m14104i = C9545j.m14104i();
        this.paths = m14104i;
        setWillNotDraw(false);
    }
}

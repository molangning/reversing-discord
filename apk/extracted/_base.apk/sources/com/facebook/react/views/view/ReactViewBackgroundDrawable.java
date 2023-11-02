package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.Spacing;
import com.facebook.yoga.C4340d;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactViewBackgroundDrawable extends Drawable {
    private static final int ALL_BITS_SET = -1;
    private static final int ALL_BITS_UNSET = 0;
    private static final int DEFAULT_BORDER_ALPHA = 255;
    private static final int DEFAULT_BORDER_COLOR = -16777216;
    private static final int DEFAULT_BORDER_RGB = 0;
    private Path mBackgroundColorRenderPath;
    private Spacing mBorderAlpha;
    private float[] mBorderCornerRadii;
    private Spacing mBorderRGB;
    private BorderStyle mBorderStyle;
    private Spacing mBorderWidth;
    private Path mCenterDrawPath;
    private final Context mContext;
    private final float mGapBetweenPaths;
    private PointF mInnerBottomLeftCorner;
    private PointF mInnerBottomRightCorner;
    private Path mInnerClipPathForBorderRadius;
    private RectF mInnerClipTempRectForBorderRadius;
    private PointF mInnerTopLeftCorner;
    private PointF mInnerTopRightCorner;
    private int mLayoutDirection;
    private Path mOuterClipPathForBorderRadius;
    private RectF mOuterClipTempRectForBorderRadius;
    private Path mPathForBorder;
    private Path mPathForBorderRadiusOutline;
    private RectF mTempRectForBorderRadiusOutline;
    private RectF mTempRectForCenterDrawPath;
    private final Path mPathForSingleBorder = new Path();
    private boolean mNeedUpdatePathForBorderRadius = false;
    private float mBorderRadius = Float.NaN;
    private final Paint mPaint = new Paint(1);
    private int mColor = 0;
    private int mAlpha = DEFAULT_BORDER_ALPHA;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.views.view.ReactViewBackgroundDrawable$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C42891 {

        /* renamed from: $SwitchMap$com$facebook$react$views$view$ReactViewBackgroundDrawable$BorderStyle */
        static final /* synthetic */ int[] f10925xe6ea8768;

        static {
            int[] iArr = new int[BorderStyle.values().length];
            f10925xe6ea8768 = iArr;
            try {
                iArr[BorderStyle.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10925xe6ea8768[BorderStyle.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10925xe6ea8768[BorderStyle.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum BorderRadiusLocation {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END,
        END_END,
        END_START,
        START_END,
        START_START
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum BorderStyle {
        SOLID,
        DASHED,
        DOTTED;

        public static PathEffect getPathEffect(BorderStyle borderStyle, float f) {
            int i = C42891.f10925xe6ea8768[borderStyle.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
            }
            float f2 = f * 3.0f;
            return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
        }
    }

    public ReactViewBackgroundDrawable(Context context) {
        float f;
        if (ReactFeatureFlags.enableCloseVisibleGapBetweenPaths) {
            f = 0.8f;
        } else {
            f = 0.0f;
        }
        this.mGapBetweenPaths = f;
        this.mContext = context;
    }

    private static int colorFromAlphaAndRGBComponents(float f, float f2) {
        return ((((int) f) << 24) & DEFAULT_BORDER_COLOR) | (((int) f2) & 16777215);
    }

    private void drawQuadrilateral(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i == 0) {
            return;
        }
        if (this.mPathForBorder == null) {
            this.mPathForBorder = new Path();
        }
        this.mPaint.setColor(i);
        this.mPathForBorder.reset();
        this.mPathForBorder.moveTo(f, f2);
        this.mPathForBorder.lineTo(f3, f4);
        this.mPathForBorder.lineTo(f5, f6);
        this.mPathForBorder.lineTo(f7, f8);
        this.mPathForBorder.lineTo(f, f2);
        canvas.drawPath(this.mPathForBorder, this.mPaint);
    }

    private void drawRectangularBackgroundWithBorders(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        this.mPaint.setStyle(Paint.Style.FILL);
        int multiplyColorAlpha = ColorUtil.multiplyColorAlpha(this.mColor, this.mAlpha);
        if (Color.alpha(multiplyColorAlpha) != 0) {
            this.mPaint.setColor(multiplyColorAlpha);
            canvas.drawRect(getBounds(), this.mPaint);
        }
        RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
        int round = Math.round(directionAwareBorderInsets.left);
        int round2 = Math.round(directionAwareBorderInsets.top);
        int round3 = Math.round(directionAwareBorderInsets.right);
        int round4 = Math.round(directionAwareBorderInsets.bottom);
        if (round > 0 || round3 > 0 || round2 > 0 || round4 > 0) {
            Rect bounds = getBounds();
            int borderColor = getBorderColor(0);
            int borderColor2 = getBorderColor(1);
            int borderColor3 = getBorderColor(2);
            int borderColor4 = getBorderColor(3);
            int borderColor5 = getBorderColor(9);
            int borderColor6 = getBorderColor(11);
            int borderColor7 = getBorderColor(10);
            if (isBorderColorDefined(9)) {
                borderColor2 = borderColor5;
                borderColor4 = borderColor2;
            }
            if (!isBorderColorDefined(10)) {
                borderColor7 = borderColor4;
            }
            if (!isBorderColorDefined(11)) {
                borderColor6 = borderColor2;
            }
            if (getResolvedLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            int borderColor8 = getBorderColor(4);
            int borderColor9 = getBorderColor(5);
            if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                if (isBorderColorDefined(4)) {
                    borderColor = borderColor8;
                }
                if (isBorderColorDefined(5)) {
                    borderColor3 = borderColor9;
                }
                if (z) {
                    i9 = borderColor3;
                } else {
                    i9 = borderColor;
                }
                if (!z) {
                    borderColor = borderColor3;
                }
                i3 = borderColor;
                i2 = i9;
            } else {
                if (z) {
                    i = borderColor9;
                } else {
                    i = borderColor8;
                }
                if (!z) {
                    borderColor8 = borderColor9;
                }
                boolean isBorderColorDefined = isBorderColorDefined(4);
                boolean isBorderColorDefined2 = isBorderColorDefined(5);
                if (z) {
                    z2 = isBorderColorDefined2;
                } else {
                    z2 = isBorderColorDefined;
                }
                if (!z) {
                    isBorderColorDefined = isBorderColorDefined2;
                }
                if (z2) {
                    borderColor = i;
                }
                i2 = borderColor;
                if (isBorderColorDefined) {
                    i3 = borderColor8;
                } else {
                    i3 = borderColor3;
                }
            }
            int i10 = bounds.left;
            int i11 = bounds.top;
            int i12 = i2;
            int fastBorderCompatibleColorOrZero = fastBorderCompatibleColorOrZero(round, round2, round3, round4, i2, borderColor6, i3, borderColor7);
            if (fastBorderCompatibleColorOrZero != 0) {
                if (Color.alpha(fastBorderCompatibleColorOrZero) != 0) {
                    int i13 = bounds.right;
                    int i14 = bounds.bottom;
                    this.mPaint.setColor(fastBorderCompatibleColorOrZero);
                    this.mPaint.setStyle(Paint.Style.STROKE);
                    if (round > 0) {
                        this.mPathForSingleBorder.reset();
                        int round5 = Math.round(directionAwareBorderInsets.left);
                        updatePathEffect(round5);
                        this.mPaint.setStrokeWidth(round5);
                        float f = i10 + (round5 / 2);
                        this.mPathForSingleBorder.moveTo(f, i11);
                        this.mPathForSingleBorder.lineTo(f, i14);
                        canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                    }
                    if (round2 > 0) {
                        this.mPathForSingleBorder.reset();
                        int round6 = Math.round(directionAwareBorderInsets.top);
                        updatePathEffect(round6);
                        this.mPaint.setStrokeWidth(round6);
                        float f2 = i11 + (round6 / 2);
                        this.mPathForSingleBorder.moveTo(i10, f2);
                        this.mPathForSingleBorder.lineTo(i13, f2);
                        canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                    }
                    if (round3 > 0) {
                        this.mPathForSingleBorder.reset();
                        int round7 = Math.round(directionAwareBorderInsets.right);
                        updatePathEffect(round7);
                        this.mPaint.setStrokeWidth(round7);
                        float f3 = i13 - (round7 / 2);
                        this.mPathForSingleBorder.moveTo(f3, i11);
                        this.mPathForSingleBorder.lineTo(f3, i14);
                        canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                    }
                    if (round4 > 0) {
                        this.mPathForSingleBorder.reset();
                        int round8 = Math.round(directionAwareBorderInsets.bottom);
                        updatePathEffect(round8);
                        this.mPaint.setStrokeWidth(round8);
                        float f4 = i14 - (round8 / 2);
                        this.mPathForSingleBorder.moveTo(i10, f4);
                        this.mPathForSingleBorder.lineTo(i13, f4);
                        canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                        return;
                    }
                    return;
                }
                return;
            }
            this.mPaint.setAntiAlias(false);
            int width = bounds.width();
            int height = bounds.height();
            if (round > 0) {
                float f5 = i10;
                float f6 = i10 + round;
                i4 = i11;
                drawQuadrilateral(canvas, i12, f5, i11, f6, i11 + round2, f6, i8 - round4, f5, i11 + height);
            } else {
                i4 = i11;
            }
            if (round2 > 0) {
                float f7 = i4;
                float f8 = i4 + round2;
                drawQuadrilateral(canvas, borderColor6, i10, f7, i10 + round, f8, i7 - round3, f8, i10 + width, f7);
            }
            if (round3 > 0) {
                int i15 = i10 + width;
                float f9 = i15;
                float f10 = i15 - round3;
                drawQuadrilateral(canvas, i3, f9, i4, f9, i4 + height, f10, i6 - round4, f10, i4 + round2);
            }
            if (round4 > 0) {
                int i16 = i4 + height;
                float f11 = i16;
                float f12 = i16 - round4;
                drawQuadrilateral(canvas, borderColor7, i10, f11, i10 + width, f11, i5 - round3, f12, i10 + round, f12);
            }
            this.mPaint.setAntiAlias(true);
        }
    }

    private void drawRoundedBackgroundWithBorders(Canvas canvas) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float f;
        float f2;
        float f3;
        float f4;
        updatePath();
        canvas.save();
        canvas.clipPath(this.mOuterClipPathForBorderRadius, Region.Op.INTERSECT);
        int multiplyColorAlpha = ColorUtil.multiplyColorAlpha(this.mColor, this.mAlpha);
        if (Color.alpha(multiplyColorAlpha) != 0) {
            this.mPaint.setColor(multiplyColorAlpha);
            this.mPaint.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.mBackgroundColorRenderPath, this.mPaint);
        }
        RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
        boolean z2 = false;
        int borderColor = getBorderColor(0);
        int borderColor2 = getBorderColor(1);
        int borderColor3 = getBorderColor(2);
        int borderColor4 = getBorderColor(3);
        int borderColor5 = getBorderColor(9);
        int borderColor6 = getBorderColor(11);
        int borderColor7 = getBorderColor(10);
        if (isBorderColorDefined(9)) {
            borderColor2 = borderColor5;
            borderColor4 = borderColor2;
        }
        if (!isBorderColorDefined(10)) {
            borderColor7 = borderColor4;
        }
        if (isBorderColorDefined(11)) {
            i = borderColor6;
        } else {
            i = borderColor2;
        }
        if (directionAwareBorderInsets.top > 0.0f || directionAwareBorderInsets.bottom > 0.0f || directionAwareBorderInsets.left > 0.0f || directionAwareBorderInsets.right > 0.0f) {
            float fullBorderWidth = getFullBorderWidth();
            int borderColor8 = getBorderColor(8);
            if (directionAwareBorderInsets.top == fullBorderWidth && directionAwareBorderInsets.bottom == fullBorderWidth && directionAwareBorderInsets.left == fullBorderWidth && directionAwareBorderInsets.right == fullBorderWidth && borderColor == borderColor8 && i == borderColor8 && borderColor3 == borderColor8 && borderColor7 == borderColor8) {
                if (fullBorderWidth > 0.0f) {
                    this.mPaint.setColor(ColorUtil.multiplyColorAlpha(borderColor8, this.mAlpha));
                    this.mPaint.setStyle(Paint.Style.STROKE);
                    this.mPaint.setStrokeWidth(fullBorderWidth);
                    canvas.drawPath(this.mCenterDrawPath, this.mPaint);
                }
            } else {
                this.mPaint.setStyle(Paint.Style.FILL);
                canvas.clipPath(this.mInnerClipPathForBorderRadius, Region.Op.DIFFERENCE);
                if (getResolvedLayoutDirection() == 1) {
                    z2 = true;
                }
                int borderColor9 = getBorderColor(4);
                int borderColor10 = getBorderColor(5);
                if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                    if (isBorderColorDefined(4)) {
                        borderColor = borderColor9;
                    }
                    if (isBorderColorDefined(5)) {
                        borderColor3 = borderColor10;
                    }
                    if (z2) {
                        i3 = borderColor3;
                    } else {
                        i3 = borderColor;
                    }
                    if (!z2) {
                        borderColor = borderColor3;
                    }
                    i4 = borderColor;
                } else {
                    if (z2) {
                        i2 = borderColor10;
                    } else {
                        i2 = borderColor9;
                    }
                    if (!z2) {
                        borderColor9 = borderColor10;
                    }
                    boolean isBorderColorDefined = isBorderColorDefined(4);
                    boolean isBorderColorDefined2 = isBorderColorDefined(5);
                    if (z2) {
                        z = isBorderColorDefined2;
                    } else {
                        z = isBorderColorDefined;
                    }
                    if (!z2) {
                        isBorderColorDefined = isBorderColorDefined2;
                    }
                    if (z) {
                        borderColor = i2;
                    }
                    if (isBorderColorDefined) {
                        i3 = borderColor;
                        i4 = borderColor9;
                    } else {
                        i3 = borderColor;
                        i4 = borderColor3;
                    }
                }
                RectF rectF = this.mOuterClipTempRectForBorderRadius;
                float f5 = rectF.left;
                float f6 = rectF.right;
                float f7 = rectF.top;
                float f8 = rectF.bottom;
                if (directionAwareBorderInsets.left > 0.0f) {
                    float f9 = this.mGapBetweenPaths;
                    PointF pointF = this.mInnerTopLeftCorner;
                    float f10 = pointF.x;
                    float f11 = pointF.y - f9;
                    PointF pointF2 = this.mInnerBottomLeftCorner;
                    f = f8;
                    f2 = f7;
                    f3 = f6;
                    f4 = f5;
                    drawQuadrilateral(canvas, i3, f5, f7 - f9, f10, f11, pointF2.x, pointF2.y + f9, f5, f8 + f9);
                } else {
                    f = f8;
                    f2 = f7;
                    f3 = f6;
                    f4 = f5;
                }
                if (directionAwareBorderInsets.top > 0.0f) {
                    float f12 = this.mGapBetweenPaths;
                    PointF pointF3 = this.mInnerTopLeftCorner;
                    float f13 = pointF3.y;
                    PointF pointF4 = this.mInnerTopRightCorner;
                    drawQuadrilateral(canvas, i, f4 - f12, f2, pointF3.x - f12, f13, pointF4.x + f12, pointF4.y, f3 + f12, f2);
                }
                if (directionAwareBorderInsets.right > 0.0f) {
                    float f14 = this.mGapBetweenPaths;
                    PointF pointF5 = this.mInnerTopRightCorner;
                    float f15 = pointF5.x;
                    float f16 = pointF5.y - f14;
                    PointF pointF6 = this.mInnerBottomRightCorner;
                    drawQuadrilateral(canvas, i4, f3, f2 - f14, f15, f16, pointF6.x, pointF6.y + f14, f3, f + f14);
                }
                if (directionAwareBorderInsets.bottom > 0.0f) {
                    float f17 = this.mGapBetweenPaths;
                    PointF pointF7 = this.mInnerBottomLeftCorner;
                    float f18 = pointF7.y;
                    PointF pointF8 = this.mInnerBottomRightCorner;
                    drawQuadrilateral(canvas, borderColor7, f4 - f17, f, pointF7.x - f17, f18, pointF8.x + f17, pointF8.y, f3 + f17, f);
                }
            }
        }
        canvas.restore();
    }

    private static int fastBorderCompatibleColorOrZero(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = (i4 > 0 ? i8 : -1) & (i > 0 ? i5 : -1) & (i2 > 0 ? i6 : -1) & (i3 > 0 ? i7 : -1);
        if (i <= 0) {
            i5 = 0;
        }
        if (i2 <= 0) {
            i6 = 0;
        }
        int i10 = i5 | i6;
        if (i3 <= 0) {
            i7 = 0;
        }
        int i11 = i10 | i7;
        if (i4 <= 0) {
            i8 = 0;
        }
        if (i9 == (i11 | i8)) {
            return i9;
        }
        return 0;
    }

    private int getBorderWidth(int i) {
        Spacing spacing = this.mBorderWidth;
        if (spacing == null) {
            return 0;
        }
        float f = spacing.get(i);
        if (C4340d.m29971a(f)) {
            return -1;
        }
        return Math.round(f);
    }

    private static void getEllipseIntersectionWithLine(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double abs = Math.abs(d3 - d) / 2.0d;
        double abs2 = Math.abs(d4 - d2) / 2.0d;
        double d13 = ((d8 - d10) - d12) / ((d7 - d9) - d11);
        double d14 = d12 - (d11 * d13);
        double d15 = abs2 * abs2;
        double d16 = abs * abs;
        double d17 = d15 + (d16 * d13 * d13);
        double d18 = abs * 2.0d * abs * d14 * d13;
        double d19 = (-(d16 * ((d14 * d14) - d15))) / d17;
        double d20 = d17 * 2.0d;
        double sqrt = ((-d18) / d20) - Math.sqrt(d19 + Math.pow(d18 / d20, 2.0d));
        double d21 = sqrt + d9;
        double d22 = (d13 * sqrt) + d14 + d10;
        if (!Double.isNaN(d21) && !Double.isNaN(d22)) {
            pointF.x = (float) d21;
            pointF.y = (float) d22;
        }
    }

    private boolean isBorderColorDefined(int i) {
        float f;
        Spacing spacing = this.mBorderRGB;
        float f2 = Float.NaN;
        if (spacing != null) {
            f = spacing.get(i);
        } else {
            f = Float.NaN;
        }
        Spacing spacing2 = this.mBorderAlpha;
        if (spacing2 != null) {
            f2 = spacing2.get(i);
        }
        if (!C4340d.m29971a(f) && !C4340d.m29971a(f2)) {
            return true;
        }
        return false;
    }

    private void setBorderAlpha(int i, float f) {
        if (this.mBorderAlpha == null) {
            this.mBorderAlpha = new Spacing(255.0f);
        }
        if (!FloatUtil.floatsEqual(this.mBorderAlpha.getRaw(i), f)) {
            this.mBorderAlpha.set(i, f);
            invalidateSelf();
        }
    }

    private void setBorderRGB(int i, float f) {
        if (this.mBorderRGB == null) {
            this.mBorderRGB = new Spacing(0.0f);
        }
        if (!FloatUtil.floatsEqual(this.mBorderRGB.getRaw(i), f)) {
            this.mBorderRGB.set(i, f);
            invalidateSelf();
        }
    }

    private void updatePath() {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (!this.mNeedUpdatePathForBorderRadius) {
            return;
        }
        this.mNeedUpdatePathForBorderRadius = false;
        if (this.mInnerClipPathForBorderRadius == null) {
            this.mInnerClipPathForBorderRadius = new Path();
        }
        if (this.mBackgroundColorRenderPath == null) {
            this.mBackgroundColorRenderPath = new Path();
        }
        if (this.mOuterClipPathForBorderRadius == null) {
            this.mOuterClipPathForBorderRadius = new Path();
        }
        if (this.mPathForBorderRadiusOutline == null) {
            this.mPathForBorderRadiusOutline = new Path();
        }
        if (this.mCenterDrawPath == null) {
            this.mCenterDrawPath = new Path();
        }
        if (this.mInnerClipTempRectForBorderRadius == null) {
            this.mInnerClipTempRectForBorderRadius = new RectF();
        }
        if (this.mOuterClipTempRectForBorderRadius == null) {
            this.mOuterClipTempRectForBorderRadius = new RectF();
        }
        if (this.mTempRectForBorderRadiusOutline == null) {
            this.mTempRectForBorderRadiusOutline = new RectF();
        }
        if (this.mTempRectForCenterDrawPath == null) {
            this.mTempRectForCenterDrawPath = new RectF();
        }
        this.mInnerClipPathForBorderRadius.reset();
        this.mBackgroundColorRenderPath.reset();
        this.mOuterClipPathForBorderRadius.reset();
        this.mPathForBorderRadiusOutline.reset();
        this.mCenterDrawPath.reset();
        this.mInnerClipTempRectForBorderRadius.set(getBounds());
        this.mOuterClipTempRectForBorderRadius.set(getBounds());
        this.mTempRectForBorderRadiusOutline.set(getBounds());
        this.mTempRectForCenterDrawPath.set(getBounds());
        RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
        int borderColor = getBorderColor(0);
        int borderColor2 = getBorderColor(1);
        int borderColor3 = getBorderColor(2);
        int borderColor4 = getBorderColor(3);
        int borderColor5 = getBorderColor(8);
        int borderColor6 = getBorderColor(9);
        int borderColor7 = getBorderColor(11);
        int borderColor8 = getBorderColor(10);
        if (isBorderColorDefined(9)) {
            borderColor2 = borderColor6;
            borderColor4 = borderColor2;
        }
        if (!isBorderColorDefined(10)) {
            borderColor8 = borderColor4;
        }
        if (!isBorderColorDefined(11)) {
            borderColor7 = borderColor2;
        }
        if (Color.alpha(borderColor) != 0 && Color.alpha(borderColor7) != 0 && Color.alpha(borderColor3) != 0 && Color.alpha(borderColor8) != 0 && Color.alpha(borderColor5) != 0) {
            RectF rectF = this.mInnerClipTempRectForBorderRadius;
            rectF.top += directionAwareBorderInsets.top;
            rectF.bottom -= directionAwareBorderInsets.bottom;
            rectF.left += directionAwareBorderInsets.left;
            rectF.right -= directionAwareBorderInsets.right;
        }
        RectF rectF2 = this.mTempRectForCenterDrawPath;
        rectF2.top += directionAwareBorderInsets.top * 0.5f;
        rectF2.bottom -= directionAwareBorderInsets.bottom * 0.5f;
        rectF2.left += directionAwareBorderInsets.left * 0.5f;
        rectF2.right -= directionAwareBorderInsets.right * 0.5f;
        float fullBorderRadius = getFullBorderRadius();
        float borderRadiusOrDefaultTo = getBorderRadiusOrDefaultTo(fullBorderRadius, BorderRadiusLocation.TOP_LEFT);
        float borderRadiusOrDefaultTo2 = getBorderRadiusOrDefaultTo(fullBorderRadius, BorderRadiusLocation.TOP_RIGHT);
        float borderRadiusOrDefaultTo3 = getBorderRadiusOrDefaultTo(fullBorderRadius, BorderRadiusLocation.BOTTOM_LEFT);
        float borderRadiusOrDefaultTo4 = getBorderRadiusOrDefaultTo(fullBorderRadius, BorderRadiusLocation.BOTTOM_RIGHT);
        if (getResolvedLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        float borderRadius = getBorderRadius(BorderRadiusLocation.TOP_START);
        float borderRadius2 = getBorderRadius(BorderRadiusLocation.TOP_END);
        float borderRadius3 = getBorderRadius(BorderRadiusLocation.BOTTOM_START);
        float borderRadius4 = getBorderRadius(BorderRadiusLocation.BOTTOM_END);
        float borderRadius5 = getBorderRadius(BorderRadiusLocation.END_END);
        float borderRadius6 = getBorderRadius(BorderRadiusLocation.END_START);
        float borderRadius7 = getBorderRadius(BorderRadiusLocation.START_END);
        float borderRadius8 = getBorderRadius(BorderRadiusLocation.START_START);
        if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
            if (!C4340d.m29971a(borderRadius)) {
                borderRadiusOrDefaultTo = borderRadius;
            }
            if (!C4340d.m29971a(borderRadius2)) {
                borderRadiusOrDefaultTo2 = borderRadius2;
            }
            if (!C4340d.m29971a(borderRadius3)) {
                borderRadiusOrDefaultTo3 = borderRadius3;
            }
            if (!C4340d.m29971a(borderRadius4)) {
                borderRadiusOrDefaultTo4 = borderRadius4;
            }
            if (C4340d.m29971a(borderRadiusOrDefaultTo)) {
                f4 = borderRadius8;
            } else {
                f4 = borderRadiusOrDefaultTo;
            }
            if (!C4340d.m29971a(borderRadiusOrDefaultTo2)) {
                borderRadius7 = borderRadiusOrDefaultTo2;
            }
            if (!C4340d.m29971a(borderRadiusOrDefaultTo3)) {
                borderRadius6 = borderRadiusOrDefaultTo3;
            }
            if (!C4340d.m29971a(borderRadiusOrDefaultTo4)) {
                borderRadius5 = borderRadiusOrDefaultTo4;
            }
            if (z) {
                f3 = borderRadius7;
            } else {
                f3 = f4;
            }
            if (!z) {
                f4 = borderRadius7;
            }
            if (z) {
                f5 = borderRadius5;
            } else {
                f5 = borderRadius6;
            }
            if (!z) {
                borderRadius6 = borderRadius5;
            }
        } else {
            if (C4340d.m29971a(borderRadius)) {
                borderRadius = borderRadius8;
            }
            if (C4340d.m29971a(borderRadius2)) {
                borderRadius2 = borderRadius7;
            }
            if (C4340d.m29971a(borderRadius3)) {
                borderRadius3 = borderRadius6;
            }
            if (C4340d.m29971a(borderRadius4)) {
                borderRadius4 = borderRadius5;
            }
            if (z) {
                f = borderRadius2;
            } else {
                f = borderRadius;
            }
            if (!z) {
                borderRadius = borderRadius2;
            }
            if (z) {
                f2 = borderRadius4;
            } else {
                f2 = borderRadius3;
            }
            if (!z) {
                borderRadius3 = borderRadius4;
            }
            if (!C4340d.m29971a(f)) {
                borderRadiusOrDefaultTo = f;
            }
            if (!C4340d.m29971a(borderRadius)) {
                borderRadiusOrDefaultTo2 = borderRadius;
            }
            if (!C4340d.m29971a(f2)) {
                borderRadiusOrDefaultTo3 = f2;
            }
            if (!C4340d.m29971a(borderRadius3)) {
                f3 = borderRadiusOrDefaultTo;
                f4 = borderRadiusOrDefaultTo2;
                f5 = borderRadiusOrDefaultTo3;
                borderRadius6 = borderRadius3;
            } else {
                borderRadius6 = borderRadiusOrDefaultTo4;
                f3 = borderRadiusOrDefaultTo;
                f4 = borderRadiusOrDefaultTo2;
                f5 = borderRadiusOrDefaultTo3;
            }
        }
        float max = Math.max(f3 - directionAwareBorderInsets.left, 0.0f);
        float max2 = Math.max(f3 - directionAwareBorderInsets.top, 0.0f);
        float max3 = Math.max(f4 - directionAwareBorderInsets.right, 0.0f);
        float max4 = Math.max(f4 - directionAwareBorderInsets.top, 0.0f);
        float max5 = Math.max(borderRadius6 - directionAwareBorderInsets.right, 0.0f);
        float max6 = Math.max(borderRadius6 - directionAwareBorderInsets.bottom, 0.0f);
        float max7 = Math.max(f5 - directionAwareBorderInsets.left, 0.0f);
        float max8 = Math.max(f5 - directionAwareBorderInsets.bottom, 0.0f);
        float f15 = f5;
        this.mInnerClipPathForBorderRadius.addRoundRect(this.mInnerClipTempRectForBorderRadius, new float[]{max, max2, max3, max4, max5, max6, max7, max8}, Path.Direction.CW);
        Path path = this.mBackgroundColorRenderPath;
        RectF rectF3 = this.mInnerClipTempRectForBorderRadius;
        float f16 = rectF3.left;
        float f17 = this.mGapBetweenPaths;
        path.addRoundRect(f16 - f17, rectF3.top - f17, rectF3.right + f17, rectF3.bottom + f17, new float[]{max, max2, max3, max4, max5, max6, max7, max8}, Path.Direction.CW);
        this.mOuterClipPathForBorderRadius.addRoundRect(this.mOuterClipTempRectForBorderRadius, new float[]{f3, f3, f4, f4, borderRadius6, borderRadius6, f15, f15}, Path.Direction.CW);
        Spacing spacing = this.mBorderWidth;
        if (spacing != null) {
            f6 = spacing.get(8) / 2.0f;
        } else {
            f6 = 0.0f;
        }
        float f18 = f3 + f6;
        float f19 = f4 + f6;
        float f20 = borderRadius6 + f6;
        float f21 = f15 + f6;
        this.mPathForBorderRadiusOutline.addRoundRect(this.mTempRectForBorderRadiusOutline, new float[]{f18, f18, f19, f19, f20, f20, f21, f21}, Path.Direction.CW);
        Path path2 = this.mCenterDrawPath;
        RectF rectF4 = this.mTempRectForCenterDrawPath;
        float[] fArr = new float[8];
        float f22 = directionAwareBorderInsets.left;
        float f23 = f3 - (f22 * 0.5f);
        if (f22 > 0.0f) {
            f7 = f3 / f22;
        } else {
            f7 = 0.0f;
        }
        fArr[0] = Math.max(f23, f7);
        float f24 = directionAwareBorderInsets.top;
        float f25 = f3 - (f24 * 0.5f);
        if (f24 > 0.0f) {
            f8 = f3 / f24;
        } else {
            f8 = 0.0f;
        }
        fArr[1] = Math.max(f25, f8);
        float f26 = directionAwareBorderInsets.right;
        float f27 = f4 - (f26 * 0.5f);
        if (f26 > 0.0f) {
            f9 = f4 / f26;
        } else {
            f9 = 0.0f;
        }
        fArr[2] = Math.max(f27, f9);
        float f28 = directionAwareBorderInsets.top;
        float f29 = f4 - (f28 * 0.5f);
        if (f28 > 0.0f) {
            f10 = f4 / f28;
        } else {
            f10 = 0.0f;
        }
        fArr[3] = Math.max(f29, f10);
        float f30 = directionAwareBorderInsets.right;
        float f31 = borderRadius6 - (f30 * 0.5f);
        if (f30 > 0.0f) {
            f11 = borderRadius6 / f30;
        } else {
            f11 = 0.0f;
        }
        fArr[4] = Math.max(f31, f11);
        float f32 = directionAwareBorderInsets.bottom;
        float f33 = borderRadius6 - (f32 * 0.5f);
        if (f32 > 0.0f) {
            f12 = borderRadius6 / f32;
        } else {
            f12 = 0.0f;
        }
        fArr[5] = Math.max(f33, f12);
        float f34 = directionAwareBorderInsets.left;
        float f35 = f15 - (f34 * 0.5f);
        if (f34 > 0.0f) {
            f13 = f15 / f34;
        } else {
            f13 = 0.0f;
        }
        fArr[6] = Math.max(f35, f13);
        float f36 = directionAwareBorderInsets.bottom;
        float f37 = f15 - (f36 * 0.5f);
        if (f36 > 0.0f) {
            f14 = f15 / f36;
        } else {
            f14 = 0.0f;
        }
        fArr[7] = Math.max(f37, f14);
        path2.addRoundRect(rectF4, fArr, Path.Direction.CW);
        if (this.mInnerTopLeftCorner == null) {
            this.mInnerTopLeftCorner = new PointF();
        }
        PointF pointF = this.mInnerTopLeftCorner;
        RectF rectF5 = this.mInnerClipTempRectForBorderRadius;
        float f38 = rectF5.left;
        pointF.x = f38;
        float f39 = rectF5.top;
        pointF.y = f39;
        RectF rectF6 = this.mOuterClipTempRectForBorderRadius;
        getEllipseIntersectionWithLine(f38, f39, (max * 2.0f) + f38, (max2 * 2.0f) + f39, rectF6.left, rectF6.top, f38, f39, pointF);
        if (this.mInnerBottomLeftCorner == null) {
            this.mInnerBottomLeftCorner = new PointF();
        }
        PointF pointF2 = this.mInnerBottomLeftCorner;
        RectF rectF7 = this.mInnerClipTempRectForBorderRadius;
        float f40 = rectF7.left;
        pointF2.x = f40;
        float f41 = rectF7.bottom;
        pointF2.y = f41;
        RectF rectF8 = this.mOuterClipTempRectForBorderRadius;
        getEllipseIntersectionWithLine(f40, f41 - (max8 * 2.0f), (max7 * 2.0f) + f40, f41, rectF8.left, rectF8.bottom, f40, f41, pointF2);
        if (this.mInnerTopRightCorner == null) {
            this.mInnerTopRightCorner = new PointF();
        }
        PointF pointF3 = this.mInnerTopRightCorner;
        RectF rectF9 = this.mInnerClipTempRectForBorderRadius;
        float f42 = rectF9.right;
        pointF3.x = f42;
        float f43 = rectF9.top;
        pointF3.y = f43;
        RectF rectF10 = this.mOuterClipTempRectForBorderRadius;
        getEllipseIntersectionWithLine(f42 - (max3 * 2.0f), f43, f42, (max4 * 2.0f) + f43, rectF10.right, rectF10.top, f42, f43, pointF3);
        if (this.mInnerBottomRightCorner == null) {
            this.mInnerBottomRightCorner = new PointF();
        }
        PointF pointF4 = this.mInnerBottomRightCorner;
        RectF rectF11 = this.mInnerClipTempRectForBorderRadius;
        float f44 = rectF11.right;
        pointF4.x = f44;
        float f45 = rectF11.bottom;
        pointF4.y = f45;
        RectF rectF12 = this.mOuterClipTempRectForBorderRadius;
        getEllipseIntersectionWithLine(f44 - (max5 * 2.0f), f45 - (max6 * 2.0f), f44, f45, rectF12.right, rectF12.bottom, f44, f45, pointF4);
    }

    private void updatePathEffect() {
        BorderStyle borderStyle = this.mBorderStyle;
        this.mPaint.setPathEffect(borderStyle != null ? BorderStyle.getPathEffect(borderStyle, getFullBorderWidth()) : null);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        updatePathEffect();
        if (!hasRoundedBorders()) {
            drawRectangularBackgroundWithBorders(canvas);
        } else {
            drawRoundedBackgroundWithBorders(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mAlpha;
    }

    public int getBorderColor(int i) {
        float f;
        float f2;
        Spacing spacing = this.mBorderRGB;
        if (spacing != null) {
            f = spacing.get(i);
        } else {
            f = 0.0f;
        }
        Spacing spacing2 = this.mBorderAlpha;
        if (spacing2 != null) {
            f2 = spacing2.get(i);
        } else {
            f2 = 255.0f;
        }
        return colorFromAlphaAndRGBComponents(f2, f);
    }

    public float getBorderRadius(BorderRadiusLocation borderRadiusLocation) {
        return getBorderRadiusOrDefaultTo(Float.NaN, borderRadiusLocation);
    }

    public float getBorderRadiusOrDefaultTo(float f, BorderRadiusLocation borderRadiusLocation) {
        float[] fArr = this.mBorderCornerRadii;
        if (fArr == null) {
            return f;
        }
        float f2 = fArr[borderRadiusLocation.ordinal()];
        if (C4340d.m29971a(f2)) {
            return f;
        }
        return f2;
    }

    public float getBorderWidthOrDefaultTo(float f, int i) {
        Spacing spacing = this.mBorderWidth;
        if (spacing == null) {
            return f;
        }
        float raw = spacing.getRaw(i);
        if (C4340d.m29971a(raw)) {
            return f;
        }
        return raw;
    }

    @VisibleForTesting
    public int getColor() {
        return this.mColor;
    }

    @TargetApi(21)
    public RectF getDirectionAwareBorderInsets() {
        float f;
        float f2;
        float borderWidthOrDefaultTo = getBorderWidthOrDefaultTo(0.0f, 8);
        boolean z = true;
        float borderWidthOrDefaultTo2 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 1);
        float borderWidthOrDefaultTo3 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 3);
        float borderWidthOrDefaultTo4 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 0);
        float borderWidthOrDefaultTo5 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 2);
        if (this.mBorderWidth != null) {
            if (getResolvedLayoutDirection() != 1) {
                z = false;
            }
            float raw = this.mBorderWidth.getRaw(4);
            float raw2 = this.mBorderWidth.getRaw(5);
            if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                if (!C4340d.m29971a(raw)) {
                    borderWidthOrDefaultTo4 = raw;
                }
                if (!C4340d.m29971a(raw2)) {
                    borderWidthOrDefaultTo5 = raw2;
                }
                if (z) {
                    f2 = borderWidthOrDefaultTo5;
                } else {
                    f2 = borderWidthOrDefaultTo4;
                }
                if (z) {
                    borderWidthOrDefaultTo5 = borderWidthOrDefaultTo4;
                }
                borderWidthOrDefaultTo4 = f2;
            } else {
                if (z) {
                    f = raw2;
                } else {
                    f = raw;
                }
                if (!z) {
                    raw = raw2;
                }
                if (!C4340d.m29971a(f)) {
                    borderWidthOrDefaultTo4 = f;
                }
                if (!C4340d.m29971a(raw)) {
                    borderWidthOrDefaultTo5 = raw;
                }
            }
        }
        return new RectF(borderWidthOrDefaultTo4, borderWidthOrDefaultTo2, borderWidthOrDefaultTo5, borderWidthOrDefaultTo3);
    }

    public float getFullBorderRadius() {
        if (C4340d.m29971a(this.mBorderRadius)) {
            return 0.0f;
        }
        return this.mBorderRadius;
    }

    public float getFullBorderWidth() {
        Spacing spacing = this.mBorderWidth;
        if (spacing != null && !C4340d.m29971a(spacing.getRaw(8))) {
            return this.mBorderWidth.getRaw(8);
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return ColorUtil.getOpacityFromColor(ColorUtil.multiplyColorAlpha(this.mColor, this.mAlpha));
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if ((!C4340d.m29971a(this.mBorderRadius) && this.mBorderRadius > 0.0f) || this.mBorderCornerRadii != null) {
            updatePath();
            outline.setConvexPath(this.mPathForBorderRadiusOutline);
            return;
        }
        outline.setRect(getBounds());
    }

    public int getResolvedLayoutDirection() {
        return this.mLayoutDirection;
    }

    public boolean hasRoundedBorders() {
        if (!C4340d.m29971a(this.mBorderRadius) && this.mBorderRadius > 0.0f) {
            return true;
        }
        float[] fArr = this.mBorderCornerRadii;
        if (fArr != null) {
            for (float f : fArr) {
                if (!C4340d.m29971a(f) && f > 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mNeedUpdatePathForBorderRadius = true;
    }

    public boolean onResolvedLayoutDirectionChanged(int i) {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.mAlpha) {
            this.mAlpha = i;
            invalidateSelf();
        }
    }

    public void setBorderColor(int i, float f, float f2) {
        setBorderRGB(i, f);
        setBorderAlpha(i, f2);
        this.mNeedUpdatePathForBorderRadius = true;
    }

    public void setBorderStyle(String str) {
        BorderStyle valueOf;
        if (str == null) {
            valueOf = null;
        } else {
            valueOf = BorderStyle.valueOf(str.toUpperCase(Locale.US));
        }
        if (this.mBorderStyle != valueOf) {
            this.mBorderStyle = valueOf;
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }

    public void setBorderWidth(int i, float f) {
        if (this.mBorderWidth == null) {
            this.mBorderWidth = new Spacing();
        }
        if (!FloatUtil.floatsEqual(this.mBorderWidth.getRaw(i), f)) {
            this.mBorderWidth.set(i, f);
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
                this.mNeedUpdatePathForBorderRadius = true;
            }
            invalidateSelf();
        }
    }

    public void setColor(int i) {
        this.mColor = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setRadius(float f) {
        if (FloatUtil.floatsEqual(this.mBorderRadius, f)) {
            return;
        }
        this.mBorderRadius = f;
        this.mNeedUpdatePathForBorderRadius = true;
        invalidateSelf();
    }

    public boolean setResolvedLayoutDirection(int i) {
        if (this.mLayoutDirection != i) {
            this.mLayoutDirection = i;
            return onResolvedLayoutDirectionChanged(i);
        }
        return false;
    }

    private void updatePathEffect(int i) {
        BorderStyle borderStyle = this.mBorderStyle;
        this.mPaint.setPathEffect(borderStyle != null ? BorderStyle.getPathEffect(borderStyle, i) : null);
    }

    public void setRadius(float f, int i) {
        if (this.mBorderCornerRadii == null) {
            float[] fArr = new float[12];
            this.mBorderCornerRadii = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (FloatUtil.floatsEqual(this.mBorderCornerRadii[i], f)) {
            return;
        }
        this.mBorderCornerRadii[i] = f;
        this.mNeedUpdatePathForBorderRadius = true;
        invalidateSelf();
    }
}

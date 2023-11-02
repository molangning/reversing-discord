package com.discord.animatable_underlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_activities.ReactRootView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002ABB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0014J\u0010\u00109\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\b\u0010:\u001a\u000206H\u0014J\b\u0010;\u001a\u000206H\u0014J(\u0010<\u001a\u0002062\u0006\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u00020!2\u0006\u0010@\u001a\u00020!H\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u0012X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u001cR\u000e\u0010\u001f\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\u000e\u00104\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, m14357d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlay;", "Lcom/facebook/react/views/view/ReactViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clipDirectionX", "Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionX;", "getClipDirectionX", "()Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionX;", "setClipDirectionX", "(Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionX;)V", "clipDirectionY", "Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionY;", "getClipDirectionY", "()Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionY;", "setClipDirectionY", "(Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionY;)V", "height", "", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "pathRect", "Landroid/graphics/RectF;", ViewProps.SHADOW_COLOR, "", "getShadowColor$annotations", "()V", "shadowElevation", "getShadowElevation$annotations", "shadowPaint", "shapeBackgroundColor", "", "getShapeBackgroundColor", "()I", "setShapeBackgroundColor", "(I)V", "shapeBorderConfig", "Lcom/discord/animatable_underlay/AnimatableUnderlayBorders;", "getShapeBorderConfig$animatable_underlay_release", "()Lcom/discord/animatable_underlay/AnimatableUnderlayBorders;", "setShapeBorderConfig$animatable_underlay_release", "(Lcom/discord/animatable_underlay/AnimatableUnderlayBorders;)V", "shapeHeight", "getShapeHeight", "()F", "setShapeHeight", "(F)V", "shapeWidth", "getShapeWidth", "setShapeWidth", "width", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "drawCustomShape", "onAttachedToWindow", "onDetachedFromWindow", "onSizeChanged", "w", "h", "oldw", "oldh", "ClipDirectionX", "ClipDirectionY", "animatable_underlay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class AnimatableUnderlay extends ReactViewGroup {
    private ClipDirectionX clipDirectionX;
    private ClipDirectionY clipDirectionY;
    private float height;
    private final Paint paint;
    private final Path path;
    private final RectF pathRect;
    private String shadowColor;
    private float shadowElevation;
    private final Paint shadowPaint;
    private int shapeBackgroundColor;
    private AnimatableUnderlayBorders shapeBorderConfig;
    private float shapeHeight;
    private float shapeWidth;
    private float width;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionX;", "", "(Ljava/lang/String;I)V", "FROM_LEFT", "FROM_RIGHT", "CENTERED", "Companion", "animatable_underlay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum ClipDirectionX {
        FROM_LEFT,
        FROM_RIGHT,
        CENTERED;
        
        public static final Companion Companion = new Companion(null);

        @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionX$Companion;", "", "()V", "parse", "Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionX;", "clipDirectionX", "", "animatable_underlay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ClipDirectionX parse(String str) {
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -1244903727) {
                        if (hashCode != -852420684) {
                            if (hashCode == 68351122 && str.equals("fromRight")) {
                                return ClipDirectionX.FROM_RIGHT;
                            }
                        } else if (str.equals("centered")) {
                            return ClipDirectionX.CENTERED;
                        }
                    } else if (str.equals("fromLeft")) {
                        return ClipDirectionX.FROM_LEFT;
                    }
                }
                throw new IllegalArgumentException("Invalid clipDirectionX: " + str);
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionY;", "", "(Ljava/lang/String;I)V", "FROM_TOP", "FROM_BOTTOM", "CENTERED", "Companion", "animatable_underlay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum ClipDirectionY {
        FROM_TOP,
        FROM_BOTTOM,
        CENTERED;
        
        public static final Companion Companion = new Companion(null);

        @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionY$Companion;", "", "()V", "parse", "Lcom/discord/animatable_underlay/AnimatableUnderlay$ClipDirectionY;", "clipDirectionY", "", "animatable_underlay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ClipDirectionY parse(String str) {
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -852420684) {
                        if (hashCode != -594339509) {
                            if (hashCode == 1666758261 && str.equals("fromBottom")) {
                                return ClipDirectionY.FROM_BOTTOM;
                            }
                        } else if (str.equals("fromTop")) {
                            return ClipDirectionY.FROM_TOP;
                        }
                    } else if (str.equals("centered")) {
                        return ClipDirectionY.CENTERED;
                    }
                }
                throw new IllegalArgumentException("Invalid clipDirectionX: " + str);
            }
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ClipDirectionY.values().length];
            try {
                iArr[ClipDirectionY.FROM_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipDirectionY.FROM_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipDirectionY.CENTERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClipDirectionX.values().length];
            try {
                iArr2[ClipDirectionX.FROM_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ClipDirectionX.FROM_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ClipDirectionX.CENTERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatableUnderlay(Context context) {
        super(context);
        C9612q.m13917h(context, "context");
        this.clipDirectionX = ClipDirectionX.CENTERED;
        this.clipDirectionY = ClipDirectionY.CENTERED;
        this.shapeBorderConfig = new AnimatableUnderlayBorders();
        this.shadowColor = "#14000000";
        this.shadowElevation = SizeUtilsKt.getDpToPx(3);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.paint = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(0);
        float f = this.shadowElevation;
        paint2.setShadowLayer(f, 0.0f, f / 2, Color.parseColor(this.shadowColor));
        this.shadowPaint = paint2;
        this.path = new Path();
        this.pathRect = new RectF();
    }

    private final void drawCustomShape(Canvas canvas) {
        this.path.reset();
        int i = WhenMappings.$EnumSwitchMapping$0[this.clipDirectionY.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    RectF rectF = this.pathRect;
                    float f = this.height;
                    float f2 = this.shapeHeight;
                    float f3 = 2;
                    rectF.top = (f - f2) / f3;
                    rectF.bottom = f - ((f - f2) / f3);
                }
            } else {
                RectF rectF2 = this.pathRect;
                rectF2.top = 0.0f;
                float f4 = this.height;
                rectF2.bottom = f4 - (f4 - this.shapeHeight);
            }
        } else {
            RectF rectF3 = this.pathRect;
            float f5 = this.height;
            rectF3.top = f5 - this.shapeHeight;
            rectF3.bottom = f5;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[this.clipDirectionX.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    RectF rectF4 = this.pathRect;
                    float f6 = this.width;
                    float f7 = this.shapeWidth;
                    float f8 = 2;
                    rectF4.left = (f6 - f7) / f8;
                    rectF4.right = f6 - ((f6 - f7) / f8);
                }
            } else {
                RectF rectF5 = this.pathRect;
                rectF5.left = 0.0f;
                float f9 = this.width;
                rectF5.right = f9 - (f9 - this.shapeWidth);
            }
        } else {
            RectF rectF6 = this.pathRect;
            float f10 = this.width;
            rectF6.left = f10 - this.shapeWidth;
            rectF6.right = f10;
        }
        this.path.addRoundRect(this.pathRect, this.shapeBorderConfig.getBorderRadiusRadii(), Path.Direction.CW);
        canvas.drawPath(this.path, this.shadowPaint);
        this.paint.setColor(this.shapeBackgroundColor);
        canvas.drawPath(this.path, this.paint);
        this.shapeBorderConfig.drawBorderStroke$animatable_underlay_release(canvas, this.paint, this.pathRect);
    }

    private static /* synthetic */ void getShadowColor$annotations() {
    }

    private static /* synthetic */ void getShadowElevation$annotations() {
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (canvas != null) {
            drawCustomShape(canvas);
        }
        if (canvas != null) {
            canvas.clipPath(this.path);
        }
        super.dispatchDraw(canvas);
    }

    public final ClipDirectionX getClipDirectionX() {
        return this.clipDirectionX;
    }

    public final ClipDirectionY getClipDirectionY() {
        return this.clipDirectionY;
    }

    public final int getShapeBackgroundColor() {
        return this.shapeBackgroundColor;
    }

    public final AnimatableUnderlayBorders getShapeBorderConfig$animatable_underlay_release() {
        return this.shapeBorderConfig;
    }

    public final float getShapeHeight() {
        return this.shapeHeight;
    }

    public final float getShapeWidth() {
        return this.shapeWidth;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ReactRootView.Companion.setOnInterceptTouchEvent(this, new AnimatableUnderlay$onAttachedToWindow$1(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ReactRootView.Companion.setOnInterceptTouchEvent(this, null);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.width = i;
        this.height = i2;
    }

    public final void setClipDirectionX(ClipDirectionX clipDirectionX) {
        C9612q.m13917h(clipDirectionX, "<set-?>");
        this.clipDirectionX = clipDirectionX;
    }

    public final void setClipDirectionY(ClipDirectionY clipDirectionY) {
        C9612q.m13917h(clipDirectionY, "<set-?>");
        this.clipDirectionY = clipDirectionY;
    }

    public final void setShapeBackgroundColor(int i) {
        this.shapeBackgroundColor = i;
    }

    public final void setShapeBorderConfig$animatable_underlay_release(AnimatableUnderlayBorders animatableUnderlayBorders) {
        C9612q.m13917h(animatableUnderlayBorders, "<set-?>");
        this.shapeBorderConfig = animatableUnderlayBorders;
    }

    public final void setShapeHeight(float f) {
        this.shapeHeight = f;
    }

    public final void setShapeWidth(float f) {
        this.shapeWidth = f;
    }
}
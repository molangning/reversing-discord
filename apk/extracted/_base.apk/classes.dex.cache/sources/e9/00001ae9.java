package com.discord.mobile_voice_overlay.views;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.core.view.C1365w0;
import androidx.dynamicanimation.animation.AbstractC1466b;
import androidx.dynamicanimation.animation.SpringAnimation;
import com.discord.mobile_voice_overlay.C3317R;
import com.discord.mobile_voice_overlay.utils.WindowUtils;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.C9618w;
import kotlin.properties.AbstractC9624c;
import kotlin.properties.C9622a;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(m14358d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0015\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\bl\u0010mB\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010o\u001a\u0004\u0018\u00010n¢\u0006\u0004\bl\u0010pB#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010o\u001a\u0004\u0018\u00010n\u0012\u0006\u0010q\u001a\u00020\u000b¢\u0006\u0004\bl\u0010rJ\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0082\bJ\b\u0010\u0013\u001a\u00020\u0006H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0004J\b\u0010\u0018\u001a\u00020\u0006H\u0004J\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019J\b\u0010\u001d\u001a\u00020\u001cH\u0016J0\u0010#\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0014J\u0012\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$H\u0015J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010(\u001a\u00020'H\u0016J\b\u0010+\u001a\u00020\u0003H\u0016J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0003H\u0016J\b\u0010.\u001a\u00020\u0003H\u0016J\u0010\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0003H\u0016J \u00104\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u0016J\b\u00105\u001a\u0004\u0018\u00010\bJ\u0010\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u000206H\u0016J\u0012\u0010:\u001a\u00020\u00062\b\b\u0002\u00109\u001a\u00020\u0019H\u0016R\"\u0010;\u001a\u00020\u001c8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R.\u0010B\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00060A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0017\u0010H\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR+\u0010Q\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u00198V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR0\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0006\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010C\u001a\u0004\bV\u0010E\"\u0004\bW\u0010GR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010MR\u0016\u0010\\\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010MR \u0010]\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\u0012\n\u0004\b]\u0010^\u0012\u0004\ba\u0010b\u001a\u0004\b_\u0010`R \u0010c\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\u0012\n\u0004\bc\u0010^\u0012\u0004\be\u0010b\u001a\u0004\bd\u0010`R\u0016\u0010f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010gR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bk\u0010j¨\u0006s"}, m14357d2 = {"Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;", "Lcom/discord/mobile_voice_overlay/views/OverlayView;", "Landroidx/dynamicanimation/animation/SpringAnimation;", "", "fromPosition", "toPosition", "", "animateTo", "Landroid/graphics/Point;", "newAnchorPoint", "setAnchorAt", "", "centerX", "centerY", "setAnchorAround", "minValue", "desiredValue", "maxValue", "boundAllowedArea", "computeScreenOffset", "Landroid/content/Context;", "context", "Landroid/graphics/Rect;", "getAllowedAreaBounds", "updateViewLayout", "", "isTouchable", "setBubbleTouchable", "Landroid/view/WindowManager$LayoutParams;", "getInitialLayoutParams", "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, ViewProps.ON_LAYOUT, "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Landroid/view/MotionEvent;", "motionEvent", "dispatchTouchEvent", "onInterceptTouchEvent", "getX", "x", "setX", "getY", "y", "setY", "dockX", "dockY", "screenBounds", "animateToCoordinate", "moveToAnchorPoint", "Landroid/view/View;", "targetView", "anchorOn", "animate", "anchorOff", "windowLayoutParams", "Landroid/view/WindowManager$LayoutParams;", "getWindowLayoutParams", "()Landroid/view/WindowManager$LayoutParams;", "setWindowLayoutParams", "(Landroid/view/WindowManager$LayoutParams;)V", "Lkotlin/Function1;", "touchDispatchSideEffectHandler", "Lkotlin/jvm/functions/Function1;", "getTouchDispatchSideEffectHandler$mobile_voice_overlay_release", "()Lkotlin/jvm/functions/Function1;", "setTouchDispatchSideEffectHandler$mobile_voice_overlay_release", "(Lkotlin/jvm/functions/Function1;)V", "insetMargins", "Landroid/graphics/Rect;", "getInsetMargins", "()Landroid/graphics/Rect;", "moveThresholdPx", "I", "<set-?>", "isMoving$delegate", "Lkotlin/properties/ReadWriteProperty;", "isMoving", "()Z", "setMoving", "(Z)V", "onMovingStateChanged", "getOnMovingStateChanged", "setOnMovingStateChanged", "", "screenOffset", "[I", "deltaX", "deltaY", "springAnimationX", "Landroidx/dynamicanimation/animation/SpringAnimation;", "getSpringAnimationX", "()Landroidx/dynamicanimation/animation/SpringAnimation;", "getSpringAnimationX$annotations", "()V", "springAnimationY", "getSpringAnimationY", "getSpringAnimationY$annotations", "actualPosition", "Landroid/graphics/Point;", "anchorPosition", "getCenterX", "()I", "getCenterY", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSetId", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mobile_voice_overlay_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public abstract class OverlayBubbleWrap extends OverlayView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {C9591f0.m13966e(new C9618w(OverlayBubbleWrap.class, "isMoving", "isMoving()Z", 0))};
    private Point actualPosition;
    private Point anchorPosition;
    private int deltaX;
    private int deltaY;
    private final Rect insetMargins;
    private final ReadWriteProperty isMoving$delegate;
    private final int moveThresholdPx;
    private Function1<? super Boolean, Unit> onMovingStateChanged;
    private final int[] screenOffset;
    private final SpringAnimation springAnimationX;
    private final SpringAnimation springAnimationY;
    private Function1<? super MotionEvent, Unit> touchDispatchSideEffectHandler;
    private WindowManager.LayoutParams windowLayoutParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayBubbleWrap(Context context) {
        super(context);
        C9612q.m13917h(context, "context");
        WindowManager.LayoutParams createWindowLayoutParams = WindowUtils.INSTANCE.createWindowLayoutParams();
        createWindowLayoutParams.gravity = 51;
        this.windowLayoutParams = createWindowLayoutParams;
        this.touchDispatchSideEffectHandler = OverlayBubbleWrap$touchDispatchSideEffectHandler$1.INSTANCE;
        this.insetMargins = new Rect();
        this.moveThresholdPx = getResources().getDimensionPixelOffset(C3317R.dimen.movement_threshold_dp);
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), C3317R.C3318drawable.bubble_state_selector));
        C9622a c9622a = C9622a.f25358a;
        this.isMoving$delegate = new AbstractC9624c<Boolean>(Boolean.FALSE) { // from class: com.discord.mobile_voice_overlay.views.OverlayBubbleWrap$special$$inlined$observable$1
            @Override // kotlin.properties.AbstractC9624c
            protected void afterChange(KProperty<?> property, Boolean bool2, Boolean bool3) {
                C9612q.m13917h(property, "property");
                boolean booleanValue = bool3.booleanValue();
                if (bool2.booleanValue() != booleanValue) {
                    Function1<Boolean, Unit> onMovingStateChanged = this.getOnMovingStateChanged();
                    if (onMovingStateChanged != null) {
                        onMovingStateChanged.invoke(Boolean.valueOf(booleanValue));
                    }
                    if (booleanValue) {
                        this.performHapticFeedback(1);
                        this.getSpringAnimationX().mo36731b();
                        this.getSpringAnimationY().mo36731b();
                    }
                    this.setPressed(booleanValue);
                }
            }
        };
        this.screenOffset = new int[2];
        SpringAnimation springAnimation = new SpringAnimation(this, AbstractC1466b.f3863u, 0.0f);
        springAnimation.m36723j(50.0f);
        springAnimation.m36746p().m36684f(200.0f);
        springAnimation.m36746p().m36686d(0.75f);
        this.springAnimationX = springAnimation;
        SpringAnimation springAnimation2 = new SpringAnimation(this, AbstractC1466b.f3864v, 0.0f);
        springAnimation2.m36723j(50.0f);
        springAnimation2.m36746p().m36686d(0.75f);
        springAnimation2.m36746p().m36684f(200.0f);
        this.springAnimationY = springAnimation2;
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        this.actualPosition = new Point(layoutParams.x, layoutParams.y);
    }

    public static /* synthetic */ void anchorOff$default(OverlayBubbleWrap overlayBubbleWrap, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: anchorOff");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        overlayBubbleWrap.anchorOff(z);
    }

    private final void animateTo(SpringAnimation springAnimation, float f, float f2) {
        springAnimation.mo36731b();
        springAnimation.m36724i(f);
        springAnimation.m36748n(f2);
    }

    public static /* synthetic */ void animateToCoordinate$default(OverlayBubbleWrap overlayBubbleWrap, int i, int i2, Rect rect, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                Context context = overlayBubbleWrap.getContext();
                C9612q.m13918g(context, "context");
                rect = overlayBubbleWrap.getAllowedAreaBounds(context);
            }
            overlayBubbleWrap.animateToCoordinate(i, i2, rect);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateToCoordinate");
    }

    private final int boundAllowedArea(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public final void computeScreenOffset() {
        getLocationOnScreen(this.screenOffset);
        int[] iArr = this.screenOffset;
        int i = iArr[0];
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        iArr[0] = i - layoutParams.x;
        iArr[1] = iArr[1] - layoutParams.y;
    }

    protected static /* synthetic */ void getSpringAnimationX$annotations() {
    }

    protected static /* synthetic */ void getSpringAnimationY$annotations() {
    }

    private final Point setAnchorAround(int i, int i2) {
        Point point = new Point(i - (getWidth() / 2), i2 - (getHeight() / 2));
        setAnchorAt(point);
        return point;
    }

    private final void setAnchorAt(Point point) {
        this.actualPosition.x = (int) getX();
        this.actualPosition.y = (int) getY();
        this.anchorPosition = point;
    }

    public void anchorOff(boolean z) {
        this.anchorPosition = null;
        this.springAnimationX.mo36731b();
        this.springAnimationY.mo36731b();
        if (z) {
            Point point = this.actualPosition;
            animateToCoordinate$default(this, point.x, point.y, null, 4, null);
            return;
        }
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        Point point2 = this.actualPosition;
        layoutParams.x = point2.x;
        layoutParams.y = point2.y;
        updateViewLayout();
    }

    public void anchorOn(View targetView) {
        C9612q.m13917h(targetView, "targetView");
        int[] centerPointOnScreen = WindowUtils.INSTANCE.getCenterPointOnScreen(targetView, new int[2]);
        int i = centerPointOnScreen[0];
        int[] iArr = this.screenOffset;
        Point anchorAround = setAnchorAround(i - iArr[0], centerPointOnScreen[1] - iArr[1]);
        animateToCoordinate$default(this, anchorAround.x, anchorAround.y, null, 4, null);
    }

    public final void animateToCoordinate(int i, int i2, Rect screenBounds) {
        C9612q.m13917h(screenBounds, "screenBounds");
        animateTo(this.springAnimationX, this.windowLayoutParams.x, Math.min(Math.max(screenBounds.left, i), screenBounds.right - getWidth()));
        animateTo(this.springAnimationY, this.windowLayoutParams.y, Math.min(Math.max(screenBounds.top - this.screenOffset[1], i2), screenBounds.bottom - getHeight()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C9612q.m13917h(motionEvent, "motionEvent");
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z = false;
            if (action != 1) {
                if (action == 2) {
                    if (!isMoving()) {
                        if (Math.abs((this.deltaX + this.windowLayoutParams.x) - ((int) motionEvent.getRawX())) > this.moveThresholdPx) {
                            z = true;
                        }
                        if (z) {
                            setMoving(true);
                        }
                    } else {
                        this.actualPosition.x = ((int) motionEvent.getRawX()) - this.deltaX;
                        this.actualPosition.y = ((int) motionEvent.getRawY()) - this.deltaY;
                        if (C1365w0.m37225T(this) && this.anchorPosition == null) {
                            WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
                            Point point = this.actualPosition;
                            layoutParams.x = point.x;
                            layoutParams.y = point.y;
                            updateViewLayout();
                        }
                    }
                }
            } else if (isMoving()) {
                setMoving(false);
            }
        } else {
            this.deltaX = ((int) motionEvent.getRawX()) - this.windowLayoutParams.x;
            this.deltaY = ((int) motionEvent.getRawY()) - this.windowLayoutParams.y;
        }
        this.touchDispatchSideEffectHandler.invoke(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final Rect getAllowedAreaBounds(Context context) {
        C9612q.m13917h(context, "context");
        Rect screenSize = WindowUtils.INSTANCE.getScreenSize(context);
        int i = screenSize.left;
        Rect rect = this.insetMargins;
        screenSize.left = i + rect.left;
        screenSize.right -= rect.right;
        screenSize.top += rect.top;
        screenSize.bottom -= rect.bottom;
        return screenSize;
    }

    public final int getCenterX() {
        return this.windowLayoutParams.x + (getWidth() / 2);
    }

    public final int getCenterY() {
        return this.windowLayoutParams.y + (getHeight() / 2);
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayView
    public WindowManager.LayoutParams getInitialLayoutParams() {
        return this.windowLayoutParams;
    }

    public final Rect getInsetMargins() {
        return this.insetMargins;
    }

    public final Function1<Boolean, Unit> getOnMovingStateChanged() {
        return this.onMovingStateChanged;
    }

    public final SpringAnimation getSpringAnimationX() {
        return this.springAnimationX;
    }

    public final SpringAnimation getSpringAnimationY() {
        return this.springAnimationY;
    }

    public final Function1<MotionEvent, Unit> getTouchDispatchSideEffectHandler$mobile_voice_overlay_release() {
        return this.touchDispatchSideEffectHandler;
    }

    public final WindowManager.LayoutParams getWindowLayoutParams() {
        return this.windowLayoutParams;
    }

    @Override // android.view.View
    public float getX() {
        return this.windowLayoutParams.x;
    }

    @Override // android.view.View
    public float getY() {
        return this.windowLayoutParams.y;
    }

    public boolean isMoving() {
        return ((Boolean) this.isMoving$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final Point moveToAnchorPoint() {
        Point point = this.anchorPosition;
        if (point != null) {
            Point point2 = this.actualPosition;
            point2.x = point.x;
            point2.y = point.y;
            return point;
        }
        return null;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateViewLayout();
        if (C1365w0.m37224U(this) && !isLayoutRequested()) {
            computeScreenOffset();
        } else {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.discord.mobile_voice_overlay.views.OverlayBubbleWrap$onConfigurationChanged$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    C9612q.m13917h(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    OverlayBubbleWrap.this.computeScreenOffset();
                }
            });
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C9612q.m13917h(motionEvent, "motionEvent");
        if (motionEvent.getAction() == 2) {
            return isMoving();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            computeScreenOffset();
        }
    }

    public final void setBubbleTouchable(boolean z) {
        WindowUtils.INSTANCE.setFlagTouchable(this.windowLayoutParams, z);
        updateViewLayout();
    }

    public void setMoving(boolean z) {
        this.isMoving$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setOnMovingStateChanged(Function1<? super Boolean, Unit> function1) {
        this.onMovingStateChanged = function1;
    }

    public final void setTouchDispatchSideEffectHandler$mobile_voice_overlay_release(Function1<? super MotionEvent, Unit> function1) {
        C9612q.m13917h(function1, "<set-?>");
        this.touchDispatchSideEffectHandler = function1;
    }

    protected final void setWindowLayoutParams(WindowManager.LayoutParams layoutParams) {
        C9612q.m13917h(layoutParams, "<set-?>");
        this.windowLayoutParams = layoutParams;
    }

    @Override // android.view.View
    public void setX(float f) {
        this.windowLayoutParams.x = (int) f;
        updateViewLayout();
    }

    @Override // android.view.View
    public void setY(float f) {
        this.windowLayoutParams.y = (int) f;
        updateViewLayout();
    }

    public final void updateViewLayout() {
        if (isAttachedToWindow() && isManagedByWindow()) {
            Object systemService = getContext().getSystemService("window");
            C9612q.m13919f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService).updateViewLayout(this, this.windowLayoutParams);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayBubbleWrap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        WindowManager.LayoutParams createWindowLayoutParams = WindowUtils.INSTANCE.createWindowLayoutParams();
        createWindowLayoutParams.gravity = 51;
        this.windowLayoutParams = createWindowLayoutParams;
        this.touchDispatchSideEffectHandler = OverlayBubbleWrap$touchDispatchSideEffectHandler$1.INSTANCE;
        this.insetMargins = new Rect();
        this.moveThresholdPx = getResources().getDimensionPixelOffset(C3317R.dimen.movement_threshold_dp);
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), C3317R.C3318drawable.bubble_state_selector));
        C9622a c9622a = C9622a.f25358a;
        this.isMoving$delegate = new AbstractC9624c<Boolean>(Boolean.FALSE) { // from class: com.discord.mobile_voice_overlay.views.OverlayBubbleWrap$special$$inlined$observable$2
            @Override // kotlin.properties.AbstractC9624c
            protected void afterChange(KProperty<?> property, Boolean bool2, Boolean bool3) {
                C9612q.m13917h(property, "property");
                boolean booleanValue = bool3.booleanValue();
                if (bool2.booleanValue() != booleanValue) {
                    Function1<Boolean, Unit> onMovingStateChanged = this.getOnMovingStateChanged();
                    if (onMovingStateChanged != null) {
                        onMovingStateChanged.invoke(Boolean.valueOf(booleanValue));
                    }
                    if (booleanValue) {
                        this.performHapticFeedback(1);
                        this.getSpringAnimationX().mo36731b();
                        this.getSpringAnimationY().mo36731b();
                    }
                    this.setPressed(booleanValue);
                }
            }
        };
        this.screenOffset = new int[2];
        SpringAnimation springAnimation = new SpringAnimation(this, AbstractC1466b.f3863u, 0.0f);
        springAnimation.m36723j(50.0f);
        springAnimation.m36746p().m36684f(200.0f);
        springAnimation.m36746p().m36686d(0.75f);
        this.springAnimationX = springAnimation;
        SpringAnimation springAnimation2 = new SpringAnimation(this, AbstractC1466b.f3864v, 0.0f);
        springAnimation2.m36723j(50.0f);
        springAnimation2.m36746p().m36686d(0.75f);
        springAnimation2.m36746p().m36684f(200.0f);
        this.springAnimationY = springAnimation2;
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        this.actualPosition = new Point(layoutParams.x, layoutParams.y);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayBubbleWrap(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        WindowManager.LayoutParams createWindowLayoutParams = WindowUtils.INSTANCE.createWindowLayoutParams();
        createWindowLayoutParams.gravity = 51;
        this.windowLayoutParams = createWindowLayoutParams;
        this.touchDispatchSideEffectHandler = OverlayBubbleWrap$touchDispatchSideEffectHandler$1.INSTANCE;
        this.insetMargins = new Rect();
        this.moveThresholdPx = getResources().getDimensionPixelOffset(C3317R.dimen.movement_threshold_dp);
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), C3317R.C3318drawable.bubble_state_selector));
        C9622a c9622a = C9622a.f25358a;
        this.isMoving$delegate = new AbstractC9624c<Boolean>(Boolean.FALSE) { // from class: com.discord.mobile_voice_overlay.views.OverlayBubbleWrap$special$$inlined$observable$3
            @Override // kotlin.properties.AbstractC9624c
            protected void afterChange(KProperty<?> property, Boolean bool2, Boolean bool3) {
                C9612q.m13917h(property, "property");
                boolean booleanValue = bool3.booleanValue();
                if (bool2.booleanValue() != booleanValue) {
                    Function1<Boolean, Unit> onMovingStateChanged = this.getOnMovingStateChanged();
                    if (onMovingStateChanged != null) {
                        onMovingStateChanged.invoke(Boolean.valueOf(booleanValue));
                    }
                    if (booleanValue) {
                        this.performHapticFeedback(1);
                        this.getSpringAnimationX().mo36731b();
                        this.getSpringAnimationY().mo36731b();
                    }
                    this.setPressed(booleanValue);
                }
            }
        };
        this.screenOffset = new int[2];
        SpringAnimation springAnimation = new SpringAnimation(this, AbstractC1466b.f3863u, 0.0f);
        springAnimation.m36723j(50.0f);
        springAnimation.m36746p().m36684f(200.0f);
        springAnimation.m36746p().m36686d(0.75f);
        this.springAnimationX = springAnimation;
        SpringAnimation springAnimation2 = new SpringAnimation(this, AbstractC1466b.f3864v, 0.0f);
        springAnimation2.m36723j(50.0f);
        springAnimation2.m36746p().m36686d(0.75f);
        springAnimation2.m36746p().m36684f(200.0f);
        this.springAnimationY = springAnimation2;
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        this.actualPosition = new Point(layoutParams.x, layoutParams.y);
    }
}
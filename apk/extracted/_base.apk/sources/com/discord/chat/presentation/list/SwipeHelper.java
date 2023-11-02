package com.discord.chat.presentation.list;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.core.content.res.C0980h;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.C2912R;
import com.discord.device.utils.DeviceReducedMotion;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.theme.LightTheme;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.uimanager.events.TouchesHelper;
import gg.C6759j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u0000 S2\u00020\u0001:\u0001SB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*H\u0002J\u0018\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\fH\u0002J(\u0010/\u001a\u0002002\u0006\u0010,\u001a\u00020-2\u0006\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000eH\u0016J\u0010\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000eH\u0002J\u0010\u00106\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000eH\u0002J$\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e082\u0006\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000eH\u0016J\u0018\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000eH\u0002J\u0018\u0010=\u001a\u00020\u00172\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\fH\u0016J\b\u0010>\u001a\u00020\u000eH\u0002J@\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020*2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u00172\u0006\u0010C\u001a\u00020\u0015H\u0016J \u0010D\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\f2\u0006\u0010E\u001a\u00020\fH\u0016J\u001a\u0010F\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010G\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\f2\u0006\u0010B\u001a\u00020\u0017H\u0016J\u0018\u0010H\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\f2\u0006\u0010I\u001a\u00020\u0017H\u0016J\b\u0010J\u001a\u00020\u0015H\u0016J\u0010\u0010K\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\fH\u0002J\b\u0010L\u001a\u00020\u0015H\u0016J\u0010\u0010M\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010N\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u0010O\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\fH\u0002J\u0018\u0010P\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\fH\u0002J\b\u0010Q\u001a\u00020\u0006H\u0002J\u0010\u0010R\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\fH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006T"}, m14357d2 = {"Lcom/discord/chat/presentation/list/SwipeHelper;", "Lcom/discord/chat/presentation/list/ChatListCallback;", "context", "Landroid/content/Context;", "onStart", "Lkotlin/Function0;", "", "onEnd", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "actionType", "Lcom/discord/chat/presentation/list/SwipeActionType;", "currentItemViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "dX", "", "easterEggArrowAnimator", "Landroid/animation/ValueAnimator;", "easterEggArrowRotationAnimator", "easterEggArrowRotationDegrees", "easterEggArrowScale", "easterEggIsAnimating", "", "easterEggPullCount", "", "editCircleScale", "editCircleScaleAnimator", "editIcon", "Landroid/graphics/drawable/Drawable;", "editRunnable", "Ljava/lang/Runnable;", "handler", "Landroid/os/Handler;", "isActive", "isCompleted", "mView", "Landroid/view/View;", "replyIcon", "shouldPerformHapticFeedback", "shouldTriggerReply", "swipeBack", "drawContextArea", "canvas", "Landroid/graphics/Canvas;", "easterEggStartAnimation", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "getAnimationDuration", "", "animationType", "animateDx", "animateDy", "getArrowContainerBaseSize", "contentHeight", "getArrowIconBaseSize", "getEffectiveDxDy", "Landroid/util/Pair;", "rawDx", "rawDy", "getLeftBevelRadius", "progress", "getMovementFlags", "getSwipeProgress", "onChildDraw", "c", "dY", "actionState", "isCurrentlyActive", "onMove", TouchesHelper.TARGET_KEY, "onReleased", "onSelectedChanged", "onSwiped", "direction", "shouldReturnToOriginalPosition", "shouldStartEditEntrance", "shouldUseSpringyExit", "triggerDelayedEditEntranceTransition", "triggerEditExitTransition", "updateEditTransition", "updateHapticFeedbackTrigger", "updateReplyTrigger", "updateShadow", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SwipeHelper extends ChatListCallback {
    private static final long ANIM_RETURN_DURATION = 300;
    private static final String ANIM_VALUE_ARROW_ROTATION = "arrow-rotation";
    private static final String ANIM_VALUE_ARROW_SCALE = "arrow-scale";
    private static final String ANIM_VALUE_EDIT_CIRCLE_SCALE = "edit-circle-scale";
    public static final Companion Companion = new Companion(null);
    private static final int EDIT_OFFSET_X;
    private static final int HAPTIC_RESET_X;
    private static final int HAPTIC_TRIGGER_X;
    private static final int MAX_CONTEXT_AREA_WIDTH;
    private static final int MAX_LEFT_BEVEL_RADIUS;
    private static final int MAX_RIGHT_BEVEL_WIDTH;
    private static final int REPLY_RESET_X;
    private static final int RIGHT_BEVEL_HEIGHT;
    private static final int SWIPE_STOP_OFFSET_X;
    private SwipeActionType actionType;
    private final Context context;
    private RecyclerView.ViewHolder currentItemViewHolder;

    /* renamed from: dX */
    private float f8366dX;
    private ValueAnimator easterEggArrowAnimator;
    private ValueAnimator easterEggArrowRotationAnimator;
    private float easterEggArrowRotationDegrees;
    private float easterEggArrowScale;
    private boolean easterEggIsAnimating;
    private int easterEggPullCount;
    private float editCircleScale;
    private ValueAnimator editCircleScaleAnimator;
    private Drawable editIcon;
    private Runnable editRunnable;
    private final Handler handler;
    private boolean isActive;
    private boolean isCompleted;
    private View mView;
    private final Function0<Unit> onEnd;
    private final Function0<Unit> onStart;
    private Drawable replyIcon;
    private boolean shouldPerformHapticFeedback;
    private boolean shouldTriggerReply;
    private boolean swipeBack;

    @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m14357d2 = {"Lcom/discord/chat/presentation/list/SwipeHelper$Companion;", "", "()V", "ANIM_RETURN_DURATION", "", "ANIM_VALUE_ARROW_ROTATION", "", "ANIM_VALUE_ARROW_SCALE", "ANIM_VALUE_EDIT_CIRCLE_SCALE", "EDIT_OFFSET_X", "", "HAPTIC_RESET_X", "HAPTIC_TRIGGER_X", "MAX_CONTEXT_AREA_WIDTH", "MAX_LEFT_BEVEL_RADIUS", "MAX_RIGHT_BEVEL_WIDTH", "REPLY_RESET_X", "RIGHT_BEVEL_HEIGHT", "SWIPE_STOP_OFFSET_X", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SwipeActionType.values().length];
            try {
                iArr[SwipeActionType.Reply.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SwipeActionType.Edit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int dpToPx = SizeUtilsKt.getDpToPx(80);
        MAX_CONTEXT_AREA_WIDTH = dpToPx;
        int i = -dpToPx;
        SWIPE_STOP_OFFSET_X = i;
        HAPTIC_TRIGGER_X = i;
        int dpToPx2 = SizeUtilsKt.getDpToPx(-60);
        HAPTIC_RESET_X = dpToPx2;
        REPLY_RESET_X = dpToPx2;
        EDIT_OFFSET_X = SizeUtilsKt.getDpToPx(-90);
        MAX_RIGHT_BEVEL_WIDTH = SizeUtilsKt.getDpToPx(32);
        RIGHT_BEVEL_HEIGHT = SizeUtilsKt.getDpToPx(24);
        MAX_LEFT_BEVEL_RADIUS = SizeUtilsKt.getDpToPx(16);
    }

    public SwipeHelper(Context context, Function0<Unit> onStart, Function0<Unit> onEnd) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(onStart, "onStart");
        C9612q.m13917h(onEnd, "onEnd");
        this.context = context;
        this.onStart = onStart;
        this.onEnd = onEnd;
        this.replyIcon = C0980h.m38241f(context.getResources(), C2912R.C2913drawable.ic_swipe_reply, context.getTheme());
        this.editIcon = C0980h.m38241f(context.getResources(), C2912R.C2913drawable.ic_swipe_edit, context.getTheme());
        this.easterEggArrowScale = 1.0f;
        this.shouldPerformHapticFeedback = true;
        this.actionType = SwipeActionType.Reply;
        this.handler = new Handler(context.getMainLooper());
    }

    private final void drawContextArea(Canvas canvas) {
        boolean z;
        View view;
        int m21923j;
        float f;
        String str;
        float f2;
        float f3;
        float f4;
        if (this.currentItemViewHolder != null) {
            if (this.f8366dX == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                View view2 = this.mView;
                if (view2 == null) {
                    C9612q.m13900y("mView");
                    view2 = null;
                }
                float abs = Math.abs(view2.getTranslationX());
                View view3 = this.mView;
                if (view3 == null) {
                    C9612q.m13900y("mView");
                    view3 = null;
                }
                float measuredHeight = view3.getMeasuredHeight();
                Paint paint = new Paint();
                paint.setColor(ThemeManagerKt.getTheme().getChatSwipeToReplyBackground());
                paint.setStyle(Paint.Style.FILL);
                canvas.save();
                float swipeProgress = getSwipeProgress();
                float leftBevelRadius = getLeftBevelRadius(swipeProgress, measuredHeight);
                float f5 = MAX_RIGHT_BEVEL_WIDTH * swipeProgress;
                View view4 = this.mView;
                if (view4 == null) {
                    C9612q.m13900y("mView");
                    view4 = null;
                }
                float measuredWidth = view4.getMeasuredWidth();
                View view5 = this.mView;
                if (view5 == null) {
                    C9612q.m13900y("mView");
                    view5 = null;
                }
                float translationX = measuredWidth + view5.getTranslationX();
                float f6 = translationX - leftBevelRadius;
                float f7 = translationX + abs;
                float f8 = f7 - f5;
                View view6 = this.mView;
                if (view6 == null) {
                    C9612q.m13900y("mView");
                    view = null;
                } else {
                    view = view6;
                }
                int i = RIGHT_BEVEL_HEIGHT;
                float top = view.getTop() - i;
                float f9 = i + top;
                float f10 = top + measuredHeight + (i * 2);
                float f11 = f10 - i;
                Path path = new Path();
                path.moveTo(f8, f11);
                path.lineTo(translationX, f11);
                path.lineTo(translationX, f9 + leftBevelRadius);
                float f12 = 2;
                path.addArc(f6 - leftBevelRadius, f9, translationX, f9 + (f12 * leftBevelRadius), 0.0f, -90.0f);
                path.lineTo(f8, f9);
                float f13 = (f5 * 0.55f) + f8;
                path.cubicTo(f13, f9, f7, top + (i * 0.55f), f7, top);
                path.lineTo(f7, f10);
                path.cubicTo(f7, f10 - (i * 0.55f), f13, f11, f8, f11);
                canvas.save();
                canvas.clipPath(path);
                canvas.drawRect(f6, top, f7, f10, paint);
                canvas.restore();
                canvas.save();
                path.reset();
                float f14 = f11 - leftBevelRadius;
                path.addCircle(f6, f14, leftBevelRadius, Path.Direction.CW);
                if (Build.VERSION.SDK_INT >= 26) {
                    canvas.clipOutPath(path);
                } else {
                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                }
                canvas.drawRect(f6, f14, translationX, f11, paint);
                canvas.restore();
                float arrowContainerBaseSize = getArrowContainerBaseSize(measuredHeight) / f12;
                m21923j = C6759j.m21923j(((int) (192 * swipeProgress)) + 64, 0, 255);
                canvas.save();
                canvas.clipRect(translationX, 0.0f, f7, canvas.getHeight());
                canvas.translate(((translationX + (abs / f12)) - arrowContainerBaseSize) + arrowContainerBaseSize, ((int) ((f9 + (measuredHeight / f12)) - arrowContainerBaseSize)) + arrowContainerBaseSize);
                float f15 = this.easterEggArrowScale;
                canvas.scale(f15, f15);
                if (this.isCompleted) {
                    f = 1.0f;
                } else {
                    f = swipeProgress;
                }
                paint.setColor(ColorUtilsKt.interpolateColors(ThemeManagerKt.getTheme().getBgSurfaceOverlay(), ColorUtilsKt.getColorCompat(this.context, C2912R.color.brand_500), f, 0.8f, 1.0f));
                paint.setStyle(Paint.Style.FILL);
                paint.setAlpha(m21923j);
                if (ThemeManagerKt.getTheme() instanceof LightTheme) {
                    str = "#16000000";
                } else {
                    str = "#24000000";
                }
                paint.setShadowLayer(10.0f, 0.0f, 5.0f, Color.parseColor(str));
                canvas.drawCircle(0.0f, 0.0f, arrowContainerBaseSize, paint);
                paint.clearShadowLayer();
                if (this.editCircleScale > 0.0f) {
                    canvas.save();
                    float f16 = this.editCircleScale;
                    canvas.scale(f16, f16);
                    if (this.isCompleted) {
                        f4 = 1.0f;
                    } else {
                        f4 = swipeProgress;
                    }
                    paint.setColor(ColorUtilsKt.interpolateColors(ThemeManagerKt.getTheme().getBgSurfaceOverlay(), ColorUtilsKt.getColorCompat(this.context, C2912R.color.yellow_345), f4, 0.8f, 1.0f));
                    paint.setStyle(Paint.Style.FILL);
                    paint.setAlpha(255);
                    f2 = 0.0f;
                    canvas.drawCircle(0.0f, 0.0f, arrowContainerBaseSize, paint);
                    canvas.restore();
                } else {
                    f2 = 0.0f;
                }
                canvas.save();
                float max = Math.max(f2, Math.min(1.0f, 1 - this.editCircleScale));
                float arrowIconBaseSize = getArrowIconBaseSize(measuredHeight);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(ColorUtilsKt.interpolateColors(ThemeManagerKt.getTheme().getInteractiveNormal(), ColorUtilsKt.getColorCompat(this.context, C2912R.color.white), f, 0.8f, 1.0f), PorterDuff.Mode.SRC_ATOP);
                Drawable drawable = this.replyIcon;
                if (drawable != null) {
                    drawable.setColorFilter(porterDuffColorFilter);
                }
                if (DeviceReducedMotion.INSTANCE.isReducedMotionEnabled(this.context)) {
                    f3 = 0.0f;
                } else {
                    f3 = (1.0f - swipeProgress) * 90.0f;
                }
                float f17 = this.easterEggArrowRotationDegrees;
                canvas.translate(-1.0f, -1.0f);
                float f18 = f3 + f17;
                canvas.rotate(f18);
                canvas.scale(max, max);
                int i2 = (int) (arrowIconBaseSize / 2.0f);
                int i3 = -i2;
                Rect rect = new Rect(i3, i3, i2, i2);
                Drawable drawable2 = this.replyIcon;
                if (drawable2 != null) {
                    drawable2.setBounds(rect);
                }
                Drawable drawable3 = this.replyIcon;
                if (drawable3 != null) {
                    drawable3.setAlpha(m21923j);
                }
                Drawable drawable4 = this.replyIcon;
                if (drawable4 != null) {
                    drawable4.draw(canvas);
                }
                canvas.restore();
                if (this.editCircleScale > 0.0f) {
                    canvas.save();
                    Drawable drawable5 = this.editIcon;
                    if (drawable5 != null) {
                        drawable5.setColorFilter(porterDuffColorFilter);
                    }
                    canvas.rotate(f18);
                    float f19 = this.editCircleScale;
                    canvas.scale(f19, f19);
                    Drawable drawable6 = this.editIcon;
                    if (drawable6 != null) {
                        drawable6.setBounds(rect);
                    }
                    Drawable drawable7 = this.editIcon;
                    if (drawable7 != null) {
                        drawable7.setAlpha(255);
                    }
                    Drawable drawable8 = this.editIcon;
                    if (drawable8 != null) {
                        drawable8.draw(canvas);
                    }
                    canvas.restore();
                }
                canvas.restore();
            }
        }
    }

    private final void easterEggStartAnimation(final RecyclerView recyclerView, final RecyclerView.ViewHolder viewHolder) {
        if (DeviceReducedMotion.INSTANCE.isReducedMotionEnabled(this.context)) {
            return;
        }
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(ANIM_VALUE_ARROW_SCALE, 1.0f, 1.4f, 1.0f);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(ofFloat);
        valueAnimator.setDuration(ANIM_RETURN_DURATION);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.list.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SwipeHelper.easterEggStartAnimation$lambda$7$lambda$6(SwipeHelper.this, recyclerView, valueAnimator2);
            }
        });
        this.easterEggArrowAnimator = valueAnimator;
        valueAnimator.start();
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(ANIM_VALUE_ARROW_ROTATION, 720.0f, 0.0f);
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setValues(ofFloat2);
        valueAnimator2.setDuration(800L);
        valueAnimator2.setInterpolator(new PathInterpolator(0.0f, 0.0f, 0.25f, 1.0f));
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.list.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                SwipeHelper.easterEggStartAnimation$lambda$10$lambda$8(SwipeHelper.this, recyclerView, valueAnimator3);
            }
        });
        valueAnimator2.addListener(new Animator.AnimatorListener() { // from class: com.discord.chat.presentation.list.SwipeHelper$easterEggStartAnimation$lambda$10$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                C9612q.m13917h(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                boolean shouldStartEditEntrance;
                C9612q.m13917h(animator, "animator");
                SwipeHelper.this.easterEggIsAnimating = false;
                SwipeHelper.this.easterEggPullCount = 0;
                shouldStartEditEntrance = SwipeHelper.this.shouldStartEditEntrance(viewHolder);
                if (shouldStartEditEntrance) {
                    SwipeHelper.this.triggerDelayedEditEntranceTransition(recyclerView);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                C9612q.m13917h(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C9612q.m13917h(animator, "animator");
            }
        });
        this.easterEggArrowRotationAnimator = valueAnimator2;
        valueAnimator2.start();
        this.easterEggIsAnimating = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void easterEggStartAnimation$lambda$10$lambda$8(SwipeHelper this$0, RecyclerView recyclerView, ValueAnimator it) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(recyclerView, "$recyclerView");
        C9612q.m13917h(it, "it");
        Object animatedValue = it.getAnimatedValue(ANIM_VALUE_ARROW_ROTATION);
        C9612q.m13919f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.easterEggArrowRotationDegrees = ((Float) animatedValue).floatValue();
        recyclerView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void easterEggStartAnimation$lambda$7$lambda$6(SwipeHelper this$0, RecyclerView recyclerView, ValueAnimator it) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(recyclerView, "$recyclerView");
        C9612q.m13917h(it, "it");
        Object animatedValue = it.getAnimatedValue(ANIM_VALUE_ARROW_SCALE);
        C9612q.m13919f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.easterEggArrowScale = ((Float) animatedValue).floatValue();
        recyclerView.invalidate();
    }

    private final float getArrowContainerBaseSize(float f) {
        return Math.min(f - SizeUtilsKt.getDpToPx(6), SizeUtilsKt.getDpToPx(40));
    }

    private final float getArrowIconBaseSize(float f) {
        return getArrowContainerBaseSize(f) * 0.6f;
    }

    private final float getLeftBevelRadius(float f, float f2) {
        return f * Math.min(MAX_LEFT_BEVEL_RADIUS, (f2 - 8) / 2.0f);
    }

    private final float getSwipeProgress() {
        View view = this.mView;
        if (view == null) {
            C9612q.m13900y("mView");
            view = null;
        }
        return Math.max(0.0f, Math.min(view.getTranslationX() / SWIPE_STOP_OFFSET_X, 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldStartEditEntrance(androidx.recyclerview.widget.RecyclerView.ViewHolder r6) {
        /*
            r5 = this;
            com.discord.chat.presentation.list.SwipeActionType r0 = r5.actionType
            com.discord.chat.presentation.list.SwipeActionType r1 = com.discord.chat.presentation.list.SwipeActionType.Reply
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 != r1) goto L37
            android.view.View r0 = r5.mView
            if (r0 != 0) goto L13
            java.lang.String r0 = "mView"
            kotlin.jvm.internal.C9612q.m13900y(r0)
            r0 = r2
        L13:
            float r0 = r0.getTranslationX()
            int r1 = com.discord.chat.presentation.list.SwipeHelper.EDIT_OFFSET_X
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L37
            android.animation.ValueAnimator r0 = r5.editCircleScaleAnimator
            if (r0 == 0) goto L2a
            boolean r0 = r0.isRunning()
            if (r0 != r3) goto L2a
            r0 = r3
            goto L2b
        L2a:
            r0 = r4
        L2b:
            if (r0 != 0) goto L37
            java.lang.Runnable r0 = r5.editRunnable
            if (r0 != 0) goto L37
            boolean r0 = r5.easterEggIsAnimating
            if (r0 != 0) goto L37
            r0 = r3
            goto L38
        L37:
            r0 = r4
        L38:
            if (r0 != 0) goto L3b
            return r4
        L3b:
            android.view.View r6 = r6.itemView
            boolean r0 = r6 instanceof com.discord.chat.presentation.list.SwipeReplyInitiator
            if (r0 == 0) goto L44
            r2 = r6
            com.discord.chat.presentation.list.SwipeReplyInitiator r2 = (com.discord.chat.presentation.list.SwipeReplyInitiator) r2
        L44:
            if (r2 == 0) goto L4d
            boolean r6 = r2.getEnableSwipeToEdit()
            if (r6 != r3) goto L4d
            goto L4e
        L4d:
            r3 = r4
        L4e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.list.SwipeHelper.shouldStartEditEntrance(androidx.recyclerview.widget.RecyclerView$ViewHolder):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void triggerDelayedEditEntranceTransition(final RecyclerView recyclerView) {
        Runnable runnable = new Runnable() { // from class: com.discord.chat.presentation.list.g
            @Override // java.lang.Runnable
            public final void run() {
                SwipeHelper.triggerDelayedEditEntranceTransition$lambda$5(SwipeHelper.this, recyclerView);
            }
        };
        this.editRunnable = runnable;
        Handler handler = this.handler;
        C9612q.m13920e(runnable);
        handler.postDelayed(runnable, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void triggerDelayedEditEntranceTransition$lambda$5(final SwipeHelper this$0, final RecyclerView recyclerView) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(recyclerView, "$recyclerView");
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(ANIM_VALUE_EDIT_CIRCLE_SCALE, this$0.editCircleScale, 1.4f, 1.0f);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(ofFloat);
        valueAnimator.setDuration(ANIM_RETURN_DURATION);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.list.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SwipeHelper.triggerDelayedEditEntranceTransition$lambda$5$lambda$4$lambda$3(SwipeHelper.this, recyclerView, valueAnimator2);
            }
        });
        this$0.editCircleScaleAnimator = valueAnimator;
        valueAnimator.start();
        this$0.actionType = SwipeActionType.Edit;
        View view = this$0.mView;
        if (view == null) {
            C9612q.m13900y("mView");
            view = null;
        }
        view.performHapticFeedback(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void triggerDelayedEditEntranceTransition$lambda$5$lambda$4$lambda$3(SwipeHelper this$0, RecyclerView recyclerView, ValueAnimator it) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(recyclerView, "$recyclerView");
        C9612q.m13917h(it, "it");
        Object animatedValue = it.getAnimatedValue(ANIM_VALUE_EDIT_CIRCLE_SCALE);
        C9612q.m13919f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.editCircleScale = ((Float) animatedValue).floatValue();
        recyclerView.invalidate();
    }

    private final void triggerEditExitTransition(final RecyclerView recyclerView) {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(ANIM_VALUE_EDIT_CIRCLE_SCALE, this.editCircleScale, 0.0f);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(ofFloat);
        valueAnimator.setDuration(200L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.list.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SwipeHelper.triggerEditExitTransition$lambda$2$lambda$0(SwipeHelper.this, recyclerView, valueAnimator2);
            }
        });
        valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.discord.chat.presentation.list.SwipeHelper$triggerEditExitTransition$lambda$2$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                C9612q.m13917h(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C9612q.m13917h(animator, "animator");
                SwipeHelper.this.actionType = SwipeActionType.Reply;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                C9612q.m13917h(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C9612q.m13917h(animator, "animator");
            }
        });
        this.editCircleScaleAnimator = valueAnimator;
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void triggerEditExitTransition$lambda$2$lambda$0(SwipeHelper this$0, RecyclerView recyclerView, ValueAnimator it) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(recyclerView, "$recyclerView");
        C9612q.m13917h(it, "it");
        Object animatedValue = it.getAnimatedValue(ANIM_VALUE_EDIT_CIRCLE_SCALE);
        C9612q.m13919f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.editCircleScale = ((Float) animatedValue).floatValue();
        recyclerView.invalidate();
    }

    private final void updateEditTransition(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        if (this.isCompleted) {
            return;
        }
        if (this.actionType == SwipeActionType.Edit) {
            View view = this.mView;
            if (view == null) {
                C9612q.m13900y("mView");
                view = null;
            }
            if (view.getTranslationX() > REPLY_RESET_X) {
                ValueAnimator valueAnimator = this.editCircleScaleAnimator;
                boolean z = false;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    z = true;
                }
                if (!z) {
                    triggerEditExitTransition(recyclerView);
                    return;
                }
            }
        }
        View view2 = this.mView;
        if (view2 == null) {
            C9612q.m13900y("mView");
            view2 = null;
        }
        if (view2.getTranslationX() > EDIT_OFFSET_X && this.editRunnable != null) {
            this.handler.removeCallbacksAndMessages(null);
            this.editRunnable = null;
        } else if (shouldStartEditEntrance(viewHolder)) {
            triggerDelayedEditEntranceTransition(recyclerView);
        }
    }

    private final void updateHapticFeedbackTrigger(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        View view = null;
        if (this.shouldPerformHapticFeedback) {
            View view2 = this.mView;
            if (view2 == null) {
                C9612q.m13900y("mView");
                view2 = null;
            }
            if (view2.getTranslationX() <= HAPTIC_TRIGGER_X) {
                View view3 = this.mView;
                if (view3 == null) {
                    C9612q.m13900y("mView");
                } else {
                    view = view3;
                }
                view.performHapticFeedback(0);
                this.shouldPerformHapticFeedback = false;
                int i = this.easterEggPullCount + 1;
                this.easterEggPullCount = i;
                if (i == 3 && !this.easterEggIsAnimating) {
                    easterEggStartAnimation(recyclerView, viewHolder);
                    return;
                }
                return;
            }
        }
        if (!this.shouldPerformHapticFeedback) {
            View view4 = this.mView;
            if (view4 == null) {
                C9612q.m13900y("mView");
            } else {
                view = view4;
            }
            if (view.getTranslationX() >= HAPTIC_RESET_X) {
                this.shouldPerformHapticFeedback = true;
            }
        }
    }

    private final void updateReplyTrigger() {
        View view = null;
        if (this.shouldTriggerReply) {
            View view2 = this.mView;
            if (view2 == null) {
                C9612q.m13900y("mView");
                view2 = null;
            }
            if (view2.getTranslationX() > REPLY_RESET_X) {
                this.shouldTriggerReply = false;
                return;
            }
        }
        if (!this.shouldTriggerReply) {
            View view3 = this.mView;
            if (view3 == null) {
                C9612q.m13900y("mView");
            } else {
                view = view3;
            }
            if (view.getTranslationX() <= HAPTIC_TRIGGER_X) {
                this.shouldTriggerReply = true;
            }
        }
    }

    private final void updateShadow(RecyclerView.ViewHolder viewHolder) {
        SwipeReplyInitiator swipeReplyInitiator;
        String str;
        View view = viewHolder.itemView;
        View view2 = null;
        if (view instanceof SwipeReplyInitiator) {
            swipeReplyInitiator = (SwipeReplyInitiator) view;
        } else {
            swipeReplyInitiator = null;
        }
        if (swipeReplyInitiator != null) {
            float swipeProgress = getSwipeProgress();
            float dpToPx = SizeUtilsKt.getDpToPx(12) * swipeProgress;
            View view3 = this.mView;
            if (view3 == null) {
                C9612q.m13900y("mView");
            } else {
                view2 = view3;
            }
            float leftBevelRadius = getLeftBevelRadius(swipeProgress, view2.getMeasuredHeight());
            if (ThemeManagerKt.getTheme() instanceof LightTheme) {
                str = "#1F000000";
            } else {
                str = "#3E000000";
            }
            swipeReplyInitiator.getShadowView().setParams(dpToPx, leftBevelRadius, str);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1746c
    public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
        C9612q.m13917h(recyclerView, "recyclerView");
        return ANIM_RETURN_DURATION;
    }

    @Override // com.discord.chat.presentation.list.ChatListCallback
    public Pair<Float, Float> getEffectiveDxDy(float f, float f2) {
        int i = SWIPE_STOP_OFFSET_X;
        if (f >= i) {
            return new Pair<>(Float.valueOf(f), Float.valueOf(f2));
        }
        return new Pair<>(Float.valueOf(i - (((float) Math.atan(Math.abs(f - i) / 120.0f)) * 120.0f)), Float.valueOf(f2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r2.getEnableSwipeToReply() == true) goto L8;
     */
    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1746c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView r2, androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
        /*
            r1 = this;
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.C9612q.m13917h(r2, r0)
            java.lang.String r2 = "viewHolder"
            kotlin.jvm.internal.C9612q.m13917h(r3, r2)
            android.view.View r2 = r3.itemView
            java.lang.String r0 = "viewHolder.itemView"
            kotlin.jvm.internal.C9612q.m13918g(r2, r0)
            r1.mView = r2
            android.view.View r2 = r3.itemView
            boolean r3 = r2 instanceof com.discord.chat.presentation.list.SwipeReplyInitiator
            if (r3 == 0) goto L1c
            com.discord.chat.presentation.list.SwipeReplyInitiator r2 = (com.discord.chat.presentation.list.SwipeReplyInitiator) r2
            goto L1d
        L1c:
            r2 = 0
        L1d:
            r3 = 0
            if (r2 == 0) goto L28
            boolean r2 = r2.getEnableSwipeToReply()
            r0 = 1
            if (r2 != r0) goto L28
            goto L29
        L28:
            r0 = r3
        L29:
            if (r0 == 0) goto L2d
            r2 = 4
            goto L2e
        L2d:
            r2 = r3
        L2e:
            int r2 = androidx.recyclerview.widget.ItemTouchHelper.AbstractC1746c.makeMovementFlags(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.list.SwipeHelper.getMovementFlags(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$ViewHolder):int");
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1746c
    public void onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        SwipeReplyInitiator swipeReplyInitiator;
        C9612q.m13917h(c, "c");
        C9612q.m13917h(recyclerView, "recyclerView");
        C9612q.m13917h(viewHolder, "viewHolder");
        super.onChildDraw(c, recyclerView, viewHolder, f, f2, i, z);
        this.f8366dX = f;
        this.currentItemViewHolder = viewHolder;
        drawContextArea(c);
        updateHapticFeedbackTrigger(recyclerView, viewHolder);
        updateReplyTrigger();
        updateShadow(viewHolder);
        updateEditTransition(recyclerView, viewHolder);
        if (this.swipeBack && this.isActive && f >= -1.0f) {
            this.onEnd.invoke();
            View view = viewHolder.itemView;
            if (view instanceof SwipeReplyInitiator) {
                swipeReplyInitiator = (SwipeReplyInitiator) view;
            } else {
                swipeReplyInitiator = null;
            }
            if (swipeReplyInitiator != null) {
                swipeReplyInitiator.onSwipeEnd();
            }
            this.isActive = false;
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1746c
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        C9612q.m13917h(recyclerView, "recyclerView");
        C9612q.m13917h(viewHolder, "viewHolder");
        C9612q.m13917h(target, "target");
        return false;
    }

    @Override // com.discord.chat.presentation.list.ChatListCallback
    public void onReleased(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        View view;
        SwipeReplyInitiator swipeReplyInitiator;
        C9612q.m13917h(recyclerView, "recyclerView");
        this.swipeBack = true;
        if (this.shouldTriggerReply) {
            if (viewHolder != null) {
                view = viewHolder.itemView;
            } else {
                view = null;
            }
            if (view instanceof SwipeReplyInitiator) {
                swipeReplyInitiator = (SwipeReplyInitiator) view;
            } else {
                swipeReplyInitiator = null;
            }
            if (swipeReplyInitiator != null) {
                int i = WhenMappings.$EnumSwitchMapping$0[this.actionType.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        swipeReplyInitiator.getOnInitiateEdit().invoke();
                    }
                } else {
                    swipeReplyInitiator.getOnInitiateReply().invoke();
                }
                this.isCompleted = true;
            }
        }
        this.handler.removeCallbacksAndMessages(null);
        this.editRunnable = null;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1746c
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        View view;
        super.onSelectedChanged(viewHolder, i);
        if (viewHolder == null && i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.swipeBack = z;
        if (i == 1 && !this.isActive) {
            this.onStart.invoke();
            SwipeReplyInitiator swipeReplyInitiator = null;
            if (viewHolder != null) {
                view = viewHolder.itemView;
            } else {
                view = null;
            }
            if (view instanceof SwipeReplyInitiator) {
                swipeReplyInitiator = (SwipeReplyInitiator) view;
            }
            if (swipeReplyInitiator != null) {
                swipeReplyInitiator.onSwipeStart();
                this.isCompleted = false;
                this.actionType = SwipeActionType.Reply;
                this.editCircleScale = 0.0f;
            }
            this.easterEggPullCount = 0;
            this.isActive = true;
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1746c
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        C9612q.m13917h(viewHolder, "viewHolder");
    }

    @Override // com.discord.chat.presentation.list.ChatListCallback
    public boolean shouldReturnToOriginalPosition() {
        return true;
    }

    @Override // com.discord.chat.presentation.list.ChatListCallback
    public boolean shouldUseSpringyExit() {
        return this.shouldTriggerReply;
    }
}

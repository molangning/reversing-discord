package com.discord.blur;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import androidx.core.graphics.C0995a;
import com.discord.blur.BlurViewAPI;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0014J\b\u0010\u0019\u001a\u00020\u0014H\u0014J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\u0012\u0010\u001e\u001a\u00020\u00142\b\b\u0001\u0010\u001f\u001a\u00020\bH\u0016J\u0012\u0010 \u001a\u00020\u00142\b\b\u0001\u0010\u001f\u001a\u00020\bH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m14357d2 = {"Lcom/discord/blur/BlurView;", "Leightbitlab/com/blurview/BlurView;", "Lcom/discord/blur/BlurViewAPI;", "context", "Landroid/content/Context;", "blurTargetNativeId", "", "blurTint", "", "blurTintIOSParityCompensation", "blurAmount", "", "(Landroid/content/Context;Ljava/lang/String;IIF)V", "blurEnabled", "", "blurTarget", "Ljava/lang/ref/WeakReference;", "Lcom/discord/blur/BlurViewAPI$Target;", "blurTargetChangeListener", "Lkotlin/Function0;", "", "blurViewPropertiesDirty", "maybeUpdate", "maybeUpdateBlurEnabled", "onAttachedToWindow", "onDetachedFromWindow", "setBlurAmount", "rectId", "setBlurTargetNativeId", "nativeId", "setBlurTint", ViewProps.COLOR, "setBlurTintIOSParityCompensation", "Companion", "blur_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class BlurView extends eightbitlab.com.blurview.BlurView implements BlurViewAPI {
    public static final Companion Companion = new Companion(null);
    private float blurAmount;
    private boolean blurEnabled;
    private WeakReference<BlurViewAPI.Target> blurTarget;
    private final Function0<Unit> blurTargetChangeListener;
    private String blurTargetNativeId;
    private int blurTint;
    private int blurTintIOSParityCompensation;
    private boolean blurViewPropertiesDirty;

    @Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.blur.BlurView$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static final class C28751 extends AbstractC9614s implements Function0<Unit> {
        C28751() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f25302a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BlurView.this.maybeUpdate();
        }
    }

    @Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\tJ)\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000eJ1\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0000¢\u0006\u0002\b\u0016¨\u0006\u0017"}, m14357d2 = {"Lcom/discord/blur/BlurView$Companion;", "", "()V", "mapBlurTint", "", "blurAmountTint", "blurTint", "blurAmount", "", "mapBlurTint$blur_release", "mapRadius", "radius", "maxRadius", "minRadius", "mapRadius$blur_release", "updateListener", "", "blurTargetChangeListener", "Lkotlin/Function0;", "attached", "", "maybeUpdate", "updateListener$blur_release", "blur_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ float mapRadius$blur_release$default(Companion companion, float f, float f2, float f3, int i, Object obj) {
            if ((i & 2) != 0) {
                f2 = 24.0f;
            }
            if ((i & 4) != 0) {
                f3 = 0.0f;
            }
            return companion.mapRadius$blur_release(f, f2, f3);
        }

        public final int mapBlurTint$blur_release(int i, int i2, float f) {
            return C0995a.m38181g(i2, ColorUtilsKt.argbWithAdjustedAlpha(i, f));
        }

        public final float mapRadius$blur_release(float f, float f2, float f3) {
            return Math.max(f3, Math.min(1.0f, f)) * f2;
        }

        public final void updateListener$blur_release(Function0<Unit> blurTargetChangeListener, boolean z, Function0<Unit> maybeUpdate) {
            C9612q.m13917h(blurTargetChangeListener, "blurTargetChangeListener");
            C9612q.m13917h(maybeUpdate, "maybeUpdate");
            if (z) {
                BlurViewTargetRegistry.INSTANCE.addChangeListener(blurTargetChangeListener);
            } else {
                BlurViewTargetRegistry.INSTANCE.removeChangeListener(blurTargetChangeListener);
            }
            if (z) {
                maybeUpdate.invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurView(Context context, String blurTargetNativeId, int i, int i2, float f) {
        super(context);
        C9612q.m13917h(context, "context");
        C9612q.m13917h(blurTargetNativeId, "blurTargetNativeId");
        this.blurTargetNativeId = blurTargetNativeId;
        this.blurTint = i;
        this.blurTintIOSParityCompensation = i2;
        this.blurAmount = f;
        this.blurEnabled = true;
        this.blurViewPropertiesDirty = true;
        this.blurTarget = new WeakReference<>(null);
        BlurView$blurTargetChangeListener$1 blurView$blurTargetChangeListener$1 = new BlurView$blurTargetChangeListener$1(this);
        this.blurTargetChangeListener = blurView$blurTargetChangeListener$1;
        Companion.updateListener$blur_release(blurView$blurTargetChangeListener$1, true, new C28751());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeUpdate() {
        ViewGroup viewRef;
        BlurViewAPI.Target target = BlurViewTargetRegistry.INSTANCE.get(this.blurTargetNativeId);
        if (target != null && this.blurViewPropertiesDirty) {
            if (!C9612q.m13922c(this.blurTarget.get(), target)) {
                this.blurTarget = new WeakReference<>(target);
                setupWith(target.getViewRef()).mo23168d(target.getViewRef().getBackground());
            }
            maybeUpdateBlurEnabled();
            Companion companion = Companion;
            setOverlayColor(companion.mapBlurTint$blur_release(this.blurTintIOSParityCompensation, this.blurTint, this.blurAmount));
            setBlurRadius(Companion.mapRadius$blur_release$default(companion, this.blurAmount, 0.0f, 0.0f, 6, null));
            BlurViewAPI.Target target2 = this.blurTarget.get();
            if (target2 != null && (viewRef = target2.getViewRef()) != null) {
                viewRef.invalidate();
            }
            invalidate();
            this.blurViewPropertiesDirty = false;
        }
    }

    private final void maybeUpdateBlurEnabled() {
        boolean z = this.blurEnabled;
        if (z && this.blurAmount <= 0.0f) {
            this.blurEnabled = false;
            setBlurEnabled(false);
        } else if (!z && this.blurAmount > 0.0f) {
            this.blurEnabled = true;
            setBlurEnabled(true);
        }
    }

    @Override // eightbitlab.com.blurview.BlurView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Companion.updateListener$blur_release(this.blurTargetChangeListener, true, new BlurView$onAttachedToWindow$1(this));
    }

    @Override // eightbitlab.com.blurview.BlurView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Companion.updateListener$blur_release(this.blurTargetChangeListener, false, new BlurView$onDetachedFromWindow$1(this));
    }

    @Override // com.discord.blur.BlurViewAPIBase
    public void setBlurAmount(int i, float f) {
        boolean z;
        if (this.blurAmount == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.blurAmount = f;
            this.blurViewPropertiesDirty = true;
        }
        maybeUpdate();
    }

    @Override // com.discord.blur.BlurViewAPIBase
    public void setBlurTargetNativeId(String nativeId) {
        C9612q.m13917h(nativeId, "nativeId");
        if (!C9612q.m13922c(this.blurTargetNativeId, nativeId)) {
            this.blurTargetNativeId = nativeId;
            this.blurViewPropertiesDirty = true;
        }
        maybeUpdate();
    }

    @Override // com.discord.blur.BlurViewAPI
    public void setBlurTint(int i) {
        if (this.blurTint != i) {
            this.blurTint = i;
            this.blurViewPropertiesDirty = true;
        }
        maybeUpdate();
    }

    @Override // com.discord.blur.BlurViewAPI
    public void setBlurTintIOSParityCompensation(int i) {
        if (this.blurTintIOSParityCompensation != i) {
            this.blurTintIOSParityCompensation = i;
            this.blurViewPropertiesDirty = true;
        }
        maybeUpdate();
    }
}

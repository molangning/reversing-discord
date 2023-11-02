package com.discord.blur;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.FrameLayout;
import com.discord.blur.BlurViewAPI;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0016\u001a\u00020\u000fH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0014J\b\u0010\u0018\u001a\u00020\u000fH\u0014J0\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0014J\u0018\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u0012\u0010#\u001a\u00020\u000f2\b\b\u0001\u0010$\u001a\u00020\bH\u0016J\u0012\u0010%\u001a\u00020\u000f2\b\b\u0001\u0010$\u001a\u00020\bH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m14357d2 = {"Lcom/discord/blur/BlurViewHardwareAccelerated;", "Landroid/widget/FrameLayout;", "Lcom/discord/blur/BlurViewAPI;", "context", "Landroid/content/Context;", "blurTargetNativeId", "", "blurTint", "", "blurTintIOSParityCompensation", "blurAmount", "", "(Landroid/content/Context;Ljava/lang/String;IIF)V", "blurTargetChangeListener", "Lkotlin/Function0;", "", "blurViewHeight", "blurViewLocation", "", "blurViewPropertiesDirty", "", "blurViewWidth", "maybeUpdate", "onAttachedToWindow", "onDetachedFromWindow", ViewProps.ON_LAYOUT, "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "setBlurAmount", "rectId", "setBlurTargetNativeId", "nativeId", "setBlurTint", ViewProps.COLOR, "setBlurTintIOSParityCompensation", "blur_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class BlurViewHardwareAccelerated extends FrameLayout implements BlurViewAPI {
    private float blurAmount;
    private final Function0<Unit> blurTargetChangeListener;
    private String blurTargetNativeId;
    private int blurTint;
    private int blurTintIOSParityCompensation;
    private int blurViewHeight;
    private int[] blurViewLocation;
    private boolean blurViewPropertiesDirty;
    private int blurViewWidth;

    @Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.blur.BlurViewHardwareAccelerated$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static final class C28761 extends AbstractC9614s implements Function0<Unit> {
        C28761() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f25302a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BlurViewHardwareAccelerated.this.maybeUpdate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurViewHardwareAccelerated(Context context, String blurTargetNativeId, int i, int i2, float f) {
        super(context);
        C9612q.m13917h(context, "context");
        C9612q.m13917h(blurTargetNativeId, "blurTargetNativeId");
        this.blurTargetNativeId = blurTargetNativeId;
        this.blurTint = i;
        this.blurTintIOSParityCompensation = i2;
        this.blurAmount = f;
        this.blurViewPropertiesDirty = true;
        this.blurViewWidth = -1;
        this.blurViewHeight = -1;
        this.blurViewLocation = new int[2];
        BlurViewHardwareAccelerated$blurTargetChangeListener$1 blurViewHardwareAccelerated$blurTargetChangeListener$1 = new BlurViewHardwareAccelerated$blurTargetChangeListener$1(this);
        this.blurTargetChangeListener = blurViewHardwareAccelerated$blurTargetChangeListener$1;
        BlurView.Companion.updateListener$blur_release(blurViewHardwareAccelerated$blurTargetChangeListener$1, true, new C28761());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeUpdate() {
        boolean z;
        if (this.blurViewWidth != -1 && this.blurViewHeight != -1) {
            z = false;
        } else {
            z = true;
        }
        BlurViewAPI.Target target = BlurViewTargetRegistry.INSTANCE.get(this.blurTargetNativeId);
        if (target != null && !z && this.blurViewPropertiesDirty) {
            target.setBlurAmount(getId(), this.blurAmount);
            int id2 = getId();
            int[] iArr = this.blurViewLocation;
            target.addBlurRect(id2, iArr[0], iArr[1], this.blurViewWidth, this.blurViewHeight);
            setBackgroundColor(BlurView.Companion.mapBlurTint$blur_release(this.blurTintIOSParityCompensation, this.blurTint, this.blurAmount));
            this.blurViewPropertiesDirty = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        BlurView.Companion.updateListener$blur_release(this.blurTargetChangeListener, true, new BlurViewHardwareAccelerated$onAttachedToWindow$1(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BlurView.Companion.updateListener$blur_release(this.blurTargetChangeListener, false, new BlurViewHardwareAccelerated$onDetachedFromWindow$1(this));
        BlurViewAPI.Target target = BlurViewTargetRegistry.INSTANCE.get(this.blurTargetNativeId);
        if (target != null) {
            target.removeBlurRect(getId());
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.blurViewWidth == getWidth() && this.blurViewHeight == getHeight()) {
            z2 = false;
        } else {
            z2 = true;
        }
        int[] iArr = this.blurViewLocation;
        int i5 = iArr[0];
        int i6 = iArr[1];
        getLocationInWindow(iArr);
        int[] iArr2 = this.blurViewLocation;
        if (iArr2[0] != i5 || iArr2[1] != i6 || z2) {
            this.blurViewWidth = getWidth();
            this.blurViewHeight = getHeight();
            this.blurViewPropertiesDirty = true;
        }
        maybeUpdate();
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

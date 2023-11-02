package com.discord.blur;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import com.discord.blur.BlurView;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p164j$.util.Map;

@Metadata(m14358d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001*B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J0\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0016J\u0012\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J0\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0014J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0018\u0010(\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010)\u001a\u00020\nH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m14357d2 = {"Lcom/discord/blur/BlurViewTargetHardwareAccelerated;", "Lcom/discord/blur/BlurViewTargetBase;", "context", "Landroid/content/Context;", "blurTargetNativeId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "blurAmounts", "", "", "", "blurContentRenderNode", "Landroid/graphics/RenderNode;", "blurRectRenderNodes", "blurRects", "Lcom/discord/blur/BlurViewTargetHardwareAccelerated$BlurRect;", "blurViewTargetHeight", "blurViewTargetLocation", "", "blurViewTargetWidth", "blurViewTargetWindowOffsetX", "blurViewTargetWindowOffsetY", "addBlurRect", "", "rectId", "windowX", "windowY", "width", "height", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", ViewProps.ON_LAYOUT, "changed", "", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "removeBlurRect", "setBlurAmount", "blurAmount", "BlurRect", "blur_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class BlurViewTargetHardwareAccelerated extends BlurViewTargetBase {
    private Map<Integer, Float> blurAmounts;
    private final RenderNode blurContentRenderNode;
    private final Map<Integer, RenderNode> blurRectRenderNodes;
    private final Map<Integer, BlurRect> blurRects;
    private int blurViewTargetHeight;
    private int[] blurViewTargetLocation;
    private int blurViewTargetWidth;
    private int blurViewTargetWindowOffsetX;
    private int blurViewTargetWindowOffsetY;

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m14357d2 = {"Lcom/discord/blur/BlurViewTargetHardwareAccelerated$BlurRect;", "", "windowX", "", "windowY", "width", "height", "(IIII)V", "getHeight", "()I", "getWidth", "getWindowX", "getWindowY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "blur_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static final class BlurRect {
        private final int height;
        private final int width;
        private final int windowX;
        private final int windowY;

        public BlurRect(int i, int i2, int i3, int i4) {
            this.windowX = i;
            this.windowY = i2;
            this.width = i3;
            this.height = i4;
        }

        public static /* synthetic */ BlurRect copy$default(BlurRect blurRect, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = blurRect.windowX;
            }
            if ((i5 & 2) != 0) {
                i2 = blurRect.windowY;
            }
            if ((i5 & 4) != 0) {
                i3 = blurRect.width;
            }
            if ((i5 & 8) != 0) {
                i4 = blurRect.height;
            }
            return blurRect.copy(i, i2, i3, i4);
        }

        public final int component1() {
            return this.windowX;
        }

        public final int component2() {
            return this.windowY;
        }

        public final int component3() {
            return this.width;
        }

        public final int component4() {
            return this.height;
        }

        public final BlurRect copy(int i, int i2, int i3, int i4) {
            return new BlurRect(i, i2, i3, i4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BlurRect) {
                BlurRect blurRect = (BlurRect) obj;
                return this.windowX == blurRect.windowX && this.windowY == blurRect.windowY && this.width == blurRect.width && this.height == blurRect.height;
            }
            return false;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getWindowX() {
            return this.windowX;
        }

        public final int getWindowY() {
            return this.windowY;
        }

        public int hashCode() {
            return (((((this.windowX * 31) + this.windowY) * 31) + this.width) * 31) + this.height;
        }

        public String toString() {
            int i = this.windowX;
            int i2 = this.windowY;
            int i3 = this.width;
            int i4 = this.height;
            return "BlurRect(windowX=" + i + ", windowY=" + i2 + ", width=" + i3 + ", height=" + i4 + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurViewTargetHardwareAccelerated(Context context, String blurTargetNativeId) {
        super(context, blurTargetNativeId);
        C9612q.m13917h(context, "context");
        C9612q.m13917h(blurTargetNativeId, "blurTargetNativeId");
        this.blurViewTargetWidth = -1;
        this.blurViewTargetHeight = -1;
        this.blurViewTargetWindowOffsetX = -1;
        this.blurViewTargetWindowOffsetY = -1;
        this.blurViewTargetLocation = new int[2];
        this.blurAmounts = new HashMap();
        this.blurRects = new HashMap();
        this.blurRectRenderNodes = new HashMap();
        this.blurContentRenderNode = new RenderNode("content");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        if (r3 != false) goto L16;
     */
    @Override // com.discord.blur.BlurViewAPI.Target
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addBlurRect(int r7, int r8, int r9, int r10, int r11) {
        /*
            r6 = this;
            java.util.Map<java.lang.Integer, com.discord.blur.BlurViewTargetHardwareAccelerated$BlurRect> r0 = r6.blurRects
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.Object r0 = r0.get(r1)
            com.discord.blur.BlurViewTargetHardwareAccelerated$BlurRect r0 = (com.discord.blur.BlurViewTargetHardwareAccelerated.BlurRect) r0
            r1 = 0
            if (r0 == 0) goto L38
            int r2 = r0.getWindowX()
            r3 = 1
            r4 = 0
            if (r2 != r8) goto L1f
            int r2 = r0.getWindowY()
            if (r2 != r9) goto L1f
            r2 = r3
            goto L20
        L1f:
            r2 = r4
        L20:
            int r5 = r0.getWidth()
            if (r5 != r10) goto L2e
            int r5 = r0.getHeight()
            if (r5 != r11) goto L2e
            r5 = r3
            goto L2f
        L2e:
            r5 = r4
        L2f:
            if (r2 == 0) goto L34
            if (r5 == 0) goto L34
            goto L35
        L34:
            r3 = r4
        L35:
            if (r3 == 0) goto L38
            goto L39
        L38:
            r0 = r1
        L39:
            if (r0 == 0) goto L3c
            return
        L3c:
            java.util.Map<java.lang.Integer, android.graphics.RenderNode> r0 = r6.blurRectRenderNodes
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            android.graphics.RenderNode r2 = new android.graphics.RenderNode
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "blur-"
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            p164j$.util.Map.EL.putIfAbsent(r0, r1, r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.Map<java.lang.Integer, com.discord.blur.BlurViewTargetHardwareAccelerated$BlurRect> r0 = r6.blurRects
            com.discord.blur.BlurViewTargetHardwareAccelerated$BlurRect r1 = new com.discord.blur.BlurViewTargetHardwareAccelerated$BlurRect
            r1.<init>(r8, r9, r10, r11)
            r0.put(r7, r1)
            r6.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.blur.BlurViewTargetHardwareAccelerated.addBlurRect(int, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        RecordingCanvas beginRecording;
        RenderEffect createBlurEffect;
        RecordingCanvas beginRecording2;
        boolean z;
        boolean z2;
        Map<Integer, BlurRect> map = this.blurRects;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<Integer, BlurRect>> it = map.entrySet().iterator();
        while (true) {
            boolean z3 = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Integer, BlurRect> next = it.next();
            int intValue = next.getKey().intValue();
            BlurRect value = next.getValue();
            if (value.getWidth() != 0 && value.getHeight() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (((Number) Map.EL.getOrDefault(this.blurAmounts, Integer.valueOf(intValue), Float.valueOf(-1.0f))).floatValue() > 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                z3 = true;
            }
            if (z3) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        this.blurContentRenderNode.setPosition(0, 0, this.blurViewTargetWidth, this.blurViewTargetHeight);
        beginRecording = this.blurContentRenderNode.beginRecording();
        super.dispatchDraw(beginRecording);
        this.blurContentRenderNode.endRecording();
        if (canvas != null) {
            canvas.drawRenderNode(this.blurContentRenderNode);
        }
        for (Map.Entry<Integer, RenderNode> entry : this.blurRectRenderNodes.entrySet()) {
            int intValue2 = entry.getKey().intValue();
            RenderNode value2 = entry.getValue();
            BlurRect blurRect = (BlurRect) linkedHashMap.get(Integer.valueOf(intValue2));
            if (blurRect != null) {
                float floatValue = ((Number) Map.EL.getOrDefault(this.blurAmounts, Integer.valueOf(intValue2), Float.valueOf(-1.0f))).floatValue();
                createBlurEffect = RenderEffect.createBlurEffect(Math.abs(floatValue), Math.abs(floatValue), Shader.TileMode.CLAMP);
                value2.setRenderEffect(createBlurEffect);
                value2.setPosition(0, 0, blurRect.getWidth(), blurRect.getHeight());
                value2.setTranslationX(blurRect.getWindowX() - this.blurViewTargetWindowOffsetX);
                value2.setTranslationY(blurRect.getWindowY() - this.blurViewTargetWindowOffsetY);
                beginRecording2 = value2.beginRecording();
                beginRecording2.translate(-(blurRect.getWindowX() - this.blurViewTargetWindowOffsetX), -(blurRect.getWindowY() - this.blurViewTargetWindowOffsetY));
                beginRecording2.drawRenderNode(this.blurContentRenderNode);
                value2.endRecording();
                if (canvas != null) {
                    canvas.drawRenderNode(value2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getLocationInWindow(this.blurViewTargetLocation);
        this.blurViewTargetWidth = getWidth();
        this.blurViewTargetHeight = getHeight();
        int[] iArr = this.blurViewTargetLocation;
        this.blurViewTargetWindowOffsetX = iArr[0];
        this.blurViewTargetWindowOffsetY = iArr[1];
    }

    @Override // com.discord.blur.BlurViewAPI.Target
    public void removeBlurRect(int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.blurRects.remove(Integer.valueOf(i)) != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.blurRectRenderNodes.remove(Integer.valueOf(i)) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.blurAmounts.remove(Integer.valueOf(i)) == null) {
            z3 = false;
        }
        if (z || z2 || z3) {
            invalidate();
        }
    }

    @Override // com.discord.blur.BlurViewAPIBase
    public void setBlurAmount(int i, float f) {
        float dpToPx = SizeUtilsKt.getDpToPx(BlurView.Companion.mapRadius$blur_release$default(BlurView.Companion, f, 36.0f, 0.0f, 4, null));
        if (!C9612q.m13923b(this.blurAmounts.get(Integer.valueOf(i)), dpToPx)) {
            this.blurAmounts.put(Integer.valueOf(i), Float.valueOf(dpToPx));
            invalidate();
        }
    }
}

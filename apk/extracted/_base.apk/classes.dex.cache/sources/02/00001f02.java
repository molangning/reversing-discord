package com.discord.safearea;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.safearea.extensions.WindowInsetsCompatExtensionsKt;
import com.th3rdwave.safeareacontext.C5671e;
import com.th3rdwave.safeareacontext.EdgeInsets;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B-\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001d"}, m14357d2 = {"Lcom/discord/safearea/SafeAreaEdgeInsets;", "", "edgeInsets", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "(Lcom/th3rdwave/safeareacontext/EdgeInsets;)V", "topDp", "", "rightDp", "bottomDp", "leftDp", "(FFFF)V", "getBottomDp", "()F", "getLeftDp", "getRightDp", "getTopDp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "safe_area_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class SafeAreaEdgeInsets {
    public static final Companion Companion = new Companion(null);
    private final float bottomDp;
    private final float leftDp;
    private final float rightDp;
    private final float topDp;

    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\b"}, m14357d2 = {"Lcom/discord/safearea/SafeAreaEdgeInsets$Companion;", "", "()V", "fromRootView", "Lcom/discord/safearea/SafeAreaEdgeInsets;", "activity", "Landroid/app/Activity;", "fromRootViewAsStableInsets", "safe_area_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SafeAreaEdgeInsets fromRootView(Activity activity) {
            View rootView;
            EdgeInsets m24775e;
            if (activity != null && (rootView = ActivityExtensionsKt.getRootView(activity)) != null && (m24775e = C5671e.m24775e(rootView)) != null) {
                return new SafeAreaEdgeInsets(m24775e);
            }
            return new SafeAreaEdgeInsets(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        }

        public final SafeAreaEdgeInsets fromRootViewAsStableInsets(Activity activity) {
            WindowInsetsCompat windowInsetsCompat;
            if (activity != null && (windowInsetsCompat = WindowInsetsCompatExtensionsKt.getWindowInsetsCompat(activity)) != null) {
                Insets displayCutoutInsets = WindowInsetsCompatExtensionsKt.getDisplayCutoutInsets(windowInsetsCompat, true);
                Insets systemBarInsets = WindowInsetsCompatExtensionsKt.getSystemBarInsets(windowInsetsCompat, true);
                if (Build.VERSION.SDK_INT > 29) {
                    return new SafeAreaEdgeInsets(SizeUtilsKt.getPxToDp(Math.max(displayCutoutInsets.f3341b, systemBarInsets.f3341b)), SizeUtilsKt.getPxToDp(displayCutoutInsets.f3342c), SizeUtilsKt.getPxToDp(Math.max(displayCutoutInsets.f3343d, systemBarInsets.f3343d)), SizeUtilsKt.getPxToDp(displayCutoutInsets.f3340a));
                }
                return new SafeAreaEdgeInsets(SizeUtilsKt.getPxToDp(Math.max(displayCutoutInsets.f3341b, windowInsetsCompat.m37738i())), SizeUtilsKt.getPxToDp(displayCutoutInsets.f3342c), SizeUtilsKt.getPxToDp(Math.max(displayCutoutInsets.f3343d, windowInsetsCompat.m37739h())), SizeUtilsKt.getPxToDp(displayCutoutInsets.f3340a));
            }
            return new SafeAreaEdgeInsets(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        }
    }

    public SafeAreaEdgeInsets() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public SafeAreaEdgeInsets(float f, float f2, float f3, float f4) {
        this.topDp = f;
        this.rightDp = f2;
        this.bottomDp = f3;
        this.leftDp = f4;
    }

    public static /* synthetic */ SafeAreaEdgeInsets copy$default(SafeAreaEdgeInsets safeAreaEdgeInsets, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = safeAreaEdgeInsets.topDp;
        }
        if ((i & 2) != 0) {
            f2 = safeAreaEdgeInsets.rightDp;
        }
        if ((i & 4) != 0) {
            f3 = safeAreaEdgeInsets.bottomDp;
        }
        if ((i & 8) != 0) {
            f4 = safeAreaEdgeInsets.leftDp;
        }
        return safeAreaEdgeInsets.copy(f, f2, f3, f4);
    }

    public final float component1() {
        return this.topDp;
    }

    public final float component2() {
        return this.rightDp;
    }

    public final float component3() {
        return this.bottomDp;
    }

    public final float component4() {
        return this.leftDp;
    }

    public final SafeAreaEdgeInsets copy(float f, float f2, float f3, float f4) {
        return new SafeAreaEdgeInsets(f, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SafeAreaEdgeInsets) {
            SafeAreaEdgeInsets safeAreaEdgeInsets = (SafeAreaEdgeInsets) obj;
            return Float.compare(this.topDp, safeAreaEdgeInsets.topDp) == 0 && Float.compare(this.rightDp, safeAreaEdgeInsets.rightDp) == 0 && Float.compare(this.bottomDp, safeAreaEdgeInsets.bottomDp) == 0 && Float.compare(this.leftDp, safeAreaEdgeInsets.leftDp) == 0;
        }
        return false;
    }

    public final float getBottomDp() {
        return this.bottomDp;
    }

    public final float getLeftDp() {
        return this.leftDp;
    }

    public final float getRightDp() {
        return this.rightDp;
    }

    public final float getTopDp() {
        return this.topDp;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.topDp) * 31) + Float.floatToIntBits(this.rightDp)) * 31) + Float.floatToIntBits(this.bottomDp)) * 31) + Float.floatToIntBits(this.leftDp);
    }

    public String toString() {
        float f = this.topDp;
        float f2 = this.rightDp;
        float f3 = this.bottomDp;
        float f4 = this.leftDp;
        return "SafeAreaEdgeInsets(topDp=" + f + ", rightDp=" + f2 + ", bottomDp=" + f3 + ", leftDp=" + f4 + ")";
    }

    public /* synthetic */ SafeAreaEdgeInsets(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SafeAreaEdgeInsets(EdgeInsets edgeInsets) {
        this(SizeUtilsKt.getPxToDp((int) edgeInsets.m24790d()), SizeUtilsKt.getPxToDp((int) edgeInsets.m24791c()), SizeUtilsKt.getPxToDp((int) edgeInsets.m24793a()), SizeUtilsKt.getPxToDp((int) edgeInsets.m24792b()));
        C9612q.m13917h(edgeInsets, "edgeInsets");
    }
}
package com.discord.external_pip;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.os.Build;
import android.util.Rational;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J \u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ9\u0010\u0011\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00062\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u0004\u0012\u00020\u00040\u000eø\u0001\u0000R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m14357d2 = {"Lcom/discord/external_pip/ExternalPipManager;", "", "Landroid/app/Activity;", "activity", "", "refreshPipMode", "", ViewProps.ENABLED, "setEnabled", "", "numerator", "denominator", "setPipAspectRatio", "force", "Lkotlin/Function1;", "Lpf/s;", "onResult", "enterPipMode", "Z", "Landroid/util/Rational;", ViewProps.ASPECT_RATIO, "Landroid/util/Rational;", "Landroid/app/PictureInPictureParams;", "getPipParams", "()Landroid/app/PictureInPictureParams;", "pipParams", "<init>", "()V", "Companion", "external_pip_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class ExternalPipManager {
    private static final boolean CAN_PIP;
    public static final Companion Companion = new Companion(null);
    private Rational aspectRatio = new Rational(1, 1);
    private boolean enabled;

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/external_pip/ExternalPipManager$Companion;", "", "()V", "CAN_PIP", "", "external_pip_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 26) {
            z = true;
        } else {
            z = false;
        }
        CAN_PIP = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void enterPipMode$default(ExternalPipManager externalPipManager, Activity activity, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = ExternalPipManager$enterPipMode$1.INSTANCE;
        }
        externalPipManager.enterPipMode(activity, z, function1);
    }

    private final PictureInPictureParams getPipParams() {
        PictureInPictureParams.Builder aspectRatio;
        PictureInPictureParams build;
        aspectRatio = new PictureInPictureParams.Builder().setAspectRatio(this.aspectRatio);
        build = aspectRatio.build();
        C9612q.m13918g(build, "Builder()\n            .s…tio)\n            .build()");
        return build;
    }

    private final void refreshPipMode(Activity activity) {
        boolean isInPictureInPictureMode;
        if (CAN_PIP) {
            boolean z = false;
            if (activity != null) {
                isInPictureInPictureMode = activity.isInPictureInPictureMode();
                if (isInPictureInPictureMode) {
                    z = true;
                }
            }
            if (z) {
                enterPipMode$default(this, activity, false, null, 6, null);
            }
        }
    }

    public final void enterPipMode(Activity activity, boolean z, Function1<? super C11583s<Unit>, Unit> onResult) {
        boolean z2;
        C9612q.m13917h(onResult, "onResult");
        if (!this.enabled && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 && CAN_PIP) {
            if (activity != null) {
                try {
                    activity.enterPictureInPictureMode(getPipParams());
                } catch (Exception e) {
                    C11583s.C11584a c11584a = C11583s.f30090k;
                    onResult.invoke(C11583s.m7597a(C11583s.m7596b(C11586t.m7587a(e))));
                    return;
                }
            }
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            onResult.invoke(C11583s.m7597a(C11583s.m7596b(Unit.f25302a)));
            return;
        }
        C11583s.C11584a c11584a3 = C11583s.f30090k;
        onResult.invoke(C11583s.m7597a(C11583s.m7596b(C11586t.m7587a(new Exception("Disabled or unsupported.")))));
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setPipAspectRatio(Activity activity, int i, int i2) {
        Rational rational = new Rational(i, i2);
        if (C9612q.m13922c(this.aspectRatio, rational)) {
            return;
        }
        this.aspectRatio = rational;
        refreshPipMode(activity);
    }
}

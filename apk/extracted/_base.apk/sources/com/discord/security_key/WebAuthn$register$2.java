package com.discord.security_key;

import android.app.Activity;
import android.app.PendingIntent;
import com.reactnativecommunity.webview.RNCWebViewManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m14357d2 = {"<anonymous>", "", "it", "Landroid/app/PendingIntent;", "kotlin.jvm.PlatformType", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
final class WebAuthn$register$2 extends AbstractC9614s implements Function1<PendingIntent, Unit> {
    final /* synthetic */ Activity $currentActivity;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebAuthn$register$2(Activity activity) {
        super(1);
        this.$currentActivity = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PendingIntent pendingIntent) {
        invoke2(pendingIntent);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PendingIntent pendingIntent) {
        Activity activity = this.$currentActivity;
        C9612q.m13920e(activity);
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), RNCWebViewManager.COMMAND_RELEASE, null, 0, 0, 0);
    }
}

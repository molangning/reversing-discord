package com.discord.tti_manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, m14357d2 = {"Lcom/discord/tti_manager/TTIBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "tti_manager_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class TTIBroadcastReceiver extends BroadcastReceiver {
    public static final Companion Companion = new Companion(null);
    private static final String RUN_TTI_TEST_ACTION = "com.discord.intent.action.RUN_TTI_TEST_ACTION";
    private static final String TTI_TEST_ACTION_DATA = "tti_test_action_data";

    @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m14357d2 = {"Lcom/discord/tti_manager/TTIBroadcastReceiver$Companion;", "", "()V", "RUN_TTI_TEST_ACTION", "", "TTI_TEST_ACTION_DATA", "register", "", "context", "Landroid/content/Context;", "receiver", "Lcom/discord/tti_manager/TTIBroadcastReceiver;", "unregister", "tti_manager_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void register(Context context, TTIBroadcastReceiver receiver) {
            C9612q.m13917h(context, "context");
            C9612q.m13917h(receiver, "receiver");
            context.registerReceiver(receiver, new IntentFilter(TTIBroadcastReceiver.RUN_TTI_TEST_ACTION));
        }

        public final void unregister(Context context, TTIBroadcastReceiver receiver) {
            C9612q.m13917h(context, "context");
            C9612q.m13917h(receiver, "receiver");
            try {
                context.unregisterReceiver(receiver);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getStringExtra(TTI_TEST_ACTION_DATA);
        } else {
            str = null;
        }
        if (str != null && context != null) {
            HeadlessTasks.Companion companion = HeadlessTasks.Companion;
            Bundle bundle = new Bundle();
            bundle.putString("actionData", str);
            companion.startHeadlessTask(context, "TTITestAction", (r18 & 4) != 0 ? 5000L : 30000L, (r18 & 8) != 0, (r18 & 16) != 0 ? new Bundle() : bundle, (r18 & 32) != 0 ? false : true);
        }
    }
}
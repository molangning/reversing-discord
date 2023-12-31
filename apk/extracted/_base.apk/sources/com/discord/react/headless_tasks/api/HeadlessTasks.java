package com.discord.react.headless_tasks.api;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.discord.react.headless_tasks.service.HeadlessTasksService;
import com.facebook.react.HeadlessJsTaskService;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m14357d2 = {"Lcom/discord/react/headless_tasks/api/HeadlessTasks;", "", "taskConfig", "Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;", "(Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)V", "getTaskConfig", "()Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "react_headless_tasks_api_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class HeadlessTasks {
    public static final Companion Companion = new Companion(null);
    private static final Class<?> SERVICE_CLASS;
    private static final String TASK_ALLOWED_IN_FOREGROUND_KEY = "intent.discord.headless_tasks_aif";
    private static final String TASK_KEY = "intent.discord.headless_tasks_key";
    private static final String TASK_NAME_KEY = "intent.discord.headless_tasks_name";
    private static final String TASK_PARAMS_KEY = "intent.discord.headless_tasks_params";
    private static final long TASK_TIMEOUT_DEFAULT = 5000;
    private static final String TASK_TIMEOUT_KEY = "intent.discord.headless_tasks_timeout";
    private final HeadlessJsTaskConfig taskConfig;

    @Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J>\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0019J6\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m14357d2 = {"Lcom/discord/react/headless_tasks/api/HeadlessTasks$Companion;", "", "()V", "SERVICE_CLASS", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "TASK_ALLOWED_IN_FOREGROUND_KEY", "", "TASK_KEY", "TASK_NAME_KEY", "TASK_PARAMS_KEY", "TASK_TIMEOUT_DEFAULT", "", "TASK_TIMEOUT_KEY", "fromIntent", "Lcom/discord/react/headless_tasks/api/HeadlessTasks;", "intent", "Landroid/content/Intent;", "startHeadlessTask", "", "context", "Landroid/content/Context;", "taskName", "taskTimeout", "taskAllowedInForeground", "", "taskParams", "Landroid/os/Bundle;", "taskInvokingFromBroadcastReceiver", "toIntent", "react_headless_tasks_api_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Intent toIntent(Context context, String str, long j, boolean z, Bundle bundle) {
            Intent intent = new Intent(context, HeadlessTasks.SERVICE_CLASS);
            intent.putExtra(HeadlessTasks.TASK_KEY, true);
            intent.putExtra(HeadlessTasks.TASK_NAME_KEY, str);
            intent.putExtra(HeadlessTasks.TASK_TIMEOUT_KEY, j);
            intent.putExtra(HeadlessTasks.TASK_ALLOWED_IN_FOREGROUND_KEY, z);
            intent.putExtra(HeadlessTasks.TASK_PARAMS_KEY, bundle);
            return intent;
        }

        static /* synthetic */ Intent toIntent$default(Companion companion, Context context, String str, long j, boolean z, Bundle bundle, int i, Object obj) {
            if ((i & 4) != 0) {
                j = HeadlessTasks.TASK_TIMEOUT_DEFAULT;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                z = true;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                bundle = new Bundle();
            }
            return companion.toIntent(context, str, j2, z2, bundle);
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
            if (r9.hasExtra(com.discord.react.headless_tasks.api.HeadlessTasks.TASK_KEY) == true) goto L5;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.discord.react.headless_tasks.api.HeadlessTasks fromIntent(android.content.Intent r9) {
            /*
                r8 = this;
                r0 = 0
                if (r9 == 0) goto Ld
                java.lang.String r1 = "intent.discord.headless_tasks_key"
                boolean r1 = r9.hasExtra(r1)
                r2 = 1
                if (r1 != r2) goto Ld
                goto Le
            Ld:
                r2 = r0
            Le:
                if (r2 == 0) goto L3a
                java.lang.String r1 = "intent.discord.headless_tasks_name"
                java.lang.String r3 = r9.getStringExtra(r1)
                java.lang.String r1 = "intent.discord.headless_tasks_timeout"
                r4 = 5000(0x1388, double:2.4703E-320)
                long r5 = r9.getLongExtra(r1, r4)
                java.lang.String r1 = "intent.discord.headless_tasks_params"
                android.os.Bundle r1 = r9.getBundleExtra(r1)
                com.facebook.react.bridge.WritableMap r4 = com.facebook.react.bridge.Arguments.fromBundle(r1)
                java.lang.String r1 = "intent.discord.headless_tasks_aif"
                boolean r7 = r9.getBooleanExtra(r1, r0)
                com.discord.react.headless_tasks.api.HeadlessTasks r9 = new com.discord.react.headless_tasks.api.HeadlessTasks
                com.facebook.react.jstasks.HeadlessJsTaskConfig r0 = new com.facebook.react.jstasks.HeadlessJsTaskConfig
                r2 = r0
                r2.<init>(r3, r4, r5, r7)
                r9.<init>(r0)
                goto L3b
            L3a:
                r9 = 0
            L3b:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.react.headless_tasks.api.HeadlessTasks.Companion.fromIntent(android.content.Intent):com.discord.react.headless_tasks.api.HeadlessTasks");
        }

        public final void startHeadlessTask(Context context, String taskName, long j, boolean z, Bundle taskParams, boolean z2) {
            C9612q.m13917h(context, "context");
            C9612q.m13917h(taskName, "taskName");
            C9612q.m13917h(taskParams, "taskParams");
            context.startService(toIntent(context, taskName, j, z, taskParams));
            if (z2) {
                HeadlessJsTaskService.acquireWakeLockNow(context);
            }
        }
    }

    static {
        int i = HeadlessTasksService.f9190j;
        SERVICE_CLASS = HeadlessTasksService.class;
    }

    public HeadlessTasks(HeadlessJsTaskConfig taskConfig) {
        C9612q.m13917h(taskConfig, "taskConfig");
        this.taskConfig = taskConfig;
    }

    public static /* synthetic */ HeadlessTasks copy$default(HeadlessTasks headlessTasks, HeadlessJsTaskConfig headlessJsTaskConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            headlessJsTaskConfig = headlessTasks.taskConfig;
        }
        return headlessTasks.copy(headlessJsTaskConfig);
    }

    public final HeadlessJsTaskConfig component1() {
        return this.taskConfig;
    }

    public final HeadlessTasks copy(HeadlessJsTaskConfig taskConfig) {
        C9612q.m13917h(taskConfig, "taskConfig");
        return new HeadlessTasks(taskConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HeadlessTasks) && C9612q.m13922c(this.taskConfig, ((HeadlessTasks) obj).taskConfig);
    }

    public final HeadlessJsTaskConfig getTaskConfig() {
        return this.taskConfig;
    }

    public int hashCode() {
        return this.taskConfig.hashCode();
    }

    public String toString() {
        HeadlessJsTaskConfig headlessJsTaskConfig = this.taskConfig;
        return "HeadlessTasks(taskConfig=" + headlessJsTaskConfig + ")";
    }
}

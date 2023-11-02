package io.sentry.android.core;

import android.content.Context;
import io.sentry.Integration;

/* renamed from: io.sentry.android.core.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7722e0 {
    /* renamed from: a */
    public static Integration m19903a(Context context, C7798o0 c7798o0) {
        if (c7798o0.m19703d() >= 30) {
            return new AnrV2Integration(context);
        }
        return new AnrIntegration(context);
    }
}
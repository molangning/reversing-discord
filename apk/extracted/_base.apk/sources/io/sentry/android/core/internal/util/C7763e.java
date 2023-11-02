package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import io.sentry.C8244v1;
import io.sentry.android.core.C7798o0;

/* renamed from: io.sentry.android.core.internal.util.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7763e {

    /* renamed from: a */
    private final C7798o0 f21258a;

    public C7763e() {
        this(new C7798o0(C8244v1.m18133e()));
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void m19768a(ContentProvider contentProvider) {
        int m19703d = this.f21258a.m19703d();
        if (m19703d >= 26 && m19703d <= 28) {
            String callingPackage = contentProvider.getCallingPackage();
            String packageName = contentProvider.getContext().getPackageName();
            if (callingPackage != null && callingPackage.equals(packageName)) {
                return;
            }
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    public C7763e(C7798o0 c7798o0) {
        this.f21258a = c7798o0;
    }
}

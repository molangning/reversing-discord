package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

/* renamed from: androidx.core.app.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0794e {

    /* renamed from: androidx.core.app.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C0795a extends C0794e {

        /* renamed from: a */
        private final ActivityOptions f3203a;

        C0795a(ActivityOptions activityOptions) {
            this.f3203a = activityOptions;
        }

        @Override // androidx.core.app.C0794e
        /* renamed from: b */
        public Bundle mo38631b() {
            return this.f3203a.toBundle();
        }
    }

    /* renamed from: androidx.core.app.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C0796b {
        /* renamed from: a */
        static ActivityOptions m38630a(Context context, int i, int i2) {
            return ActivityOptions.makeCustomAnimation(context, i, i2);
        }

        /* renamed from: b */
        static ActivityOptions m38629b(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4);
        }

        /* renamed from: c */
        static ActivityOptions m38628c(View view, Bitmap bitmap, int i, int i2) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2);
        }
    }

    protected C0794e() {
    }

    /* renamed from: a */
    public static C0794e m38632a(Context context, int i, int i2) {
        return new C0795a(C0796b.m38630a(context, i, i2));
    }

    /* renamed from: b */
    public Bundle mo38631b() {
        throw null;
    }
}

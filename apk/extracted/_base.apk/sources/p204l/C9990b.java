package p204l;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.core.app.C0794e;
import androidx.core.app.C0826i;
import androidx.core.content.C0946a;
import java.util.ArrayList;
import p204l.C9988a;

/* renamed from: l.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C9990b {

    /* renamed from: a */
    public final Intent f25903a;

    /* renamed from: b */
    public final Bundle f25904b;

    /* renamed from: l.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C9991a {

        /* renamed from: c */
        private ArrayList<Bundle> f25907c;

        /* renamed from: d */
        private Bundle f25908d;

        /* renamed from: e */
        private ArrayList<Bundle> f25909e;

        /* renamed from: f */
        private SparseArray<Bundle> f25910f;

        /* renamed from: g */
        private Bundle f25911g;

        /* renamed from: a */
        private final Intent f25905a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        private final C9988a.C9989a f25906b = new C9988a.C9989a();

        /* renamed from: h */
        private int f25912h = 0;

        /* renamed from: i */
        private boolean f25913i = true;

        /* renamed from: d */
        private void m12668d(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            C0826i.m38586b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f25905a.putExtras(bundle);
        }

        /* renamed from: a */
        public C9990b m12671a() {
            if (!this.f25905a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m12668d(null, null);
            }
            ArrayList<Bundle> arrayList = this.f25907c;
            if (arrayList != null) {
                this.f25905a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f25909e;
            if (arrayList2 != null) {
                this.f25905a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f25905a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f25913i);
            this.f25905a.putExtras(this.f25906b.m12676a().m12677a());
            Bundle bundle = this.f25911g;
            if (bundle != null) {
                this.f25905a.putExtras(bundle);
            }
            if (this.f25910f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f25910f);
                this.f25905a.putExtras(bundle2);
            }
            this.f25905a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f25912h);
            return new C9990b(this.f25905a, this.f25908d);
        }

        /* renamed from: b */
        public C9991a m12670b(C9988a c9988a) {
            this.f25911g = c9988a.m12677a();
            return this;
        }

        /* renamed from: c */
        public C9991a m12669c(Context context, int i, int i2) {
            this.f25905a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", C0794e.m38632a(context, i, i2).mo38631b());
            return this;
        }

        /* renamed from: e */
        public C9991a m12667e(boolean z) {
            this.f25905a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        /* renamed from: f */
        public C9991a m12666f(Context context, int i, int i2) {
            this.f25908d = C0794e.m38632a(context, i, i2).mo38631b();
            return this;
        }
    }

    C9990b(Intent intent, Bundle bundle) {
        this.f25903a = intent;
        this.f25904b = bundle;
    }

    /* renamed from: a */
    public void m12672a(Context context, Uri uri) {
        this.f25903a.setData(uri);
        C0946a.m38393k(context, this.f25903a, this.f25904b);
    }
}

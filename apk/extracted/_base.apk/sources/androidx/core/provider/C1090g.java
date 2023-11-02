package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.C1024e;
import androidx.core.util.C1138f;

/* renamed from: androidx.core.provider.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1090g {

    /* renamed from: androidx.core.provider.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1091a {

        /* renamed from: a */
        private final int f3442a;

        /* renamed from: b */
        private final C1092b[] f3443b;

        @Deprecated
        public C1091a(int i, C1092b[] c1092bArr) {
            this.f3442a = i;
            this.f3443b = c1092bArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static C1091a m37919a(int i, C1092b[] c1092bArr) {
            return new C1091a(i, c1092bArr);
        }

        /* renamed from: b */
        public C1092b[] m37918b() {
            return this.f3443b;
        }

        /* renamed from: c */
        public int m37917c() {
            return this.f3442a;
        }
    }

    /* renamed from: androidx.core.provider.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1092b {

        /* renamed from: a */
        private final Uri f3444a;

        /* renamed from: b */
        private final int f3445b;

        /* renamed from: c */
        private final int f3446c;

        /* renamed from: d */
        private final boolean f3447d;

        /* renamed from: e */
        private final int f3448e;

        @Deprecated
        public C1092b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f3444a = (Uri) C1138f.m37824f(uri);
            this.f3445b = i;
            this.f3446c = i2;
            this.f3447d = z;
            this.f3448e = i3;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static C1092b m37916a(Uri uri, int i, int i2, boolean z, int i3) {
            return new C1092b(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int m37915b() {
            return this.f3448e;
        }

        /* renamed from: c */
        public int m37914c() {
            return this.f3445b;
        }

        /* renamed from: d */
        public Uri m37913d() {
            return this.f3444a;
        }

        /* renamed from: e */
        public int m37912e() {
            return this.f3446c;
        }

        /* renamed from: f */
        public boolean m37911f() {
            return this.f3447d;
        }
    }

    /* renamed from: androidx.core.provider.g$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1093c {
        /* renamed from: a */
        public void mo37910a(int i) {
            throw null;
        }

        /* renamed from: b */
        public void mo37909b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m37922a(Context context, CancellationSignal cancellationSignal, C1092b[] c1092bArr) {
        return C1024e.m38054b(context, cancellationSignal, c1092bArr, 0);
    }

    /* renamed from: b */
    public static C1091a m37921b(Context context, CancellationSignal cancellationSignal, C1083e c1083e) {
        return C1081d.m37944e(context, c1083e, cancellationSignal);
    }

    /* renamed from: c */
    public static Typeface m37920c(Context context, C1083e c1083e, int i, boolean z, int i2, Handler handler, C1093c c1093c) {
        C1076a c1076a = new C1076a(c1093c, handler);
        if (z) {
            return C1084f.m37928e(context, c1083e, c1076a, i, i2);
        }
        return C1084f.m37929d(context, c1083e, i, null, c1076a);
    }
}

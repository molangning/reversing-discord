package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.C0769b;
import androidx.core.app.SharedElementCallback;
import androidx.core.content.C0946a;
import androidx.core.p018os.C1049a;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.core.app.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0769b extends C0946a {

    /* renamed from: androidx.core.app.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0770a {
        /* renamed from: a */
        static void m38664a(Activity activity) {
            activity.finishAffinity();
        }

        /* renamed from: b */
        static void m38663b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        /* renamed from: c */
        static void m38662c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* renamed from: androidx.core.app.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0771b {
        /* renamed from: a */
        static void m38661a(Activity activity) {
            activity.finishAfterTransition();
        }

        /* renamed from: b */
        static void m38660b(Activity activity) {
            activity.postponeEnterTransition();
        }

        /* renamed from: c */
        static void m38659c(Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: d */
        static void m38658d(Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: e */
        static void m38657e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.core.app.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0772c {
        /* renamed from: a */
        public static void m38656a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* renamed from: b */
        static void m38655b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        /* renamed from: c */
        static boolean m38654c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0773d {
        /* renamed from: a */
        static boolean m38653a(Activity activity) {
            boolean isLaunchedFromBubble;
            isLaunchedFromBubble = activity.isLaunchedFromBubble();
            return isLaunchedFromBubble;
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: b */
        static boolean m38652b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* renamed from: androidx.core.app.b$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0774e {
        /* renamed from: a */
        static boolean m38651a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.b$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0775f {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: androidx.core.app.b$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class SharedElementCallbackC0776g extends android.app.SharedElementCallback {

        /* renamed from: a */
        private final SharedElementCallback f3201a;

        SharedElementCallbackC0776g(SharedElementCallback sharedElementCallback) {
            this.f3201a = sharedElementCallback;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f3201a.m38695b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f3201a.m38694c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f3201a.m38693d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f3201a.m38692e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f3201a.m38691f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f3201a.m38690g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f3201a.m38689h(list, list2, new SharedElementCallback.InterfaceC0761a() { // from class: androidx.core.app.d
                @Override // androidx.core.app.SharedElementCallback.InterfaceC0761a
                public final void onSharedElementsReady() {
                    C0769b.C0772c.m38656a(onSharedElementsReadyListener);
                }
            });
        }
    }

    /* renamed from: m */
    public static void m38676m(Activity activity) {
        C0770a.m38664a(activity);
    }

    /* renamed from: n */
    public static void m38675n(Activity activity) {
        C0771b.m38661a(activity);
    }

    /* renamed from: o */
    public static /* synthetic */ void m38674o(Activity activity) {
        if (!activity.isFinishing() && !C0802f.m38614i(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: p */
    public static void m38673p(Activity activity) {
        C0771b.m38660b(activity);
    }

    /* renamed from: q */
    public static void m38672q(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    C0769b.m38674o(activity);
                }
            });
        }
    }

    /* renamed from: r */
    public static void m38671r(Activity activity, String[] strArr, int i) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                if (!C1049a.m37988c() && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i2));
                }
            } else {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (activity instanceof InterfaceC0775f) {
            ((InterfaceC0775f) activity).validateRequestPermissionsRequestCode(i);
        }
        C0772c.m38655b(activity, strArr, i);
    }

    /* renamed from: s */
    public static void m38670s(Activity activity, SharedElementCallback sharedElementCallback) {
        SharedElementCallbackC0776g sharedElementCallbackC0776g;
        if (sharedElementCallback != null) {
            sharedElementCallbackC0776g = new SharedElementCallbackC0776g(sharedElementCallback);
        } else {
            sharedElementCallbackC0776g = null;
        }
        C0771b.m38659c(activity, sharedElementCallbackC0776g);
    }

    /* renamed from: t */
    public static void m38669t(Activity activity, SharedElementCallback sharedElementCallback) {
        SharedElementCallbackC0776g sharedElementCallbackC0776g;
        if (sharedElementCallback != null) {
            sharedElementCallbackC0776g = new SharedElementCallbackC0776g(sharedElementCallback);
        } else {
            sharedElementCallbackC0776g = null;
        }
        C0771b.m38658d(activity, sharedElementCallbackC0776g);
    }

    /* renamed from: u */
    public static boolean m38668u(Activity activity, String str) {
        if (!C1049a.m37988c() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 32) {
            return C0774e.m38651a(activity, str);
        }
        if (i == 31) {
            return C0773d.m38652b(activity, str);
        }
        return C0772c.m38654c(activity, str);
    }

    /* renamed from: v */
    public static void m38667v(Activity activity, Intent intent, int i, Bundle bundle) {
        C0770a.m38663b(activity, intent, i, bundle);
    }

    /* renamed from: w */
    public static void m38666w(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        C0770a.m38662c(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: x */
    public static void m38665x(Activity activity) {
        C0771b.m38657e(activity);
    }
}
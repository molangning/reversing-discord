package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.android.core.C7798o0;
import io.sentry.util.thread.InterfaceC8236b;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.android.core.internal.util.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7773n {
    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private static boolean m19750b(Activity activity, C7798o0 c7798o0) {
        if (c7798o0.m19703d() >= 17) {
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                return true;
            }
            return false;
        }
        return !activity.isFinishing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m19749c(View view, Canvas canvas, CountDownLatch countDownLatch, InterfaceC8040o0 interfaceC8040o0) {
        try {
            view.draw(canvas);
            countDownLatch.countDown();
        } catch (Throwable th2) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Taking screenshot failed (view.draw).", th2);
        }
    }

    /* renamed from: d */
    public static byte[] m19748d(Activity activity, InterfaceC8040o0 interfaceC8040o0, C7798o0 c7798o0) {
        return m19747e(activity, C7759b.m19778d(), interfaceC8040o0, c7798o0);
    }

    /* renamed from: e */
    public static byte[] m19747e(Activity activity, InterfaceC8236b interfaceC8236b, final InterfaceC8040o0 interfaceC8040o0, C7798o0 c7798o0) {
        if (m19750b(activity, c7798o0) && activity.getWindow() != null && activity.getWindow().getDecorView() != null && activity.getWindow().getDecorView().getRootView() != null) {
            final View rootView = activity.getWindow().getDecorView().getRootView();
            if (rootView.getWidth() > 0 && rootView.getHeight() > 0) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
                    final Canvas canvas = new Canvas(createBitmap);
                    if (interfaceC8236b.mo18150a()) {
                        rootView.draw(canvas);
                    } else {
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.internal.util.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                C7773n.m19749c(rootView, canvas, countDownLatch, interfaceC8040o0);
                            }
                        });
                        if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                            byteArrayOutputStream.close();
                            return null;
                        }
                    }
                    createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    if (byteArrayOutputStream.size() <= 0) {
                        interfaceC8040o0.mo18135c(EnumC8021m4.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                        byteArrayOutputStream.close();
                        return null;
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th2) {
                    interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Taking screenshot failed.", th2);
                    return null;
                }
            }
            interfaceC8040o0.mo18135c(EnumC8021m4.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
            return null;
        }
        interfaceC8040o0.mo18135c(EnumC8021m4.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
        return null;
    }
}

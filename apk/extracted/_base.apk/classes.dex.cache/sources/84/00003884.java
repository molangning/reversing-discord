package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.android.core.C7798o0;
import java.util.concurrent.atomic.AtomicReference;

@SuppressLint({"ObsoleteSdkInt"})
/* renamed from: io.sentry.android.core.internal.util.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ViewTreeObserver$OnDrawListenerC7768j implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a */
    private final Handler f21266a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final AtomicReference<View> f21267b;

    /* renamed from: c */
    private final Runnable f21268c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.android.core.internal.util.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class View$OnAttachStateChangeListenerC7769a implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC7769a() {
            ViewTreeObserver$OnDrawListenerC7768j.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(ViewTreeObserver$OnDrawListenerC7768j.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private ViewTreeObserver$OnDrawListenerC7768j(View view, Runnable runnable) {
        this.f21267b = new AtomicReference<>(view);
        this.f21268c = runnable;
    }

    /* renamed from: b */
    private static boolean m19761b(View view, C7798o0 c7798o0) {
        return view.getViewTreeObserver().isAlive() && m19760c(view, c7798o0);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    private static boolean m19760c(View view, C7798o0 c7798o0) {
        if (c7798o0.m19703d() >= 19) {
            return view.isAttachedToWindow();
        }
        if (view.getWindowToken() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public /* synthetic */ void m19759d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    /* renamed from: e */
    public static void m19758e(View view, Runnable runnable, C7798o0 c7798o0) {
        ViewTreeObserver$OnDrawListenerC7768j viewTreeObserver$OnDrawListenerC7768j = new ViewTreeObserver$OnDrawListenerC7768j(view, runnable);
        if (c7798o0.m19703d() < 26 && !m19761b(view, c7798o0)) {
            view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC7769a());
        } else {
            view.getViewTreeObserver().addOnDrawListener(viewTreeObserver$OnDrawListenerC7768j);
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View andSet = this.f21267b.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewTreeObserver$OnDrawListenerC7768j.this.m19759d(andSet);
            }
        });
        this.f21266a.postAtFrontOfQueue(this.f21268c);
    }
}
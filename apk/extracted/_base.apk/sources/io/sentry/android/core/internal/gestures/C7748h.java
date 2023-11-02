package io.sentry.android.core.internal.gestures;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.C8132r4;
import io.sentry.EnumC7975i5;

/* renamed from: io.sentry.android.core.internal.gestures.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7748h extends Window$CallbackC7753k {

    /* renamed from: k */
    private final Window.Callback f21227k;

    /* renamed from: l */
    private final GestureDetector$OnGestureListenerC7745g f21228l;

    /* renamed from: m */
    private final GestureDetectorCompat f21229m;

    /* renamed from: n */
    private final C8132r4 f21230n;

    /* renamed from: o */
    private final InterfaceC7750b f21231o;

    /* renamed from: io.sentry.android.core.internal.gestures.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C7749a implements InterfaceC7750b {
        C7749a() {
        }

        @Override // io.sentry.android.core.internal.gestures.C7748h.InterfaceC7750b
        /* renamed from: a */
        public /* synthetic */ MotionEvent mo19796a(MotionEvent motionEvent) {
            return C7751i.m19795a(this, motionEvent);
        }
    }

    /* renamed from: io.sentry.android.core.internal.gestures.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    interface InterfaceC7750b {
        /* renamed from: a */
        MotionEvent mo19796a(MotionEvent motionEvent);
    }

    public C7748h(Window.Callback callback, Context context, GestureDetector$OnGestureListenerC7745g gestureDetector$OnGestureListenerC7745g, C8132r4 c8132r4) {
        this(callback, new GestureDetectorCompat(context, gestureDetector$OnGestureListenerC7745g), gestureDetector$OnGestureListenerC7745g, c8132r4, new C7749a());
    }

    /* renamed from: b */
    private void m19798b(MotionEvent motionEvent) {
        this.f21229m.m37789a(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.f21228l.m19813n(motionEvent);
        }
    }

    /* renamed from: a */
    public Window.Callback m19799a() {
        return this.f21227k;
    }

    /* renamed from: c */
    public void m19797c() {
        this.f21228l.m19811p(EnumC7975i5.CANCELLED);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            try {
                m19798b(this.f21231o.mo19796a(motionEvent));
            } finally {
                try {
                } finally {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onContentChanged() {
        super.onContentChanged();
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onCreatePanelMenu(int i, Menu menu) {
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ View onCreatePanelView(int i) {
        return super.onCreatePanelView(i);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return super.onMenuItemSelected(i, menuItem);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onPreparePanel(int i, View view, Menu menu) {
        return super.onPreparePanel(i, view, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onSearchRequested() {
        return super.onSearchRequested();
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return super.onWindowStartingActionMode(callback);
    }

    C7748h(Window.Callback callback, GestureDetectorCompat gestureDetectorCompat, GestureDetector$OnGestureListenerC7745g gestureDetector$OnGestureListenerC7745g, C8132r4 c8132r4, InterfaceC7750b interfaceC7750b) {
        super(callback);
        this.f21227k = callback;
        this.f21228l = gestureDetector$OnGestureListenerC7745g;
        this.f21230n = c8132r4;
        this.f21229m = gestureDetectorCompat;
        this.f21231o = interfaceC7750b;
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ boolean onSearchRequested(SearchEvent searchEvent) {
        return super.onSearchRequested(searchEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.Window$CallbackC7753k, android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return super.onWindowStartingActionMode(callback, i);
    }
}

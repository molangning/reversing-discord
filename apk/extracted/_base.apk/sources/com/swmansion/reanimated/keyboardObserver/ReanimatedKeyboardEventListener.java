package com.swmansion.reanimated.keyboardObserver;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.C1326r2;
import androidx.core.view.C1340t2;
import androidx.core.view.C1365w0;
import androidx.core.view.InterfaceC1324r0;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.PixelUtil;
import com.swmansion.reanimated.nativeProxy.KeyboardEventDataUpdater;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import p052d.C5711f;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReanimatedKeyboardEventListener {
    private final WeakReference<ReactApplicationContext> reactContext;
    private KeyboardState state;
    private int nextListenerId = 0;
    private final HashMap<Integer, KeyboardEventDataUpdater> listeners = new HashMap<>();
    private boolean isStatusBarTranslucent = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum KeyboardState {
        UNKNOWN(0),
        OPENING(1),
        OPEN(2),
        CLOSING(3),
        CLOSED(4);
        
        private final int value;

        KeyboardState(int i) {
            this.value = i;
        }

        public int asInt() {
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class WindowInsetsCallback extends C1340t2.AbstractC1342b {
        private int keyboardHeight;

        public WindowInsetsCallback() {
            super(1);
            this.keyboardHeight = 0;
        }

        @Override // androidx.core.view.C1340t2.AbstractC1342b
        public void onEnd(C1340t2 c1340t2) {
            KeyboardState keyboardState;
            ReanimatedKeyboardEventListener reanimatedKeyboardEventListener = ReanimatedKeyboardEventListener.this;
            if (this.keyboardHeight == 0) {
                keyboardState = KeyboardState.CLOSED;
            } else {
                keyboardState = KeyboardState.OPEN;
            }
            reanimatedKeyboardEventListener.state = keyboardState;
            ReanimatedKeyboardEventListener.this.updateKeyboard(this.keyboardHeight);
        }

        @Override // androidx.core.view.C1340t2.AbstractC1342b
        public WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<C1340t2> list) {
            int dIPFromPixel = (int) PixelUtil.toDIPFromPixel(Math.max(0, windowInsetsCompat.m37741f(WindowInsetsCompat.C1163m.m37680b()).f3343d - windowInsetsCompat.m37741f(WindowInsetsCompat.C1163m.m37675g()).f3343d));
            this.keyboardHeight = dIPFromPixel;
            ReanimatedKeyboardEventListener.this.updateKeyboard(dIPFromPixel);
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.C1340t2.AbstractC1342b
        public C1340t2.C1341a onStart(C1340t2 c1340t2, C1340t2.C1341a c1341a) {
            KeyboardState keyboardState;
            ReanimatedKeyboardEventListener reanimatedKeyboardEventListener = ReanimatedKeyboardEventListener.this;
            if (this.keyboardHeight == 0) {
                keyboardState = KeyboardState.OPENING;
            } else {
                keyboardState = KeyboardState.CLOSING;
            }
            reanimatedKeyboardEventListener.state = keyboardState;
            ReanimatedKeyboardEventListener.this.updateKeyboard(this.keyboardHeight);
            return super.onStart(c1340t2, c1341a);
        }
    }

    public ReanimatedKeyboardEventListener(WeakReference<ReactApplicationContext> weakReference) {
        this.reactContext = weakReference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bringBackWindowInsets() {
        C1326r2.m37340b(this.reactContext.get().getCurrentActivity().getWindow(), !this.isStatusBarTranslucent);
        C1365w0.m37253D0(getRootView(), null);
        C1365w0.m37235M0(getRootView(), null);
        View findViewById = getRootView().getRootView().findViewById(C5711f.f16162d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        findViewById.setLayoutParams(layoutParams);
    }

    private View getRootView() {
        return this.reactContext.get().getCurrentActivity().getWindow().getDecorView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WindowInsetsCompat lambda$setupWindowInsets$0(View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        int i = windowInsetsCompat.m37741f(WindowInsetsCompat.C1163m.m37675g()).f3341b;
        View findViewById = view.getRootView().findViewById(C5711f.f16162d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.isStatusBarTranslucent) {
            layoutParams.setMargins(0, 0, 0, 0);
        } else {
            layoutParams.setMargins(0, i, 0, 0);
        }
        findViewById.setLayoutParams(layoutParams);
        return windowInsetsCompat;
    }

    private void removeCallbacks() {
        View rootView = getRootView();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.swmansion.reanimated.keyboardObserver.a
            @Override // java.lang.Runnable
            public final void run() {
                ReanimatedKeyboardEventListener.this.bringBackWindowInsets();
            }
        });
        C1365w0.m37235M0(rootView, null);
    }

    private void setUpCallbacks() {
        View rootView = getRootView();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.swmansion.reanimated.keyboardObserver.c
            @Override // java.lang.Runnable
            public final void run() {
                ReanimatedKeyboardEventListener.this.setupWindowInsets();
            }
        });
        C1365w0.m37235M0(rootView, new WindowInsetsCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupWindowInsets() {
        final View rootView = getRootView();
        C1326r2.m37340b(this.reactContext.get().getCurrentActivity().getWindow(), false);
        C1365w0.m37253D0(rootView, new InterfaceC1324r0() { // from class: com.swmansion.reanimated.keyboardObserver.b
            @Override // androidx.core.view.InterfaceC1324r0
            /* renamed from: a */
            public final WindowInsetsCompat mo24794a(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat lambda$setupWindowInsets$0;
                lambda$setupWindowInsets$0 = ReanimatedKeyboardEventListener.this.lambda$setupWindowInsets$0(rootView, view, windowInsetsCompat);
                return lambda$setupWindowInsets$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateKeyboard(int i) {
        for (KeyboardEventDataUpdater keyboardEventDataUpdater : this.listeners.values()) {
            keyboardEventDataUpdater.keyboardEventDataUpdater(this.state.asInt(), i);
        }
    }

    public int subscribeForKeyboardEvents(KeyboardEventDataUpdater keyboardEventDataUpdater, boolean z) {
        int i = this.nextListenerId;
        this.nextListenerId = i + 1;
        if (this.listeners.isEmpty()) {
            this.isStatusBarTranslucent = z;
            setUpCallbacks();
        }
        this.listeners.put(Integer.valueOf(i), keyboardEventDataUpdater);
        return i;
    }

    public void unsubscribeFromKeyboardEvents(int i) {
        this.listeners.remove(Integer.valueOf(i));
        if (this.listeners.isEmpty()) {
            removeCallbacks();
        }
    }
}

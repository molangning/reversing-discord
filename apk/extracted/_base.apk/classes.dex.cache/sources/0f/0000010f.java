package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.InterfaceC1695l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class ImmLeaksCleaner implements InterfaceC1695l {

    /* renamed from: k */
    private static int f757k;

    /* renamed from: l */
    private static Field f758l;

    /* renamed from: m */
    private static Field f759m;

    /* renamed from: n */
    private static Field f760n;

    /* renamed from: j */
    private Activity f761j;

    public ImmLeaksCleaner(Activity activity) {
        this.f761j = activity;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: b */
    private static void m40836b() {
        try {
            f757k = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f759m = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f760n = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f758l = declaredField3;
            declaredField3.setAccessible(true);
            f757k = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.InterfaceC1695l
    /* renamed from: a */
    public void mo11423a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
        if (enumC1651b != Lifecycle.EnumC1651b.ON_DESTROY) {
            return;
        }
        if (f757k == 0) {
            m40836b();
        }
        if (f757k == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f761j.getSystemService("input_method");
            try {
                Object obj = f758l.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f759m.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f760n.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
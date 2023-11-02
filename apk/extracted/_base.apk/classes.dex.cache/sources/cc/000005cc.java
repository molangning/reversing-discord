package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1352u {

    /* renamed from: a */
    private static boolean f3690a = false;

    /* renamed from: b */
    private static Method f3691b = null;

    /* renamed from: c */
    private static boolean f3692c = false;

    /* renamed from: d */
    private static Field f3693d;

    /* renamed from: androidx.core.view.u$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1353a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m37286a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f3690a) {
            try {
                f3691b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f3690a = true;
        }
        Method method = f3691b;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, keyEvent);
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m37285b(Activity activity, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m37286a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C1365w0.m37204h(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(activity, dispatcherState, activity);
    }

    /* renamed from: c */
    private static boolean m37284c(Dialog dialog, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        DialogInterface.OnKeyListener m37281f = m37281f(dialog);
        if (m37281f != null && m37281f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C1365w0.m37204h(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(dialog, dispatcherState, dialog);
    }

    /* renamed from: d */
    public static boolean m37283d(View view, KeyEvent keyEvent) {
        return C1365w0.m37202i(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public static boolean m37282e(InterfaceC1353a interfaceC1353a, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (interfaceC1353a == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC1353a.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return m37285b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m37284c((Dialog) callback, keyEvent);
        }
        if ((view == null || !C1365w0.m37204h(view, keyEvent)) && !interfaceC1353a.superDispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m37281f(Dialog dialog) {
        if (!f3692c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f3693d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3692c = true;
        }
        Field field = f3693d;
        if (field != null) {
            try {
                return (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
                return null;
            }
        }
        return null;
    }
}
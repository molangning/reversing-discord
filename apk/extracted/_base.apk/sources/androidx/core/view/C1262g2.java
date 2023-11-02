package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.g2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1262g2 {

    /* renamed from: a */
    private static Method f3645a;

    /* renamed from: androidx.core.view.g2$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1263a {
        /* renamed from: a */
        static float m37445a(ViewConfiguration viewConfiguration) {
            float scaledHorizontalScrollFactor;
            scaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
            return scaledHorizontalScrollFactor;
        }

        /* renamed from: b */
        static float m37444b(ViewConfiguration viewConfiguration) {
            float scaledVerticalScrollFactor;
            scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
            return scaledVerticalScrollFactor;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.g2$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1264b {
        /* renamed from: a */
        static int m37443a(ViewConfiguration viewConfiguration) {
            int scaledHoverSlop;
            scaledHoverSlop = viewConfiguration.getScaledHoverSlop();
            return scaledHoverSlop;
        }

        /* renamed from: b */
        static boolean m37442b(ViewConfiguration viewConfiguration) {
            boolean shouldShowMenuShortcutsWhenKeyboardPresent;
            shouldShowMenuShortcutsWhenKeyboardPresent = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            return shouldShowMenuShortcutsWhenKeyboardPresent;
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f3645a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: a */
    private static float m37450a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f3645a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static float m37449b(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1263a.m37445a(viewConfiguration);
        }
        return m37450a(viewConfiguration, context);
    }

    /* renamed from: c */
    public static int m37448c(ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1264b.m37443a(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* renamed from: d */
    public static float m37447d(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1263a.m37444b(viewConfiguration);
        }
        return m37450a(viewConfiguration, context);
    }

    /* renamed from: e */
    public static boolean m37446e(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1264b.m37442b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        if (identifier != 0 && resources.getBoolean(identifier)) {
            return true;
        }
        return false;
    }
}

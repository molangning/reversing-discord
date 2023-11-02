package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.graphics.C0995a;
import androidx.core.view.C1326r2;
import androidx.core.view.WindowInsetsControllerCompat;
import pa.C11487a;

/* renamed from: com.google.android.material.internal.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4893d {
    /* renamed from: a */
    public static void m26983a(Window window, boolean z, Integer num, Integer num2) {
        boolean z2;
        boolean z3 = false;
        if (num != null && num.intValue() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (num2 == null || num2.intValue() == 0) {
            z3 = true;
        }
        if (z2 || z3) {
            int m8018b = C11487a.m8018b(window.getContext(), 16842801, -16777216);
            if (z2) {
                num = Integer.valueOf(m8018b);
            }
            if (z3) {
                num2 = Integer.valueOf(m8018b);
            }
        }
        C1326r2.m37340b(window, !z);
        int m26981c = m26981c(window.getContext(), z);
        int m26982b = m26982b(window.getContext(), z);
        window.setStatusBarColor(m26981c);
        window.setNavigationBarColor(m26982b);
        boolean m26980d = m26980d(m26981c, C11487a.m8014f(num.intValue()));
        boolean m26980d2 = m26980d(m26982b, C11487a.m8014f(num2.intValue()));
        WindowInsetsControllerCompat m37341a = C1326r2.m37341a(window, window.getDecorView());
        if (m37341a != null) {
            m37341a.m37671c(m26980d);
            m37341a.m37672b(m26980d2);
        }
    }

    @TargetApi(21)
    /* renamed from: b */
    private static int m26982b(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return C0995a.m38177k(C11487a.m8018b(context, 16843858, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return C11487a.m8018b(context, 16843858, -16777216);
    }

    @TargetApi(21)
    /* renamed from: c */
    private static int m26981c(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return C11487a.m8018b(context, 16843857, -16777216);
    }

    /* renamed from: d */
    private static boolean m26980d(int i, boolean z) {
        return C11487a.m8014f(i) || (i == 0 && z);
    }
}
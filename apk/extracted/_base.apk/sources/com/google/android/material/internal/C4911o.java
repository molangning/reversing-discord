package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.C1365w0;
import androidx.core.view.InterfaceC1324r0;
import androidx.core.view.WindowInsetsCompat;

/* renamed from: com.google.android.material.internal.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4911o {

    /* renamed from: com.google.android.material.internal.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class RunnableC4912a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ View f13780j;

        RunnableC4912a(View view) {
            this.f13780j = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f13780j.getContext().getSystemService("input_method")).showSoftInput(this.f13780j, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.o$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4913b implements InterfaceC1324r0 {

        /* renamed from: a */
        final /* synthetic */ InterfaceC4915d f13781a;

        /* renamed from: b */
        final /* synthetic */ C4916e f13782b;

        C4913b(InterfaceC4915d interfaceC4915d, C4916e c4916e) {
            this.f13781a = interfaceC4915d;
            this.f13782b = c4916e;
        }

        @Override // androidx.core.view.InterfaceC1324r0
        /* renamed from: a */
        public WindowInsetsCompat mo24794a(View view, WindowInsetsCompat windowInsetsCompat) {
            return this.f13781a.mo26929a(view, windowInsetsCompat, new C4916e(this.f13782b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.o$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class View$OnAttachStateChangeListenerC4914c implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC4914c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C1365w0.m37191n0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.google.android.material.internal.o$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4915d {
        /* renamed from: a */
        WindowInsetsCompat mo26929a(View view, WindowInsetsCompat windowInsetsCompat, C4916e c4916e);
    }

    /* renamed from: a */
    public static void m26937a(View view, InterfaceC4915d interfaceC4915d) {
        C1365w0.m37253D0(view, new C4913b(interfaceC4915d, new C4916e(C1365w0.m37248G(view), view.getPaddingTop(), C1365w0.m37250F(view), view.getPaddingBottom())));
        m26931g(view);
    }

    /* renamed from: b */
    public static float m26936b(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static Integer m26935c(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    /* renamed from: d */
    public static float m26934d(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C1365w0.m37174w((View) parent);
        }
        return f;
    }

    /* renamed from: e */
    public static boolean m26933e(View view) {
        return C1365w0.m37258B(view) == 1;
    }

    /* renamed from: f */
    public static PorterDuff.Mode m26932f(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: g */
    public static void m26931g(View view) {
        if (C1365w0.m37225T(view)) {
            C1365w0.m37191n0(view);
        } else {
            view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC4914c());
        }
    }

    /* renamed from: h */
    public static void m26930h(View view) {
        view.requestFocus();
        view.post(new RunnableC4912a(view));
    }

    /* renamed from: com.google.android.material.internal.o$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4916e {

        /* renamed from: a */
        public int f13783a;

        /* renamed from: b */
        public int f13784b;

        /* renamed from: c */
        public int f13785c;

        /* renamed from: d */
        public int f13786d;

        public C4916e(int i, int i2, int i3, int i4) {
            this.f13783a = i;
            this.f13784b = i2;
            this.f13785c = i3;
            this.f13786d = i4;
        }

        public C4916e(C4916e c4916e) {
            this.f13783a = c4916e.f13783a;
            this.f13784b = c4916e.f13784b;
            this.f13785c = c4916e.f13785c;
            this.f13786d = c4916e.f13786d;
        }
    }
}

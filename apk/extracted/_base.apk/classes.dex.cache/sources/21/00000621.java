package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.util.C1138f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.core.widget.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1435k {

    /* renamed from: androidx.core.widget.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1436a {
        /* renamed from: a */
        static boolean m36863a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* renamed from: b */
        static int m36862b(TextView textView) {
            return textView.getMaxLines();
        }

        /* renamed from: c */
        static int m36861c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* renamed from: androidx.core.widget.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1437b {
        /* renamed from: a */
        static Drawable[] m36860a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        static int m36859b(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: c */
        static int m36858c(View view) {
            return view.getTextDirection();
        }

        /* renamed from: d */
        static Locale m36857d(TextView textView) {
            return textView.getTextLocale();
        }

        /* renamed from: e */
        static void m36856e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: f */
        static void m36855f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        static void m36854g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: h */
        static void m36853h(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: androidx.core.widget.k$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1438c {
        /* renamed from: a */
        static int m36852a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: b */
        static ColorStateList m36851b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* renamed from: c */
        static PorterDuff.Mode m36850c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* renamed from: d */
        static int m36849d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: e */
        static void m36848e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        /* renamed from: f */
        static void m36847f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: g */
        static void m36846g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: h */
        static void m36845h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* renamed from: androidx.core.widget.k$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1439d {
        /* renamed from: a */
        static DecimalFormatSymbols m36844a(Locale locale) {
            DecimalFormatSymbols decimalFormatSymbols;
            decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
            return decimalFormatSymbols;
        }
    }

    /* renamed from: androidx.core.widget.k$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1440e {
        /* renamed from: a */
        static String[] m36843a(DecimalFormatSymbols decimalFormatSymbols) {
            String[] digitStrings;
            digitStrings = decimalFormatSymbols.getDigitStrings();
            return digitStrings;
        }

        /* renamed from: b */
        static PrecomputedText.Params m36842b(TextView textView) {
            PrecomputedText.Params textMetricsParams;
            textMetricsParams = textView.getTextMetricsParams();
            return textMetricsParams;
        }

        /* renamed from: c */
        static void m36841c(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* renamed from: androidx.core.widget.k$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class ActionMode$CallbackC1441f implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f3786a;

        /* renamed from: b */
        private final TextView f3787b;

        /* renamed from: c */
        private Class<?> f3788c;

        /* renamed from: d */
        private Method f3789d;

        /* renamed from: e */
        private boolean f3790e;

        /* renamed from: f */
        private boolean f3791f = false;

        ActionMode$CallbackC1441f(ActionMode.Callback callback, TextView textView) {
            this.f3786a = callback;
            this.f3787b = textView;
        }

        /* renamed from: a */
        private Intent m36840a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        private Intent m36839b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m36840a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m36836e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        private List<ResolveInfo> m36838c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m36840a(), 0)) {
                if (m36835f(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: e */
        private boolean m36836e(TextView textView) {
            if ((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        private boolean m36835f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        private void m36834g(Menu menu) {
            Method declaredMethod;
            Context context = this.f3787b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f3791f) {
                this.f3791f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f3788c = cls;
                    this.f3789d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f3790e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f3788c = null;
                    this.f3789d = null;
                    this.f3790e = false;
                }
            }
            try {
                if (this.f3790e && this.f3788c.isInstance(menu)) {
                    declaredMethod = this.f3789d;
                } else {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> m36838c = m36838c(context, packageManager);
                for (int i = 0; i < m36838c.size(); i++) {
                    ResolveInfo resolveInfo = m36838c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m36839b(resolveInfo, this.f3787b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* renamed from: d */
        ActionMode.Callback m36837d() {
            return this.f3786a;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f3786a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f3786a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f3786a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m36834g(menu);
            return this.f3786a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static Drawable[] m36880a(TextView textView) {
        return C1437b.m36860a(textView);
    }

    /* renamed from: b */
    public static int m36879b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c */
    public static int m36878c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    private static int m36877d(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 1;
        }
        return 7;
    }

    /* renamed from: e */
    private static TextDirectionHeuristic m36876e(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(C1440e.m36843a(C1439d.m36844a(C1437b.m36857d(textView)))[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                return TextDirectionHeuristics.LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        if (C1437b.m36859b(textView) == 1) {
            z = true;
        }
        switch (C1437b.m36858c(textView)) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                if (z) {
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    /* renamed from: f */
    public static PrecomputedTextCompat.Params m36875f(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new PrecomputedTextCompat.Params(C1440e.m36842b(textView));
        }
        PrecomputedTextCompat.Params.C1099a c1099a = new PrecomputedTextCompat.Params.C1099a(new TextPaint(textView.getPaint()));
        c1099a.m37897b(C1438c.m36852a(textView));
        c1099a.m37896c(C1438c.m36849d(textView));
        c1099a.m37895d(m36876e(textView));
        return c1099a.m37898a();
    }

    /* renamed from: g */
    public static void m36874g(TextView textView, ColorStateList colorStateList) {
        C1138f.m37824f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C1438c.m36847f(textView, colorStateList);
        } else if (textView instanceof InterfaceC1446p) {
            ((InterfaceC1446p) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* renamed from: h */
    public static void m36873h(TextView textView, PorterDuff.Mode mode) {
        C1138f.m37824f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C1438c.m36846g(textView, mode);
        } else if (textView instanceof InterfaceC1446p) {
            ((InterfaceC1446p) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: i */
    public static void m36872i(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        C1437b.m36856e(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: j */
    public static void m36871j(TextView textView, int i) {
        int i2;
        C1138f.m37827c(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C1440e.m36841c(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C1436a.m36863a(textView)) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: k */
    public static void m36870k(TextView textView, int i) {
        int i2;
        C1138f.m37827c(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C1436a.m36863a(textView)) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: l */
    public static void m36869l(TextView textView, int i) {
        C1138f.m37827c(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* renamed from: m */
    public static void m36868m(TextView textView, PrecomputedTextCompat precomputedTextCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(precomputedTextCompat.m37904b());
        } else if (m36875f(textView).m37903a(precomputedTextCompat.m37905a())) {
            textView.setText(precomputedTextCompat);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    /* renamed from: n */
    public static void m36867n(TextView textView, int i) {
        textView.setTextAppearance(i);
    }

    /* renamed from: o */
    public static void m36866o(TextView textView, PrecomputedTextCompat.Params params) {
        C1437b.m36853h(textView, m36877d(params.m37900d()));
        textView.getPaint().set(params.m37899e());
        C1438c.m36848e(textView, params.m37902b());
        C1438c.m36845h(textView, params.m37901c());
    }

    /* renamed from: p */
    public static ActionMode.Callback m36865p(ActionMode.Callback callback) {
        if ((callback instanceof ActionMode$CallbackC1441f) && Build.VERSION.SDK_INT >= 26) {
            return ((ActionMode$CallbackC1441f) callback).m36837d();
        }
        return callback;
    }

    /* renamed from: q */
    public static ActionMode.Callback m36864q(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27 && !(callback instanceof ActionMode$CallbackC1441f) && callback != null) {
            return new ActionMode$CallbackC1441f(callback, textView);
        }
        return callback;
    }
}
package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.view.C0359c;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0500d;
import androidx.appcompat.widget.C0503e;
import androidx.appcompat.widget.C0506f;
import androidx.appcompat.widget.C0519g;
import androidx.appcompat.widget.C0527i0;
import androidx.appcompat.widget.C0535k1;
import androidx.appcompat.widget.C0536l;
import androidx.appcompat.widget.C0539m;
import androidx.appcompat.widget.C0542n;
import androidx.appcompat.widget.C0554q;
import androidx.appcompat.widget.C0559r;
import androidx.appcompat.widget.C0578u;
import androidx.appcompat.widget.C0594w;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.C1365w0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p052d.C5715j;

/* renamed from: androidx.appcompat.app.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0336q {

    /* renamed from: b */
    private static final Class<?>[] f1085b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f1086c = {16843375};

    /* renamed from: d */
    private static final int[] f1087d = {16844160};

    /* renamed from: e */
    private static final int[] f1088e = {16844156};

    /* renamed from: f */
    private static final int[] f1089f = {16844148};

    /* renamed from: g */
    private static final String[] f1090g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    private static final SimpleArrayMap<String, Constructor<? extends View>> f1091h = new SimpleArrayMap<>();

    /* renamed from: a */
    private final Object[] f1092a = new Object[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class View$OnClickListenerC0337a implements View.OnClickListener {

        /* renamed from: j */
        private final View f1093j;

        /* renamed from: k */
        private final String f1094k;

        /* renamed from: l */
        private Method f1095l;

        /* renamed from: m */
        private Context f1096m;

        public View$OnClickListenerC0337a(View view, String str) {
            this.f1093j = view;
            this.f1094k = str;
        }

        /* renamed from: a */
        private void m40547a(Context context) {
            int id2;
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1094k, View.class)) != null) {
                        this.f1095l = method;
                        this.f1096m = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            if (this.f1093j.getId() == -1) {
                str = "";
            } else {
                str = " with id '" + this.f1093j.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f1094k + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f1093j.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f1095l == null) {
                m40547a(this.f1093j.getContext());
            }
            try {
                this.f1095l.invoke(this.f1096m, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private void m40564a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1087d);
        if (obtainStyledAttributes.hasValue(0)) {
            C1365w0.m37183r0(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1088e);
        if (obtainStyledAttributes2.hasValue(0)) {
            C1365w0.m37179t0(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f1089f);
        if (obtainStyledAttributes3.hasValue(0)) {
            C1365w0.m37247G0(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    /* renamed from: b */
    private void m40563b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && C1365w0.m37230P(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1086c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new View$OnClickListenerC0337a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: s */
    private View m40551s(Context context, String str, String str2) {
        String str3;
        SimpleArrayMap<String, Constructor<? extends View>> simpleArrayMap = f1091h;
        Constructor<? extends View> constructor = simpleArrayMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1085b);
            simpleArrayMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f1092a);
    }

    /* renamed from: t */
    private View m40550t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f1092a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = f1090g;
                    if (i >= strArr.length) {
                        return null;
                    }
                    View m40551s = m40551s(context, str, strArr[i]);
                    if (m40551s != null) {
                        return m40551s;
                    }
                    i++;
                }
            } else {
                return m40551s(context, str, null);
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f1092a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* renamed from: u */
    private static Context m40549u(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5715j.f16262H3, 0, 0);
        if (z) {
            i = obtainStyledAttributes.getResourceId(C5715j.f16267I3, 0);
        } else {
            i = 0;
        }
        if (z2 && i == 0 && (i = obtainStyledAttributes.getResourceId(C5715j.f16272J3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (i != 0) {
            if (!(context instanceof C0359c) || ((C0359c) context).m40484c() != i) {
                return new C0359c(context, i);
            }
            return context;
        }
        return context;
    }

    /* renamed from: v */
    private void m40548v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    /* renamed from: c */
    protected C0500d mo26535c(Context context, AttributeSet attributeSet) {
        return new C0500d(context, attributeSet);
    }

    /* renamed from: d */
    protected C0503e mo26534d(Context context, AttributeSet attributeSet) {
        return new C0503e(context, attributeSet);
    }

    /* renamed from: e */
    protected C0506f mo26533e(Context context, AttributeSet attributeSet) {
        return new C0506f(context, attributeSet);
    }

    /* renamed from: f */
    protected C0519g m40562f(Context context, AttributeSet attributeSet) {
        return new C0519g(context, attributeSet);
    }

    /* renamed from: g */
    protected AppCompatEditText m40561g(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    /* renamed from: h */
    protected C0536l m40560h(Context context, AttributeSet attributeSet) {
        return new C0536l(context, attributeSet);
    }

    /* renamed from: i */
    protected C0539m m40559i(Context context, AttributeSet attributeSet) {
        return new C0539m(context, attributeSet);
    }

    /* renamed from: j */
    protected C0542n m40558j(Context context, AttributeSet attributeSet) {
        return new C0542n(context, attributeSet);
    }

    /* renamed from: k */
    protected C0554q mo26532k(Context context, AttributeSet attributeSet) {
        return new C0554q(context, attributeSet);
    }

    /* renamed from: l */
    protected C0559r m40557l(Context context, AttributeSet attributeSet) {
        return new C0559r(context, attributeSet);
    }

    /* renamed from: m */
    protected C0578u m40556m(Context context, AttributeSet attributeSet) {
        return new C0578u(context, attributeSet);
    }

    /* renamed from: n */
    protected C0594w m40555n(Context context, AttributeSet attributeSet) {
        return new C0594w(context, attributeSet);
    }

    /* renamed from: o */
    protected AppCompatTextView mo26531o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* renamed from: p */
    protected C0527i0 m40554p(Context context, AttributeSet attributeSet) {
        return new C0527i0(context, attributeSet);
    }

    /* renamed from: q */
    protected View m40553q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* renamed from: r */
    public final View m40552r(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View m40557l;
        if (z && view != null) {
            context2 = view.getContext();
        } else {
            context2 = context;
        }
        if (z2 || z3) {
            context2 = m40549u(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0535k1.m39807b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m40557l = m40557l(context2, attributeSet);
                m40548v(m40557l, str);
                break;
            case 1:
                m40557l = m40562f(context2, attributeSet);
                m40548v(m40557l, str);
                break;
            case 2:
                m40557l = m40558j(context2, attributeSet);
                m40548v(m40557l, str);
                break;
            case 3:
                m40557l = mo26531o(context2, attributeSet);
                m40548v(m40557l, str);
                break;
            case 4:
                m40557l = m40560h(context2, attributeSet);
                m40548v(m40557l, str);
                break;
            case 5:
                m40557l = m40556m(context2, attributeSet);
                m40548v(m40557l, str);
                break;
            case 6:
                m40557l = m40555n(context2, attributeSet);
                m40548v(m40557l, str);
                break;
            case 7:
                m40557l = mo26532k(context2, attributeSet);
                m40548v(m40557l, str);
                break;
            case '\b':
                m40557l = m40554p(context2, attributeSet);
                m40548v(m40557l, str);
                break;
            case '\t':
                m40557l = m40559i(context2, attributeSet);
                m40548v(m40557l, str);
                break;
            case '\n':
                m40557l = mo26535c(context2, attributeSet);
                m40548v(m40557l, str);
                break;
            case 11:
                m40557l = mo26533e(context2, attributeSet);
                m40548v(m40557l, str);
                break;
            case '\f':
                m40557l = m40561g(context2, attributeSet);
                m40548v(m40557l, str);
                break;
            case '\r':
                m40557l = mo26534d(context2, attributeSet);
                m40548v(m40557l, str);
                break;
            default:
                m40557l = m40553q(context2, str, attributeSet);
                break;
        }
        if (m40557l == null && context != context2) {
            m40557l = m40550t(context2, str, attributeSet);
        }
        if (m40557l != null) {
            m40563b(m40557l, attributeSet);
            m40564a(context2, m40557l, attributeSet);
        }
        return m40557l;
    }
}

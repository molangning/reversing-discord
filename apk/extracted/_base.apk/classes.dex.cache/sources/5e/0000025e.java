package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.k1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0535k1 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1881c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0535k1>> f1882d;

    /* renamed from: a */
    private final Resources f1883a;

    /* renamed from: b */
    private final Resources.Theme f1884b;

    private C0535k1(Context context) {
        super(context);
        if (C0613x1.m39576d()) {
            C0613x1 c0613x1 = new C0613x1(this, context.getResources());
            this.f1883a = c0613x1;
            Resources.Theme newTheme = c0613x1.newTheme();
            this.f1884b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1883a = new C0541m1(this, context.getResources());
        this.f1884b = null;
    }

    /* renamed from: a */
    private static boolean m39808a(Context context) {
        if ((context instanceof C0535k1) || (context.getResources() instanceof C0541m1) || (context.getResources() instanceof C0613x1) || !C0613x1.m39576d()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static Context m39807b(Context context) {
        C0535k1 c0535k1;
        if (m39808a(context)) {
            synchronized (f1881c) {
                ArrayList<WeakReference<C0535k1>> arrayList = f1882d;
                if (arrayList == null) {
                    f1882d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<C0535k1> weakReference = f1882d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1882d.remove(size);
                        }
                    }
                    for (int size2 = f1882d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<C0535k1> weakReference2 = f1882d.get(size2);
                        if (weakReference2 != null) {
                            c0535k1 = weakReference2.get();
                        } else {
                            c0535k1 = null;
                        }
                        if (c0535k1 != null && c0535k1.getBaseContext() == context) {
                            return c0535k1;
                        }
                    }
                }
                C0535k1 c0535k12 = new C0535k1(context);
                f1882d.add(new WeakReference<>(c0535k12));
                return c0535k12;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1883a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1883a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1884b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f1884b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
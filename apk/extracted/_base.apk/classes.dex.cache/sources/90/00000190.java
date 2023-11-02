package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p052d.C5714i;

/* renamed from: androidx.appcompat.view.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0359c extends ContextWrapper {

    /* renamed from: f */
    private static Configuration f1140f;

    /* renamed from: a */
    private int f1141a;

    /* renamed from: b */
    private Resources.Theme f1142b;

    /* renamed from: c */
    private LayoutInflater f1143c;

    /* renamed from: d */
    private Configuration f1144d;

    /* renamed from: e */
    private Resources f1145e;

    /* renamed from: androidx.appcompat.view.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0360a {
        /* renamed from: a */
        static Context m40480a(C0359c c0359c, Configuration configuration) {
            return c0359c.createConfigurationContext(configuration);
        }
    }

    public C0359c() {
        super(null);
    }

    /* renamed from: b */
    private Resources m40485b() {
        if (this.f1145e == null) {
            Configuration configuration = this.f1144d;
            if (configuration != null && (Build.VERSION.SDK_INT < 26 || !m40482e(configuration))) {
                this.f1145e = C0360a.m40480a(this, this.f1144d).getResources();
            } else {
                this.f1145e = super.getResources();
            }
        }
        return this.f1145e;
    }

    /* renamed from: d */
    private void m40483d() {
        boolean z;
        if (this.f1142b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f1142b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1142b.setTo(theme);
            }
        }
        m40481f(this.f1142b, this.f1141a, z);
    }

    /* renamed from: e */
    private static boolean m40482e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f1140f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f1140f = configuration2;
        }
        return configuration.equals(f1140f);
    }

    /* renamed from: a */
    public void m40486a(Configuration configuration) {
        if (this.f1145e == null) {
            if (this.f1144d == null) {
                this.f1144d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int m40484c() {
        return this.f1141a;
    }

    /* renamed from: f */
    protected void m40481f(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m40485b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f1143c == null) {
                this.f1143c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f1143c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1142b;
        if (theme != null) {
            return theme;
        }
        if (this.f1141a == 0) {
            this.f1141a = C5714i.f16222d;
        }
        m40483d();
        return this.f1142b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f1141a != i) {
            this.f1141a = i;
            m40483d();
        }
    }

    public C0359c(Context context, int i) {
        super(context);
        this.f1141a = i;
    }

    public C0359c(Context context, Resources.Theme theme) {
        super(context);
        this.f1142b = theme;
    }
}
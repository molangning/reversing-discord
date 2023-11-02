package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionMode;
import p052d.C5715j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class ActionBar {

    /* renamed from: androidx.appcompat.app.ActionBar$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0275b {
        void onMenuVisibilityChanged(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.ActionBar$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC0276c {
        /* renamed from: a */
        public abstract CharSequence m40779a();

        /* renamed from: b */
        public abstract View m40778b();

        /* renamed from: c */
        public abstract Drawable m40777c();

        /* renamed from: d */
        public abstract CharSequence m40776d();

        /* renamed from: e */
        public abstract void m40775e();
    }

    /* renamed from: g */
    public boolean mo40525g() {
        return false;
    }

    /* renamed from: h */
    public boolean mo40524h() {
        return false;
    }

    /* renamed from: i */
    public void mo40523i(boolean z) {
    }

    /* renamed from: j */
    public abstract int mo40522j();

    /* renamed from: k */
    public Context mo40521k() {
        return null;
    }

    /* renamed from: l */
    public boolean mo40520l() {
        return false;
    }

    /* renamed from: m */
    public void mo40519m(Configuration configuration) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo40518n() {
    }

    /* renamed from: o */
    public boolean mo40517o(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: p */
    public boolean mo40516p(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: q */
    public boolean mo40515q() {
        return false;
    }

    /* renamed from: r */
    public void mo40514r(boolean z) {
    }

    /* renamed from: s */
    public abstract void mo40513s(boolean z);

    /* renamed from: t */
    public abstract void mo40512t(boolean z);

    /* renamed from: u */
    public void mo40511u(Drawable drawable) {
    }

    /* renamed from: v */
    public void mo40510v(boolean z) {
    }

    /* renamed from: w */
    public abstract void mo40509w(CharSequence charSequence);

    /* renamed from: x */
    public void mo40508x(CharSequence charSequence) {
    }

    /* renamed from: y */
    public ActionMode mo40703y(ActionMode.Callback callback) {
        return null;
    }

    /* renamed from: androidx.appcompat.app.ActionBar$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0274a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f822a;

        public C0274a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f822a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5715j.f16440t);
            this.f822a = obtainStyledAttributes.getInt(C5715j.f16445u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0274a(int i, int i2) {
            super(i, i2);
            this.f822a = 8388627;
        }

        public C0274a(C0274a c0274a) {
            super((ViewGroup.MarginLayoutParams) c0274a);
            this.f822a = 0;
            this.f822a = c0274a.f822a;
        }

        public C0274a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f822a = 0;
        }
    }
}

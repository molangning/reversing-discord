package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.widget.C1419c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0526i {

    /* renamed from: a */
    private final CompoundButton f1853a;

    /* renamed from: b */
    private ColorStateList f1854b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1855c = null;

    /* renamed from: d */
    private boolean f1856d = false;

    /* renamed from: e */
    private boolean f1857e = false;

    /* renamed from: f */
    private boolean f1858f;

    public C0526i(CompoundButton compoundButton) {
        this.f1853a = compoundButton;
    }

    /* renamed from: a */
    void m39854a() {
        Drawable m36922a = C1419c.m36922a(this.f1853a);
        if (m36922a != null) {
            if (this.f1856d || this.f1857e) {
                Drawable mutate = C1013a.m38080r(m36922a).mutate();
                if (this.f1856d) {
                    C1013a.m38083o(mutate, this.f1854b);
                }
                if (this.f1857e) {
                    C1013a.m38082p(mutate, this.f1855c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1853a.getDrawableState());
                }
                this.f1853a.setButtonDrawable(mutate);
            }
        }
    }

    /* renamed from: b */
    public int m39853b(int i) {
        return i;
    }

    /* renamed from: c */
    public ColorStateList m39852c() {
        return this.f1854b;
    }

    /* renamed from: d */
    public PorterDuff.Mode m39851d() {
        return this.f1855c;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:35:0x001d, B:37:0x0025, B:39:0x002b, B:43:0x003d, B:45:0x0045, B:47:0x004b, B:48:0x0058, B:50:0x0060, B:51:0x0069, B:53:0x0071), top: B:62:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:35:0x001d, B:37:0x0025, B:39:0x002b, B:43:0x003d, B:45:0x0045, B:47:0x004b, B:48:0x0058, B:50:0x0060, B:51:0x0069, B:53:0x0071), top: B:62:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:35:0x001d, B:37:0x0025, B:39:0x002b, B:43:0x003d, B:45:0x0045, B:47:0x004b, B:48:0x0058, B:50:0x0060, B:51:0x0069, B:53:0x0071), top: B:62:0x001d }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m39850e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1853a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p052d.C5715j.f16322U0
            r8 = 0
            androidx.appcompat.widget.n1 r0 = androidx.appcompat.widget.C0544n1.m39780v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1853a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.m39784r()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.C1365w0.m37189o0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p052d.C5715j.f16330W0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m39783s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L3a
            int r10 = r0.m39788n(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L3a
            android.widget.CompoundButton r11 = r9.f1853a     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p071e.C6029a.m23853b(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r10 = 1
            goto L3b
        L3a:
            r10 = r8
        L3b:
            if (r10 != 0) goto L58
            int r10 = p052d.C5715j.f16326V0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m39783s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L58
            int r10 = r0.m39788n(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L58
            android.widget.CompoundButton r11 = r9.f1853a     // Catch: java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p071e.C6029a.m23853b(r1, r10)     // Catch: java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L84
        L58:
            int r10 = p052d.C5715j.f16334X0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m39783s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L69
            android.widget.CompoundButton r11 = r9.f1853a     // Catch: java.lang.Throwable -> L84
            android.content.res.ColorStateList r10 = r0.m39799c(r10)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.C1419c.m36920c(r11, r10)     // Catch: java.lang.Throwable -> L84
        L69:
            int r10 = p052d.C5715j.f16338Y0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m39783s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L80
            android.widget.CompoundButton r11 = r9.f1853a     // Catch: java.lang.Throwable -> L84
            r1 = -1
            int r10 = r0.m39791k(r10, r1)     // Catch: java.lang.Throwable -> L84
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0550p0.m39766e(r10, r1)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.C1419c.m36919d(r11, r10)     // Catch: java.lang.Throwable -> L84
        L80:
            r0.m39779w()
            return
        L84:
            r10 = move-exception
            r0.m39779w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0526i.m39850e(android.util.AttributeSet, int):void");
    }

    /* renamed from: f */
    public void m39849f() {
        if (this.f1858f) {
            this.f1858f = false;
            return;
        }
        this.f1858f = true;
        m39854a();
    }

    /* renamed from: g */
    public void m39848g(ColorStateList colorStateList) {
        this.f1854b = colorStateList;
        this.f1856d = true;
        m39854a();
    }

    /* renamed from: h */
    public void m39847h(PorterDuff.Mode mode) {
        this.f1855c = mode;
        this.f1857e = true;
        m39854a();
    }
}
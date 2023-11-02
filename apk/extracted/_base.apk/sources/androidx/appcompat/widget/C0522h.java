package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.widget.C1416b;

/* renamed from: androidx.appcompat.widget.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C0522h {

    /* renamed from: a */
    private final CheckedTextView f1828a;

    /* renamed from: b */
    private ColorStateList f1829b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1830c = null;

    /* renamed from: d */
    private boolean f1831d = false;

    /* renamed from: e */
    private boolean f1832e = false;

    /* renamed from: f */
    private boolean f1833f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0522h(CheckedTextView checkedTextView) {
        this.f1828a = checkedTextView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m39884a() {
        Drawable m36928a = C1416b.m36928a(this.f1828a);
        if (m36928a != null) {
            if (this.f1831d || this.f1832e) {
                Drawable mutate = C1013a.m38080r(m36928a).mutate();
                if (this.f1831d) {
                    C1013a.m38083o(mutate, this.f1829b);
                }
                if (this.f1832e) {
                    C1013a.m38082p(mutate, this.f1830c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1828a.getDrawableState());
                }
                this.f1828a.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList m39883b() {
        return this.f1829b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode m39882c() {
        return this.f1830c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m39881d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CheckedTextView r0 = r9.f1828a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p052d.C5715j.f16299P0
            r8 = 0
            androidx.appcompat.widget.n1 r0 = androidx.appcompat.widget.C0544n1.m39780v(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.f1828a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.m39784r()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.C1365w0.m37189o0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p052d.C5715j.f16309R0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m39783s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L3a
            int r10 = r0.m39788n(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L3a
            android.widget.CheckedTextView r11 = r9.f1828a     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p071e.C6029a.m23853b(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r11.setCheckMarkDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r10 = 1
            goto L3b
        L3a:
            r10 = r8
        L3b:
            if (r10 != 0) goto L58
            int r10 = p052d.C5715j.f16304Q0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m39783s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L58
            int r10 = r0.m39788n(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L58
            android.widget.CheckedTextView r11 = r9.f1828a     // Catch: java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p071e.C6029a.m23853b(r1, r10)     // Catch: java.lang.Throwable -> L84
            r11.setCheckMarkDrawable(r10)     // Catch: java.lang.Throwable -> L84
        L58:
            int r10 = p052d.C5715j.f16314S0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m39783s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L69
            android.widget.CheckedTextView r11 = r9.f1828a     // Catch: java.lang.Throwable -> L84
            android.content.res.ColorStateList r10 = r0.m39799c(r10)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.C1416b.m36927b(r11, r10)     // Catch: java.lang.Throwable -> L84
        L69:
            int r10 = p052d.C5715j.f16318T0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m39783s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L80
            android.widget.CheckedTextView r11 = r9.f1828a     // Catch: java.lang.Throwable -> L84
            r1 = -1
            int r10 = r0.m39791k(r10, r1)     // Catch: java.lang.Throwable -> L84
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0550p0.m39766e(r10, r1)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.C1416b.m36926c(r11, r10)     // Catch: java.lang.Throwable -> L84
        L80:
            r0.m39779w()
            return
        L84:
            r10 = move-exception
            r0.m39779w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0522h.m39881d(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m39880e() {
        if (this.f1833f) {
            this.f1833f = false;
            return;
        }
        this.f1833f = true;
        m39884a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m39879f(ColorStateList colorStateList) {
        this.f1829b = colorStateList;
        this.f1831d = true;
        m39884a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m39878g(PorterDuff.Mode mode) {
        this.f1830c = mode;
        this.f1832e = true;
        m39884a();
    }
}

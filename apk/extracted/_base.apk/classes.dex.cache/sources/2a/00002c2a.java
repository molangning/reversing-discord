package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p443ya.AbstractC13962f;
import p443ya.C13958d;

/* renamed from: com.google.android.material.internal.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4904k {

    /* renamed from: c */
    private float f13772c;

    /* renamed from: f */
    private C13958d f13775f;

    /* renamed from: a */
    private final TextPaint f13770a = new TextPaint(1);

    /* renamed from: b */
    private final AbstractC13962f f13771b = new C4905a();

    /* renamed from: d */
    private boolean f13773d = true;

    /* renamed from: e */
    private WeakReference<InterfaceC4906b> f13774e = new WeakReference<>(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4905a extends AbstractC13962f {
        C4905a() {
            C4904k.this = r1;
        }

        @Override // p443ya.AbstractC13962f
        /* renamed from: a */
        public void mo1062a(int i) {
            C4904k.this.f13773d = true;
            InterfaceC4906b interfaceC4906b = (InterfaceC4906b) C4904k.this.f13774e.get();
            if (interfaceC4906b != null) {
                interfaceC4906b.mo26953a();
            }
        }

        @Override // p443ya.AbstractC13962f
        /* renamed from: b */
        public void mo1061b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            C4904k.this.f13773d = true;
            InterfaceC4906b interfaceC4906b = (InterfaceC4906b) C4904k.this.f13774e.get();
            if (interfaceC4906b != null) {
                interfaceC4906b.mo26953a();
            }
        }
    }

    /* renamed from: com.google.android.material.internal.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4906b {
        /* renamed from: a */
        void mo26953a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C4904k(InterfaceC4906b interfaceC4906b) {
        m26957g(interfaceC4906b);
    }

    /* renamed from: c */
    private float m26961c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f13770a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C13958d m26960d() {
        return this.f13775f;
    }

    /* renamed from: e */
    public TextPaint m26959e() {
        return this.f13770a;
    }

    /* renamed from: f */
    public float m26958f(String str) {
        if (!this.f13773d) {
            return this.f13772c;
        }
        float m26961c = m26961c(str);
        this.f13772c = m26961c;
        this.f13773d = false;
        return m26961c;
    }

    /* renamed from: g */
    public void m26957g(InterfaceC4906b interfaceC4906b) {
        this.f13774e = new WeakReference<>(interfaceC4906b);
    }

    /* renamed from: h */
    public void m26956h(C13958d c13958d, Context context) {
        if (this.f13775f != c13958d) {
            this.f13775f = c13958d;
            if (c13958d != null) {
                c13958d.m1067o(context, this.f13770a, this.f13771b);
                InterfaceC4906b interfaceC4906b = this.f13774e.get();
                if (interfaceC4906b != null) {
                    this.f13770a.drawableState = interfaceC4906b.getState();
                }
                c13958d.m1068n(context, this.f13770a, this.f13771b);
                this.f13773d = true;
            }
            InterfaceC4906b interfaceC4906b2 = this.f13774e.get();
            if (interfaceC4906b2 != null) {
                interfaceC4906b2.mo26953a();
                interfaceC4906b2.onStateChange(interfaceC4906b2.getState());
            }
        }
    }

    /* renamed from: i */
    public void m26955i(boolean z) {
        this.f13773d = z;
    }

    /* renamed from: j */
    public void m26954j(Context context) {
        this.f13775f.m1068n(context, this.f13770a, this.f13771b);
    }
}
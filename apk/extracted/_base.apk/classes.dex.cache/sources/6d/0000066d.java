package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.core.graphics.C0999c;
import androidx.emoji2.text.C1500e;

/* renamed from: androidx.emoji2.text.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1499d implements C1500e.InterfaceC1505d {

    /* renamed from: b */
    private static final ThreadLocal<StringBuilder> f3901b = new ThreadLocal<>();

    /* renamed from: a */
    private final TextPaint f3902a;

    public C1499d() {
        TextPaint textPaint = new TextPaint();
        this.f3902a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* renamed from: b */
    private static StringBuilder m36658b() {
        ThreadLocal<StringBuilder> threadLocal = f3901b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.C1500e.InterfaceC1505d
    /* renamed from: a */
    public boolean mo36630a(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder m36658b = m36658b();
        m36658b.setLength(0);
        while (i < i2) {
            m36658b.append(charSequence.charAt(i));
            i++;
        }
        return C0999c.m38172a(this.f3902a, m36658b.toString());
    }
}
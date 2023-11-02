package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.core.text.PrecomputedTextCompat;
import p164j$.util.stream.IntStream;

/* renamed from: androidx.emoji2.text.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1532r implements Spannable {

    /* renamed from: j */
    private boolean f3986j = false;

    /* renamed from: k */
    private Spannable f3987k;

    /* renamed from: androidx.emoji2.text.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1533a {
        /* renamed from: a */
        static IntStream m36547a(CharSequence charSequence) {
            IntStream convert;
            convert = IntStream.VivifiedWrapper.convert(charSequence.chars());
            return convert;
        }

        /* renamed from: b */
        static IntStream m36546b(CharSequence charSequence) {
            IntStream convert;
            convert = IntStream.VivifiedWrapper.convert(charSequence.codePoints());
            return convert;
        }
    }

    /* renamed from: androidx.emoji2.text.r$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1534b {
        C1534b() {
        }

        /* renamed from: a */
        boolean mo36545a(CharSequence charSequence) {
            return charSequence instanceof PrecomputedTextCompat;
        }
    }

    /* renamed from: androidx.emoji2.text.r$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1535c extends C1534b {
        C1535c() {
        }

        @Override // androidx.emoji2.text.C1532r.C1534b
        /* renamed from: a */
        boolean mo36545a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof PrecomputedTextCompat);
        }
    }

    public C1532r(Spannable spannable) {
        this.f3987k = spannable;
    }

    /* renamed from: a */
    private void m36550a() {
        Spannable spannable = this.f3987k;
        if (!this.f3986j && m36548c().mo36545a(spannable)) {
            this.f3987k = new SpannableString(spannable);
        }
        this.f3986j = true;
    }

    /* renamed from: c */
    static C1534b m36548c() {
        if (Build.VERSION.SDK_INT < 28) {
            return new C1534b();
        }
        return new C1535c();
    }

    /* renamed from: b */
    public Spannable m36549b() {
        return this.f3987k;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f3987k.charAt(i);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return C1533a.m36547a(this.f3987k);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return C1533a.m36546b(this.f3987k);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f3987k.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f3987k.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f3987k.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.f3987k.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f3987k.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f3987k.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        m36550a();
        this.f3987k.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        m36550a();
        this.f3987k.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f3987k.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f3987k.toString();
    }

    public C1532r(CharSequence charSequence) {
        this.f3987k = new SpannableString(charSequence);
    }
}
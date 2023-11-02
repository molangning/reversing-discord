package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.C1138f;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.emoji2.text.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1527n extends SpannableStringBuilder {

    /* renamed from: j */
    private final Class<?> f3981j;

    /* renamed from: k */
    private final List<C1528a> f3982k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1528a implements TextWatcher, SpanWatcher {

        /* renamed from: j */
        final Object f3983j;

        /* renamed from: k */
        private final AtomicInteger f3984k = new AtomicInteger(0);

        C1528a(Object obj) {
            this.f3983j = obj;
        }

        /* renamed from: b */
        private boolean m36555b(Object obj) {
            return obj instanceof AbstractC1516i;
        }

        /* renamed from: a */
        final void m36556a() {
            this.f3984k.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f3983j).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f3983j).beforeTextChanged(charSequence, i, i2, i3);
        }

        /* renamed from: c */
        final void m36554c() {
            this.f3984k.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f3984k.get() > 0 && m36555b(obj)) {
                return;
            }
            ((SpanWatcher) this.f3983j).onSpanAdded(spannable, obj, i, i2);
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f3984k.get() > 0 && m36555b(obj)) {
                return;
            }
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i2) {
                    i = 0;
                }
                if (i3 > i4) {
                    i5 = i;
                    i6 = 0;
                    ((SpanWatcher) this.f3983j).onSpanChanged(spannable, obj, i5, i2, i6, i4);
                }
            }
            i5 = i;
            i6 = i3;
            ((SpanWatcher) this.f3983j).onSpanChanged(spannable, obj, i5, i2, i6, i4);
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f3984k.get() > 0 && m36555b(obj)) {
                return;
            }
            ((SpanWatcher) this.f3983j).onSpanRemoved(spannable, obj, i, i2);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f3983j).onTextChanged(charSequence, i, i2, i3);
        }
    }

    C1527n(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f3982k = new ArrayList();
        C1138f.m37823g(cls, "watcherClass cannot be null");
        this.f3981j = cls;
    }

    /* renamed from: b */
    private void m36564b() {
        for (int i = 0; i < this.f3982k.size(); i++) {
            this.f3982k.get(i).m36556a();
        }
    }

    /* renamed from: c */
    public static C1527n m36563c(Class<?> cls, CharSequence charSequence) {
        return new C1527n(cls, charSequence);
    }

    /* renamed from: e */
    private void m36561e() {
        for (int i = 0; i < this.f3982k.size(); i++) {
            this.f3982k.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: f */
    private C1528a m36560f(Object obj) {
        for (int i = 0; i < this.f3982k.size(); i++) {
            C1528a c1528a = this.f3982k.get(i);
            if (c1528a.f3983j == obj) {
                return c1528a;
            }
        }
        return null;
    }

    /* renamed from: g */
    private boolean m36559g(Class<?> cls) {
        return this.f3981j == cls;
    }

    /* renamed from: h */
    private boolean m36558h(Object obj) {
        return obj != null && m36559g(obj.getClass());
    }

    /* renamed from: i */
    private void m36557i() {
        for (int i = 0; i < this.f3982k.size(); i++) {
            this.f3982k.get(i).m36554c();
        }
    }

    /* renamed from: a */
    public void m36565a() {
        m36564b();
    }

    /* renamed from: d */
    public void m36562d() {
        m36557i();
        m36561e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        C1528a m36560f;
        if (m36558h(obj) && (m36560f = m36560f(obj)) != null) {
            obj = m36560f;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        C1528a m36560f;
        if (m36558h(obj) && (m36560f = m36560f(obj)) != null) {
            obj = m36560f;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        C1528a m36560f;
        if (m36558h(obj) && (m36560f = m36560f(obj)) != null) {
            obj = m36560f;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (m36559g(cls)) {
            C1528a[] c1528aArr = (C1528a[]) super.getSpans(i, i2, C1528a.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, c1528aArr.length));
            for (int i3 = 0; i3 < c1528aArr.length; i3++) {
                tArr[i3] = c1528aArr[i3].f3983j;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return super.nextSpanTransition(i, i2, (cls == null || m36559g(cls)) ? C1528a.class : C1528a.class);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        C1528a c1528a;
        if (m36558h(obj)) {
            c1528a = m36560f(obj);
            if (c1528a != null) {
                obj = c1528a;
            }
        } else {
            c1528a = null;
        }
        super.removeSpan(obj);
        if (c1528a != null) {
            this.f3982k.remove(c1528a);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (m36558h(obj)) {
            C1528a c1528a = new C1528a(obj);
            this.f3982k.add(c1528a);
            obj = c1528a;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new C1527n(this.f3981j, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m36564b();
        super.replace(i, i2, charSequence);
        m36557i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    C1527n(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f3982k = new ArrayList();
        C1138f.m37823g(cls, "watcherClass cannot be null");
        this.f3981j = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m36564b();
        super.replace(i, i2, charSequence, i3, i4);
        m36557i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}

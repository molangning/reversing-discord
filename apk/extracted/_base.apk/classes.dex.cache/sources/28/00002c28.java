package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.react.uimanager.ViewDefaults;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.internal.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4902j {

    /* renamed from: n */
    static final int f13756n = 1;

    /* renamed from: a */
    private CharSequence f13757a;

    /* renamed from: b */
    private final TextPaint f13758b;

    /* renamed from: c */
    private final int f13759c;

    /* renamed from: e */
    private int f13761e;

    /* renamed from: l */
    private boolean f13768l;

    /* renamed from: d */
    private int f13760d = 0;

    /* renamed from: f */
    private Layout.Alignment f13762f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g */
    private int f13763g = ViewDefaults.NUMBER_OF_LINES;

    /* renamed from: h */
    private float f13764h = 0.0f;

    /* renamed from: i */
    private float f13765i = 1.0f;

    /* renamed from: j */
    private int f13766j = f13756n;

    /* renamed from: k */
    private boolean f13767k = true;

    /* renamed from: m */
    private TextUtils.TruncateAt f13769m = null;

    /* renamed from: com.google.android.material.internal.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C4903a extends Exception {
    }

    private C4902j(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f13757a = charSequence;
        this.f13758b = textPaint;
        this.f13759c = i;
        this.f13761e = charSequence.length();
    }

    /* renamed from: b */
    public static C4902j m26971b(CharSequence charSequence, TextPaint textPaint, int i) {
        return new C4902j(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout m26972a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f13757a == null) {
            this.f13757a = "";
        }
        int max = Math.max(0, this.f13759c);
        CharSequence charSequence = this.f13757a;
        if (this.f13763g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f13758b, max, this.f13769m);
        }
        int min = Math.min(charSequence.length(), this.f13761e);
        this.f13761e = min;
        if (this.f13768l && this.f13763g == 1) {
            this.f13762f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f13760d, min, this.f13758b, max);
        obtain.setAlignment(this.f13762f);
        obtain.setIncludePad(this.f13767k);
        if (this.f13768l) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f13769m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f13763g);
        float f = this.f13764h;
        if (f != 0.0f || this.f13765i != 1.0f) {
            obtain.setLineSpacing(f, this.f13765i);
        }
        if (this.f13763g > 1) {
            obtain.setHyphenationFrequency(this.f13766j);
        }
        return obtain.build();
    }

    /* renamed from: c */
    public C4902j m26970c(Layout.Alignment alignment) {
        this.f13762f = alignment;
        return this;
    }

    /* renamed from: d */
    public C4902j m26969d(TextUtils.TruncateAt truncateAt) {
        this.f13769m = truncateAt;
        return this;
    }

    /* renamed from: e */
    public C4902j m26968e(int i) {
        this.f13766j = i;
        return this;
    }

    /* renamed from: f */
    public C4902j m26967f(boolean z) {
        this.f13767k = z;
        return this;
    }

    /* renamed from: g */
    public C4902j m26966g(boolean z) {
        this.f13768l = z;
        return this;
    }

    /* renamed from: h */
    public C4902j m26965h(float f, float f2) {
        this.f13764h = f;
        this.f13765i = f2;
        return this;
    }

    /* renamed from: i */
    public C4902j m26964i(int i) {
        this.f13763g = i;
        return this;
    }
}
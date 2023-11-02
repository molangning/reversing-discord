package com.google.android.exoplayer2.p049ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p195k8.C9191p0;
import p383v7.C13126a;
import p383v7.C13127b;
import p383v7.InterfaceC13140l;

/* renamed from: com.google.android.exoplayer2.ui.SubtitleView */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SubtitleView extends FrameLayout implements InterfaceC13140l {

    /* renamed from: j */
    private List<C13127b> f12134j;

    /* renamed from: k */
    private C13126a f12135k;

    /* renamed from: l */
    private int f12136l;

    /* renamed from: m */
    private float f12137m;

    /* renamed from: n */
    private float f12138n;

    /* renamed from: o */
    private boolean f12139o;

    /* renamed from: p */
    private boolean f12140p;

    /* renamed from: q */
    private int f12141q;

    /* renamed from: r */
    private InterfaceC4493a f12142r;

    /* renamed from: s */
    private View f12143s;

    /* renamed from: com.google.android.exoplayer2.ui.SubtitleView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4493a {
        /* renamed from: a */
        void mo28793a(List<C13127b> list, C13126a c13126a, float f, int i, float f2);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private C13127b m28842a(C13127b c13127b) {
        CharSequence charSequence = c13127b.f34102a;
        if (!this.f12139o) {
            C13127b.C13129b m3154b = c13127b.m3156a().m3140p(-3.4028235E38f, Integer.MIN_VALUE).m3154b();
            if (charSequence != null) {
                m3154b.m3142n(charSequence.toString());
            }
            return m3154b.m3155a();
        } else if (!this.f12140p) {
            if (charSequence == null) {
                return c13127b;
            }
            C13127b.C13129b m3140p = c13127b.m3156a().m3140p(-3.4028235E38f, Integer.MIN_VALUE);
            if (charSequence instanceof Spanned) {
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) valueOf.getSpans(0, valueOf.length(), AbsoluteSizeSpan.class)) {
                    valueOf.removeSpan(absoluteSizeSpan);
                }
                for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) valueOf.getSpans(0, valueOf.length(), RelativeSizeSpan.class)) {
                    valueOf.removeSpan(relativeSizeSpan);
                }
                m3140p.m3142n(valueOf);
            }
            return m3140p.m3155a();
        } else {
            return c13127b;
        }
    }

    /* renamed from: c */
    private void m28840c(int i, float f) {
        this.f12136l = i;
        this.f12137m = f;
        m28837f();
    }

    /* renamed from: f */
    private void m28837f() {
        this.f12142r.mo28793a(getCuesWithStylingPreferencesApplied(), this.f12135k, this.f12137m, this.f12136l, this.f12138n);
    }

    private List<C13127b> getCuesWithStylingPreferencesApplied() {
        if (this.f12139o && this.f12140p) {
            return this.f12134j;
        }
        ArrayList arrayList = new ArrayList(this.f12134j.size());
        for (int i = 0; i < this.f12134j.size(); i++) {
            arrayList.add(m28842a(this.f12134j.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (C9191p0.f24171a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C13126a getUserCaptionStyle() {
        if (C9191p0.f24171a >= 19 && !isInEditMode()) {
            CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
            if (captioningManager != null && captioningManager.isEnabled()) {
                return C13126a.m3159a(captioningManager.getUserStyle());
            }
            return C13126a.f34094g;
        }
        return C13126a.f34094g;
    }

    private <T extends View & InterfaceC4493a> void setView(T t) {
        removeView(this.f12143s);
        View view = this.f12143s;
        if (view instanceof C4510i) {
            ((C4510i) view).m28787g();
        }
        this.f12143s = t;
        this.f12142r = t;
        addView(t);
    }

    /* renamed from: b */
    public void m28841b(float f, boolean z) {
        m28840c(z ? 1 : 0, f);
    }

    /* renamed from: d */
    public void m28839d() {
        setStyle(getUserCaptionStyle());
    }

    /* renamed from: e */
    public void m28838e() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    @Override // p383v7.InterfaceC13140l
    /* renamed from: n */
    public void mo3124n(List<C13127b> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f12140p = z;
        m28837f();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f12139o = z;
        m28837f();
    }

    public void setBottomPaddingFraction(float f) {
        this.f12138n = f;
        m28837f();
    }

    public void setCues(List<C13127b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f12134j = list;
        m28837f();
    }

    public void setFractionalTextSize(float f) {
        m28841b(f, false);
    }

    public void setStyle(C13126a c13126a) {
        this.f12135k = c13126a;
        m28837f();
    }

    public void setViewType(int i) {
        if (this.f12141q == i) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                setView(new C4510i(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            setView(new C4497a(getContext()));
        }
        this.f12141q = i;
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12134j = Collections.emptyList();
        this.f12135k = C13126a.f34094g;
        this.f12136l = 0;
        this.f12137m = 0.0533f;
        this.f12138n = 0.08f;
        this.f12139o = true;
        this.f12140p = true;
        C4497a c4497a = new C4497a(context, attributeSet);
        this.f12142r = c4497a;
        this.f12143s = c4497a;
        addView(c4497a);
        this.f12141q = 1;
    }
}
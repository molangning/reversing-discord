package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.cardview.widget.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0621a implements CardViewImpl {
    /* renamed from: p */
    private C0622b m39545p(CardViewDelegate cardViewDelegate) {
        return (C0622b) cardViewDelegate.mo39563d();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: a */
    public void mo39560a(CardViewDelegate cardViewDelegate, float f) {
        m39545p(cardViewDelegate).m39537h(f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: b */
    public float mo39559b(CardViewDelegate cardViewDelegate) {
        return m39545p(cardViewDelegate).m39541d();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: c */
    public void mo39558c(CardViewDelegate cardViewDelegate, float f) {
        cardViewDelegate.mo39561f().setElevation(f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: d */
    public float mo39557d(CardViewDelegate cardViewDelegate) {
        return m39545p(cardViewDelegate).m39542c();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: e */
    public ColorStateList mo39556e(CardViewDelegate cardViewDelegate) {
        return m39545p(cardViewDelegate).m39543b();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: f */
    public float mo39555f(CardViewDelegate cardViewDelegate) {
        return mo39559b(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: g */
    public void mo39554g(CardViewDelegate cardViewDelegate) {
        mo39546o(cardViewDelegate, mo39557d(cardViewDelegate));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: h */
    public void mo39553h(CardViewDelegate cardViewDelegate, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        cardViewDelegate.mo39565b(new C0622b(colorStateList, f));
        View mo39561f = cardViewDelegate.mo39561f();
        mo39561f.setClipToOutline(true);
        mo39561f.setElevation(f2);
        mo39546o(cardViewDelegate, f3);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: i */
    public float mo39552i(CardViewDelegate cardViewDelegate) {
        return cardViewDelegate.mo39561f().getElevation();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: j */
    public void mo39551j(CardViewDelegate cardViewDelegate) {
        mo39546o(cardViewDelegate, mo39557d(cardViewDelegate));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: k */
    public void mo39550k(CardViewDelegate cardViewDelegate) {
        if (!cardViewDelegate.mo39564c()) {
            cardViewDelegate.mo39566a(0, 0, 0, 0);
            return;
        }
        float mo39557d = mo39557d(cardViewDelegate);
        float mo39559b = mo39559b(cardViewDelegate);
        int ceil = (int) Math.ceil(C0623c.m39535a(mo39557d, mo39559b, cardViewDelegate.mo39562e()));
        int ceil2 = (int) Math.ceil(C0623c.m39534b(mo39557d, mo39559b, cardViewDelegate.mo39562e()));
        cardViewDelegate.mo39566a(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: l */
    public void mo39549l() {
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: m */
    public float mo39548m(CardViewDelegate cardViewDelegate) {
        return mo39559b(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: n */
    public void mo39547n(CardViewDelegate cardViewDelegate, ColorStateList colorStateList) {
        m39545p(cardViewDelegate).m39539f(colorStateList);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* renamed from: o */
    public void mo39546o(CardViewDelegate cardViewDelegate, float f) {
        m39545p(cardViewDelegate).m39538g(f, cardViewDelegate.mo39564c(), cardViewDelegate.mo39562e());
        mo39550k(cardViewDelegate);
    }
}

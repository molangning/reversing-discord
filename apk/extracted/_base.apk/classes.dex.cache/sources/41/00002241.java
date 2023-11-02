package com.facebook.hermes.intl;

import com.facebook.hermes.intl.InterfaceC3644a;
import java.text.RuleBasedCollator;
import p128h4.InterfaceC6895b;

/* renamed from: com.facebook.hermes.intl.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3685l implements InterfaceC3644a {

    /* renamed from: a */
    private RuleBasedCollator f10244a;

    /* renamed from: b */
    private C3679h f10245b;

    /* renamed from: com.facebook.hermes.intl.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C3686a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10246a;

        static {
            int[] iArr = new int[InterfaceC3644a.EnumC3647c.values().length];
            f10246a = iArr;
            try {
                iArr[InterfaceC3644a.EnumC3647c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10246a[InterfaceC3644a.EnumC3647c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10246a[InterfaceC3644a.EnumC3647c.VARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10246a[InterfaceC3644a.EnumC3647c.CASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.facebook.hermes.intl.InterfaceC3644a
    /* renamed from: a */
    public int mo31255a(String str, String str2) {
        return this.f10244a.compare(str, str2);
    }

    @Override // com.facebook.hermes.intl.InterfaceC3644a
    /* renamed from: b */
    public InterfaceC3644a.EnumC3647c mo31254b() {
        RuleBasedCollator ruleBasedCollator = this.f10244a;
        if (ruleBasedCollator == null) {
            return InterfaceC3644a.EnumC3647c.LOCALE;
        }
        int strength = ruleBasedCollator.getStrength();
        if (strength == 0) {
            return InterfaceC3644a.EnumC3647c.BASE;
        }
        if (strength == 1) {
            return InterfaceC3644a.EnumC3647c.ACCENT;
        }
        return InterfaceC3644a.EnumC3647c.VARIANT;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3644a
    /* renamed from: c */
    public InterfaceC3644a mo31253c(InterfaceC6895b<?> interfaceC6895b) {
        C3679h c3679h = (C3679h) interfaceC6895b;
        this.f10245b = c3679h;
        this.f10244a = (RuleBasedCollator) java.text.Collator.getInstance(c3679h.mo21544h());
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3644a
    /* renamed from: d */
    public InterfaceC3644a mo31252d(boolean z) {
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3644a
    /* renamed from: e */
    public InterfaceC3644a mo31251e(InterfaceC3644a.EnumC3646b enumC3646b) {
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3644a
    /* renamed from: f */
    public InterfaceC3644a mo31250f(boolean z) {
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3644a
    /* renamed from: g */
    public InterfaceC3644a mo31249g(InterfaceC3644a.EnumC3647c enumC3647c) {
        int i = C3686a.f10246a[enumC3647c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.f10244a.setStrength(0);
                    }
                } else {
                    this.f10244a.setStrength(2);
                }
            } else {
                this.f10244a.setStrength(1);
            }
        } else {
            this.f10244a.setStrength(0);
        }
        return this;
    }
}
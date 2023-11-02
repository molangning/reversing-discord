package com.facebook.hermes.intl;

import android.icu.text.RuleBasedCollator;
import com.facebook.hermes.intl.InterfaceC3644a;
import p128h4.C6935j;
import p128h4.C7014z;
import p128h4.InterfaceC6895b;

/* renamed from: com.facebook.hermes.intl.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3687m implements InterfaceC3644a {

    /* renamed from: a */
    private RuleBasedCollator f10247a = null;

    /* renamed from: com.facebook.hermes.intl.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C3688a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10248a;

        /* renamed from: b */
        static final /* synthetic */ int[] f10249b;

        static {
            int[] iArr = new int[InterfaceC3644a.EnumC3646b.values().length];
            f10249b = iArr;
            try {
                iArr[InterfaceC3644a.EnumC3646b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10249b[InterfaceC3644a.EnumC3646b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10249b[InterfaceC3644a.EnumC3646b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InterfaceC3644a.EnumC3647c.values().length];
            f10248a = iArr2;
            try {
                iArr2[InterfaceC3644a.EnumC3647c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10248a[InterfaceC3644a.EnumC3647c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10248a[InterfaceC3644a.EnumC3647c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10248a[InterfaceC3644a.EnumC3647c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.facebook.hermes.intl.InterfaceC3644a
    /* renamed from: a */
    public int mo31255a(String str, String str2) {
        int compare;
        compare = this.f10247a.compare(str, str2);
        return compare;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3644a
    /* renamed from: b */
    public InterfaceC3644a.EnumC3647c mo31254b() {
        int strength;
        boolean isCaseLevel;
        RuleBasedCollator ruleBasedCollator = this.f10247a;
        if (ruleBasedCollator == null) {
            return InterfaceC3644a.EnumC3647c.LOCALE;
        }
        strength = ruleBasedCollator.getStrength();
        if (strength == 0) {
            isCaseLevel = this.f10247a.isCaseLevel();
            if (isCaseLevel) {
                return InterfaceC3644a.EnumC3647c.CASE;
            }
            return InterfaceC3644a.EnumC3647c.BASE;
        } else if (strength == 1) {
            return InterfaceC3644a.EnumC3647c.ACCENT;
        } else {
            return InterfaceC3644a.EnumC3647c.VARIANT;
        }
    }

    @Override // com.facebook.hermes.intl.InterfaceC3644a
    /* renamed from: c */
    public InterfaceC3644a mo31253c(InterfaceC6895b<?> interfaceC6895b) {
        android.icu.text.Collator ruleBasedCollator;
        ruleBasedCollator = RuleBasedCollator.getInstance(((C7014z) interfaceC6895b).mo21544h());
        RuleBasedCollator ruleBasedCollator2 = (RuleBasedCollator) ruleBasedCollator;
        this.f10247a = ruleBasedCollator2;
        ruleBasedCollator2.setDecomposition(17);
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3644a
    /* renamed from: d */
    public InterfaceC3644a mo31252d(boolean z) {
        if (z) {
            this.f10247a.setAlternateHandlingShifted(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3644a
    /* renamed from: e */
    public InterfaceC3644a mo31251e(InterfaceC3644a.EnumC3646b enumC3646b) {
        int i = C3688a.f10249b[enumC3646b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                this.f10247a.setCaseFirstDefault();
            } else {
                this.f10247a.setLowerCaseFirst(true);
            }
        } else {
            this.f10247a.setUpperCaseFirst(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3644a
    /* renamed from: f */
    public InterfaceC3644a mo31250f(boolean z) {
        if (z) {
            this.f10247a.setNumericCollation(C6935j.m21640e(Boolean.TRUE));
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3644a
    /* renamed from: g */
    public InterfaceC3644a mo31249g(InterfaceC3644a.EnumC3647c enumC3647c) {
        int i = C3688a.f10248a[enumC3647c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.f10247a.setStrength(2);
                    }
                } else {
                    this.f10247a.setStrength(0);
                    this.f10247a.setCaseLevel(true);
                }
            } else {
                this.f10247a.setStrength(1);
            }
        } else {
            this.f10247a.setStrength(0);
        }
        return this;
    }
}
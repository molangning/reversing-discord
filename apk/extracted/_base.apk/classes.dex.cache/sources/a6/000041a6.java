package p204l;

import android.os.Bundle;

/* renamed from: l.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C9988a {

    /* renamed from: a */
    public final Integer f25895a;

    /* renamed from: b */
    public final Integer f25896b;

    /* renamed from: c */
    public final Integer f25897c;

    /* renamed from: d */
    public final Integer f25898d;

    /* renamed from: l.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C9989a {

        /* renamed from: a */
        private Integer f25899a;

        /* renamed from: b */
        private Integer f25900b;

        /* renamed from: c */
        private Integer f25901c;

        /* renamed from: d */
        private Integer f25902d;

        /* renamed from: a */
        public C9988a m12676a() {
            return new C9988a(this.f25899a, this.f25900b, this.f25901c, this.f25902d);
        }

        /* renamed from: b */
        public C9989a m12675b(int i) {
            this.f25901c = Integer.valueOf(i | (-16777216));
            return this;
        }

        /* renamed from: c */
        public C9989a m12674c(int i) {
            this.f25900b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C9989a m12673d(int i) {
            this.f25899a = Integer.valueOf(i | (-16777216));
            return this;
        }
    }

    C9988a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f25895a = num;
        this.f25896b = num2;
        this.f25897c = num3;
        this.f25898d = num4;
    }

    /* renamed from: a */
    public Bundle m12677a() {
        Bundle bundle = new Bundle();
        Integer num = this.f25895a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f25896b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f25897c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f25898d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
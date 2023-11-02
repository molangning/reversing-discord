package com.horcrux.svg;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.image.ReactImageView;
import com.facebook.react.views.text.TypefaceStyle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.horcrux.svg.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5218h {

    /* renamed from: p */
    static final C5218h f14642p = new C5218h();

    /* renamed from: a */
    final double f14643a;

    /* renamed from: b */
    final String f14644b;

    /* renamed from: c */
    final EnumC5224j0 f14645c;

    /* renamed from: d */
    final ReadableMap f14646d;

    /* renamed from: e */
    EnumC5228l0 f14647e;

    /* renamed from: f */
    int f14648f;

    /* renamed from: g */
    final String f14649g;

    /* renamed from: h */
    final String f14650h;

    /* renamed from: i */
    final EnumC5226k0 f14651i;

    /* renamed from: j */
    final EnumC5231m0 f14652j;

    /* renamed from: k */
    private final EnumC5233n0 f14653k;

    /* renamed from: l */
    final double f14654l;

    /* renamed from: m */
    final double f14655m;

    /* renamed from: n */
    final double f14656n;

    /* renamed from: o */
    final boolean f14657o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C5219a {

        /* renamed from: a */
        private static final EnumC5228l0[] f14658a;

        /* renamed from: b */
        private static final int[] f14659b;

        static {
            EnumC5228l0 enumC5228l0 = EnumC5228l0.w100;
            EnumC5228l0 enumC5228l02 = EnumC5228l0.w900;
            f14658a = new EnumC5228l0[]{enumC5228l0, enumC5228l0, EnumC5228l0.w200, EnumC5228l0.w300, EnumC5228l0.Normal, EnumC5228l0.w500, EnumC5228l0.w600, EnumC5228l0.Bold, EnumC5228l0.w800, enumC5228l02, enumC5228l02};
            f14659b = new int[]{TypefaceStyle.NORMAL, TypefaceStyle.BOLD, 100, ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION, ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS, TypefaceStyle.NORMAL, 500, 600, TypefaceStyle.BOLD, 800, 900};
        }

        /* renamed from: a */
        private static int m25886a(int i) {
            if (i < 350) {
                return TypefaceStyle.NORMAL;
            }
            if (i < 550) {
                return TypefaceStyle.BOLD;
            }
            if (i < 900) {
                return 900;
            }
            return i;
        }

        /* renamed from: b */
        static int m25885b(EnumC5228l0 enumC5228l0, C5218h c5218h) {
            if (enumC5228l0 == EnumC5228l0.Bolder) {
                return m25886a(c5218h.f14648f);
            }
            if (enumC5228l0 == EnumC5228l0.Lighter) {
                return m25884c(c5218h.f14648f);
            }
            return f14659b[enumC5228l0.ordinal()];
        }

        /* renamed from: c */
        private static int m25884c(int i) {
            if (i < 100) {
                return i;
            }
            if (i < 550) {
                return 100;
            }
            return i < 750 ? TypefaceStyle.NORMAL : TypefaceStyle.BOLD;
        }

        /* renamed from: d */
        static EnumC5228l0 m25883d(int i) {
            return f14658a[Math.round(i / 100.0f)];
        }
    }

    private C5218h() {
        this.f14646d = null;
        this.f14644b = "";
        this.f14645c = EnumC5224j0.normal;
        this.f14647e = EnumC5228l0.Normal;
        this.f14648f = TypefaceStyle.NORMAL;
        this.f14649g = "";
        this.f14650h = "";
        this.f14651i = EnumC5226k0.normal;
        this.f14652j = EnumC5231m0.start;
        this.f14653k = EnumC5233n0.None;
        this.f14657o = false;
        this.f14654l = 0.0d;
        this.f14643a = 12.0d;
        this.f14655m = 0.0d;
        this.f14656n = 0.0d;
    }

    /* renamed from: a */
    private void m25889a(C5218h c5218h, double d) {
        long round = Math.round(d);
        if (round >= 1 && round <= 1000) {
            int i = (int) round;
            this.f14648f = i;
            this.f14647e = C5219a.m25883d(i);
            return;
        }
        m25888b(c5218h);
    }

    /* renamed from: b */
    private void m25888b(C5218h c5218h) {
        this.f14648f = c5218h.f14648f;
        this.f14647e = c5218h.f14647e;
    }

    /* renamed from: c */
    private double m25887c(ReadableMap readableMap, String str, double d, double d2, double d3) {
        if (readableMap.getType(str) == ReadableType.Number) {
            return readableMap.getDouble(str);
        }
        return C5250x.m25662b(readableMap.getString(str), d3, d, d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5218h(ReadableMap readableMap, C5218h c5218h, double d) {
        String str;
        String str2;
        EnumC5226k0 enumC5226k0;
        EnumC5231m0 enumC5231m0;
        EnumC5233n0 enumC5233n0;
        double d2;
        double d3;
        double d4 = c5218h.f14643a;
        if (readableMap.hasKey(ViewProps.FONT_SIZE)) {
            this.f14643a = m25887c(readableMap, ViewProps.FONT_SIZE, 1.0d, d4, d4);
        } else {
            this.f14643a = d4;
        }
        if (readableMap.hasKey(ViewProps.FONT_WEIGHT)) {
            if (readableMap.getType(ViewProps.FONT_WEIGHT) == ReadableType.Number) {
                m25889a(c5218h, readableMap.getDouble(ViewProps.FONT_WEIGHT));
            } else {
                String string = readableMap.getString(ViewProps.FONT_WEIGHT);
                if (EnumC5228l0.m25828b(string)) {
                    int m25885b = C5219a.m25885b(EnumC5228l0.m25829a(string), c5218h);
                    this.f14648f = m25885b;
                    this.f14647e = C5219a.m25883d(m25885b);
                } else if (string != null) {
                    m25889a(c5218h, Double.parseDouble(string));
                } else {
                    m25888b(c5218h);
                }
            }
        } else {
            m25888b(c5218h);
        }
        this.f14646d = readableMap.hasKey("fontData") ? readableMap.getMap("fontData") : c5218h.f14646d;
        this.f14644b = readableMap.hasKey(ViewProps.FONT_FAMILY) ? readableMap.getString(ViewProps.FONT_FAMILY) : c5218h.f14644b;
        this.f14645c = readableMap.hasKey(ViewProps.FONT_STYLE) ? EnumC5224j0.valueOf(readableMap.getString(ViewProps.FONT_STYLE)) : c5218h.f14645c;
        if (readableMap.hasKey("fontFeatureSettings")) {
            str = readableMap.getString("fontFeatureSettings");
        } else {
            str = c5218h.f14649g;
        }
        this.f14649g = str;
        if (readableMap.hasKey("fontVariationSettings")) {
            str2 = readableMap.getString("fontVariationSettings");
        } else {
            str2 = c5218h.f14650h;
        }
        this.f14650h = str2;
        if (readableMap.hasKey("fontVariantLigatures")) {
            enumC5226k0 = EnumC5226k0.valueOf(readableMap.getString("fontVariantLigatures"));
        } else {
            enumC5226k0 = c5218h.f14651i;
        }
        this.f14651i = enumC5226k0;
        if (readableMap.hasKey("textAnchor")) {
            enumC5231m0 = EnumC5231m0.valueOf(readableMap.getString("textAnchor"));
        } else {
            enumC5231m0 = c5218h.f14652j;
        }
        this.f14652j = enumC5231m0;
        if (readableMap.hasKey("textDecoration")) {
            enumC5233n0 = EnumC5233n0.m25797a(readableMap.getString("textDecoration"));
        } else {
            enumC5233n0 = c5218h.f14653k;
        }
        this.f14653k = enumC5233n0;
        boolean hasKey = readableMap.hasKey("kerning");
        this.f14657o = hasKey || c5218h.f14657o;
        this.f14654l = hasKey ? m25887c(readableMap, "kerning", d, this.f14643a, 0.0d) : c5218h.f14654l;
        if (readableMap.hasKey("wordSpacing")) {
            d2 = m25887c(readableMap, "wordSpacing", d, this.f14643a, 0.0d);
        } else {
            d2 = c5218h.f14655m;
        }
        this.f14655m = d2;
        if (readableMap.hasKey(ViewProps.LETTER_SPACING)) {
            d3 = m25887c(readableMap, ViewProps.LETTER_SPACING, d, this.f14643a, 0.0d);
        } else {
            d3 = c5218h.f14656n;
        }
        this.f14656n = d3;
    }
}

package io.sentry;

/* renamed from: io.sentry.p5 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8054p5 {

    /* renamed from: a */
    private final Boolean f21800a;

    /* renamed from: b */
    private final Double f21801b;

    /* renamed from: c */
    private final Boolean f21802c;

    /* renamed from: d */
    private final Double f21803d;

    public C8054p5(Boolean bool) {
        this(bool, null);
    }

    /* renamed from: a */
    public Boolean m18862a() {
        return this.f21802c;
    }

    /* renamed from: b */
    public Double m18861b() {
        return this.f21801b;
    }

    /* renamed from: c */
    public Boolean m18860c() {
        return this.f21800a;
    }

    public C8054p5(Boolean bool, Double d) {
        this(bool, d, Boolean.FALSE, null);
    }

    public C8054p5(Boolean bool, Double d, Boolean bool2, Double d2) {
        this.f21800a = bool;
        this.f21801b = d;
        this.f21802c = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f21803d = d2;
    }
}

package io.sentry;

import io.sentry.protocol.C8100q;
import io.sentry.protocol.EnumC8118z;
import io.sentry.util.C8229o;

/* renamed from: io.sentry.q5 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8125q5 extends C7911e5 {

    /* renamed from: y */
    private static final EnumC8118z f22029y = EnumC8118z.CUSTOM;

    /* renamed from: t */
    private String f22030t;

    /* renamed from: u */
    private EnumC8118z f22031u;

    /* renamed from: v */
    private C8054p5 f22032v;

    /* renamed from: w */
    private C7891d f22033w;

    /* renamed from: x */
    private EnumC8277z0 f22034x;

    public C8125q5(String str, String str2) {
        this(str, str2, (C8054p5) null);
    }

    /* renamed from: q */
    public static C8125q5 m18463q(C8051p2 c8051p2) {
        C8054p5 c8054p5;
        C8054p5 c8054p52;
        boolean z;
        Boolean m18870f = c8051p2.m18870f();
        if (m18870f == null) {
            c8054p5 = null;
        } else {
            c8054p5 = new C8054p5(m18870f);
        }
        C7891d m18874b = c8051p2.m18874b();
        if (m18874b != null) {
            m18874b.m19453a();
            Double m19446h = m18874b.m19446h();
            if (m18870f != null) {
                z = m18870f.booleanValue();
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (m19446h != null) {
                c8054p52 = new C8054p5(valueOf, m19446h);
                return new C8125q5(c8051p2.m18871e(), c8051p2.m18872d(), c8051p2.m18873c(), c8054p52, m18874b);
            }
            c8054p5 = new C8054p5(valueOf);
        }
        c8054p52 = c8054p5;
        return new C8125q5(c8051p2.m18871e(), c8051p2.m18872d(), c8051p2.m18873c(), c8054p52, m18874b);
    }

    /* renamed from: r */
    public C7891d m18462r() {
        return this.f22033w;
    }

    /* renamed from: s */
    public EnumC8277z0 m18461s() {
        return this.f22034x;
    }

    /* renamed from: t */
    public String m18460t() {
        return this.f22030t;
    }

    /* renamed from: u */
    public C8054p5 m18459u() {
        return this.f22032v;
    }

    /* renamed from: v */
    public EnumC8118z m18458v() {
        return this.f22031u;
    }

    public C8125q5(String str, EnumC8118z enumC8118z, String str2) {
        this(str, enumC8118z, str2, null);
    }

    public C8125q5(String str, String str2, C8054p5 c8054p5) {
        this(str, EnumC8118z.CUSTOM, str2, c8054p5);
    }

    public C8125q5(String str, EnumC8118z enumC8118z, String str2, C8054p5 c8054p5) {
        super(str2);
        this.f22034x = EnumC8277z0.SENTRY;
        this.f22030t = (String) C8229o.m18169c(str, "name is required");
        this.f22031u = enumC8118z;
        m19292n(c8054p5);
    }

    public C8125q5(C8100q c8100q, C7932g5 c7932g5, C7932g5 c7932g52, C8054p5 c8054p5, C7891d c7891d) {
        super(c8100q, c7932g5, "default", c7932g52, null);
        this.f22034x = EnumC8277z0.SENTRY;
        this.f22030t = "<unlabeled transaction>";
        this.f22032v = c8054p5;
        this.f22031u = f22029y;
        this.f22033w = c7891d;
    }
}

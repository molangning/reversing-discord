package ac;

import ac.C0139a;
import ac.C0143c;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: ac.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC0145d {

    /* renamed from: a */
    public static AbstractC0145d f546a = m41098a().mo41078a();

    @AutoValue.Builder
    /* renamed from: ac.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC0146a {
        /* renamed from: a */
        public abstract AbstractC0145d mo41078a();

        /* renamed from: b */
        public abstract AbstractC0146a mo41077b(String str);

        /* renamed from: c */
        public abstract AbstractC0146a mo41076c(long j);

        /* renamed from: d */
        public abstract AbstractC0146a mo41075d(String str);

        /* renamed from: e */
        public abstract AbstractC0146a mo41074e(String str);

        /* renamed from: f */
        public abstract AbstractC0146a mo41073f(String str);

        /* renamed from: g */
        public abstract AbstractC0146a mo41072g(C0143c.EnumC0144a enumC0144a);

        /* renamed from: h */
        public abstract AbstractC0146a mo41071h(long j);
    }

    /* renamed from: a */
    public static AbstractC0146a m41098a() {
        return new C0139a.C0141b().mo41071h(0L).mo41072g(C0143c.EnumC0144a.ATTEMPT_MIGRATION).mo41076c(0L);
    }

    /* renamed from: b */
    public abstract String mo41097b();

    /* renamed from: c */
    public abstract long mo41096c();

    /* renamed from: d */
    public abstract String mo41095d();

    /* renamed from: e */
    public abstract String mo41094e();

    /* renamed from: f */
    public abstract String mo41093f();

    /* renamed from: g */
    public abstract C0143c.EnumC0144a mo41092g();

    /* renamed from: h */
    public abstract long mo41091h();

    /* renamed from: i */
    public boolean m41090i() {
        return mo41092g() == C0143c.EnumC0144a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean m41089j() {
        if (mo41092g() != C0143c.EnumC0144a.NOT_GENERATED && mo41092g() != C0143c.EnumC0144a.ATTEMPT_MIGRATION) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public boolean m41088k() {
        return mo41092g() == C0143c.EnumC0144a.REGISTERED;
    }

    /* renamed from: l */
    public boolean m41087l() {
        return mo41092g() == C0143c.EnumC0144a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean m41086m() {
        return mo41092g() == C0143c.EnumC0144a.ATTEMPT_MIGRATION;
    }

    /* renamed from: n */
    public abstract AbstractC0146a mo41085n();

    /* renamed from: o */
    public AbstractC0145d m41084o(String str, long j, long j2) {
        return mo41085n().mo41077b(str).mo41076c(j).mo41071h(j2).mo41078a();
    }

    /* renamed from: p */
    public AbstractC0145d m41083p() {
        return mo41085n().mo41077b(null).mo41078a();
    }

    /* renamed from: q */
    public AbstractC0145d m41082q(String str) {
        return mo41085n().mo41074e(str).mo41072g(C0143c.EnumC0144a.REGISTER_ERROR).mo41078a();
    }

    /* renamed from: r */
    public AbstractC0145d m41081r() {
        return mo41085n().mo41072g(C0143c.EnumC0144a.NOT_GENERATED).mo41078a();
    }

    /* renamed from: s */
    public AbstractC0145d m41080s(String str, String str2, long j, String str3, long j2) {
        return mo41085n().mo41075d(str).mo41072g(C0143c.EnumC0144a.REGISTERED).mo41077b(str3).mo41073f(str2).mo41076c(j2).mo41071h(j).mo41078a();
    }

    /* renamed from: t */
    public AbstractC0145d m41079t(String str) {
        return mo41085n().mo41075d(str).mo41072g(C0143c.EnumC0144a.UNREGISTERED).mo41078a();
    }
}

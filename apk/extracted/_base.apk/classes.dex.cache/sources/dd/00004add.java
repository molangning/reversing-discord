package p305qg;

import java.util.Map;
import kotlin.jvm.internal.C9612q;
import p304qf.C11888u;

/* renamed from: qg.m1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11949m1 {

    /* renamed from: a */
    public static final C11949m1 f30945a = new C11949m1();

    /* renamed from: b */
    private static final Map<AbstractC11963n1, Integer> f30946b;

    /* renamed from: c */
    private static final C11957h f30947c;

    /* renamed from: qg.m1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11950a extends AbstractC11963n1 {

        /* renamed from: c */
        public static final C11950a f30948c = new C11950a();

        private C11950a() {
            super("inherited", false);
        }
    }

    /* renamed from: qg.m1$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11951b extends AbstractC11963n1 {

        /* renamed from: c */
        public static final C11951b f30949c = new C11951b();

        private C11951b() {
            super("internal", false);
        }
    }

    /* renamed from: qg.m1$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11952c extends AbstractC11963n1 {

        /* renamed from: c */
        public static final C11952c f30950c = new C11952c();

        private C11952c() {
            super("invisible_fake", false);
        }
    }

    /* renamed from: qg.m1$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11953d extends AbstractC11963n1 {

        /* renamed from: c */
        public static final C11953d f30951c = new C11953d();

        private C11953d() {
            super("local", false);
        }
    }

    /* renamed from: qg.m1$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11954e extends AbstractC11963n1 {

        /* renamed from: c */
        public static final C11954e f30952c = new C11954e();

        private C11954e() {
            super("private", false);
        }
    }

    /* renamed from: qg.m1$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11955f extends AbstractC11963n1 {

        /* renamed from: c */
        public static final C11955f f30953c = new C11955f();

        private C11955f() {
            super("private_to_this", false);
        }

        @Override // p305qg.AbstractC11963n1
        /* renamed from: b */
        public String mo3568b() {
            return "private/*private to this*/";
        }
    }

    /* renamed from: qg.m1$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11956g extends AbstractC11963n1 {

        /* renamed from: c */
        public static final C11956g f30954c = new C11956g();

        private C11956g() {
            super("protected", true);
        }
    }

    /* renamed from: qg.m1$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11957h extends AbstractC11963n1 {

        /* renamed from: c */
        public static final C11957h f30955c = new C11957h();

        private C11957h() {
            super("public", true);
        }
    }

    /* renamed from: qg.m1$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11958i extends AbstractC11963n1 {

        /* renamed from: c */
        public static final C11958i f30956c = new C11958i();

        private C11958i() {
            super("unknown", false);
        }
    }

    static {
        Map m6759c;
        Map<AbstractC11963n1, Integer> m6760b;
        m6759c = C11888u.m6759c();
        m6759c.put(C11955f.f30953c, 0);
        m6759c.put(C11954e.f30952c, 0);
        m6759c.put(C11951b.f30949c, 1);
        m6759c.put(C11956g.f30954c, 1);
        C11957h c11957h = C11957h.f30955c;
        m6759c.put(c11957h, 2);
        m6760b = C11888u.m6760b(m6759c);
        f30946b = m6760b;
        f30947c = c11957h;
    }

    private C11949m1() {
    }

    /* renamed from: a */
    public final Integer m6692a(AbstractC11963n1 first, AbstractC11963n1 second) {
        C9612q.m13917h(first, "first");
        C9612q.m13917h(second, "second");
        if (first == second) {
            return 0;
        }
        Map<AbstractC11963n1, Integer> map = f30946b;
        Integer num = map.get(first);
        Integer num2 = map.get(second);
        if (num != null && num2 != null && !C9612q.m13922c(num, num2)) {
            return Integer.valueOf(num.intValue() - num2.intValue());
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m6691b(AbstractC11963n1 visibility) {
        C9612q.m13917h(visibility, "visibility");
        if (visibility != C11954e.f30952c && visibility != C11955f.f30953c) {
            return false;
        }
        return true;
    }
}
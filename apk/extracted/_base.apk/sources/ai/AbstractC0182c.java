package ai;

import ai.C0185d;

/* renamed from: ai.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC0182c {

    /* renamed from: ai.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C0183a extends AbstractC0182c {

        /* renamed from: a */
        public static final C0183a f605a = new C0183a();

        /* renamed from: b */
        private static final int f606b;

        static {
            C0185d.C0186a c0186a = C0185d.f608c;
            f606b = (~(c0186a.m40983i() | c0186a.m40988d())) & c0186a.m40990b();
        }

        private C0183a() {
        }

        @Override // ai.AbstractC0182c
        /* renamed from: a */
        public int mo41006a() {
            return f606b;
        }
    }

    /* renamed from: ai.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C0184b extends AbstractC0182c {

        /* renamed from: a */
        public static final C0184b f607a = new C0184b();

        private C0184b() {
        }

        @Override // ai.AbstractC0182c
        /* renamed from: a */
        public int mo41006a() {
            return 0;
        }
    }

    /* renamed from: a */
    public abstract int mo41006a();

    public String toString() {
        return getClass().getSimpleName();
    }
}

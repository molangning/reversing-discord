package p458z5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p353tb.InterfaceC12629d;

/* renamed from: z5.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14096d {

    /* renamed from: c */
    private static final C14096d f36272c = new C14097a().m678a();

    /* renamed from: a */
    private final String f36273a;

    /* renamed from: b */
    private final List<C14093c> f36274b;

    /* renamed from: z5.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14097a {

        /* renamed from: a */
        private String f36275a = "";

        /* renamed from: b */
        private List<C14093c> f36276b = new ArrayList();

        C14097a() {
        }

        /* renamed from: a */
        public C14096d m678a() {
            return new C14096d(this.f36275a, Collections.unmodifiableList(this.f36276b));
        }

        /* renamed from: b */
        public C14097a m677b(List<C14093c> list) {
            this.f36276b = list;
            return this;
        }

        /* renamed from: c */
        public C14097a m676c(String str) {
            this.f36275a = str;
            return this;
        }
    }

    C14096d(String str, List<C14093c> list) {
        this.f36273a = str;
        this.f36274b = list;
    }

    /* renamed from: c */
    public static C14097a m679c() {
        return new C14097a();
    }

    @InterfaceC12629d(tag = 2)
    /* renamed from: a */
    public List<C14093c> m681a() {
        return this.f36274b;
    }

    @InterfaceC12629d(tag = 1)
    /* renamed from: b */
    public String m680b() {
        return this.f36273a;
    }
}
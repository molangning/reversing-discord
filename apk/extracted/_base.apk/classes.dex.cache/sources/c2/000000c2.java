package ai;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC12005z0;
import p448yg.InterfaceC14020b;
import ph.C11638f;

/* renamed from: ai.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface InterfaceC0194h extends InterfaceC0200k {

    /* renamed from: a */
    public static final C0195a f645a = C0195a.f646a;

    /* renamed from: ai.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C0195a {

        /* renamed from: a */
        static final /* synthetic */ C0195a f646a = new C0195a();

        /* renamed from: b */
        private static final Function1<C11638f, Boolean> f647b = C0196a.f648j;

        /* renamed from: ai.h$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static final class C0196a extends AbstractC9614s implements Function1<C11638f, Boolean> {

            /* renamed from: j */
            public static final C0196a f648j = new C0196a();

            C0196a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(C11638f it) {
                C9612q.m13917h(it, "it");
                return Boolean.TRUE;
            }
        }

        private C0195a() {
        }

        /* renamed from: a */
        public final Function1<C11638f, Boolean> m40973a() {
            return f647b;
        }
    }

    /* renamed from: ai.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C0197b extends AbstractC0198i {

        /* renamed from: b */
        public static final C0197b f649b = new C0197b();

        private C0197b() {
        }

        @Override // ai.AbstractC0198i, ai.InterfaceC0194h
        /* renamed from: b */
        public Set<C11638f> mo4361b() {
            Set<C11638f> m14007d;
            m14007d = C9560w.m14007d();
            return m14007d;
        }

        @Override // ai.AbstractC0198i, ai.InterfaceC0194h
        /* renamed from: d */
        public Set<C11638f> mo4359d() {
            Set<C11638f> m14007d;
            m14007d = C9560w.m14007d();
            return m14007d;
        }

        @Override // ai.AbstractC0198i, ai.InterfaceC0194h
        /* renamed from: f */
        public Set<C11638f> mo4357f() {
            Set<C11638f> m14007d;
            m14007d = C9560w.m14007d();
            return m14007d;
        }
    }

    /* renamed from: a */
    Collection<? extends InterfaceC12005z0> mo4362a(C11638f c11638f, InterfaceC14020b interfaceC14020b);

    /* renamed from: b */
    Set<C11638f> mo4361b();

    /* renamed from: c */
    Collection<? extends InterfaceC11989u0> mo4360c(C11638f c11638f, InterfaceC14020b interfaceC14020b);

    /* renamed from: d */
    Set<C11638f> mo4359d();

    /* renamed from: f */
    Set<C11638f> mo4357f();
}
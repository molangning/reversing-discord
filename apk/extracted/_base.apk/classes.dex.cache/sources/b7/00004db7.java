package tg;

import gi.InterfaceC6821n;
import kotlin.jvm.internal.C9612q;
import p305qg.C11922g0;
import p305qg.InterfaceC11969q0;
import ph.C11633c;

/* renamed from: tg.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface InterfaceC12679a0 {

    /* renamed from: a */
    public static final C12680a f32862a = C12680a.f32863a;

    /* renamed from: tg.a0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12680a {

        /* renamed from: a */
        static final /* synthetic */ C12680a f32863a = new C12680a();

        /* renamed from: b */
        private static final C11922g0<InterfaceC12679a0> f32864b = new C11922g0<>("PackageViewDescriptorFactory");

        private C12680a() {
        }

        /* renamed from: a */
        public final C11922g0<InterfaceC12679a0> m4544a() {
            return f32864b;
        }
    }

    /* renamed from: tg.a0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12681b implements InterfaceC12679a0 {

        /* renamed from: b */
        public static final C12681b f32865b = new C12681b();

        private C12681b() {
        }

        @Override // tg.InterfaceC12679a0
        /* renamed from: a */
        public InterfaceC11969q0 mo4543a(C12744x module, C11633c fqName, InterfaceC6821n storageManager) {
            C9612q.m13917h(module, "module");
            C9612q.m13917h(fqName, "fqName");
            C9612q.m13917h(storageManager, "storageManager");
            return new C12732r(module, fqName, storageManager);
        }
    }

    /* renamed from: a */
    InterfaceC11969q0 mo4543a(C12744x c12744x, C11633c c11633c, InterfaceC6821n interfaceC6821n);
}
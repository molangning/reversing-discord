package pg;

import gi.C6820m;
import gi.InterfaceC6815i;
import gi.InterfaceC6821n;
import java.util.List;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KProperty;
import ng.AbstractC10870h;
import p305qg.InterfaceC11928h0;
import sg.InterfaceC12471a;
import sg.InterfaceC12473b;
import sg.InterfaceC12474c;
import tg.C12744x;

/* renamed from: pg.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11606f extends AbstractC10870h {

    /* renamed from: k */
    static final /* synthetic */ KProperty<Object>[] f30142k = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C11606f.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: h */
    private final EnumC11607a f30143h;

    /* renamed from: i */
    private Function0<C11608b> f30144i;

    /* renamed from: j */
    private final InterfaceC6815i f30145j;

    /* renamed from: pg.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum EnumC11607a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* renamed from: pg.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11608b {

        /* renamed from: a */
        private final InterfaceC11928h0 f30150a;

        /* renamed from: b */
        private final boolean f30151b;

        public C11608b(InterfaceC11928h0 ownerModuleDescriptor, boolean z) {
            C9612q.m13917h(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f30150a = ownerModuleDescriptor;
            this.f30151b = z;
        }

        /* renamed from: a */
        public final InterfaceC11928h0 m7518a() {
            return this.f30150a;
        }

        /* renamed from: b */
        public final boolean m7517b() {
            return this.f30151b;
        }
    }

    /* renamed from: pg.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class C11609c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30152a;

        static {
            int[] iArr = new int[EnumC11607a.values().length];
            try {
                iArr[EnumC11607a.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11607a.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11607a.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30152a = iArr;
        }
    }

    /* renamed from: pg.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C11610d extends AbstractC9614s implements Function0<C11615i> {

        /* renamed from: k */
        final /* synthetic */ InterfaceC6821n f30154k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: pg.f$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C11611a extends AbstractC9614s implements Function0<C11608b> {

            /* renamed from: j */
            final /* synthetic */ C11606f f30155j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11611a(C11606f c11606f) {
                super(0);
                this.f30155j = c11606f;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final C11608b invoke() {
                Function0 function0 = this.f30155j.f30144i;
                if (function0 != null) {
                    C11608b c11608b = (C11608b) function0.invoke();
                    this.f30155j.f30144i = null;
                    return c11608b;
                }
                throw new AssertionError("JvmBuiltins instance has not been initialized properly");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11610d(InterfaceC6821n interfaceC6821n) {
            super(0);
            this.f30154k = interfaceC6821n;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C11615i invoke() {
            C12744x builtInsModule = C11606f.this.m9792r();
            C9612q.m13918g(builtInsModule, "builtInsModule");
            return new C11615i(builtInsModule, this.f30154k, new C11611a(C11606f.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pg.f$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11612e extends AbstractC9614s implements Function0<C11608b> {

        /* renamed from: j */
        final /* synthetic */ InterfaceC11928h0 f30156j;

        /* renamed from: k */
        final /* synthetic */ boolean f30157k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11612e(InterfaceC11928h0 interfaceC11928h0, boolean z) {
            super(0);
            this.f30156j = interfaceC11928h0;
            this.f30157k = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C11608b invoke() {
            return new C11608b(this.f30156j, this.f30157k);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11606f(InterfaceC6821n storageManager, EnumC11607a kind) {
        super(storageManager);
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(kind, "kind");
        this.f30143h = kind;
        this.f30145j = storageManager.mo21867c(new C11610d(storageManager));
        int i = C11609c.f30152a[kind.ordinal()];
        if (i != 2) {
            if (i == 3) {
                m9815f(true);
                return;
            }
            return;
        }
        m9815f(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ng.AbstractC10870h
    /* renamed from: G0 */
    public List<InterfaceC12473b> mo7520v() {
        List<InterfaceC12473b> m14037m0;
        Iterable<InterfaceC12473b> mo7520v = super.mo7520v();
        C9612q.m13918g(mo7520v, "super.getClassDescriptorFactories()");
        InterfaceC6821n storageManager = m9831U();
        C9612q.m13918g(storageManager, "storageManager");
        C12744x builtInsModule = m9792r();
        C9612q.m13918g(builtInsModule, "builtInsModule");
        m14037m0 = C9553r.m14037m0(mo7520v, new C11602e(storageManager, builtInsModule, null, 4, null));
        return m14037m0;
    }

    /* renamed from: H0 */
    public final C11615i m7525H0() {
        return (C11615i) C6820m.m21871a(this.f30145j, this, f30142k[0]);
    }

    /* renamed from: I0 */
    public final void m7524I0(InterfaceC11928h0 moduleDescriptor, boolean z) {
        C9612q.m13917h(moduleDescriptor, "moduleDescriptor");
        m7523J0(new C11612e(moduleDescriptor, z));
    }

    /* renamed from: J0 */
    public final void m7523J0(Function0<C11608b> computation) {
        C9612q.m13917h(computation, "computation");
        this.f30144i = computation;
    }

    @Override // ng.AbstractC10870h
    /* renamed from: M */
    protected InterfaceC12474c mo7522M() {
        return m7525H0();
    }

    @Override // ng.AbstractC10870h
    /* renamed from: g */
    protected InterfaceC12471a mo7521g() {
        return m7525H0();
    }
}

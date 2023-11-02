package ng;

import gi.InterfaceC6821n;
import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11948m0;
import pf.C11577n;
import pf.EnumC11580p;
import sg.InterfaceC12471a;
import sg.InterfaceC12473b;
import sg.InterfaceC12474c;

/* renamed from: ng.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface InterfaceC10860a {

    /* renamed from: a */
    public static final C10861a f28353a = C10861a.f28354a;

    /* renamed from: ng.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C10861a {

        /* renamed from: a */
        static final /* synthetic */ C10861a f28354a = new C10861a();

        /* renamed from: b */
        private static final Lazy<InterfaceC10860a> f28355b;

        /* renamed from: ng.a$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C10862a extends AbstractC9614s implements Function0<InterfaceC10860a> {

            /* renamed from: j */
            public static final C10862a f28356j = new C10862a();

            C10862a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC10860a invoke() {
                Object m14055U;
                ServiceLoader implementations = ServiceLoader.load(InterfaceC10860a.class, InterfaceC10860a.class.getClassLoader());
                C9612q.m13918g(implementations, "implementations");
                m14055U = C9553r.m14055U(implementations);
                InterfaceC10860a interfaceC10860a = (InterfaceC10860a) m14055U;
                if (interfaceC10860a != null) {
                    return interfaceC10860a;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }

        static {
            Lazy<InterfaceC10860a> m7600b;
            m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, C10862a.f28356j);
            f28355b = m7600b;
        }

        private C10861a() {
        }

        /* renamed from: a */
        public final InterfaceC10860a m9881a() {
            return f28355b.getValue();
        }
    }

    /* renamed from: a */
    InterfaceC11948m0 mo9882a(InterfaceC6821n interfaceC6821n, InterfaceC11928h0 interfaceC11928h0, Iterable<? extends InterfaceC12473b> iterable, InterfaceC12474c interfaceC12474c, InterfaceC12471a interfaceC12471a, boolean z);
}

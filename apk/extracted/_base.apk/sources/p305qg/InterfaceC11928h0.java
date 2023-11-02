package p305qg;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import ph.C11633c;
import ph.C11638f;

/* renamed from: qg.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface InterfaceC11928h0 extends InterfaceC11947m {

    /* renamed from: qg.h0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11929a {
        /* renamed from: a */
        public static <R, D> R m6708a(InterfaceC11928h0 interfaceC11928h0, InterfaceC11964o<R, D> visitor, D d) {
            C9612q.m13917h(visitor, "visitor");
            return visitor.mo4384k(interfaceC11928h0, d);
        }

        /* renamed from: b */
        public static InterfaceC11947m m6707b(InterfaceC11928h0 interfaceC11928h0) {
            return null;
        }
    }

    /* renamed from: H0 */
    InterfaceC11969q0 mo4210H0(C11633c c11633c);

    /* renamed from: n */
    AbstractC10870h mo4194n();

    /* renamed from: t */
    Collection<C11633c> mo4193t(C11633c c11633c, Function1<? super C11638f, Boolean> function1);

    /* renamed from: u0 */
    boolean mo4192u0(InterfaceC11928h0 interfaceC11928h0);

    /* renamed from: w */
    <T> T mo4191w(C11922g0<T> c11922g0);

    /* renamed from: z0 */
    List<InterfaceC11928h0> mo4190z0();
}

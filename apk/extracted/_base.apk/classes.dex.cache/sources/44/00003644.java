package p142hi;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p161ii.AbstractC7592g;
import p161ii.InterfaceC7587e;
import p234mi.C10472a;
import p305qg.InterfaceC11920f1;
import pf.C11581q;
import sh.AbstractC12485c;
import sh.InterfaceC12513f;

/* renamed from: hi.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7220b0 extends AbstractC7217a0 implements InterfaceC7295n {

    /* renamed from: n */
    public static final C7221a f19616n = new C7221a(null);

    /* renamed from: o */
    public static boolean f19617o;

    /* renamed from: m */
    private boolean f19618m;

    /* renamed from: hi.b0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7221a {
        private C7221a() {
        }

        public /* synthetic */ C7221a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7220b0(AbstractC7302o0 lowerBound, AbstractC7302o0 upperBound) {
        super(lowerBound, upperBound);
        C9612q.m13917h(lowerBound, "lowerBound");
        C9612q.m13917h(upperBound, "upperBound");
    }

    /* renamed from: Z0 */
    private final void m21214Z0() {
        if (f19617o && !this.f19618m) {
            this.f19618m = true;
            C7229d0.m21192b(m21218V0());
            C7229d0.m21192b(m21217W0());
            C9612q.m13922c(m21218V0(), m21217W0());
            InterfaceC7587e.f20880a.mo20256b(m21218V0(), m21217W0());
        }
    }

    @Override // p142hi.InterfaceC7295n
    /* renamed from: E0 */
    public boolean mo21041E0() {
        if ((m21218V0().mo3564N0().mo2788p() instanceof InterfaceC11920f1) && C9612q.m13922c(m21218V0().mo3564N0(), m21217W0().mo3564N0())) {
            return true;
        }
        return false;
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: R0 */
    public AbstractC7333v1 mo3561R0(boolean z) {
        return C7267h0.m21104d(m21218V0().mo3558U0(z), m21217W0().mo3558U0(z));
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: T0 */
    public AbstractC7333v1 mo3559T0(C7226c1 newAttributes) {
        C9612q.m13917h(newAttributes, "newAttributes");
        return C7267h0.m21104d(m21218V0().mo3557V0(newAttributes), m21217W0().mo3557V0(newAttributes));
    }

    @Override // p142hi.AbstractC7217a0
    /* renamed from: U0 */
    public AbstractC7302o0 mo20945U0() {
        m21214Z0();
        return m21218V0();
    }

    @Override // p142hi.AbstractC7217a0
    /* renamed from: X0 */
    public String mo20944X0(AbstractC12485c renderer, InterfaceC12513f options) {
        C9612q.m13917h(renderer, "renderer");
        C9612q.m13917h(options, "options");
        if (options.mo4966i()) {
            return '(' + renderer.mo5044w(m21218V0()) + ".." + renderer.mo5044w(m21217W0()) + ')';
        }
        return renderer.mo5053t(renderer.mo5044w(m21218V0()), renderer.mo5044w(m21217W0()), C10472a.m11449i(this));
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: Y0 */
    public AbstractC7217a0 mo3560S0(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7264g0 mo20276h = kotlinTypeRefiner.mo20276h(m21218V0());
        C9612q.m13919f(mo20276h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC7264g0 mo20276h2 = kotlinTypeRefiner.mo20276h(m21217W0());
        C9612q.m13919f(mo20276h2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C7220b0((AbstractC7302o0) mo20276h, (AbstractC7302o0) mo20276h2);
    }

    @Override // p142hi.InterfaceC7295n
    /* renamed from: r0 */
    public AbstractC7264g0 mo21038r0(AbstractC7264g0 replacement) {
        AbstractC7333v1 m21104d;
        C9612q.m13917h(replacement, "replacement");
        AbstractC7333v1 mo20916Q0 = replacement.mo20916Q0();
        if (mo20916Q0 instanceof AbstractC7217a0) {
            m21104d = mo20916Q0;
        } else if (mo20916Q0 instanceof AbstractC7302o0) {
            AbstractC7302o0 abstractC7302o0 = (AbstractC7302o0) mo20916Q0;
            m21104d = C7267h0.m21104d(abstractC7302o0, abstractC7302o0.mo3558U0(true));
        } else {
            throw new C11581q();
        }
        return C7329u1.m20948b(m21104d, mo20916Q0);
    }

    @Override // p142hi.AbstractC7217a0
    public String toString() {
        return '(' + m21218V0() + ".." + m21217W0() + ')';
    }
}
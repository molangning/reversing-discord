package p142hi;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li.InterfaceC10196e;
import p161ii.C7595i;
import p161ii.C7606o;
import p161ii.InterfaceC7605n;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import tg.C12711k0;

/* renamed from: hi.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7304p extends AbstractC7315r implements InterfaceC7295n, InterfaceC10196e {

    /* renamed from: m */
    public static final C7305a f19733m = new C7305a(null);

    /* renamed from: k */
    private final AbstractC7302o0 f19734k;

    /* renamed from: l */
    private final boolean f19735l;

    /* renamed from: hi.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7305a {
        private C7305a() {
        }

        public /* synthetic */ C7305a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final boolean m21037a(AbstractC7333v1 abstractC7333v1) {
            if (!(abstractC7333v1.mo3564N0() instanceof InterfaceC7605n) && !(abstractC7333v1.mo3564N0().mo2788p() instanceof InterfaceC11920f1) && !(abstractC7333v1 instanceof C7595i) && !(abstractC7333v1 instanceof C7335w0)) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        private final boolean m21035c(AbstractC7333v1 abstractC7333v1, boolean z) {
            C12711k0 c12711k0;
            boolean z2 = false;
            if (!m21037a(abstractC7333v1)) {
                return false;
            }
            if (abstractC7333v1 instanceof C7335w0) {
                return C7320s1.m20983l(abstractC7333v1);
            }
            InterfaceC11927h mo2788p = abstractC7333v1.mo3564N0().mo2788p();
            if (mo2788p instanceof C12711k0) {
                c12711k0 = (C12711k0) mo2788p;
            } else {
                c12711k0 = null;
            }
            if (c12711k0 != null && !c12711k0.m4397T0()) {
                z2 = true;
            }
            if (z2) {
                return true;
            }
            if (z && (abstractC7333v1.mo3564N0().mo2788p() instanceof InterfaceC11920f1)) {
                return C7320s1.m20983l(abstractC7333v1);
            }
            return !C7606o.f20906a.m20249a(abstractC7333v1);
        }

        /* renamed from: b */
        public final C7304p m21036b(AbstractC7333v1 type, boolean z) {
            C9612q.m13917h(type, "type");
            if (type instanceof C7304p) {
                return (C7304p) type;
            }
            if (!m21035c(type, z)) {
                return null;
            }
            if (type instanceof AbstractC7217a0) {
                AbstractC7217a0 abstractC7217a0 = (AbstractC7217a0) type;
                C9612q.m13922c(abstractC7217a0.m21218V0().mo3564N0(), abstractC7217a0.m21217W0().mo3564N0());
            }
            return new C7304p(C7229d0.m21191c(type).mo3558U0(false), z, null);
        }
    }

    private C7304p(AbstractC7302o0 abstractC7302o0, boolean z) {
        this.f19734k = abstractC7302o0;
        this.f19735l = z;
    }

    public /* synthetic */ C7304p(AbstractC7302o0 abstractC7302o0, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC7302o0, z);
    }

    @Override // p142hi.InterfaceC7295n
    /* renamed from: E0 */
    public boolean mo21041E0() {
        if (!(mo20971W0().mo3564N0() instanceof InterfaceC7605n) && !(mo20971W0().mo3564N0().mo2788p() instanceof InterfaceC11920f1)) {
            return false;
        }
        return true;
    }

    @Override // p142hi.AbstractC7315r, p142hi.AbstractC7264g0
    /* renamed from: O0 */
    public boolean mo3563O0() {
        return false;
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: U0 */
    public AbstractC7302o0 mo3561R0(boolean z) {
        return z ? mo20971W0().mo3558U0(z) : this;
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: V0 */
    public AbstractC7302o0 mo3559T0(C7226c1 newAttributes) {
        C9612q.m13917h(newAttributes, "newAttributes");
        return new C7304p(mo20971W0().mo3557V0(newAttributes), this.f19735l);
    }

    @Override // p142hi.AbstractC7315r
    /* renamed from: W0 */
    protected AbstractC7302o0 mo20971W0() {
        return this.f19734k;
    }

    /* renamed from: Z0 */
    public final AbstractC7302o0 m21040Z0() {
        return this.f19734k;
    }

    @Override // p142hi.AbstractC7315r
    /* renamed from: a1 */
    public C7304p mo20969Y0(AbstractC7302o0 delegate) {
        C9612q.m13917h(delegate, "delegate");
        return new C7304p(delegate, this.f19735l);
    }

    @Override // p142hi.InterfaceC7295n
    /* renamed from: r0 */
    public AbstractC7264g0 mo21038r0(AbstractC7264g0 replacement) {
        C9612q.m13917h(replacement, "replacement");
        return C7319s0.m21001e(replacement.mo20916Q0(), this.f19735l);
    }

    @Override // p142hi.AbstractC7302o0
    public String toString() {
        return mo20971W0() + " & Any";
    }
}
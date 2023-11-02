package p183ji;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import ng.C10866e;
import p142hi.AbstractC7264g0;
import p142hi.InterfaceC7265g1;
import p161ii.AbstractC7592g;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;

/* renamed from: ji.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C8965i implements InterfaceC7265g1 {

    /* renamed from: a */
    private final EnumC8966j f23464a;

    /* renamed from: b */
    private final String[] f23465b;

    /* renamed from: c */
    private final String f23466c;

    public C8965i(EnumC8966j kind, String... formatParams) {
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(formatParams, "formatParams");
        this.f23464a = kind;
        this.f23465b = formatParams;
        String m16962b = EnumC8957b.ERROR_TYPE.m16962b();
        String m16950b = kind.m16950b();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        String format = String.format(m16950b, Arrays.copyOf(copyOf, copyOf.length));
        C9612q.m13918g(format, "format(this, *args)");
        String format2 = String.format(m16962b, Arrays.copyOf(new Object[]{format}, 1));
        C9612q.m13918g(format2, "format(this, *args)");
        this.f23466c = format2;
    }

    /* renamed from: c */
    public final EnumC8966j m16953c() {
        return this.f23464a;
    }

    /* renamed from: d */
    public final String m16952d(int i) {
        return this.f23465b[i];
    }

    @Override // p142hi.InterfaceC7265g1
    public List<InterfaceC11920f1> getParameters() {
        List<InterfaceC11920f1> m14104i;
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: m */
    public Collection<AbstractC7264g0> mo2791m() {
        List m14104i;
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: n */
    public AbstractC10870h mo2790n() {
        return C10866e.f28359h.m9875a();
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: o */
    public InterfaceC7265g1 mo2789o(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: p */
    public InterfaceC11927h mo2788p() {
        return C8967k.f23554a.m16941h();
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: q */
    public boolean mo2787q() {
        return false;
    }

    public String toString() {
        return this.f23466c;
    }
}
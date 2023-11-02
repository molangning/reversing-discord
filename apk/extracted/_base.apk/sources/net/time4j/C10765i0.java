package net.time4j;

import java.lang.Comparable;
import java.util.concurrent.TimeUnit;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;

/* renamed from: net.time4j.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
class C10765i0<U extends Comparable<U>> implements InterfaceC7664p<U> {

    /* renamed from: m */
    static final InterfaceC7664p<EnumC10704g> f28084m = new C10765i0(EnumC10704g.class, EnumC10704g.f27924j, EnumC10704g.f27929o);

    /* renamed from: n */
    static final InterfaceC7664p<TimeUnit> f28085n = new C10765i0(TimeUnit.class, TimeUnit.DAYS, TimeUnit.NANOSECONDS);

    /* renamed from: j */
    private final Class<U> f28086j;

    /* renamed from: k */
    private final transient U f28087k;

    /* renamed from: l */
    private final transient U f28088l;

    private C10765i0(Class<U> cls, U u, U u2) {
        this.f28086j = cls;
        this.f28087k = u;
        this.f28088l = u2;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: M */
    public boolean mo9555M() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: V */
    public boolean mo9553V() {
        return true;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: a */
    public char mo9552a() {
        return (char) 0;
    }

    @Override // java.util.Comparator
    /* renamed from: b */
    public int compare(InterfaceC7662o interfaceC7662o, InterfaceC7662o interfaceC7662o2) {
        Comparable comparable = (Comparable) interfaceC7662o.mo10212i(this);
        Comparable comparable2 = (Comparable) interfaceC7662o2.mo10212i(this);
        if (this.f28086j == EnumC10704g.class) {
            return comparable.compareTo(comparable2);
        }
        return comparable2.compareTo(comparable);
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: c */
    public U mo9551e() {
        return this.f28088l;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: f */
    public U mo9554U() {
        return this.f28087k;
    }

    @Override // p162ij.InterfaceC7664p
    public Class<U> getType() {
        return this.f28086j;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: k */
    public boolean mo9930k() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    public String name() {
        return "PRECISION";
    }
}

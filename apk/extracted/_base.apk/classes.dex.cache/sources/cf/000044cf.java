package net.time4j;

import java.io.InvalidObjectException;
import java.math.BigDecimal;
import p162ij.AbstractC7665q;
import p162ij.InterfaceC7668t;

/* renamed from: net.time4j.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10792s extends AbstractC10581a<Integer> implements InterfaceC10773k0<Integer, C10697f0> {
    private static final long serialVersionUID = -1337148214680014674L;

    /* renamed from: m */
    private final transient int f28168m;

    /* renamed from: n */
    private final transient Integer f28169n;

    /* renamed from: o */
    private final transient Integer f28170o;

    /* renamed from: p */
    private final transient char f28171p;

    /* renamed from: q */
    private final transient InterfaceC7668t<AbstractC7665q<?>, BigDecimal> f28172q;

    private C10792s(String str, int i, Integer num, Integer num2, char c) {
        super(str);
        this.f28168m = i;
        this.f28169n = num;
        this.f28170o = num2;
        this.f28171p = c;
        this.f28172q = new C10775l0(this, false);
    }

    private Object readResolve() {
        Object m10715K0 = C10697f0.m10715K0(name());
        if (m10715K0 != null) {
            return m10715K0;
        }
        throw new InvalidObjectException(name());
    }

    /* renamed from: x */
    public static C10792s m10202x(String str, int i, int i2, int i3, char c) {
        return new C10792s(str, i, Integer.valueOf(i2), Integer.valueOf(i3), c);
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: B */
    public Integer mo9554U() {
        return this.f28169n;
    }

    /* renamed from: C */
    public int m10203C() {
        return this.f28168m;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: M */
    public boolean mo9555M() {
        return true;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: V */
    public boolean mo9553V() {
        return false;
    }

    @Override // p162ij.AbstractC7635e, p162ij.InterfaceC7664p
    /* renamed from: a */
    public char mo9552a() {
        return this.f28171p;
    }

    @Override // p162ij.InterfaceC7664p
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // p162ij.AbstractC7635e
    /* renamed from: v */
    protected boolean mo9550v() {
        return true;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: y */
    public Integer mo9551e() {
        return this.f28170o;
    }

    @Override // net.time4j.InterfaceC10773k0
    /* renamed from: z */
    public /* bridge */ /* synthetic */ AbstractC10782o<C10697f0> mo9999z(Integer num) {
        return super.m11173w(num);
    }
}
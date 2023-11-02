package net.time4j;

import java.io.InvalidObjectException;
import java.math.BigDecimal;
import p162ij.AbstractC7665q;
import p162ij.InterfaceC7668t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10796t extends AbstractC10611b<Integer> implements InterfaceC10773k0<Integer, C10711g0> {
    private static final long serialVersionUID = -1337148214680014674L;

    /* renamed from: m */
    private final transient int f28191m;

    /* renamed from: n */
    private final transient Integer f28192n;

    /* renamed from: o */
    private final transient Integer f28193o;

    /* renamed from: p */
    private final transient char f28194p;

    /* renamed from: q */
    private final transient InterfaceC7668t<AbstractC7665q<?>, BigDecimal> f28195q;

    private C10796t(String str, int i, Integer num, Integer num2, char c) {
        super(str);
        boolean z;
        this.f28191m = i;
        this.f28192n = num;
        this.f28193o = num2;
        this.f28194p = c;
        if (i != 5 && i != 7 && i != 9 && i != 13) {
            z = false;
        } else {
            z = true;
        }
        this.f28195q = new C10775l0(this, z);
    }

    private Object readResolve() {
        Object m10616H0 = C10711g0.m10616H0(name());
        if (m10616H0 != null) {
            return m10616H0;
        }
        throw new InvalidObjectException(name());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static C10796t m10184x(String str, boolean z) {
        int i;
        int i2;
        char c;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        if (z) {
            i2 = 24;
        } else {
            i2 = 12;
        }
        Integer valueOf = Integer.valueOf(i2);
        if (z) {
            c = 'k';
        } else {
            c = 'h';
        }
        return new C10796t(str, i, 1, valueOf, c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static C10796t m10183y(String str, int i, int i2, int i3, char c) {
        return new C10796t(str, i, Integer.valueOf(i2), Integer.valueOf(i3), c);
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: B */
    public Integer mo9551e() {
        return this.f28193o;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: C */
    public Integer mo9554U() {
        return this.f28192n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public int m10185D() {
        return this.f28191m;
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

    @Override // p162ij.AbstractC7635e, p162ij.InterfaceC7664p
    /* renamed from: a */
    public char mo9552a() {
        return this.f28194p;
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

    @Override // net.time4j.InterfaceC10773k0
    /* renamed from: z */
    public /* bridge */ /* synthetic */ AbstractC10782o<C10711g0> mo9999z(Integer num) {
        return super.m11062w(num);
    }
}

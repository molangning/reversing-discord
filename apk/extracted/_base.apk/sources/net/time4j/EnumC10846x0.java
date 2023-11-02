package net.time4j;

import net.time4j.base.C10615b;
import net.time4j.base.InterfaceC10614a;
import p162ij.InterfaceC7660n;
import p162ij.InterfaceC7670v;

/* renamed from: net.time4j.x0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC10846x0 implements InterfaceC7660n<InterfaceC10614a>, InterfaceC7670v<C10697f0> {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: q */
    private static final EnumC10846x0[] f28311q = values();

    /* renamed from: f */
    public static EnumC10846x0 m9993f(int i) {
        if (i >= 1 && i <= 7) {
            return f28311q[i - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i);
    }

    @Override // p162ij.InterfaceC7670v
    /* renamed from: a */
    public C10697f0 apply(C10697f0 c10697f0) {
        return (C10697f0) c10697f0.mo14419F(C10697f0.f27889E, this);
    }

    /* renamed from: b */
    public int m9997b() {
        return ordinal() + 1;
    }

    /* renamed from: c */
    public int m9996c(C10852z0 c10852z0) {
        return (((ordinal() + 7) - c10852z0.m9973f().ordinal()) % 7) + 1;
    }

    /* renamed from: d */
    public EnumC10846x0 m9995d(int i) {
        return m9993f(((ordinal() + ((i % 7) + 7)) % 7) + 1);
    }

    @Override // p162ij.InterfaceC7660n
    /* renamed from: e */
    public boolean test(InterfaceC10614a interfaceC10614a) {
        if (C10615b.m11052c(interfaceC10614a.mo10482o(), interfaceC10614a.mo10481p(), interfaceC10614a.mo10480r()) == m9997b()) {
            return true;
        }
        return false;
    }
}

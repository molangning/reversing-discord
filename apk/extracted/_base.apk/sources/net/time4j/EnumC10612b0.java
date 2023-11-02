package net.time4j;

import net.time4j.base.InterfaceC10614a;
import p162ij.InterfaceC7660n;
import p162ij.InterfaceC7670v;

/* renamed from: net.time4j.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC10612b0 implements InterfaceC7660n<InterfaceC10614a>, InterfaceC7670v<C10697f0> {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    

    /* renamed from: v */
    private static final EnumC10612b0[] f27694v = values();

    /* renamed from: d */
    public static EnumC10612b0 m11058d(int i) {
        if (i >= 1 && i <= 12) {
            return f27694v[i - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i);
    }

    @Override // p162ij.InterfaceC7670v
    /* renamed from: a */
    public C10697f0 apply(C10697f0 c10697f0) {
        return (C10697f0) c10697f0.mo14419F(C10697f0.f27886B, this);
    }

    /* renamed from: b */
    public int m11060b() {
        return ordinal() + 1;
    }

    @Override // p162ij.InterfaceC7660n
    /* renamed from: c */
    public boolean test(InterfaceC10614a interfaceC10614a) {
        return interfaceC10614a.mo10481p() == m11060b();
    }
}

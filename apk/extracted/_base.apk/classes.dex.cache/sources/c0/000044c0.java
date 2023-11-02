package net.time4j;

import net.time4j.base.InterfaceC10614a;
import p162ij.InterfaceC7660n;
import p162ij.InterfaceC7670v;

/* renamed from: net.time4j.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC10777m0 implements InterfaceC7660n<InterfaceC10614a>, InterfaceC7670v<C10697f0> {
    Q1,
    Q2,
    Q3,
    Q4;
    

    /* renamed from: n */
    private static final EnumC10777m0[] f28125n = values();

    /* renamed from: d */
    public static EnumC10777m0 m10258d(int i) {
        if (i >= 1 && i <= 4) {
            return f28125n[i - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i);
    }

    @Override // p162ij.InterfaceC7670v
    /* renamed from: a */
    public C10697f0 apply(C10697f0 c10697f0) {
        return (C10697f0) c10697f0.mo14419F(C10697f0.f27885A, this);
    }

    /* renamed from: b */
    public int m10260b() {
        return ordinal() + 1;
    }

    @Override // p162ij.InterfaceC7660n
    /* renamed from: c */
    public boolean test(InterfaceC10614a interfaceC10614a) {
        if (m10260b() == ((interfaceC10614a.mo10481p() - 1) / 3) + 1) {
            return true;
        }
        return false;
    }
}
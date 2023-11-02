package net.time4j;

import java.io.Serializable;
import p162ij.AbstractC7637f;
import p162ij.AbstractC7665q;
import p162ij.C7672x;
import p162ij.InterfaceC7659m0;

/* renamed from: net.time4j.w0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10844w0 extends AbstractC7637f implements InterfaceC10839u, Serializable {

    /* renamed from: j */
    public static final C10844w0 f28299j = new C10844w0();
    private static final long serialVersionUID = -4981215347844372171L;

    private C10844w0() {
    }

    private Object readResolve() {
        return f28299j;
    }

    @Override // net.time4j.InterfaceC10843w
    /* renamed from: a */
    public char mo10005a() {
        return 'Y';
    }

    @Override // p162ij.InterfaceC7671w
    /* renamed from: b */
    public boolean mo10004b() {
        return true;
    }

    @Override // p162ij.AbstractC7637f
    /* renamed from: c */
    public <T extends AbstractC7665q<T>> InterfaceC7659m0<T> mo10003c(C7672x<T> c7672x) {
        if (c7672x.m20107w(C10697f0.f27906w)) {
            return C10591a1.m11093O();
        }
        return null;
    }

    @Override // p162ij.InterfaceC7671w
    public double getLength() {
        return EnumC10686f.f27874m.getLength();
    }

    public String toString() {
        return "WEEK_BASED_YEARS";
    }
}
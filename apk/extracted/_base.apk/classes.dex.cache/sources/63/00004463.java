package net.time4j;

import java.io.Serializable;
import net.time4j.EnumC10686f;
import p162ij.AbstractC7637f;
import p162ij.AbstractC7665q;
import p162ij.C7672x;
import p162ij.InterfaceC7659m0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10685e0 extends AbstractC7637f implements InterfaceC10839u, Serializable {
    private static final long serialVersionUID = 1988843503875912054L;
    private final int policy;
    private final EnumC10686f unit;

    public C10685e0(EnumC10686f enumC10686f, int i) {
        this.unit = enumC10686f;
        this.policy = i;
    }

    @Override // net.time4j.InterfaceC10843w
    /* renamed from: a */
    public char mo10005a() {
        return (char) 0;
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
            return new EnumC10686f.C10696j(this.unit, this.policy);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10685e0)) {
            return false;
        }
        C10685e0 c10685e0 = (C10685e0) obj;
        if (this.unit == c10685e0.unit && this.policy == c10685e0.policy) {
            return true;
        }
        return false;
    }

    @Override // p162ij.InterfaceC7671w
    public double getLength() {
        return this.unit.getLength();
    }

    public int hashCode() {
        return (this.unit.hashCode() * 23) + (this.policy * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.unit.mo10005a());
        sb2.append('-');
        switch (this.policy) {
            case 1:
                sb2.append("NEXT_VALID_DATE");
                break;
            case 2:
                sb2.append("END_OF_MONTH");
                break;
            case 3:
                sb2.append("CARRY_OVER");
                break;
            case 4:
                sb2.append("UNLESS_INVALID");
                break;
            case 5:
                sb2.append("KEEPING_LAST_DATE");
                break;
            case 6:
                sb2.append("JODA_METRIC");
                break;
            default:
                sb2.append("PREVIOUS_VALID_DATE");
                break;
        }
        return sb2.toString();
    }
}
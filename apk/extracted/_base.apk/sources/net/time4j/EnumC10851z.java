package net.time4j;

import java.util.Locale;
import net.time4j.base.InterfaceC10621g;
import p162ij.InterfaceC7660n;
import p184jj.C8972b;
import p184jj.EnumC9003m;
import p184jj.EnumC9016v;

/* renamed from: net.time4j.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC10851z implements InterfaceC7660n<InterfaceC10621g> {
    AM,
    PM;

    /* renamed from: c */
    public static EnumC10851z m9980c(int i) {
        if (i >= 0 && i <= 24) {
            if (i >= 12 && i != 24) {
                return PM;
            }
            return AM;
        }
        throw new IllegalArgumentException("Hour of day out of range: " + i);
    }

    /* renamed from: a */
    public String m9982a(Locale locale) {
        return m9981b(locale, EnumC9016v.WIDE, EnumC9003m.FORMAT);
    }

    /* renamed from: b */
    public String m9981b(Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        return C8972b.m16914d(locale).m16910h(enumC9016v, enumC9003m).m16855f(this);
    }

    @Override // p162ij.InterfaceC7660n
    /* renamed from: d */
    public boolean test(InterfaceC10621g interfaceC10621g) {
        int mo10479s = interfaceC10621g.mo10479s();
        if (this == AM) {
            if (mo10479s < 12 || mo10479s == 24) {
                return true;
            }
        } else if (mo10479s >= 12 && mo10479s < 24) {
            return true;
        }
        return false;
    }
}

package net.time4j;

import java.util.Comparator;
import net.time4j.InterfaceC10843w;
import p162ij.InterfaceC7634d0;
import p162ij.InterfaceC7656l0;
import p162ij.InterfaceC7671w;

/* renamed from: net.time4j.o0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
class C10783o0<U extends InterfaceC10843w> implements InterfaceC7634d0<U>, Comparator<InterfaceC7656l0.C7657a<? extends InterfaceC7671w>> {

    /* renamed from: j */
    private final boolean f28149j;

    private C10783o0(boolean z) {
        this.f28149j = z;
    }

    /* renamed from: b */
    public static Comparator<InterfaceC7656l0.C7657a<? extends InterfaceC7671w>> m10243b() {
        return new C10783o0(false);
    }

    /* renamed from: c */
    static int m10242c(InterfaceC7671w interfaceC7671w, InterfaceC7671w interfaceC7671w2) {
        int compare = Double.compare(interfaceC7671w2.getLength(), interfaceC7671w.getLength());
        if (compare == 0 && !interfaceC7671w.equals(interfaceC7671w2)) {
            throw new IllegalArgumentException("Mixing different units of same length not allowed.");
        }
        return compare;
    }

    /* renamed from: g */
    public static C10783o0<EnumC10686f> m10240g() {
        return new C10783o0<>(false);
    }

    /* renamed from: i */
    public static C10783o0<EnumC10704g> m10239i() {
        return new C10783o0<>(false);
    }

    /* renamed from: j */
    public static C10783o0<InterfaceC10843w> m10238j() {
        return new C10783o0<>(true);
    }

    @Override // java.util.Comparator
    /* renamed from: f */
    public int compare(InterfaceC7656l0.C7657a<? extends InterfaceC7671w> c7657a, InterfaceC7656l0.C7657a<? extends InterfaceC7671w> c7657a2) {
        return m10242c(c7657a.m20136b(), c7657a2.m20136b());
    }
}
package p162ij;

import java.util.Map;
import p162ij.AbstractC7655l;

/* renamed from: ij.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7651j<T extends AbstractC7655l<T>> extends C7672x<T> {

    /* renamed from: q */
    private final Map<String, ? extends InterfaceC7653k<T>> f20970q;

    @Override // p162ij.C7672x
    /* renamed from: n */
    public InterfaceC7653k<T> mo20115n() {
        throw new C7666r("Cannot determine calendar system without variant.");
    }

    @Override // p162ij.C7672x
    /* renamed from: o */
    public InterfaceC7653k<T> mo20114o(String str) {
        if (str.isEmpty()) {
            return mo20115n();
        }
        InterfaceC7653k<T> interfaceC7653k = this.f20970q.get(str);
        if (interfaceC7653k == null) {
            return super.mo20114o(str);
        }
        return interfaceC7653k;
    }

    @Override // p162ij.C7672x
    /* renamed from: x */
    public boolean mo20106x(InterfaceC7664p<?> interfaceC7664p) {
        return super.mo20106x(interfaceC7664p) || (interfaceC7664p instanceof EnumC7627a0);
    }
}
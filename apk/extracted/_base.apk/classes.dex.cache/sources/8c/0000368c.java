package p142hi;

import kotlin.jvm.internal.C9612q;
import p183ji.C8967k;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11947m;
import th.C12758e;

/* renamed from: hi.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7292m implements InterfaceC7265g1 {

    /* renamed from: a */
    private int f19726a;

    /* renamed from: d */
    private final boolean m21054d(InterfaceC11927h interfaceC11927h) {
        return (C8967k.m16936m(interfaceC11927h) || C12758e.m4120E(interfaceC11927h)) ? false : true;
    }

    /* renamed from: c */
    public final boolean m21055c(InterfaceC11927h first, InterfaceC11927h second) {
        C9612q.m13917h(first, "first");
        C9612q.m13917h(second, "second");
        if (!C9612q.m13922c(first.getName(), second.getName())) {
            return false;
        }
        InterfaceC11947m mo4163b = first.mo4163b();
        for (InterfaceC11947m mo4163b2 = second.mo4163b(); mo4163b != null && mo4163b2 != null; mo4163b2 = mo4163b2.mo4163b()) {
            if (mo4163b instanceof InterfaceC11928h0) {
                return mo4163b2 instanceof InterfaceC11928h0;
            }
            if (mo4163b2 instanceof InterfaceC11928h0) {
                return false;
            }
            if (mo4163b instanceof InterfaceC11945l0) {
                if (!(mo4163b2 instanceof InterfaceC11945l0) || !C9612q.m13922c(((InterfaceC11945l0) mo4163b).mo4161e(), ((InterfaceC11945l0) mo4163b2).mo4161e())) {
                    return false;
                }
                return true;
            } else if ((mo4163b2 instanceof InterfaceC11945l0) || !C9612q.m13922c(mo4163b.getName(), mo4163b2.getName())) {
                return false;
            } else {
                mo4163b = mo4163b.mo4163b();
            }
        }
        return true;
    }

    /* renamed from: e */
    protected abstract boolean mo4459e(InterfaceC11927h interfaceC11927h);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC7265g1) || obj.hashCode() != hashCode()) {
            return false;
        }
        InterfaceC7265g1 interfaceC7265g1 = (InterfaceC7265g1) obj;
        if (interfaceC7265g1.getParameters().size() != getParameters().size()) {
            return false;
        }
        InterfaceC11927h mo2788p = mo2788p();
        InterfaceC11927h mo2788p2 = interfaceC7265g1.mo2788p();
        if (mo2788p2 == null || !m21054d(mo2788p) || !m21054d(mo2788p2)) {
            return false;
        }
        return mo4459e(mo2788p2);
    }

    public int hashCode() {
        int identityHashCode;
        int i = this.f19726a;
        if (i != 0) {
            return i;
        }
        InterfaceC11927h mo2788p = mo2788p();
        if (m21054d(mo2788p)) {
            identityHashCode = C12758e.m4099m(mo2788p).hashCode();
        } else {
            identityHashCode = System.identityHashCode(this);
        }
        this.f19726a = identityHashCode;
        return identityHashCode;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: p */
    public abstract InterfaceC11927h mo2788p();
}
package p164j$.time.format;

import java.util.ArrayList;

/* renamed from: j$.time.format.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8303f implements InterfaceC8304g {

    /* renamed from: a */
    private final InterfaceC8304g[] f22309a;

    /* renamed from: b */
    private final boolean f22310b;

    public C8303f(ArrayList arrayList, boolean z) {
        this((InterfaceC8304g[]) arrayList.toArray(new InterfaceC8304g[arrayList.size()]), z);
    }

    C8303f(InterfaceC8304g[] interfaceC8304gArr, boolean z) {
        this.f22309a = interfaceC8304gArr;
        this.f22310b = z;
    }

    @Override // p164j$.time.format.InterfaceC8304g
    /* renamed from: a */
    public final boolean mo17882a(C8315r c8315r, StringBuilder sb2) {
        int length = sb2.length();
        boolean z = this.f22310b;
        if (z) {
            c8315r.m17856g();
        }
        try {
            for (InterfaceC8304g interfaceC8304g : this.f22309a) {
                if (!interfaceC8304g.mo17882a(c8315r, sb2)) {
                    sb2.setLength(length);
                    return true;
                }
            }
            if (z) {
                c8315r.m17862a();
            }
            return true;
        } finally {
            if (z) {
                c8315r.m17862a();
            }
        }
    }

    /* renamed from: b */
    public final C8303f m17886b() {
        return !this.f22310b ? this : new C8303f(this.f22309a, false);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        InterfaceC8304g[] interfaceC8304gArr = this.f22309a;
        if (interfaceC8304gArr != null) {
            boolean z = this.f22310b;
            sb2.append(z ? "[" : "(");
            for (InterfaceC8304g interfaceC8304g : interfaceC8304gArr) {
                sb2.append(interfaceC8304g);
            }
            sb2.append(z ? "]" : ")");
        }
        return sb2.toString();
    }
}
package p080e8;

import java.util.ArrayList;
import java.util.Collections;
import p195k8.C9191p0;
import p195k8.C9208y;
import p383v7.AbstractC13131d;
import p383v7.C13127b;
import p383v7.C13135h;
import p383v7.InterfaceC13133f;

/* renamed from: e8.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6171b extends AbstractC13131d {

    /* renamed from: o */
    private final C9208y f17451o;

    public C6171b() {
        super("Mp4WebvttDecoder");
        this.f17451o = new C9208y();
    }

    /* renamed from: B */
    private static C13127b m23395B(C9208y c9208y, int i) {
        CharSequence charSequence = null;
        C13127b.C13129b c13129b = null;
        while (i > 0) {
            if (i >= 8) {
                int m16084n = c9208y.m16084n();
                int m16084n2 = c9208y.m16084n();
                int i2 = m16084n - 8;
                String m16303F = C9191p0.m16303F(c9208y.m16094d(), c9208y.m16093e(), i2);
                c9208y.m16098Q(i2);
                i = (i - 8) - i2;
                if (m16084n2 == 1937011815) {
                    c13129b = C6175f.m23354o(m16303F);
                } else if (m16084n2 == 1885436268) {
                    charSequence = C6175f.m23352q(null, m16303F.trim(), Collections.emptyList());
                }
            } else {
                throw new C13135h("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (c13129b != null) {
            return c13129b.m3142n(charSequence).m3155a();
        }
        return C6175f.m23357l(charSequence);
    }

    @Override // p383v7.AbstractC13131d
    /* renamed from: z */
    protected InterfaceC13133f mo1161z(byte[] bArr, int i, boolean z) {
        this.f17451o.m16101N(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f17451o.m16097a() > 0) {
            if (this.f17451o.m16097a() >= 8) {
                int m16084n = this.f17451o.m16084n();
                if (this.f17451o.m16084n() == 1987343459) {
                    arrayList.add(m23395B(this.f17451o, m16084n - 8));
                } else {
                    this.f17451o.m16098Q(m16084n - 8);
                }
            } else {
                throw new C13135h("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new C6172c(arrayList);
    }
}

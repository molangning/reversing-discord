package p419x7;

import java.util.List;
import p195k8.C9208y;
import p383v7.AbstractC13131d;
import p383v7.InterfaceC13133f;

/* renamed from: x7.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13724a extends AbstractC13131d {

    /* renamed from: o */
    private final C13725b f35393o;

    public C13724a(List<byte[]> list) {
        super("DvbDecoder");
        C9208y c9208y = new C9208y(list.get(0));
        this.f35393o = new C13725b(c9208y.m16105J(), c9208y.m16105J());
    }

    @Override // p383v7.AbstractC13131d
    /* renamed from: z */
    protected InterfaceC13133f mo1161z(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f35393o.m1618r();
        }
        return new C13734c(this.f35393o.m1634b(bArr, i));
    }
}

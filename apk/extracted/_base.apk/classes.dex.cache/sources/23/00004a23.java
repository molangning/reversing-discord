package p296q6;

import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import p152i7.C7425h;
import p195k8.C9208y;

/* renamed from: q6.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11763v {

    /* renamed from: a */
    private final C9208y f30663a = new C9208y(10);

    /* renamed from: a */
    public Metadata m6958a(InterfaceC11747j interfaceC11747j, C7425h.InterfaceC7426a interfaceC7426a) {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                interfaceC11747j.mo6963n(this.f30663a.m16094d(), 0, 10);
                this.f30663a.m16099P(0);
                if (this.f30663a.m16108G() != 4801587) {
                    break;
                }
                this.f30663a.m16098Q(3);
                int m16112C = this.f30663a.m16112C();
                int i2 = m16112C + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f30663a.m16094d(), 0, bArr, 0, 10);
                    interfaceC11747j.mo6963n(bArr, 10, m16112C);
                    metadata = new C7425h(interfaceC7426a).m20699e(bArr, i2);
                } else {
                    interfaceC11747j.mo6967i(m16112C);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        interfaceC11747j.mo6969e();
        interfaceC11747j.mo6967i(i);
        return metadata;
    }
}
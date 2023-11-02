package p437y4;

import com.facebook.imagepipeline.memory.AbstractC3730h;
import com.facebook.imagepipeline.memory.C3732j;
import java.io.IOException;
import java.io.InputStream;
import p394w2.C13386n;
import p455z2.C14083k;
import p455z2.InterfaceC14080h;

/* renamed from: y4.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13898u implements InterfaceC14080h {

    /* renamed from: a */
    private final C14083k f35740a;

    /* renamed from: b */
    private final AbstractC3730h f35741b;

    public C13898u(AbstractC3730h abstractC3730h, C14083k c14083k) {
        this.f35741b = abstractC3730h;
        this.f35740a = c14083k;
    }

    /* renamed from: f */
    C13897t m1279f(InputStream inputStream, C3732j c3732j) {
        this.f35740a.m715a(inputStream, c3732j);
        return c3732j.mo716a();
    }

    @Override // p455z2.InterfaceC14080h
    /* renamed from: g */
    public C13897t mo721a(InputStream inputStream) {
        C3732j c3732j = new C3732j(this.f35741b);
        try {
            return m1279f(inputStream, c3732j);
        } finally {
            c3732j.close();
        }
    }

    @Override // p455z2.InterfaceC14080h
    /* renamed from: h */
    public C13897t mo720b(InputStream inputStream, int i) {
        C3732j c3732j = new C3732j(this.f35741b, i);
        try {
            return m1279f(inputStream, c3732j);
        } finally {
            c3732j.close();
        }
    }

    @Override // p455z2.InterfaceC14080h
    /* renamed from: i */
    public C13897t mo718d(byte[] bArr) {
        C3732j c3732j = new C3732j(this.f35741b, bArr.length);
        try {
            try {
                c3732j.write(bArr, 0, bArr.length);
                return c3732j.mo716a();
            } catch (IOException e) {
                throw C13386n.m2666a(e);
            }
        } finally {
            c3732j.close();
        }
    }

    @Override // p455z2.InterfaceC14080h
    /* renamed from: j */
    public C3732j mo719c() {
        return new C3732j(this.f35741b);
    }

    @Override // p455z2.InterfaceC14080h
    /* renamed from: k */
    public C3732j mo717e(int i) {
        return new C3732j(this.f35741b, i);
    }
}
package p326rh;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p326rh.InterfaceC12210q;

/* renamed from: rh.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC12170a implements InterfaceC12210q {

    /* renamed from: j */
    protected int f31685j = 0;

    /* renamed from: a */
    public C12229w m6020a() {
        return new C12229w(this);
    }

    /* renamed from: i */
    public void m6019i(OutputStream outputStream) {
        int mo5767c = mo5767c();
        C12181f m5937J = C12181f.m5937J(outputStream, C12181f.m5880u(C12181f.m5878v(mo5767c) + mo5767c));
        m5937J.m5891o0(mo5767c);
        mo5766d(m5937J);
        m5937J.m5938I();
    }

    /* renamed from: rh.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static abstract class AbstractC12171a<BuilderType extends AbstractC12171a> implements InterfaceC12210q.InterfaceC12211a {
        /* renamed from: l */
        public static C12229w m6017l(InterfaceC12210q interfaceC12210q) {
            return new C12229w(interfaceC12210q);
        }

        @Override // p326rh.InterfaceC12210q.InterfaceC12211a
        /* renamed from: k */
        public abstract BuilderType mo5763h(C12180e c12180e, C12183g c12183g);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: rh.a$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C12172a extends FilterInputStream {

            /* renamed from: j */
            private int f31686j;

            public C12172a(InputStream inputStream, int i) {
                super(inputStream);
                this.f31686j = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f31686j);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() {
                if (this.f31686j <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f31686j--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) {
                long skip = super.skip(Math.min(j, this.f31686j));
                if (skip >= 0) {
                    this.f31686j = (int) (this.f31686j - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                int i3 = this.f31686j;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f31686j -= read;
                }
                return read;
            }
        }
    }
}
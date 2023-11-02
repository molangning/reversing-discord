package p317r7;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p153i8.C7456m;
import p153i8.InterfaceC7472x;
import p195k8.C9149a;

/* renamed from: r7.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C12072a implements DataSource {

    /* renamed from: a */
    private final DataSource f31240a;

    /* renamed from: b */
    private final byte[] f31241b;

    /* renamed from: c */
    private final byte[] f31242c;

    /* renamed from: d */
    private CipherInputStream f31243d;

    public C12072a(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        this.f31240a = dataSource;
        this.f31241b = bArr;
        this.f31242c = bArr2;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public final long mo6322b(C4515a c4515a) {
        try {
            Cipher m6318o = m6318o();
            try {
                m6318o.init(2, new SecretKeySpec(this.f31241b, "AES"), new IvParameterSpec(this.f31242c));
                C7456m c7456m = new C7456m(this.f31240a, c4515a);
                this.f31243d = new CipherInputStream(c7456m, m6318o);
                c7456m.m20646h();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.f31243d != null) {
            this.f31243d = null;
            this.f31240a.close();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: d */
    public final Map<String, List<String>> mo6321d() {
        return this.f31240a.mo6321d();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: f */
    public final void mo6320f(InterfaceC7472x interfaceC7472x) {
        C9149a.m16448e(interfaceC7472x);
        this.f31240a.mo6320f(interfaceC7472x);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public final Uri mo6319m() {
        return this.f31240a.mo6319m();
    }

    /* renamed from: o */
    protected Cipher m6318o() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // p153i8.InterfaceC7451h
    public final int read(byte[] bArr, int i, int i2) {
        C9149a.m16448e(this.f31243d);
        int read = this.f31243d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}

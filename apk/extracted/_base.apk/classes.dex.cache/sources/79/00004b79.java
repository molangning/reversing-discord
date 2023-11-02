package p317r7;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p080e8.C6183i;
import p151i6.C7402m;
import p195k8.C9149a;
import p195k8.C9183l0;
import p195k8.C9208y;
import p296q6.C11765x;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11766y;

/* renamed from: r7.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12105u implements InterfaceC11746i {

    /* renamed from: g */
    private static final Pattern f31414g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h */
    private static final Pattern f31415h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a */
    private final String f31416a;

    /* renamed from: b */
    private final C9183l0 f31417b;

    /* renamed from: d */
    private InterfaceC11748k f31419d;

    /* renamed from: f */
    private int f31421f;

    /* renamed from: c */
    private final C9208y f31418c = new C9208y();

    /* renamed from: e */
    private byte[] f31420e = new byte[1024];

    public C12105u(String str, C9183l0 c9183l0) {
        this.f31416a = str;
        this.f31417b = c9183l0;
    }

    @RequiresNonNull({"output"})
    /* renamed from: c */
    private InterfaceC11732b0 m6149c(long j) {
        InterfaceC11732b0 mo3740e = this.f31419d.mo3740e(0, 3);
        mo3740e.mo6168c(new Format.C4362b().m29883e0("text/vtt").m29897V(this.f31416a).m29875i0(j).m29914E());
        this.f31419d.mo3738s();
        return mo3740e;
    }

    @RequiresNonNull({"output"})
    /* renamed from: f */
    private void m6148f() {
        C9208y c9208y = new C9208y(this.f31420e);
        C6183i.m23324e(c9208y);
        long j = 0;
        long j2 = 0;
        for (String m16082p = c9208y.m16082p(); !TextUtils.isEmpty(m16082p); m16082p = c9208y.m16082p()) {
            if (m16082p.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f31414g.matcher(m16082p);
                if (matcher.find()) {
                    Matcher matcher2 = f31415h.matcher(m16082p);
                    if (matcher2.find()) {
                        j2 = C6183i.m23325d((String) C9149a.m16448e(matcher.group(1)));
                        j = C9183l0.m16341f(Long.parseLong((String) C9149a.m16448e(matcher2.group(1))));
                    } else {
                        throw new C7402m("X-TIMESTAMP-MAP doesn't contain media timestamp: " + m16082p);
                    }
                } else {
                    throw new C7402m("X-TIMESTAMP-MAP doesn't contain local timestamp: " + m16082p);
                }
            }
        }
        Matcher m23328a = C6183i.m23328a(c9208y);
        if (m23328a == null) {
            m6149c(0L);
            return;
        }
        long m23325d = C6183i.m23325d((String) C9149a.m16448e(m23328a.group(1)));
        long m16345b = this.f31417b.m16345b(C9183l0.m16337j((j + m23325d) - j2));
        InterfaceC11732b0 m6149c = m6149c(m16345b - m23325d);
        this.f31418c.m16101N(this.f31420e, this.f31421f);
        m6149c.mo6170a(this.f31418c, this.f31421f);
        m6149c.mo6162f(m16345b, 1, this.f31421f, 0, null);
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: a */
    public void mo663a(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: b */
    public void mo662b(InterfaceC11748k interfaceC11748k) {
        this.f31419d = interfaceC11748k;
        interfaceC11748k.mo3739i(new InterfaceC11766y.C11768b(-9223372036854775807L));
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: d */
    public int mo660d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        int length;
        C9149a.m16448e(this.f31419d);
        int length2 = (int) interfaceC11747j.getLength();
        int i = this.f31421f;
        byte[] bArr = this.f31420e;
        if (i == bArr.length) {
            if (length2 != -1) {
                length = length2;
            } else {
                length = bArr.length;
            }
            this.f31420e = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f31420e;
        int i2 = this.f31421f;
        int read = interfaceC11747j.read(bArr2, i2, bArr2.length - i2);
        if (read != -1) {
            int i3 = this.f31421f + read;
            this.f31421f = i3;
            if (length2 == -1 || i3 != length2) {
                return 0;
            }
        }
        m6148f();
        return -1;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: e */
    public boolean mo659e(InterfaceC11747j interfaceC11747j) {
        interfaceC11747j.mo6970c(this.f31420e, 0, 6, false);
        this.f31418c.m16101N(this.f31420e, 6);
        if (C6183i.m23327b(this.f31418c)) {
            return true;
        }
        interfaceC11747j.mo6970c(this.f31420e, 6, 3, false);
        this.f31418c.m16101N(this.f31420e, 9);
        return C6183i.m23327b(this.f31418c);
    }

    @Override // p296q6.InterfaceC11746i
    public void release() {
    }
}
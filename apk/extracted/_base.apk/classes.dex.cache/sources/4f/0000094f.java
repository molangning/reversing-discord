package p025b5;

import com.facebook.imagepipeline.nativecode.C3740f;
import p170j4.C8793c;
import p314r4.C12056h;

/* renamed from: b5.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2127f implements InterfaceC2125d {

    /* renamed from: a */
    private final int f5990a;

    /* renamed from: b */
    private final boolean f5991b;

    /* renamed from: c */
    private final InterfaceC2125d f5992c;

    /* renamed from: d */
    private final Integer f5993d;

    /* renamed from: e */
    private final boolean f5994e;

    public C2127f(int i, boolean z, InterfaceC2125d interfaceC2125d, Integer num, boolean z2) {
        this.f5990a = i;
        this.f5991b = z;
        this.f5992c = interfaceC2125d;
        this.f5993d = num;
        this.f5994e = z2;
    }

    /* renamed from: a */
    private InterfaceC2124c m34151a(C8793c c8793c, boolean z) {
        InterfaceC2125d interfaceC2125d = this.f5992c;
        if (interfaceC2125d == null) {
            return null;
        }
        return interfaceC2125d.createImageTranscoder(c8793c, z);
    }

    /* renamed from: b */
    private InterfaceC2124c m34150b(C8793c c8793c, boolean z) {
        Integer num = this.f5993d;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                return m34148d(c8793c, z);
            }
            throw new IllegalArgumentException("Invalid ImageTranscoderType");
        }
        return m34149c(c8793c, z);
    }

    /* renamed from: c */
    private InterfaceC2124c m34149c(C8793c c8793c, boolean z) {
        return C3740f.m30942a(this.f5990a, this.f5991b, this.f5994e).createImageTranscoder(c8793c, z);
    }

    /* renamed from: d */
    private InterfaceC2124c m34148d(C8793c c8793c, boolean z) {
        return new C2129h(this.f5990a).createImageTranscoder(c8793c, z);
    }

    @Override // p025b5.InterfaceC2125d
    public InterfaceC2124c createImageTranscoder(C8793c c8793c, boolean z) {
        InterfaceC2124c m34151a = m34151a(c8793c, z);
        if (m34151a == null) {
            m34151a = m34150b(c8793c, z);
        }
        if (m34151a == null && C12056h.m6420a()) {
            m34151a = m34149c(c8793c, z);
        }
        if (m34151a == null) {
            return m34148d(c8793c, z);
        }
        return m34151a;
    }
}
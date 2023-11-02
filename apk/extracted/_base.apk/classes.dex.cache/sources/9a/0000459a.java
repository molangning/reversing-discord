package p259o6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p259o6.C11028l;

/* renamed from: o6.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC10993c0 {

    /* renamed from: o6.c0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10994a implements InterfaceC10997d {

        /* renamed from: a */
        private final InterfaceC10993c0 f28789a;

        public C10994a(InterfaceC10993c0 interfaceC10993c0) {
            this.f28789a = interfaceC10993c0;
        }

        @Override // p259o6.InterfaceC10993c0.InterfaceC10997d
        /* renamed from: a */
        public InterfaceC10993c0 mo9398a(UUID uuid) {
            this.f28789a.acquire();
            return this.f28789a;
        }
    }

    /* renamed from: o6.c0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10995b {

        /* renamed from: a */
        private final byte[] f28790a;

        /* renamed from: b */
        private final String f28791b;

        /* renamed from: c */
        private final int f28792c;

        public C10995b(byte[] bArr, String str, int i) {
            this.f28790a = bArr;
            this.f28791b = str;
            this.f28792c = i;
        }

        /* renamed from: a */
        public byte[] m9402a() {
            return this.f28790a;
        }

        /* renamed from: b */
        public String m9401b() {
            return this.f28791b;
        }
    }

    /* renamed from: o6.c0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC10996c {
        /* renamed from: a */
        void mo9332a(InterfaceC10993c0 interfaceC10993c0, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    /* renamed from: o6.c0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC10997d {
        /* renamed from: a */
        InterfaceC10993c0 mo9398a(UUID uuid);
    }

    /* renamed from: o6.c0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10998e {

        /* renamed from: a */
        private final byte[] f28793a;

        /* renamed from: b */
        private final String f28794b;

        public C10998e(byte[] bArr, String str) {
            this.f28793a = bArr;
            this.f28794b = str;
        }

        /* renamed from: a */
        public byte[] m9400a() {
            return this.f28793a;
        }

        /* renamed from: b */
        public String m9399b() {
            return this.f28794b;
        }
    }

    /* renamed from: a */
    Class<? extends InterfaceC10991b0> mo9264a();

    void acquire();

    /* renamed from: b */
    Map<String, String> mo9263b(byte[] bArr);

    /* renamed from: c */
    InterfaceC10991b0 mo9262c(byte[] bArr);

    /* renamed from: d */
    C10998e mo9261d();

    /* renamed from: e */
    byte[] mo9260e();

    /* renamed from: f */
    void mo9259f(byte[] bArr, byte[] bArr2);

    /* renamed from: g */
    void mo9258g(byte[] bArr);

    /* renamed from: h */
    void mo9257h(InterfaceC10996c interfaceC10996c);

    /* renamed from: i */
    void mo9256i(byte[] bArr);

    /* renamed from: j */
    byte[] mo9255j(byte[] bArr, byte[] bArr2);

    /* renamed from: k */
    C10995b mo9254k(byte[] bArr, List<C11028l.C11030b> list, int i, HashMap<String, String> hashMap);

    void release();
}
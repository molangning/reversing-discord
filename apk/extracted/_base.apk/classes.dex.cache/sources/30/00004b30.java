package p312r2;

import p312r2.InterfaceC12034c;

/* renamed from: r2.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12032b implements InterfaceC12044g {

    /* renamed from: r2.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C12033a implements InterfaceC12043f {
        C12033a() {
            C12032b.this = r1;
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(InterfaceC12034c.InterfaceC12035a interfaceC12035a, InterfaceC12034c.InterfaceC12035a interfaceC12035a2) {
            long mo6532a = interfaceC12035a.mo6532a();
            long mo6532a2 = interfaceC12035a2.mo6532a();
            if (mo6532a < mo6532a2) {
                return -1;
            }
            if (mo6532a2 == mo6532a) {
                return 0;
            }
            return 1;
        }
    }

    @Override // p312r2.InterfaceC12044g
    public InterfaceC12043f get() {
        return new C12033a();
    }
}
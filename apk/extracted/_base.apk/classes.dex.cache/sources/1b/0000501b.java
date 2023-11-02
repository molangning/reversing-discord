package vg;

import gh.InterfaceC6775l;
import kotlin.jvm.internal.C9612q;
import p108fh.InterfaceC6424a;
import p108fh.InterfaceC6425b;
import p305qg.InterfaceC11905b1;
import p407wg.AbstractC13571p;

/* renamed from: vg.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13291l implements InterfaceC6425b {

    /* renamed from: a */
    public static final C13291l f34372a = new C13291l();

    /* renamed from: vg.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C13292a implements InterfaceC6424a {

        /* renamed from: b */
        private final AbstractC13571p f34373b;

        public C13292a(AbstractC13571p javaElement) {
            C9612q.m13917h(javaElement, "javaElement");
            this.f34373b = javaElement;
        }

        @Override // p305qg.InterfaceC11900a1
        /* renamed from: b */
        public InterfaceC11905b1 mo2835b() {
            InterfaceC11905b1 NO_SOURCE_FILE = InterfaceC11905b1.f30908a;
            C9612q.m13918g(NO_SOURCE_FILE, "NO_SOURCE_FILE");
            return NO_SOURCE_FILE;
        }

        @Override // p108fh.InterfaceC6424a
        /* renamed from: d */
        public AbstractC13571p mo2834c() {
            return this.f34373b;
        }

        public String toString() {
            return C13292a.class.getName() + ": " + mo2834c();
        }
    }

    private C13291l() {
    }

    @Override // p108fh.InterfaceC6425b
    /* renamed from: a */
    public InterfaceC6424a mo2836a(InterfaceC6775l javaElement) {
        C9612q.m13917h(javaElement, "javaElement");
        return new C13292a((AbstractC13571p) javaElement);
    }
}
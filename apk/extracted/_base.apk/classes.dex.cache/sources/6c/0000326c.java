package p087ei;

import gi.InterfaceC6821n;
import java.io.InputStream;
import kh.C9422m;
import kotlin.Pair;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.InterfaceC10863b;
import p070di.AbstractC5947q;
import p219lh.C10188a;
import p219lh.C10191c;
import p305qg.InterfaceC11928h0;
import p429xh.C13801c;
import ph.C11633c;

/* renamed from: ei.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6240c extends AbstractC5947q implements InterfaceC10863b {

    /* renamed from: x */
    public static final C6241a f17665x = new C6241a(null);

    /* renamed from: w */
    private final boolean f17666w;

    /* renamed from: ei.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C6241a {
        private C6241a() {
        }

        public /* synthetic */ C6241a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C6240c m23173a(C11633c fqName, InterfaceC6821n storageManager, InterfaceC11928h0 module, InputStream inputStream, boolean z) {
            C9612q.m13917h(fqName, "fqName");
            C9612q.m13917h(storageManager, "storageManager");
            C9612q.m13917h(module, "module");
            C9612q.m13917h(inputStream, "inputStream");
            Pair<C9422m, C10188a> m12133a = C10191c.m12133a(inputStream);
            C9422m m14351a = m12133a.m14351a();
            C10188a m14350b = m12133a.m14350b();
            if (m14351a != null) {
                return new C6240c(fqName, storageManager, module, m14351a, m14350b, z, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + C10188a.f26496h + ", actual " + m14350b + ". Please update Kotlin");
        }
    }

    private C6240c(C11633c c11633c, InterfaceC6821n interfaceC6821n, InterfaceC11928h0 interfaceC11928h0, C9422m c9422m, C10188a c10188a, boolean z) {
        super(c11633c, interfaceC6821n, interfaceC11928h0, c9422m, c10188a, null);
        this.f17666w = z;
    }

    public /* synthetic */ C6240c(C11633c c11633c, InterfaceC6821n interfaceC6821n, InterfaceC11928h0 interfaceC11928h0, C9422m c9422m, C10188a c10188a, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11633c, interfaceC6821n, interfaceC11928h0, c9422m, c10188a, z);
    }

    @Override // tg.AbstractC12748z, tg.AbstractC12706j
    public String toString() {
        return "builtins package fragment for " + mo4161e() + " from " + C13801c.m1499p(this);
    }
}
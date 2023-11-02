package mg;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.Ref$BooleanRef;
import p160ih.InterfaceC7564r;
import p305qg.InterfaceC11900a1;
import p468zg.C14206a0;
import p468zg.C14208b0;
import ph.C11632b;
import ph.C11633c;

/* renamed from: mg.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C10454a {

    /* renamed from: a */
    public static final C10454a f27292a = new C10454a();

    /* renamed from: b */
    private static final Set<C11632b> f27293b;

    /* renamed from: c */
    private static final C11632b f27294c;

    /* renamed from: mg.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C10455a implements InterfaceC7564r.InterfaceC7567c {

        /* renamed from: a */
        final /* synthetic */ Ref$BooleanRef f27295a;

        C10455a(Ref$BooleanRef ref$BooleanRef) {
            this.f27295a = ref$BooleanRef;
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7567c
        /* renamed from: a */
        public void mo11509a() {
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7567c
        /* renamed from: c */
        public InterfaceC7564r.InterfaceC7565a mo11508c(C11632b classId, InterfaceC11900a1 source) {
            C9612q.m13917h(classId, "classId");
            C9612q.m13917h(source, "source");
            if (C9612q.m13922c(classId, C14206a0.f36519a.m451a())) {
                this.f27295a.f25327j = true;
                return null;
            }
            return null;
        }
    }

    static {
        List<C11633c> m14101l;
        m14101l = C9545j.m14101l(C14208b0.f36532a, C14208b0.f36542k, C14208b0.f36543l, C14208b0.f36535d, C14208b0.f36537f, C14208b0.f36540i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C11633c c11633c : m14101l) {
            linkedHashSet.add(C11632b.m7460m(c11633c));
        }
        f27293b = linkedHashSet;
        C11632b m7460m = C11632b.m7460m(C14208b0.f36541j);
        C9612q.m13918g(m7460m, "topLevel(JvmAnnotationNames.REPEATABLE_ANNOTATION)");
        f27294c = m7460m;
    }

    private C10454a() {
    }

    /* renamed from: a */
    public final C11632b m11512a() {
        return f27294c;
    }

    /* renamed from: b */
    public final Set<C11632b> m11511b() {
        return f27293b;
    }

    /* renamed from: c */
    public final boolean m11510c(InterfaceC7564r klass) {
        C9612q.m13917h(klass, "klass");
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        klass.mo2853d(new C10455a(ref$BooleanRef), null);
        return ref$BooleanRef.f25327j;
    }
}

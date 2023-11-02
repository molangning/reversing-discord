package p305qg;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9605m;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KDeclarationContainer;
import kotlin.sequences.Sequence;
import ph.C11632b;
import si.C12545m;
import si.C12552o;

/* renamed from: qg.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11994x {

    /* renamed from: qg.x$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    /* synthetic */ class C11995a extends C9605m implements Function1<C11632b, C11632b> {

        /* renamed from: j */
        public static final C11995a f30984j = new C11995a();

        C11995a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final C11632b invoke(C11632b p0) {
            C9612q.m13917h(p0, "p0");
            return p0.m7466g();
        }

        @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
        public final String getName() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final KDeclarationContainer getOwner() {
            return C9591f0.m13969b(C11632b.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }
    }

    /* renamed from: qg.x$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C11996b extends AbstractC9614s implements Function1<C11632b, Integer> {

        /* renamed from: j */
        public static final C11996b f30985j = new C11996b();

        C11996b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(C11632b it) {
            C9612q.m13917h(it, "it");
            return 0;
        }
    }

    /* renamed from: a */
    public static final InterfaceC11914e m6652a(InterfaceC11928h0 interfaceC11928h0, C11632b classId) {
        C9612q.m13917h(interfaceC11928h0, "<this>");
        C9612q.m13917h(classId, "classId");
        InterfaceC11927h m6651b = m6651b(interfaceC11928h0, classId);
        if (m6651b instanceof InterfaceC11914e) {
            return (InterfaceC11914e) m6651b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p305qg.InterfaceC11927h m6651b(p305qg.InterfaceC11928h0 r10, ph.C11632b r11) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p305qg.C11994x.m6651b(qg.h0, ph.b):qg.h");
    }

    /* renamed from: c */
    public static final InterfaceC11914e m6650c(InterfaceC11928h0 interfaceC11928h0, C11632b classId, C11938k0 notFoundClasses) {
        Sequence m4876h;
        Sequence m4851y;
        List<Integer> m4867E;
        C9612q.m13917h(interfaceC11928h0, "<this>");
        C9612q.m13917h(classId, "classId");
        C9612q.m13917h(notFoundClasses, "notFoundClasses");
        InterfaceC11914e m6652a = m6652a(interfaceC11928h0, classId);
        if (m6652a != null) {
            return m6652a;
        }
        m4876h = C12545m.m4876h(classId, C11995a.f30984j);
        m4851y = C12552o.m4851y(m4876h, C11996b.f30985j);
        m4867E = C12552o.m4867E(m4851y);
        return notFoundClasses.m6700d(classId, m4867E);
    }

    /* renamed from: d */
    public static final InterfaceC11917e1 m6649d(InterfaceC11928h0 interfaceC11928h0, C11632b classId) {
        C9612q.m13917h(interfaceC11928h0, "<this>");
        C9612q.m13917h(classId, "classId");
        InterfaceC11927h m6651b = m6651b(interfaceC11928h0, classId);
        if (m6651b instanceof InterfaceC11917e1) {
            return (InterfaceC11917e1) m6651b;
        }
        return null;
    }
}

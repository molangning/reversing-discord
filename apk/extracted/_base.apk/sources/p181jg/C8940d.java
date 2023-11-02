package p181jg;

import kg.C9257h;
import kg.C9336p0;
import kg.C9338q;
import kh.C9412i;
import kh.C9455t;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9605m;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import mh.C10468g;
import p070di.C5958w;
import p270oh.C11115e;
import p270oh.C11117f;
import p270oh.C11122i;
import p305qg.InterfaceC12005z0;
import pf.InterfaceC11562g;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¨\u0006\u0004"}, m14357d2 = {"R", "Lpf/g;", "Lkotlin/reflect/KFunction;", "a", "kotlin-reflection"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: jg.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C8940d {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: jg.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public /* synthetic */ class C8941a extends C9605m implements Function2<C5958w, C9412i, InterfaceC12005z0> {

        /* renamed from: j */
        public static final C8941a f23386j = new C8941a();

        C8941a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final InterfaceC12005z0 invoke(C5958w p0, C9412i p1) {
            C9612q.m13917h(p0, "p0");
            C9612q.m13917h(p1, "p1");
            return p0.m24072j(p1);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
        public final String getName() {
            return "loadFunction";
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final KDeclarationContainer getOwner() {
            return C9591f0.m13969b(C5958w.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }
    }

    /* renamed from: a */
    public static final <R> KFunction<R> m17017a(InterfaceC11562g<? extends R> interfaceC11562g) {
        boolean z;
        C9612q.m13917h(interfaceC11562g, "<this>");
        Metadata metadata = (Metadata) interfaceC11562g.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] m14358d1 = metadata.m14358d1();
        boolean z2 = true;
        if (m14358d1.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m14358d1 = null;
        }
        if (m14358d1 == null) {
            return null;
        }
        Pair<C11117f, C9412i> m9124j = C11122i.m9124j(m14358d1, metadata.m14357d2());
        C11117f m14351a = m9124j.m14351a();
        C9412i m14350b = m9124j.m14350b();
        int[] m14355mv = metadata.m14355mv();
        if ((metadata.m14353xi() & 8) == 0) {
            z2 = false;
        }
        C11115e c11115e = new C11115e(m14355mv, z2);
        Class<?> cls = interfaceC11562g.getClass();
        C9455t m15306n0 = m14350b.m15306n0();
        C9612q.m13918g(m15306n0, "proto.typeTable");
        return new C9338q(C9257h.f24325m, (InterfaceC12005z0) C9336p0.m15852h(cls, m14350b, m14351a, new C10468g(m15306n0), c11115e, C8941a.f23386j));
    }
}

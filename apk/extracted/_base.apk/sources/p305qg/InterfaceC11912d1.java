package p305qg;

import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p142hi.InterfaceC7265g1;

/* renamed from: qg.d1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface InterfaceC11912d1 {

    /* renamed from: qg.d1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11913a implements InterfaceC11912d1 {

        /* renamed from: a */
        public static final C11913a f30912a = new C11913a();

        private C11913a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p305qg.InterfaceC11912d1
        /* renamed from: a */
        public Collection<AbstractC7264g0> mo6724a(InterfaceC7265g1 currentTypeConstructor, Collection<? extends AbstractC7264g0> superTypes, Function1<? super InterfaceC7265g1, ? extends Iterable<? extends AbstractC7264g0>> neighbors, Function1<? super AbstractC7264g0, Unit> reportLoop) {
            C9612q.m13917h(currentTypeConstructor, "currentTypeConstructor");
            C9612q.m13917h(superTypes, "superTypes");
            C9612q.m13917h(neighbors, "neighbors");
            C9612q.m13917h(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    /* renamed from: a */
    Collection<AbstractC7264g0> mo6724a(InterfaceC7265g1 interfaceC7265g1, Collection<? extends AbstractC7264g0> collection, Function1<? super InterfaceC7265g1, ? extends Iterable<? extends AbstractC7264g0>> function1, Function1<? super AbstractC7264g0, Unit> function12);
}

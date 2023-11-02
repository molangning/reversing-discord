package th;

import java.util.Collection;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11897a;
import p327ri.C12263f;

/* renamed from: th.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12779m {

    /* renamed from: th.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12780a<H> extends AbstractC9614s implements Function1<H, Unit> {

        /* renamed from: j */
        final /* synthetic */ C12263f<H> f33139j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12780a(C12263f<H> c12263f) {
            super(1);
            this.f33139j = c12263f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C12780a<H>) obj);
            return Unit.f25302a;
        }

        /* renamed from: invoke */
        public final void invoke2(H it) {
            C12263f<H> c12263f = this.f33139j;
            C9612q.m13918g(it, "it");
            c12263f.add(it);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <H> Collection<H> m3933a(Collection<? extends H> collection, Function1<? super H, ? extends InterfaceC11897a> descriptorByHandle) {
        Object m14056T;
        Object m14034p0;
        C9612q.m13917h(collection, "<this>");
        C9612q.m13917h(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C12263f m5640a = C12263f.f31865l.m5640a();
        while (!linkedList.isEmpty()) {
            m14056T = C9553r.m14056T(linkedList);
            C12263f m5640a2 = C12263f.f31865l.m5640a();
            Collection<? super H> m4045p = C12766k.m4045p(m14056T, linkedList, descriptorByHandle, new C12780a(m5640a2));
            C9612q.m13918g(m4045p, "conflictedHandles = Smar…nflictedHandles.add(it) }");
            if (m4045p.size() == 1 && m5640a2.isEmpty()) {
                m14034p0 = C9553r.m14034p0(m4045p);
                C9612q.m13918g(m14034p0, "overridableGroup.single()");
                m5640a.add(m14034p0);
            } else {
                Object obj = (Object) C12766k.m4061L(m4045p, descriptorByHandle);
                C9612q.m13918g(obj, "selectMostSpecificMember…roup, descriptorByHandle)");
                InterfaceC11897a invoke = descriptorByHandle.invoke(obj);
                for (Object it : m4045p) {
                    C9612q.m13918g(it, "it");
                    if (!C12766k.m4071B(invoke, descriptorByHandle.invoke(it))) {
                        m5640a2.add(it);
                    }
                }
                if (!m5640a2.isEmpty()) {
                    m5640a.addAll(m5640a2);
                }
                m5640a.add(obj);
            }
        }
        return m5640a;
    }
}
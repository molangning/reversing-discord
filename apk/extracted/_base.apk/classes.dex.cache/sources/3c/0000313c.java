package p070di;

import kh.C9412i;
import kotlin.Pair;
import kotlin.jvm.internal.C9612q;
import mh.C10468g;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11998y;

/* renamed from: di.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface InterfaceC5936j {

    /* renamed from: a */
    public static final C5937a f16909a = C5937a.f16910a;

    /* renamed from: di.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5937a {

        /* renamed from: a */
        static final /* synthetic */ C5937a f16910a = new C5937a();

        /* renamed from: b */
        private static final InterfaceC5936j f16911b = new C5938a();

        /* renamed from: di.j$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C5938a implements InterfaceC5936j {
            C5938a() {
            }

            @Override // p070di.InterfaceC5936j
            /* renamed from: a */
            public Pair mo24132a(C9412i proto, InterfaceC11998y ownerFunction, C10468g typeTable, C5919d0 typeDeserializer) {
                C9612q.m13917h(proto, "proto");
                C9612q.m13917h(ownerFunction, "ownerFunction");
                C9612q.m13917h(typeTable, "typeTable");
                C9612q.m13917h(typeDeserializer, "typeDeserializer");
                return null;
            }
        }

        private C5937a() {
        }

        /* renamed from: a */
        public final InterfaceC5936j m24133a() {
            return f16911b;
        }
    }

    /* renamed from: a */
    Pair<InterfaceC11897a.InterfaceC11898a<?>, Object> mo24132a(C9412i c9412i, InterfaceC11998y interfaceC11998y, C10468g c10468g, C5919d0 c5919d0);
}
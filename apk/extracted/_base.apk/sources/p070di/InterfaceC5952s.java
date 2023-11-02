package p070di;

import kh.C9439q;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;

/* renamed from: di.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface InterfaceC5952s {

    /* renamed from: di.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5953a implements InterfaceC5952s {

        /* renamed from: a */
        public static final C5953a f16956a = new C5953a();

        private C5953a() {
        }

        @Override // p070di.InterfaceC5952s
        /* renamed from: a */
        public AbstractC7264g0 mo20441a(C9439q proto, String flexibleId, AbstractC7302o0 lowerBound, AbstractC7302o0 upperBound) {
            C9612q.m13917h(proto, "proto");
            C9612q.m13917h(flexibleId, "flexibleId");
            C9612q.m13917h(lowerBound, "lowerBound");
            C9612q.m13917h(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    /* renamed from: a */
    AbstractC7264g0 mo20441a(C9439q c9439q, String str, AbstractC7302o0 abstractC7302o0, AbstractC7302o0 abstractC7302o02);
}

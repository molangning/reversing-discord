package mh;

import java.util.List;
import kh.C9461v;
import kh.C9468w;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: mh.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10469h {

    /* renamed from: b */
    public static final C10470a f27350b = new C10470a(null);

    /* renamed from: c */
    private static final C10469h f27351c;

    /* renamed from: a */
    private final List<C9461v> f27352a;

    /* renamed from: mh.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C10470a {
        private C10470a() {
        }

        public /* synthetic */ C10470a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C10469h m11461a(C9468w table) {
            C9612q.m13917h(table, "table");
            if (table.m14700w() == 0) {
                return m11460b();
            }
            List<C9461v> m14699x = table.m14699x();
            C9612q.m13918g(m14699x, "table.requirementList");
            return new C10469h(m14699x, null);
        }

        /* renamed from: b */
        public final C10469h m11460b() {
            return C10469h.f27351c;
        }
    }

    static {
        List m14104i;
        m14104i = C9545j.m14104i();
        f27351c = new C10469h(m14104i);
    }

    private C10469h(List<C9461v> list) {
        this.f27352a = list;
    }

    public /* synthetic */ C10469h(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }
}
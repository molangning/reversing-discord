package p142hi;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p325rg.InterfaceC12155g;

/* renamed from: hi.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7325u extends AbstractC7297n1 {

    /* renamed from: e */
    public static final C7326a f19762e = new C7326a(null);

    /* renamed from: c */
    private final AbstractC7297n1 f19763c;

    /* renamed from: d */
    private final AbstractC7297n1 f19764d;

    /* renamed from: hi.u$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7326a {
        private C7326a() {
        }

        public /* synthetic */ C7326a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC7297n1 m20956a(AbstractC7297n1 first, AbstractC7297n1 second) {
            C9612q.m13917h(first, "first");
            C9612q.m13917h(second, "second");
            if (first.mo20959f()) {
                return second;
            }
            if (second.mo20959f()) {
                return first;
            }
            return new C7325u(first, second, null);
        }
    }

    private C7325u(AbstractC7297n1 abstractC7297n1, AbstractC7297n1 abstractC7297n12) {
        this.f19763c = abstractC7297n1;
        this.f19764d = abstractC7297n12;
    }

    public /* synthetic */ C7325u(AbstractC7297n1 abstractC7297n1, AbstractC7297n1 abstractC7297n12, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC7297n1, abstractC7297n12);
    }

    /* renamed from: i */
    public static final AbstractC7297n1 m20957i(AbstractC7297n1 abstractC7297n1, AbstractC7297n1 abstractC7297n12) {
        return f19762e.m20956a(abstractC7297n1, abstractC7297n12);
    }

    @Override // p142hi.AbstractC7297n1
    /* renamed from: a */
    public boolean mo20961a() {
        return this.f19763c.mo20961a() || this.f19764d.mo20961a();
    }

    @Override // p142hi.AbstractC7297n1
    /* renamed from: b */
    public boolean mo3540b() {
        return this.f19763c.mo3540b() || this.f19764d.mo3540b();
    }

    @Override // p142hi.AbstractC7297n1
    /* renamed from: d */
    public InterfaceC12155g mo20960d(InterfaceC12155g annotations) {
        C9612q.m13917h(annotations, "annotations");
        return this.f19764d.mo20960d(this.f19763c.mo20960d(annotations));
    }

    @Override // p142hi.AbstractC7297n1
    /* renamed from: e */
    public InterfaceC7288k1 mo3539e(AbstractC7264g0 key) {
        C9612q.m13917h(key, "key");
        InterfaceC7288k1 mo3539e = this.f19763c.mo3539e(key);
        if (mo3539e == null) {
            return this.f19764d.mo3539e(key);
        }
        return mo3539e;
    }

    @Override // p142hi.AbstractC7297n1
    /* renamed from: f */
    public boolean mo20959f() {
        return false;
    }

    @Override // p142hi.AbstractC7297n1
    /* renamed from: g */
    public AbstractC7264g0 mo20958g(AbstractC7264g0 topLevelType, EnumC7336w1 position) {
        C9612q.m13917h(topLevelType, "topLevelType");
        C9612q.m13917h(position, "position");
        return this.f19764d.mo20958g(this.f19763c.mo20958g(topLevelType, position), position);
    }
}
package p142hi;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p325rg.InterfaceC12155g;

/* renamed from: hi.n1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7297n1 {

    /* renamed from: a */
    public static final C7299b f19729a = new C7299b(null);

    /* renamed from: b */
    public static final AbstractC7297n1 f19730b = new C7298a();

    /* renamed from: hi.n1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7298a extends AbstractC7297n1 {
        C7298a() {
        }

        @Override // p142hi.AbstractC7297n1
        /* renamed from: e */
        public /* bridge */ /* synthetic */ InterfaceC7288k1 mo3539e(AbstractC7264g0 abstractC7264g0) {
            return (InterfaceC7288k1) m21049i(abstractC7264g0);
        }

        @Override // p142hi.AbstractC7297n1
        /* renamed from: f */
        public boolean mo20959f() {
            return true;
        }

        /* renamed from: i */
        public Void m21049i(AbstractC7264g0 key) {
            C9612q.m13917h(key, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* renamed from: hi.n1$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7299b {
        private C7299b() {
        }

        public /* synthetic */ C7299b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: hi.n1$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7300c extends AbstractC7297n1 {
        C7300c() {
            AbstractC7297n1.this = r1;
        }

        @Override // p142hi.AbstractC7297n1
        /* renamed from: a */
        public boolean mo20961a() {
            return false;
        }

        @Override // p142hi.AbstractC7297n1
        /* renamed from: b */
        public boolean mo3540b() {
            return false;
        }

        @Override // p142hi.AbstractC7297n1
        /* renamed from: d */
        public InterfaceC12155g mo20960d(InterfaceC12155g annotations) {
            C9612q.m13917h(annotations, "annotations");
            return AbstractC7297n1.this.mo20960d(annotations);
        }

        @Override // p142hi.AbstractC7297n1
        /* renamed from: e */
        public InterfaceC7288k1 mo3539e(AbstractC7264g0 key) {
            C9612q.m13917h(key, "key");
            return AbstractC7297n1.this.mo3539e(key);
        }

        @Override // p142hi.AbstractC7297n1
        /* renamed from: f */
        public boolean mo20959f() {
            return AbstractC7297n1.this.mo20959f();
        }

        @Override // p142hi.AbstractC7297n1
        /* renamed from: g */
        public AbstractC7264g0 mo20958g(AbstractC7264g0 topLevelType, EnumC7336w1 position) {
            C9612q.m13917h(topLevelType, "topLevelType");
            C9612q.m13917h(position, "position");
            return AbstractC7297n1.this.mo20958g(topLevelType, position);
        }
    }

    /* renamed from: a */
    public boolean mo20961a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo3540b() {
        return false;
    }

    /* renamed from: c */
    public final C7307p1 m21051c() {
        C7307p1 m21027g = C7307p1.m21027g(this);
        C9612q.m13918g(m21027g, "create(this)");
        return m21027g;
    }

    /* renamed from: d */
    public InterfaceC12155g mo20960d(InterfaceC12155g annotations) {
        C9612q.m13917h(annotations, "annotations");
        return annotations;
    }

    /* renamed from: e */
    public abstract InterfaceC7288k1 mo3539e(AbstractC7264g0 abstractC7264g0);

    /* renamed from: f */
    public boolean mo20959f() {
        return false;
    }

    /* renamed from: g */
    public AbstractC7264g0 mo20958g(AbstractC7264g0 topLevelType, EnumC7336w1 position) {
        C9612q.m13917h(topLevelType, "topLevelType");
        C9612q.m13917h(position, "position");
        return topLevelType;
    }

    /* renamed from: h */
    public final AbstractC7297n1 m21050h() {
        return new C7300c();
    }
}
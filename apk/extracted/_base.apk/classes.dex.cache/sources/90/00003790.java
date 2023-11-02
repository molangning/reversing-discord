package p160ih;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p449yh.EnumC14028e;

/* renamed from: ih.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC7551m {

    /* renamed from: a */
    public static final C7553b f20851a = new C7553b(null);

    /* renamed from: b */
    private static final C7555d f20852b = new C7555d(EnumC14028e.BOOLEAN);

    /* renamed from: c */
    private static final C7555d f20853c = new C7555d(EnumC14028e.CHAR);

    /* renamed from: d */
    private static final C7555d f20854d = new C7555d(EnumC14028e.BYTE);

    /* renamed from: e */
    private static final C7555d f20855e = new C7555d(EnumC14028e.SHORT);

    /* renamed from: f */
    private static final C7555d f20856f = new C7555d(EnumC14028e.INT);

    /* renamed from: g */
    private static final C7555d f20857g = new C7555d(EnumC14028e.FLOAT);

    /* renamed from: h */
    private static final C7555d f20858h = new C7555d(EnumC14028e.LONG);

    /* renamed from: i */
    private static final C7555d f20859i = new C7555d(EnumC14028e.DOUBLE);

    /* renamed from: ih.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7552a extends AbstractC7551m {

        /* renamed from: j */
        private final AbstractC7551m f20860j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7552a(AbstractC7551m elementType) {
            super(null);
            C9612q.m13917h(elementType, "elementType");
            this.f20860j = elementType;
        }

        /* renamed from: i */
        public final AbstractC7551m m20427i() {
            return this.f20860j;
        }
    }

    /* renamed from: ih.m$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7553b {
        private C7553b() {
        }

        public /* synthetic */ C7553b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7555d m20426a() {
            return AbstractC7551m.f20852b;
        }

        /* renamed from: b */
        public final C7555d m20425b() {
            return AbstractC7551m.f20854d;
        }

        /* renamed from: c */
        public final C7555d m20424c() {
            return AbstractC7551m.f20853c;
        }

        /* renamed from: d */
        public final C7555d m20423d() {
            return AbstractC7551m.f20859i;
        }

        /* renamed from: e */
        public final C7555d m20422e() {
            return AbstractC7551m.f20857g;
        }

        /* renamed from: f */
        public final C7555d m20421f() {
            return AbstractC7551m.f20856f;
        }

        /* renamed from: g */
        public final C7555d m20420g() {
            return AbstractC7551m.f20858h;
        }

        /* renamed from: h */
        public final C7555d m20419h() {
            return AbstractC7551m.f20855e;
        }
    }

    /* renamed from: ih.m$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7554c extends AbstractC7551m {

        /* renamed from: j */
        private final String f20861j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7554c(String internalName) {
            super(null);
            C9612q.m13917h(internalName, "internalName");
            this.f20861j = internalName;
        }

        /* renamed from: i */
        public final String m20418i() {
            return this.f20861j;
        }
    }

    /* renamed from: ih.m$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7555d extends AbstractC7551m {

        /* renamed from: j */
        private final EnumC14028e f20862j;

        public C7555d(EnumC14028e enumC14028e) {
            super(null);
            this.f20862j = enumC14028e;
        }

        /* renamed from: i */
        public final EnumC14028e m20417i() {
            return this.f20862j;
        }
    }

    private AbstractC7551m() {
    }

    public /* synthetic */ AbstractC7551m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        return C7557o.f20863a.mo20413d(this);
    }
}
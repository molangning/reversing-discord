package p141hh;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: hh.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7164e {

    /* renamed from: e */
    public static final C7165a f19530e = new C7165a(null);

    /* renamed from: f */
    private static final C7164e f19531f = new C7164e(null, null, false, false, 8, null);

    /* renamed from: a */
    private final EnumC7168h f19532a;

    /* renamed from: b */
    private final EnumC7166f f19533b;

    /* renamed from: c */
    private final boolean f19534c;

    /* renamed from: d */
    private final boolean f19535d;

    /* renamed from: hh.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7165a {
        private C7165a() {
        }

        public /* synthetic */ C7165a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7164e m21329a() {
            return C7164e.f19531f;
        }
    }

    public C7164e(EnumC7168h enumC7168h, EnumC7166f enumC7166f, boolean z, boolean z2) {
        this.f19532a = enumC7168h;
        this.f19533b = enumC7166f;
        this.f19534c = z;
        this.f19535d = z2;
    }

    /* renamed from: b */
    public final boolean m21333b() {
        return this.f19534c;
    }

    /* renamed from: c */
    public final EnumC7166f m21332c() {
        return this.f19533b;
    }

    /* renamed from: d */
    public final EnumC7168h m21331d() {
        return this.f19532a;
    }

    /* renamed from: e */
    public final boolean m21330e() {
        return this.f19535d;
    }

    public /* synthetic */ C7164e(EnumC7168h enumC7168h, EnumC7166f enumC7166f, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC7168h, enumC7166f, z, (i & 8) != 0 ? false : z2);
    }
}
package sh;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: sh.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC12480a {
    NO_ARGUMENTS(false, false, 3, null),
    UNLESS_EMPTY(true, false, 2, null),
    ALWAYS_PARENTHESIZED(true, true);
    

    /* renamed from: j */
    private final boolean f32430j;

    /* renamed from: k */
    private final boolean f32431k;

    EnumC12480a(boolean z, boolean z2) {
        this.f32430j = z;
        this.f32431k = z2;
    }

    /* renamed from: b */
    public final boolean m5193b() {
        return this.f32430j;
    }

    /* renamed from: c */
    public final boolean m5192c() {
        return this.f32431k;
    }

    /* synthetic */ EnumC12480a(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}

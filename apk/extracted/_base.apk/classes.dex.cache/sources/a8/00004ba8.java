package p325rg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p287pi.C11644a;

/* renamed from: rg.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public enum EnumC12152e {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    

    /* renamed from: j */
    private final String f31596j;

    EnumC12152e(String str) {
        this.f31596j = str == null ? C11644a.m7375f(name()) : str;
    }

    /* renamed from: b */
    public final String m6042b() {
        return this.f31596j;
    }

    /* synthetic */ EnumC12152e(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
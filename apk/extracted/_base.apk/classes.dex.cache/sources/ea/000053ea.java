package p468zg;

import java.util.EnumMap;
import kotlin.jvm.internal.C9612q;

/* renamed from: zg.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14265y {

    /* renamed from: a */
    private final EnumMap<EnumC14207b, C14251r> f36668a;

    public C14265y(EnumMap<EnumC14207b, C14251r> defaultQualifiers) {
        C9612q.m13917h(defaultQualifiers, "defaultQualifiers");
        this.f36668a = defaultQualifiers;
    }

    /* renamed from: a */
    public final C14251r m279a(EnumC14207b enumC14207b) {
        return this.f36668a.get(enumC14207b);
    }

    /* renamed from: b */
    public final EnumMap<EnumC14207b, C14251r> m278b() {
        return this.f36668a;
    }
}
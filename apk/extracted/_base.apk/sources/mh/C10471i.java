package mh;

import kotlin.jvm.internal.C9612q;

/* renamed from: mh.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10471i {
    /* renamed from: a */
    public static final boolean m11459a(AbstractC10456a version) {
        C9612q.m13917h(version, "version");
        if (version.m11507a() == 1 && version.m11506b() >= 4) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m11458b(AbstractC10456a version) {
        C9612q.m13917h(version, "version");
        return m11459a(version);
    }
}

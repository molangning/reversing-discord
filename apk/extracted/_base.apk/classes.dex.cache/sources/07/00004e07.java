package th;

import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11914e;

/* renamed from: th.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface InterfaceC12759f {

    /* renamed from: th.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC12760a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* renamed from: th.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC12761b {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    /* renamed from: a */
    EnumC12760a mo305a();

    /* renamed from: b */
    EnumC12761b mo304b(InterfaceC11897a interfaceC11897a, InterfaceC11897a interfaceC11897a2, InterfaceC11914e interfaceC11914e);
}
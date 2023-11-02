package p116g6;

import p438y5.C13909d;
import p438y5.InterfaceC13907b;

/* renamed from: g6.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6557d implements InterfaceC13907b<InterfaceC6553a> {

    /* renamed from: g6.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C6558a {

        /* renamed from: a */
        private static final C6557d f18593a = new C6557d();
    }

    /* renamed from: a */
    public static C6557d m22406a() {
        return C6558a.f18593a;
    }

    /* renamed from: c */
    public static InterfaceC6553a m22404c() {
        return (InterfaceC6553a) C13909d.m1219c(AbstractC6554b.m22411b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public InterfaceC6553a get() {
        return m22404c();
    }
}

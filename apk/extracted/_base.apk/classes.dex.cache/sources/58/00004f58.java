package p381v5;

import java.util.concurrent.Executor;
import p438y5.C13909d;
import p438y5.InterfaceC13907b;

/* renamed from: v5.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13096k implements InterfaceC13907b<Executor> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v5.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13097a {

        /* renamed from: a */
        private static final C13096k f33939a = new C13096k();
    }

    /* renamed from: a */
    public static C13096k m3281a() {
        return C13097a.f33939a;
    }

    /* renamed from: b */
    public static Executor m3280b() {
        return (Executor) C13909d.m1219c(AbstractC13095j.m3282a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c */
    public Executor get() {
        return m3280b();
    }
}
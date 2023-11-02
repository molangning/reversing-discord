package io.sentry.android.ndk;

import io.sentry.C7901e;
import io.sentry.C7911e5;
import io.sentry.C7991j;
import io.sentry.C8120q0;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8127r0;
import io.sentry.protocol.C8062a0;
import io.sentry.protocol.C8068c;
import io.sentry.util.C8229o;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;

/* renamed from: io.sentry.android.ndk.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7828c implements InterfaceC8127r0 {

    /* renamed from: a */
    private final C8132r4 f21395a;

    /* renamed from: b */
    private final InterfaceC7827b f21396b;

    public C7828c(C8132r4 c8132r4) {
        this(c8132r4, new NativeScope());
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: a */
    public /* synthetic */ void mo18455a(Map map) {
        C8120q0.m18469h(this, map);
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: b */
    public void mo18454b(String str, String str2) {
        try {
            this.f21396b.mo19616b(str, str2);
        } catch (Throwable th2) {
            this.f21395a.getLogger().mo18137a(EnumC8021m4.ERROR, th2, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: c */
    public void mo18453c(C7901e c7901e) {
        String str;
        try {
            String str2 = null;
            if (c7901e.m19333h() != null) {
                str = c7901e.m19333h().name().toLowerCase(Locale.ROOT);
            } else {
                str = null;
            }
            String m19084g = C7991j.m19084g(c7901e.m19331j());
            Map<String, Object> m19334g = c7901e.m19334g();
            if (!m19334g.isEmpty()) {
                str2 = this.f21395a.getSerializer().mo17979f(m19334g);
            }
            this.f21396b.mo19617a(str, c7901e.m19332i(), c7901e.m19335f(), c7901e.m19330k(), m19084g, str2);
        } catch (Throwable th2) {
            this.f21395a.getLogger().mo18137a(EnumC8021m4.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: d */
    public void mo18452d(String str, String str2) {
        try {
            this.f21396b.mo19614d(str, str2);
        } catch (Throwable th2) {
            this.f21395a.getLogger().mo18137a(EnumC8021m4.ERROR, th2, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: e */
    public /* synthetic */ void mo18451e(Collection collection) {
        C8120q0.m18475b(this, collection);
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: f */
    public /* synthetic */ void mo18450f(Collection collection) {
        C8120q0.m18471f(this, collection);
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: g */
    public void mo18449g(C8062a0 c8062a0) {
        try {
            if (c8062a0 == null) {
                this.f21396b.mo19615c();
            } else {
                this.f21396b.mo19613e(c8062a0.m18820l(), c8062a0.m18821k(), c8062a0.m18819m(), c8062a0.m18817o());
            }
        } catch (Throwable th2) {
            this.f21395a.getLogger().mo18137a(EnumC8021m4.ERROR, th2, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: h */
    public /* synthetic */ void mo18448h(C8068c c8068c) {
        C8120q0.m18474c(this, c8068c);
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: i */
    public /* synthetic */ void mo18447i(C7911e5 c7911e5) {
        C8120q0.m18468i(this, c7911e5);
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: j */
    public /* synthetic */ void mo18446j(Map map) {
        C8120q0.m18472e(this, map);
    }

    @Override // io.sentry.InterfaceC8127r0
    /* renamed from: k */
    public /* synthetic */ void mo18445k(String str) {
        C8120q0.m18467j(this, str);
    }

    C7828c(C8132r4 c8132r4, InterfaceC7827b interfaceC7827b) {
        this.f21395a = (C8132r4) C8229o.m18169c(c8132r4, "The SentryOptions object is required.");
        this.f21396b = (InterfaceC7827b) C8229o.m18169c(interfaceC7827b, "The NativeScope object is required.");
    }
}

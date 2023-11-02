package io.sentry;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.sentry.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7685a0 {

    /* renamed from: b */
    private static final C7685a0 f21016b = new C7685a0();

    /* renamed from: a */
    private final List<InterfaceC7686a> f21017a = new CopyOnWriteArrayList();

    /* renamed from: io.sentry.a0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC7686a {
    }

    private C7685a0() {
    }

    /* renamed from: a */
    public static C7685a0 m20048a() {
        return f21016b;
    }

    /* renamed from: b */
    public void m20047b(InterfaceC7686a interfaceC7686a) {
        this.f21017a.add(interfaceC7686a);
    }
}

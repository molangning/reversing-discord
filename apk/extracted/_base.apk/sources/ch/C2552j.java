package ch;

import gh.InterfaceC6770g;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11914e;
import p449yh.C14026c;

/* renamed from: ch.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C2552j implements InterfaceC2551i {

    /* renamed from: a */
    public C14026c f6992a;

    @Override // ch.InterfaceC2551i
    /* renamed from: a */
    public InterfaceC11914e mo33002a(InterfaceC6770g javaClass) {
        C9612q.m13917h(javaClass, "javaClass");
        return m33001b().m888b(javaClass);
    }

    /* renamed from: b */
    public final C14026c m33001b() {
        C14026c c14026c = this.f6992a;
        if (c14026c != null) {
            return c14026c;
        }
        C9612q.m13900y("resolver");
        return null;
    }

    /* renamed from: c */
    public final void m33000c(C14026c c14026c) {
        C9612q.m13917h(c14026c, "<set-?>");
        this.f6992a = c14026c;
    }
}

package io.sentry.util.thread;

import io.sentry.protocol.C8112w;

/* renamed from: io.sentry.util.thread.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final /* synthetic */ class C8235a {
    /* renamed from: a */
    public static boolean m18154a(InterfaceC8236b interfaceC8236b) {
        return interfaceC8236b.mo18148c(Thread.currentThread());
    }

    /* renamed from: b */
    public static boolean m18153b(InterfaceC8236b interfaceC8236b, C8112w c8112w) {
        Long m18511l = c8112w.m18511l();
        if (m18511l != null && interfaceC8236b.mo18149b(m18511l.longValue())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m18152c(InterfaceC8236b interfaceC8236b, Thread thread) {
        return interfaceC8236b.mo18149b(thread.getId());
    }
}

package p325rg;

import kotlin.jvm.internal.C9612q;

/* renamed from: rg.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C12160i {
    /* renamed from: a */
    public static final InterfaceC12155g m6033a(InterfaceC12155g first, InterfaceC12155g second) {
        C9612q.m13917h(first, "first");
        C9612q.m13917h(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        if (!second.isEmpty()) {
            return new C12163k(first, second);
        }
        return first;
    }
}

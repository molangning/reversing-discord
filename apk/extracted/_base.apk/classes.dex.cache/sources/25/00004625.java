package p271oi;

import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11998y;

/* renamed from: oi.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface InterfaceC11132f {

    /* renamed from: oi.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11133a {
        /* renamed from: a */
        public static String m9112a(InterfaceC11132f interfaceC11132f, InterfaceC11998y functionDescriptor) {
            C9612q.m13917h(functionDescriptor, "functionDescriptor");
            if (!interfaceC11132f.mo9079a(functionDescriptor)) {
                return interfaceC11132f.getDescription();
            }
            return null;
        }
    }

    /* renamed from: a */
    boolean mo9079a(InterfaceC11998y interfaceC11998y);

    /* renamed from: b */
    String mo9080b(InterfaceC11998y interfaceC11998y);

    String getDescription();
}
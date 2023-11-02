package com.google.firebase.messaging;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import lb.C10106d;
import p120gc.C6725h;
import p120gc.InterfaceC6727i;
import p247nb.C10533d;
import p247nb.C10558q;
import p247nb.InterfaceC10538e;
import p247nb.InterfaceC10544h;
import p247nb.InterfaceC10545i;
import p347t5.InterfaceC12593g;
import p367ub.InterfaceC12945d;
import p386vb.InterfaceC13239k;
import p403wb.InterfaceC13467a;
import p444yb.InterfaceC13969d;

@Keep
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FirebaseMessagingRegistrar implements InterfaceC10545i {
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(InterfaceC10538e interfaceC10538e) {
        return new FirebaseMessaging((C10106d) interfaceC10538e.mo11278a(C10106d.class), (InterfaceC13467a) interfaceC10538e.mo11278a(InterfaceC13467a.class), interfaceC10538e.mo11275d(InterfaceC6727i.class), interfaceC10538e.mo11275d(InterfaceC13239k.class), (InterfaceC13969d) interfaceC10538e.mo11278a(InterfaceC13969d.class), (InterfaceC12593g) interfaceC10538e.mo11278a(InterfaceC12593g.class), (InterfaceC12945d) interfaceC10538e.mo11278a(InterfaceC12945d.class));
    }

    @Override // p247nb.InterfaceC10545i
    @Keep
    public List<C10533d<?>> getComponents() {
        return Arrays.asList(C10533d.m11308c(FirebaseMessaging.class).m11293b(C10558q.m11234i(C10106d.class)).m11293b(C10558q.m11236g(InterfaceC13467a.class)).m11293b(C10558q.m11235h(InterfaceC6727i.class)).m11293b(C10558q.m11235h(InterfaceC13239k.class)).m11293b(C10558q.m11236g(InterfaceC12593g.class)).m11293b(C10558q.m11234i(InterfaceC13969d.class)).m11293b(C10558q.m11234i(InterfaceC12945d.class)).m11290e(new InterfaceC10544h() { // from class: com.google.firebase.messaging.x
            @Override // p247nb.InterfaceC10544h
            /* renamed from: a */
            public final Object mo1055a(InterfaceC10538e interfaceC10538e) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(interfaceC10538e);
                return lambda$getComponents$0;
            }
        }).m11292c().m11291d(), C6725h.m22031b("fire-fcm", "23.0.1"));
    }
}
package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import lb.C10106d;
import p120gc.C6725h;
import p247nb.C10533d;
import p247nb.C10558q;
import p247nb.InterfaceC10538e;
import p247nb.InterfaceC10544h;
import p247nb.InterfaceC10545i;
import p386vb.C13236i;
import p386vb.InterfaceC13238j;
import p444yb.InterfaceC13969d;

@Keep
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FirebaseInstallationsRegistrar implements InterfaceC10545i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC13969d lambda$getComponents$0(InterfaceC10538e interfaceC10538e) {
        return new C5048c((C10106d) interfaceC10538e.mo11278a(C10106d.class), interfaceC10538e.mo11275d(InterfaceC13238j.class));
    }

    @Override // p247nb.InterfaceC10545i
    public List<C10533d<?>> getComponents() {
        return Arrays.asList(C10533d.m11308c(InterfaceC13969d.class).m11293b(C10558q.m11234i(C10106d.class)).m11293b(C10558q.m11235h(InterfaceC13238j.class)).m11290e(new InterfaceC10544h() { // from class: yb.e
            @Override // p247nb.InterfaceC10544h
            /* renamed from: a */
            public final Object mo1055a(InterfaceC10538e interfaceC10538e) {
                InterfaceC13969d lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC10538e);
                return lambda$getComponents$0;
            }
        }).m11291d(), C13236i.m2990a(), C6725h.m22031b("fire-installations", "17.0.1"));
    }
}

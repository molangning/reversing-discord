package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.C4354a;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import p120gc.C6725h;
import p247nb.C10533d;
import p247nb.C10558q;
import p247nb.InterfaceC10538e;
import p247nb.InterfaceC10544h;
import p247nb.InterfaceC10545i;
import p347t5.InterfaceC12593g;
import p381v5.C13109t;

@Keep
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class TransportRegistrar implements InterfaceC10545i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC12593g lambda$getComponents$0(InterfaceC10538e interfaceC10538e) {
        C13109t.m3241f((Context) interfaceC10538e.mo11278a(Context.class));
        return C13109t.m3244c().m3240g(C4354a.f11145h);
    }

    @Override // p247nb.InterfaceC10545i
    public List<C10533d<?>> getComponents() {
        return Arrays.asList(C10533d.m11308c(InterfaceC12593g.class).m11293b(C10558q.m11234i(Context.class)).m11290e(new InterfaceC10544h() { // from class: ob.a
            @Override // p247nb.InterfaceC10544h
            /* renamed from: a */
            public final Object mo1055a(InterfaceC10538e interfaceC10538e) {
                InterfaceC12593g lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(interfaceC10538e);
                return lambda$getComponents$0;
            }
        }).m11291d(), C6725h.m22031b("fire-transport", "18.1.1"));
    }
}

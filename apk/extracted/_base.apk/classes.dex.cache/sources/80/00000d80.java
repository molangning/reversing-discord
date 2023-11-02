package com.discord.billing;

import com.android.billingclient.api.BillingClient;
import com.discord.billing.BillingManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.C9568b;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m14357d2 = {"", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.billing.BillingManager$reconnect$1", m13986f = "BillingManager.kt", m13985l = {}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class BillingManager$reconnect$1 extends AbstractC9578k implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BillingManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManager$reconnect$1(BillingManager billingManager, Continuation<? super BillingManager$reconnect$1> continuation) {
        super(1, continuation);
        this.this$0 = billingManager;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new BillingManager$reconnect$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((BillingManager$reconnect$1) create(continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        BillingClient billingClient;
        BillingManager$billingClientStateListener$1 billingManager$billingClientStateListener$1;
        C13277d.m2869d();
        if (this.label == 0) {
            C11586t.m7586b(obj);
            billingClient = this.this$0.billingClient;
            if (billingClient == null) {
                C9612q.m13900y("billingClient");
                billingClient = null;
            }
            billingManager$billingClientStateListener$1 = this.this$0.billingClientStateListener;
            billingClient.mo32473m(billingManager$billingClientStateListener$1);
            this.this$0.getOnConnectionUpdated().invoke(C9568b.m13989c(BillingManager.ConnectionState.CONNECTING.getValue()));
            return Unit.f25302a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
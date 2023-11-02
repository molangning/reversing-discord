package com.discord.samsung;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9810j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import p388vf.C13277d;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.samsung.SamsungModule$finishSamsungAuthorization$1", m13986f = "SamsungModule.kt", m13985l = {151}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
final class SamsungModule$finishSamsungAuthorization$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $authCode;
    final /* synthetic */ String $location;
    final /* synthetic */ String $state;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SamsungModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SamsungModule$finishSamsungAuthorization$1(String str, SamsungModule samsungModule, String str2, String str3, Continuation<? super SamsungModule$finishSamsungAuthorization$1> continuation) {
        super(2, continuation);
        this.$location = str;
        this.this$0 = samsungModule;
        this.$state = str2;
        this.$authCode = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SamsungModule$finishSamsungAuthorization$1 samsungModule$finishSamsungAuthorization$1 = new SamsungModule$finishSamsungAuthorization$1(this.$location, this.this$0, this.$state, this.$authCode, continuation);
        samsungModule$finishSamsungAuthorization$1.L$0 = obj;
        return samsungModule$finishSamsungAuthorization$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SamsungModule$finishSamsungAuthorization$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        Object m7596b;
        m2869d = C13277d.m2869d();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    C11586t.m7586b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C11586t.m7586b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                String str = this.$location;
                SamsungModule samsungModule = this.this$0;
                String str2 = this.$state;
                String str3 = this.$authCode;
                C11583s.C11584a c11584a = C11583s.f30090k;
                OkHttpClient m8771c = new OkHttpClient.Builder().m8765i(false).m8771c();
                CoroutineDispatcher m13569b = C9677b1.m13569b();
                SamsungModule$finishSamsungAuthorization$1$1$1 samsungModule$finishSamsungAuthorization$1$1$1 = new SamsungModule$finishSamsungAuthorization$1$1$1(str, samsungModule, m8771c, str2, str3, null);
                this.label = 1;
                if (C9810j.m13190g(m13569b, samsungModule$finishSamsungAuthorization$1$1$1, this) == m2869d) {
                    return m2869d;
                }
            }
            m7596b = C11583s.m7596b(Unit.f25302a);
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        SamsungModule samsungModule2 = this.this$0;
        Throwable m7593e = C11583s.m7593e(m7596b);
        if (m7593e != null) {
            if (!(m7593e instanceof CancellationException)) {
                samsungModule2.rejectConnection(m7593e);
            } else {
                throw m7593e;
            }
        }
        return Unit.f25302a;
    }
}
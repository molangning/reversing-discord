package com.discord.samsung;

import android.net.Uri;
import com.discord.samsung.SamsungModule;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9553r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import p304qf.C11889v;
import p388vf.C13277d;
import pf.C11586t;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.samsung.SamsungModule$finishSamsungAuthorization$1$1$1", m13986f = "SamsungModule.kt", m13985l = {}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
final class SamsungModule$finishSamsungAuthorization$1$1$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $authCode;
    final /* synthetic */ OkHttpClient $client;
    final /* synthetic */ String $location;
    final /* synthetic */ String $state;
    int label;
    final /* synthetic */ SamsungModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SamsungModule$finishSamsungAuthorization$1$1$1(String str, SamsungModule samsungModule, OkHttpClient okHttpClient, String str2, String str3, Continuation<? super SamsungModule$finishSamsungAuthorization$1$1$1> continuation) {
        super(2, continuation);
        this.$location = str;
        this.this$0 = samsungModule;
        this.$client = okHttpClient;
        this.$state = str2;
        this.$authCode = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SamsungModule$finishSamsungAuthorization$1$1$1(this.$location, this.this$0, this.$client, this.$state, this.$authCode, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SamsungModule$finishSamsungAuthorization$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Uri handleSamsungCallback;
        String queryParameter;
        Map m6751k;
        String m14046d0;
        C13277d.m2869d();
        if (this.label == 0) {
            C11586t.m7586b(obj);
            Request.Builder m8730d = new Request.Builder().m8730d();
            String str = this.$location;
            C9612q.m13920e(str);
            handleSamsungCallback = this.this$0.handleSamsungCallback(this.$client.mo8811b(m8730d.m8722l(str).m8732b()).execute());
            if (handleSamsungCallback != null && (queryParameter = handleSamsungCallback.getQueryParameter("redirect_uri")) != null) {
                String str2 = this.$authCode;
                m6751k = C11889v.m6751k(C11591x.m7577a("state", this.$state), C11591x.m7577a("code", "{\"code\":\"" + str2 + "\"}"));
                ArrayList arrayList = new ArrayList(m6751k.size());
                for (Map.Entry entry : m6751k.entrySet()) {
                    arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
                }
                m14046d0 = C9553r.m14046d0(arrayList, "&", null, null, 0, null, null, 62, null);
                this.this$0.handleSamsungCallback(this.$client.mo8811b(new Request.Builder().m8726h(RequestBody.Companion.m8719b(m14046d0, MediaType.f29321g.m8837a("application/x-www-form-urlencoded"))).m8722l(queryParameter).m8732b()).execute());
                SamsungModule.resolveConnection$default(this.this$0, null, 1, null);
                return Unit.f25302a;
            }
            throw new SamsungModule.Companion.SamsungCallbackException("no_redirect_uri", "No redirect uri returned from GET /callback");
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
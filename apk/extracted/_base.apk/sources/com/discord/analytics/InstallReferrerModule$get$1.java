package com.discord.analytics;

import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C9918y2;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.analytics.InstallReferrerModule$get$1", m13986f = "InstallReferrerModule.kt", m13985l = {35}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class InstallReferrerModule$get$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $attempts;
    final /* synthetic */ Ref$ObjectRef<InstallReferrerClient> $client;
    final /* synthetic */ SharedPreferences $prefs;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ Ref$ObjectRef<String> $referrer;
    int label;
    final /* synthetic */ InstallReferrerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.analytics.InstallReferrerModule$get$1$1", m13986f = "InstallReferrerModule.kt", m13985l = {39}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.analytics.InstallReferrerModule$get$1$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C28281 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $attempts;
        final /* synthetic */ Ref$ObjectRef<InstallReferrerClient> $client;
        final /* synthetic */ SharedPreferences $prefs;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ Ref$ObjectRef<String> $referrer;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ InstallReferrerModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28281(Ref$ObjectRef<InstallReferrerClient> ref$ObjectRef, InstallReferrerModule installReferrerModule, Ref$ObjectRef<String> ref$ObjectRef2, SharedPreferences sharedPreferences, Promise promise, int i, Continuation<? super C28281> continuation) {
            super(2, continuation);
            this.$client = ref$ObjectRef;
            this.this$0 = installReferrerModule;
            this.$referrer = ref$ObjectRef2;
            this.$prefs = sharedPreferences;
            this.$promise = promise;
            this.$attempts = i;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C28281 c28281 = new C28281(this.$client, this.this$0, this.$referrer, this.$prefs, this.$promise, this.$attempts, continuation);
            c28281.L$0 = obj;
            return c28281;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28281) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[Catch: all -> 0x00be, TryCatch #1 {all -> 0x00be, blocks: (B:6:0x0024, B:17:0x0068, B:26:0x007c, B:28:0x0082, B:30:0x0088, B:32:0x008e, B:33:0x00b2, B:34:0x00bd, B:21:0x0071, B:11:0x0041, B:13:0x0053), top: B:55:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b2 A[Catch: all -> 0x00be, TryCatch #1 {all -> 0x00be, blocks: (B:6:0x0024, B:17:0x0068, B:26:0x007c, B:28:0x0082, B:30:0x0088, B:32:0x008e, B:33:0x00b2, B:34:0x00bd, B:21:0x0071, B:11:0x0041, B:13:0x0053), top: B:55:0x000c }] */
        /* JADX WARN: Type inference failed for: r1v5, types: [com.android.installreferrer.api.InstallReferrerClient, T] */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 271
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.analytics.InstallReferrerModule$get$1.C28281.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallReferrerModule$get$1(Ref$ObjectRef<InstallReferrerClient> ref$ObjectRef, InstallReferrerModule installReferrerModule, Ref$ObjectRef<String> ref$ObjectRef2, SharedPreferences sharedPreferences, Promise promise, int i, Continuation<? super InstallReferrerModule$get$1> continuation) {
        super(2, continuation);
        this.$client = ref$ObjectRef;
        this.this$0 = installReferrerModule;
        this.$referrer = ref$ObjectRef2;
        this.$prefs = sharedPreferences;
        this.$promise = promise;
        this.$attempts = i;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InstallReferrerModule$get$1(this.$client, this.this$0, this.$referrer, this.$prefs, this.$promise, this.$attempts, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InstallReferrerModule$get$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        m2869d = C13277d.m2869d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C11586t.m7586b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C11586t.m7586b(obj);
            C28281 c28281 = new C28281(this.$client, this.this$0, this.$referrer, this.$prefs, this.$promise, this.$attempts, null);
            this.label = 1;
            if (C9918y2.m12956c(1000L, c28281, this) == m2869d) {
                return m2869d;
            }
        }
        return Unit.f25302a;
    }
}

package com.discord.file_manager;

import com.facebook.react.bridge.Promise;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.C9568b;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.file_manager.FileManagerModule$fileExists$1", m13986f = "FileManagerModule.kt", m13985l = {}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class FileManagerModule$fileExists$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $path;
    final /* synthetic */ Promise $promise;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManagerModule$fileExists$1(Promise promise, String str, Continuation<? super FileManagerModule$fileExists$1> continuation) {
        super(2, continuation);
        this.$promise = promise;
        this.$path = str;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileManagerModule$fileExists$1(this.$promise, this.$path, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileManagerModule$fileExists$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        C13277d.m2869d();
        if (this.label == 0) {
            C11586t.m7586b(obj);
            try {
                this.$promise.resolve(C9568b.m13991a(new File(this.$path).exists()));
            } catch (Throwable th2) {
                this.$promise.reject(th2);
            }
            return Unit.f25302a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
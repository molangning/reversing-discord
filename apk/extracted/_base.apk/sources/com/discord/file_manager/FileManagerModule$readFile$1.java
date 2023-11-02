package com.discord.file_manager;

import android.util.Base64;
import com.facebook.react.bridge.Promise;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import p467zf.C14179b;
import p467zf.C14180c;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.file_manager.FileManagerModule$readFile$1", m13986f = "FileManagerModule.kt", m13985l = {}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class FileManagerModule$readFile$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $encoding;
    final /* synthetic */ String $path;
    final /* synthetic */ Promise $promise;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManagerModule$readFile$1(String str, String str2, Promise promise, Continuation<? super FileManagerModule$readFile$1> continuation) {
        super(2, continuation);
        this.$path = str;
        this.$encoding = str2;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileManagerModule$readFile$1(this.$path, this.$encoding, this.$promise, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileManagerModule$readFile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        String m13757q;
        C13277d.m2869d();
        if (this.label == 0) {
            C11586t.m7586b(obj);
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(this.$path));
                byte[] m515c = C14179b.m515c(fileInputStream);
                C14180c.m514a(fileInputStream, null);
                if (C9612q.m13922c(this.$encoding, "base64")) {
                    this.$promise.resolve(Base64.encodeToString(m515c, 2));
                } else {
                    Promise promise = this.$promise;
                    m13757q = C9653o.m13757q(m515c);
                    promise.resolve(m13757q);
                }
            } catch (Throwable th2) {
                this.$promise.reject(th2);
            }
            return Unit.f25302a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

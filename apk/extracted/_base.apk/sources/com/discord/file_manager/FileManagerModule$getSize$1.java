package com.discord.file_manager;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.C9568b;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import p467zf.C14180c;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.file_manager.FileManagerModule$getSize$1", m13986f = "FileManagerModule.kt", m13985l = {}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class FileManagerModule$getSize$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Promise $promise;
    final /* synthetic */ String $uri;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FileManagerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManagerModule$getSize$1(FileManagerModule fileManagerModule, String str, Promise promise, Continuation<? super FileManagerModule$getSize$1> continuation) {
        super(2, continuation);
        this.this$0 = fileManagerModule;
        this.$uri = str;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FileManagerModule$getSize$1 fileManagerModule$getSize$1 = new FileManagerModule$getSize$1(this.this$0, this.$uri, this.$promise, continuation);
        fileManagerModule$getSize$1.L$0 = obj;
        return fileManagerModule$getSize$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileManagerModule$getSize$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m7596b;
        ReactApplicationContext reactApplicationContext;
        long j;
        boolean z;
        C13277d.m2869d();
        if (this.label == 0) {
            C11586t.m7586b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FileManagerModule fileManagerModule = this.this$0;
            String str = this.$uri;
            Promise promise = this.$promise;
            try {
                C11583s.C11584a c11584a = C11583s.f30090k;
                reactApplicationContext = fileManagerModule.getReactApplicationContext();
                ParcelFileDescriptor openFileDescriptor = reactApplicationContext.getContentResolver().openFileDescriptor(Uri.parse(str), "r");
                if (openFileDescriptor != null) {
                    j = openFileDescriptor.getStatSize();
                    C14180c.m514a(openFileDescriptor, null);
                } else {
                    j = 0;
                }
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th2) {
                C11583s.C11584a c11584a2 = C11583s.f30090k;
                m7596b = C11583s.m7596b(C11586t.m7587a(th2));
            }
            if (z) {
                promise.resolve(C9568b.m13990b(j));
                m7596b = C11583s.m7596b(Unit.f25302a);
                Promise promise2 = this.$promise;
                Throwable m7593e = C11583s.m7593e(m7596b);
                if (m7593e != null) {
                    promise2.reject(m7593e);
                }
                return Unit.f25302a;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

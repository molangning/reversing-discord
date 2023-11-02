package com.discord.file_manager;

import android.util.Base64;
import com.facebook.react.bridge.Promise;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.CoroutineScope;
import p355ti.C12785a;
import p388vf.C13277d;
import p467zf.C14180c;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.file_manager.FileManagerModule$writeFile$1", m13986f = "FileManagerModule.kt", m13985l = {}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class FileManagerModule$writeFile$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $data;
    final /* synthetic */ String $encoding;
    final /* synthetic */ String $path;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ String $storageDir;
    int label;
    final /* synthetic */ FileManagerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManagerModule$writeFile$1(FileManagerModule fileManagerModule, String str, Promise promise, String str2, String str3, String str4, Continuation<? super FileManagerModule$writeFile$1> continuation) {
        super(2, continuation);
        this.this$0 = fileManagerModule;
        this.$storageDir = str;
        this.$promise = promise;
        this.$path = str2;
        this.$encoding = str3;
        this.$data = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileManagerModule$writeFile$1(this.this$0, this.$storageDir, this.$promise, this.$path, this.$encoding, this.$data, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileManagerModule$writeFile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        HashMap hashMap;
        HashMap hashMap2;
        boolean z;
        String str;
        HashMap hashMap3;
        C13277d.m2869d();
        if (this.label == 0) {
            C11586t.m7586b(obj);
            hashMap = this.this$0.storageDirs;
            if (!hashMap.containsKey(this.$storageDir)) {
                Promise promise = this.$promise;
                String str2 = this.$storageDir;
                hashMap3 = this.this$0.storageDirs;
                promise.reject("err", "Unknown storage directory " + str2 + ". Supported storage directories: " + hashMap3.keySet());
                return Unit.f25302a;
            }
            try {
                hashMap2 = this.this$0.storageDirs;
                Object obj2 = hashMap2.get(this.$storageDir);
                C9612q.m13920e(obj2);
                File file = new File((String) obj2, this.$path);
                File parentFile = file.getParentFile();
                boolean z2 = true;
                if (parentFile != null && !parentFile.exists()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    File parentFile2 = file.getParentFile();
                    if (parentFile2 == null || parentFile2.mkdirs()) {
                        z2 = false;
                    }
                    if (z2) {
                        Promise promise2 = this.$promise;
                        File parentFile3 = file.getParentFile();
                        if (parentFile3 != null) {
                            str = parentFile3.toString();
                        } else {
                            str = null;
                        }
                        promise2.reject((String) null, "Failed to create parent directory " + str);
                    }
                }
                if (C9612q.m13922c(this.$encoding, "base64")) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(Base64.decode(this.$data, 0));
                    Unit unit = Unit.f25302a;
                    C14180c.m514a(fileOutputStream, null);
                } else {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    byte[] bytes = this.$data.getBytes(C12785a.f33142b);
                    C9612q.m13918g(bytes, "this as java.lang.String).getBytes(charset)");
                    fileOutputStream2.write(bytes);
                    Unit unit2 = Unit.f25302a;
                    C14180c.m514a(fileOutputStream2, null);
                }
                this.$promise.resolve(file.getAbsolutePath());
            } catch (Throwable th2) {
                this.$promise.reject(th2);
            }
            return Unit.f25302a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package com.discord.media.utils;

import com.discord.media.utils.MediaResolver;
import java.io.File;
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
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.media.utils.MediaResolver$checkFreeSpace$2", m13986f = "MediaResolver.kt", m13985l = {}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaResolver$checkFreeSpace$2 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MediaResolver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaResolver$checkFreeSpace$2(MediaResolver mediaResolver, Continuation<? super MediaResolver$checkFreeSpace$2> continuation) {
        super(2, continuation);
        this.this$0 = mediaResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaResolver$checkFreeSpace$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaResolver$checkFreeSpace$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        File file;
        File file2;
        MediaResolver.Companion companion;
        File file3;
        File[] listFiles;
        boolean m13758H;
        C13277d.m2869d();
        if (this.label == 0) {
            C11586t.m7586b(obj);
            file = this.this$0.cacheDir;
            file2 = this.this$0.cacheDir;
            if (file.getUsableSpace() / file2.getTotalSpace() < 0.2d) {
                long currentTimeMillis = System.currentTimeMillis();
                companion = MediaResolver.Companion;
                long half_day_millis = currentTimeMillis - companion.getHALF_DAY_MILLIS();
                file3 = this.this$0.cacheDir;
                File[] listFiles2 = file3.listFiles();
                if (listFiles2 != null) {
                    for (File file4 : listFiles2) {
                        if (file4.isFile()) {
                            String name = file4.getName();
                            C9612q.m13918g(name, "cacheItem.name");
                            m13758H = C9653o.m13758H(name, "temp_", false, 2, null);
                            if (m13758H && file4.lastModified() < half_day_millis) {
                                file4.delete();
                            }
                        }
                        if (file4.isDirectory() && C9612q.m13922c(file4.getName(), "compressor") && (listFiles = file4.listFiles()) != null) {
                            C9612q.m13918g(listFiles, "listFiles()");
                            for (File file5 : listFiles) {
                                if (file5.isFile() && file5.lastModified() < half_day_millis) {
                                    file5.delete();
                                }
                            }
                        }
                    }
                }
            }
            return Unit.f25302a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
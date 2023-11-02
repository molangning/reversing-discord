package com.discord.media.utils;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import p467zf.C14180c;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/net/Uri;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.media.utils.MediaResolver$copyToFile$2", m13986f = "MediaResolver.kt", m13985l = {}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaResolver$copyToFile$2 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
    final /* synthetic */ File $targetFile;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ MediaResolver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaResolver$copyToFile$2(File file, MediaResolver mediaResolver, Uri uri, Continuation<? super MediaResolver$copyToFile$2> continuation) {
        super(2, continuation);
        this.$targetFile = file;
        this.this$0 = mediaResolver;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaResolver$copyToFile$2(this.$targetFile, this.this$0, this.$uri, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
        return ((MediaResolver$copyToFile$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        ContentResolver resolver;
        ContentResolver resolver2;
        C13277d.m2869d();
        if (this.label == 0) {
            C11586t.m7586b(obj);
            File file = this.$targetFile;
            if (file == null) {
                ContentResolverUtils contentResolverUtils = ContentResolverUtils.INSTANCE;
                resolver2 = this.this$0.getResolver();
                file = ContentResolverUtils.createTempFile$default(contentResolverUtils, resolver2, this.$uri, null, null, 6, null);
            }
            MediaResolver mediaResolver = this.this$0;
            Uri uri = this.$uri;
            resolver = mediaResolver.getResolver();
            InputStream inputStream = resolver.openInputStream(uri);
            if (inputStream != null) {
                try {
                    C9612q.m13918g(inputStream, "inputStream");
                    FileUtilsKt.writeTo(inputStream, file);
                    Unit unit = Unit.f25302a;
                    C14180c.m514a(inputStream, null);
                } finally {
                }
            }
            Uri fromFile = Uri.fromFile(file);
            C9612q.m13918g(fromFile, "fromFile(this)");
            return fromFile;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
package com.discord.media.utils;

import android.content.ContentResolver;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/net/Uri;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.media.utils.MediaResolver$resolveToUri$2", m13986f = "MediaResolver.kt", m13985l = {57, 60, 61, 62}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaResolver$resolveToUri$2 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
    final /* synthetic */ int $imageCompressionQuality;
    final /* synthetic */ Uri $inputUri;
    final /* synthetic */ boolean $isLowQuality;
    final /* synthetic */ VideoCompressionQuality $videoCompressionQuality;
    int label;
    final /* synthetic */ MediaResolver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaResolver$resolveToUri$2(MediaResolver mediaResolver, Uri uri, VideoCompressionQuality videoCompressionQuality, int i, boolean z, Continuation<? super MediaResolver$resolveToUri$2> continuation) {
        super(2, continuation);
        this.this$0 = mediaResolver;
        this.$inputUri = uri;
        this.$videoCompressionQuality = videoCompressionQuality;
        this.$imageCompressionQuality = i;
        this.$isLowQuality = z;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaResolver$resolveToUri$2(this.this$0, this.$inputUri, this.$videoCompressionQuality, this.$imageCompressionQuality, this.$isLowQuality, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
        return ((MediaResolver$resolveToUri$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        Object checkFreeSpace;
        ContentResolver resolver;
        ContentResolver resolver2;
        m2869d = C13277d.m2869d();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C11586t.m7586b(obj);
                            return (Uri) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C11586t.m7586b(obj);
                    return (Uri) obj;
                }
                C11586t.m7586b(obj);
                return (Uri) obj;
            }
            C11586t.m7586b(obj);
        } else {
            C11586t.m7586b(obj);
            MediaResolver mediaResolver = this.this$0;
            this.label = 1;
            checkFreeSpace = mediaResolver.checkFreeSpace(this);
            if (checkFreeSpace == m2869d) {
                return m2869d;
            }
        }
        ContentResolverUtils contentResolverUtils = ContentResolverUtils.INSTANCE;
        resolver = this.this$0.getResolver();
        if (contentResolverUtils.isVideo(resolver, this.$inputUri)) {
            MediaResolver mediaResolver2 = this.this$0;
            Uri uri = this.$inputUri;
            VideoCompressionQuality videoCompressionQuality = this.$videoCompressionQuality;
            this.label = 2;
            obj = mediaResolver2.handleVideo(uri, videoCompressionQuality, this);
            if (obj == m2869d) {
                return m2869d;
            }
            return (Uri) obj;
        }
        resolver2 = this.this$0.getResolver();
        if (contentResolverUtils.isImage(resolver2, this.$inputUri)) {
            MediaResolver mediaResolver3 = this.this$0;
            Uri uri2 = this.$inputUri;
            int i2 = this.$imageCompressionQuality;
            boolean z = this.$isLowQuality;
            this.label = 3;
            obj = mediaResolver3.handleImage(uri2, i2, z, this);
            if (obj == m2869d) {
                return m2869d;
            }
            return (Uri) obj;
        }
        MediaResolver mediaResolver4 = this.this$0;
        Uri uri3 = this.$inputUri;
        this.label = 4;
        obj = MediaResolver.copyToFile$default(mediaResolver4, uri3, null, this, 2, null);
        if (obj == m2869d) {
            return m2869d;
        }
        return (Uri) obj;
    }
}
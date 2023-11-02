package com.discord.media;

import android.net.Uri;
import com.discord.crash_reporting.CrashReporting;
import com.discord.media.utils.MediaResolver;
import com.discord.media.utils.VideoCompressionQuality;
import com.facebook.react.bridge.Promise;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.CoroutineScope;
import p304qf.C11889v;
import p388vf.C13277d;
import pf.C11583s;
import pf.C11586t;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.media.MediaManagerModule$resolveToMediaFilePath$1", m13986f = "MediaManagerModule.kt", m13985l = {74}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class MediaManagerModule$resolveToMediaFilePath$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $imageCompressionQuality;
    final /* synthetic */ Uri $inputUri;
    final /* synthetic */ boolean $isLowQuality;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ String $uri;
    final /* synthetic */ VideoCompressionQuality $videoCompressionQuality;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MediaManagerModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaManagerModule$resolveToMediaFilePath$1(MediaManagerModule mediaManagerModule, Uri uri, int i, VideoCompressionQuality videoCompressionQuality, boolean z, Promise promise, String str, Continuation<? super MediaManagerModule$resolveToMediaFilePath$1> continuation) {
        super(2, continuation);
        this.this$0 = mediaManagerModule;
        this.$inputUri = uri;
        this.$imageCompressionQuality = i;
        this.$videoCompressionQuality = videoCompressionQuality;
        this.$isLowQuality = z;
        this.$promise = promise;
        this.$uri = str;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MediaManagerModule$resolveToMediaFilePath$1 mediaManagerModule$resolveToMediaFilePath$1 = new MediaManagerModule$resolveToMediaFilePath$1(this.this$0, this.$inputUri, this.$imageCompressionQuality, this.$videoCompressionQuality, this.$isLowQuality, this.$promise, this.$uri, continuation);
        mediaManagerModule$resolveToMediaFilePath$1.L$0 = obj;
        return mediaManagerModule$resolveToMediaFilePath$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaManagerModule$resolveToMediaFilePath$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        Object m7596b;
        MediaResolver mediaResolver;
        Map m6751k;
        MediaResolver mediaResolver2;
        boolean z;
        Promise promise;
        m2869d = C13277d.m2869d();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    promise = (Promise) this.L$0;
                    C11586t.m7586b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C11586t.m7586b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                MediaManagerModule mediaManagerModule = this.this$0;
                Uri inputUri = this.$inputUri;
                int i2 = this.$imageCompressionQuality;
                VideoCompressionQuality videoCompressionQuality = this.$videoCompressionQuality;
                boolean z2 = this.$isLowQuality;
                Promise promise2 = this.$promise;
                C11583s.C11584a c11584a = C11583s.f30090k;
                mediaResolver2 = mediaManagerModule.mediaResolver;
                C9612q.m13918g(inputUri, "inputUri");
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
                this.L$0 = promise2;
                this.label = 1;
                obj = mediaResolver2.resolveToUri(inputUri, i2, videoCompressionQuality, z, this);
                if (obj == m2869d) {
                    return m2869d;
                }
                promise = promise2;
            }
            promise.resolve(((Uri) obj).toString());
            m7596b = C11583s.m7596b(Unit.f25302a);
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        Promise promise3 = this.$promise;
        String str = this.$uri;
        MediaManagerModule mediaManagerModule2 = this.this$0;
        Uri inputUri2 = this.$inputUri;
        Throwable m7593e = C11583s.m7593e(m7596b);
        if (m7593e != null) {
            if (m7593e instanceof CancellationException) {
                promise3.reject(m7593e);
            }
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            mediaResolver = mediaManagerModule2.mediaResolver;
            C9612q.m13918g(inputUri2, "inputUri");
            m6751k = C11889v.m6751k(C11591x.m7577a("uri", str), C11591x.m7577a("mimeType", String.valueOf(mediaResolver.getMimeType(inputUri2))));
            CrashReporting.addBreadcrumb$default(crashReporting, "Failed to resolve URI to file", m6751k, null, 4, null);
            crashReporting.captureException(m7593e);
            promise3.reject(m7593e);
        }
        return Unit.f25302a;
    }
}
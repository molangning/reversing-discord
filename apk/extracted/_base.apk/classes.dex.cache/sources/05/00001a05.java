package com.discord.media.utils;

import android.content.Context;
import android.net.Uri;
import com.linkedin.android.litr.MediaTransformer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9838p;
import kotlinx.coroutines.CancellableContinuation;
import p200kd.InterfaceC9216a;
import p215ld.C10131a;
import p388vf.C13272c;
import p388vf.C13277d;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005J?\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m14357d2 = {"Lcom/discord/media/utils/Transcoder;", "", "()V", "cancelCallbacks", "", "", "Lkotlin/Function0;", "", "cancel", "requestId", "convertCompress", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "mediaSource", "Lcom/discord/media/utils/DiscordVideoMediaSource;", "onProgress", "Lkotlin/Function1;", "", "(Ljava/lang/String;Landroid/content/Context;Lcom/discord/media/utils/DiscordVideoMediaSource;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class Transcoder {
    public static final Transcoder INSTANCE = new Transcoder();
    private static final Map<String, Function0<Unit>> cancelCallbacks = new LinkedHashMap();

    private Transcoder() {
    }

    public static /* synthetic */ Object convertCompress$default(Transcoder transcoder, String str, Context context, DiscordVideoMediaSource discordVideoMediaSource, Function1 function1, Continuation continuation, int i, Object obj) {
        Transcoder$convertCompress$2 transcoder$convertCompress$2 = function1;
        if ((i & 8) != 0) {
            transcoder$convertCompress$2 = Transcoder$convertCompress$2.INSTANCE;
        }
        return transcoder.convertCompress(str, context, discordVideoMediaSource, transcoder$convertCompress$2, continuation);
    }

    public final void cancel(String requestId) {
        C9612q.m13917h(requestId, "requestId");
        Function0<Unit> remove = cancelCallbacks.remove(requestId);
        if (remove != null) {
            remove.invoke();
        }
    }

    public final Object convertCompress(final String str, Context context, final DiscordVideoMediaSource discordVideoMediaSource, final Function1<? super Float, Unit> function1, Continuation<? super Uri> continuation) {
        Continuation m2870c;
        Object m2869d;
        m2870c = C13272c.m2870c(continuation);
        final C9838p c9838p = new C9838p(m2870c, 1);
        c9838p.m13155C();
        final MediaTransformer mediaTransformer = new MediaTransformer(context);
        cancelCallbacks.put(str, new Transcoder$convertCompress$3$1(mediaTransformer, str));
        mediaTransformer.m25578h(str, discordVideoMediaSource.getInputUri(), discordVideoMediaSource.getOutputUri(), discordVideoMediaSource.getVideoFormat(), discordVideoMediaSource.getAudioFormat(), new InterfaceC9216a() { // from class: com.discord.media.utils.Transcoder$convertCompress$3$2
            @Override // p200kd.InterfaceC9216a
            public void onCancelled(String id2, List<C10131a> list) {
                C9612q.m13917h(id2, "id");
                mediaTransformer.m25581e();
                Transcoder.cancelCallbacks.remove(str);
                if (c9838p.mo13140a()) {
                    CancellableContinuation.C9665a.m13597a(c9838p, null, 1, null);
                }
            }

            @Override // p200kd.InterfaceC9216a
            public void onCompleted(String id2, List<C10131a> list) {
                C9612q.m13917h(id2, "id");
                mediaTransformer.m25581e();
                function1.invoke(Float.valueOf(1.0f));
                Transcoder.cancelCallbacks.remove(str);
                CancellableContinuation<Uri> cancellableContinuation = c9838p;
                C11583s.C11584a c11584a = C11583s.f30090k;
                cancellableContinuation.resumeWith(C11583s.m7596b(discordVideoMediaSource.getOutputUri()));
            }

            @Override // p200kd.InterfaceC9216a
            public void onError(String id2, Throwable th2, List<C10131a> list) {
                C9612q.m13917h(id2, "id");
                mediaTransformer.m25581e();
                Transcoder.cancelCallbacks.remove(str);
                CancellableContinuation<Uri> cancellableContinuation = c9838p;
                C11583s.C11584a c11584a = C11583s.f30090k;
                if (th2 == null) {
                    th2 = new Throwable("Unknown transcoding error");
                }
                cancellableContinuation.resumeWith(C11583s.m7596b(C11586t.m7587a(th2)));
            }

            @Override // p200kd.InterfaceC9216a
            public void onProgress(String id2, float f) {
                C9612q.m13917h(id2, "id");
                function1.invoke(Float.valueOf(f));
            }

            @Override // p200kd.InterfaceC9216a
            public void onStarted(String id2) {
                C9612q.m13917h(id2, "id");
                function1.invoke(Float.valueOf(0.0f));
            }
        }, null);
        c9838p.mo13135l(new Transcoder$convertCompress$3$3(str));
        Object m13122y = c9838p.m13122y();
        m2869d = C13277d.m2869d();
        if (m13122y == m2869d) {
            C9573g.m13976c(continuation);
        }
        return m13122y;
    }
}
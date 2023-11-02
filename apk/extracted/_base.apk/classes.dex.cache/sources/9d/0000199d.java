package com.discord.media.engine.video.egl_renderer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import org.webrtc.Logging;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, m14357d2 = {"<anonymous>", "", "ex", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class EglRenderer$init$1$handler$1 extends AbstractC9614s implements Function1<Exception, Unit> {
    final /* synthetic */ EglRenderer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EglRenderer$init$1$handler$1(EglRenderer eglRenderer) {
        super(1);
        this.this$0 = eglRenderer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
        invoke2(exc);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(Exception ex) {
        Object obj;
        C9612q.m13917h(ex, "ex");
        Logging.m8409e("EglRenderer", "Exception on EglRenderer thread", ex);
        obj = this.this$0.handlerLock;
        EglRenderer eglRenderer = this.this$0;
        synchronized (obj) {
            eglRenderer.renderThreadHandler = null;
            Unit unit = Unit.f25302a;
        }
    }
}
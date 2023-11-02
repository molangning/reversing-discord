package com.discord.chat.presentation.message.view;

import com.discord.portals.PortalViewContextManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.chat.presentation.message.view.MediaView$onAttachedToWindow$1", m13986f = "MediaView.kt", m13985l = {134}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class MediaView$onAttachedToWindow$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MediaView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView$onAttachedToWindow$1(MediaView mediaView, Continuation<? super MediaView$onAttachedToWindow$1> continuation) {
        super(2, continuation);
        this.this$0 = mediaView;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaView$onAttachedToWindow$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaView$onAttachedToWindow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        m2869d = C13277d.m2869d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C11586t.m7586b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C11586t.m7586b(obj);
            Flow<PortalViewContextManager.Event> portalContextIdsFlow = PortalViewContextManager.INSTANCE.getPortalContextIdsFlow();
            final MediaView mediaView = this.this$0;
            FlowCollector<? super PortalViewContextManager.Event> flowCollector = new FlowCollector() { // from class: com.discord.chat.presentation.message.view.MediaView$onAttachedToWindow$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((PortalViewContextManager.Event) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(PortalViewContextManager.Event event, Continuation<? super Unit> continuation) {
                    MediaView.setMediaData$default(mediaView, null, false, false, false, null, false, null, event, false, false, false, 0, null, null, null, null, null, 130943, null);
                    return Unit.f25302a;
                }
            };
            this.label = 1;
            if (portalContextIdsFlow.collect(flowCollector, this) == m2869d) {
                return m2869d;
            }
        }
        return Unit.f25302a;
    }
}
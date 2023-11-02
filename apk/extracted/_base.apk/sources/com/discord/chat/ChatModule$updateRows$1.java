package com.discord.chat;

import com.discord.chat.bridge.row.RowSerializer;
import com.discord.chat.listmanager.ChatListManager;
import com.discord.chatreplay.logger.RowLogger;
import com.discord.crash_reporting.CrashReporting;
import com.discord.tti_manager.TTIMetrics;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.json.Json;
import p045cj.C2581f;
import p304qf.C11889v;
import p388vf.C13277d;
import pf.C11586t;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m14357d2 = {"Lcom/discord/chat/listmanager/ChatListManager;", "manager", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.chat.ChatModule$updateRows$1", m13986f = "ChatModule.kt", m13985l = {}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class ChatModule$updateRows$1 extends AbstractC9578k implements Function2<ChatListManager, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $rowsJSON;
    final /* synthetic */ int $tag;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatModule$updateRows$1(ChatModule chatModule, int i, String str, Continuation<? super ChatModule$updateRows$1> continuation) {
        super(2, continuation);
        this.this$0 = chatModule;
        this.$tag = i;
        this.$rowsJSON = str;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatModule$updateRows$1 chatModule$updateRows$1 = new ChatModule$updateRows$1(this.this$0, this.$tag, this.$rowsJSON, continuation);
        chatModule$updateRows$1.L$0 = obj;
        return chatModule$updateRows$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChatListManager chatListManager, Continuation<? super Unit> continuation) {
        return ((ChatModule$updateRows$1) create(chatListManager, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        RowLogger rowUpdateLoggerFor;
        int i;
        int i2;
        Map m6751k;
        Json json;
        C13277d.m2869d();
        if (this.label == 0) {
            C11586t.m7586b(obj);
            ChatListManager chatListManager = (ChatListManager) this.L$0;
            rowUpdateLoggerFor = this.this$0.rowUpdateLoggerFor(this.$tag);
            rowUpdateLoggerFor.logRowsUpdate(this.$rowsJSON);
            try {
                json = this.this$0.json;
                String str = this.$rowsJSON;
                json.mo265a();
                chatListManager.updateRows((List) json.mo232b(new C2581f(RowSerializer.INSTANCE), str));
            } catch (Exception e) {
                CrashReporting crashReporting = CrashReporting.INSTANCE;
                i = this.this$0.previousRowUpdateTag;
                ChatModule chatModule = this.this$0;
                i2 = chatModule.previousRowUpdateTag;
                m6751k = C11889v.m6751k(C11591x.m7577a("tag", String.valueOf(this.$tag)), C11591x.m7577a("tagRowSize", String.valueOf(chatListManager.getRowCount())), C11591x.m7577a("previousTag", String.valueOf(i)), C11591x.m7577a("previousTagRowSize", String.valueOf(chatModule.getChatListManager(i2).getRowCount())));
                CrashReporting.addBreadcrumb$default(crashReporting, "Bad row update", m6751k, null, 4, null);
                crashReporting.captureException(new Exception("Failed to update rows", e));
                String str2 = this.$rowsJSON;
                String message = e.getMessage();
                C9612q.m13920e(message);
                chatListManager.handleError(str2, message);
            }
            TTIMetrics.record$default(TTIMetrics.INSTANCE, "ChatModule.updateRows() Finish", 0L, null, false, 14, null);
            this.this$0.previousRowUpdateTag = this.$tag;
            return Unit.f25302a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

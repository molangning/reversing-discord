package com.discord.chat.input;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.json.JsonBuilder;

@Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "Lkotlinx/serialization/json/JsonBuilder;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class ChatInputViewManager$json$1 extends AbstractC9614s implements Function1<JsonBuilder, Unit> {
    public static final ChatInputViewManager$json$1 INSTANCE = new ChatInputViewManager$json$1();

    ChatInputViewManager$json$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
        invoke2(jsonBuilder);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JsonBuilder Json) {
        C9612q.m13917h(Json, "$this$Json");
        Json.m12770c(true);
    }
}

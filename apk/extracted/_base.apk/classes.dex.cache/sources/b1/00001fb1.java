package com.discord.simpleast.code;

import com.discord.simpleast.core.node.StyleNode;
import kotlin.Metadata;
import kotlin.collections.C9543h;

@Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u0002¨\u0006\u0003"}, m14357d2 = {"emptyProvider", "Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;", "R", "simpleast-core_release"}, m14356k = 2, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class CodeStyleProvidersKt {
    public static final <R> StyleNode.SpanProvider<R> emptyProvider() {
        return new StyleNode.SpanProvider<R>() { // from class: com.discord.simpleast.code.CodeStyleProvidersKt$emptyProvider$1
            @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
            public final Iterable<?> get(R r) {
                return C9543h.m14145i();
            }
        };
    }
}
package com.discord.chat.input.bridge;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlinx.serialization.KSerializer;
import p045cj.C2569c0;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class ChatInputNodeFontWeight$Companion$$cachedSerializer$delegate$1 extends AbstractC9614s implements Function0<KSerializer<Object>> {
    public static final ChatInputNodeFontWeight$Companion$$cachedSerializer$delegate$1 INSTANCE = new ChatInputNodeFontWeight$Companion$$cachedSerializer$delegate$1();

    ChatInputNodeFontWeight$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return C2569c0.m32959a("com.discord.chat.input.bridge.ChatInputNodeFontWeight", ChatInputNodeFontWeight.values(), new String[]{"bold"}, new Annotation[][]{null});
    }
}
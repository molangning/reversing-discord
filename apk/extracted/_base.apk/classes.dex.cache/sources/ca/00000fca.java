package com.discord.chat.bridge.contentnode;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9591f0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class EmojiContentNode$Companion$$cachedSerializer$delegate$1 extends AbstractC9614s implements Function0<KSerializer<Object>> {
    public static final EmojiContentNode$Companion$$cachedSerializer$delegate$1 INSTANCE = new EmojiContentNode$Companion$$cachedSerializer$delegate$1();

    EmojiContentNode$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return new SealedClassSerializer("com.discord.chat.bridge.contentnode.EmojiContentNode", C9591f0.m13969b(EmojiContentNode.class), new KClass[]{C9591f0.m13969b(CustomEmojiContentNode.class), C9591f0.m13969b(UnicodeEmojiContentNode.class)}, new KSerializer[]{CustomEmojiContentNode$$serializer.INSTANCE, UnicodeEmojiContentNode$$serializer.INSTANCE}, new Annotation[0]);
    }
}
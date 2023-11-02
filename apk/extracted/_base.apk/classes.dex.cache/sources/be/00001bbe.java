package com.discord.notifications.api;

import com.discord.notifications.api.StickerFormatType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlinx.serialization.KSerializer;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class StickerFormatType$Companion$$cachedSerializer$delegate$1 extends AbstractC9614s implements Function0<KSerializer<Object>> {
    public static final StickerFormatType$Companion$$cachedSerializer$delegate$1 INSTANCE = new StickerFormatType$Companion$$cachedSerializer$delegate$1();

    StickerFormatType$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return StickerFormatType.Serializer.INSTANCE;
    }
}
package com.discord.chat.bridge.botuikit;

import com.discord.chat.bridge.botuikit.ActionComponentState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlinx.serialization.KSerializer;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class ActionComponentState$Companion$$cachedSerializer$delegate$1 extends AbstractC9614s implements Function0<KSerializer<Object>> {
    public static final ActionComponentState$Companion$$cachedSerializer$delegate$1 INSTANCE = new ActionComponentState$Companion$$cachedSerializer$delegate$1();

    ActionComponentState$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return ActionComponentState.Serializer.INSTANCE;
    }
}
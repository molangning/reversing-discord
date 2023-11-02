package com.discord.chat.bridge.interaction;

import com.discord.chat.bridge.interaction.InteractionStatusViewState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlinx.serialization.KSerializer;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* renamed from: com.discord.chat.bridge.interaction.InteractionStatusViewState$Companion$$cachedSerializer$delegate$1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class C2918xb1fb8692 extends AbstractC9614s implements Function0<KSerializer<Object>> {
    public static final C2918xb1fb8692 INSTANCE = new C2918xb1fb8692();

    C2918xb1fb8692() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return InteractionStatusViewState.Serializer.INSTANCE;
    }
}
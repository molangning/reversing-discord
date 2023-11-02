package com.discord.mobile_voice_overlay;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlinx.serialization.KSerializer;
import p045cj.C2569c0;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class ConnectionQuality$Companion$$cachedSerializer$delegate$1 extends AbstractC9614s implements Function0<KSerializer<Object>> {
    public static final ConnectionQuality$Companion$$cachedSerializer$delegate$1 INSTANCE = new ConnectionQuality$Companion$$cachedSerializer$delegate$1();

    ConnectionQuality$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return C2569c0.m32959a("com.discord.mobile_voice_overlay.ConnectionQuality", ConnectionQuality.values(), new String[]{"fine", "average", "bad", "unknown"}, new Annotation[][]{null, null, null, null});
    }
}
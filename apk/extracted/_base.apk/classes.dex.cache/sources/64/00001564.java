package com.discord.chat.reactevents;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlinx.serialization.KSerializer;
import p045cj.C2592h1;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class TapOpTagData$$cachedSerializer$delegate$1 extends AbstractC9614s implements Function0<KSerializer<Object>> {
    public static final TapOpTagData$$cachedSerializer$delegate$1 INSTANCE = new TapOpTagData$$cachedSerializer$delegate$1();

    TapOpTagData$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return new C2592h1("com.discord.chat.reactevents.TapOpTagData", TapOpTagData.INSTANCE, new Annotation[0]);
    }
}
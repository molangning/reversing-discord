package com.discord.chat.bridge.botuikit;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9591f0;
import kotlinx.serialization.KSerializer;
import p470zi.C14272c;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class SelectComponent$Companion$$cachedSerializer$delegate$1 extends AbstractC9614s implements Function0<KSerializer<Object>> {
    public static final SelectComponent$Companion$$cachedSerializer$delegate$1 INSTANCE = new SelectComponent$Companion$$cachedSerializer$delegate$1();

    SelectComponent$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return new C14272c(C9591f0.m13969b(SelectComponent.class), new Annotation[0]);
    }
}
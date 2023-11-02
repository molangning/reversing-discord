package com.discord.media.engine;

import com.discord.p047native.engine.NativeEngine;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "input", "", "onNoInput"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaEngine$setOnNoInputCallback$1$1 implements NativeEngine.OnNoInputCallback {
    final /* synthetic */ Function1<Boolean, Unit> $cb;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaEngine$setOnNoInputCallback$1$1(Function1<? super Boolean, Unit> function1) {
        this.$cb = function1;
    }

    @Override // com.discord.p047native.engine.NativeEngine.OnNoInputCallback
    public final void onNoInput(boolean z) {
        this.$cb.invoke(Boolean.valueOf(z));
    }
}
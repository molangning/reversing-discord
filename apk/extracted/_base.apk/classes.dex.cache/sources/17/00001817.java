package com.discord.image.animated_image.animated_image_utils;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0002\b\u0005"}, m14357d2 = {"<anonymous>", "", "T", "stateManager", "Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class AnimatedImageStateManager$updateWorker$1 extends AbstractC9614s implements Function1<AnimatedImageStateManager<?>, Unit> {
    public static final AnimatedImageStateManager$updateWorker$1 INSTANCE = new AnimatedImageStateManager$updateWorker$1();

    AnimatedImageStateManager$updateWorker$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedImageStateManager<?> animatedImageStateManager) {
        invoke2(animatedImageStateManager);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(AnimatedImageStateManager<?> stateManager) {
        C9612q.m13917h(stateManager, "stateManager");
        stateManager.reload();
    }
}
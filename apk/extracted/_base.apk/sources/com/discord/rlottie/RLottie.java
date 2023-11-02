package com.discord.rlottie;

import kotlin.Metadata;

@Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/rlottie/RLottie;", "", "()V", "init", "", "rlottie_release"}, m14356k = 1, m14355mv = {1, 1, 16})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class RLottie {
    public static final RLottie INSTANCE = new RLottie();

    private RLottie() {
    }

    public final void init() {
        System.loadLibrary("dsti");
    }
}

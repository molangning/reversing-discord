package com.discord.media.engine;

import com.facebook.react.bridge.Callback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m14357d2 = {"<anonymous>", "", "code", "", "desc", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* renamed from: com.discord.media.engine.MediaEngineModule$speedTestConnectionInstanceStartSpeedTestSender$1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class C3248x14b0f3 extends AbstractC9614s implements Function2<Integer, String, Unit> {
    final /* synthetic */ Callback $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3248x14b0f3(Callback callback) {
        super(2);
        this.$callback = callback;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str) {
        invoke(num.intValue(), str);
        return Unit.f25302a;
    }

    public final void invoke(int i, String desc) {
        C9612q.m13917h(desc, "desc");
        this.$callback.invoke(Integer.valueOf(i), desc);
    }
}
package com.discord.media.engine;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.Callback;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m14357d2 = {"<anonymous>", "", "errorMessage", "", "connectionInfo", "", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class MediaEngineModule$createSpeedTestConnectionWithOptions$1 extends AbstractC9614s implements Function2<String, Map<String, ? extends Object>, Unit> {
    final /* synthetic */ Callback $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngineModule$createSpeedTestConnectionWithOptions$1(Callback callback) {
        super(2);
        this.$callback = callback;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Map<String, ? extends Object> map) {
        invoke2(str, map);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(String errorMessage, Map<String, ? extends Object> connectionInfo) {
        C9612q.m13917h(errorMessage, "errorMessage");
        C9612q.m13917h(connectionInfo, "connectionInfo");
        this.$callback.invoke(errorMessage, NativeMapExtensionsKt.toNativeMap(connectionInfo));
    }
}
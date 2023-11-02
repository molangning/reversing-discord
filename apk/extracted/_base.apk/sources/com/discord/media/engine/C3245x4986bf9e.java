package com.discord.media.engine;

import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.facebook.react.bridge.Callback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"<anonymous>", "", "modes", "", "", "invoke", "([Ljava/lang/String;)V"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* renamed from: com.discord.media.engine.MediaEngineModule$speedTestConnectionInstanceGetEncryptionModes$1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class C3245x4986bf9e extends AbstractC9614s implements Function1<String[], Unit> {
    final /* synthetic */ Callback $callback;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3245x4986bf9e(Callback callback) {
        super(1);
        this.$callback = callback;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String[] strArr) {
        invoke2(strArr);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String[] modes) {
        C9612q.m13917h(modes, "modes");
        this.$callback.invoke(NativeArrayExtensionsKt.toNativeArray(modes));
    }
}

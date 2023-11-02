package com.discord.media.engine;

import android.net.Uri;
import com.facebook.react.bridge.Callback;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m14357d2 = {"<anonymous>", "", "fileName", "", "durationMs", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class MediaEngineModule$stopLocalAudioRecording$1 extends AbstractC9614s implements Function2<String, Integer, Unit> {
    final /* synthetic */ Callback $callback;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngineModule$stopLocalAudioRecording$1(Callback callback) {
        super(2);
        this.$callback = callback;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
        invoke(str, num.intValue());
        return Unit.f25302a;
    }

    public final void invoke(String fileName, int i) {
        C9612q.m13917h(fileName, "fileName");
        Uri fromFile = Uri.fromFile(new File(fileName));
        C9612q.m13918g(fromFile, "fromFile(this)");
        this.$callback.invoke(fromFile.toString(), Integer.valueOf(i));
    }
}

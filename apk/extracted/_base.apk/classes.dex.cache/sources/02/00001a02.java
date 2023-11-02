package com.discord.media.utils;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "it", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaResolver$handleVideo$2$compressedUri$1 extends AbstractC9614s implements Function1<Float, Unit> {
    final /* synthetic */ Uri $inputUri;
    final /* synthetic */ MediaResolver $this_runCatching;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaResolver$handleVideo$2$compressedUri$1(MediaResolver mediaResolver, Uri uri) {
        super(1);
        this.$this_runCatching = mediaResolver;
        this.$inputUri = uri;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(f.floatValue());
        return Unit.f25302a;
    }

    public final void invoke(float f) {
        Function2 function2;
        function2 = this.$this_runCatching.onProgress;
        function2.invoke(this.$inputUri, Integer.valueOf((int) (f * 100)));
    }
}
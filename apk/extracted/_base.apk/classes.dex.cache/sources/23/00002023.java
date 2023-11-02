package com.discord.sounds.utils;

import com.discord.file_downloader.DownloadState;
import com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC9571e(m13987c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1", m13986f = "SoundExtensions.kt", m13985l = {47, 57, 63}, m13984m = "emit")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class SoundExtensionsKt$fetchSound$1$1$emit$1 extends AbstractC9570d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SoundExtensionsKt$fetchSound$1.C34911<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SoundExtensionsKt$fetchSound$1$1$emit$1(SoundExtensionsKt$fetchSound$1.C34911<? super T> c34911, Continuation<? super SoundExtensionsKt$fetchSound$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = c34911;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((DownloadState) null, (Continuation<? super Unit>) this);
    }
}
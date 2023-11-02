package com.discord.image.animated_image.apng;

import com.discord.file_downloader.DownloadState;
import com.discord.image.animated_image.apng.APNGView$fetchAPNG$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC9571e(m13987c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1", m13986f = "APNGView.kt", m13985l = {92, 102, 108}, m13984m = "emit")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class APNGView$fetchAPNG$1$1$emit$1 extends AbstractC9570d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ APNGView$fetchAPNG$1.C32071<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public APNGView$fetchAPNG$1$1$emit$1(APNGView$fetchAPNG$1.C32071<? super T> c32071, Continuation<? super APNGView$fetchAPNG$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = c32071;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((DownloadState) null, (Continuation<? super Unit>) this);
    }
}
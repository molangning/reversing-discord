package com.discord.react_asset_fetcher;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9810j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import pf.C11586t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.react_asset_fetcher.ReactAssetUtilsKt$setReactIcon$1", m13986f = "ReactAssetUtils.kt", m13985l = {57}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class ReactAssetUtilsKt$setReactIcon$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $assetUrl;
    final /* synthetic */ MaterialButton $this_setReactIcon;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactAssetUtilsKt$setReactIcon$1(MaterialButton materialButton, String str, Continuation<? super ReactAssetUtilsKt$setReactIcon$1> continuation) {
        super(2, continuation);
        this.$this_setReactIcon = materialButton;
        this.$assetUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReactAssetUtilsKt$setReactIcon$1(this.$this_setReactIcon, this.$assetUrl, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReactAssetUtilsKt$setReactIcon$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        MaterialButton materialButton;
        m2869d = C13277d.m2869d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                materialButton = (MaterialButton) this.L$0;
                C11586t.m7586b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C11586t.m7586b(obj);
            MaterialButton materialButton2 = this.$this_setReactIcon;
            String str = this.$assetUrl;
            CoroutineDispatcher m13569b = C9677b1.m13569b();
            ReactAssetUtilsKt$setReactIcon$1$1$1 reactAssetUtilsKt$setReactIcon$1$1$1 = new ReactAssetUtilsKt$setReactIcon$1$1$1(materialButton2, str, null);
            this.L$0 = materialButton2;
            this.label = 1;
            Object m13190g = C9810j.m13190g(m13569b, reactAssetUtilsKt$setReactIcon$1$1$1, this);
            if (m13190g == m2869d) {
                return m2869d;
            }
            materialButton = materialButton2;
            obj = m13190g;
        }
        materialButton.setIcon((Drawable) obj);
        return Unit.f25302a;
    }
}

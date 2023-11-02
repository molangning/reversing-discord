package com.discord.react_asset_fetcher;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.react.util.JSStackTrace;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.google.android.material.button.MaterialButton;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import pf.C11586t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/graphics/drawable/Drawable;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.react_asset_fetcher.ReactAssetUtilsKt$setReactIcon$1$1$1", m13986f = "ReactAssetUtils.kt", m13985l = {}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class ReactAssetUtilsKt$setReactIcon$1$1$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Drawable>, Object> {
    final /* synthetic */ String $assetUrl;
    final /* synthetic */ MaterialButton $this_setReactIcon;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactAssetUtilsKt$setReactIcon$1$1$1(MaterialButton materialButton, String str, Continuation<? super ReactAssetUtilsKt$setReactIcon$1$1$1> continuation) {
        super(2, continuation);
        this.$this_setReactIcon = materialButton;
        this.$assetUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReactAssetUtilsKt$setReactIcon$1$1$1(this.$this_setReactIcon, this.$assetUrl, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Drawable> continuation) {
        return ((ReactAssetUtilsKt$setReactIcon$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        C13277d.m2869d();
        if (this.label == 0) {
            C11586t.m7586b(obj);
            ImageSource imageSource = new ImageSource(this.$this_setReactIcon.getContext(), this.$assetUrl);
            MaterialButton materialButton = this.$this_setReactIcon;
            if (imageSource.isResource()) {
                Drawable resourceDrawable = ResourceDrawableIdHelper.getInstance().getResourceDrawable(materialButton.getContext(), imageSource.getSource());
                C9612q.m13920e(resourceDrawable);
                return resourceDrawable;
            } else if (C9612q.m13922c(imageSource.getUri().getScheme(), JSStackTrace.FILE_KEY)) {
                Drawable createFromPath = Drawable.createFromPath(imageSource.getUri().getPath());
                C9612q.m13920e(createFromPath);
                return createFromPath;
            } else {
                URLConnection openConnection = new URL(imageSource.getSource()).openConnection();
                C9612q.m13919f(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.connect();
                return new BitmapDrawable(materialButton.getResources(), BitmapFactory.decodeStream(httpURLConnection.getInputStream()));
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
package com.discord.react_asset_fetcher;

import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.views.imagehelper.ImageSource;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9818l;

@Metadata(m14358d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u001a\u0012\u0010\b\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\t\u001a\u00020\n\u001a\u001c\u0010\u000b\u001a\u00020\u0005*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0001\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u000f\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0010"}, m14357d2 = {"getReactImageUrl", "", "Landroid/content/Context;", "assetUrl", "setOptionalReactImageUrl", "", "Lcom/facebook/drawee/view/SimpleDraweeView;", "url", "setReactAsset", "asset", "Lcom/discord/react_asset_fetcher/ReactAsset;", "setReactIcon", "Lcom/google/android/material/button/MaterialButton;", "iconSize", "", "setReactImageUrl", "react_asset_fetcher_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class ReactAssetUtilsKt {
    public static final String getReactImageUrl(Context context, String assetUrl) {
        C9612q.m13917h(context, "<this>");
        C9612q.m13917h(assetUrl, "assetUrl");
        String uri = new ImageSource(context, assetUrl).getUri().toString();
        C9612q.m13918g(uri, "ImageSource(this, assetUrl).uri.toString()");
        return uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void setOptionalReactImageUrl(com.facebook.drawee.view.SimpleDraweeView r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9612q.m13917h(r2, r0)
            r0 = 0
            if (r3 == 0) goto L11
            boolean r1 = kotlin.text.C9642f.m13789w(r3)
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = r0
            goto L12
        L11:
            r1 = 1
        L12:
            if (r1 == 0) goto L1e
            r3 = 8
            r2.setVisibility(r3)
            r3 = 0
            r2.setImageURI(r3)
            goto L24
        L1e:
            r2.setVisibility(r0)
            setReactImageUrl(r2, r3)
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.react_asset_fetcher.ReactAssetUtilsKt.setOptionalReactImageUrl(com.facebook.drawee.view.SimpleDraweeView, java.lang.String):void");
    }

    public static final void setReactAsset(SimpleDraweeView simpleDraweeView, ReactAsset asset) {
        C9612q.m13917h(simpleDraweeView, "<this>");
        C9612q.m13917h(asset, "asset");
        Context context = simpleDraweeView.getContext();
        C9612q.m13918g(context, "context");
        setReactImageUrl(simpleDraweeView, asset.getUri(context));
    }

    public static final void setReactIcon(MaterialButton materialButton, String assetUrl, int i) {
        C9612q.m13917h(materialButton, "<this>");
        C9612q.m13917h(assetUrl, "assetUrl");
        materialButton.setIconSize(i);
        materialButton.setIcon(new PaintDrawable(0));
        C9818l.m13179d(CoroutineViewUtilsKt.getAttachedScope(materialButton), null, null, new ReactAssetUtilsKt$setReactIcon$1(materialButton, assetUrl, null), 3, null);
    }

    public static final void setReactImageUrl(SimpleDraweeView simpleDraweeView, String assetUrl) {
        C9612q.m13917h(simpleDraweeView, "<this>");
        C9612q.m13917h(assetUrl, "assetUrl");
        Context context = simpleDraweeView.getContext();
        C9612q.m13918g(context, "context");
        simpleDraweeView.setImageURI(getReactImageUrl(context, assetUrl));
    }
}
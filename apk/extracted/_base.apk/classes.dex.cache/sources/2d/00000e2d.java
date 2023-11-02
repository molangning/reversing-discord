package com.discord.bridge;

import com.discord.p048qr.scanner.QRScannerViewManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m14357d2 = {"<anonymous>", "Lcom/facebook/react/uimanager/ViewManager;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "it", "Lcom/facebook/react/bridge/ReactApplicationContext;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class DCDPackageList$getPackages$65 extends AbstractC9614s implements Function1<ReactApplicationContext, ViewManager<?, LayoutShadowNode>> {
    public static final DCDPackageList$getPackages$65 INSTANCE = new DCDPackageList$getPackages$65();

    DCDPackageList$getPackages$65() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ViewManager<?, LayoutShadowNode> invoke(ReactApplicationContext it) {
        C9612q.m13917h(it, "it");
        return new QRScannerViewManager();
    }
}
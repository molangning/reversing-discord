package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.packagerconnection.RequestHandler;
import java.util.Map;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DefaultDevSupportManagerFactory implements DevSupportManagerFactory {
    private static final String DEVSUPPORT_IMPL_CLASS = "BridgeDevSupportManager";
    private static final String DEVSUPPORT_IMPL_PACKAGE = "com.facebook.react.devsupport";

    @Deprecated
    public DevSupportManager create(Context context, ReactInstanceDevHelper reactInstanceDevHelper, String str, boolean z, int i) {
        return create(context, reactInstanceDevHelper, str, z, null, null, i, null, null, null);
    }

    @Override // com.facebook.react.devsupport.DevSupportManagerFactory
    public DevSupportManager create(Context context, ReactInstanceDevHelper reactInstanceDevHelper, String str, boolean z, RedBoxHandler redBoxHandler, DevBundleDownloadListener devBundleDownloadListener, int i, Map<String, RequestHandler> map, SurfaceDelegateFactory surfaceDelegateFactory, DevLoadingViewManager devLoadingViewManager) {
        if (!z) {
            return new DisabledDevSupportManager();
        }
        try {
            return (DevSupportManager) Class.forName(DEVSUPPORT_IMPL_PACKAGE + "." + DEVSUPPORT_IMPL_CLASS).getConstructor(Context.class, ReactInstanceDevHelper.class, String.class, Boolean.TYPE, RedBoxHandler.class, DevBundleDownloadListener.class, Integer.TYPE, Map.class, SurfaceDelegateFactory.class, DevLoadingViewManager.class).newInstance(context, reactInstanceDevHelper, str, Boolean.TRUE, redBoxHandler, devBundleDownloadListener, Integer.valueOf(i), map, surfaceDelegateFactory, devLoadingViewManager);
        } catch (Exception unused) {
            return new PerftestDevSupportManager(context);
        }
    }
}

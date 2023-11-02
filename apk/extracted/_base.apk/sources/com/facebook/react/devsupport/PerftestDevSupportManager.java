package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.devsupport.DevInternalSettings;
import com.facebook.react.devsupport.InspectorPackagerConnection;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class PerftestDevSupportManager extends DisabledDevSupportManager {
    private final InspectorPackagerConnection.BundleStatus mBundleStatus;
    private final DevServerHelper mDevServerHelper;
    private final DevInternalSettings mDevSettings;

    public PerftestDevSupportManager(Context context) {
        DevInternalSettings devInternalSettings = new DevInternalSettings(context, new DevInternalSettings.Listener() { // from class: com.facebook.react.devsupport.PerftestDevSupportManager.1
            @Override // com.facebook.react.devsupport.DevInternalSettings.Listener
            public void onInternalSettingsChanged() {
            }
        });
        this.mDevSettings = devInternalSettings;
        this.mBundleStatus = new InspectorPackagerConnection.BundleStatus();
        this.mDevServerHelper = new DevServerHelper(devInternalSettings, context.getPackageName(), new InspectorPackagerConnection.BundleStatusProvider() { // from class: com.facebook.react.devsupport.PerftestDevSupportManager.2
            @Override // com.facebook.react.devsupport.InspectorPackagerConnection.BundleStatusProvider
            public InspectorPackagerConnection.BundleStatus getBundleStatus() {
                return PerftestDevSupportManager.this.mBundleStatus;
            }
        });
    }

    @Override // com.facebook.react.devsupport.DisabledDevSupportManager, com.facebook.react.devsupport.interfaces.DevSupportManager
    public void startInspector() {
        this.mDevServerHelper.openInspectorConnection();
    }

    @Override // com.facebook.react.devsupport.DisabledDevSupportManager, com.facebook.react.devsupport.interfaces.DevSupportManager
    public void stopInspector() {
        this.mDevServerHelper.closeInspectorConnection();
    }

    @Override // com.facebook.react.devsupport.DisabledDevSupportManager, com.facebook.react.devsupport.interfaces.DevSupportManager
    public DevInternalSettings getDevSettings() {
        return this.mDevSettings;
    }
}

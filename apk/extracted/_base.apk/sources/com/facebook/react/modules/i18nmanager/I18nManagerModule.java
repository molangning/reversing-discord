package com.facebook.react.modules.i18nmanager;

import android.os.Build;
import android.os.LocaleList;
import com.facebook.fbreact.specs.NativeI18nManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@ReactModule(name = NativeI18nManagerSpec.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class I18nManagerModule extends NativeI18nManagerSpec {
    private final I18nUtil sharedI18nUtilInstance;

    public I18nManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.sharedI18nUtilInstance = I18nUtil.getInstance();
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void allowRTL(boolean z) {
        this.sharedI18nUtilInstance.allowRTL(getReactApplicationContext(), z);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void forceRTL(boolean z) {
        this.sharedI18nUtilInstance.forceRTL(getReactApplicationContext(), z);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public Map<String, Object> getTypedExportedConstants() {
        Locale locale;
        LocaleList locales;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = reactApplicationContext.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
        } else {
            locale = reactApplicationContext.getResources().getConfiguration().locale;
        }
        HashMap newHashMap = MapBuilder.newHashMap();
        newHashMap.put("isRTL", Boolean.valueOf(this.sharedI18nUtilInstance.isRTL(reactApplicationContext)));
        newHashMap.put("doLeftAndRightSwapInRTL", Boolean.valueOf(this.sharedI18nUtilInstance.doLeftAndRightSwapInRTL(reactApplicationContext)));
        newHashMap.put("localeIdentifier", locale.toString());
        return newHashMap;
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void swapLeftAndRightInRTL(boolean z) {
        this.sharedI18nUtilInstance.swapLeftAndRightInRTL(getReactApplicationContext(), z);
    }
}

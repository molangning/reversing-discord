package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.text.C1130u;
import java.util.Locale;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class I18nUtil {
    private static final String KEY_FOR_PERFS_MAKE_RTL_FLIP_LEFT_AND_RIGHT_STYLES = "RCTI18nUtil_makeRTLFlipLeftAndRightStyles";
    private static final String KEY_FOR_PREFS_ALLOWRTL = "RCTI18nUtil_allowRTL";
    private static final String KEY_FOR_PREFS_FORCERTL = "RCTI18nUtil_forceRTL";
    private static final String SHARED_PREFS_NAME = "com.facebook.react.modules.i18nmanager.I18nUtil";
    private static I18nUtil sharedI18nUtilInstance;

    private I18nUtil() {
    }

    public static I18nUtil getInstance() {
        if (sharedI18nUtilInstance == null) {
            sharedI18nUtilInstance = new I18nUtil();
        }
        return sharedI18nUtilInstance;
    }

    private boolean isDevicePreferredLanguageRTL() {
        return C1130u.m37845a(Locale.getDefault()) == 1;
    }

    private boolean isPrefSet(Context context, String str, boolean z) {
        return context.getSharedPreferences(SHARED_PREFS_NAME, 0).getBoolean(str, z);
    }

    private boolean isRTLAllowed(Context context) {
        return isPrefSet(context, KEY_FOR_PREFS_ALLOWRTL, true);
    }

    private boolean isRTLForced(Context context) {
        return isPrefSet(context, KEY_FOR_PREFS_FORCERTL, false);
    }

    private void setPref(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences(SHARED_PREFS_NAME, 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public void allowRTL(Context context, boolean z) {
        setPref(context, KEY_FOR_PREFS_ALLOWRTL, z);
    }

    public boolean doLeftAndRightSwapInRTL(Context context) {
        return isPrefSet(context, KEY_FOR_PERFS_MAKE_RTL_FLIP_LEFT_AND_RIGHT_STYLES, true);
    }

    public void forceRTL(Context context, boolean z) {
        setPref(context, KEY_FOR_PREFS_FORCERTL, z);
    }

    public boolean isRTL(Context context) {
        if (isRTLForced(context)) {
            return true;
        }
        if (isRTLAllowed(context) && isDevicePreferredLanguageRTL()) {
            return true;
        }
        return false;
    }

    public void swapLeftAndRightInRTL(Context context, boolean z) {
        setPref(context, KEY_FOR_PERFS_MAKE_RTL_FLIP_LEFT_AND_RIGHT_STYLES, z);
    }
}
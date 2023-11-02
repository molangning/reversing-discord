package com.facebook.react.devsupport;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import com.facebook.react.C3893R;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DevSettingsActivity extends PreferenceActivity {
    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getApplication().getResources().getString(C3893R.string.catalyst_settings_title));
        addPreferencesFromResource(C3893R.xml.rn_dev_preferences);
    }
}

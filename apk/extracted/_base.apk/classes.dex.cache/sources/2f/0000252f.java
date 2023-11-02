package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.facebook.react.C3893R;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class LogBoxDialog extends Dialog {
    public LogBoxDialog(Activity activity, View view) {
        super(activity, C3893R.style.Theme_Catalyst_LogBox);
        requestWindowFeature(1);
        setContentView(view);
    }
}
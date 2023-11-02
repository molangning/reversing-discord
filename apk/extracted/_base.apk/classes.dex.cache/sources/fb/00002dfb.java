package com.jakewharton.processphoenix;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ProcessPhoenix extends Activity {
    /* renamed from: a */
    private static Intent m25607a(Context context) {
        String packageName = context.getPackageName();
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage != null) {
            return launchIntentForPackage;
        }
        throw new IllegalStateException("Unable to determine default activity for " + packageName + ". Does an activity specify the DEFAULT category in its intent filter?");
    }

    /* renamed from: b */
    public static void m25606b(Context context) {
        m25605c(context, m25607a(context));
    }

    /* renamed from: c */
    public static void m25605c(Context context, Intent... intentArr) {
        if (intentArr.length >= 1) {
            intentArr[0].addFlags(268468224);
            Intent intent = new Intent(context, ProcessPhoenix.class);
            intent.addFlags(268435456);
            intent.putParcelableArrayListExtra("phoenix_restart_intents", new ArrayList<>(Arrays.asList(intentArr)));
            intent.putExtra("phoenix_main_process_pid", Process.myPid());
            context.startActivity(intent);
            return;
        }
        throw new IllegalArgumentException("intents cannot be empty");
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Process.killProcess(getIntent().getIntExtra("phoenix_main_process_pid", -1));
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("phoenix_restart_intents");
        startActivities((Intent[]) parcelableArrayListExtra.toArray(new Intent[parcelableArrayListExtra.size()]));
        finish();
        Runtime.getRuntime().exit(0);
    }
}
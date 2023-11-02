package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C4614c;
import p029b9.C2198p;
import p441y8.C13930a;
import p441y8.C13934e;

@KeepName
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: j */
    protected int f12645j = 0;

    /* renamed from: a */
    public static Intent m28246a(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* renamed from: b */
    private final void m28245b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
        } else if (pendingIntent != null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f12645j = 1;
            } catch (ActivityNotFoundException e) {
                if (extras.getBoolean("notify_manager", true)) {
                    C4614c.m28186y(this).m28211J(new C13930a(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String obj = pendingIntent.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 36);
                    sb2.append("Activity not found while launching ");
                    sb2.append(obj);
                    sb2.append(".");
                    String sb3 = sb2.toString();
                    if (Build.FINGERPRINT.contains("generic")) {
                        sb3 = sb3.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", sb3, e);
                }
                this.f12645j = 1;
                finish();
            } catch (IntentSender.SendIntentException e2) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                finish();
            }
        } else {
            C13934e.m1136k().m1135l(this, ((Integer) C2198p.m33985j(num)).intValue(), 2, this);
            this.f12645j = 1;
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f12645j = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C4614c m28186y = C4614c.m28186y(this);
                if (i2 != -1) {
                    if (i2 == 0) {
                        m28186y.m28211J(new C13930a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    m28186y.m28209b();
                }
            }
        } else if (i == 2) {
            this.f12645j = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f12645j = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f12645j = bundle.getInt("resolution");
        }
        if (this.f12645j != 1) {
            m28245b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f12645j);
        super.onSaveInstanceState(bundle);
    }
}
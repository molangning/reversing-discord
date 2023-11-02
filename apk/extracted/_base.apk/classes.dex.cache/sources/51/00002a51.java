package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import p384v8.C13157p;

@KeepName
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SignInHubActivity extends FragmentActivity {

    /* renamed from: o */
    private static boolean f12637o = false;

    /* renamed from: j */
    private boolean f12638j = false;

    /* renamed from: k */
    private SignInConfiguration f12639k;

    /* renamed from: l */
    private boolean f12640l;

    /* renamed from: m */
    private int f12641m;

    /* renamed from: n */
    private Intent f12642n;

    /* renamed from: e */
    private final void m28252e() {
        getSupportLoaderManager().mo35991c(0, null, new C4605a(this, null));
        f12637o = false;
    }

    /* renamed from: f */
    private final void m28251f(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f12637o = false;
    }

    /* renamed from: g */
    private final void m28250g(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.f12639k);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f12638j = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m28251f(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.f12638j) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.m28261r() != null) {
                GoogleSignInAccount m28261r = signInAccount.m28261r();
                C13157p m3084a = C13157p.m3084a(this);
                GoogleSignInOptions m28255r = this.f12639k.m28255r();
                m28261r.getClass();
                m3084a.m3082c(m28255r, m28261r);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", m28261r);
                this.f12640l = true;
                this.f12641m = i2;
                this.f12642n = intent;
                m28252e();
                return;
            } else if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m28251f(intExtra);
                return;
            }
        }
        m28251f(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m28251f(12500);
        } else if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
        } else {
            Bundle bundleExtra = intent.getBundleExtra("config");
            bundleExtra.getClass();
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f12639k = signInConfiguration;
            if (bundle == null) {
                if (f12637o) {
                    setResult(0);
                    m28251f(12502);
                    return;
                }
                f12637o = true;
                m28250g(action);
                return;
            }
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.f12640l = z;
            if (z) {
                this.f12641m = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                intent2.getClass();
                this.f12642n = intent2;
                m28252e();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f12637o = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f12640l);
        if (this.f12640l) {
            bundle.putInt("signInResultCode", this.f12641m);
            bundle.putParcelable("signInResultData", this.f12642n);
        }
    }
}
package p029b9;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import p010a9.InterfaceC0101f;

/* renamed from: b9.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractDialogInterface$OnClickListenerC2163e0 implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static AbstractDialogInterface$OnClickListenerC2163e0 m34050b(Activity activity, Intent intent, int i) {
        return new C2156c0(intent, activity, i);
    }

    /* renamed from: c */
    public static AbstractDialogInterface$OnClickListenerC2163e0 m34049c(InterfaceC0101f interfaceC0101f, Intent intent, int i) {
        return new C2160d0(intent, interfaceC0101f, 2);
    }

    /* renamed from: a */
    protected abstract void mo34051a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo34051a();
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}

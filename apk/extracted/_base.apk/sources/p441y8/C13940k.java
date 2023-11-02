package p441y8;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import p029b9.C2198p;

/* renamed from: y8.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13940k extends DialogFragment {

    /* renamed from: j */
    private Dialog f35896j;

    /* renamed from: k */
    private DialogInterface.OnCancelListener f35897k;

    /* renamed from: l */
    private Dialog f35898l;

    /* renamed from: d */
    public static C13940k m1104d(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C13940k c13940k = new C13940k();
        Dialog dialog2 = (Dialog) C2198p.m33984k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c13940k.f35896j = dialog2;
        if (onCancelListener != null) {
            c13940k.f35897k = onCancelListener;
        }
        return c13940k;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f35897k;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f35896j;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f35898l == null) {
                this.f35898l = new AlertDialog.Builder((Context) C2198p.m33985j(getContext())).create();
            }
            return this.f35898l;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}

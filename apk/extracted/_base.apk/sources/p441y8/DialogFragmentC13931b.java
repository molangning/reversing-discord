package p441y8;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import p029b9.C2198p;

/* renamed from: y8.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DialogFragmentC13931b extends DialogFragment {

    /* renamed from: j */
    private Dialog f35875j;

    /* renamed from: k */
    private DialogInterface.OnCancelListener f35876k;

    /* renamed from: l */
    private Dialog f35877l;

    /* renamed from: a */
    public static DialogFragmentC13931b m1142a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC13931b dialogFragmentC13931b = new DialogFragmentC13931b();
        Dialog dialog2 = (Dialog) C2198p.m33984k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC13931b.f35875j = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC13931b.f35876k = onCancelListener;
        }
        return dialogFragmentC13931b;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f35876k;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f35875j;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f35877l == null) {
                this.f35877l = new AlertDialog.Builder((Context) C2198p.m33985j(getActivity())).create();
            }
            return this.f35877l;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}

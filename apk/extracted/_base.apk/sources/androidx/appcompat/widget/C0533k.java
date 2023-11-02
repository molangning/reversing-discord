package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: androidx.appcompat.widget.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C0533k {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InputConnection m39809a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof InterfaceC0619z1) {
                    editorInfo.hintText = ((InterfaceC0619z1) parent).m39567a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }
}

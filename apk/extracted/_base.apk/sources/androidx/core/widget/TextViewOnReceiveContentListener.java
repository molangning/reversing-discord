package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.InterfaceC1332s0;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class TextViewOnReceiveContentListener implements InterfaceC1332s0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.TextViewOnReceiveContentListener$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1412a {
        /* renamed from: a */
        static CharSequence m36961a(Context context, ClipData.Item item, int i) {
            if ((i & 1) != 0) {
                CharSequence coerceToText = item.coerceToText(context);
                if (coerceToText instanceof Spanned) {
                    return coerceToText.toString();
                }
                return coerceToText;
            }
            return item.coerceToStyledText(context);
        }
    }

    /* renamed from: b */
    private static CharSequence m36963b(Context context, ClipData.Item item, int i) {
        return C1412a.m36961a(context, item, i);
    }

    /* renamed from: c */
    private static void m36962c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // androidx.core.view.InterfaceC1332s0
    /* renamed from: a */
    public ContentInfoCompat mo32087a(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + contentInfoCompat);
        }
        if (contentInfoCompat.m37808g() == 2) {
            return contentInfoCompat;
        }
        ClipData m37812c = contentInfoCompat.m37812c();
        int m37810e = contentInfoCompat.m37810e();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < m37812c.getItemCount(); i++) {
            CharSequence m36963b = m36963b(context, m37812c.getItemAt(i), m37810e);
            if (m36963b != null) {
                if (!z) {
                    m36962c(editable, m36963b);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    editable.insert(Selection.getSelectionEnd(editable), m36963b);
                }
            }
        }
        return null;
    }
}

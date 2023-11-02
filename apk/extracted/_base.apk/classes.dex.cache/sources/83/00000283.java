package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C1365w0;
import androidx.core.view.ContentInfoCompat;

/* renamed from: androidx.appcompat.widget.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0572t {

    /* renamed from: androidx.appcompat.widget.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0573a {
        /* renamed from: a */
        static boolean m39697a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C1365w0.m37205g0(textView, new ContentInfoCompat.C1141a(dragEvent.getClipData(), 3).m37802a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th2) {
                textView.endBatchEdit();
                throw th2;
            }
        }

        /* renamed from: b */
        static boolean m39696b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C1365w0.m37205g0(view, new ContentInfoCompat.C1141a(dragEvent.getClipData(), 3).m37802a());
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m39700a(View view, DragEvent dragEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && C1365w0.m37252E(view) != null) {
            Activity m39698c = m39698c(view);
            if (m39698c == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    if (view instanceof TextView) {
                        return C0573a.m39697a(dragEvent, (TextView) view, m39698c);
                    }
                    return C0573a.m39696b(dragEvent, view, m39698c);
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m39699b(TextView textView, int i) {
        ClipData primaryClip;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 31 || C1365w0.m37252E(textView) == null || (i != 16908322 && i != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            primaryClip = null;
        } else {
            primaryClip = clipboardManager.getPrimaryClip();
        }
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            ContentInfoCompat.C1141a c1141a = new ContentInfoCompat.C1141a(primaryClip, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            C1365w0.m37205g0(textView, c1141a.m37799d(i2).m37802a());
        }
        return true;
    }

    /* renamed from: c */
    static Activity m39698c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
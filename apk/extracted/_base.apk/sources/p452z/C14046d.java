package p452z;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.core.util.C1138f;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: z.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C14046d {

    /* renamed from: a */
    private static final String[] f36093a = new String[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C14047a {
        /* renamed from: a */
        static void m819a(EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    /* renamed from: a */
    public static String[] m827a(EditorInfo editorInfo) {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 25) {
            strArr = editorInfo.contentMimeTypes;
            if (strArr == null) {
                return f36093a;
            }
            return strArr;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f36093a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        if (stringArray == null) {
            return f36093a;
        }
        return stringArray;
    }

    /* renamed from: b */
    private static boolean m826b(CharSequence charSequence, int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            return Character.isHighSurrogate(charSequence.charAt(i));
        }
        return Character.isLowSurrogate(charSequence.charAt(i));
    }

    /* renamed from: c */
    private static boolean m825c(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    /* renamed from: d */
    public static void m824d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* renamed from: e */
    public static void m823e(EditorInfo editorInfo, CharSequence charSequence, int i) {
        int i2;
        int i3;
        C1138f.m37824f(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            C14047a.m819a(editorInfo, charSequence, i);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i5 = editorInfo.initialSelEnd;
        if (i4 > i5) {
            i2 = i5 - i;
        } else {
            i2 = i4 - i;
        }
        if (i4 > i5) {
            i3 = i4 - i;
        } else {
            i3 = i5 - i;
        }
        int length = charSequence.length();
        if (i >= 0 && i2 >= 0 && i3 <= length) {
            if (m825c(editorInfo.inputType)) {
                m821g(editorInfo, null, 0, 0);
                return;
            } else if (length <= 2048) {
                m821g(editorInfo, charSequence, i2, i3);
                return;
            } else {
                m820h(editorInfo, charSequence, i2, i3);
                return;
            }
        }
        m821g(editorInfo, null, 0, 0);
    }

    /* renamed from: f */
    public static void m822f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C14047a.m819a(editorInfo, charSequence, 0);
        } else {
            m823e(editorInfo, charSequence, 0);
        }
    }

    /* renamed from: g */
    private static void m821g(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* renamed from: h */
    private static void m820h(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        int i3;
        CharSequence subSequence;
        int i4 = i2 - i;
        if (i4 > 1024) {
            i3 = 0;
        } else {
            i3 = i4;
        }
        int i5 = 2048 - i3;
        int min = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (i5 * 0.8d)));
        int min2 = Math.min(i, i5 - min);
        int i6 = i - min2;
        if (m826b(charSequence, i6, 0)) {
            i6++;
            min2--;
        }
        if (m826b(charSequence, (i2 + min) - 1, 1)) {
            min--;
        }
        int i7 = min2 + i3 + min;
        if (i3 != i4) {
            subSequence = TextUtils.concat(charSequence.subSequence(i6, i6 + min2), charSequence.subSequence(i2, min + i2));
        } else {
            subSequence = charSequence.subSequence(i6, i7 + i6);
        }
        int i8 = min2 + 0;
        m821g(editorInfo, subSequence, i8, i3 + i8);
    }
}

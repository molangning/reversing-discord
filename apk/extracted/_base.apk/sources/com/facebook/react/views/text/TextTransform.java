package com.facebook.react.views.text;

import java.text.BreakIterator;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum TextTransform {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;

    /* renamed from: com.facebook.react.views.text.TextTransform$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C42691 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$views$text$TextTransform;

        static {
            int[] iArr = new int[TextTransform.values().length];
            $SwitchMap$com$facebook$react$views$text$TextTransform = iArr;
            try {
                iArr[TextTransform.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$views$text$TextTransform[TextTransform.LOWERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$views$text$TextTransform[TextTransform.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String apply(String str, TextTransform textTransform) {
        if (str == null) {
            return null;
        }
        int i = C42691.$SwitchMap$com$facebook$react$views$text$TextTransform[textTransform.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return capitalize(str);
                }
                return str;
            }
            return str.toLowerCase();
        }
        return str.toUpperCase();
    }

    private static String capitalize(String str) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb2 = new StringBuilder(str.length());
        int first = wordInstance.first();
        while (true) {
            int i = first;
            first = wordInstance.next();
            if (first != -1) {
                String substring = str.substring(i, first);
                if (Character.isLetterOrDigit(substring.charAt(0))) {
                    sb2.append(Character.toUpperCase(substring.charAt(0)));
                    sb2.append(substring.substring(1).toLowerCase());
                } else {
                    sb2.append(substring);
                }
            } else {
                return sb2.toString();
            }
        }
    }
}

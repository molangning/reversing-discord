package com.facebook.hermes.unicode;

import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AndroidUnicodeUtils {
    @InterfaceC6107a
    public static String convertToCase(String str, int i, boolean z) {
        Locale locale;
        if (z) {
            locale = Locale.getDefault();
        } else {
            locale = Locale.ENGLISH;
        }
        if (i != 0) {
            if (i == 1) {
                return str.toLowerCase(locale);
            }
            throw new RuntimeException("Invalid target case");
        }
        return str.toUpperCase(locale);
    }

    @InterfaceC6107a
    public static String dateFormat(double d, boolean z, boolean z2) {
        DateFormat timeInstance;
        if (z && z2) {
            timeInstance = DateFormat.getDateTimeInstance(2, 2);
        } else if (z) {
            timeInstance = DateFormat.getDateInstance(2);
        } else if (z2) {
            timeInstance = DateFormat.getTimeInstance(2);
        } else {
            throw new RuntimeException("Bad dateFormat configuration");
        }
        return timeInstance.format(Long.valueOf((long) d)).toString();
    }

    @InterfaceC6107a
    public static int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }

    @InterfaceC6107a
    public static String normalize(String str, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return Normalizer.normalize(str, Normalizer.Form.NFKD);
                    }
                    throw new RuntimeException("Invalid form");
                }
                return Normalizer.normalize(str, Normalizer.Form.NFKC);
            }
            return Normalizer.normalize(str, Normalizer.Form.NFD);
        }
        return Normalizer.normalize(str, Normalizer.Form.NFC);
    }
}
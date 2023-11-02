package p164j$.time.format;

import java.util.Comparator;
import java.util.Map;

/* renamed from: j$.time.format.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8300c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj2).getKey()).length() - ((String) ((Map.Entry) obj).getKey()).length();
    }
}
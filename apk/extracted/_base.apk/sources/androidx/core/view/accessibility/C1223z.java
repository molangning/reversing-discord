package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: androidx.core.view.accessibility.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1223z {

    /* renamed from: androidx.core.view.accessibility.z$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1224a {
        /* renamed from: a */
        static int m37501a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        /* renamed from: b */
        static int m37500b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        /* renamed from: c */
        static void m37499c(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        /* renamed from: d */
        static void m37498d(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* renamed from: androidx.core.view.accessibility.z$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1225b {
        /* renamed from: a */
        static void m37497a(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    /* renamed from: a */
    public static void m37504a(AccessibilityRecord accessibilityRecord, int i) {
        C1224a.m37499c(accessibilityRecord, i);
    }

    /* renamed from: b */
    public static void m37503b(AccessibilityRecord accessibilityRecord, int i) {
        C1224a.m37498d(accessibilityRecord, i);
    }

    /* renamed from: c */
    public static void m37502c(AccessibilityRecord accessibilityRecord, View view, int i) {
        C1225b.m37497a(accessibilityRecord, view, i);
    }
}

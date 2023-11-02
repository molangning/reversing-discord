package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.core.view.accessibility.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1195b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.accessibility.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1196a {
        /* renamed from: a */
        static int m37532a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        /* renamed from: b */
        static void m37531b(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: a */
    public static int m37534a(AccessibilityEvent accessibilityEvent) {
        return C1196a.m37532a(accessibilityEvent);
    }

    /* renamed from: b */
    public static void m37533b(AccessibilityEvent accessibilityEvent, int i) {
        C1196a.m37531b(accessibilityEvent, i);
    }
}
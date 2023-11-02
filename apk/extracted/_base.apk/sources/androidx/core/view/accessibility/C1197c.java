package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;

/* renamed from: androidx.core.view.accessibility.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1197c {

    /* renamed from: androidx.core.view.accessibility.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1198a {
        /* renamed from: a */
        static boolean m37528a(AccessibilityManager accessibilityManager, InterfaceC1199b interfaceC1199b) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC1200c(interfaceC1199b));
        }

        /* renamed from: b */
        static boolean m37527b(AccessibilityManager accessibilityManager, InterfaceC1199b interfaceC1199b) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC1200c(interfaceC1199b));
        }
    }

    /* renamed from: androidx.core.view.accessibility.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1199b {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.accessibility.c$c  reason: invalid class name */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC1200c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        final InterfaceC1199b f3641a;

        accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC1200c(InterfaceC1199b interfaceC1199b) {
            this.f3641a = interfaceC1199b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC1200c)) {
                return false;
            }
            return this.f3641a.equals(((accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC1200c) obj).f3641a);
        }

        public int hashCode() {
            return this.f3641a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.f3641a.onTouchExplorationStateChanged(z);
        }
    }

    /* renamed from: a */
    public static boolean m37530a(AccessibilityManager accessibilityManager, InterfaceC1199b interfaceC1199b) {
        return C1198a.m37528a(accessibilityManager, interfaceC1199b);
    }

    /* renamed from: b */
    public static boolean m37529b(AccessibilityManager accessibilityManager, InterfaceC1199b interfaceC1199b) {
        return C1198a.m37527b(accessibilityManager, interfaceC1199b);
    }
}

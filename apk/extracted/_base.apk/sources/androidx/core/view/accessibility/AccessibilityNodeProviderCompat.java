package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class AccessibilityNodeProviderCompat {

    /* renamed from: a */
    private final Object f3635a;

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeProviderCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1183a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final AccessibilityNodeProviderCompat f3636a;

        C1183a(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            this.f3636a = accessibilityNodeProviderCompat;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            AccessibilityNodeInfoCompat mo36829b = this.f3636a.mo36829b(i);
            if (mo36829b == null) {
                return null;
            }
            return mo36829b.m37616O0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<AccessibilityNodeInfoCompat> m37537c = this.f3636a.m37537c(str, i);
            if (m37537c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = m37537c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(m37537c.get(i2).m37616O0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f3636a.mo36827f(i, i2, bundle);
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeProviderCompat$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1184b extends C1183a {
        C1184b(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            super(accessibilityNodeProviderCompat);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            AccessibilityNodeInfoCompat mo36828d = this.f3636a.mo36828d(i);
            if (mo36828d == null) {
                return null;
            }
            return mo36828d.m37616O0();
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeProviderCompat$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1185c extends C1184b {
        C1185c(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            super(accessibilityNodeProviderCompat);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f3636a.m37538a(i, AccessibilityNodeInfoCompat.m37614P0(accessibilityNodeInfo), str, bundle);
        }
    }

    public AccessibilityNodeProviderCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3635a = new C1185c(this);
        } else {
            this.f3635a = new C1184b(this);
        }
    }

    /* renamed from: a */
    public void m37538a(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public AccessibilityNodeInfoCompat mo36829b(int i) {
        return null;
    }

    /* renamed from: c */
    public List<AccessibilityNodeInfoCompat> m37537c(String str, int i) {
        return null;
    }

    /* renamed from: d */
    public AccessibilityNodeInfoCompat mo36828d(int i) {
        return null;
    }

    /* renamed from: e */
    public Object m37536e() {
        return this.f3635a;
    }

    /* renamed from: f */
    public boolean mo36827f(int i, int i2, Bundle bundle) {
        return false;
    }

    public AccessibilityNodeProviderCompat(Object obj) {
        this.f3635a = obj;
    }
}

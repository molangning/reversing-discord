package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p356u.C12810e;

/* renamed from: androidx.core.view.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1170a {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* renamed from: androidx.core.view.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1171a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C1170a f3580a;

        C1171a(C1170a c1170a) {
            this.f3580a = c1170a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3580a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProviderCompat accessibilityNodeProvider = this.f3580a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.m37536e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3580a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfoCompat m37614P0 = AccessibilityNodeInfoCompat.m37614P0(accessibilityNodeInfo);
            m37614P0.m37640C0(C1365w0.m37221X(view));
            m37614P0.m37572p0(C1365w0.m37226S(view));
            m37614P0.m37556x0(C1365w0.m37188p(view));
            m37614P0.m37628I0(C1365w0.m37242J(view));
            this.f3580a.onInitializeAccessibilityNodeInfo(view, m37614P0);
            m37614P0.m37593f(accessibilityNodeInfo.getText(), view);
            List<AccessibilityNodeInfoCompat.C1178a> actionList = C1170a.getActionList(view);
            for (int i = 0; i < actionList.size(); i++) {
                m37614P0.m37601b(actionList.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3580a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f3580a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f3580a.performAccessibilityAction(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f3580a.sendAccessibilityEvent(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f3580a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    /* renamed from: androidx.core.view.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1172b {
        /* renamed from: a */
        static AccessibilityNodeProvider m37652a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        /* renamed from: b */
        static boolean m37651b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public C1170a() {
        this(DEFAULT_DELEGATE);
    }

    static List<AccessibilityNodeInfoCompat.C1178a> getActionList(View view) {
        List<AccessibilityNodeInfoCompat.C1178a> list = (List) view.getTag(C12810e.f33218V);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] m37571q = AccessibilityNodeInfoCompat.m37571q(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; m37571q != null && i < m37571q.length; i++) {
                if (clickableSpan.equals(m37571q[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C12810e.f33219W);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (isSpanStillValid(clickableSpan, view)) {
                clickableSpan.onClick(view);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider m37652a = C1172b.m37652a(this.mOriginalDelegate, view);
        if (m37652a != null) {
            return new AccessibilityNodeProviderCompat(m37652a);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.m37616O0());
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        List<AccessibilityNodeInfoCompat.C1178a> actionList = getActionList(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= actionList.size()) {
                break;
            }
            AccessibilityNodeInfoCompat.C1178a c1178a = actionList.get(i2);
            if (c1178a.m37550b() == i) {
                z = c1178a.m37548d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z) {
            z = C1172b.m37651b(this.mOriginalDelegate, view, i, bundle);
        }
        if (!z && i == C12810e.f33223a && bundle != null) {
            return performClickableSpanAction(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
        }
        return z;
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C1170a(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C1171a(this);
    }
}
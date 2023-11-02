package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C1170a;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class RecyclerViewAccessibilityDelegate extends C1170a {

    /* renamed from: a */
    final RecyclerView f4818a;

    /* renamed from: b */
    private final C1773a f4819b;

    /* renamed from: androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1773a extends C1170a {

        /* renamed from: a */
        final RecyclerViewAccessibilityDelegate f4820a;

        /* renamed from: b */
        private Map<View, C1170a> f4821b = new WeakHashMap();

        public C1773a(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
            this.f4820a = recyclerViewAccessibilityDelegate;
        }

        /* renamed from: a */
        public C1170a m35573a(View view) {
            return this.f4821b.remove(view);
        }

        /* renamed from: b */
        public void m35572b(View view) {
            C1170a m37196l = C1365w0.m37196l(view);
            if (m37196l != null && m37196l != this) {
                this.f4821b.put(view, m37196l);
            }
        }

        @Override // androidx.core.view.C1170a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1170a c1170a = this.f4821b.get(view);
            if (c1170a != null) {
                return c1170a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1170a
        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
            C1170a c1170a = this.f4821b.get(view);
            if (c1170a != null) {
                return c1170a.getAccessibilityNodeProvider(view);
            }
            return super.getAccessibilityNodeProvider(view);
        }

        @Override // androidx.core.view.C1170a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1170a c1170a = this.f4821b.get(view);
            if (c1170a != null) {
                c1170a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1170a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (!this.f4820a.m35574b() && this.f4820a.f4818a.getLayoutManager() != null) {
                this.f4820a.f4818a.getLayoutManager().m35732W0(view, accessibilityNodeInfoCompat);
                C1170a c1170a = this.f4821b.get(view);
                if (c1170a != null) {
                    c1170a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    return;
                } else {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    return;
                }
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.core.view.C1170a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1170a c1170a = this.f4821b.get(view);
            if (c1170a != null) {
                c1170a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1170a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1170a c1170a = this.f4821b.get(viewGroup);
            if (c1170a != null) {
                return c1170a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1170a
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (!this.f4820a.m35574b() && this.f4820a.f4818a.getLayoutManager() != null) {
                C1170a c1170a = this.f4821b.get(view);
                if (c1170a != null) {
                    if (c1170a.performAccessibilityAction(view, i, bundle)) {
                        return true;
                    }
                } else if (super.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
                return this.f4820a.f4818a.getLayoutManager().m35699q1(view, i, bundle);
            }
            return super.performAccessibilityAction(view, i, bundle);
        }

        @Override // androidx.core.view.C1170a
        public void sendAccessibilityEvent(View view, int i) {
            C1170a c1170a = this.f4821b.get(view);
            if (c1170a != null) {
                c1170a.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        @Override // androidx.core.view.C1170a
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            C1170a c1170a = this.f4821b.get(view);
            if (c1170a != null) {
                c1170a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public RecyclerViewAccessibilityDelegate(RecyclerView recyclerView) {
        this.f4818a = recyclerView;
        C1170a m35575a = m35575a();
        if (m35575a != null && (m35575a instanceof C1773a)) {
            this.f4819b = (C1773a) m35575a;
        } else {
            this.f4819b = new C1773a(this);
        }
    }

    /* renamed from: a */
    public C1170a m35575a() {
        return this.f4819b;
    }

    /* renamed from: b */
    boolean m35574b() {
        return this.f4818a.hasPendingAdapterUpdates();
    }

    @Override // androidx.core.view.C1170a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !m35574b()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo35548S0(accessibilityEvent);
            }
        }
    }

    @Override // androidx.core.view.C1170a
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (!m35574b() && this.f4818a.getLayoutManager() != null) {
            this.f4818a.getLayoutManager().m35735U0(accessibilityNodeInfoCompat);
        }
    }

    @Override // androidx.core.view.C1170a
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (!m35574b() && this.f4818a.getLayoutManager() != null) {
            return this.f4818a.getLayoutManager().m35704o1(i, bundle);
        }
        return false;
    }
}
package gd;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.henninghall.date_picker.C5136a;
import com.henninghall.date_picker.C5153k;
import com.henninghall.date_picker.pickers.InterfaceC5161a;
import java.util.Locale;

/* renamed from: gd.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6728a {

    /* renamed from: a */
    private static final AccessibilityManager f18940a = (AccessibilityManager) C5136a.f14460a.getApplicationContext().getSystemService("accessibility");

    /* renamed from: b */
    private static Locale f18941b = Locale.getDefault();

    /* renamed from: gd.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C6729a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5161a f18942a;

        C6729a(InterfaceC5161a interfaceC5161a) {
            this.f18942a = interfaceC5161a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            int value = this.f18942a.getValue();
            if (i != 4096) {
                if (i == 8192 && !this.f18942a.mo26001c()) {
                    this.f18942a.mo26002b(value + 1);
                }
            } else if (!this.f18942a.mo26001c()) {
                this.f18942a.mo26002b(value - 1);
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    /* renamed from: a */
    public static AccessibilityEvent m22027a(View view, int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        obtain.setClassName(view.getClass().getName());
        obtain.setPackageName(view.getContext().getPackageName());
        return obtain;
    }

    /* renamed from: b */
    public static String m22026b(InterfaceC5161a interfaceC5161a) {
        String obj = interfaceC5161a.getView().getTag().toString();
        String m22023e = m22023e(interfaceC5161a, interfaceC5161a.getValue());
        String m22025c = m22025c(obj);
        return m22023e + ", " + m22025c;
    }

    /* renamed from: c */
    private static String m22025c(String str) {
        Locale m22024d = m22024d();
        return C5153k.m26027e(m22024d, str + "_description");
    }

    /* renamed from: d */
    public static Locale m22024d() {
        return f18941b;
    }

    /* renamed from: e */
    private static String m22023e(InterfaceC5161a interfaceC5161a, int i) {
        String str = interfaceC5161a.getDisplayedValues()[i];
        if (str != null) {
            return str;
        }
        return String.valueOf(i);
    }

    /* renamed from: f */
    public static void m22022f(AccessibilityEvent accessibilityEvent) {
        AccessibilityManager accessibilityManager = f18940a;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            accessibilityManager.sendAccessibilityEvent(accessibilityEvent);
        }
    }

    /* renamed from: g */
    public static void m22021g(InterfaceC5161a interfaceC5161a, int i) {
        AccessibilityEvent m22027a = m22027a(interfaceC5161a.getView(), 32);
        m22027a.getText().add(m22023e(interfaceC5161a, i));
        m22022f(m22027a);
    }

    /* renamed from: h */
    public static void m22020h(Locale locale) {
        f18941b = locale;
    }

    /* renamed from: i */
    public static void m22019i(InterfaceC5161a interfaceC5161a, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setScrollable(true);
        accessibilityNodeInfo.setContentDescription(m22026b(interfaceC5161a));
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = new AccessibilityNodeInfo.AccessibilityAction(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, "Increase value");
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = new AccessibilityNodeInfo.AccessibilityAction(8192, "Decrease value");
        accessibilityNodeInfo.addAction(accessibilityAction);
        accessibilityNodeInfo.addAction(accessibilityAction2);
    }

    /* renamed from: j */
    public static boolean m22018j(View view) {
        if (!f18940a.isTouchExplorationEnabled()) {
            return true;
        }
        return view.isAccessibilityFocused();
    }

    /* renamed from: k */
    public static void m22017k(InterfaceC5161a interfaceC5161a) {
        interfaceC5161a.getView().setAccessibilityDelegate(new C6729a(interfaceC5161a));
    }
}

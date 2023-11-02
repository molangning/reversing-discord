package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.C3893R;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactAccessibilityDelegate extends ExploreByTouchHelper {
    private static final int SEND_EVENT = 1;
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_DISABLED = "disabled";
    private static final String STATE_SELECTED = "selected";
    private static final String TAG = "ReactAccessibilityDelegate";
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    public static final String TOP_ACCESSIBILITY_ACTION_EVENT = "topAccessibilityAction";
    private static final String delimiter = ", ";
    private static final int delimiterLength = 2;
    public static final HashMap<String, Integer> sActionIdMap;
    private static int sCounter = 1056964608;
    private final HashMap<Integer, String> mAccessibilityActionsMap;
    View mAccessibilityLabelledBy;
    private final AccessibilityLinks mAccessibilityLinks;
    private Handler mHandler;
    private final View mView;

    /* renamed from: com.facebook.react.uimanager.ReactAccessibilityDelegate$3 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C41943 {

        /* renamed from: $SwitchMap$com$facebook$react$uimanager$ReactAccessibilityDelegate$AccessibilityRole */
        static final /* synthetic */ int[] f10916x27e8253f;

        static {
            int[] iArr = new int[AccessibilityRole.values().length];
            f10916x27e8253f = iArr;
            try {
                iArr[AccessibilityRole.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.DROPDOWNLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.TOGGLEBUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.IMAGEBUTTON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.KEYBOARDKEY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.TEXT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.ADJUSTABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.CHECKBOX.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.RADIO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.SPINBUTTON.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.SWITCH.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.GRID.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.SCROLLVIEW.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.HORIZONTALSCROLLVIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.PAGER.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.DRAWERLAYOUT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.SLIDINGDRAWER.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.ICONMENU.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.VIEWGROUP.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.WEBVIEW.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.NONE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.LINK.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.SUMMARY.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.HEADER.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.ALERT.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.COMBOBOX.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.MENU.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.MENUBAR.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.MENUITEM.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.PROGRESSBAR.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.RADIOGROUP.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.SCROLLBAR.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.TAB.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.TABLIST.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.TIMER.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f10916x27e8253f[AccessibilityRole.TOOLBAR.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class AccessibilityLinks {
        private final List<AccessibleLink> mLinks;

        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static class AccessibleLink {
            public String description;
            public int end;

            /* renamed from: id */
            public int f10917id;
            public int start;

            private AccessibleLink() {
            }
        }

        public AccessibilityLinks(ClickableSpan[] clickableSpanArr, Spannable spannable) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < clickableSpanArr.length; i++) {
                ClickableSpan clickableSpan = clickableSpanArr[i];
                int spanStart = spannable.getSpanStart(clickableSpan);
                int spanEnd = spannable.getSpanEnd(clickableSpan);
                if (spanStart != spanEnd && spanStart >= 0 && spanEnd >= 0 && spanStart <= spannable.length() && spanEnd <= spannable.length()) {
                    AccessibleLink accessibleLink = new AccessibleLink();
                    accessibleLink.description = spannable.subSequence(spanStart, spanEnd).toString();
                    accessibleLink.start = spanStart;
                    accessibleLink.end = spanEnd;
                    accessibleLink.f10917id = (clickableSpanArr.length - 1) - i;
                    arrayList.add(accessibleLink);
                }
            }
            this.mLinks = arrayList;
        }

        public AccessibleLink getLinkById(int i) {
            for (AccessibleLink accessibleLink : this.mLinks) {
                if (accessibleLink.f10917id == i) {
                    return accessibleLink;
                }
            }
            return null;
        }

        public AccessibleLink getLinkBySpanPos(int i, int i2) {
            for (AccessibleLink accessibleLink : this.mLinks) {
                if (accessibleLink.start == i && accessibleLink.end == i2) {
                    return accessibleLink;
                }
            }
            return null;
        }

        public int size() {
            return this.mLinks.size();
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum AccessibilityRole {
        NONE,
        BUTTON,
        DROPDOWNLIST,
        TOGGLEBUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        LIST,
        GRID,
        PAGER,
        SCROLLVIEW,
        HORIZONTALSCROLLVIEW,
        VIEWGROUP,
        WEBVIEW,
        DRAWERLAYOUT,
        SLIDINGDRAWER,
        ICONMENU,
        TOOLBAR;

        public static AccessibilityRole fromValue(String str) {
            AccessibilityRole[] values;
            for (AccessibilityRole accessibilityRole : values()) {
                if (accessibilityRole.name().equalsIgnoreCase(str)) {
                    return accessibilityRole;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        public static String getValue(AccessibilityRole accessibilityRole) {
            switch (C41943.f10916x27e8253f[accessibilityRole.ordinal()]) {
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.Spinner";
                case 3:
                    return "android.widget.ToggleButton";
                case 4:
                    return "android.widget.EditText";
                case 5:
                    return "android.widget.ImageView";
                case 6:
                    return "android.widget.ImageButton";
                case 7:
                    return "android.inputmethodservice.Keyboard$Key";
                case 8:
                    return "android.widget.TextView";
                case 9:
                    return "android.widget.SeekBar";
                case 10:
                    return "android.widget.CheckBox";
                case 11:
                    return "android.widget.RadioButton";
                case 12:
                    return "android.widget.SpinButton";
                case 13:
                    return "android.widget.Switch";
                case 14:
                    return "android.widget.AbsListView";
                case 15:
                    return "android.widget.GridView";
                case 16:
                    return "android.widget.ScrollView";
                case 17:
                    return "android.widget.HorizontalScrollView";
                case 18:
                    return "androidx.viewpager.widget.ViewPager";
                case 19:
                    return "androidx.drawerlayout.widget.DrawerLayout";
                case 20:
                    return "android.widget.SlidingDrawer";
                case 21:
                    return "com.android.internal.view.menu.IconMenuView";
                case 22:
                    return "android.view.ViewGroup";
                case 23:
                    return "android.webkit.WebView";
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                    return "android.view.View";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + accessibilityRole);
            }
        }
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        sActionIdMap = hashMap;
        hashMap.put("activate", Integer.valueOf(AccessibilityNodeInfoCompat.C1178a.f3610i.m37550b()));
        hashMap.put("longpress", Integer.valueOf(AccessibilityNodeInfoCompat.C1178a.f3611j.m37550b()));
        hashMap.put("increment", Integer.valueOf(AccessibilityNodeInfoCompat.C1178a.f3618q.m37550b()));
        hashMap.put("decrement", Integer.valueOf(AccessibilityNodeInfoCompat.C1178a.f3619r.m37550b()));
        hashMap.put("expand", Integer.valueOf(AccessibilityNodeInfoCompat.C1178a.f3624w.m37550b()));
        hashMap.put("collapse", Integer.valueOf(AccessibilityNodeInfoCompat.C1178a.f3625x.m37550b()));
    }

    public ReactAccessibilityDelegate(View view, boolean z, int i) {
        super(view);
        this.mView = view;
        this.mAccessibilityActionsMap = new HashMap<>();
        this.mHandler = new Handler() { // from class: com.facebook.react.uimanager.ReactAccessibilityDelegate.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                ((View) message.obj).sendAccessibilityEvent(4);
            }
        };
        view.setFocusable(z);
        C1365w0.m37259A0(view, i);
        this.mAccessibilityLinks = (AccessibilityLinks) view.getTag(C3893R.C3895id.accessibility_links);
    }

    public static AccessibilityNodeInfoCompat createNodeInfoFromView(View view) {
        if (view == null) {
            return null;
        }
        AccessibilityNodeInfoCompat m37610T = AccessibilityNodeInfoCompat.m37610T();
        try {
            C1365w0.m37211d0(view, m37610T);
            return m37610T;
        } catch (NullPointerException unused) {
            if (m37610T != null) {
                m37610T.m37606X();
            }
            return null;
        }
    }

    private Rect getBoundsInParent(AccessibilityLinks.AccessibleLink accessibleLink) {
        float textSize;
        View view = this.mView;
        boolean z = false;
        if (!(view instanceof TextView)) {
            return new Rect(0, 0, this.mView.getWidth(), this.mView.getHeight());
        }
        TextView textView = (TextView) view;
        Layout layout = textView.getLayout();
        if (layout == null) {
            return new Rect(0, 0, textView.getWidth(), textView.getHeight());
        }
        double d = accessibleLink.start;
        double d2 = accessibleLink.end;
        int i = (int) d;
        int lineForOffset = layout.getLineForOffset(i);
        if (d > layout.getLineEnd(lineForOffset)) {
            return null;
        }
        Rect rect = new Rect();
        double primaryHorizontal = layout.getPrimaryHorizontal(i);
        Paint paint = new Paint();
        AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) getFirstSpan(accessibleLink.start, accessibleLink.end, AbsoluteSizeSpan.class);
        if (absoluteSizeSpan != null) {
            textSize = absoluteSizeSpan.getSize();
        } else {
            textSize = textView.getTextSize();
        }
        paint.setTextSize(textSize);
        int ceil = (int) Math.ceil(paint.measureText(accessibleLink.description));
        if (lineForOffset != layout.getLineForOffset((int) d2)) {
            z = true;
        }
        layout.getLineBounds(lineForOffset, rect);
        int scrollY = textView.getScrollY() + textView.getTotalPaddingTop();
        rect.top += scrollY;
        rect.bottom += scrollY;
        rect.left = (int) (rect.left + ((primaryHorizontal + textView.getTotalPaddingLeft()) - textView.getScrollX()));
        if (z) {
            return new Rect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int i2 = rect.left;
        return new Rect(i2, rect.top, ceil + i2, rect.bottom);
    }

    public static CharSequence getTalkbackDescription(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfoCompat m37608V;
        boolean z;
        CharSequence talkbackDescription;
        if (accessibilityNodeInfoCompat == null) {
            m37608V = createNodeInfoFromView(view);
        } else {
            m37608V = AccessibilityNodeInfoCompat.m37608V(accessibilityNodeInfoCompat);
        }
        if (m37608V == null) {
            return null;
        }
        try {
            CharSequence m37567s = m37608V.m37567s();
            CharSequence m37645A = m37608V.m37645A();
            if (!TextUtils.isEmpty(m37645A)) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = view instanceof EditText;
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(m37567s) && (!z2 || !z)) {
                sb2.append(m37567s);
                return sb2;
            } else if (z) {
                sb2.append(m37645A);
                return sb2;
            } else if (!(view instanceof ViewGroup)) {
                return null;
            } else {
                StringBuilder sb3 = new StringBuilder();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    AccessibilityNodeInfoCompat m37610T = AccessibilityNodeInfoCompat.m37610T();
                    C1365w0.m37211d0(childAt, m37610T);
                    if (isSpeakingNode(m37610T, childAt) && !isAccessibilityFocusable(m37610T, childAt)) {
                        if (!TextUtils.isEmpty(getTalkbackDescription(childAt, null))) {
                            sb3.append(((Object) talkbackDescription) + delimiter);
                        }
                    }
                    m37610T.m37606X();
                }
                return removeFinalDelimiter(sb3);
            }
        } finally {
            m37608V.m37606X();
        }
    }

    public static boolean hasNonActionableSpeakingDescendants(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        if (accessibilityNodeInfoCompat != null && view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    AccessibilityNodeInfoCompat m37610T = AccessibilityNodeInfoCompat.m37610T();
                    try {
                        C1365w0.m37211d0(childAt, m37610T);
                        if (m37610T.m37611S() && !isAccessibilityFocusable(m37610T, childAt) && isSpeakingNode(m37610T, childAt)) {
                            m37610T.m37606X();
                            return true;
                        }
                        m37610T.m37606X();
                    } catch (Throwable th2) {
                        if (m37610T != null) {
                            m37610T.m37606X();
                        }
                        throw th2;
                    }
                }
            }
        }
        return false;
    }

    private static boolean hasStateDescription(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat != null && (!TextUtils.isEmpty(accessibilityNodeInfoCompat.m37553z()) || accessibilityNodeInfoCompat.m37633G() || hasValidRangeInfo(accessibilityNodeInfoCompat))) {
            return true;
        }
        return false;
    }

    public static boolean hasText(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat != null && accessibilityNodeInfoCompat.m37569r() == null && (!TextUtils.isEmpty(accessibilityNodeInfoCompat.m37645A()) || !TextUtils.isEmpty(accessibilityNodeInfoCompat.m37567s()) || !TextUtils.isEmpty(accessibilityNodeInfoCompat.m37563u()))) {
            return true;
        }
        return false;
    }

    public static boolean hasValidRangeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfoCompat.C1182e m37557x;
        if (accessibilityNodeInfoCompat == null || (m37557x = accessibilityNodeInfoCompat.m37557x()) == null) {
            return false;
        }
        float m37541b = m37557x.m37541b();
        float m37540c = m37557x.m37540c();
        float m37542a = m37557x.m37542a();
        if (m37541b - m37540c <= 0.0f || m37542a < m37540c || m37542a > m37541b) {
            return false;
        }
        return true;
    }

    public static boolean isAccessibilityFocusable(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        if (accessibilityNodeInfoCompat == null || view == null || !accessibilityNodeInfoCompat.m37611S()) {
            return false;
        }
        if (!accessibilityNodeInfoCompat.m37617O() && !isActionableForAccessibility(accessibilityNodeInfoCompat)) {
            return false;
        }
        return true;
    }

    public static boolean isActionableForAccessibility(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat == null) {
            return false;
        }
        if (accessibilityNodeInfoCompat.m37629I() || accessibilityNodeInfoCompat.m37621M() || accessibilityNodeInfoCompat.m37625K()) {
            return true;
        }
        List<AccessibilityNodeInfoCompat.C1178a> m37587i = accessibilityNodeInfoCompat.m37587i();
        if (!m37587i.contains(16) && !m37587i.contains(32) && !m37587i.contains(1)) {
            return false;
        }
        return true;
    }

    public static boolean isSpeakingNode(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        int m37168z;
        if (accessibilityNodeInfoCompat == null || view == null || (m37168z = C1365w0.m37168z(view)) == 4) {
            return false;
        }
        if (m37168z == 2 && accessibilityNodeInfoCompat.m37575o() <= 0) {
            return false;
        }
        if (!hasText(accessibilityNodeInfoCompat) && !hasStateDescription(accessibilityNodeInfoCompat) && !accessibilityNodeInfoCompat.m37633G() && !hasNonActionableSpeakingDescendants(accessibilityNodeInfoCompat, view)) {
            return false;
        }
        return true;
    }

    private static String removeFinalDelimiter(StringBuilder sb2) {
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - delimiterLength, length);
        }
        return sb2.toString();
    }

    public static void resetDelegate(View view, boolean z, int i) {
        C1365w0.m37185q0(view, new ReactAccessibilityDelegate(view, z, i));
    }

    private void scheduleAccessibilityEventSender(View view) {
        if (this.mHandler.hasMessages(1, view)) {
            this.mHandler.removeMessages(1, view);
        }
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1, view), 200L);
    }

    public static void setDelegate(View view, boolean z, int i) {
        if (!C1365w0.m37232O(view)) {
            if (view.getTag(C3893R.C3895id.accessibility_role) != null || view.getTag(C3893R.C3895id.accessibility_state) != null || view.getTag(C3893R.C3895id.accessibility_actions) != null || view.getTag(C3893R.C3895id.react_test_id) != null || view.getTag(C3893R.C3895id.accessibility_collection_item) != null || view.getTag(C3893R.C3895id.accessibility_links) != null) {
                C1365w0.m37185q0(view, new ReactAccessibilityDelegate(view, z, i));
            }
        }
    }

    public static void setRole(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityRole accessibilityRole, Context context) {
        if (accessibilityRole == null) {
            accessibilityRole = AccessibilityRole.NONE;
        }
        accessibilityNodeInfoCompat.m37590g0(AccessibilityRole.getValue(accessibilityRole));
        if (accessibilityRole.equals(AccessibilityRole.LINK)) {
            accessibilityNodeInfoCompat.m37642B0(context.getString(C3893R.string.link_description));
        } else if (accessibilityRole.equals(AccessibilityRole.IMAGE)) {
            accessibilityNodeInfoCompat.m37642B0(context.getString(C3893R.string.image_description));
        } else if (accessibilityRole.equals(AccessibilityRole.IMAGEBUTTON)) {
            accessibilityNodeInfoCompat.m37642B0(context.getString(C3893R.string.imagebutton_description));
            accessibilityNodeInfoCompat.m37588h0(true);
        } else if (accessibilityRole.equals(AccessibilityRole.BUTTON)) {
            accessibilityNodeInfoCompat.m37588h0(true);
        } else if (accessibilityRole.equals(AccessibilityRole.TOGGLEBUTTON)) {
            accessibilityNodeInfoCompat.m37588h0(true);
            accessibilityNodeInfoCompat.m37594e0(true);
        } else if (accessibilityRole.equals(AccessibilityRole.SUMMARY)) {
            accessibilityNodeInfoCompat.m37642B0(context.getString(C3893R.string.summary_description));
        } else if (accessibilityRole.equals(AccessibilityRole.HEADER)) {
            accessibilityNodeInfoCompat.m37572p0(true);
        } else if (accessibilityRole.equals(AccessibilityRole.ALERT)) {
            accessibilityNodeInfoCompat.m37642B0(context.getString(C3893R.string.alert_description));
        } else if (accessibilityRole.equals(AccessibilityRole.COMBOBOX)) {
            accessibilityNodeInfoCompat.m37642B0(context.getString(C3893R.string.combobox_description));
        } else if (accessibilityRole.equals(AccessibilityRole.MENU)) {
            accessibilityNodeInfoCompat.m37642B0(context.getString(C3893R.string.menu_description));
        } else if (accessibilityRole.equals(AccessibilityRole.MENUBAR)) {
            accessibilityNodeInfoCompat.m37642B0(context.getString(C3893R.string.menubar_description));
        } else if (accessibilityRole.equals(AccessibilityRole.MENUITEM)) {
            accessibilityNodeInfoCompat.m37642B0(context.getString(C3893R.string.menuitem_description));
        } else if (accessibilityRole.equals(AccessibilityRole.PROGRESSBAR)) {
            accessibilityNodeInfoCompat.m37642B0(context.getString(C3893R.string.progressbar_description));
        } else if (accessibilityRole.equals(AccessibilityRole.RADIOGROUP)) {
            accessibilityNodeInfoCompat.m37642B0(context.getString(C3893R.string.radiogroup_description));
        } else if (accessibilityRole.equals(AccessibilityRole.SCROLLBAR)) {
            accessibilityNodeInfoCompat.m37642B0(context.getString(C3893R.string.scrollbar_description));
        } else if (accessibilityRole.equals(AccessibilityRole.SPINBUTTON)) {
            accessibilityNodeInfoCompat.m37642B0(context.getString(C3893R.string.spinbutton_description));
        } else if (accessibilityRole.equals(AccessibilityRole.TAB)) {
            accessibilityNodeInfoCompat.m37642B0(context.getString(C3893R.string.rn_tab_description));
        } else if (accessibilityRole.equals(AccessibilityRole.TABLIST)) {
            accessibilityNodeInfoCompat.m37642B0(context.getString(C3893R.string.tablist_description));
        } else if (accessibilityRole.equals(AccessibilityRole.TIMER)) {
            accessibilityNodeInfoCompat.m37642B0(context.getString(C3893R.string.timer_description));
        } else if (accessibilityRole.equals(AccessibilityRole.TOOLBAR)) {
            accessibilityNodeInfoCompat.m37642B0(context.getString(C3893R.string.toolbar_description));
        }
    }

    private static void setState(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, ReadableMap readableMap, Context context) {
        int i;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(nextKey);
            if (nextKey.equals(STATE_SELECTED) && dynamic.getType() == ReadableType.Boolean) {
                accessibilityNodeInfoCompat.m37636E0(dynamic.asBoolean());
            } else if (nextKey.equals(STATE_DISABLED) && dynamic.getType() == ReadableType.Boolean) {
                accessibilityNodeInfoCompat.m37580l0(!dynamic.asBoolean());
            } else if (nextKey.equals(STATE_CHECKED) && dynamic.getType() == ReadableType.Boolean) {
                boolean asBoolean = dynamic.asBoolean();
                accessibilityNodeInfoCompat.m37594e0(true);
                accessibilityNodeInfoCompat.m37592f0(asBoolean);
                if (accessibilityNodeInfoCompat.m37573p().equals(AccessibilityRole.getValue(AccessibilityRole.SWITCH))) {
                    if (asBoolean) {
                        i = C3893R.string.state_on_description;
                    } else {
                        i = C3893R.string.state_off_description;
                    }
                    accessibilityNodeInfoCompat.m37626J0(context.getString(i));
                }
            }
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.C1170a
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        if (this.mAccessibilityLinks != null) {
            return super.getAccessibilityNodeProvider(view);
        }
        return null;
    }

    protected <T> T getFirstSpan(int i, int i2, Class<T> cls) {
        View view = this.mView;
        if (!(view instanceof TextView) || !(((TextView) view).getText() instanceof Spanned)) {
            return null;
        }
        Object[] spans = ((Spanned) ((TextView) this.mView).getText()).getSpans(i, i2, cls);
        if (spans.length <= 0) {
            return null;
        }
        return (T) spans[0];
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    protected int getVirtualViewAt(float f, float f2) {
        Layout layout;
        AccessibilityLinks accessibilityLinks = this.mAccessibilityLinks;
        if (accessibilityLinks == null || accessibilityLinks.size() == 0) {
            return Integer.MIN_VALUE;
        }
        View view = this.mView;
        if (!(view instanceof TextView)) {
            return Integer.MIN_VALUE;
        }
        TextView textView = (TextView) view;
        if (!(textView.getText() instanceof Spanned) || (layout = textView.getLayout()) == null) {
            return Integer.MIN_VALUE;
        }
        float totalPaddingLeft = f - textView.getTotalPaddingLeft();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) ((f2 - textView.getTotalPaddingTop()) + textView.getScrollY())), totalPaddingLeft + textView.getScrollX());
        ClickableSpan clickableSpan = (ClickableSpan) getFirstSpan(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpan == null) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) textView.getText();
        AccessibilityLinks.AccessibleLink linkBySpanPos = this.mAccessibilityLinks.getLinkBySpanPos(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
        if (linkBySpanPos == null) {
            return Integer.MIN_VALUE;
        }
        return linkBySpanPos.f10917id;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    protected void getVisibleVirtualViews(List<Integer> list) {
        if (this.mAccessibilityLinks == null) {
            return;
        }
        for (int i = 0; i < this.mAccessibilityLinks.size(); i++) {
            list.add(Integer.valueOf(i));
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.C1170a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(C3893R.C3895id.accessibility_value);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int asInt = dynamic.asInt();
                    int asInt2 = dynamic2.asInt();
                    int asInt3 = dynamic3.asInt();
                    if (asInt3 > asInt && asInt2 >= asInt && asInt3 >= asInt2) {
                        accessibilityEvent.setItemCount(asInt3 - asInt);
                        accessibilityEvent.setCurrentItemIndex(asInt2);
                    }
                }
            }
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.C1170a
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        boolean z;
        String str;
        int i;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        int i2 = C3893R.C3895id.accessibility_state_expanded;
        if (view.getTag(i2) != null) {
            if (((Boolean) view.getTag(i2)).booleanValue()) {
                i = 524288;
            } else {
                i = 262144;
            }
            accessibilityNodeInfoCompat.m37603a(i);
        }
        AccessibilityRole accessibilityRole = (AccessibilityRole) view.getTag(C3893R.C3895id.accessibility_role);
        String str2 = (String) view.getTag(C3893R.C3895id.accessibility_hint);
        if (accessibilityRole != null) {
            setRole(accessibilityNodeInfoCompat, accessibilityRole, view.getContext());
        }
        if (str2 != null) {
            accessibilityNodeInfoCompat.m37624K0(str2);
        }
        Object tag = view.getTag(C3893R.C3895id.labelled_by);
        if (tag != null) {
            View findView = ReactFindViewUtil.findView(view.getRootView(), (String) tag);
            this.mAccessibilityLabelledBy = findView;
            if (findView != null) {
                accessibilityNodeInfoCompat.m37564t0(findView);
            }
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(C3893R.C3895id.accessibility_state);
        if (readableMap != null) {
            setState(accessibilityNodeInfoCompat, readableMap, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(C3893R.C3895id.accessibility_actions);
        ReadableMap readableMap2 = (ReadableMap) view.getTag(C3893R.C3895id.accessibility_collection_item);
        if (readableMap2 != null) {
            accessibilityNodeInfoCompat.m37584j0(AccessibilityNodeInfoCompat.C1181d.m37544a(readableMap2.getInt("rowIndex"), readableMap2.getInt("rowSpan"), readableMap2.getInt("columnIndex"), readableMap2.getInt("columnSpan"), readableMap2.getBoolean("heading")));
        }
        boolean z2 = true;
        if (readableArray != null) {
            for (int i3 = 0; i3 < readableArray.size(); i3++) {
                ReadableMap map = readableArray.getMap(i3);
                if (map.hasKey(ZeroconfModule.KEY_SERVICE_NAME)) {
                    int i4 = sCounter;
                    if (map.hasKey("label")) {
                        str = map.getString("label");
                    } else {
                        str = null;
                    }
                    HashMap<String, Integer> hashMap = sActionIdMap;
                    if (hashMap.containsKey(map.getString(ZeroconfModule.KEY_SERVICE_NAME))) {
                        i4 = hashMap.get(map.getString(ZeroconfModule.KEY_SERVICE_NAME)).intValue();
                    } else {
                        sCounter++;
                    }
                    this.mAccessibilityActionsMap.put(Integer.valueOf(i4), map.getString(ZeroconfModule.KEY_SERVICE_NAME));
                    accessibilityNodeInfoCompat.m37601b(new AccessibilityNodeInfoCompat.C1178a(i4, str));
                } else {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
            }
        }
        ReadableMap readableMap3 = (ReadableMap) view.getTag(C3893R.C3895id.accessibility_value);
        if (readableMap3 != null && readableMap3.hasKey("min") && readableMap3.hasKey("now") && readableMap3.hasKey("max")) {
            Dynamic dynamic = readableMap3.getDynamic("min");
            Dynamic dynamic2 = readableMap3.getDynamic("now");
            Dynamic dynamic3 = readableMap3.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int asInt = dynamic.asInt();
                    int asInt2 = dynamic2.asInt();
                    int asInt3 = dynamic3.asInt();
                    if (asInt3 > asInt && asInt2 >= asInt && asInt3 >= asInt2) {
                        accessibilityNodeInfoCompat.m37644A0(AccessibilityNodeInfoCompat.C1182e.m37539d(0, asInt, asInt3, asInt2));
                    }
                }
            }
        }
        String str3 = (String) view.getTag(C3893R.C3895id.react_test_id);
        if (str3 != null) {
            accessibilityNodeInfoCompat.m37620M0(str3);
        }
        boolean isEmpty = TextUtils.isEmpty(accessibilityNodeInfoCompat.m37567s());
        boolean isEmpty2 = TextUtils.isEmpty(accessibilityNodeInfoCompat.m37645A());
        if (isEmpty && isEmpty2) {
            z = true;
        } else {
            z = false;
        }
        if (readableArray == null && readableMap == null && tag == null && accessibilityRole == null) {
            z2 = false;
        }
        if (z && z2) {
            accessibilityNodeInfoCompat.m37582k0(getTalkbackDescription(view, accessibilityNodeInfoCompat));
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    protected boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    protected void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityLinks accessibilityLinks = this.mAccessibilityLinks;
        if (accessibilityLinks == null) {
            accessibilityNodeInfoCompat.m37582k0("");
            accessibilityNodeInfoCompat.m37598c0(new Rect(0, 0, 1, 1));
            return;
        }
        AccessibilityLinks.AccessibleLink linkById = accessibilityLinks.getLinkById(i);
        if (linkById == null) {
            accessibilityNodeInfoCompat.m37582k0("");
            accessibilityNodeInfoCompat.m37598c0(new Rect(0, 0, 1, 1));
            return;
        }
        Rect boundsInParent = getBoundsInParent(linkById);
        if (boundsInParent == null) {
            accessibilityNodeInfoCompat.m37582k0("");
            accessibilityNodeInfoCompat.m37598c0(new Rect(0, 0, 1, 1));
            return;
        }
        accessibilityNodeInfoCompat.m37582k0(linkById.description);
        accessibilityNodeInfoCompat.m37603a(16);
        accessibilityNodeInfoCompat.m37598c0(boundsInParent);
        accessibilityNodeInfoCompat.m37642B0(this.mView.getResources().getString(C3893R.string.link_description));
        accessibilityNodeInfoCompat.m37590g0(AccessibilityRole.getValue(AccessibilityRole.BUTTON));
    }

    @Override // androidx.core.view.C1170a
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 524288) {
            view.setTag(C3893R.C3895id.accessibility_state_expanded, Boolean.FALSE);
        }
        if (i == 262144) {
            view.setTag(C3893R.C3895id.accessibility_state_expanded, Boolean.TRUE);
        }
        if (this.mAccessibilityActionsMap.containsKey(Integer.valueOf(i))) {
            final WritableMap createMap = Arguments.createMap();
            createMap.putString("actionName", this.mAccessibilityActionsMap.get(Integer.valueOf(i)));
            ReactContext reactContext = (ReactContext) view.getContext();
            if (reactContext.hasActiveReactInstance()) {
                int id2 = view.getId();
                int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
                UIManager uIManager = UIManagerHelper.getUIManager(reactContext, ViewUtil.getUIManagerType(id2));
                if (uIManager != null) {
                    ((EventDispatcher) uIManager.getEventDispatcher()).dispatchEvent(new Event(surfaceId, id2) { // from class: com.facebook.react.uimanager.ReactAccessibilityDelegate.2
                        @Override // com.facebook.react.uimanager.events.Event
                        protected WritableMap getEventData() {
                            return createMap;
                        }

                        @Override // com.facebook.react.uimanager.events.Event
                        public String getEventName() {
                            return ReactAccessibilityDelegate.TOP_ACCESSIBILITY_ACTION_EVENT;
                        }
                    });
                }
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
            }
            AccessibilityRole accessibilityRole = (AccessibilityRole) view.getTag(C3893R.C3895id.accessibility_role);
            ReadableMap readableMap = (ReadableMap) view.getTag(C3893R.C3895id.accessibility_value);
            if (accessibilityRole == AccessibilityRole.ADJUSTABLE) {
                if (i == AccessibilityNodeInfoCompat.C1178a.f3618q.m37550b() || i == AccessibilityNodeInfoCompat.C1178a.f3619r.m37550b()) {
                    if (readableMap != null && !readableMap.hasKey("text")) {
                        scheduleAccessibilityEventSender(view);
                    }
                    return super.performAccessibilityAction(view, i, bundle);
                }
                return true;
            }
            return true;
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
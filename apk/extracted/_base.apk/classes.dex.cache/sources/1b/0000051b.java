package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p018os.C1049a;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p356u.C12810e;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class AccessibilityNodeInfoCompat {

    /* renamed from: d */
    private static int f3581d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f3582a;

    /* renamed from: b */
    public int f3583b = -1;

    /* renamed from: c */
    private int f3584c = -1;

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeInfoCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1178a {

        /* renamed from: A */
        public static final C1178a f3585A;

        /* renamed from: B */
        public static final C1178a f3586B;

        /* renamed from: C */
        public static final C1178a f3587C;

        /* renamed from: D */
        public static final C1178a f3588D;

        /* renamed from: E */
        public static final C1178a f3589E;

        /* renamed from: F */
        public static final C1178a f3590F;

        /* renamed from: G */
        public static final C1178a f3591G;

        /* renamed from: H */
        public static final C1178a f3592H;

        /* renamed from: I */
        public static final C1178a f3593I;

        /* renamed from: J */
        public static final C1178a f3594J;

        /* renamed from: K */
        public static final C1178a f3595K;

        /* renamed from: L */
        public static final C1178a f3596L;

        /* renamed from: M */
        public static final C1178a f3597M;

        /* renamed from: N */
        public static final C1178a f3598N;

        /* renamed from: O */
        public static final C1178a f3599O;

        /* renamed from: P */
        public static final C1178a f3600P;

        /* renamed from: Q */
        public static final C1178a f3601Q;

        /* renamed from: R */
        public static final C1178a f3602R;

        /* renamed from: S */
        public static final C1178a f3603S;

        /* renamed from: T */
        public static final C1178a f3604T;

        /* renamed from: U */
        public static final C1178a f3605U;

        /* renamed from: e */
        public static final C1178a f3606e = new C1178a(1, null);

        /* renamed from: f */
        public static final C1178a f3607f = new C1178a(2, null);

        /* renamed from: g */
        public static final C1178a f3608g = new C1178a(4, null);

        /* renamed from: h */
        public static final C1178a f3609h = new C1178a(8, null);

        /* renamed from: i */
        public static final C1178a f3610i = new C1178a(16, null);

        /* renamed from: j */
        public static final C1178a f3611j = new C1178a(32, null);

        /* renamed from: k */
        public static final C1178a f3612k = new C1178a(64, null);

        /* renamed from: l */
        public static final C1178a f3613l = new C1178a(128, null);

        /* renamed from: m */
        public static final C1178a f3614m = new C1178a(256, (CharSequence) null, AccessibilityViewCommand.C1187b.class);

        /* renamed from: n */
        public static final C1178a f3615n = new C1178a(512, (CharSequence) null, AccessibilityViewCommand.C1187b.class);

        /* renamed from: o */
        public static final C1178a f3616o = new C1178a(1024, (CharSequence) null, AccessibilityViewCommand.C1188c.class);

        /* renamed from: p */
        public static final C1178a f3617p = new C1178a((int) RecyclerView.ItemAnimator.FLAG_MOVED, (CharSequence) null, AccessibilityViewCommand.C1188c.class);

        /* renamed from: q */
        public static final C1178a f3618q = new C1178a(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, null);

        /* renamed from: r */
        public static final C1178a f3619r = new C1178a(8192, null);

        /* renamed from: s */
        public static final C1178a f3620s = new C1178a(16384, null);

        /* renamed from: t */
        public static final C1178a f3621t = new C1178a(32768, null);

        /* renamed from: u */
        public static final C1178a f3622u = new C1178a(65536, null);

        /* renamed from: v */
        public static final C1178a f3623v = new C1178a(131072, (CharSequence) null, AccessibilityViewCommand.C1192g.class);

        /* renamed from: w */
        public static final C1178a f3624w = new C1178a(262144, null);

        /* renamed from: x */
        public static final C1178a f3625x = new C1178a(524288, null);

        /* renamed from: y */
        public static final C1178a f3626y = new C1178a(1048576, null);

        /* renamed from: z */
        public static final C1178a f3627z = new C1178a(2097152, (CharSequence) null, AccessibilityViewCommand.C1193h.class);

        /* renamed from: a */
        final Object f3628a;

        /* renamed from: b */
        private final int f3629b;

        /* renamed from: c */
        private final Class<? extends AccessibilityViewCommand.AbstractC1186a> f3630c;

        /* renamed from: d */
        protected final AccessibilityViewCommand f3631d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24 = null;
            int i = Build.VERSION.SDK_INT;
            f3585A = new C1178a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
            f3586B = new C1178a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, AccessibilityViewCommand.C1190e.class);
            f3587C = new C1178a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
            f3588D = new C1178a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
            f3589E = new C1178a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
            f3590F = new C1178a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
            if (i >= 29) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction = accessibilityAction23;
            } else {
                accessibilityAction = null;
            }
            f3591G = new C1178a(accessibilityAction, 16908358, null, null, null);
            if (i >= 29) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction2 = accessibilityAction22;
            } else {
                accessibilityAction2 = null;
            }
            f3592H = new C1178a(accessibilityAction2, 16908359, null, null, null);
            if (i >= 29) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction3 = accessibilityAction21;
            } else {
                accessibilityAction3 = null;
            }
            f3593I = new C1178a(accessibilityAction3, 16908360, null, null, null);
            if (i >= 29) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction4 = accessibilityAction20;
            } else {
                accessibilityAction4 = null;
            }
            f3594J = new C1178a(accessibilityAction4, 16908361, null, null, null);
            f3595K = new C1178a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            if (i >= 24) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                accessibilityAction5 = accessibilityAction19;
            } else {
                accessibilityAction5 = null;
            }
            f3596L = new C1178a(accessibilityAction5, 16908349, null, null, AccessibilityViewCommand.C1191f.class);
            if (i >= 26) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction6 = accessibilityAction18;
            } else {
                accessibilityAction6 = null;
            }
            f3597M = new C1178a(accessibilityAction6, 16908354, null, null, AccessibilityViewCommand.C1189d.class);
            if (i >= 28) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction7 = accessibilityAction17;
            } else {
                accessibilityAction7 = null;
            }
            f3598N = new C1178a(accessibilityAction7, 16908356, null, null, null);
            if (i >= 28) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction8 = accessibilityAction16;
            } else {
                accessibilityAction8 = null;
            }
            f3599O = new C1178a(accessibilityAction8, 16908357, null, null, null);
            if (i >= 30) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction9 = accessibilityAction15;
            } else {
                accessibilityAction9 = null;
            }
            f3600P = new C1178a(accessibilityAction9, 16908362, null, null, null);
            if (i >= 30) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction10 = accessibilityAction14;
            } else {
                accessibilityAction10 = null;
            }
            f3601Q = new C1178a(accessibilityAction10, 16908372, null, null, null);
            if (i >= 32) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
            } else {
                accessibilityAction11 = null;
            }
            f3602R = new C1178a(accessibilityAction11, 16908373, null, null, null);
            if (i >= 32) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            } else {
                accessibilityAction12 = null;
            }
            f3603S = new C1178a(accessibilityAction12, 16908374, null, null, null);
            if (i >= 32) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            } else {
                accessibilityAction13 = null;
            }
            f3604T = new C1178a(accessibilityAction13, 16908375, null, null, null);
            if (i >= 33) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            f3605U = new C1178a(accessibilityAction24, 16908376, null, null, null);
        }

        public C1178a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        /* renamed from: a */
        public C1178a m37551a(CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            return new C1178a(null, this.f3629b, charSequence, accessibilityViewCommand, this.f3630c);
        }

        /* renamed from: b */
        public int m37550b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3628a).getId();
        }

        /* renamed from: c */
        public CharSequence m37549c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3628a).getLabel();
        }

        /* renamed from: d */
        public boolean m37548d(View view, Bundle bundle) {
            String name;
            if (this.f3631d == null) {
                return false;
            }
            Class<? extends AccessibilityViewCommand.AbstractC1186a> cls = this.f3630c;
            AccessibilityViewCommand.AbstractC1186a abstractC1186a = null;
            if (cls != null) {
                try {
                    AccessibilityViewCommand.AbstractC1186a newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        newInstance.m37535a(bundle);
                        abstractC1186a = newInstance;
                    } catch (Exception e) {
                        e = e;
                        abstractC1186a = newInstance;
                        Class<? extends AccessibilityViewCommand.AbstractC1186a> cls2 = this.f3630c;
                        if (cls2 == null) {
                            name = "null";
                        } else {
                            name = cls2.getName();
                        }
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                        return this.f3631d.mo27682a(view, abstractC1186a);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            return this.f3631d.mo27682a(view, abstractC1186a);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C1178a)) {
                return false;
            }
            C1178a c1178a = (C1178a) obj;
            Object obj2 = this.f3628a;
            if (obj2 == null) {
                if (c1178a.f3628a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(c1178a.f3628a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.f3628a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String m37585j = AccessibilityNodeInfoCompat.m37585j(this.f3629b);
            if (m37585j.equals("ACTION_UNKNOWN") && m37549c() != null) {
                m37585j = m37549c().toString();
            }
            sb2.append(m37585j);
            return sb2.toString();
        }

        public C1178a(int i, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            this(null, i, charSequence, accessibilityViewCommand, null);
        }

        C1178a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private C1178a(int i, CharSequence charSequence, Class<? extends AccessibilityViewCommand.AbstractC1186a> cls) {
            this(null, i, charSequence, null, cls);
        }

        C1178a(Object obj, int i, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand, Class<? extends AccessibilityViewCommand.AbstractC1186a> cls) {
            this.f3629b = i;
            this.f3631d = accessibilityViewCommand;
            if (obj == null) {
                this.f3628a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.f3628a = obj;
            }
            this.f3630c = cls;
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeInfoCompat$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1179b {
        /* renamed from: a */
        public static Bundle m37547a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeInfoCompat$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1180c {

        /* renamed from: a */
        final Object f3632a;

        C1180c(Object obj) {
            this.f3632a = obj;
        }

        /* renamed from: a */
        public static C1180c m37546a(int i, int i2, boolean z) {
            return new C1180c(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        /* renamed from: b */
        public static C1180c m37545b(int i, int i2, boolean z, int i3) {
            return new C1180c(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeInfoCompat$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1181d {

        /* renamed from: a */
        final Object f3633a;

        C1181d(Object obj) {
            this.f3633a = obj;
        }

        /* renamed from: a */
        public static C1181d m37544a(int i, int i2, int i3, int i4, boolean z) {
            return new C1181d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }

        /* renamed from: b */
        public static C1181d m37543b(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C1181d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeInfoCompat$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1182e {

        /* renamed from: a */
        final Object f3634a;

        C1182e(Object obj) {
            this.f3634a = obj;
        }

        /* renamed from: d */
        public static C1182e m37539d(int i, float f, float f2, float f3) {
            return new C1182e(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }

        /* renamed from: a */
        public float m37542a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f3634a).getCurrent();
        }

        /* renamed from: b */
        public float m37541b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f3634a).getMax();
        }

        /* renamed from: c */
        public float m37540c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f3634a).getMin();
        }
    }

    private AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3582a = accessibilityNodeInfo;
    }

    /* renamed from: D */
    private boolean m37639D() {
        return !m37589h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: E */
    private int m37637E(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f3581d;
        f3581d = i2 + 1;
        return i2;
    }

    /* renamed from: P0 */
    public static AccessibilityNodeInfoCompat m37614P0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
    }

    /* renamed from: T */
    public static AccessibilityNodeInfoCompat m37610T() {
        return m37614P0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: U */
    public static AccessibilityNodeInfoCompat m37609U(View view) {
        return m37614P0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: V */
    public static AccessibilityNodeInfoCompat m37608V(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return m37614P0(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.f3582a));
    }

    /* renamed from: Z */
    private void m37604Z(View view) {
        SparseArray<WeakReference<ClickableSpan>> m37555y = m37555y(view);
        if (m37555y != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < m37555y.size(); i++) {
                if (m37555y.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                m37555y.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: b0 */
    private void m37600b0(int i, boolean z) {
        Bundle m37565t = m37565t();
        if (m37565t != null) {
            int i2 = m37565t.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            m37565t.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: e */
    private void m37595e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m37589h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m37589h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m37589h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m37589h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: g */
    private void m37591g() {
        C1179b.m37547a(this.f3582a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        C1179b.m37547a(this.f3582a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        C1179b.m37547a(this.f3582a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        C1179b.m37547a(this.f3582a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    /* renamed from: h */
    private List<Integer> m37589h(String str) {
        ArrayList<Integer> integerArrayList = C1179b.m37547a(this.f3582a).getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            C1179b.m37547a(this.f3582a).putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    /* renamed from: j */
    static String m37585j(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case RecyclerView.ItemAnimator.FLAG_MOVED /* 2048 */:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT /* 4096 */:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    default:
                        switch (i) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i) {
                                            case 16908372:
                                                return "ACTION_IME_ENTER";
                                            case 16908373:
                                                return "ACTION_DRAG_START";
                                            case 16908374:
                                                return "ACTION_DRAG_DROP";
                                            case 16908375:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    /* renamed from: l */
    private boolean m37581l(int i) {
        Bundle m37565t = m37565t();
        if (m37565t == null || (m37565t.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) != i) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public static ClickableSpan[] m37571q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: v */
    private SparseArray<WeakReference<ClickableSpan>> m37561v(View view) {
        SparseArray<WeakReference<ClickableSpan>> m37555y = m37555y(view);
        if (m37555y == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(C12810e.f33219W, sparseArray);
            return sparseArray;
        }
        return m37555y;
    }

    /* renamed from: y */
    private SparseArray<WeakReference<ClickableSpan>> m37555y(View view) {
        return (SparseArray) view.getTag(C12810e.f33219W);
    }

    /* renamed from: A */
    public CharSequence m37645A() {
        if (m37639D()) {
            List<Integer> m37589h = m37589h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> m37589h2 = m37589h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> m37589h3 = m37589h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> m37589h4 = m37589h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f3582a.getText(), 0, this.f3582a.getText().length()));
            for (int i = 0; i < m37589h.size(); i++) {
                spannableString.setSpan(new C1194a(m37589h4.get(i).intValue(), this, m37565t().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), m37589h.get(i).intValue(), m37589h2.get(i).intValue(), m37589h3.get(i).intValue());
            }
            return spannableString;
        }
        return this.f3582a.getText();
    }

    /* renamed from: A0 */
    public void m37644A0(C1182e c1182e) {
        this.f3582a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) c1182e.f3634a);
    }

    /* renamed from: B */
    public String m37643B() {
        if (C1049a.m37988c()) {
            return this.f3582a.getUniqueId();
        }
        return C1179b.m37547a(this.f3582a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    /* renamed from: B0 */
    public void m37642B0(CharSequence charSequence) {
        C1179b.m37547a(this.f3582a).putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* renamed from: C */
    public String m37641C() {
        return this.f3582a.getViewIdResourceName();
    }

    /* renamed from: C0 */
    public void m37640C0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3582a.setScreenReaderFocusable(z);
        } else {
            m37600b0(1, z);
        }
    }

    /* renamed from: D0 */
    public void m37638D0(boolean z) {
        this.f3582a.setScrollable(z);
    }

    /* renamed from: E0 */
    public void m37636E0(boolean z) {
        this.f3582a.setSelected(z);
    }

    /* renamed from: F */
    public boolean m37635F() {
        return this.f3582a.isAccessibilityFocused();
    }

    /* renamed from: F0 */
    public void m37634F0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3582a.setShowingHintText(z);
        } else {
            m37600b0(4, z);
        }
    }

    /* renamed from: G */
    public boolean m37633G() {
        return this.f3582a.isCheckable();
    }

    /* renamed from: G0 */
    public void m37632G0(View view) {
        this.f3584c = -1;
        this.f3582a.setSource(view);
    }

    /* renamed from: H */
    public boolean m37631H() {
        return this.f3582a.isChecked();
    }

    /* renamed from: H0 */
    public void m37630H0(View view, int i) {
        this.f3584c = i;
        this.f3582a.setSource(view, i);
    }

    /* renamed from: I */
    public boolean m37629I() {
        return this.f3582a.isClickable();
    }

    /* renamed from: I0 */
    public void m37628I0(CharSequence charSequence) {
        if (C1049a.m37989b()) {
            this.f3582a.setStateDescription(charSequence);
        } else {
            C1179b.m37547a(this.f3582a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: J */
    public boolean m37627J() {
        return this.f3582a.isEnabled();
    }

    /* renamed from: J0 */
    public void m37626J0(CharSequence charSequence) {
        this.f3582a.setText(charSequence);
    }

    /* renamed from: K */
    public boolean m37625K() {
        return this.f3582a.isFocusable();
    }

    /* renamed from: K0 */
    public void m37624K0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3582a.setTooltipText(charSequence);
        } else {
            C1179b.m37547a(this.f3582a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: L */
    public boolean m37623L() {
        return this.f3582a.isFocused();
    }

    /* renamed from: L0 */
    public void m37622L0(View view) {
        this.f3582a.setTraversalAfter(view);
    }

    /* renamed from: M */
    public boolean m37621M() {
        return this.f3582a.isLongClickable();
    }

    /* renamed from: M0 */
    public void m37620M0(String str) {
        this.f3582a.setViewIdResourceName(str);
    }

    /* renamed from: N */
    public boolean m37619N() {
        return this.f3582a.isPassword();
    }

    /* renamed from: N0 */
    public void m37618N0(boolean z) {
        this.f3582a.setVisibleToUser(z);
    }

    /* renamed from: O */
    public boolean m37617O() {
        boolean isScreenReaderFocusable;
        if (Build.VERSION.SDK_INT >= 28) {
            isScreenReaderFocusable = this.f3582a.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }
        return m37581l(1);
    }

    /* renamed from: O0 */
    public AccessibilityNodeInfo m37616O0() {
        return this.f3582a;
    }

    /* renamed from: P */
    public boolean m37615P() {
        return this.f3582a.isScrollable();
    }

    /* renamed from: Q */
    public boolean m37613Q() {
        return this.f3582a.isSelected();
    }

    /* renamed from: R */
    public boolean m37612R() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT >= 26) {
            isShowingHintText = this.f3582a.isShowingHintText();
            return isShowingHintText;
        }
        return m37581l(4);
    }

    /* renamed from: S */
    public boolean m37611S() {
        return this.f3582a.isVisibleToUser();
    }

    /* renamed from: W */
    public boolean m37607W(int i, Bundle bundle) {
        return this.f3582a.performAction(i, bundle);
    }

    @Deprecated
    /* renamed from: X */
    public void m37606X() {
    }

    /* renamed from: Y */
    public boolean m37605Y(C1178a c1178a) {
        return this.f3582a.removeAction((AccessibilityNodeInfo.AccessibilityAction) c1178a.f3628a);
    }

    /* renamed from: a */
    public void m37603a(int i) {
        this.f3582a.addAction(i);
    }

    /* renamed from: a0 */
    public void m37602a0(boolean z) {
        this.f3582a.setAccessibilityFocused(z);
    }

    /* renamed from: b */
    public void m37601b(C1178a c1178a) {
        this.f3582a.addAction((AccessibilityNodeInfo.AccessibilityAction) c1178a.f3628a);
    }

    /* renamed from: c */
    public void m37599c(View view) {
        this.f3582a.addChild(view);
    }

    @Deprecated
    /* renamed from: c0 */
    public void m37598c0(Rect rect) {
        this.f3582a.setBoundsInParent(rect);
    }

    /* renamed from: d */
    public void m37597d(View view, int i) {
        this.f3582a.addChild(view, i);
    }

    /* renamed from: d0 */
    public void m37596d0(Rect rect) {
        this.f3582a.setBoundsInScreen(rect);
    }

    /* renamed from: e0 */
    public void m37594e0(boolean z) {
        this.f3582a.setCheckable(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3582a;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfoCompat.f3582a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfoCompat.f3582a)) {
            return false;
        }
        if (this.f3584c == accessibilityNodeInfoCompat.f3584c && this.f3583b == accessibilityNodeInfoCompat.f3583b) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m37593f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m37591g();
            m37604Z(view);
            ClickableSpan[] m37571q = m37571q(charSequence);
            if (m37571q != null && m37571q.length > 0) {
                m37565t().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C12810e.f33223a);
                SparseArray<WeakReference<ClickableSpan>> m37561v = m37561v(view);
                for (int i = 0; i < m37571q.length; i++) {
                    int m37637E = m37637E(m37571q[i], m37561v);
                    m37561v.put(m37637E, new WeakReference<>(m37571q[i]));
                    m37595e(m37571q[i], (Spanned) charSequence, m37637E);
                }
            }
        }
    }

    /* renamed from: f0 */
    public void m37592f0(boolean z) {
        this.f3582a.setChecked(z);
    }

    /* renamed from: g0 */
    public void m37590g0(CharSequence charSequence) {
        this.f3582a.setClassName(charSequence);
    }

    /* renamed from: h0 */
    public void m37588h0(boolean z) {
        this.f3582a.setClickable(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3582a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public List<C1178a> m37587i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f3582a.getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new C1178a(actionList.get(i)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    /* renamed from: i0 */
    public void m37586i0(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3582a;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((C1180c) obj).f3632a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    /* renamed from: j0 */
    public void m37584j0(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3582a;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((C1181d) obj).f3633a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    @Deprecated
    /* renamed from: k */
    public int m37583k() {
        return this.f3582a.getActions();
    }

    /* renamed from: k0 */
    public void m37582k0(CharSequence charSequence) {
        this.f3582a.setContentDescription(charSequence);
    }

    /* renamed from: l0 */
    public void m37580l0(boolean z) {
        this.f3582a.setEnabled(z);
    }

    @Deprecated
    /* renamed from: m */
    public void m37579m(Rect rect) {
        this.f3582a.getBoundsInParent(rect);
    }

    /* renamed from: m0 */
    public void m37578m0(CharSequence charSequence) {
        this.f3582a.setError(charSequence);
    }

    /* renamed from: n */
    public void m37577n(Rect rect) {
        this.f3582a.getBoundsInScreen(rect);
    }

    /* renamed from: n0 */
    public void m37576n0(boolean z) {
        this.f3582a.setFocusable(z);
    }

    /* renamed from: o */
    public int m37575o() {
        return this.f3582a.getChildCount();
    }

    /* renamed from: o0 */
    public void m37574o0(boolean z) {
        this.f3582a.setFocused(z);
    }

    /* renamed from: p */
    public CharSequence m37573p() {
        return this.f3582a.getClassName();
    }

    /* renamed from: p0 */
    public void m37572p0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3582a.setHeading(z);
        } else {
            m37600b0(2, z);
        }
    }

    /* renamed from: q0 */
    public void m37570q0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3582a.setHintText(charSequence);
        } else {
            C1179b.m37547a(this.f3582a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: r */
    public C1180c m37569r() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f3582a.getCollectionInfo();
        if (collectionInfo != null) {
            return new C1180c(collectionInfo);
        }
        return null;
    }

    /* renamed from: r0 */
    public void m37568r0(boolean z) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f3582a.setImportantForAccessibility(z);
        }
    }

    /* renamed from: s */
    public CharSequence m37567s() {
        return this.f3582a.getContentDescription();
    }

    /* renamed from: s0 */
    public void m37566s0(View view) {
        this.f3582a.setLabelFor(view);
    }

    /* renamed from: t */
    public Bundle m37565t() {
        return C1179b.m37547a(this.f3582a);
    }

    /* renamed from: t0 */
    public void m37564t0(View view) {
        this.f3582a.setLabeledBy(view);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m37579m(rect);
        sb2.append("; boundsInParent: " + rect);
        m37577n(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(m37559w());
        sb2.append("; className: ");
        sb2.append(m37573p());
        sb2.append("; text: ");
        sb2.append(m37645A());
        sb2.append("; contentDescription: ");
        sb2.append(m37567s());
        sb2.append("; viewId: ");
        sb2.append(m37641C());
        sb2.append("; uniqueId: ");
        sb2.append(m37643B());
        sb2.append("; checkable: ");
        sb2.append(m37633G());
        sb2.append("; checked: ");
        sb2.append(m37631H());
        sb2.append("; focusable: ");
        sb2.append(m37625K());
        sb2.append("; focused: ");
        sb2.append(m37623L());
        sb2.append("; selected: ");
        sb2.append(m37613Q());
        sb2.append("; clickable: ");
        sb2.append(m37629I());
        sb2.append("; longClickable: ");
        sb2.append(m37621M());
        sb2.append("; enabled: ");
        sb2.append(m37627J());
        sb2.append("; password: ");
        sb2.append(m37619N());
        sb2.append("; scrollable: " + m37615P());
        sb2.append("; [");
        List<C1178a> m37587i = m37587i();
        for (int i = 0; i < m37587i.size(); i++) {
            C1178a c1178a = m37587i.get(i);
            String m37585j = m37585j(c1178a.m37550b());
            if (m37585j.equals("ACTION_UNKNOWN") && c1178a.m37549c() != null) {
                m37585j = c1178a.m37549c().toString();
            }
            sb2.append(m37585j);
            if (i != m37587i.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: u */
    public CharSequence m37563u() {
        CharSequence hintText;
        if (Build.VERSION.SDK_INT >= 26) {
            hintText = this.f3582a.getHintText();
            return hintText;
        }
        return C1179b.m37547a(this.f3582a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
    }

    /* renamed from: u0 */
    public void m37562u0(int i) {
        this.f3582a.setMaxTextLength(i);
    }

    /* renamed from: v0 */
    public void m37560v0(int i) {
        this.f3582a.setMovementGranularities(i);
    }

    /* renamed from: w */
    public CharSequence m37559w() {
        return this.f3582a.getPackageName();
    }

    /* renamed from: w0 */
    public void m37558w0(CharSequence charSequence) {
        this.f3582a.setPackageName(charSequence);
    }

    /* renamed from: x */
    public C1182e m37557x() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f3582a.getRangeInfo();
        if (rangeInfo != null) {
            return new C1182e(rangeInfo);
        }
        return null;
    }

    /* renamed from: x0 */
    public void m37556x0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3582a.setPaneTitle(charSequence);
        } else {
            C1179b.m37547a(this.f3582a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: y0 */
    public void m37554y0(View view) {
        this.f3583b = -1;
        this.f3582a.setParent(view);
    }

    /* renamed from: z */
    public CharSequence m37553z() {
        CharSequence stateDescription;
        if (C1049a.m37989b()) {
            stateDescription = this.f3582a.getStateDescription();
            return stateDescription;
        }
        return C1179b.m37547a(this.f3582a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    /* renamed from: z0 */
    public void m37552z0(View view, int i) {
        this.f3583b = i;
        this.f3582a.setParent(view, i);
    }
}
package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import androidx.activity.AbstractC0256g;
import androidx.activity.InterfaceC0260k;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0267a;
import androidx.activity.result.C0270c;
import androidx.activity.result.InterfaceC0269b;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.collection.C0626b;
import androidx.core.p018os.C1056f;
import androidx.fragment.app.C1592d;
import androidx.fragment.app.C1616o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.InterfaceC1687g0;
import androidx.lifecycle.InterfaceC1695l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p032c.C2372a;
import p032c.C2374b;
import p124h0.C6859b;
import p164j$.util.DesugarCollections;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class FragmentManager {

    /* renamed from: O */
    private static boolean f4050O = false;

    /* renamed from: P */
    static boolean f4051P = true;

    /* renamed from: A */
    private ActivityResultLauncher<C0270c> f4052A;

    /* renamed from: B */
    private ActivityResultLauncher<String[]> f4053B;

    /* renamed from: D */
    private boolean f4055D;

    /* renamed from: E */
    private boolean f4056E;

    /* renamed from: F */
    private boolean f4057F;

    /* renamed from: G */
    private boolean f4058G;

    /* renamed from: H */
    private boolean f4059H;

    /* renamed from: I */
    private ArrayList<C1574a> f4060I;

    /* renamed from: J */
    private ArrayList<Boolean> f4061J;

    /* renamed from: K */
    private ArrayList<Fragment> f4062K;

    /* renamed from: L */
    private ArrayList<C1572p> f4063L;

    /* renamed from: M */
    private C1607j f4064M;

    /* renamed from: b */
    private boolean f4067b;

    /* renamed from: d */
    ArrayList<C1574a> f4069d;

    /* renamed from: e */
    private ArrayList<Fragment> f4070e;

    /* renamed from: g */
    private OnBackPressedDispatcher f4072g;

    /* renamed from: l */
    private ArrayList<InterfaceC1569m> f4077l;

    /* renamed from: r */
    private FragmentHostCallback<?> f4083r;

    /* renamed from: s */
    private FragmentContainer f4084s;

    /* renamed from: t */
    private Fragment f4085t;

    /* renamed from: u */
    Fragment f4086u;

    /* renamed from: z */
    private ActivityResultLauncher<Intent> f4091z;

    /* renamed from: a */
    private final ArrayList<InterfaceC1570n> f4066a = new ArrayList<>();

    /* renamed from: c */
    private final C1615n f4068c = new C1615n();

    /* renamed from: f */
    private final LayoutInflater$Factory2C1600f f4071f = new LayoutInflater$Factory2C1600f(this);

    /* renamed from: h */
    private final AbstractC0256g f4073h = new C1558c(false);

    /* renamed from: i */
    private final AtomicInteger f4074i = new AtomicInteger();

    /* renamed from: j */
    private final Map<String, Bundle> f4075j = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: k */
    private final Map<String, Object> f4076k = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: m */
    private Map<Fragment, HashSet<C1056f>> f4078m = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private final C1616o.InterfaceC1623g f4079n = new C1559d();

    /* renamed from: o */
    private final C1602g f4080o = new C1602g(this);

    /* renamed from: p */
    private final CopyOnWriteArrayList<InterfaceC1609k> f4081p = new CopyOnWriteArrayList<>();

    /* renamed from: q */
    int f4082q = -1;

    /* renamed from: v */
    private C1599e f4087v = null;

    /* renamed from: w */
    private C1599e f4088w = new C1560e();

    /* renamed from: x */
    private InterfaceC1645t f4089x = null;

    /* renamed from: y */
    private InterfaceC1645t f4090y = new C1561f();

    /* renamed from: C */
    ArrayDeque<C1567l> f4054C = new ArrayDeque<>();

    /* renamed from: N */
    private Runnable f4065N = new RunnableC1562g();

    /* renamed from: androidx.fragment.app.FragmentManager$6 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C15556 implements InterfaceC1695l {

        /* renamed from: j */
        final /* synthetic */ String f4092j;

        /* renamed from: k */
        final /* synthetic */ Lifecycle f4093k;

        /* renamed from: l */
        final /* synthetic */ FragmentManager f4094l;

        @Override // androidx.lifecycle.InterfaceC1695l
        /* renamed from: a */
        public void mo11423a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
            if (enumC1651b == Lifecycle.EnumC1651b.ON_START && ((Bundle) this.f4094l.f4075j.get(this.f4092j)) != null) {
                throw null;
            }
            if (enumC1651b == Lifecycle.EnumC1651b.ON_DESTROY) {
                this.f4093k.mo36123c(this);
                this.f4094l.f4076k.remove(this.f4092j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1556a implements ActivityResultCallback<C0267a> {
        C1556a() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: b */
        public void mo36369a(C0267a c0267a) {
            C1567l pollFirst = FragmentManager.this.f4054C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f4109j;
            int i = pollFirst.f4110k;
            Fragment m36230i = FragmentManager.this.f4068c.m36230i(str);
            if (m36230i == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            m36230i.onActivityResult(i, c0267a.m40793b(), c0267a.m40794a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1557b implements ActivityResultCallback<Map<String, Boolean>> {
        C1557b() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo36369a(Map<String, Boolean> map) {
            int i;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((Boolean) arrayList.get(i2)).booleanValue()) {
                    i = 0;
                } else {
                    i = -1;
                }
                iArr[i2] = i;
            }
            C1567l pollFirst = FragmentManager.this.f4054C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f4109j;
            int i3 = pollFirst.f4110k;
            Fragment m36230i = FragmentManager.this.f4068c.m36230i(str);
            if (m36230i == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            m36230i.onRequestPermissionsResult(i3, strArr, iArr);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1558c extends AbstractC0256g {
        C1558c(boolean z) {
            super(z);
        }

        @Override // androidx.activity.AbstractC0256g
        /* renamed from: b */
        public void mo24970b() {
            FragmentManager.this.m36487D0();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1559d implements C1616o.InterfaceC1623g {
        C1559d() {
        }

        @Override // androidx.fragment.app.C1616o.InterfaceC1623g
        /* renamed from: a */
        public void mo36185a(Fragment fragment, C1056f c1056f) {
            if (!c1056f.m37976b()) {
                FragmentManager.this.m36431d1(fragment, c1056f);
            }
        }

        @Override // androidx.fragment.app.C1616o.InterfaceC1623g
        /* renamed from: b */
        public void mo36184b(Fragment fragment, C1056f c1056f) {
            FragmentManager.this.m36427f(fragment, c1056f);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1560e extends C1599e {
        C1560e() {
        }

        @Override // androidx.fragment.app.C1599e
        /* renamed from: a */
        public Fragment mo36294a(ClassLoader classLoader, String str) {
            return FragmentManager.this.m36380v0().m36533b(FragmentManager.this.m36380v0().m36504f(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1561f implements InterfaceC1645t {
        C1561f() {
        }

        @Override // androidx.fragment.app.InterfaceC1645t
        /* renamed from: a */
        public AbstractC1636s mo36136a(ViewGroup viewGroup) {
            return new C1577c(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1562g implements Runnable {
        RunnableC1562g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.m36441a0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1563h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4102a;

        /* renamed from: b */
        final /* synthetic */ View f4103b;

        /* renamed from: c */
        final /* synthetic */ Fragment f4104c;

        C1563h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f4102a = viewGroup;
            this.f4103b = view;
            this.f4104c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4102a.endViewTransition(this.f4103b);
            animator.removeListener(this);
            Fragment fragment = this.f4104c;
            View view = fragment.mView;
            if (view != null && fragment.mHidden) {
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1564i implements InterfaceC1609k {

        /* renamed from: j */
        final /* synthetic */ Fragment f4106j;

        C1564i(Fragment fragment) {
            this.f4106j = fragment;
        }

        @Override // androidx.fragment.app.InterfaceC1609k
        /* renamed from: a */
        public void mo36263a(FragmentManager fragmentManager, Fragment fragment) {
            this.f4106j.onAttachFragment(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1565j implements ActivityResultCallback<C0267a> {
        C1565j() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: b */
        public void mo36369a(C0267a c0267a) {
            C1567l pollFirst = FragmentManager.this.f4054C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f4109j;
            int i = pollFirst.f4110k;
            Fragment m36230i = FragmentManager.this.f4068c.m36230i(str);
            if (m36230i == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            m36230i.onActivityResult(i, c0267a.m40793b(), c0267a.m40794a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1566k extends ActivityResultContract<C0270c, C0267a> {
        C1566k() {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: d */
        public Intent mo33578a(Context context, C0270c c0270c) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent m40789a = c0270c.m40789a();
            if (m40789a != null && (bundleExtra = m40789a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                m40789a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (m40789a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    c0270c = new C0270c.C0272b(c0270c.m40786e()).m40782b(null).m40781c(c0270c.m40787d(), c0270c.m40788b()).m40783a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0270c);
            if (FragmentManager.m36479H0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* renamed from: e */
        public C0267a mo33577c(int i, Intent intent) {
            return new C0267a(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1569m {
        void onBackStackChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$n */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1570n {
        /* renamed from: a */
        boolean mo36332a(ArrayList<C1574a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private class C1571o implements InterfaceC1570n {

        /* renamed from: a */
        final String f4111a;

        /* renamed from: b */
        final int f4112b;

        /* renamed from: c */
        final int f4113c;

        C1571o(String str, int i, int i2) {
            this.f4111a = str;
            this.f4112b = i;
            this.f4113c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC1570n
        /* renamed from: a */
        public boolean mo36332a(ArrayList<C1574a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f4086u;
            if (fragment != null && this.f4112b < 0 && this.f4111a == null && fragment.getChildFragmentManager().m36443Z0()) {
                return false;
            }
            return FragmentManager.this.m36437b1(arrayList, arrayList2, this.f4111a, this.f4112b, this.f4113c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentManager$p */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1572p implements Fragment.OnStartEnterTransitionListener {

        /* renamed from: a */
        final boolean f4115a;

        /* renamed from: b */
        final C1574a f4116b;

        /* renamed from: c */
        private int f4117c;

        C1572p(C1574a c1574a, boolean z) {
            this.f4115a = z;
            this.f4116b = c1574a;
        }

        @Override // androidx.fragment.app.Fragment.OnStartEnterTransitionListener
        /* renamed from: a */
        public void mo36363a() {
            this.f4117c++;
        }

        @Override // androidx.fragment.app.Fragment.OnStartEnterTransitionListener
        /* renamed from: b */
        public void mo36362b() {
            int i = this.f4117c - 1;
            this.f4117c = i;
            if (i != 0) {
                return;
            }
            this.f4116b.f4149t.m36407l1();
        }

        /* renamed from: c */
        void m36361c() {
            C1574a c1574a = this.f4116b;
            c1574a.f4149t.m36385t(c1574a, this.f4115a, false, false);
        }

        /* renamed from: d */
        void m36360d() {
            boolean z;
            if (this.f4117c > 0) {
                z = true;
            } else {
                z = false;
            }
            for (Fragment fragment : this.f4116b.f4149t.m36382u0()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            C1574a c1574a = this.f4116b;
            c1574a.f4149t.m36385t(c1574a, this.f4115a, !z, true);
        }

        /* renamed from: e */
        public boolean m36359e() {
            return this.f4117c == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B0 */
    public static Fragment m36491B0(View view) {
        Object tag = view.getTag(C6859b.f19098a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0 */
    public static boolean m36479H0(int i) {
        return f4050O || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: I0 */
    private boolean m36477I0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.m36400o();
    }

    /* renamed from: L */
    private void m36472L(Fragment fragment) {
        if (fragment != null && fragment.equals(m36423g0(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* renamed from: Q0 */
    private void m36461Q0(C0626b<Fragment> c0626b) {
        int size = c0626b.size();
        for (int i = 0; i < size; i++) {
            Fragment m39500p = c0626b.m39500p(i);
            if (!m39500p.mAdded) {
                View requireView = m39500p.requireView();
                m39500p.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: S */
    private void m36458S(int i) {
        try {
            this.f4067b = true;
            this.f4068c.m36235d(i);
            m36457S0(i, false);
            if (f4051P) {
                for (AbstractC1636s abstractC1636s : m36391r()) {
                    abstractC1636s.m36160j();
                }
            }
            this.f4067b = false;
            m36441a0(true);
        } catch (Throwable th2) {
            this.f4067b = false;
            throw th2;
        }
    }

    /* renamed from: V */
    private void m36452V() {
        if (this.f4059H) {
            this.f4059H = false;
            m36389r1();
        }
    }

    /* renamed from: X */
    private void m36448X() {
        if (f4051P) {
            for (AbstractC1636s abstractC1636s : m36391r()) {
                abstractC1636s.m36160j();
            }
        } else if (!this.f4078m.isEmpty()) {
            for (Fragment fragment : this.f4078m.keySet()) {
                m36403n(fragment);
                m36455T0(fragment);
            }
        }
    }

    /* renamed from: Z */
    private void m36444Z(boolean z) {
        if (!this.f4067b) {
            if (this.f4083r == null) {
                if (this.f4058G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f4083r.m36503g().getLooper()) {
                if (!z) {
                    m36397p();
                }
                if (this.f4060I == null) {
                    this.f4060I = new ArrayList<>();
                    this.f4061J = new ArrayList<>();
                }
                this.f4067b = true;
                try {
                    m36426f0(null, null);
                    return;
                } finally {
                    this.f4067b = false;
                }
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    /* renamed from: a1 */
    private boolean m36440a1(String str, int i, int i2) {
        m36441a0(false);
        m36444Z(true);
        Fragment fragment = this.f4086u;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().m36443Z0()) {
            return true;
        }
        boolean m36437b1 = m36437b1(this.f4060I, this.f4061J, str, i, i2);
        if (m36437b1) {
            this.f4067b = true;
            try {
                m36425f1(this.f4060I, this.f4061J);
            } finally {
                m36394q();
            }
        }
        m36386s1();
        m36452V();
        this.f4068c.m36237b();
        return m36437b1;
    }

    /* renamed from: c0 */
    private static void m36435c0(ArrayList<C1574a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C1574a c1574a = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                c1574a.m36325t(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                c1574a.m36320y(z);
            } else {
                c1574a.m36325t(1);
                c1574a.m36321x();
            }
            i++;
        }
    }

    /* renamed from: c1 */
    private int m36434c1(ArrayList<C1574a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0626b<Fragment> c0626b) {
        boolean z;
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C1574a c1574a = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (c1574a.m36336E() && !c1574a.m36338C(arrayList, i4 + 1, i2)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f4063L == null) {
                    this.f4063L = new ArrayList<>();
                }
                C1572p c1572p = new C1572p(c1574a, booleanValue);
                this.f4063L.add(c1572p);
                c1574a.m36334G(c1572p);
                if (booleanValue) {
                    c1574a.m36321x();
                } else {
                    c1574a.m36320y(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, c1574a);
                }
                m36433d(c0626b);
            }
        }
        return i3;
    }

    /* renamed from: d */
    private void m36433d(C0626b<Fragment> c0626b) {
        int i = this.f4082q;
        if (i < 1) {
            return;
        }
        int min = Math.min(i, 5);
        for (Fragment fragment : this.f4068c.m36225n()) {
            if (fragment.mState < min) {
                m36453U0(fragment, min);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    c0626b.add(fragment);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01be  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m36432d0(java.util.ArrayList<androidx.fragment.app.C1574a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m36432d0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: f0 */
    private void m36426f0(ArrayList<C1574a> arrayList, ArrayList<Boolean> arrayList2) {
        int size;
        int indexOf;
        int indexOf2;
        ArrayList<C1572p> arrayList3 = this.f4063L;
        if (arrayList3 == null) {
            size = 0;
        } else {
            size = arrayList3.size();
        }
        int i = 0;
        while (i < size) {
            C1572p c1572p = this.f4063L.get(i);
            if (arrayList != null && !c1572p.f4115a && (indexOf2 = arrayList.indexOf(c1572p.f4116b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.f4063L.remove(i);
                i--;
                size--;
                c1572p.m36361c();
            } else if (c1572p.m36359e() || (arrayList != null && c1572p.f4116b.m36338C(arrayList, 0, arrayList.size()))) {
                this.f4063L.remove(i);
                i--;
                size--;
                if (arrayList != null && !c1572p.f4115a && (indexOf = arrayList.indexOf(c1572p.f4116b)) != -1 && arrayList2 != null && arrayList2.get(indexOf).booleanValue()) {
                    c1572p.m36361c();
                } else {
                    c1572p.m36360d();
                }
            }
            i++;
        }
    }

    /* renamed from: f1 */
    private void m36425f1(ArrayList<C1574a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            m36426f0(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!arrayList.get(i).f4135r) {
                    if (i2 != i) {
                        m36432d0(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (arrayList2.get(i).booleanValue()) {
                        while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f4135r) {
                            i2++;
                        }
                    }
                    m36432d0(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m36432d0(arrayList, arrayList2, i2, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    /* renamed from: h0 */
    public static <F extends Fragment> F m36420h0(View view) {
        F f = (F) m36408l0(view);
        if (f != null) {
            return f;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    /* renamed from: h1 */
    private void m36419h1() {
        if (this.f4077l != null) {
            for (int i = 0; i < this.f4077l.size(); i++) {
                this.f4077l.get(i).onBackStackChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1 */
    public static int m36413j1(int i) {
        if (i != 4097) {
            if (i != 4099) {
                return i != 8194 ? 0 : 4097;
            }
            return 4099;
        }
        return 8194;
    }

    /* renamed from: l0 */
    private static Fragment m36408l0(View view) {
        while (view != null) {
            Fragment m36491B0 = m36491B0(view);
            if (m36491B0 != null) {
                return m36491B0;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    /* renamed from: m0 */
    private void m36405m0() {
        if (f4051P) {
            for (AbstractC1636s abstractC1636s : m36391r()) {
                abstractC1636s.m36159k();
            }
        } else if (this.f4063L != null) {
            while (!this.f4063L.isEmpty()) {
                this.f4063L.remove(0).m36360d();
            }
        }
    }

    /* renamed from: n */
    private void m36403n(Fragment fragment) {
        HashSet<C1056f> hashSet = this.f4078m.get(fragment);
        if (hashSet != null) {
            Iterator<C1056f> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().m37977a();
            }
            hashSet.clear();
            m36379w(fragment);
            this.f4078m.remove(fragment);
        }
    }

    /* renamed from: n0 */
    private boolean m36402n0(ArrayList<C1574a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f4066a) {
            if (this.f4066a.isEmpty()) {
                return false;
            }
            int size = this.f4066a.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f4066a.get(i).mo36332a(arrayList, arrayList2);
            }
            this.f4066a.clear();
            this.f4083r.m36503g().removeCallbacks(this.f4065N);
            return z;
        }
    }

    /* renamed from: p */
    private void m36397p() {
        if (!m36469M0()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    /* renamed from: p0 */
    private C1607j m36396p0(Fragment fragment) {
        return this.f4064M.m36271i(fragment);
    }

    /* renamed from: p1 */
    private void m36395p1(Fragment fragment) {
        ViewGroup m36390r0 = m36390r0(fragment);
        if (m36390r0 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            int i = C6859b.f19100c;
            if (m36390r0.getTag(i) == null) {
                m36390r0.setTag(i, fragment);
            }
            ((Fragment) m36390r0.getTag(i)).setPopDirection(fragment.getPopDirection());
        }
    }

    /* renamed from: q */
    private void m36394q() {
        this.f4067b = false;
        this.f4061J.clear();
        this.f4060I.clear();
    }

    /* renamed from: r */
    private Set<AbstractC1636s> m36391r() {
        HashSet hashSet = new HashSet();
        for (C1612m c1612m : this.f4068c.m36228k()) {
            ViewGroup viewGroup = c1612m.m36250k().mContainer;
            if (viewGroup != null) {
                hashSet.add(AbstractC1636s.m36155o(viewGroup, m36493A0()));
            }
        }
        return hashSet;
    }

    /* renamed from: r0 */
    private ViewGroup m36390r0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f4084s.mo36506d()) {
            View mo36507c = this.f4084s.mo36507c(fragment.mContainerId);
            if (mo36507c instanceof ViewGroup) {
                return (ViewGroup) mo36507c;
            }
        }
        return null;
    }

    /* renamed from: r1 */
    private void m36389r1() {
        for (C1612m c1612m : this.f4068c.m36228k()) {
            m36447X0(c1612m);
        }
    }

    /* renamed from: s */
    private Set<AbstractC1636s> m36388s(ArrayList<C1574a> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<FragmentTransaction.C1573a> it = arrayList.get(i).f4120c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f4138b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(AbstractC1636s.m36156n(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* renamed from: s1 */
    private void m36386s1() {
        synchronized (this.f4066a) {
            boolean z = true;
            if (!this.f4066a.isEmpty()) {
                this.f4073h.m40812f(true);
            } else {
                this.f4073h.m40812f((m36399o0() <= 0 || !m36473K0(this.f4085t)) ? false : false);
            }
        }
    }

    /* renamed from: u */
    private void m36383u(Fragment fragment) {
        int i;
        Animator animator;
        if (fragment.mView != null) {
            C1592d.C1597d m36296c = C1592d.m36296c(this.f4083r.m36504f(), fragment, !fragment.mHidden, fragment.getPopDirection());
            if (m36296c != null && (animator = m36296c.f4220b) != null) {
                animator.setTarget(fragment.mView);
                if (fragment.mHidden) {
                    if (fragment.isHideReplaced()) {
                        fragment.setHideReplaced(false);
                    } else {
                        ViewGroup viewGroup = fragment.mContainer;
                        View view = fragment.mView;
                        viewGroup.startViewTransition(view);
                        m36296c.f4220b.addListener(new C1563h(viewGroup, view, fragment));
                    }
                } else {
                    fragment.mView.setVisibility(0);
                }
                m36296c.f4220b.start();
            } else {
                if (m36296c != null) {
                    fragment.mView.startAnimation(m36296c.f4219a);
                    m36296c.f4219a.start();
                }
                if (fragment.mHidden && !fragment.isHideReplaced()) {
                    i = 8;
                } else {
                    i = 0;
                }
                fragment.mView.setVisibility(i);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            }
        }
        m36483F0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* renamed from: w */
    private void m36379w(Fragment fragment) {
        fragment.performDestroyView();
        this.f4080o.m36277n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.mo35985n(null);
        fragment.mInLayout = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m36494A(Configuration configuration) {
        for (Fragment fragment : this.f4068c.m36225n()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A0 */
    public InterfaceC1645t m36493A0() {
        InterfaceC1645t interfaceC1645t = this.f4089x;
        if (interfaceC1645t != null) {
            return interfaceC1645t;
        }
        Fragment fragment = this.f4085t;
        if (fragment != null) {
            return fragment.mFragmentManager.m36493A0();
        }
        return this.f4090y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean m36492B(MenuItem menuItem) {
        if (this.f4082q < 1) {
            return false;
        }
        for (Fragment fragment : this.f4068c.m36225n()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m36490C() {
        this.f4056E = false;
        this.f4057F = false;
        this.f4064M.m36265o(false);
        m36458S(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C0 */
    public ViewModelStore m36489C0(Fragment fragment) {
        return this.f4064M.m36268l(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean m36488D(Menu menu, MenuInflater menuInflater) {
        if (this.f4082q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f4068c.m36225n()) {
            if (fragment != null && m36475J0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f4070e != null) {
            for (int i = 0; i < this.f4070e.size(); i++) {
                Fragment fragment2 = this.f4070e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f4070e = arrayList;
        return z;
    }

    /* renamed from: D0 */
    void m36487D0() {
        m36441a0(true);
        if (this.f4073h.m40815c()) {
            m36443Z0();
        } else {
            this.f4072g.m40830f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m36486E() {
        this.f4058G = true;
        m36441a0(true);
        m36448X();
        m36458S(-1);
        this.f4083r = null;
        this.f4084s = null;
        this.f4085t = null;
        if (this.f4072g != null) {
            this.f4073h.m40814d();
            this.f4072g = null;
        }
        ActivityResultLauncher<Intent> activityResultLauncher = this.f4091z;
        if (activityResultLauncher != null) {
            activityResultLauncher.mo36536c();
            this.f4052A.mo36536c();
            this.f4053B.mo36536c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void m36485E0(Fragment fragment) {
        if (m36479H0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            m36395p1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m36484F() {
        m36458S(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F0 */
    public void m36483F0(Fragment fragment) {
        if (fragment.mAdded && m36477I0(fragment)) {
            this.f4055D = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m36482G() {
        for (Fragment fragment : this.f4068c.m36225n()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* renamed from: G0 */
    public boolean m36481G0() {
        return this.f4058G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m36480H(boolean z) {
        for (Fragment fragment : this.f4068c.m36225n()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m36478I(Fragment fragment) {
        Iterator<InterfaceC1609k> it = this.f4081p.iterator();
        while (it.hasNext()) {
            it.next().mo36263a(this, fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean m36476J(MenuItem menuItem) {
        if (this.f4082q < 1) {
            return false;
        }
        for (Fragment fragment : this.f4068c.m36225n()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public boolean m36475J0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m36474K(Menu menu) {
        if (this.f4082q < 1) {
            return;
        }
        for (Fragment fragment : this.f4068c.m36225n()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0 */
    public boolean m36473K0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragment.equals(fragmentManager.m36372z0()) && m36473K0(fragmentManager.f4085t)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0 */
    public boolean m36471L0(int i) {
        return this.f4082q >= i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void m36470M() {
        m36458S(5);
    }

    /* renamed from: M0 */
    public boolean m36469M0() {
        return this.f4056E || this.f4057F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m36468N(boolean z) {
        for (Fragment fragment : this.f4068c.m36225n()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void m36467N0(Fragment fragment, String[] strArr, int i) {
        if (this.f4053B != null) {
            this.f4054C.addLast(new C1567l(fragment.mWho, i));
            this.f4053B.m40809a(strArr);
            return;
        }
        this.f4083r.m36500j(fragment, strArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public boolean m36466O(Menu menu) {
        boolean z = false;
        if (this.f4082q < 1) {
            return false;
        }
        for (Fragment fragment : this.f4068c.m36225n()) {
            if (fragment != null && m36475J0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void m36465O0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.f4091z != null) {
            this.f4054C.addLast(new C1567l(fragment.mWho, i));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f4091z.m40809a(intent);
            return;
        }
        this.f4083r.m36497m(fragment, intent, i, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m36464P() {
        m36386s1();
        m36472L(this.f4086u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void m36463P0(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Intent intent2;
        if (this.f4052A != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (m36479H0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            } else {
                intent2 = intent;
            }
            C0270c m40783a = new C0270c.C0272b(intentSender).m40782b(intent2).m40781c(i3, i2).m40783a();
            this.f4054C.addLast(new C1567l(fragment.mWho, i));
            if (m36479H0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.f4052A.m40809a(m40783a);
            return;
        }
        this.f4083r.m36496n(fragment, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m36462Q() {
        this.f4056E = false;
        this.f4057F = false;
        this.f4064M.m36265o(false);
        m36458S(7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m36460R() {
        this.f4056E = false;
        this.f4057F = false;
        this.f4064M.m36265o(false);
        m36458S(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void m36459R0(Fragment fragment) {
        if (!this.f4068c.m36236c(fragment.mWho)) {
            if (m36479H0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f4082q + "since it is not added to " + this);
                return;
            }
            return;
        }
        m36455T0(fragment);
        View view = fragment.mView;
        if (view != null && fragment.mIsNewlyAdded && fragment.mContainer != null) {
            float f = fragment.mPostponedAlpha;
            if (f > 0.0f) {
                view.setAlpha(f);
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            C1592d.C1597d m36296c = C1592d.m36296c(this.f4083r.m36504f(), fragment, true, fragment.getPopDirection());
            if (m36296c != null) {
                Animation animation = m36296c.f4219a;
                if (animation != null) {
                    fragment.mView.startAnimation(animation);
                } else {
                    m36296c.f4220b.setTarget(fragment.mView);
                    m36296c.f4220b.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            m36383u(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S0 */
    public void m36457S0(int i, boolean z) {
        boolean z2;
        FragmentHostCallback<?> fragmentHostCallback;
        if (this.f4083r == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z && i == this.f4082q) {
            return;
        }
        this.f4082q = i;
        if (f4051P) {
            this.f4068c.m36221r();
        } else {
            for (Fragment fragment : this.f4068c.m36225n()) {
                m36459R0(fragment);
            }
            for (C1612m c1612m : this.f4068c.m36228k()) {
                Fragment m36250k = c1612m.m36250k();
                if (!m36250k.mIsNewlyAdded) {
                    m36459R0(m36250k);
                }
                if (m36250k.mRemoving && !m36250k.isInBackStack()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.f4068c.m36222q(c1612m);
                }
            }
        }
        m36389r1();
        if (this.f4055D && (fragmentHostCallback = this.f4083r) != null && this.f4082q == 7) {
            fragmentHostCallback.mo36495o();
            this.f4055D = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m36456T() {
        this.f4057F = true;
        this.f4064M.m36265o(true);
        m36458S(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void m36455T0(Fragment fragment) {
        m36453U0(fragment, this.f4082q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m36454U() {
        m36458S(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r2 != 5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* renamed from: U0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m36453U0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m36453U0(androidx.fragment.app.Fragment, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V0 */
    public void m36451V0() {
        if (this.f4083r == null) {
            return;
        }
        this.f4056E = false;
        this.f4057F = false;
        this.f4064M.m36265o(false);
        for (Fragment fragment : this.f4068c.m36225n()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* renamed from: W */
    public void m36450W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f4068c.m36234e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f4070e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f4070e.get(i).toString());
            }
        }
        ArrayList<C1574a> arrayList2 = this.f4069d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C1574a c1574a = this.f4069d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c1574a.toString());
                c1574a.m36323v(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4074i.get());
        synchronized (this.f4066a) {
            int size3 = this.f4066a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f4066a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4083r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4084s);
        if (this.f4085t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4085t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4082q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f4056E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4057F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f4058G);
        if (this.f4055D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f4055D);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void m36449W0(FragmentContainerView fragmentContainerView) {
        View view;
        for (C1612m c1612m : this.f4068c.m36228k()) {
            Fragment m36250k = c1612m.m36250k();
            if (m36250k.mContainerId == fragmentContainerView.getId() && (view = m36250k.mView) != null && view.getParent() == null) {
                m36250k.mContainer = fragmentContainerView;
                c1612m.m36259b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X0 */
    public void m36447X0(C1612m c1612m) {
        Fragment m36250k = c1612m.m36250k();
        if (m36250k.mDeferStart) {
            if (this.f4067b) {
                this.f4059H = true;
                return;
            }
            m36250k.mDeferStart = false;
            if (f4051P) {
                c1612m.m36248m();
            } else {
                m36455T0(m36250k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m36446Y(InterfaceC1570n interfaceC1570n, boolean z) {
        if (!z) {
            if (this.f4083r == null) {
                if (this.f4058G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            m36397p();
        }
        synchronized (this.f4066a) {
            if (this.f4083r == null) {
                if (z) {
                    return;
                }
                throw new IllegalStateException("Activity has been destroyed");
            }
            this.f4066a.add(interfaceC1570n);
            m36407l1();
        }
    }

    /* renamed from: Y0 */
    public void m36445Y0(int i, int i2) {
        if (i >= 0) {
            m36446Y(new C1571o(null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: Z0 */
    public boolean m36443Z0() {
        return m36440a1(null, -1, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public boolean m36441a0(boolean z) {
        m36444Z(z);
        boolean z2 = false;
        while (m36402n0(this.f4060I, this.f4061J)) {
            z2 = true;
            this.f4067b = true;
            try {
                m36425f1(this.f4060I, this.f4061J);
            } finally {
                m36394q();
            }
        }
        m36386s1();
        m36452V();
        this.f4068c.m36237b();
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void m36438b0(InterfaceC1570n interfaceC1570n, boolean z) {
        if (z && (this.f4083r == null || this.f4058G)) {
            return;
        }
        m36444Z(z);
        if (interfaceC1570n.mo36332a(this.f4060I, this.f4061J)) {
            this.f4067b = true;
            try {
                m36425f1(this.f4060I, this.f4061J);
            } finally {
                m36394q();
            }
        }
        m36386s1();
        m36452V();
        this.f4068c.m36237b();
    }

    /* renamed from: b1 */
    boolean m36437b1(ArrayList<C1574a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C1574a> arrayList3 = this.f4069d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f4069d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str == null && i < 0) {
                i3 = -1;
            } else {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C1574a c1574a = this.f4069d.get(size2);
                    if ((str != null && str.equals(c1574a.m36340A())) || (i >= 0 && i == c1574a.f4151v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C1574a c1574a2 = this.f4069d.get(size2);
                        if (str == null || !str.equals(c1574a2.m36340A())) {
                            if (i < 0 || i != c1574a2.f4151v) {
                                break;
                            }
                        }
                    }
                }
                i3 = size2;
            }
            if (i3 == this.f4069d.size() - 1) {
                return false;
            }
            for (int size3 = this.f4069d.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f4069d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: d1 */
    void m36431d1(Fragment fragment, C1056f c1056f) {
        HashSet<C1056f> hashSet = this.f4078m.get(fragment);
        if (hashSet != null && hashSet.remove(c1056f) && hashSet.isEmpty()) {
            this.f4078m.remove(fragment);
            if (fragment.mState < 5) {
                m36379w(fragment);
                m36455T0(fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m36430e(C1574a c1574a) {
        if (this.f4069d == null) {
            this.f4069d = new ArrayList<>();
        }
        this.f4069d.add(c1574a);
    }

    /* renamed from: e0 */
    public boolean m36429e0() {
        boolean m36441a0 = m36441a0(true);
        m36405m0();
        return m36441a0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e1 */
    public void m36428e1(Fragment fragment) {
        if (m36479H0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.f4068c.m36220s(fragment);
            if (m36477I0(fragment)) {
                this.f4055D = true;
            }
            fragment.mRemoving = true;
            m36395p1(fragment);
        }
    }

    /* renamed from: f */
    void m36427f(Fragment fragment, C1056f c1056f) {
        if (this.f4078m.get(fragment) == null) {
            this.f4078m.put(fragment, new HashSet<>());
        }
        this.f4078m.get(fragment).add(c1056f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C1612m m36424g(Fragment fragment) {
        if (m36479H0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C1612m m36381v = m36381v(fragment);
        fragment.mFragmentManager = this;
        this.f4068c.m36223p(m36381v);
        if (!fragment.mDetached) {
            this.f4068c.m36238a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m36477I0(fragment)) {
                this.f4055D = true;
            }
        }
        return m36381v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public Fragment m36423g0(String str) {
        return this.f4068c.m36233f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void m36422g1(Fragment fragment) {
        this.f4064M.m36266n(fragment);
    }

    /* renamed from: h */
    public void m36421h(InterfaceC1609k interfaceC1609k) {
        this.f4081p.add(interfaceC1609k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m36418i(Fragment fragment) {
        this.f4064M.m36274f(fragment);
    }

    /* renamed from: i0 */
    public Fragment m36417i0(int i) {
        return this.f4068c.m36232g(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void m36416i1(Parcelable parcelable) {
        C1612m c1612m;
        if (parcelable == null) {
            return;
        }
        C1605i c1605i = (C1605i) parcelable;
        if (c1605i.f4233j == null) {
            return;
        }
        this.f4068c.m36219t();
        Iterator<C1610l> it = c1605i.f4233j.iterator();
        while (it.hasNext()) {
            C1610l next = it.next();
            if (next != null) {
                Fragment m36272h = this.f4064M.m36272h(next.f4250k);
                if (m36272h != null) {
                    if (m36479H0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + m36272h);
                    }
                    c1612m = new C1612m(this.f4080o, this.f4068c, m36272h, next);
                } else {
                    c1612m = new C1612m(this.f4080o, this.f4068c, this.f4083r.m36504f().getClassLoader(), m36387s0(), next);
                }
                Fragment m36250k = c1612m.m36250k();
                m36250k.mFragmentManager = this;
                if (m36479H0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + m36250k.mWho + "): " + m36250k);
                }
                c1612m.m36246o(this.f4083r.m36504f().getClassLoader());
                this.f4068c.m36223p(c1612m);
                c1612m.m36241t(this.f4082q);
            }
        }
        for (Fragment fragment : this.f4064M.m36269k()) {
            if (!this.f4068c.m36236c(fragment.mWho)) {
                if (m36479H0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + c1605i.f4233j);
                }
                this.f4064M.m36266n(fragment);
                fragment.mFragmentManager = this;
                C1612m c1612m2 = new C1612m(this.f4080o, this.f4068c, fragment);
                c1612m2.m36241t(1);
                c1612m2.m36248m();
                fragment.mRemoving = true;
                c1612m2.m36248m();
            }
        }
        this.f4068c.m36218u(c1605i.f4234k);
        if (c1605i.f4235l != null) {
            this.f4069d = new ArrayList<>(c1605i.f4235l.length);
            int i = 0;
            while (true) {
                C1575b[] c1575bArr = c1605i.f4235l;
                if (i >= c1575bArr.length) {
                    break;
                }
                C1574a m36318a = c1575bArr[i].m36318a(this);
                if (m36479H0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + m36318a.f4151v + "): " + m36318a);
                    PrintWriter printWriter = new PrintWriter(new C1635r("FragmentManager"));
                    m36318a.m36322w("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4069d.add(m36318a);
                i++;
            }
        } else {
            this.f4069d = null;
        }
        this.f4074i.set(c1605i.f4236m);
        String str = c1605i.f4237n;
        if (str != null) {
            Fragment m36423g0 = m36423g0(str);
            this.f4086u = m36423g0;
            m36472L(m36423g0);
        }
        ArrayList<String> arrayList = c1605i.f4238o;
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Bundle bundle = c1605i.f4239p.get(i2);
                bundle.setClassLoader(this.f4083r.m36504f().getClassLoader());
                this.f4075j.put(arrayList.get(i2), bundle);
            }
        }
        this.f4054C = new ArrayDeque<>(c1605i.f4240q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m36415j() {
        return this.f4074i.getAndIncrement();
    }

    /* renamed from: j0 */
    public Fragment m36414j0(String str) {
        return this.f4068c.m36231h(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: k */
    public void m36412k(FragmentHostCallback<?> fragmentHostCallback, FragmentContainer fragmentContainer, Fragment fragment) {
        String str;
        if (this.f4083r == null) {
            this.f4083r = fragmentHostCallback;
            this.f4084s = fragmentContainer;
            this.f4085t = fragment;
            if (fragment != null) {
                m36421h(new C1564i(fragment));
            } else if (fragmentHostCallback instanceof InterfaceC1609k) {
                m36421h((InterfaceC1609k) fragmentHostCallback);
            }
            if (this.f4085t != null) {
                m36386s1();
            }
            if (fragmentHostCallback instanceof InterfaceC0260k) {
                InterfaceC0260k interfaceC0260k = (InterfaceC0260k) fragmentHostCallback;
                OnBackPressedDispatcher onBackPressedDispatcher = interfaceC0260k.getOnBackPressedDispatcher();
                this.f4072g = onBackPressedDispatcher;
                LifecycleOwner lifecycleOwner = interfaceC0260k;
                if (fragment != null) {
                    lifecycleOwner = fragment;
                }
                onBackPressedDispatcher.m40834b(lifecycleOwner, this.f4073h);
            }
            if (fragment != null) {
                this.f4064M = fragment.mFragmentManager.m36396p0(fragment);
            } else if (fragmentHostCallback instanceof InterfaceC1687g0) {
                this.f4064M = C1607j.m36270j(((InterfaceC1687g0) fragmentHostCallback).getViewModelStore());
            } else {
                this.f4064M = new C1607j(false);
            }
            this.f4064M.m36265o(m36469M0());
            this.f4068c.m36215x(this.f4064M);
            FragmentHostCallback<?> fragmentHostCallback2 = this.f4083r;
            if (fragmentHostCallback2 instanceof InterfaceC0269b) {
                ActivityResultRegistry activityResultRegistry = ((InterfaceC0269b) fragmentHostCallback2).getActivityResultRegistry();
                if (fragment != null) {
                    str = fragment.mWho + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.f4091z = activityResultRegistry.m40800i(str2 + "StartActivityForResult", new C2374b(), new C1565j());
                this.f4052A = activityResultRegistry.m40800i(str2 + "StartIntentSenderForResult", new C1566k(), new C1556a());
                this.f4053B = activityResultRegistry.m40800i(str2 + "RequestPermissions", new C2372a(), new C1557b());
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public Fragment m36411k0(String str) {
        return this.f4068c.m36230i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1 */
    public Parcelable m36410k1() {
        int size;
        m36405m0();
        m36448X();
        m36441a0(true);
        this.f4056E = true;
        this.f4064M.m36265o(true);
        ArrayList<C1610l> m36217v = this.f4068c.m36217v();
        C1575b[] c1575bArr = null;
        if (m36217v.isEmpty()) {
            if (m36479H0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> m36216w = this.f4068c.m36216w();
        ArrayList<C1574a> arrayList = this.f4069d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            c1575bArr = new C1575b[size];
            for (int i = 0; i < size; i++) {
                c1575bArr[i] = new C1575b(this.f4069d.get(i));
                if (m36479H0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f4069d.get(i));
                }
            }
        }
        C1605i c1605i = new C1605i();
        c1605i.f4233j = m36217v;
        c1605i.f4234k = m36216w;
        c1605i.f4235l = c1575bArr;
        c1605i.f4236m = this.f4074i.get();
        Fragment fragment = this.f4086u;
        if (fragment != null) {
            c1605i.f4237n = fragment.mWho;
        }
        c1605i.f4238o.addAll(this.f4075j.keySet());
        c1605i.f4239p.addAll(this.f4075j.values());
        c1605i.f4240q = new ArrayList<>(this.f4054C);
        return c1605i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m36409l(Fragment fragment) {
        if (m36479H0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f4068c.m36238a(fragment);
                if (m36479H0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (m36477I0(fragment)) {
                    this.f4055D = true;
                }
            }
        }
    }

    /* renamed from: l1 */
    void m36407l1() {
        boolean z;
        synchronized (this.f4066a) {
            ArrayList<C1572p> arrayList = this.f4063L;
            boolean z2 = false;
            if (arrayList != null && !arrayList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (this.f4066a.size() == 1) {
                z2 = true;
            }
            if (z || z2) {
                this.f4083r.m36503g().removeCallbacks(this.f4065N);
                this.f4083r.m36503g().post(this.f4065N);
                m36386s1();
            }
        }
    }

    /* renamed from: m */
    public FragmentTransaction m36406m() {
        return new C1574a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m1 */
    public void m36404m1(Fragment fragment, boolean z) {
        ViewGroup m36390r0 = m36390r0(fragment);
        if (m36390r0 != null && (m36390r0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) m36390r0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n1 */
    public void m36401n1(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(m36423g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: o */
    boolean m36400o() {
        boolean z = false;
        for (Fragment fragment : this.f4068c.m36227l()) {
            if (fragment != null) {
                z = m36477I0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o0 */
    public int m36399o0() {
        ArrayList<C1574a> arrayList = this.f4069d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o1 */
    public void m36398o1(Fragment fragment) {
        if (fragment != null && (!fragment.equals(m36423g0(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f4086u;
        this.f4086u = fragment;
        m36472L(fragment2);
        m36472L(this.f4086u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public FragmentContainer m36393q0() {
        return this.f4084s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q1 */
    public void m36392q1(Fragment fragment) {
        if (m36479H0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* renamed from: s0 */
    public C1599e m36387s0() {
        C1599e c1599e = this.f4087v;
        if (c1599e != null) {
            return c1599e;
        }
        Fragment fragment = this.f4085t;
        if (fragment != null) {
            return fragment.mFragmentManager.m36387s0();
        }
        return this.f4088w;
    }

    /* renamed from: t */
    void m36385t(C1574a c1574a, boolean z, boolean z2, boolean z3) {
        if (z) {
            c1574a.m36320y(z3);
        } else {
            c1574a.m36321x();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c1574a);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.f4082q >= 1) {
            C1616o.m36212C(this.f4083r.m36504f(), this.f4084s, arrayList, arrayList2, 0, 1, true, this.f4079n);
        }
        if (z3) {
            m36457S0(this.f4082q, true);
        }
        for (Fragment fragment : this.f4068c.m36227l()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && c1574a.m36339B(fragment.mContainerId)) {
                float f = fragment.mPostponedAlpha;
                if (f > 0.0f) {
                    fragment.mView.setAlpha(f);
                }
                if (z3) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public C1615n m36384t0() {
        return this.f4068c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f4085t;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f4085t)));
            sb2.append("}");
        } else {
            FragmentHostCallback<?> fragmentHostCallback = this.f4083r;
            if (fragmentHostCallback != null) {
                sb2.append(fragmentHostCallback.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f4083r)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    /* renamed from: u0 */
    public List<Fragment> m36382u0() {
        return this.f4068c.m36225n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public C1612m m36381v(Fragment fragment) {
        C1612m m36226m = this.f4068c.m36226m(fragment.mWho);
        if (m36226m != null) {
            return m36226m;
        }
        C1612m c1612m = new C1612m(this.f4080o, this.f4068c, fragment);
        c1612m.m36246o(this.f4083r.m36504f().getClassLoader());
        c1612m.m36241t(this.f4082q);
        return c1612m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v0 */
    public FragmentHostCallback<?> m36380v0() {
        return this.f4083r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0 */
    public LayoutInflater.Factory2 m36378w0() {
        return this.f4071f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m36377x(Fragment fragment) {
        if (m36479H0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (m36479H0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f4068c.m36220s(fragment);
                if (m36477I0(fragment)) {
                    this.f4055D = true;
                }
                m36395p1(fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0 */
    public C1602g m36376x0() {
        return this.f4080o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m36375y() {
        this.f4056E = false;
        this.f4057F = false;
        this.f4064M.m36265o(false);
        m36458S(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0 */
    public Fragment m36374y0() {
        return this.f4085t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m36373z() {
        this.f4056E = false;
        this.f4057F = false;
        this.f4064M.m36265o(false);
        m36458S(0);
    }

    /* renamed from: z0 */
    public Fragment m36372z0() {
        return this.f4086u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.fragment.app.FragmentManager$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1567l implements Parcelable {
        public static final Parcelable.Creator<C1567l> CREATOR = new C1568a();

        /* renamed from: j */
        String f4109j;

        /* renamed from: k */
        int f4110k;

        /* renamed from: androidx.fragment.app.FragmentManager$l$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C1568a implements Parcelable.Creator<C1567l> {
            C1568a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1567l createFromParcel(Parcel parcel) {
                return new C1567l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C1567l[] newArray(int i) {
                return new C1567l[i];
            }
        }

        C1567l(String str, int i) {
            this.f4109j = str;
            this.f4110k = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f4109j);
            parcel.writeInt(this.f4110k);
        }

        C1567l(Parcel parcel) {
            this.f4109j = parcel.readString();
            this.f4110k = parcel.readInt();
        }
    }
}

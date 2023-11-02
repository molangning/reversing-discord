package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p018os.C1056f;
import androidx.core.view.C1365w0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p124h0.C6859b;

/* renamed from: androidx.fragment.app.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC1636s {

    /* renamed from: a */
    private final ViewGroup f4346a;

    /* renamed from: b */
    final ArrayList<C1641e> f4347b = new ArrayList<>();

    /* renamed from: c */
    final ArrayList<C1641e> f4348c = new ArrayList<>();

    /* renamed from: d */
    boolean f4349d = false;

    /* renamed from: e */
    boolean f4350e = false;

    /* renamed from: androidx.fragment.app.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1637a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C1640d f4351j;

        RunnableC1637a(C1640d c1640d) {
            AbstractC1636s.this = r1;
            this.f4351j = c1640d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC1636s.this.f4347b.contains(this.f4351j)) {
                this.f4351j.m36147e().m36139a(this.f4351j.m36146f().mView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.s$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1638b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C1640d f4353j;

        RunnableC1638b(C1640d c1640d) {
            AbstractC1636s.this = r1;
            this.f4353j = c1640d;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1636s.this.f4347b.remove(this.f4353j);
            AbstractC1636s.this.f4348c.remove(this.f4353j);
        }
    }

    /* renamed from: androidx.fragment.app.s$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static /* synthetic */ class C1639c {

        /* renamed from: a */
        static final /* synthetic */ int[] f4355a;

        /* renamed from: b */
        static final /* synthetic */ int[] f4356b;

        static {
            int[] iArr = new int[C1641e.EnumC1643b.values().length];
            f4356b = iArr;
            try {
                iArr[C1641e.EnumC1643b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4356b[C1641e.EnumC1643b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4356b[C1641e.EnumC1643b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C1641e.EnumC1644c.values().length];
            f4355a = iArr2;
            try {
                iArr2[C1641e.EnumC1644c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4355a[C1641e.EnumC1644c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4355a[C1641e.EnumC1644c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4355a[C1641e.EnumC1644c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.s$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1640d extends C1641e {

        /* renamed from: h */
        private final C1612m f4357h;

        C1640d(C1641e.EnumC1644c enumC1644c, C1641e.EnumC1643b enumC1643b, C1612m c1612m, C1056f c1056f) {
            super(enumC1644c, enumC1643b, c1612m.m36250k(), c1056f);
            this.f4357h = c1612m;
        }

        @Override // androidx.fragment.app.AbstractC1636s.C1641e
        /* renamed from: c */
        public void mo36149c() {
            super.mo36149c();
            this.f4357h.m36248m();
        }

        @Override // androidx.fragment.app.AbstractC1636s.C1641e
        /* renamed from: l */
        void mo36140l() {
            if (m36145g() == C1641e.EnumC1643b.ADDING) {
                Fragment m36250k = this.f4357h.m36250k();
                View findFocus = m36250k.mView.findFocus();
                if (findFocus != null) {
                    m36250k.setFocusedView(findFocus);
                    if (FragmentManager.m36479H0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + m36250k);
                    }
                }
                View requireView = m36146f().requireView();
                if (requireView.getParent() == null) {
                    this.f4357h.m36259b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(m36250k.getPostOnViewCreatedAlpha());
            }
        }
    }

    /* renamed from: androidx.fragment.app.s$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1641e {

        /* renamed from: a */
        private EnumC1644c f4358a;

        /* renamed from: b */
        private EnumC1643b f4359b;

        /* renamed from: c */
        private final Fragment f4360c;

        /* renamed from: d */
        private final List<Runnable> f4361d = new ArrayList();

        /* renamed from: e */
        private final HashSet<C1056f> f4362e = new HashSet<>();

        /* renamed from: f */
        private boolean f4363f = false;

        /* renamed from: g */
        private boolean f4364g = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.fragment.app.s$e$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public class C1642a implements C1056f.InterfaceC1058b {
            C1642a() {
                C1641e.this = r1;
            }

            @Override // androidx.core.p018os.C1056f.InterfaceC1058b
            public void onCancel() {
                C1641e.this.m36150b();
            }
        }

        /* renamed from: androidx.fragment.app.s$e$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public enum EnumC1643b {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.s$e$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public enum EnumC1644c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: b */
            public static EnumC1644c m36138b(int i) {
                if (i != 0) {
                    if (i != 4) {
                        if (i == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException("Unknown visibility " + i);
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            /* renamed from: c */
            public static EnumC1644c m36137c(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return m36138b(view.getVisibility());
            }

            /* renamed from: a */
            public void m36139a(View view) {
                int i = C1639c.f4355a[ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                if (FragmentManager.m36479H0(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                                }
                                view.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        if (FragmentManager.m36479H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        view.setVisibility(8);
                        return;
                    }
                    if (FragmentManager.m36479H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (FragmentManager.m36479H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        C1641e(EnumC1644c enumC1644c, EnumC1643b enumC1643b, Fragment fragment, C1056f c1056f) {
            this.f4358a = enumC1644c;
            this.f4359b = enumC1643b;
            this.f4360c = fragment;
            c1056f.m37975c(new C1642a());
        }

        /* renamed from: a */
        public final void m36151a(Runnable runnable) {
            this.f4361d.add(runnable);
        }

        /* renamed from: b */
        final void m36150b() {
            if (m36144h()) {
                return;
            }
            this.f4363f = true;
            if (this.f4362e.isEmpty()) {
                mo36149c();
                return;
            }
            Iterator it = new ArrayList(this.f4362e).iterator();
            while (it.hasNext()) {
                ((C1056f) it.next()).m37977a();
            }
        }

        /* renamed from: c */
        public void mo36149c() {
            if (this.f4364g) {
                return;
            }
            if (FragmentManager.m36479H0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4364g = true;
            for (Runnable runnable : this.f4361d) {
                runnable.run();
            }
        }

        /* renamed from: d */
        public final void m36148d(C1056f c1056f) {
            if (this.f4362e.remove(c1056f) && this.f4362e.isEmpty()) {
                mo36149c();
            }
        }

        /* renamed from: e */
        public EnumC1644c m36147e() {
            return this.f4358a;
        }

        /* renamed from: f */
        public final Fragment m36146f() {
            return this.f4360c;
        }

        /* renamed from: g */
        EnumC1643b m36145g() {
            return this.f4359b;
        }

        /* renamed from: h */
        final boolean m36144h() {
            return this.f4363f;
        }

        /* renamed from: i */
        final boolean m36143i() {
            return this.f4364g;
        }

        /* renamed from: j */
        public final void m36142j(C1056f c1056f) {
            mo36140l();
            this.f4362e.add(c1056f);
        }

        /* renamed from: k */
        final void m36141k(EnumC1644c enumC1644c, EnumC1643b enumC1643b) {
            int i = C1639c.f4356b[enumC1643b.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && this.f4358a != EnumC1644c.REMOVED) {
                        if (FragmentManager.m36479H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4360c + " mFinalState = " + this.f4358a + " -> " + enumC1644c + ". ");
                        }
                        this.f4358a = enumC1644c;
                        return;
                    }
                    return;
                }
                if (FragmentManager.m36479H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4360c + " mFinalState = " + this.f4358a + " -> REMOVED. mLifecycleImpact  = " + this.f4359b + " to REMOVING.");
                }
                this.f4358a = EnumC1644c.REMOVED;
                this.f4359b = EnumC1643b.REMOVING;
            } else if (this.f4358a == EnumC1644c.REMOVED) {
                if (FragmentManager.m36479H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4360c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f4359b + " to ADDING.");
                }
                this.f4358a = EnumC1644c.VISIBLE;
                this.f4359b = EnumC1643b.ADDING;
            }
        }

        /* renamed from: l */
        void mo36140l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f4358a + "} {mLifecycleImpact = " + this.f4359b + "} {mFragment = " + this.f4360c + "}";
        }
    }

    public AbstractC1636s(ViewGroup viewGroup) {
        this.f4346a = viewGroup;
    }

    /* renamed from: a */
    private void m36169a(C1641e.EnumC1644c enumC1644c, C1641e.EnumC1643b enumC1643b, C1612m c1612m) {
        synchronized (this.f4347b) {
            C1056f c1056f = new C1056f();
            C1641e m36162h = m36162h(c1612m.m36250k());
            if (m36162h != null) {
                m36162h.m36141k(enumC1644c, enumC1643b);
                return;
            }
            C1640d c1640d = new C1640d(enumC1644c, enumC1643b, c1612m, c1056f);
            this.f4347b.add(c1640d);
            c1640d.m36151a(new RunnableC1637a(c1640d));
            c1640d.m36151a(new RunnableC1638b(c1640d));
        }
    }

    /* renamed from: h */
    private C1641e m36162h(Fragment fragment) {
        Iterator<C1641e> it = this.f4347b.iterator();
        while (it.hasNext()) {
            C1641e next = it.next();
            if (next.m36146f().equals(fragment) && !next.m36144h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    private C1641e m36161i(Fragment fragment) {
        Iterator<C1641e> it = this.f4348c.iterator();
        while (it.hasNext()) {
            C1641e next = it.next();
            if (next.m36146f().equals(fragment) && !next.m36144h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: n */
    public static AbstractC1636s m36156n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m36155o(viewGroup, fragmentManager.m36493A0());
    }

    /* renamed from: o */
    public static AbstractC1636s m36155o(ViewGroup viewGroup, InterfaceC1645t interfaceC1645t) {
        int i = C6859b.f19099b;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof AbstractC1636s) {
            return (AbstractC1636s) tag;
        }
        AbstractC1636s mo36136a = interfaceC1645t.mo36136a(viewGroup);
        viewGroup.setTag(i, mo36136a);
        return mo36136a;
    }

    /* renamed from: q */
    private void m36153q() {
        Iterator<C1641e> it = this.f4347b.iterator();
        while (it.hasNext()) {
            C1641e next = it.next();
            if (next.m36145g() == C1641e.EnumC1643b.ADDING) {
                next.m36141k(C1641e.EnumC1644c.m36138b(next.m36146f().requireView().getVisibility()), C1641e.EnumC1643b.NONE);
            }
        }
    }

    /* renamed from: b */
    public void m36168b(C1641e.EnumC1644c enumC1644c, C1612m c1612m) {
        if (FragmentManager.m36479H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c1612m.m36250k());
        }
        m36169a(enumC1644c, C1641e.EnumC1643b.ADDING, c1612m);
    }

    /* renamed from: c */
    public void m36167c(C1612m c1612m) {
        if (FragmentManager.m36479H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c1612m.m36250k());
        }
        m36169a(C1641e.EnumC1644c.GONE, C1641e.EnumC1643b.NONE, c1612m);
    }

    /* renamed from: d */
    public void m36166d(C1612m c1612m) {
        if (FragmentManager.m36479H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c1612m.m36250k());
        }
        m36169a(C1641e.EnumC1644c.REMOVED, C1641e.EnumC1643b.REMOVING, c1612m);
    }

    /* renamed from: e */
    public void m36165e(C1612m c1612m) {
        if (FragmentManager.m36479H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c1612m.m36250k());
        }
        m36169a(C1641e.EnumC1644c.VISIBLE, C1641e.EnumC1643b.NONE, c1612m);
    }

    /* renamed from: f */
    abstract void mo36164f(List<C1641e> list, boolean z);

    /* renamed from: g */
    public void m36163g() {
        if (this.f4350e) {
            return;
        }
        if (!C1365w0.m37225T(this.f4346a)) {
            m36160j();
            this.f4349d = false;
            return;
        }
        synchronized (this.f4347b) {
            if (!this.f4347b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f4348c);
                this.f4348c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C1641e c1641e = (C1641e) it.next();
                    if (FragmentManager.m36479H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c1641e);
                    }
                    c1641e.m36150b();
                    if (!c1641e.m36143i()) {
                        this.f4348c.add(c1641e);
                    }
                }
                m36153q();
                ArrayList arrayList2 = new ArrayList(this.f4347b);
                this.f4347b.clear();
                this.f4348c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((C1641e) it2.next()).mo36140l();
                }
                mo36164f(arrayList2, this.f4349d);
                this.f4349d = false;
            }
        }
    }

    /* renamed from: j */
    public void m36160j() {
        String str;
        String str2;
        boolean m37225T = C1365w0.m37225T(this.f4346a);
        synchronized (this.f4347b) {
            m36153q();
            Iterator<C1641e> it = this.f4347b.iterator();
            while (it.hasNext()) {
                it.next().mo36140l();
            }
            Iterator it2 = new ArrayList(this.f4348c).iterator();
            while (it2.hasNext()) {
                C1641e c1641e = (C1641e) it2.next();
                if (FragmentManager.m36479H0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (m37225T) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f4346a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(c1641e);
                    Log.v("FragmentManager", sb2.toString());
                }
                c1641e.m36150b();
            }
            Iterator it3 = new ArrayList(this.f4347b).iterator();
            while (it3.hasNext()) {
                C1641e c1641e2 = (C1641e) it3.next();
                if (FragmentManager.m36479H0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (m37225T) {
                        str = "";
                    } else {
                        str = "Container " + this.f4346a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(c1641e2);
                    Log.v("FragmentManager", sb3.toString());
                }
                c1641e2.m36150b();
            }
        }
    }

    /* renamed from: k */
    public void m36159k() {
        if (this.f4350e) {
            this.f4350e = false;
            m36163g();
        }
    }

    /* renamed from: l */
    public C1641e.EnumC1643b m36158l(C1612m c1612m) {
        C1641e.EnumC1643b enumC1643b;
        C1641e m36162h = m36162h(c1612m.m36250k());
        if (m36162h != null) {
            enumC1643b = m36162h.m36145g();
        } else {
            enumC1643b = null;
        }
        C1641e m36161i = m36161i(c1612m.m36250k());
        if (m36161i != null && (enumC1643b == null || enumC1643b == C1641e.EnumC1643b.NONE)) {
            return m36161i.m36145g();
        }
        return enumC1643b;
    }

    /* renamed from: m */
    public ViewGroup m36157m() {
        return this.f4346a;
    }

    /* renamed from: p */
    public void m36154p() {
        synchronized (this.f4347b) {
            m36153q();
            this.f4350e = false;
            int size = this.f4347b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C1641e c1641e = this.f4347b.get(size);
                C1641e.EnumC1644c m36137c = C1641e.EnumC1644c.m36137c(c1641e.m36146f().mView);
                C1641e.EnumC1644c m36147e = c1641e.m36147e();
                C1641e.EnumC1644c enumC1644c = C1641e.EnumC1644c.VISIBLE;
                if (m36147e == enumC1644c && m36137c != enumC1644c) {
                    this.f4350e = c1641e.m36146f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: r */
    public void m36152r(boolean z) {
        this.f4349d = z;
    }
}
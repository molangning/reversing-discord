package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1574a extends FragmentTransaction implements FragmentManager.InterfaceC1570n {

    /* renamed from: t */
    final FragmentManager f4149t;

    /* renamed from: u */
    boolean f4150u;

    /* renamed from: v */
    int f4151v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1574a(androidx.fragment.app.FragmentManager r3) {
        /*
            r2 = this;
            androidx.fragment.app.e r0 = r3.m36387s0()
            androidx.fragment.app.FragmentHostCallback r1 = r3.m36380v0()
            if (r1 == 0) goto L17
            androidx.fragment.app.FragmentHostCallback r1 = r3.m36380v0()
            android.content.Context r1 = r1.m36504f()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L18
        L17:
            r1 = 0
        L18:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f4151v = r0
            r2.f4149t = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1574a.<init>(androidx.fragment.app.FragmentManager):void");
    }

    /* renamed from: D */
    private static boolean m36337D(FragmentTransaction.C1573a c1573a) {
        Fragment fragment = c1573a.f4138b;
        if (fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed()) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public String m36340A() {
        return this.f4128k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean m36339B(int i) {
        int i2;
        int size = this.f4120c.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.f4120c.get(i3).f4138b;
            if (fragment != null) {
                i2 = fragment.mContainerId;
            } else {
                i2 = 0;
            }
            if (i2 != 0 && i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean m36338C(ArrayList<C1574a> arrayList, int i, int i2) {
        int i3;
        int i4;
        if (i2 == i) {
            return false;
        }
        int size = this.f4120c.size();
        int i5 = -1;
        for (int i6 = 0; i6 < size; i6++) {
            Fragment fragment = this.f4120c.get(i6).f4138b;
            if (fragment != null) {
                i3 = fragment.mContainerId;
            } else {
                i3 = 0;
            }
            if (i3 != 0 && i3 != i5) {
                for (int i7 = i; i7 < i2; i7++) {
                    C1574a c1574a = arrayList.get(i7);
                    int size2 = c1574a.f4120c.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = c1574a.f4120c.get(i8).f4138b;
                        if (fragment2 != null) {
                            i4 = fragment2.mContainerId;
                        } else {
                            i4 = 0;
                        }
                        if (i4 == i3) {
                            return true;
                        }
                    }
                }
                i5 = i3;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean m36336E() {
        for (int i = 0; i < this.f4120c.size(); i++) {
            if (m36337D(this.f4120c.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public void m36335F() {
        if (this.f4136s != null) {
            for (int i = 0; i < this.f4136s.size(); i++) {
                this.f4136s.get(i).run();
            }
            this.f4136s = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m36334G(Fragment.OnStartEnterTransitionListener onStartEnterTransitionListener) {
        for (int i = 0; i < this.f4120c.size(); i++) {
            FragmentTransaction.C1573a c1573a = this.f4120c.get(i);
            if (m36337D(c1573a)) {
                c1573a.f4138b.setOnStartEnterTransitionListener(onStartEnterTransitionListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public Fragment m36333H(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f4120c.size() - 1; size >= 0; size--) {
            FragmentTransaction.C1573a c1573a = this.f4120c.get(size);
            int i = c1573a.f4137a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = c1573a.f4138b;
                            break;
                        case 10:
                            c1573a.f4144h = c1573a.f4143g;
                            break;
                    }
                }
                arrayList.add(c1573a.f4138b);
            }
            arrayList.remove(c1573a.f4138b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC1570n
    /* renamed from: a */
    public boolean mo36332a(ArrayList<C1574a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m36479H0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f4126i) {
            this.f4149t.m36430e(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: g */
    public int mo36331g() {
        return m36324u(false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: h */
    public int mo36330h() {
        return m36324u(true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: i */
    public void mo36329i() {
        m36353k();
        this.f4149t.m36438b0(this, false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: j */
    public void mo36328j() {
        m36353k();
        this.f4149t.m36438b0(this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: l */
    public void mo36327l(int i, Fragment fragment, String str, int i2) {
        super.mo36327l(i, fragment, str, i2);
        fragment.mFragmentManager = this.f4149t;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: m */
    public FragmentTransaction mo36326m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f4149t) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.mo36326m(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m36325t(int i) {
        FragmentTransaction.C1573a c1573a;
        if (!this.f4126i) {
            return;
        }
        if (FragmentManager.m36479H0(2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
        }
        int size = this.f4120c.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f4120c.get(i2).f4138b;
            if (fragment != null) {
                fragment.mBackStackNesting += i;
                if (FragmentManager.m36479H0(2)) {
                    Log.v("FragmentManager", "Bump nesting of " + c1573a.f4138b + " to " + c1573a.f4138b.mBackStackNesting);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4151v >= 0) {
            sb2.append(" #");
            sb2.append(this.f4151v);
        }
        if (this.f4128k != null) {
            sb2.append(" ");
            sb2.append(this.f4128k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: u */
    int m36324u(boolean z) {
        if (!this.f4150u) {
            if (FragmentManager.m36479H0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C1635r("FragmentManager"));
                m36323v("  ", printWriter);
                printWriter.close();
            }
            this.f4150u = true;
            if (this.f4126i) {
                this.f4151v = this.f4149t.m36415j();
            } else {
                this.f4151v = -1;
            }
            this.f4149t.m36446Y(this, z);
            return this.f4151v;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: v */
    public void m36323v(String str, PrintWriter printWriter) {
        m36322w(str, printWriter, true);
    }

    /* renamed from: w */
    public void m36322w(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4128k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4151v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4150u);
            if (this.f4125h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4125h));
            }
            if (this.f4121d != 0 || this.f4122e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4121d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4122e));
            }
            if (this.f4123f != 0 || this.f4124g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4123f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4124g));
            }
            if (this.f4129l != 0 || this.f4130m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4129l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4130m);
            }
            if (this.f4131n != 0 || this.f4132o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4131n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4132o);
            }
        }
        if (!this.f4120c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f4120c.size();
            for (int i = 0; i < size; i++) {
                FragmentTransaction.C1573a c1573a = this.f4120c.get(i);
                switch (c1573a.f4137a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + c1573a.f4137a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c1573a.f4138b);
                if (z) {
                    if (c1573a.f4139c != 0 || c1573a.f4140d != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c1573a.f4139c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c1573a.f4140d));
                    }
                    if (c1573a.f4141e != 0 || c1573a.f4142f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c1573a.f4141e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c1573a.f4142f));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m36321x() {
        int size = this.f4120c.size();
        for (int i = 0; i < size; i++) {
            FragmentTransaction.C1573a c1573a = this.f4120c.get(i);
            Fragment fragment = c1573a.f4138b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f4125h);
                fragment.setSharedElementNames(this.f4133p, this.f4134q);
            }
            switch (c1573a.f4137a) {
                case 1:
                    fragment.setAnimations(c1573a.f4139c, c1573a.f4140d, c1573a.f4141e, c1573a.f4142f);
                    this.f4149t.m36404m1(fragment, false);
                    this.f4149t.m36424g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c1573a.f4137a);
                case 3:
                    fragment.setAnimations(c1573a.f4139c, c1573a.f4140d, c1573a.f4141e, c1573a.f4142f);
                    this.f4149t.m36428e1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(c1573a.f4139c, c1573a.f4140d, c1573a.f4141e, c1573a.f4142f);
                    this.f4149t.m36485E0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(c1573a.f4139c, c1573a.f4140d, c1573a.f4141e, c1573a.f4142f);
                    this.f4149t.m36404m1(fragment, false);
                    this.f4149t.m36392q1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(c1573a.f4139c, c1573a.f4140d, c1573a.f4141e, c1573a.f4142f);
                    this.f4149t.m36377x(fragment);
                    break;
                case 7:
                    fragment.setAnimations(c1573a.f4139c, c1573a.f4140d, c1573a.f4141e, c1573a.f4142f);
                    this.f4149t.m36404m1(fragment, false);
                    this.f4149t.m36409l(fragment);
                    break;
                case 8:
                    this.f4149t.m36398o1(fragment);
                    break;
                case 9:
                    this.f4149t.m36398o1(null);
                    break;
                case 10:
                    this.f4149t.m36401n1(fragment, c1573a.f4144h);
                    break;
            }
            if (!this.f4135r && c1573a.f4137a != 1 && fragment != null && !FragmentManager.f4051P) {
                this.f4149t.m36459R0(fragment);
            }
        }
        if (!this.f4135r && !FragmentManager.f4051P) {
            FragmentManager fragmentManager = this.f4149t;
            fragmentManager.m36457S0(fragmentManager.f4082q, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m36320y(boolean z) {
        for (int size = this.f4120c.size() - 1; size >= 0; size--) {
            FragmentTransaction.C1573a c1573a = this.f4120c.get(size);
            Fragment fragment = c1573a.f4138b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.m36413j1(this.f4125h));
                fragment.setSharedElementNames(this.f4134q, this.f4133p);
            }
            switch (c1573a.f4137a) {
                case 1:
                    fragment.setAnimations(c1573a.f4139c, c1573a.f4140d, c1573a.f4141e, c1573a.f4142f);
                    this.f4149t.m36404m1(fragment, true);
                    this.f4149t.m36428e1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c1573a.f4137a);
                case 3:
                    fragment.setAnimations(c1573a.f4139c, c1573a.f4140d, c1573a.f4141e, c1573a.f4142f);
                    this.f4149t.m36424g(fragment);
                    break;
                case 4:
                    fragment.setAnimations(c1573a.f4139c, c1573a.f4140d, c1573a.f4141e, c1573a.f4142f);
                    this.f4149t.m36392q1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(c1573a.f4139c, c1573a.f4140d, c1573a.f4141e, c1573a.f4142f);
                    this.f4149t.m36404m1(fragment, true);
                    this.f4149t.m36485E0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(c1573a.f4139c, c1573a.f4140d, c1573a.f4141e, c1573a.f4142f);
                    this.f4149t.m36409l(fragment);
                    break;
                case 7:
                    fragment.setAnimations(c1573a.f4139c, c1573a.f4140d, c1573a.f4141e, c1573a.f4142f);
                    this.f4149t.m36404m1(fragment, true);
                    this.f4149t.m36377x(fragment);
                    break;
                case 8:
                    this.f4149t.m36398o1(null);
                    break;
                case 9:
                    this.f4149t.m36398o1(fragment);
                    break;
                case 10:
                    this.f4149t.m36401n1(fragment, c1573a.f4143g);
                    break;
            }
            if (!this.f4135r && c1573a.f4137a != 3 && fragment != null && !FragmentManager.f4051P) {
                this.f4149t.m36459R0(fragment);
            }
        }
        if (!this.f4135r && z && !FragmentManager.f4051P) {
            FragmentManager fragmentManager = this.f4149t;
            fragmentManager.m36457S0(fragmentManager.f4082q, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public Fragment m36319z(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f4120c.size()) {
            FragmentTransaction.C1573a c1573a = this.f4120c.get(i);
            int i2 = c1573a.f4137a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3 && i2 != 6) {
                        if (i2 != 7) {
                            if (i2 == 8) {
                                this.f4120c.add(i, new FragmentTransaction.C1573a(9, fragment2));
                                i++;
                                fragment2 = c1573a.f4138b;
                            }
                        }
                    } else {
                        arrayList.remove(c1573a.f4138b);
                        Fragment fragment3 = c1573a.f4138b;
                        if (fragment3 == fragment2) {
                            this.f4120c.add(i, new FragmentTransaction.C1573a(9, fragment3));
                            i++;
                            fragment2 = null;
                        }
                    }
                } else {
                    Fragment fragment4 = c1573a.f4138b;
                    int i3 = fragment4.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = arrayList.get(size);
                        if (fragment5.mContainerId == i3) {
                            if (fragment5 == fragment4) {
                                z = true;
                            } else {
                                if (fragment5 == fragment2) {
                                    this.f4120c.add(i, new FragmentTransaction.C1573a(9, fragment5));
                                    i++;
                                    fragment2 = null;
                                }
                                FragmentTransaction.C1573a c1573a2 = new FragmentTransaction.C1573a(3, fragment5);
                                c1573a2.f4139c = c1573a.f4139c;
                                c1573a2.f4141e = c1573a.f4141e;
                                c1573a2.f4140d = c1573a.f4140d;
                                c1573a2.f4142f = c1573a.f4142f;
                                this.f4120c.add(i, c1573a2);
                                arrayList.remove(fragment5);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f4120c.remove(i);
                        i--;
                    } else {
                        c1573a.f4137a = 1;
                        arrayList.add(fragment4);
                    }
                }
                i++;
            }
            arrayList.add(c1573a.f4138b);
            i++;
        }
        return fragment2;
    }
}

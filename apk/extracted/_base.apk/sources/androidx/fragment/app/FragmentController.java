package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.C1138f;
import androidx.lifecycle.InterfaceC1687g0;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class FragmentController {

    /* renamed from: a */
    private final FragmentHostCallback<?> f4044a;

    private FragmentController(FragmentHostCallback<?> fragmentHostCallback) {
        this.f4044a = fragmentHostCallback;
    }

    /* renamed from: b */
    public static FragmentController m36530b(FragmentHostCallback<?> fragmentHostCallback) {
        return new FragmentController((FragmentHostCallback) C1138f.m37823g(fragmentHostCallback, "callbacks == null"));
    }

    /* renamed from: a */
    public void m36531a(Fragment fragment) {
        FragmentHostCallback<?> fragmentHostCallback = this.f4044a;
        fragmentHostCallback.f4049n.m36412k(fragmentHostCallback, fragmentHostCallback, fragment);
    }

    /* renamed from: c */
    public void m36529c() {
        this.f4044a.f4049n.m36375y();
    }

    /* renamed from: d */
    public void m36528d(Configuration configuration) {
        this.f4044a.f4049n.m36494A(configuration);
    }

    /* renamed from: e */
    public boolean m36527e(MenuItem menuItem) {
        return this.f4044a.f4049n.m36492B(menuItem);
    }

    /* renamed from: f */
    public void m36526f() {
        this.f4044a.f4049n.m36490C();
    }

    /* renamed from: g */
    public boolean m36525g(Menu menu, MenuInflater menuInflater) {
        return this.f4044a.f4049n.m36488D(menu, menuInflater);
    }

    /* renamed from: h */
    public void m36524h() {
        this.f4044a.f4049n.m36486E();
    }

    /* renamed from: i */
    public void m36523i() {
        this.f4044a.f4049n.m36482G();
    }

    /* renamed from: j */
    public void m36522j(boolean z) {
        this.f4044a.f4049n.m36480H(z);
    }

    /* renamed from: k */
    public boolean m36521k(MenuItem menuItem) {
        return this.f4044a.f4049n.m36476J(menuItem);
    }

    /* renamed from: l */
    public void m36520l(Menu menu) {
        this.f4044a.f4049n.m36474K(menu);
    }

    /* renamed from: m */
    public void m36519m() {
        this.f4044a.f4049n.m36470M();
    }

    /* renamed from: n */
    public void m36518n(boolean z) {
        this.f4044a.f4049n.m36468N(z);
    }

    /* renamed from: o */
    public boolean m36517o(Menu menu) {
        return this.f4044a.f4049n.m36466O(menu);
    }

    /* renamed from: p */
    public void m36516p() {
        this.f4044a.f4049n.m36462Q();
    }

    /* renamed from: q */
    public void m36515q() {
        this.f4044a.f4049n.m36460R();
    }

    /* renamed from: r */
    public void m36514r() {
        this.f4044a.f4049n.m36456T();
    }

    /* renamed from: s */
    public boolean m36513s() {
        return this.f4044a.f4049n.m36441a0(true);
    }

    /* renamed from: t */
    public FragmentManager m36512t() {
        return this.f4044a.f4049n;
    }

    /* renamed from: u */
    public void m36511u() {
        this.f4044a.f4049n.m36451V0();
    }

    /* renamed from: v */
    public View m36510v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4044a.f4049n.m36378w0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: w */
    public void m36509w(Parcelable parcelable) {
        FragmentHostCallback<?> fragmentHostCallback = this.f4044a;
        if (fragmentHostCallback instanceof InterfaceC1687g0) {
            fragmentHostCallback.f4049n.m36416i1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: x */
    public Parcelable m36508x() {
        return this.f4044a.f4049n.m36410k1();
    }
}

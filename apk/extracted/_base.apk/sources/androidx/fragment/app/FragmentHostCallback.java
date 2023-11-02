package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.C0769b;
import androidx.core.content.C0946a;
import androidx.core.util.C1138f;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class FragmentHostCallback<E> extends FragmentContainer {

    /* renamed from: j */
    private final Activity f4045j;

    /* renamed from: k */
    private final Context f4046k;

    /* renamed from: l */
    private final Handler f4047l;

    /* renamed from: m */
    private final int f4048m;

    /* renamed from: n */
    final FragmentManager f4049n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentHostCallback(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    @Override // androidx.fragment.app.FragmentContainer
    /* renamed from: c */
    public View mo36507c(int i) {
        return null;
    }

    @Override // androidx.fragment.app.FragmentContainer
    /* renamed from: d */
    public boolean mo36506d() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Activity m36505e() {
        return this.f4045j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Context m36504f() {
        return this.f4046k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Handler m36503g() {
        return this.f4047l;
    }

    /* renamed from: h */
    public abstract E mo36502h();

    /* renamed from: i */
    public LayoutInflater mo36501i() {
        return LayoutInflater.from(this.f4046k);
    }

    @Deprecated
    /* renamed from: j */
    public void m36500j(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: k */
    public boolean mo36499k(Fragment fragment) {
        return true;
    }

    /* renamed from: l */
    public boolean mo36498l(String str) {
        return false;
    }

    /* renamed from: m */
    public void m36497m(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            C0946a.m38393k(this.f4046k, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    /* renamed from: n */
    public void m36496n(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            C0769b.m38666w(this.f4045j, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: o */
    public void mo36495o() {
    }

    FragmentHostCallback(Activity activity, Context context, Handler handler, int i) {
        this.f4049n = new C1604h();
        this.f4045j = activity;
        this.f4046k = (Context) C1138f.m37823g(context, "context == null");
        this.f4047l = (Handler) C1138f.m37823g(handler, "handler == null");
        this.f4048m = i;
    }
}

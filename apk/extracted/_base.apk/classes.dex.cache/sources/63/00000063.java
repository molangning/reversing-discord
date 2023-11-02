package p010a9;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import p029b9.C2198p;

/* renamed from: a9.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C0099e {

    /* renamed from: a */
    private final Object f442a;

    public C0099e(Activity activity) {
        C2198p.m33984k(activity, "Activity must not be null");
        this.f442a = activity;
    }

    /* renamed from: a */
    public final Activity m41151a() {
        return (Activity) this.f442a;
    }

    /* renamed from: b */
    public final FragmentActivity m41150b() {
        return (FragmentActivity) this.f442a;
    }

    /* renamed from: c */
    public final boolean m41149c() {
        return this.f442a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean m41148d() {
        return this.f442a instanceof FragmentActivity;
    }
}
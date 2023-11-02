package com.google.android.gms.nearby.messages.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import ca.C2472e;
import ca.C2474g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4616d;
import com.google.android.gms.nearby.messages.SubscribeOptions;
import p029b9.AbstractC2168g;
import p029b9.C2158d;
import p063da.AbstractBinderC5789b;
import p063da.AbstractBinderC5806s;
import p063da.C5793f;
import p119g9.C6587j;
import p385v9.BinderC13168a1;
import p385v9.BinderC13174c1;
import p385v9.BinderC13183f1;
import p385v9.C13186g1;
import p441y8.C13937h;
import p461z8.AbstractC14124f;
import p462z9.C14138a;

/* renamed from: com.google.android.gms.nearby.messages.internal.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4674b extends AbstractC2168g {

    /* renamed from: R */
    private final C13186g1 f12855R;

    /* renamed from: S */
    private final ClientAppContext f12856S;

    /* renamed from: T */
    private final int f12857T;

    @TargetApi(14)
    public C4674b(Context context, Looper looper, AbstractC14124f.InterfaceC14125a interfaceC14125a, AbstractC14124f.InterfaceC14126b interfaceC14126b, C2158d c2158d, C2472e c2472e) {
        super(context, looper, 62, c2158d, interfaceC14125a, interfaceC14126b);
        this.f12855R = new C13186g1();
        String m34068f = c2158d.m34068f();
        int m28042l0 = m28042l0(context);
        if (c2472e != null) {
            this.f12856S = new ClientAppContext(1, m34068f, null, false, m28042l0, null);
            this.f12857T = c2472e.f6821k;
        } else {
            this.f12856S = new ClientAppContext(1, m34068f, null, false, m28042l0, null);
            this.f12857T = -1;
        }
        if (m28042l0 == 1 && C6587j.m22367a()) {
            Activity activity = (Activity) context;
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Log.v("NearbyMessagesClient", String.format("Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", activity.getPackageName()));
            }
            activity.getApplication().registerActivityLifecycleCallbacks(new C4672a(activity, this, null));
        }
    }

    /* renamed from: l0 */
    public static int m28042l0(Context context) {
        if (context instanceof Activity) {
            return 1;
        }
        if (context instanceof Application) {
            return 2;
        }
        if (context instanceof Service) {
            return 3;
        }
        return 0;
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: D */
    public final String mo3016D() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: E */
    protected final String mo3015E() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: Q */
    public final boolean mo3014Q() {
        return true;
    }

    @Override // p029b9.AbstractC2150c, p461z8.C14107a.InterfaceC14116f
    /* renamed from: e */
    public final boolean mo644e() {
        return C14138a.m593b(m34075x());
    }

    /* renamed from: k0 */
    public final void m28043k0(C4616d c4616d, C4616d c4616d2) {
        C4616d.C4617a m28183b = c4616d2.m28183b();
        if (m28183b == null) {
            return;
        }
        BinderC13174c1 binderC13174c1 = new BinderC13174c1(c4616d);
        if (!this.f12855R.m3046e(m28183b)) {
            binderC13174c1.mo3058H(new Status(0));
            return;
        }
        ((C4693k0) m34112C()).m28030l0(new C4679d0((IBinder) this.f12855R.m3050a(m28183b), binderC13174c1, null));
        this.f12855R.m3047d(m28183b);
    }

    @Override // p029b9.AbstractC2150c, p461z8.C14107a.InterfaceC14116f
    /* renamed from: l */
    public final void mo639l() {
        try {
            m28041m0(2);
        } catch (RemoteException e) {
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Log.v("NearbyMessagesClient", String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", e));
            }
        }
        this.f12855R.m3049b();
        super.mo639l();
    }

    @Override // p029b9.AbstractC2150c, p461z8.C14107a.InterfaceC14116f
    /* renamed from: m */
    public final int mo638m() {
        return C13937h.f35888a;
    }

    /* renamed from: m0 */
    public final void m28041m0(int i) {
        String str;
        if (i != 1) {
            str = "CLIENT_DISCONNECTED";
        } else {
            str = "ACTIVITY_STOPPED";
        }
        if (m34094a()) {
            C4685g0 c4685g0 = new C4685g0(1, null, i);
            if (Log.isLoggable("NearbyMessagesClient", 3)) {
                Log.d("NearbyMessagesClient", String.format("Emitting client lifecycle event %s", str));
            }
            ((C4693k0) m34112C()).m28035g0(c4685g0);
        } else if (Log.isLoggable("NearbyMessagesClient", 3)) {
            Log.d("NearbyMessagesClient", String.format("Failed to emit client lifecycle event %s due to GmsClient being disconnected", str));
        }
    }

    /* renamed from: n0 */
    public final void m28040n0(C4616d c4616d, C5793f c5793f, AbstractBinderC5806s abstractBinderC5806s, C2474g c2474g, int i) {
        ((C4693k0) m34112C()).m28034h0(new C4709x(2, c5793f, c2474g.m33154b(), new BinderC13174c1(c4616d), null, null, false, abstractBinderC5806s, false, null, i));
    }

    /* renamed from: o0 */
    public final void m28039o0(C4616d c4616d, C4616d c4616d2) {
        C4616d.C4617a m28183b = c4616d2.m28183b();
        if (m28183b == null) {
            return;
        }
        if (!this.f12855R.m3046e(m28183b)) {
            this.f12855R.m3048c(m28183b, new BinderC13183f1(c4616d2));
        }
        C4711z c4711z = new C4711z(new BinderC13174c1(c4616d), (IBinder) this.f12855R.m3050a(m28183b));
        c4711z.f12925m = true;
        ((C4693k0) m34112C()).m28033i0(c4711z);
    }

    /* renamed from: p0 */
    public final void m28038p0(C4616d c4616d, C4616d c4616d2, AbstractBinderC5789b abstractBinderC5789b, SubscribeOptions subscribeOptions, byte[] bArr, int i) {
        C4616d.C4617a m28183b = c4616d2.m28183b();
        if (m28183b == null) {
            return;
        }
        if (!this.f12855R.m3046e(m28183b)) {
            this.f12855R.m3048c(m28183b, new BinderC13168a1(c4616d2));
        }
        ((C4693k0) m34112C()).m28032j0(new SubscribeRequest((IBinder) this.f12855R.m3050a(m28183b), subscribeOptions.m28050c(), new BinderC13174c1(c4616d), subscribeOptions.m28051b(), null, null, abstractBinderC5789b, false, 0, i));
    }

    /* renamed from: q0 */
    public final void m28037q0(C4616d c4616d, C5793f c5793f) {
        ((C4693k0) m34112C()).m28031k0(new C4675b0(1, c5793f, new BinderC13174c1(c4616d), null, null, false, null));
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo3013r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (queryLocalInterface instanceof C4693k0) {
            return (C4693k0) queryLocalInterface;
        }
        return new C4693k0(iBinder);
    }

    /* renamed from: r0 */
    public final void m28036r0(C4616d c4616d, C4616d c4616d2) {
        C4616d.C4617a m28183b = c4616d2.m28183b();
        if (m28183b == null) {
            return;
        }
        BinderC13174c1 binderC13174c1 = new BinderC13174c1(c4616d);
        if (!this.f12855R.m3046e(m28183b)) {
            binderC13174c1.mo3058H(new Status(0));
            return;
        }
        C4711z c4711z = new C4711z(binderC13174c1, (IBinder) this.f12855R.m3050a(m28183b));
        c4711z.f12925m = false;
        ((C4693k0) m34112C()).m28033i0(c4711z);
        this.f12855R.m3047d(m28183b);
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: z */
    public final Bundle mo3023z() {
        Bundle mo3023z = super.mo3023z();
        mo3023z.putInt("NearbyPermissions", this.f12857T);
        mo3023z.putParcelable("ClientAppContext", this.f12856S);
        return mo3023z;
    }
}
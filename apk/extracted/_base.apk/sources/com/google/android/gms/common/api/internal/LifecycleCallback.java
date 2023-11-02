package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p010a9.C0099e;
import p010a9.C0114l0;
import p010a9.FragmentC0110j0;
import p010a9.InterfaceC0101f;
import p029b9.C2198p;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class LifecycleCallback {

    /* renamed from: j */
    protected final InterfaceC0101f f12660j;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(InterfaceC0101f interfaceC0101f) {
        this.f12660j = interfaceC0101f;
    }

    /* renamed from: c */
    protected static InterfaceC0101f m28232c(C0099e c0099e) {
        if (c0099e.m41148d()) {
            return C0114l0.m41127f(c0099e.m41150b());
        }
        if (c0099e.m41149c()) {
            return FragmentC0110j0.m41134f(c0099e.m41151a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    /* renamed from: d */
    public static InterfaceC0101f m28231d(Activity activity) {
        return m28232c(new C0099e(activity));
    }

    @Keep
    private static InterfaceC0101f getChimeraLifecycleFragmentImpl(C0099e c0099e) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void m28234a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public Activity m28233b() {
        Activity mo41130c = this.f12660j.mo41130c();
        C2198p.m33985j(mo41130c);
        return mo41130c;
    }

    /* renamed from: e */
    public void mo28126e(int i, int i2, Intent intent) {
    }

    /* renamed from: f */
    public void mo28125f(Bundle bundle) {
    }

    /* renamed from: g */
    public void m28230g() {
    }

    /* renamed from: h */
    public void mo28132h() {
    }

    /* renamed from: i */
    public void mo28124i(Bundle bundle) {
    }

    /* renamed from: j */
    public void mo28123j() {
    }

    /* renamed from: k */
    public void mo28122k() {
    }
}

package com.android.installreferrer.api;

import android.content.Context;
import p358u1.C12817b;
import p358u1.InterfaceC12816a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class InstallReferrerClient {

    /* renamed from: com.android.installreferrer.api.InstallReferrerClient$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C2760b {

        /* renamed from: a */
        private final Context f7427a;

        private C2760b(Context context) {
            this.f7427a = context;
        }

        /* renamed from: a */
        public InstallReferrerClient m32439a() {
            Context context = this.f7427a;
            if (context != null) {
                return new C2761a(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    /* renamed from: c */
    public static C2760b m32440c(Context context) {
        return new C2760b(context);
    }

    /* renamed from: a */
    public abstract void mo32438a();

    /* renamed from: b */
    public abstract C12817b mo32437b();

    /* renamed from: d */
    public abstract void mo32436d(InterfaceC12816a interfaceC12816a);
}
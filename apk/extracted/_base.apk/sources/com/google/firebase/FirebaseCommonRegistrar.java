package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.List;
import p120gc.C6720c;
import p120gc.C6722e;
import p120gc.C6725h;
import p247nb.C10533d;
import p247nb.InterfaceC10545i;
import p386vb.C13234g;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FirebaseCommonRegistrar implements InterfaceC10545i {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m26445e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ String m26444f(Context context) {
        int i;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && Build.VERSION.SDK_INT >= 24) {
            i = applicationInfo.minSdkVersion;
            return String.valueOf(i);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ String m26443g(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ String m26442h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return m26441i(installerPackageName);
        }
        return "";
    }

    /* renamed from: i */
    private static String m26441i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // p247nb.InterfaceC10545i
    public List<C10533d<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C6720c.m22041c());
        arrayList.add(C13234g.m2997h());
        arrayList.add(C6725h.m22031b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C6725h.m22031b("fire-core", "20.1.0"));
        arrayList.add(C6725h.m22031b("device-name", m26441i(Build.PRODUCT)));
        arrayList.add(C6725h.m22031b("device-model", m26441i(Build.DEVICE)));
        arrayList.add(C6725h.m22031b("device-brand", m26441i(Build.BRAND)));
        arrayList.add(C6725h.m22030c("android-target-sdk", new C6725h.InterfaceC6726a() { // from class: lb.f
            @Override // p120gc.C6725h.InterfaceC6726a
            /* renamed from: a */
            public final String mo12273a(Object obj) {
                String m26445e;
                m26445e = FirebaseCommonRegistrar.m26445e((Context) obj);
                return m26445e;
            }
        }));
        arrayList.add(C6725h.m22030c("android-min-sdk", new C6725h.InterfaceC6726a() { // from class: lb.g
            @Override // p120gc.C6725h.InterfaceC6726a
            /* renamed from: a */
            public final String mo12273a(Object obj) {
                String m26444f;
                m26444f = FirebaseCommonRegistrar.m26444f((Context) obj);
                return m26444f;
            }
        }));
        arrayList.add(C6725h.m22030c("android-platform", new C6725h.InterfaceC6726a() { // from class: lb.h
            @Override // p120gc.C6725h.InterfaceC6726a
            /* renamed from: a */
            public final String mo12273a(Object obj) {
                String m26443g;
                m26443g = FirebaseCommonRegistrar.m26443g((Context) obj);
                return m26443g;
            }
        }));
        arrayList.add(C6725h.m22030c("android-installer", new C6725h.InterfaceC6726a() { // from class: lb.i
            @Override // p120gc.C6725h.InterfaceC6726a
            /* renamed from: a */
            public final String mo12273a(Object obj) {
                String m26442h;
                m26442h = FirebaseCommonRegistrar.m26442h((Context) obj);
                return m26442h;
            }
        }));
        String m22036a = C6722e.m22036a();
        if (m22036a != null) {
            arrayList.add(C6725h.m22031b("kotlin", m22036a));
        }
        return arrayList;
    }
}

package p010a9;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: a9.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC0101f {
    /* renamed from: a */
    void mo41132a(String str, LifecycleCallback lifecycleCallback);

    /* renamed from: b */
    <T extends LifecycleCallback> T mo41131b(String str, Class<T> cls);

    /* renamed from: c */
    Activity mo41130c();

    void startActivityForResult(Intent intent, int i);
}
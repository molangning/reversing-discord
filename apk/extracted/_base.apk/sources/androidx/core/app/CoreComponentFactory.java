package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class CoreComponentFactory extends AppComponentFactory {

    /* renamed from: androidx.core.app.CoreComponentFactory$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0692a {
        /* renamed from: a */
        Object m39132a();
    }

    /* renamed from: a */
    static <T> T m39133a(T t) {
        T t2;
        if ((t instanceof InterfaceC0692a) && (t2 = (T) ((InterfaceC0692a) t).m39132a()) != null) {
            return t2;
        }
        return t;
    }

    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) m39133a(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) m39133a(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) m39133a(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) m39133a(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) m39133a(super.instantiateService(classLoader, str, intent));
    }
}

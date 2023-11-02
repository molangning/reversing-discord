package androidx.lifecycle;

import android.content.Context;
import androidx.startup.C1828a;
import java.util.Collections;
import java.util.List;
import p274p0.InterfaceC11363a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC11363a<LifecycleOwner> {
    @Override // p274p0.InterfaceC11363a
    /* renamed from: a */
    public List<Class<? extends InterfaceC11363a<?>>> mo8249a() {
        return Collections.emptyList();
    }

    @Override // p274p0.InterfaceC11363a
    /* renamed from: c */
    public LifecycleOwner mo8248b(Context context) {
        if (C1828a.m35286e(context).m35284g(ProcessLifecycleInitializer.class)) {
            C1693k.m36035a(context);
            ProcessLifecycleOwner.m36086i(context);
            return ProcessLifecycleOwner.m36087h();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}

package androidx.lifecycle;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.C9612q;

/* renamed from: androidx.lifecycle.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final /* synthetic */ class C1683e0 {
    /* renamed from: a */
    public static AbstractC1681d0 m36042a(ViewModelProvider.Factory factory, Class modelClass) {
        C9612q.m13917h(modelClass, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    /* renamed from: b */
    public static AbstractC1681d0 m36041b(ViewModelProvider.Factory factory, Class modelClass, CreationExtras extras) {
        C9612q.m13917h(modelClass, "modelClass");
        C9612q.m13917h(extras, "extras");
        return factory.mo16839b(modelClass);
    }
}
package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC1687g0;
import androidx.lifecycle.LifecycleOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p205l0.C9994b;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class LoaderManager {

    /* renamed from: androidx.loader.app.LoaderManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1720a<D> {
        /* renamed from: a */
        void mo28249a(C9994b<D> c9994b, D d);

        /* renamed from: b */
        void mo28248b(C9994b<D> c9994b);

        /* renamed from: c */
        C9994b<D> mo28247c(int i, Bundle bundle);
    }

    /* renamed from: b */
    public static <T extends LifecycleOwner & InterfaceC1687g0> LoaderManager m35993b(T t) {
        return new C1721a(t, t.getViewModelStore());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo35992a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract <D> C9994b<D> mo35991c(int i, Bundle bundle, InterfaceC1720a<D> interfaceC1720a);

    /* renamed from: d */
    public abstract void mo35990d();
}
package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.SparseArrayCompat;
import androidx.core.util.C1133b;
import androidx.lifecycle.AbstractC1681d0;
import androidx.lifecycle.C1683e0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.loader.app.LoaderManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p205l0.C9994b;

/* renamed from: androidx.loader.app.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1721a extends LoaderManager {

    /* renamed from: c */
    static boolean f4534c = false;

    /* renamed from: a */
    private final LifecycleOwner f4535a;

    /* renamed from: b */
    private final C1724c f4536b;

    /* renamed from: androidx.loader.app.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1722a<D> extends MutableLiveData<D> implements C9994b.InterfaceC9995a<D> {

        /* renamed from: l */
        private final int f4537l;

        /* renamed from: m */
        private final Bundle f4538m;

        /* renamed from: n */
        private final C9994b<D> f4539n;

        /* renamed from: o */
        private LifecycleOwner f4540o;

        /* renamed from: p */
        private C1723b<D> f4541p;

        /* renamed from: q */
        private C9994b<D> f4542q;

        C1722a(int i, Bundle bundle, C9994b<D> c9994b, C9994b<D> c9994b2) {
            this.f4537l = i;
            this.f4538m = bundle;
            this.f4539n = c9994b;
            this.f4542q = c9994b2;
            c9994b.m12643q(i, this);
        }

        @Override // p205l0.C9994b.InterfaceC9995a
        /* renamed from: a */
        public void mo12637a(C9994b<D> c9994b, D d) {
            if (C1721a.f4534c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo35985n(d);
                return;
            }
            if (C1721a.f4534c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo36096l(d);
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: j */
        protected void mo35988j() {
            if (C1721a.f4534c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f4539n.m12640t();
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: k */
        protected void mo35987k() {
            if (C1721a.f4534c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f4539n.m12639u();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: m */
        public void mo35986m(Observer<? super D> observer) {
            super.mo35986m(observer);
            this.f4540o = null;
            this.f4541p = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        /* renamed from: n */
        public void mo35985n(D d) {
            super.mo35985n(d);
            C9994b<D> c9994b = this.f4542q;
            if (c9994b != null) {
                c9994b.m12642r();
                this.f4542q = null;
            }
        }

        /* renamed from: o */
        C9994b<D> m35984o(boolean z) {
            if (C1721a.f4534c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f4539n.m12657b();
            this.f4539n.m12658a();
            C1723b<D> c1723b = this.f4541p;
            if (c1723b != null) {
                mo35986m(c1723b);
                if (z) {
                    c1723b.m35976d();
                }
            }
            this.f4539n.m12638v(this);
            if ((c1723b != null && !c1723b.m35977c()) || z) {
                this.f4539n.m12642r();
                return this.f4542q;
            }
            return this.f4539n;
        }

        /* renamed from: p */
        public void m35983p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f4537l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f4538m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f4539n);
            C9994b<D> c9994b = this.f4539n;
            c9994b.mo12652g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f4541p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f4541p);
                C1723b<D> c1723b = this.f4541p;
                c1723b.m35978b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m35982q().m12655d(m36104f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m36103g());
        }

        /* renamed from: q */
        C9994b<D> m35982q() {
            return this.f4539n;
        }

        /* renamed from: r */
        void m35981r() {
            LifecycleOwner lifecycleOwner = this.f4540o;
            C1723b<D> c1723b = this.f4541p;
            if (lifecycleOwner != null && c1723b != null) {
                super.mo35986m(c1723b);
                m36102h(lifecycleOwner, c1723b);
            }
        }

        /* renamed from: s */
        C9994b<D> m35980s(LifecycleOwner lifecycleOwner, LoaderManager.InterfaceC1720a<D> interfaceC1720a) {
            C1723b<D> c1723b = new C1723b<>(this.f4539n, interfaceC1720a);
            m36102h(lifecycleOwner, c1723b);
            C1723b<D> c1723b2 = this.f4541p;
            if (c1723b2 != null) {
                mo35986m(c1723b2);
            }
            this.f4540o = lifecycleOwner;
            this.f4541p = c1723b;
            return this.f4539n;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f4537l);
            sb2.append(" : ");
            C1133b.m37836a(this.f4539n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: androidx.loader.app.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1723b<D> implements Observer<D> {

        /* renamed from: a */
        private final C9994b<D> f4543a;

        /* renamed from: b */
        private final LoaderManager.InterfaceC1720a<D> f4544b;

        /* renamed from: c */
        private boolean f4545c = false;

        C1723b(C9994b<D> c9994b, LoaderManager.InterfaceC1720a<D> interfaceC1720a) {
            this.f4543a = c9994b;
            this.f4544b = interfaceC1720a;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void mo35979a(D d) {
            if (C1721a.f4534c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f4543a + ": " + this.f4543a.m12655d(d));
            }
            this.f4544b.mo28249a(this.f4543a, d);
            this.f4545c = true;
        }

        /* renamed from: b */
        public void m35978b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f4545c);
        }

        /* renamed from: c */
        boolean m35977c() {
            return this.f4545c;
        }

        /* renamed from: d */
        void m35976d() {
            if (this.f4545c) {
                if (C1721a.f4534c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f4543a);
                }
                this.f4544b.mo28248b(this.f4543a);
            }
        }

        public String toString() {
            return this.f4544b.toString();
        }
    }

    /* renamed from: androidx.loader.app.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1724c extends AbstractC1681d0 {

        /* renamed from: f */
        private static final ViewModelProvider.Factory f4546f = new C1725a();

        /* renamed from: d */
        private SparseArrayCompat<C1722a> f4547d = new SparseArrayCompat<>();

        /* renamed from: e */
        private boolean f4548e = false;

        /* renamed from: androidx.loader.app.a$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        static class C1725a implements ViewModelProvider.Factory {
            C1725a() {
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            /* renamed from: a */
            public /* synthetic */ AbstractC1681d0 mo16840a(Class cls, CreationExtras creationExtras) {
                return C1683e0.m36041b(this, cls, creationExtras);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            /* renamed from: b */
            public <T extends AbstractC1681d0> T mo16839b(Class<T> cls) {
                return new C1724c();
            }
        }

        C1724c() {
        }

        /* renamed from: h */
        static C1724c m35972h(ViewModelStore viewModelStore) {
            return (C1724c) new ViewModelProvider(viewModelStore, f4546f).m36080a(C1724c.class);
        }

        @Override // androidx.lifecycle.AbstractC1681d0
        /* renamed from: d */
        public void mo35975d() {
            super.mo35975d();
            int m39511m = this.f4547d.m39511m();
            for (int i = 0; i < m39511m; i++) {
                this.f4547d.m39510n(i).m35984o(true);
            }
            this.f4547d.m39519c();
        }

        /* renamed from: f */
        public void m35974f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f4547d.m39511m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f4547d.m39511m(); i++) {
                    C1722a m39510n = this.f4547d.m39510n(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f4547d.m39513k(i));
                    printWriter.print(": ");
                    printWriter.println(m39510n.toString());
                    m39510n.m35983p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: g */
        void m35973g() {
            this.f4548e = false;
        }

        /* renamed from: i */
        <D> C1722a<D> m35971i(int i) {
            return this.f4547d.m39516f(i);
        }

        /* renamed from: j */
        boolean m35970j() {
            return this.f4548e;
        }

        /* renamed from: k */
        void m35969k() {
            int m39511m = this.f4547d.m39511m();
            for (int i = 0; i < m39511m; i++) {
                this.f4547d.m39510n(i).m35981r();
            }
        }

        /* renamed from: l */
        void m35968l(int i, C1722a c1722a) {
            this.f4547d.m39512l(i, c1722a);
        }

        /* renamed from: m */
        void m35967m() {
            this.f4548e = true;
        }
    }

    public C1721a(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.f4535a = lifecycleOwner;
        this.f4536b = C1724c.m35972h(viewModelStore);
    }

    /* renamed from: e */
    private <D> C9994b<D> m35989e(int i, Bundle bundle, LoaderManager.InterfaceC1720a<D> interfaceC1720a, C9994b<D> c9994b) {
        try {
            this.f4536b.m35967m();
            C9994b<D> mo28247c = interfaceC1720a.mo28247c(i, bundle);
            if (mo28247c != null) {
                if (mo28247c.getClass().isMemberClass() && !Modifier.isStatic(mo28247c.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + mo28247c);
                }
                C1722a c1722a = new C1722a(i, bundle, mo28247c, c9994b);
                if (f4534c) {
                    Log.v("LoaderManager", "  Created new loader " + c1722a);
                }
                this.f4536b.m35968l(i, c1722a);
                this.f4536b.m35973g();
                return c1722a.m35980s(this.f4535a, interfaceC1720a);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th2) {
            this.f4536b.m35973g();
            throw th2;
        }
    }

    @Override // androidx.loader.app.LoaderManager
    @Deprecated
    /* renamed from: a */
    public void mo35992a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f4536b.m35974f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.LoaderManager
    /* renamed from: c */
    public <D> C9994b<D> mo35991c(int i, Bundle bundle, LoaderManager.InterfaceC1720a<D> interfaceC1720a) {
        if (!this.f4536b.m35970j()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                C1722a<D> m35971i = this.f4536b.m35971i(i);
                if (f4534c) {
                    Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
                }
                if (m35971i == null) {
                    return m35989e(i, bundle, interfaceC1720a, null);
                }
                if (f4534c) {
                    Log.v("LoaderManager", "  Re-using existing loader " + m35971i);
                }
                return m35971i.m35980s(this.f4535a, interfaceC1720a);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // androidx.loader.app.LoaderManager
    /* renamed from: d */
    public void mo35990d() {
        this.f4536b.m35969k();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        C1133b.m37836a(this.f4535a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
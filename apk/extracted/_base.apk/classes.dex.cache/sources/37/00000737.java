package androidx.lifecycle;

import android.app.Application;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p187k0.C9034c;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0006\u001b\n\u0013B#\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017B\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u001aJ(\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0097\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0097\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, m14357d2 = {"Landroidx/lifecycle/ViewModelProvider;", "", "Landroidx/lifecycle/d0;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/d0;", "", "key", "b", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/d0;", "Landroidx/lifecycle/ViewModelStore;", "Landroidx/lifecycle/ViewModelStore;", "store", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "c", "Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultCreationExtras", "<init>", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "Landroidx/lifecycle/g0;", "owner", "(Landroidx/lifecycle/g0;Landroidx/lifecycle/ViewModelProvider$Factory;)V", "Factory", "lifecycle-viewmodel_release"}, m14356k = 1, m14355mv = {1, 6, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ViewModelProvider {

    /* renamed from: a */
    private final ViewModelStore f4475a;

    /* renamed from: b */
    private final Factory f4476b;

    /* renamed from: c */
    private final CreationExtras f4477c;

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m14357d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "", "Landroidx/lifecycle/d0;", "T", "Ljava/lang/Class;", "modelClass", "b", "(Ljava/lang/Class;)Landroidx/lifecycle/d0;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "a", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/d0;", "lifecycle-viewmodel_release"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface Factory {
        /* renamed from: a */
        <T extends AbstractC1681d0> T mo16840a(Class<T> cls, CreationExtras creationExtras);

        /* renamed from: b */
        <T extends AbstractC1681d0> T mo16839b(Class<T> cls);
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m14357d2 = {"Landroidx/lifecycle/ViewModelProvider$b;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/d0;", "T", "Ljava/lang/Class;", "modelClass", "b", "(Ljava/lang/Class;)Landroidx/lifecycle/d0;", "<init>", "()V", "a", "lifecycle-viewmodel_release"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.ViewModelProvider$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1667b implements Factory {

        /* renamed from: b */
        private static C1667b f4484b;

        /* renamed from: a */
        public static final C1668a f4483a = new C1668a(null);

        /* renamed from: c */
        public static final CreationExtras.InterfaceC1709b<String> f4485c = C1668a.C1669a.f4486a;

        @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m14357d2 = {"Landroidx/lifecycle/ViewModelProvider$b$a;", "", "Landroidx/lifecycle/ViewModelProvider$b;", "a", "()Landroidx/lifecycle/ViewModelProvider$b;", "getInstance$annotations", "()V", "instance", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "sInstance", "Landroidx/lifecycle/ViewModelProvider$b;", "<init>", "lifecycle-viewmodel_release"}, m14356k = 1, m14355mv = {1, 6, 0})
        /* renamed from: androidx.lifecycle.ViewModelProvider$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static final class C1668a {

            @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m14357d2 = {"Landroidx/lifecycle/ViewModelProvider$b$a$a;", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, m14356k = 1, m14355mv = {1, 6, 0})
            /* renamed from: androidx.lifecycle.ViewModelProvider$b$a$a */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
            private static final class C1669a implements CreationExtras.InterfaceC1709b<String> {

                /* renamed from: a */
                public static final C1669a f4486a = new C1669a();

                private C1669a() {
                }
            }

            private C1668a() {
            }

            public /* synthetic */ C1668a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C1667b m36072a() {
                if (C1667b.f4484b == null) {
                    C1667b.f4484b = new C1667b();
                }
                C1667b c1667b = C1667b.f4484b;
                C9612q.m13920e(c1667b);
                return c1667b;
            }
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* renamed from: a */
        public /* synthetic */ AbstractC1681d0 mo16840a(Class cls, CreationExtras creationExtras) {
            return C1683e0.m36041b(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* renamed from: b */
        public <T extends AbstractC1681d0> T mo16839b(Class<T> modelClass) {
            C9612q.m13917h(modelClass, "modelClass");
            try {
                T newInstance = modelClass.newInstance();
                C9612q.m13918g(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e2);
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m14357d2 = {"Landroidx/lifecycle/ViewModelProvider$c;", "", "Landroidx/lifecycle/d0;", "viewModel", "", "c", "<init>", "()V", "lifecycle-viewmodel_release"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.ViewModelProvider$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1670c {
        /* renamed from: c */
        public void mo36058c(AbstractC1681d0 viewModel) {
            C9612q.m13917h(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore store, Factory factory) {
        this(store, factory, null, 4, null);
        C9612q.m13917h(store, "store");
        C9612q.m13917h(factory, "factory");
    }

    public ViewModelProvider(ViewModelStore store, Factory factory, CreationExtras defaultCreationExtras) {
        C9612q.m13917h(store, "store");
        C9612q.m13917h(factory, "factory");
        C9612q.m13917h(defaultCreationExtras, "defaultCreationExtras");
        this.f4475a = store;
        this.f4476b = factory;
        this.f4477c = defaultCreationExtras;
    }

    /* renamed from: a */
    public <T extends AbstractC1681d0> T m36080a(Class<T> modelClass) {
        C9612q.m13917h(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) m36079b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends AbstractC1681d0> T m36079b(String key, Class<T> modelClass) {
        T t;
        C1670c c1670c;
        C9612q.m13917h(key, "key");
        C9612q.m13917h(modelClass, "modelClass");
        T viewModel = (T) this.f4475a.m36070b(key);
        if (modelClass.isInstance(viewModel)) {
            Factory factory = this.f4476b;
            if (factory instanceof C1670c) {
                c1670c = (C1670c) factory;
            } else {
                c1670c = null;
            }
            if (c1670c != null) {
                C9612q.m13918g(viewModel, "viewModel");
                c1670c.mo36058c(viewModel);
            }
            if (viewModel != null) {
                return viewModel;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        }
        C9034c c9034c = new C9034c(this.f4477c);
        c9034c.m16835c(C1667b.f4485c, key);
        try {
            t = (T) this.f4476b.mo16840a(modelClass, c9034c);
        } catch (AbstractMethodError unused) {
            t = (T) this.f4476b.mo16839b(modelClass);
        }
        this.f4475a.m36068d(key, t);
        return t;
    }

    @Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\fB\u001b\b\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\t\b\u0016¢\u0006\u0004\b\u0015\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0018J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, m14357d2 = {"Landroidx/lifecycle/ViewModelProvider$a;", "Landroidx/lifecycle/ViewModelProvider$b;", "Landroidx/lifecycle/d0;", "T", "Ljava/lang/Class;", "modelClass", "Landroid/app/Application;", "app", "g", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/d0;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "a", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/d0;", "b", "(Ljava/lang/Class;)Landroidx/lifecycle/d0;", "d", "Landroid/app/Application;", "application", "", "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "e", "lifecycle-viewmodel_release"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.ViewModelProvider$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1664a extends C1667b {

        /* renamed from: f */
        private static C1664a f4479f;

        /* renamed from: d */
        private final Application f4481d;

        /* renamed from: e */
        public static final C1665a f4478e = new C1665a(null);

        /* renamed from: g */
        public static final CreationExtras.InterfaceC1709b<Application> f4480g = C1665a.C1666a.f4482a;

        @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, m14357d2 = {"Landroidx/lifecycle/ViewModelProvider$a$a;", "", "Landroid/app/Application;", "application", "Landroidx/lifecycle/ViewModelProvider$a;", "a", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "APPLICATION_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "", "DEFAULT_KEY", "Ljava/lang/String;", "sInstance", "Landroidx/lifecycle/ViewModelProvider$a;", "<init>", "()V", "lifecycle-viewmodel_release"}, m14356k = 1, m14355mv = {1, 6, 0})
        /* renamed from: androidx.lifecycle.ViewModelProvider$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static final class C1665a {

            @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m14357d2 = {"Landroidx/lifecycle/ViewModelProvider$a$a$a;", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "Landroid/app/Application;", "<init>", "()V", "lifecycle-viewmodel_release"}, m14356k = 1, m14355mv = {1, 6, 0})
            /* renamed from: androidx.lifecycle.ViewModelProvider$a$a$a */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
            private static final class C1666a implements CreationExtras.InterfaceC1709b<Application> {

                /* renamed from: a */
                public static final C1666a f4482a = new C1666a();

                private C1666a() {
                }
            }

            private C1665a() {
            }

            public /* synthetic */ C1665a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C1664a m36075a(Application application) {
                C9612q.m13917h(application, "application");
                if (C1664a.f4479f == null) {
                    C1664a.f4479f = new C1664a(application);
                }
                C1664a c1664a = C1664a.f4479f;
                C9612q.m13920e(c1664a);
                return c1664a;
            }
        }

        private C1664a(Application application, int i) {
            this.f4481d = application;
        }

        /* renamed from: g */
        private final <T extends AbstractC1681d0> T m36076g(Class<T> cls, Application application) {
            if (C1672a.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    C9612q.m13918g(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e4);
                }
            }
            return (T) super.mo16839b(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.C1667b, androidx.lifecycle.ViewModelProvider.Factory
        /* renamed from: a */
        public <T extends AbstractC1681d0> T mo16840a(Class<T> modelClass, CreationExtras extras) {
            C9612q.m13917h(modelClass, "modelClass");
            C9612q.m13917h(extras, "extras");
            if (this.f4481d != null) {
                return (T) mo16839b(modelClass);
            }
            Application application = (Application) extras.mo16836a(f4480g);
            if (application != null) {
                return (T) m36076g(modelClass, application);
            }
            if (!C1672a.class.isAssignableFrom(modelClass)) {
                return (T) super.mo16839b(modelClass);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        @Override // androidx.lifecycle.ViewModelProvider.C1667b, androidx.lifecycle.ViewModelProvider.Factory
        /* renamed from: b */
        public <T extends AbstractC1681d0> T mo16839b(Class<T> modelClass) {
            C9612q.m13917h(modelClass, "modelClass");
            Application application = this.f4481d;
            if (application != null) {
                return (T) m36076g(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public C1664a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C1664a(Application application) {
            this(application, 0);
            C9612q.m13917h(application, "application");
        }
    }

    public /* synthetic */ ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelStore, factory, (i & 4) != 0 ? CreationExtras.C1708a.f4516b : creationExtras);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ViewModelProvider(androidx.lifecycle.InterfaceC1687g0 r3, androidx.lifecycle.ViewModelProvider.Factory r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.C9612q.m13917h(r3, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.C9612q.m13917h(r4, r0)
            androidx.lifecycle.ViewModelStore r0 = r3.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            androidx.lifecycle.viewmodel.CreationExtras r3 = androidx.lifecycle.C1685f0.m36039a(r3)
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ViewModelProvider.<init>(androidx.lifecycle.g0, androidx.lifecycle.ViewModelProvider$Factory):void");
    }
}
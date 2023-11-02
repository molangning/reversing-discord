package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p237n0.InterfaceC10480c;

@Metadata(m14358d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0017\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b%\u0010&J/\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0017R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, m14357d2 = {"Landroidx/lifecycle/b0;", "Landroidx/lifecycle/ViewModelProvider$c;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/d0;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "a", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/d0;", "", "key", "d", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/d0;", "b", "(Ljava/lang/Class;)Landroidx/lifecycle/d0;", "viewModel", "", "c", "Landroid/app/Application;", "Landroid/app/Application;", "application", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/savedstate/SavedStateRegistry;", "e", "Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Ln0/c;", "owner", "<init>", "(Landroid/app/Application;Ln0/c;Landroid/os/Bundle;)V", "lifecycle-viewmodel-savedstate_release"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: androidx.lifecycle.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1677b0 extends ViewModelProvider.C1670c implements ViewModelProvider.Factory {

    /* renamed from: a */
    private Application f4500a;

    /* renamed from: b */
    private final ViewModelProvider.Factory f4501b;

    /* renamed from: c */
    private Bundle f4502c;

    /* renamed from: d */
    private Lifecycle f4503d;

    /* renamed from: e */
    private SavedStateRegistry f4504e;

    @SuppressLint({"LambdaLast"})
    public C1677b0(Application application, InterfaceC10480c owner, Bundle bundle) {
        ViewModelProvider.C1664a c1664a;
        C9612q.m13917h(owner, "owner");
        this.f4504e = owner.getSavedStateRegistry();
        this.f4503d = owner.getLifecycle();
        this.f4502c = bundle;
        this.f4500a = application;
        if (application != null) {
            c1664a = ViewModelProvider.C1664a.f4478e.m36075a(application);
        } else {
            c1664a = new ViewModelProvider.C1664a();
        }
        this.f4501b = c1664a;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    /* renamed from: a */
    public <T extends AbstractC1681d0> T mo16840a(Class<T> modelClass, CreationExtras extras) {
        List list;
        Constructor m36048c;
        List list2;
        C9612q.m13917h(modelClass, "modelClass");
        C9612q.m13917h(extras, "extras");
        String str = (String) extras.mo16836a(ViewModelProvider.C1667b.f4485c);
        if (str != null) {
            if (extras.mo16836a(C1713y.f4525a) != null && extras.mo16836a(C1713y.f4526b) != null) {
                Application application = (Application) extras.mo16836a(ViewModelProvider.C1664a.f4480g);
                boolean isAssignableFrom = C1672a.class.isAssignableFrom(modelClass);
                if (isAssignableFrom && application != null) {
                    list2 = C1679c0.f4505a;
                    m36048c = C1679c0.m36048c(modelClass, list2);
                } else {
                    list = C1679c0.f4506b;
                    m36048c = C1679c0.m36048c(modelClass, list);
                }
                if (m36048c == null) {
                    return (T) this.f4501b.mo16840a(modelClass, extras);
                }
                if (isAssignableFrom && application != null) {
                    return (T) C1679c0.m36047d(modelClass, m36048c, application, C1713y.m36003a(extras));
                }
                return (T) C1679c0.m36047d(modelClass, m36048c, C1713y.m36003a(extras));
            } else if (this.f4503d != null) {
                return (T) m36057d(str, modelClass);
            } else {
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    /* renamed from: b */
    public <T extends AbstractC1681d0> T mo16839b(Class<T> modelClass) {
        C9612q.m13917h(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) m36057d(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.C1670c
    /* renamed from: c */
    public void mo36058c(AbstractC1681d0 viewModel) {
        C9612q.m13917h(viewModel, "viewModel");
        Lifecycle lifecycle = this.f4503d;
        if (lifecycle != null) {
            LegacySavedStateHandleController.m36135a(viewModel, this.f4504e, lifecycle);
        }
    }

    /* renamed from: d */
    public final <T extends AbstractC1681d0> T m36057d(String key, Class<T> modelClass) {
        List list;
        Constructor m36048c;
        T t;
        Application application;
        List list2;
        C9612q.m13917h(key, "key");
        C9612q.m13917h(modelClass, "modelClass");
        if (this.f4503d != null) {
            boolean isAssignableFrom = C1672a.class.isAssignableFrom(modelClass);
            if (isAssignableFrom && this.f4500a != null) {
                list2 = C1679c0.f4505a;
                m36048c = C1679c0.m36048c(modelClass, list2);
            } else {
                list = C1679c0.f4506b;
                m36048c = C1679c0.m36048c(modelClass, list);
            }
            if (m36048c == null) {
                if (this.f4500a != null) {
                    return (T) this.f4501b.mo16839b(modelClass);
                }
                return (T) ViewModelProvider.C1667b.f4483a.m36072a().mo16839b(modelClass);
            }
            SavedStateHandleController m36134b = LegacySavedStateHandleController.m36134b(this.f4504e, this.f4503d, key, this.f4502c);
            if (isAssignableFrom && (application = this.f4500a) != null) {
                C9612q.m13920e(application);
                C1711x m36082c = m36134b.m36082c();
                C9612q.m13918g(m36082c, "controller.handle");
                t = (T) C1679c0.m36047d(modelClass, m36048c, application, m36082c);
            } else {
                C1711x m36082c2 = m36134b.m36082c();
                C9612q.m13918g(m36082c2, "controller.handle");
                t = (T) C1679c0.m36047d(modelClass, m36048c, m36082c2);
            }
            t.m36043e("androidx.lifecycle.savedstate.vm.tag", m36134b);
            return t;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}

package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC1695l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p237n0.InterfaceC10480c;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\n\u0005B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, m14357d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/l;", "", "className", "", "b", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$b;", "event", "a", "Ln0/c;", "j", "Ln0/c;", "owner", "<init>", "(Ln0/c;)V", "k", "savedstate_release"}, m14356k = 1, m14355mv = {1, 6, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class Recreator implements InterfaceC1695l {

    /* renamed from: k */
    public static final C1818a f4980k = new C1818a(null);

    /* renamed from: j */
    private final InterfaceC10480c f4981j;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m14357d2 = {"Landroidx/savedstate/Recreator$a;", "", "", "CLASSES_KEY", "Ljava/lang/String;", "COMPONENT_KEY", "<init>", "()V", "savedstate_release"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: androidx.savedstate.Recreator$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1818a {
        private C1818a() {
        }

        public /* synthetic */ C1818a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000f"}, m14357d2 = {"Landroidx/savedstate/Recreator$b;", "Landroidx/savedstate/SavedStateRegistry$c;", "Landroid/os/Bundle;", "a", "", "className", "", "b", "", "Ljava/util/Set;", "classes", "Landroidx/savedstate/SavedStateRegistry;", "registry", "<init>", "(Landroidx/savedstate/SavedStateRegistry;)V", "savedstate_release"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: androidx.savedstate.Recreator$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1819b implements SavedStateRegistry.InterfaceC1822c {

        /* renamed from: a */
        private final Set<String> f4982a;

        public C1819b(SavedStateRegistry registry) {
            C9612q.m13917h(registry, "registry");
            this.f4982a = new LinkedHashSet();
            registry.m35311h("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1822c
        /* renamed from: a */
        public Bundle mo35308a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f4982a));
            return bundle;
        }

        /* renamed from: b */
        public final void m35319b(String className) {
            C9612q.m13917h(className, "className");
            this.f4982a.add(className);
        }
    }

    public Recreator(InterfaceC10480c owner) {
        C9612q.m13917h(owner, "owner");
        this.f4981j = owner;
    }

    /* renamed from: b */
    private final void m35320b(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.InterfaceC1820a.class);
            C9612q.m13918g(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    C9612q.m13918g(newInstance, "{\n                constr…wInstance()\n            }");
                    ((SavedStateRegistry.InterfaceC1820a) newInstance).mo35309a(this.f4981j);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1695l
    /* renamed from: a */
    public void mo11423a(LifecycleOwner source, Lifecycle.EnumC1651b event) {
        C9612q.m13917h(source, "source");
        C9612q.m13917h(event, "event");
        if (event == Lifecycle.EnumC1651b.ON_CREATE) {
            source.getLifecycle().mo36123c(this);
            Bundle m35317b = this.f4981j.getSavedStateRegistry().m35317b("androidx.savedstate.Restarter");
            if (m35317b == null) {
                return;
            }
            ArrayList<String> stringArrayList = m35317b.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    m35320b(str);
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}

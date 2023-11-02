package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;
import p237n0.InterfaceC10480c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class LegacySavedStateHandleController {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.LegacySavedStateHandleController$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1649a implements SavedStateRegistry.InterfaceC1820a {
        C1649a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1820a
        /* renamed from: a */
        public void mo35309a(InterfaceC10480c interfaceC10480c) {
            if (interfaceC10480c instanceof InterfaceC1687g0) {
                ViewModelStore viewModelStore = ((InterfaceC1687g0) interfaceC10480c).getViewModelStore();
                SavedStateRegistry savedStateRegistry = interfaceC10480c.getSavedStateRegistry();
                for (String str : viewModelStore.m36069c()) {
                    LegacySavedStateHandleController.m36135a(viewModelStore.m36070b(str), savedStateRegistry, interfaceC10480c.getLifecycle());
                }
                if (!viewModelStore.m36069c().isEmpty()) {
                    savedStateRegistry.m35310i(C1649a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m36135a(AbstractC1681d0 abstractC1681d0, SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) abstractC1681d0.m36044c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.m36081d()) {
            savedStateHandleController.m36083b(savedStateRegistry, lifecycle);
            m36133c(savedStateRegistry, lifecycle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static SavedStateHandleController m36134b(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C1711x.m36009c(savedStateRegistry.m35317b(str), bundle));
        savedStateHandleController.m36083b(savedStateRegistry, lifecycle);
        m36133c(savedStateRegistry, lifecycle);
        return savedStateHandleController;
    }

    /* renamed from: c */
    private static void m36133c(final SavedStateRegistry savedStateRegistry, final Lifecycle lifecycle) {
        Lifecycle.State mo36124b = lifecycle.mo36124b();
        if (mo36124b != Lifecycle.State.INITIALIZED && !mo36124b.m36132a(Lifecycle.State.STARTED)) {
            lifecycle.mo36125a(new InterfaceC1695l() { // from class: androidx.lifecycle.LegacySavedStateHandleController.1
                @Override // androidx.lifecycle.InterfaceC1695l
                /* renamed from: a */
                public void mo11423a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
                    if (enumC1651b == Lifecycle.EnumC1651b.ON_START) {
                        Lifecycle.this.mo36123c(this);
                        savedStateRegistry.m35310i(C1649a.class);
                    }
                }
            });
        } else {
            savedStateRegistry.m35310i(C1649a.class);
        }
    }
}

package androidx.lifecycle;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public interface DefaultLifecycleObserver extends InterfaceC1682e {
    @Override // androidx.lifecycle.InterfaceC1682e
    void onCreate(LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.InterfaceC1682e
    void onDestroy(LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.InterfaceC1682e
    void onPause(LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.InterfaceC1682e
    void onResume(LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.InterfaceC1682e
    void onStart(LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.InterfaceC1682e
    void onStop(LifecycleOwner lifecycleOwner);
}

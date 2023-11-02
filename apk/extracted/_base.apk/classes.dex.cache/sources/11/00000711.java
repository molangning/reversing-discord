package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class FullLifecycleObserverAdapter implements InterfaceC1695l {

    /* renamed from: j */
    private final InterfaceC1682e f4376j;

    /* renamed from: k */
    private final InterfaceC1695l f4377k;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static /* synthetic */ class C1647a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4378a;

        static {
            int[] iArr = new int[Lifecycle.EnumC1651b.values().length];
            f4378a = iArr;
            try {
                iArr[Lifecycle.EnumC1651b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4378a[Lifecycle.EnumC1651b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4378a[Lifecycle.EnumC1651b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4378a[Lifecycle.EnumC1651b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4378a[Lifecycle.EnumC1651b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4378a[Lifecycle.EnumC1651b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4378a[Lifecycle.EnumC1651b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(InterfaceC1682e interfaceC1682e, InterfaceC1695l interfaceC1695l) {
        this.f4376j = interfaceC1682e;
        this.f4377k = interfaceC1695l;
    }

    @Override // androidx.lifecycle.InterfaceC1695l
    /* renamed from: a */
    public void mo11423a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
        switch (C1647a.f4378a[enumC1651b.ordinal()]) {
            case 1:
                this.f4376j.onCreate(lifecycleOwner);
                break;
            case 2:
                this.f4376j.onStart(lifecycleOwner);
                break;
            case 3:
                this.f4376j.onResume(lifecycleOwner);
                break;
            case 4:
                this.f4376j.onPause(lifecycleOwner);
                break;
            case 5:
                this.f4376j.onStop(lifecycleOwner);
                break;
            case 6:
                this.f4376j.onDestroy(lifecycleOwner);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1695l interfaceC1695l = this.f4377k;
        if (interfaceC1695l != null) {
            interfaceC1695l.mo11423a(lifecycleOwner, enumC1651b);
        }
    }
}
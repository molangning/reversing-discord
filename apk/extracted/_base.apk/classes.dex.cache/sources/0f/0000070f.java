package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class CompositeGeneratedAdaptersObserver implements InterfaceC1695l {

    /* renamed from: j */
    private final InterfaceC1684f[] f4375j;

    public CompositeGeneratedAdaptersObserver(InterfaceC1684f[] interfaceC1684fArr) {
        this.f4375j = interfaceC1684fArr;
    }

    @Override // androidx.lifecycle.InterfaceC1695l
    /* renamed from: a */
    public void mo11423a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
        C1702s c1702s = new C1702s();
        for (InterfaceC1684f interfaceC1684f : this.f4375j) {
            interfaceC1684f.m36040a(lifecycleOwner, enumC1651b, false, c1702s);
        }
        for (InterfaceC1684f interfaceC1684f2 : this.f4375j) {
            interfaceC1684f2.m36040a(lifecycleOwner, enumC1651b, true, c1702s);
        }
    }
}
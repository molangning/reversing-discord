package p240n3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p414x2.C13677a;

/* renamed from: n3.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10491a implements InterfaceC10492b {

    /* renamed from: a */
    private final List<InterfaceC10492b> f27379a;

    public C10491a(InterfaceC10492b... interfaceC10492bArr) {
        ArrayList arrayList = new ArrayList(interfaceC10492bArr.length);
        this.f27379a = arrayList;
        Collections.addAll(arrayList, interfaceC10492bArr);
    }

    @Override // p240n3.InterfaceC10492b
    /* renamed from: a */
    public synchronized void mo9414a(String str, int i, boolean z, String str2) {
        int size = this.f27379a.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC10492b interfaceC10492b = this.f27379a.get(i2);
            if (interfaceC10492b != null) {
                try {
                    interfaceC10492b.mo9414a(str, i, z, str2);
                } catch (Exception e) {
                    C13677a.m1853k("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", e);
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized void m11399b(InterfaceC10492b interfaceC10492b) {
        this.f27379a.add(interfaceC10492b);
    }

    /* renamed from: c */
    public synchronized void m11398c(InterfaceC10492b interfaceC10492b) {
        this.f27379a.remove(interfaceC10492b);
    }
}

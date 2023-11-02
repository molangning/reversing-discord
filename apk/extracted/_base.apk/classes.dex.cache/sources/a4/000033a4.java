package p114g4;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p114g4.InterfaceC6545b;

/* renamed from: g4.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6548d<I> extends C6544a<I> {

    /* renamed from: k */
    private final List<InterfaceC6545b<I>> f18591k = new ArrayList(2);

    /* renamed from: q */
    private synchronized void m22418q(String str, Throwable th2) {
        Log.e("FwdControllerListener2", str, th2);
    }

    @Override // p114g4.C6544a, p114g4.InterfaceC6545b
    /* renamed from: h */
    public void mo9423h(String str, I i, InterfaceC6545b.C6546a c6546a) {
        int size = this.f18591k.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                InterfaceC6545b<I> interfaceC6545b = this.f18591k.get(i2);
                if (interfaceC6545b != null) {
                    interfaceC6545b.mo9423h(str, i, c6546a);
                }
            } catch (Exception e) {
                m22418q("ForwardingControllerListener2 exception in onFinalImageSet", e);
            }
        }
    }

    @Override // p114g4.C6544a, p114g4.InterfaceC6545b
    /* renamed from: i */
    public void mo9422i(String str, Throwable th2, InterfaceC6545b.C6546a c6546a) {
        int size = this.f18591k.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC6545b<I> interfaceC6545b = this.f18591k.get(i);
                if (interfaceC6545b != null) {
                    interfaceC6545b.mo9422i(str, th2, c6546a);
                }
            } catch (Exception e) {
                m22418q("ForwardingControllerListener2 exception in onFailure", e);
            }
        }
    }

    @Override // p114g4.C6544a, p114g4.InterfaceC6545b
    /* renamed from: j */
    public void mo9421j(String str, Object obj, InterfaceC6545b.C6546a c6546a) {
        int size = this.f18591k.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC6545b<I> interfaceC6545b = this.f18591k.get(i);
                if (interfaceC6545b != null) {
                    interfaceC6545b.mo9421j(str, obj, c6546a);
                }
            } catch (Exception e) {
                m22418q("ForwardingControllerListener2 exception in onSubmit", e);
            }
        }
    }

    @Override // p114g4.C6544a, p114g4.InterfaceC6545b
    /* renamed from: m */
    public void mo9420m(String str, InterfaceC6545b.C6546a c6546a) {
        int size = this.f18591k.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC6545b<I> interfaceC6545b = this.f18591k.get(i);
                if (interfaceC6545b != null) {
                    interfaceC6545b.mo9420m(str, c6546a);
                }
            } catch (Exception e) {
                m22418q("ForwardingControllerListener2 exception in onRelease", e);
            }
        }
    }

    /* renamed from: o */
    public synchronized void m22419o(InterfaceC6545b<I> interfaceC6545b) {
        this.f18591k.add(interfaceC6545b);
    }

    /* renamed from: s */
    public synchronized void m22417s(InterfaceC6545b<I> interfaceC6545b) {
        int indexOf = this.f18591k.indexOf(interfaceC6545b);
        if (indexOf != -1) {
            this.f18591k.remove(indexOf);
        }
    }
}
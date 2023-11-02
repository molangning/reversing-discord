package p139hf;

import cf.C2528b;
import java.util.concurrent.Callable;
import lk.InterfaceC10219a;
import lk.InterfaceC10220b;
import nf.C10859a;
import p067df.InterfaceC5833d;
import p106ff.C6421b;
import p217lf.C10142d;
import p217lf.EnumC10141c;
import ye.AbstractC14010b;

/* renamed from: hf.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7123k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hf.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7124a<T, R> extends AbstractC14010b<R> {

        /* renamed from: k */
        final T f19477k;

        /* renamed from: l */
        final InterfaceC5833d<? super T, ? extends InterfaceC10219a<? extends R>> f19478l;

        C7124a(T t, InterfaceC5833d<? super T, ? extends InterfaceC10219a<? extends R>> interfaceC5833d) {
            this.f19477k = t;
            this.f19478l = interfaceC5833d;
        }

        @Override // ye.AbstractC14010b
        /* renamed from: t */
        public void mo909t(InterfaceC10220b<? super R> interfaceC10220b) {
            try {
                InterfaceC10219a interfaceC10219a = (InterfaceC10219a) C6421b.m22784c(this.f19478l.apply((T) this.f19477k), "The mapper returned a null Publisher");
                if (interfaceC10219a instanceof Callable) {
                    try {
                        Object call = ((Callable) interfaceC10219a).call();
                        if (call == null) {
                            EnumC10141c.m12186a(interfaceC10220b);
                            return;
                        } else {
                            interfaceC10220b.mo905a(new C10142d(interfaceC10220b, call));
                            return;
                        }
                    } catch (Throwable th2) {
                        C2528b.m33061b(th2);
                        EnumC10141c.m12185b(th2, interfaceC10220b);
                        return;
                    }
                }
                interfaceC10219a.mo928a(interfaceC10220b);
            } catch (Throwable th3) {
                EnumC10141c.m12185b(th3, interfaceC10220b);
            }
        }
    }

    /* renamed from: a */
    public static <T, U> AbstractC14010b<U> m21389a(T t, InterfaceC5833d<? super T, ? extends InterfaceC10219a<? extends U>> interfaceC5833d) {
        return C10859a.m9888i(new C7124a(t, interfaceC5833d));
    }

    /* renamed from: b */
    public static <T, R> boolean m21388b(InterfaceC10219a<T> interfaceC10219a, InterfaceC10220b<? super R> interfaceC10220b, InterfaceC5833d<? super T, ? extends InterfaceC10219a<? extends R>> interfaceC5833d) {
        if (interfaceC10219a instanceof Callable) {
            try {
                Object obj = (Object) ((Callable) interfaceC10219a).call();
                if (obj == 0) {
                    EnumC10141c.m12186a(interfaceC10220b);
                    return true;
                }
                try {
                    InterfaceC10219a interfaceC10219a2 = (InterfaceC10219a) C6421b.m22784c(interfaceC5833d.apply(obj), "The mapper returned a null Publisher");
                    if (interfaceC10219a2 instanceof Callable) {
                        try {
                            Object call = ((Callable) interfaceC10219a2).call();
                            if (call == null) {
                                EnumC10141c.m12186a(interfaceC10220b);
                                return true;
                            }
                            interfaceC10220b.mo905a(new C10142d(interfaceC10220b, call));
                        } catch (Throwable th2) {
                            C2528b.m33061b(th2);
                            EnumC10141c.m12185b(th2, interfaceC10220b);
                            return true;
                        }
                    } else {
                        interfaceC10219a2.mo928a(interfaceC10220b);
                    }
                    return true;
                } catch (Throwable th3) {
                    C2528b.m33061b(th3);
                    EnumC10141c.m12185b(th3, interfaceC10220b);
                    return true;
                }
            } catch (Throwable th4) {
                C2528b.m33061b(th4);
                EnumC10141c.m12185b(th4, interfaceC10220b);
                return true;
            }
        }
        return false;
    }
}

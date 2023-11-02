package p217lf;

import androidx.lifecycle.C1696m;
import cf.C2531e;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lk.InterfaceC10221c;
import nf.C10859a;
import p106ff.C6421b;
import p233mf.C10448b;

/* renamed from: lf.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC10143e implements InterfaceC10221c {
    CANCELLED;

    /* renamed from: a */
    public static boolean m12183a(AtomicReference<InterfaceC10221c> atomicReference) {
        InterfaceC10221c andSet;
        InterfaceC10221c interfaceC10221c = atomicReference.get();
        EnumC10143e enumC10143e = CANCELLED;
        if (interfaceC10221c != enumC10143e && (andSet = atomicReference.getAndSet(enumC10143e)) != enumC10143e) {
            if (andSet != null) {
                andSet.cancel();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m12182b(AtomicReference<InterfaceC10221c> atomicReference, AtomicLong atomicLong, long j) {
        InterfaceC10221c interfaceC10221c = atomicReference.get();
        if (interfaceC10221c != null) {
            interfaceC10221c.mo12120g(j);
        } else if (m12178f(j)) {
            C10448b.m11528a(atomicLong, j);
            InterfaceC10221c interfaceC10221c2 = atomicReference.get();
            if (interfaceC10221c2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    interfaceC10221c2.mo12120g(andSet);
                }
            }
        }
    }

    /* renamed from: c */
    public static boolean m12181c(AtomicReference<InterfaceC10221c> atomicReference, AtomicLong atomicLong, InterfaceC10221c interfaceC10221c) {
        if (m12179e(atomicReference, interfaceC10221c)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                interfaceC10221c.mo12120g(andSet);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static void m12180d() {
        C10859a.m9887j(new C2531e("Subscription already set!"));
    }

    /* renamed from: e */
    public static boolean m12179e(AtomicReference<InterfaceC10221c> atomicReference, InterfaceC10221c interfaceC10221c) {
        C6421b.m22784c(interfaceC10221c, "s is null");
        if (!C1696m.m36034a(atomicReference, null, interfaceC10221c)) {
            interfaceC10221c.cancel();
            if (atomicReference.get() != CANCELLED) {
                m12180d();
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m12178f(long j) {
        if (j <= 0) {
            C10859a.m9887j(new IllegalArgumentException("n > 0 required but it was " + j));
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m12177h(InterfaceC10221c interfaceC10221c, InterfaceC10221c interfaceC10221c2) {
        if (interfaceC10221c2 == null) {
            C10859a.m9887j(new NullPointerException("next is null"));
            return false;
        } else if (interfaceC10221c != null) {
            interfaceC10221c2.cancel();
            m12180d();
            return false;
        } else {
            return true;
        }
    }

    @Override // lk.InterfaceC10221c
    public void cancel() {
    }

    @Override // lk.InterfaceC10221c
    /* renamed from: g */
    public void mo12120g(long j) {
    }
}

package th;

import java.util.Comparator;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11944l;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11998y;

/* renamed from: th.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12763h implements Comparator<InterfaceC11947m> {

    /* renamed from: j */
    public static final C12763h f33111j = new C12763h();

    private C12763h() {
    }

    /* renamed from: c */
    private static Integer m4079c(InterfaceC11947m interfaceC11947m, InterfaceC11947m interfaceC11947m2) {
        int m4078f = m4078f(interfaceC11947m2) - m4078f(interfaceC11947m);
        if (m4078f != 0) {
            return Integer.valueOf(m4078f);
        }
        if (C12758e.m4123B(interfaceC11947m) && C12758e.m4123B(interfaceC11947m2)) {
            return 0;
        }
        int compareTo = interfaceC11947m.getName().compareTo(interfaceC11947m2.getName());
        if (compareTo != 0) {
            return Integer.valueOf(compareTo);
        }
        return null;
    }

    /* renamed from: f */
    private static int m4078f(InterfaceC11947m interfaceC11947m) {
        if (C12758e.m4123B(interfaceC11947m)) {
            return 8;
        }
        if (interfaceC11947m instanceof InterfaceC11944l) {
            return 7;
        }
        if (interfaceC11947m instanceof InterfaceC11989u0) {
            if (((InterfaceC11989u0) interfaceC11947m).mo4329M() == null) {
                return 6;
            }
            return 5;
        } else if (interfaceC11947m instanceof InterfaceC11998y) {
            if (((InterfaceC11998y) interfaceC11947m).mo4329M() == null) {
                return 4;
            }
            return 3;
        } else if (interfaceC11947m instanceof InterfaceC11914e) {
            return 2;
        } else {
            if (interfaceC11947m instanceof InterfaceC11917e1) {
                return 1;
            }
            return 0;
        }
    }

    @Override // java.util.Comparator
    /* renamed from: b */
    public int compare(InterfaceC11947m interfaceC11947m, InterfaceC11947m interfaceC11947m2) {
        Integer m4079c = m4079c(interfaceC11947m, interfaceC11947m2);
        if (m4079c != null) {
            return m4079c.intValue();
        }
        return 0;
    }
}
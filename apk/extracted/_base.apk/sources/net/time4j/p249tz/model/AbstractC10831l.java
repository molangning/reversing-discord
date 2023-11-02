package net.time4j.p249tz.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.time4j.base.C10615b;
import net.time4j.base.C10616c;
import net.time4j.base.InterfaceC10614a;
import net.time4j.base.InterfaceC10621g;
import net.time4j.p249tz.C10835p;
import net.time4j.p249tz.C10836q;
import net.time4j.p249tz.InterfaceC10815m;
import p162ij.EnumC7627a0;

/* renamed from: net.time4j.tz.model.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public abstract class AbstractC10831l implements InterfaceC10815m, Serializable {

    /* renamed from: j */
    static final String f28283j = System.getProperty("line.separator");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static long m10046f(int i) {
        return (System.currentTimeMillis() / 1000) + ((long) (i * 3.1556952E7d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static InterfaceC10815m m10045g(C10835p c10835p, List<C10836q> list, List<AbstractC10819d> list2, boolean z, boolean z2) {
        ArrayList arrayList;
        List<AbstractC10819d> list3;
        if (z) {
            ArrayList arrayList2 = new ArrayList(list);
            list3 = new ArrayList<>(list2);
            Collections.sort(arrayList2);
            Collections.sort(list3, EnumC10830k.INSTANCE);
            arrayList = arrayList2;
        } else {
            arrayList = list;
            list3 = list2;
        }
        int size = arrayList.size();
        if (size == 0) {
            if (list3.isEmpty()) {
                return new C10820e(c10835p);
            }
            return new C10828j(c10835p, list3, false);
        }
        C10835p m10020q = C10835p.m10020q(arrayList.get(0).m10011f());
        if (z2 && !c10835p.equals(m10020q)) {
            throw new IllegalArgumentException("Initial offset " + c10835p + " not equal to previous offset of first transition: " + m10020q);
        } else if (list3.isEmpty()) {
            return new C10816a(arrayList, false, z2);
        } else {
            C10836q c10836q = arrayList.get(size - 1);
            long m10012e = c10836q.m10012e() + 1;
            long m10046f = m10046f(1);
            if (m10012e < m10046f) {
                arrayList.addAll(C10828j.m10050s(c10836q, list3, m10012e, m10046f));
            }
            return new C10817b(size, arrayList, list3, false, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static List<C10835p> m10044h(int i) {
        return Collections.singletonList(C10835p.m10020q(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static List<C10835p> m10043i(int i, int i2) {
        C10835p m10020q = C10835p.m10020q(i);
        C10835p m10020q2 = C10835p.m10020q(i2);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(m10020q);
        arrayList.add(m10020q2);
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static long m10042j(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        return C10616c.m11033i(EnumC7627a0.UNIX.m20216i(C10615b.m11045j(interfaceC10614a.mo10482o(), interfaceC10614a.mo10481p(), interfaceC10614a.mo10480r()), EnumC7627a0.MODIFIED_JULIAN_DATE), 86400L) + (interfaceC10621g.mo10479s() * 3600) + (interfaceC10621g.mo10483m() * 60) + interfaceC10621g.mo10487h();
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    public boolean isEmpty() {
        return false;
    }
}

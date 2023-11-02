package p247nb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: nb.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C10554p {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nb.p$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10556b {

        /* renamed from: a */
        private final C10533d<?> f27552a;

        /* renamed from: b */
        private final Set<C10556b> f27553b = new HashSet();

        /* renamed from: c */
        private final Set<C10556b> f27554c = new HashSet();

        C10556b(C10533d<?> c10533d) {
            this.f27552a = c10533d;
        }

        /* renamed from: a */
        void m11250a(C10556b c10556b) {
            this.f27553b.add(c10556b);
        }

        /* renamed from: b */
        void m11249b(C10556b c10556b) {
            this.f27554c.add(c10556b);
        }

        /* renamed from: c */
        C10533d<?> m11248c() {
            return this.f27552a;
        }

        /* renamed from: d */
        Set<C10556b> m11247d() {
            return this.f27553b;
        }

        /* renamed from: e */
        boolean m11246e() {
            return this.f27553b.isEmpty();
        }

        /* renamed from: f */
        boolean m11245f() {
            return this.f27554c.isEmpty();
        }

        /* renamed from: g */
        void m11244g(C10556b c10556b) {
            this.f27554c.remove(c10556b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nb.p$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10557c {

        /* renamed from: a */
        private final Class<?> f27555a;

        /* renamed from: b */
        private final boolean f27556b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C10557c)) {
                return false;
            }
            C10557c c10557c = (C10557c) obj;
            if (!c10557c.f27555a.equals(this.f27555a) || c10557c.f27556b != this.f27556b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f27555a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f27556b).hashCode();
        }

        private C10557c(Class<?> cls, boolean z) {
            this.f27555a = cls;
            this.f27556b = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m11253a(List<C10533d<?>> list) {
        Set<C10556b> m11251c = m11251c(list);
        Set<C10556b> m11252b = m11252b(m11251c);
        int i = 0;
        while (!m11252b.isEmpty()) {
            C10556b next = m11252b.iterator().next();
            m11252b.remove(next);
            i++;
            for (C10556b c10556b : next.m11247d()) {
                c10556b.m11244g(next);
                if (c10556b.m11245f()) {
                    m11252b.add(c10556b);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C10556b c10556b2 : m11251c) {
            if (!c10556b2.m11245f() && !c10556b2.m11246e()) {
                arrayList.add(c10556b2.m11248c());
            }
        }
        throw new C10559r(arrayList);
    }

    /* renamed from: b */
    private static Set<C10556b> m11252b(Set<C10556b> set) {
        HashSet hashSet = new HashSet();
        for (C10556b c10556b : set) {
            if (c10556b.m11245f()) {
                hashSet.add(c10556b);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set<C10556b> m11251c(List<C10533d<?>> list) {
        Set<C10556b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C10533d<?> c10533d : list) {
            C10556b c10556b = new C10556b(c10533d);
            for (Class<? super Object> cls : c10533d.m11304g()) {
                C10557c c10557c = new C10557c(cls, !c10533d.m11298m());
                if (!hashMap.containsKey(c10557c)) {
                    hashMap.put(c10557c, new HashSet());
                }
                Set set2 = (Set) hashMap.get(c10557c);
                if (!set2.isEmpty() && !c10557c.f27556b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(c10556b);
            }
        }
        for (Set<C10556b> set3 : hashMap.values()) {
            for (C10556b c10556b2 : set3) {
                for (C10558q c10558q : c10556b2.m11248c().m11306e()) {
                    if (c10558q.m11239d() && (set = (Set) hashMap.get(new C10557c(c10558q.m11241b(), c10558q.m11237f()))) != null) {
                        for (C10556b c10556b3 : set) {
                            c10556b2.m11250a(c10556b3);
                            c10556b3.m11249b(c10556b2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}

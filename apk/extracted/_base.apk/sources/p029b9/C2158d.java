package p029b9;

import android.accounts.Account;
import android.view.View;
import androidx.collection.C0626b;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p082ea.C6187a;
import p461z8.C14107a;

/* renamed from: b9.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2158d {

    /* renamed from: a */
    private final Account f6090a;

    /* renamed from: b */
    private final Set<Scope> f6091b;

    /* renamed from: c */
    private final Set<Scope> f6092c;

    /* renamed from: d */
    private final Map<C14107a<?>, C2145a0> f6093d;

    /* renamed from: e */
    private final int f6094e;

    /* renamed from: f */
    private final View f6095f;

    /* renamed from: g */
    private final String f6096g;

    /* renamed from: h */
    private final String f6097h;

    /* renamed from: i */
    private final C6187a f6098i;

    /* renamed from: j */
    private Integer f6099j;

    /* renamed from: b9.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2159a {

        /* renamed from: a */
        private Account f6100a;

        /* renamed from: b */
        private C0626b<Scope> f6101b;

        /* renamed from: c */
        private String f6102c;

        /* renamed from: d */
        private String f6103d;

        /* renamed from: e */
        private C6187a f6104e = C6187a.f17507s;

        /* renamed from: a */
        public C2158d m34062a() {
            return new C2158d(this.f6100a, this.f6101b, null, 0, null, this.f6102c, this.f6103d, this.f6104e, false);
        }

        /* renamed from: b */
        public C2159a m34061b(String str) {
            this.f6102c = str;
            return this;
        }

        /* renamed from: c */
        public final C2159a m34060c(Collection<Scope> collection) {
            if (this.f6101b == null) {
                this.f6101b = new C0626b<>();
            }
            this.f6101b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public final C2159a m34059d(Account account) {
            this.f6100a = account;
            return this;
        }

        /* renamed from: e */
        public final C2159a m34058e(String str) {
            this.f6103d = str;
            return this;
        }
    }

    public C2158d(Account account, Set<Scope> set, Map<C14107a<?>, C2145a0> map, int i, View view, String str, String str2, C6187a c6187a, boolean z) {
        Set<Scope> unmodifiableSet;
        this.f6090a = account;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.f6091b = unmodifiableSet;
        map = map == null ? Collections.emptyMap() : map;
        this.f6093d = map;
        this.f6095f = view;
        this.f6094e = i;
        this.f6096g = str;
        this.f6097h = str2;
        this.f6098i = c6187a == null ? C6187a.f17507s : c6187a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        for (C2145a0 c2145a0 : map.values()) {
            hashSet.addAll(c2145a0.f6046a);
        }
        this.f6092c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public Account m34073a() {
        return this.f6090a;
    }

    @Deprecated
    /* renamed from: b */
    public String m34072b() {
        Account account = this.f6090a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: c */
    public Account m34071c() {
        Account account = this.f6090a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    /* renamed from: d */
    public Set<Scope> m34070d() {
        return this.f6092c;
    }

    /* renamed from: e */
    public Set<Scope> m34069e(C14107a<?> c14107a) {
        C2145a0 c2145a0 = this.f6093d.get(c14107a);
        if (c2145a0 != null && !c2145a0.f6046a.isEmpty()) {
            HashSet hashSet = new HashSet(this.f6091b);
            hashSet.addAll(c2145a0.f6046a);
            return hashSet;
        }
        return this.f6091b;
    }

    /* renamed from: f */
    public String m34068f() {
        return this.f6096g;
    }

    /* renamed from: g */
    public Set<Scope> m34067g() {
        return this.f6091b;
    }

    /* renamed from: h */
    public final C6187a m34066h() {
        return this.f6098i;
    }

    /* renamed from: i */
    public final Integer m34065i() {
        return this.f6099j;
    }

    /* renamed from: j */
    public final String m34064j() {
        return this.f6097h;
    }

    /* renamed from: k */
    public final void m34063k(Integer num) {
        this.f6099j = num;
    }
}

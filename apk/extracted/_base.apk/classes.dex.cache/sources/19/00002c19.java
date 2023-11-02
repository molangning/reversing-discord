package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.InterfaceC4897h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.material.internal.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4887a<T extends InterfaceC4897h<T>> {

    /* renamed from: a */
    private final Map<Integer, T> f13657a = new HashMap();

    /* renamed from: b */
    private final Set<Integer> f13658b = new HashSet();

    /* renamed from: c */
    private InterfaceC4889b f13659c;

    /* renamed from: d */
    private boolean f13660d;

    /* renamed from: e */
    private boolean f13661e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4888a implements InterfaceC4897h.InterfaceC4898a<T> {
        C4888a() {
            C4887a.this = r1;
        }

        @Override // com.google.android.material.internal.InterfaceC4897h.InterfaceC4898a
        /* renamed from: b */
        public void mo26974a(T t, boolean z) {
            if (z) {
                if (!C4887a.this.m27063g(t)) {
                    return;
                }
            } else {
                C4887a c4887a = C4887a.this;
                if (!c4887a.m27052r(t, c4887a.f13661e)) {
                    return;
                }
            }
            C4887a.this.m27057m();
        }
    }

    /* renamed from: com.google.android.material.internal.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4889b {
        /* renamed from: a */
        void mo27050a(Set<Integer> set);
    }

    /* renamed from: g */
    public boolean m27063g(InterfaceC4897h<T> interfaceC4897h) {
        int id2 = interfaceC4897h.getId();
        if (this.f13658b.contains(Integer.valueOf(id2))) {
            return false;
        }
        T t = this.f13657a.get(Integer.valueOf(m27059k()));
        if (t != null) {
            m27052r(t, false);
        }
        boolean add = this.f13658b.add(Integer.valueOf(id2));
        if (!interfaceC4897h.isChecked()) {
            interfaceC4897h.setChecked(true);
        }
        return add;
    }

    /* renamed from: m */
    public void m27057m() {
        InterfaceC4889b interfaceC4889b = this.f13659c;
        if (interfaceC4889b != null) {
            interfaceC4889b.mo27050a(m27061i());
        }
    }

    /* renamed from: r */
    public boolean m27052r(InterfaceC4897h<T> interfaceC4897h, boolean z) {
        int id2 = interfaceC4897h.getId();
        if (!this.f13658b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z && this.f13658b.size() == 1 && this.f13658b.contains(Integer.valueOf(id2))) {
            interfaceC4897h.setChecked(true);
            return false;
        }
        boolean remove = this.f13658b.remove(Integer.valueOf(id2));
        if (interfaceC4897h.isChecked()) {
            interfaceC4897h.setChecked(false);
        }
        return remove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public void m27065e(T t) {
        this.f13657a.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            m27063g(t);
        }
        t.setInternalOnCheckedChangeListener(new C4888a());
    }

    /* renamed from: f */
    public void m27064f(int i) {
        T t = this.f13657a.get(Integer.valueOf(i));
        if (t != null && m27063g(t)) {
            m27057m();
        }
    }

    /* renamed from: h */
    public void m27062h() {
        boolean z = !this.f13658b.isEmpty();
        for (T t : this.f13657a.values()) {
            m27052r(t, false);
        }
        if (z) {
            m27057m();
        }
    }

    /* renamed from: i */
    public Set<Integer> m27061i() {
        return new HashSet(this.f13658b);
    }

    /* renamed from: j */
    public List<Integer> m27060j(ViewGroup viewGroup) {
        Set<Integer> m27061i = m27061i();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC4897h) && m27061i.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public int m27059k() {
        if (!this.f13660d || this.f13658b.isEmpty()) {
            return -1;
        }
        return this.f13658b.iterator().next().intValue();
    }

    /* renamed from: l */
    public boolean m27058l() {
        return this.f13660d;
    }

    /* renamed from: n */
    public void m27056n(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.f13657a.remove(Integer.valueOf(t.getId()));
        this.f13658b.remove(Integer.valueOf(t.getId()));
    }

    /* renamed from: o */
    public void m27055o(InterfaceC4889b interfaceC4889b) {
        this.f13659c = interfaceC4889b;
    }

    /* renamed from: p */
    public void m27054p(boolean z) {
        this.f13661e = z;
    }

    /* renamed from: q */
    public void m27053q(boolean z) {
        if (this.f13660d != z) {
            this.f13660d = z;
            m27062h();
        }
    }
}
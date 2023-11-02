package p125h1;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p206l1.C10012h;
import p206l1.C10021n;

/* renamed from: h1.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6875h {

    /* renamed from: a */
    private final List<AbstractC6861a<C10021n, Path>> f19137a;

    /* renamed from: b */
    private final List<AbstractC6861a<Integer, Integer>> f19138b;

    /* renamed from: c */
    private final List<C10012h> f19139c;

    public C6875h(List<C10012h> list) {
        this.f19139c = list;
        this.f19137a = new ArrayList(list.size());
        this.f19138b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f19137a.add(list.get(i).m12588b().mo16817a());
            this.f19138b.add(list.get(i).m12587c().mo16817a());
        }
    }

    /* renamed from: a */
    public List<AbstractC6861a<C10021n, Path>> m21742a() {
        return this.f19137a;
    }

    /* renamed from: b */
    public List<C10012h> m21741b() {
        return this.f19139c;
    }

    /* renamed from: c */
    public List<AbstractC6861a<Integer, Integer>> m21740c() {
        return this.f19138b;
    }
}

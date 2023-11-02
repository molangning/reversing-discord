package p111g1;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p206l1.C10014i;

@TargetApi(19)
/* renamed from: g1.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6530l implements InterfaceC6532m, InterfaceC6528j {

    /* renamed from: d */
    private final String f18509d;

    /* renamed from: f */
    private final C10014i f18511f;

    /* renamed from: a */
    private final Path f18506a = new Path();

    /* renamed from: b */
    private final Path f18507b = new Path();

    /* renamed from: c */
    private final Path f18508c = new Path();

    /* renamed from: e */
    private final List<InterfaceC6532m> f18510e = new ArrayList();

    /* renamed from: g1.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static /* synthetic */ class C6531a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18512a;

        static {
            int[] iArr = new int[C10014i.EnumC10015a.values().length];
            f18512a = iArr;
            try {
                iArr[C10014i.EnumC10015a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18512a[C10014i.EnumC10015a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18512a[C10014i.EnumC10015a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18512a[C10014i.EnumC10015a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18512a[C10014i.EnumC10015a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C6530l(C10014i c10014i) {
        this.f18509d = c10014i.m12583c();
        this.f18511f = c10014i;
    }

    /* renamed from: a */
    private void m22440a() {
        for (int i = 0; i < this.f18510e.size(); i++) {
            this.f18508c.addPath(this.f18510e.get(i).mo22429c());
        }
    }

    @TargetApi(19)
    /* renamed from: d */
    private void m22439d(Path.Op op) {
        this.f18507b.reset();
        this.f18506a.reset();
        for (int size = this.f18510e.size() - 1; size >= 1; size--) {
            InterfaceC6532m interfaceC6532m = this.f18510e.get(size);
            if (interfaceC6532m instanceof C6522d) {
                C6522d c6522d = (C6522d) interfaceC6532m;
                List<InterfaceC6532m> m22452l = c6522d.m22452l();
                for (int size2 = m22452l.size() - 1; size2 >= 0; size2--) {
                    Path mo22429c = m22452l.get(size2).mo22429c();
                    mo22429c.transform(c6522d.m22451m());
                    this.f18507b.addPath(mo22429c);
                }
            } else {
                this.f18507b.addPath(interfaceC6532m.mo22429c());
            }
        }
        InterfaceC6532m interfaceC6532m2 = this.f18510e.get(0);
        if (interfaceC6532m2 instanceof C6522d) {
            C6522d c6522d2 = (C6522d) interfaceC6532m2;
            List<InterfaceC6532m> m22452l2 = c6522d2.m22452l();
            for (int i = 0; i < m22452l2.size(); i++) {
                Path mo22429c2 = m22452l2.get(i).mo22429c();
                mo22429c2.transform(c6522d2.m22451m());
                this.f18506a.addPath(mo22429c2);
            }
        } else {
            this.f18506a.set(interfaceC6532m2.mo22429c());
        }
        this.f18508c.op(this.f18506a, this.f18507b, op);
    }

    @Override // p111g1.InterfaceC6521c
    /* renamed from: b */
    public void mo12106b(List<InterfaceC6521c> list, List<InterfaceC6521c> list2) {
        for (int i = 0; i < this.f18510e.size(); i++) {
            this.f18510e.get(i).mo12106b(list, list2);
        }
    }

    @Override // p111g1.InterfaceC6532m
    /* renamed from: c */
    public Path mo22429c() {
        this.f18508c.reset();
        if (this.f18511f.m12582d()) {
            return this.f18508c;
        }
        int i = C6531a.f18512a[this.f18511f.m12584b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            m22439d(Path.Op.XOR);
                        }
                    } else {
                        m22439d(Path.Op.INTERSECT);
                    }
                } else {
                    m22439d(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                m22439d(Path.Op.UNION);
            }
        } else {
            m22440a();
        }
        return this.f18508c;
    }

    @Override // p111g1.InterfaceC6528j
    /* renamed from: f */
    public void mo22434f(ListIterator<InterfaceC6521c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC6521c previous = listIterator.previous();
            if (previous instanceof InterfaceC6532m) {
                this.f18510e.add((InterfaceC6532m) previous);
                listIterator.remove();
            }
        }
    }
}

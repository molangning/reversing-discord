package p297q7;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p151i6.C7390b;
import p212l7.C10059c;
import p212l7.InterfaceC10057a;

/* renamed from: q7.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11771b implements InterfaceC10057a<C11771b> {

    /* renamed from: a */
    public final long f30682a;

    /* renamed from: b */
    public final long f30683b;

    /* renamed from: c */
    public final long f30684c;

    /* renamed from: d */
    public final boolean f30685d;

    /* renamed from: e */
    public final long f30686e;

    /* renamed from: f */
    public final long f30687f;

    /* renamed from: g */
    public final long f30688g;

    /* renamed from: h */
    public final long f30689h;

    /* renamed from: i */
    public final C11792n f30690i;

    /* renamed from: j */
    public final C11789k f30691j;

    /* renamed from: k */
    public final Uri f30692k;

    /* renamed from: l */
    public final C11777g f30693l;

    /* renamed from: m */
    private final List<C11776f> f30694m;

    public C11771b(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C11777g c11777g, C11792n c11792n, C11789k c11789k, Uri uri, List<C11776f> list) {
        List<C11776f> list2;
        this.f30682a = j;
        this.f30683b = j2;
        this.f30684c = j3;
        this.f30685d = z;
        this.f30686e = j4;
        this.f30687f = j5;
        this.f30688g = j6;
        this.f30689h = j7;
        this.f30693l = c11777g;
        this.f30690i = c11792n;
        this.f30692k = uri;
        this.f30691j = c11789k;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = list;
        }
        this.f30694m = list2;
    }

    /* renamed from: c */
    private static ArrayList<C11770a> m6956c(List<C11770a> list, LinkedList<C10059c> linkedList) {
        C10059c poll = linkedList.poll();
        int i = poll.f26154j;
        ArrayList<C11770a> arrayList = new ArrayList<>();
        do {
            int i2 = poll.f26155k;
            C11770a c11770a = list.get(i2);
            List<AbstractC11779i> list2 = c11770a.f30678c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.f26156l));
                poll = linkedList.poll();
                if (poll.f26154j != i) {
                    break;
                }
            } while (poll.f26155k == i2);
            arrayList.add(new C11770a(c11770a.f30676a, c11770a.f30677b, arrayList2, c11770a.f30679d, c11770a.f30680e, c11770a.f30681f));
        } while (poll.f26154j == i);
        linkedList.addFirst(poll);
        return arrayList;
    }

    @Override // p212l7.InterfaceC10057a
    /* renamed from: b */
    public final C11771b mo3731a(List<C10059c> list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C10059c(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i >= m6954e()) {
                break;
            }
            if (((C10059c) linkedList.peek()).f26154j != i) {
                long m6953f = m6953f(i);
                if (m6953f != -9223372036854775807L) {
                    j2 += m6953f;
                }
            } else {
                C11776f m6955d = m6955d(i);
                arrayList.add(new C11776f(m6955d.f30715a, m6955d.f30716b - j2, m6956c(m6955d.f30717c, linkedList), m6955d.f30718d));
            }
            i++;
        }
        long j3 = this.f30683b;
        if (j3 != -9223372036854775807L) {
            j = j3 - j2;
        }
        return new C11771b(this.f30682a, j, this.f30684c, this.f30685d, this.f30686e, this.f30687f, this.f30688g, this.f30689h, this.f30693l, this.f30690i, this.f30691j, this.f30692k, arrayList);
    }

    /* renamed from: d */
    public final C11776f m6955d(int i) {
        return this.f30694m.get(i);
    }

    /* renamed from: e */
    public final int m6954e() {
        return this.f30694m.size();
    }

    /* renamed from: f */
    public final long m6953f(int i) {
        long j;
        long j2;
        if (i == this.f30694m.size() - 1) {
            j = this.f30683b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = this.f30694m.get(i).f30716b;
        } else {
            j = this.f30694m.get(i + 1).f30716b;
            j2 = this.f30694m.get(i).f30716b;
        }
        return j - j2;
    }

    /* renamed from: g */
    public final long m6952g(int i) {
        return C7390b.m20792c(m6953f(i));
    }
}

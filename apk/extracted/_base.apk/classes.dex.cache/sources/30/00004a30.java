package p297q7;

import java.util.Collections;
import java.util.List;

/* renamed from: q7.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11776f {

    /* renamed from: a */
    public final String f30715a;

    /* renamed from: b */
    public final long f30716b;

    /* renamed from: c */
    public final List<C11770a> f30717c;

    /* renamed from: d */
    public final List<C11775e> f30718d;

    /* renamed from: e */
    public final C11774d f30719e;

    public C11776f(String str, long j, List<C11770a> list, List<C11775e> list2) {
        this(str, j, list, list2, null);
    }

    /* renamed from: a */
    public int m6882a(int i) {
        int size = this.f30717c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f30717c.get(i2).f30677b == i) {
                return i2;
            }
        }
        return -1;
    }

    public C11776f(String str, long j, List<C11770a> list, List<C11775e> list2, C11774d c11774d) {
        this.f30715a = str;
        this.f30716b = j;
        this.f30717c = Collections.unmodifiableList(list);
        this.f30718d = Collections.unmodifiableList(list2);
        this.f30719e = c11774d;
    }
}
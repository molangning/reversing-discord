package p164j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8404s extends C8398m {

    /* renamed from: e */
    C8404s f22518e;

    /* renamed from: f */
    C8404s f22519f;

    /* renamed from: g */
    C8404s f22520g;

    /* renamed from: h */
    C8404s f22521h;

    /* renamed from: i */
    boolean f22522i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8404s(int i, Object obj, Object obj2, C8404s c8404s, C8404s c8404s2) {
        super(i, obj, obj2, c8404s);
        this.f22518e = c8404s2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p164j$.util.concurrent.C8398m
    /* renamed from: a */
    public final C8398m mo17728a(int i, Object obj) {
        return m17727b(i, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C8404s m17727b(int i, Object obj, Class cls) {
        int compareComparables;
        if (obj != null) {
            C8404s c8404s = this;
            do {
                C8404s c8404s2 = c8404s.f22519f;
                C8404s c8404s3 = c8404s.f22520g;
                int i2 = c8404s.f22497a;
                if (i2 <= i) {
                    if (i2 >= i) {
                        Object obj2 = c8404s.f22498b;
                        if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                            return c8404s;
                        }
                        if (c8404s2 != null) {
                            if (c8404s3 != null) {
                                if ((cls == null && (cls = ConcurrentHashMap.comparableClassFor(obj)) == null) || (compareComparables = ConcurrentHashMap.compareComparables(cls, obj, obj2)) == 0) {
                                    C8404s m17727b = c8404s3.m17727b(i, obj, cls);
                                    if (m17727b != null) {
                                        return m17727b;
                                    }
                                } else if (compareComparables >= 0) {
                                    c8404s2 = c8404s3;
                                }
                            }
                        }
                    }
                    c8404s = c8404s3;
                    continue;
                }
                c8404s = c8404s2;
                continue;
            } while (c8404s != null);
            return null;
        }
        return null;
    }
}

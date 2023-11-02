package p164j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* renamed from: j$.util.concurrent.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8403r extends C8398m {

    /* renamed from: h */
    private static final Unsafe f22513h;

    /* renamed from: i */
    private static final long f22514i;

    /* renamed from: e */
    C8404s f22515e;

    /* renamed from: f */
    volatile C8404s f22516f;

    /* renamed from: g */
    volatile Thread f22517g;
    volatile int lockState;

    static {
        try {
            Unsafe m17724c = AbstractC8408w.m17724c();
            f22513h = m17724c;
            f22514i = m17724c.objectFieldOffset(C8403r.class.getDeclaredField("lockState"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public C8403r(C8404s c8404s) {
        super(-2, null, null, null);
        int compareComparables;
        int m17729j;
        this.f22516f = c8404s;
        C8404s c8404s2 = null;
        while (c8404s != null) {
            C8404s c8404s3 = (C8404s) c8404s.f22500d;
            c8404s.f22520g = null;
            c8404s.f22519f = null;
            if (c8404s2 == null) {
                c8404s.f22518e = null;
                c8404s.f22522i = false;
            } else {
                Object obj = c8404s.f22498b;
                int i = c8404s.f22497a;
                C8404s c8404s4 = c8404s2;
                Class<?> cls = null;
                while (true) {
                    Object obj2 = c8404s4.f22498b;
                    int i2 = c8404s4.f22497a;
                    m17729j = i2 > i ? -1 : i2 < i ? 1 : ((cls == null && (cls = ConcurrentHashMap.comparableClassFor(obj)) == null) || (compareComparables = ConcurrentHashMap.compareComparables(cls, obj, obj2)) == 0) ? m17729j(obj, obj2) : compareComparables;
                    C8404s c8404s5 = m17729j <= 0 ? c8404s4.f22519f : c8404s4.f22520g;
                    if (c8404s5 == null) {
                        break;
                    }
                    c8404s4 = c8404s5;
                }
                c8404s.f22518e = c8404s4;
                if (m17729j <= 0) {
                    c8404s4.f22519f = c8404s;
                } else {
                    c8404s4.f22520g = c8404s;
                }
                c8404s = m17736c(c8404s2, c8404s);
            }
            c8404s2 = c8404s;
            c8404s = c8404s3;
        }
        this.f22515e = c8404s2;
    }

    /* renamed from: b */
    static C8404s m17737b(C8404s c8404s, C8404s c8404s2) {
        while (c8404s2 != null && c8404s2 != c8404s) {
            C8404s c8404s3 = c8404s2.f22518e;
            if (c8404s3 == null) {
                c8404s2.f22522i = false;
                return c8404s2;
            } else if (c8404s2.f22522i) {
                c8404s2.f22522i = false;
                return c8404s;
            } else {
                C8404s c8404s4 = c8404s3.f22519f;
                if (c8404s4 == c8404s2) {
                    c8404s4 = c8404s3.f22520g;
                    if (c8404s4 != null && c8404s4.f22522i) {
                        c8404s4.f22522i = false;
                        c8404s3.f22522i = true;
                        c8404s = m17731h(c8404s, c8404s3);
                        c8404s3 = c8404s2.f22518e;
                        c8404s4 = c8404s3 == null ? null : c8404s3.f22520g;
                    }
                    if (c8404s4 == null) {
                        c8404s2 = c8404s3;
                    } else {
                        C8404s c8404s5 = c8404s4.f22519f;
                        C8404s c8404s6 = c8404s4.f22520g;
                        if ((c8404s6 != null && c8404s6.f22522i) || (c8404s5 != null && c8404s5.f22522i)) {
                            if (c8404s6 == null || !c8404s6.f22522i) {
                                if (c8404s5 != null) {
                                    c8404s5.f22522i = false;
                                }
                                c8404s4.f22522i = true;
                                c8404s = m17730i(c8404s, c8404s4);
                                c8404s3 = c8404s2.f22518e;
                                c8404s4 = c8404s3 != null ? c8404s3.f22520g : null;
                            }
                            if (c8404s4 != null) {
                                c8404s4.f22522i = c8404s3 == null ? false : c8404s3.f22522i;
                                C8404s c8404s7 = c8404s4.f22520g;
                                if (c8404s7 != null) {
                                    c8404s7.f22522i = false;
                                }
                            }
                            if (c8404s3 != null) {
                                c8404s3.f22522i = false;
                                c8404s = m17731h(c8404s, c8404s3);
                            }
                            c8404s2 = c8404s;
                            c8404s = c8404s2;
                        }
                        c8404s4.f22522i = true;
                        c8404s2 = c8404s3;
                    }
                } else {
                    if (c8404s4 != null && c8404s4.f22522i) {
                        c8404s4.f22522i = false;
                        c8404s3.f22522i = true;
                        c8404s = m17730i(c8404s, c8404s3);
                        c8404s3 = c8404s2.f22518e;
                        c8404s4 = c8404s3 == null ? null : c8404s3.f22519f;
                    }
                    if (c8404s4 == null) {
                        c8404s2 = c8404s3;
                    } else {
                        C8404s c8404s8 = c8404s4.f22519f;
                        C8404s c8404s9 = c8404s4.f22520g;
                        if ((c8404s8 != null && c8404s8.f22522i) || (c8404s9 != null && c8404s9.f22522i)) {
                            if (c8404s8 == null || !c8404s8.f22522i) {
                                if (c8404s9 != null) {
                                    c8404s9.f22522i = false;
                                }
                                c8404s4.f22522i = true;
                                c8404s = m17731h(c8404s, c8404s4);
                                c8404s3 = c8404s2.f22518e;
                                c8404s4 = c8404s3 != null ? c8404s3.f22519f : null;
                            }
                            if (c8404s4 != null) {
                                c8404s4.f22522i = c8404s3 == null ? false : c8404s3.f22522i;
                                C8404s c8404s10 = c8404s4.f22519f;
                                if (c8404s10 != null) {
                                    c8404s10.f22522i = false;
                                }
                            }
                            if (c8404s3 != null) {
                                c8404s3.f22522i = false;
                                c8404s = m17730i(c8404s, c8404s3);
                            }
                            c8404s2 = c8404s;
                            c8404s = c8404s2;
                        }
                        c8404s4.f22522i = true;
                        c8404s2 = c8404s3;
                    }
                }
            }
        }
        return c8404s;
    }

    /* renamed from: c */
    static C8404s m17736c(C8404s c8404s, C8404s c8404s2) {
        C8404s c8404s3;
        c8404s2.f22522i = true;
        while (true) {
            C8404s c8404s4 = c8404s2.f22518e;
            if (c8404s4 == null) {
                c8404s2.f22522i = false;
                return c8404s2;
            } else if (!c8404s4.f22522i || (c8404s3 = c8404s4.f22518e) == null) {
                break;
            } else {
                C8404s c8404s5 = c8404s3.f22519f;
                if (c8404s4 == c8404s5) {
                    c8404s5 = c8404s3.f22520g;
                    if (c8404s5 == null || !c8404s5.f22522i) {
                        if (c8404s2 == c8404s4.f22520g) {
                            c8404s = m17731h(c8404s, c8404s4);
                            C8404s c8404s6 = c8404s4.f22518e;
                            c8404s3 = c8404s6 == null ? null : c8404s6.f22518e;
                            c8404s4 = c8404s6;
                            c8404s2 = c8404s4;
                        }
                        if (c8404s4 != null) {
                            c8404s4.f22522i = false;
                            if (c8404s3 != null) {
                                c8404s3.f22522i = true;
                                c8404s = m17730i(c8404s, c8404s3);
                            }
                        }
                    } else {
                        c8404s5.f22522i = false;
                        c8404s4.f22522i = false;
                        c8404s3.f22522i = true;
                        c8404s2 = c8404s3;
                    }
                } else if (c8404s5 == null || !c8404s5.f22522i) {
                    if (c8404s2 == c8404s4.f22519f) {
                        c8404s = m17730i(c8404s, c8404s4);
                        C8404s c8404s7 = c8404s4.f22518e;
                        c8404s3 = c8404s7 == null ? null : c8404s7.f22518e;
                        c8404s4 = c8404s7;
                        c8404s2 = c8404s4;
                    }
                    if (c8404s4 != null) {
                        c8404s4.f22522i = false;
                        if (c8404s3 != null) {
                            c8404s3.f22522i = true;
                            c8404s = m17731h(c8404s, c8404s3);
                        }
                    }
                } else {
                    c8404s5.f22522i = false;
                    c8404s4.f22522i = false;
                    c8404s3.f22522i = true;
                    c8404s2 = c8404s3;
                }
            }
        }
        return c8404s;
    }

    /* renamed from: d */
    private final void m17735d() {
        boolean z = false;
        while (true) {
            int i = this.lockState;
            if ((i & (-3)) == 0) {
                if (f22513h.compareAndSwapInt(this, f22514i, i, 1)) {
                    break;
                }
            } else if ((i & 2) == 0) {
                if (f22513h.compareAndSwapInt(this, f22514i, i, i | 2)) {
                    this.f22517g = Thread.currentThread();
                    z = true;
                }
            } else if (z) {
                LockSupport.park(this);
            }
        }
        if (z) {
            this.f22517g = null;
        }
    }

    /* renamed from: e */
    private final void m17734e() {
        if (f22513h.compareAndSwapInt(this, f22514i, 0, 1)) {
            return;
        }
        m17735d();
    }

    /* renamed from: h */
    static C8404s m17731h(C8404s c8404s, C8404s c8404s2) {
        C8404s c8404s3 = c8404s2.f22520g;
        if (c8404s3 != null) {
            C8404s c8404s4 = c8404s3.f22519f;
            c8404s2.f22520g = c8404s4;
            if (c8404s4 != null) {
                c8404s4.f22518e = c8404s2;
            }
            C8404s c8404s5 = c8404s2.f22518e;
            c8404s3.f22518e = c8404s5;
            if (c8404s5 == null) {
                c8404s3.f22522i = false;
                c8404s = c8404s3;
            } else if (c8404s5.f22519f == c8404s2) {
                c8404s5.f22519f = c8404s3;
            } else {
                c8404s5.f22520g = c8404s3;
            }
            c8404s3.f22519f = c8404s2;
            c8404s2.f22518e = c8404s3;
        }
        return c8404s;
    }

    /* renamed from: i */
    static C8404s m17730i(C8404s c8404s, C8404s c8404s2) {
        C8404s c8404s3 = c8404s2.f22519f;
        if (c8404s3 != null) {
            C8404s c8404s4 = c8404s3.f22520g;
            c8404s2.f22519f = c8404s4;
            if (c8404s4 != null) {
                c8404s4.f22518e = c8404s2;
            }
            C8404s c8404s5 = c8404s2.f22518e;
            c8404s3.f22518e = c8404s5;
            if (c8404s5 == null) {
                c8404s3.f22522i = false;
                c8404s = c8404s3;
            } else if (c8404s5.f22520g == c8404s2) {
                c8404s5.f22520g = c8404s3;
            } else {
                c8404s5.f22519f = c8404s3;
            }
            c8404s3.f22520g = c8404s2;
            c8404s2.f22518e = c8404s3;
        }
        return c8404s;
    }

    /* renamed from: j */
    static int m17729j(Object obj, Object obj2) {
        int compareTo;
        if (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
        }
        return compareTo;
    }

    @Override // p164j$.util.concurrent.C8398m
    /* renamed from: a */
    public final C8398m mo17728a(int i, Object obj) {
        Object obj2;
        Thread thread;
        Thread thread2;
        C8404s c8404s = null;
        if (obj != null) {
            C8398m c8398m = this.f22516f;
            while (c8398m != null) {
                int i2 = this.lockState;
                if ((i2 & 3) == 0) {
                    Unsafe unsafe = f22513h;
                    long j = f22514i;
                    if (unsafe.compareAndSwapInt(this, j, i2, i2 + 4)) {
                        try {
                            C8404s c8404s2 = this.f22515e;
                            if (c8404s2 != null) {
                                c8404s = c8404s2.m17727b(i, obj, null);
                            }
                            if (AbstractC8408w.m17726a(unsafe, this, j) == 6 && (thread2 = this.f22517g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return c8404s;
                        } catch (Throwable th2) {
                            if (AbstractC8408w.m17726a(f22513h, this, f22514i) == 6 && (thread = this.f22517g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th2;
                        }
                    }
                } else if (c8398m.f22497a == i && ((obj2 = c8398m.f22498b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return c8398m;
                } else {
                    c8398m = c8398m.f22500d;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x00a2, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x005f, code lost:
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a7 A[LOOP:0: B:68:0x000c->B:120:0x00a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0071 A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p164j$.util.concurrent.C8404s m17733f(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r4 = r17
            j$.util.concurrent.s r2 = r1.f22515e
            r8 = 0
            r9 = 0
            r10 = r2
            r2 = r8
            r3 = r9
        Lc:
            if (r10 != 0) goto L22
            j$.util.concurrent.s r9 = new j$.util.concurrent.s
            r6 = 0
            r7 = 0
            r2 = r9
            r3 = r16
            r4 = r17
            r5 = r18
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f22515e = r9
            r1.f22516f = r9
            goto La2
        L22:
            int r5 = r10.f22497a
            r11 = 1
            if (r5 <= r0) goto L29
            r5 = -1
            goto L65
        L29:
            if (r5 >= r0) goto L2d
            r12 = r11
            goto L68
        L2d:
            java.lang.Object r5 = r10.f22498b
            if (r5 == r4) goto Laa
            if (r5 == 0) goto L3b
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L3b
            goto Laa
        L3b:
            if (r2 != 0) goto L43
            java.lang.Class r2 = p164j$.util.concurrent.ConcurrentHashMap.comparableClassFor(r17)
            if (r2 == 0) goto L49
        L43:
            int r6 = p164j$.util.concurrent.ConcurrentHashMap.compareComparables(r2, r4, r5)
            if (r6 != 0) goto L67
        L49:
            if (r3 != 0) goto L61
            j$.util.concurrent.s r3 = r10.f22519f
            if (r3 == 0) goto L55
            j$.util.concurrent.s r3 = r3.m17727b(r0, r4, r2)
            if (r3 != 0) goto L5f
        L55:
            j$.util.concurrent.s r3 = r10.f22520g
            if (r3 == 0) goto L60
            j$.util.concurrent.s r3 = r3.m17727b(r0, r4, r2)
            if (r3 == 0) goto L60
        L5f:
            return r3
        L60:
            r3 = r11
        L61:
            int r5 = m17729j(r4, r5)
        L65:
            r12 = r5
            goto L68
        L67:
            r12 = r6
        L68:
            if (r12 > 0) goto L6d
            j$.util.concurrent.s r5 = r10.f22519f
            goto L6f
        L6d:
            j$.util.concurrent.s r5 = r10.f22520g
        L6f:
            if (r5 != 0) goto La7
            j$.util.concurrent.s r13 = r1.f22516f
            j$.util.concurrent.s r14 = new j$.util.concurrent.s
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r13
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f22516f = r14
            if (r13 == 0) goto L87
            r13.f22521h = r14
        L87:
            if (r12 > 0) goto L8c
            r10.f22519f = r14
            goto L8e
        L8c:
            r10.f22520g = r14
        L8e:
            boolean r0 = r10.f22522i
            if (r0 != 0) goto L95
            r14.f22522i = r11
            goto La2
        L95:
            r15.m17734e()
            j$.util.concurrent.s r0 = r1.f22515e     // Catch: java.lang.Throwable -> La3
            j$.util.concurrent.s r0 = m17736c(r0, r14)     // Catch: java.lang.Throwable -> La3
            r1.f22515e = r0     // Catch: java.lang.Throwable -> La3
            r1.lockState = r9
        La2:
            return r8
        La3:
            r0 = move-exception
            r1.lockState = r9
            throw r0
        La7:
            r10 = r5
            goto Lc
        Laa:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p164j$.util.concurrent.C8403r.m17733f(int, java.lang.Object, java.lang.Object):j$.util.concurrent.s");
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x008e A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:111:0x0030, B:115:0x0039, B:118:0x003f, B:120:0x004d, B:128:0x0065, B:130:0x006b, B:131:0x006d, B:146:0x008e, B:153:0x009f, B:149:0x0096, B:151:0x009a, B:152:0x009d, B:154:0x00a5, B:158:0x00ae, B:160:0x00b2, B:162:0x00b6, B:164:0x00ba, B:168:0x00c3, B:165:0x00bd, B:167:0x00c1, B:157:0x00aa, B:134:0x0077, B:136:0x007b, B:137:0x007e, B:121:0x0052, B:123:0x0058, B:125:0x005c, B:126:0x005f, B:127:0x0061), top: B:175:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00aa A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:111:0x0030, B:115:0x0039, B:118:0x003f, B:120:0x004d, B:128:0x0065, B:130:0x006b, B:131:0x006d, B:146:0x008e, B:153:0x009f, B:149:0x0096, B:151:0x009a, B:152:0x009d, B:154:0x00a5, B:158:0x00ae, B:160:0x00b2, B:162:0x00b6, B:164:0x00ba, B:168:0x00c3, B:165:0x00bd, B:167:0x00c1, B:157:0x00aa, B:134:0x0077, B:136:0x007b, B:137:0x007e, B:121:0x0052, B:123:0x0058, B:125:0x005c, B:126:0x005f, B:127:0x0061), top: B:175:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00b2 A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:111:0x0030, B:115:0x0039, B:118:0x003f, B:120:0x004d, B:128:0x0065, B:130:0x006b, B:131:0x006d, B:146:0x008e, B:153:0x009f, B:149:0x0096, B:151:0x009a, B:152:0x009d, B:154:0x00a5, B:158:0x00ae, B:160:0x00b2, B:162:0x00b6, B:164:0x00ba, B:168:0x00c3, B:165:0x00bd, B:167:0x00c1, B:157:0x00aa, B:134:0x0077, B:136:0x007b, B:137:0x007e, B:121:0x0052, B:123:0x0058, B:125:0x005c, B:126:0x005f, B:127:0x0061), top: B:175:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00ba A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:111:0x0030, B:115:0x0039, B:118:0x003f, B:120:0x004d, B:128:0x0065, B:130:0x006b, B:131:0x006d, B:146:0x008e, B:153:0x009f, B:149:0x0096, B:151:0x009a, B:152:0x009d, B:154:0x00a5, B:158:0x00ae, B:160:0x00b2, B:162:0x00b6, B:164:0x00ba, B:168:0x00c3, B:165:0x00bd, B:167:0x00c1, B:157:0x00aa, B:134:0x0077, B:136:0x007b, B:137:0x007e, B:121:0x0052, B:123:0x0058, B:125:0x005c, B:126:0x005f, B:127:0x0061), top: B:175:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00bd A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:111:0x0030, B:115:0x0039, B:118:0x003f, B:120:0x004d, B:128:0x0065, B:130:0x006b, B:131:0x006d, B:146:0x008e, B:153:0x009f, B:149:0x0096, B:151:0x009a, B:152:0x009d, B:154:0x00a5, B:158:0x00ae, B:160:0x00b2, B:162:0x00b6, B:164:0x00ba, B:168:0x00c3, B:165:0x00bd, B:167:0x00c1, B:157:0x00aa, B:134:0x0077, B:136:0x007b, B:137:0x007e, B:121:0x0052, B:123:0x0058, B:125:0x005c, B:126:0x005f, B:127:0x0061), top: B:175:0x0030 }] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m17732g(p164j$.util.concurrent.C8404s r11) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p164j$.util.concurrent.C8403r.m17732g(j$.util.concurrent.s):boolean");
    }
}
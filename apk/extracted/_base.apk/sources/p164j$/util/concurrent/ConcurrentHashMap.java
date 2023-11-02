package p164j$.util.concurrent;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.BiFunction;
import p164j$.util.function.Function;
import sun.misc.Unsafe;

/* renamed from: j$.util.concurrent.ConcurrentHashMap */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, InterfaceC8407v {
    private static final long ABASE;
    private static final int ASHIFT;
    private static final long BASECOUNT;
    private static final long CELLSBUSY;
    private static final long CELLVALUE;
    private static final int DEFAULT_CAPACITY = 16;
    private static final int DEFAULT_CONCURRENCY_LEVEL = 16;
    static final int HASH_BITS = Integer.MAX_VALUE;
    private static final float LOAD_FACTOR = 0.75f;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_ARRAY_SIZE = 2147483639;
    private static final int MIN_TRANSFER_STRIDE = 16;
    static final int MIN_TREEIFY_CAPACITY = 64;
    static final int MOVED = -1;
    static final int RESERVED = -3;
    private static int RESIZE_STAMP_BITS = 16;
    private static final long SIZECTL;
    private static final long TRANSFERINDEX;
    static final int TREEBIN = -2;
    static final int TREEIFY_THRESHOLD = 8;

    /* renamed from: U */
    private static final Unsafe f22477U;
    static final int UNTREEIFY_THRESHOLD = 6;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    private volatile transient long baseCount;
    private volatile transient int cellsBusy;
    private volatile transient C8389d[] counterCells;
    private transient C8391f entrySet;
    private transient C8395j keySet;
    private volatile transient C8398m[] nextTable;
    private volatile transient int sizeCtl;
    volatile transient C8398m[] table;
    private volatile transient int transferIndex;
    private transient C8405t values;
    private static final int MAX_RESIZERS = (1 << (32 - 16)) - 1;
    private static final int RESIZE_STAMP_SHIFT = 32 - 16;
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", C8400o[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        try {
            Unsafe m17724c = AbstractC8408w.m17724c();
            f22477U = m17724c;
            SIZECTL = m17724c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("sizeCtl"));
            TRANSFERINDEX = m17724c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("transferIndex"));
            BASECOUNT = m17724c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("baseCount"));
            CELLSBUSY = m17724c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("cellsBusy"));
            CELLVALUE = m17724c.objectFieldOffset(C8389d.class.getDeclaredField("value"));
            ABASE = m17724c.arrayBaseOffset(C8398m[].class);
            int arrayIndexScale = m17724c.arrayIndexScale(C8398m[].class);
            if (((arrayIndexScale - 1) & arrayIndexScale) != 0) {
                throw new Error("data type scale not a power of two");
            }
            ASHIFT = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        this.sizeCtl = i >= 536870912 ? MAXIMUM_CAPACITY : tableSizeFor(i + (i >>> 1) + 1);
    }

    public ConcurrentHashMap(int i, float f) {
        this(i, f, 1);
    }

    public ConcurrentHashMap(int i, float f, int i2) {
        if (f <= 0.0f || i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        long j = (long) (((i < i2 ? i2 : i) / f) + 1.0d);
        this.sizeCtl = j >= 1073741824 ? MAXIMUM_CAPACITY : tableSizeFor((int) j);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1.compareAndSwapLong(r11, r3, r5, r9) == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void addCount(long r12, int r14) {
        /*
            r11 = this;
            j$.util.concurrent.d[] r0 = r11.counterCells
            if (r0 != 0) goto L14
            sun.misc.Unsafe r1 = p164j$.util.concurrent.ConcurrentHashMap.f22477U
            long r3 = p164j$.util.concurrent.ConcurrentHashMap.BASECOUNT
            long r5 = r11.baseCount
            long r9 = r5 + r12
            r2 = r11
            r7 = r9
            boolean r1 = r1.compareAndSwapLong(r2, r3, r5, r7)
            if (r1 != 0) goto L3b
        L14:
            r1 = 1
            if (r0 == 0) goto L96
            int r2 = r0.length
            int r2 = r2 - r1
            if (r2 < 0) goto L96
            int r3 = p164j$.util.concurrent.ThreadLocalRandom.m17747b()
            r2 = r2 & r3
            r4 = r0[r2]
            if (r4 == 0) goto L96
            sun.misc.Unsafe r3 = p164j$.util.concurrent.ConcurrentHashMap.f22477U
            long r5 = p164j$.util.concurrent.ConcurrentHashMap.CELLVALUE
            long r7 = r4.value
            long r9 = r7 + r12
            boolean r0 = r3.compareAndSwapLong(r4, r5, r7, r9)
            if (r0 != 0) goto L34
            r1 = r0
            goto L96
        L34:
            if (r14 > r1) goto L37
            return
        L37:
            long r9 = r11.sumCount()
        L3b:
            if (r14 < 0) goto L95
        L3d:
            int r4 = r11.sizeCtl
            long r12 = (long) r4
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 < 0) goto L95
            j$.util.concurrent.m[] r12 = r11.table
            if (r12 == 0) goto L95
            int r13 = r12.length
            r14 = 1073741824(0x40000000, float:2.0)
            if (r13 >= r14) goto L95
            int r13 = resizeStamp(r13)
            if (r4 >= 0) goto L7c
            int r14 = p164j$.util.concurrent.ConcurrentHashMap.RESIZE_STAMP_SHIFT
            int r14 = r4 >>> r14
            if (r14 != r13) goto L95
            int r14 = r13 + 1
            if (r4 == r14) goto L95
            int r14 = p164j$.util.concurrent.ConcurrentHashMap.MAX_RESIZERS
            int r13 = r13 + r14
            if (r4 == r13) goto L95
            j$.util.concurrent.m[] r13 = r11.nextTable
            if (r13 == 0) goto L95
            int r14 = r11.transferIndex
            if (r14 > 0) goto L6b
            goto L95
        L6b:
            sun.misc.Unsafe r0 = p164j$.util.concurrent.ConcurrentHashMap.f22477U
            long r2 = p164j$.util.concurrent.ConcurrentHashMap.SIZECTL
            int r5 = r4 + 1
            r1 = r11
            boolean r14 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r14 == 0) goto L90
            r11.transfer(r12, r13)
            goto L90
        L7c:
            sun.misc.Unsafe r0 = p164j$.util.concurrent.ConcurrentHashMap.f22477U
            long r2 = p164j$.util.concurrent.ConcurrentHashMap.SIZECTL
            int r14 = p164j$.util.concurrent.ConcurrentHashMap.RESIZE_STAMP_SHIFT
            int r13 = r13 << r14
            int r5 = r13 + 2
            r1 = r11
            boolean r13 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r13 == 0) goto L90
            r13 = 0
            r11.transfer(r12, r13)
        L90:
            long r9 = r11.sumCount()
            goto L3d
        L95:
            return
        L96:
            r11.fullAddCount(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164j$.util.concurrent.ConcurrentHashMap.addCount(long, int):void");
    }

    static final <K, V> boolean casTabAt(C8398m[] c8398mArr, int i, C8398m c8398m, C8398m c8398m2) {
        return AbstractC8386a.m17739a(f22477U, c8398mArr, (i << ASHIFT) + ABASE, c8398m, c8398m2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> comparableClassFor(Object obj) {
        Type[] actualTypeArguments;
        if (obj instanceof Comparable) {
            Class<?> cls = obj.getClass();
            if (cls == String.class) {
                return cls;
            }
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces != null) {
                for (Type type : genericInterfaces) {
                    if (type instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) type;
                        if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                            return cls;
                        }
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int compareComparables(Class<?> cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x009d, code lost:
        if (r24.counterCells != r7) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009f, code lost:
        r1 = new p164j$.util.concurrent.C8389d[r8 << 1];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a4, code lost:
        if (r2 >= r8) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a6, code lost:
        r1[r2] = r7[r2];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ad, code lost:
        r24.counterCells = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void fullAddCount(long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p164j$.util.concurrent.ConcurrentHashMap.fullAddCount(long, boolean):void");
    }

    private final C8398m[] initTable() {
        while (true) {
            C8398m[] c8398mArr = this.table;
            if (c8398mArr != null && c8398mArr.length != 0) {
                return c8398mArr;
            }
            int i = this.sizeCtl;
            if (i < 0) {
                Thread.yield();
            } else if (f22477U.compareAndSwapInt(this, SIZECTL, i, -1)) {
                try {
                    C8398m[] c8398mArr2 = this.table;
                    if (c8398mArr2 == null || c8398mArr2.length == 0) {
                        int i2 = i > 0 ? i : 16;
                        C8398m[] c8398mArr3 = new C8398m[i2];
                        this.table = c8398mArr3;
                        i = i2 - (i2 >>> 2);
                        c8398mArr2 = c8398mArr3;
                    }
                    this.sizeCtl = i;
                    return c8398mArr2;
                } catch (Throwable th2) {
                    this.sizeCtl = i;
                    throw th2;
                }
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j;
        int tableSizeFor;
        boolean z;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j2 = 0;
        long j3 = 0;
        C8398m c8398m = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j3++;
            c8398m = new C8398m(spread(readObject.hashCode()), readObject, readObject2, c8398m);
        }
        if (j3 == 0) {
            this.sizeCtl = 0;
            return;
        }
        boolean z2 = true;
        if (j3 >= 536870912) {
            tableSizeFor = MAXIMUM_CAPACITY;
        } else {
            int i = (int) j3;
            tableSizeFor = tableSizeFor(i + (i >>> 1) + 1);
        }
        C8398m[] c8398mArr = new C8398m[tableSizeFor];
        int i2 = tableSizeFor - 1;
        while (c8398m != null) {
            C8398m c8398m2 = c8398m.f22500d;
            int i3 = c8398m.f22497a;
            int i4 = i3 & i2;
            C8398m tabAt = tabAt(c8398mArr, i4);
            if (tabAt == null) {
                z = z2;
            } else {
                Object obj2 = c8398m.f22498b;
                if (tabAt.f22497a >= 0) {
                    int i5 = 0;
                    for (C8398m c8398m3 = tabAt; c8398m3 != null; c8398m3 = c8398m3.f22500d) {
                        if (c8398m3.f22497a == i3 && ((obj = c8398m3.f22498b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        }
                        i5++;
                    }
                    z = true;
                    if (z && i5 >= 8) {
                        long j4 = j2 + 1;
                        c8398m.f22500d = tabAt;
                        C8398m c8398m4 = c8398m;
                        C8404s c8404s = null;
                        C8404s c8404s2 = null;
                        while (c8398m4 != null) {
                            long j5 = j4;
                            C8404s c8404s3 = new C8404s(c8398m4.f22497a, c8398m4.f22498b, c8398m4.f22499c, null, null);
                            c8404s3.f22521h = c8404s2;
                            if (c8404s2 == null) {
                                c8404s = c8404s3;
                            } else {
                                c8404s2.f22500d = c8404s3;
                            }
                            c8398m4 = c8398m4.f22500d;
                            c8404s2 = c8404s3;
                            j4 = j5;
                        }
                        setTabAt(c8398mArr, i4, new C8403r(c8404s));
                        j2 = j4;
                    }
                } else if (((C8403r) tabAt).m17733f(i3, obj2, c8398m.f22499c) == null) {
                    j2 += j;
                }
                z = false;
            }
            if (z) {
                j2++;
                c8398m.f22500d = tabAt;
                setTabAt(c8398mArr, i4, c8398m);
            }
            j = 1;
            c8398m = c8398m2;
            z2 = true;
        }
        this.table = c8398mArr;
        this.sizeCtl = tableSizeFor - (tableSizeFor >>> 2);
        this.baseCount = j2;
    }

    static final int resizeStamp(int i) {
        return Integer.numberOfLeadingZeros(i) | (1 << (RESIZE_STAMP_BITS - 1));
    }

    static final <K, V> void setTabAt(C8398m[] c8398mArr, int i, C8398m c8398m) {
        f22477U.putObjectVolatile(c8398mArr, (i << ASHIFT) + ABASE, c8398m);
    }

    static final int spread(int i) {
        return (i ^ (i >>> 16)) & Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final <K, V> C8398m tabAt(C8398m[] c8398mArr, int i) {
        return (C8398m) f22477U.getObjectVolatile(c8398mArr, (i << ASHIFT) + ABASE);
    }

    private static final int tableSizeFor(int i) {
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        if (i7 < 0) {
            return 1;
        }
        return i7 >= MAXIMUM_CAPACITY ? MAXIMUM_CAPACITY : 1 + i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v15, types: [j$.util.concurrent.m] */
    /* JADX WARN: Type inference failed for: r15v17, types: [j$.util.concurrent.m] */
    /* JADX WARN: Type inference failed for: r6v17, types: [j$.util.concurrent.m] */
    /* JADX WARN: Type inference failed for: r6v22, types: [j$.util.concurrent.m] */
    private final void transfer(C8398m[] c8398mArr, C8398m[] c8398mArr2) {
        C8398m[] c8398mArr3;
        ConcurrentHashMap<K, V> concurrentHashMap;
        C8398m[] c8398mArr4;
        int i;
        int i2;
        C8393h c8393h;
        boolean z;
        ConcurrentHashMap<K, V> concurrentHashMap2;
        int i3;
        C8404s c8404s;
        C8404s c8404s2;
        boolean z2;
        ConcurrentHashMap<K, V> concurrentHashMap3 = this;
        int length = c8398mArr.length;
        int i4 = NCPU;
        boolean z3 = true;
        int i5 = i4 > 1 ? (length >>> 3) / i4 : length;
        int i6 = i5 < 16 ? 16 : i5;
        if (c8398mArr2 == null) {
            try {
                C8398m[] c8398mArr5 = new C8398m[length << 1];
                concurrentHashMap3.nextTable = c8398mArr5;
                concurrentHashMap3.transferIndex = length;
                c8398mArr3 = c8398mArr5;
            } catch (Throwable unused) {
                concurrentHashMap3.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            c8398mArr3 = c8398mArr2;
        }
        int length2 = c8398mArr3.length;
        C8393h c8393h2 = new C8393h(c8398mArr3);
        C8398m[] c8398mArr6 = c8398mArr;
        ConcurrentHashMap<K, V> concurrentHashMap4 = concurrentHashMap3;
        boolean z4 = true;
        int i7 = 0;
        int i8 = 0;
        boolean z5 = false;
        while (true) {
            if (z4) {
                int i9 = i7 - 1;
                if (i9 >= i8 || z5) {
                    concurrentHashMap = concurrentHashMap4;
                    c8398mArr4 = c8398mArr6;
                    i7 = i9;
                    i8 = i8;
                } else {
                    int i10 = concurrentHashMap4.transferIndex;
                    if (i10 <= 0) {
                        i7 = -1;
                        concurrentHashMap = concurrentHashMap4;
                        c8398mArr4 = c8398mArr6;
                    } else {
                        Unsafe unsafe = f22477U;
                        long j = TRANSFERINDEX;
                        int i11 = i10 > i6 ? i10 - i6 : 0;
                        concurrentHashMap = concurrentHashMap4;
                        c8398mArr4 = c8398mArr6;
                        int i12 = i8;
                        if (unsafe.compareAndSwapInt(this, j, i10, i11)) {
                            i7 = i10 - 1;
                            i8 = i11;
                        } else {
                            c8398mArr6 = c8398mArr4;
                            i7 = i9;
                            i8 = i12;
                            concurrentHashMap4 = concurrentHashMap;
                        }
                    }
                }
                c8398mArr6 = c8398mArr4;
                concurrentHashMap4 = concurrentHashMap;
                z4 = false;
            } else {
                ConcurrentHashMap<K, V> concurrentHashMap5 = concurrentHashMap4;
                C8398m[] c8398mArr7 = c8398mArr6;
                int i13 = i8;
                C8404s c8404s3 = null;
                if (i7 < 0 || i7 >= length || (i3 = i7 + length) >= length2) {
                    i = i6;
                    i2 = length2;
                    c8393h = c8393h2;
                    if (z5) {
                        this.nextTable = null;
                        this.table = c8398mArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    z = true;
                    concurrentHashMap2 = this;
                    Unsafe unsafe2 = f22477U;
                    long j2 = SIZECTL;
                    int i14 = concurrentHashMap2.sizeCtl;
                    int i15 = i7;
                    if (!unsafe2.compareAndSwapInt(this, j2, i14, i14 - 1)) {
                        concurrentHashMap4 = concurrentHashMap2;
                        c8398mArr6 = c8398mArr7;
                        i7 = i15;
                    } else if (i14 + TREEBIN != (resizeStamp(length) << RESIZE_STAMP_SHIFT)) {
                        return;
                    } else {
                        i7 = length;
                        concurrentHashMap4 = concurrentHashMap2;
                        z4 = true;
                        z5 = true;
                        c8398mArr6 = c8398mArr7;
                    }
                } else {
                    C8398m tabAt = tabAt(c8398mArr7, i7);
                    if (tabAt == null) {
                        z2 = casTabAt(c8398mArr7, i7, null, c8393h2);
                    } else {
                        int i16 = tabAt.f22497a;
                        if (i16 == -1) {
                            z2 = z3;
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(c8398mArr7, i7) == tabAt) {
                                    if (i16 >= 0) {
                                        int i17 = i16 & length;
                                        C8404s c8404s4 = tabAt;
                                        for (C8404s c8404s5 = tabAt.f22500d; c8404s5 != null; c8404s5 = c8404s5.f22500d) {
                                            int i18 = c8404s5.f22497a & length;
                                            if (i18 != i17) {
                                                c8404s4 = c8404s5;
                                                i17 = i18;
                                            }
                                        }
                                        if (i17 == 0) {
                                            c8404s = c8404s4;
                                        } else {
                                            c8404s = null;
                                            c8404s3 = c8404s4;
                                        }
                                        C8398m c8398m = tabAt;
                                        while (c8398m != c8404s4) {
                                            int i19 = c8398m.f22497a;
                                            int i20 = i6;
                                            Object obj = c8398m.f22498b;
                                            int i21 = length2;
                                            Object obj2 = c8398m.f22499c;
                                            if ((i19 & length) == 0) {
                                                c8404s2 = c8404s4;
                                                c8404s = new C8398m(i19, obj, obj2, c8404s);
                                            } else {
                                                c8404s2 = c8404s4;
                                                c8404s3 = new C8398m(i19, obj, obj2, c8404s3);
                                            }
                                            c8398m = c8398m.f22500d;
                                            i6 = i20;
                                            length2 = i21;
                                            c8404s4 = c8404s2;
                                        }
                                        i = i6;
                                        i2 = length2;
                                        setTabAt(c8398mArr3, i7, c8404s);
                                        setTabAt(c8398mArr3, i3, c8404s3);
                                        setTabAt(c8398mArr7, i7, c8393h2);
                                        c8393h = c8393h2;
                                    } else {
                                        i = i6;
                                        i2 = length2;
                                        if (tabAt instanceof C8403r) {
                                            C8403r c8403r = (C8403r) tabAt;
                                            C8404s c8404s6 = null;
                                            C8404s c8404s7 = null;
                                            C8398m c8398m2 = c8403r.f22516f;
                                            int i22 = 0;
                                            int i23 = 0;
                                            C8404s c8404s8 = null;
                                            while (c8398m2 != null) {
                                                C8403r c8403r2 = c8403r;
                                                int i24 = c8398m2.f22497a;
                                                C8393h c8393h3 = c8393h2;
                                                C8404s c8404s9 = new C8404s(i24, c8398m2.f22498b, c8398m2.f22499c, null, null);
                                                if ((i24 & length) == 0) {
                                                    c8404s9.f22521h = c8404s7;
                                                    if (c8404s7 == null) {
                                                        c8404s3 = c8404s9;
                                                    } else {
                                                        c8404s7.f22500d = c8404s9;
                                                    }
                                                    i22++;
                                                    c8404s7 = c8404s9;
                                                } else {
                                                    c8404s9.f22521h = c8404s6;
                                                    if (c8404s6 == null) {
                                                        c8404s8 = c8404s9;
                                                    } else {
                                                        c8404s6.f22500d = c8404s9;
                                                    }
                                                    i23++;
                                                    c8404s6 = c8404s9;
                                                }
                                                c8398m2 = c8398m2.f22500d;
                                                c8403r = c8403r2;
                                                c8393h2 = c8393h3;
                                            }
                                            C8403r c8403r3 = c8403r;
                                            C8393h c8393h4 = c8393h2;
                                            C8398m untreeify = i22 <= 6 ? untreeify(c8404s3) : i23 != 0 ? new C8403r(c8404s3) : c8403r3;
                                            C8398m untreeify2 = i23 <= 6 ? untreeify(c8404s8) : i22 != 0 ? new C8403r(c8404s8) : c8403r3;
                                            setTabAt(c8398mArr3, i7, untreeify);
                                            setTabAt(c8398mArr3, i3, untreeify2);
                                            c8393h = c8393h4;
                                            setTabAt(c8398mArr, i7, c8393h);
                                            c8398mArr7 = c8398mArr;
                                        }
                                    }
                                    z4 = true;
                                } else {
                                    i = i6;
                                    i2 = length2;
                                }
                                c8393h = c8393h2;
                            }
                            concurrentHashMap4 = this;
                            c8398mArr6 = c8398mArr7;
                            z = true;
                            concurrentHashMap2 = concurrentHashMap4;
                        }
                    }
                    z4 = z2;
                    i = i6;
                    i2 = length2;
                    c8398mArr6 = c8398mArr7;
                    concurrentHashMap4 = concurrentHashMap5;
                    z = z3;
                    concurrentHashMap2 = concurrentHashMap3;
                    c8393h = c8393h2;
                }
                c8393h2 = c8393h;
                concurrentHashMap3 = concurrentHashMap2;
                z3 = z;
                i8 = i13;
                i6 = i;
                length2 = i2;
            }
        }
    }

    private final void treeifyBin(C8398m[] c8398mArr, int i) {
        if (c8398mArr != null) {
            int length = c8398mArr.length;
            if (length < 64) {
                tryPresize(length << 1);
                return;
            }
            C8398m tabAt = tabAt(c8398mArr, i);
            if (tabAt == null || tabAt.f22497a < 0) {
                return;
            }
            synchronized (tabAt) {
                if (tabAt(c8398mArr, i) == tabAt) {
                    C8404s c8404s = null;
                    C8398m c8398m = tabAt;
                    C8404s c8404s2 = null;
                    while (c8398m != null) {
                        C8404s c8404s3 = new C8404s(c8398m.f22497a, c8398m.f22498b, c8398m.f22499c, null, null);
                        c8404s3.f22521h = c8404s2;
                        if (c8404s2 == null) {
                            c8404s = c8404s3;
                        } else {
                            c8404s2.f22500d = c8404s3;
                        }
                        c8398m = c8398m.f22500d;
                        c8404s2 = c8404s3;
                    }
                    setTabAt(c8398mArr, i, new C8403r(c8404s));
                }
            }
        }
    }

    private final void tryPresize(int i) {
        int length;
        C8398m[] c8398mArr;
        int tableSizeFor = i >= 536870912 ? MAXIMUM_CAPACITY : tableSizeFor(i + (i >>> 1) + 1);
        while (true) {
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                return;
            }
            C8398m[] c8398mArr2 = this.table;
            if (c8398mArr2 == null || (length = c8398mArr2.length) == 0) {
                int i3 = i2 > tableSizeFor ? i2 : tableSizeFor;
                if (f22477U.compareAndSwapInt(this, SIZECTL, i2, -1)) {
                    try {
                        if (this.table == c8398mArr2) {
                            this.table = new C8398m[i3];
                            i2 = i3 - (i3 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i2;
                    }
                } else {
                    continue;
                }
            } else if (tableSizeFor <= i2 || length >= MAXIMUM_CAPACITY) {
                return;
            } else {
                if (c8398mArr2 == this.table) {
                    int resizeStamp = resizeStamp(length);
                    if (i2 < 0) {
                        if ((i2 >>> RESIZE_STAMP_SHIFT) != resizeStamp || i2 == resizeStamp + 1 || i2 == resizeStamp + MAX_RESIZERS || (c8398mArr = this.nextTable) == null || this.transferIndex <= 0) {
                            return;
                        }
                        if (f22477U.compareAndSwapInt(this, SIZECTL, i2, i2 + 1)) {
                            transfer(c8398mArr2, c8398mArr);
                        }
                    } else if (f22477U.compareAndSwapInt(this, SIZECTL, i2, (resizeStamp << RESIZE_STAMP_SHIFT) + 2)) {
                        transfer(c8398mArr2, null);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    static <K, V> C8398m untreeify(C8398m c8398m) {
        C8398m c8398m2 = null;
        C8398m c8398m3 = null;
        while (c8398m != null) {
            C8398m c8398m4 = new C8398m(c8398m.f22497a, c8398m.f22498b, c8398m.f22499c, null);
            if (c8398m3 == null) {
                c8398m2 = c8398m4;
            } else {
                c8398m3.f22500d = c8398m4;
            }
            c8398m = c8398m.f22500d;
            c8398m3 = c8398m4;
        }
        return c8398m2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i = 0;
        int i2 = 1;
        while (i2 < 16) {
            i++;
            i2 <<= 1;
        }
        int i3 = 32 - i;
        int i4 = i2 - 1;
        C8400o[] c8400oArr = new C8400o[16];
        for (int i5 = 0; i5 < 16; i5++) {
            c8400oArr[i5] = new C8400o();
        }
        objectOutputStream.putFields().put("segments", c8400oArr);
        objectOutputStream.putFields().put("segmentShift", i3);
        objectOutputStream.putFields().put("segmentMask", i4);
        objectOutputStream.writeFields();
        C8398m[] c8398mArr = this.table;
        if (c8398mArr != null) {
            C8402q c8402q = new C8402q(c8398mArr, c8398mArr.length, 0, c8398mArr.length);
            while (true) {
                C8398m m17738e = c8402q.m17738e();
                if (m17738e == null) {
                    break;
                }
                objectOutputStream.writeObject(m17738e.f22498b);
                objectOutputStream.writeObject(m17738e.f22499c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map, p164j$.util.Map
    public void clear() {
        C8398m tabAt;
        C8398m[] c8398mArr = this.table;
        long j = 0;
        loop0: while (true) {
            int i = 0;
            while (c8398mArr != null && i < c8398mArr.length) {
                tabAt = tabAt(c8398mArr, i);
                if (tabAt == null) {
                    i++;
                } else {
                    int i2 = tabAt.f22497a;
                    if (i2 == -1) {
                        break;
                    }
                    synchronized (tabAt) {
                        if (tabAt(c8398mArr, i) == tabAt) {
                            for (C8398m c8398m = i2 >= 0 ? tabAt : tabAt instanceof C8403r ? ((C8403r) tabAt).f22516f : null; c8398m != null; c8398m = c8398m.f22500d) {
                                j--;
                            }
                            setTabAt(c8398mArr, i, null);
                            i++;
                        }
                    }
                }
            }
            c8398mArr = helpTransfer(c8398mArr, tabAt);
        }
        if (j != 0) {
            addCount(j, -1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [j$.util.concurrent.r] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    @Override // p164j$.util.Map
    public V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        int i;
        C8398m c8398m;
        Object obj;
        Object obj2;
        if (k == null || biFunction == null) {
            throw null;
        }
        int spread = spread(k.hashCode());
        C8398m[] c8398mArr = this.table;
        int i2 = 0;
        V v = null;
        int i3 = 0;
        while (true) {
            if (c8398mArr != null) {
                int length = c8398mArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & spread;
                    C8398m tabAt = tabAt(c8398mArr, i4);
                    if (tabAt == null) {
                        C8399n c8399n = new C8399n();
                        synchronized (c8399n) {
                            if (casTabAt(c8398mArr, i4, null, c8399n)) {
                                ?? apply = biFunction.apply(k, null);
                                if (apply != 0) {
                                    c8398m = new C8398m(spread, k, apply, null);
                                    i = 1;
                                } else {
                                    i = i3;
                                    c8398m = null;
                                }
                                setTabAt(c8398mArr, i4, c8398m);
                                i3 = i;
                                v = apply;
                                i2 = 1;
                            }
                        }
                        if (i2 != 0) {
                            break;
                        }
                    } else {
                        int i5 = tabAt.f22497a;
                        if (i5 == -1) {
                            c8398mArr = helpTransfer(c8398mArr, tabAt);
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(c8398mArr, i4) == tabAt) {
                                    if (i5 >= 0) {
                                        C8398m c8398m2 = null;
                                        C8398m c8398m3 = tabAt;
                                        i2 = 1;
                                        while (true) {
                                            if (c8398m3.f22497a != spread || ((obj2 = c8398m3.f22498b) != k && (obj2 == null || !k.equals(obj2)))) {
                                                C8398m c8398m4 = c8398m3.f22500d;
                                                if (c8398m4 == null) {
                                                    Object apply2 = biFunction.apply(k, null);
                                                    if (apply2 != null) {
                                                        c8398m3.f22500d = new C8398m(spread, k, apply2, null);
                                                        i3 = 1;
                                                    }
                                                    obj = apply2;
                                                } else {
                                                    i2++;
                                                    c8398m2 = c8398m3;
                                                    c8398m3 = c8398m4;
                                                }
                                            }
                                        }
                                        obj = biFunction.apply(k, c8398m3.f22499c);
                                        if (obj != null) {
                                            c8398m3.f22499c = obj;
                                        } else {
                                            C8398m c8398m5 = c8398m3.f22500d;
                                            if (c8398m2 != null) {
                                                c8398m2.f22500d = c8398m5;
                                            } else {
                                                setTabAt(c8398mArr, i4, c8398m5);
                                            }
                                            i3 = -1;
                                        }
                                        v = obj;
                                    } else if (tabAt instanceof C8403r) {
                                        ?? r3 = (C8403r) tabAt;
                                        C8404s c8404s = r3.f22515e;
                                        C8404s m17727b = c8404s != null ? c8404s.m17727b(spread, k, null) : null;
                                        ?? apply3 = biFunction.apply(k, m17727b == null ? null : m17727b.f22499c);
                                        if (apply3 != 0) {
                                            if (m17727b != null) {
                                                m17727b.f22499c = apply3;
                                            } else {
                                                r3.m17733f(spread, k, apply3);
                                                i2 = 1;
                                                i3 = 1;
                                                v = apply3;
                                            }
                                        } else if (m17727b != null) {
                                            if (r3.m17732g(m17727b)) {
                                                setTabAt(c8398mArr, i4, untreeify(r3.f22516f));
                                            }
                                            i2 = 1;
                                            v = apply3;
                                            i3 = -1;
                                        }
                                        i2 = 1;
                                        v = apply3;
                                    }
                                }
                            }
                            if (i2 != 0) {
                                if (i2 >= 8) {
                                    treeifyBin(c8398mArr, i4);
                                }
                            }
                        }
                    }
                }
            }
            c8398mArr = initTable();
        }
        if (i3 != 0) {
            addCount(i3, i2);
        }
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute((ConcurrentHashMap<K, V>) obj, (BiFunction<? super ConcurrentHashMap<K, V>, ? super V, ? extends V>) BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // p164j$.util.Map
    public V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        C8404s m17727b;
        Object obj;
        Object obj2;
        if (k == null || function == null) {
            throw null;
        }
        int spread = spread(k.hashCode());
        C8398m[] c8398mArr = this.table;
        V v = null;
        int i = 0;
        while (true) {
            if (c8398mArr != null) {
                int length = c8398mArr.length;
                if (length != 0) {
                    int i2 = (length - 1) & spread;
                    C8398m tabAt = tabAt(c8398mArr, i2);
                    boolean z = true;
                    if (tabAt == null) {
                        C8399n c8399n = new C8399n();
                        synchronized (c8399n) {
                            if (casTabAt(c8398mArr, i2, null, c8399n)) {
                                Object apply = function.apply(k);
                                setTabAt(c8398mArr, i2, apply != null ? new C8398m(spread, k, apply, null) : null);
                                v = (V) apply;
                                i = 1;
                            }
                        }
                        if (i != 0) {
                            break;
                        }
                    } else {
                        int i3 = tabAt.f22497a;
                        if (i3 == -1) {
                            c8398mArr = helpTransfer(c8398mArr, tabAt);
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(c8398mArr, i2) == tabAt) {
                                    if (i3 >= 0) {
                                        C8398m c8398m = tabAt;
                                        int i4 = 1;
                                        while (true) {
                                            if (c8398m.f22497a != spread || ((obj2 = c8398m.f22498b) != k && (obj2 == null || !k.equals(obj2)))) {
                                                C8398m c8398m2 = c8398m.f22500d;
                                                if (c8398m2 == null) {
                                                    Object apply2 = function.apply(k);
                                                    if (apply2 != null) {
                                                        c8398m.f22500d = new C8398m(spread, k, apply2, null);
                                                    } else {
                                                        z = false;
                                                    }
                                                    obj = apply2;
                                                } else {
                                                    i4++;
                                                    c8398m = c8398m2;
                                                }
                                            }
                                        }
                                        obj = c8398m.f22499c;
                                        z = false;
                                        int i5 = i4;
                                        v = (V) obj;
                                        i = i5;
                                    } else if (tabAt instanceof C8403r) {
                                        C8403r c8403r = (C8403r) tabAt;
                                        C8404s c8404s = c8403r.f22515e;
                                        if (c8404s == null || (m17727b = c8404s.m17727b(spread, k, null)) == null) {
                                            v = function.apply(k);
                                            if (v != null) {
                                                c8403r.m17733f(spread, k, v);
                                            } else {
                                                z = false;
                                            }
                                        } else {
                                            z = false;
                                            v = (V) m17727b.f22499c;
                                        }
                                        i = 2;
                                    }
                                }
                                z = false;
                            }
                            if (i != 0) {
                                if (i >= 8) {
                                    treeifyBin(c8398mArr, i2);
                                }
                                if (!z) {
                                    return (V) v;
                                }
                            }
                        }
                    }
                }
            }
            c8398mArr = initTable();
        }
        if (v != null) {
            addCount(1L, i);
        }
        return (V) v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent((ConcurrentHashMap<K, V>) obj, (Function<? super ConcurrentHashMap<K, V>, ? extends V>) Function.VivifiedWrapper.convert(function));
    }

    @Override // p164j$.util.Map
    public V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        C8404s m17727b;
        Object obj;
        if (k == null || biFunction == null) {
            throw null;
        }
        int spread = spread(k.hashCode());
        C8398m[] c8398mArr = this.table;
        int i = 0;
        V v = null;
        int i2 = 0;
        while (true) {
            if (c8398mArr != null) {
                int length = c8398mArr.length;
                if (length != 0) {
                    int i3 = (length - 1) & spread;
                    C8398m tabAt = tabAt(c8398mArr, i3);
                    if (tabAt == null) {
                        break;
                    }
                    int i4 = tabAt.f22497a;
                    if (i4 == -1) {
                        c8398mArr = helpTransfer(c8398mArr, tabAt);
                    } else {
                        synchronized (tabAt) {
                            if (tabAt(c8398mArr, i3) == tabAt) {
                                if (i4 >= 0) {
                                    i2 = 1;
                                    C8398m c8398m = null;
                                    C8398m c8398m2 = tabAt;
                                    while (true) {
                                        if (c8398m2.f22497a != spread || ((obj = c8398m2.f22498b) != k && (obj == null || !k.equals(obj)))) {
                                            C8398m c8398m3 = c8398m2.f22500d;
                                            if (c8398m3 == null) {
                                                break;
                                            }
                                            i2++;
                                            c8398m = c8398m2;
                                            c8398m2 = c8398m3;
                                        }
                                    }
                                    v = (V) biFunction.apply(k, c8398m2.f22499c);
                                    if (v != null) {
                                        c8398m2.f22499c = v;
                                    } else {
                                        C8398m c8398m4 = c8398m2.f22500d;
                                        if (c8398m != null) {
                                            c8398m.f22500d = c8398m4;
                                        } else {
                                            setTabAt(c8398mArr, i3, c8398m4);
                                        }
                                        i = -1;
                                    }
                                } else if (tabAt instanceof C8403r) {
                                    C8403r c8403r = (C8403r) tabAt;
                                    C8404s c8404s = c8403r.f22515e;
                                    if (c8404s != null && (m17727b = c8404s.m17727b(spread, k, null)) != null) {
                                        v = (V) biFunction.apply(k, m17727b.f22499c);
                                        if (v != null) {
                                            m17727b.f22499c = v;
                                        } else {
                                            if (c8403r.m17732g(m17727b)) {
                                                setTabAt(c8398mArr, i3, untreeify(c8403r.f22516f));
                                            }
                                            i = -1;
                                        }
                                    }
                                    i2 = 2;
                                }
                            }
                        }
                        if (i2 != 0) {
                            break;
                        }
                    }
                }
            }
            c8398mArr = initTable();
        }
        if (i != 0) {
            addCount(i, i2);
        }
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent((ConcurrentHashMap<K, V>) obj, (BiFunction<? super ConcurrentHashMap<K, V>, ? super V, ? extends V>) BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map, p164j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map, p164j$.util.Map
    public boolean containsValue(Object obj) {
        obj.getClass();
        C8398m[] c8398mArr = this.table;
        if (c8398mArr != null) {
            C8402q c8402q = new C8402q(c8398mArr, c8398mArr.length, 0, c8398mArr.length);
            while (true) {
                C8398m m17738e = c8402q.m17738e();
                if (m17738e == null) {
                    break;
                }
                Object obj2 = m17738e.f22499c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Enumeration<V> elements() {
        C8398m[] c8398mArr = this.table;
        int length = c8398mArr == null ? 0 : c8398mArr.length;
        return new C8394i(c8398mArr, length, length, this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map, p164j$.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C8391f c8391f = this.entrySet;
        if (c8391f != null) {
            return c8391f;
        }
        C8391f c8391f2 = new C8391f(this);
        this.entrySet = c8391f2;
        return c8391f2;
    }

    @Override // java.util.AbstractMap, java.util.Map, p164j$.util.Map
    public boolean equals(Object obj) {
        V value;
        V v;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                C8398m[] c8398mArr = this.table;
                int length = c8398mArr == null ? 0 : c8398mArr.length;
                C8402q c8402q = new C8402q(c8398mArr, length, 0, length);
                while (true) {
                    C8398m m17738e = c8402q.m17738e();
                    if (m17738e == null) {
                        for (Map.Entry<K, V> entry : map.entrySet()) {
                            K key = entry.getKey();
                            if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null || (value != v && !value.equals(v))) {
                                return false;
                            }
                        }
                        return true;
                    }
                    Object obj2 = m17738e.f22499c;
                    Object obj3 = map.get(m17738e.f22498b);
                    if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                        break;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // p164j$.util.concurrent.InterfaceC8407v, p164j$.util.Map
    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        biConsumer.getClass();
        C8398m[] c8398mArr = this.table;
        if (c8398mArr == null) {
            return;
        }
        C8402q c8402q = new C8402q(c8398mArr, c8398mArr.length, 0, c8398mArr.length);
        while (true) {
            C8398m m17738e = c8402q.m17738e();
            if (m17738e == null) {
                return;
            }
            biConsumer.accept(m17738e.f22498b, m17738e.f22499c);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
        return (V) r1.f22499c;
     */
    @Override // java.util.AbstractMap, java.util.Map, p164j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = spread(r0)
            j$.util.concurrent.m[] r1 = r4.table
            r2 = 0
            if (r1 == 0) goto L4e
            int r3 = r1.length
            if (r3 <= 0) goto L4e
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.m r1 = tabAt(r1, r3)
            if (r1 == 0) goto L4e
            int r3 = r1.f22497a
            if (r3 != r0) goto L2c
            java.lang.Object r3 = r1.f22498b
            if (r3 == r5) goto L29
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L29:
            java.lang.Object r5 = r1.f22499c
            return r5
        L2c:
            if (r3 >= 0) goto L37
            j$.util.concurrent.m r5 = r1.mo17728a(r0, r5)
            if (r5 == 0) goto L36
            java.lang.Object r2 = r5.f22499c
        L36:
            return r2
        L37:
            j$.util.concurrent.m r1 = r1.f22500d
            if (r1 == 0) goto L4e
            int r3 = r1.f22497a
            if (r3 != r0) goto L37
            java.lang.Object r3 = r1.f22498b
            if (r3 == r5) goto L4b
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L4b:
            java.lang.Object r5 = r1.f22499c
            return r5
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p164j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p164j$.util.Map
    public V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 == null ? v : v2;
    }

    @Override // java.util.AbstractMap, java.util.Map, p164j$.util.Map
    public int hashCode() {
        C8398m[] c8398mArr = this.table;
        int i = 0;
        if (c8398mArr != null) {
            C8402q c8402q = new C8402q(c8398mArr, c8398mArr.length, 0, c8398mArr.length);
            while (true) {
                C8398m m17738e = c8402q.m17738e();
                if (m17738e == null) {
                    break;
                }
                i += m17738e.f22499c.hashCode() ^ m17738e.f22498b.hashCode();
            }
        }
        return i;
    }

    final C8398m[] helpTransfer(C8398m[] c8398mArr, C8398m c8398m) {
        C8398m[] c8398mArr2;
        int i;
        if (c8398mArr == null || !(c8398m instanceof C8393h) || (c8398mArr2 = ((C8393h) c8398m).f22490e) == null) {
            return this.table;
        }
        int resizeStamp = resizeStamp(c8398mArr.length);
        while (true) {
            if (c8398mArr2 != this.nextTable || this.table != c8398mArr || (i = this.sizeCtl) >= 0 || (i >>> RESIZE_STAMP_SHIFT) != resizeStamp || i == resizeStamp + 1 || i == MAX_RESIZERS + resizeStamp || this.transferIndex <= 0) {
                break;
            } else if (f22477U.compareAndSwapInt(this, SIZECTL, i, i + 1)) {
                transfer(c8398mArr, c8398mArr2);
                break;
            }
        }
        return c8398mArr2;
    }

    @Override // java.util.AbstractMap, java.util.Map, p164j$.util.Map
    public boolean isEmpty() {
        return sumCount() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map, p164j$.util.Map
    public Set<K> keySet() {
        C8395j c8395j = this.keySet;
        if (c8395j != null) {
            return c8395j;
        }
        C8395j c8395j2 = new C8395j(this);
        this.keySet = c8395j2;
        return c8395j2;
    }

    public Enumeration<K> keys() {
        C8398m[] c8398mArr = this.table;
        int length = c8398mArr == null ? 0 : c8398mArr.length;
        return new C8394i(c8398mArr, length, length, this, 0);
    }

    public long mappingCount() {
        long sumCount = sumCount();
        if (sumCount < 0) {
            return 0L;
        }
        return sumCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p164j$.util.Map
    public V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        int i;
        V v2;
        Object obj;
        V v3 = v;
        if (k == null || v3 == null || biFunction == null) {
            throw null;
        }
        int spread = spread(k.hashCode());
        C8398m[] c8398mArr = this.table;
        int i2 = 0;
        V v4 = null;
        int i3 = 0;
        while (true) {
            if (c8398mArr != null) {
                int length = c8398mArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & spread;
                    C8398m tabAt = tabAt(c8398mArr, i4);
                    i = 1;
                    if (tabAt != null) {
                        int i5 = tabAt.f22497a;
                        if (i5 == -1) {
                            c8398mArr = helpTransfer(c8398mArr, tabAt);
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(c8398mArr, i4) == tabAt) {
                                    if (i5 >= 0) {
                                        C8398m c8398m = null;
                                        C8398m c8398m2 = tabAt;
                                        int i6 = 1;
                                        while (true) {
                                            if (c8398m2.f22497a != spread || ((obj = c8398m2.f22498b) != k && (obj == null || !k.equals(obj)))) {
                                                C8398m c8398m3 = c8398m2.f22500d;
                                                if (c8398m3 == null) {
                                                    c8398m2.f22500d = new C8398m(spread, k, v3, null);
                                                    i3 = 1;
                                                    v2 = v3;
                                                    break;
                                                }
                                                i6++;
                                                c8398m = c8398m2;
                                                c8398m2 = c8398m3;
                                            }
                                        }
                                        Object apply = biFunction.apply(c8398m2.f22499c, v3);
                                        if (apply != 0) {
                                            c8398m2.f22499c = apply;
                                            v2 = apply;
                                        } else {
                                            C8398m c8398m4 = c8398m2.f22500d;
                                            if (c8398m != null) {
                                                c8398m.f22500d = c8398m4;
                                            } else {
                                                setTabAt(c8398mArr, i4, c8398m4);
                                            }
                                            i3 = -1;
                                            v2 = apply;
                                        }
                                        i2 = i6;
                                        v4 = v2;
                                    } else if (tabAt instanceof C8403r) {
                                        C8403r c8403r = (C8403r) tabAt;
                                        C8404s c8404s = c8403r.f22515e;
                                        C8404s m17727b = c8404s == null ? null : c8404s.m17727b(spread, k, null);
                                        V apply2 = m17727b == null ? v3 : biFunction.apply(m17727b.f22499c, v3);
                                        if (apply2 != null) {
                                            if (m17727b != null) {
                                                m17727b.f22499c = apply2;
                                            } else {
                                                c8403r.m17733f(spread, k, apply2);
                                                i3 = 1;
                                            }
                                        } else if (m17727b != null) {
                                            if (c8403r.m17732g(m17727b)) {
                                                setTabAt(c8398mArr, i4, untreeify(c8403r.f22516f));
                                            }
                                            v4 = apply2;
                                            i3 = -1;
                                            i2 = 2;
                                        }
                                        v4 = apply2;
                                        i2 = 2;
                                    }
                                }
                            }
                            if (i2 != 0) {
                                if (i2 >= 8) {
                                    treeifyBin(c8398mArr, i4);
                                }
                                i = i3;
                                v3 = v4;
                            }
                        }
                    } else if (casTabAt(c8398mArr, i4, null, new C8398m(spread, k, v3, null))) {
                        break;
                    }
                }
            }
            c8398mArr = initTable();
        }
        if (i != 0) {
            addCount(i, i2);
        }
        return v3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge((ConcurrentHashMap<K, V>) obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, p164j$.util.Map
    public V put(K k, V v) {
        return putVal(k, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map, p164j$.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        tryPresize(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            putVal(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p164j$.util.Map
    public V putIfAbsent(K k, V v) {
        return putVal(k, v, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
        r7 = (V) r6.f22499c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
        if (r11 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
        r6.f22499c = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V putVal(K r9, V r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L9e
            if (r10 == 0) goto L9e
            int r1 = r9.hashCode()
            int r1 = spread(r1)
            j$.util.concurrent.m[] r2 = r8.table
            r3 = 0
        L10:
            if (r2 == 0) goto L98
            int r4 = r2.length
            if (r4 != 0) goto L17
            goto L98
        L17:
            int r4 = r4 + (-1)
            r4 = r4 & r1
            j$.util.concurrent.m r5 = tabAt(r2, r4)
            if (r5 != 0) goto L2d
            j$.util.concurrent.m r5 = new j$.util.concurrent.m
            r5.<init>(r1, r9, r10, r0)
            boolean r4 = casTabAt(r2, r4, r0, r5)
            if (r4 == 0) goto L10
            goto L8f
        L2d:
            int r6 = r5.f22497a
            r7 = -1
            if (r6 != r7) goto L37
            j$.util.concurrent.m[] r2 = r8.helpTransfer(r2, r5)
            goto L10
        L37:
            monitor-enter(r5)
            j$.util.concurrent.m r7 = tabAt(r2, r4)     // Catch: java.lang.Throwable -> L95
            if (r7 != r5) goto L81
            if (r6 < 0) goto L69
            r3 = 1
            r6 = r5
        L42:
            int r7 = r6.f22497a     // Catch: java.lang.Throwable -> L95
            if (r7 != r1) goto L59
            java.lang.Object r7 = r6.f22498b     // Catch: java.lang.Throwable -> L95
            if (r7 == r9) goto L52
            if (r7 == 0) goto L59
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L95
            if (r7 == 0) goto L59
        L52:
            java.lang.Object r7 = r6.f22499c     // Catch: java.lang.Throwable -> L95
            if (r11 != 0) goto L82
            r6.f22499c = r10     // Catch: java.lang.Throwable -> L95
            goto L82
        L59:
            j$.util.concurrent.m r7 = r6.f22500d     // Catch: java.lang.Throwable -> L95
            if (r7 != 0) goto L65
            j$.util.concurrent.m r7 = new j$.util.concurrent.m     // Catch: java.lang.Throwable -> L95
            r7.<init>(r1, r9, r10, r0)     // Catch: java.lang.Throwable -> L95
            r6.f22500d = r7     // Catch: java.lang.Throwable -> L95
            goto L81
        L65:
            int r3 = r3 + 1
            r6 = r7
            goto L42
        L69:
            boolean r6 = r5 instanceof p164j$.util.concurrent.C8403r     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L81
            r3 = r5
            j$.util.concurrent.r r3 = (p164j$.util.concurrent.C8403r) r3     // Catch: java.lang.Throwable -> L95
            j$.util.concurrent.s r3 = r3.m17733f(r1, r9, r10)     // Catch: java.lang.Throwable -> L95
            r6 = 2
            if (r3 == 0) goto L7e
            java.lang.Object r7 = r3.f22499c     // Catch: java.lang.Throwable -> L95
            if (r11 != 0) goto L7f
            r3.f22499c = r10     // Catch: java.lang.Throwable -> L95
            goto L7f
        L7e:
            r7 = r0
        L7f:
            r3 = r6
            goto L82
        L81:
            r7 = r0
        L82:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L95
            if (r3 == 0) goto L10
            r9 = 8
            if (r3 < r9) goto L8c
            r8.treeifyBin(r2, r4)
        L8c:
            if (r7 == 0) goto L8f
            return r7
        L8f:
            r9 = 1
            r8.addCount(r9, r3)
            return r0
        L95:
            r9 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L95
            throw r9
        L98:
            j$.util.concurrent.m[] r2 = r8.initTable()
            goto L10
        L9e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p164j$.util.concurrent.ConcurrentHashMap.putVal(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map, p164j$.util.Map
    public V remove(Object obj) {
        return replaceNode(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p164j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || replaceNode(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p164j$.util.Map
    public V replace(K k, V v) {
        if (k == null || v == null) {
            throw null;
        }
        return replaceNode(k, v, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p164j$.util.Map
    public boolean replace(K k, V v, V v2) {
        if (k == null || v == null || v2 == null) {
            throw null;
        }
        return replaceNode(k, v2, v) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p164j$.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        biFunction.getClass();
        C8398m[] c8398mArr = this.table;
        if (c8398mArr == null) {
            return;
        }
        C8402q c8402q = new C8402q(c8398mArr, c8398mArr.length, 0, c8398mArr.length);
        while (true) {
            C8398m m17738e = c8402q.m17738e();
            if (m17738e == null) {
                return;
            }
            Object obj = m17738e.f22499c;
            Object obj2 = m17738e.f22498b;
            do {
                Object apply = biFunction.apply(obj2, obj);
                apply.getClass();
                if (replaceNode(obj2, apply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final V replaceNode(Object obj, V v, Object obj2) {
        int length;
        int i;
        C8398m tabAt;
        boolean z;
        V v2;
        C8404s m17727b;
        C8398m untreeify;
        Object obj3;
        int spread = spread(obj.hashCode());
        C8398m[] c8398mArr = this.table;
        while (true) {
            if (c8398mArr == null || (length = c8398mArr.length) == 0 || (tabAt = tabAt(c8398mArr, (i = (length - 1) & spread))) == null) {
                break;
            }
            int i2 = tabAt.f22497a;
            if (i2 == -1) {
                c8398mArr = helpTransfer(c8398mArr, tabAt);
            } else {
                synchronized (tabAt) {
                    if (tabAt(c8398mArr, i) == tabAt) {
                        z = true;
                        if (i2 >= 0) {
                            C8398m c8398m = null;
                            C8398m c8398m2 = tabAt;
                            while (true) {
                                if (c8398m2.f22497a != spread || ((obj3 = c8398m2.f22498b) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                    C8398m c8398m3 = c8398m2.f22500d;
                                    if (c8398m3 == null) {
                                        break;
                                    }
                                    c8398m = c8398m2;
                                    c8398m2 = c8398m3;
                                }
                            }
                            v2 = (V) c8398m2.f22499c;
                            if (obj2 == null || obj2 == v2 || (v2 != null && obj2.equals(v2))) {
                                if (v != null) {
                                    c8398m2.f22499c = v;
                                } else if (c8398m != null) {
                                    c8398m.f22500d = c8398m2.f22500d;
                                } else {
                                    untreeify = c8398m2.f22500d;
                                    setTabAt(c8398mArr, i, untreeify);
                                }
                            }
                            v2 = null;
                        } else if (tabAt instanceof C8403r) {
                            C8403r c8403r = (C8403r) tabAt;
                            C8404s c8404s = c8403r.f22515e;
                            if (c8404s != null && (m17727b = c8404s.m17727b(spread, obj, null)) != null) {
                                v2 = (V) m17727b.f22499c;
                                if (obj2 == null || obj2 == v2 || (v2 != null && obj2.equals(v2))) {
                                    if (v != null) {
                                        m17727b.f22499c = v;
                                    } else if (c8403r.m17732g(m17727b)) {
                                        untreeify = untreeify(c8403r.f22516f);
                                        setTabAt(c8398mArr, i, untreeify);
                                    }
                                }
                            }
                            v2 = null;
                        }
                    }
                    z = false;
                    v2 = null;
                }
                if (z) {
                    if (v2 != null) {
                        if (v == null) {
                            addCount(-1L, -1);
                        }
                        return v2;
                    }
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, p164j$.util.Map
    public int size() {
        long sumCount = sumCount();
        if (sumCount < 0) {
            return 0;
        }
        if (sumCount > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) sumCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long sumCount() {
        C8389d[] c8389dArr = this.counterCells;
        long j = this.baseCount;
        if (c8389dArr != null) {
            for (C8389d c8389d : c8389dArr) {
                if (c8389d != null) {
                    j += c8389d.value;
                }
            }
        }
        return j;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        C8398m[] c8398mArr = this.table;
        int length = c8398mArr == null ? 0 : c8398mArr.length;
        C8402q c8402q = new C8402q(c8398mArr, length, 0, length);
        StringBuilder sb2 = new StringBuilder("{");
        C8398m m17738e = c8402q.m17738e();
        if (m17738e != null) {
            while (true) {
                Object obj = m17738e.f22498b;
                Object obj2 = m17738e.f22499c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb2.append(obj);
                sb2.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb2.append(obj2);
                m17738e = c8402q.m17738e();
                if (m17738e == null) {
                    break;
                }
                sb2.append(", ");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map, p164j$.util.Map
    public Collection<V> values() {
        C8405t c8405t = this.values;
        if (c8405t != null) {
            return c8405t;
        }
        C8405t c8405t2 = new C8405t(this);
        this.values = c8405t2;
        return c8405t2;
    }
}

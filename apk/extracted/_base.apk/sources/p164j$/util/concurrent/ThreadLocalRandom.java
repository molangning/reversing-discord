package p164j$.util.concurrent;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import p164j$.util.stream.AbstractC8744w0;
import p164j$.util.stream.C8547F;
import p164j$.util.stream.C8694m0;
import p164j$.util.stream.IntStream;

/* renamed from: j$.util.concurrent.ThreadLocalRandom */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public class ThreadLocalRandom extends Random {

    /* renamed from: d */
    private static final AtomicInteger f22478d = new AtomicInteger();

    /* renamed from: e */
    private static final AtomicLong f22479e;

    /* renamed from: f */
    private static final ThreadLocal f22480f;

    /* renamed from: g */
    private static final ThreadLocal f22481g;

    /* renamed from: a */
    long f22482a;

    /* renamed from: b */
    int f22483b;

    /* renamed from: c */
    boolean f22484c = true;

    static {
        long m17741h;
        if (((Boolean) AccessController.doPrivileged(new C8409x())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            m17741h = seed[0] & 255;
            for (int i = 1; i < 8; i++) {
                m17741h = (m17741h << 8) | (seed[i] & 255);
            }
        } else {
            m17741h = m17741h(System.nanoTime()) ^ m17741h(System.currentTimeMillis());
        }
        f22479e = new AtomicLong(m17741h);
        f22480f = new ThreadLocal();
        f22481g = new C8410y();
        new ObjectStreamField("rnd", Long.TYPE);
        new ObjectStreamField("initialized", Boolean.TYPE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static final int m17748a(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        ((ThreadLocalRandom) f22481g.get()).f22483b = i4;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static final int m17747b() {
        return ((ThreadLocalRandom) f22481g.get()).f22483b;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f22481g.get();
        if (threadLocalRandom.f22483b == 0) {
            m17743f();
        }
        return threadLocalRandom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static final void m17743f() {
        int addAndGet = f22478d.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long m17741h = m17741h(f22479e.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f22481g.get();
        threadLocalRandom.f22482a = m17741h;
        threadLocalRandom.f22483b = addAndGet;
    }

    /* renamed from: g */
    private static int m17742g(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        return (int) (((j2 ^ (j2 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    /* renamed from: h */
    private static long m17741h(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final double m17746c(double d, double d2) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d < d2) {
            double d3 = ((d2 - d) * nextLong) + d;
            return d3 >= d2 ? Double.longBitsToDouble(Double.doubleToLongBits(d2) - 1) : d3;
        }
        return nextLong;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final int m17745d(int i, int i2) {
        int i3;
        int m17742g = m17742g(m17740i());
        if (i < i2) {
            int i4 = i2 - i;
            int i5 = i4 - 1;
            if ((i4 & i5) == 0) {
                i3 = m17742g & i5;
            } else if (i4 > 0) {
                int i6 = m17742g >>> 1;
                while (true) {
                    int i7 = i6 + i5;
                    i3 = i6 % i4;
                    if (i7 - i3 >= 0) {
                        break;
                    }
                    i6 = m17742g(m17740i()) >>> 1;
                }
            } else {
                while (true) {
                    if (m17742g >= i && m17742g < i2) {
                        return m17742g;
                    }
                    m17742g = m17742g(m17740i());
                }
            }
            return i3 + i;
        }
        return m17742g;
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        return C8547F.m17587y(AbstractC8744w0.m17353Y0(new C8411z(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d, double d2) {
        if (d < d2) {
            return C8547F.m17587y(AbstractC8744w0.m17353Y0(new C8411z(0L, Long.MAX_VALUE, d, d2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j) {
        if (j >= 0) {
            return C8547F.m17587y(AbstractC8744w0.m17353Y0(new C8411z(0L, j, Double.MAX_VALUE, 0.0d)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j, double d, double d2) {
        if (j >= 0) {
            if (d < d2) {
                return C8547F.m17587y(AbstractC8744w0.m17353Y0(new C8411z(0L, j, d, d2)));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final long m17744e(long j, long j2) {
        long j3;
        long m17741h = m17741h(m17740i());
        if (j < j2) {
            long j4 = j2 - j;
            long j5 = j4 - 1;
            if ((j4 & j5) == 0) {
                j3 = m17741h & j5;
            } else if (j4 > 0) {
                while (true) {
                    long j6 = m17741h >>> 1;
                    long j7 = j6 + j5;
                    j3 = j6 % j4;
                    if (j7 - j3 >= 0) {
                        break;
                    }
                    m17741h = m17741h(m17740i());
                }
            } else {
                while (true) {
                    if (m17741h >= j && m17741h < j2) {
                        return m17741h;
                    }
                    m17741h = m17741h(m17740i());
                }
            }
            return j3 + j;
        }
        return m17741h;
    }

    /* renamed from: i */
    final long m17740i() {
        long j = this.f22482a - 7046029254386353131L;
        this.f22482a = j;
        return j;
    }

    @Override // java.util.Random
    public final IntStream ints() {
        return IntStream.Wrapper.convert(AbstractC8744w0.m17343i1(new C8384A(0L, Long.MAX_VALUE, ViewDefaults.NUMBER_OF_LINES, 0)));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(int i, int i2) {
        if (i < i2) {
            return IntStream.Wrapper.convert(AbstractC8744w0.m17343i1(new C8384A(0L, Long.MAX_VALUE, i, i2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j) {
        if (j >= 0) {
            return IntStream.Wrapper.convert(AbstractC8744w0.m17343i1(new C8384A(0L, j, ViewDefaults.NUMBER_OF_LINES, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j, int i, int i2) {
        if (j >= 0) {
            if (i < i2) {
                return IntStream.Wrapper.convert(AbstractC8744w0.m17343i1(new C8384A(0L, j, i, i2)));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs() {
        return C8694m0.m17431y(AbstractC8744w0.m17341k1(new C8385B(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final LongStream longs(long j) {
        if (j >= 0) {
            return C8694m0.m17431y(AbstractC8744w0.m17341k1(new C8385B(0L, j, Long.MAX_VALUE, 0L)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j2) {
        if (j < j2) {
            return C8694m0.m17431y(AbstractC8744w0.m17341k1(new C8385B(0L, Long.MAX_VALUE, j, j2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j2, long j3) {
        if (j >= 0) {
            if (j2 < j3) {
                return C8694m0.m17431y(AbstractC8744w0.m17341k1(new C8385B(0L, j, j2, j3)));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    protected final int next(int i) {
        return (int) (m17741h(m17740i()) >>> (64 - i));
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return m17742g(m17740i()) < 0;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (m17741h(m17740i()) >>> 11) * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (m17742g(m17740i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f22480f;
        Double d = (Double) threadLocal.get();
        if (d != null) {
            threadLocal.set(null);
            return d.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d2 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d2 < 1.0d && d2 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d2) * (-2.0d)) / d2);
                threadLocal.set(new Double(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override // java.util.Random
    public final int nextInt() {
        return m17742g(m17740i());
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int m17742g = m17742g(m17740i());
        int i2 = i - 1;
        if ((i & i2) == 0) {
            return m17742g & i2;
        }
        while (true) {
            int i3 = m17742g >>> 1;
            int i4 = i3 + i2;
            int i5 = i3 % i;
            if (i4 - i5 >= 0) {
                return i5;
            }
            m17742g = m17742g(m17740i());
        }
    }

    public int nextInt(int i, int i2) {
        if (i < i2) {
            return m17745d(i, i2);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final long nextLong() {
        return m17741h(m17740i());
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.f22484c) {
            throw new UnsupportedOperationException();
        }
    }
}

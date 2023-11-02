package p164j$.util.stream;

import p164j$.util.InterfaceC8356D;
import p164j$.util.InterfaceC8359G;
import p164j$.util.InterfaceC8362J;
import p164j$.util.InterfaceC8365M;
import p164j$.util.Spliterator;

/* renamed from: j$.util.stream.t3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
abstract class AbstractC8732t3 {

    /* renamed from: a */
    final long f22950a;

    /* renamed from: b */
    final long f22951b;

    /* renamed from: c */
    Spliterator f22952c;

    /* renamed from: d */
    long f22953d;

    /* renamed from: e */
    long f22954e;

    public AbstractC8732t3(Spliterator spliterator, long j, long j2, long j3, long j4) {
        this.f22952c = spliterator;
        this.f22950a = j;
        this.f22951b = j2;
        this.f22953d = j3;
        this.f22954e = j4;
    }

    public final int characteristics() {
        return this.f22952c.characteristics();
    }

    /* renamed from: e */
    protected abstract Spliterator mo17385e(Spliterator spliterator, long j, long j2, long j3, long j4);

    public final long estimateSize() {
        long j = this.f22954e;
        long j2 = this.f22950a;
        if (j2 < j) {
            return j - Math.max(j2, this.f22953d);
        }
        return 0L;
    }

    public /* bridge */ /* synthetic */ InterfaceC8356D trySplit() {
        return (InterfaceC8356D) m42137trySplit();
    }

    /* renamed from: trySplit */
    public /* bridge */ /* synthetic */ InterfaceC8359G m42134trySplit() {
        return (InterfaceC8359G) m42137trySplit();
    }

    /* renamed from: trySplit */
    public /* bridge */ /* synthetic */ InterfaceC8362J m42135trySplit() {
        return (InterfaceC8362J) m42137trySplit();
    }

    /* renamed from: trySplit */
    public /* bridge */ /* synthetic */ InterfaceC8365M m42136trySplit() {
        return (InterfaceC8365M) m42137trySplit();
    }

    /* renamed from: trySplit */
    public final Spliterator m42137trySplit() {
        long j = this.f22954e;
        if (this.f22950a >= j || this.f22953d >= j) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.f22952c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f22953d;
            long min = Math.min(estimateSize, this.f22951b);
            long j2 = this.f22950a;
            if (j2 >= min) {
                this.f22953d = min;
            } else {
                long j3 = this.f22951b;
                if (min < j3) {
                    long j4 = this.f22953d;
                    if (j4 < j2 || estimateSize > j3) {
                        this.f22953d = min;
                        return mo17385e(trySplit, j2, j3, j4, min);
                    }
                    this.f22953d = min;
                    return trySplit;
                }
                this.f22952c = trySplit;
                this.f22954e = min;
            }
        }
    }
}
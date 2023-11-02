package gg;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import p304qf.AbstractC11884q;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007¨\u0006\u0015"}, m14357d2 = {"Lgg/f;", "Lqf/q;", "", "hasNext", "", "nextLong", "j", "J", "getStep", "()J", "step", "k", "finalElement", "l", "Z", "m", "next", "first", "last", "<init>", "(JJJ)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: gg.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6754f extends AbstractC11884q {

    /* renamed from: j */
    private final long f18989j;

    /* renamed from: k */
    private final long f18990k;

    /* renamed from: l */
    private boolean f18991l;

    /* renamed from: m */
    private long f18992m;

    public C6754f(long j, long j2, long j3) {
        this.f18989j = j3;
        this.f18990k = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.f18991l = z;
        this.f18992m = z ? j : j2;
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public boolean hasNext() {
        return this.f18991l;
    }

    @Override // p304qf.AbstractC11884q
    public long nextLong() {
        long j = this.f18992m;
        if (j == this.f18990k) {
            if (this.f18991l) {
                this.f18991l = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f18992m = this.f18989j + j;
        }
        return j;
    }
}
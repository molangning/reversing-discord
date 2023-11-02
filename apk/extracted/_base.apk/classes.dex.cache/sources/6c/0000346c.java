package gg;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p304qf.AbstractC11874g;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0016"}, m14357d2 = {"Lgg/b;", "Lqf/g;", "", "hasNext", "", "a", "", "j", "I", "getStep", "()I", "step", "k", "finalElement", "l", "Z", "m", "next", "first", "last", "<init>", "(CCI)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: gg.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6748b extends AbstractC11874g {

    /* renamed from: j */
    private final int f18975j;

    /* renamed from: k */
    private final int f18976k;

    /* renamed from: l */
    private boolean f18977l;

    /* renamed from: m */
    private int f18978m;

    public C6748b(char c, char c2, int i) {
        this.f18975j = i;
        this.f18976k = c2;
        boolean z = true;
        if (i <= 0 ? C9612q.m13915j(c, c2) < 0 : C9612q.m13915j(c, c2) > 0) {
            z = false;
        }
        this.f18977l = z;
        this.f18978m = z ? c : c2;
    }

    @Override // p304qf.AbstractC11874g
    /* renamed from: a */
    public char mo6801a() {
        int i = this.f18978m;
        if (i == this.f18976k) {
            if (this.f18977l) {
                this.f18977l = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f18978m = this.f18975j + i;
        }
        return (char) i;
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public boolean hasNext() {
        return this.f18977l;
    }
}
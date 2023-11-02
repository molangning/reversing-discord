package p430xi;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C9612q;
import p430xi.AbstractC13807c;
import pf.C11583s;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0013\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b \u0010\u0017J\u000f\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t2\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000f\u0010\u0010R>\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t8\u0004@BX\u0084\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00078\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006!"}, m14357d2 = {"Lxi/a;", "Lxi/c;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "e", "()Lxi/c;", "", "size", "", "f", "(I)[Lxi/c;", "d", "slot", "", "g", "(Lxi/c;)V", "<set-?>", "j", "[Lxi/c;", "i", "()[Lxi/c;", "getSlots$annotations", "()V", "slots", "k", "I", "h", "()I", "nCollectors", "l", "nextIndex", "<init>", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: xi.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC13805a<S extends AbstractC13807c<?>> {

    /* renamed from: j */
    private S[] f35575j;

    /* renamed from: k */
    private int f35576k;

    /* renamed from: l */
    private int f35577l;

    /* renamed from: d */
    public final S m1482d() {
        S s;
        synchronized (this) {
            S[] sArr = this.f35575j;
            if (sArr == null) {
                sArr = mo1480f(2);
                this.f35575j = sArr;
            } else if (this.f35576k >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                C9612q.m13918g(copyOf, "copyOf(this, newSize)");
                this.f35575j = (S[]) ((AbstractC13807c[]) copyOf);
                sArr = (S[]) ((AbstractC13807c[]) copyOf);
            }
            int i = this.f35577l;
            do {
                s = sArr[i];
                if (s == null) {
                    s = mo1481e();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
            } while (!s.mo1476a(this));
            this.f35577l = i;
            this.f35576k++;
        }
        return s;
    }

    /* renamed from: e */
    protected abstract S mo1481e();

    /* renamed from: f */
    protected abstract S[] mo1480f(int i);

    /* renamed from: g */
    public final void m1479g(S s) {
        int i;
        Continuation<Unit>[] mo1475b;
        synchronized (this) {
            int i2 = this.f35576k - 1;
            this.f35576k = i2;
            if (i2 == 0) {
                this.f35577l = 0;
            }
            mo1475b = s.mo1475b(this);
        }
        for (Continuation<Unit> continuation : mo1475b) {
            if (continuation != null) {
                C11583s.C11584a c11584a = C11583s.f30090k;
                continuation.resumeWith(C11583s.m7596b(Unit.f25302a));
            }
        }
    }

    /* renamed from: h */
    public final int m1478h() {
        return this.f35576k;
    }

    /* renamed from: i */
    public final S[] m1477i() {
        return this.f35575j;
    }
}
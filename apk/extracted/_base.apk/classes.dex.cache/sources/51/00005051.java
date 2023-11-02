package p390vj;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010)\u001a\u00020%\u0012\u0006\u0010-\u001a\u00020\u0010¢\u0006\u0004\b.\u0010/J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J'\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u000f\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0010H\u0016R\"\u0010\u0016\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010$\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0012\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0015R\u001a\u0010)\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010-\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,¨\u00060"}, m14357d2 = {"Lvj/d;", "", "Lvj/a;", "task", "", "delayNanos", "", "i", "", "recurrence", "k", "(Lvj/a;JZ)Z", "a", "n", "b", "()Z", "", "toString", "Z", "g", "setShutdown$okhttp", "(Z)V", "shutdown", "Lvj/a;", "c", "()Lvj/a;", "l", "(Lvj/a;)V", "activeTask", "", "Ljava/util/List;", "e", "()Ljava/util/List;", "futureTasks", "d", "m", "cancelActiveTask", "Lvj/e;", "Lvj/e;", "h", "()Lvj/e;", "taskRunner", "f", "Ljava/lang/String;", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "<init>", "(Lvj/e;Ljava/lang/String;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: vj.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13345d {

    /* renamed from: a */
    private boolean f34422a;

    /* renamed from: b */
    private AbstractC13342a f34423b;

    /* renamed from: c */
    private final List<AbstractC13342a> f34424c;

    /* renamed from: d */
    private boolean f34425d;

    /* renamed from: e */
    private final C13346e f34426e;

    /* renamed from: f */
    private final String f34427f;

    public C13345d(C13346e taskRunner, String name) {
        C9612q.m13917h(taskRunner, "taskRunner");
        C9612q.m13917h(name, "name");
        this.f34426e = taskRunner;
        this.f34427f = name;
        this.f34424c = new ArrayList();
    }

    /* renamed from: j */
    public static /* synthetic */ void m2739j(C13345d c13345d, AbstractC13342a abstractC13342a, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c13345d.m2740i(abstractC13342a, j);
    }

    /* renamed from: a */
    public final void m2748a() {
        if (C12562c.f32615h && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9612q.m13918g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        synchronized (this.f34426e) {
            if (m2747b()) {
                this.f34426e.m2727h(this);
            }
            Unit unit = Unit.f25302a;
        }
    }

    /* renamed from: b */
    public final boolean m2747b() {
        AbstractC13342a abstractC13342a = this.f34423b;
        if (abstractC13342a != null) {
            C9612q.m13920e(abstractC13342a);
            if (abstractC13342a.m2757a()) {
                this.f34425d = true;
            }
        }
        boolean z = false;
        for (int size = this.f34424c.size() - 1; size >= 0; size--) {
            if (this.f34424c.get(size).m2757a()) {
                AbstractC13342a abstractC13342a2 = this.f34424c.get(size);
                if (C13346e.f34430j.m2724a().isLoggable(Level.FINE)) {
                    C13343b.m2749c(abstractC13342a2, this, "canceled");
                }
                this.f34424c.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final AbstractC13342a m2746c() {
        return this.f34423b;
    }

    /* renamed from: d */
    public final boolean m2745d() {
        return this.f34425d;
    }

    /* renamed from: e */
    public final List<AbstractC13342a> m2744e() {
        return this.f34424c;
    }

    /* renamed from: f */
    public final String m2743f() {
        return this.f34427f;
    }

    /* renamed from: g */
    public final boolean m2742g() {
        return this.f34422a;
    }

    /* renamed from: h */
    public final C13346e m2741h() {
        return this.f34426e;
    }

    /* renamed from: i */
    public final void m2740i(AbstractC13342a task, long j) {
        C9612q.m13917h(task, "task");
        synchronized (this.f34426e) {
            if (this.f34422a) {
                if (task.m2757a()) {
                    if (C13346e.f34430j.m2724a().isLoggable(Level.FINE)) {
                        C13343b.m2749c(task, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                if (C13346e.f34430j.m2724a().isLoggable(Level.FINE)) {
                    C13343b.m2749c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (m2738k(task, j, false)) {
                this.f34426e.m2727h(this);
            }
            Unit unit = Unit.f25302a;
        }
    }

    /* renamed from: k */
    public final boolean m2738k(AbstractC13342a task, long j, boolean z) {
        boolean z2;
        String str;
        C9612q.m13917h(task, "task");
        task.m2753e(this);
        long mo2721c = this.f34426e.m2728g().mo2721c();
        long j2 = mo2721c + j;
        int indexOf = this.f34424c.indexOf(task);
        if (indexOf != -1) {
            if (task.m2755c() <= j2) {
                if (C13346e.f34430j.m2724a().isLoggable(Level.FINE)) {
                    C13343b.m2749c(task, this, "already scheduled");
                }
                return false;
            }
            this.f34424c.remove(indexOf);
        }
        task.m2752g(j2);
        if (C13346e.f34430j.m2724a().isLoggable(Level.FINE)) {
            if (z) {
                str = "run again after " + C13343b.m2750b(j2 - mo2721c);
            } else {
                str = "scheduled after " + C13343b.m2750b(j2 - mo2721c);
            }
            C13343b.m2749c(task, this, str);
        }
        Iterator<AbstractC13342a> it = this.f34424c.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next().m2755c() - mo2721c > j) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            i = this.f34424c.size();
        }
        this.f34424c.add(i, task);
        if (i != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final void m2737l(AbstractC13342a abstractC13342a) {
        this.f34423b = abstractC13342a;
    }

    /* renamed from: m */
    public final void m2736m(boolean z) {
        this.f34425d = z;
    }

    /* renamed from: n */
    public final void m2735n() {
        if (C12562c.f32615h && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9612q.m13918g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        synchronized (this.f34426e) {
            this.f34422a = true;
            if (m2747b()) {
                this.f34426e.m2727h(this);
            }
            Unit unit = Unit.f25302a;
        }
    }

    public String toString() {
        return this.f34427f;
    }
}
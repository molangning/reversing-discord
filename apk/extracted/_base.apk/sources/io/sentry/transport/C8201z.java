package io.sentry.transport;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* renamed from: io.sentry.transport.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8201z {

    /* renamed from: a */
    private final C8202a f22133a;

    /* renamed from: io.sentry.transport.z$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C8202a extends AbstractQueuedSynchronizer {
        C8202a(int i) {
            setState(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m18274d() {
            releaseShared(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public int m18273e() {
            return getState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m18272f() {
            int state;
            do {
                state = getState();
            } while (!compareAndSetState(state, state + 1));
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public int tryAcquireShared(int i) {
            return getState() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryReleaseShared(int i) {
            int state;
            int i2;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i2 = state - 1;
            } while (!compareAndSetState(state, i2));
            if (i2 != 0) {
                return false;
            }
            return true;
        }
    }

    public C8201z(int i) {
        if (i >= 0) {
            this.f22133a = new C8202a(i);
            return;
        }
        throw new IllegalArgumentException("negative initial count '" + i + "' is not allowed");
    }

    /* renamed from: a */
    public void m18281a() {
        this.f22133a.m18274d();
    }

    /* renamed from: b */
    public int m18280b() {
        return this.f22133a.m18273e();
    }

    /* renamed from: c */
    public void m18279c() {
        this.f22133a.m18272f();
    }

    /* renamed from: d */
    public boolean m18278d(long j, TimeUnit timeUnit) {
        return this.f22133a.tryAcquireSharedNanos(1, timeUnit.toNanos(j));
    }

    public C8201z() {
        this(0);
    }
}

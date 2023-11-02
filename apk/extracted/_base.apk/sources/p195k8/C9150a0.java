package p195k8;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* renamed from: k8.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9150a0 {

    /* renamed from: a */
    private final Object f24101a = new Object();

    /* renamed from: b */
    private final PriorityQueue<Integer> f24102b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c */
    private int f24103c = Integer.MIN_VALUE;

    /* renamed from: k8.a0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C9151a extends IOException {
        public C9151a(int i, int i2) {
            super("Priority too low [priority=" + i + ", highest=" + i2 + "]");
        }
    }

    /* renamed from: a */
    public void m16443a(int i) {
        synchronized (this.f24101a) {
            this.f24102b.add(Integer.valueOf(i));
            this.f24103c = Math.max(this.f24103c, i);
        }
    }

    /* renamed from: b */
    public void m16442b(int i) {
        synchronized (this.f24101a) {
            if (this.f24103c != i) {
                throw new C9151a(i, this.f24103c);
            }
        }
    }

    /* renamed from: c */
    public void m16441c(int i) {
        int intValue;
        synchronized (this.f24101a) {
            this.f24102b.remove(Integer.valueOf(i));
            if (this.f24102b.isEmpty()) {
                intValue = Integer.MIN_VALUE;
            } else {
                intValue = ((Integer) C9191p0.m16243j(this.f24102b.peek())).intValue();
            }
            this.f24103c = intValue;
            this.f24101a.notifyAll();
        }
    }
}

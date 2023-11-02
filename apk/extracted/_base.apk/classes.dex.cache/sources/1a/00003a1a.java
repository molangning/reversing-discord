package io.sentry.transport;

/* renamed from: io.sentry.transport.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC8169a0 {

    /* renamed from: io.sentry.transport.a0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8171b extends AbstractC8169a0 {

        /* renamed from: a */
        private final int f22091a;

        C8171b(int i) {
            super();
            this.f22091a = i;
        }

        @Override // io.sentry.transport.AbstractC8169a0
        /* renamed from: c */
        public int mo18345c() {
            return this.f22091a;
        }

        @Override // io.sentry.transport.AbstractC8169a0
        /* renamed from: d */
        public boolean mo18344d() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.transport.a0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8172c extends AbstractC8169a0 {

        /* renamed from: a */
        static final C8172c f22092a = new C8172c();

        private C8172c() {
            super();
        }

        @Override // io.sentry.transport.AbstractC8169a0
        /* renamed from: c */
        public int mo18345c() {
            return -1;
        }

        @Override // io.sentry.transport.AbstractC8169a0
        /* renamed from: d */
        public boolean mo18344d() {
            return true;
        }
    }

    private AbstractC8169a0() {
    }

    /* renamed from: a */
    public static AbstractC8169a0 m18348a() {
        return m18347b(-1);
    }

    /* renamed from: b */
    public static AbstractC8169a0 m18347b(int i) {
        return new C8171b(i);
    }

    /* renamed from: e */
    public static AbstractC8169a0 m18346e() {
        return C8172c.f22092a;
    }

    /* renamed from: c */
    public abstract int mo18345c();

    /* renamed from: d */
    public abstract boolean mo18344d();
}
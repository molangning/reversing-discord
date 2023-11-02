package p193k6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p195k8.C9191p0;

/* renamed from: k6.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC9090g {

    /* renamed from: a */
    public static final ByteBuffer f23883a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: k6.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9091a {

        /* renamed from: e */
        public static final C9091a f23884e = new C9091a(-1, -1, -1);

        /* renamed from: a */
        public final int f23885a;

        /* renamed from: b */
        public final int f23886b;

        /* renamed from: c */
        public final int f23887c;

        /* renamed from: d */
        public final int f23888d;

        public C9091a(int i, int i2, int i3) {
            int i4;
            this.f23885a = i;
            this.f23886b = i2;
            this.f23887c = i3;
            if (C9191p0.m16230p0(i3)) {
                i4 = C9191p0.m16256c0(i3, i2);
            } else {
                i4 = -1;
            }
            this.f23888d = i4;
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f23885a + ", channelCount=" + this.f23886b + ", encoding=" + this.f23887c + ']';
        }
    }

    /* renamed from: k6.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9092b extends Exception {
        public C9092b(C9091a c9091a) {
            super("Unhandled format: " + c9091a);
        }
    }

    /* renamed from: a */
    boolean mo16496a();

    /* renamed from: b */
    ByteBuffer mo16495b();

    /* renamed from: c */
    boolean mo16494c();

    /* renamed from: d */
    C9091a mo16493d(C9091a c9091a);

    /* renamed from: e */
    void mo16488e(ByteBuffer byteBuffer);

    /* renamed from: f */
    void mo16492f();

    void flush();

    void reset();
}

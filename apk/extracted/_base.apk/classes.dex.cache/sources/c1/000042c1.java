package p228m6;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: m6.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10271g extends AbstractC10263a {

    /* renamed from: k */
    public final C10264b f26742k;

    /* renamed from: l */
    public ByteBuffer f26743l;

    /* renamed from: m */
    public boolean f26744m;

    /* renamed from: n */
    public long f26745n;

    /* renamed from: o */
    public ByteBuffer f26746o;

    /* renamed from: p */
    private final int f26747p;

    /* renamed from: q */
    private final int f26748q;

    /* renamed from: m6.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10272a extends IllegalStateException {

        /* renamed from: j */
        public final int f26749j;

        /* renamed from: k */
        public final int f26750k;

        public C10272a(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.f26749j = i;
            this.f26750k = i2;
        }
    }

    public C10271g(int i) {
        this(i, 0);
    }

    /* renamed from: o */
    private ByteBuffer m11978o(int i) {
        int capacity;
        int i2 = this.f26747p;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f26743l;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new C10272a(capacity, i);
    }

    /* renamed from: t */
    public static C10271g m11973t() {
        return new C10271g(0);
    }

    @Override // p228m6.AbstractC10263a
    /* renamed from: f */
    public void mo3126f() {
        super.mo3126f();
        ByteBuffer byteBuffer = this.f26743l;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f26746o;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f26744m = false;
    }

    @EnsuresNonNull({"data"})
    /* renamed from: p */
    public void m11977p(int i) {
        int i2 = i + this.f26748q;
        ByteBuffer byteBuffer = this.f26743l;
        if (byteBuffer == null) {
            this.f26743l = m11978o(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.f26743l = byteBuffer;
            return;
        }
        ByteBuffer m11978o = m11978o(i3);
        m11978o.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m11978o.put(byteBuffer);
        }
        this.f26743l = m11978o;
    }

    /* renamed from: q */
    public final void m11976q() {
        ByteBuffer byteBuffer = this.f26743l;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f26746o;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: r */
    public final boolean m11975r() {
        return m11991h(1073741824);
    }

    /* renamed from: s */
    public final boolean m11974s() {
        return this.f26743l == null && this.f26747p == 0;
    }

    @EnsuresNonNull({"supplementalData"})
    /* renamed from: v */
    public void m11972v(int i) {
        ByteBuffer byteBuffer = this.f26746o;
        if (byteBuffer != null && byteBuffer.capacity() >= i) {
            this.f26746o.clear();
        } else {
            this.f26746o = ByteBuffer.allocate(i);
        }
    }

    public C10271g(int i, int i2) {
        this.f26742k = new C10264b();
        this.f26747p = i;
        this.f26748q = i2;
    }
}
package p397w5;

import java.util.Arrays;
import p381v5.AbstractC13093i;
import p397w5.AbstractC13396f;

/* renamed from: w5.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13389a extends AbstractC13396f {

    /* renamed from: a */
    private final Iterable<AbstractC13093i> f34467a;

    /* renamed from: b */
    private final byte[] f34468b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w5.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13391b extends AbstractC13396f.AbstractC13397a {

        /* renamed from: a */
        private Iterable<AbstractC13093i> f34469a;

        /* renamed from: b */
        private byte[] f34470b;

        @Override // p397w5.AbstractC13396f.AbstractC13397a
        /* renamed from: a */
        public AbstractC13396f mo2654a() {
            String str = "";
            if (this.f34469a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C13389a(this.f34469a, this.f34470b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p397w5.AbstractC13396f.AbstractC13397a
        /* renamed from: b */
        public AbstractC13396f.AbstractC13397a mo2653b(Iterable<AbstractC13093i> iterable) {
            if (iterable != null) {
                this.f34469a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // p397w5.AbstractC13396f.AbstractC13397a
        /* renamed from: c */
        public AbstractC13396f.AbstractC13397a mo2652c(byte[] bArr) {
            this.f34470b = bArr;
            return this;
        }
    }

    @Override // p397w5.AbstractC13396f
    /* renamed from: b */
    public Iterable<AbstractC13093i> mo2656b() {
        return this.f34467a;
    }

    @Override // p397w5.AbstractC13396f
    /* renamed from: c */
    public byte[] mo2655c() {
        return this.f34468b;
    }

    public boolean equals(Object obj) {
        byte[] mo2655c;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC13396f)) {
            return false;
        }
        AbstractC13396f abstractC13396f = (AbstractC13396f) obj;
        if (this.f34467a.equals(abstractC13396f.mo2656b())) {
            byte[] bArr = this.f34468b;
            if (abstractC13396f instanceof C13389a) {
                mo2655c = ((C13389a) abstractC13396f).f34468b;
            } else {
                mo2655c = abstractC13396f.mo2655c();
            }
            if (Arrays.equals(bArr, mo2655c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f34467a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f34468b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f34467a + ", extras=" + Arrays.toString(this.f34468b) + "}";
    }

    private C13389a(Iterable<AbstractC13093i> iterable, byte[] bArr) {
        this.f34467a = iterable;
        this.f34468b = bArr;
    }
}

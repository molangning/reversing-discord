package p381v5;

import java.util.Arrays;
import p347t5.EnumC12590d;
import p381v5.AbstractC13103o;

/* renamed from: v5.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13084d extends AbstractC13103o {

    /* renamed from: a */
    private final String f33917a;

    /* renamed from: b */
    private final byte[] f33918b;

    /* renamed from: c */
    private final EnumC12590d f33919c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v5.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13086b extends AbstractC13103o.AbstractC13104a {

        /* renamed from: a */
        private String f33920a;

        /* renamed from: b */
        private byte[] f33921b;

        /* renamed from: c */
        private EnumC12590d f33922c;

        @Override // p381v5.AbstractC13103o.AbstractC13104a
        /* renamed from: a */
        public AbstractC13103o mo3256a() {
            String str = "";
            if (this.f33920a == null) {
                str = " backendName";
            }
            if (this.f33922c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C13084d(this.f33920a, this.f33921b, this.f33922c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p381v5.AbstractC13103o.AbstractC13104a
        /* renamed from: b */
        public AbstractC13103o.AbstractC13104a mo3255b(String str) {
            if (str != null) {
                this.f33920a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // p381v5.AbstractC13103o.AbstractC13104a
        /* renamed from: c */
        public AbstractC13103o.AbstractC13104a mo3254c(byte[] bArr) {
            this.f33921b = bArr;
            return this;
        }

        @Override // p381v5.AbstractC13103o.AbstractC13104a
        /* renamed from: d */
        public AbstractC13103o.AbstractC13104a mo3253d(EnumC12590d enumC12590d) {
            if (enumC12590d != null) {
                this.f33922c = enumC12590d;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    @Override // p381v5.AbstractC13103o
    /* renamed from: b */
    public String mo3261b() {
        return this.f33917a;
    }

    @Override // p381v5.AbstractC13103o
    /* renamed from: c */
    public byte[] mo3260c() {
        return this.f33918b;
    }

    @Override // p381v5.AbstractC13103o
    /* renamed from: d */
    public EnumC12590d mo3259d() {
        return this.f33919c;
    }

    public boolean equals(Object obj) {
        byte[] mo3260c;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC13103o)) {
            return false;
        }
        AbstractC13103o abstractC13103o = (AbstractC13103o) obj;
        if (this.f33917a.equals(abstractC13103o.mo3261b())) {
            byte[] bArr = this.f33918b;
            if (abstractC13103o instanceof C13084d) {
                mo3260c = ((C13084d) abstractC13103o).f33918b;
            } else {
                mo3260c = abstractC13103o.mo3260c();
            }
            if (Arrays.equals(bArr, mo3260c) && this.f33919c.equals(abstractC13103o.mo3259d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f33917a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f33918b)) * 1000003) ^ this.f33919c.hashCode();
    }

    private C13084d(String str, byte[] bArr, EnumC12590d enumC12590d) {
        this.f33917a = str;
        this.f33918b = bArr;
        this.f33919c = enumC12590d;
    }
}
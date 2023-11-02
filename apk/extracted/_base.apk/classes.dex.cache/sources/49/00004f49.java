package p381v5;

import p347t5.AbstractC12589c;
import p347t5.C12588b;
import p347t5.InterfaceC12591e;
import p381v5.AbstractC13101n;

/* renamed from: v5.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13081c extends AbstractC13101n {

    /* renamed from: a */
    private final AbstractC13103o f33907a;

    /* renamed from: b */
    private final String f33908b;

    /* renamed from: c */
    private final AbstractC12589c<?> f33909c;

    /* renamed from: d */
    private final InterfaceC12591e<?, byte[]> f33910d;

    /* renamed from: e */
    private final C12588b f33911e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v5.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13083b extends AbstractC13101n.AbstractC13102a {

        /* renamed from: a */
        private AbstractC13103o f33912a;

        /* renamed from: b */
        private String f33913b;

        /* renamed from: c */
        private AbstractC12589c<?> f33914c;

        /* renamed from: d */
        private InterfaceC12591e<?, byte[]> f33915d;

        /* renamed from: e */
        private C12588b f33916e;

        @Override // p381v5.AbstractC13101n.AbstractC13102a
        /* renamed from: a */
        public AbstractC13101n mo3268a() {
            String str = "";
            if (this.f33912a == null) {
                str = " transportContext";
            }
            if (this.f33913b == null) {
                str = str + " transportName";
            }
            if (this.f33914c == null) {
                str = str + " event";
            }
            if (this.f33915d == null) {
                str = str + " transformer";
            }
            if (this.f33916e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C13081c(this.f33912a, this.f33913b, this.f33914c, this.f33915d, this.f33916e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p381v5.AbstractC13101n.AbstractC13102a
        /* renamed from: b */
        public AbstractC13101n.AbstractC13102a mo3267b(C12588b c12588b) {
            if (c12588b != null) {
                this.f33916e = c12588b;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p381v5.AbstractC13101n.AbstractC13102a
        /* renamed from: c */
        public AbstractC13101n.AbstractC13102a mo3266c(AbstractC12589c<?> abstractC12589c) {
            if (abstractC12589c != null) {
                this.f33914c = abstractC12589c;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p381v5.AbstractC13101n.AbstractC13102a
        /* renamed from: d */
        public AbstractC13101n.AbstractC13102a mo3265d(InterfaceC12591e<?, byte[]> interfaceC12591e) {
            if (interfaceC12591e != null) {
                this.f33915d = interfaceC12591e;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // p381v5.AbstractC13101n.AbstractC13102a
        /* renamed from: e */
        public AbstractC13101n.AbstractC13102a mo3264e(AbstractC13103o abstractC13103o) {
            if (abstractC13103o != null) {
                this.f33912a = abstractC13103o;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // p381v5.AbstractC13101n.AbstractC13102a
        /* renamed from: f */
        public AbstractC13101n.AbstractC13102a mo3263f(String str) {
            if (str != null) {
                this.f33913b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    @Override // p381v5.AbstractC13101n
    /* renamed from: b */
    public C12588b mo3274b() {
        return this.f33911e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p381v5.AbstractC13101n
    /* renamed from: c */
    public AbstractC12589c<?> mo3273c() {
        return this.f33909c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p381v5.AbstractC13101n
    /* renamed from: e */
    public InterfaceC12591e<?, byte[]> mo3271e() {
        return this.f33910d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC13101n)) {
            return false;
        }
        AbstractC13101n abstractC13101n = (AbstractC13101n) obj;
        if (this.f33907a.equals(abstractC13101n.mo3270f()) && this.f33908b.equals(abstractC13101n.mo3269g()) && this.f33909c.equals(abstractC13101n.mo3273c()) && this.f33910d.equals(abstractC13101n.mo3271e()) && this.f33911e.equals(abstractC13101n.mo3274b())) {
            return true;
        }
        return false;
    }

    @Override // p381v5.AbstractC13101n
    /* renamed from: f */
    public AbstractC13103o mo3270f() {
        return this.f33907a;
    }

    @Override // p381v5.AbstractC13101n
    /* renamed from: g */
    public String mo3269g() {
        return this.f33908b;
    }

    public int hashCode() {
        return ((((((((this.f33907a.hashCode() ^ 1000003) * 1000003) ^ this.f33908b.hashCode()) * 1000003) ^ this.f33909c.hashCode()) * 1000003) ^ this.f33910d.hashCode()) * 1000003) ^ this.f33911e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f33907a + ", transportName=" + this.f33908b + ", event=" + this.f33909c + ", transformer=" + this.f33910d + ", encoding=" + this.f33911e + "}";
    }

    private C13081c(AbstractC13103o abstractC13103o, String str, AbstractC12589c<?> abstractC12589c, InterfaceC12591e<?, byte[]> interfaceC12591e, C12588b c12588b) {
        this.f33907a = abstractC13103o;
        this.f33908b = str;
        this.f33909c = abstractC12589c;
        this.f33910d = interfaceC12591e;
        this.f33911e = c12588b;
    }
}
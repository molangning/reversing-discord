package p347t5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t5.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12587a<T> extends AbstractC12589c<T> {

    /* renamed from: a */
    private final Integer f32657a;

    /* renamed from: b */
    private final T f32658b;

    /* renamed from: c */
    private final EnumC12590d f32659c;

    public C12587a(Integer num, T t, EnumC12590d enumC12590d) {
        this.f32657a = num;
        if (t != null) {
            this.f32658b = t;
            if (enumC12590d != null) {
                this.f32659c = enumC12590d;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override // p347t5.AbstractC12589c
    /* renamed from: a */
    public Integer mo4753a() {
        return this.f32657a;
    }

    @Override // p347t5.AbstractC12589c
    /* renamed from: b */
    public T mo4752b() {
        return this.f32658b;
    }

    @Override // p347t5.AbstractC12589c
    /* renamed from: c */
    public EnumC12590d mo4751c() {
        return this.f32659c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12589c)) {
            return false;
        }
        AbstractC12589c abstractC12589c = (AbstractC12589c) obj;
        Integer num = this.f32657a;
        if (num != null ? num.equals(abstractC12589c.mo4753a()) : abstractC12589c.mo4753a() == null) {
            if (this.f32658b.equals(abstractC12589c.mo4752b()) && this.f32659c.equals(abstractC12589c.mo4751c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f32657a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ this.f32658b.hashCode()) * 1000003) ^ this.f32659c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f32657a + ", payload=" + this.f32658b + ", priority=" + this.f32659c + "}";
    }
}
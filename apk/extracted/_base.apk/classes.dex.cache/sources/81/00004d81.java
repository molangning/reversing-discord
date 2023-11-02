package p353tb;

import java.lang.annotation.Annotation;
import p353tb.InterfaceC12629d;

/* renamed from: tb.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12625a {

    /* renamed from: a */
    private int f32719a;

    /* renamed from: b */
    private InterfaceC12629d.EnumC12630a f32720b = InterfaceC12629d.EnumC12630a.DEFAULT;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tb.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12626a implements InterfaceC12629d {

        /* renamed from: a */
        private final int f32721a;

        /* renamed from: b */
        private final InterfaceC12629d.EnumC12630a f32722b;

        C12626a(int i, InterfaceC12629d.EnumC12630a enumC12630a) {
            this.f32721a = i;
            this.f32722b = enumC12630a;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return InterfaceC12629d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC12629d)) {
                return false;
            }
            InterfaceC12629d interfaceC12629d = (InterfaceC12629d) obj;
            if (this.f32721a == interfaceC12629d.tag() && this.f32722b.equals(interfaceC12629d.intEncoding())) {
                return true;
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f32721a) + (this.f32722b.hashCode() ^ 2041407134);
        }

        @Override // p353tb.InterfaceC12629d
        public InterfaceC12629d.EnumC12630a intEncoding() {
            return this.f32722b;
        }

        @Override // p353tb.InterfaceC12629d
        public int tag() {
            return this.f32721a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f32721a + "intEncoding=" + this.f32722b + ')';
        }
    }

    /* renamed from: b */
    public static C12625a m4698b() {
        return new C12625a();
    }

    /* renamed from: a */
    public InterfaceC12629d m4699a() {
        return new C12626a(this.f32719a, this.f32720b);
    }

    /* renamed from: c */
    public C12625a m4697c(int i) {
        this.f32719a = i;
        return this;
    }
}
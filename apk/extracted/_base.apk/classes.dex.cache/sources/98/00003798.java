package p160ih;

import gh.InterfaceC6770g;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p070di.InterfaceC5955u;
import ph.C11632b;

/* renamed from: ih.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface InterfaceC7559p extends InterfaceC5955u {

    /* renamed from: ih.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static abstract class AbstractC7560a {

        /* renamed from: ih.p$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C7561a extends AbstractC7560a {

            /* renamed from: a */
            private final byte[] f20865a;

            /* renamed from: b */
            public final byte[] m20403b() {
                return this.f20865a;
            }
        }

        /* renamed from: ih.p$a$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C7562b extends AbstractC7560a {

            /* renamed from: a */
            private final InterfaceC7564r f20866a;

            /* renamed from: b */
            private final byte[] f20867b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7562b(InterfaceC7564r kotlinJvmBinaryClass, byte[] bArr) {
                super(null);
                C9612q.m13917h(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f20866a = kotlinJvmBinaryClass;
                this.f20867b = bArr;
            }

            /* renamed from: b */
            public final InterfaceC7564r m20402b() {
                return this.f20866a;
            }

            public /* synthetic */ C7562b(InterfaceC7564r interfaceC7564r, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(interfaceC7564r, (i & 2) != 0 ? null : bArr);
            }
        }

        private AbstractC7560a() {
        }

        public /* synthetic */ AbstractC7560a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC7564r m20404a() {
            C7562b c7562b = this instanceof C7562b ? (C7562b) this : null;
            if (c7562b != null) {
                return c7562b.m20402b();
            }
            return null;
        }
    }

    /* renamed from: a */
    AbstractC7560a mo2849a(InterfaceC6770g interfaceC6770g);

    /* renamed from: c */
    AbstractC7560a mo2847c(C11632b c11632b);
}
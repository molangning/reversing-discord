package p468zg;

import gh.InterfaceC6770g;
import gh.InterfaceC6784u;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ph.C11632b;
import ph.C11633c;

/* renamed from: zg.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface InterfaceC14247p {
    /* renamed from: a */
    InterfaceC6784u mo326a(C11633c c11633c, boolean z);

    /* renamed from: b */
    Set<String> mo325b(C11633c c11633c);

    /* renamed from: c */
    InterfaceC6770g mo324c(C14248a c14248a);

    /* renamed from: zg.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C14248a {

        /* renamed from: a */
        private final C11632b f36638a;

        /* renamed from: b */
        private final byte[] f36639b;

        /* renamed from: c */
        private final InterfaceC6770g f36640c;

        public C14248a(C11632b classId, byte[] bArr, InterfaceC6770g interfaceC6770g) {
            C9612q.m13917h(classId, "classId");
            this.f36638a = classId;
            this.f36639b = bArr;
            this.f36640c = interfaceC6770g;
        }

        /* renamed from: a */
        public final C11632b m323a() {
            return this.f36638a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C14248a) {
                C14248a c14248a = (C14248a) obj;
                return C9612q.m13922c(this.f36638a, c14248a.f36638a) && C9612q.m13922c(this.f36639b, c14248a.f36639b) && C9612q.m13922c(this.f36640c, c14248a.f36640c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f36638a.hashCode() * 31;
            byte[] bArr = this.f36639b;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            InterfaceC6770g interfaceC6770g = this.f36640c;
            return hashCode2 + (interfaceC6770g != null ? interfaceC6770g.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f36638a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f36639b) + ", outerClass=" + this.f36640c + ')';
        }

        public /* synthetic */ C14248a(C11632b c11632b, byte[] bArr, InterfaceC6770g interfaceC6770g, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(c11632b, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : interfaceC6770g);
        }
    }
}
package p160ih;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC10463c;
import p250nh.C10890a;
import p270oh.AbstractC11112d;
import pf.C11581q;

/* renamed from: ih.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7572u {

    /* renamed from: b */
    public static final C7573a f20873b = new C7573a(null);

    /* renamed from: a */
    private final String f20874a;

    /* renamed from: ih.u$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7573a {
        private C7573a() {
        }

        public /* synthetic */ C7573a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7572u m20393a(String name, String desc) {
            C9612q.m13917h(name, "name");
            C9612q.m13917h(desc, "desc");
            return new C7572u(name + '#' + desc, null);
        }

        /* renamed from: b */
        public final C7572u m20392b(AbstractC11112d signature) {
            C9612q.m13917h(signature, "signature");
            if (signature instanceof AbstractC11112d.C11114b) {
                return m20390d(signature.mo9138c(), signature.mo9139b());
            }
            if (signature instanceof AbstractC11112d.C11113a) {
                return m20393a(signature.mo9138c(), signature.mo9139b());
            }
            throw new C11581q();
        }

        /* renamed from: c */
        public final C7572u m20391c(InterfaceC10463c nameResolver, C10890a.C10895c signature) {
            C9612q.m13917h(nameResolver, "nameResolver");
            C9612q.m13917h(signature, "signature");
            return m20390d(nameResolver.getString(signature.m9696y()), nameResolver.getString(signature.m9697x()));
        }

        /* renamed from: d */
        public final C7572u m20390d(String name, String desc) {
            C9612q.m13917h(name, "name");
            C9612q.m13917h(desc, "desc");
            return new C7572u(name + desc, null);
        }

        /* renamed from: e */
        public final C7572u m20389e(C7572u signature, int i) {
            C9612q.m13917h(signature, "signature");
            return new C7572u(signature.m20394a() + '@' + i, null);
        }
    }

    private C7572u(String str) {
        this.f20874a = str;
    }

    public /* synthetic */ C7572u(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a */
    public final String m20394a() {
        return this.f20874a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7572u) && C9612q.m13922c(this.f20874a, ((C7572u) obj).f20874a);
    }

    public int hashCode() {
        return this.f20874a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f20874a + ')';
    }
}

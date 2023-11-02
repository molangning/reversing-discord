package p407wg;

import gh.InterfaceC6762b;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ph.C11638f;

/* renamed from: wg.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC13552f implements InterfaceC6762b {

    /* renamed from: b */
    public static final C13553a f34936b = new C13553a(null);

    /* renamed from: a */
    private final C11638f f34937a;

    /* renamed from: wg.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C13553a {
        private C13553a() {
        }

        public /* synthetic */ C13553a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC13552f m2229a(Object value, C11638f c11638f) {
            C9612q.m13917h(value, "value");
            if (C13548d.m2239h(value.getClass())) {
                return new C13572q(c11638f, (Enum) value);
            }
            if (value instanceof Annotation) {
                return new C13554g(c11638f, (Annotation) value);
            }
            if (value instanceof Object[]) {
                return new C13557j(c11638f, (Object[]) value);
            }
            if (value instanceof Class) {
                return new C13568m(c11638f, (Class) value);
            }
            return new C13574s(c11638f, value);
        }
    }

    private AbstractC13552f(C11638f c11638f) {
        this.f34937a = c11638f;
    }

    public /* synthetic */ AbstractC13552f(C11638f c11638f, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11638f);
    }

    @Override // gh.InterfaceC6762b
    public C11638f getName() {
        return this.f34937a;
    }
}
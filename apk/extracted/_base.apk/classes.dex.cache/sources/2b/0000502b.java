package p389vh;

import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p183ji.C8964h;
import p183ji.C8967k;
import p183ji.EnumC8966j;
import p305qg.InterfaceC11928h0;

/* renamed from: vh.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC13307k extends AbstractC13301g<Unit> {

    /* renamed from: b */
    public static final C13308a f34384b = new C13308a(null);

    /* renamed from: vh.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13308a {
        private C13308a() {
        }

        public /* synthetic */ C13308a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC13307k m2811a(String message) {
            C9612q.m13917h(message, "message");
            return new C13309b(message);
        }
    }

    /* renamed from: vh.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13309b extends AbstractC13307k {

        /* renamed from: c */
        private final String f34385c;

        public C13309b(String message) {
            C9612q.m13917h(message, "message");
            this.f34385c = message;
        }

        @Override // p389vh.AbstractC13301g
        /* renamed from: d */
        public C8964h mo2775a(InterfaceC11928h0 module) {
            C9612q.m13917h(module, "module");
            return C8967k.m16945d(EnumC8966j.ERROR_CONSTANT_VALUE, this.f34385c);
        }

        @Override // p389vh.AbstractC13301g
        public String toString() {
            return this.f34385c;
        }
    }

    public AbstractC13307k() {
        super(Unit.f25302a);
    }

    @Override // p389vh.AbstractC13301g
    /* renamed from: c */
    public Unit mo2813b() {
        throw new UnsupportedOperationException();
    }
}
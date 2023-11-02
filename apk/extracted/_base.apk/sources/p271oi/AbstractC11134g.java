package p271oi;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: oi.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC11134g {

    /* renamed from: a */
    private final boolean f29109a;

    /* renamed from: oi.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11135a extends AbstractC11134g {

        /* renamed from: b */
        public static final C11135a f29110b = new C11135a();

        private C11135a() {
            super(false, null);
        }
    }

    /* renamed from: oi.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11136b extends AbstractC11134g {

        /* renamed from: b */
        private final String f29111b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11136b(String error) {
            super(false, null);
            C9612q.m13917h(error, "error");
            this.f29111b = error;
        }
    }

    /* renamed from: oi.g$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11137c extends AbstractC11134g {

        /* renamed from: b */
        public static final C11137c f29112b = new C11137c();

        private C11137c() {
            super(true, null);
        }
    }

    private AbstractC11134g(boolean z) {
        this.f29109a = z;
    }

    public /* synthetic */ AbstractC11134g(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    /* renamed from: a */
    public final boolean m9111a() {
        return this.f29109a;
    }
}

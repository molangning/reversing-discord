package sb;

import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p164j$.util.DesugarTimeZone;
import p300qb.C11815b;
import p300qb.InterfaceC11814a;
import p300qb.InterfaceC11819d;
import p300qb.InterfaceC11820e;
import p300qb.InterfaceC11821f;
import p300qb.InterfaceC11822g;
import p321rb.InterfaceC12120a;
import p321rb.InterfaceC12121b;

/* renamed from: sb.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12447d implements InterfaceC12121b<C12447d> {

    /* renamed from: e */
    private static final InterfaceC11819d<Object> f32384e = new InterfaceC11819d() { // from class: sb.a
        @Override // p300qb.InterfaceC11819d
        /* renamed from: a */
        public final void mo3313a(Object obj, Object obj2) {
            C12447d.m5263l(obj, (InterfaceC11820e) obj2);
        }
    };

    /* renamed from: f */
    private static final InterfaceC11821f<String> f32385f = new InterfaceC11821f() { // from class: sb.b
        @Override // p300qb.InterfaceC11821f
        /* renamed from: a */
        public final void mo5257a(Object obj, Object obj2) {
            ((InterfaceC11822g) obj2).mo4662d((String) obj);
        }
    };

    /* renamed from: g */
    private static final InterfaceC11821f<Boolean> f32386g = new InterfaceC11821f() { // from class: sb.c
        @Override // p300qb.InterfaceC11821f
        /* renamed from: a */
        public final void mo5257a(Object obj, Object obj2) {
            C12447d.m5261n((Boolean) obj, (InterfaceC11822g) obj2);
        }
    };

    /* renamed from: h */
    private static final C12449b f32387h = new C12449b(null);

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC11819d<?>> f32388a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC11821f<?>> f32389b = new HashMap();

    /* renamed from: c */
    private InterfaceC11819d<Object> f32390c = f32384e;

    /* renamed from: d */
    private boolean f32391d = false;

    /* renamed from: sb.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C12448a implements InterfaceC11814a {
        C12448a() {
        }

        @Override // p300qb.InterfaceC11814a
        /* renamed from: a */
        public void mo5258a(Object obj, Writer writer) {
            C12450e c12450e = new C12450e(writer, C12447d.this.f32388a, C12447d.this.f32389b, C12447d.this.f32390c, C12447d.this.f32391d);
            c12450e.m5253h(obj, false);
            c12450e.m5245p();
        }
    }

    /* renamed from: sb.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C12449b implements InterfaceC11821f<Date> {

        /* renamed from: a */
        private static final DateFormat f32393a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f32393a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private C12449b() {
        }

        /* synthetic */ C12449b(C12448a c12448a) {
            this();
        }

        @Override // p300qb.InterfaceC11821f
        /* renamed from: b */
        public void mo5257a(Date date, InterfaceC11822g interfaceC11822g) {
            interfaceC11822g.mo4662d(f32393a.format(date));
        }
    }

    public C12447d() {
        m5259p(String.class, f32385f);
        m5259p(Boolean.class, f32386g);
        m5259p(Date.class, f32387h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m5263l(Object obj, InterfaceC11820e interfaceC11820e) {
        throw new C11815b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m5261n(Boolean bool, InterfaceC11822g interfaceC11822g) {
        interfaceC11822g.mo4661e(bool.booleanValue());
    }

    /* renamed from: i */
    public InterfaceC11814a m5266i() {
        return new C12448a();
    }

    /* renamed from: j */
    public C12447d m5265j(InterfaceC12120a interfaceC12120a) {
        interfaceC12120a.mo3320a(this);
        return this;
    }

    /* renamed from: k */
    public C12447d m5264k(boolean z) {
        this.f32391d = z;
        return this;
    }

    @Override // p321rb.InterfaceC12121b
    /* renamed from: o */
    public <T> C12447d mo4670a(Class<T> cls, InterfaceC11819d<? super T> interfaceC11819d) {
        this.f32388a.put(cls, interfaceC11819d);
        this.f32389b.remove(cls);
        return this;
    }

    /* renamed from: p */
    public <T> C12447d m5259p(Class<T> cls, InterfaceC11821f<? super T> interfaceC11821f) {
        this.f32389b.put(cls, interfaceC11821f);
        this.f32388a.remove(cls);
        return this;
    }
}

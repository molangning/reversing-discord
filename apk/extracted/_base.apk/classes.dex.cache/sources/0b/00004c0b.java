package p327ri;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AbstractC9614s;

/* renamed from: ri.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12251d {

    /* renamed from: a */
    private static final Function1<Object, Object> f31847a = C12257f.f31858j;

    /* renamed from: b */
    private static final Function1<Object, Boolean> f31848b = C12253b.f31854j;

    /* renamed from: c */
    private static final Function1<Object, Object> f31849c = C12252a.f31853j;

    /* renamed from: d */
    private static final Function1<Object, Unit> f31850d = C12254c.f31855j;

    /* renamed from: e */
    private static final Function2<Object, Object, Unit> f31851e = C12255d.f31856j;

    /* renamed from: f */
    private static final Function3<Object, Object, Object, Unit> f31852f = C12256e.f31857j;

    /* renamed from: ri.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C12252a extends AbstractC9614s implements Function1 {

        /* renamed from: j */
        public static final C12252a f31853j = new C12252a();

        C12252a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* renamed from: ri.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C12253b extends AbstractC9614s implements Function1<Object, Boolean> {

        /* renamed from: j */
        public static final C12253b f31854j = new C12253b();

        C12253b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* renamed from: ri.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C12254c extends AbstractC9614s implements Function1<Object, Unit> {

        /* renamed from: j */
        public static final C12254c f31855j = new C12254c();

        C12254c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.f25302a;
        }

        /* renamed from: invoke */
        public final void invoke2(Object obj) {
        }
    }

    /* renamed from: ri.d$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C12255d extends AbstractC9614s implements Function2<Object, Object, Unit> {

        /* renamed from: j */
        public static final C12255d f31856j = new C12255d();

        C12255d() {
            super(2);
        }

        /* renamed from: a */
        public final void m5654a(Object obj, Object obj2) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
            m5654a(obj, obj2);
            return Unit.f25302a;
        }
    }

    /* renamed from: ri.d$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C12256e extends AbstractC9614s implements Function3<Object, Object, Object, Unit> {

        /* renamed from: j */
        public static final C12256e f31857j = new C12256e();

        C12256e() {
            super(3);
        }

        /* renamed from: a */
        public final void m5653a(Object obj, Object obj2, Object obj3) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3) {
            m5653a(obj, obj2, obj3);
            return Unit.f25302a;
        }
    }

    /* renamed from: ri.d$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C12257f extends AbstractC9614s implements Function1<Object, Object> {

        /* renamed from: j */
        public static final C12257f f31858j = new C12257f();

        C12257f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* renamed from: a */
    public static final <T> Function1<T, Boolean> m5658a() {
        return (Function1<T, Boolean>) f31848b;
    }

    /* renamed from: b */
    public static final Function3<Object, Object, Object, Unit> m5657b() {
        return f31852f;
    }
}
package p142hi;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li.InterfaceC10195d;
import li.InterfaceC10200i;
import li.InterfaceC10202k;
import li.InterfaceC10207p;
import p327ri.C12263f;

/* renamed from: hi.f1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C7244f1 {

    /* renamed from: a */
    private final boolean f19651a;

    /* renamed from: b */
    private final boolean f19652b;

    /* renamed from: c */
    private final boolean f19653c;

    /* renamed from: d */
    private final InterfaceC10207p f19654d;

    /* renamed from: e */
    private final AbstractC7266h f19655e;

    /* renamed from: f */
    private final AbstractC7275i f19656f;

    /* renamed from: g */
    private int f19657g;

    /* renamed from: h */
    private boolean f19658h;

    /* renamed from: i */
    private ArrayDeque<InterfaceC10202k> f19659i;

    /* renamed from: j */
    private Set<InterfaceC10202k> f19660j;

    /* renamed from: hi.f1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public interface InterfaceC7245a {

        /* renamed from: hi.f1$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C7246a implements InterfaceC7245a {

            /* renamed from: a */
            private boolean f19661a;

            @Override // p142hi.C7244f1.InterfaceC7245a
            /* renamed from: a */
            public void mo21131a(Function0<Boolean> block) {
                C9612q.m13917h(block, "block");
                if (this.f19661a) {
                    return;
                }
                this.f19661a = block.invoke().booleanValue();
            }

            /* renamed from: b */
            public final boolean m21130b() {
                return this.f19661a;
            }
        }

        /* renamed from: a */
        void mo21131a(Function0<Boolean> function0);
    }

    /* renamed from: hi.f1$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC7247b {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* renamed from: hi.f1$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static abstract class AbstractC7248c {

        /* renamed from: hi.f1$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static abstract class AbstractC7249a extends AbstractC7248c {
            public AbstractC7249a() {
                super(null);
            }
        }

        /* renamed from: hi.f1$c$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C7250b extends AbstractC7248c {

            /* renamed from: a */
            public static final C7250b f19666a = new C7250b();

            private C7250b() {
                super(null);
            }

            @Override // p142hi.C7244f1.AbstractC7248c
            /* renamed from: a */
            public InterfaceC10202k mo20291a(C7244f1 state, InterfaceC10200i type) {
                C9612q.m13917h(state, "state");
                C9612q.m13917h(type, "type");
                return state.m21139j().mo3935z0(type);
            }
        }

        /* renamed from: hi.f1$c$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C7251c extends AbstractC7248c {

            /* renamed from: a */
            public static final C7251c f19667a = new C7251c();

            private C7251c() {
                super(null);
            }

            @Override // p142hi.C7244f1.AbstractC7248c
            /* renamed from: a */
            public /* bridge */ /* synthetic */ InterfaceC10202k mo20291a(C7244f1 c7244f1, InterfaceC10200i interfaceC10200i) {
                return (InterfaceC10202k) m21128b(c7244f1, interfaceC10200i);
            }

            /* renamed from: b */
            public Void m21128b(C7244f1 state, InterfaceC10200i type) {
                C9612q.m13917h(state, "state");
                C9612q.m13917h(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* renamed from: hi.f1$c$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C7252d extends AbstractC7248c {

            /* renamed from: a */
            public static final C7252d f19668a = new C7252d();

            private C7252d() {
                super(null);
            }

            @Override // p142hi.C7244f1.AbstractC7248c
            /* renamed from: a */
            public InterfaceC10202k mo20291a(C7244f1 state, InterfaceC10200i type) {
                C9612q.m13917h(state, "state");
                C9612q.m13917h(type, "type");
                return state.m21139j().mo4013E(type);
            }
        }

        private AbstractC7248c() {
        }

        public /* synthetic */ AbstractC7248c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public abstract InterfaceC10202k mo20291a(C7244f1 c7244f1, InterfaceC10200i interfaceC10200i);
    }

    public C7244f1(boolean z, boolean z2, boolean z3, InterfaceC10207p typeSystemContext, AbstractC7266h kotlinTypePreparator, AbstractC7275i kotlinTypeRefiner) {
        C9612q.m13917h(typeSystemContext, "typeSystemContext");
        C9612q.m13917h(kotlinTypePreparator, "kotlinTypePreparator");
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f19651a = z;
        this.f19652b = z2;
        this.f19653c = z3;
        this.f19654d = typeSystemContext;
        this.f19655e = kotlinTypePreparator;
        this.f19656f = kotlinTypeRefiner;
    }

    /* renamed from: d */
    public static /* synthetic */ Boolean m21144d(C7244f1 c7244f1, InterfaceC10200i interfaceC10200i, InterfaceC10200i interfaceC10200i2, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            return c7244f1.m21145c(interfaceC10200i, interfaceC10200i2, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
    }

    /* renamed from: c */
    public Boolean m21145c(InterfaceC10200i subType, InterfaceC10200i superType, boolean z) {
        C9612q.m13917h(subType, "subType");
        C9612q.m13917h(superType, "superType");
        return null;
    }

    /* renamed from: e */
    public final void m21143e() {
        ArrayDeque<InterfaceC10202k> arrayDeque = this.f19659i;
        C9612q.m13920e(arrayDeque);
        arrayDeque.clear();
        Set<InterfaceC10202k> set = this.f19660j;
        C9612q.m13920e(set);
        set.clear();
        this.f19658h = false;
    }

    /* renamed from: f */
    public boolean mo3934f(InterfaceC10200i subType, InterfaceC10200i superType) {
        C9612q.m13917h(subType, "subType");
        C9612q.m13917h(superType, "superType");
        return true;
    }

    /* renamed from: g */
    public EnumC7247b m21142g(InterfaceC10202k subType, InterfaceC10195d superType) {
        C9612q.m13917h(subType, "subType");
        C9612q.m13917h(superType, "superType");
        return EnumC7247b.CHECK_SUBTYPE_AND_LOWER;
    }

    /* renamed from: h */
    public final ArrayDeque<InterfaceC10202k> m21141h() {
        return this.f19659i;
    }

    /* renamed from: i */
    public final Set<InterfaceC10202k> m21140i() {
        return this.f19660j;
    }

    /* renamed from: j */
    public final InterfaceC10207p m21139j() {
        return this.f19654d;
    }

    /* renamed from: k */
    public final void m21138k() {
        this.f19658h = true;
        if (this.f19659i == null) {
            this.f19659i = new ArrayDeque<>(4);
        }
        if (this.f19660j == null) {
            this.f19660j = C12263f.f31865l.m5640a();
        }
    }

    /* renamed from: l */
    public final boolean m21137l(InterfaceC10200i type) {
        C9612q.m13917h(type, "type");
        if (this.f19653c && this.f19654d.mo4009G(type)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m21136m() {
        return this.f19651a;
    }

    /* renamed from: n */
    public final boolean m21135n() {
        return this.f19652b;
    }

    /* renamed from: o */
    public final InterfaceC10200i m21134o(InterfaceC10200i type) {
        C9612q.m13917h(type, "type");
        return this.f19655e.mo20287a(type);
    }

    /* renamed from: p */
    public final InterfaceC10200i m21133p(InterfaceC10200i type) {
        C9612q.m13917h(type, "type");
        return this.f19656f.mo20283a(type);
    }

    /* renamed from: q */
    public boolean m21132q(Function1<? super InterfaceC7245a, Unit> block) {
        C9612q.m13917h(block, "block");
        InterfaceC7245a.C7246a c7246a = new InterfaceC7245a.C7246a();
        block.invoke(c7246a);
        return c7246a.m21130b();
    }
}

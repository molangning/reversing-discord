package p086eh;

import java.util.Set;
import kotlin.collections.C9559v;
import kotlin.collections.C9561x;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hi.AbstractC7302o0;
import p142hi.C7341y;
import p142hi.EnumC7317r1;
import p305qg.InterfaceC11920f1;

/* renamed from: eh.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C6224a extends C7341y {

    /* renamed from: d */
    private final EnumC7317r1 f17632d;

    /* renamed from: e */
    private final EnumC6226c f17633e;

    /* renamed from: f */
    private final boolean f17634f;

    /* renamed from: g */
    private final boolean f17635g;

    /* renamed from: h */
    private final Set<InterfaceC11920f1> f17636h;

    /* renamed from: i */
    private final AbstractC7302o0 f17637i;

    public /* synthetic */ C6224a(EnumC7317r1 enumC7317r1, EnumC6226c enumC6226c, boolean z, boolean z2, Set set, AbstractC7302o0 abstractC7302o0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC7317r1, (i & 2) != 0 ? EnumC6226c.INFLEXIBLE : enumC6226c, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, (i & 32) != 0 ? null : abstractC7302o0);
    }

    /* renamed from: f */
    public static /* synthetic */ C6224a m23219f(C6224a c6224a, EnumC7317r1 enumC7317r1, EnumC6226c enumC6226c, boolean z, boolean z2, Set set, AbstractC7302o0 abstractC7302o0, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC7317r1 = c6224a.mo20912b();
        }
        if ((i & 2) != 0) {
            enumC6226c = c6224a.f17633e;
        }
        EnumC6226c enumC6226c2 = enumC6226c;
        if ((i & 4) != 0) {
            z = c6224a.f17634f;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = c6224a.f17635g;
        }
        boolean z4 = z2;
        Set<InterfaceC11920f1> set2 = set;
        if ((i & 16) != 0) {
            set2 = c6224a.mo20911c();
        }
        Set set3 = set2;
        if ((i & 32) != 0) {
            abstractC7302o0 = c6224a.mo20913a();
        }
        return c6224a.m23220e(enumC7317r1, enumC6226c2, z3, z4, set3, abstractC7302o0);
    }

    @Override // p142hi.C7341y
    /* renamed from: a */
    public AbstractC7302o0 mo20913a() {
        return this.f17637i;
    }

    @Override // p142hi.C7341y
    /* renamed from: b */
    public EnumC7317r1 mo20912b() {
        return this.f17632d;
    }

    @Override // p142hi.C7341y
    /* renamed from: c */
    public Set<InterfaceC11920f1> mo20911c() {
        return this.f17636h;
    }

    /* renamed from: e */
    public final C6224a m23220e(EnumC7317r1 howThisTypeIsUsed, EnumC6226c flexibility, boolean z, boolean z2, Set<? extends InterfaceC11920f1> set, AbstractC7302o0 abstractC7302o0) {
        C9612q.m13917h(howThisTypeIsUsed, "howThisTypeIsUsed");
        C9612q.m13917h(flexibility, "flexibility");
        return new C6224a(howThisTypeIsUsed, flexibility, z, z2, set, abstractC7302o0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6224a)) {
            return false;
        }
        C6224a c6224a = (C6224a) obj;
        if (!C9612q.m13922c(c6224a.mo20913a(), mo20913a()) || c6224a.mo20912b() != mo20912b() || c6224a.f17633e != this.f17633e || c6224a.f17634f != this.f17634f || c6224a.f17635g != this.f17635g) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final EnumC6226c m23218g() {
        return this.f17633e;
    }

    /* renamed from: h */
    public final boolean m23217h() {
        return this.f17635g;
    }

    @Override // p142hi.C7341y
    public int hashCode() {
        int i;
        AbstractC7302o0 mo20913a = mo20913a();
        if (mo20913a != null) {
            i = mo20913a.hashCode();
        } else {
            i = 0;
        }
        int hashCode = i + (i * 31) + mo20912b().hashCode();
        int hashCode2 = hashCode + (hashCode * 31) + this.f17633e.hashCode();
        int i2 = hashCode2 + (hashCode2 * 31) + (this.f17634f ? 1 : 0);
        return i2 + (i2 * 31) + (this.f17635g ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean m23216i() {
        return this.f17634f;
    }

    /* renamed from: j */
    public final C6224a m23215j(boolean z) {
        return m23219f(this, null, null, z, false, null, null, 59, null);
    }

    /* renamed from: k */
    public C6224a m23214k(AbstractC7302o0 abstractC7302o0) {
        return m23219f(this, null, null, false, false, null, abstractC7302o0, 31, null);
    }

    /* renamed from: l */
    public final C6224a m23213l(EnumC6226c flexibility) {
        C9612q.m13917h(flexibility, "flexibility");
        return m23219f(this, null, flexibility, false, false, null, null, 61, null);
    }

    @Override // p142hi.C7341y
    /* renamed from: m */
    public C6224a mo20910d(InterfaceC11920f1 typeParameter) {
        Set m14008c;
        C9612q.m13917h(typeParameter, "typeParameter");
        if (mo20911c() != null) {
            m14008c = C9561x.m13998m(mo20911c(), typeParameter);
        } else {
            m14008c = C9559v.m14008c(typeParameter);
        }
        return m23219f(this, null, null, false, false, m14008c, null, 47, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + mo20912b() + ", flexibility=" + this.f17633e + ", isRaw=" + this.f17634f + ", isForAnnotationParameter=" + this.f17635g + ", visitedTypeParameters=" + mo20911c() + ", defaultType=" + mo20913a() + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6224a(EnumC7317r1 howThisTypeIsUsed, EnumC6226c flexibility, boolean z, boolean z2, Set<? extends InterfaceC11920f1> set, AbstractC7302o0 abstractC7302o0) {
        super(howThisTypeIsUsed, set, abstractC7302o0);
        C9612q.m13917h(howThisTypeIsUsed, "howThisTypeIsUsed");
        C9612q.m13917h(flexibility, "flexibility");
        this.f17632d = howThisTypeIsUsed;
        this.f17633e = flexibility;
        this.f17634f = z;
        this.f17635g = z2;
        this.f17636h = set;
        this.f17637i = abstractC7302o0;
    }
}
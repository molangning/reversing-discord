package p142hi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p304qf.C11889v;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;

/* renamed from: hi.y0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7342y0 {

    /* renamed from: e */
    public static final C7343a f19787e = new C7343a(null);

    /* renamed from: a */
    private final C7342y0 f19788a;

    /* renamed from: b */
    private final InterfaceC11917e1 f19789b;

    /* renamed from: c */
    private final List<InterfaceC7288k1> f19790c;

    /* renamed from: d */
    private final Map<InterfaceC11920f1, InterfaceC7288k1> f19791d;

    /* renamed from: hi.y0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7343a {
        private C7343a() {
        }

        public /* synthetic */ C7343a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7342y0 m20905a(C7342y0 c7342y0, InterfaceC11917e1 typeAliasDescriptor, List<? extends InterfaceC7288k1> arguments) {
            int m14093t;
            List m14067J0;
            Map m6744r;
            C9612q.m13917h(typeAliasDescriptor, "typeAliasDescriptor");
            C9612q.m13917h(arguments, "arguments");
            List<InterfaceC11920f1> parameters = typeAliasDescriptor.mo4173k().getParameters();
            C9612q.m13918g(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            m14093t = C9546k.m14093t(parameters, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (InterfaceC11920f1 interfaceC11920f1 : parameters) {
                arrayList.add(interfaceC11920f1.mo4221a());
            }
            m14067J0 = C9553r.m14067J0(arrayList, arguments);
            m6744r = C11889v.m6744r(m14067J0);
            return new C7342y0(c7342y0, typeAliasDescriptor, arguments, m6744r, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C7342y0(C7342y0 c7342y0, InterfaceC11917e1 interfaceC11917e1, List<? extends InterfaceC7288k1> list, Map<InterfaceC11920f1, ? extends InterfaceC7288k1> map) {
        this.f19788a = c7342y0;
        this.f19789b = interfaceC11917e1;
        this.f19790c = list;
        this.f19791d = map;
    }

    public /* synthetic */ C7342y0(C7342y0 c7342y0, InterfaceC11917e1 interfaceC11917e1, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7342y0, interfaceC11917e1, list, map);
    }

    /* renamed from: a */
    public final List<InterfaceC7288k1> m20909a() {
        return this.f19790c;
    }

    /* renamed from: b */
    public final InterfaceC11917e1 m20908b() {
        return this.f19789b;
    }

    /* renamed from: c */
    public final InterfaceC7288k1 m20907c(InterfaceC7265g1 constructor) {
        C9612q.m13917h(constructor, "constructor");
        InterfaceC11927h mo2788p = constructor.mo2788p();
        if (mo2788p instanceof InterfaceC11920f1) {
            return this.f19791d.get(mo2788p);
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m20906d(InterfaceC11917e1 descriptor) {
        boolean z;
        C9612q.m13917h(descriptor, "descriptor");
        if (!C9612q.m13922c(this.f19789b, descriptor)) {
            C7342y0 c7342y0 = this.f19788a;
            if (c7342y0 != null) {
                z = c7342y0.m20906d(descriptor);
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
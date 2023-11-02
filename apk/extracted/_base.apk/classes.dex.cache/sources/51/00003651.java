package p142hi;

import java.util.List;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;

/* renamed from: hi.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7233e0 extends AbstractC7297n1 {

    /* renamed from: c */
    private final InterfaceC11920f1[] f19629c;

    /* renamed from: d */
    private final InterfaceC7288k1[] f19630d;

    /* renamed from: e */
    private final boolean f19631e;

    public /* synthetic */ C7233e0(InterfaceC11920f1[] interfaceC11920f1Arr, InterfaceC7288k1[] interfaceC7288k1Arr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC11920f1Arr, interfaceC7288k1Arr, (i & 4) != 0 ? false : z);
    }

    @Override // p142hi.AbstractC7297n1
    /* renamed from: b */
    public boolean mo3540b() {
        return this.f19631e;
    }

    @Override // p142hi.AbstractC7297n1
    /* renamed from: e */
    public InterfaceC7288k1 mo3539e(AbstractC7264g0 key) {
        InterfaceC11920f1 interfaceC11920f1;
        C9612q.m13917h(key, "key");
        InterfaceC11927h mo2788p = key.mo3564N0().mo2788p();
        if (mo2788p instanceof InterfaceC11920f1) {
            interfaceC11920f1 = (InterfaceC11920f1) mo2788p;
        } else {
            interfaceC11920f1 = null;
        }
        if (interfaceC11920f1 == null) {
            return null;
        }
        int index = interfaceC11920f1.getIndex();
        InterfaceC11920f1[] interfaceC11920f1Arr = this.f19629c;
        if (index >= interfaceC11920f1Arr.length || !C9612q.m13922c(interfaceC11920f1Arr[index].mo4173k(), interfaceC11920f1.mo4173k())) {
            return null;
        }
        return this.f19630d[index];
    }

    @Override // p142hi.AbstractC7297n1
    /* renamed from: f */
    public boolean mo20959f() {
        return this.f19630d.length == 0;
    }

    /* renamed from: i */
    public final InterfaceC7288k1[] m21185i() {
        return this.f19630d;
    }

    /* renamed from: j */
    public final InterfaceC11920f1[] m21184j() {
        return this.f19629c;
    }

    public C7233e0(InterfaceC11920f1[] parameters, InterfaceC7288k1[] arguments, boolean z) {
        C9612q.m13917h(parameters, "parameters");
        C9612q.m13917h(arguments, "arguments");
        this.f19629c = parameters;
        this.f19630d = arguments;
        this.f19631e = z;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7233e0(List<? extends InterfaceC11920f1> parameters, List<? extends InterfaceC7288k1> argumentsList) {
        this((InterfaceC11920f1[]) parameters.toArray(new InterfaceC11920f1[0]), (InterfaceC7288k1[]) argumentsList.toArray(new InterfaceC7288k1[0]), false, 4, null);
        C9612q.m13917h(parameters, "parameters");
        C9612q.m13917h(argumentsList, "argumentsList");
    }
}
package kotlinx.serialization.descriptors;

import bj.AbstractC2342h;
import bj.C2319a;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import gg.C6759j;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p045cj.C2616m1;
import p045cj.C2624o1;
import p045cj.InterfaceC2610l;
import p304qf.C11880m;
import p304qf.C11889v;
import pf.C11577n;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016R\u001a\u0010\u0018\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R \u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b$\u0010%R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b\u0014\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010.R \u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00103R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.R\u001b\u0010<\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010!¨\u0006B"}, m14357d2 = {"Lkotlinx/serialization/descriptors/a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lcj/l;", "", "index", "", "e", ZeroconfModule.KEY_SERVICE_NAME, "c", "", "", "f", "h", "", "j", "", "other", "equals", "hashCode", "toString", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "serialName", "Lbj/h;", "b", "Lbj/h;", "g", "()Lbj/h;", "kind", "I", "d", "()I", "elementsCount", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "annotations", "", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "", "[Ljava/lang/String;", "elementNames", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptors", "[Ljava/util/List;", "elementAnnotations", "", "[Z", "elementOptionality", "", "Ljava/util/Map;", "name2Index", "k", "typeParametersDescriptors", "l", "Lkotlin/Lazy;", "_hashCode", "typeParameters", "Lbj/a;", "builder", "<init>", "(Ljava/lang/String;Lbj/h;ILjava/util/List;Lbj/a;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.descriptors.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9928a implements SerialDescriptor, InterfaceC2610l {

    /* renamed from: a */
    private final String f25787a;

    /* renamed from: b */
    private final AbstractC2342h f25788b;

    /* renamed from: c */
    private final int f25789c;

    /* renamed from: d */
    private final List<Annotation> f25790d;

    /* renamed from: e */
    private final Set<String> f25791e;

    /* renamed from: f */
    private final String[] f25792f;

    /* renamed from: g */
    private final SerialDescriptor[] f25793g;

    /* renamed from: h */
    private final List<Annotation>[] f25794h;

    /* renamed from: i */
    private final boolean[] f25795i;

    /* renamed from: j */
    private final Map<String, Integer> f25796j;

    /* renamed from: k */
    private final SerialDescriptor[] f25797k;

    /* renamed from: l */
    private final Lazy f25798l;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: kotlinx.serialization.descriptors.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9929a extends AbstractC9614s implements Function0<Integer> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9929a() {
            super(0);
            C9928a.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            C9928a c9928a = C9928a.this;
            return Integer.valueOf(C2624o1.m32831a(c9928a, c9928a.f25797k));
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"", "it", "", "a", "(I)Ljava/lang/CharSequence;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.descriptors.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C9930b extends AbstractC9614s implements Function1<Integer, CharSequence> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9930b() {
            super(1);
            C9928a.this = r1;
        }

        /* renamed from: a */
        public final CharSequence m12935a(int i) {
            return C9928a.this.mo12686e(i) + ": " + C9928a.this.mo12683h(i).mo12682i();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return m12935a(num.intValue());
        }
    }

    public C9928a(String serialName, AbstractC2342h kind, int i, List<? extends SerialDescriptor> typeParameters, C2319a builder) {
        HashSet m14077A0;
        boolean[] m14025y0;
        Iterable<C11880m> m14238I0;
        int m14093t;
        Map<String, Integer> m6744r;
        Lazy m7601a;
        C9612q.m13917h(serialName, "serialName");
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(typeParameters, "typeParameters");
        C9612q.m13917h(builder, "builder");
        this.f25787a = serialName;
        this.f25788b = kind;
        this.f25789c = i;
        this.f25790d = builder.m33653c();
        m14077A0 = C9553r.m14077A0(builder.m33650f());
        this.f25791e = m14077A0;
        String[] strArr = (String[]) builder.m33650f().toArray(new String[0]);
        this.f25792f = strArr;
        this.f25793g = C2616m1.m32847b(builder.m33651e());
        this.f25794h = (List[]) builder.m33652d().toArray(new List[0]);
        m14025y0 = C9553r.m14025y0(builder.m33649g());
        this.f25795i = m14025y0;
        m14238I0 = C9538f.m14238I0(strArr);
        m14093t = C9546k.m14093t(m14238I0, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (C11880m c11880m : m14238I0) {
            arrayList.add(C11591x.m7577a(c11880m.m6779d(), Integer.valueOf(c11880m.m6780c())));
        }
        m6744r = C11889v.m6744r(arrayList);
        this.f25796j = m6744r;
        this.f25797k = C2616m1.m32847b(typeParameters);
        m7601a = C11577n.m7601a(new C9929a());
        this.f25798l = m7601a;
    }

    /* renamed from: l */
    private final int m12936l() {
        return ((Number) this.f25798l.getValue()).intValue();
    }

    @Override // p045cj.InterfaceC2610l
    /* renamed from: a */
    public Set<String> mo12858a() {
        return this.f25791e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo12689b() {
        return SerialDescriptor.C9927a.m12938c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo12688c(String name) {
        C9612q.m13917h(name, "name");
        Integer num = this.f25796j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public int mo12687d() {
        return this.f25789c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public String mo12686e(int i) {
        return this.f25792f[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9928a) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (C9612q.m13922c(mo12682i(), serialDescriptor.mo12682i()) && Arrays.equals(this.f25797k, ((C9928a) obj).f25797k) && mo12687d() == serialDescriptor.mo12687d()) {
                int mo12687d = mo12687d();
                for (int i = 0; i < mo12687d; i++) {
                    if (C9612q.m13922c(mo12683h(i).mo12682i(), serialDescriptor.mo12683h(i).mo12682i()) && C9612q.m13922c(mo12683h(i).mo12684g(), serialDescriptor.mo12683h(i).mo12684g())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public List<Annotation> mo12685f(int i) {
        return this.f25794h[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public AbstractC2342h mo12684g() {
        return this.f25788b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return this.f25790d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo12683h(int i) {
        return this.f25793g[i];
    }

    public int hashCode() {
        return m12936l();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo12682i() {
        return this.f25787a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.C9927a.m12939b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public boolean mo12681j(int i) {
        return this.f25795i[i];
    }

    public String toString() {
        IntRange m21916q;
        String m14046d0;
        m21916q = C6759j.m21916q(0, mo12687d());
        m14046d0 = C9553r.m14046d0(m21916q, ", ", mo12682i() + '(', ")", 0, null, new C9930b(), 24, null);
        return m14046d0;
    }
}
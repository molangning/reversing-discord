package kotlinx.serialization.internal;

import bj.AbstractC2342h;
import bj.AbstractC2345i;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import gg.C6759j;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p045cj.C2616m1;
import p045cj.C2624o1;
import p045cj.C2628p1;
import p045cj.InterfaceC2582f0;
import p045cj.InterfaceC2610l;
import p304qf.C11889v;
import pf.C11577n;
import pf.EnumC11580p;

@Metadata(m14358d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010 \u0012\u0006\u0010'\u001a\u00020\u0005¢\u0006\u0004\bK\u0010LJ\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016R\u001a\u0010\u001f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010'\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010*R\"\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010,0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00103R\"\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00105R%\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003070)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R!\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00010)8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b=\u0010>R\u001b\u0010A\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b@\u0010&R\u0014\u0010D\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010CR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\f0\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010I¨\u0006M"}, m14357d2 = {"Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lcj/l;", "", "", "", "n", ZeroconfModule.KEY_SERVICE_NAME, "", "isOptional", "", "l", "", "annotation", "r", "index", "h", "j", "", "f", "e", "c", "", "other", "equals", "hashCode", "toString", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "serialName", "Lcj/f0;", "b", "Lcj/f0;", "generatedSerializer", "I", "d", "()I", "elementsCount", "added", "", "[Ljava/lang/String;", "names", "", "[Ljava/util/List;", "propertiesAnnotations", "g", "Ljava/util/List;", "classAnnotations", "", "[Z", "elementsOptionality", "Ljava/util/Map;", "indices", "Lkotlinx/serialization/KSerializer;", "Lkotlin/Lazy;", "o", "()[Lkotlinx/serialization/KSerializer;", "childSerializers", "k", "p", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameterDescriptors", "q", "_hashCode", "Lbj/h;", "()Lbj/h;", "kind", "getAnnotations", "()Ljava/util/List;", "annotations", "", "()Ljava/util/Set;", "serialNames", "<init>", "(Ljava/lang/String;Lcj/f0;I)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, InterfaceC2610l {

    /* renamed from: a */
    private final String f25802a;

    /* renamed from: b */
    private final InterfaceC2582f0<?> f25803b;

    /* renamed from: c */
    private final int f25804c;

    /* renamed from: d */
    private int f25805d;

    /* renamed from: e */
    private final String[] f25806e;

    /* renamed from: f */
    private final List<Annotation>[] f25807f;

    /* renamed from: g */
    private List<Annotation> f25808g;

    /* renamed from: h */
    private final boolean[] f25809h;

    /* renamed from: i */
    private Map<String, Integer> f25810i;

    /* renamed from: j */
    private final Lazy f25811j;

    /* renamed from: k */
    private final Lazy f25812k;

    /* renamed from: l */
    private final Lazy f25813l;

    @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9938a extends AbstractC9614s implements Function0<Integer> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9938a() {
            super(0);
            PluginGeneratedSerialDescriptor.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = PluginGeneratedSerialDescriptor.this;
            return Integer.valueOf(C2624o1.m32831a(pluginGeneratedSerialDescriptor, pluginGeneratedSerialDescriptor.m12852p()));
        }
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"", "Lkotlinx/serialization/KSerializer;", "a", "()[Lkotlinx/serialization/KSerializer;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9939b extends AbstractC9614s implements Function0<KSerializer<?>[]> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9939b() {
            super(0);
            PluginGeneratedSerialDescriptor.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final KSerializer<?>[] invoke() {
            KSerializer<?>[] childSerializers;
            InterfaceC2582f0 interfaceC2582f0 = PluginGeneratedSerialDescriptor.this.f25803b;
            return (interfaceC2582f0 == null || (childSerializers = interfaceC2582f0.childSerializers()) == null) ? C2628p1.f7106a : childSerializers;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"", "i", "", "a", "(I)Ljava/lang/CharSequence;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C9940c extends AbstractC9614s implements Function1<Integer, CharSequence> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9940c() {
            super(1);
            PluginGeneratedSerialDescriptor.this = r1;
        }

        /* renamed from: a */
        public final CharSequence m12848a(int i) {
            return PluginGeneratedSerialDescriptor.this.mo12686e(i) + ": " + PluginGeneratedSerialDescriptor.this.mo12683h(i).mo12682i();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return m12848a(num.intValue());
        }
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9941d extends AbstractC9614s implements Function0<SerialDescriptor[]> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9941d() {
            super(0);
            PluginGeneratedSerialDescriptor.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SerialDescriptor[] invoke() {
            ArrayList arrayList;
            KSerializer<?>[] typeParametersSerializers;
            InterfaceC2582f0 interfaceC2582f0 = PluginGeneratedSerialDescriptor.this.f25803b;
            if (interfaceC2582f0 != null && (typeParametersSerializers = interfaceC2582f0.typeParametersSerializers()) != null) {
                arrayList = new ArrayList(typeParametersSerializers.length);
                for (KSerializer<?> kSerializer : typeParametersSerializers) {
                    arrayList.add(kSerializer.getDescriptor());
                }
            } else {
                arrayList = null;
            }
            return C2616m1.m32847b(arrayList);
        }
    }

    public PluginGeneratedSerialDescriptor(String serialName, InterfaceC2582f0<?> interfaceC2582f0, int i) {
        Map<String, Integer> m6754h;
        Lazy m7600b;
        Lazy m7600b2;
        Lazy m7600b3;
        C9612q.m13917h(serialName, "serialName");
        this.f25802a = serialName;
        this.f25803b = interfaceC2582f0;
        this.f25804c = i;
        this.f25805d = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.f25806e = strArr;
        int i3 = this.f25804c;
        this.f25807f = new List[i3];
        this.f25809h = new boolean[i3];
        m6754h = C11889v.m6754h();
        this.f25810i = m6754h;
        EnumC11580p enumC11580p = EnumC11580p.PUBLICATION;
        m7600b = C11577n.m7600b(enumC11580p, new C9939b());
        this.f25811j = m7600b;
        m7600b2 = C11577n.m7600b(enumC11580p, new C9941d());
        this.f25812k = m7600b2;
        m7600b3 = C11577n.m7600b(enumC11580p, new C9938a());
        this.f25813l = m7600b3;
    }

    /* renamed from: m */
    public static /* synthetic */ void m12855m(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        pluginGeneratedSerialDescriptor.m12856l(str, z);
    }

    /* renamed from: n */
    private final Map<String, Integer> m12854n() {
        HashMap hashMap = new HashMap();
        int length = this.f25806e.length;
        for (int i = 0; i < length; i++) {
            hashMap.put(this.f25806e[i], Integer.valueOf(i));
        }
        return hashMap;
    }

    /* renamed from: o */
    private final KSerializer<?>[] m12853o() {
        return (KSerializer[]) this.f25811j.getValue();
    }

    /* renamed from: q */
    private final int m12851q() {
        return ((Number) this.f25813l.getValue()).intValue();
    }

    @Override // p045cj.InterfaceC2610l
    /* renamed from: a */
    public Set<String> mo12858a() {
        return this.f25810i.keySet();
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
        Integer num = this.f25810i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public final int mo12687d() {
        return this.f25804c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public String mo12686e(int i) {
        return this.f25806e[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (C9612q.m13922c(mo12682i(), serialDescriptor.mo12682i()) && Arrays.equals(m12852p(), ((PluginGeneratedSerialDescriptor) obj).m12852p()) && mo12687d() == serialDescriptor.mo12687d()) {
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
        List<Annotation> m14104i;
        List<Annotation> list = this.f25807f[i];
        if (list == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public AbstractC2342h mo12684g() {
        return AbstractC2345i.C2346a.f6455a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        List<Annotation> m14104i;
        List<Annotation> list = this.f25808g;
        if (list == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo12683h(int i) {
        return m12853o()[i].getDescriptor();
    }

    public int hashCode() {
        return m12851q();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo12682i() {
        return this.f25802a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.C9927a.m12939b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public boolean mo12681j(int i) {
        return this.f25809h[i];
    }

    /* renamed from: l */
    public final void m12856l(String name, boolean z) {
        C9612q.m13917h(name, "name");
        String[] strArr = this.f25806e;
        int i = this.f25805d + 1;
        this.f25805d = i;
        strArr[i] = name;
        this.f25809h[i] = z;
        this.f25807f[i] = null;
        if (i == this.f25804c - 1) {
            this.f25810i = m12854n();
        }
    }

    /* renamed from: p */
    public final SerialDescriptor[] m12852p() {
        return (SerialDescriptor[]) this.f25812k.getValue();
    }

    /* renamed from: r */
    public final void m12850r(Annotation annotation) {
        C9612q.m13917h(annotation, "annotation");
        List<Annotation> list = this.f25807f[this.f25805d];
        if (list == null) {
            list = new ArrayList<>(1);
            this.f25807f[this.f25805d] = list;
        }
        list.add(annotation);
    }

    public String toString() {
        IntRange m21916q;
        String m14046d0;
        m21916q = C6759j.m21916q(0, this.f25804c);
        m14046d0 = C9553r.m14046d0(m21916q, ", ", mo12682i() + '(', ")", 0, null, new C9940c(), 24, null);
        return m14046d0;
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, InterfaceC2582f0 interfaceC2582f0, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : interfaceC2582f0, i);
    }
}
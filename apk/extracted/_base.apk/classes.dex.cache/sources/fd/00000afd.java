package p045cj;

import bj.AbstractC2342h;
import bj.AbstractC2345i;
import bj.C2335f;
import bj.C2340g;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import pf.C11577n;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\n\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m14357d2 = {"Lcj/a0;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "", "index", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "h", "", "other", "", "equals", "", "toString", "hashCode", "Lbj/h;", "m", "Lbj/h;", "g", "()Lbj/h;", "kind", "", "n", "Lkotlin/Lazy;", "s", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptors", ZeroconfModule.KEY_SERVICE_NAME, "elementsCount", "<init>", "(Ljava/lang/String;I)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2557a0 extends PluginGeneratedSerialDescriptor {

    /* renamed from: m */
    private final AbstractC2342h f7007m;

    /* renamed from: n */
    private final Lazy f7008n;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: cj.a0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C2558a extends AbstractC9614s implements Function0<SerialDescriptor[]> {

        /* renamed from: j */
        final /* synthetic */ int f7009j;

        /* renamed from: k */
        final /* synthetic */ String f7010k;

        /* renamed from: l */
        final /* synthetic */ C2557a0 f7011l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2558a(int i, String str, C2557a0 c2557a0) {
            super(0);
            this.f7009j = i;
            this.f7010k = str;
            this.f7011l = c2557a0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SerialDescriptor[] invoke() {
            int i = this.f7009j;
            SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i];
            for (int i2 = 0; i2 < i; i2++) {
                serialDescriptorArr[i2] = C2340g.m33637d(this.f7010k + '.' + this.f7011l.mo12686e(i2), AbstractC2345i.C2349d.f6458a, new SerialDescriptor[0], null, 8, null);
            }
            return serialDescriptorArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2557a0(String name, int i) {
        super(name, null, i, 2, null);
        Lazy m7601a;
        C9612q.m13917h(name, "name");
        this.f7007m = AbstractC2342h.C2344b.f6454a;
        m7601a = C11577n.m7601a(new C2558a(i, name, this));
        this.f7008n = m7601a;
    }

    /* renamed from: s */
    private final SerialDescriptor[] m32983s() {
        return (SerialDescriptor[]) this.f7008n.getValue();
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (serialDescriptor.mo12684g() == AbstractC2342h.C2344b.f6454a && C9612q.m13922c(mo12682i(), serialDescriptor.mo12682i()) && C9612q.m13922c(C2616m1.m32848a(this), C2616m1.m32848a(serialDescriptor))) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public AbstractC2342h mo12684g() {
        return this.f7007m;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo12683h(int i) {
        return m32983s()[i];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        int i;
        int hashCode = mo12682i().hashCode();
        int i2 = 1;
        for (String str : C2335f.m33643b(this)) {
            int i3 = i2 * 31;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return (hashCode * 31) + i2;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public String toString() {
        String m14046d0;
        Iterable<String> m33643b = C2335f.m33643b(this);
        m14046d0 = C9553r.m14046d0(m33643b, ", ", mo12682i() + '(', ")", 0, null, null, 56, null);
        return m14046d0;
    }
}
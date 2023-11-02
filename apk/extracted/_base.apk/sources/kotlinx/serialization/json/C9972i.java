package kotlinx.serialization.json;

import bj.AbstractC2342h;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import pf.C11577n;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0004H\u0000\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000\u001a\u0016\u0010\u000e\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¨\u0006\u000f"}, m14357d2 = {"Lkotlinx/serialization/encoding/Encoder;", "encoder", "", "h", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "g", "Lkotlinx/serialization/json/e;", "d", "Lkotlinx/serialization/json/j;", "e", "Lkotlin/Function0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "deferred", "f", "kotlinx-serialization-json"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9972i {

    @Metadata(m14358d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\u0011\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m14357d2 = {"kotlinx/serialization/json/i$a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "", "e", ZeroconfModule.KEY_SERVICE_NAME, "c", "", "", "f", "h", "", "j", "a", "Lkotlin/Lazy;", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "i", "()Ljava/lang/String;", "serialName", "Lbj/h;", "g", "()Lbj/h;", "kind", "d", "()I", "elementsCount", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.json.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9973a implements SerialDescriptor {

        /* renamed from: a */
        private final Lazy f25879a;

        C9973a(Function0<? extends SerialDescriptor> function0) {
            Lazy m7601a;
            m7601a = C11577n.m7601a(function0);
            this.f25879a = m7601a;
        }

        /* renamed from: a */
        private final SerialDescriptor m12706a() {
            return (SerialDescriptor) this.f25879a.getValue();
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
            return m12706a().mo12688c(name);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: d */
        public int mo12687d() {
            return m12706a().mo12687d();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: e */
        public String mo12686e(int i) {
            return m12706a().mo12686e(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: f */
        public List<Annotation> mo12685f(int i) {
            return m12706a().mo12685f(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: g */
        public AbstractC2342h mo12684g() {
            return m12706a().mo12684g();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List<Annotation> getAnnotations() {
            return SerialDescriptor.C9927a.m12940a(this);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: h */
        public SerialDescriptor mo12683h(int i) {
            return m12706a().mo12683h(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: i */
        public String mo12682i() {
            return m12706a().mo12682i();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isInline() {
            return SerialDescriptor.C9927a.m12939b(this);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: j */
        public boolean mo12681j(int i) {
            return m12706a().mo12681j(i);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ SerialDescriptor m12714a(Function0 function0) {
        return m12709f(function0);
    }

    /* renamed from: b */
    public static final /* synthetic */ void m12713b(Decoder decoder) {
        m12708g(decoder);
    }

    /* renamed from: c */
    public static final /* synthetic */ void m12712c(Encoder encoder) {
        m12707h(encoder);
    }

    /* renamed from: d */
    public static final InterfaceC9962e m12711d(Decoder decoder) {
        InterfaceC9962e interfaceC9962e;
        C9612q.m13917h(decoder, "<this>");
        if (decoder instanceof InterfaceC9962e) {
            interfaceC9962e = (InterfaceC9962e) decoder;
        } else {
            interfaceC9962e = null;
        }
        if (interfaceC9962e != null) {
            return interfaceC9962e;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + C9591f0.m13969b(decoder.getClass()));
    }

    /* renamed from: e */
    public static final InterfaceC9974j m12710e(Encoder encoder) {
        InterfaceC9974j interfaceC9974j;
        C9612q.m13917h(encoder, "<this>");
        if (encoder instanceof InterfaceC9974j) {
            interfaceC9974j = (InterfaceC9974j) encoder;
        } else {
            interfaceC9974j = null;
        }
        if (interfaceC9974j != null) {
            return interfaceC9974j;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + C9591f0.m13969b(encoder.getClass()));
    }

    /* renamed from: f */
    public static final SerialDescriptor m12709f(Function0<? extends SerialDescriptor> function0) {
        return new C9973a(function0);
    }

    /* renamed from: g */
    public static final void m12708g(Decoder decoder) {
        m12711d(decoder);
    }

    /* renamed from: h */
    public static final void m12707h(Encoder encoder) {
        m12710e(encoder);
    }
}

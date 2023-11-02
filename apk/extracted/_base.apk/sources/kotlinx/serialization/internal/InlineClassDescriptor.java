package kotlinx.serialization.internal;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p045cj.InterfaceC2582f0;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m14357d2 = {"Lkotlinx/serialization/internal/InlineClassDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "", "hashCode", "", "other", "", "equals", "m", "Z", "isInline", "()Z", "", ZeroconfModule.KEY_SERVICE_NAME, "Lcj/f0;", "generatedSerializer", "<init>", "(Ljava/lang/String;Lcj/f0;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class InlineClassDescriptor extends PluginGeneratedSerialDescriptor {

    /* renamed from: m */
    private final boolean f25801m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineClassDescriptor(String name, InterfaceC2582f0<?> generatedSerializer) {
        super(name, generatedSerializer, 1);
        C9612q.m13917h(name, "name");
        C9612q.m13917h(generatedSerializer, "generatedSerializer");
        this.f25801m = true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof InlineClassDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (C9612q.m13922c(mo12682i(), serialDescriptor.mo12682i())) {
                InlineClassDescriptor inlineClassDescriptor = (InlineClassDescriptor) obj;
                if (inlineClassDescriptor.isInline() && Arrays.equals(m12852p(), inlineClassDescriptor.m12852p())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && mo12687d() == serialDescriptor.mo12687d()) {
                    int mo12687d = mo12687d();
                    for (int i = 0; i < mo12687d; i++) {
                        if (C9612q.m13922c(mo12683h(i).mo12682i(), serialDescriptor.mo12683h(i).mo12682i()) && C9612q.m13922c(mo12683h(i).mo12684g(), serialDescriptor.mo12683h(i).mo12684g())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f25801m;
    }
}

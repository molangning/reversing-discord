package p045cj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m14357d2 = {"Lcj/r1;", "Lcj/u0;", "", "c", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "serialName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "primitive", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.r1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2635r1 extends AbstractC2643u0 {

    /* renamed from: c */
    private final String f7110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2635r1(SerialDescriptor primitive) {
        super(primitive, null);
        C9612q.m13917h(primitive, "primitive");
        this.f7110c = primitive.mo12682i() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo12682i() {
        return this.f7110c;
    }
}

package kotlinx.serialization.json;

import dj.C6014r0;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0017R\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, m14357d2 = {"Lkotlinx/serialization/json/n;", "Lkotlinx/serialization/json/JsonPrimitive;", "", "toString", "", "other", "", "equals", "", "hashCode", "j", "Z", "e", "()Z", "isString", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "k", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "h", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "coerceToInlineType", "l", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "content", "body", "<init>", "(Ljava/lang/Object;ZLkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9978n extends JsonPrimitive {

    /* renamed from: j */
    private final boolean f25880j;

    /* renamed from: k */
    private final SerialDescriptor f25881k;

    /* renamed from: l */
    private final String f25882l;

    public /* synthetic */ C9978n(Object obj, boolean z, SerialDescriptor serialDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z, (i & 4) != 0 ? null : serialDescriptor);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* renamed from: a */
    public String mo12700a() {
        return this.f25882l;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* renamed from: e */
    public boolean mo12699e() {
        return this.f25880j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9978n.class != obj.getClass()) {
            return false;
        }
        C9978n c9978n = (C9978n) obj;
        if (mo12699e() == c9978n.mo12699e() && C9612q.m13922c(mo12700a(), c9978n.mo12700a())) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final SerialDescriptor m12698h() {
        return this.f25881k;
    }

    public int hashCode() {
        return (C9977m.m12701a(mo12699e()) * 31) + mo12700a().hashCode();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String toString() {
        if (mo12699e()) {
            StringBuilder sb2 = new StringBuilder();
            C6014r0.m23873c(sb2, mo12700a());
            String sb3 = sb2.toString();
            C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
        return mo12700a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9978n(Object body, boolean z, SerialDescriptor serialDescriptor) {
        super(null);
        C9612q.m13917h(body, "body");
        this.f25880j = z;
        this.f25881k = serialDescriptor;
        this.f25882l = body.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
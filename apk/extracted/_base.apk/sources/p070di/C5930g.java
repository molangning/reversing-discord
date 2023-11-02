package p070di;

import kh.C9386c;
import kotlin.jvm.internal.C9612q;
import mh.AbstractC10456a;
import mh.InterfaceC10463c;
import p305qg.InterfaceC11900a1;

/* renamed from: di.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5930g {

    /* renamed from: a */
    private final InterfaceC10463c f16898a;

    /* renamed from: b */
    private final C9386c f16899b;

    /* renamed from: c */
    private final AbstractC10456a f16900c;

    /* renamed from: d */
    private final InterfaceC11900a1 f16901d;

    public C5930g(InterfaceC10463c nameResolver, C9386c classProto, AbstractC10456a metadataVersion, InterfaceC11900a1 sourceElement) {
        C9612q.m13917h(nameResolver, "nameResolver");
        C9612q.m13917h(classProto, "classProto");
        C9612q.m13917h(metadataVersion, "metadataVersion");
        C9612q.m13917h(sourceElement, "sourceElement");
        this.f16898a = nameResolver;
        this.f16899b = classProto;
        this.f16900c = metadataVersion;
        this.f16901d = sourceElement;
    }

    /* renamed from: a */
    public final InterfaceC10463c m24146a() {
        return this.f16898a;
    }

    /* renamed from: b */
    public final C9386c m24145b() {
        return this.f16899b;
    }

    /* renamed from: c */
    public final AbstractC10456a m24144c() {
        return this.f16900c;
    }

    /* renamed from: d */
    public final InterfaceC11900a1 m24143d() {
        return this.f16901d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5930g) {
            C5930g c5930g = (C5930g) obj;
            return C9612q.m13922c(this.f16898a, c5930g.f16898a) && C9612q.m13922c(this.f16899b, c5930g.f16899b) && C9612q.m13922c(this.f16900c, c5930g.f16900c) && C9612q.m13922c(this.f16901d, c5930g.f16901d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f16898a.hashCode() * 31) + this.f16899b.hashCode()) * 31) + this.f16900c.hashCode()) * 31) + this.f16901d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f16898a + ", classProto=" + this.f16899b + ", metadataVersion=" + this.f16900c + ", sourceElement=" + this.f16901d + ')';
    }
}

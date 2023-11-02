package bj;

import bj.AbstractC2345i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9538f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import kotlinx.serialization.descriptors.C9928a;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p045cj.C2644u1;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b\u001aI\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000e2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m14357d2 = {"", "serialName", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameters", "Lkotlin/Function1;", "Lbj/a;", "", "builderAction", "b", "(Ljava/lang/String;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lbj/e;", "kind", "a", "Lbj/h;", "builder", "c", "(Ljava/lang/String;Lbj/h;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: bj.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2340g {

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"Lbj/a;", "", "a", "(Lbj/a;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: bj.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C2341a extends AbstractC9614s implements Function1<C2319a, Unit> {

        /* renamed from: j */
        public static final C2341a f6452j = new C2341a();

        C2341a() {
            super(1);
        }

        /* renamed from: a */
        public final void m33636a(C2319a c2319a) {
            C9612q.m13917h(c2319a, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C2319a c2319a) {
            m33636a(c2319a);
            return Unit.f25302a;
        }
    }

    /* renamed from: a */
    public static final SerialDescriptor m33640a(String serialName, AbstractC2325e kind) {
        boolean m13751w;
        C9612q.m13917h(serialName, "serialName");
        C9612q.m13917h(kind, "kind");
        m13751w = C9653o.m13751w(serialName);
        if (!m13751w) {
            return C2644u1.m32805a(serialName, kind);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    /* renamed from: b */
    public static final SerialDescriptor m33639b(String serialName, SerialDescriptor[] typeParameters, Function1<? super C2319a, Unit> builderAction) {
        boolean m13751w;
        List m14197u0;
        C9612q.m13917h(serialName, "serialName");
        C9612q.m13917h(typeParameters, "typeParameters");
        C9612q.m13917h(builderAction, "builderAction");
        m13751w = C9653o.m13751w(serialName);
        if (!m13751w) {
            C2319a c2319a = new C2319a(serialName);
            builderAction.invoke(c2319a);
            AbstractC2345i.C2346a c2346a = AbstractC2345i.C2346a.f6455a;
            int size = c2319a.m33650f().size();
            m14197u0 = C9538f.m14197u0(typeParameters);
            return new C9928a(serialName, c2346a, size, m14197u0, c2319a);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    /* renamed from: c */
    public static final SerialDescriptor m33638c(String serialName, AbstractC2342h kind, SerialDescriptor[] typeParameters, Function1<? super C2319a, Unit> builder) {
        boolean m13751w;
        List m14197u0;
        C9612q.m13917h(serialName, "serialName");
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(typeParameters, "typeParameters");
        C9612q.m13917h(builder, "builder");
        m13751w = C9653o.m13751w(serialName);
        if (!m13751w) {
            if (!C9612q.m13922c(kind, AbstractC2345i.C2346a.f6455a)) {
                C2319a c2319a = new C2319a(serialName);
                builder.invoke(c2319a);
                int size = c2319a.m33650f().size();
                m14197u0 = C9538f.m14197u0(typeParameters);
                return new C9928a(serialName, kind, size, m14197u0, c2319a);
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    /* renamed from: d */
    public static /* synthetic */ SerialDescriptor m33637d(String str, AbstractC2342h abstractC2342h, SerialDescriptor[] serialDescriptorArr, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = C2341a.f6452j;
        }
        return m33638c(str, abstractC2342h, serialDescriptorArr, function1);
    }
}

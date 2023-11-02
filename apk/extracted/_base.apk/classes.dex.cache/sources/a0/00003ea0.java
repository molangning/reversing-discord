package kg;

import fi.C6429d;
import fi.C6474j;
import fi.InterfaceC6449f;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kg.AbstractC9262j;
import kh.C9386c;
import kh.C9425n;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.C10466e;
import mh.C10468g;
import mh.InterfaceC10463c;
import p160ih.C7550l;
import p250nh.C10890a;
import p270oh.AbstractC11112d;
import p270oh.C11122i;
import p305qg.C11974t;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p326rh.AbstractC12188i;
import p407wg.C13548d;
import p468zg.C14206a0;
import ph.C11639g;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m14357d2 = {"Lkg/k;", "", "", "a", "<init>", "()V", "b", "c", "d", "Lkg/k$a;", "Lkg/k$b;", "Lkg/k$c;", "Lkg/k$d;", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC9276k {

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m14357d2 = {"Lkg/k$a;", "Lkg/k;", "", "a", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Field;", "b", "()Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9277a extends AbstractC9276k {

        /* renamed from: a */
        private final Field f24342a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9277a(Field field) {
            super(null);
            C9612q.m13917h(field, "field");
            this.f24342a = field;
        }

        @Override // kg.AbstractC9276k
        /* renamed from: a */
        public String mo15953a() {
            StringBuilder sb2 = new StringBuilder();
            String name = this.f24342a.getName();
            C9612q.m13918g(name, "field.name");
            sb2.append(C14206a0.m450b(name));
            sb2.append("()");
            Class<?> type = this.f24342a.getType();
            C9612q.m13918g(type, "field.type");
            sb2.append(C13548d.m2245b(type));
            return sb2.toString();
        }

        /* renamed from: b */
        public final Field m15962b() {
            return this.f24342a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, m14357d2 = {"Lkg/k$b;", "Lkg/k;", "", "a", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "getterMethod", "c", "setterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9278b extends AbstractC9276k {

        /* renamed from: a */
        private final Method f24343a;

        /* renamed from: b */
        private final Method f24344b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9278b(Method getterMethod, Method method) {
            super(null);
            C9612q.m13917h(getterMethod, "getterMethod");
            this.f24343a = getterMethod;
            this.f24344b = method;
        }

        @Override // kg.AbstractC9276k
        /* renamed from: a */
        public String mo15953a() {
            String m15888b;
            m15888b = C9323n0.m15888b(this.f24343a);
            return m15888b;
        }

        /* renamed from: b */
        public final Method m15961b() {
            return this.f24343a;
        }

        /* renamed from: c */
        public final Method m15960c() {
            return this.f24344b;
        }
    }

    @Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m14357d2 = {"Lkg/k$c;", "Lkg/k;", "", "c", "a", "Lqg/u0;", "Lqg/u0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "descriptor", "Lkh/n;", "b", "Lkh/n;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "proto", "Lnh/a$d;", "Lnh/a$d;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "signature", "Lmh/c;", "d", "Lmh/c;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "nameResolver", "Lmh/g;", "e", "Lmh/g;", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "typeTable", "f", "Ljava/lang/String;", "string", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.k$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9279c extends AbstractC9276k {

        /* renamed from: a */
        private final InterfaceC11989u0 f24345a;

        /* renamed from: b */
        private final C9425n f24346b;

        /* renamed from: c */
        private final C10890a.C10898d f24347c;

        /* renamed from: d */
        private final InterfaceC10463c f24348d;

        /* renamed from: e */
        private final C10468g f24349e;

        /* renamed from: f */
        private final String f24350f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9279c(InterfaceC11989u0 descriptor, C9425n proto, C10890a.C10898d signature, InterfaceC10463c nameResolver, C10468g typeTable) {
            super(null);
            String str;
            C9612q.m13917h(descriptor, "descriptor");
            C9612q.m13917h(proto, "proto");
            C9612q.m13917h(signature, "signature");
            C9612q.m13917h(nameResolver, "nameResolver");
            C9612q.m13917h(typeTable, "typeTable");
            this.f24345a = descriptor;
            this.f24346b = proto;
            this.f24347c = signature;
            this.f24348d = nameResolver;
            this.f24349e = typeTable;
            if (signature.m9676H()) {
                str = nameResolver.getString(signature.m9681C().m9696y()) + nameResolver.getString(signature.m9681C().m9697x());
            } else {
                AbstractC11112d.C11113a m9130d = C11122i.m9130d(C11122i.f29099a, proto, nameResolver, typeTable, false, 8, null);
                if (m9130d != null) {
                    String m9142d = m9130d.m9142d();
                    str = C14206a0.m450b(m9142d) + m15958c() + "()" + m9130d.m9141e();
                } else {
                    throw new C9258h0("No field signature for property: " + descriptor);
                }
            }
            this.f24350f = str;
        }

        /* renamed from: c */
        private final String m15958c() {
            InterfaceC11947m mo4163b = this.f24345a.mo4163b();
            C9612q.m13918g(mo4163b, "descriptor.containingDeclaration");
            if (C9612q.m13922c(this.f24345a.getVisibility(), C11974t.f30969d) && (mo4163b instanceof C6429d)) {
                C9386c m22759b1 = ((C6429d) mo4163b).m22759b1();
                AbstractC12188i.C12195f<C9386c, Integer> classModuleName = C10890a.f28553i;
                C9612q.m13918g(classModuleName, "classModuleName");
                Integer num = (Integer) C10466e.m11485a(m22759b1, classModuleName);
                String str = (num == null || (str = this.f24348d.getString(num.intValue())) == null) ? "main" : "main";
                return '$' + C11639g.m7418a(str);
            } else if (C9612q.m13922c(this.f24345a.getVisibility(), C11974t.f30966a) && (mo4163b instanceof InterfaceC11945l0)) {
                InterfaceC11989u0 interfaceC11989u0 = this.f24345a;
                C9612q.m13919f(interfaceC11989u0, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
                InterfaceC6449f mo22648H = ((C6474j) interfaceC11989u0).mo22648H();
                if (mo22648H instanceof C7550l) {
                    C7550l c7550l = (C7550l) mo22648H;
                    if (c7550l.m20438f() != null) {
                        return '$' + c7550l.m20436h().m7426b();
                    }
                    return "";
                }
                return "";
            } else {
                return "";
            }
        }

        @Override // kg.AbstractC9276k
        /* renamed from: a */
        public String mo15953a() {
            return this.f24350f;
        }

        /* renamed from: b */
        public final InterfaceC11989u0 m15959b() {
            return this.f24345a;
        }

        /* renamed from: d */
        public final InterfaceC10463c m15957d() {
            return this.f24348d;
        }

        /* renamed from: e */
        public final C9425n m15956e() {
            return this.f24346b;
        }

        /* renamed from: f */
        public final C10890a.C10898d m15955f() {
            return this.f24347c;
        }

        /* renamed from: g */
        public final C10468g m15954g() {
            return this.f24349e;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, m14357d2 = {"Lkg/k$d;", "Lkg/k;", "", "a", "Lkg/j$e;", "Lkg/j$e;", "b", "()Lkg/j$e;", "getterSignature", "c", "setterSignature", "<init>", "(Lkg/j$e;Lkg/j$e;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.k$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9280d extends AbstractC9276k {

        /* renamed from: a */
        private final AbstractC9262j.C9270e f24351a;

        /* renamed from: b */
        private final AbstractC9262j.C9270e f24352b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9280d(AbstractC9262j.C9270e getterSignature, AbstractC9262j.C9270e c9270e) {
            super(null);
            C9612q.m13917h(getterSignature, "getterSignature");
            this.f24351a = getterSignature;
            this.f24352b = c9270e;
        }

        @Override // kg.AbstractC9276k
        /* renamed from: a */
        public String mo15953a() {
            return this.f24351a.mo15974a();
        }

        /* renamed from: b */
        public final AbstractC9262j.C9270e m15952b() {
            return this.f24351a;
        }

        /* renamed from: c */
        public final AbstractC9262j.C9270e m15951c() {
            return this.f24352b;
        }
    }

    private AbstractC9276k() {
    }

    public /* synthetic */ AbstractC9276k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String mo15953a();
}
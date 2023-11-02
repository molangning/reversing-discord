package fj;

import bj.AbstractC2345i;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import kotlin.text.C9659r;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC9936c;
import p045cj.AbstractC2561b;
import p045cj.AbstractC2564b1;
import p045cj.AbstractC2570c1;
import p088ej.AbstractC6257c;
import p088ej.C6258d;
import p304qf.C11889v;
import p470zi.C14275d;
import p470zi.C14278g;
import p470zi.InterfaceC14276e;
import p470zi.InterfaceC14279h;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00192\u00020\u0001:\u0005\u0011\u0019\u001a\u000e\tB\u001b\b\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\u0082\u0001\u0001\u001b¨\u0006\u001c"}, m14357d2 = {"Lfj/a;", "Lzi/e;", "T", "Lzi/h;", "serializer", "value", "", "", "", "e", "(Lzi/h;Ljava/lang/Object;)Ljava/util/Map;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "map", "d", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/util/Map;)Ljava/lang/Object;", "Lej/c;", "a", "Lej/c;", "()Lej/c;", "serializersModule", "", "ctorMarker", "<init>", "(Lej/c;Ljava/lang/Void;)V", "b", "c", "Lfj/a$a;", "kotlinx-serialization-properties"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: fj.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC6480a implements InterfaceC14276e {

    /* renamed from: b */
    public static final C6481a f18197b = new C6481a(null);

    /* renamed from: a */
    private final AbstractC6257c f18198a;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m14357d2 = {"Lfj/a$a;", "Lfj/a;", "<init>", "()V", "kotlinx-serialization-properties"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: fj.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C6481a extends AbstractC6480a {
        private C6481a() {
            super(C6258d.m23140a(), null, null);
        }

        public /* synthetic */ C6481a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b¢\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B#\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\u001a\u0010\u0007\u001a\f\u0012\u0004\u0012\u00028\u00000\u0000R\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H$J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J!\u0010\r\u001a\u00028\u0001\"\u0004\b\u0001\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0004J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\u00178\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010$¨\u0006."}, m14357d2 = {"Lfj/a$b;", "", "Value", "Lcj/b1;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lfj/a;", "j0", "Lkotlinx/serialization/encoding/c;", "b", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "G", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "", "tag", "h0", "(Ljava/lang/String;)Ljava/lang/Object;", "enumDescriptor", "", "g0", "o", "", "c", "Ljava/util/Map;", "i0", "()Ljava/util/Map;", "map", "Lej/c;", "d", "Lej/c;", "a", "()Lej/c;", "serializersModule", "e", "I", "currentIndex", "", "f", "Z", "isCollection", "g", "size", "<init>", "(Lfj/a;Ljava/util/Map;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-properties"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: fj.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public abstract class AbstractC6482b<Value> extends AbstractC2564b1 {

        /* renamed from: c */
        private final Map<String, Value> f18199c;

        /* renamed from: d */
        private final AbstractC6257c f18200d;

        /* renamed from: e */
        private int f18201e;

        /* renamed from: f */
        private final boolean f18202f;

        /* renamed from: g */
        private final int f18203g;

        /* renamed from: h */
        final /* synthetic */ AbstractC6480a f18204h;

        /* JADX WARN: Multi-variable type inference failed */
        public AbstractC6482b(AbstractC6480a abstractC6480a, Map<String, ? extends Value> map, SerialDescriptor descriptor) {
            boolean z;
            int mo12687d;
            C9612q.m13917h(map, "map");
            C9612q.m13917h(descriptor, "descriptor");
            this.f18204h = abstractC6480a;
            this.f18199c = map;
            this.f18200d = abstractC6480a.mo265a();
            if (!C9612q.m13922c(descriptor.mo12684g(), AbstractC2345i.C2347b.f6456a) && !C9612q.m13922c(descriptor.mo12684g(), AbstractC2345i.C2348c.f6457a)) {
                z = false;
            } else {
                z = true;
            }
            this.f18202f = z;
            if (z) {
                mo12687d = ViewDefaults.NUMBER_OF_LINES;
            } else {
                mo12687d = descriptor.mo12687d();
            }
            this.f18203g = mo12687d;
        }

        @Override // p045cj.AbstractC2565b2, kotlinx.serialization.encoding.Decoder
        /* renamed from: G */
        public final <T> T mo12924G(DeserializationStrategy<? extends T> deserializer) {
            String str;
            C9612q.m13917h(deserializer, "deserializer");
            Value value = this.f18199c.get("type");
            if (value != null) {
                str = value.toString();
            } else {
                str = null;
            }
            if (deserializer instanceof AbstractC2561b) {
                return (T) C14275d.m267a((AbstractC2561b) deserializer, this, str).deserialize(this);
            }
            return deserializer.deserialize(this);
        }

        @Override // kotlinx.serialization.encoding.InterfaceC9936c
        /* renamed from: a */
        public AbstractC6257c mo12873a() {
            return this.f18200d;
        }

        @Override // kotlinx.serialization.encoding.Decoder
        /* renamed from: b */
        public final InterfaceC9936c mo12920b(SerialDescriptor descriptor) {
            C9612q.m13917h(descriptor, "descriptor");
            AbstractC6482b<Value> mo22624j0 = mo22624j0(descriptor);
            m32968I(mo22624j0);
            return mo22624j0;
        }

        @Override // p045cj.AbstractC2565b2
        /* renamed from: g0 */
        public final int mo22637O(String tag, SerialDescriptor enumDescriptor) {
            Object m6753i;
            C9612q.m13917h(tag, "tag");
            C9612q.m13917h(enumDescriptor, "enumDescriptor");
            m6753i = C11889v.m6753i(this.f18199c, tag);
            if (m6753i instanceof Integer) {
                return ((Number) m6753i).intValue();
            }
            if (m6753i instanceof String) {
                int mo12688c = enumDescriptor.mo12688c((String) m6753i);
                if (mo12688c != -3) {
                    return mo12688c;
                }
                throw new C14278g("Enum '" + enumDescriptor.mo12682i() + "' does not contain element with name '" + m6753i + '\'');
            }
            throw new C14278g("Value of enum entry '" + tag + "' is neither an Int nor a String");
        }

        @Override // p045cj.AbstractC2565b2
        /* renamed from: h0 */
        public final Value mo22636W(String tag) {
            Object m6753i;
            C9612q.m13917h(tag, "tag");
            m6753i = C11889v.m6753i(this.f18199c, tag);
            return (Value) m6753i;
        }

        /* renamed from: i0 */
        protected final Map<String, Value> m22633i0() {
            return this.f18199c;
        }

        /* renamed from: j0 */
        protected abstract AbstractC6482b<Value> mo22624j0(SerialDescriptor serialDescriptor);

        @Override // kotlinx.serialization.encoding.InterfaceC9936c
        /* renamed from: o */
        public final int mo12866o(SerialDescriptor descriptor) {
            boolean m13758H;
            boolean z;
            C9612q.m13917h(descriptor, "descriptor");
            do {
                int i = this.f18201e;
                if (i < this.f18203g) {
                    this.f18201e = i + 1;
                    String mo32965Y = mo32965Y(descriptor, i);
                    Set<String> keySet = this.f18199c.keySet();
                    boolean z2 = false;
                    if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                        Iterator<T> it = keySet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String str = (String) it.next();
                            m13758H = C9653o.m13758H(str, mo32965Y, false, 2, null);
                            if (m13758H && (str.length() == mo32965Y.length() || str.charAt(mo32965Y.length()) == '.')) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    if (z2) {
                        return this.f18201e - 1;
                    }
                } else {
                    return -1;
                }
            } while (!this.f18202f);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B#\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0006\u001a\u00060\u0000R\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\u001c"}, m14357d2 = {"Lfj/a$c;", "Lfj/a$b;", "", "Lfj/a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "s0", "tag", "", "k0", "", "l0", "", "r0", "", "p0", "", "q0", "", "o0", "", "n0", "", "m0", "", "map", "<init>", "(Lfj/a;Ljava/util/Map;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-properties"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: fj.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public final class C6483c extends AbstractC6482b<String> {

        /* renamed from: i */
        final /* synthetic */ AbstractC6480a f18205i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6483c(AbstractC6480a abstractC6480a, Map<String, String> map, SerialDescriptor descriptor) {
            super(abstractC6480a, map, descriptor);
            C9612q.m13917h(map, "map");
            C9612q.m13917h(descriptor, "descriptor");
            this.f18205i = abstractC6480a;
        }

        @Override // p045cj.AbstractC2565b2
        /* renamed from: k0 */
        public boolean mo22632K(String tag) {
            C9612q.m13917h(tag, "tag");
            return Boolean.parseBoolean(mo22636W(tag));
        }

        @Override // p045cj.AbstractC2565b2
        /* renamed from: l0 */
        public byte mo22631L(String tag) {
            C9612q.m13917h(tag, "tag");
            return Byte.parseByte(mo22636W(tag));
        }

        @Override // p045cj.AbstractC2565b2
        /* renamed from: m0 */
        public char mo22630M(String tag) {
            char m13675Z0;
            C9612q.m13917h(tag, "tag");
            m13675Z0 = C9659r.m13675Z0(mo22636W(tag));
            return m13675Z0;
        }

        @Override // p045cj.AbstractC2565b2
        /* renamed from: n0 */
        public double mo22629N(String tag) {
            C9612q.m13917h(tag, "tag");
            return Double.parseDouble(mo22636W(tag));
        }

        @Override // p045cj.AbstractC2565b2
        /* renamed from: o0 */
        public float mo22628P(String tag) {
            C9612q.m13917h(tag, "tag");
            return Float.parseFloat(mo22636W(tag));
        }

        @Override // p045cj.AbstractC2565b2
        /* renamed from: p0 */
        public int mo22627R(String tag) {
            C9612q.m13917h(tag, "tag");
            return Integer.parseInt(mo22636W(tag));
        }

        @Override // p045cj.AbstractC2565b2
        /* renamed from: q0 */
        public long mo22626S(String tag) {
            C9612q.m13917h(tag, "tag");
            return Long.parseLong(mo22636W(tag));
        }

        @Override // p045cj.AbstractC2565b2
        /* renamed from: r0 */
        public short mo22625U(String tag) {
            C9612q.m13917h(tag, "tag");
            return Short.parseShort(mo22636W(tag));
        }

        @Override // fj.AbstractC6480a.AbstractC6482b
        /* renamed from: s0 */
        public C6483c mo22624j0(SerialDescriptor descriptor) {
            C9612q.m13917h(descriptor, "descriptor");
            return new C6483c(this.f18205i, m22633i0(), descriptor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\b"}, m14357d2 = {"Lfj/a$d;", "Lfj/a$e;", "", "Lfj/a;", "value", "g0", "<init>", "(Lfj/a;)V", "kotlinx-serialization-properties"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: fj.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public final class C6484d extends AbstractC6485e<Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6484d() {
            super();
            AbstractC6480a.this = r1;
        }

        @Override // fj.AbstractC6480a.AbstractC6485e
        /* renamed from: g0 */
        protected Object mo22611g0(Object value) {
            C9612q.m13917h(value, "value");
            return value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\b\b¢\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0001H$¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0001H\u0014J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0014J \u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m14357d2 = {"Lfj/a$e;", "", "Value", "Lcj/c1;", "value", "g0", "(Ljava/lang/Object;)Ljava/lang/Object;", "T", "Lzi/h;", "serializer", "", "h", "(Lzi/h;Ljava/lang/Object;)V", "", "tag", "j0", "i0", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "", "ordinal", "h0", "Lej/c;", "b", "Lej/c;", "a", "()Lej/c;", "serializersModule", "", "c", "Ljava/util/Map;", "k0", "()Ljava/util/Map;", "map", "<init>", "(Lfj/a;)V", "kotlinx-serialization-properties"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: fj.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public abstract class AbstractC6485e<Value> extends AbstractC2570c1 {

        /* renamed from: b */
        private final AbstractC6257c f18207b;

        /* renamed from: c */
        private final Map<String, Value> f18208c = new LinkedHashMap();

        public AbstractC6485e() {
            AbstractC6480a.this = r1;
            this.f18207b = r1.mo265a();
        }

        @Override // kotlinx.serialization.encoding.Encoder
        /* renamed from: a */
        public AbstractC6257c mo12932a() {
            return this.f18207b;
        }

        /* renamed from: g0 */
        protected abstract Value mo22611g0(Object obj);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p045cj.AbstractC2571c2, kotlinx.serialization.encoding.Encoder
        /* renamed from: h */
        public final <T> void mo12895h(InterfaceC14279h<? super T> serializer, T t) {
            C9612q.m13917h(serializer, "serializer");
            if (serializer instanceof AbstractC2561b) {
                C9612q.m13919f(t, "null cannot be cast to non-null type kotlin.Any");
                C14275d.m266b((AbstractC2561b) serializer, this, t).serialize(this, t);
                return;
            }
            serializer.serialize(this, t);
        }

        @Override // p045cj.AbstractC2571c2
        /* renamed from: h0 */
        public void mo22614M(String tag, SerialDescriptor enumDescriptor, int i) {
            C9612q.m13917h(tag, "tag");
            C9612q.m13917h(enumDescriptor, "enumDescriptor");
            this.f18208c.put(tag, mo22611g0(enumDescriptor.mo12686e(i)));
        }

        @Override // p045cj.AbstractC2571c2
        /* renamed from: i0 */
        public void mo22613S(String tag) {
            C9612q.m13917h(tag, "tag");
        }

        @Override // p045cj.AbstractC2571c2
        /* renamed from: j0 */
        public void mo22612V(String tag, Object value) {
            C9612q.m13917h(tag, "tag");
            C9612q.m13917h(value, "value");
            this.f18208c.put(tag, mo22611g0(value));
        }

        /* renamed from: k0 */
        public final Map<String, Value> m22607k0() {
            return this.f18208c;
        }
    }

    private AbstractC6480a(AbstractC6257c abstractC6257c, Void r2) {
        this.f18198a = abstractC6257c;
    }

    public /* synthetic */ AbstractC6480a(AbstractC6257c abstractC6257c, Void r2, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6257c, r2);
    }

    @Override // p470zi.InterfaceC14276e
    /* renamed from: a */
    public AbstractC6257c mo265a() {
        return this.f18198a;
    }

    /* renamed from: d */
    public final <T> T m22639d(DeserializationStrategy<? extends T> deserializer, Map<String, String> map) {
        C9612q.m13917h(deserializer, "deserializer");
        C9612q.m13917h(map, "map");
        return (T) new C6483c(this, map, deserializer.getDescriptor()).mo12924G(deserializer);
    }

    /* renamed from: e */
    public final <T> Map<String, Object> m22638e(InterfaceC14279h<? super T> serializer, T t) {
        C9612q.m13917h(serializer, "serializer");
        C6484d c6484d = new C6484d();
        c6484d.mo12895h(serializer, t);
        return c6484d.m22607k0();
    }
}
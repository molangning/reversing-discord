package p325rg;

import com.facebook.react.util.JSStackTrace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C9538f;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p304qf.C11889v;
import pf.C11591x;

/* renamed from: rg.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public enum EnumC12168n {
    CLASS("class", false, 2, null),
    ANNOTATION_CLASS("annotation class", false, 2, null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, null),
    FIELD("field", false, 2, null),
    LOCAL_VARIABLE("local variable", false, 2, null),
    VALUE_PARAMETER("value parameter", false, 2, null),
    CONSTRUCTOR("constructor", false, 2, null),
    FUNCTION("function", false, 2, null),
    PROPERTY_GETTER("getter", false, 2, null),
    PROPERTY_SETTER("setter", false, 2, null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE(JSStackTrace.FILE_KEY, false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    STANDALONE_OBJECT("standalone object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    BACKING_FIELD("backing field", false, 2, null),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    

    /* renamed from: A */
    private static final List<EnumC12168n> f31622A;

    /* renamed from: B */
    private static final Map<EnumC12152e, EnumC12168n> f31623B;

    /* renamed from: n */
    private static final Set<EnumC12168n> f31663n;

    /* renamed from: o */
    private static final Set<EnumC12168n> f31665o;

    /* renamed from: p */
    private static final List<EnumC12168n> f31667p;

    /* renamed from: q */
    private static final List<EnumC12168n> f31669q;

    /* renamed from: r */
    private static final List<EnumC12168n> f31671r;

    /* renamed from: s */
    private static final List<EnumC12168n> f31673s;

    /* renamed from: t */
    private static final List<EnumC12168n> f31675t;

    /* renamed from: u */
    private static final List<EnumC12168n> f31677u;

    /* renamed from: v */
    private static final List<EnumC12168n> f31678v;

    /* renamed from: w */
    private static final List<EnumC12168n> f31679w;

    /* renamed from: x */
    private static final List<EnumC12168n> f31680x;

    /* renamed from: y */
    private static final List<EnumC12168n> f31681y;

    /* renamed from: z */
    private static final List<EnumC12168n> f31682z;

    /* renamed from: j */
    private final String f31683j;

    /* renamed from: k */
    private final boolean f31684k;

    /* renamed from: l */
    public static final C12169a f31659l = new C12169a(null);

    /* renamed from: m */
    private static final HashMap<String, EnumC12168n> f31661m = new HashMap<>();

    /* renamed from: rg.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12169a {
        private C12169a() {
        }

        public /* synthetic */ C12169a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        EnumC12168n[] values;
        Set<EnumC12168n> m14071G0;
        Set<EnumC12168n> m14240H0;
        List<EnumC12168n> m14101l;
        List<EnumC12168n> m14101l2;
        List<EnumC12168n> m14101l3;
        List<EnumC12168n> m14101l4;
        List<EnumC12168n> m14101l5;
        List<EnumC12168n> m14101l6;
        List<EnumC12168n> m14101l7;
        List<EnumC12168n> m14101l8;
        List<EnumC12168n> m14109d;
        List<EnumC12168n> m14109d2;
        List<EnumC12168n> m14109d3;
        List<EnumC12168n> m14109d4;
        Map<EnumC12152e, EnumC12168n> m6751k;
        for (EnumC12168n enumC12168n : values()) {
            f31661m.put(enumC12168n.name(), enumC12168n);
        }
        EnumC12168n[] values2 = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC12168n enumC12168n2 : values2) {
            if (enumC12168n2.f31684k) {
                arrayList.add(enumC12168n2);
            }
        }
        m14071G0 = C9553r.m14071G0(arrayList);
        f31663n = m14071G0;
        m14240H0 = C9538f.m14240H0(values());
        f31665o = m14240H0;
        EnumC12168n enumC12168n3 = CLASS;
        m14101l = C9545j.m14101l(ANNOTATION_CLASS, enumC12168n3);
        f31667p = m14101l;
        m14101l2 = C9545j.m14101l(LOCAL_CLASS, enumC12168n3);
        f31669q = m14101l2;
        m14101l3 = C9545j.m14101l(CLASS_ONLY, enumC12168n3);
        f31671r = m14101l3;
        EnumC12168n enumC12168n4 = OBJECT;
        m14101l4 = C9545j.m14101l(COMPANION_OBJECT, enumC12168n4, enumC12168n3);
        f31673s = m14101l4;
        m14101l5 = C9545j.m14101l(STANDALONE_OBJECT, enumC12168n4, enumC12168n3);
        f31675t = m14101l5;
        m14101l6 = C9545j.m14101l(INTERFACE, enumC12168n3);
        f31677u = m14101l6;
        m14101l7 = C9545j.m14101l(ENUM_CLASS, enumC12168n3);
        f31678v = m14101l7;
        EnumC12168n enumC12168n5 = PROPERTY;
        EnumC12168n enumC12168n6 = FIELD;
        m14101l8 = C9545j.m14101l(ENUM_ENTRY, enumC12168n5, enumC12168n6);
        f31679w = m14101l8;
        EnumC12168n enumC12168n7 = PROPERTY_SETTER;
        m14109d = C9544i.m14109d(enumC12168n7);
        f31680x = m14109d;
        EnumC12168n enumC12168n8 = PROPERTY_GETTER;
        m14109d2 = C9544i.m14109d(enumC12168n8);
        f31681y = m14109d2;
        m14109d3 = C9544i.m14109d(FUNCTION);
        f31682z = m14109d3;
        EnumC12168n enumC12168n9 = FILE;
        m14109d4 = C9544i.m14109d(enumC12168n9);
        f31622A = m14109d4;
        EnumC12152e enumC12152e = EnumC12152e.CONSTRUCTOR_PARAMETER;
        EnumC12168n enumC12168n10 = VALUE_PARAMETER;
        m6751k = C11889v.m6751k(C11591x.m7577a(enumC12152e, enumC12168n10), C11591x.m7577a(EnumC12152e.FIELD, enumC12168n6), C11591x.m7577a(EnumC12152e.PROPERTY, enumC12168n5), C11591x.m7577a(EnumC12152e.FILE, enumC12168n9), C11591x.m7577a(EnumC12152e.PROPERTY_GETTER, enumC12168n8), C11591x.m7577a(EnumC12152e.PROPERTY_SETTER, enumC12168n7), C11591x.m7577a(EnumC12152e.RECEIVER, enumC12168n10), C11591x.m7577a(EnumC12152e.SETTER_PARAMETER, enumC12168n10), C11591x.m7577a(EnumC12152e.PROPERTY_DELEGATE_FIELD, enumC12168n6));
        f31623B = m6751k;
    }

    EnumC12168n(String str, boolean z) {
        this.f31683j = str;
        this.f31684k = z;
    }

    /* synthetic */ EnumC12168n(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
package dj;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.AbstractC9577j;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.json.C9960c;
import kotlinx.serialization.json.C9978n;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p388vf.C13277d;
import pf.AbstractC11551c;
import pf.C11545a;
import pf.C11548b;
import pf.C11568i;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\u0006\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0006\u0010\u000e\u001a\u00020\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m14357d2 = {"Ldj/j0;", "", "Lkotlinx/serialization/json/JsonElement;", "i", "Lpf/c;", "", "h", "(Lpf/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "", "isString", "Lkotlinx/serialization/json/JsonPrimitive;", "j", "g", "e", "Ldj/a;", "a", "Ldj/a;", "lexer", "b", "Z", "isLenient", "", "c", "I", "stackDepth", "Lkotlinx/serialization/json/c;", "configuration", "<init>", "(Lkotlinx/serialization/json/c;Ldj/a;)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5993j0 {

    /* renamed from: a */
    private final AbstractC5972a f17044a;

    /* renamed from: b */
    private final boolean f17045b;

    /* renamed from: c */
    private int f17046c;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, m14357d2 = {"Lpf/c;", "", "Lkotlinx/serialization/json/JsonElement;", "it", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", m13986f = "JsonTreeReader.kt", m13985l = {112}, m13984m = "invokeSuspend")
    /* renamed from: dj.j0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5994a extends AbstractC9577j implements Function3<AbstractC11551c<Unit, JsonElement>, Unit, Continuation<? super JsonElement>, Object> {

        /* renamed from: k */
        int f17047k;

        /* renamed from: l */
        private /* synthetic */ Object f17048l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5994a(Continuation<? super C5994a> continuation) {
            super(3, continuation);
            C5993j0.this = r1;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: b */
        public final Object invoke(AbstractC11551c<Unit, JsonElement> abstractC11551c, Unit unit, Continuation<? super JsonElement> continuation) {
            C5994a c5994a = new C5994a(continuation);
            c5994a.f17048l = abstractC11551c;
            return c5994a.invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            m2869d = C13277d.m2869d();
            int i = this.f17047k;
            if (i != 0) {
                if (i == 1) {
                    C11586t.m7586b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C11586t.m7586b(obj);
                AbstractC11551c abstractC11551c = (AbstractC11551c) this.f17048l;
                byte m24047E = C5993j0.this.f17044a.m24047E();
                if (m24047E == 1) {
                    return C5993j0.this.m23924j(true);
                }
                if (m24047E == 0) {
                    return C5993j0.this.m23924j(false);
                }
                if (m24047E == 6) {
                    C5993j0 c5993j0 = C5993j0.this;
                    this.f17047k = 1;
                    obj = c5993j0.m23926h(abstractC11551c, this);
                    if (obj == m2869d) {
                        return m2869d;
                    }
                } else if (m24047E == 8) {
                    return C5993j0.this.m23928f();
                } else {
                    AbstractC5972a.m24019y(C5993j0.this.f17044a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new C11568i();
                }
            }
            return (JsonElement) obj;
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "kotlinx.serialization.json.internal.JsonTreeReader", m13986f = "JsonTreeReader.kt", m13985l = {23}, m13984m = "readObject")
    /* renamed from: dj.j0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5995b extends AbstractC9570d {

        /* renamed from: j */
        Object f17050j;

        /* renamed from: k */
        Object f17051k;

        /* renamed from: l */
        Object f17052l;

        /* renamed from: m */
        Object f17053m;

        /* renamed from: n */
        /* synthetic */ Object f17054n;

        /* renamed from: p */
        int f17056p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5995b(Continuation<? super C5995b> continuation) {
            super(continuation);
            C5993j0.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f17054n = obj;
            this.f17056p |= Integer.MIN_VALUE;
            return C5993j0.this.m23926h(null, this);
        }
    }

    public C5993j0(C9960c configuration, AbstractC5972a lexer) {
        C9612q.m13917h(configuration, "configuration");
        C9612q.m13917h(lexer, "lexer");
        this.f17044a = lexer;
        this.f17045b = configuration.m12745m();
    }

    /* renamed from: f */
    public final JsonElement m23928f() {
        boolean z;
        int i;
        byte mo23881m = this.f17044a.mo23881m();
        if (this.f17044a.m24047E() != 4) {
            ArrayList arrayList = new ArrayList();
            while (this.f17044a.mo23884f()) {
                arrayList.add(m23929e());
                mo23881m = this.f17044a.mo23881m();
                if (mo23881m != 4) {
                    AbstractC5972a abstractC5972a = this.f17044a;
                    if (mo23881m == 9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    i = abstractC5972a.f17004a;
                    if (!z) {
                        AbstractC5972a.m24019y(abstractC5972a, "Expected end of the array or comma", i, null, 4, null);
                        throw new C11568i();
                    }
                }
            }
            if (mo23881m == 8) {
                this.f17044a.m24029n((byte) 9);
            } else if (mo23881m == 4) {
                AbstractC5972a.m24019y(this.f17044a, "Unexpected trailing comma", 0, null, 6, null);
                throw new C11568i();
            }
            return new JsonArray(arrayList);
        }
        AbstractC5972a.m24019y(this.f17044a, "Unexpected leading comma", 0, null, 6, null);
        throw new C11568i();
    }

    /* renamed from: g */
    private final JsonElement m23927g() {
        return (JsonElement) C11548b.m7688b(new C11545a(new C5994a(null)), Unit.f25302a);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x009c -> B:70:0x00a6). Please submit an issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m23926h(pf.AbstractC11551c<kotlin.Unit, kotlinx.serialization.json.JsonElement> r21, kotlin.coroutines.Continuation<? super kotlinx.serialization.json.JsonElement> r22) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dj.C5993j0.m23926h(pf.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: i */
    private final JsonElement m23925i() {
        String m24027q;
        byte m24029n = this.f17044a.m24029n((byte) 6);
        if (this.f17044a.m24047E() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.f17044a.mo23884f()) {
                    break;
                }
                if (this.f17045b) {
                    m24027q = this.f17044a.m24025s();
                } else {
                    m24027q = this.f17044a.m24027q();
                }
                this.f17044a.m24029n((byte) 5);
                linkedHashMap.put(m24027q, m23929e());
                m24029n = this.f17044a.mo23881m();
                if (m24029n != 4) {
                    if (m24029n != 7) {
                        AbstractC5972a.m24019y(this.f17044a, "Expected end of the object or comma", 0, null, 6, null);
                        throw new C11568i();
                    }
                }
            }
            if (m24029n == 6) {
                this.f17044a.m24029n((byte) 7);
            } else if (m24029n == 4) {
                AbstractC5972a.m24019y(this.f17044a, "Unexpected trailing comma", 0, null, 6, null);
                throw new C11568i();
            }
            return new JsonObject(linkedHashMap);
        }
        AbstractC5972a.m24019y(this.f17044a, "Unexpected leading comma", 0, null, 6, null);
        throw new C11568i();
    }

    /* renamed from: j */
    public final JsonPrimitive m23924j(boolean z) {
        String m24025s;
        if (!this.f17045b && z) {
            m24025s = this.f17044a.m24027q();
        } else {
            m24025s = this.f17044a.m24025s();
        }
        String str = m24025s;
        if (!z && C9612q.m13922c(str, "null")) {
            return JsonNull.INSTANCE;
        }
        return new C9978n(str, z, null, 4, null);
    }

    /* renamed from: e */
    public final JsonElement m23929e() {
        JsonElement m23925i;
        byte m24047E = this.f17044a.m24047E();
        if (m24047E == 1) {
            return m23924j(true);
        }
        if (m24047E == 0) {
            return m23924j(false);
        }
        if (m24047E == 6) {
            int i = this.f17046c + 1;
            this.f17046c = i;
            if (i == 200) {
                m23925i = m23927g();
            } else {
                m23925i = m23925i();
            }
            this.f17046c--;
            return m23925i;
        } else if (m24047E == 8) {
            return m23928f();
        } else {
            AbstractC5972a.m24019y(this.f17044a, "Cannot begin reading element, unexpected token: " + ((int) m24047E), 0, null, 6, null);
            throw new C11568i();
        }
    }
}
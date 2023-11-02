package kg;

import ag.C0156a;
import ai.InterfaceC0194h;
import ai.InterfaceC0200k;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import fi.C6429d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kg.AbstractC9327p;
import kg.C9271j0;
import kh.C9386c;
import kh.C9425n;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9604l0;
import kotlin.jvm.internal.C9605m;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import mh.C10466e;
import ng.AbstractC10870h;
import ng.C10864c;
import ng.C10865d;
import p070di.C5958w;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p182jh.C8942a;
import p250nh.C10890a;
import p305qg.C11994x;
import p305qg.EnumC11918f;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11944l;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11998y;
import p326rh.AbstractC12188i;
import p327ri.C12242a;
import p407wg.C13548d;
import p429xh.C13801c;
import p448yg.EnumC14023d;
import pf.C11581q;
import ph.C11632b;
import ph.C11633c;
import ph.C11638f;
import th.C12758e;
import vg.C13283f;
import vg.C13289k;

@Metadata(m14358d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0001BB\u0015\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b@\u0010AJ\b\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0016J\u0013\u0010\u0017\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R \u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR9\u0010(\u001a$\u0012 \u0012\u001e #*\u000e\u0018\u00010\"R\b\u0012\u0004\u0012\u00028\u00000\u00000\"R\b\u0012\u0004\u0012\u00028\u00000\u00000!8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00101\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0014\u00105\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020:8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<¨\u0006C"}, m14357d2 = {"Lkg/m;", "", "T", "Lkg/p;", "Lkotlin/reflect/KClass;", "Lkg/n;", "Lkg/g0;", "", "R", "Lph/f;", ZeroconfModule.KEY_SERVICE_NAME, "", "Lqg/u0;", "D", "Lqg/y;", "z", "", "index", "A", "value", "", "d", "other", "equals", "hashCode", "", "toString", "Ljava/lang/Class;", "m", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "jClass", "Lkg/j0$b;", "Lkg/m$a;", "kotlin.jvm.PlatformType", "n", "Lkg/j0$b;", "N", "()Lkg/j0$b;", "data", "Lqg/l;", "y", "()Ljava/util/Collection;", "constructorDescriptors", "l", "()Ljava/lang/String;", "simpleName", "i", "qualifiedName", "Lph/b;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classId", "Lqg/e;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lai/h;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "<init>", "(Ljava/lang/Class;)V", "a", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C9296m<T> extends AbstractC9327p implements KClass<T>, InterfaceC9322n, InterfaceC9256g0 {

    /* renamed from: m */
    private final Class<T> f24371m;

    /* renamed from: n */
    private final C9271j0.C9273b<C9296m<T>.C9297a> f24372n;

    @Metadata(m14358d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\bG\u0010HJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002R\u001b\u0010\f\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u0014R-\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u00198FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR%\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b#\u0010\u001dR#\u0010*\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010\u001f\u001a\u0004\b'\u0010(R!\u0010.\u001a\b\u0012\u0004\u0012\u00020+0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\t\u001a\u0004\b-\u0010\u0011R!\u00102\u001a\b\u0012\u0004\u0012\u00020/0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\t\u001a\u0004\b1\u0010\u0011R)\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000!0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\t\u001a\u0004\b4\u0010\u0011R%\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\"\u0010\u001dR%\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b%\u0010\u001dR%\u0010:\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\t\u001a\u0004\b0\u0010\u001dR%\u0010<\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\t\u001a\u0004\b3\u0010\u001dR%\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\t\u001a\u0004\b\u0016\u0010\u001dR%\u0010@\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\t\u001a\u0004\b\u001b\u0010\u001dR%\u0010C\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\t\u001a\u0004\bB\u0010\u001dR%\u0010F\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\t\u001a\u0004\bE\u0010\u001d¨\u0006I"}, m14357d2 = {"Lkg/m$a;", "Lkg/p$b;", "Lkg/p;", "Ljava/lang/Class;", "jClass", "", "f", "Lqg/e;", "d", "Lkg/j0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "", "", "e", "getAnnotations", "()Ljava/util/List;", "annotations", "o", "()Ljava/lang/String;", "simpleName", "g", "n", "qualifiedName", "", "Lkotlin/reflect/KFunction;", "h", "getConstructors", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "Lkotlin/reflect/KClass;", "i", "getNestedClasses", "nestedClasses", "j", "Lkg/j0$b;", "getObjectInstance", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "Lhg/i;", "k", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KType;", "l", "getSupertypes", "supertypes", "m", "getSealedSubclasses", "sealedSubclasses", "Lkg/l;", "declaredNonStaticMembers", "declaredStaticMembers", "p", "inheritedNonStaticMembers", "q", "inheritedStaticMembers", "r", "allNonStaticMembers", "s", "allStaticMembers", "t", "getDeclaredMembers", "declaredMembers", "u", "getAllMembers", "allMembers", "<init>", "(Lkg/m;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kg.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public final class C9297a extends AbstractC9327p.AbstractC9329b {

        /* renamed from: w */
        static final /* synthetic */ KProperty<Object>[] f24373w = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "annotations", "getAnnotations()Ljava/util/List;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "constructors", "getConstructors()Ljava/util/Collection;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "supertypes", "getSupertypes()Ljava/util/List;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C9297a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* renamed from: d */
        private final C9271j0.C9272a f24374d;

        /* renamed from: e */
        private final C9271j0.C9272a f24375e;

        /* renamed from: f */
        private final C9271j0.C9272a f24376f;

        /* renamed from: g */
        private final C9271j0.C9272a f24377g;

        /* renamed from: h */
        private final C9271j0.C9272a f24378h;

        /* renamed from: i */
        private final C9271j0.C9272a f24379i;

        /* renamed from: j */
        private final C9271j0.C9273b f24380j;

        /* renamed from: k */
        private final C9271j0.C9272a f24381k;

        /* renamed from: l */
        private final C9271j0.C9272a f24382l;

        /* renamed from: m */
        private final C9271j0.C9272a f24383m;

        /* renamed from: n */
        private final C9271j0.C9272a f24384n;

        /* renamed from: o */
        private final C9271j0.C9272a f24385o;

        /* renamed from: p */
        private final C9271j0.C9272a f24386p;

        /* renamed from: q */
        private final C9271j0.C9272a f24387q;

        /* renamed from: r */
        private final C9271j0.C9272a f24388r;

        /* renamed from: s */
        private final C9271j0.C9272a f24389s;

        /* renamed from: t */
        private final C9271j0.C9272a f24390t;

        /* renamed from: u */
        private final C9271j0.C9272a f24391u;

        @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"", "T", "", "Lkg/l;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.m$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9298a extends AbstractC9614s implements Function0<List<? extends AbstractC9282l<?>>> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T>.C9297a f24393j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9298a(C9296m<T>.C9297a c9297a) {
                super(0);
                this.f24393j = c9297a;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC9282l<?>> invoke() {
                List<? extends AbstractC9282l<?>> m14036n0;
                m14036n0 = C9553r.m14036n0(this.f24393j.m15914g(), this.f24393j.m15913h());
                return m14036n0;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"", "T", "", "Lkg/l;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.m$a$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9299b extends AbstractC9614s implements Function0<List<? extends AbstractC9282l<?>>> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T>.C9297a f24394j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9299b(C9296m<T>.C9297a c9297a) {
                super(0);
                this.f24394j = c9297a;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC9282l<?>> invoke() {
                List<? extends AbstractC9282l<?>> m14036n0;
                m14036n0 = C9553r.m14036n0(this.f24394j.m15912i(), this.f24394j.m15909l());
                return m14036n0;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"", "T", "", "Lkg/l;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.m$a$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9300c extends AbstractC9614s implements Function0<List<? extends AbstractC9282l<?>>> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T>.C9297a f24395j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9300c(C9296m<T>.C9297a c9297a) {
                super(0);
                this.f24395j = c9297a;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC9282l<?>> invoke() {
                List<? extends AbstractC9282l<?>> m14036n0;
                m14036n0 = C9553r.m14036n0(this.f24395j.m15911j(), this.f24395j.m15908m());
                return m14036n0;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m14357d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "T", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* renamed from: kg.m$a$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9301d extends AbstractC9614s implements Function0<List<? extends Annotation>> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T>.C9297a f24396j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9301d(C9296m<T>.C9297a c9297a) {
                super(0);
                this.f24396j = c9297a;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Annotation> invoke() {
                return C9336p0.m15855e(this.f24396j.m15910k());
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m14357d2 = {"<anonymous>", "", "Lkotlin/reflect/KFunction;", "T", "kotlin.jvm.PlatformType", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* renamed from: kg.m$a$e */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9302e extends AbstractC9614s implements Function0<List<? extends KFunction<? extends T>>> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T> f24397j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9302e(C9296m<T> c9296m) {
                super(0);
                this.f24397j = c9296m;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<KFunction<T>> invoke() {
                int m14093t;
                Collection<InterfaceC11944l> mo15801y = this.f24397j.mo15801y();
                C9296m<T> c9296m = this.f24397j;
                m14093t = C9546k.m14093t(mo15801y, 10);
                ArrayList arrayList = new ArrayList(m14093t);
                for (InterfaceC11944l interfaceC11944l : mo15801y) {
                    arrayList.add(new C9338q(c9296m, interfaceC11944l));
                }
                return arrayList;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"", "T", "", "Lkg/l;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.m$a$f */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9303f extends AbstractC9614s implements Function0<List<? extends AbstractC9282l<?>>> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T>.C9297a f24398j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9303f(C9296m<T>.C9297a c9297a) {
                super(0);
                this.f24398j = c9297a;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AbstractC9282l<?>> invoke() {
                List<? extends AbstractC9282l<?>> m14036n0;
                m14036n0 = C9553r.m14036n0(this.f24398j.m15912i(), this.f24398j.m15911j());
                return m14036n0;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"", "T", "", "Lkg/l;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.m$a$g */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9304g extends AbstractC9614s implements Function0<Collection<? extends AbstractC9282l<?>>> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T> f24399j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9304g(C9296m<T> c9296m) {
                super(0);
                this.f24399j = c9296m;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final Collection<AbstractC9282l<?>> invoke() {
                C9296m<T> c9296m = this.f24399j;
                return c9296m.m15885B(c9296m.m15922P(), AbstractC9327p.EnumC9331c.DECLARED);
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"", "T", "", "Lkg/l;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.m$a$h */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9305h extends AbstractC9614s implements Function0<Collection<? extends AbstractC9282l<?>>> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T> f24400j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9305h(C9296m<T> c9296m) {
                super(0);
                this.f24400j = c9296m;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final Collection<AbstractC9282l<?>> invoke() {
                C9296m<T> c9296m = this.f24400j;
                return c9296m.m15885B(c9296m.m15921Q(), AbstractC9327p.EnumC9331c.DECLARED);
            }
        }

        @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"", "T", "Lqg/e;", "kotlin.jvm.PlatformType", "a", "()Lqg/e;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.m$a$i */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9306i extends AbstractC9614s implements Function0<InterfaceC11914e> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T> f24401j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9306i(C9296m<T> c9296m) {
                super(0);
                this.f24401j = c9296m;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC11914e invoke() {
                InterfaceC11914e m6652a;
                C11632b m15925M = this.f24401j.m15925M();
                C13289k m15867a = this.f24401j.m15924N().invoke().m15867a();
                if (m15925M.m7462k()) {
                    m6652a = m15867a.m2840a().m24130b(m15925M);
                } else {
                    m6652a = C11994x.m6652a(m15867a.m2839b(), m15925M);
                }
                if (m6652a != null) {
                    return m6652a;
                }
                this.f24401j.m15920R();
                throw null;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"", "T", "", "Lkg/l;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.m$a$j */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9307j extends AbstractC9614s implements Function0<Collection<? extends AbstractC9282l<?>>> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T> f24402j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9307j(C9296m<T> c9296m) {
                super(0);
                this.f24402j = c9296m;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final Collection<AbstractC9282l<?>> invoke() {
                C9296m<T> c9296m = this.f24402j;
                return c9296m.m15885B(c9296m.m15922P(), AbstractC9327p.EnumC9331c.INHERITED);
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"", "T", "", "Lkg/l;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.m$a$k */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9308k extends AbstractC9614s implements Function0<Collection<? extends AbstractC9282l<?>>> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T> f24403j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9308k(C9296m<T> c9296m) {
                super(0);
                this.f24403j = c9296m;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final Collection<AbstractC9282l<?>> invoke() {
                C9296m<T> c9296m = this.f24403j;
                return c9296m.m15885B(c9296m.m15921Q(), AbstractC9327p.EnumC9331c.INHERITED);
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a6\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u00000\u0003 \u0004*\u001a\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"", "T", "", "Lkg/m;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.m$a$l */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9309l extends AbstractC9614s implements Function0<List<? extends C9296m<? extends Object>>> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T>.C9297a f24404j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9309l(C9296m<T>.C9297a c9297a) {
                super(0);
                this.f24404j = c9297a;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends C9296m<? extends Object>> invoke() {
                InterfaceC0194h mo4228Q = this.f24404j.m15910k().mo4228Q();
                C9612q.m13918g(mo4228Q, "descriptor.unsubstitutedInnerClassesScope");
                Collection m40970a = InterfaceC0200k.C0201a.m40970a(mo4228Q, null, null, 3, null);
                ArrayList<InterfaceC11947m> arrayList = new ArrayList();
                for (T t : m40970a) {
                    if (!C12758e.m4123B((InterfaceC11947m) t)) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC11947m interfaceC11947m : arrayList) {
                    InterfaceC11914e interfaceC11914e = interfaceC11947m instanceof InterfaceC11914e ? (InterfaceC11914e) interfaceC11947m : null;
                    Class<?> m15844p = interfaceC11914e != null ? C9336p0.m15844p(interfaceC11914e) : null;
                    C9296m c9296m = m15844p != null ? new C9296m(m15844p) : null;
                    if (c9296m != null) {
                        arrayList2.add(c9296m);
                    }
                }
                return arrayList2;
            }
        }

        @Metadata(m14358d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* renamed from: kg.m$a$m */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9310m extends AbstractC9614s implements Function0<T> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T>.C9297a f24405j;

            /* renamed from: k */
            final /* synthetic */ C9296m<T> f24406k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9310m(C9296m<T>.C9297a c9297a, C9296m<T> c9296m) {
                super(0);
                this.f24405j = c9297a;
                this.f24406k = c9296m;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                Field declaredField;
                InterfaceC11914e m15910k = this.f24405j.m15910k();
                if (m15910k.mo4175g() != EnumC11918f.OBJECT) {
                    return null;
                }
                if (m15910k.mo4177Y() && !C10865d.m9877a(C10864c.f28357a, m15910k)) {
                    declaredField = this.f24406k.mo13896e().getEnclosingClass().getDeclaredField(m15910k.getName().m7426b());
                } else {
                    declaredField = this.f24406k.mo13896e().getDeclaredField("INSTANCE");
                }
                T t = (T) declaredField.get(null);
                C9612q.m13919f(t, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return t;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "T", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* renamed from: kg.m$a$n */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9311n extends AbstractC9614s implements Function0<String> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T> f24407j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9311n(C9296m<T> c9296m) {
                super(0);
                this.f24407j = c9296m;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                if (this.f24407j.mo13896e().isAnonymousClass()) {
                    return null;
                }
                C11632b m15925M = this.f24407j.m15925M();
                if (m15925M.m7462k()) {
                    return null;
                }
                return m15925M.m7471b().m7458b();
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003 \u0004*\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"", "T", "", "Lkg/m;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.m$a$o */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9312o extends AbstractC9614s implements Function0<List<? extends C9296m<? extends T>>> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T>.C9297a f24408j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9312o(C9296m<T>.C9297a c9297a) {
                super(0);
                this.f24408j = c9297a;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<C9296m<? extends T>> invoke() {
                Collection<InterfaceC11914e> mo4165y = this.f24408j.m15910k().mo4165y();
                C9612q.m13918g(mo4165y, "descriptor.sealedSubclasses");
                ArrayList arrayList = new ArrayList();
                for (InterfaceC11914e interfaceC11914e : mo4165y) {
                    C9612q.m13919f(interfaceC11914e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class<?> m15844p = C9336p0.m15844p(interfaceC11914e);
                    C9296m c9296m = m15844p != null ? new C9296m(m15844p) : null;
                    if (c9296m != null) {
                        arrayList.add(c9296m);
                    }
                }
                return arrayList;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "T", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* renamed from: kg.m$a$p */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9313p extends AbstractC9614s implements Function0<String> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T> f24409j;

            /* renamed from: k */
            final /* synthetic */ C9296m<T>.C9297a f24410k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9313p(C9296m<T> c9296m, C9296m<T>.C9297a c9297a) {
                super(0);
                this.f24409j = c9296m;
                this.f24410k = c9297a;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                if (this.f24409j.mo13896e().isAnonymousClass()) {
                    return null;
                }
                C11632b m15925M = this.f24409j.m15925M();
                if (m15925M.m7462k()) {
                    return this.f24410k.m15915f(this.f24409j.mo13896e());
                }
                String m7426b = m15925M.m7463j().m7426b();
                C9612q.m13918g(m7426b, "classId.shortClassName.asString()");
                return m7426b;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"", "T", "", "Lkg/e0;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.m$a$q */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9314q extends AbstractC9614s implements Function0<List<? extends C9245e0>> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T>.C9297a f24411j;

            /* renamed from: k */
            final /* synthetic */ C9296m<T> f24412k;

            /* JADX INFO: Access modifiers changed from: package-private */
            @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"", "T", "Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, m14356k = 3, m14355mv = {1, 8, 0})
            /* renamed from: kg.m$a$q$a */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
            public static final class C9315a extends AbstractC9614s implements Function0<Type> {

                /* renamed from: j */
                final /* synthetic */ AbstractC7264g0 f24413j;

                /* renamed from: k */
                final /* synthetic */ C9296m<T>.C9297a f24414k;

                /* renamed from: l */
                final /* synthetic */ C9296m<T> f24415l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C9315a(AbstractC7264g0 abstractC7264g0, C9296m<T>.C9297a c9297a, C9296m<T> c9296m) {
                    super(0);
                    this.f24413j = abstractC7264g0;
                    this.f24414k = c9297a;
                    this.f24415l = c9296m;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a */
                public final Type invoke() {
                    int m14231O;
                    InterfaceC11927h mo2788p = this.f24413j.mo3564N0().mo2788p();
                    if (mo2788p instanceof InterfaceC11914e) {
                        Class<?> m15844p = C9336p0.m15844p((InterfaceC11914e) mo2788p);
                        if (m15844p != null) {
                            if (C9612q.m13922c(this.f24415l.mo13896e().getSuperclass(), m15844p)) {
                                Type genericSuperclass = this.f24415l.mo13896e().getGenericSuperclass();
                                C9612q.m13918g(genericSuperclass, "{\n                      …ass\n                    }");
                                return genericSuperclass;
                            }
                            Class<?>[] interfaces = this.f24415l.mo13896e().getInterfaces();
                            C9612q.m13918g(interfaces, "jClass.interfaces");
                            m14231O = C9538f.m14231O(interfaces, m15844p);
                            if (m14231O >= 0) {
                                Type type = this.f24415l.mo13896e().getGenericInterfaces()[m14231O];
                                C9612q.m13918g(type, "{\n                      …ex]\n                    }");
                                return type;
                            }
                            throw new C9258h0("No superclass of " + this.f24414k + " in Java reflection for " + mo2788p);
                        }
                        throw new C9258h0("Unsupported superclass of " + this.f24414k + ": " + mo2788p);
                    }
                    throw new C9258h0("Supertype not a class: " + mo2788p);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"", "T", "Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, m14356k = 3, m14355mv = {1, 8, 0})
            /* renamed from: kg.m$a$q$b */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
            public static final class C9316b extends AbstractC9614s implements Function0<Type> {

                /* renamed from: j */
                public static final C9316b f24416j = new C9316b();

                C9316b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a */
                public final Type invoke() {
                    return Object.class;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9314q(C9296m<T>.C9297a c9297a, C9296m<T> c9296m) {
                super(0);
                this.f24411j = c9297a;
                this.f24412k = c9296m;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends C9245e0> invoke() {
                boolean z;
                Collection<AbstractC7264g0> mo2791m = this.f24411j.m15910k().mo4173k().mo2791m();
                C9612q.m13918g(mo2791m, "descriptor.typeConstructor.supertypes");
                ArrayList arrayList = new ArrayList(mo2791m.size());
                C9296m<T>.C9297a c9297a = this.f24411j;
                C9296m<T> c9296m = this.f24412k;
                for (AbstractC7264g0 kotlinType : mo2791m) {
                    C9612q.m13918g(kotlinType, "kotlinType");
                    arrayList.add(new C9245e0(kotlinType, new C9315a(kotlinType, c9297a, c9296m)));
                }
                if (!AbstractC10870h.m9787t0(this.f24411j.m15910k())) {
                    boolean z2 = true;
                    if (!arrayList.isEmpty()) {
                        Iterator<T> it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            EnumC11918f mo4175g = C12758e.m4107e(((C9245e0) it.next()).m15999o()).mo4175g();
                            C9612q.m13918g(mo4175g, "getClassDescriptorForType(it.type).kind");
                            if (mo4175g == EnumC11918f.INTERFACE || mo4175g == EnumC11918f.ANNOTATION_CLASS) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (!z) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    if (z2) {
                        AbstractC7302o0 m9810i = C13801c.m1505j(this.f24411j.m15910k()).m9810i();
                        C9612q.m13918g(m9810i, "descriptor.builtIns.anyType");
                        arrayList.add(new C9245e0(m9810i, C9316b.f24416j));
                    }
                }
                return C12242a.m5673c(arrayList);
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"", "T", "", "Lkg/f0;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.m$a$r */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        static final class C9317r extends AbstractC9614s implements Function0<List<? extends C9252f0>> {

            /* renamed from: j */
            final /* synthetic */ C9296m<T>.C9297a f24417j;

            /* renamed from: k */
            final /* synthetic */ C9296m<T> f24418k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9317r(C9296m<T>.C9297a c9297a, C9296m<T> c9296m) {
                super(0);
                this.f24417j = c9297a;
                this.f24418k = c9296m;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends C9252f0> invoke() {
                int m14093t;
                List<InterfaceC11920f1> mo4168q = this.f24417j.m15910k().mo4168q();
                C9612q.m13918g(mo4168q, "descriptor.declaredTypeParameters");
                C9296m<T> c9296m = this.f24418k;
                m14093t = C9546k.m14093t(mo4168q, 10);
                ArrayList arrayList = new ArrayList(m14093t);
                for (InterfaceC11920f1 descriptor : mo4168q) {
                    C9612q.m13918g(descriptor, "descriptor");
                    arrayList.add(new C9252f0(c9296m, descriptor));
                }
                return arrayList;
            }
        }

        public C9297a() {
            super();
            this.f24374d = C9271j0.m15968d(new C9306i(C9296m.this));
            this.f24375e = C9271j0.m15968d(new C9301d(this));
            this.f24376f = C9271j0.m15968d(new C9313p(C9296m.this, this));
            this.f24377g = C9271j0.m15968d(new C9311n(C9296m.this));
            this.f24378h = C9271j0.m15968d(new C9302e(C9296m.this));
            this.f24379i = C9271j0.m15968d(new C9309l(this));
            this.f24380j = C9271j0.m15970b(new C9310m(this, C9296m.this));
            this.f24381k = C9271j0.m15968d(new C9317r(this, C9296m.this));
            this.f24382l = C9271j0.m15968d(new C9314q(this, C9296m.this));
            this.f24383m = C9271j0.m15968d(new C9312o(this));
            this.f24384n = C9271j0.m15968d(new C9304g(C9296m.this));
            this.f24385o = C9271j0.m15968d(new C9305h(C9296m.this));
            this.f24386p = C9271j0.m15968d(new C9307j(C9296m.this));
            this.f24387q = C9271j0.m15968d(new C9308k(C9296m.this));
            this.f24388r = C9271j0.m15968d(new C9299b(this));
            this.f24389s = C9271j0.m15968d(new C9300c(this));
            this.f24390t = C9271j0.m15968d(new C9303f(this));
            this.f24391u = C9271j0.m15968d(new C9298a(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public final String m15915f(Class<?> cls) {
            String m13736J0;
            String m13734K0;
            String m13734K02;
            String name = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                C9612q.m13918g(name, "name");
                m13734K02 = C9654p.m13734K0(name, enclosingMethod.getName() + '$', null, 2, null);
                return m13734K02;
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                C9612q.m13918g(name, "name");
                m13734K0 = C9654p.m13734K0(name, enclosingConstructor.getName() + '$', null, 2, null);
                return m13734K0;
            }
            C9612q.m13918g(name, "name");
            m13736J0 = C9654p.m13736J0(name, '$', null, 2, null);
            return m13736J0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public final Collection<AbstractC9282l<?>> m15911j() {
            T m15964b = this.f24385o.m15964b(this, f24373w[11]);
            C9612q.m13918g(m15964b, "<get-declaredStaticMembers>(...)");
            return (Collection) m15964b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public final Collection<AbstractC9282l<?>> m15909l() {
            T m15964b = this.f24386p.m15964b(this, f24373w[12]);
            C9612q.m13918g(m15964b, "<get-inheritedNonStaticMembers>(...)");
            return (Collection) m15964b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public final Collection<AbstractC9282l<?>> m15908m() {
            T m15964b = this.f24387q.m15964b(this, f24373w[13]);
            C9612q.m13918g(m15964b, "<get-inheritedStaticMembers>(...)");
            return (Collection) m15964b;
        }

        /* renamed from: g */
        public final Collection<AbstractC9282l<?>> m15914g() {
            T m15964b = this.f24388r.m15964b(this, f24373w[14]);
            C9612q.m13918g(m15964b, "<get-allNonStaticMembers>(...)");
            return (Collection) m15964b;
        }

        /* renamed from: h */
        public final Collection<AbstractC9282l<?>> m15913h() {
            T m15964b = this.f24389s.m15964b(this, f24373w[15]);
            C9612q.m13918g(m15964b, "<get-allStaticMembers>(...)");
            return (Collection) m15964b;
        }

        /* renamed from: i */
        public final Collection<AbstractC9282l<?>> m15912i() {
            T m15964b = this.f24384n.m15964b(this, f24373w[10]);
            C9612q.m13918g(m15964b, "<get-declaredNonStaticMembers>(...)");
            return (Collection) m15964b;
        }

        /* renamed from: k */
        public final InterfaceC11914e m15910k() {
            T m15964b = this.f24374d.m15964b(this, f24373w[0]);
            C9612q.m13918g(m15964b, "<get-descriptor>(...)");
            return (InterfaceC11914e) m15964b;
        }

        /* renamed from: n */
        public final String m15907n() {
            return (String) this.f24377g.m15964b(this, f24373w[3]);
        }

        /* renamed from: o */
        public final String m15906o() {
            return (String) this.f24376f.m15964b(this, f24373w[2]);
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: kg.m$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class C9318b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24419a;

        static {
            int[] iArr = new int[C8942a.EnumC8943a.values().length];
            try {
                iArr[C8942a.EnumC8943a.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C8942a.EnumC8943a.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C8942a.EnumC8943a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C8942a.EnumC8943a.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C8942a.EnumC8943a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C8942a.EnumC8943a.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f24419a = iArr;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e \u0004*\u000e\u0018\u00010\u0002R\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002R\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"", "T", "Lkg/m$a;", "Lkg/m;", "kotlin.jvm.PlatformType", "a", "()Lkg/m$a;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.m$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C9319c extends AbstractC9614s implements Function0<C9296m<T>.C9297a> {

        /* renamed from: j */
        final /* synthetic */ C9296m<T> f24420j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9319c(C9296m<T> c9296m) {
            super(0);
            this.f24420j = c9296m;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C9296m<T>.C9297a invoke() {
            return new C9297a();
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: kg.m$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    /* synthetic */ class C9320d extends C9605m implements Function2<C5958w, C9425n, InterfaceC11989u0> {

        /* renamed from: j */
        public static final C9320d f24421j = new C9320d();

        C9320d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final InterfaceC11989u0 invoke(C5958w p0, C9425n p1) {
            C9612q.m13917h(p0, "p0");
            C9612q.m13917h(p1, "p1");
            return p0.m24070l(p1);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
        public final String getName() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final KDeclarationContainer getOwner() {
            return C9591f0.m13969b(C5958w.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }
    }

    public C9296m(Class<T> jClass) {
        C9612q.m13917h(jClass, "jClass");
        this.f24371m = jClass;
        C9271j0.C9273b<C9296m<T>.C9297a> m15970b = C9271j0.m15970b(new C9319c(this));
        C9612q.m13918g(m15970b, "lazy { Data() }");
        this.f24372n = m15970b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public final C11632b m15925M() {
        return C9321m0.f24422a.m15894c(mo13896e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public final Void m15920R() {
        C8942a.EnumC8943a enumC8943a;
        int i;
        C8942a mo2854c;
        C13283f m2850a = C13283f.f34362c.m2850a(mo13896e());
        if (m2850a != null && (mo2854c = m2850a.mo2854c()) != null) {
            enumC8943a = mo2854c.m17013c();
        } else {
            enumC8943a = null;
        }
        if (enumC8943a == null) {
            i = -1;
        } else {
            i = C9318b.f24419a[enumC8943a.ordinal()];
        }
        switch (i) {
            case -1:
            case 6:
                throw new C9258h0("Unresolved class: " + mo13896e());
            case 0:
            default:
                throw new C11581q();
            case 1:
            case 2:
            case 3:
                throw new UnsupportedOperationException("Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: " + mo13896e());
            case 4:
                throw new UnsupportedOperationException("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations it has. Please use Java reflection to inspect this class: " + mo13896e());
            case 5:
                throw new C9258h0("Unknown class: " + mo13896e() + " (kind = " + enumC8943a + ')');
        }
    }

    @Override // kg.AbstractC9327p
    /* renamed from: A */
    public InterfaceC11989u0 mo15805A(int i) {
        C6429d c6429d;
        Class<?> declaringClass;
        if (C9612q.m13922c(mo13896e().getSimpleName(), "DefaultImpls") && (declaringClass = mo13896e().getDeclaringClass()) != null && declaringClass.isInterface()) {
            KClass m41052e = C0156a.m41052e(declaringClass);
            C9612q.m13919f(m41052e, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((C9296m) m41052e).mo15805A(i);
        }
        InterfaceC11914e descriptor = getDescriptor();
        if (descriptor instanceof C6429d) {
            c6429d = (C6429d) descriptor;
        } else {
            c6429d = null;
        }
        if (c6429d == null) {
            return null;
        }
        C9386c m22759b1 = c6429d.m22759b1();
        AbstractC12188i.C12195f<C9386c, List<C9425n>> classLocalVariable = C10890a.f28554j;
        C9612q.m13918g(classLocalVariable, "classLocalVariable");
        C9425n c9425n = (C9425n) C10466e.m11484b(m22759b1, classLocalVariable, i);
        if (c9425n == null) {
            return null;
        }
        return (InterfaceC11989u0) C9336p0.m15852h(mo13896e(), c9425n, c6429d.m22760a1().m24097g(), c6429d.m22760a1().m24094j(), c6429d.m22757d1(), C9320d.f24421j);
    }

    @Override // kg.AbstractC9327p
    /* renamed from: D */
    public Collection<InterfaceC11989u0> mo15803D(C11638f name) {
        List m14036n0;
        C9612q.m13917h(name, "name");
        InterfaceC0194h m15922P = m15922P();
        EnumC14023d enumC14023d = EnumC14023d.FROM_REFLECTION;
        m14036n0 = C9553r.m14036n0(m15922P.mo4360c(name, enumC14023d), m15921Q().mo4360c(name, enumC14023d));
        return m14036n0;
    }

    /* renamed from: N */
    public final C9271j0.C9273b<C9296m<T>.C9297a> m15924N() {
        return this.f24372n;
    }

    @Override // kg.InterfaceC9322n
    /* renamed from: O */
    public InterfaceC11914e getDescriptor() {
        return this.f24372n.invoke().m15910k();
    }

    /* renamed from: P */
    public final InterfaceC0194h m15922P() {
        return getDescriptor().mo4224p().mo3553o();
    }

    /* renamed from: Q */
    public final InterfaceC0194h m15921Q() {
        InterfaceC0194h mo4170l0 = getDescriptor().mo4170l0();
        C9612q.m13918g(mo4170l0, "descriptor.staticScope");
        return mo4170l0;
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: d */
    public boolean mo13885d(Object obj) {
        Integer m2244c = C13548d.m2244c(mo13896e());
        if (m2244c != null) {
            return C9604l0.m13933i(obj, m2244c.intValue());
        }
        Class m2240g = C13548d.m2240g(mo13896e());
        if (m2240g == null) {
            m2240g = mo13896e();
        }
        return m2240g.isInstance(obj);
    }

    @Override // kotlin.jvm.internal.InterfaceC9592g
    /* renamed from: e */
    public Class<T> mo13896e() {
        return this.f24371m;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9296m) && C9612q.m13922c(C0156a.m41054c(this), C0156a.m41054c((KClass) obj));
    }

    public int hashCode() {
        return C0156a.m41054c(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: i */
    public String mo13884i() {
        return this.f24372n.invoke().m15907n();
    }

    @Override // kotlin.reflect.KClass
    /* renamed from: l */
    public String mo13883l() {
        return this.f24372n.invoke().m15906o();
    }

    public String toString() {
        String str;
        String m13763C;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("class ");
        C11632b m15925M = m15925M();
        C11633c m7465h = m15925M.m7465h();
        C9612q.m13918g(m7465h, "classId.packageFqName");
        if (m7465h.m7456d()) {
            str = "";
        } else {
            str = m7465h.m7458b() + '.';
        }
        String m7458b = m15925M.m7464i().m7458b();
        C9612q.m13918g(m7458b, "classId.relativeClassName.asString()");
        m13763C = C9653o.m13763C(m7458b, '.', '$', false, 4, null);
        sb2.append(str + m13763C);
        return sb2.toString();
    }

    @Override // kg.AbstractC9327p
    /* renamed from: y */
    public Collection<InterfaceC11944l> mo15801y() {
        List m14104i;
        InterfaceC11914e descriptor = getDescriptor();
        if (descriptor.mo4175g() != EnumC11918f.INTERFACE && descriptor.mo4175g() != EnumC11918f.OBJECT) {
            Collection<InterfaceC11910d> mo4171l = descriptor.mo4171l();
            C9612q.m13918g(mo4171l, "descriptor.constructors");
            return mo4171l;
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // kg.AbstractC9327p
    /* renamed from: z */
    public Collection<InterfaceC11998y> mo15800z(C11638f name) {
        List m14036n0;
        C9612q.m13917h(name, "name");
        InterfaceC0194h m15922P = m15922P();
        EnumC14023d enumC14023d = EnumC14023d.FROM_REFLECTION;
        m14036n0 = C9553r.m14036n0(m15922P.mo4362a(name, enumC14023d), m15921Q().mo4362a(name, enumC14023d));
        return m14036n0;
    }
}

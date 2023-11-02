package p406we;

import android.content.Context;
import android.net.Uri;
import id.zelory.compressor.constraint.Compression;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9810j;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import p426xe.C13795c;
import p426xe.InterfaceC13793a;
import pf.C11586t;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m14357d2 = {"Lwe/a;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "imageFileUri", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/Function1;", "Lid/zelory/compressor/constraint/Compression;", "", "compressionPatch", "Ljava/io/File;", "a", "(Landroid/content/Context;Landroid/net/Uri;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "compressor_release"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: we.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13530a {

    /* renamed from: a */
    public static final C13530a f34894a = new C13530a();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "Lid/zelory/compressor/constraint/Compression;", "invoke"}, m14356k = 3, m14355mv = {1, 1, 16})
    /* renamed from: we.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13531a extends AbstractC9614s implements Function1<Compression, Unit> {

        /* renamed from: j */
        public static final C13531a f34895j = new C13531a();

        C13531a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Compression compression) {
            invoke2(compression);
            return Unit.f25302a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Compression receiver) {
            C9612q.m13916i(receiver, "$receiver");
            C13795c.m1521b(receiver, 0, 0, null, 0, 15, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m14356k = 3, m14355mv = {1, 1, 16})
    @InterfaceC9571e(m13987c = "id.zelory.compressor.Compressor$compress$6", m13986f = "Compressor.kt", m13985l = {}, m13984m = "invokeSuspend")
    /* renamed from: we.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13532b extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super File>, Object> {

        /* renamed from: j */
        private CoroutineScope f34896j;

        /* renamed from: k */
        int f34897k;

        /* renamed from: l */
        final /* synthetic */ Function1 f34898l;

        /* renamed from: m */
        final /* synthetic */ Context f34899m;

        /* renamed from: n */
        final /* synthetic */ Uri f34900n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13532b(Function1 function1, Context context, Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f34898l = function1;
            this.f34899m = context;
            this.f34900n = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
            C9612q.m13916i(completion, "completion");
            C13532b c13532b = new C13532b(this.f34898l, this.f34899m, this.f34900n, completion);
            c13532b.f34896j = (CoroutineScope) obj;
            return c13532b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
            return ((C13532b) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            C13277d.m2869d();
            if (this.f34897k == 0) {
                C11586t.m7586b(obj);
                Compression compression = new Compression();
                this.f34898l.invoke(compression);
                File m2288d = C13534c.m2288d(this.f34899m, this.f34900n);
                for (InterfaceC13793a interfaceC13793a : compression.m20557b()) {
                    while (!interfaceC13793a.isSatisfied(m2288d)) {
                        m2288d = interfaceC13793a.satisfy(m2288d);
                    }
                }
                return m2288d;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private C13530a() {
    }

    /* renamed from: b */
    public static /* synthetic */ Object m2292b(C13530a c13530a, Context context, Uri uri, CoroutineContext coroutineContext, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            coroutineContext = C9677b1.m13569b();
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        C13531a c13531a = function1;
        if ((i & 8) != 0) {
            c13531a = C13531a.f34895j;
        }
        return c13530a.m2293a(context, uri, coroutineContext2, c13531a, continuation);
    }

    /* renamed from: a */
    public final Object m2293a(Context context, Uri uri, CoroutineContext coroutineContext, Function1<? super Compression, Unit> function1, Continuation<? super File> continuation) {
        return C9810j.m13190g(coroutineContext, new C13532b(function1, context, uri, null), continuation);
    }
}

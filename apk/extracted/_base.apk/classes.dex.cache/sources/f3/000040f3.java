package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p371uf.AbstractC12960b;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \t2\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, m14357d2 = {"Lkotlinx/coroutines/n1;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/io/Closeable;", "Ljava/util/concurrent/Executor;", "F0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "()V", "l", "a", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.n1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC9830n1 extends CoroutineDispatcher implements Closeable {

    /* renamed from: l */
    public static final C9831a f25650l = new C9831a(null);

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m14357d2 = {"Lkotlinx/coroutines/n1$a;", "Luf/b;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/n1;", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.n1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9831a extends AbstractC12960b<CoroutineDispatcher, AbstractC9830n1> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lkotlin/coroutines/CoroutineContext$b;", "it", "Lkotlinx/coroutines/n1;", "a", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlinx/coroutines/n1;"}, m14356k = 3, m14355mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.n1$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C9832a extends AbstractC9614s implements Function1<CoroutineContext.InterfaceC9564b, AbstractC9830n1> {

            /* renamed from: j */
            public static final C9832a f25651j = new C9832a();

            C9832a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final AbstractC9830n1 invoke(CoroutineContext.InterfaceC9564b interfaceC9564b) {
                if (interfaceC9564b instanceof AbstractC9830n1) {
                    return (AbstractC9830n1) interfaceC9564b;
                }
                return null;
            }
        }

        private C9831a() {
            super(CoroutineDispatcher.f25402k, C9832a.f25651j);
        }

        public /* synthetic */ C9831a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: F0 */
    public abstract Executor mo13057F0();
}
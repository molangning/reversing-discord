package ee;

import de.C5822b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u000b"}, m14357d2 = {"Lee/a;", "", "Lkotlin/Function0;", "Lde/b;", "a", "Lkotlin/jvm/functions/Function0;", "controllerProvider", "()Lde/b;", "controller", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
/* renamed from: ee.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6207a {

    /* renamed from: a */
    private final Function0<C5822b> f17594a;

    public AbstractC6207a(Function0<C5822b> controllerProvider) {
        C9612q.m13917h(controllerProvider, "controllerProvider");
        this.f17594a = controllerProvider;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final C5822b m23283a() {
        return this.f17594a.invoke();
    }
}

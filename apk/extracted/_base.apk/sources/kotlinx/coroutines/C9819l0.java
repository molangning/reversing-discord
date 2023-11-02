package kotlinx.coroutines;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p371uf.AbstractC12959a;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m14357d2 = {"Lkotlinx/coroutines/l0;", "Luf/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "k", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "<init>", "(Ljava/lang/String;)V", "l", "a", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9819l0 extends AbstractC12959a {

    /* renamed from: l */
    public static final C9820a f25639l = new C9820a(null);

    /* renamed from: k */
    private final String f25640k;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m14357d2 = {"Lkotlinx/coroutines/l0$a;", "Lkotlin/coroutines/CoroutineContext$c;", "Lkotlinx/coroutines/l0;", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.l0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9820a implements CoroutineContext.InterfaceC9566c<C9819l0> {
        private C9820a() {
        }

        public /* synthetic */ C9820a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C9819l0(String str) {
        super(f25639l);
        this.f25640k = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9819l0) && C9612q.m13922c(this.f25640k, ((C9819l0) obj).f25640k);
    }

    public int hashCode() {
        return this.f25640k.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f25640k + ')';
    }
}

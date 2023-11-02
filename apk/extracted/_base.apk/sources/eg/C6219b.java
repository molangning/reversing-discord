package eg;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m14357d2 = {"Leg/b;", "Leg/a;", "eg/b$a", "l", "Leg/b$a;", "implStorage", "Ljava/util/Random;", "e", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: eg.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6219b extends AbstractC6218a {

    /* renamed from: l */
    private final C6220a f17629l = new C6220a();

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, m14357d2 = {"eg/b$a", "Ljava/lang/ThreadLocal;", "Ljava/util/Random;", "a", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: eg.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6220a extends ThreadLocal<Random> {
        C6220a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // eg.AbstractC6218a
    /* renamed from: e */
    public Random mo22781e() {
        Random random = this.f17629l.get();
        C9612q.m13918g(random, "implStorage.get()");
        return random;
    }
}

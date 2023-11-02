package p107fg;

import eg.AbstractC6218a;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p164j$.util.concurrent.ThreadLocalRandom;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m14357d2 = {"Lfg/a;", "Leg/a;", "", "from", "until", "d", "Ljava/util/Random;", "e", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib-jdk8"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: fg.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6423a extends AbstractC6218a {
    @Override // eg.AbstractC6221c
    /* renamed from: d */
    public int mo22782d(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // eg.AbstractC6218a
    /* renamed from: e */
    public Random mo22781e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C9612q.m13918g(current, "current()");
        return current;
    }
}

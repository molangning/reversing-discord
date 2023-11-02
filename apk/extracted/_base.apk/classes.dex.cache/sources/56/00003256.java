package eg;

import java.util.Random;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m14357d2 = {"Leg/a;", "Leg/c;", "", "bitCount", "b", "c", "Ljava/util/Random;", "e", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: eg.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6218a extends AbstractC6221c {
    @Override // eg.AbstractC6221c
    /* renamed from: b */
    public int mo23227b(int i) {
        return C6223d.m23221e(mo22781e().nextInt(), i);
    }

    @Override // eg.AbstractC6221c
    /* renamed from: c */
    public int mo23226c() {
        return mo22781e().nextInt();
    }

    /* renamed from: e */
    public abstract Random mo22781e();
}
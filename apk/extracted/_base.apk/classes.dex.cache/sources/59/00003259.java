package eg;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wf.C13537b;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b'\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\r"}, m14357d2 = {"Leg/c;", "", "", "bitCount", "b", "c", "from", "until", "d", "<init>", "()V", "j", "a", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: eg.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6221c {

    /* renamed from: j */
    public static final C6222a f17630j = new C6222a(null);

    /* renamed from: k */
    private static final AbstractC6221c f17631k = C13537b.f34906a.mo899b();

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m14357d2 = {"Leg/c$a;", "Leg/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "bitCount", "b", "c", "from", "until", "d", "defaultRandom", "Leg/c;", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: eg.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6222a extends AbstractC6221c implements Serializable {
        private C6222a() {
        }

        public /* synthetic */ C6222a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // eg.AbstractC6221c
        /* renamed from: b */
        public int mo23227b(int i) {
            return AbstractC6221c.f17631k.mo23227b(i);
        }

        @Override // eg.AbstractC6221c
        /* renamed from: c */
        public int mo23226c() {
            return AbstractC6221c.f17631k.mo23226c();
        }

        @Override // eg.AbstractC6221c
        /* renamed from: d */
        public int mo22782d(int i, int i2) {
            return AbstractC6221c.f17631k.mo22782d(i, i2);
        }
    }

    /* renamed from: b */
    public abstract int mo23227b(int i);

    /* renamed from: c */
    public abstract int mo23226c();

    /* renamed from: d */
    public int mo22782d(int i, int i2) {
        int mo23226c;
        int i3;
        int i4;
        int mo23226c2;
        boolean z;
        C6223d.m23224b(i, i2);
        int i5 = i2 - i;
        if (i5 <= 0 && i5 != Integer.MIN_VALUE) {
            do {
                mo23226c2 = mo23226c();
                z = false;
                if (i <= mo23226c2 && mo23226c2 < i2) {
                    z = true;
                    continue;
                }
            } while (!z);
            return mo23226c2;
        }
        if (((-i5) & i5) == i5) {
            i4 = mo23227b(C6223d.m23223c(i5));
        } else {
            do {
                mo23226c = mo23226c() >>> 1;
                i3 = mo23226c % i5;
            } while ((mo23226c - i3) + (i5 - 1) < 0);
            i4 = i3;
        }
        return i + i4;
    }
}
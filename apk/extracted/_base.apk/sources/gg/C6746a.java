package gg;

import cg.InterfaceC2533a;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p304qf.AbstractC11874g;
import wf.C13538c;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B!\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m14357d2 = {"Lgg/a;", "", "", "Lqf/g;", "h", "j", "C", "a", "()C", "first", "k", "e", "last", "", "l", "I", "getStep", "()I", "step", ViewProps.START, "endInclusive", "<init>", "(CCI)V", "m", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: gg.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6746a implements Iterable<Character>, InterfaceC2533a {

    /* renamed from: m */
    public static final C6747a f18971m = new C6747a(null);

    /* renamed from: j */
    private final char f18972j;

    /* renamed from: k */
    private final char f18973k;

    /* renamed from: l */
    private final int f18974l;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m14357d2 = {"Lgg/a$a;", "", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: gg.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6747a {
        private C6747a() {
        }

        public /* synthetic */ C6747a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C6746a(char c, char c2, int i) {
        if (i != 0) {
            if (i != Integer.MIN_VALUE) {
                this.f18972j = c;
                this.f18973k = (char) C13538c.m2277c(c, c2, i);
                this.f18974l = i;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    /* renamed from: a */
    public final char m21960a() {
        return this.f18972j;
    }

    /* renamed from: e */
    public final char m21959e() {
        return this.f18973k;
    }

    @Override // java.lang.Iterable
    /* renamed from: h */
    public AbstractC11874g iterator() {
        return new C6748b(this.f18972j, this.f18973k, this.f18974l);
    }
}

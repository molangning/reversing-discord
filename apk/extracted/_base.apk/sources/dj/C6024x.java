package dj;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p045cj.C2659z;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, m14357d2 = {"Ldj/x;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "e", "", "c", "(I)V", "d", "()I", "Lcj/z;", "a", "Lcj/z;", "origin", "<set-?>", "b", "Z", "()Z", "isUnmarkedNull", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6024x {

    /* renamed from: a */
    private final C2659z f17095a;

    /* renamed from: b */
    private boolean f17096b;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: dj.x$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    /* synthetic */ class C6025a extends C9609n implements Function2<SerialDescriptor, Integer, Boolean> {
        C6025a(Object obj) {
            super(2, obj, C6024x.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        /* renamed from: e */
        public final Boolean m23855e(SerialDescriptor p0, int i) {
            C9612q.m13917h(p0, "p0");
            return Boolean.valueOf(((C6024x) this.receiver).m23856e(p0, i));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(SerialDescriptor serialDescriptor, Integer num) {
            return m23855e(serialDescriptor, num.intValue());
        }
    }

    public C6024x(SerialDescriptor descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        this.f17095a = new C2659z(descriptor, new C6025a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m23856e(SerialDescriptor serialDescriptor, int i) {
        boolean z = !serialDescriptor.mo12681j(i) && serialDescriptor.mo12683h(i).mo12689b();
        this.f17096b = z;
        return z;
    }

    /* renamed from: b */
    public final boolean m23859b() {
        return this.f17096b;
    }

    /* renamed from: c */
    public final void m23858c(int i) {
        this.f17095a.m32762a(i);
    }

    /* renamed from: d */
    public final int m23857d() {
        return this.f17095a.m32759d();
    }
}

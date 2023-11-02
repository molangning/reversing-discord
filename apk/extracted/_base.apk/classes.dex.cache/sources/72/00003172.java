package dj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m14357d2 = {"Ldj/i;", "Ldj/h;", "", "value", "", "m", "", "c", "Z", "forceQuoting", "Ldj/k0;", "writer", "<init>", "(Ldj/k0;Z)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5990i extends C5988h {

    /* renamed from: c */
    private final boolean f17039c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5990i(InterfaceC5997k0 writer, boolean z) {
        super(writer);
        C9612q.m13917h(writer, "writer");
        this.f17039c = z;
    }

    @Override // dj.C5988h
    /* renamed from: m */
    public void mo23939m(String value) {
        C9612q.m13917h(value, "value");
        if (this.f17039c) {
            super.mo23939m(value);
        } else {
            super.m23943j(value);
        }
    }
}
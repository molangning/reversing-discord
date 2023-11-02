package dj;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.json.Json;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m14357d2 = {"Ldj/r;", "Ldj/h;", "", "b", "p", "c", "o", "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/Json;", "json", "", "d", "I", "level", "Ldj/k0;", "writer", "<init>", "(Ldj/k0;Lkotlinx/serialization/json/Json;)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6013r extends C5988h {

    /* renamed from: c */
    private final Json f17081c;

    /* renamed from: d */
    private int f17082d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6013r(InterfaceC5997k0 writer, Json json) {
        super(writer);
        C9612q.m13917h(writer, "writer");
        C9612q.m13917h(json, "json");
        this.f17081c = json;
    }

    @Override // dj.C5988h
    /* renamed from: b */
    public void mo23879b() {
        m23941n(true);
        this.f17082d++;
    }

    @Override // dj.C5988h
    /* renamed from: c */
    public void mo23878c() {
        m23941n(false);
        m23943j(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        int i = this.f17082d;
        for (int i2 = 0; i2 < i; i2++) {
            m23943j(this.f17081c.m12780e().m12748j());
        }
    }

    @Override // dj.C5988h
    /* renamed from: o */
    public void mo23877o() {
        m23946e(' ');
    }

    @Override // dj.C5988h
    /* renamed from: p */
    public void mo23876p() {
        this.f17082d--;
    }
}
package com.google.android.exoplayer2.upstream;

import android.content.Context;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import p153i8.InterfaceC7472x;

/* renamed from: com.google.android.exoplayer2.upstream.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4519c implements DataSource.Factory {

    /* renamed from: a */
    private final Context f12289a;

    /* renamed from: b */
    private final InterfaceC7472x f12290b;

    /* renamed from: c */
    private final DataSource.Factory f12291c;

    public C4519c(Context context) {
        this(context, (String) null, (InterfaceC7472x) null);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    /* renamed from: a */
    public C4518b createDataSource() {
        C4518b c4518b = new C4518b(this.f12289a, this.f12291c.createDataSource());
        InterfaceC7472x interfaceC7472x = this.f12290b;
        if (interfaceC7472x != null) {
            c4518b.mo6320f(interfaceC7472x);
        }
        return c4518b;
    }

    public C4519c(Context context, String str, InterfaceC7472x interfaceC7472x) {
        this(context, interfaceC7472x, new DefaultHttpDataSource.Factory().m28772b(str));
    }

    public C4519c(Context context, InterfaceC7472x interfaceC7472x, DataSource.Factory factory) {
        this.f12289a = context.getApplicationContext();
        this.f12290b = interfaceC7472x;
        this.f12291c = factory;
    }
}

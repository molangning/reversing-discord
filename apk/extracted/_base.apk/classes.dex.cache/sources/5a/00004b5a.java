package p317r7;

import com.google.android.exoplayer2.upstream.DataSource;

/* renamed from: r7.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12074c implements InterfaceC12084g {

    /* renamed from: a */
    private final DataSource.Factory f31248a;

    public C12074c(DataSource.Factory factory) {
        this.f31248a = factory;
    }

    @Override // p317r7.InterfaceC12084g
    /* renamed from: a */
    public DataSource mo6279a(int i) {
        return this.f31248a.createDataSource();
    }
}
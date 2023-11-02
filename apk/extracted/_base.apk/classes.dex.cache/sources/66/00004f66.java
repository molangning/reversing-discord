package p381v5;

import android.content.Context;
import java.io.Closeable;
import p078e6.InterfaceC6117d;

/* renamed from: v5.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13110u implements Closeable {

    /* renamed from: v5.u$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC13111a {
        /* renamed from: a */
        InterfaceC13111a mo3237a(Context context);

        AbstractC13110u build();
    }

    /* renamed from: a */
    abstract InterfaceC6117d mo3239a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo3239a().close();
    }

    /* renamed from: h */
    public abstract C13109t mo3238h();
}
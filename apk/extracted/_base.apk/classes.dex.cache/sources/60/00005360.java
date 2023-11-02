package p461z8;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import p461z8.InterfaceC14132k;

/* renamed from: z8.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC14127g<R extends InterfaceC14132k> {

    /* renamed from: z8.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC14128a {
        /* renamed from: a */
        void mo601a(Status status);
    }

    public abstract void addStatusListener(InterfaceC14128a interfaceC14128a);

    public abstract R await(long j, TimeUnit timeUnit);
}
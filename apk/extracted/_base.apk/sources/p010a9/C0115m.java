package p010a9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p461z8.C14118b;

/* renamed from: a9.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C0115m {
    /* renamed from: a */
    public static void m41126a(Status status, TaskCompletionSource<Void> taskCompletionSource) {
        m41125b(status, null, taskCompletionSource);
    }

    /* renamed from: b */
    public static <TResult> void m41125b(Status status, TResult tresult, TaskCompletionSource<TResult> taskCompletionSource) {
        if (status.m28240H()) {
            taskCompletionSource.m28011c(tresult);
        } else {
            taskCompletionSource.m28012b(new C14118b(status));
        }
    }
}

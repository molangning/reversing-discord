package com.discord.notifications.fcm.utils;

import com.discord.logging.Log;
import com.discord.notifications.fcm.utils.FCMTokenHelper;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import p134ha.InterfaceC7046d;
import p134ha.InterfaceC7047e;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¨\u0006\u000b"}, m14357d2 = {"Lcom/discord/notifications/fcm/utils/FCMTokenHelper;", "", "", "", "logError", "Lkotlin/Function1;", "", "onToken", "getToken", "<init>", "()V", "notification_fcm_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class FCMTokenHelper {
    public static final FCMTokenHelper INSTANCE = new FCMTokenHelper();

    private FCMTokenHelper() {
    }

    public static final void getToken$lambda$0(Exception e) {
        C9612q.m13917h(e, "e");
        INSTANCE.logError(e);
    }

    public static final void getToken$lambda$1(Function1 onToken, Task task) {
        C9612q.m13917h(onToken, "$onToken");
        C9612q.m13917h(task, "task");
        try {
            String str = (String) task.mo27973k();
            if (str != null && task.mo27969o()) {
                onToken.invoke(str);
            } else {
                Exception mo27974j = task.mo27974j();
                if (mo27974j != null) {
                    INSTANCE.logError(mo27974j);
                }
            }
        } catch (Exception e) {
            INSTANCE.logError(e);
        }
    }

    private final void logError(Throwable th2) {
        Log log = Log.INSTANCE;
        String simpleName = th2.getClass().getSimpleName();
        C9612q.m13918g(simpleName, "javaClass.simpleName");
        log.m31908w(simpleName, "Fetching FCM registration token failed", th2);
    }

    public final void getToken(final Function1<? super String, Unit> onToken) {
        C9612q.m13917h(onToken, "onToken");
        try {
            FirebaseMessaging.m26372l().m26369o().mo27980d(new InterfaceC7047e() { // from class: l2.a
                @Override // p134ha.InterfaceC7047e
                public final void onFailure(Exception exc) {
                    FCMTokenHelper.getToken$lambda$0(exc);
                }
            }).mo27982b(new InterfaceC7046d() { // from class: l2.b
                @Override // p134ha.InterfaceC7046d
                /* renamed from: a */
                public final void mo1614a(Task task) {
                    FCMTokenHelper.getToken$lambda$1(Function1.this, task);
                }
            });
        } catch (Exception e) {
            logError(e);
        }
    }
}
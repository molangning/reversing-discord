package com.discord.password_manager.smartlock;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import com.discord.logging.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.android.gms.auth.api.credentials.C4591a;
import com.google.android.gms.auth.api.credentials.C4593b;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialsClient;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p134ha.InterfaceC7046d;
import p304qf.C11889v;
import p318r8.C12106a;
import p318r8.C12109d;
import p461z8.C14118b;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0010H\u0007J\b\u0010\u0013\u001a\u00020\rH\u0002J\u001a\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0002J \u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J,\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u00102\b\u0010 \u001a\u0004\u0018\u00010\u0010H\u0007R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m14357d2 = {"Lcom/discord/password_manager/smartlock/SmartLockModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "activityEventListener", "com/discord/password_manager/smartlock/SmartLockModule$activityEventListener$1", "Lcom/discord/password_manager/smartlock/SmartLockModule$activityEventListener$1;", "credentialsClient", "Lcom/google/android/gms/auth/api/credentials/CredentialsClient;", "loginPromise", "Lcom/facebook/react/bridge/Promise;", "autoLogin", "", BaseJavaModule.METHOD_TYPE_PROMISE, "getName", "", "removeCredentials", "login", "requestCredentials", "resolvePromiseWithCredentials", "password", "tryResolveResult", "activity", "Landroid/app/Activity;", "requestCode", "", "resolvableApiException", "Lcom/google/android/gms/common/api/ResolvableApiException;", "updateAccountCredentials", "", "usernameWithDiscriminator", "avatarUri", "Companion", "password_manager_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class SmartLockModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    public static final String DISCORD_ACCOUNT_IDENTITY = "https://discord.com/";
    public static final int GOOGLE_SMART_LOCK_REQUEST_CODE_RESOLVE = 4008;
    public static final int GOOGLE_SMART_LOCK_REQUEST_CODE_RESOLVE_FOR_REQUEST = 4009;
    private static final String logTag;
    private final SmartLockModule$activityEventListener$1 activityEventListener;
    private CredentialsClient credentialsClient;
    private Promise loginPromise;
    private final ReactApplicationContext reactContext;

    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m14357d2 = {"Lcom/discord/password_manager/smartlock/SmartLockModule$Companion;", "", "()V", "DISCORD_ACCOUNT_IDENTITY", "", "GOOGLE_SMART_LOCK_REQUEST_CODE_RESOLVE", "", "GOOGLE_SMART_LOCK_REQUEST_CODE_RESOLVE_FOR_REQUEST", "logTag", "getLogTag", "()Ljava/lang/String;", "password_manager_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getLogTag() {
            return SmartLockModule.logTag;
        }
    }

    static {
        String simpleName = SmartLockModule.class.getSimpleName();
        C9612q.m13918g(simpleName, "SmartLockModule::class.java.simpleName");
        logTag = simpleName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.discord.password_manager.smartlock.SmartLockModule$activityEventListener$1, com.facebook.react.bridge.ActivityEventListener] */
    public SmartLockModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.reactContext = reactContext;
        ?? r0 = new BaseActivityEventListener() { // from class: com.discord.password_manager.smartlock.SmartLockModule$activityEventListener$1
            @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
                String str;
                if ((i == 4008 || i == 4009) && i2 == -1 && intent != null) {
                    Credential credential = (Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential");
                    String str2 = null;
                    if (credential != null) {
                        str = credential.getId();
                    } else {
                        str = null;
                    }
                    if (credential != null) {
                        str2 = credential.m28328J();
                    }
                    if (str != null && str2 != null) {
                        SmartLockModule.this.resolvePromiseWithCredentials(str, str2);
                    }
                }
            }
        };
        this.activityEventListener = r0;
        reactContext.addActivityEventListener(r0);
        C12109d m6142b = new C12109d.C12110a().m6141c().m6142b();
        C9612q.m13918g(m6142b, "Builder()\n            .f…og()\n            .build()");
        CredentialsClient m28301a = C4593b.m28301a(reactContext, m6142b);
        C9612q.m13918g(m28301a, "getClient(reactContext, options)");
        this.credentialsClient = m28301a;
    }

    private final void requestCredentials() {
        C4591a m28304a = new C4591a.C4592a().m28302c(true).m28303b(DISCORD_ACCOUNT_IDENTITY).m28304a();
        C9612q.m13918g(m28304a, "Builder()\n            .s…ITY)\n            .build()");
        this.credentialsClient.m28315D(m28304a).mo27982b(new InterfaceC7046d() { // from class: com.discord.password_manager.smartlock.a
            @Override // p134ha.InterfaceC7046d
            /* renamed from: a */
            public final void mo1614a(Task task) {
                SmartLockModule.requestCredentials$lambda$0(SmartLockModule.this, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestCredentials$lambda$0(SmartLockModule this$0, Task task) {
        boolean z;
        String str;
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(task, "task");
        if (task.mo27969o()) {
            Credential m6147c = ((C12106a) task.mo27973k()).m6147c();
            String str2 = null;
            if (m6147c != null) {
                str = m6147c.getId();
            } else {
                str = null;
            }
            Credential m6147c2 = ((C12106a) task.mo27973k()).m6147c();
            if (m6147c2 != null) {
                str2 = m6147c2.m28328J();
            }
            if (str != null) {
                this$0.resolvePromiseWithCredentials(str, str2);
                return;
            }
            return;
        }
        Exception mo27974j = task.mo27974j();
        if (mo27974j instanceof ResolvableApiException) {
            ResolvableApiException resolvableApiException = (ResolvableApiException) mo27974j;
            if (resolvableApiException.m633b() == 4) {
                z = false;
            } else {
                z = true;
            }
            Log.INSTANCE.m31908w(logTag, "Resolvable Exception requesting credentials", mo27974j);
            Activity currentActivity = this$0.reactContext.getCurrentActivity();
            if (z && currentActivity != null) {
                this$0.tryResolveResult(currentActivity, GOOGLE_SMART_LOCK_REQUEST_CODE_RESOLVE_FOR_REQUEST, resolvableApiException);
            }
        } else if (mo27974j instanceof C14118b) {
            Log.INSTANCE.m31908w(logTag, "API Exception requesting credentials", mo27974j);
        } else {
            Log.INSTANCE.m31908w(logTag, "Exception requesting credentials", mo27974j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolvePromiseWithCredentials(String str, String str2) {
        Map m6751k;
        Promise promise = this.loginPromise;
        if (promise != null) {
            m6751k = C11889v.m6751k(C11591x.m7577a("login", str), C11591x.m7577a("password", str2));
            promise.resolve(Arguments.makeNativeMap(m6751k));
        }
    }

    private final void tryResolveResult(ResolvableApiException resolvableApiException) {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            tryResolveResult(currentActivity, GOOGLE_SMART_LOCK_REQUEST_CODE_RESOLVE, resolvableApiException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateAccountCredentials$lambda$4(SmartLockModule this$0, Task task) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(task, "task");
        if (!task.mo27969o()) {
            Exception mo27974j = task.mo27974j();
            if (mo27974j instanceof ResolvableApiException) {
                Log.INSTANCE.m31908w(logTag, "Resolving Exception saving credentials", mo27974j);
                this$0.tryResolveResult((ResolvableApiException) mo27974j);
                return;
            }
            Log.INSTANCE.m31908w(logTag, "Exception saving credentials", mo27974j);
        }
    }

    @ReactMethod
    public final void autoLogin(Promise promise) {
        C9612q.m13917h(promise, "promise");
        this.loginPromise = promise;
        requestCredentials();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SmartLockModule";
    }

    @ReactMethod
    public final void removeCredentials(String login) {
        C9612q.m13917h(login, "login");
        this.credentialsClient.m28316C(new Credential.C4589a(login).m28324a());
    }

    @ReactMethod
    public final boolean updateAccountCredentials(String login, String password, String str, String str2) {
        C9612q.m13917h(login, "login");
        C9612q.m13917h(password, "password");
        Credential.C4589a c4589a = new Credential.C4589a(login);
        if (str != null) {
            c4589a.m28323b(str);
        }
        if (str2 != null) {
            c4589a.m28321d(Uri.parse(str2));
        }
        c4589a.m28322c(password);
        Credential m28324a = c4589a.m28324a();
        C9612q.m13918g(m28324a, "Builder(login).apply {\n …ssword)\n        }.build()");
        this.credentialsClient.m28314E(m28324a).mo27982b(new InterfaceC7046d() { // from class: com.discord.password_manager.smartlock.b
            @Override // p134ha.InterfaceC7046d
            /* renamed from: a */
            public final void mo1614a(Task task) {
                SmartLockModule.updateAccountCredentials$lambda$4(SmartLockModule.this, task);
            }
        });
        return false;
    }

    private final void tryResolveResult(Activity activity, int i, ResolvableApiException resolvableApiException) {
        try {
            if (!(resolvableApiException.m633b() != 4) || activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
            resolvableApiException.m28244c(activity, i);
        } catch (IntentSender.SendIntentException e) {
            Log.INSTANCE.m31908w(logTag, "Failed to send resolution.", e);
        } catch (Exception e2) {
            Log.INSTANCE.m31908w(logTag, "Failed to resolve", e2);
        }
    }
}

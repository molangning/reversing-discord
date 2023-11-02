package com.discord.samsung;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import androidx.appcompat.app.ActivityC0294b;
import com.discord.logging.Log;
import com.msc.p051sa.aidl.ISACallback;
import com.msc.p051sa.aidl.InterfaceC5344a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\b*\u0001\u0015\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, m14357d2 = {"Lcom/discord/samsung/SamsungConnectActivity;", "Landroidx/appcompat/app/b;", "", "finishedWithRestartRequested", "", "authCode", "authServerUrl", "finishWithResult", "startAndBindSamsungAuthService", "Lcom/msc/sa/aidl/ISACallback$Stub;", "createCallback", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStop", "Lcom/msc/sa/aidl/ISACallback;", "samsungAccountServiceCallback", "Lcom/msc/sa/aidl/ISACallback;", "", "serviceBound", "Z", "com/discord/samsung/SamsungConnectActivity$serviceConnection$1", "serviceConnection", "Lcom/discord/samsung/SamsungConnectActivity$serviceConnection$1;", "<init>", "()V", "Companion", "Result", "samsung_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class SamsungConnectActivity extends ActivityC0294b {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_ATTEMPT_COUNT = "com.discord.samsung.intent.extra.ATTEMPT_COUNT";
    public static final String EXTRA_REQ_AUTH_PARAM_AUTH_CODE = "com.discord.samsung.intent.extra.AUTH_CODE";
    public static final String EXTRA_REQ_AUTH_PARAM_AUTH_SERVER_URL = "com.discord.samsung.intent.extra.SERVER_URL";
    private static final String LOG_TAG = "Samsung";
    public static final int RESULT_SA_BINDING_FAILED = 500;
    private static final int SAMSUNG_REQ_ID = 1221;
    private static final Intent serviceIntent;
    private ISACallback samsungAccountServiceCallback;
    private boolean serviceBound;
    private final SamsungConnectActivity$serviceConnection$1 serviceConnection = new ServiceConnection() { // from class: com.discord.samsung.SamsungConnectActivity$serviceConnection$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ISACallback iSACallback;
            SamsungConnectActivity.this.serviceBound = true;
            InterfaceC5344a m25476b = InterfaceC5344a.AbstractBinderC5345a.m25476b(iBinder);
            Log log = Log.INSTANCE;
            Log.i$default(log, "Samsung", "Samsung Account service connection established", (Throwable) null, 4, (Object) null);
            try {
                iSACallback = SamsungConnectActivity.this.samsungAccountServiceCallback;
                if (iSACallback == null) {
                    C9612q.m13900y("samsungAccountServiceCallback");
                    iSACallback = null;
                }
                String mo25474R = m25476b.mo25474R(BuildConfig.SAMSUNGxDISCORD_CLIENT_ID, "dummy", com.discord.BuildConfig.APPLICATION_ID, iSACallback);
                Log.i$default(log, "Samsung", "Samsung Account service connection established: " + mo25474R, (Throwable) null, 4, (Object) null);
                if (mo25474R == null) {
                    SamsungConnectActivity.this.finishedWithRestartRequested();
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("additional", new String[]{"api_server_url", "auth_server_url"});
                Unit unit = Unit.f25302a;
                Log.i$default(log, "Samsung", "Samsung Account service connection established: isReqSucc? " + m25476b.mo25473V(1221, mo25474R, bundle), (Throwable) null, 4, (Object) null);
            } catch (Throwable th2) {
                Log.INSTANCE.m31912e("Samsung", "Unable to connect to Samsung", th2);
                SamsungConnectActivity.this.finishWithResult(null, null);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.i$default(Log.INSTANCE, "Samsung", "Samsung Account service connection unbound", (Throwable) null, 4, (Object) null);
            SamsungConnectActivity.this.serviceBound = false;
            SamsungConnectActivity.this.finish();
        }
    };

    @Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m14357d2 = {"Lcom/discord/samsung/SamsungConnectActivity$Companion;", "", "()V", "EXTRA_ATTEMPT_COUNT", "", "EXTRA_REQ_AUTH_PARAM_AUTH_CODE", "EXTRA_REQ_AUTH_PARAM_AUTH_SERVER_URL", "LOG_TAG", "RESULT_SA_BINDING_FAILED", "", "SAMSUNG_REQ_ID", "serviceIntent", "Landroid/content/Intent;", "getIntent", "context", "Landroid/content/Context;", "attemptCount", "samsung_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Intent getIntent$default(Companion companion, Context context, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.getIntent(context, i);
        }

        public final Intent getIntent(Context context, int i) {
            C9612q.m13917h(context, "context");
            Intent addFlags = new Intent(context, SamsungConnectActivity.class).putExtra(SamsungConnectActivity.EXTRA_ATTEMPT_COUNT, i).addFlags(65536);
            C9612q.m13918g(addFlags, "Intent(context, SamsungC…AG_ACTIVITY_NO_ANIMATION)");
            return addFlags;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/samsung/SamsungConnectActivity$Result;", "", "()V", "Failure", "Success", "Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;", "Lcom/discord/samsung/SamsungConnectActivity$Result$Success;", "samsung_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static abstract class Result {

        @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0013"}, m14357d2 = {"Lcom/discord/samsung/SamsungConnectActivity$Result$Failure;", "Lcom/discord/samsung/SamsungConnectActivity$Result;", "isRetryAllowed", "", "attemptCount", "", "(ZI)V", "getAttemptCount", "()I", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "samsung_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
        public static final class Failure extends Result {
            private final int attemptCount;
            private final boolean isRetryAllowed;

            public /* synthetic */ Failure(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(z, (i2 & 2) != 0 ? 0 : i);
            }

            public static /* synthetic */ Failure copy$default(Failure failure, boolean z, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    z = failure.isRetryAllowed;
                }
                if ((i2 & 2) != 0) {
                    i = failure.attemptCount;
                }
                return failure.copy(z, i);
            }

            public final boolean component1() {
                return this.isRetryAllowed;
            }

            public final int component2() {
                return this.attemptCount;
            }

            public final Failure copy(boolean z, int i) {
                return new Failure(z, i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Failure) {
                    Failure failure = (Failure) obj;
                    return this.isRetryAllowed == failure.isRetryAllowed && this.attemptCount == failure.attemptCount;
                }
                return false;
            }

            public final int getAttemptCount() {
                return this.attemptCount;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            public int hashCode() {
                boolean z = this.isRetryAllowed;
                ?? r0 = z;
                if (z) {
                    r0 = 1;
                }
                return (r0 * 31) + this.attemptCount;
            }

            public final boolean isRetryAllowed() {
                return this.isRetryAllowed;
            }

            public String toString() {
                boolean z = this.isRetryAllowed;
                int i = this.attemptCount;
                return "Failure(isRetryAllowed=" + z + ", attemptCount=" + i + ")";
            }

            public Failure(boolean z, int i) {
                super(null);
                this.isRetryAllowed = z;
                this.attemptCount = i;
            }
        }

        @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m14357d2 = {"Lcom/discord/samsung/SamsungConnectActivity$Result$Success;", "Lcom/discord/samsung/SamsungConnectActivity$Result;", "authCode", "", "serverUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuthCode", "()Ljava/lang/String;", "getServerUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "samsung_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
        public static final class Success extends Result {
            private final String authCode;
            private final String serverUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(String authCode, String serverUrl) {
                super(null);
                C9612q.m13917h(authCode, "authCode");
                C9612q.m13917h(serverUrl, "serverUrl");
                this.authCode = authCode;
                this.serverUrl = serverUrl;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.authCode;
                }
                if ((i & 2) != 0) {
                    str2 = success.serverUrl;
                }
                return success.copy(str, str2);
            }

            public final String component1() {
                return this.authCode;
            }

            public final String component2() {
                return this.serverUrl;
            }

            public final Success copy(String authCode, String serverUrl) {
                C9612q.m13917h(authCode, "authCode");
                C9612q.m13917h(serverUrl, "serverUrl");
                return new Success(authCode, serverUrl);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Success) {
                    Success success = (Success) obj;
                    return C9612q.m13922c(this.authCode, success.authCode) && C9612q.m13922c(this.serverUrl, success.serverUrl);
                }
                return false;
            }

            public final String getAuthCode() {
                return this.authCode;
            }

            public final String getServerUrl() {
                return this.serverUrl;
            }

            public int hashCode() {
                return (this.authCode.hashCode() * 31) + this.serverUrl.hashCode();
            }

            public String toString() {
                String str = this.authCode;
                String str2 = this.serverUrl;
                return "Success(authCode=" + str + ", serverUrl=" + str2 + ")";
            }
        }

        private Result() {
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Intent intent = new Intent("com.msc.action.samsungaccount.REQUEST_SERVICE").setPackage("com.osp.app.signin");
        C9612q.m13918g(intent, "Intent(\"com.msc.action.s…age(\"com.osp.app.signin\")");
        serviceIntent = intent;
    }

    private final ISACallback.Stub createCallback() {
        return new ISACallback.Stub() { // from class: com.discord.samsung.SamsungConnectActivity$createCallback$1
            @Override // com.msc.p051sa.aidl.ISACallback
            public void onReceiveAccessToken(int i, boolean z, Bundle bundle) {
                throw new IllegalStateException("Unexpected call to onReceiveAccessToken".toString());
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
                if (r11 == false) goto L13;
             */
            @Override // com.msc.p051sa.aidl.ISACallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onReceiveAuthCode(int r10, boolean r11, android.os.Bundle r12) {
                /*
                    r9 = this;
                    r10 = 0
                    if (r12 == 0) goto La
                    java.lang.String r0 = "authcode"
                    java.lang.String r0 = r12.getString(r0)
                    goto Lb
                La:
                    r0 = r10
                Lb:
                    if (r12 == 0) goto L14
                    java.lang.String r1 = "auth_server_url"
                    java.lang.String r1 = r12.getString(r1)
                    goto L15
                L14:
                    r1 = r10
                L15:
                    com.discord.logging.Log r8 = com.discord.logging.Log.INSTANCE
                    java.lang.String r3 = "Samsung"
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r4 = "Samsung onReceiveAuthCode="
                    r2.append(r4)
                    r2.append(r11)
                    java.lang.String r4 = r2.toString()
                    r5 = 0
                    r6 = 4
                    r7 = 0
                    r2 = r8
                    com.discord.logging.Log.i$default(r2, r3, r4, r5, r6, r7)
                    if (r11 == 0) goto L41
                    if (r0 == 0) goto L3e
                    boolean r11 = kotlin.text.C9642f.m13789w(r0)
                    if (r11 == 0) goto L3c
                    goto L3e
                L3c:
                    r11 = 0
                    goto L3f
                L3e:
                    r11 = 1
                L3f:
                    if (r11 == 0) goto L9c
                L41:
                    if (r12 == 0) goto L4a
                    java.lang.String r11 = "error_code"
                    java.lang.String r11 = r12.getString(r11)
                    goto L4b
                L4a:
                    r11 = r10
                L4b:
                    if (r12 == 0) goto L54
                    java.lang.String r2 = "error_message"
                    java.lang.String r12 = r12.getString(r2)
                    goto L55
                L54:
                    r12 = r10
                L55:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Samsung Account link failure "
                    r2.append(r3)
                    if (r0 == 0) goto L66
                    r10 = 4
                    java.lang.String r10 = kotlin.text.C9642f.m13810b1(r0, r10)
                L66:
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "["
                    r3.append(r4)
                    r3.append(r11)
                    java.lang.String r11 = ":"
                    r3.append(r11)
                    r3.append(r10)
                    java.lang.String r10 = "]: "
                    r3.append(r10)
                    r3.append(r12)
                    java.lang.String r10 = r3.toString()
                    r2.append(r10)
                    java.lang.String r4 = r2.toString()
                    java.lang.String r10 = "StringBuilder()\n        …              .toString()"
                    kotlin.jvm.internal.C9612q.m13918g(r4, r10)
                    java.lang.String r3 = "Samsung"
                    r5 = 0
                    r6 = 4
                    r7 = 0
                    r2 = r8
                    com.discord.logging.Log.w$default(r2, r3, r4, r5, r6, r7)
                L9c:
                    com.discord.samsung.SamsungConnectActivity r10 = com.discord.samsung.SamsungConnectActivity.this
                    com.discord.samsung.SamsungConnectActivity.access$finishWithResult(r10, r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.discord.samsung.SamsungConnectActivity$createCallback$1.onReceiveAuthCode(int, boolean, android.os.Bundle):void");
            }

            @Override // com.msc.p051sa.aidl.ISACallback
            public void onReceiveChecklistValidation(int i, boolean z, Bundle bundle) {
                throw new IllegalStateException("Unexpected call to onReceiveAccessToken".toString());
            }

            @Override // com.msc.p051sa.aidl.ISACallback
            public void onReceiveDisclaimerAgreement(int i, boolean z, Bundle bundle) {
                throw new IllegalStateException("Unexpected call to onReceiveDisclaimerAgreement".toString());
            }

            @Override // com.msc.p051sa.aidl.ISACallback
            public void onReceivePasswordConfirmation(int i, boolean z, Bundle bundle) {
                throw new IllegalStateException("Unexpected call to onReceivePasswordConfirmation".toString());
            }

            @Override // com.msc.p051sa.aidl.ISACallback
            public void onReceiveRLControlFMM(int i, boolean z, Bundle bundle) {
                throw new IllegalStateException("Unexpected call to onReceiveRLControlFMM".toString());
            }

            @Override // com.msc.p051sa.aidl.ISACallback
            public void onReceiveRubinRequest(int i, boolean z, Bundle bundle) {
                throw new IllegalStateException("Unexpected call to onReceiveRubinRequest".toString());
            }

            @Override // com.msc.p051sa.aidl.ISACallback
            public void onReceiveSCloudAccessToken(int i, boolean z, Bundle bundle) {
                throw new IllegalStateException("Unexpected call to onReceiveSCloudAccessToken".toString());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void finishWithResult(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            com.discord.logging.Log r0 = com.discord.logging.Log.INSTANCE
            java.lang.String r1 = "Samsung"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Finishing With Result. AuthCode: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = ", AuthServerUrl: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r3 = 0
            r4 = 4
            r5 = 0
            com.discord.logging.Log.i$default(r0, r1, r2, r3, r4, r5)
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L30
            boolean r2 = kotlin.text.C9642f.m13789w(r7)
            if (r2 == 0) goto L2e
            goto L30
        L2e:
            r2 = r1
            goto L31
        L30:
            r2 = r0
        L31:
            if (r2 != 0) goto L56
            if (r8 == 0) goto L3d
            boolean r2 = kotlin.text.C9642f.m13789w(r8)
            if (r2 == 0) goto L3c
            goto L3d
        L3c:
            r0 = r1
        L3d:
            if (r0 == 0) goto L40
            goto L56
        L40:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.discord.samsung.intent.extra.AUTH_CODE"
            r0.putExtra(r1, r7)
            java.lang.String r7 = "com.discord.samsung.intent.extra.SERVER_URL"
            r0.putExtra(r7, r8)
            kotlin.Unit r7 = kotlin.Unit.f25302a
            r7 = -1
            r6.setResult(r7, r0)
            goto L59
        L56:
            r6.setResult(r1)
        L59:
            r6.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.samsung.SamsungConnectActivity.finishWithResult(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishedWithRestartRequested() {
        Log.i$default(Log.INSTANCE, LOG_TAG, "finishedWithRestartRequested", (Throwable) null, 4, (Object) null);
        setResult(500, new Intent().putExtra(EXTRA_ATTEMPT_COUNT, getIntent().getIntExtra(EXTRA_ATTEMPT_COUNT, 0) + 1));
        finish();
    }

    private final void startAndBindSamsungAuthService() {
        Log log = Log.INSTANCE;
        Log.i$default(log, LOG_TAG, "Samsung starting SA Service", (Throwable) null, 4, (Object) null);
        Intent intent = serviceIntent;
        if (startService(intent) == null) {
            Log.e$default(log, LOG_TAG, "Samsung Account service could not be started", (Throwable) null, 4, (Object) null);
        } else if (!bindService(intent, this.serviceConnection, 1)) {
            Log.e$default(log, LOG_TAG, "Samsung Account service could not be bound", (Throwable) null, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i$default(Log.INSTANCE, LOG_TAG, "onCreate SamsungConnectActivity", (Throwable) null, 4, (Object) null);
        this.samsungAccountServiceCallback = createCallback();
        startAndBindSamsungAuthService();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0294b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Log.i$default(Log.INSTANCE, LOG_TAG, "onStop SamsungConnectActivity", (Throwable) null, 4, (Object) null);
        if (this.serviceBound) {
            unbindService(this.serviceConnection);
            this.serviceBound = false;
        }
        super.onStop();
    }
}

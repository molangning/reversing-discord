package com.facebook.react.devsupport;

import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p328rj.InterfaceC12283d;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class PackagerStatusCheck {
    private static final int HTTP_CONNECT_TIMEOUT_MS = 5000;
    private static final String PACKAGER_OK_STATUS = "packager-status:running";
    private static final String PACKAGER_STATUS_URL_TEMPLATE = "http://%s/status";
    private final OkHttpClient mClient;

    public PackagerStatusCheck() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.mClient = builder.m8769e(5000L, timeUnit).m8775O(0L, timeUnit).m8774P(0L, timeUnit).m8771c();
    }

    private static String createPackagerStatusURL(String str) {
        return String.format(Locale.US, PACKAGER_STATUS_URL_TEMPLATE, str);
    }

    public void run(String str, final PackagerStatusCallback packagerStatusCallback) {
        this.mClient.mo8811b(new Request.Builder().m8722l(createPackagerStatusURL(str)).m8732b()).mo1994i(new InterfaceC12283d() { // from class: com.facebook.react.devsupport.PackagerStatusCheck.1
            @Override // p328rj.InterfaceC12283d
            public void onFailure(Call call, IOException iOException) {
                C13677a.m1870H(ReactConstants.TAG, "The packager does not seem to be running as we got an IOException requesting its status: " + iOException.getMessage());
                packagerStatusCallback.onPackagerStatusFetched(false);
            }

            @Override // p328rj.InterfaceC12283d
            public void onResponse(Call call, Response response) {
                if (!response.m8701X()) {
                    C13677a.m1854j(ReactConstants.TAG, "Got non-success http code from packager when requesting status: " + response.m8695m());
                    packagerStatusCallback.onPackagerStatusFetched(false);
                    return;
                }
                ResponseBody m8699a = response.m8699a();
                if (m8699a == null) {
                    C13677a.m1854j(ReactConstants.TAG, "Got null body response from packager when requesting status");
                    packagerStatusCallback.onPackagerStatusFetched(false);
                    return;
                }
                String string = m8699a.string();
                if (!PackagerStatusCheck.PACKAGER_OK_STATUS.equals(string)) {
                    C13677a.m1854j(ReactConstants.TAG, "Got unexpected response from packager when requesting status: " + string);
                    packagerStatusCallback.onPackagerStatusFetched(false);
                    return;
                }
                packagerStatusCallback.onPackagerStatusFetched(true);
            }
        });
    }

    public PackagerStatusCheck(OkHttpClient okHttpClient) {
        this.mClient = okHttpClient;
    }
}
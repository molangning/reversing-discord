package com.discord.phone_verification;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.discord.logging.Log;
import com.discord.phone_verification.AppSignatureHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
final class AppSignatureHelper$appSignatures$2 extends AbstractC9614s implements Function0<List<String>> {
    final /* synthetic */ AppSignatureHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSignatureHelper$appSignatures$2(AppSignatureHelper appSignatureHelper) {
        super(0);
        this.this$0 = appSignatureHelper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<String> invoke() {
        SigningInfo signingInfo;
        Signature[] packageInfos;
        String hash;
        SigningInfo signingInfo2;
        ArrayList arrayList = new ArrayList();
        try {
            String packageName = this.this$0.getPackageName();
            PackageManager packageManager = this.this$0.getPackageManager();
            if (Build.VERSION.SDK_INT >= 33) {
                signingInfo2 = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(134217728)).signingInfo;
                packageInfos = signingInfo2.getApkContentsSigners();
            } else {
                signingInfo = packageManager.getPackageInfo(packageName, 134217728).signingInfo;
                packageInfos = signingInfo.getApkContentsSigners();
            }
            C9612q.m13918g(packageInfos, "packageInfos");
            ArrayList arrayList2 = new ArrayList();
            for (Signature signature : packageInfos) {
                AppSignatureHelper.Companion companion = AppSignatureHelper.Companion;
                C9612q.m13918g(packageName, "packageName");
                String charsString = signature.toCharsString();
                C9612q.m13918g(charsString, "signature.toCharsString()");
                hash = companion.hash(packageName, charsString);
                Log.i$default(Log.INSTANCE, companion.getTAG(), "Hash " + hash, (Throwable) null, 4, (Object) null);
                if (hash != null) {
                    arrayList2.add(hash);
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.INSTANCE.m31912e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", e);
            C9545j.m14104i();
        }
        return arrayList;
    }
}
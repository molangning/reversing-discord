package p200kd;

import java.util.List;
import p215ld.C10131a;

/* renamed from: kd.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC9216a {
    void onCancelled(String str, List<C10131a> list);

    void onCompleted(String str, List<C10131a> list);

    void onError(String str, Throwable th2, List<C10131a> list);

    void onProgress(String str, float f);

    void onStarted(String str);
}
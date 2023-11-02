package p238n1;

import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: n1.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10483b implements InterfaceC10487f {
    @Override // p238n1.InterfaceC10487f
    /* renamed from: a */
    public InterfaceC10485d mo11413a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C10482a(httpURLConnection);
    }
}

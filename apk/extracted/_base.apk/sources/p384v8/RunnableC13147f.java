package p384v8;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p010a9.C0113l;
import p029b9.C2198p;
import p081e9.C6186a;
import p461z8.AbstractC14127g;
import p461z8.C14129h;

/* renamed from: v8.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class RunnableC13147f implements Runnable {

    /* renamed from: l */
    private static final C6186a f34165l = new C6186a("RevokeAccessOperation", new String[0]);

    /* renamed from: j */
    private final String f34166j;

    /* renamed from: k */
    private final C0113l f34167k = new C0113l(null);

    public RunnableC13147f(String str) {
        this.f34166j = C2198p.m33989f(str);
    }

    /* renamed from: a */
    public static AbstractC14127g m3093a(String str) {
        if (str == null) {
            return C14129h.m600a(new Status(4), null);
        }
        RunnableC13147f runnableC13147f = new RunnableC13147f(str);
        new Thread(runnableC13147f).start();
        return runnableC13147f.f34167k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f12650q;
        try {
            String str = this.f34166j;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f12648o;
            } else {
                f34165l.m23320b("Unable to revoke access!", new Object[0]);
            }
            C6186a c6186a = f34165l;
            c6186a.m23321a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            f34165l.m23320b("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (Exception e2) {
            f34165l.m23320b("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        }
        this.f34167k.setResult(status);
    }
}

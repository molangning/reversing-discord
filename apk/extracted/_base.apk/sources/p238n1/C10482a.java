package p238n1;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import p291q1.C11674f;

/* renamed from: n1.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10482a implements InterfaceC10485d {

    /* renamed from: j */
    private final HttpURLConnection f27370j;

    public C10482a(HttpURLConnection httpURLConnection) {
        this.f27370j = httpURLConnection;
    }

    /* renamed from: a */
    private String m11421a(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    @Override // p238n1.InterfaceC10485d
    /* renamed from: J */
    public String mo11418J() {
        return this.f27370j.getContentType();
    }

    @Override // p238n1.InterfaceC10485d
    /* renamed from: M */
    public InputStream mo11417M() {
        return this.f27370j.getInputStream();
    }

    @Override // p238n1.InterfaceC10485d
    /* renamed from: X */
    public boolean mo11416X() {
        try {
            return this.f27370j.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f27370j.disconnect();
    }

    @Override // p238n1.InterfaceC10485d
    /* renamed from: k0 */
    public String mo11415k0() {
        try {
            if (mo11416X()) {
                return null;
            }
            return "Unable to fetch " + this.f27370j.getURL() + ". Failed with " + this.f27370j.getResponseCode() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + m11421a(this.f27370j);
        } catch (IOException e) {
            C11674f.m7232d("get error failed ", e);
            return e.getMessage();
        }
    }
}

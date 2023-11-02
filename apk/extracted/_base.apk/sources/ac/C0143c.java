package ac;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import lb.C10106d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ac.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C0143c {

    /* renamed from: a */
    private File f538a;

    /* renamed from: b */
    private final C10106d f539b;

    /* renamed from: ac.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC0144a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C0143c(C10106d c10106d) {
        this.f539b = c10106d;
    }

    /* renamed from: a */
    private File m41102a() {
        if (this.f538a == null) {
            synchronized (this) {
                if (this.f538a == null) {
                    File filesDir = this.f539b.m12296j().getFilesDir();
                    this.f538a = new File(filesDir, "PersistedInstallation." + this.f539b.m12292n() + ".json");
                }
            }
        }
        return this.f538a;
    }

    /* renamed from: c */
    private JSONObject m41100c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m41102a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: b */
    public AbstractC0145d m41101b(AbstractC0145d abstractC0145d) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC0145d.mo41095d());
            jSONObject.put("Status", abstractC0145d.mo41092g().ordinal());
            jSONObject.put("AuthToken", abstractC0145d.mo41097b());
            jSONObject.put("RefreshToken", abstractC0145d.mo41093f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC0145d.mo41091h());
            jSONObject.put("ExpiresInSecs", abstractC0145d.mo41096c());
            jSONObject.put("FisError", abstractC0145d.mo41094e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f539b.m12296j().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (!createTempFile.renameTo(m41102a())) {
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        return abstractC0145d;
    }

    /* renamed from: d */
    public AbstractC0145d m41099d() {
        JSONObject m41100c = m41100c();
        String optString = m41100c.optString("Fid", null);
        int optInt = m41100c.optInt("Status", EnumC0144a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = m41100c.optString("AuthToken", null);
        String optString3 = m41100c.optString("RefreshToken", null);
        long optLong = m41100c.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = m41100c.optLong("ExpiresInSecs", 0L);
        return AbstractC0145d.m41098a().mo41075d(optString).mo41072g(EnumC0144a.values()[optInt]).mo41077b(optString2).mo41073f(optString3).mo41071h(optLong).mo41076c(optLong2).mo41074e(m41100c.optString("FisError", null)).mo41078a();
    }
}

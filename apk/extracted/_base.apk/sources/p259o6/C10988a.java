package p259o6;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p195k8.C9191p0;
import p195k8.C9197r;

/* renamed from: o6.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C10988a {
    /* renamed from: a */
    public static byte[] m9406a(byte[] bArr) {
        if (C9191p0.f24171a >= 27) {
            return bArr;
        }
        return C9191p0.m16238l0(m9404c(C9191p0.m16305E(bArr)));
    }

    /* renamed from: b */
    public static byte[] m9405b(byte[] bArr) {
        if (C9191p0.f24171a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(C9191p0.m16305E(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb2.append("{\"k\":\"");
                sb2.append(m9403d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(m9403d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return C9191p0.m16238l0(sb2.toString());
        } catch (JSONException e) {
            C9197r.m16182d("ClearKeyUtil", "Failed to adjust response data: " + C9191p0.m16305E(bArr), e);
            return bArr;
        }
    }

    /* renamed from: c */
    private static String m9404c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    /* renamed from: d */
    private static String m9403d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}

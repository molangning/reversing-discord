package com.discord.security_key;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Base64;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.google.android.gms.tasks.Task;
import com.reactnativecommunity.webview.RNCWebViewManager;
import gg.C6759j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import p134ha.InterfaceC7047e;
import p134ha.InterfaceC7048f;
import p196k9.C9210a;
import p231m9.AbstractC10388i;
import p231m9.C10380f;
import p231m9.C10383g;
import p231m9.C10386h;
import p231m9.C10390j;
import p231m9.C10403o;
import p231m9.C10405p;
import p231m9.C10408q;
import p231m9.C10410r;
import p231m9.C10412s;
import p231m9.C10415t;
import p231m9.C10420v;
import p231m9.EnumC10366b;
import p231m9.EnumC10417u;
import p304qf.AbstractC11883p;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000  2\u00020\u0001:\u0001 B/\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u0017\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002J\f\u0010\n\u001a\u00020\u0007*\u00020\bH\u0002J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006!"}, m14357d2 = {"Lcom/discord/security_key/WebAuthn;", "", "Lorg/json/JSONArray;", "array", "", "Lm9/q;", "parseCredentialDescriptors", "", "", "toBase64", "decodeBase64", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResult", "challenge", "Landroid/app/Activity;", "currentActivity", "register", "authenticate", "Lkotlin/Function1;", "resolve", "Lkotlin/jvm/functions/Function1;", "getResolve", "()Lkotlin/jvm/functions/Function1;", "reject", "getReject", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "security_key_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class WebAuthn {
    private static final int BASE64_FLAG = 11;
    public static final Companion Companion = new Companion(null);
    private static final int REQUEST_CODE_AUTHENTICATE = 4002;
    private static final int REQUEST_CODE_REGISTER = 4001;
    private final Function1<String, Unit> reject;
    private final Function1<String, Unit> resolve;

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/security_key/WebAuthn$Companion;", "", "()V", "BASE64_FLAG", "", "REQUEST_CODE_AUTHENTICATE", "REQUEST_CODE_REGISTER", "security_key_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebAuthn(Function1<? super String, Unit> resolve, Function1<? super String, Unit> reject) {
        C9612q.m13917h(resolve, "resolve");
        C9612q.m13917h(reject, "reject");
        this.resolve = resolve;
        this.reject = reject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void authenticate$lambda$4(Function1 tmp0, Object obj) {
        C9612q.m13917h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void authenticate$lambda$5(WebAuthn this$0, Exception it) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(it, "it");
        this$0.reject.invoke("task failed");
    }

    private final byte[] decodeBase64(String str) {
        byte[] decode = Base64.decode(str, 11);
        C9612q.m13918g(decode, "decode(this, BASE64_FLAG)");
        return decode;
    }

    private final List<C10408q> parseCredentialDescriptors(JSONArray jSONArray) {
        IntRange m21916q;
        ArrayList arrayList = new ArrayList();
        m21916q = C6759j.m21916q(0, jSONArray.length());
        Iterator<Integer> it = m21916q.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = jSONArray.getJSONObject(((AbstractC11883p) it).nextInt());
            String enumC10417u = EnumC10417u.PUBLIC_KEY.toString();
            String string = jSONObject.getString("id");
            C9612q.m13918g(string, "obj.getString(\"id\")");
            arrayList.add(new C10408q(enumC10417u, decodeBase64(string), null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$2(Function1 tmp0, Object obj) {
        C9612q.m13917h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$3(WebAuthn this$0, Exception it) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(it, "it");
        this$0.reject.invoke("task failed");
    }

    private final String toBase64(byte[] bArr) {
        String encodeToString = Base64.encodeToString(bArr, 11);
        C9612q.m13918g(encodeToString, "encodeToString(this, BASE64_FLAG)");
        return encodeToString;
    }

    public final void authenticate(String challenge, Activity activity) {
        C9612q.m13917h(challenge, "challenge");
        C10412s.C10413a c10413a = new C10412s.C10413a();
        JSONObject jSONObject = new JSONObject(new JSONTokener(challenge)).getJSONObject("publicKey");
        String string = jSONObject.getString("challenge");
        C9612q.m13918g(string, "obj.getString(\"challenge\")");
        c10413a.m11595c(decodeBase64(string));
        JSONArray jSONArray = jSONObject.getJSONArray("allowCredentials");
        C9612q.m13918g(jSONArray, "obj.getJSONArray(\"allowCredentials\")");
        c10413a.m11596b(parseCredentialDescriptors(jSONArray));
        c10413a.m11594d(jSONObject.getString("rpId"));
        c10413a.m11593e(Double.valueOf(jSONObject.getDouble("timeout") / ((double) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA)));
        Task<PendingIntent> m12306D = C9210a.m16059a(activity).m12306D(c10413a.m11597a());
        final WebAuthn$authenticate$1 webAuthn$authenticate$1 = new WebAuthn$authenticate$1(activity);
        m12306D.mo27978f(new InterfaceC7048f() { // from class: com.discord.security_key.c
            @Override // p134ha.InterfaceC7048f
            /* renamed from: b */
            public final void mo21486b(Object obj) {
                WebAuthn.authenticate$lambda$4(Function1.this, obj);
            }
        });
        m12306D.mo27980d(new InterfaceC7047e() { // from class: com.discord.security_key.d
            @Override // p134ha.InterfaceC7047e
            public final void onFailure(Exception exc) {
                WebAuthn.authenticate$lambda$5(WebAuthn.this, exc);
            }
        });
    }

    public final Function1<String, Unit> getReject() {
        return this.reject;
    }

    public final Function1<String, Unit> getResolve() {
        return this.resolve;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        byte[] bArr;
        if (i != 4001 && i != REQUEST_CODE_AUTHENTICATE) {
            return;
        }
        if (i2 != -1) {
            this.reject.invoke("activity failed");
            return;
        }
        if (intent != null) {
            bArr = intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA");
        } else {
            bArr = null;
        }
        if (bArr == null) {
            this.reject.invoke("credential data missing");
            return;
        }
        C10403o m11621r = C10403o.m11621r(bArr);
        if (m11621r.m11623G() instanceof C10386h) {
            Function1<String, Unit> function1 = this.reject;
            AbstractC10388i m11623G = m11621r.m11623G();
            C9612q.m13919f(m11623G, "null cannot be cast to non-null type com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse");
            String m11637A = ((C10386h) m11623G).m11637A();
            C9612q.m13920e(m11637A);
            function1.invoke(m11637A);
        } else if (i != 4001) {
            if (i == REQUEST_CODE_AUTHENTICATE) {
                byte[] m11624A = m11621r.m11624A();
                C9612q.m13918g(m11624A, "credential.rawId");
                String base64 = toBase64(m11624A);
                AbstractC10388i m11623G2 = m11621r.m11623G();
                C9612q.m13919f(m11623G2, "null cannot be cast to non-null type com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse");
                C10380f c10380f = (C10380f) m11623G2;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", base64);
                jSONObject.put("rawId", base64);
                jSONObject.put("type", EnumC10417u.PUBLIC_KEY.toString());
                JSONObject jSONObject2 = new JSONObject();
                byte[] mo11635r = c10380f.mo11635r();
                C9612q.m13918g(mo11635r, "response.clientDataJSON");
                jSONObject2.put("clientDataJSON", toBase64(mo11635r));
                byte[] m11643z = c10380f.m11643z();
                C9612q.m13918g(m11643z, "response.authenticatorData");
                jSONObject2.put("authenticatorData", toBase64(m11643z));
                byte[] m11645G = c10380f.m11645G();
                C9612q.m13918g(m11645G, "response.signature");
                jSONObject2.put("signature", toBase64(m11645G));
                byte[] m11644H = c10380f.m11644H();
                if (m11644H != null) {
                    jSONObject2.put("userHandle", toBase64(m11644H));
                }
                jSONObject.put("response", jSONObject2);
                Function1<String, Unit> function12 = this.resolve;
                String jSONObject3 = jSONObject.toString();
                C9612q.m13918g(jSONObject3, "obj.toString()");
                function12.invoke(jSONObject3);
            }
        } else {
            byte[] m11624A2 = m11621r.m11624A();
            C9612q.m13918g(m11624A2, "credential.rawId");
            String base642 = toBase64(m11624A2);
            AbstractC10388i m11623G3 = m11621r.m11623G();
            C9612q.m13919f(m11623G3, "null cannot be cast to non-null type com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse");
            C10383g c10383g = (C10383g) m11623G3;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("id", base642);
            jSONObject4.put("rawId", base642);
            jSONObject4.put("type", EnumC10417u.PUBLIC_KEY.toString());
            JSONObject jSONObject5 = new JSONObject();
            byte[] mo11635r2 = c10383g.mo11635r();
            C9612q.m13918g(mo11635r2, "response.clientDataJSON");
            jSONObject5.put("clientDataJSON", toBase64(mo11635r2));
            byte[] m11640z = c10383g.m11640z();
            C9612q.m13918g(m11640z, "response.attestationObject");
            jSONObject5.put("attestationObject", toBase64(m11640z));
            jSONObject4.put("response", jSONObject5);
            Function1<String, Unit> function13 = this.resolve;
            String jSONObject6 = jSONObject4.toString();
            C9612q.m13918g(jSONObject6, "obj.toString()");
            function13.invoke(jSONObject6);
        }
    }

    public final void register(String challenge, Activity activity) {
        IntRange m21916q;
        C9612q.m13917h(challenge, "challenge");
        C10405p.C10406a c10406a = new C10405p.C10406a();
        JSONObject jSONObject = new JSONObject(new JSONTokener(challenge)).getJSONObject("publicKey");
        String string = jSONObject.getJSONObject("user").getString("id");
        C9612q.m13918g(string, "obj.getJSONObject(\"user\").getString(\"id\")");
        c10406a.m11606h(new C10420v(decodeBase64(string), jSONObject.getJSONObject("user").getString(ZeroconfModule.KEY_SERVICE_NAME), null, jSONObject.getJSONObject("user").getString("displayName")));
        String string2 = jSONObject.getString("challenge");
        C9612q.m13918g(string2, "obj.getString(\"challenge\")");
        c10406a.m11611c(decodeBase64(string2));
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        m21916q = C6759j.m21916q(0, jSONArray.length());
        Iterator<Integer> it = m21916q.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(((AbstractC11883p) it).nextInt());
            arrayList.add(new C10410r(jSONObject2.getString("type"), jSONObject2.getInt("alg")));
        }
        c10406a.m11609e(arrayList);
        c10406a.m11607g(Double.valueOf(jSONObject.getDouble("timeout") / ((double) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA)));
        JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
        C9612q.m13918g(jSONArray2, "obj.getJSONArray(\"excludeCredentials\")");
        c10406a.m11610d(parseCredentialDescriptors(jSONArray2));
        C10390j.C10391a c10391a = new C10390j.C10391a();
        JSONObject jSONObject3 = jSONObject.getJSONObject("authenticatorSelection");
        if (jSONObject3.has("authenticatorAttachment")) {
            c10391a.m11631b(EnumC10366b.m11656a(jSONObject3.getString("authenticatorAttachment")));
        }
        c10406a.m11612b(c10391a.m11632a());
        c10406a.m11608f(new C10415t(jSONObject.getJSONObject("rp").getString("id"), jSONObject.getJSONObject("rp").getString(ZeroconfModule.KEY_SERVICE_NAME), null));
        Task<PendingIntent> m12307C = C9210a.m16059a(activity).m12307C(c10406a.m11613a());
        final WebAuthn$register$2 webAuthn$register$2 = new WebAuthn$register$2(activity);
        m12307C.mo27978f(new InterfaceC7048f() { // from class: com.discord.security_key.a
            @Override // p134ha.InterfaceC7048f
            /* renamed from: b */
            public final void mo21486b(Object obj) {
                WebAuthn.register$lambda$2(Function1.this, obj);
            }
        });
        m12307C.mo27980d(new InterfaceC7047e() { // from class: com.discord.security_key.b
            @Override // p134ha.InterfaceC7047e
            public final void onFailure(Exception exc) {
                WebAuthn.register$lambda$3(WebAuthn.this, exc);
            }
        });
    }
}

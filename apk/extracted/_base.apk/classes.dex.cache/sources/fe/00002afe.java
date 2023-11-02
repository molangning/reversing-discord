package com.google.android.gms.internal.gtm;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import p029b9.C2198p;
import p282p8.C11465n;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzfe extends zzbs {
    private static final byte[] zza = ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE.getBytes();
    private final String zzb;
    private final zzfo zzc;

    public zzfe(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzb = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", zzbt.zza, Build.VERSION.RELEASE, zzfs.zzd(Locale.getDefault()), Build.MODEL, Build.ID);
        this.zzc = new zzfo(zzbvVar.zzr());
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzg(java.net.URL r6, byte[] r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Error closing http post connection output stream"
            p029b9.C2198p.m33985j(r6)
            p029b9.C2198p.m33985j(r7)
            int r1 = r7.length
            java.lang.String r2 = "POST bytes, url"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r5.zzH(r2, r3, r6)
            boolean r2 = com.google.android.gms.internal.gtm.zzbr.zzV()
            if (r2 == 0) goto L22
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7)
            java.lang.String r3 = "Post payload\n"
            r5.zzP(r3, r2)
        L22:
            r2 = 0
            android.content.Context r3 = r5.zzo()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L72
            r3.getPackageName()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L72
            java.net.HttpURLConnection r6 = r5.zzb(r6)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L72
            r3 = 1
            r6.setDoOutput(r3)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69
            r6.setFixedLengthStreamingMode(r1)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69
            r6.connect()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69
            java.io.OutputStream r2 = r6.getOutputStream()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69
            r2.write(r7)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69
            r5.zzk(r6)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69
            int r7 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69
            r1 = 200(0xc8, float:2.8E-43)
            if (r7 != r1) goto L52
            com.google.android.gms.internal.gtm.zzbq r7 = r5.zzs()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69
            r7.zzi()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69
            r7 = r1
        L52:
            java.lang.String r1 = "POST status"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69
            r5.zzG(r1, r3)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L69
            r2.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L5f:
            r1 = move-exception
            r5.zzK(r0, r1)
        L63:
            r6.disconnect()
            return r7
        L67:
            r7 = move-exception
            goto L8f
        L69:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
            goto L75
        L6e:
            r6 = move-exception
            r7 = r6
            r6 = r2
            goto L8f
        L72:
            r6 = move-exception
            r7 = r6
            r6 = r2
        L75:
            java.lang.String r1 = "Network POST connection error"
            r5.zzS(r1, r7)     // Catch: java.lang.Throwable -> L8b
            if (r6 == 0) goto L84
            r6.close()     // Catch: java.io.IOException -> L80
            goto L84
        L80:
            r6 = move-exception
            r5.zzK(r0, r6)
        L84:
            if (r2 == 0) goto L89
            r2.disconnect()
        L89:
            r6 = 0
            return r6
        L8b:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
        L8f:
            if (r2 == 0) goto L99
            r2.close()     // Catch: java.io.IOException -> L95
            goto L99
        L95:
            r1 = move-exception
            r5.zzK(r0, r1)
        L99:
            if (r6 == 0) goto L9e
            r6.disconnect()
        L9e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfe.zzg(java.net.URL, byte[]):int");
    }

    private final URL zzh() {
        String str;
        zzw();
        String zzi = zzct.zzi();
        zzw();
        String zzb = zzeu.zzt.zzb();
        if (zzb.length() != 0) {
            str = zzi.concat(zzb);
        } else {
            str = new String(zzi);
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            zzK("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzi(zzex zzexVar) {
        String str;
        String concat;
        if (zzexVar.zzh()) {
            zzw();
            String zzi = zzct.zzi();
            zzw();
            String zzj = zzct.zzj();
            if (zzj.length() != 0) {
                concat = zzi.concat(zzj);
            } else {
                str = new String(zzi);
                concat = str;
            }
        } else {
            zzw();
            String zzk = zzct.zzk();
            zzw();
            String zzj2 = zzct.zzj();
            if (zzj2.length() != 0) {
                concat = zzk.concat(zzj2);
            } else {
                str = new String(zzk);
                concat = str;
            }
        }
        try {
            return new URL(concat);
        } catch (MalformedURLException e) {
            zzK("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzj(zzex zzexVar, String str) {
        String sb2;
        if (zzexVar.zzh()) {
            zzw();
            String zzi = zzct.zzi();
            zzw();
            String zzj = zzct.zzj();
            int length = zzi.length();
            StringBuilder sb3 = new StringBuilder(length + 1 + zzj.length() + str.length());
            sb3.append(zzi);
            sb3.append(zzj);
            sb3.append("?");
            sb3.append(str);
            sb2 = sb3.toString();
        } else {
            zzw();
            String zzk = zzct.zzk();
            zzw();
            String zzj2 = zzct.zzj();
            int length2 = zzk.length();
            StringBuilder sb4 = new StringBuilder(length2 + 1 + zzj2.length() + str.length());
            sb4.append(zzk);
            sb4.append(zzj2);
            sb4.append("?");
            sb4.append(str);
            sb2 = sb4.toString();
        }
        try {
            return new URL(sb2);
        } catch (MalformedURLException e) {
            zzK("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final void zzk(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            do {
            } while (inputStream.read(new byte[1024]) > 0);
            try {
                inputStream.close();
            } catch (IOException e) {
                zzK("Error closing http connection input stream", e);
            }
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    zzK("Error closing http connection input stream", e2);
                }
            }
            throw th;
        }
    }

    private static final void zzl(StringBuilder sb2, String str, String str2) {
        if (sb2.length() != 0) {
            sb2.append('&');
        }
        sb2.append(URLEncoder.encode(str, "UTF-8"));
        sb2.append('=');
        sb2.append(URLEncoder.encode(str2, "UTF-8"));
    }

    public final String zza(zzex zzexVar, boolean z) {
        String valueOf;
        C2198p.m33985j(zzexVar);
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : zzexVar.zzg().entrySet()) {
                String key = entry.getKey();
                if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key) && !"z".equals(key) && !"_gmsv".equals(key)) {
                    zzl(sb2, key, entry.getValue());
                }
            }
            zzl(sb2, "ht", String.valueOf(zzexVar.zzd()));
            zzl(sb2, "qt", String.valueOf(zzC().mo22382a() - zzexVar.zzd()));
            zzw();
            if (z) {
                long zzc = zzexVar.zzc();
                if (zzc != 0) {
                    valueOf = String.valueOf(zzc);
                } else {
                    valueOf = String.valueOf(zzexVar.zzb());
                }
                zzl(sb2, "z", valueOf);
            }
            return sb2.toString();
        } catch (UnsupportedEncodingException e) {
            zzK("Failed to encode name or value", e);
            return null;
        }
    }

    final HttpURLConnection zzb(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzw();
            httpURLConnection.setConnectTimeout(zzeu.zzE.zzb().intValue());
            zzw();
            httpURLConnection.setReadTimeout(zzeu.zzF.zzb().intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.zzb);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    /* JADX WARN: Removed duplicated region for block: B:216:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0322 A[EDGE_INSN: B:362:0x0322->B:340:0x0322 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.Long> zzc(java.util.List<com.google.android.gms.internal.gtm.zzex> r20) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfe.zzc(java.util.List):java.util.List");
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        zzP("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        NetworkInfo networkInfo;
        C11465n.m8036d();
        zzW();
        try {
            networkInfo = ((ConnectivityManager) zzo().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        zzO("No network connectivity");
        return false;
    }
}
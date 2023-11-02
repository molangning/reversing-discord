package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p029b9.C2198p;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzex {
    private final Map<String, String> zza;
    private final List<zzcp> zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;
    private final boolean zzf;
    private final String zzg;

    public zzex(zzbr zzbrVar, Map<String, String> map, long j, boolean z, long j2, int i, List<zzcp> list) {
        List<zzcp> emptyList;
        String str;
        String zzj;
        String zzj2;
        C2198p.m33985j(zzbrVar);
        C2198p.m33985j(map);
        this.zzd = j;
        this.zzf = z;
        this.zzc = j2;
        this.zze = i;
        if (list != null) {
            emptyList = list;
        } else {
            emptyList = Collections.emptyList();
        }
        this.zzb = emptyList;
        if (list != null) {
            for (zzcp zzcpVar : list) {
                if ("appendVersion".equals(zzcpVar.zza())) {
                    str = zzcpVar.zzb();
                    break;
                }
            }
        }
        str = null;
        this.zzg = true != TextUtils.isEmpty(str) ? str : null;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (zzl(entry.getKey()) && (zzj2 = zzj(zzbrVar, entry.getKey())) != null) {
                hashMap.put(zzj2, zzk(zzbrVar, entry.getValue()));
            }
        }
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            if (!zzl(entry2.getKey()) && (zzj = zzj(zzbrVar, entry2.getKey())) != null) {
                hashMap.put(zzj, zzk(zzbrVar, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(this.zzg)) {
            zzfs.zzg(hashMap, "_v", this.zzg);
            if (this.zzg.equals("ma4.0.0") || this.zzg.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.zza = Collections.unmodifiableMap(hashMap);
    }

    private final String zzi(String str, String str2) {
        C2198p.m33989f(str);
        C2198p.m33993b(!str.startsWith("&"), "Short param name required");
        String str3 = this.zza.get(str);
        if (str3 != null) {
            return str3;
        }
        return str2;
    }

    private static String zzj(zzbr zzbrVar, Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            zzbrVar.zzT("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        if (TextUtils.isEmpty(obj2)) {
            return null;
        }
        return obj2;
    }

    private static String zzk(zzbr zzbrVar, Object obj) {
        String obj2;
        if (obj == null) {
            obj2 = "";
        } else {
            obj2 = obj.toString();
        }
        int length = obj2.length();
        if (length > 8192) {
            String substring = obj2.substring(0, 8192);
            zzbrVar.zzT("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
            return substring;
        }
        return obj2;
    }

    private static boolean zzl(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ht=");
        sb2.append(this.zzd);
        if (this.zzc != 0) {
            sb2.append(", dbId=");
            sb2.append(this.zzc);
        }
        if (this.zze != 0) {
            sb2.append(", appUID=");
            sb2.append(this.zze);
        }
        ArrayList arrayList = new ArrayList(this.zza.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            sb2.append(", ");
            sb2.append(str);
            sb2.append("=");
            sb2.append(this.zza.get(str));
        }
        return sb2.toString();
    }

    public final long zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return zzfs.zza(zzi("_s", "0"));
    }

    public final long zzd() {
        return this.zzd;
    }

    public final Map<String, String> zzg() {
        return this.zza;
    }

    public final boolean zzh() {
        return this.zzf;
    }
}
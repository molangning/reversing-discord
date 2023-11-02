package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.content.res.C0971e;
import androidx.core.provider.C1090g;
import com.facebook.react.util.JSStackTrace;
import com.facebook.react.views.text.TypefaceStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.core.provider.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1081d {

    /* renamed from: a */
    private static final Comparator<byte[]> f3419a = new Comparator() { // from class: androidx.core.provider.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m37942g;
            m37942g = C1081d.m37942g((byte[]) obj, (byte[]) obj2);
            return m37942g;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1082a {
        /* renamed from: a */
        static Cursor m37940a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* renamed from: b */
    private static List<byte[]> m37947b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    private static boolean m37946c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static List<List<byte[]>> m37945d(C1083e c1083e, Resources resources) {
        if (c1083e.m37938b() != null) {
            return c1083e.m37938b();
        }
        return C0971e.m38271c(resources, c1083e.m37937c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C1090g.C1091a m37944e(Context context, C1083e c1083e, CancellationSignal cancellationSignal) {
        ProviderInfo m37943f = m37943f(context.getPackageManager(), c1083e, context.getResources());
        if (m37943f == null) {
            return C1090g.C1091a.m37919a(1, null);
        }
        return C1090g.C1091a.m37919a(0, m37941h(context, c1083e, m37943f.authority, cancellationSignal));
    }

    /* renamed from: f */
    static ProviderInfo m37943f(PackageManager packageManager, C1083e c1083e, Resources resources) {
        String m37935e = c1083e.m37935e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m37935e, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(c1083e.m37934f())) {
                List<byte[]> m37947b = m37947b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(m37947b, f3419a);
                List<List<byte[]>> m37945d = m37945d(c1083e, resources);
                for (int i = 0; i < m37945d.size(); i++) {
                    ArrayList arrayList = new ArrayList(m37945d.get(i));
                    Collections.sort(arrayList, f3419a);
                    if (m37946c(m37947b, arrayList)) {
                        return resolveContentProvider;
                    }
                }
                return null;
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + m37935e + ", but package was not " + c1083e.m37934f());
        }
        throw new PackageManager.NameNotFoundException("No package found for authority: " + m37935e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ int m37942g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    /* renamed from: h */
    static C1090g.C1092b[] m37941h(Context context, C1083e c1083e, String str, CancellationSignal cancellationSignal) {
        int i;
        int i2;
        int i3;
        Uri withAppendedId;
        int i4;
        int i5;
        boolean z;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath(JSStackTrace.FILE_KEY).build();
        Cursor cursor = null;
        try {
            int i6 = 0;
            cursor = C1082a.m37940a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c1083e.m37933g()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    if (columnIndex != -1) {
                        i = cursor.getInt(columnIndex);
                    } else {
                        i = i6;
                    }
                    if (columnIndex4 != -1) {
                        i2 = cursor.getInt(columnIndex4);
                    } else {
                        i2 = i6;
                    }
                    if (columnIndex3 == -1) {
                        i3 = i;
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i3 = i;
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    if (columnIndex5 != -1) {
                        i4 = cursor.getInt(columnIndex5);
                    } else {
                        i4 = TypefaceStyle.NORMAL;
                    }
                    if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                        i5 = i3;
                        z = true;
                    } else {
                        i5 = i3;
                        z = false;
                    }
                    arrayList2.add(C1090g.C1092b.m37916a(withAppendedId, i2, i4, z, i5));
                    i6 = 0;
                }
                arrayList = arrayList2;
            }
            return (C1090g.C1092b[]) arrayList.toArray(new C1090g.C1092b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}

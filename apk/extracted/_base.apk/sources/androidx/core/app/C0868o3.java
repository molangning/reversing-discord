package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.o3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0868o3 {

    /* renamed from: a */
    private static final Object f3225a = new Object();

    /* renamed from: b */
    private static final Object f3226b = new Object();

    /* renamed from: a */
    private static RemoteInput m38538a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new RemoteInput(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
    }

    /* renamed from: b */
    private static RemoteInput[] m38537b(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            remoteInputArr[i] = m38538a(bundleArr[i]);
        }
        return remoteInputArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static NotificationCompat.Action m38536c(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        boolean z = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean("android.support.allowGeneratedReplies", false);
        }
        return new NotificationCompat.Action(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), m38537b(m38535d(bundle, "remoteInputs")), m38537b(m38535d(bundle, "dataOnlyRemoteInputs")), z, bundle.getInt("semanticAction"), bundle.getBoolean("showsUserInterface"), false, false);
    }

    /* renamed from: d */
    private static Bundle[] m38535d(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if (!(parcelableArray instanceof Bundle[]) && parcelableArray != null) {
            Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
            bundle.putParcelableArray(str, bundleArr);
            return bundleArr;
        }
        return (Bundle[]) parcelableArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Bundle m38534e(NotificationCompat.Action action) {
        int i;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat m39044d = action.m39044d();
        if (m39044d != null) {
            i = m39044d.m38123o();
        } else {
            i = 0;
        }
        bundle2.putInt("icon", i);
        bundle2.putCharSequence("title", action.m39040h());
        bundle2.putParcelable("actionIntent", action.m39047a());
        if (action.m39045c() != null) {
            bundle = new Bundle(action.m39045c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.m39046b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m38532g(action.m39043e()));
        bundle2.putBoolean("showsUserInterface", action.m39041g());
        bundle2.putInt("semanticAction", action.m39042f());
        return bundle2;
    }

    /* renamed from: f */
    private static Bundle m38533f(RemoteInput remoteInput) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", remoteInput.m38716j());
        bundle.putCharSequence("label", remoteInput.m38717i());
        bundle.putCharSequenceArray("choices", remoteInput.m38720f());
        bundle.putBoolean("allowFreeFormInput", remoteInput.m38722d());
        bundle.putBundle("extras", remoteInput.m38718h());
        Set<String> m38721e = remoteInput.m38721e();
        if (m38721e != null && !m38721e.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(m38721e.size());
            for (String str : m38721e) {
                arrayList.add(str);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: g */
    private static Bundle[] m38532g(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            bundleArr[i] = m38533f(remoteInputArr[i]);
        }
        return bundleArr;
    }
}

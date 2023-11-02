package p029b9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.p018os.C1059g;
import java.util.Locale;
import p119g9.C6583f;
import p154i9.C7478d;
import p400w8.C13432b;
import p441y8.C13936g;
import p441y8.C13939j;

/* renamed from: b9.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2148b0 {

    /* renamed from: a */
    private static final SimpleArrayMap<String, String> f6049a = new SimpleArrayMap<>();

    /* renamed from: b */
    private static Locale f6050b;

    /* renamed from: a */
    public static String m34122a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C7478d.m20598a(context).m20601d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    /* renamed from: b */
    public static String m34121b(Context context) {
        return context.getResources().getString(C13432b.f34639g);
    }

    /* renamed from: c */
    public static String m34120c(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return resources.getString(17039370);
                }
                return resources.getString(C13432b.f34633a);
            }
            return resources.getString(C13432b.f34642j);
        }
        return resources.getString(C13432b.f34636d);
    }

    /* renamed from: d */
    public static String m34119d(Context context, int i) {
        Resources resources = context.getResources();
        String m34122a = m34122a(context);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 7) {
                            if (i != 9) {
                                if (i != 20) {
                                    switch (i) {
                                        case 16:
                                            return m34115h(context, "common_google_play_services_api_unavailable_text", m34122a);
                                        case 17:
                                            return m34115h(context, "common_google_play_services_sign_in_failed_text", m34122a);
                                        case 18:
                                            return resources.getString(C13432b.f34645m, m34122a);
                                        default:
                                            return resources.getString(C13939j.f35895a, m34122a);
                                    }
                                }
                                return m34115h(context, "common_google_play_services_restricted_profile_text", m34122a);
                            }
                            return resources.getString(C13432b.f34641i, m34122a);
                        }
                        return m34115h(context, "common_google_play_services_network_error_text", m34122a);
                    }
                    return m34115h(context, "common_google_play_services_invalid_account_text", m34122a);
                }
                return resources.getString(C13432b.f34634b, m34122a);
            } else if (C6583f.m22376d(context)) {
                return resources.getString(C13432b.f34646n);
            } else {
                return resources.getString(C13432b.f34643k, m34122a);
            }
        }
        return resources.getString(C13432b.f34637e, m34122a);
    }

    /* renamed from: e */
    public static String m34118e(Context context, int i) {
        if (i != 6 && i != 19) {
            return m34119d(context, i);
        }
        return m34115h(context, "common_google_play_services_resolution_required_text", m34122a(context));
    }

    /* renamed from: f */
    public static String m34117f(Context context, int i) {
        String m34116g;
        if (i == 6) {
            m34116g = m34114i(context, "common_google_play_services_resolution_required_title");
        } else {
            m34116g = m34116g(context, i);
        }
        if (m34116g == null) {
            return context.getResources().getString(C13432b.f34640h);
        }
        return m34116g;
    }

    /* renamed from: g */
    public static String m34116g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C13432b.f34638f);
            case 2:
                return resources.getString(C13432b.f34644l);
            case 3:
                return resources.getString(C13432b.f34635c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m34114i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m34114i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Unexpected error code ");
                sb2.append(i);
                Log.e("GoogleApiAvailability", sb2.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m34114i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m34114i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: h */
    private static String m34115h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String m34114i = m34114i(context, str);
        if (m34114i == null) {
            m34114i = resources.getString(C13939j.f35895a);
        }
        return String.format(resources.getConfiguration().locale, m34114i, str2);
    }

    /* renamed from: i */
    private static String m34114i(Context context, String str) {
        String str2;
        String str3;
        SimpleArrayMap<String, String> simpleArrayMap = f6049a;
        synchronized (simpleArrayMap) {
            Locale m38002d = C1059g.m37971a(context.getResources().getConfiguration()).m38002d(0);
            if (!m38002d.equals(f6050b)) {
                simpleArrayMap.clear();
                f6050b = m38002d;
            }
            String str4 = simpleArrayMap.get(str);
            if (str4 != null) {
                return str4;
            }
            Resources m1117b = C13936g.m1117b(context);
            if (m1117b == null) {
                return null;
            }
            int identifier = m1117b.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    str3 = "Missing resource: ".concat(str);
                } else {
                    str3 = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", str3);
                return null;
            }
            String string = m1117b.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                if (str.length() != 0) {
                    str2 = "Got empty resource: ".concat(str);
                } else {
                    str2 = new String("Got empty resource: ");
                }
                Log.w("GoogleApiAvailability", str2);
                return null;
            }
            simpleArrayMap.put(str, string);
            return string;
        }
    }
}

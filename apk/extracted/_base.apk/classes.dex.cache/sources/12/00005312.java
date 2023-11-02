package p452z;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.util.C1134c;
import androidx.core.util.C1138f;
import androidx.core.view.C1365w0;
import androidx.core.view.ContentInfoCompat;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: z.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C14049f {

    /* renamed from: z.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C14050a extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ InterfaceC14052c f36095a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14050a(InputConnection inputConnection, boolean z, InterfaceC14052c interfaceC14052c) {
            super(inputConnection, z);
            this.f36095a = interfaceC14052c;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f36095a.mo812a(C14057k.m802f(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: z.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C14051b extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ InterfaceC14052c f36096a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14051b(InputConnection inputConnection, boolean z, InterfaceC14052c interfaceC14052c) {
            super(inputConnection, z);
            this.f36096a = interfaceC14052c;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (C14049f.m814e(str, bundle, this.f36096a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: z.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC14052c {
        /* renamed from: a */
        boolean mo812a(C14057k c14057k, int i, Bundle bundle);
    }

    /* renamed from: b */
    private static InterfaceC14052c m817b(final View view) {
        C1138f.m37824f(view);
        return new InterfaceC14052c() { // from class: z.e
            @Override // p452z.C14049f.InterfaceC14052c
            /* renamed from: a */
            public final boolean mo812a(C14057k c14057k, int i, Bundle bundle) {
                boolean m813f;
                m813f = C14049f.m813f(view, c14057k, i, bundle);
                return m813f;
            }
        };
    }

    /* renamed from: c */
    public static InputConnection m816c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return m815d(inputConnection, editorInfo, m817b(view));
    }

    @Deprecated
    /* renamed from: d */
    public static InputConnection m815d(InputConnection inputConnection, EditorInfo editorInfo, InterfaceC14052c interfaceC14052c) {
        C1134c.m37832d(inputConnection, "inputConnection must be non-null");
        C1134c.m37832d(editorInfo, "editorInfo must be non-null");
        C1134c.m37832d(interfaceC14052c, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new C14050a(inputConnection, false, interfaceC14052c);
        }
        if (C14046d.m827a(editorInfo).length == 0) {
            return inputConnection;
        }
        return new C14051b(inputConnection, false, interfaceC14052c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: e */
    static boolean m814e(String str, Bundle bundle, InterfaceC14052c interfaceC14052c) {
        boolean z;
        String str2;
        ResultReceiver resultReceiver;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ?? r0 = 0;
        r0 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z = false;
        } else if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            return false;
        } else {
            z = true;
        }
        if (z) {
            str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        } else {
            str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(str2);
            if (z) {
                str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            } else {
                str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = 0;
        }
        try {
            Uri uri = (Uri) bundle.getParcelable(str3);
            if (z) {
                str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
            } else {
                str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
            }
            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str4);
            if (z) {
                str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
            } else {
                str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
            }
            Uri uri2 = (Uri) bundle.getParcelable(str5);
            if (z) {
                str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
            } else {
                str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
            }
            int i = bundle.getInt(str6);
            if (z) {
                str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
            } else {
                str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
            }
            Bundle bundle2 = (Bundle) bundle.getParcelable(str7);
            if (uri != null && clipDescription != null) {
                r0 = interfaceC14052c.mo812a(new C14057k(uri, clipDescription, uri2), i, bundle2);
            }
            if (resultReceiver != 0) {
                resultReceiver.send(r0, null);
            }
            return r0;
        } catch (Throwable th3) {
            th = th3;
            if (resultReceiver != 0) {
                resultReceiver.send(0, null);
            }
            throw th;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m813f(View view, C14057k c14057k, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                c14057k.m804d();
                InputContentInfo inputContentInfo = (InputContentInfo) c14057k.m803e();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        if (C1365w0.m37205g0(view, new ContentInfoCompat.C1141a(new ClipData(c14057k.m806b(), new ClipData.Item(c14057k.m807a())), 2).m37798e(c14057k.m805c()).m37800c(bundle).m37802a()) != null) {
            return false;
        }
        return true;
    }
}
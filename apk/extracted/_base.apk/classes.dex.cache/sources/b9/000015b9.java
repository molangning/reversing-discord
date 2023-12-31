package com.discord.chatreplay;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.core.content.C0955e;
import androidx.core.content.FileProvider;
import com.facebook.react.uimanager.events.TouchesHelper;
import com.facebook.react.util.JSStackTrace;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9538f;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlinx.serialization.json.Json;
import p045cj.C2581f;
import p304qf.AbstractC11883p;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0015¨\u0006\u0013"}, m14357d2 = {"Lcom/discord/chatreplay/ReplayProviderActivity;", "Landroid/app/Activity;", "()V", "getReplayFile", "Ljava/io/File;", "replayName", "", "getReplaysList", "", "Lcom/discord/chatreplay/Replay;", "grantAccessToFile", "Landroid/net/Uri;", "toPackage", JSStackTrace.FILE_KEY, "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "chat_replay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ReplayProviderActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    private static final String INTENT_EXTRA_GRANTED_URI = "INTENT_EXTRA_GRANTED_URI";
    private static final String INTENT_EXTRA_REPLAYS_LIST = "INTENT_EXTRA_REPLAYS_LIST";

    @Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m14357d2 = {"Lcom/discord/chatreplay/ReplayProviderActivity$Companion;", "", "()V", ReplayProviderActivity.INTENT_EXTRA_GRANTED_URI, "", ReplayProviderActivity.INTENT_EXTRA_REPLAYS_LIST, "getGrantedUri", "Landroid/net/Uri;", "intent", "Landroid/content/Intent;", "getReplaysListFromIntent", "", "Lcom/discord/chatreplay/Replay;", "requestReplayList", "", "activity", "Landroid/app/Activity;", "requestCode", "", "requestUriPermission", "replayFilename", "chat_replay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri getGrantedUri(Intent intent) {
            C9612q.m13917h(intent, "intent");
            Object m38374b = C0955e.m38374b(intent, ReplayProviderActivity.INTENT_EXTRA_GRANTED_URI, Uri.class);
            C9612q.m13920e(m38374b);
            return (Uri) m38374b;
        }

        public final List<Replay> getReplaysListFromIntent(Intent intent) {
            C9612q.m13917h(intent, "intent");
            String stringExtra = intent.getStringExtra(ReplayProviderActivity.INTENT_EXTRA_REPLAYS_LIST);
            C9612q.m13920e(stringExtra);
            Json.C9954a c9954a = Json.f25830d;
            c9954a.mo265a();
            return (List) c9954a.mo232b(new C2581f(Replay$$serializer.INSTANCE), stringExtra);
        }

        public final void requestReplayList(Activity activity, int i) {
            C9612q.m13917h(activity, "activity");
            Intent intent = new Intent();
            intent.setAction("com.discord.GET_REPLAY_LIST");
            try {
                activity.startActivityForResult(intent, i);
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(activity, "Unable to fetch replay list, activity not available.", 1).show();
            }
        }

        public final void requestUriPermission(Activity activity, String replayFilename, int i) {
            C9612q.m13917h(activity, "activity");
            C9612q.m13917h(replayFilename, "replayFilename");
            Intent intent = new Intent();
            intent.setAction("com.discord.REQUEST_REPLAY_ACCESS");
            String packageName = activity.getPackageName();
            intent.setData(Uri.parse("discord://request_replay?target=" + replayFilename + "&toPackage=" + packageName));
            activity.startActivityForResult(intent, i);
        }
    }

    private final File getReplayFile(String str) {
        Path path;
        String path2 = getFilesDir().getPath();
        path = Paths.get(path2 + "/rows", new String[0]);
        return new File(path.toString(), str);
    }

    private final List<Replay> getReplaysList() {
        Path logsFolderPath;
        Path absolutePath;
        IntRange m14245F;
        int m14093t;
        int m14093t2;
        String path = getFilesDir().getPath();
        logsFolderPath = Paths.get(path + "/rows", new String[0]);
        C9612q.m13918g(logsFolderPath, "logsFolderPath");
        absolutePath = logsFolderPath.toAbsolutePath();
        File[] listFiles = new File(absolutePath.toString()).listFiles();
        if (listFiles == null) {
            listFiles = new File[0];
        }
        m14245F = C9538f.m14245F(listFiles);
        m14093t = C9546k.m14093t(m14245F, 10);
        ArrayList<File> arrayList = new ArrayList(m14093t);
        Iterator<Integer> it = m14245F.iterator();
        while (it.hasNext()) {
            arrayList.add(listFiles[((AbstractC11883p) it).nextInt()]);
        }
        m14093t2 = C9546k.m14093t(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m14093t2);
        for (File file : arrayList) {
            String name = file.getName();
            C9612q.m13918g(name, "file.name");
            arrayList2.add(new Replay(name, file.lastModified()));
        }
        return arrayList2;
    }

    private final Uri grantAccessToFile(String str, File file) {
        Uri fileContentUri = FileProvider.getUriForFile(this, "com.discord.replays", file);
        grantUriPermission(str, fileContentUri, 1);
        C9612q.m13918g(fileContentUri, "fileContentUri");
        return fileContentUri;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C9612q.m13922c(getIntent().getAction(), "com.discord.GET_REPLAY_LIST")) {
            List<Replay> replaysList = getReplaysList();
            Intent intent = new Intent();
            Json.C9954a c9954a = Json.f25830d;
            c9954a.mo265a();
            intent.putExtra(INTENT_EXTRA_REPLAYS_LIST, c9954a.mo231c(new C2581f(Replay$$serializer.INSTANCE), replaysList));
            setResult(-1, intent);
            finish();
        } else if (C9612q.m13922c(getIntent().getAction(), "com.discord.REQUEST_REPLAY_ACCESS")) {
            Uri data = getIntent().getData();
            C9612q.m13920e(data);
            String queryParameter = data.getQueryParameter(TouchesHelper.TARGET_KEY);
            C9612q.m13920e(queryParameter);
            Uri data2 = getIntent().getData();
            C9612q.m13920e(data2);
            String queryParameter2 = data2.getQueryParameter("toPackage");
            C9612q.m13920e(queryParameter2);
            Uri grantAccessToFile = grantAccessToFile(queryParameter2, getReplayFile(queryParameter));
            Intent intent2 = new Intent();
            intent2.putExtra(INTENT_EXTRA_GRANTED_URI, grantAccessToFile);
            Unit unit = Unit.f25302a;
            setResult(-1, intent2);
            finish();
        }
    }
}
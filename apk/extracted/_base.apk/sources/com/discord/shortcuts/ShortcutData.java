package com.discord.shortcuts;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9544i;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m14357d2 = {"Lcom/discord/shortcuts/ShortcutData;", "", "tag", "", "data", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "getTag", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "shortcuts_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class ShortcutData {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_DATA = "discord_shortcut_data";
    private static final String KEY_SHORTCUT = "discord_shortcut";
    private static final String KEY_TAG = "discord_shortcut_tag";
    private final Map<String, String> data;
    private final String tag;

    @Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0010J\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m14357d2 = {"Lcom/discord/shortcuts/ShortcutData$Companion;", "", "()V", "KEY_DATA", "", "KEY_SHORTCUT", "KEY_TAG", "createShortcutIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "action", "clazz", "Ljava/lang/Class;", "tag", "data", "", "getShortcutIntentData", "Lcom/discord/shortcuts/ShortcutData;", "shortcuts_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent createShortcutIntent(Context context, String action, Class<?> clazz, String tag, Map<String, String> data) {
            List m14110c;
            List m14112a;
            C9612q.m13917h(context, "context");
            C9612q.m13917h(action, "action");
            C9612q.m13917h(clazz, "clazz");
            C9612q.m13917h(tag, "tag");
            C9612q.m13917h(data, "data");
            Intent putExtra = new Intent(action, null, context, clazz).putExtra(ShortcutData.KEY_SHORTCUT, true).putExtra(ShortcutData.KEY_TAG, tag);
            m14110c = C9544i.m14110c();
            for (Map.Entry<String, String> entry : data.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value != null) {
                    m14110c.add(key);
                    m14110c.add(value);
                }
            }
            Unit unit = Unit.f25302a;
            m14112a = C9544i.m14112a(m14110c);
            Intent putExtra2 = putExtra.putExtra(ShortcutData.KEY_DATA, (String[]) m14112a.toArray(new String[0]));
            C9612q.m13918g(putExtra2, "Intent(action, null, con…rray(),\n                )");
            return putExtra2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
            r6 = si.C12552o.m4863m(r6, 2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
            r6 = kotlin.collections.C9538f.m14198u(r6);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.discord.shortcuts.ShortcutData getShortcutIntentData(android.content.Intent r6) {
            /*
                r5 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.C9612q.m13917h(r6, r0)
                java.lang.String r0 = "discord_shortcut"
                boolean r0 = r6.hasExtra(r0)
                if (r0 == 0) goto L66
                java.lang.String r0 = "discord_shortcut_tag"
                java.lang.String r0 = r6.getStringExtra(r0)
                if (r0 != 0) goto L17
                java.lang.String r0 = ""
            L17:
                java.util.Map r1 = p304qf.C11886s.m6775c()
                java.lang.String r2 = "discord_shortcut_data"
                java.lang.String[] r6 = r6.getStringArrayExtra(r2)
                if (r6 == 0) goto L5c
                kotlin.sequences.Sequence r6 = kotlin.collections.C9533b.m14286u(r6)
                if (r6 == 0) goto L5c
                r2 = 2
                kotlin.sequences.Sequence r6 = si.C12541j.m4895m(r6, r2)
                if (r6 == 0) goto L5c
                java.util.Iterator r6 = r6.iterator()
            L34:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5c
                java.lang.Object r2 = r6.next()
                java.util.List r2 = (java.util.List) r2
                r3 = 0
                java.lang.Object r3 = r2.get(r3)
                java.lang.String r3 = (java.lang.String) r3
                r4 = 1
                java.lang.Object r2 = r2.get(r4)
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r4 = "key"
                kotlin.jvm.internal.C9612q.m13918g(r3, r4)
                java.lang.String r4 = "value"
                kotlin.jvm.internal.C9612q.m13918g(r2, r4)
                r1.put(r3, r2)
                goto L34
            L5c:
                java.util.Map r6 = p304qf.C11886s.m6776b(r1)
                com.discord.shortcuts.ShortcutData r1 = new com.discord.shortcuts.ShortcutData
                r1.<init>(r0, r6)
                goto L67
            L66:
                r1 = 0
            L67:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.shortcuts.ShortcutData.Companion.getShortcutIntentData(android.content.Intent):com.discord.shortcuts.ShortcutData");
        }
    }

    public ShortcutData(String tag, Map<String, String> data) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(data, "data");
        this.tag = tag;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShortcutData copy$default(ShortcutData shortcutData, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shortcutData.tag;
        }
        if ((i & 2) != 0) {
            map = shortcutData.data;
        }
        return shortcutData.copy(str, map);
    }

    public final String component1() {
        return this.tag;
    }

    public final Map<String, String> component2() {
        return this.data;
    }

    public final ShortcutData copy(String tag, Map<String, String> data) {
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(data, "data");
        return new ShortcutData(tag, data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShortcutData) {
            ShortcutData shortcutData = (ShortcutData) obj;
            return C9612q.m13922c(this.tag, shortcutData.tag) && C9612q.m13922c(this.data, shortcutData.data);
        }
        return false;
    }

    public final Map<String, String> getData() {
        return this.data;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (this.tag.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        String str = this.tag;
        Map<String, String> map = this.data;
        return "ShortcutData(tag=" + str + ", data=" + map + ")";
    }
}

package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.internal.modules.AbstractC7987d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: io.sentry.android.core.internal.modules.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7754a extends AbstractC7987d {

    /* renamed from: d */
    private final Context f21233d;

    public C7754a(Context context, InterfaceC8040o0 interfaceC8040o0) {
        super(interfaceC8040o0);
        this.f21233d = context;
    }

    @Override // io.sentry.internal.modules.AbstractC7987d
    /* renamed from: b */
    protected Map<String, String> mo19092b() {
        TreeMap treeMap = new TreeMap();
        try {
            return m19095c(this.f21233d.getAssets().open("sentry-external-modules.txt"));
        } catch (FileNotFoundException unused) {
            this.f21663a.mo18135c(EnumC8021m4.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (IOException e) {
            this.f21663a.mo18136b(EnumC8021m4.ERROR, "Error extracting modules.", e);
            return treeMap;
        }
    }
}

package io.sentry.internal.modules;

import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: io.sentry.internal.modules.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC7987d implements InterfaceC7984b {

    /* renamed from: c */
    private static final Charset f21662c = Charset.forName("UTF-8");

    /* renamed from: a */
    protected final InterfaceC8040o0 f21663a;

    /* renamed from: b */
    private Map<String, String> f21664b = null;

    public AbstractC7987d(InterfaceC8040o0 interfaceC8040o0) {
        this.f21663a = interfaceC8040o0;
    }

    @Override // io.sentry.internal.modules.InterfaceC7984b
    /* renamed from: a */
    public Map<String, String> mo19094a() {
        Map<String, String> map = this.f21664b;
        if (map != null) {
            return map;
        }
        Map<String, String> mo19092b = mo19092b();
        this.f21664b = mo19092b;
        return mo19092b;
    }

    /* renamed from: b */
    protected abstract Map<String, String> mo19092b();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> m19095c(InputStream inputStream) {
        BufferedReader bufferedReader;
        TreeMap treeMap = new TreeMap();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f21662c));
        } catch (IOException e) {
            this.f21663a.mo18136b(EnumC8021m4.ERROR, "Error extracting modules.", e);
        } catch (RuntimeException e2) {
            this.f21663a.mo18137a(EnumC8021m4.ERROR, e2, "%s file is malformed.", "sentry-external-modules.txt");
        }
        try {
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                int lastIndexOf = readLine.lastIndexOf(58);
                treeMap.put(readLine.substring(0, lastIndexOf), readLine.substring(lastIndexOf + 1));
            }
            this.f21663a.mo18135c(EnumC8021m4.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
            bufferedReader.close();
            return treeMap;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}

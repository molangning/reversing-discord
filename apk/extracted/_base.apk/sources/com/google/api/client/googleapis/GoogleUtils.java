package com.google.api.client.googleapis;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class GoogleUtils {

    /* renamed from: a */
    public static final String f14222a;

    /* renamed from: b */
    public static final Integer f14223b;

    /* renamed from: c */
    public static final Integer f14224c;

    /* renamed from: d */
    public static final Integer f14225d;

    /* renamed from: e */
    static final Pattern f14226e;

    static {
        String m26450a = m26450a();
        f14222a = m26450a;
        Pattern compile = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)(-SNAPSHOT)?");
        f14226e = compile;
        Matcher matcher = compile.matcher(m26450a);
        matcher.find();
        f14223b = Integer.valueOf(Integer.parseInt(matcher.group(1)));
        f14224c = Integer.valueOf(Integer.parseInt(matcher.group(2)));
        f14225d = Integer.valueOf(Integer.parseInt(matcher.group(3)));
    }

    private GoogleUtils() {
    }

    /* renamed from: a */
    private static String m26450a() {
        String str = null;
        try {
            InputStream resourceAsStream = GoogleUtils.class.getResourceAsStream("google-api-client.properties");
            if (resourceAsStream != null) {
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                str = properties.getProperty("google-api-client.version");
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException unused) {
        }
        if (str == null) {
            return "unknown-version";
        }
        return str;
    }
}

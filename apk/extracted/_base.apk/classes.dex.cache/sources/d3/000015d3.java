package com.discord.client_info;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9654p;

@Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class ClientInfo$isProdBuild$2 extends AbstractC9614s implements Function0<Boolean> {
    public static final ClientInfo$isProdBuild$2 INSTANCE = new ClientInfo$isProdBuild$2();

    ClientInfo$isProdBuild$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        String str;
        boolean m13731M;
        String str2;
        boolean m13731M2;
        boolean z = false;
        if (!ClientInfo.INSTANCE.isDebugBuild()) {
            str = ClientInfo.flavor;
            if (str == null) {
                C9612q.m13900y("flavor");
                str = null;
            }
            m13731M = C9654p.m13731M(str, "beta", false, 2, null);
            if (!m13731M) {
                str2 = ClientInfo.flavor;
                if (str2 == null) {
                    C9612q.m13900y("flavor");
                    str2 = null;
                }
                m13731M2 = C9654p.m13731M(str2, "canary", false, 2, null);
                if (!m13731M2) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
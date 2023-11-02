package io.sentry.protocol;

import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class DebugImage implements InterfaceC8026n1 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    /* renamed from: io.sentry.protocol.DebugImage$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8059a implements InterfaceC7894d1<DebugImage> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public DebugImage mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            DebugImage debugImage = new DebugImage();
            c7993j1.m18097h();
            HashMap hashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                char c = 65535;
                switch (m18105R.hashCode()) {
                    case -1840639000:
                        if (m18105R.equals("debug_file")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1443345323:
                        if (m18105R.equals("image_addr")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1442803611:
                        if (m18105R.equals("image_size")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1127437170:
                        if (m18105R.equals("code_file")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3002454:
                        if (m18105R.equals("arch")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3575610:
                        if (m18105R.equals("type")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3601339:
                        if (m18105R.equals("uuid")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 547804807:
                        if (m18105R.equals("debug_id")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 941842605:
                        if (m18105R.equals("code_id")) {
                            c = '\b';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        debugImage.debugFile = c7993j1.m19061T0();
                        break;
                    case 1:
                        debugImage.imageAddr = c7993j1.m19061T0();
                        break;
                    case 2:
                        debugImage.imageSize = c7993j1.m19065P0();
                        break;
                    case 3:
                        debugImage.codeFile = c7993j1.m19061T0();
                        break;
                    case 4:
                        debugImage.arch = c7993j1.m19061T0();
                        break;
                    case 5:
                        debugImage.type = c7993j1.m19061T0();
                        break;
                    case 6:
                        debugImage.uuid = c7993j1.m19061T0();
                        break;
                    case 7:
                        debugImage.debugId = c7993j1.m19061T0();
                        break;
                    case '\b':
                        debugImage.codeId = c7993j1.m19061T0();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, hashMap, m18105R);
                        break;
                }
            }
            c7993j1.m18091q();
            debugImage.setUnknown(hashMap);
            return debugImage;
        }
    }

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.uuid != null) {
            interfaceC7919f2.mo18193e("uuid").mo18191g(this.uuid);
        }
        if (this.type != null) {
            interfaceC7919f2.mo18193e("type").mo18191g(this.type);
        }
        if (this.debugId != null) {
            interfaceC7919f2.mo18193e("debug_id").mo18191g(this.debugId);
        }
        if (this.debugFile != null) {
            interfaceC7919f2.mo18193e("debug_file").mo18191g(this.debugFile);
        }
        if (this.codeId != null) {
            interfaceC7919f2.mo18193e("code_id").mo18191g(this.codeId);
        }
        if (this.codeFile != null) {
            interfaceC7919f2.mo18193e("code_file").mo18191g(this.codeFile);
        }
        if (this.imageAddr != null) {
            interfaceC7919f2.mo18193e("image_addr").mo18191g(this.imageAddr);
        }
        if (this.imageSize != null) {
            interfaceC7919f2.mo18193e("image_size").mo18189i(this.imageSize);
        }
        if (this.arch != null) {
            interfaceC7919f2.mo18193e("arch").mo18191g(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC7919f2.mo18193e(str).mo18188j(interfaceC8040o0, this.unknown.get(str));
            }
        }
        interfaceC7919f2.mo18190h();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l) {
        this.imageSize = l;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j) {
        this.imageSize = Long.valueOf(j);
    }
}

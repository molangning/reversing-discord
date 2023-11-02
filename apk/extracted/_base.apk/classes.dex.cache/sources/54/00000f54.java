package com.discord.chat.bridge.botuikit;

import com.discord.serialization.IntEnum;
import com.discord.serialization.IntEnumSerializer;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import p470zi.InterfaceC14277f;
import pf.C11577n;
import pf.EnumC11580p;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002\u000e\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/chat/bridge/botuikit/ButtonStyle;", "", "Lcom/discord/serialization/IntEnum;", "serialNumber", "", "(Ljava/lang/String;II)V", "getSerialNumber", "()I", "UNKNOWN", "PRIMARY", "SECONDARY", "SUCCESS", "DANGER", "LINK", "Companion", "Serializer", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f(with = Serializer.class)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public enum ButtonStyle implements IntEnum {
    UNKNOWN(0),
    PRIMARY(1),
    SECONDARY(2),
    SUCCESS(3),
    DANGER(4),
    LINK(5);
    
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion = new Companion(null);
    private final int serialNumber;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/botuikit/ButtonStyle$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/ButtonStyle;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return ButtonStyle.$cachedSerializer$delegate;
        }

        public final KSerializer<ButtonStyle> serializer() {
            return (KSerializer) get$cachedSerializer$delegate().getValue();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m14357d2 = {"Lcom/discord/chat/bridge/botuikit/ButtonStyle$Serializer;", "Lcom/discord/serialization/IntEnumSerializer;", "Lcom/discord/chat/bridge/botuikit/ButtonStyle;", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Serializer extends IntEnumSerializer<ButtonStyle> {
        public static final Serializer INSTANCE = new Serializer();

        private Serializer() {
            super(C9591f0.m13969b(ButtonStyle.class), ButtonStyle.UNKNOWN);
        }
    }

    static {
        Lazy<KSerializer<Object>> m7600b;
        m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, ButtonStyle$Companion$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = m7600b;
    }

    ButtonStyle(int i) {
        this.serialNumber = i;
    }

    @Override // com.discord.serialization.IntEnum
    public int getSerialNumber() {
        return this.serialNumber;
    }
}
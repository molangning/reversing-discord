package io.sentry;

import io.sentry.clientreport.C7871b;
import io.sentry.protocol.C8114x;
import java.util.Locale;

/* renamed from: io.sentry.l4 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC8011l4 implements InterfaceC8026n1 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    Unknown("__unknown__");
    
    private final String itemType;

    /* renamed from: io.sentry.l4$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8012a implements InterfaceC7894d1<EnumC8011l4> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public EnumC8011l4 mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            return EnumC8011l4.valueOfLabel(c7993j1.m18101Y().toLowerCase(Locale.ROOT));
        }
    }

    EnumC8011l4(String str) {
        this.itemType = str;
    }

    public static EnumC8011l4 resolve(Object obj) {
        if (obj instanceof C7923f4) {
            return Event;
        }
        if (obj instanceof C8114x) {
            return Transaction;
        }
        if (obj instanceof C7836b5) {
            return Session;
        }
        if (obj instanceof C7871b) {
            return ClientReport;
        }
        return Attachment;
    }

    public static EnumC8011l4 valueOfLabel(String str) {
        EnumC8011l4[] values;
        for (EnumC8011l4 enumC8011l4 : values()) {
            if (enumC8011l4.itemType.equals(str)) {
                return enumC8011l4;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18191g(this.itemType);
    }
}
package com.discord.nearby;

import android.content.Context;
import ca.AbstractC2469b;
import ca.AbstractC2476h;
import ca.C2477i;
import ca.InterfaceC2471d;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.SubscribeOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p355ti.C12785a;
import p462z9.C14138a;

@Metadata(m14358d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\t*\u0001\u0015\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBC\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m14357d2 = {"Lcom/discord/nearby/NearbyManager;", "Lca/b;", "", "message", "", "setOutboundMessage", "Landroid/content/Context;", "context", "disableNearby", "enableNearby", "Lcom/google/android/gms/nearby/messages/Message;", "onFound", "onLost", "Lkotlin/Function1;", "onFoundUser", "Lkotlin/jvm/functions/Function1;", "onLostUser", "onError", "Lcom/google/android/gms/nearby/messages/SubscribeOptions;", "subscribeOptions", "Lcom/google/android/gms/nearby/messages/SubscribeOptions;", "com/discord/nearby/NearbyManager$statusCallback$1", "statusCallback", "Lcom/discord/nearby/NearbyManager$statusCallback$1;", "outboundMessage", "Lcom/google/android/gms/nearby/messages/Message;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "nearby_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class NearbyManager extends AbstractC2469b {
    public static final Companion Companion = new Companion(null);
    public static final String PERMISSION_DENIED = "1";
    private final Function1<String, Unit> onError;
    private final Function1<String, Unit> onFoundUser;
    private final Function1<String, Unit> onLostUser;
    private Message outboundMessage;
    private final NearbyManager$statusCallback$1 statusCallback;
    private final SubscribeOptions subscribeOptions;

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/nearby/NearbyManager$Companion;", "", "()V", "PERMISSION_DENIED", "", "nearby_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.discord.nearby.NearbyManager$statusCallback$1] */
    public NearbyManager(Function1<? super String, Unit> onFoundUser, Function1<? super String, Unit> onLostUser, Function1<? super String, Unit> onError) {
        C9612q.m13917h(onFoundUser, "onFoundUser");
        C9612q.m13917h(onLostUser, "onLostUser");
        C9612q.m13917h(onError, "onError");
        this.onFoundUser = onFoundUser;
        this.onLostUser = onLostUser;
        this.onError = onError;
        SubscribeOptions m28049a = new SubscribeOptions.C4670a().m28048b(C2477i.f6828r).m28049a();
        C9612q.m13918g(m28049a, "Builder()\n        .setSt…DEFAULT)\n        .build()");
        this.subscribeOptions = m28049a;
        this.statusCallback = new AbstractC2476h() { // from class: com.discord.nearby.NearbyManager$statusCallback$1
            @Override // ca.AbstractC2476h
            public void onPermissionChanged(boolean z) {
                Function1 function1;
                super.onPermissionChanged(z);
                if (!z) {
                    function1 = NearbyManager.this.onError;
                    function1.invoke(NearbyManager.PERMISSION_DENIED);
                }
            }
        };
    }

    public final void disableNearby(Context context) {
        C9612q.m13917h(context, "context");
        InterfaceC2471d m594a = C14138a.m594a(context);
        m594a.mo28019a(this.statusCallback);
        Message message = this.outboundMessage;
        if (message == null) {
            C9612q.m13900y("outboundMessage");
            message = null;
        }
        m594a.mo28017c(message);
        m594a.mo28015f(this);
    }

    public final void enableNearby(Context context) {
        C9612q.m13917h(context, "context");
        Message message = this.outboundMessage;
        if (message == null) {
            C9612q.m13900y("outboundMessage");
            message = null;
        }
        InterfaceC2471d m594a = C14138a.m594a(context);
        m594a.mo28016e(this.statusCallback);
        m594a.mo28018b(message);
        m594a.mo28014g(this, this.subscribeOptions);
    }

    @Override // ca.AbstractC2469b
    public void onFound(Message message) {
        C9612q.m13917h(message, "message");
        super.onFound(message);
        Function1<String, Unit> function1 = this.onFoundUser;
        byte[] m28054r = message.m28054r();
        C9612q.m13918g(m28054r, "message.content");
        function1.invoke(new String(m28054r, C12785a.f33142b));
    }

    @Override // ca.AbstractC2469b
    public void onLost(Message message) {
        C9612q.m13917h(message, "message");
        super.onLost(message);
        Function1<String, Unit> function1 = this.onLostUser;
        byte[] m28054r = message.m28054r();
        C9612q.m13918g(m28054r, "message.content");
        function1.invoke(new String(m28054r, C12785a.f33142b));
    }

    public final void setOutboundMessage(String message) {
        C9612q.m13917h(message, "message");
        byte[] bytes = message.getBytes(C12785a.f33142b);
        C9612q.m13918g(bytes, "this as java.lang.String).getBytes(charset)");
        this.outboundMessage = new Message(bytes);
    }
}
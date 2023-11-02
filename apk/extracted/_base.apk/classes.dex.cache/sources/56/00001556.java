package com.discord.chat.reactevents;

import com.discord.chat.bridge.MessageType;
import com.discord.chat.bridge.contentnode.ActorHook;
import com.discord.chat.bridge.contentnode.CommandOnClick;
import com.discord.chat.bridge.contentnode.HandleDelete;
import com.discord.chat.bridge.contentnode.HandleMessage;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.LinkContext;
import com.discord.chat.bridge.contentnode.MessageReference;
import com.discord.chat.bridge.contentnode.PinsOnClick;
import com.discord.chat.bridge.contentnode.RoleSubscriptionOnClick;
import com.discord.chat.bridge.contentnode.ThreadOnClick;
import com.discord.chat.bridge.contentnode.UserNameOnClick;
import com.discord.chat.bridge.contentnode.WebhookNameOnClick;
import com.discord.logging.Log;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.TouchesHelper;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001a\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006BB\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0002\u0010\rJ\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003JP\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\b\u0010%\u001a\u00020&H\u0016J\t\u0010'\u001a\u00020\bHÖ\u0001J\f\u0010(\u001a\u00020)*\u00020\fH\u0002R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapLinkData;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "Lcom/discord/primitives/MessageId;", "node", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "title", "", TouchesHelper.TARGET_KEY, "content", "context", "Lcom/discord/chat/bridge/contentnode/LinkContext;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContent", "()Ljava/lang/String;", "getContext", "()Lcom/discord/chat/bridge/contentnode/LinkContext;", "getMessageId-N_6c4I0", "Ljava/lang/String;", "getTarget", "getTitle", "component1", "component1-N_6c4I0", "component2", "component3", "component4", "component5", "copy", "copy-fCSJrew", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;)Lcom/discord/chat/reactevents/TapLinkData;", "equals", "", "other", "", "hashCode", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "toMap", "Lcom/facebook/react/bridge/WritableNativeMap;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TapLinkData implements ReactEvent {
    private final String content;
    private final LinkContext context;
    private final String messageId;
    private final String target;
    private final String title;

    public /* synthetic */ TapLinkData(String str, LinkContentNode linkContentNode, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, linkContentNode);
    }

    private TapLinkData(String str, String str2, String str3, String str4, LinkContext linkContext) {
        this.messageId = str;
        this.title = str2;
        this.target = str3;
        this.content = str4;
        this.context = linkContext;
    }

    public /* synthetic */ TapLinkData(String str, String str2, String str3, String str4, LinkContext linkContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, linkContext);
    }

    /* renamed from: copy-fCSJrew$default */
    public static /* synthetic */ TapLinkData m41865copyfCSJrew$default(TapLinkData tapLinkData, String str, String str2, String str3, String str4, LinkContext linkContext, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapLinkData.messageId;
        }
        if ((i & 2) != 0) {
            str2 = tapLinkData.title;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = tapLinkData.target;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = tapLinkData.content;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            linkContext = tapLinkData.context;
        }
        return tapLinkData.m41867copyfCSJrew(str, str5, str6, str7, linkContext);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final WritableNativeMap toMap(LinkContext linkContext) {
        String m42079toStringimpl;
        WritableNativeMap nativeMapOf = NativeMapExtensionsKt.nativeMapOf(new Pair[0]);
        String str = this.target;
        if (str != null) {
            switch (str.hashCode()) {
                case -1732468237:
                    if (str.equals("handleDelete")) {
                        HandleDelete handleDelete = linkContext.getHandleDelete();
                        if (handleDelete != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", handleDelete.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "message", NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("id", handleDelete.getMessage().m41482getId3Eiw7ao()), C11591x.m7577a("channel_id", ChannelId.m42054toStringimpl(handleDelete.getMessage().m41481getChannelIdo4g7jtM())), C11591x.m7577a("loggingName", handleDelete.getMessage().getLoggingName()), C11591x.m7577a("author", NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("username", handleDelete.getMessage().getAuthor().getUsername())))));
                            break;
                        }
                    }
                    break;
                case -1226627713:
                    if (str.equals("threadOnClick")) {
                        ThreadOnClick threadOnClick = linkContext.getThreadOnClick();
                        if (threadOnClick != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", threadOnClick.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "threadId", threadOnClick.getThreadId());
                            break;
                        }
                    }
                    break;
                case -1138120985:
                    if (str.equals("webhookNameOnClick")) {
                        WebhookNameOnClick webhookNameOnClick = linkContext.getWebhookNameOnClick();
                        if (webhookNameOnClick != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", webhookNameOnClick.getAction());
                            MessageReference messageReference = webhookNameOnClick.getMessageReference();
                            if (messageReference != null) {
                                WritableNativeMap nativeMapOf2 = NativeMapExtensionsKt.nativeMapOf(new Pair[0]);
                                NativeMapExtensionsKt.put(nativeMapOf2, "channel_id", ChannelId.m42054toStringimpl(messageReference.m41496getChannelIdo4g7jtM()));
                                GuildId m41497getGuildIdqOKuAAo = messageReference.m41497getGuildIdqOKuAAo();
                                if (m41497getGuildIdqOKuAAo != null) {
                                    NativeMapExtensionsKt.put(nativeMapOf2, "guild_id", GuildId.m42067toStringimpl(m41497getGuildIdqOKuAAo.m42069unboximpl()));
                                }
                                Unit unit = Unit.f25302a;
                                NativeMapExtensionsKt.put(nativeMapOf, "messageReference", nativeMapOf2);
                                break;
                            }
                        }
                    }
                    break;
                case -933189749:
                    if (str.equals("pinsOnClick")) {
                        PinsOnClick pinsOnClick = linkContext.getPinsOnClick();
                        if (pinsOnClick != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", pinsOnClick.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "messageChannelId", ChannelId.m42054toStringimpl(pinsOnClick.m41501getMessageChannelIdo4g7jtM()));
                            break;
                        }
                    }
                    break;
                case -932369101:
                    if (str.equals("usernameOnClick")) {
                        UserNameOnClick usernameOnClick = linkContext.getUsernameOnClick();
                        if (usernameOnClick != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", usernameOnClick.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "userId", UserId.m42118toStringimpl(usernameOnClick.m41515getUserIdre6GcUE()));
                            ChannelId m41514getMessageChannelIdqMVnFVQ = usernameOnClick.m41514getMessageChannelIdqMVnFVQ();
                            if (m41514getMessageChannelIdqMVnFVQ != null) {
                                NativeMapExtensionsKt.put(nativeMapOf, "messageChannelId", ChannelId.m42054toStringimpl(m41514getMessageChannelIdqMVnFVQ.m42056unboximpl()));
                                break;
                            }
                        }
                    }
                    break;
                case -86972746:
                    if (str.equals("roleSubscriptionOnClick")) {
                        RoleSubscriptionOnClick roleSubscriptionOnClick = linkContext.getRoleSubscriptionOnClick();
                        if (roleSubscriptionOnClick != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", roleSubscriptionOnClick.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "guildId", roleSubscriptionOnClick.getGuildId());
                            NativeMapExtensionsKt.put(nativeMapOf, "channelId", roleSubscriptionOnClick.getChannelId());
                            NativeMapExtensionsKt.put(nativeMapOf, "messageId", roleSubscriptionOnClick.getMessageId());
                            NativeMapExtensionsKt.put(nativeMapOf, "roleSubscriptionListingId", roleSubscriptionOnClick.getRoleSubscriptionListingId());
                            break;
                        }
                    }
                    break;
                case 371724472:
                    if (str.equals("actorHook")) {
                        ActorHook actorHook = linkContext.getActorHook();
                        if (actorHook != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", actorHook.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "userId", UserId.m42118toStringimpl(actorHook.m41461getUserIdre6GcUE()));
                            break;
                        }
                    }
                    break;
                case 1318937603:
                    if (str.equals("otherUsernameOnClick")) {
                        UserNameOnClick otherUsernameOnClick = linkContext.getOtherUsernameOnClick();
                        if (otherUsernameOnClick != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", otherUsernameOnClick.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "userId", UserId.m42118toStringimpl(otherUsernameOnClick.m41515getUserIdre6GcUE()));
                            ChannelId m41514getMessageChannelIdqMVnFVQ2 = otherUsernameOnClick.m41514getMessageChannelIdqMVnFVQ();
                            if (m41514getMessageChannelIdqMVnFVQ2 != null) {
                                NativeMapExtensionsKt.put(nativeMapOf, "messageChannelId", ChannelId.m42054toStringimpl(m41514getMessageChannelIdqMVnFVQ2.m42056unboximpl()));
                                break;
                            }
                        }
                    }
                    break;
                case 1532521663:
                    if (str.equals("handleMessage")) {
                        HandleMessage handleMessage = linkContext.getHandleMessage();
                        if (handleMessage != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", handleMessage.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "message", NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("id", handleMessage.getMessage().m41489getId3Eiw7ao()), C11591x.m7577a("channel_id", ChannelId.m42054toStringimpl(handleMessage.getMessage().m41488getChannelIdo4g7jtM())), C11591x.m7577a("loggingName", handleMessage.getMessage().getLoggingName())));
                            NativeMapExtensionsKt.put(nativeMapOf, "notificationType", handleMessage.getNotificationType());
                            break;
                        }
                    }
                    break;
                case 2071245203:
                    if (str.equals("commandNameOnClick")) {
                        CommandOnClick commandNameOnClick = linkContext.getCommandNameOnClick();
                        if (commandNameOnClick != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", commandNameOnClick.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "userId", String.valueOf(commandNameOnClick.m41475getUserIdwUX8bhU()));
                            MessageType messageType = commandNameOnClick.getMessageType();
                            if (messageType != null) {
                                NativeMapExtensionsKt.put(nativeMapOf, "messageType", Integer.valueOf(messageType.getSerialNumber()));
                            }
                            String m41474getMessageIdN_6c4I0 = commandNameOnClick.m41474getMessageIdN_6c4I0();
                            if (m41474getMessageIdN_6c4I0 == null) {
                                m42079toStringimpl = "null";
                            } else {
                                m42079toStringimpl = MessageId.m42079toStringimpl(m41474getMessageIdN_6c4I0);
                            }
                            NativeMapExtensionsKt.put(nativeMapOf, "messageId", m42079toStringimpl);
                            NativeMapExtensionsKt.put(nativeMapOf, "applicationUserId", String.valueOf(commandNameOnClick.m41472getApplicationUserIdwUX8bhU()));
                            NativeMapExtensionsKt.put(nativeMapOf, "messageChannelId", String.valueOf(commandNameOnClick.m41473getMessageChannelIdqMVnFVQ()));
                            break;
                        }
                    }
                    break;
            }
            return nativeMapOf;
        }
        Log log = Log.INSTANCE;
        String str2 = this.target;
        Log.e$default(log, "TapLink", "Missing target type in context: " + str2, (Throwable) null, 4, (Object) null);
        return nativeMapOf;
    }

    /* renamed from: component1-N_6c4I0 */
    public final String m41866component1N_6c4I0() {
        return this.messageId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.target;
    }

    public final String component4() {
        return this.content;
    }

    public final LinkContext component5() {
        return this.context;
    }

    /* renamed from: copy-fCSJrew */
    public final TapLinkData m41867copyfCSJrew(String str, String str2, String str3, String content, LinkContext linkContext) {
        C9612q.m13917h(content, "content");
        return new TapLinkData(str, str2, str3, content, linkContext, null);
    }

    public boolean equals(Object obj) {
        boolean m42077equalsimpl0;
        if (this == obj) {
            return true;
        }
        if (obj instanceof TapLinkData) {
            TapLinkData tapLinkData = (TapLinkData) obj;
            String str = this.messageId;
            String str2 = tapLinkData.messageId;
            if (str == null) {
                if (str2 == null) {
                    m42077equalsimpl0 = true;
                }
                m42077equalsimpl0 = false;
            } else {
                if (str2 != null) {
                    m42077equalsimpl0 = MessageId.m42077equalsimpl0(str, str2);
                }
                m42077equalsimpl0 = false;
            }
            return m42077equalsimpl0 && C9612q.m13922c(this.title, tapLinkData.title) && C9612q.m13922c(this.target, tapLinkData.target) && C9612q.m13922c(this.content, tapLinkData.content) && C9612q.m13922c(this.context, tapLinkData.context);
        }
        return false;
    }

    public final String getContent() {
        return this.content;
    }

    public final LinkContext getContext() {
        return this.context;
    }

    /* renamed from: getMessageId-N_6c4I0 */
    public final String m41868getMessageIdN_6c4I0() {
        return this.messageId;
    }

    public final String getTarget() {
        return this.target;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.messageId;
        int m42078hashCodeimpl = (str == null ? 0 : MessageId.m42078hashCodeimpl(str)) * 31;
        String str2 = this.title;
        int hashCode = (m42078hashCodeimpl + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.target;
        int hashCode2 = (((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31) + this.content.hashCode()) * 31;
        LinkContext linkContext = this.context;
        return hashCode2 + (linkContext != null ? linkContext.hashCode() : 0);
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        String m42079toStringimpl;
        WritableNativeMap nativeMapOf;
        LinkContext linkContext = this.context;
        if (linkContext == null || (nativeMapOf = toMap(linkContext)) == null) {
            Pair[] pairArr = new Pair[3];
            String str = this.messageId;
            if (str == null) {
                m42079toStringimpl = "null";
            } else {
                m42079toStringimpl = MessageId.m42079toStringimpl(str);
            }
            pairArr[0] = C11591x.m7577a("messageId", m42079toStringimpl);
            pairArr[1] = C11591x.m7577a("url", this.target);
            pairArr[2] = C11591x.m7577a("node", NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("title", this.title), C11591x.m7577a(TouchesHelper.TARGET_KEY, this.target), C11591x.m7577a("content", this.content)));
            nativeMapOf = NativeMapExtensionsKt.nativeMapOf(pairArr);
        }
        return NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("data", nativeMapOf));
    }

    public String toString() {
        String str = this.messageId;
        String m42079toStringimpl = str == null ? "null" : MessageId.m42079toStringimpl(str);
        String str2 = this.title;
        String str3 = this.target;
        String str4 = this.content;
        LinkContext linkContext = this.context;
        return "TapLinkData(messageId=" + m42079toStringimpl + ", title=" + str2 + ", target=" + str3 + ", content=" + str4 + ", context=" + linkContext + ")";
    }

    public /* synthetic */ TapLinkData(String str, String str2, String str3, String str4, LinkContext linkContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : linkContext, null);
    }

    private TapLinkData(String str, LinkContentNode linkContentNode) {
        this(str, null, linkContentNode.getTarget(), linkContentNode.getTextContent(), linkContentNode.getContext(), 2, null);
    }
}
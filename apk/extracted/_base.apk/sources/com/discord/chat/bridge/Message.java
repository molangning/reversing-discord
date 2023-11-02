package com.discord.chat.bridge;

import androidx.recyclerview.widget.RecyclerView;
import co.discord.media_engine.C2689b;
import com.discord.chat.bridge.MessageState;
import com.discord.chat.bridge.MessageType;
import com.discord.chat.bridge.activityinviteembed.ActivityInviteEmbed;
import com.discord.chat.bridge.activityinviteembed.ActivityInviteEmbed$$serializer;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.attachment.Attachment$$serializer;
import com.discord.chat.bridge.automod.AutoModerationContext;
import com.discord.chat.bridge.automod.AutoModerationContext$$serializer;
import com.discord.chat.bridge.botuikit.Component;
import com.discord.chat.bridge.botuikit.ComponentSerializer;
import com.discord.chat.bridge.channelprompt.ChannelPromptData;
import com.discord.chat.bridge.channelprompt.ChannelPromptData$$serializer;
import com.discord.chat.bridge.codedlinks.CodedLinkEmbed;
import com.discord.chat.bridge.codedlinks.CodedLinkSerializer;
import com.discord.chat.bridge.connectionsroletag.ConnectionsRoleTag;
import com.discord.chat.bridge.connectionsroletag.ConnectionsRoleTag$$serializer;
import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.embed.Embed$$serializer;
import com.discord.chat.bridge.ephemeral.EphemeralIndication;
import com.discord.chat.bridge.ephemeral.EphemeralIndication$$serializer;
import com.discord.chat.bridge.executedcommand.ExecutedCommand;
import com.discord.chat.bridge.executedcommand.ExecutedCommand$$serializer;
import com.discord.chat.bridge.feedback.SurveyIndication;
import com.discord.chat.bridge.feedback.SurveyIndication$$serializer;
import com.discord.chat.bridge.forums.ForumPostActions;
import com.discord.chat.bridge.forums.ForumPostActions$$serializer;
import com.discord.chat.bridge.gift.GiftEmbed;
import com.discord.chat.bridge.gift.GiftEmbedSerializer;
import com.discord.chat.bridge.interaction.InteractionStatus;
import com.discord.chat.bridge.interaction.InteractionStatus$$serializer;
import com.discord.chat.bridge.policynotice.SafetyPolicyNoticeEmbed;
import com.discord.chat.bridge.policynotice.SafetyPolicyNoticeEmbed$$serializer;
import com.discord.chat.bridge.polls.PollData;
import com.discord.chat.bridge.polls.PollData$$serializer;
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed;
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed$$serializer;
import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.reaction.MessageReaction$$serializer;
import com.discord.chat.bridge.referencedmessage.ReferencedMessage;
import com.discord.chat.bridge.referencedmessage.ReferencedMessageSerializer;
import com.discord.chat.bridge.roleicons.RoleIcon;
import com.discord.chat.bridge.roleicons.RoleIcon$$serializer;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.bridge.sticker.Sticker$$serializer;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.discord.chat.bridge.threads.ThreadEmbed;
import com.discord.chat.bridge.threads.ThreadEmbed$$serializer;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p014aj.C0213a;
import p045cj.C2560a2;
import p045cj.C2578e0;
import p045cj.C2581f;
import p045cj.C2590h;
import p045cj.C2615m0;
import p045cj.C2620n1;
import p045cj.C2649w0;
import p470zi.InterfaceC14277f;
import pf.C11577n;

@Metadata(m14358d1 = {"\u0000\u009d\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\bÌ\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 Î\u00022\u00020\u0001:\u0004Í\u0002Î\u0002BÜ\u0006\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$\u0012\b\u0010/\u001a\u0004\u0018\u00010\u001e\u0012\u0010\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u00010$\u0012\u000e\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010$\u0012\b\u00104\u001a\u0004\u0018\u000105\u0012\b\u00106\u001a\u0004\u0018\u000107\u0012\b\u00108\u001a\u0004\u0018\u000109\u0012\u0006\u0010:\u001a\u00020\u001e\u0012\b\u0010;\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010<\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010=\u001a\u0004\u0018\u00010>\u0012\b\u0010?\u001a\u0004\u0018\u00010@\u0012\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010$\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010D\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010F\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010J\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010K\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010L\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010N\u001a\u0004\u0018\u00010O\u0012\b\u0010P\u001a\u0004\u0018\u00010Q\u0012\b\u0010R\u001a\u0004\u0018\u00010S\u0012\b\u0010T\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010U\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010V\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010W\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010X\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010Y\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$\u0012\b\u0010[\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\\\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010]\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010^\u001a\u0004\u0018\u000103\u0012\b\u0010_\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010`\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010a\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010b\u001a\u0004\u0018\u00010c\u0012\u0006\u0010d\u001a\u00020\u001e\u0012\b\u0010e\u001a\u0004\u0018\u00010f\u0012\b\u0010g\u001a\u0004\u0018\u00010h\u0012\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020j\u0018\u00010$\u0012\b\u0010k\u001a\u0004\u0018\u00010j\u0012\b\u0010l\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010m\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010$\u0012\b\u0010o\u001a\u0004\u0018\u00010p\u0012\b\u0010q\u001a\u0004\u0018\u00010r\u0012\b\u0010s\u001a\u0004\u0018\u00010t\u0012\b\u0010u\u001a\u0004\u0018\u00010vø\u0001\u0000¢\u0006\u0002\u0010wB¾\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001e\u0012\u0012\b\u0002\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u00010$\u0012\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010$\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000109\u0012\u0006\u0010:\u001a\u00020\u001e\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\u0010\b\u0002\u0010A\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010$\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010O\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010Q\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010S\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010c\u0012\b\b\u0002\u0010d\u001a\u00020\u001e\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u00010f\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010h\u0012\u0010\b\u0002\u0010i\u001a\n\u0012\u0004\u0012\u00020j\u0018\u00010$\u0012\n\b\u0002\u0010k\u001a\u0004\u0018\u00010j\u0012\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010m\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010$\u0012\n\b\u0002\u0010o\u001a\u0004\u0018\u00010p\u0012\n\b\u0002\u0010q\u001a\u0004\u0018\u00010r\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010tø\u0001\u0000¢\u0006\u0002\u0010xJ\n\u0010ì\u0001\u001a\u00020\u0007HÆ\u0003J\u0011\u0010í\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010î\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010ï\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010ð\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u0097\u0001J\u0012\u0010ñ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u0097\u0001J\n\u0010ò\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010ó\u0001\u001a\u00020\u001eHÆ\u0003J\u0012\u0010ô\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u0097\u0001J\u0012\u0010õ\u0001\u001a\u0004\u0018\u00010\u0016HÀ\u0003¢\u0006\u0003\bö\u0001J\f\u0010÷\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u001c\u0010ø\u0001\u001a\u00020\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bù\u0001\u0010\u008b\u0001J\u0012\u0010ú\u0001\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$HÆ\u0003J\u0012\u0010û\u0001\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$HÆ\u0003J\u0011\u0010ü\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010|J\f\u0010ý\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\u0012\u0010þ\u0001\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$HÆ\u0003J\u0012\u0010ÿ\u0001\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$HÆ\u0003J\u0012\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\u0014\u0010\u0081\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u00010$HÆ\u0003J\u0012\u0010\u0082\u0002\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010$HÆ\u0003J\f\u0010\u0083\u0002\u001a\u0004\u0018\u000105HÆ\u0003J\u001e\u0010\u0084\u0002\u001a\u0004\u0018\u00010\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0085\u0002\u0010\u008b\u0001J\f\u0010\u0086\u0002\u001a\u0004\u0018\u000107HÆ\u0003J\f\u0010\u0087\u0002\u001a\u0004\u0018\u000109HÆ\u0003J\n\u0010\u0088\u0002\u001a\u00020\u001eHÆ\u0003J\u0012\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\u0012\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\f\u0010\u008b\u0002\u001a\u0004\u0018\u00010>HÆ\u0003J\f\u0010\u008c\u0002\u001a\u0004\u0018\u00010@HÆ\u0003J\u0012\u0010\u008d\u0002\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010$HÆ\u0003J\f\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\u001c\u0010\u0090\u0002\u001a\u00020\fHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0091\u0002\u0010\u0091\u0001J\f\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\u0012\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u0097\u0001J\u0012\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u0097\u0001J\f\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u0097\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\u0012\u0010\u0099\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u0097\u0001J\u0012\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u0097\u0001J\f\u0010\u009b\u0002\u001a\u0004\u0018\u00010OHÆ\u0003J\u001b\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u000eHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0003\b\u009d\u0002J\f\u0010\u009e\u0002\u001a\u0004\u0018\u00010QHÆ\u0003J\f\u0010\u009f\u0002\u001a\u0004\u0018\u00010SHÆ\u0003J\u0012\u0010 \u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\u0012\u0010¡\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\u0012\u0010¢\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\f\u0010£\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010¤\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010¥\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010¦\u0002\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$HÆ\u0003J\u0012\u0010§\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\f\u0010¨\u0002\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0012\u0010©\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\u0012\u0010ª\u0002\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0003\u0010À\u0001J\f\u0010«\u0002\u001a\u0004\u0018\u000103HÆ\u0003J\f\u0010¬\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010®\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\f\u0010¯\u0002\u001a\u0004\u0018\u00010cHÆ\u0003J\n\u0010°\u0002\u001a\u00020\u001eHÆ\u0003J\f\u0010±\u0002\u001a\u0004\u0018\u00010fHÆ\u0003J\f\u0010²\u0002\u001a\u0004\u0018\u00010hHÆ\u0003J\u001b\u0010³\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0003\b´\u0002J\u0012\u0010µ\u0002\u001a\n\u0012\u0004\u0012\u00020j\u0018\u00010$HÆ\u0003J\f\u0010¶\u0002\u001a\u0004\u0018\u00010jHÆ\u0003J\u0012\u0010·\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u0097\u0001J\u0012\u0010¸\u0002\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010$HÆ\u0003J\f\u0010¹\u0002\u001a\u0004\u0018\u00010pHÆ\u0003J\f\u0010º\u0002\u001a\u0004\u0018\u00010rHÆ\u0003J\f\u0010»\u0002\u001a\u0004\u0018\u00010tHÆ\u0003J\n\u0010¼\u0002\u001a\u00020\u0014HÆ\u0003J\f\u0010½\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J×\u0007\u0010¾\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001e2\u0012\b\u0002\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u00010$2\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010$2\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\n\b\u0002\u00108\u001a\u0004\u0018\u0001092\b\b\u0002\u0010:\u001a\u00020\u001e2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\u0010\b\u0002\u0010A\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010$2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010N\u001a\u0004\u0018\u00010O2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010Q2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010S2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010^\u001a\u0004\u0018\u0001032\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010c2\b\b\u0002\u0010d\u001a\u00020\u001e2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010f2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010h2\u0010\b\u0002\u0010i\u001a\n\u0012\u0004\u0012\u00020j\u0018\u00010$2\n\b\u0002\u0010k\u001a\u0004\u0018\u00010j2\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010m\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010$2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010p2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010r2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010tHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b¿\u0002\u0010À\u0002J\u0016\u0010Á\u0002\u001a\u00020\u001e2\n\u0010Â\u0002\u001a\u0005\u0018\u00010Ã\u0002HÖ\u0003J\n\u0010Ä\u0002\u001a\u00020\u0003HÖ\u0001J\n\u0010Å\u0002\u001a\u00020\u0016HÖ\u0001J(\u0010Æ\u0002\u001a\u00030Ç\u00022\u0007\u0010È\u0002\u001a\u00020\u00002\b\u0010É\u0002\u001a\u00030Ê\u00022\b\u0010Ë\u0002\u001a\u00030Ì\u0002HÇ\u0001R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010}\u0012\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u0013\u0010b\u001a\u0004\u0018\u00010c¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR\u0018\u0010<\u001a\u0004\u0018\u00010\u001e¢\u0006\r\n\u0003\u0010\u0082\u0001\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$¢\u0006\n\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010(\u001a\u0004\u0018\u00010\u0018¢\u0006\u000b\n\u0002\u0010}\u001a\u0005\b\u0085\u0001\u0010|R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0015\u0010g\u001a\u0004\u0018\u00010h¢\u0006\n\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0015\u0010\"\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R!\u0010!\u001a\u0004\u0018\u00010\u00168\u0000X\u0081\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u008c\u0001\u0010z\u001a\u0006\b\u008d\u0001\u0010\u008b\u0001R\u001b\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$¢\u0006\n\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u0084\u0001R\u0015\u0010`\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u008b\u0001R\u001f\u0010\u000b\u001a\u00020\fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0003\u0010\u0092\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0015\u0010o\u001a\u0004\u0018\u00010p¢\u0006\n\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001d\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u00010$¢\u0006\n\n\u0000\u001a\u0006\b\u0095\u0001\u0010\u0084\u0001R\u0018\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u0098\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010D\u001a\u0004\u0018\u00010\u001e¢\u0006\r\n\u0003\u0010\u0082\u0001\u001a\u0006\b\u0099\u0001\u0010\u0081\u0001R\u001b\u0010A\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010$¢\u0006\n\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u0084\u0001R\u0015\u00106\u001a\u0004\u0018\u000107¢\u0006\n\n\u0000\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\"\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00038FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b\u009e\u0001\u0010\u0097\u0001R\u0015\u0010)\u001a\u0004\u0018\u00010*¢\u0006\n\n\u0000\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0015\u0010Y\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\b£\u0001\u0010\u008b\u0001R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\b¤\u0001\u0010\u008b\u0001R\u001b\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$¢\u0006\n\n\u0000\u001a\u0006\b¥\u0001\u0010\u0084\u0001R\u0015\u0010N\u001a\u0004\u0018\u00010O¢\u0006\n\n\u0000\u001a\u0006\b¦\u0001\u0010§\u0001R\u0015\u0010?\u001a\u0004\u0018\u00010@¢\u0006\n\n\u0000\u001a\u0006\b¨\u0001\u0010©\u0001R\u0013\u0010\u0013\u001a\u00020\u0014¢\u0006\n\n\u0000\u001a\u0006\bª\u0001\u0010\u0091\u0001R\u0018\u0010;\u001a\u0004\u0018\u00010\u001e¢\u0006\r\n\u0003\u0010\u0082\u0001\u001a\u0006\b«\u0001\u0010\u0081\u0001R\u001b\u0010i\u001a\n\u0012\u0004\u0012\u00020j\u0018\u00010$¢\u0006\n\n\u0000\u001a\u0006\b¬\u0001\u0010\u0084\u0001R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0000\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u001f\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0003\u0010°\u0001\u001a\u0006\b¯\u0001\u0010\u008b\u0001R\u0015\u0010R\u001a\u0004\u0018\u00010S¢\u0006\n\n\u0000\u001a\u0006\b±\u0001\u0010²\u0001R\u0017\u0010[\u001a\u0004\u0018\u00010\u001e¢\u0006\f\n\u0003\u0010\u0082\u0001\u001a\u0005\b[\u0010\u0081\u0001R\u0017\u0010V\u001a\u0004\u0018\u00010\u001e¢\u0006\f\n\u0003\u0010\u0082\u0001\u001a\u0005\bV\u0010\u0081\u0001R\u0012\u0010d\u001a\u00020\u001e¢\u0006\t\n\u0000\u001a\u0005\bd\u0010³\u0001R\u0013\u0010:\u001a\u00020\u001e¢\u0006\n\n\u0000\u001a\u0006\b´\u0001\u0010³\u0001R\u0018\u0010\\\u001a\u0004\u0018\u00010\u001e¢\u0006\r\n\u0003\u0010\u0082\u0001\u001a\u0006\bµ\u0001\u0010\u0081\u0001R!\u0010\n\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0003\u0010°\u0001\u001a\u0006\b¶\u0001\u0010\u008b\u0001R\u0015\u0010W\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\b·\u0001\u0010\u008b\u0001R\u0015\u0010J\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\b¸\u0001\u0010\u008b\u0001R\u0015\u0010s\u001a\u0004\u0018\u00010t¢\u0006\n\n\u0000\u001a\u0006\b¹\u0001\u0010º\u0001R\u0015\u0010e\u001a\u0004\u0018\u00010f¢\u0006\n\n\u0000\u001a\u0006\b»\u0001\u0010¼\u0001R\u001b\u0010m\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010$¢\u0006\n\n\u0000\u001a\u0006\b½\u0001\u0010\u0084\u0001R\u001b\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$¢\u0006\n\n\u0000\u001a\u0006\b¾\u0001\u0010\u0084\u0001R\u0018\u0010]\u001a\u0004\u0018\u00010\u0014¢\u0006\r\n\u0003\u0010Á\u0001\u001a\u0006\b¿\u0001\u0010À\u0001R\u001b\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$¢\u0006\n\n\u0000\u001a\u0006\bÂ\u0001\u0010\u0084\u0001R\u0015\u0010=\u001a\u0004\u0018\u00010>¢\u0006\n\n\u0000\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0015\u0010k\u001a\u0004\u0018\u00010j¢\u0006\n\n\u0000\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u0018\u0010M\u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u0098\u0001\u001a\u0006\bÇ\u0001\u0010\u0097\u0001R\u0018\u0010L\u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u0098\u0001\u001a\u0006\bÈ\u0001\u0010\u0097\u0001R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u0098\u0001\u001a\u0006\bÉ\u0001\u0010\u0097\u0001R\u0015\u00104\u001a\u0004\u0018\u000105¢\u0006\n\n\u0000\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u0015\u0010q\u001a\u0004\u0018\u00010r¢\u0006\n\n\u0000\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u0013\u0010\u001d\u001a\u00020\u001e¢\u0006\n\n\u0000\u001a\u0006\bÎ\u0001\u0010³\u0001R\u0013\u0010\u001f\u001a\u00020\u001e¢\u0006\n\n\u0000\u001a\u0006\bÏ\u0001\u0010³\u0001R\u0018\u0010a\u001a\u0004\u0018\u00010\u001e¢\u0006\r\n\u0003\u0010\u0082\u0001\u001a\u0006\bÐ\u0001\u0010\u0081\u0001R\u0018\u0010K\u001a\u0004\u0018\u00010\u001e¢\u0006\r\n\u0003\u0010\u0082\u0001\u001a\u0006\bÑ\u0001\u0010\u0081\u0001R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0000\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0015\u0010^\u001a\u0004\u0018\u000103¢\u0006\n\n\u0000\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0015\u0010_\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÖ\u0001\u0010\u008b\u0001R\u001b\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010$¢\u0006\n\n\u0000\u001a\u0006\b×\u0001\u0010\u0084\u0001R\u0015\u0010P\u001a\u0004\u0018\u00010Q¢\u0006\n\n\u0000\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u0018\u0010H\u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u0098\u0001\u001a\u0006\bÚ\u0001\u0010\u0097\u0001R\u0015\u0010E\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÛ\u0001\u0010\u008b\u0001R\u0018\u0010G\u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u0098\u0001\u001a\u0006\bÜ\u0001\u0010\u0097\u0001R\u0015\u0010I\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÝ\u0001\u0010\u008b\u0001R\u0018\u0010F\u001a\u0004\u0018\u00010\u001e¢\u0006\r\n\u0003\u0010\u0082\u0001\u001a\u0006\bÞ\u0001\u0010\u0081\u0001R\u0015\u00108\u001a\u0004\u0018\u000109¢\u0006\n\n\u0000\u001a\u0006\bß\u0001\u0010à\u0001R\u0015\u0010C\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bá\u0001\u0010\u008b\u0001R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bâ\u0001\u0010\u008b\u0001R\u0015\u0010X\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bã\u0001\u0010\u008b\u0001R\u0018\u0010l\u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u0098\u0001\u001a\u0006\bä\u0001\u0010\u0097\u0001R\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0000\u001a\u0006\bå\u0001\u0010æ\u0001R\u0018\u0010/\u001a\u0004\u0018\u00010\u001e¢\u0006\r\n\u0003\u0010\u0082\u0001\u001a\u0006\bç\u0001\u0010\u0081\u0001R\u0018\u0010T\u001a\u0004\u0018\u00010\u001e¢\u0006\r\n\u0003\u0010\u0082\u0001\u001a\u0006\bè\u0001\u0010\u0081\u0001R\u0018\u0010U\u001a\u0004\u0018\u00010\u001e¢\u0006\r\n\u0003\u0010\u0082\u0001\u001a\u0006\bé\u0001\u0010\u0081\u0001R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bê\u0001\u0010\u008b\u0001R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u0098\u0001\u001a\u0006\bë\u0001\u0010\u0097\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ï\u0002"}, m14357d2 = {"Lcom/discord/chat/bridge/Message;", "Lcom/discord/chat/bridge/MessageBase;", "seen1", "", "seen2", "seen3", "type", "Lcom/discord/chat/bridge/MessageType;", "id", "Lcom/discord/primitives/MessageId;", "nonce", "channelId", "Lcom/discord/primitives/ChannelId;", "guildId", "Lcom/discord/primitives/GuildId;", "state", "Lcom/discord/chat/bridge/MessageState;", "authorId", "Lcom/discord/primitives/UserId;", "flags", "", "edited", "", "_constrainedWidth", "", "timestamp", "username", "usernameColor", "roleColor", "shouldShowRoleDot", "", "shouldShowRoleOnName", "colorString", "avatarURL", "avatarDecorationURL", "embeds", "", "Lcom/discord/chat/bridge/embed/Embed;", "attachments", "Lcom/discord/chat/bridge/attachment/Attachment;", "attachmentsOpacity", "content", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "progress", "Lcom/discord/chat/bridge/UploadProgress;", "reactions", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "useAddBurstReaction", "codedLinks", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "stickers", "Lcom/discord/chat/bridge/sticker/Sticker;", "roleIcon", "Lcom/discord/chat/bridge/roleicons/RoleIcon;", "connectionsRoleTag", "Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;", "threadEmbed", "Lcom/discord/chat/bridge/threads/ThreadEmbed;", "mentioned", "gifAutoPlay", "animateEmoji", "referencedMessage", "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;", "executedCommand", "Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;", "components", "Lcom/discord/chat/bridge/botuikit/Component;", "threadStarterMessageHeader", "communicationDisabled", "tagText", "tagVerified", "tagTextColor", "tagBackgroundColor", "tagType", "opTagText", "showRemixButton", "remixButtonIconColor", "remixButtonBackgroundColor", "ephemeralIndication", "Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "surveyIndication", "Lcom/discord/chat/bridge/feedback/SurveyIndication;", "interactionStatus", "Lcom/discord/chat/bridge/interaction/InteractionStatus;", "useAttachmentGridLayout", "useAttachmentUploadPreview", "isCurrentUserMessageAuthor", "obscureLearnMoreLabel", "title", "description", "avatarURLs", "isCallActive", "missed", "rawMilliseconds", "sticker", "stickerLabel", "buttonLabel", "showInviteToSpeakButton", "activityInviteEmbed", "Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;", "isFirstForumPostMessage", "postActions", "Lcom/discord/chat/bridge/forums/ForumPostActions;", "autoModerationContext", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "giftCodes", "Lcom/discord/chat/bridge/gift/GiftEmbed;", "referralTrialOffer", "totalMonthsSubscribed", "postPreviewEmbeds", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "channelPromptData", "Lcom/discord/chat/bridge/channelprompt/ChannelPromptData;", "safetyPolicyNoticeEmbed", "Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed;", "pollData", "Lcom/discord/chat/bridge/polls/PollData;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/util/List;Lcom/discord/chat/bridge/channelprompt/ChannelPromptData;Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed;Lcom/discord/chat/bridge/polls/PollData;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/util/List;Lcom/discord/chat/bridge/channelprompt/ChannelPromptData;Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed;Lcom/discord/chat/bridge/polls/PollData;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "get_constrainedWidth$annotations", "()V", "get_constrainedWidth", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getActivityInviteEmbed", "()Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;", "getAnimateEmoji", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAttachments", "()Ljava/util/List;", "getAttachmentsOpacity", "getAuthorId-wUX8bhU", "()Lcom/discord/primitives/UserId;", "getAutoModerationContext", "()Lcom/discord/chat/bridge/automod/AutoModerationContext;", "getAvatarDecorationURL", "()Ljava/lang/String;", "getAvatarURL$chat_release$annotations", "getAvatarURL$chat_release", "getAvatarURLs", "getButtonLabel", "getChannelId-o4g7jtM", "()J", "J", "getChannelPromptData", "()Lcom/discord/chat/bridge/channelprompt/ChannelPromptData;", "getCodedLinks", "getColorString", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCommunicationDisabled", "getComponents", "getConnectionsRoleTag", "()Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;", "constrainedWidth", "getConstrainedWidth", "constrainedWidth$delegate", "Lkotlin/Lazy;", "getContent", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getDescription", "getEdited", "getEmbeds", "getEphemeralIndication", "()Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "getExecutedCommand", "()Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;", "getFlags", "getGifAutoPlay", "getGiftCodes", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "getId-3Eiw7ao", "Ljava/lang/String;", "getInteractionStatus", "()Lcom/discord/chat/bridge/interaction/InteractionStatus;", "()Z", "getMentioned", "getMissed", "getNonce-N_6c4I0", "getObscureLearnMoreLabel", "getOpTagText", "getPollData", "()Lcom/discord/chat/bridge/polls/PollData;", "getPostActions", "()Lcom/discord/chat/bridge/forums/ForumPostActions;", "getPostPreviewEmbeds", "getProgress", "getRawMilliseconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getReactions", "getReferencedMessage", "()Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;", "getReferralTrialOffer", "()Lcom/discord/chat/bridge/gift/GiftEmbed;", "getRemixButtonBackgroundColor", "getRemixButtonIconColor", "getRoleColor", "getRoleIcon", "()Lcom/discord/chat/bridge/roleicons/RoleIcon;", "getSafetyPolicyNoticeEmbed", "()Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed;", "getShouldShowRoleDot", "getShouldShowRoleOnName", "getShowInviteToSpeakButton", "getShowRemixButton", "getState", "()Lcom/discord/chat/bridge/MessageState;", "getSticker", "()Lcom/discord/chat/bridge/sticker/Sticker;", "getStickerLabel", "getStickers", "getSurveyIndication", "()Lcom/discord/chat/bridge/feedback/SurveyIndication;", "getTagBackgroundColor", "getTagText", "getTagTextColor", "getTagType", "getTagVerified", "getThreadEmbed", "()Lcom/discord/chat/bridge/threads/ThreadEmbed;", "getThreadStarterMessageHeader", "getTimestamp", "getTitle", "getTotalMonthsSubscribed", "getType", "()Lcom/discord/chat/bridge/MessageType;", "getUseAddBurstReaction", "getUseAttachmentGridLayout", "getUseAttachmentUploadPreview", "getUsername", "getUsernameColor", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component18$chat_release", "component19", "component2", "component2-3Eiw7ao", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component3-N_6c4I0", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component4-o4g7jtM", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component5-qOKuAAo", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component7-wUX8bhU", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component8", "component9", "copy", "copy-8adqbW4", "(Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/util/List;Lcom/discord/chat/bridge/channelprompt/ChannelPromptData;Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed;Lcom/discord/chat/bridge/polls/PollData;)Lcom/discord/chat/bridge/Message;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class Message extends MessageBase {
    public static final Companion Companion = new Companion(null);
    private final Float _constrainedWidth;
    private final ActivityInviteEmbed activityInviteEmbed;
    private final Boolean animateEmoji;
    private final List<Attachment> attachments;
    private final Float attachmentsOpacity;
    private final UserId authorId;
    private final AutoModerationContext autoModerationContext;
    private final String avatarDecorationURL;
    private final String avatarURL;
    private final List<String> avatarURLs;
    private final String buttonLabel;
    private final long channelId;
    private final ChannelPromptData channelPromptData;
    private final List<CodedLinkEmbed> codedLinks;
    private final Integer colorString;
    private final Boolean communicationDisabled;
    private final List<Component> components;
    private final ConnectionsRoleTag connectionsRoleTag;
    private final Lazy constrainedWidth$delegate;
    private final StructurableText content;
    private final String description;
    private final String edited;
    private final List<Embed> embeds;
    private final EphemeralIndication ephemeralIndication;
    private final ExecutedCommand executedCommand;
    private final long flags;
    private final Boolean gifAutoPlay;
    private final List<GiftEmbed> giftCodes;
    private final GuildId guildId;

    /* renamed from: id */
    private final String f8299id;
    private final InteractionStatus interactionStatus;
    private final Boolean isCallActive;
    private final Boolean isCurrentUserMessageAuthor;
    private final boolean isFirstForumPostMessage;
    private final boolean mentioned;
    private final Boolean missed;
    private final String nonce;
    private final String obscureLearnMoreLabel;
    private final String opTagText;
    private final PollData pollData;
    private final ForumPostActions postActions;
    private final List<PostPreviewEmbed> postPreviewEmbeds;
    private final List<UploadProgress> progress;
    private final Long rawMilliseconds;
    private final List<MessageReaction> reactions;
    private final ReferencedMessage referencedMessage;
    private final GiftEmbed referralTrialOffer;
    private final Integer remixButtonBackgroundColor;
    private final Integer remixButtonIconColor;
    private final Integer roleColor;
    private final RoleIcon roleIcon;
    private final SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed;
    private final boolean shouldShowRoleDot;
    private final boolean shouldShowRoleOnName;
    private final Boolean showInviteToSpeakButton;
    private final Boolean showRemixButton;
    private final MessageState state;
    private final Sticker sticker;
    private final String stickerLabel;
    private final List<Sticker> stickers;
    private final SurveyIndication surveyIndication;
    private final Integer tagBackgroundColor;
    private final String tagText;
    private final Integer tagTextColor;
    private final String tagType;
    private final Boolean tagVerified;
    private final ThreadEmbed threadEmbed;
    private final String threadStarterMessageHeader;
    private final String timestamp;
    private final String title;
    private final Integer totalMonthsSubscribed;
    private final MessageType type;
    private final Boolean useAddBurstReaction;
    private final Boolean useAttachmentGridLayout;
    private final Boolean useAttachmentUploadPreview;
    private final String username;
    private final Integer usernameColor;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.chat.bridge.Message$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C29151 extends AbstractC9614s implements Function0<Integer> {
        C29151() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            Float f = Message.this.get_constrainedWidth();
            if (f != null) {
                return Integer.valueOf(SizeUtilsKt.getDpToPx(f.floatValue()));
            }
            return null;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/Message$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/Message;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Message> serializer() {
            return Message$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private Message(int i, int i2, int i3, MessageType messageType, String str, String str2, ChannelId channelId, GuildId guildId, MessageState messageState, UserId userId, long j, String str3, Float f, String str4, String str5, Integer num, Integer num2, boolean z, boolean z2, Integer num3, String str6, String str7, List<Embed> list, List<Attachment> list2, Float f2, StructurableText structurableText, List<UploadProgress> list3, List<MessageReaction> list4, Boolean bool, List<? extends CodedLinkEmbed> list5, List<Sticker> list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z3, Boolean bool2, Boolean bool3, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List<? extends Component> list7, String str8, Boolean bool4, String str9, Boolean bool5, Integer num4, Integer num5, String str10, String str11, Boolean bool6, Integer num6, Integer num7, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str12, String str13, String str14, List<String> list8, Boolean bool10, Boolean bool11, Long l, Sticker sticker, String str15, String str16, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z4, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List<? extends GiftEmbed> list9, GiftEmbed giftEmbed, Integer num8, List<PostPreviewEmbed> list10, ChannelPromptData channelPromptData, SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed, PollData pollData, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        Lazy m7601a;
        if ((-2147483637 != (i & (-2147483637))) | ((i2 & 0) != 0) | ((i3 & 0) != 0)) {
            C2620n1.m32837a(new int[]{i, i2, i3}, new int[]{-2147483637, 0, 0}, Message$$serializer.INSTANCE.getDescriptor());
        }
        this.type = messageType;
        this.f8299id = str;
        if ((i & 4) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str2;
        }
        this.channelId = channelId.m42056unboximpl();
        if ((i & 16) == 0) {
            this.guildId = null;
        } else {
            this.guildId = guildId;
        }
        if ((i & 32) == 0) {
            this.state = null;
        } else {
            this.state = messageState;
        }
        if ((i & 64) == 0) {
            this.authorId = null;
        } else {
            this.authorId = userId;
        }
        this.flags = (i & 128) == 0 ? 0L : j;
        if ((i & 256) == 0) {
            this.edited = null;
        } else {
            this.edited = str3;
        }
        if ((i & 512) == 0) {
            this._constrainedWidth = null;
        } else {
            this._constrainedWidth = f;
        }
        if ((i & 1024) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = str4;
        }
        if ((i & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.username = null;
        } else {
            this.username = str5;
        }
        if ((i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.usernameColor = null;
        } else {
            this.usernameColor = num;
        }
        if ((i & 8192) == 0) {
            this.roleColor = null;
        } else {
            this.roleColor = num2;
        }
        if ((i & 16384) == 0) {
            this.shouldShowRoleDot = false;
        } else {
            this.shouldShowRoleDot = z;
        }
        if ((i & 32768) == 0) {
            this.shouldShowRoleOnName = false;
        } else {
            this.shouldShowRoleOnName = z2;
        }
        if ((i & 65536) == 0) {
            this.colorString = null;
        } else {
            this.colorString = num3;
        }
        if ((i & 131072) == 0) {
            this.avatarURL = null;
        } else {
            this.avatarURL = str6;
        }
        if ((i & 262144) == 0) {
            this.avatarDecorationURL = null;
        } else {
            this.avatarDecorationURL = str7;
        }
        if ((524288 & i) == 0) {
            this.embeds = null;
        } else {
            this.embeds = list;
        }
        if ((1048576 & i) == 0) {
            this.attachments = null;
        } else {
            this.attachments = list2;
        }
        if ((2097152 & i) == 0) {
            this.attachmentsOpacity = null;
        } else {
            this.attachmentsOpacity = f2;
        }
        if ((4194304 & i) == 0) {
            this.content = null;
        } else {
            this.content = structurableText;
        }
        if ((8388608 & i) == 0) {
            this.progress = null;
        } else {
            this.progress = list3;
        }
        if ((16777216 & i) == 0) {
            this.reactions = null;
        } else {
            this.reactions = list4;
        }
        this.useAddBurstReaction = (33554432 & i) == 0 ? Boolean.FALSE : bool;
        if ((67108864 & i) == 0) {
            this.codedLinks = null;
        } else {
            this.codedLinks = list5;
        }
        if ((134217728 & i) == 0) {
            this.stickers = null;
        } else {
            this.stickers = list6;
        }
        if ((268435456 & i) == 0) {
            this.roleIcon = null;
        } else {
            this.roleIcon = roleIcon;
        }
        if ((536870912 & i) == 0) {
            this.connectionsRoleTag = null;
        } else {
            this.connectionsRoleTag = connectionsRoleTag;
        }
        if ((i & 1073741824) == 0) {
            this.threadEmbed = null;
        } else {
            this.threadEmbed = threadEmbed;
        }
        this.mentioned = z3;
        if ((i2 & 1) == 0) {
            this.gifAutoPlay = null;
        } else {
            this.gifAutoPlay = bool2;
        }
        if ((i2 & 2) == 0) {
            this.animateEmoji = null;
        } else {
            this.animateEmoji = bool3;
        }
        if ((i2 & 4) == 0) {
            this.referencedMessage = null;
        } else {
            this.referencedMessage = referencedMessage;
        }
        if ((i2 & 8) == 0) {
            this.executedCommand = null;
        } else {
            this.executedCommand = executedCommand;
        }
        if ((i2 & 16) == 0) {
            this.components = null;
        } else {
            this.components = list7;
        }
        if ((i2 & 32) == 0) {
            this.threadStarterMessageHeader = null;
        } else {
            this.threadStarterMessageHeader = str8;
        }
        if ((i2 & 64) == 0) {
            this.communicationDisabled = null;
        } else {
            this.communicationDisabled = bool4;
        }
        if ((i2 & 128) == 0) {
            this.tagText = null;
        } else {
            this.tagText = str9;
        }
        if ((i2 & 256) == 0) {
            this.tagVerified = null;
        } else {
            this.tagVerified = bool5;
        }
        if ((i2 & 512) == 0) {
            this.tagTextColor = null;
        } else {
            this.tagTextColor = num4;
        }
        if ((i2 & 1024) == 0) {
            this.tagBackgroundColor = null;
        } else {
            this.tagBackgroundColor = num5;
        }
        if ((i2 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.tagType = null;
        } else {
            this.tagType = str10;
        }
        if ((i2 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.opTagText = null;
        } else {
            this.opTagText = str11;
        }
        if ((i2 & 8192) == 0) {
            this.showRemixButton = null;
        } else {
            this.showRemixButton = bool6;
        }
        if ((i2 & 16384) == 0) {
            this.remixButtonIconColor = null;
        } else {
            this.remixButtonIconColor = num6;
        }
        if ((i2 & 32768) == 0) {
            this.remixButtonBackgroundColor = null;
        } else {
            this.remixButtonBackgroundColor = num7;
        }
        if ((i2 & 65536) == 0) {
            this.ephemeralIndication = null;
        } else {
            this.ephemeralIndication = ephemeralIndication;
        }
        if ((i2 & 131072) == 0) {
            this.surveyIndication = null;
        } else {
            this.surveyIndication = surveyIndication;
        }
        if ((i2 & 262144) == 0) {
            this.interactionStatus = null;
        } else {
            this.interactionStatus = interactionStatus;
        }
        this.useAttachmentGridLayout = (524288 & i2) == 0 ? Boolean.FALSE : bool7;
        this.useAttachmentUploadPreview = (1048576 & i2) == 0 ? Boolean.FALSE : bool8;
        this.isCurrentUserMessageAuthor = (2097152 & i2) == 0 ? Boolean.FALSE : bool9;
        if ((4194304 & i2) == 0) {
            this.obscureLearnMoreLabel = null;
        } else {
            this.obscureLearnMoreLabel = str12;
        }
        if ((8388608 & i2) == 0) {
            this.title = null;
        } else {
            this.title = str13;
        }
        if ((16777216 & i2) == 0) {
            this.description = null;
        } else {
            this.description = str14;
        }
        if ((33554432 & i2) == 0) {
            this.avatarURLs = null;
        } else {
            this.avatarURLs = list8;
        }
        if ((67108864 & i2) == 0) {
            this.isCallActive = null;
        } else {
            this.isCallActive = bool10;
        }
        if ((134217728 & i2) == 0) {
            this.missed = null;
        } else {
            this.missed = bool11;
        }
        if ((268435456 & i2) == 0) {
            this.rawMilliseconds = null;
        } else {
            this.rawMilliseconds = l;
        }
        if ((536870912 & i2) == 0) {
            this.sticker = null;
        } else {
            this.sticker = sticker;
        }
        if ((1073741824 & i2) == 0) {
            this.stickerLabel = null;
        } else {
            this.stickerLabel = str15;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.buttonLabel = null;
        } else {
            this.buttonLabel = str16;
        }
        if ((i3 & 1) == 0) {
            this.showInviteToSpeakButton = null;
        } else {
            this.showInviteToSpeakButton = bool12;
        }
        if ((i3 & 2) == 0) {
            this.activityInviteEmbed = null;
        } else {
            this.activityInviteEmbed = activityInviteEmbed;
        }
        if ((i3 & 4) == 0) {
            this.isFirstForumPostMessage = false;
        } else {
            this.isFirstForumPostMessage = z4;
        }
        if ((i3 & 8) == 0) {
            this.postActions = null;
        } else {
            this.postActions = forumPostActions;
        }
        if ((i3 & 16) == 0) {
            this.autoModerationContext = null;
        } else {
            this.autoModerationContext = autoModerationContext;
        }
        if ((i3 & 32) == 0) {
            this.giftCodes = null;
        } else {
            this.giftCodes = list9;
        }
        if ((i3 & 64) == 0) {
            this.referralTrialOffer = null;
        } else {
            this.referralTrialOffer = giftEmbed;
        }
        if ((i3 & 128) == 0) {
            this.totalMonthsSubscribed = null;
        } else {
            this.totalMonthsSubscribed = num8;
        }
        if ((i3 & 256) == 0) {
            this.postPreviewEmbeds = null;
        } else {
            this.postPreviewEmbeds = list10;
        }
        if ((i3 & 512) == 0) {
            this.channelPromptData = null;
        } else {
            this.channelPromptData = channelPromptData;
        }
        if ((i3 & 1024) == 0) {
            this.safetyPolicyNoticeEmbed = null;
        } else {
            this.safetyPolicyNoticeEmbed = safetyPolicyNoticeEmbed;
        }
        if ((i3 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.pollData = null;
        } else {
            this.pollData = pollData;
        }
        m7601a = C11577n.m7601a(new C29151());
        this.constrainedWidth$delegate = m7601a;
    }

    public /* synthetic */ Message(int i, int i2, int i3, MessageType messageType, String str, String str2, ChannelId channelId, GuildId guildId, MessageState messageState, UserId userId, long j, String str3, Float f, String str4, String str5, Integer num, Integer num2, boolean z, boolean z2, Integer num3, String str6, String str7, List list, List list2, Float f2, StructurableText structurableText, List list3, List list4, Boolean bool, List list5, List list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z3, Boolean bool2, Boolean bool3, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List list7, String str8, Boolean bool4, String str9, Boolean bool5, Integer num4, Integer num5, String str10, String str11, Boolean bool6, Integer num6, Integer num7, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str12, String str13, String str14, List list8, Boolean bool10, Boolean bool11, Long l, Sticker sticker, String str15, String str16, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z4, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List list9, GiftEmbed giftEmbed, Integer num8, List list10, ChannelPromptData channelPromptData, SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed, PollData pollData, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, messageType, str, str2, channelId, guildId, messageState, userId, j, str3, f, str4, str5, num, num2, z, z2, num3, str6, str7, list, list2, f2, structurableText, list3, list4, bool, list5, list6, roleIcon, connectionsRoleTag, threadEmbed, z3, bool2, bool3, referencedMessage, executedCommand, list7, str8, bool4, str9, bool5, num4, num5, str10, str11, bool6, num6, num7, ephemeralIndication, surveyIndication, interactionStatus, bool7, bool8, bool9, str12, str13, str14, list8, bool10, bool11, l, sticker, str15, str16, bool12, activityInviteEmbed, z4, forumPostActions, autoModerationContext, list9, giftEmbed, num8, list10, channelPromptData, safetyPolicyNoticeEmbed, pollData, serializationConstructorMarker);
    }

    public /* synthetic */ Message(MessageType messageType, String str, String str2, long j, GuildId guildId, MessageState messageState, UserId userId, long j2, String str3, Float f, String str4, String str5, Integer num, Integer num2, boolean z, boolean z2, Integer num3, String str6, String str7, List list, List list2, Float f2, StructurableText structurableText, List list3, List list4, Boolean bool, List list5, List list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z3, Boolean bool2, Boolean bool3, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List list7, String str8, Boolean bool4, String str9, Boolean bool5, Integer num4, Integer num5, String str10, String str11, Boolean bool6, Integer num6, Integer num7, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str12, String str13, String str14, List list8, Boolean bool10, Boolean bool11, Long l, Sticker sticker, String str15, String str16, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z4, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List list9, GiftEmbed giftEmbed, Integer num8, List list10, ChannelPromptData channelPromptData, SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed, PollData pollData, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageType, str, str2, j, guildId, messageState, userId, j2, str3, f, str4, str5, num, num2, z, z2, num3, str6, str7, list, list2, f2, structurableText, list3, list4, bool, list5, list6, roleIcon, connectionsRoleTag, threadEmbed, z3, bool2, bool3, referencedMessage, executedCommand, list7, str8, bool4, str9, bool5, num4, num5, str10, str11, bool6, num6, num7, ephemeralIndication, surveyIndication, interactionStatus, bool7, bool8, bool9, str12, str13, str14, list8, bool10, bool11, l, sticker, str15, str16, bool12, activityInviteEmbed, z4, forumPostActions, autoModerationContext, list9, giftEmbed, num8, list10, channelPromptData, safetyPolicyNoticeEmbed, pollData);
    }

    public static /* synthetic */ void getAvatarURL$chat_release$annotations() {
    }

    public static /* synthetic */ void get_constrainedWidth$annotations() {
    }

    public static final void write$Self(Message self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        MessageBase.write$Self(self, output, serialDesc);
        output.mo12894i(serialDesc, 0, MessageType.Serializer.INSTANCE, self.type);
        MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
        output.mo12894i(serialDesc, 1, messageId$$serializer, MessageId.m42073boximpl(self.f8299id));
        if (output.mo12879z(serialDesc, 2) || self.nonce != null) {
            String str = self.nonce;
            output.mo12904E(serialDesc, 2, messageId$$serializer, str != null ? MessageId.m42073boximpl(str) : null);
        }
        output.mo12894i(serialDesc, 3, ChannelId$$serializer.INSTANCE, ChannelId.m42047boximpl(self.channelId));
        if (output.mo12879z(serialDesc, 4) || self.guildId != null) {
            output.mo12904E(serialDesc, 4, GuildId$$serializer.INSTANCE, self.guildId);
        }
        if (output.mo12879z(serialDesc, 5) || self.state != null) {
            output.mo12904E(serialDesc, 5, MessageState.Serializer.INSTANCE, self.state);
        }
        if (output.mo12879z(serialDesc, 6) || self.authorId != null) {
            output.mo12904E(serialDesc, 6, UserId$$serializer.INSTANCE, self.authorId);
        }
        if (output.mo12879z(serialDesc, 7) || self.flags != 0) {
            output.mo12905D(serialDesc, 7, self.flags);
        }
        if (output.mo12879z(serialDesc, 8) || self.edited != null) {
            output.mo12904E(serialDesc, 8, C2560a2.f7013a, self.edited);
        }
        if (output.mo12879z(serialDesc, 9) || self._constrainedWidth != null) {
            output.mo12904E(serialDesc, 9, C2578e0.f7038a, self._constrainedWidth);
        }
        if (output.mo12879z(serialDesc, 10) || self.timestamp != null) {
            output.mo12904E(serialDesc, 10, C2560a2.f7013a, self.timestamp);
        }
        if (output.mo12879z(serialDesc, 11) || self.username != null) {
            output.mo12904E(serialDesc, 11, C2560a2.f7013a, self.username);
        }
        if (output.mo12879z(serialDesc, 12) || self.usernameColor != null) {
            output.mo12904E(serialDesc, 12, C2615m0.f7088a, self.usernameColor);
        }
        if (output.mo12879z(serialDesc, 13) || self.roleColor != null) {
            output.mo12904E(serialDesc, 13, C2615m0.f7088a, self.roleColor);
        }
        if (output.mo12879z(serialDesc, 14) || self.shouldShowRoleDot) {
            output.mo12881x(serialDesc, 14, self.shouldShowRoleDot);
        }
        if (output.mo12879z(serialDesc, 15) || self.shouldShowRoleOnName) {
            output.mo12881x(serialDesc, 15, self.shouldShowRoleOnName);
        }
        if (output.mo12879z(serialDesc, 16) || self.colorString != null) {
            output.mo12904E(serialDesc, 16, C2615m0.f7088a, self.colorString);
        }
        if (output.mo12879z(serialDesc, 17) || self.avatarURL != null) {
            output.mo12904E(serialDesc, 17, C2560a2.f7013a, self.avatarURL);
        }
        if (output.mo12879z(serialDesc, 18) || self.avatarDecorationURL != null) {
            output.mo12904E(serialDesc, 18, C2560a2.f7013a, self.avatarDecorationURL);
        }
        if (output.mo12879z(serialDesc, 19) || self.embeds != null) {
            output.mo12904E(serialDesc, 19, new C2581f(Embed$$serializer.INSTANCE), self.embeds);
        }
        if (output.mo12879z(serialDesc, 20) || self.attachments != null) {
            output.mo12904E(serialDesc, 20, new C2581f(Attachment$$serializer.INSTANCE), self.attachments);
        }
        if (output.mo12879z(serialDesc, 21) || self.attachmentsOpacity != null) {
            output.mo12904E(serialDesc, 21, C2578e0.f7038a, self.attachmentsOpacity);
        }
        if (output.mo12879z(serialDesc, 22) || self.content != null) {
            output.mo12904E(serialDesc, 22, StructurableTextSerializer.INSTANCE, self.content);
        }
        if (output.mo12879z(serialDesc, 23) || self.progress != null) {
            output.mo12904E(serialDesc, 23, new C2581f(UploadProgress$$serializer.INSTANCE), self.progress);
        }
        if (output.mo12879z(serialDesc, 24) || self.reactions != null) {
            output.mo12904E(serialDesc, 24, new C2581f(MessageReaction$$serializer.INSTANCE), self.reactions);
        }
        if (output.mo12879z(serialDesc, 25) || !C9612q.m13922c(self.useAddBurstReaction, Boolean.FALSE)) {
            output.mo12904E(serialDesc, 25, C2590h.f7055a, self.useAddBurstReaction);
        }
        if (output.mo12879z(serialDesc, 26) || self.codedLinks != null) {
            output.mo12904E(serialDesc, 26, new C2581f(C0213a.m40920u(CodedLinkSerializer.INSTANCE)), self.codedLinks);
        }
        if (output.mo12879z(serialDesc, 27) || self.stickers != null) {
            output.mo12904E(serialDesc, 27, new C2581f(Sticker$$serializer.INSTANCE), self.stickers);
        }
        if (output.mo12879z(serialDesc, 28) || self.roleIcon != null) {
            output.mo12904E(serialDesc, 28, RoleIcon$$serializer.INSTANCE, self.roleIcon);
        }
        if (output.mo12879z(serialDesc, 29) || self.connectionsRoleTag != null) {
            output.mo12904E(serialDesc, 29, ConnectionsRoleTag$$serializer.INSTANCE, self.connectionsRoleTag);
        }
        if (output.mo12879z(serialDesc, 30) || self.threadEmbed != null) {
            output.mo12904E(serialDesc, 30, ThreadEmbed$$serializer.INSTANCE, self.threadEmbed);
        }
        output.mo12881x(serialDesc, 31, self.mentioned);
        if (output.mo12879z(serialDesc, 32) || self.gifAutoPlay != null) {
            output.mo12904E(serialDesc, 32, C2590h.f7055a, self.gifAutoPlay);
        }
        if (output.mo12879z(serialDesc, 33) || self.animateEmoji != null) {
            output.mo12904E(serialDesc, 33, C2590h.f7055a, self.animateEmoji);
        }
        if (output.mo12879z(serialDesc, 34) || self.referencedMessage != null) {
            output.mo12904E(serialDesc, 34, ReferencedMessageSerializer.INSTANCE, self.referencedMessage);
        }
        if (output.mo12879z(serialDesc, 35) || self.executedCommand != null) {
            output.mo12904E(serialDesc, 35, ExecutedCommand$$serializer.INSTANCE, self.executedCommand);
        }
        if (output.mo12879z(serialDesc, 36) || self.components != null) {
            output.mo12904E(serialDesc, 36, new C2581f(ComponentSerializer.INSTANCE), self.components);
        }
        if (output.mo12879z(serialDesc, 37) || self.threadStarterMessageHeader != null) {
            output.mo12904E(serialDesc, 37, C2560a2.f7013a, self.threadStarterMessageHeader);
        }
        if (output.mo12879z(serialDesc, 38) || self.communicationDisabled != null) {
            output.mo12904E(serialDesc, 38, C2590h.f7055a, self.communicationDisabled);
        }
        if (output.mo12879z(serialDesc, 39) || self.tagText != null) {
            output.mo12904E(serialDesc, 39, C2560a2.f7013a, self.tagText);
        }
        if (output.mo12879z(serialDesc, 40) || self.tagVerified != null) {
            output.mo12904E(serialDesc, 40, C2590h.f7055a, self.tagVerified);
        }
        if (output.mo12879z(serialDesc, 41) || self.tagTextColor != null) {
            output.mo12904E(serialDesc, 41, C2615m0.f7088a, self.tagTextColor);
        }
        if (output.mo12879z(serialDesc, 42) || self.tagBackgroundColor != null) {
            output.mo12904E(serialDesc, 42, C2615m0.f7088a, self.tagBackgroundColor);
        }
        if (output.mo12879z(serialDesc, 43) || self.tagType != null) {
            output.mo12904E(serialDesc, 43, C2560a2.f7013a, self.tagType);
        }
        if (output.mo12879z(serialDesc, 44) || self.opTagText != null) {
            output.mo12904E(serialDesc, 44, C2560a2.f7013a, self.opTagText);
        }
        if (output.mo12879z(serialDesc, 45) || self.showRemixButton != null) {
            output.mo12904E(serialDesc, 45, C2590h.f7055a, self.showRemixButton);
        }
        if (output.mo12879z(serialDesc, 46) || self.remixButtonIconColor != null) {
            output.mo12904E(serialDesc, 46, C2615m0.f7088a, self.remixButtonIconColor);
        }
        if (output.mo12879z(serialDesc, 47) || self.remixButtonBackgroundColor != null) {
            output.mo12904E(serialDesc, 47, C2615m0.f7088a, self.remixButtonBackgroundColor);
        }
        if (output.mo12879z(serialDesc, 48) || self.ephemeralIndication != null) {
            output.mo12904E(serialDesc, 48, EphemeralIndication$$serializer.INSTANCE, self.ephemeralIndication);
        }
        if (output.mo12879z(serialDesc, 49) || self.surveyIndication != null) {
            output.mo12904E(serialDesc, 49, SurveyIndication$$serializer.INSTANCE, self.surveyIndication);
        }
        if (output.mo12879z(serialDesc, 50) || self.interactionStatus != null) {
            output.mo12904E(serialDesc, 50, InteractionStatus$$serializer.INSTANCE, self.interactionStatus);
        }
        if (output.mo12879z(serialDesc, 51) || !C9612q.m13922c(self.useAttachmentGridLayout, Boolean.FALSE)) {
            output.mo12904E(serialDesc, 51, C2590h.f7055a, self.useAttachmentGridLayout);
        }
        if (output.mo12879z(serialDesc, 52) || !C9612q.m13922c(self.useAttachmentUploadPreview, Boolean.FALSE)) {
            output.mo12904E(serialDesc, 52, C2590h.f7055a, self.useAttachmentUploadPreview);
        }
        if (output.mo12879z(serialDesc, 53) || !C9612q.m13922c(self.isCurrentUserMessageAuthor, Boolean.FALSE)) {
            output.mo12904E(serialDesc, 53, C2590h.f7055a, self.isCurrentUserMessageAuthor);
        }
        if (output.mo12879z(serialDesc, 54) || self.obscureLearnMoreLabel != null) {
            output.mo12904E(serialDesc, 54, C2560a2.f7013a, self.obscureLearnMoreLabel);
        }
        if (output.mo12879z(serialDesc, 55) || self.title != null) {
            output.mo12904E(serialDesc, 55, C2560a2.f7013a, self.title);
        }
        if (output.mo12879z(serialDesc, 56) || self.description != null) {
            output.mo12904E(serialDesc, 56, C2560a2.f7013a, self.description);
        }
        if (output.mo12879z(serialDesc, 57) || self.avatarURLs != null) {
            output.mo12904E(serialDesc, 57, new C2581f(C2560a2.f7013a), self.avatarURLs);
        }
        if (output.mo12879z(serialDesc, 58) || self.isCallActive != null) {
            output.mo12904E(serialDesc, 58, C2590h.f7055a, self.isCallActive);
        }
        if (output.mo12879z(serialDesc, 59) || self.missed != null) {
            output.mo12904E(serialDesc, 59, C2590h.f7055a, self.missed);
        }
        if (output.mo12879z(serialDesc, 60) || self.rawMilliseconds != null) {
            output.mo12904E(serialDesc, 60, C2649w0.f7129a, self.rawMilliseconds);
        }
        if (output.mo12879z(serialDesc, 61) || self.sticker != null) {
            output.mo12904E(serialDesc, 61, Sticker$$serializer.INSTANCE, self.sticker);
        }
        if (output.mo12879z(serialDesc, 62) || self.stickerLabel != null) {
            output.mo12904E(serialDesc, 62, C2560a2.f7013a, self.stickerLabel);
        }
        if (output.mo12879z(serialDesc, 63) || self.buttonLabel != null) {
            output.mo12904E(serialDesc, 63, C2560a2.f7013a, self.buttonLabel);
        }
        if (output.mo12879z(serialDesc, 64) || self.showInviteToSpeakButton != null) {
            output.mo12904E(serialDesc, 64, C2590h.f7055a, self.showInviteToSpeakButton);
        }
        if (output.mo12879z(serialDesc, 65) || self.activityInviteEmbed != null) {
            output.mo12904E(serialDesc, 65, ActivityInviteEmbed$$serializer.INSTANCE, self.activityInviteEmbed);
        }
        if (output.mo12879z(serialDesc, 66) || self.isFirstForumPostMessage) {
            output.mo12881x(serialDesc, 66, self.isFirstForumPostMessage);
        }
        if (output.mo12879z(serialDesc, 67) || self.postActions != null) {
            output.mo12904E(serialDesc, 67, ForumPostActions$$serializer.INSTANCE, self.postActions);
        }
        if (output.mo12879z(serialDesc, 68) || self.autoModerationContext != null) {
            output.mo12904E(serialDesc, 68, AutoModerationContext$$serializer.INSTANCE, self.autoModerationContext);
        }
        if (output.mo12879z(serialDesc, 69) || self.giftCodes != null) {
            output.mo12904E(serialDesc, 69, new C2581f(GiftEmbedSerializer.INSTANCE), self.giftCodes);
        }
        if (output.mo12879z(serialDesc, 70) || self.referralTrialOffer != null) {
            output.mo12904E(serialDesc, 70, GiftEmbedSerializer.INSTANCE, self.referralTrialOffer);
        }
        if (output.mo12879z(serialDesc, 71) || self.totalMonthsSubscribed != null) {
            output.mo12904E(serialDesc, 71, C2615m0.f7088a, self.totalMonthsSubscribed);
        }
        if (output.mo12879z(serialDesc, 72) || self.postPreviewEmbeds != null) {
            output.mo12904E(serialDesc, 72, new C2581f(PostPreviewEmbed$$serializer.INSTANCE), self.postPreviewEmbeds);
        }
        if (output.mo12879z(serialDesc, 73) || self.channelPromptData != null) {
            output.mo12904E(serialDesc, 73, ChannelPromptData$$serializer.INSTANCE, self.channelPromptData);
        }
        if (output.mo12879z(serialDesc, 74) || self.safetyPolicyNoticeEmbed != null) {
            output.mo12904E(serialDesc, 74, SafetyPolicyNoticeEmbed$$serializer.INSTANCE, self.safetyPolicyNoticeEmbed);
        }
        if (output.mo12879z(serialDesc, 75) || self.pollData != null) {
            output.mo12904E(serialDesc, 75, PollData$$serializer.INSTANCE, self.pollData);
        }
    }

    public final MessageType component1() {
        return this.type;
    }

    public final Float component10() {
        return this._constrainedWidth;
    }

    public final String component11() {
        return this.timestamp;
    }

    public final String component12() {
        return this.username;
    }

    public final Integer component13() {
        return this.usernameColor;
    }

    public final Integer component14() {
        return this.roleColor;
    }

    public final boolean component15() {
        return this.shouldShowRoleDot;
    }

    public final boolean component16() {
        return this.shouldShowRoleOnName;
    }

    public final Integer component17() {
        return this.colorString;
    }

    public final String component18$chat_release() {
        return this.avatarURL;
    }

    public final String component19() {
        return this.avatarDecorationURL;
    }

    /* renamed from: component2-3Eiw7ao  reason: not valid java name */
    public final String m41427component23Eiw7ao() {
        return this.f8299id;
    }

    public final List<Embed> component20() {
        return this.embeds;
    }

    public final List<Attachment> component21() {
        return this.attachments;
    }

    public final Float component22() {
        return this.attachmentsOpacity;
    }

    public final StructurableText component23() {
        return this.content;
    }

    public final List<UploadProgress> component24() {
        return this.progress;
    }

    public final List<MessageReaction> component25() {
        return this.reactions;
    }

    public final Boolean component26() {
        return this.useAddBurstReaction;
    }

    public final List<CodedLinkEmbed> component27() {
        return this.codedLinks;
    }

    public final List<Sticker> component28() {
        return this.stickers;
    }

    public final RoleIcon component29() {
        return this.roleIcon;
    }

    /* renamed from: component3-N_6c4I0  reason: not valid java name */
    public final String m41428component3N_6c4I0() {
        return this.nonce;
    }

    public final ConnectionsRoleTag component30() {
        return this.connectionsRoleTag;
    }

    public final ThreadEmbed component31() {
        return this.threadEmbed;
    }

    public final boolean component32() {
        return this.mentioned;
    }

    public final Boolean component33() {
        return this.gifAutoPlay;
    }

    public final Boolean component34() {
        return this.animateEmoji;
    }

    public final ReferencedMessage component35() {
        return this.referencedMessage;
    }

    public final ExecutedCommand component36() {
        return this.executedCommand;
    }

    public final List<Component> component37() {
        return this.components;
    }

    public final String component38() {
        return this.threadStarterMessageHeader;
    }

    public final Boolean component39() {
        return this.communicationDisabled;
    }

    /* renamed from: component4-o4g7jtM  reason: not valid java name */
    public final long m41429component4o4g7jtM() {
        return this.channelId;
    }

    public final String component40() {
        return this.tagText;
    }

    public final Boolean component41() {
        return this.tagVerified;
    }

    public final Integer component42() {
        return this.tagTextColor;
    }

    public final Integer component43() {
        return this.tagBackgroundColor;
    }

    public final String component44() {
        return this.tagType;
    }

    public final String component45() {
        return this.opTagText;
    }

    public final Boolean component46() {
        return this.showRemixButton;
    }

    public final Integer component47() {
        return this.remixButtonIconColor;
    }

    public final Integer component48() {
        return this.remixButtonBackgroundColor;
    }

    public final EphemeralIndication component49() {
        return this.ephemeralIndication;
    }

    /* renamed from: component5-qOKuAAo  reason: not valid java name */
    public final GuildId m41430component5qOKuAAo() {
        return this.guildId;
    }

    public final SurveyIndication component50() {
        return this.surveyIndication;
    }

    public final InteractionStatus component51() {
        return this.interactionStatus;
    }

    public final Boolean component52() {
        return this.useAttachmentGridLayout;
    }

    public final Boolean component53() {
        return this.useAttachmentUploadPreview;
    }

    public final Boolean component54() {
        return this.isCurrentUserMessageAuthor;
    }

    public final String component55() {
        return this.obscureLearnMoreLabel;
    }

    public final String component56() {
        return this.title;
    }

    public final String component57() {
        return this.description;
    }

    public final List<String> component58() {
        return this.avatarURLs;
    }

    public final Boolean component59() {
        return this.isCallActive;
    }

    public final MessageState component6() {
        return this.state;
    }

    public final Boolean component60() {
        return this.missed;
    }

    public final Long component61() {
        return this.rawMilliseconds;
    }

    public final Sticker component62() {
        return this.sticker;
    }

    public final String component63() {
        return this.stickerLabel;
    }

    public final String component64() {
        return this.buttonLabel;
    }

    public final Boolean component65() {
        return this.showInviteToSpeakButton;
    }

    public final ActivityInviteEmbed component66() {
        return this.activityInviteEmbed;
    }

    public final boolean component67() {
        return this.isFirstForumPostMessage;
    }

    public final ForumPostActions component68() {
        return this.postActions;
    }

    public final AutoModerationContext component69() {
        return this.autoModerationContext;
    }

    /* renamed from: component7-wUX8bhU  reason: not valid java name */
    public final UserId m41431component7wUX8bhU() {
        return this.authorId;
    }

    public final List<GiftEmbed> component70() {
        return this.giftCodes;
    }

    public final GiftEmbed component71() {
        return this.referralTrialOffer;
    }

    public final Integer component72() {
        return this.totalMonthsSubscribed;
    }

    public final List<PostPreviewEmbed> component73() {
        return this.postPreviewEmbeds;
    }

    public final ChannelPromptData component74() {
        return this.channelPromptData;
    }

    public final SafetyPolicyNoticeEmbed component75() {
        return this.safetyPolicyNoticeEmbed;
    }

    public final PollData component76() {
        return this.pollData;
    }

    public final long component8() {
        return this.flags;
    }

    public final String component9() {
        return this.edited;
    }

    /* renamed from: copy-8adqbW4  reason: not valid java name */
    public final Message m41432copy8adqbW4(MessageType type, String id2, String str, long j, GuildId guildId, MessageState messageState, UserId userId, long j2, String str2, Float f, String str3, String str4, Integer num, Integer num2, boolean z, boolean z2, Integer num3, String str5, String str6, List<Embed> list, List<Attachment> list2, Float f2, StructurableText structurableText, List<UploadProgress> list3, List<MessageReaction> list4, Boolean bool, List<? extends CodedLinkEmbed> list5, List<Sticker> list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z3, Boolean bool2, Boolean bool3, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List<? extends Component> list7, String str7, Boolean bool4, String str8, Boolean bool5, Integer num4, Integer num5, String str9, String str10, Boolean bool6, Integer num6, Integer num7, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str11, String str12, String str13, List<String> list8, Boolean bool10, Boolean bool11, Long l, Sticker sticker, String str14, String str15, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z4, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List<? extends GiftEmbed> list9, GiftEmbed giftEmbed, Integer num8, List<PostPreviewEmbed> list10, ChannelPromptData channelPromptData, SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed, PollData pollData) {
        C9612q.m13917h(type, "type");
        C9612q.m13917h(id2, "id");
        return new Message(type, id2, str, j, guildId, messageState, userId, j2, str2, f, str3, str4, num, num2, z, z2, num3, str5, str6, list, list2, f2, structurableText, list3, list4, bool, list5, list6, roleIcon, connectionsRoleTag, threadEmbed, z3, bool2, bool3, referencedMessage, executedCommand, list7, str7, bool4, str8, bool5, num4, num5, str9, str10, bool6, num6, num7, ephemeralIndication, surveyIndication, interactionStatus, bool7, bool8, bool9, str11, str12, str13, list8, bool10, bool11, l, sticker, str14, str15, bool12, activityInviteEmbed, z4, forumPostActions, autoModerationContext, list9, giftEmbed, num8, list10, channelPromptData, safetyPolicyNoticeEmbed, pollData, null);
    }

    public boolean equals(Object obj) {
        boolean m42077equalsimpl0;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Message) {
            Message message = (Message) obj;
            if (this.type == message.type && MessageId.m42077equalsimpl0(this.f8299id, message.f8299id)) {
                String str = this.nonce;
                String str2 = message.nonce;
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
                return m42077equalsimpl0 && ChannelId.m42051equalsimpl0(this.channelId, message.channelId) && C9612q.m13922c(this.guildId, message.guildId) && this.state == message.state && C9612q.m13922c(this.authorId, message.authorId) && this.flags == message.flags && C9612q.m13922c(this.edited, message.edited) && C9612q.m13922c(this._constrainedWidth, message._constrainedWidth) && C9612q.m13922c(this.timestamp, message.timestamp) && C9612q.m13922c(this.username, message.username) && C9612q.m13922c(this.usernameColor, message.usernameColor) && C9612q.m13922c(this.roleColor, message.roleColor) && this.shouldShowRoleDot == message.shouldShowRoleDot && this.shouldShowRoleOnName == message.shouldShowRoleOnName && C9612q.m13922c(this.colorString, message.colorString) && C9612q.m13922c(this.avatarURL, message.avatarURL) && C9612q.m13922c(this.avatarDecorationURL, message.avatarDecorationURL) && C9612q.m13922c(this.embeds, message.embeds) && C9612q.m13922c(this.attachments, message.attachments) && C9612q.m13922c(this.attachmentsOpacity, message.attachmentsOpacity) && C9612q.m13922c(this.content, message.content) && C9612q.m13922c(this.progress, message.progress) && C9612q.m13922c(this.reactions, message.reactions) && C9612q.m13922c(this.useAddBurstReaction, message.useAddBurstReaction) && C9612q.m13922c(this.codedLinks, message.codedLinks) && C9612q.m13922c(this.stickers, message.stickers) && C9612q.m13922c(this.roleIcon, message.roleIcon) && C9612q.m13922c(this.connectionsRoleTag, message.connectionsRoleTag) && C9612q.m13922c(this.threadEmbed, message.threadEmbed) && this.mentioned == message.mentioned && C9612q.m13922c(this.gifAutoPlay, message.gifAutoPlay) && C9612q.m13922c(this.animateEmoji, message.animateEmoji) && C9612q.m13922c(this.referencedMessage, message.referencedMessage) && C9612q.m13922c(this.executedCommand, message.executedCommand) && C9612q.m13922c(this.components, message.components) && C9612q.m13922c(this.threadStarterMessageHeader, message.threadStarterMessageHeader) && C9612q.m13922c(this.communicationDisabled, message.communicationDisabled) && C9612q.m13922c(this.tagText, message.tagText) && C9612q.m13922c(this.tagVerified, message.tagVerified) && C9612q.m13922c(this.tagTextColor, message.tagTextColor) && C9612q.m13922c(this.tagBackgroundColor, message.tagBackgroundColor) && C9612q.m13922c(this.tagType, message.tagType) && C9612q.m13922c(this.opTagText, message.opTagText) && C9612q.m13922c(this.showRemixButton, message.showRemixButton) && C9612q.m13922c(this.remixButtonIconColor, message.remixButtonIconColor) && C9612q.m13922c(this.remixButtonBackgroundColor, message.remixButtonBackgroundColor) && C9612q.m13922c(this.ephemeralIndication, message.ephemeralIndication) && C9612q.m13922c(this.surveyIndication, message.surveyIndication) && C9612q.m13922c(this.interactionStatus, message.interactionStatus) && C9612q.m13922c(this.useAttachmentGridLayout, message.useAttachmentGridLayout) && C9612q.m13922c(this.useAttachmentUploadPreview, message.useAttachmentUploadPreview) && C9612q.m13922c(this.isCurrentUserMessageAuthor, message.isCurrentUserMessageAuthor) && C9612q.m13922c(this.obscureLearnMoreLabel, message.obscureLearnMoreLabel) && C9612q.m13922c(this.title, message.title) && C9612q.m13922c(this.description, message.description) && C9612q.m13922c(this.avatarURLs, message.avatarURLs) && C9612q.m13922c(this.isCallActive, message.isCallActive) && C9612q.m13922c(this.missed, message.missed) && C9612q.m13922c(this.rawMilliseconds, message.rawMilliseconds) && C9612q.m13922c(this.sticker, message.sticker) && C9612q.m13922c(this.stickerLabel, message.stickerLabel) && C9612q.m13922c(this.buttonLabel, message.buttonLabel) && C9612q.m13922c(this.showInviteToSpeakButton, message.showInviteToSpeakButton) && C9612q.m13922c(this.activityInviteEmbed, message.activityInviteEmbed) && this.isFirstForumPostMessage == message.isFirstForumPostMessage && C9612q.m13922c(this.postActions, message.postActions) && C9612q.m13922c(this.autoModerationContext, message.autoModerationContext) && C9612q.m13922c(this.giftCodes, message.giftCodes) && C9612q.m13922c(this.referralTrialOffer, message.referralTrialOffer) && C9612q.m13922c(this.totalMonthsSubscribed, message.totalMonthsSubscribed) && C9612q.m13922c(this.postPreviewEmbeds, message.postPreviewEmbeds) && C9612q.m13922c(this.channelPromptData, message.channelPromptData) && C9612q.m13922c(this.safetyPolicyNoticeEmbed, message.safetyPolicyNoticeEmbed) && C9612q.m13922c(this.pollData, message.pollData);
            }
            return false;
        }
        return false;
    }

    public final ActivityInviteEmbed getActivityInviteEmbed() {
        return this.activityInviteEmbed;
    }

    public final Boolean getAnimateEmoji() {
        return this.animateEmoji;
    }

    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    public final Float getAttachmentsOpacity() {
        return this.attachmentsOpacity;
    }

    /* renamed from: getAuthorId-wUX8bhU  reason: not valid java name */
    public final UserId m41433getAuthorIdwUX8bhU() {
        return this.authorId;
    }

    public final AutoModerationContext getAutoModerationContext() {
        return this.autoModerationContext;
    }

    public final String getAvatarDecorationURL() {
        return this.avatarDecorationURL;
    }

    public final String getAvatarURL$chat_release() {
        return this.avatarURL;
    }

    public final List<String> getAvatarURLs() {
        return this.avatarURLs;
    }

    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    /* renamed from: getChannelId-o4g7jtM  reason: not valid java name */
    public final long m41434getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final ChannelPromptData getChannelPromptData() {
        return this.channelPromptData;
    }

    public final List<CodedLinkEmbed> getCodedLinks() {
        return this.codedLinks;
    }

    public final Integer getColorString() {
        return this.colorString;
    }

    public final Boolean getCommunicationDisabled() {
        return this.communicationDisabled;
    }

    public final List<Component> getComponents() {
        return this.components;
    }

    public final ConnectionsRoleTag getConnectionsRoleTag() {
        return this.connectionsRoleTag;
    }

    public final Integer getConstrainedWidth() {
        return (Integer) this.constrainedWidth$delegate.getValue();
    }

    public final StructurableText getContent() {
        return this.content;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEdited() {
        return this.edited;
    }

    public final List<Embed> getEmbeds() {
        return this.embeds;
    }

    public final EphemeralIndication getEphemeralIndication() {
        return this.ephemeralIndication;
    }

    public final ExecutedCommand getExecutedCommand() {
        return this.executedCommand;
    }

    public final long getFlags() {
        return this.flags;
    }

    public final Boolean getGifAutoPlay() {
        return this.gifAutoPlay;
    }

    public final List<GiftEmbed> getGiftCodes() {
        return this.giftCodes;
    }

    /* renamed from: getGuildId-qOKuAAo  reason: not valid java name */
    public final GuildId m41435getGuildIdqOKuAAo() {
        return this.guildId;
    }

    /* renamed from: getId-3Eiw7ao  reason: not valid java name */
    public final String m41436getId3Eiw7ao() {
        return this.f8299id;
    }

    public final InteractionStatus getInteractionStatus() {
        return this.interactionStatus;
    }

    public final boolean getMentioned() {
        return this.mentioned;
    }

    public final Boolean getMissed() {
        return this.missed;
    }

    /* renamed from: getNonce-N_6c4I0  reason: not valid java name */
    public final String m41437getNonceN_6c4I0() {
        return this.nonce;
    }

    public final String getObscureLearnMoreLabel() {
        return this.obscureLearnMoreLabel;
    }

    public final String getOpTagText() {
        return this.opTagText;
    }

    public final PollData getPollData() {
        return this.pollData;
    }

    public final ForumPostActions getPostActions() {
        return this.postActions;
    }

    public final List<PostPreviewEmbed> getPostPreviewEmbeds() {
        return this.postPreviewEmbeds;
    }

    public final List<UploadProgress> getProgress() {
        return this.progress;
    }

    public final Long getRawMilliseconds() {
        return this.rawMilliseconds;
    }

    public final List<MessageReaction> getReactions() {
        return this.reactions;
    }

    public final ReferencedMessage getReferencedMessage() {
        return this.referencedMessage;
    }

    public final GiftEmbed getReferralTrialOffer() {
        return this.referralTrialOffer;
    }

    public final Integer getRemixButtonBackgroundColor() {
        return this.remixButtonBackgroundColor;
    }

    public final Integer getRemixButtonIconColor() {
        return this.remixButtonIconColor;
    }

    public final Integer getRoleColor() {
        return this.roleColor;
    }

    public final RoleIcon getRoleIcon() {
        return this.roleIcon;
    }

    public final SafetyPolicyNoticeEmbed getSafetyPolicyNoticeEmbed() {
        return this.safetyPolicyNoticeEmbed;
    }

    public final boolean getShouldShowRoleDot() {
        return this.shouldShowRoleDot;
    }

    public final boolean getShouldShowRoleOnName() {
        return this.shouldShowRoleOnName;
    }

    public final Boolean getShowInviteToSpeakButton() {
        return this.showInviteToSpeakButton;
    }

    public final Boolean getShowRemixButton() {
        return this.showRemixButton;
    }

    public final MessageState getState() {
        return this.state;
    }

    public final Sticker getSticker() {
        return this.sticker;
    }

    public final String getStickerLabel() {
        return this.stickerLabel;
    }

    public final List<Sticker> getStickers() {
        return this.stickers;
    }

    public final SurveyIndication getSurveyIndication() {
        return this.surveyIndication;
    }

    public final Integer getTagBackgroundColor() {
        return this.tagBackgroundColor;
    }

    public final String getTagText() {
        return this.tagText;
    }

    public final Integer getTagTextColor() {
        return this.tagTextColor;
    }

    public final String getTagType() {
        return this.tagType;
    }

    public final Boolean getTagVerified() {
        return this.tagVerified;
    }

    public final ThreadEmbed getThreadEmbed() {
        return this.threadEmbed;
    }

    public final String getThreadStarterMessageHeader() {
        return this.threadStarterMessageHeader;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getTotalMonthsSubscribed() {
        return this.totalMonthsSubscribed;
    }

    public final MessageType getType() {
        return this.type;
    }

    public final Boolean getUseAddBurstReaction() {
        return this.useAddBurstReaction;
    }

    public final Boolean getUseAttachmentGridLayout() {
        return this.useAttachmentGridLayout;
    }

    public final Boolean getUseAttachmentUploadPreview() {
        return this.useAttachmentUploadPreview;
    }

    public final String getUsername() {
        return this.username;
    }

    public final Integer getUsernameColor() {
        return this.usernameColor;
    }

    public final Float get_constrainedWidth() {
        return this._constrainedWidth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.type.hashCode() * 31) + MessageId.m42078hashCodeimpl(this.f8299id)) * 31;
        String str = this.nonce;
        int m42078hashCodeimpl = (((hashCode + (str == null ? 0 : MessageId.m42078hashCodeimpl(str))) * 31) + ChannelId.m42052hashCodeimpl(this.channelId)) * 31;
        GuildId guildId = this.guildId;
        int m42065hashCodeimpl = (m42078hashCodeimpl + (guildId == null ? 0 : GuildId.m42065hashCodeimpl(guildId.m42069unboximpl()))) * 31;
        MessageState messageState = this.state;
        int hashCode2 = (m42065hashCodeimpl + (messageState == null ? 0 : messageState.hashCode())) * 31;
        UserId userId = this.authorId;
        int m42116hashCodeimpl = (((hashCode2 + (userId == null ? 0 : UserId.m42116hashCodeimpl(userId.m42120unboximpl()))) * 31) + C2689b.m32716a(this.flags)) * 31;
        String str2 = this.edited;
        int hashCode3 = (m42116hashCodeimpl + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this._constrainedWidth;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        String str3 = this.timestamp;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.username;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.usernameColor;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.roleColor;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        boolean z = this.shouldShowRoleDot;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode8 + i) * 31;
        boolean z2 = this.shouldShowRoleOnName;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        Integer num3 = this.colorString;
        int hashCode9 = (i4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.avatarURL;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.avatarDecorationURL;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<Embed> list = this.embeds;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        List<Attachment> list2 = this.attachments;
        int hashCode13 = (hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Float f2 = this.attachmentsOpacity;
        int hashCode14 = (hashCode13 + (f2 == null ? 0 : f2.hashCode())) * 31;
        StructurableText structurableText = this.content;
        int hashCode15 = (hashCode14 + (structurableText == null ? 0 : structurableText.hashCode())) * 31;
        List<UploadProgress> list3 = this.progress;
        int hashCode16 = (hashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MessageReaction> list4 = this.reactions;
        int hashCode17 = (hashCode16 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool = this.useAddBurstReaction;
        int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<CodedLinkEmbed> list5 = this.codedLinks;
        int hashCode19 = (hashCode18 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<Sticker> list6 = this.stickers;
        int hashCode20 = (hashCode19 + (list6 == null ? 0 : list6.hashCode())) * 31;
        RoleIcon roleIcon = this.roleIcon;
        int hashCode21 = (hashCode20 + (roleIcon == null ? 0 : roleIcon.hashCode())) * 31;
        ConnectionsRoleTag connectionsRoleTag = this.connectionsRoleTag;
        int hashCode22 = (hashCode21 + (connectionsRoleTag == null ? 0 : connectionsRoleTag.hashCode())) * 31;
        ThreadEmbed threadEmbed = this.threadEmbed;
        int hashCode23 = (hashCode22 + (threadEmbed == null ? 0 : threadEmbed.hashCode())) * 31;
        boolean z3 = this.mentioned;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode23 + i5) * 31;
        Boolean bool2 = this.gifAutoPlay;
        int hashCode24 = (i6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.animateEmoji;
        int hashCode25 = (hashCode24 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        ReferencedMessage referencedMessage = this.referencedMessage;
        int hashCode26 = (hashCode25 + (referencedMessage == null ? 0 : referencedMessage.hashCode())) * 31;
        ExecutedCommand executedCommand = this.executedCommand;
        int hashCode27 = (hashCode26 + (executedCommand == null ? 0 : executedCommand.hashCode())) * 31;
        List<Component> list7 = this.components;
        int hashCode28 = (hashCode27 + (list7 == null ? 0 : list7.hashCode())) * 31;
        String str7 = this.threadStarterMessageHeader;
        int hashCode29 = (hashCode28 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool4 = this.communicationDisabled;
        int hashCode30 = (hashCode29 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str8 = this.tagText;
        int hashCode31 = (hashCode30 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool5 = this.tagVerified;
        int hashCode32 = (hashCode31 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num4 = this.tagTextColor;
        int hashCode33 = (hashCode32 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.tagBackgroundColor;
        int hashCode34 = (hashCode33 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str9 = this.tagType;
        int hashCode35 = (hashCode34 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.opTagText;
        int hashCode36 = (hashCode35 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool6 = this.showRemixButton;
        int hashCode37 = (hashCode36 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num6 = this.remixButtonIconColor;
        int hashCode38 = (hashCode37 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.remixButtonBackgroundColor;
        int hashCode39 = (hashCode38 + (num7 == null ? 0 : num7.hashCode())) * 31;
        EphemeralIndication ephemeralIndication = this.ephemeralIndication;
        int hashCode40 = (hashCode39 + (ephemeralIndication == null ? 0 : ephemeralIndication.hashCode())) * 31;
        SurveyIndication surveyIndication = this.surveyIndication;
        int hashCode41 = (hashCode40 + (surveyIndication == null ? 0 : surveyIndication.hashCode())) * 31;
        InteractionStatus interactionStatus = this.interactionStatus;
        int hashCode42 = (hashCode41 + (interactionStatus == null ? 0 : interactionStatus.hashCode())) * 31;
        Boolean bool7 = this.useAttachmentGridLayout;
        int hashCode43 = (hashCode42 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.useAttachmentUploadPreview;
        int hashCode44 = (hashCode43 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.isCurrentUserMessageAuthor;
        int hashCode45 = (hashCode44 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        String str11 = this.obscureLearnMoreLabel;
        int hashCode46 = (hashCode45 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.title;
        int hashCode47 = (hashCode46 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.description;
        int hashCode48 = (hashCode47 + (str13 == null ? 0 : str13.hashCode())) * 31;
        List<String> list8 = this.avatarURLs;
        int hashCode49 = (hashCode48 + (list8 == null ? 0 : list8.hashCode())) * 31;
        Boolean bool10 = this.isCallActive;
        int hashCode50 = (hashCode49 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.missed;
        int hashCode51 = (hashCode50 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Long l = this.rawMilliseconds;
        int hashCode52 = (hashCode51 + (l == null ? 0 : l.hashCode())) * 31;
        Sticker sticker = this.sticker;
        int hashCode53 = (hashCode52 + (sticker == null ? 0 : sticker.hashCode())) * 31;
        String str14 = this.stickerLabel;
        int hashCode54 = (hashCode53 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.buttonLabel;
        int hashCode55 = (hashCode54 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool12 = this.showInviteToSpeakButton;
        int hashCode56 = (hashCode55 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        ActivityInviteEmbed activityInviteEmbed = this.activityInviteEmbed;
        int hashCode57 = (hashCode56 + (activityInviteEmbed == null ? 0 : activityInviteEmbed.hashCode())) * 31;
        boolean z4 = this.isFirstForumPostMessage;
        int i7 = (hashCode57 + (z4 ? 1 : z4 ? 1 : 0)) * 31;
        ForumPostActions forumPostActions = this.postActions;
        int hashCode58 = (i7 + (forumPostActions == null ? 0 : forumPostActions.hashCode())) * 31;
        AutoModerationContext autoModerationContext = this.autoModerationContext;
        int hashCode59 = (hashCode58 + (autoModerationContext == null ? 0 : autoModerationContext.hashCode())) * 31;
        List<GiftEmbed> list9 = this.giftCodes;
        int hashCode60 = (hashCode59 + (list9 == null ? 0 : list9.hashCode())) * 31;
        GiftEmbed giftEmbed = this.referralTrialOffer;
        int hashCode61 = (hashCode60 + (giftEmbed == null ? 0 : giftEmbed.hashCode())) * 31;
        Integer num8 = this.totalMonthsSubscribed;
        int hashCode62 = (hashCode61 + (num8 == null ? 0 : num8.hashCode())) * 31;
        List<PostPreviewEmbed> list10 = this.postPreviewEmbeds;
        int hashCode63 = (hashCode62 + (list10 == null ? 0 : list10.hashCode())) * 31;
        ChannelPromptData channelPromptData = this.channelPromptData;
        int hashCode64 = (hashCode63 + (channelPromptData == null ? 0 : channelPromptData.hashCode())) * 31;
        SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed = this.safetyPolicyNoticeEmbed;
        int hashCode65 = (hashCode64 + (safetyPolicyNoticeEmbed == null ? 0 : safetyPolicyNoticeEmbed.hashCode())) * 31;
        PollData pollData = this.pollData;
        return hashCode65 + (pollData != null ? pollData.hashCode() : 0);
    }

    public final Boolean isCallActive() {
        return this.isCallActive;
    }

    public final Boolean isCurrentUserMessageAuthor() {
        return this.isCurrentUserMessageAuthor;
    }

    public final boolean isFirstForumPostMessage() {
        return this.isFirstForumPostMessage;
    }

    public String toString() {
        MessageType messageType = this.type;
        String m42079toStringimpl = MessageId.m42079toStringimpl(this.f8299id);
        String str = this.nonce;
        String m42079toStringimpl2 = str == null ? "null" : MessageId.m42079toStringimpl(str);
        String m42054toStringimpl = ChannelId.m42054toStringimpl(this.channelId);
        GuildId guildId = this.guildId;
        MessageState messageState = this.state;
        UserId userId = this.authorId;
        long j = this.flags;
        String str2 = this.edited;
        Float f = this._constrainedWidth;
        String str3 = this.timestamp;
        String str4 = this.username;
        Integer num = this.usernameColor;
        Integer num2 = this.roleColor;
        boolean z = this.shouldShowRoleDot;
        boolean z2 = this.shouldShowRoleOnName;
        Integer num3 = this.colorString;
        String str5 = this.avatarURL;
        String str6 = this.avatarDecorationURL;
        List<Embed> list = this.embeds;
        List<Attachment> list2 = this.attachments;
        Float f2 = this.attachmentsOpacity;
        StructurableText structurableText = this.content;
        List<UploadProgress> list3 = this.progress;
        List<MessageReaction> list4 = this.reactions;
        Boolean bool = this.useAddBurstReaction;
        List<CodedLinkEmbed> list5 = this.codedLinks;
        List<Sticker> list6 = this.stickers;
        RoleIcon roleIcon = this.roleIcon;
        ConnectionsRoleTag connectionsRoleTag = this.connectionsRoleTag;
        ThreadEmbed threadEmbed = this.threadEmbed;
        boolean z3 = this.mentioned;
        Boolean bool2 = this.gifAutoPlay;
        Boolean bool3 = this.animateEmoji;
        ReferencedMessage referencedMessage = this.referencedMessage;
        ExecutedCommand executedCommand = this.executedCommand;
        List<Component> list7 = this.components;
        String str7 = this.threadStarterMessageHeader;
        Boolean bool4 = this.communicationDisabled;
        String str8 = this.tagText;
        Boolean bool5 = this.tagVerified;
        Integer num4 = this.tagTextColor;
        Integer num5 = this.tagBackgroundColor;
        String str9 = this.tagType;
        String str10 = this.opTagText;
        Boolean bool6 = this.showRemixButton;
        Integer num6 = this.remixButtonIconColor;
        Integer num7 = this.remixButtonBackgroundColor;
        EphemeralIndication ephemeralIndication = this.ephemeralIndication;
        SurveyIndication surveyIndication = this.surveyIndication;
        InteractionStatus interactionStatus = this.interactionStatus;
        Boolean bool7 = this.useAttachmentGridLayout;
        Boolean bool8 = this.useAttachmentUploadPreview;
        Boolean bool9 = this.isCurrentUserMessageAuthor;
        String str11 = this.obscureLearnMoreLabel;
        String str12 = this.title;
        String str13 = this.description;
        List<String> list8 = this.avatarURLs;
        Boolean bool10 = this.isCallActive;
        Boolean bool11 = this.missed;
        Long l = this.rawMilliseconds;
        Sticker sticker = this.sticker;
        String str14 = this.stickerLabel;
        String str15 = this.buttonLabel;
        Boolean bool12 = this.showInviteToSpeakButton;
        ActivityInviteEmbed activityInviteEmbed = this.activityInviteEmbed;
        boolean z4 = this.isFirstForumPostMessage;
        ForumPostActions forumPostActions = this.postActions;
        AutoModerationContext autoModerationContext = this.autoModerationContext;
        List<GiftEmbed> list9 = this.giftCodes;
        GiftEmbed giftEmbed = this.referralTrialOffer;
        Integer num8 = this.totalMonthsSubscribed;
        List<PostPreviewEmbed> list10 = this.postPreviewEmbeds;
        ChannelPromptData channelPromptData = this.channelPromptData;
        SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed = this.safetyPolicyNoticeEmbed;
        PollData pollData = this.pollData;
        return "Message(type=" + messageType + ", id=" + m42079toStringimpl + ", nonce=" + m42079toStringimpl2 + ", channelId=" + m42054toStringimpl + ", guildId=" + guildId + ", state=" + messageState + ", authorId=" + userId + ", flags=" + j + ", edited=" + str2 + ", _constrainedWidth=" + f + ", timestamp=" + str3 + ", username=" + str4 + ", usernameColor=" + num + ", roleColor=" + num2 + ", shouldShowRoleDot=" + z + ", shouldShowRoleOnName=" + z2 + ", colorString=" + num3 + ", avatarURL=" + str5 + ", avatarDecorationURL=" + str6 + ", embeds=" + list + ", attachments=" + list2 + ", attachmentsOpacity=" + f2 + ", content=" + structurableText + ", progress=" + list3 + ", reactions=" + list4 + ", useAddBurstReaction=" + bool + ", codedLinks=" + list5 + ", stickers=" + list6 + ", roleIcon=" + roleIcon + ", connectionsRoleTag=" + connectionsRoleTag + ", threadEmbed=" + threadEmbed + ", mentioned=" + z3 + ", gifAutoPlay=" + bool2 + ", animateEmoji=" + bool3 + ", referencedMessage=" + referencedMessage + ", executedCommand=" + executedCommand + ", components=" + list7 + ", threadStarterMessageHeader=" + str7 + ", communicationDisabled=" + bool4 + ", tagText=" + str8 + ", tagVerified=" + bool5 + ", tagTextColor=" + num4 + ", tagBackgroundColor=" + num5 + ", tagType=" + str9 + ", opTagText=" + str10 + ", showRemixButton=" + bool6 + ", remixButtonIconColor=" + num6 + ", remixButtonBackgroundColor=" + num7 + ", ephemeralIndication=" + ephemeralIndication + ", surveyIndication=" + surveyIndication + ", interactionStatus=" + interactionStatus + ", useAttachmentGridLayout=" + bool7 + ", useAttachmentUploadPreview=" + bool8 + ", isCurrentUserMessageAuthor=" + bool9 + ", obscureLearnMoreLabel=" + str11 + ", title=" + str12 + ", description=" + str13 + ", avatarURLs=" + list8 + ", isCallActive=" + bool10 + ", missed=" + bool11 + ", rawMilliseconds=" + l + ", sticker=" + sticker + ", stickerLabel=" + str14 + ", buttonLabel=" + str15 + ", showInviteToSpeakButton=" + bool12 + ", activityInviteEmbed=" + activityInviteEmbed + ", isFirstForumPostMessage=" + z4 + ", postActions=" + forumPostActions + ", autoModerationContext=" + autoModerationContext + ", giftCodes=" + list9 + ", referralTrialOffer=" + giftEmbed + ", totalMonthsSubscribed=" + num8 + ", postPreviewEmbeds=" + list10 + ", channelPromptData=" + channelPromptData + ", safetyPolicyNoticeEmbed=" + safetyPolicyNoticeEmbed + ", pollData=" + pollData + ")";
    }

    public /* synthetic */ Message(MessageType messageType, String str, String str2, long j, GuildId guildId, MessageState messageState, UserId userId, long j2, String str3, Float f, String str4, String str5, Integer num, Integer num2, boolean z, boolean z2, Integer num3, String str6, String str7, List list, List list2, Float f2, StructurableText structurableText, List list3, List list4, Boolean bool, List list5, List list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z3, Boolean bool2, Boolean bool3, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List list7, String str8, Boolean bool4, String str9, Boolean bool5, Integer num4, Integer num5, String str10, String str11, Boolean bool6, Integer num6, Integer num7, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str12, String str13, String str14, List list8, Boolean bool10, Boolean bool11, Long l, Sticker sticker, String str15, String str16, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z4, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List list9, GiftEmbed giftEmbed, Integer num8, List list10, ChannelPromptData channelPromptData, SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed, PollData pollData, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageType, str, (i & 4) != 0 ? null : str2, j, (i & 16) != 0 ? null : guildId, (i & 32) != 0 ? null : messageState, (i & 64) != 0 ? null : userId, (i & 128) != 0 ? 0L : j2, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : f, (i & 1024) != 0 ? null : str4, (i & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str5, (i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : num, (i & 8192) != 0 ? null : num2, (i & 16384) != 0 ? false : z, (i & 32768) != 0 ? false : z2, (i & 65536) != 0 ? null : num3, (i & 131072) != 0 ? null : str6, (i & 262144) != 0 ? null : str7, (i & 524288) != 0 ? null : list, (i & 1048576) != 0 ? null : list2, (i & 2097152) != 0 ? null : f2, (i & 4194304) != 0 ? null : structurableText, (i & 8388608) != 0 ? null : list3, (i & 16777216) != 0 ? null : list4, (i & 33554432) != 0 ? Boolean.FALSE : bool, (i & 67108864) != 0 ? null : list5, (i & 134217728) != 0 ? null : list6, (i & 268435456) != 0 ? null : roleIcon, (i & 536870912) != 0 ? null : connectionsRoleTag, (i & 1073741824) != 0 ? null : threadEmbed, z3, (i2 & 1) != 0 ? null : bool2, (i2 & 2) != 0 ? null : bool3, (i2 & 4) != 0 ? null : referencedMessage, (i2 & 8) != 0 ? null : executedCommand, (i2 & 16) != 0 ? null : list7, (i2 & 32) != 0 ? null : str8, (i2 & 64) != 0 ? null : bool4, (i2 & 128) != 0 ? null : str9, (i2 & 256) != 0 ? null : bool5, (i2 & 512) != 0 ? null : num4, (i2 & 1024) != 0 ? null : num5, (i2 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str10, (i2 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str11, (i2 & 8192) != 0 ? null : bool6, (i2 & 16384) != 0 ? null : num6, (32768 & i2) != 0 ? null : num7, (i2 & 65536) != 0 ? null : ephemeralIndication, (i2 & 131072) != 0 ? null : surveyIndication, (i2 & 262144) != 0 ? null : interactionStatus, (i2 & 524288) != 0 ? Boolean.FALSE : bool7, (i2 & 1048576) != 0 ? Boolean.FALSE : bool8, (i2 & 2097152) != 0 ? Boolean.FALSE : bool9, (i2 & 4194304) != 0 ? null : str12, (8388608 & i2) != 0 ? null : str13, (16777216 & i2) != 0 ? null : str14, (33554432 & i2) != 0 ? null : list8, (67108864 & i2) != 0 ? null : bool10, (134217728 & i2) != 0 ? null : bool11, (268435456 & i2) != 0 ? null : l, (536870912 & i2) != 0 ? null : sticker, (1073741824 & i2) != 0 ? null : str15, (i2 & Integer.MIN_VALUE) != 0 ? null : str16, (i3 & 1) != 0 ? null : bool12, (i3 & 2) != 0 ? null : activityInviteEmbed, (i3 & 4) != 0 ? false : z4, (i3 & 8) != 0 ? null : forumPostActions, (i3 & 16) != 0 ? null : autoModerationContext, (i3 & 32) != 0 ? null : list9, (i3 & 64) != 0 ? null : giftEmbed, (i3 & 128) != 0 ? null : num8, (i3 & 256) != 0 ? null : list10, (i3 & 512) != 0 ? null : channelPromptData, (i3 & 1024) != 0 ? null : safetyPolicyNoticeEmbed, (i3 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : pollData, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Message(MessageType messageType, String str, String str2, long j, GuildId guildId, MessageState messageState, UserId userId, long j2, String str3, Float f, String str4, String str5, Integer num, Integer num2, boolean z, boolean z2, Integer num3, String str6, String str7, List<Embed> list, List<Attachment> list2, Float f2, StructurableText structurableText, List<UploadProgress> list3, List<MessageReaction> list4, Boolean bool, List<? extends CodedLinkEmbed> list5, List<Sticker> list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z3, Boolean bool2, Boolean bool3, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List<? extends Component> list7, String str8, Boolean bool4, String str9, Boolean bool5, Integer num4, Integer num5, String str10, String str11, Boolean bool6, Integer num6, Integer num7, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str12, String str13, String str14, List<String> list8, Boolean bool10, Boolean bool11, Long l, Sticker sticker, String str15, String str16, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z4, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List<? extends GiftEmbed> list9, GiftEmbed giftEmbed, Integer num8, List<PostPreviewEmbed> list10, ChannelPromptData channelPromptData, SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed, PollData pollData) {
        super(null);
        Lazy m7601a;
        this.type = messageType;
        this.f8299id = str;
        this.nonce = str2;
        this.channelId = j;
        this.guildId = guildId;
        this.state = messageState;
        this.authorId = userId;
        this.flags = j2;
        this.edited = str3;
        this._constrainedWidth = f;
        this.timestamp = str4;
        this.username = str5;
        this.usernameColor = num;
        this.roleColor = num2;
        this.shouldShowRoleDot = z;
        this.shouldShowRoleOnName = z2;
        this.colorString = num3;
        this.avatarURL = str6;
        this.avatarDecorationURL = str7;
        this.embeds = list;
        this.attachments = list2;
        this.attachmentsOpacity = f2;
        this.content = structurableText;
        this.progress = list3;
        this.reactions = list4;
        this.useAddBurstReaction = bool;
        this.codedLinks = list5;
        this.stickers = list6;
        this.roleIcon = roleIcon;
        this.connectionsRoleTag = connectionsRoleTag;
        this.threadEmbed = threadEmbed;
        this.mentioned = z3;
        this.gifAutoPlay = bool2;
        this.animateEmoji = bool3;
        this.referencedMessage = referencedMessage;
        this.executedCommand = executedCommand;
        this.components = list7;
        this.threadStarterMessageHeader = str8;
        this.communicationDisabled = bool4;
        this.tagText = str9;
        this.tagVerified = bool5;
        this.tagTextColor = num4;
        this.tagBackgroundColor = num5;
        this.tagType = str10;
        this.opTagText = str11;
        this.showRemixButton = bool6;
        this.remixButtonIconColor = num6;
        this.remixButtonBackgroundColor = num7;
        this.ephemeralIndication = ephemeralIndication;
        this.surveyIndication = surveyIndication;
        this.interactionStatus = interactionStatus;
        this.useAttachmentGridLayout = bool7;
        this.useAttachmentUploadPreview = bool8;
        this.isCurrentUserMessageAuthor = bool9;
        this.obscureLearnMoreLabel = str12;
        this.title = str13;
        this.description = str14;
        this.avatarURLs = list8;
        this.isCallActive = bool10;
        this.missed = bool11;
        this.rawMilliseconds = l;
        this.sticker = sticker;
        this.stickerLabel = str15;
        this.buttonLabel = str16;
        this.showInviteToSpeakButton = bool12;
        this.activityInviteEmbed = activityInviteEmbed;
        this.isFirstForumPostMessage = z4;
        this.postActions = forumPostActions;
        this.autoModerationContext = autoModerationContext;
        this.giftCodes = list9;
        this.referralTrialOffer = giftEmbed;
        this.totalMonthsSubscribed = num8;
        this.postPreviewEmbeds = list10;
        this.channelPromptData = channelPromptData;
        this.safetyPolicyNoticeEmbed = safetyPolicyNoticeEmbed;
        this.pollData = pollData;
        m7601a = C11577n.m7601a(new Message$constrainedWidth$2(this));
        this.constrainedWidth$delegate = m7601a;
    }
}

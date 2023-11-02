package com.discord.media.utils;

import android.content.Context;
import android.net.Uri;
import com.discord.media.utils.ContentResolverMedia;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m14357d2 = {"<anonymous>", "", "Lcom/discord/media/utils/ContentResolverMedia;", "contentUri", "Landroid/net/Uri;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class ContentResolverMedia$Companion$getMedia$performQuery$1 extends AbstractC9614s implements Function1<Uri, List<? extends ContentResolverMedia>> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $queryLimit;
    final /* synthetic */ Integer $queryOffset;
    final /* synthetic */ ContentResolverMedia.QueryType $queryType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentResolverMedia$Companion$getMedia$performQuery$1(Context context, ContentResolverMedia.QueryType queryType, int i, Integer num) {
        super(1);
        this.$context = context;
        this.$queryType = queryType;
        this.$queryLimit = i;
        this.$queryOffset = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<ContentResolverMedia> invoke(Uri contentUri) {
        List<ContentResolverMedia> queryMedia;
        C9612q.m13917h(contentUri, "contentUri");
        queryMedia = ContentResolverMedia.Companion.queryMedia(this.$context, this.$queryType, this.$queryLimit, contentUri, this.$queryOffset);
        return queryMedia;
    }
}
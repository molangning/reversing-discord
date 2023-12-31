package com.discord.misc.utilities.measure;

import android.content.Context;
import android.util.Size;
import android.view.View;
import com.discord.misc.utilities.measure.HeadlessViewMeasurer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a:\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0014\b\b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086\bø\u0001\u0000\u001a>\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, m14357d2 = {"measureHeadlessView", "Landroid/util/Size;", "T", "Landroid/view/View;", "Landroid/content/Context;", "configureView", "Lkotlin/Function1;", "", "measureBounds", "Lcom/discord/misc/utilities/measure/HeadlessViewMeasurer$MeasureBounds;", "clazz", "Ljava/lang/Class;", "misc_utilities_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class HeadlessViewMeasurerExtensionsKt {
    public static final <T extends View> Size measureHeadlessView(Context context, Class<T> clazz, Function1<? super T, Unit> configureView, HeadlessViewMeasurer.MeasureBounds measureBounds) {
        C9612q.m13917h(context, "<this>");
        C9612q.m13917h(clazz, "clazz");
        C9612q.m13917h(configureView, "configureView");
        C9612q.m13917h(measureBounds, "measureBounds");
        return new HeadlessViewMeasurer(clazz).measure$misc_utilities_release(context, configureView, measureBounds);
    }

    public static final /* synthetic */ <T extends View> Size measureHeadlessView(Context context, Function1<? super T, Unit> configureView, HeadlessViewMeasurer.MeasureBounds measureBounds) {
        C9612q.m13917h(context, "<this>");
        C9612q.m13917h(configureView, "configureView");
        C9612q.m13917h(measureBounds, "measureBounds");
        C9612q.m13912m(4, "T");
        return measureHeadlessView(context, View.class, configureView, measureBounds);
    }
}

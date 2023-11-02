package com.discord.theme;

import android.content.Context;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0003\b\u00ad\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u00ad\u0004\u001a\u00020\u00062\u0007\u0010®\u0004\u001a\u00020\u00062\u0007\u0010¯\u0004\u001a\u00020\u0006H\u0016J\u001b\u0010°\u0004\u001a\u00020\u00062\u0007\u0010±\u0004\u001a\u00020\u00062\u0007\u0010²\u0004\u001a\u00020\u0006H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0014\u0010\u0017\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0014\u0010\u0019\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0014\u0010\u001b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR\u0014\u0010\u001d\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u0014\u0010\u001f\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\bR\u0014\u0010!\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u0014\u0010#\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\bR\u0014\u0010%\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR\u0014\u0010'\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\bR\u0014\u0010)\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\bR\u0014\u0010+\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\bR\u0014\u0010-\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\bR\u0014\u0010/\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\bR\u0014\u00101\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\bR\u0014\u00103\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\bR\u0014\u00105\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\bR\u0014\u00107\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\bR\u0014\u00109\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\bR\u0014\u0010;\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\bR\u0014\u0010=\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\bR\u0014\u0010?\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\bR\u0014\u0010A\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\bR\u0014\u0010C\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\bR\u0014\u0010E\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\bR\u0014\u0010G\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\bR\u0014\u0010I\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\bR\u0014\u0010K\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\bR\u0014\u0010M\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\bR\u0014\u0010O\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\bR\u0014\u0010Q\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\bR\u0014\u0010S\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010\bR\u0014\u0010U\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010\bR\u0014\u0010W\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010\bR\u0014\u0010Y\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010\bR\u0014\u0010[\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010\bR\u0014\u0010]\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010\bR\u0014\u0010_\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010\bR\u0014\u0010a\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010\bR\u0014\u0010c\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010\bR\u0014\u0010e\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010\bR\u0014\u0010g\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010\bR\u0014\u0010i\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010\bR\u0014\u0010k\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010\bR\u0014\u0010m\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010\bR\u0014\u0010o\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010\bR\u0014\u0010q\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010\bR\u0014\u0010s\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010\bR\u0014\u0010u\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010\bR\u0014\u0010w\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010\bR\u0014\u0010y\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010\bR\u0014\u0010{\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010\bR\u0014\u0010}\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\bR\u0015\u0010\u007f\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010\bR\u0016\u0010\u0081\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010\bR\u0016\u0010\u0083\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010\bR\u0016\u0010\u0085\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010\bR\u0016\u0010\u0087\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010\bR\u0016\u0010\u0089\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010\bR\u0016\u0010\u008b\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010\bR\u0016\u0010\u008d\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010\bR\u0016\u0010\u008f\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010\bR\u0016\u0010\u0091\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010\bR\u0016\u0010\u0093\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010\bR\u0016\u0010\u0095\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010\bR\u0016\u0010\u0097\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010\bR\u0016\u0010\u0099\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010\bR\u0016\u0010\u009b\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010\bR\u0016\u0010\u009d\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010\bR\u0016\u0010\u009f\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b \u0001\u0010\bR\u0016\u0010¡\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¢\u0001\u0010\bR\u0016\u0010£\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¤\u0001\u0010\bR\u0016\u0010¥\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¦\u0001\u0010\bR\u0016\u0010§\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¨\u0001\u0010\bR\u0016\u0010©\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bª\u0001\u0010\bR\u0016\u0010«\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¬\u0001\u0010\bR\u0016\u0010\u00ad\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0001\u0010\bR\u0016\u0010¯\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b°\u0001\u0010\bR\u0016\u0010±\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b²\u0001\u0010\bR\u0016\u0010³\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b´\u0001\u0010\bR\u0016\u0010µ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¶\u0001\u0010\bR\u0016\u0010·\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¸\u0001\u0010\bR\u0016\u0010¹\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bº\u0001\u0010\bR\u0016\u0010»\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¼\u0001\u0010\bR\u0016\u0010½\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¾\u0001\u0010\bR\u0016\u0010¿\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0001\u0010\bR\u0016\u0010Á\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÂ\u0001\u0010\bR\u0016\u0010Ã\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÄ\u0001\u0010\bR\u0016\u0010Å\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0001\u0010\bR\u0016\u0010Ç\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÈ\u0001\u0010\bR\u0016\u0010É\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÊ\u0001\u0010\bR\u0016\u0010Ë\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÌ\u0001\u0010\bR\u0016\u0010Í\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÎ\u0001\u0010\bR\u0016\u0010Ï\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÐ\u0001\u0010\bR\u0016\u0010Ñ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÒ\u0001\u0010\bR\u0016\u0010Ó\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÔ\u0001\u0010\bR\u0016\u0010Õ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÖ\u0001\u0010\bR\u0016\u0010×\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bØ\u0001\u0010\bR\u0016\u0010Ù\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÚ\u0001\u0010\bR\u0016\u0010Û\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÜ\u0001\u0010\bR\u0016\u0010Ý\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÞ\u0001\u0010\bR\u0016\u0010ß\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bà\u0001\u0010\bR\u0016\u0010á\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bâ\u0001\u0010\bR\u0016\u0010ã\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bä\u0001\u0010\bR\u0016\u0010å\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bæ\u0001\u0010\bR\u0016\u0010ç\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bè\u0001\u0010\bR\u0016\u0010é\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bê\u0001\u0010\bR\u0016\u0010ë\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bì\u0001\u0010\bR\u0016\u0010í\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bî\u0001\u0010\bR\u0016\u0010ï\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bð\u0001\u0010\bR\u0016\u0010ñ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bò\u0001\u0010\bR\u0016\u0010ó\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bô\u0001\u0010\bR\u0016\u0010õ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bö\u0001\u0010\bR\u0016\u0010÷\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bø\u0001\u0010\bR\u0016\u0010ù\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bú\u0001\u0010\bR\u0016\u0010û\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bü\u0001\u0010\bR\u0016\u0010ý\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bþ\u0001\u0010\bR\u0016\u0010ÿ\u0001\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0002\u0010\bR\u0016\u0010\u0081\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0002\u0010\bR\u0016\u0010\u0083\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0002\u0010\bR\u0016\u0010\u0085\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0002\u0010\bR\u0016\u0010\u0087\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0002\u0010\bR\u0016\u0010\u0089\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0002\u0010\bR\u0016\u0010\u008b\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0002\u0010\bR\u0016\u0010\u008d\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0002\u0010\bR\u0016\u0010\u008f\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0002\u0010\bR\u0016\u0010\u0091\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0002\u0010\bR\u0016\u0010\u0093\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0002\u0010\bR\u0016\u0010\u0095\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0002\u0010\bR\u0016\u0010\u0097\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0002\u0010\bR\u0016\u0010\u0099\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0002\u0010\bR\u0016\u0010\u009b\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0002\u0010\bR\u0016\u0010\u009d\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0002\u0010\bR\u0016\u0010\u009f\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b \u0002\u0010\bR\u0016\u0010¡\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¢\u0002\u0010\bR\u0016\u0010£\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¤\u0002\u0010\bR\u0016\u0010¥\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¦\u0002\u0010\bR\u0016\u0010§\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¨\u0002\u0010\bR\u0016\u0010©\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bª\u0002\u0010\bR\u0016\u0010«\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¬\u0002\u0010\bR\u0016\u0010\u00ad\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0002\u0010\bR\u0016\u0010¯\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b°\u0002\u0010\bR\u0016\u0010±\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b²\u0002\u0010\bR\u0016\u0010³\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b´\u0002\u0010\bR\u0016\u0010µ\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¶\u0002\u0010\bR\u0016\u0010·\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¸\u0002\u0010\bR\u0016\u0010¹\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bº\u0002\u0010\bR\u0016\u0010»\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¼\u0002\u0010\bR\u0016\u0010½\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¾\u0002\u0010\bR\u0016\u0010¿\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0002\u0010\bR\u0016\u0010Á\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÂ\u0002\u0010\bR\u0016\u0010Ã\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÄ\u0002\u0010\bR\u0016\u0010Å\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0002\u0010\bR\u0016\u0010Ç\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÈ\u0002\u0010\bR\u0016\u0010É\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÊ\u0002\u0010\bR\u0016\u0010Ë\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÌ\u0002\u0010\bR\u0016\u0010Í\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÎ\u0002\u0010\bR\u0016\u0010Ï\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÐ\u0002\u0010\bR\u0016\u0010Ñ\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÒ\u0002\u0010\bR\u0016\u0010Ó\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÔ\u0002\u0010\bR\u0016\u0010Õ\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÖ\u0002\u0010\bR\u0016\u0010×\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bØ\u0002\u0010\bR\u0016\u0010Ù\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÚ\u0002\u0010\bR\u0016\u0010Û\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÜ\u0002\u0010\bR\u0016\u0010Ý\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÞ\u0002\u0010\bR\u0016\u0010ß\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bà\u0002\u0010\bR\u0016\u0010á\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bâ\u0002\u0010\bR\u0016\u0010ã\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bä\u0002\u0010\bR\u0016\u0010å\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bæ\u0002\u0010\bR\u0016\u0010ç\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bè\u0002\u0010\bR\u0016\u0010é\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bê\u0002\u0010\bR\u0016\u0010ë\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bì\u0002\u0010\bR\u0016\u0010í\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bî\u0002\u0010\bR\u0016\u0010ï\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bð\u0002\u0010\bR\u0016\u0010ñ\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bò\u0002\u0010\bR\u0016\u0010ó\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bô\u0002\u0010\bR\u0016\u0010õ\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bö\u0002\u0010\bR\u0016\u0010÷\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bø\u0002\u0010\bR\u0016\u0010ù\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bú\u0002\u0010\bR\u0016\u0010û\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bü\u0002\u0010\bR\u0016\u0010ý\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bþ\u0002\u0010\bR\u0016\u0010ÿ\u0002\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0003\u0010\bR\u0016\u0010\u0081\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0003\u0010\bR\u0016\u0010\u0083\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0003\u0010\bR\u0016\u0010\u0085\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0003\u0010\bR\u0016\u0010\u0087\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0003\u0010\bR\u0016\u0010\u0089\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0003\u0010\bR\u0016\u0010\u008b\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0003\u0010\bR\u0016\u0010\u008d\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0003\u0010\bR\u0016\u0010\u008f\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0003\u0010\bR\u0016\u0010\u0091\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0003\u0010\bR\u0016\u0010\u0093\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0003\u0010\bR\u0016\u0010\u0095\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0003\u0010\bR\u0016\u0010\u0097\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0003\u0010\bR\u0016\u0010\u0099\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0003\u0010\bR\u0016\u0010\u009b\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0003\u0010\bR\u0016\u0010\u009d\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0003\u0010\bR\u0016\u0010\u009f\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b \u0003\u0010\bR\u0016\u0010¡\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¢\u0003\u0010\bR\u0016\u0010£\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¤\u0003\u0010\bR\u0016\u0010¥\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¦\u0003\u0010\bR\u0016\u0010§\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¨\u0003\u0010\bR\u0016\u0010©\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bª\u0003\u0010\bR\u0016\u0010«\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¬\u0003\u0010\bR\u0016\u0010\u00ad\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0003\u0010\bR\u0016\u0010¯\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b°\u0003\u0010\bR\u0016\u0010±\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b²\u0003\u0010\bR\u0016\u0010³\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b´\u0003\u0010\bR\u0016\u0010µ\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¶\u0003\u0010\bR\u0016\u0010·\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¸\u0003\u0010\bR\u0016\u0010¹\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bº\u0003\u0010\bR\u0016\u0010»\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¼\u0003\u0010\bR\u0016\u0010½\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¾\u0003\u0010\bR\u0016\u0010¿\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0003\u0010\bR\u0016\u0010Á\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÂ\u0003\u0010\bR\u0016\u0010Ã\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÄ\u0003\u0010\bR\u0016\u0010Å\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0003\u0010\bR\u0016\u0010Ç\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÈ\u0003\u0010\bR\u0016\u0010É\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÊ\u0003\u0010\bR\u0016\u0010Ë\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÌ\u0003\u0010\bR\u0016\u0010Í\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÎ\u0003\u0010\bR\u0016\u0010Ï\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÐ\u0003\u0010\bR\u0016\u0010Ñ\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÒ\u0003\u0010\bR\u0016\u0010Ó\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÔ\u0003\u0010\bR\u0016\u0010Õ\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÖ\u0003\u0010\bR\u0016\u0010×\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bØ\u0003\u0010\bR\u0016\u0010Ù\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÚ\u0003\u0010\bR\u0016\u0010Û\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÜ\u0003\u0010\bR\u0016\u0010Ý\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÞ\u0003\u0010\bR\u0016\u0010ß\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bà\u0003\u0010\bR\u0016\u0010á\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bâ\u0003\u0010\bR\u0016\u0010ã\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bä\u0003\u0010\bR\u0016\u0010å\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bæ\u0003\u0010\bR\u0016\u0010ç\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bè\u0003\u0010\bR\u0016\u0010é\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bê\u0003\u0010\bR\u0016\u0010ë\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bì\u0003\u0010\bR\u0016\u0010í\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bî\u0003\u0010\bR\u0016\u0010ï\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bð\u0003\u0010\bR\u0016\u0010ñ\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bò\u0003\u0010\bR\u0016\u0010ó\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bô\u0003\u0010\bR\u0016\u0010õ\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bö\u0003\u0010\bR\u0016\u0010÷\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bø\u0003\u0010\bR\u0016\u0010ù\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bú\u0003\u0010\bR\u0016\u0010û\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bü\u0003\u0010\bR\u0016\u0010ý\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bþ\u0003\u0010\bR\u0016\u0010ÿ\u0003\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0004\u0010\bR\u0016\u0010\u0081\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0004\u0010\bR\u0016\u0010\u0083\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0004\u0010\bR\u0016\u0010\u0085\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0004\u0010\bR\u0016\u0010\u0087\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0004\u0010\bR\u0016\u0010\u0089\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0004\u0010\bR\u0016\u0010\u008b\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0004\u0010\bR\u0016\u0010\u008d\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0004\u0010\bR\u0016\u0010\u008f\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0004\u0010\bR\u0016\u0010\u0091\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0004\u0010\bR\u0016\u0010\u0093\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0004\u0010\bR\u0016\u0010\u0095\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0004\u0010\bR\u0016\u0010\u0097\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0004\u0010\bR\u0016\u0010\u0099\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0004\u0010\bR\u0016\u0010\u009b\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0004\u0010\bR\u0016\u0010\u009d\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0004\u0010\bR\u0016\u0010\u009f\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b \u0004\u0010\bR\u0016\u0010¡\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¢\u0004\u0010\bR\u0016\u0010£\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¤\u0004\u0010\bR\u0016\u0010¥\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¦\u0004\u0010\bR\u0016\u0010§\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¨\u0004\u0010\bR\u0016\u0010©\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bª\u0004\u0010\bR\u0016\u0010«\u0004\u001a\u00020\u0006X\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b¬\u0004\u0010\b¨\u0006³\u0004"}, m14357d2 = {"Lcom/discord/theme/AmoledTheme;", "Lcom/discord/theme/DiscordTheme;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "activityCardBackground", "", "getActivityCardBackground", "()I", "androidNavigationBarBackground", "getAndroidNavigationBarBackground", "androidNavigationScrimBackground", "getAndroidNavigationScrimBackground", "androidRipple", "getAndroidRipple", "backgroundAccent", "getBackgroundAccent", "backgroundFloating", "getBackgroundFloating", "backgroundMentioned", "getBackgroundMentioned", "backgroundMentionedHover", "getBackgroundMentionedHover", "backgroundMessageAutomod", "getBackgroundMessageAutomod", "backgroundMessageAutomodHover", "getBackgroundMessageAutomodHover", "backgroundMessageHighlight", "getBackgroundMessageHighlight", "backgroundMessageHighlightHover", "getBackgroundMessageHighlightHover", "backgroundMessageHover", "getBackgroundMessageHover", "backgroundMobilePrimary", "getBackgroundMobilePrimary", "backgroundMobileSecondary", "getBackgroundMobileSecondary", "backgroundModifierAccent", "getBackgroundModifierAccent", "backgroundModifierAccent2", "getBackgroundModifierAccent2", "backgroundModifierActive", "getBackgroundModifierActive", "backgroundModifierHover", "getBackgroundModifierHover", "backgroundModifierSelected", "getBackgroundModifierSelected", "backgroundNestedFloating", "getBackgroundNestedFloating", "backgroundPrimary", "getBackgroundPrimary", "backgroundSecondary", "getBackgroundSecondary", "backgroundSecondaryAlt", "getBackgroundSecondaryAlt", "backgroundTertiary", "getBackgroundTertiary", "bgBackdrop", "getBgBackdrop", "bgBackdropNoOpacity", "getBgBackdropNoOpacity", "bgBasePrimary", "getBgBasePrimary", "bgBaseSecondary", "getBgBaseSecondary", "bgBaseTertiary", "getBgBaseTertiary", "bgModFaint", "getBgModFaint", "bgModStrong", "getBgModStrong", "bgModSubtle", "getBgModSubtle", "bgSurfaceOverlay", "getBgSurfaceOverlay", "bgSurfaceOverlayTmp", "getBgSurfaceOverlayTmp", "bgSurfaceRaised", "getBgSurfaceRaised", "black", "getBlack", "blurFallback", "getBlurFallback", "blurFallbackPressed", "getBlurFallbackPressed", "borderFaint", "getBorderFaint", "borderStrong", "getBorderStrong", "borderSubtle", "getBorderSubtle", "bugReporterModalSubmittingBackground", "getBugReporterModalSubmittingBackground", "buttonCreatorRevenueBackground", "getButtonCreatorRevenueBackground", "buttonDangerBackground", "getButtonDangerBackground", "buttonDangerBackgroundActive", "getButtonDangerBackgroundActive", "buttonDangerBackgroundDisabled", "getButtonDangerBackgroundDisabled", "buttonDangerBackgroundHover", "getButtonDangerBackgroundHover", "buttonOutlineBrandBackground", "getButtonOutlineBrandBackground", "buttonOutlineBrandBackgroundActive", "getButtonOutlineBrandBackgroundActive", "buttonOutlineBrandBackgroundHover", "getButtonOutlineBrandBackgroundHover", "buttonOutlineBrandBorder", "getButtonOutlineBrandBorder", "buttonOutlineBrandBorderActive", "getButtonOutlineBrandBorderActive", "buttonOutlineBrandBorderHover", "getButtonOutlineBrandBorderHover", "buttonOutlineBrandText", "getButtonOutlineBrandText", "buttonOutlineBrandTextActive", "getButtonOutlineBrandTextActive", "buttonOutlineBrandTextHover", "getButtonOutlineBrandTextHover", "buttonOutlineDangerBackground", "getButtonOutlineDangerBackground", "buttonOutlineDangerBackgroundActive", "getButtonOutlineDangerBackgroundActive", "buttonOutlineDangerBackgroundHover", "getButtonOutlineDangerBackgroundHover", "buttonOutlineDangerBorder", "getButtonOutlineDangerBorder", "buttonOutlineDangerBorderActive", "getButtonOutlineDangerBorderActive", "buttonOutlineDangerBorderHover", "getButtonOutlineDangerBorderHover", "buttonOutlineDangerText", "getButtonOutlineDangerText", "buttonOutlineDangerTextActive", "getButtonOutlineDangerTextActive", "buttonOutlineDangerTextHover", "getButtonOutlineDangerTextHover", "buttonOutlinePositiveBackground", "getButtonOutlinePositiveBackground", "buttonOutlinePositiveBackgroundActive", "getButtonOutlinePositiveBackgroundActive", "buttonOutlinePositiveBackgroundHover", "getButtonOutlinePositiveBackgroundHover", "buttonOutlinePositiveBorder", "getButtonOutlinePositiveBorder", "buttonOutlinePositiveBorderActive", "getButtonOutlinePositiveBorderActive", "buttonOutlinePositiveBorderHover", "getButtonOutlinePositiveBorderHover", "buttonOutlinePositiveText", "getButtonOutlinePositiveText", "buttonOutlinePositiveTextActive", "getButtonOutlinePositiveTextActive", "buttonOutlinePositiveTextHover", "getButtonOutlinePositiveTextHover", "buttonOutlinePrimaryBackground", "getButtonOutlinePrimaryBackground", "buttonOutlinePrimaryBackgroundActive", "getButtonOutlinePrimaryBackgroundActive", "buttonOutlinePrimaryBackgroundHover", "getButtonOutlinePrimaryBackgroundHover", "buttonOutlinePrimaryBorder", "getButtonOutlinePrimaryBorder", "buttonOutlinePrimaryBorderActive", "getButtonOutlinePrimaryBorderActive", "buttonOutlinePrimaryBorderHover", "getButtonOutlinePrimaryBorderHover", "buttonOutlinePrimaryText", "getButtonOutlinePrimaryText", "buttonOutlinePrimaryTextActive", "getButtonOutlinePrimaryTextActive", "buttonOutlinePrimaryTextHover", "getButtonOutlinePrimaryTextHover", "buttonPositiveBackground", "getButtonPositiveBackground", "buttonPositiveBackgroundActive", "getButtonPositiveBackgroundActive", "buttonPositiveBackgroundDisabled", "getButtonPositiveBackgroundDisabled", "buttonPositiveBackgroundHover", "getButtonPositiveBackgroundHover", "buttonSecondaryBackground", "getButtonSecondaryBackground", "buttonSecondaryBackgroundActive", "getButtonSecondaryBackgroundActive", "buttonSecondaryBackgroundDisabled", "getButtonSecondaryBackgroundDisabled", "buttonSecondaryBackgroundHover", "getButtonSecondaryBackgroundHover", "cardGradientBg", "getCardGradientBg", "cardGradientPressedBg", "getCardGradientPressedBg", "cardPrimaryBg", "getCardPrimaryBg", "cardPrimaryPressedBg", "getCardPrimaryPressedBg", "cardSecondaryBg", "getCardSecondaryBg", "cardSecondaryPressedBg", "getCardSecondaryPressedBg", "channelIcon", "getChannelIcon", "channelTextAreaPlaceholder", "getChannelTextAreaPlaceholder", "channelsDefault", "getChannelsDefault", "channeltextareaBackground", "getChanneltextareaBackground", "chatBackground", "getChatBackground", "chatBorder", "getChatBorder", "chatInputContainerBackground", "getChatInputContainerBackground", "chatSwipeToReplyBackground", "getChatSwipeToReplyBackground", "controlBrandForeground", "getControlBrandForeground", "controlBrandForegroundNew", "getControlBrandForegroundNew", "creatorRevenueIconGradientEnd", "getCreatorRevenueIconGradientEnd", "creatorRevenueIconGradientStart", "getCreatorRevenueIconGradientStart", "creatorRevenueInfoBoxBackground", "getCreatorRevenueInfoBoxBackground", "creatorRevenueInfoBoxBorder", "getCreatorRevenueInfoBoxBorder", "creatorRevenueLockedChannelIcon", "getCreatorRevenueLockedChannelIcon", "creatorRevenueProgressBar", "getCreatorRevenueProgressBar", "deprecatedCardBg", "getDeprecatedCardBg", "deprecatedCardEditableBg", "getDeprecatedCardEditableBg", "deprecatedQuickswitcherInputBackground", "getDeprecatedQuickswitcherInputBackground", "deprecatedQuickswitcherInputPlaceholder", "getDeprecatedQuickswitcherInputPlaceholder", "deprecatedStoreBg", "getDeprecatedStoreBg", "deprecatedTextInputBg", "getDeprecatedTextInputBg", "deprecatedTextInputBorder", "getDeprecatedTextInputBorder", "deprecatedTextInputBorderDisabled", "getDeprecatedTextInputBorderDisabled", "deprecatedTextInputBorderHover", "getDeprecatedTextInputBorderHover", "deprecatedTextInputPrefix", "getDeprecatedTextInputPrefix", "displayBannerOverflowBackground", "getDisplayBannerOverflowBackground", "dividerStrong", "getDividerStrong", "dividerSubtle", "getDividerSubtle", "focusPrimary", "getFocusPrimary", "forumPostExtraMediaCountContainerBackground", "getForumPostExtraMediaCountContainerBackground", "forumPostTagBackground", "getForumPostTagBackground", "guildNotificationsBottomSheetPillBackground", "getGuildNotificationsBottomSheetPillBackground", "headerMuted", "getHeaderMuted", "headerPrimary", "getHeaderPrimary", "headerSecondary", "getHeaderSecondary", "homeBackground", "getHomeBackground", "homeCardRestingBorder", "getHomeCardRestingBorder", "iconMuted", "getIconMuted", "iconPrimary", "getIconPrimary", "iconSecondary", "getIconSecondary", "infoBoxBackground", "getInfoBoxBackground", "infoDangerBackground", "getInfoDangerBackground", "infoDangerForeground", "getInfoDangerForeground", "infoDangerText", "getInfoDangerText", "infoHelpBackground", "getInfoHelpBackground", "infoHelpForeground", "getInfoHelpForeground", "infoHelpText", "getInfoHelpText", "infoPositiveBackground", "getInfoPositiveBackground", "infoPositiveForeground", "getInfoPositiveForeground", "infoPositiveText", "getInfoPositiveText", "infoWarningBackground", "getInfoWarningBackground", "infoWarningForeground", "getInfoWarningForeground", "infoWarningText", "getInfoWarningText", "inputBackground", "getInputBackground", "inputPlaceholderText", "getInputPlaceholderText", "interactiveActive", "getInteractiveActive", "interactiveHover", "getInteractiveHover", "interactiveMuted", "getInteractiveMuted", "interactiveNormal", "getInteractiveNormal", "legacyAndroidBlurOverlayDefault", "getLegacyAndroidBlurOverlayDefault", "legacyAndroidBlurOverlayUltraThin", "getLegacyAndroidBlurOverlayUltraThin", "legacyBlurFallbackDefault", "getLegacyBlurFallbackDefault", "legacyBlurFallbackUltraThin", "getLegacyBlurFallbackUltraThin", "liveStageTileBorder", "getLiveStageTileBorder", "logoPrimary", "getLogoPrimary", "mentionBackground", "getMentionBackground", "mentionForeground", "getMentionForeground", "modalBackground", "getModalBackground", "modalFooterBackground", "getModalFooterBackground", "navigatorHeaderTint", "getNavigatorHeaderTint", "profileGradientCardBackground", "getProfileGradientCardBackground", "profileGradientMessageInputBorder", "getProfileGradientMessageInputBorder", "profileGradientNoteBackground", "getProfileGradientNoteBackground", "profileGradientOverlay", "getProfileGradientOverlay", "profileGradientOverlaySyncedWithUserTheme", "getProfileGradientOverlaySyncedWithUserTheme", "profileGradientProfileBodyBackgroundHover", "getProfileGradientProfileBodyBackgroundHover", "profileGradientRolePillBackground", "getProfileGradientRolePillBackground", "profileGradientRolePillBorder", "getProfileGradientRolePillBorder", "profileGradientSectionBox", "getProfileGradientSectionBox", "redesignActivityCardBackground", "getRedesignActivityCardBackground", "redesignActivityCardBackgroundPressed", "getRedesignActivityCardBackgroundPressed", "redesignActivityCardBadgeIcon", "getRedesignActivityCardBadgeIcon", "redesignActivityCardBorder", "getRedesignActivityCardBorder", "redesignActivityCardOverflowBackground", "getRedesignActivityCardOverflowBackground", "redesignButtonDangerBackground", "getRedesignButtonDangerBackground", "redesignButtonDangerPressedBackground", "getRedesignButtonDangerPressedBackground", "redesignButtonDangerText", "getRedesignButtonDangerText", "redesignButtonOverlayAlphaBackground", "getRedesignButtonOverlayAlphaBackground", "redesignButtonOverlayAlphaPressedBackground", "getRedesignButtonOverlayAlphaPressedBackground", "redesignButtonOverlayAlphaText", "getRedesignButtonOverlayAlphaText", "redesignButtonOverlayBackground", "getRedesignButtonOverlayBackground", "redesignButtonOverlayPressedBackground", "getRedesignButtonOverlayPressedBackground", "redesignButtonOverlayText", "getRedesignButtonOverlayText", "redesignButtonPositiveBackground", "getRedesignButtonPositiveBackground", "redesignButtonPositivePressedBackground", "getRedesignButtonPositivePressedBackground", "redesignButtonPositiveText", "getRedesignButtonPositiveText", "redesignButtonPrimaryAltBackground", "getRedesignButtonPrimaryAltBackground", "redesignButtonPrimaryAltBorder", "getRedesignButtonPrimaryAltBorder", "redesignButtonPrimaryAltOnBlurpleBackground", "getRedesignButtonPrimaryAltOnBlurpleBackground", "redesignButtonPrimaryAltOnBlurpleBorder", "getRedesignButtonPrimaryAltOnBlurpleBorder", "redesignButtonPrimaryAltOnBlurplePressedBackground", "getRedesignButtonPrimaryAltOnBlurplePressedBackground", "redesignButtonPrimaryAltOnBlurplePressedBorder", "getRedesignButtonPrimaryAltOnBlurplePressedBorder", "redesignButtonPrimaryAltOnBlurpleText", "getRedesignButtonPrimaryAltOnBlurpleText", "redesignButtonPrimaryAltPressedBackground", "getRedesignButtonPrimaryAltPressedBackground", "redesignButtonPrimaryAltPressedBorder", "getRedesignButtonPrimaryAltPressedBorder", "redesignButtonPrimaryAltPressedText", "getRedesignButtonPrimaryAltPressedText", "redesignButtonPrimaryAltText", "getRedesignButtonPrimaryAltText", "redesignButtonPrimaryBackground", "getRedesignButtonPrimaryBackground", "redesignButtonPrimaryOnBlurpleBackground", "getRedesignButtonPrimaryOnBlurpleBackground", "redesignButtonPrimaryOnBlurplePressedBackground", "getRedesignButtonPrimaryOnBlurplePressedBackground", "redesignButtonPrimaryOnBlurplePressedText", "getRedesignButtonPrimaryOnBlurplePressedText", "redesignButtonPrimaryOnBlurpleText", "getRedesignButtonPrimaryOnBlurpleText", "redesignButtonPrimaryPressedBackground", "getRedesignButtonPrimaryPressedBackground", "redesignButtonPrimaryText", "getRedesignButtonPrimaryText", "redesignButtonSecondaryAltBackground", "getRedesignButtonSecondaryAltBackground", "redesignButtonSecondaryAltPressedBackground", "getRedesignButtonSecondaryAltPressedBackground", "redesignButtonSecondaryAltPressedText", "getRedesignButtonSecondaryAltPressedText", "redesignButtonSecondaryAltText", "getRedesignButtonSecondaryAltText", "redesignButtonSecondaryBackground", "getRedesignButtonSecondaryBackground", "redesignButtonSecondaryBorder", "getRedesignButtonSecondaryBorder", "redesignButtonSecondaryPressedBackground", "getRedesignButtonSecondaryPressedBackground", "redesignButtonSecondaryPressedBorder", "getRedesignButtonSecondaryPressedBorder", "redesignButtonSecondaryText", "getRedesignButtonSecondaryText", "redesignChannelCategoryNameText", "getRedesignChannelCategoryNameText", "redesignChannelMessagePreviewText", "getRedesignChannelMessagePreviewText", "redesignChannelNameMutedText", "getRedesignChannelNameMutedText", "redesignChannelNameText", "getRedesignChannelNameText", "redesignChatInputBackground", "getRedesignChatInputBackground", "redesignInputControlActiveBg", "getRedesignInputControlActiveBg", "redesignInputControlSelected", "getRedesignInputControlSelected", "redesignOnlyBackgroundActive", "getRedesignOnlyBackgroundActive", "redesignOnlyBackgroundDefault", "getRedesignOnlyBackgroundDefault", "redesignOnlyBackgroundOverlay", "getRedesignOnlyBackgroundOverlay", "redesignOnlyBackgroundRaised", "getRedesignOnlyBackgroundRaised", "redesignOnlyBackgroundSunken", "getRedesignOnlyBackgroundSunken", "scrollbarAutoScrollbarColorThumb", "getScrollbarAutoScrollbarColorThumb", "scrollbarAutoScrollbarColorTrack", "getScrollbarAutoScrollbarColorTrack", "scrollbarAutoThumb", "getScrollbarAutoThumb", "scrollbarAutoTrack", "getScrollbarAutoTrack", "scrollbarThinThumb", "getScrollbarThinThumb", "scrollbarThinTrack", "getScrollbarThinTrack", "spoilerHiddenBackground", "getSpoilerHiddenBackground", "spoilerRevealedBackground", "getSpoilerRevealedBackground", "statusDanger", "getStatusDanger", "statusDangerBackground", "getStatusDangerBackground", "statusDangerText", "getStatusDangerText", "statusDnd", "getStatusDnd", "statusIdle", "getStatusIdle", "statusOffline", "getStatusOffline", "statusOnline", "getStatusOnline", "statusPositive", "getStatusPositive", "statusPositiveBackground", "getStatusPositiveBackground", "statusPositiveText", "getStatusPositiveText", "statusSpeaking", "getStatusSpeaking", "statusWarning", "getStatusWarning", "statusWarningBackground", "getStatusWarningBackground", "statusWarningText", "getStatusWarningText", "textBrand", "getTextBrand", "textDanger", "getTextDanger", "textLink", "getTextLink", "textLinkLowSaturation", "getTextLinkLowSaturation", "textLowContrast", "getTextLowContrast", "textMessagePreviewLowSat", "getTextMessagePreviewLowSat", "textMuted", "getTextMuted", "textMutedOnDefault", "getTextMutedOnDefault", "textNormal", "getTextNormal", "textPositive", "getTextPositive", "textPrimary", "getTextPrimary", "textSecondary", "getTextSecondary", "textWarning", "getTextWarning", "textboxMarkdownSyntax", "getTextboxMarkdownSyntax", "themeLockedBlurFallback", "getThemeLockedBlurFallback", "userProfileHeaderOverflowBackground", "getUserProfileHeaderOverflowBackground", "voiceVideoTileBlurFallback", "getVoiceVideoTileBlurFallback", "voiceVideoVideoTileBlurFallback", "getVoiceVideoVideoTileBlurFallback", "white", "getWhite", "getColor", "lightColor", "darkColor", "getColorRes", "lightColorRes", "darkColorRes", "theme_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class AmoledTheme extends DiscordTheme {
    private final int activityCardBackground;
    private final int androidNavigationBarBackground;
    private final int androidNavigationScrimBackground;
    private final int androidRipple;
    private final int backgroundAccent;
    private final int backgroundFloating;
    private final int backgroundMentioned;
    private final int backgroundMentionedHover;
    private final int backgroundMessageAutomod;
    private final int backgroundMessageAutomodHover;
    private final int backgroundMessageHighlight;
    private final int backgroundMessageHighlightHover;
    private final int backgroundMessageHover;
    private final int backgroundMobilePrimary;
    private final int backgroundMobileSecondary;
    private final int backgroundModifierAccent;
    private final int backgroundModifierAccent2;
    private final int backgroundModifierActive;
    private final int backgroundModifierHover;
    private final int backgroundModifierSelected;
    private final int backgroundNestedFloating;
    private final int backgroundPrimary;
    private final int backgroundSecondary;
    private final int backgroundSecondaryAlt;
    private final int backgroundTertiary;
    private final int bgBackdrop;
    private final int bgBackdropNoOpacity;
    private final int bgBasePrimary;
    private final int bgBaseSecondary;
    private final int bgBaseTertiary;
    private final int bgModFaint;
    private final int bgModStrong;
    private final int bgModSubtle;
    private final int bgSurfaceOverlay;
    private final int bgSurfaceOverlayTmp;
    private final int bgSurfaceRaised;
    private final int black;
    private final int blurFallback;
    private final int blurFallbackPressed;
    private final int borderFaint;
    private final int borderStrong;
    private final int borderSubtle;
    private final int bugReporterModalSubmittingBackground;
    private final int buttonCreatorRevenueBackground;
    private final int buttonDangerBackground;
    private final int buttonDangerBackgroundActive;
    private final int buttonDangerBackgroundDisabled;
    private final int buttonDangerBackgroundHover;
    private final int buttonOutlineBrandBackground;
    private final int buttonOutlineBrandBackgroundActive;
    private final int buttonOutlineBrandBackgroundHover;
    private final int buttonOutlineBrandBorder;
    private final int buttonOutlineBrandBorderActive;
    private final int buttonOutlineBrandBorderHover;
    private final int buttonOutlineBrandText;
    private final int buttonOutlineBrandTextActive;
    private final int buttonOutlineBrandTextHover;
    private final int buttonOutlineDangerBackground;
    private final int buttonOutlineDangerBackgroundActive;
    private final int buttonOutlineDangerBackgroundHover;
    private final int buttonOutlineDangerBorder;
    private final int buttonOutlineDangerBorderActive;
    private final int buttonOutlineDangerBorderHover;
    private final int buttonOutlineDangerText;
    private final int buttonOutlineDangerTextActive;
    private final int buttonOutlineDangerTextHover;
    private final int buttonOutlinePositiveBackground;
    private final int buttonOutlinePositiveBackgroundActive;
    private final int buttonOutlinePositiveBackgroundHover;
    private final int buttonOutlinePositiveBorder;
    private final int buttonOutlinePositiveBorderActive;
    private final int buttonOutlinePositiveBorderHover;
    private final int buttonOutlinePositiveText;
    private final int buttonOutlinePositiveTextActive;
    private final int buttonOutlinePositiveTextHover;
    private final int buttonOutlinePrimaryBackground;
    private final int buttonOutlinePrimaryBackgroundActive;
    private final int buttonOutlinePrimaryBackgroundHover;
    private final int buttonOutlinePrimaryBorder;
    private final int buttonOutlinePrimaryBorderActive;
    private final int buttonOutlinePrimaryBorderHover;
    private final int buttonOutlinePrimaryText;
    private final int buttonOutlinePrimaryTextActive;
    private final int buttonOutlinePrimaryTextHover;
    private final int buttonPositiveBackground;
    private final int buttonPositiveBackgroundActive;
    private final int buttonPositiveBackgroundDisabled;
    private final int buttonPositiveBackgroundHover;
    private final int buttonSecondaryBackground;
    private final int buttonSecondaryBackgroundActive;
    private final int buttonSecondaryBackgroundDisabled;
    private final int buttonSecondaryBackgroundHover;
    private final int cardGradientBg;
    private final int cardGradientPressedBg;
    private final int cardPrimaryBg;
    private final int cardPrimaryPressedBg;
    private final int cardSecondaryBg;
    private final int cardSecondaryPressedBg;
    private final int channelIcon;
    private final int channelTextAreaPlaceholder;
    private final int channelsDefault;
    private final int channeltextareaBackground;
    private final int chatBackground;
    private final int chatBorder;
    private final int chatInputContainerBackground;
    private final int chatSwipeToReplyBackground;
    private final int controlBrandForeground;
    private final int controlBrandForegroundNew;
    private final int creatorRevenueIconGradientEnd;
    private final int creatorRevenueIconGradientStart;
    private final int creatorRevenueInfoBoxBackground;
    private final int creatorRevenueInfoBoxBorder;
    private final int creatorRevenueLockedChannelIcon;
    private final int creatorRevenueProgressBar;
    private final int deprecatedCardBg;
    private final int deprecatedCardEditableBg;
    private final int deprecatedQuickswitcherInputBackground;
    private final int deprecatedQuickswitcherInputPlaceholder;
    private final int deprecatedStoreBg;
    private final int deprecatedTextInputBg;
    private final int deprecatedTextInputBorder;
    private final int deprecatedTextInputBorderDisabled;
    private final int deprecatedTextInputBorderHover;
    private final int deprecatedTextInputPrefix;
    private final int displayBannerOverflowBackground;
    private final int dividerStrong;
    private final int dividerSubtle;
    private final int focusPrimary;
    private final int forumPostExtraMediaCountContainerBackground;
    private final int forumPostTagBackground;
    private final int guildNotificationsBottomSheetPillBackground;
    private final int headerMuted;
    private final int headerPrimary;
    private final int headerSecondary;
    private final int homeBackground;
    private final int homeCardRestingBorder;
    private final int iconMuted;
    private final int iconPrimary;
    private final int iconSecondary;
    private final int infoBoxBackground;
    private final int infoDangerBackground;
    private final int infoDangerForeground;
    private final int infoDangerText;
    private final int infoHelpBackground;
    private final int infoHelpForeground;
    private final int infoHelpText;
    private final int infoPositiveBackground;
    private final int infoPositiveForeground;
    private final int infoPositiveText;
    private final int infoWarningBackground;
    private final int infoWarningForeground;
    private final int infoWarningText;
    private final int inputBackground;
    private final int inputPlaceholderText;
    private final int interactiveActive;
    private final int interactiveHover;
    private final int interactiveMuted;
    private final int interactiveNormal;
    private final int legacyAndroidBlurOverlayDefault;
    private final int legacyAndroidBlurOverlayUltraThin;
    private final int legacyBlurFallbackDefault;
    private final int legacyBlurFallbackUltraThin;
    private final int liveStageTileBorder;
    private final int logoPrimary;
    private final int mentionBackground;
    private final int mentionForeground;
    private final int modalBackground;
    private final int modalFooterBackground;
    private final int navigatorHeaderTint;
    private final int profileGradientCardBackground;
    private final int profileGradientMessageInputBorder;
    private final int profileGradientNoteBackground;
    private final int profileGradientOverlay;
    private final int profileGradientOverlaySyncedWithUserTheme;
    private final int profileGradientProfileBodyBackgroundHover;
    private final int profileGradientRolePillBackground;
    private final int profileGradientRolePillBorder;
    private final int profileGradientSectionBox;
    private final int redesignActivityCardBackground;
    private final int redesignActivityCardBackgroundPressed;
    private final int redesignActivityCardBadgeIcon;
    private final int redesignActivityCardBorder;
    private final int redesignActivityCardOverflowBackground;
    private final int redesignButtonDangerBackground;
    private final int redesignButtonDangerPressedBackground;
    private final int redesignButtonDangerText;
    private final int redesignButtonOverlayAlphaBackground;
    private final int redesignButtonOverlayAlphaPressedBackground;
    private final int redesignButtonOverlayAlphaText;
    private final int redesignButtonOverlayBackground;
    private final int redesignButtonOverlayPressedBackground;
    private final int redesignButtonOverlayText;
    private final int redesignButtonPositiveBackground;
    private final int redesignButtonPositivePressedBackground;
    private final int redesignButtonPositiveText;
    private final int redesignButtonPrimaryAltBackground;
    private final int redesignButtonPrimaryAltBorder;
    private final int redesignButtonPrimaryAltOnBlurpleBackground;
    private final int redesignButtonPrimaryAltOnBlurpleBorder;
    private final int redesignButtonPrimaryAltOnBlurplePressedBackground;
    private final int redesignButtonPrimaryAltOnBlurplePressedBorder;
    private final int redesignButtonPrimaryAltOnBlurpleText;
    private final int redesignButtonPrimaryAltPressedBackground;
    private final int redesignButtonPrimaryAltPressedBorder;
    private final int redesignButtonPrimaryAltPressedText;
    private final int redesignButtonPrimaryAltText;
    private final int redesignButtonPrimaryBackground;
    private final int redesignButtonPrimaryOnBlurpleBackground;
    private final int redesignButtonPrimaryOnBlurplePressedBackground;
    private final int redesignButtonPrimaryOnBlurplePressedText;
    private final int redesignButtonPrimaryOnBlurpleText;
    private final int redesignButtonPrimaryPressedBackground;
    private final int redesignButtonPrimaryText;
    private final int redesignButtonSecondaryAltBackground;
    private final int redesignButtonSecondaryAltPressedBackground;
    private final int redesignButtonSecondaryAltPressedText;
    private final int redesignButtonSecondaryAltText;
    private final int redesignButtonSecondaryBackground;
    private final int redesignButtonSecondaryBorder;
    private final int redesignButtonSecondaryPressedBackground;
    private final int redesignButtonSecondaryPressedBorder;
    private final int redesignButtonSecondaryText;
    private final int redesignChannelCategoryNameText;
    private final int redesignChannelMessagePreviewText;
    private final int redesignChannelNameMutedText;
    private final int redesignChannelNameText;
    private final int redesignChatInputBackground;
    private final int redesignInputControlActiveBg;
    private final int redesignInputControlSelected;
    private final int redesignOnlyBackgroundActive;
    private final int redesignOnlyBackgroundDefault;
    private final int redesignOnlyBackgroundOverlay;
    private final int redesignOnlyBackgroundRaised;
    private final int redesignOnlyBackgroundSunken;
    private final int scrollbarAutoScrollbarColorThumb;
    private final int scrollbarAutoScrollbarColorTrack;
    private final int scrollbarAutoThumb;
    private final int scrollbarAutoTrack;
    private final int scrollbarThinThumb;
    private final int scrollbarThinTrack;
    private final int spoilerHiddenBackground;
    private final int spoilerRevealedBackground;
    private final int statusDanger;
    private final int statusDangerBackground;
    private final int statusDangerText;
    private final int statusDnd;
    private final int statusIdle;
    private final int statusOffline;
    private final int statusOnline;
    private final int statusPositive;
    private final int statusPositiveBackground;
    private final int statusPositiveText;
    private final int statusSpeaking;
    private final int statusWarning;
    private final int statusWarningBackground;
    private final int statusWarningText;
    private final int textBrand;
    private final int textDanger;
    private final int textLink;
    private final int textLinkLowSaturation;
    private final int textLowContrast;
    private final int textMessagePreviewLowSat;
    private final int textMuted;
    private final int textMutedOnDefault;
    private final int textNormal;
    private final int textPositive;
    private final int textPrimary;
    private final int textSecondary;
    private final int textWarning;
    private final int textboxMarkdownSyntax;
    private final int themeLockedBlurFallback;
    private final int userProfileHeaderOverflowBackground;
    private final int voiceVideoTileBlurFallback;
    private final int voiceVideoVideoTileBlurFallback;
    private final int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmoledTheme(Context context) {
        super(null);
        C9612q.m13917h(context, "context");
        int i = C3511R.color.primary_700;
        this.activityCardBackground = ColorUtilsKt.getColorCompat(context, i);
        int i2 = C3511R.color.plum_24;
        this.androidNavigationBarBackground = ColorUtilsKt.getColorCompat(context, i2);
        this.androidNavigationScrimBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.android_navigation_scrim_background_amoled);
        this.androidRipple = ColorUtilsKt.getColorCompat(context, C3511R.color.android_ripple_amoled);
        int i3 = C3511R.color.plum_17;
        this.backgroundAccent = ColorUtilsKt.getColorCompat(context, i3);
        int i4 = C3511R.color.plum_23;
        this.backgroundFloating = ColorUtilsKt.getColorCompat(context, i4);
        this.backgroundMentioned = ColorUtilsKt.getColorCompat(context, C3511R.color.background_mentioned_amoled);
        this.backgroundMentionedHover = ColorUtilsKt.getColorCompat(context, C3511R.color.background_mentioned_hover_amoled);
        this.backgroundMessageAutomod = ColorUtilsKt.getColorCompat(context, C3511R.color.background_message_automod_amoled);
        this.backgroundMessageAutomodHover = ColorUtilsKt.getColorCompat(context, C3511R.color.background_message_automod_hover_amoled);
        this.backgroundMessageHighlight = ColorUtilsKt.getColorCompat(context, C3511R.color.background_message_highlight_amoled);
        this.backgroundMessageHighlightHover = ColorUtilsKt.getColorCompat(context, C3511R.color.background_message_highlight_hover_amoled);
        this.backgroundMessageHover = ColorUtilsKt.getColorCompat(context, C3511R.color.plum_21);
        int i5 = C3511R.color.black_500;
        this.backgroundMobilePrimary = ColorUtilsKt.getColorCompat(context, i5);
        this.backgroundMobileSecondary = ColorUtilsKt.getColorCompat(context, i5);
        this.backgroundModifierAccent = ColorUtilsKt.getColorCompat(context, C3511R.color.background_modifier_accent_amoled);
        this.backgroundModifierAccent2 = ColorUtilsKt.getColorCompat(context, C3511R.color.background_modifier_accent_2_amoled);
        this.backgroundModifierActive = ColorUtilsKt.getColorCompat(context, C3511R.color.background_modifier_active_amoled);
        this.backgroundModifierHover = ColorUtilsKt.getColorCompat(context, C3511R.color.background_modifier_hover_amoled);
        this.backgroundModifierSelected = ColorUtilsKt.getColorCompat(context, C3511R.color.background_modifier_selected_amoled);
        this.backgroundNestedFloating = ColorUtilsKt.getColorCompat(context, i5);
        this.backgroundPrimary = ColorUtilsKt.getColorCompat(context, i5);
        this.backgroundSecondary = ColorUtilsKt.getColorCompat(context, i4);
        this.backgroundSecondaryAlt = ColorUtilsKt.getColorCompat(context, i3);
        int i6 = C3511R.color.plum_19;
        this.backgroundTertiary = ColorUtilsKt.getColorCompat(context, i6);
        this.bgBackdrop = ColorUtilsKt.getColorCompat(context, C3511R.color.bg_backdrop_amoled);
        this.bgBackdropNoOpacity = ColorUtilsKt.getColorCompat(context, i6);
        this.bgBasePrimary = ColorUtilsKt.getColorCompat(context, i5);
        this.bgBaseSecondary = ColorUtilsKt.getColorCompat(context, i5);
        this.bgBaseTertiary = ColorUtilsKt.getColorCompat(context, i5);
        this.bgModFaint = ColorUtilsKt.getColorCompat(context, C3511R.color.bg_mod_faint_amoled);
        this.bgModStrong = ColorUtilsKt.getColorCompat(context, C3511R.color.bg_mod_strong_amoled);
        this.bgModSubtle = ColorUtilsKt.getColorCompat(context, C3511R.color.bg_mod_subtle_amoled);
        this.bgSurfaceOverlay = ColorUtilsKt.getColorCompat(context, i6);
        this.bgSurfaceOverlayTmp = ColorUtilsKt.getColorCompat(context, i4);
        int i7 = C3511R.color.plum_22;
        this.bgSurfaceRaised = ColorUtilsKt.getColorCompat(context, i7);
        this.black = ColorUtilsKt.getColorCompat(context, i5);
        this.blurFallback = ColorUtilsKt.getColorCompat(context, C3511R.color.blur_fallback_amoled);
        this.blurFallbackPressed = ColorUtilsKt.getColorCompat(context, C3511R.color.blur_fallback_pressed_amoled);
        this.borderFaint = ColorUtilsKt.getColorCompat(context, C3511R.color.border_faint_amoled);
        this.borderStrong = ColorUtilsKt.getColorCompat(context, C3511R.color.border_strong_amoled);
        this.borderSubtle = ColorUtilsKt.getColorCompat(context, C3511R.color.border_subtle_amoled);
        this.bugReporterModalSubmittingBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.bug_reporter_modal_submitting_background_amoled);
        int i8 = C3511R.color.teal_430;
        this.buttonCreatorRevenueBackground = ColorUtilsKt.getColorCompat(context, i8);
        int i9 = C3511R.color.red_430;
        this.buttonDangerBackground = ColorUtilsKt.getColorCompat(context, i9);
        this.buttonDangerBackgroundActive = ColorUtilsKt.getColorCompat(context, C3511R.color.red_530);
        this.buttonDangerBackgroundDisabled = ColorUtilsKt.getColorCompat(context, i9);
        this.buttonDangerBackgroundHover = ColorUtilsKt.getColorCompat(context, C3511R.color.red_500);
        this.buttonOutlineBrandBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.button_outline_brand_background_amoled);
        int i10 = C3511R.color.brand_560;
        this.buttonOutlineBrandBackgroundActive = ColorUtilsKt.getColorCompat(context, i10);
        int i11 = C3511R.color.brand_500;
        this.buttonOutlineBrandBackgroundHover = ColorUtilsKt.getColorCompat(context, i11);
        this.buttonOutlineBrandBorder = ColorUtilsKt.getColorCompat(context, i11);
        this.buttonOutlineBrandBorderActive = ColorUtilsKt.getColorCompat(context, i10);
        this.buttonOutlineBrandBorderHover = ColorUtilsKt.getColorCompat(context, i11);
        int i12 = C3511R.color.white_500;
        this.buttonOutlineBrandText = ColorUtilsKt.getColorCompat(context, i12);
        this.buttonOutlineBrandTextActive = ColorUtilsKt.getColorCompat(context, i12);
        this.buttonOutlineBrandTextHover = ColorUtilsKt.getColorCompat(context, i12);
        this.buttonOutlineDangerBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.button_outline_danger_background_amoled);
        int i13 = C3511R.color.red_460;
        this.buttonOutlineDangerBackgroundActive = ColorUtilsKt.getColorCompat(context, i13);
        this.buttonOutlineDangerBackgroundHover = ColorUtilsKt.getColorCompat(context, i9);
        int i14 = C3511R.color.red_400;
        this.buttonOutlineDangerBorder = ColorUtilsKt.getColorCompat(context, i14);
        this.buttonOutlineDangerBorderActive = ColorUtilsKt.getColorCompat(context, i9);
        this.buttonOutlineDangerBorderHover = ColorUtilsKt.getColorCompat(context, i9);
        this.buttonOutlineDangerText = ColorUtilsKt.getColorCompat(context, i12);
        this.buttonOutlineDangerTextActive = ColorUtilsKt.getColorCompat(context, i12);
        this.buttonOutlineDangerTextHover = ColorUtilsKt.getColorCompat(context, i12);
        this.buttonOutlinePositiveBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.button_outline_positive_background_amoled);
        int i15 = C3511R.color.green_530;
        this.buttonOutlinePositiveBackgroundActive = ColorUtilsKt.getColorCompat(context, i15);
        int i16 = C3511R.color.green_430;
        this.buttonOutlinePositiveBackgroundHover = ColorUtilsKt.getColorCompat(context, i16);
        int i17 = C3511R.color.green_360;
        this.buttonOutlinePositiveBorder = ColorUtilsKt.getColorCompat(context, i17);
        this.buttonOutlinePositiveBorderActive = ColorUtilsKt.getColorCompat(context, i15);
        this.buttonOutlinePositiveBorderHover = ColorUtilsKt.getColorCompat(context, i16);
        this.buttonOutlinePositiveText = ColorUtilsKt.getColorCompat(context, i12);
        this.buttonOutlinePositiveTextActive = ColorUtilsKt.getColorCompat(context, i12);
        this.buttonOutlinePositiveTextHover = ColorUtilsKt.getColorCompat(context, i12);
        this.buttonOutlinePrimaryBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.button_outline_primary_background_amoled);
        int i18 = C3511R.color.plum_11;
        this.buttonOutlinePrimaryBackgroundActive = ColorUtilsKt.getColorCompat(context, i18);
        int i19 = C3511R.color.plum_13;
        this.buttonOutlinePrimaryBackgroundHover = ColorUtilsKt.getColorCompat(context, i19);
        this.buttonOutlinePrimaryBorder = ColorUtilsKt.getColorCompat(context, C3511R.color.primary_500);
        this.buttonOutlinePrimaryBorderActive = ColorUtilsKt.getColorCompat(context, i18);
        this.buttonOutlinePrimaryBorderHover = ColorUtilsKt.getColorCompat(context, i19);
        this.buttonOutlinePrimaryText = ColorUtilsKt.getColorCompat(context, i12);
        this.buttonOutlinePrimaryTextActive = ColorUtilsKt.getColorCompat(context, i12);
        this.buttonOutlinePrimaryTextHover = ColorUtilsKt.getColorCompat(context, i12);
        this.buttonPositiveBackground = ColorUtilsKt.getColorCompat(context, i16);
        this.buttonPositiveBackgroundActive = ColorUtilsKt.getColorCompat(context, i15);
        this.buttonPositiveBackgroundDisabled = ColorUtilsKt.getColorCompat(context, i16);
        this.buttonPositiveBackgroundHover = ColorUtilsKt.getColorCompat(context, i15);
        this.buttonSecondaryBackground = ColorUtilsKt.getColorCompat(context, i19);
        int i20 = C3511R.color.plum_10;
        this.buttonSecondaryBackgroundActive = ColorUtilsKt.getColorCompat(context, i20);
        this.buttonSecondaryBackgroundDisabled = ColorUtilsKt.getColorCompat(context, i19);
        this.buttonSecondaryBackgroundHover = ColorUtilsKt.getColorCompat(context, i18);
        this.cardGradientBg = ColorUtilsKt.getColorCompat(context, C3511R.color.card_gradient_bg_amoled);
        this.cardGradientPressedBg = ColorUtilsKt.getColorCompat(context, C3511R.color.card_gradient_pressed_bg_amoled);
        this.cardPrimaryBg = ColorUtilsKt.getColorCompat(context, i7);
        this.cardPrimaryPressedBg = ColorUtilsKt.getColorCompat(context, i2);
        this.cardSecondaryBg = ColorUtilsKt.getColorCompat(context, i4);
        int i21 = C3511R.color.plum_25;
        this.cardSecondaryPressedBg = ColorUtilsKt.getColorCompat(context, i21);
        this.channelIcon = ColorUtilsKt.getColorCompat(context, i20);
        this.channelTextAreaPlaceholder = ColorUtilsKt.getColorCompat(context, i18);
        int i22 = C3511R.color.plum_9;
        this.channelsDefault = ColorUtilsKt.getColorCompat(context, i22);
        this.channeltextareaBackground = ColorUtilsKt.getColorCompat(context, i4);
        this.chatBackground = ColorUtilsKt.getColorCompat(context, i5);
        int i23 = C3511R.color.plum_20;
        this.chatBorder = ColorUtilsKt.getColorCompat(context, i23);
        int i24 = C3511R.color.plum_16;
        this.chatInputContainerBackground = ColorUtilsKt.getColorCompat(context, i24);
        this.chatSwipeToReplyBackground = ColorUtilsKt.getColorCompat(context, i7);
        int i25 = C3511R.color.brand_360;
        this.controlBrandForeground = ColorUtilsKt.getColorCompat(context, i25);
        this.controlBrandForegroundNew = ColorUtilsKt.getColorCompat(context, i25);
        this.creatorRevenueIconGradientEnd = ColorUtilsKt.getColorCompat(context, i8);
        this.creatorRevenueIconGradientStart = ColorUtilsKt.getColorCompat(context, C3511R.color.teal_360);
        this.creatorRevenueInfoBoxBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.creator_revenue_info_box_background_amoled);
        int i26 = C3511R.color.teal_400;
        this.creatorRevenueInfoBoxBorder = ColorUtilsKt.getColorCompat(context, i26);
        this.creatorRevenueLockedChannelIcon = ColorUtilsKt.getColorCompat(context, C3511R.color.teal_345);
        this.creatorRevenueProgressBar = ColorUtilsKt.getColorCompat(context, i26);
        this.deprecatedCardBg = ColorUtilsKt.getColorCompat(context, C3511R.color.deprecated_card_bg_amoled);
        this.deprecatedCardEditableBg = ColorUtilsKt.getColorCompat(context, C3511R.color.deprecated_card_editable_bg_amoled);
        this.deprecatedQuickswitcherInputBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.primary_400);
        this.deprecatedQuickswitcherInputPlaceholder = ColorUtilsKt.getColorCompat(context, C3511R.color.deprecated_quickswitcher_input_placeholder_amoled);
        int i27 = C3511R.color.primary_600;
        this.deprecatedStoreBg = ColorUtilsKt.getColorCompat(context, i27);
        this.deprecatedTextInputBg = ColorUtilsKt.getColorCompat(context, i);
        this.deprecatedTextInputBorder = ColorUtilsKt.getColorCompat(context, C3511R.color.deprecated_text_input_border_amoled);
        this.deprecatedTextInputBorderDisabled = ColorUtilsKt.getColorCompat(context, i);
        this.deprecatedTextInputBorderHover = ColorUtilsKt.getColorCompat(context, C3511R.color.primary_900);
        this.deprecatedTextInputPrefix = ColorUtilsKt.getColorCompat(context, C3511R.color.primary_200);
        this.displayBannerOverflowBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.display_banner_overflow_background_amoled);
        this.dividerStrong = ColorUtilsKt.getColorCompat(context, C3511R.color.divider_strong_amoled);
        this.dividerSubtle = ColorUtilsKt.getColorCompat(context, C3511R.color.divider_subtle_amoled);
        int i28 = C3511R.color.blue_345;
        this.focusPrimary = ColorUtilsKt.getColorCompat(context, i28);
        this.forumPostExtraMediaCountContainerBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.forum_post_extra_media_count_container_background_amoled);
        this.forumPostTagBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.forum_post_tag_background_amoled);
        this.guildNotificationsBottomSheetPillBackground = ColorUtilsKt.getColorCompat(context, i);
        this.headerMuted = ColorUtilsKt.getColorCompat(context, i20);
        int i29 = C3511R.color.plum_2;
        this.headerPrimary = ColorUtilsKt.getColorCompat(context, i29);
        int i30 = C3511R.color.plum_8;
        this.headerSecondary = ColorUtilsKt.getColorCompat(context, i30);
        this.homeBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.plum_18);
        this.homeCardRestingBorder = ColorUtilsKt.getColorCompat(context, C3511R.color.home_card_resting_border_amoled);
        int i31 = C3511R.color.plum_12;
        this.iconMuted = ColorUtilsKt.getColorCompat(context, i31);
        this.iconPrimary = ColorUtilsKt.getColorCompat(context, C3511R.color.plum_5);
        this.iconSecondary = ColorUtilsKt.getColorCompat(context, i22);
        this.infoBoxBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.info_box_background_amoled);
        this.infoDangerBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.info_danger_background_amoled);
        this.infoDangerForeground = ColorUtilsKt.getColorCompat(context, i14);
        this.infoDangerText = ColorUtilsKt.getColorCompat(context, i12);
        this.infoHelpBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.info_help_background_amoled);
        this.infoHelpForeground = ColorUtilsKt.getColorCompat(context, i28);
        this.infoHelpText = ColorUtilsKt.getColorCompat(context, i12);
        this.infoPositiveBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.info_positive_background_amoled);
        this.infoPositiveForeground = ColorUtilsKt.getColorCompat(context, i17);
        this.infoPositiveText = ColorUtilsKt.getColorCompat(context, i12);
        this.infoWarningBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.info_warning_background_amoled);
        int i32 = C3511R.color.yellow_300;
        this.infoWarningForeground = ColorUtilsKt.getColorCompat(context, i32);
        this.infoWarningText = ColorUtilsKt.getColorCompat(context, i12);
        this.inputBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.input_background_amoled);
        this.inputPlaceholderText = ColorUtilsKt.getColorCompat(context, i22);
        this.interactiveActive = ColorUtilsKt.getColorCompat(context, C3511R.color.plum_3);
        int i33 = C3511R.color.plum_4;
        this.interactiveHover = ColorUtilsKt.getColorCompat(context, i33);
        this.interactiveMuted = ColorUtilsKt.getColorCompat(context, i19);
        this.interactiveNormal = ColorUtilsKt.getColorCompat(context, C3511R.color.plum_6);
        this.legacyAndroidBlurOverlayDefault = ColorUtilsKt.getColorCompat(context, C3511R.color.legacy_android_blur_overlay_default_amoled);
        this.legacyAndroidBlurOverlayUltraThin = ColorUtilsKt.getColorCompat(context, C3511R.color.legacy_android_blur_overlay_ultra_thin_amoled);
        this.legacyBlurFallbackDefault = ColorUtilsKt.getColorCompat(context, C3511R.color.legacy_blur_fallback_default_amoled);
        this.legacyBlurFallbackUltraThin = ColorUtilsKt.getColorCompat(context, C3511R.color.legacy_blur_fallback_ultra_thin_amoled);
        this.liveStageTileBorder = ColorUtilsKt.getColorCompat(context, C3511R.color.live_stage_tile_border_amoled);
        this.logoPrimary = ColorUtilsKt.getColorCompat(context, i12);
        this.mentionBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.mention_background_amoled);
        this.mentionForeground = ColorUtilsKt.getColorCompat(context, C3511R.color.brand_230);
        this.modalBackground = ColorUtilsKt.getColorCompat(context, i24);
        this.modalFooterBackground = ColorUtilsKt.getColorCompat(context, i3);
        this.navigatorHeaderTint = ColorUtilsKt.getColorCompat(context, i12);
        this.profileGradientCardBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.profile_gradient_card_background_amoled);
        this.profileGradientMessageInputBorder = ColorUtilsKt.getColorCompat(context, C3511R.color.profile_gradient_message_input_border_amoled);
        this.profileGradientNoteBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.profile_gradient_note_background_amoled);
        this.profileGradientOverlay = ColorUtilsKt.getColorCompat(context, C3511R.color.profile_gradient_overlay_amoled);
        this.profileGradientOverlaySyncedWithUserTheme = ColorUtilsKt.getColorCompat(context, C3511R.color.profile_gradient_overlay_synced_with_user_theme_amoled);
        this.profileGradientProfileBodyBackgroundHover = ColorUtilsKt.getColorCompat(context, C3511R.color.profile_gradient_profile_body_background_hover_amoled);
        this.profileGradientRolePillBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.profile_gradient_role_pill_background_amoled);
        this.profileGradientRolePillBorder = ColorUtilsKt.getColorCompat(context, C3511R.color.profile_gradient_role_pill_border_amoled);
        this.profileGradientSectionBox = ColorUtilsKt.getColorCompat(context, C3511R.color.profile_gradient_section_box_amoled);
        this.redesignActivityCardBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.primary_560);
        int i34 = C3511R.color.primary_630;
        this.redesignActivityCardBackgroundPressed = ColorUtilsKt.getColorCompat(context, i34);
        this.redesignActivityCardBadgeIcon = ColorUtilsKt.getColorCompat(context, i18);
        this.redesignActivityCardBorder = ColorUtilsKt.getColorCompat(context, C3511R.color.redesign_activity_card_border_amoled);
        this.redesignActivityCardOverflowBackground = ColorUtilsKt.getColorCompat(context, i34);
        this.redesignButtonDangerBackground = ColorUtilsKt.getColorCompat(context, i9);
        this.redesignButtonDangerPressedBackground = ColorUtilsKt.getColorCompat(context, i13);
        this.redesignButtonDangerText = ColorUtilsKt.getColorCompat(context, i12);
        this.redesignButtonOverlayAlphaBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.redesign_button_overlay_alpha_background_amoled);
        this.redesignButtonOverlayAlphaPressedBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.redesign_button_overlay_alpha_pressed_background_amoled);
        this.redesignButtonOverlayAlphaText = ColorUtilsKt.getColorCompat(context, i12);
        this.redesignButtonOverlayBackground = ColorUtilsKt.getColorCompat(context, i12);
        this.redesignButtonOverlayPressedBackground = ColorUtilsKt.getColorCompat(context, i33);
        this.redesignButtonOverlayText = ColorUtilsKt.getColorCompat(context, i21);
        this.redesignButtonPositiveBackground = ColorUtilsKt.getColorCompat(context, i16);
        this.redesignButtonPositivePressedBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.green_460);
        this.redesignButtonPositiveText = ColorUtilsKt.getColorCompat(context, i12);
        this.redesignButtonPrimaryAltBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.redesign_button_primary_alt_background_amoled);
        int i35 = C3511R.color.brand_430;
        this.redesignButtonPrimaryAltBorder = ColorUtilsKt.getColorCompat(context, i35);
        this.redesignButtonPrimaryAltOnBlurpleBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.redesign_button_primary_alt_on_blurple_background_amoled);
        this.redesignButtonPrimaryAltOnBlurpleBorder = ColorUtilsKt.getColorCompat(context, i12);
        int i36 = C3511R.color.brand_530;
        this.redesignButtonPrimaryAltOnBlurplePressedBackground = ColorUtilsKt.getColorCompat(context, i36);
        this.redesignButtonPrimaryAltOnBlurplePressedBorder = ColorUtilsKt.getColorCompat(context, i25);
        this.redesignButtonPrimaryAltOnBlurpleText = ColorUtilsKt.getColorCompat(context, i12);
        this.redesignButtonPrimaryAltPressedBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.redesign_button_primary_alt_pressed_background_amoled);
        this.redesignButtonPrimaryAltPressedBorder = ColorUtilsKt.getColorCompat(context, C3511R.color.redesign_button_primary_alt_pressed_border_amoled);
        this.redesignButtonPrimaryAltPressedText = ColorUtilsKt.getColorCompat(context, i25);
        this.redesignButtonPrimaryAltText = ColorUtilsKt.getColorCompat(context, i35);
        this.redesignButtonPrimaryBackground = ColorUtilsKt.getColorCompat(context, i11);
        this.redesignButtonPrimaryOnBlurpleBackground = ColorUtilsKt.getColorCompat(context, i12);
        this.redesignButtonPrimaryOnBlurplePressedBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.brand_200);
        this.redesignButtonPrimaryOnBlurplePressedText = ColorUtilsKt.getColorCompat(context, i36);
        this.redesignButtonPrimaryOnBlurpleText = ColorUtilsKt.getColorCompat(context, i11);
        this.redesignButtonPrimaryPressedBackground = ColorUtilsKt.getColorCompat(context, i10);
        this.redesignButtonPrimaryText = ColorUtilsKt.getColorCompat(context, i12);
        this.redesignButtonSecondaryAltBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.redesign_button_secondary_alt_background_amoled);
        this.redesignButtonSecondaryAltPressedBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.redesign_button_secondary_alt_pressed_background_amoled);
        this.redesignButtonSecondaryAltPressedText = ColorUtilsKt.getColorCompat(context, i30);
        this.redesignButtonSecondaryAltText = ColorUtilsKt.getColorCompat(context, i33);
        this.redesignButtonSecondaryBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.plum_15);
        this.redesignButtonSecondaryBorder = ColorUtilsKt.getColorCompat(context, C3511R.color.redesign_button_secondary_border_amoled);
        this.redesignButtonSecondaryPressedBackground = ColorUtilsKt.getColorCompat(context, i19);
        this.redesignButtonSecondaryPressedBorder = ColorUtilsKt.getColorCompat(context, C3511R.color.redesign_button_secondary_pressed_border_amoled);
        this.redesignButtonSecondaryText = ColorUtilsKt.getColorCompat(context, i33);
        this.redesignChannelCategoryNameText = ColorUtilsKt.getColorCompat(context, i30);
        this.redesignChannelMessagePreviewText = ColorUtilsKt.getColorCompat(context, i20);
        this.redesignChannelNameMutedText = ColorUtilsKt.getColorCompat(context, i20);
        this.redesignChannelNameText = ColorUtilsKt.getColorCompat(context, i29);
        this.redesignChatInputBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.redesign_chat_input_background_amoled);
        this.redesignInputControlActiveBg = ColorUtilsKt.getColorCompat(context, i3);
        this.redesignInputControlSelected = ColorUtilsKt.getColorCompat(context, i11);
        this.redesignOnlyBackgroundActive = ColorUtilsKt.getColorCompat(context, C3511R.color.primary_530);
        this.redesignOnlyBackgroundDefault = ColorUtilsKt.getColorCompat(context, i27);
        this.redesignOnlyBackgroundOverlay = ColorUtilsKt.getColorCompat(context, C3511R.color.primary_645);
        this.redesignOnlyBackgroundRaised = ColorUtilsKt.getColorCompat(context, i34);
        this.redesignOnlyBackgroundSunken = ColorUtilsKt.getColorCompat(context, C3511R.color.primary_660);
        this.scrollbarAutoScrollbarColorThumb = ColorUtilsKt.getColorCompat(context, i23);
        this.scrollbarAutoScrollbarColorTrack = ColorUtilsKt.getColorCompat(context, i3);
        this.scrollbarAutoThumb = ColorUtilsKt.getColorCompat(context, i24);
        this.scrollbarAutoTrack = ColorUtilsKt.getColorCompat(context, i21);
        this.scrollbarThinThumb = ColorUtilsKt.getColorCompat(context, i23);
        this.scrollbarThinTrack = ColorUtilsKt.getColorCompat(context, C3511R.color.scrollbar_thin_track_amoled);
        this.spoilerHiddenBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.plum_14);
        this.spoilerRevealedBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.spoiler_revealed_background_amoled);
        this.statusDanger = ColorUtilsKt.getColorCompat(context, i14);
        this.statusDangerBackground = ColorUtilsKt.getColorCompat(context, i14);
        this.statusDangerText = ColorUtilsKt.getColorCompat(context, i12);
        this.statusDnd = ColorUtilsKt.getColorCompat(context, i14);
        this.statusIdle = ColorUtilsKt.getColorCompat(context, i32);
        this.statusOffline = ColorUtilsKt.getColorCompat(context, i22);
        this.statusOnline = ColorUtilsKt.getColorCompat(context, i17);
        this.statusPositive = ColorUtilsKt.getColorCompat(context, i17);
        this.statusPositiveBackground = ColorUtilsKt.getColorCompat(context, i16);
        this.statusPositiveText = ColorUtilsKt.getColorCompat(context, i12);
        this.statusSpeaking = ColorUtilsKt.getColorCompat(context, i17);
        this.statusWarning = ColorUtilsKt.getColorCompat(context, i32);
        this.statusWarningBackground = ColorUtilsKt.getColorCompat(context, i32);
        this.statusWarningText = ColorUtilsKt.getColorCompat(context, i5);
        this.textBrand = ColorUtilsKt.getColorCompat(context, i35);
        this.textDanger = ColorUtilsKt.getColorCompat(context, C3511R.color.red_345);
        this.textLink = ColorUtilsKt.getColorCompat(context, i28);
        this.textLinkLowSaturation = ColorUtilsKt.getColorCompat(context, C3511R.color.blue_330);
        this.textLowContrast = ColorUtilsKt.getColorCompat(context, i31);
        this.textMessagePreviewLowSat = ColorUtilsKt.getColorCompat(context, i22);
        this.textMuted = ColorUtilsKt.getColorCompat(context, i20);
        this.textMutedOnDefault = ColorUtilsKt.getColorCompat(context, C3511R.color.primary_330);
        this.textNormal = ColorUtilsKt.getColorCompat(context, i33);
        this.textPositive = ColorUtilsKt.getColorCompat(context, C3511R.color.green_330);
        this.textPrimary = ColorUtilsKt.getColorCompat(context, i33);
        this.textSecondary = ColorUtilsKt.getColorCompat(context, i30);
        this.textWarning = ColorUtilsKt.getColorCompat(context, i32);
        this.textboxMarkdownSyntax = ColorUtilsKt.getColorCompat(context, i22);
        this.themeLockedBlurFallback = ColorUtilsKt.getColorCompat(context, C3511R.color.theme_locked_blur_fallback_amoled);
        this.userProfileHeaderOverflowBackground = ColorUtilsKt.getColorCompat(context, C3511R.color.user_profile_header_overflow_background_amoled);
        this.voiceVideoTileBlurFallback = ColorUtilsKt.getColorCompat(context, C3511R.color.voice_video_tile_blur_fallback_amoled);
        this.voiceVideoVideoTileBlurFallback = ColorUtilsKt.getColorCompat(context, C3511R.color.voice_video_video_tile_blur_fallback_amoled);
        this.white = ColorUtilsKt.getColorCompat(context, i12);
    }

    @Override // com.discord.theme.DiscordTheme
    public int getActivityCardBackground() {
        return this.activityCardBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getAndroidNavigationBarBackground() {
        return this.androidNavigationBarBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getAndroidNavigationScrimBackground() {
        return this.androidNavigationScrimBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getAndroidRipple() {
        return this.androidRipple;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundAccent() {
        return this.backgroundAccent;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundFloating() {
        return this.backgroundFloating;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMentioned() {
        return this.backgroundMentioned;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMentionedHover() {
        return this.backgroundMentionedHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMessageAutomod() {
        return this.backgroundMessageAutomod;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMessageAutomodHover() {
        return this.backgroundMessageAutomodHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMessageHighlight() {
        return this.backgroundMessageHighlight;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMessageHighlightHover() {
        return this.backgroundMessageHighlightHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMessageHover() {
        return this.backgroundMessageHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMobilePrimary() {
        return this.backgroundMobilePrimary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundMobileSecondary() {
        return this.backgroundMobileSecondary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundModifierAccent() {
        return this.backgroundModifierAccent;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundModifierAccent2() {
        return this.backgroundModifierAccent2;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundModifierActive() {
        return this.backgroundModifierActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundModifierHover() {
        return this.backgroundModifierHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundModifierSelected() {
        return this.backgroundModifierSelected;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundNestedFloating() {
        return this.backgroundNestedFloating;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundPrimary() {
        return this.backgroundPrimary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundSecondary() {
        return this.backgroundSecondary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundSecondaryAlt() {
        return this.backgroundSecondaryAlt;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBackgroundTertiary() {
        return this.backgroundTertiary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBgBackdrop() {
        return this.bgBackdrop;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBgBackdropNoOpacity() {
        return this.bgBackdropNoOpacity;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBgBasePrimary() {
        return this.bgBasePrimary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBgBaseSecondary() {
        return this.bgBaseSecondary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBgBaseTertiary() {
        return this.bgBaseTertiary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBgModFaint() {
        return this.bgModFaint;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBgModStrong() {
        return this.bgModStrong;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBgModSubtle() {
        return this.bgModSubtle;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBgSurfaceOverlay() {
        return this.bgSurfaceOverlay;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBgSurfaceOverlayTmp() {
        return this.bgSurfaceOverlayTmp;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBgSurfaceRaised() {
        return this.bgSurfaceRaised;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBlack() {
        return this.black;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBlurFallback() {
        return this.blurFallback;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBlurFallbackPressed() {
        return this.blurFallbackPressed;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBorderFaint() {
        return this.borderFaint;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBorderStrong() {
        return this.borderStrong;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBorderSubtle() {
        return this.borderSubtle;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getBugReporterModalSubmittingBackground() {
        return this.bugReporterModalSubmittingBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonCreatorRevenueBackground() {
        return this.buttonCreatorRevenueBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonDangerBackground() {
        return this.buttonDangerBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonDangerBackgroundActive() {
        return this.buttonDangerBackgroundActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonDangerBackgroundDisabled() {
        return this.buttonDangerBackgroundDisabled;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonDangerBackgroundHover() {
        return this.buttonDangerBackgroundHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandBackground() {
        return this.buttonOutlineBrandBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandBackgroundActive() {
        return this.buttonOutlineBrandBackgroundActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandBackgroundHover() {
        return this.buttonOutlineBrandBackgroundHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandBorder() {
        return this.buttonOutlineBrandBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandBorderActive() {
        return this.buttonOutlineBrandBorderActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandBorderHover() {
        return this.buttonOutlineBrandBorderHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandText() {
        return this.buttonOutlineBrandText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandTextActive() {
        return this.buttonOutlineBrandTextActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineBrandTextHover() {
        return this.buttonOutlineBrandTextHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerBackground() {
        return this.buttonOutlineDangerBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerBackgroundActive() {
        return this.buttonOutlineDangerBackgroundActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerBackgroundHover() {
        return this.buttonOutlineDangerBackgroundHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerBorder() {
        return this.buttonOutlineDangerBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerBorderActive() {
        return this.buttonOutlineDangerBorderActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerBorderHover() {
        return this.buttonOutlineDangerBorderHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerText() {
        return this.buttonOutlineDangerText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerTextActive() {
        return this.buttonOutlineDangerTextActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlineDangerTextHover() {
        return this.buttonOutlineDangerTextHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveBackground() {
        return this.buttonOutlinePositiveBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveBackgroundActive() {
        return this.buttonOutlinePositiveBackgroundActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveBackgroundHover() {
        return this.buttonOutlinePositiveBackgroundHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveBorder() {
        return this.buttonOutlinePositiveBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveBorderActive() {
        return this.buttonOutlinePositiveBorderActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveBorderHover() {
        return this.buttonOutlinePositiveBorderHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveText() {
        return this.buttonOutlinePositiveText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveTextActive() {
        return this.buttonOutlinePositiveTextActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePositiveTextHover() {
        return this.buttonOutlinePositiveTextHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryBackground() {
        return this.buttonOutlinePrimaryBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryBackgroundActive() {
        return this.buttonOutlinePrimaryBackgroundActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryBackgroundHover() {
        return this.buttonOutlinePrimaryBackgroundHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryBorder() {
        return this.buttonOutlinePrimaryBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryBorderActive() {
        return this.buttonOutlinePrimaryBorderActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryBorderHover() {
        return this.buttonOutlinePrimaryBorderHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryText() {
        return this.buttonOutlinePrimaryText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryTextActive() {
        return this.buttonOutlinePrimaryTextActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonOutlinePrimaryTextHover() {
        return this.buttonOutlinePrimaryTextHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonPositiveBackground() {
        return this.buttonPositiveBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonPositiveBackgroundActive() {
        return this.buttonPositiveBackgroundActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonPositiveBackgroundDisabled() {
        return this.buttonPositiveBackgroundDisabled;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonPositiveBackgroundHover() {
        return this.buttonPositiveBackgroundHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonSecondaryBackground() {
        return this.buttonSecondaryBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonSecondaryBackgroundActive() {
        return this.buttonSecondaryBackgroundActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonSecondaryBackgroundDisabled() {
        return this.buttonSecondaryBackgroundDisabled;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getButtonSecondaryBackgroundHover() {
        return this.buttonSecondaryBackgroundHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getCardGradientBg() {
        return this.cardGradientBg;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getCardGradientPressedBg() {
        return this.cardGradientPressedBg;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getCardPrimaryBg() {
        return this.cardPrimaryBg;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getCardPrimaryPressedBg() {
        return this.cardPrimaryPressedBg;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getCardSecondaryBg() {
        return this.cardSecondaryBg;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getCardSecondaryPressedBg() {
        return this.cardSecondaryPressedBg;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getChannelIcon() {
        return this.channelIcon;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getChannelTextAreaPlaceholder() {
        return this.channelTextAreaPlaceholder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getChannelsDefault() {
        return this.channelsDefault;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getChanneltextareaBackground() {
        return this.channeltextareaBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getChatBackground() {
        return this.chatBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getChatBorder() {
        return this.chatBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getChatInputContainerBackground() {
        return this.chatInputContainerBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getChatSwipeToReplyBackground() {
        return this.chatSwipeToReplyBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getColor(int i, int i2) {
        return i2;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getColorRes(int i, int i2) {
        return i2;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getControlBrandForeground() {
        return this.controlBrandForeground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getControlBrandForegroundNew() {
        return this.controlBrandForegroundNew;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getCreatorRevenueIconGradientEnd() {
        return this.creatorRevenueIconGradientEnd;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getCreatorRevenueIconGradientStart() {
        return this.creatorRevenueIconGradientStart;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getCreatorRevenueInfoBoxBackground() {
        return this.creatorRevenueInfoBoxBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getCreatorRevenueInfoBoxBorder() {
        return this.creatorRevenueInfoBoxBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getCreatorRevenueLockedChannelIcon() {
        return this.creatorRevenueLockedChannelIcon;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getCreatorRevenueProgressBar() {
        return this.creatorRevenueProgressBar;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedCardBg() {
        return this.deprecatedCardBg;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedCardEditableBg() {
        return this.deprecatedCardEditableBg;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedQuickswitcherInputBackground() {
        return this.deprecatedQuickswitcherInputBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedQuickswitcherInputPlaceholder() {
        return this.deprecatedQuickswitcherInputPlaceholder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedStoreBg() {
        return this.deprecatedStoreBg;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedTextInputBg() {
        return this.deprecatedTextInputBg;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedTextInputBorder() {
        return this.deprecatedTextInputBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedTextInputBorderDisabled() {
        return this.deprecatedTextInputBorderDisabled;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedTextInputBorderHover() {
        return this.deprecatedTextInputBorderHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDeprecatedTextInputPrefix() {
        return this.deprecatedTextInputPrefix;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDisplayBannerOverflowBackground() {
        return this.displayBannerOverflowBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDividerStrong() {
        return this.dividerStrong;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getDividerSubtle() {
        return this.dividerSubtle;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getFocusPrimary() {
        return this.focusPrimary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getForumPostExtraMediaCountContainerBackground() {
        return this.forumPostExtraMediaCountContainerBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getForumPostTagBackground() {
        return this.forumPostTagBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getGuildNotificationsBottomSheetPillBackground() {
        return this.guildNotificationsBottomSheetPillBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getHeaderMuted() {
        return this.headerMuted;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getHeaderPrimary() {
        return this.headerPrimary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getHeaderSecondary() {
        return this.headerSecondary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getHomeBackground() {
        return this.homeBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getHomeCardRestingBorder() {
        return this.homeCardRestingBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getIconMuted() {
        return this.iconMuted;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getIconPrimary() {
        return this.iconPrimary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getIconSecondary() {
        return this.iconSecondary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoBoxBackground() {
        return this.infoBoxBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoDangerBackground() {
        return this.infoDangerBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoDangerForeground() {
        return this.infoDangerForeground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoDangerText() {
        return this.infoDangerText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoHelpBackground() {
        return this.infoHelpBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoHelpForeground() {
        return this.infoHelpForeground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoHelpText() {
        return this.infoHelpText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoPositiveBackground() {
        return this.infoPositiveBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoPositiveForeground() {
        return this.infoPositiveForeground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoPositiveText() {
        return this.infoPositiveText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoWarningBackground() {
        return this.infoWarningBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoWarningForeground() {
        return this.infoWarningForeground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInfoWarningText() {
        return this.infoWarningText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInputBackground() {
        return this.inputBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInputPlaceholderText() {
        return this.inputPlaceholderText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInteractiveActive() {
        return this.interactiveActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInteractiveHover() {
        return this.interactiveHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInteractiveMuted() {
        return this.interactiveMuted;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getInteractiveNormal() {
        return this.interactiveNormal;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getLegacyAndroidBlurOverlayDefault() {
        return this.legacyAndroidBlurOverlayDefault;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getLegacyAndroidBlurOverlayUltraThin() {
        return this.legacyAndroidBlurOverlayUltraThin;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getLegacyBlurFallbackDefault() {
        return this.legacyBlurFallbackDefault;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getLegacyBlurFallbackUltraThin() {
        return this.legacyBlurFallbackUltraThin;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getLiveStageTileBorder() {
        return this.liveStageTileBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getLogoPrimary() {
        return this.logoPrimary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getMentionBackground() {
        return this.mentionBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getMentionForeground() {
        return this.mentionForeground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getModalBackground() {
        return this.modalBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getModalFooterBackground() {
        return this.modalFooterBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getNavigatorHeaderTint() {
        return this.navigatorHeaderTint;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getProfileGradientCardBackground() {
        return this.profileGradientCardBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getProfileGradientMessageInputBorder() {
        return this.profileGradientMessageInputBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getProfileGradientNoteBackground() {
        return this.profileGradientNoteBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getProfileGradientOverlay() {
        return this.profileGradientOverlay;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getProfileGradientOverlaySyncedWithUserTheme() {
        return this.profileGradientOverlaySyncedWithUserTheme;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getProfileGradientProfileBodyBackgroundHover() {
        return this.profileGradientProfileBodyBackgroundHover;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getProfileGradientRolePillBackground() {
        return this.profileGradientRolePillBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getProfileGradientRolePillBorder() {
        return this.profileGradientRolePillBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getProfileGradientSectionBox() {
        return this.profileGradientSectionBox;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignActivityCardBackground() {
        return this.redesignActivityCardBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignActivityCardBackgroundPressed() {
        return this.redesignActivityCardBackgroundPressed;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignActivityCardBadgeIcon() {
        return this.redesignActivityCardBadgeIcon;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignActivityCardBorder() {
        return this.redesignActivityCardBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignActivityCardOverflowBackground() {
        return this.redesignActivityCardOverflowBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonDangerBackground() {
        return this.redesignButtonDangerBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonDangerPressedBackground() {
        return this.redesignButtonDangerPressedBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonDangerText() {
        return this.redesignButtonDangerText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonOverlayAlphaBackground() {
        return this.redesignButtonOverlayAlphaBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonOverlayAlphaPressedBackground() {
        return this.redesignButtonOverlayAlphaPressedBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonOverlayAlphaText() {
        return this.redesignButtonOverlayAlphaText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonOverlayBackground() {
        return this.redesignButtonOverlayBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonOverlayPressedBackground() {
        return this.redesignButtonOverlayPressedBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonOverlayText() {
        return this.redesignButtonOverlayText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPositiveBackground() {
        return this.redesignButtonPositiveBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPositivePressedBackground() {
        return this.redesignButtonPositivePressedBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPositiveText() {
        return this.redesignButtonPositiveText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryAltBackground() {
        return this.redesignButtonPrimaryAltBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryAltBorder() {
        return this.redesignButtonPrimaryAltBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryAltOnBlurpleBackground() {
        return this.redesignButtonPrimaryAltOnBlurpleBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryAltOnBlurpleBorder() {
        return this.redesignButtonPrimaryAltOnBlurpleBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryAltOnBlurplePressedBackground() {
        return this.redesignButtonPrimaryAltOnBlurplePressedBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryAltOnBlurplePressedBorder() {
        return this.redesignButtonPrimaryAltOnBlurplePressedBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryAltOnBlurpleText() {
        return this.redesignButtonPrimaryAltOnBlurpleText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryAltPressedBackground() {
        return this.redesignButtonPrimaryAltPressedBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryAltPressedBorder() {
        return this.redesignButtonPrimaryAltPressedBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryAltPressedText() {
        return this.redesignButtonPrimaryAltPressedText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryAltText() {
        return this.redesignButtonPrimaryAltText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryBackground() {
        return this.redesignButtonPrimaryBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryOnBlurpleBackground() {
        return this.redesignButtonPrimaryOnBlurpleBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryOnBlurplePressedBackground() {
        return this.redesignButtonPrimaryOnBlurplePressedBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryOnBlurplePressedText() {
        return this.redesignButtonPrimaryOnBlurplePressedText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryOnBlurpleText() {
        return this.redesignButtonPrimaryOnBlurpleText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryPressedBackground() {
        return this.redesignButtonPrimaryPressedBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonPrimaryText() {
        return this.redesignButtonPrimaryText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonSecondaryAltBackground() {
        return this.redesignButtonSecondaryAltBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonSecondaryAltPressedBackground() {
        return this.redesignButtonSecondaryAltPressedBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonSecondaryAltPressedText() {
        return this.redesignButtonSecondaryAltPressedText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonSecondaryAltText() {
        return this.redesignButtonSecondaryAltText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonSecondaryBackground() {
        return this.redesignButtonSecondaryBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonSecondaryBorder() {
        return this.redesignButtonSecondaryBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonSecondaryPressedBackground() {
        return this.redesignButtonSecondaryPressedBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonSecondaryPressedBorder() {
        return this.redesignButtonSecondaryPressedBorder;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignButtonSecondaryText() {
        return this.redesignButtonSecondaryText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignChannelCategoryNameText() {
        return this.redesignChannelCategoryNameText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignChannelMessagePreviewText() {
        return this.redesignChannelMessagePreviewText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignChannelNameMutedText() {
        return this.redesignChannelNameMutedText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignChannelNameText() {
        return this.redesignChannelNameText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignChatInputBackground() {
        return this.redesignChatInputBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignInputControlActiveBg() {
        return this.redesignInputControlActiveBg;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignInputControlSelected() {
        return this.redesignInputControlSelected;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignOnlyBackgroundActive() {
        return this.redesignOnlyBackgroundActive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignOnlyBackgroundDefault() {
        return this.redesignOnlyBackgroundDefault;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignOnlyBackgroundOverlay() {
        return this.redesignOnlyBackgroundOverlay;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignOnlyBackgroundRaised() {
        return this.redesignOnlyBackgroundRaised;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getRedesignOnlyBackgroundSunken() {
        return this.redesignOnlyBackgroundSunken;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getScrollbarAutoScrollbarColorThumb() {
        return this.scrollbarAutoScrollbarColorThumb;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getScrollbarAutoScrollbarColorTrack() {
        return this.scrollbarAutoScrollbarColorTrack;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getScrollbarAutoThumb() {
        return this.scrollbarAutoThumb;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getScrollbarAutoTrack() {
        return this.scrollbarAutoTrack;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getScrollbarThinThumb() {
        return this.scrollbarThinThumb;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getScrollbarThinTrack() {
        return this.scrollbarThinTrack;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getSpoilerHiddenBackground() {
        return this.spoilerHiddenBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getSpoilerRevealedBackground() {
        return this.spoilerRevealedBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusDanger() {
        return this.statusDanger;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusDangerBackground() {
        return this.statusDangerBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusDangerText() {
        return this.statusDangerText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusDnd() {
        return this.statusDnd;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusIdle() {
        return this.statusIdle;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusOffline() {
        return this.statusOffline;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusOnline() {
        return this.statusOnline;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusPositive() {
        return this.statusPositive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusPositiveBackground() {
        return this.statusPositiveBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusPositiveText() {
        return this.statusPositiveText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusSpeaking() {
        return this.statusSpeaking;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusWarning() {
        return this.statusWarning;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusWarningBackground() {
        return this.statusWarningBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getStatusWarningText() {
        return this.statusWarningText;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextBrand() {
        return this.textBrand;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextDanger() {
        return this.textDanger;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextLink() {
        return this.textLink;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextLinkLowSaturation() {
        return this.textLinkLowSaturation;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextLowContrast() {
        return this.textLowContrast;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextMessagePreviewLowSat() {
        return this.textMessagePreviewLowSat;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextMuted() {
        return this.textMuted;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextMutedOnDefault() {
        return this.textMutedOnDefault;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextNormal() {
        return this.textNormal;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextPositive() {
        return this.textPositive;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextPrimary() {
        return this.textPrimary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextSecondary() {
        return this.textSecondary;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextWarning() {
        return this.textWarning;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getTextboxMarkdownSyntax() {
        return this.textboxMarkdownSyntax;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getThemeLockedBlurFallback() {
        return this.themeLockedBlurFallback;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getUserProfileHeaderOverflowBackground() {
        return this.userProfileHeaderOverflowBackground;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getVoiceVideoTileBlurFallback() {
        return this.voiceVideoTileBlurFallback;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getVoiceVideoVideoTileBlurFallback() {
        return this.voiceVideoVideoTileBlurFallback;
    }

    @Override // com.discord.theme.DiscordTheme
    public int getWhite() {
        return this.white;
    }
}

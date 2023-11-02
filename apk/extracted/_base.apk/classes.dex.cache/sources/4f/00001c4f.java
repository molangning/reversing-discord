package com.discord.notifications.renderer.utils;

import android.text.format.DateUtils;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.text.DateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9654p;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import p355ti.C12786b;

@Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, m14357d2 = {"renderNotificationMessageContent", "", "content", "notification_renderer_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class RenderNotificationMessageContentKt {
    public static final String renderNotificationMessageContent(String content) {
        DateFormat dateTimeInstance;
        CharSequence formatted;
        CharSequence m13688t0;
        CharSequence m13688t02;
        C9612q.m13917h(content, "content");
        Regex regex = new Regex("(```(?:([a-z0-9_+\\-.]+?)\\n)?\\n*([^\\n].*?)\\n*```)");
        Regex regex2 = new Regex("((`+)([\\s\\S]*?[^`])\\2(?!`))");
        Regex regex3 = new Regex("<t:(-?\\d{1,17})(?::([tTdDfFR]))?>");
        String m13866i = regex2.m13866i(regex.m13866i(content, C3354xb68ee08c.INSTANCE), C3355xb68ee08d.INSTANCE);
        while (true) {
            String str = null;
            MatchResult m13872c = Regex.m13872c(regex3, m13866i, 0, 2, null);
            if (m13872c == null) {
                return content;
            }
            C12786b c12786b = m13872c.mo3923d().get(1);
            C9612q.m13920e(c12786b);
            String m3927a = c12786b.m3927a();
            C12786b c12786b2 = m13872c.mo3923d().get(2);
            if (c12786b2 != null) {
                str = c12786b2.m3927a();
            }
            Date date = new Date(Long.parseLong(m3927a) * ((long) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA));
            if (C9612q.m13922c(str, "R")) {
                formatted = DateUtils.getRelativeTimeSpanString(date.getTime());
            } else {
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != 68) {
                        if (hashCode != 70) {
                            if (hashCode != 84) {
                                if (hashCode != 100) {
                                    if (hashCode != 102) {
                                        if (hashCode == 116 && str.equals("t")) {
                                            dateTimeInstance = DateFormat.getTimeInstance(3);
                                            formatted = dateTimeInstance.format(date);
                                        }
                                    } else if (str.equals("f")) {
                                        dateTimeInstance = DateFormat.getDateTimeInstance(1, 3);
                                        formatted = dateTimeInstance.format(date);
                                    }
                                } else if (str.equals("d")) {
                                    dateTimeInstance = DateFormat.getDateInstance(3);
                                    formatted = dateTimeInstance.format(date);
                                }
                            } else if (str.equals("T")) {
                                dateTimeInstance = DateFormat.getTimeInstance(2);
                                formatted = dateTimeInstance.format(date);
                            }
                        } else if (str.equals("F")) {
                            dateTimeInstance = DateFormat.getDateTimeInstance(0, 3);
                            formatted = dateTimeInstance.format(date);
                        }
                    } else if (str.equals("D")) {
                        dateTimeInstance = DateFormat.getDateInstance(1);
                        formatted = dateTimeInstance.format(date);
                    }
                }
                dateTimeInstance = DateFormat.getDateTimeInstance(1, 3);
                formatted = dateTimeInstance.format(date);
            }
            C9612q.m13918g(formatted, "formatted");
            m13688t0 = C9654p.m13688t0(content, m13872c.mo3924c().m13890a(), m13872c.mo3924c().m13889e() + 1, formatted);
            content = m13688t0.toString();
            m13688t02 = C9654p.m13688t0(m13866i, m13872c.mo3924c().m13890a(), m13872c.mo3924c().m13889e() + 1, formatted);
            m13866i = m13688t02.toString();
        }
    }
}
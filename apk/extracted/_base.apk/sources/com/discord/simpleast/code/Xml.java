package com.discord.simpleast.code;

import android.text.SpannableStringBuilder;
import com.discord.simpleast.code.Xml;
import com.discord.simpleast.core.node.Node;
import com.discord.simpleast.core.parser.ParseSpec;
import com.discord.simpleast.core.parser.Parser;
import com.discord.simpleast.core.parser.Rule;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9637b;
import pf.C11591x;

@Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\r\u001a\u001a\u0012\u0004\u0012\u0002H\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0010\u0012\u0004\u0012\u0002H\u00110\u000e\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m14357d2 = {"Lcom/discord/simpleast/code/Xml;", "", "()V", "PATTERN_XML_COMMENT", "Ljava/util/regex/Pattern;", "getPATTERN_XML_COMMENT", "()Ljava/util/regex/Pattern;", "PATTERN_XML_TAG", "getPATTERN_XML_TAG", "PATTERN_XML_TAG_CLOSING_GROUP", "", "PATTERN_XML_TAG_CONTENT_GROUP", "PATTERN_XML_TAG_OPENING_GROUP", "createTagRule", "Lcom/discord/simpleast/core/parser/Rule;", "RC", "Lcom/discord/simpleast/core/node/Node;", "S", "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "TagNode", "simpleast-core_release"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class Xml {
    public static final Xml INSTANCE = new Xml();
    private static final Pattern PATTERN_XML_COMMENT;
    private static final Pattern PATTERN_XML_TAG;
    public static final int PATTERN_XML_TAG_CLOSING_GROUP = 3;
    public static final int PATTERN_XML_TAG_CONTENT_GROUP = 2;
    public static final int PATTERN_XML_TAG_OPENING_GROUP = 1;

    @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0012"}, m14357d2 = {"Lcom/discord/simpleast/code/Xml$TagNode;", "RC", "Lcom/discord/simpleast/core/node/Node$Parent;", "opening", "", "closing", "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/simpleast/code/CodeStyleProviders;)V", "getClosing", "()Ljava/lang/String;", "getOpening", "render", "", "builder", "Landroid/text/SpannableStringBuilder;", "renderContext", "(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V", "simpleast-core_release"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class TagNode<RC> extends Node.Parent<RC> {
        private final String closing;
        private final CodeStyleProviders<RC> codeStyleProviders;
        private final String opening;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TagNode(String opening, String str, CodeStyleProviders<RC> codeStyleProviders) {
            super(new Node[0]);
            C9612q.m13917h(opening, "opening");
            C9612q.m13917h(codeStyleProviders, "codeStyleProviders");
            this.opening = opening;
            this.closing = str;
            this.codeStyleProviders = codeStyleProviders;
        }

        public final String getClosing() {
            return this.closing;
        }

        public final String getOpening() {
            return this.opening;
        }

        @Override // com.discord.simpleast.core.node.Node.Parent, com.discord.simpleast.core.node.Node
        public void render(SpannableStringBuilder builder, RC rc) {
            Pair m7577a;
            boolean m13852c;
            boolean z;
            C9612q.m13917h(builder, "builder");
            String str = this.opening;
            int length = str.length();
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i < length) {
                    char charAt = str.charAt(i);
                    m13852c = C9637b.m13852c(charAt);
                    if (!m13852c && charAt != '/') {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                String str2 = this.opening;
                if (str2 != null) {
                    String substring = str2.substring(0, i);
                    C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    String str3 = this.opening;
                    if (str3 != null) {
                        String substring2 = str3.substring(i);
                        C9612q.m13918g(substring2, "(this as java.lang.String).substring(startIndex)");
                        m7577a = C11591x.m7577a(substring, substring2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                m7577a = C11591x.m7577a(this.opening, "");
            }
            String str4 = (String) m7577a.m14350b();
            Xml$TagNode$render$typeStylesProvider$1 xml$TagNode$render$typeStylesProvider$1 = new Xml$TagNode$render$typeStylesProvider$1(this.codeStyleProviders.getGenericsStyleProvider());
            int length2 = builder.length();
            builder.append((CharSequence) ('<' + ((String) m7577a.m14351a())));
            Iterator<?> it = xml$TagNode$render$typeStylesProvider$1.invoke((Xml$TagNode$render$typeStylesProvider$1) rc).iterator();
            while (it.hasNext()) {
                builder.setSpan(it.next(), length2, builder.length(), 33);
            }
            int length3 = builder.length();
            builder.append((CharSequence) (str4 + '>'));
            Iterator<?> it2 = this.codeStyleProviders.getParamsStyleProvider().get(rc).iterator();
            while (it2.hasNext()) {
                builder.setSpan(it2.next(), length3, builder.length() - 1, 33);
            }
            Iterator<?> it3 = xml$TagNode$render$typeStylesProvider$1.invoke((Xml$TagNode$render$typeStylesProvider$1) rc).iterator();
            while (it3.hasNext()) {
                builder.setSpan(it3.next(), builder.length() - 1, builder.length(), 33);
            }
            super.render(builder, rc);
            String str5 = this.closing;
            if (str5 == null || str5.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                int length4 = builder.length();
                builder.append((CharSequence) ("</" + this.closing + '>'));
                Iterator<?> it4 = xml$TagNode$render$typeStylesProvider$1.invoke((Xml$TagNode$render$typeStylesProvider$1) rc).iterator();
                while (it4.hasNext()) {
                    builder.setSpan(it4.next(), length4 + 1, builder.length(), 33);
                }
            }
        }
    }

    static {
        Pattern compile = Pattern.compile("^<!--[\\s\\S]*?-->", 32);
        C9612q.m13918g(compile, "Pattern.compile(\"\"\"^<!--…*?-->\"\"\", Pattern.DOTALL)");
        PATTERN_XML_COMMENT = compile;
        Pattern compile2 = Pattern.compile("^<([\\s\\S]+?)(?:>(.*?)<\\/([\\s\\S]+?))?>", 32);
        C9612q.m13918g(compile2, "Pattern.compile(\n      \"…?))?>\"\"\", Pattern.DOTALL)");
        PATTERN_XML_TAG = compile2;
    }

    private Xml() {
    }

    public final <RC, S> Rule<RC, Node<RC>, S> createTagRule(final CodeStyleProviders<RC> codeStyleProviders) {
        C9612q.m13917h(codeStyleProviders, "codeStyleProviders");
        final Pattern pattern = PATTERN_XML_TAG;
        return new Rule<RC, Node<RC>, S>(pattern) { // from class: com.discord.simpleast.code.Xml$createTagRule$1
            @Override // com.discord.simpleast.core.parser.Rule
            public ParseSpec<RC, S> parse(Matcher matcher, Parser<RC, ? super Node<RC>, S> parser, S s) {
                C9612q.m13917h(matcher, "matcher");
                C9612q.m13917h(parser, "parser");
                String group = matcher.group(1);
                C9612q.m13920e(group);
                String group2 = matcher.group(3);
                if (matcher.group(2) != null) {
                    return ParseSpec.Companion.createNonterminal(new Xml.TagNode(group, group2, codeStyleProviders), s, matcher.start(2), matcher.end(2));
                }
                return ParseSpec.Companion.createTerminal(new Xml.TagNode(group, group2, codeStyleProviders), s);
            }
        };
    }

    public final Pattern getPATTERN_XML_COMMENT() {
        return PATTERN_XML_COMMENT;
    }

    public final Pattern getPATTERN_XML_TAG() {
        return PATTERN_XML_TAG;
    }
}

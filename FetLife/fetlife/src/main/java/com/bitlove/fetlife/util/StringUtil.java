package com.bitlove.fetlife.util;

import android.text.Html;

import java.util.List;

public class StringUtil {

    public static final CharSequence parseHtml(String htmlString) {

        if (htmlString == null) {
            return null;
        }

        htmlString = htmlString.replace("\n", "<br/>");

//        CharSequence sequence = Html.fromHtml(htmlString);
//        SpannableStringBuilder strBuilder = new SpannableStringBuilder(sequence);
//        URLSpan[] urls = strBuilder.getSpans(0, sequence.length(), URLSpan.class);
//        for(URLSpan span : urls) {
//            makeLinkClickable(strBuilder, span);
//        }
//        return strBuilder;

        return Html.fromHtml(htmlString);
    }

//    protected static void makeLinkClickable(SpannableStringBuilder strBuilder, final URLSpan span) {
//        int start = strBuilder.getSpanStart(span);
//        int end = strBuilder.getSpanEnd(span);
//        int flags = strBuilder.getSpanFlags(span);
//        ClickableSpan clickable = new ClickableSpan() {
//            public void onClick(View view) {
//                // Do something with span.getURL() to handle the link click...
//            }
//        };
//        strBuilder.setSpan(clickable, start, end, flags);
//        strBuilder.removeSpan(span);
//    }

    public static final String toString(List<String> list, String separator) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean first = true;
        for (String item : list) {
            if (!first) {
                stringBuilder.append(separator);
            } else {
                first = false;
            }
            stringBuilder.append(item);
        }
        return stringBuilder.toString();
    }
}
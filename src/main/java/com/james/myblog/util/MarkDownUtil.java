package com.james.myblog.util;

import org.commonmark.Extension;
import org.commonmark.ext.gfm.tables.TablesExtension;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * markdown 工具类
 * 调用包org.commonmark
 * @author: JamesZhan
 * @create: 2019 - 09 - 01 21:07
 */
public class MarkDownUtil {

    /**
     * 将markdown转换成html文件
     * @param markDownStr
     * @return
     */
    public static String mdToHtml(String markDownStr){
        if (StringUtils.isEmpty(markDownStr)) {
            return "";
        }
        List<Extension> extensions = Arrays.asList(TablesExtension.create());
        Parser parser = Parser.builder().extensions(extensions).build();
        Node document = parser.parse(markDownStr);
        HtmlRenderer renderer = HtmlRenderer.builder().extensions(extensions).build();
        String content = renderer.render(document);
        return content;
    }

}

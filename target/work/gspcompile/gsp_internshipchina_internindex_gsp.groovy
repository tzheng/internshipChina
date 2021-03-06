import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_internshipchina_internindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/intern/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(3)
createTagBody(2, {->
createClosureForHtmlPart(4, 3)
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',13,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
loop:{
int i = 0
for( intern in (internlist) ) {
printHtmlPart(7)
expressionOut.print('showdetail'+i)
printHtmlPart(8)
expressionOut.print(intern.title)
printHtmlPart(9)
expressionOut.print(intern.location)
printHtmlPart(10)
expressionOut.print(intern.date)
printHtmlPart(11)
expressionOut.print(intern.source)
printHtmlPart(12)
expressionOut.print('#showdetail'+i)
printHtmlPart(13)
expressionOut.print('detail'+i)
printHtmlPart(14)
expressionOut.print('showdetail'+i)
printHtmlPart(15)
expressionOut.print('detail'+i)
printHtmlPart(16)
expressionOut.print(intern.description)
printHtmlPart(17)
i++
}
}
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',139,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392959563325L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2022-11-01 19:48:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.exception;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class accessDenied_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(12);
    _jspx_dependants.put("/WEB-INF/lib/seroUtils.jar", Long.valueOf(1626572386000L));
    _jspx_dependants.put("jar:file:/C:/Program%20Files/ScadaBR/tomcat/webapps/ScadaBR/WEB-INF/lib/seroUtils.jar!/META-INF/serotonin.tld", Long.valueOf(1302093804000L));
    _jspx_dependants.put("jar:file:/C:/Program%20Files/ScadaBR/tomcat/webapps/ScadaBR/WEB-INF/lib/jstl-impl-1.2.jar!/META-INF/c-1_0-rt.tld", Long.valueOf(1274197894000L));
    _jspx_dependants.put("jar:file:/C:/Program%20Files/ScadaBR/tomcat/webapps/ScadaBR/WEB-INF/lib/jstl-impl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1274197894000L));
    _jspx_dependants.put("/WEB-INF/jsp/include/tech.jsp", Long.valueOf(1626572384000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc.jar", Long.valueOf(1626572382000L));
    _jspx_dependants.put("jar:file:/C:/Program%20Files/ScadaBR/tomcat/webapps/ScadaBR/WEB-INF/lib/jstl-impl-1.2.jar!/META-INF/fmt-1_0-rt.tld", Long.valueOf(1274197894000L));
    _jspx_dependants.put("/WEB-INF/tld/mango.tld", Long.valueOf(1626572382000L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-log.jar", Long.valueOf(1626572384000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-impl-1.2.jar", Long.valueOf(1626572386000L));
    _jspx_dependants.put("jar:file:/C:/Program%20Files/ScadaBR/tomcat/webapps/ScadaBR/WEB-INF/lib/spring-webmvc.jar!/META-INF/spring.tld", Long.valueOf(1192703364000L));
    _jspx_dependants.put("jar:file:/C:/Program%20Files/ScadaBR/tomcat/webapps/ScadaBR/WEB-INF/lib/taglibs-log.jar!/META-INF/taglib.tld", Long.valueOf(1042464458000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flog_005ferror_0026_005fmessage_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flog_005ferror_0026_005fmessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flog_005ferror_0026_005fmessage_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    java.lang.Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus(javax.servlet.http.HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

// Store the stack trace as a request attribute.
java.io.StringWriter sw = new java.io.StringWriter();
exception.printStackTrace(new java.io.PrintWriter(sw));

// Write the request url into the message.
sw.append("\r\nREQUEST URL\r\n");
sw.append(request.getRequestURL());

// Write the request parameters.
sw.append("\r\n\r\nREQUEST PARAMETERS\r\n");
java.util.Enumeration names = request.getParameterNames();
while (names.hasMoreElements()) {
    String name = (String) names.nextElement();
    sw.append("   ").append(name).append('=').append(request.getParameter(name)).append("\r\n");
}

// Write the request headers.
sw.append("\r\n\r\nREQUEST HEADERS\r\n");
names = request.getHeaderNames();
while (names.hasMoreElements()) {
    String name = (String) names.nextElement();
    sw.append("   ").append(name).append('=').append(request.getHeader(name)).append("\r\n");
}

// Write the page attributes.
//sw.append("\r\n\r\nPAGE ATTRIBUTES\r\n");
//names = pageContext.getAttributeNames();
//while (names.hasMoreElements()) {
//    String name = (String) names.nextElement();
//    sw.append("   ").append(name).append('=').append(pageContext.getAttribute(name)).append("\r\n");
//}

// Write the request attributes.
sw.append("\r\n\r\nREQUEST ATTRIBUTES\r\n");
names = request.getAttributeNames();
while (names.hasMoreElements()) {
    String name = (String) names.nextElement();
    sw.append("   ").append(name).append('=').append(String.valueOf(request.getAttribute(name))).append("\r\n");
}

if (request.getSession() != null) {
    // Write the session attributes.
    sw.append("\r\n\r\nSESSION ATTRIBUTES\r\n");
    names = session.getAttributeNames();
    while (names.hasMoreElements()) {
        String name = (String) names.nextElement();
        sw.append("   ").append(name).append('=').append(String.valueOf(session.getAttribute(name))).append("\r\n");
    }
}

request.setAttribute("stackTrace", sw.toString());

      out.write("\r\n");
      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("<span class=\"bigTitle\">Permission denied!</span><br/>\r\n");
      out.write("<br/>\r\n");
      out.write("You do not have sufficient authority to access the resource you requested. Sadly, this exception must be logged\r\n");
      out.write("for review by a system administrator.<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("\r\n");
      if (_jspx_meth_log_005ferror_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_log_005ferror_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  log:error
    org.apache.taglibs.log.ErrorTag _jspx_th_log_005ferror_005f0 = (org.apache.taglibs.log.ErrorTag) _005fjspx_005ftagPool_005flog_005ferror_0026_005fmessage_005fnobody.get(org.apache.taglibs.log.ErrorTag.class);
    boolean _jspx_th_log_005ferror_005f0_reused = false;
    try {
      _jspx_th_log_005ferror_005f0.setPageContext(_jspx_page_context);
      _jspx_th_log_005ferror_005f0.setParent(null);
      // /exception/accessDenied.jsp(83,0) name = message type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_log_005ferror_005f0.setMessage((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stackTrace}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_log_005ferror_005f0 = _jspx_th_log_005ferror_005f0.doStartTag();
      if (_jspx_th_log_005ferror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005flog_005ferror_0026_005fmessage_005fnobody.reuse(_jspx_th_log_005ferror_005f0);
      _jspx_th_log_005ferror_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_log_005ferror_005f0, _jsp_getInstanceManager(), _jspx_th_log_005ferror_005f0_reused);
    }
    return false;
  }
}

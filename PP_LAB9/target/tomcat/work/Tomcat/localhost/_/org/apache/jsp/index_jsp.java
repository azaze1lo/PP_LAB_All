/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-18 13:03:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(11);
    _jspx_dependants.put("/WEB-INF/tags/registerButton.tag", Long.valueOf(1327578840000L));
    _jspx_dependants.put("/WEB-INF/tlds/ad.tld", Long.valueOf(1589742913141L));
    _jspx_dependants.put("/WEB-INF/tags/errorMessage.tag", Long.valueOf(1327578710000L));
    _jspx_dependants.put("/WEB-INF/tags/layout2Columns.tag", Long.valueOf(1327578756000L));
    _jspx_dependants.put("/static/footer.jsp", Long.valueOf(1589743107980L));
    _jspx_dependants.put("/WEB-INF/tags/adListing.tag", Long.valueOf(1327579831000L));
    _jspx_dependants.put("/WEB-INF/tlds/fmt.tld", Long.valueOf(1098700424000L));
    _jspx_dependants.put("/WEB-INF/tags/loginForm.tag", Long.valueOf(1327579717000L));
    _jspx_dependants.put("/WEB-INF/tlds/c.tld", Long.valueOf(1098700424000L));
    _jspx_dependants.put("/WEB-INF/tags/editButton.tag", Long.valueOf(1589743029159L));
    _jspx_dependants.put("/WEB-INF/tags/deleteButton.tag", Long.valueOf(1589743029145L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Главная страница</title>\n");
      out.write("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/static/header.jsp", out, false);
      out.write("\n");
      out.write("\t<h1>Главная страница</h1>\n");
      out.write("\t");
      if (_jspx_meth_my_005flayout2Columns_005f0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("<div style=\"background-color: #a0c8ff; height: 40px;\">\n");
      out.write("\t<div\n");
      out.write("\t\tstyle=\"font-family: 'Trebuchet'; font-size: 12px; padding-top: 11px; text-align: center;\">\n");
      out.write("\t\t&copy; Лабораторная работа №9. Курс \"Прикладное программирование\".\n");
      out.write("\t\t2020</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_my_005flayout2Columns_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  my:layout2Columns
    org.apache.jsp.tag.weblayout2Columns_tag _jspx_th_my_005flayout2Columns_005f0 = (new org.apache.jsp.tag.weblayout2Columns_tag());
    _jsp_instancemanager.newInstance(_jspx_th_my_005flayout2Columns_005f0);
    _jspx_th_my_005flayout2Columns_005f0.setJspContext(_jspx_page_context);
    // /index.jsp(15,1) name = leftColumnWidth type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_my_005flayout2Columns_005f0.setLeftColumnWidth("68%");
    // /index.jsp(15,1) name = rightColumnWidth type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_my_005flayout2Columns_005f0.setRightColumnWidth("28%");
    out = _jspx_page_context.pushBody();
    if (_jspx_meth_ad_005fgetAds_005f0(_jspx_page_context))
      return true;
    out.write('\n');
    if (_jspx_meth_my_005fadListing_005f0(_jspx_page_context))
      return true;
    java.lang.String _jspx_temp0 = ((javax.servlet.jsp.tagext.BodyContent)out).getString();
    out = _jspx_page_context.popBody();
    // /index.jsp(15,1) null
    _jspx_th_my_005flayout2Columns_005f0.setLeftColumnBody(_jspx_temp0);
    out = _jspx_page_context.pushBody();
    if (_jspx_meth_my_005ferrorMessage_005f0(_jspx_page_context))
      return true;
    out.write('\n');
    if (_jspx_meth_my_005floginForm_005f0(_jspx_page_context))
      return true;
    out.write('\n');
    if (_jspx_meth_my_005fregisterButton_005f0(_jspx_page_context))
      return true;
    java.lang.String _jspx_temp1 = ((javax.servlet.jsp.tagext.BodyContent)out).getString();
    out = _jspx_page_context.popBody();
    // /index.jsp(15,1) null
    _jspx_th_my_005flayout2Columns_005f0.setRightColumnBody(_jspx_temp1);
    _jspx_th_my_005flayout2Columns_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_my_005flayout2Columns_005f0);
    return false;
  }

  private boolean _jspx_meth_ad_005fgetAds_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ad:getAds
    bsu.rfct.vlada.group9.var1.tag.GetAds _jspx_th_ad_005fgetAds_005f0 = (new bsu.rfct.vlada.group9.var1.tag.GetAds());
    _jsp_instancemanager.newInstance(_jspx_th_ad_005fgetAds_005f0);
    _jspx_th_ad_005fgetAds_005f0.setJspContext(_jspx_page_context);
    // /index.jsp(17,0) name = range type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ad_005fgetAds_005f0.setRange("all");
    // /index.jsp(17,0) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ad_005fgetAds_005f0.setVar("adListing");
    // /index.jsp(17,0) name = sort type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ad_005fgetAds_005f0.setSort((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sort}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /index.jsp(17,0) name = dir type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ad_005fgetAds_005f0.setDir(((java.lang.Character) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.dir}", java.lang.Character.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).charValue());
    _jspx_th_ad_005fgetAds_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_ad_005fgetAds_005f0);
    return false;
  }

  private boolean _jspx_meth_my_005fadListing_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  my:adListing
    org.apache.jsp.tag.webadListing_tag _jspx_th_my_005fadListing_005f0 = (new org.apache.jsp.tag.webadListing_tag());
    _jsp_instancemanager.newInstance(_jspx_th_my_005fadListing_005f0);
    _jspx_th_my_005fadListing_005f0.setJspContext(_jspx_page_context);
    // /index.jsp(19,0) name = adListing type = java.util.AbstractCollection reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_my_005fadListing_005f0.setAdListing((java.util.AbstractCollection) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adListing}", java.util.AbstractCollection.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /index.jsp(19,0) name = editMode type = java.lang.Boolean reqTime = false required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_my_005fadListing_005f0.setEditMode(new java.lang.Boolean(false));
    _jspx_th_my_005fadListing_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_my_005fadListing_005f0);
    return false;
  }

  private boolean _jspx_meth_my_005ferrorMessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  my:errorMessage
    org.apache.jsp.tag.weberrorMessage_tag _jspx_th_my_005ferrorMessage_005f0 = (new org.apache.jsp.tag.weberrorMessage_tag());
    _jsp_instancemanager.newInstance(_jspx_th_my_005ferrorMessage_005f0);
    _jspx_th_my_005ferrorMessage_005f0.setJspContext(_jspx_page_context);
    _jspx_th_my_005ferrorMessage_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_my_005ferrorMessage_005f0);
    return false;
  }

  private boolean _jspx_meth_my_005floginForm_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  my:loginForm
    org.apache.jsp.tag.webloginForm_tag _jspx_th_my_005floginForm_005f0 = (new org.apache.jsp.tag.webloginForm_tag());
    _jsp_instancemanager.newInstance(_jspx_th_my_005floginForm_005f0);
    _jspx_th_my_005floginForm_005f0.setJspContext(_jspx_page_context);
    out = _jspx_page_context.pushBody();
    if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
      return true;
    java.lang.String _jspx_temp2 = ((javax.servlet.jsp.tagext.BodyContent)out).getString();
    out = _jspx_page_context.popBody();
    // /index.jsp(23,0) null
    _jspx_th_my_005floginForm_005f0.setProcessor(_jspx_temp2);
    _jspx_th_my_005floginForm_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_my_005floginForm_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /index.jsp(25,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/doLogin.jsp");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_my_005fregisterButton_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  my:registerButton
    org.apache.jsp.tag.webregisterButton_tag _jspx_th_my_005fregisterButton_005f0 = (new org.apache.jsp.tag.webregisterButton_tag());
    _jsp_instancemanager.newInstance(_jspx_th_my_005fregisterButton_005f0);
    _jspx_th_my_005fregisterButton_005f0.setJspContext(_jspx_page_context);
    out = _jspx_page_context.pushBody();
    if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
      return true;
    java.lang.String _jspx_temp3 = ((javax.servlet.jsp.tagext.BodyContent)out).getString();
    out = _jspx_page_context.popBody();
    // /index.jsp(28,0) null
    _jspx_th_my_005fregisterButton_005f0.setProcessor(_jspx_temp3);
    _jspx_th_my_005fregisterButton_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_my_005fregisterButton_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /index.jsp(30,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/register.jsp");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }
}
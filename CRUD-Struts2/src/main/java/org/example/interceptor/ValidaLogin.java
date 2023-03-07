///*
// * Classe interceptor para executar antes de todas as requicisoes menos a da index.jsp (pagina de login)
//*/
//package org.example.interceptor;
//
//import javax.servlet.http.HttpSession;
//import org.apache.struts2.ServletActionContext;
//import com.opensymphony.xwork2.ActionInvocation;
//import com.opensymphony.xwork2.interceptor.Interceptor;
//
//
//public class ValidaLogin implements Interceptor{
//
//	@Override
//	public void destroy() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void init() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public String intercept(ActionInvocation invocation) throws Exception {
//
//		HttpSession session = ServletActionContext.getRequest().getSession(false);
//        if(session==null || session.getAttribute("Usuario")==null){
//            return "Expirada";   // se nao tiver sessao , chama Login
//        }
//        else{
//            return invocation.invoke(); // caso ja tiver sessao , segue
//
//        }
//	}
//
//}
//
//

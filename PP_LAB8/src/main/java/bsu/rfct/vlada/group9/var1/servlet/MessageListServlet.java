package bsu.rfct.vlada.group9.var1.servlet;

import java.io.IOException; 
import java.io.PrintWriter;

import javax.servlet.ServletException; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import bsu.rfct.vlada.group9.var1.entity.ChatMessage;


public class MessageListServlet extends ChatServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {
        // ”становить кодировку HTTP-ответа UTF-8
        response.setCharacterEncoding("utf8");
        // ѕолучить доступ к потоку вывода HTTP-ответа
        PrintWriter pw = response.getWriter();
        // «аписть в поток HTML-разметку страницы
        pw.println("<html><head><meta http-equiv='Content-Type' " +
                "content='text/html; charset=utf-8'/><meta http-equiv='refresh' " +
                "content='10'></head>");
        pw.println("<body>");
        // ¬ обратном пор¤дке записать в поток HTML-разметку дл¤ каждого сообщени¤

        for (int i=0; i<=messages.size()-1; i++) {
            ChatMessage aMessage = messages.get(i);

            pw.println("<div><strong>" + aMessage.getAuthor().getName() + "</strong>: " + aMessage.getMessage() + "</div>");

        }
        pw.println("</body></html>");
    }
}
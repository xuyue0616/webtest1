package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HelloAjax")
public class HelloAjax extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public HelloAjax() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //������������,��requestȡ����,ͨ��˵���Ǵ������ȡ����
        String name = request.getParameter("uname");
        System.out.println("��ӭ:"+name);
        PrintWriter out = response.getWriter();//���ص���PrintWriter������һ����ӡ�������
        out.print("this is Ajax");//�������Դ�ӡ����ı���ʽ�ģ�����html��ǩ���������Խ�һ��������Ĭ�ϵı��뷽ʽת��Ϊ�������ֽ����
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}

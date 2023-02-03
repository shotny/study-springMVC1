<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="hello.servlet.domain.member.Member;" %>
<%@ page import="hello.servlet.domain.member.MemberRepository;" %>

<% // 자바코드 넣을 때 쓰는 표시~
    // Servlet - request, response 문법상 서블릿걸로 지원함!
    MemberRepository memberRepository = MemberRepository.getInstance();

    String username = request.getParameter("username");
    int age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username, age);
    memberRepository.save(member);
%>
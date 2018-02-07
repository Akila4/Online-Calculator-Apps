package CalculatorPkgclass;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;

/**
 * Servlet implementation class AgeServlet
 */
@WebServlet("/AgeServlet")
public class AgeServlet extends HttpServlet {
	 int  Day;
     int Month;
    int Year;
   int  BDay;
    int BMonth;
   int BYear,d,m,y;
    public  String calculate(int Day,int Month,int Year,int BDay,int BMonth,int BYear)
    {
    	
  	  int[] mo = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      int m3 = 0;
      int y3 = 0;
       d = 0;
       m = 0;
       y = 0;
      if ((Year % 4 == 0) && (Year % 400 == 0)) {

          mo[1] = 29;
      } else {
          mo[1] = 28;
      }
      for (int i = 0; i < mo.length; i++) {
          if (Day < BDay) {
              d = Day + mo[Month - 1] - BDay;
              m3 = Month - 1;
              if (m3 < BMonth) {
                  m = m3 + 12 - BMonth;
                  y3 = Year - 1;
                  y = y3 - BYear;
              } else {
                  m = Month - BMonth;
                  y = Year - BYear;
              }
          } else {
              d = Day - BDay;
              if (Month < BMonth) {
                  m = Month + 12 - BMonth;
                  y = Year - 1 - BYear;
              } else {
                  m = Month - BMonth;
                  y = Year - BYear;
              }
          }
      }

return "		Day"+d+"		Months"+m+"			Year"+y;
    }
	 
	   @Override
	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	               throws IOException, ServletException {
		   PrintWriter out = response.getWriter();
		   try{
			   
		   CustomerData customer=new CustomerData();
        customer.setDay(Integer.parseInt(request.getParameter("Day")));
        customer.setMonth(Integer.parseInt(request.getParameter("Month")));
        customer.setYear(Integer.parseInt(request.getParameter("Year")));
        customer.setbirthDay(Integer.parseInt(request.getParameter("birthDay")));
        customer.setbirthMonth(Integer.parseInt(request.getParameter("birthMonth")));
        customer.setbirthYear(Integer.parseInt(request.getParameter("birthYear")));
       // customer.calculate();
        out.println("<!DOCTYPE html>");
        out.println("<html><head>");
        out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
        out.println("<title>AGE CALCULATOR</title></head>");
        out.println("<body bgcolor='grey'><br>");
        out.println("<center><h1> " );
        String a = calculate(customer.getDay(),customer.getMonth(),customer.getYear(),customer.getbirthDay(),customer.getbirthMonth(),customer.getbirthYear());
        out.println(a+" </h1><br><a href='index.html'>HOME</a></center></body></html>");
        
	      } finally {
	    out.close();
	      }
	   }
	 
   @Override
	   public void doPost(HttpServletRequest request, HttpServletResponse response)
	               throws IOException, ServletException {
	      doGet(request, response);
	   }
	 
	}

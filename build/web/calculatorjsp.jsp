<%-- 
    Document   : calculatorjsp
    Created on : Sep 5, 2021, 12:12:15 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <form method="post" action="calculatorjsp.jsp">
            <p>First Name: </p>
            <p><input name="number1"></p>
            
            <p>Second Name: </p>
            <p><input name="number2"></p>
            
            <p><input type="submit" name="submit" value="Calculate"></p>
        </form>
            <%-- start web service invocation --%><hr/>
    <%
    try {
	com.calculator.CalculatorWebService_Service service = new com.calculator.CalculatorWebService_Service();
	com.calculator.CalculatorWebService port = service.getCalculatorWebServicePort();
	 // TODO initialize WS operation arguments here
	int number1 = Integer.parseInt(request.getParameter("number1"));
        int number2 = Integer.parseInt(request.getParameter("number2"));
	
	// TODO process result here
	int result = port.integerAddition(number1, number2);
	out.println("Result Addition= "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.calculator.CalculatorWebService_Service service = new com.calculator.CalculatorWebService_Service();
	com.calculator.CalculatorWebService port = service.getCalculatorWebServicePort();
	 // TODO initialize WS operation arguments here
	int number1 = Integer.parseInt(request.getParameter("number1"));
        int number2 = Integer.parseInt(request.getParameter("number2"));
	// TODO process result here
	int result = port.integerDivition(number1, number2);
	out.println("Result Divition= "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.calculator.CalculatorWebService_Service service = new com.calculator.CalculatorWebService_Service();
	com.calculator.CalculatorWebService port = service.getCalculatorWebServicePort();
	 // TODO initialize WS operation arguments here
	int number1 = Integer.parseInt(request.getParameter("number1"));
        int number2 = Integer.parseInt(request.getParameter("number2"));
	// TODO process result here
	int result = port.integerMultiplication(number1, number2);
	out.println("Result Multiplication = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.calculator.CalculatorWebService_Service service = new com.calculator.CalculatorWebService_Service();
	com.calculator.CalculatorWebService port = service.getCalculatorWebServicePort();
	 // TODO initialize WS operation arguments here
	int number1 = Integer.parseInt(request.getParameter("number1"));
        int number2 = Integer.parseInt(request.getParameter("number2"));
	// TODO process result here
	int result = port.integerSubstraction(number1, number2);
	out.println("Result Substraction = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        
    </body>
</html>

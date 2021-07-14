<%@ page language="java" contentType="text/html" pageEncoding="GBK"%>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
    <html lang="en">

    <head>

        <body>
            <form method="post">
                <table align="center" border="0">

                    <tr>
                        <th><h2>Calculator</h2></th>
                    </tr>
                    <tr>
                        <td>
                            <input type="text" name="firstNum" id="firstNum" placeholder="Enter First Number">
                        </td></tr>
                        <Tr> <td> 
                            <input type="text" name="secondNum" id="secondNum" placeholder="Enter Second Number">
                            </td>
                        </tr>
                        <Tr><Td>
 <select name="operator" id="operator">
                            <option value="-1">Select Operation</option>
                            <option value="1">Add</option>
                            <option value="2">Subtract</option>
                            <option value="3">Multiply</option>
                            <option value="4">Divide</option>
                        </select>
</Td></Tr>
<tr>
    <td>
        <div id="calresult" style="font-family:arial;text-align:center;font-size: 30px;"></div>
    </td>
</tr>
<tr><Td><input type="button" value="Calculate" onClick="BasicCalc()"></Td></tr>
                            
                   
                    
                   
                </table>
            </form>


            <title>Simple calculator</title>

            <script type="text/javascript">
                function BasicCalc() {
                    var firstNum = document.getElementById("firstNum").value;
                    var secondNum = document.getElementById("secondNum").value;
                    var operator = document.getElementById("operator").value;


                    if (firstNum == "" || secondNum == "") {
                        alert("Please enter the number!");
                        return false;
                    }
                    if (isNaN(firstNum) || isNaN(secondNum)) {
                        alert("Number format is wrong!");
                        return false;
                    }
                    if (operator == "-1") {
                        alert("Please choose an operator!");
                        return false;
                    } else
                    {
                         CallAjaxCalc(firstNum, secondNum, operator)
                    }

                }

                function CallAjaxCalc(firstNum, secondNum, operator) {
                    var req = new XMLHttpRequest();
                    req.onload = function()

                    {
                        document.getElementById("calresult").innerHTML = "Result: "+ this.responseText;
                        alert(this.responseText);
                    }

                    var getstr = "?firstNum=" + firstNum;
                    getstr = getstr + "&secondNum=" + secondNum;
                    getstr = getstr + "&operator=" + operator;

                    alert(getstr);

                    req.open("GET", "http://localhost:8080/sample/servlet/calci" + getstr);
                    req.send();
                }
            </script>
        </body>
    </head>


    </html>
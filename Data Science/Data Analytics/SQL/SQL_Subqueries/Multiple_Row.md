
<div class="track_article_contents__9JJFV"><h1 class="track_title__g20mM">Multiple Row Subquery</h1><hr><div class="track_body__GeGQu"><h2><u><span class="GFGEditorTheme__textUnderline">Introduction to Multiple Row Subquery</span></u></h2><p dir="ltr"><span>In the world of SQL (Structured Query Language), subqueries are powerful tools that allow for complex data retrieval and manipulation. One of the variations of subqueries is the "Multiple Row Subquery," a concept worth exploring for its versatility in handling data across multiple rows within a database.</span></p><p dir="ltr"><b><strong>What is a Multiple Row Subquery?</strong></b></p><p dir="ltr"><span>A multiple row subquery, as the name suggests, is a query within a query that returns multiple rows of data. Unlike a single-row subquery that operates on a single result, a multiple row subquery deals with sets of data, enabling comparisons, filtering, and manipulation across multiple records simultaneously.</span></p><p dir="ltr"><span>Syntax and Usage:</span></p><p dir="ltr"><span>The syntax for a multiple row subquery involves using operators like </span><b><strong>IN</strong></b><span>, </span><b><strong>ANY</strong></b><span>, or </span><b><strong>ALL </strong></b><span>to compare a single value with the result set of a subquery.</span></p><p dir="ltr"><span>Let's delve into an example to better illustrate its usage:</span></p><p dir="ltr"><span>Consider a hypothetical scenario where you have two tables: </span><b><strong>Employees </strong></b><span>and </span><b><strong>Salaries</strong></b><span>. The </span><b><strong>Employees</strong></b><span> table contains employee information, while the </span><b><strong>Salaries </strong></b><span>table holds salary details for these employees.</span></p><p dir="ltr"><b><strong>Employees Table:</strong></b></p><table class="GFGEditorTheme__table"><colgroup><col><col><col></colgroup><tbody><tr><th class="GFGEditorTheme__tableCell GFGEditorTheme__tableCellHeader" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start; background-color: rgb(242, 243, 245);"><p dir="ltr"><span>EmployeeID</span></p></th><th class="GFGEditorTheme__tableCell GFGEditorTheme__tableCellHeader" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start; background-color: rgb(242, 243, 245);"><p dir="ltr"><span>Name</span></p></th><th class="GFGEditorTheme__tableCell GFGEditorTheme__tableCellHeader" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start; background-color: rgb(242, 243, 245);"><p dir="ltr"><span>Department</span></p></th></tr><tr><td class="GFGEditorTheme__tableCell" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start;"><p><span>1</span></p></td><td class="GFGEditorTheme__tableCell" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start;"><p dir="ltr"><span>John</span></p></td><td class="GFGEditorTheme__tableCell" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start;"><p dir="ltr"><span>Sales</span><br></p></td></tr><tr><td class="GFGEditorTheme__tableCell" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start;"><p><span>2</span></p></td><td class="GFGEditorTheme__tableCell" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start;"><p dir="ltr"><span>Emily</span></p></td><td class="GFGEditorTheme__tableCell" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start;"><p dir="ltr"><span>Marketing</span><br></p></td></tr><tr><td class="GFGEditorTheme__tableCell" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start;"><p><span>3</span></p></td><td class="GFGEditorTheme__tableCell" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start;"><p dir="ltr"><span>Michael</span><br></p></td><td class="GFGEditorTheme__tableCell" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start;"><p dir="ltr"><span>HR</span><br></p></td></tr><tr><td class="GFGEditorTheme__tableCell" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start;"><p><span>4</span></p></td><td class="GFGEditorTheme__tableCell" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start;"><p dir="ltr"><span>Sophia</span><br></p></td><td class="GFGEditorTheme__tableCell" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start;"><p dir="ltr"><span>Sales</span><br></p></td></tr><tr><td class="GFGEditorTheme__tableCell" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start;"><p><span>....</span></p></td><td class="GFGEditorTheme__tableCell" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start;"><p><span>....</span><br></p></td><td class="GFGEditorTheme__tableCell" style="width: 233.333px; border: 1px solid black; vertical-align: top; text-align: start;"><p><span>....</span><br></p></td></tr></tbody></table><p dir="ltr"><b><strong>Salaries Table:</strong></b></p><table class="GFGEditorTheme__table"><colgroup><col><col></colgroup><tbody><tr><th class="GFGEditorTheme__tableCell GFGEditorTheme__tableCellHeader" style="width: 350px; border: 1px solid black; vertical-align: top; text-align: start; background-color: rgb(242, 243, 245);"><p dir="ltr"><span>EmployeeID</span></p></th><th class="GFGEditorTheme__tableCell GFGEditorTheme__tableCellHeader" style="width: 350px; border: 1px solid black; vertical-align: top; text-align: start; background-color: rgb(242, 243, 245);"><p dir="ltr"><span>Salary</span></p></th></tr><tr><td class="GFGEditorTheme__tableCell" style="width: 350px; border: 1px solid black; vertical-align: top; text-align: start;"><p><span>1</span></p></td><td class="GFGEditorTheme__tableCell" style="width: 350px; border: 1px solid black; vertical-align: top; text-align: start;"><p><span>50000</span></p></td></tr><tr><td class="GFGEditorTheme__tableCell" style="width: 350px; border: 1px solid black; vertical-align: top; text-align: start;"><p><span>2</span></p></td><td class="GFGEditorTheme__tableCell" style="width: 350px; border: 1px solid black; vertical-align: top; text-align: start;"><p><span>48000</span></p></td></tr><tr><td class="GFGEditorTheme__tableCell" style="width: 350px; border: 1px solid black; vertical-align: top; text-align: start;"><p><span>3</span></p></td><td class="GFGEditorTheme__tableCell" style="width: 350px; border: 1px solid black; vertical-align: top; text-align: start;"><p><span>55000</span></p></td></tr><tr><td class="GFGEditorTheme__tableCell" style="width: 350px; border: 1px solid black; vertical-align: top; text-align: start;"><p><span>4</span></p></td><td class="GFGEditorTheme__tableCell" style="width: 350px; border: 1px solid black; vertical-align: top; text-align: start;"><p><span>52000</span></p></td></tr><tr><td class="GFGEditorTheme__tableCell" style="width: 350px; border: 1px solid black; vertical-align: top; text-align: start;"><p><span>...</span></p></td><td class="GFGEditorTheme__tableCell" style="width: 350px; border: 1px solid black; vertical-align: top; text-align: start;"><p><span>...</span></p></td></tr></tbody></table><p dir="ltr"><b><strong>Example:</strong></b></p><p dir="ltr"><span>Let's say you want to retrieve the names of employees who earn a salary greater than the average salary of all employees. This is where a multiple row subquery can be employed:</span></p><blockquote><p dir="ltr"><span>SELECT Name</span></p><p dir="ltr"><span>FROM Employees</span></p><p dir="ltr"><span>WHERE EmployeeID IN (</span></p><p dir="ltr"><span>    SELECT EmployeeID</span></p><p dir="ltr"><span>    FROM Salaries</span></p><p dir="ltr"><span>    WHERE Salary > (</span></p><p dir="ltr"><span>        SELECT AVG(Salary) </span></p><p dir="ltr"><span>        FROM Salaries</span></p><p><span>    )</span></p><p><span>);</span></p></blockquote><p dir="ltr"><span>This SQL query breaks down as follows:</span></p><ul><li value="1"><span>The innermost query calculates the average salary from the </span><b><strong>Salaries </strong></b><span>table.</span></li><li value="2"><span>The middle query retrieves the </span><b><strong>EmployeeID </strong></b><span>of employees earning salaries higher than the average salary.</span></li><li value="3"><span>The outer query then uses these </span><b><strong>EmployeeID </strong></b><span>values to fetch the names of those specific employees from the </span><b><strong>Employees </strong></b><span>table.</span><br></li></ul><p dir="ltr"><b><strong>Benefits and Use Cases:</strong></b></p><ul><li value="1"><b><strong>Complex Filtering: </strong></b><span>Multiple row subqueries allow for intricate filtering based on aggregate functions, making it convenient to compare data across multiple rows.</span></li><li value="2"><b><strong>Data Manipulation:</strong></b><span> It enables performing calculations or operations on sets of data, such as finding employees with salaries meeting certain criteria.</span></li><li value="3"><b><strong>Subquery Optimization: </strong></b><span>While powerful, using multiple row subqueries extensively might impact performance. Optimizing queries through indexing and efficient query structuring is advisable.</span><br></li></ul><p dir="ltr"><br><span>Multiple row subqueries are a fundamental aspect of SQL, offering a way to handle data collectively across multiple records. Understanding their syntax and application can significantly enhance the capabilities of SQL developers and analysts, enabling them to perform complex data manipulations and retrievals efficiently.</span></p><p dir="ltr"><br></p><p dir="ltr"><br></p></div><div class="track_mark_as_read_btn__qp09Q g-mt-5"><button class="ui green disabled button" disabled="" tabindex="-1">Marked as Read</button></div></div>
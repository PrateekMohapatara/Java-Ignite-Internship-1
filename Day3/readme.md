1)Employee Bonus Eligibility Checker
   Problem Statement:

A company gives bonus based on the following conditions:

Employee must have worked for more than 3 years
AND attendance percentage should be above 85
If performance rating is:
5 → Bonus = ₹50,000
4 → Bonus = ₹30,000
3 → Bonus = ₹10,000
Otherwise no bonus.

But there’s a twist:

If the employee has attendance below 60%, bonus should be rejected immediately even if all other conditions are satisfied.
Input:
Years of experience
Attendance %
Performance rating
Output:

Display:

Eligible / Not Eligible
Bonus amount if eligible



2)Smart Login System
Problem Statement:

Create a login system with:

Username
Password
OTP

Conditions:

Username must be "admin"
Password must be "Java@123"
If username/password correct:

Ask for OTP
OTP valid only if between 1000 and 9999

Twist:

If password is wrong 3 times, print:
"Account Blocked"

Extra twist:

If username is correct but password starts with "Java" and ends with "123" but still incorrect, print:
"Almost correct password"




3)Electricity Bill Generator
Problem Statement:

Create a menu-driven electricity billing system.

Menu:
Domestic
Commercial
Industrial

Take units consumed.

Conditions:
Domestic:
First 100 units → free
101–300 → ₹5/unit
Above 300 → ₹8/unit
Commercial:
Below 200 → ₹10/unit
Above 200 → ₹15/unit
Industrial:
If units > 500 AND power factor good:
10% discount
Otherwise normal charge ₹20/unit
Twist:
If invalid menu entered:

print "Invalid Connection Type"

4)College Admission Predictor

Problem Statement:

A student is eligible for admission only if:

Maths >= 70
Physics >= 60
Chemistry >= 60

OR

Total average >= 80

But:

If any subject mark is below 35 → Automatically rejected.

Extra twist:

If all three subjects are above 90:
"Eligible for Scholarship"
Input:
Maths
Physics
Chemistry
Output:
Admission status
Scholarship status




5)Restaurant Ordering System (Advanced Menu Driven)

Problem Statement:

Create a restaurant ordering system.

Main Menu:
Veg
Non-Veg
Veg Menu:
1 → Fried Rice
2 → Noodles
Non-Veg Menu:
1 → Chicken Biryani
2 → Grill Chicken

Take:

Quantity
Member status (Gold/Silver/Normal)
Discount Rules:
Gold → 20%
Silver → 10%
Normal → No discount

Twist:

If bill > ₹2000 AND customer is Gold:
Give free dessert message.

Extra Twist:

Invalid menu choices should print:
"Invalid Selection"


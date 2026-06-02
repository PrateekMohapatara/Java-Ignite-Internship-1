1)Explain the difference between a Class and an Object in Java with a real-life example.
Also explain why we cannot directly execute a class without creating an object.

Ans → A class is a blueprint used to create objects, while an object is an instance of a class that contains actual data and occupies memory.
      Ex: Mobile is a class, whereas Samsung Galaxy A35 is an object.


2)What are access modifiers in Java?
Explain the difference between public and private with examples.
Why is it not safe to make all variables public?
Ans → Access modifiers control the accessibility of classes, variables, and methods. public members can be accessed from anywhere, while private members can be             accessed only within the same class. Making all variables public is unsafe because anyone can modify the data directly, reducing security.


3)Explain how encapsulation is achieved using private variables and public methods.
Give a real-life example (bank, mobile, ATM, etc.).
Ans → Encapsulation is the process of hiding data by making variables private and providing access through public methods.
      Ex: In a bank account, the balance is private and can be accessed only through methods like deposit() and withdraw()


4)What is a constructor in Java?
Explain how the this keyword is used inside a constructor.
Why do we use constructors to initialize object values?
Ans → A constructor is a special method used to initialize object values when an object is created. The this keyword refers to the current object and is used to            distinguish instance variables from local variables.
      Ex: this.name = name;

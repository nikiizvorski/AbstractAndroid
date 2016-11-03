# AbstractAndroid
Example Project showing Abstract Class and Interface usage in Android

In this project we are using Retrolambda and Butterknife and Java 1.8 Feautures

Abstract class and interface both are used to achieve abstraction where we can declare the abstract methods. Abstract class and interface both can't be instantiated. You can easely track the definition from the Activity classes and you will see how abstract 
classes are used in Android to create templates for you.

# What is the Diffrence between Abstract Class and Interface?

They are very close to each other but there are some rules that every one of them can use and do and you have to decide
which one you need in which situation so for example:

1: Abstract class can have abstract and non-abstract methods - (Interface can have only abstract methods) </br>
2: Abstract class doesn't support multiple inheritance - (Interface supports multiple inheritance) </br>
3: Abstract class can have final, non-final, static and non-static variables - (Interface has only static and final variables) </br>
4: Abstract class can have static methods, main method and constructor - (Interface can't have static methods, main method or constructor) </br>
5: Abstract class can provide the implementation of interface - (Interface can't provide the implementation of abstract class) </br>
6: The abstract keyword is used to declare abstract class - (The interface keyword is used to declare interface) </br>

# Where to use Abstract Class then Interface

You want to share code among several closely related classes.
You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
You want to declare non-static or non-final fields.

1. Using abstract classes to define types that permit multiple implementations has one great advantage over using interfaces: It is far easier to evolve an abstract class than an interface.

2. If, in a subsequent release, you want to add a new method to an abstract class, you can always add a concrete method containing a reasonable default implementation. All existing implementations of the abstract class will then provide the new method. This does not work for interfaces. 

3. It is, generally speaking, impossible to add a method to a public interface without breaking all existing classes that implement the interface. 

4. Classes that previously implemented the interface will be missing the new method and won’t compile anymore.

5. Public interfaces, therefore, must be designed carefully. 

# Where to use Interface

You expect that unrelated classes would implement your interface. For example,many unrelated objects can implement Serializable interface.
You want to specify the behaviour of a particular data type, but not concerned about who implements its behaviour.
You want to take advantage of multiple inheritance of type.

# Example Abstract Class

You can look on an Abstract class as a template for future usage.

First Type of Abstract Class that we are using is BaseActivity to extend Activity

```java
public abstract class BaseActivity extends Activity implements BaseInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(myView());
        ButterKnife.bind(this);
        activityCreated();
    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    public abstract int myView();
    public abstract void activityCreated();
}

```

Second Type of Abstract Class that we are using is BaseActivityCompat to extend AppCompat

```java
public abstract class BaseActivityCompat extends AppCompatActivity implements BaseInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(myView());
        ButterKnife.bind(this);
        activityCreated();
    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    public abstract int myView();
    public abstract void activityCreated();
}
```


# Example Interface

```java

interface BaseInterface {
    int myView();
    void activityCreated();
}

```

## Getting Started

You will have to download the project and run it on your local machine.

### Prerequisities

Everything you need in order to use this code is inside the project you may only need to update the gradle plugin and the libs.

## Built With

Android Studio 2.2

## More Info

More info about Abstract -> http://docs.oracle.com/javase/tutorial/java/IandI/abstract.html

## Authors

* **Niki Izvorski ** - *Initial work*

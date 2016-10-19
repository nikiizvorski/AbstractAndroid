# AbstractAndroid
Example Project showing Abstract Class and Interface usage in Android

In this project we are using Retrolambda and Butterknife and Java 1.8 Feautures

Abstract class and interface both are used to achieve abstraction where we can declare the abstract methods. Abstract class and interface both can't be instantiated. You can easely track the definition from the Activity classes and you will see how abstract 
classes are used in Android to create templates for you.

# What is the Diffrence between Abstract Class and Interface?

They are very close to each other but there are some rules that every one of them can use and do and you have to decide
which one you need in which situation so for example:

1: Abstract class can have abstract and non-abstract methods - (Interface can have only abstract methods)
2: Abstract class doesn't support multiple inheritance - (Interface supports multiple inheritance)
3: Abstract class can have final, non-final, static and non-static variables - (Interface has only static and final variables)
4: Abstract class can have static methods, main method and constructor - (Interface can't have static methods, main method or constructor)
5: Abstract class can provide the implementation of interface - (Interface can't provide the implementation of abstract class)
6: The abstract keyword is used to declare abstract class - (The interface keyword is used to declare interface)

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

# AbstractAndroid
Example Project showing Abstract Class and Interface usage in Android

In this project we are using Retrolambda and Butterknife and Java 1.8 Feautures

# What is Abstract Class


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


# What is Interface

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

More info about Polymorphism -> https://www.tutorialspoint.com/java/java_polymorphism.htm

## Authors

* **Niki Izvorski ** - *Initial work*

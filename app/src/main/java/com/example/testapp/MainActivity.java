package com.example.testapp;

import android.app.Activity;
import android.os.Bundle;
import com.nonexistent.BuggyModule;  // ❌ 不存在的包

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BuggyModule.doSomething();  // ❌ 编译失败
    }
}

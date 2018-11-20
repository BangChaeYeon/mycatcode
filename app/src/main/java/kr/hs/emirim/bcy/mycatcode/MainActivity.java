package kr.hs.emirim.bcy.mycatcode;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;

public class MainActivity extends AppCompatActivity {
    final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("Oncreate가 실행됨");
        Log.v(TAG,"Oncreate가 실행됨");
        Log.v(TAG,"Log.v 실행됨");
        Log.i(TAG,"Log.i 실행됨");
        Log.d(TAG,"Log.d 실행됨");
        Log.w(TAG,"Log.w 실행됨");
        Log.e(TAG,"Log.e 실행됨");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG,"onResume이 실행됨");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG,"onStart가 실행됨");
    }
}

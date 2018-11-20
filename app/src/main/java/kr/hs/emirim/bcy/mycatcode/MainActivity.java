package kr.hs.emirim.bcy.mycatcode;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("Oncreate가 실행됨");
        Log.v("MainActivity","Oncreate가 실행됨");
        Log.v("MainActivity","Log.v 실행됨");
        Log.i("MainActivity","Log.i 실행됨");
        Log.d("MainActivity","Log.d 실행됨");
        Log.w("MainActivity","Log.w 실행됨");
        Log.e("MainActivity","Log.e 실행됨");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MainActivity","onResume이 실행됨");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("MainActivity","onStart가 실행됨");
    }
}

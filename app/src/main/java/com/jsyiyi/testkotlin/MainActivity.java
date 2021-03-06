package com.jsyiyi.testkotlin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

import com.jsyiyi.javacode.BroadcastReceiver.BroadcastReceiverActivity;
import com.jsyiyi.javacode.BroadcastReceiver.WcyBroadcastReceiver;
import com.jsyiyi.javacode.CardView.CardViewActivity;
import com.jsyiyi.javacode.ExpandableListView.ExpandableListViewActivity;
import com.jsyiyi.javacode.Glide.GlideActivity;
import com.jsyiyi.javacode.GreenDao.GreenDaoActivity;
import com.jsyiyi.javacode.RecyclerView.RecyclerViewActivity;
import com.jsyiyi.javacode.animation.AnimationActivity;
import com.jsyiyi.javacode.animation.transitionanimation.TraActivity;
import com.jsyiyi.javacode.asynctask.AsyncTaskActivity;
import com.jsyiyi.javacode.customview.CustomViewActivity;
import com.jsyiyi.javacode.eventbus.EventBusActivity;
import com.jsyiyi.javacode.handler.DiglettActivity;
import com.jsyiyi.javacode.handler.DownloadActivity;
import com.jsyiyi.javacode.handler.HandlerActivity;
import com.jsyiyi.javacode.newwork.NetworkActivity;
import com.jsyiyi.javacode.okhttp.OkHttpActivity;
import com.jsyiyi.javacode.service.ServiceActivity;
import com.jsyiyi.javacode.sqlite.SqliteActivity;
import com.jsyiyi.javacode.storage.StorageActivity;
import com.jsyiyi.javacode.surfaceview.SurfaceViewActivity;
import com.jsyiyi.javacode.touchevent.TouchSystemActivity;
import com.jsyiyi.javacode.webview.WebViewActivity;
import com.jsyiyi.kotlin.test.KotlinMain;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int permisson = ContextCompat.checkSelfPermission(this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if(permisson!= PackageManager.PERMISSION_GRANTED){
            //?????????????????????
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
        }
        setContentView(R.layout.activity_main);
        findViewById(R.id.testBtn).setOnClickListener(this);
        findViewById(R.id.testAnim).setOnClickListener(this);
        findViewById(R.id.testTra).setOnClickListener(this);
        findViewById(R.id.customView).setOnClickListener(this);
        findViewById(R.id.surfaceView).setOnClickListener(this);
        findViewById(R.id.toucheEventView).setOnClickListener(this);
        findViewById(R.id.storageView).setOnClickListener(this);
        findViewById(R.id.sqliteView).setOnClickListener(this);
        findViewById(R.id.expandableListView).setOnClickListener(this);
        findViewById(R.id.broadcastView).setOnClickListener(this);
        findViewById(R.id.newworkView).setOnClickListener(this);
        findViewById(R.id.handlerView).setOnClickListener(this);
        findViewById(R.id.handlerDownloadView).setOnClickListener(this);
        findViewById(R.id.handlerDiglettView).setOnClickListener(this);
        findViewById(R.id.asyncTaskView).setOnClickListener(this);
        findViewById(R.id.serviceView).setOnClickListener(this);
        findViewById(R.id.cardView).setOnClickListener(this);
        findViewById(R.id.okhttpView).setOnClickListener(this);
        findViewById(R.id.eventbusView).setOnClickListener(this);
        findViewById(R.id.recycleView).setOnClickListener(this);
        findViewById(R.id.glideView).setOnClickListener(this);
        findViewById(R.id.greenDaoView).setOnClickListener(this);
        findViewById(R.id.webView).setOnClickListener(this);
        findViewById(R.id.butterknifeView).setOnClickListener(this);
//        ClassMain classMain = new ClassMain();
//        String aaa = classMain.TestDemo("??????1");
//        System.out.println("MainActivity===="+aaa);
//        String aaa2 = StaticMain.Companion.TestDemo("??????2");
//        System.out.println("MainActivity===="+aaa2);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.testBtn:
                openPage();
//                getDeviceId();
//                getMacAddress();
//                getAndroidId();
//                getPhoneInfo();
//                getInfo();
                break;
            case R.id.testAnim:
                Intent proIntent = new Intent(this, AnimationActivity.class);
                startActivity(proIntent);
                break;
            case R.id.testTra:
                Intent traIntent = new Intent(this, TraActivity.class);
                startActivity(traIntent);
                break;
            case R.id.customView:
                Intent cusViewIntent = new Intent(this, CustomViewActivity.class);
                startActivity(cusViewIntent);
                break;
            case R.id.surfaceView:
                Intent surViewIntent = new Intent(this, SurfaceViewActivity.class);
                startActivity(surViewIntent);
                break;
            case R.id.toucheEventView:   //????????????
                Intent touchViewIntent = new Intent(this, TouchSystemActivity.class);
                startActivity(touchViewIntent);
                break;
            case R.id.storageView:   //????????????
                Intent storageIntent = new Intent(this, StorageActivity.class);
                startActivity(storageIntent);
                break;
            case R.id.sqliteView:   //sqlite
                Intent sqliteIntent = new Intent(this, SqliteActivity.class);
                startActivity(sqliteIntent);
                break;
            case R.id.expandableListView:   //expandableListView
                Intent expandableListViewIntent = new Intent(this, ExpandableListViewActivity.class);
                startActivity(expandableListViewIntent);
                break;
            case R.id.broadcastView:   //expandableListView
                Intent broadcastViewIntent = new Intent(this, BroadcastReceiverActivity.class);
                startActivity(broadcastViewIntent);
                break;
            case R.id.newworkView:   //????????????
                Intent newworkViewIntent = new Intent(this, NetworkActivity.class);
                startActivity(newworkViewIntent);
                break;
            case R.id.handlerView:   //handler??????
                Intent handlerViewIntent = new Intent(this, HandlerActivity.class);
                startActivity(handlerViewIntent);
                break;
            case R.id.handlerDownloadView:   //handler????????????
                Intent handlerDownloadViewIntent = new Intent(this, DownloadActivity.class);
                startActivity(handlerDownloadViewIntent);
                break;
            case R.id.handlerDiglettView:   //handler???????????????
                Intent handlerDiglettViewIntent = new Intent(this, DiglettActivity.class);
                startActivity(handlerDiglettViewIntent);
                break;
            case R.id.asyncTaskView:   //handler???????????????
                Intent asyncTaskViewIntent = new Intent(this, AsyncTaskActivity.class);
                startActivity(asyncTaskViewIntent);
                break;
            case R.id.serviceView:   //handler???????????????
                Intent serviceViewIntent = new Intent(this, ServiceActivity.class);
                startActivity(serviceViewIntent);
                break;
            case R.id.cardView:   //handler???????????????
                Intent cardViewIntent = new Intent(this, CardViewActivity.class);
                startActivity(cardViewIntent);
                break;
            case R.id.okhttpView:   //handler???????????????
                Intent okhttpViewIntent = new Intent(this, OkHttpActivity.class);
                startActivity(okhttpViewIntent);
                break;
            case R.id.eventbusView:   //handler???????????????
                Intent eventbusViewIntent = new Intent(this, EventBusActivity.class);
                startActivity(eventbusViewIntent);
                break;
            case R.id.recycleView:   //RecycleView??????
                Intent recycleViewIntent = new Intent(this, RecyclerViewActivity.class);
                startActivity(recycleViewIntent);
                break;
            case R.id.glideView:   //RecycleView??????
                Intent glideViewIntent = new Intent(this, GlideActivity.class);
                startActivity(glideViewIntent);
                break;
            case R.id.greenDaoView:   //RecycleView??????
                Intent greenDaoViewIntent = new Intent(this, GreenDaoActivity.class);
                startActivity(greenDaoViewIntent);
                break;
            case R.id.webView:   //RecycleView??????
                Intent webViewIntent = new Intent(this, WebViewActivity.class);
                startActivity(webViewIntent);
                break;
            default:
                break;
        }
    }

    private void getInfo(){
        String info = getUniqueIdentificationCode(this);
        System.out.println("");
    }

    private void openPage(){
        Intent intent = new Intent(this,KotlinMain.class);
        intent.putExtra("button_title","");
        startActivity(intent);
    }
    public void getPhoneInfo() {
        String board = Build.BOARD;  //????????????????????????
        String barnd = Build.BRAND; //??????????????????
        String cpuabi = Build.CPU_ABI; //??????????????????????????????CPU????????????
        String cpuabi2 = Build.CPU_ABI2; //??????????????????????????????
        String device = Build.DEVICE; //????????????????????????
        String display = Build.DISPLAY; //???????????????????????????????????????????????????????????????????????????ID??????
        String fingerprint = Build.FINGERPRINT; //???????????????????????????????????????????????????????????????
        String hardware = Build.HARDWARE; //??????????????????,??????????????????????????????BOARD???
        String host = Build.HOST; //??????????????????
        String id = Build.ID; //???????????????
        String model = Build.MODEL; //????????????????????? ????????????
        String manufacturer = Build.MANUFACTURER; //?????????????????????
        String product = Build.PRODUCT; //?????????????????????
        String radio = Build.RADIO; //???????????????????????????????????????????????? ??????unknown
        String tags = Build.TAGS; //??????????????????release-keys ???????????? test-keys
        String type = Build.TYPE; //??????????????????  ?????????"user" ???"eng"


        System.out.println(
                "BOARD====="+board+"====="
                        +"BRAND====="+barnd+"====="
                        +"CPU_ABI====="+cpuabi+"====="
                        +"CPU_ABI2====="+cpuabi2+"====="
                        +"DEVICE====="+device+"====="
                        +"DISPLAY====="+display+"====="
                        +"FINGERPRINT====="+fingerprint+"====="
                        +"HARDWARE====="+hardware+"====="
                        +"HOST====="+host+"====="
                        +"ID====="+id+"====="
                        +"MODEL====="+model+"====="
                        +"MANUFACTURER====="+manufacturer+"====="
                        +"PRODUCT====="+product+"====="
                        +"RADIO====="+radio+"====="
                        +"TAGS====="+tags+"====="
                        +"TYPE====="+type
        );

    }

    /**
     *   ANDROID_ID(????????????+????????????) + ?????????(android 10???unknown/android 9??????????????????)+??????    +??????
     * @return
     */
    @SuppressLint({"MissingPermission", "HardwareIds"})
    public String getUniqueIdentificationCode(FragmentActivity context){
        String androidId =  Settings.System.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        String uniqueCode ;
        // android_id ?????????????????? ??????  root/??????root ???????????? ?????? ????????????????????????????????????xposed???root???
        //Build.BOARD ????????????????????????
        //Build.DEVICE ????????????????????????
        //Build.BRAND ??????????????????
        //Build.MODEL ????????????????????? ????????????
        uniqueCode = androidId + Build.BOARD + Build.DEVICE + Build.BRAND+ Build.MODEL;
        return toMD5(uniqueCode);
    }

    /**
     * MD5?????? ????????????
     */
    private String toMD5(String text){
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] digest = messageDigest.digest(text.getBytes());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digest.length; i++) {
            int digestInt = digest[i] & 0xff;
            //???10????????????????????????16??????
            String hexString = Integer.toHexString(digestInt);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString().substring(8,24);
    }

    private void getAndroidId(){
        String ANDROID_ID = Settings.System.getString(getContentResolver(), Settings.System.ANDROID_ID);
        System.out.println("");
    }

//    private void getDeviceId(){
//        TelephonyManager tm = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
//        String DEVICE_ID = tm.getDeviceId();
//        System.out.println("");
//    }
//
//    private void getMacAddress(){
//        TelephonyManager tm = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
//        String SimSerialNumber = tm.getSimSerialNumber();
//        System.out.println("");
//    }
}
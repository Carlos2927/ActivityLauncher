# ActivityLauncher
[![Release](https://jitpack.io/v/Carlos2927/ActivityLauncher.svg)](https://jitpack.io/#Carlos2927/ActivityLauncher)
forked from [bbssyyuui/ActivityLauncher](https://github.com/bbssyyuui/ActivityLauncher),告别onActivityResult，通过Callback方式进行Activity跳转，同时在作者原有的基础上新增AndroidX支持，不管你项目中使用Android Support库还是AndroidX, ActivityLauncher都支持！！

#### 添加依赖
- 在Project的Gradle文件中添加JitPack仓库：
```
allprojects {
    repositories {
        google()
        jcenter()

        // 添加JitPack仓库
        maven { url 'https://jitpack.io' }
    }
}
```
- 在app项目的Gradle文件中添加ActivityLauncher库依赖：
```
implementation 'com.github.bbssyyuui:ActivityLauncher:1.0.2'
```

#### 如何调用
```
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 启动Activity
        ActivityLauncher.init(this)
                .startActivityForResult(TestActivity.class, new ActivityLauncher.Callback() {
                    @Override
                    public void onActivityResult(int resultCode, Intent data) {
                        // 处理回调信息
                    }
                });
    }
```

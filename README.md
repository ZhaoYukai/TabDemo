# TabDemo
常用的UI布局，最上面是标题栏，紧接着是一个个Tab标签菜单，可以通过滑动来切换<br>
<br>
看示例图片就一目了然，见下面的图片。<br>
<br>
项目配置：<br>
（1）首先要做的，就是在eclipse中import进这个开源库viewPagerlibrary项目处于打开状态即可，<br>
然后把这个项目路径libs下的android-support-v4.jar覆盖到我自己的项目工程文件目录的libs文件夹下，<br>
这样保持两个工程的v4包一致。<br>
<br>
（2）我自己建的工程叫TabDemoTest，右键，属性，选择Android，在右下方add，添加viewPagerlibrary这个项目，<br>
然后点OK，这样就关联起来了两个项目。<br>
<br>
（3）然后发现android-support-v4.jar居然没有自动path，这导致了系统找不到ViewPager和FragmentActivity这两个类。<br>
解决方法是手动path：<br>
右键单击v4包，Build Path，Add to Build Path，这样就正确引入了v4的包。<br>
<br>
下面就是示例图片：<br>
<br>
<br>
![image](https://github.com/ZhaoYukai/TabDemo/blob/master/%E7%A4%BA%E4%BE%8B%E5%9B%BE%E7%89%87/jdfw.gif)
<br>

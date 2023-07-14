# Simplelivedatabus  
简单的Android全局事件总线  
##使用方法：  
###1.发送数据方法  
·
LiveDatabus.getInstance().getLiveData("key").setValue(value);
·
###2.接收数据方法  
·
LiveDatabus.getInstance().getLiveData("key").observe(this,data->{
  
});
·

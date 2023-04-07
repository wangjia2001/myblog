<template>
<div class="header" :style="bg"> 
<el-container>
    <el-aside><nav-menu></nav-menu></el-aside>
     <el-container>
       <el-header id="headerbg" style="height: 200px;">
                    <h1>书单 </h1>
                    <h2 >2020 年 12 月 27 日・<a href="javascript:void(0)" id="page-read-setting-toggle">阅读设置</a>  </h2>  
                        <el-divider></el-divider> 
       </el-header>

    <el-main >   
  <el-col :span="6">
    <el-card  shadow="hover">
      <a href="http://www.dushu369.com/qtyd/nysdgs/" target="_blank" class="nound">
    <div class="thumb">
        <img width="200" height="250" src="https://s1.ax1x.com/2020/09/27/0A3dOA.jpg" alt="你一生的故事">
    </div>
    <div class="content">
        <p class="title">你一生的故事 </p>
    </div>
</a>
</el-card>
  </el-col>

   <el-col :span="6">
    <el-card  shadow="hover">
     <a href="https://www.xstt5.com/waiwen/10182/" target="_blank" class="no-underline">
    <div class="thumb">
        <img width="200" height="250" src="https://s1.ax1x.com/2020/09/22/wOXvn0.jpg" alt="心">
    </div>
    <div class="content">
        <p class="title">
            心
        </p>
    </div>
</a>
</el-card>
  </el-col>

  
  <el-col :span="6">
    <el-card  shadow="hover">
      <a href="https://weread.qq.com/web/reader/ad5326d071f6e463ad5d823" target="_blank" class="nound">
    <div class="thumb">
        <img width="200" height="250" src="https://wfqqreader-1252317822.image.myqcloud.com/cover/539/32957539/t6_32957539.jpg" alt="西班牙三棵树">
    </div>
    <div class="content">
        <p class="title">西班牙三棵树</p>
    </div>
</a>
</el-card>
  </el-col>


<el-col :span="6">
    <el-card  shadow="hover">
     <a href="https://weread.qq.com/web/reader/18732e505cd4ce1873d64f1" target="_blank" class="nound">
    <div class="thumb">
        <img width="200" height="250" src="https://s1.ax1x.com/2020/10/08/0B9VCF.png" alt="反与正·婚礼集·夏">
    </div>
    <div class="content">
        <p class="title">反与正・婚礼集・夏</p>
    </div>
</a> 
</el-card>
  </el-col>

  <el-col :span="6">
    <el-card  shadow="hover">
    <a href="http://www.dushu369.com/waiguomingzhu/smzbncszq/" target="_blank" class="nound">
    <div class="thumb">
        <img width="200" height="250" src="https://s3.ax1x.com/2020/11/13/DpVydA.png" alt="不能承受的生命之轻">
    </div>
    <div class="content">
        <p class="title">不能承受的生命之轻</p>
    </div>
</a>
</el-card>
  </el-col>

   <el-col :span="6">
    <el-card  shadow="hover">
      <a href="http://www.duokan.com/book/a5612de20f5947539bd0402a4b0d554c" target="_blank" class="no-underline">
    <div class="thumb">
        <img width="200" height="250" src="http://cover.read.duokan.com/mfsv2/download/fdsc3/p01uhs8DROlm/CtrP8NGv7slai1.jpg" alt="危险的关系">
    </div>
    <div class="content">
        <p class="title">
            危险的关系
        </p>
    </div>
</a>
</el-card>
  </el-col>


 <el-col :span="6">
    <el-card  shadow="hover">
    <a href="https://www.luoxia.com/qunxing/" target="_blank" class="no-underline">
    <div class="thumb">
        <img width="200" height="250" src="https://s1.ax1x.com/2020/09/22/wOjsuq.jpg" alt="人类群星闪耀时">
    </div>
    <div class="content">
        <p class="title">
            人类群星闪耀时
        </p>
    </div>
</a>
</el-card>
  </el-col>
  
    </el-main>

<el-divider></el-divider> 
 </el-container>
 
 
</el-container>
</div>

</template>


<script>
  import NavMenu from './common/NavMenu'
   import backGroundImg from '../assets/bg.jpg'
  export default {
    name: 'Books',
    components: {NavMenu} ,
    data(){
      return{
        backGroundImg,
        bg:{
          background:`url(${backGroundImg})`,
          backgroundSize:'100% 100%'
        }
      }
    }
  }
</script>

<style scoped>

  .title {
    font-size: 14px;
    text-align: left;
    color: #3377aa;
  }

  

.image {
    width: 100%;
    height: auto;
  }


  .clearfix:before,
  .clearfix:after {
      display: table;
      content: "";
       }
  
  .clearfix:after {
      clear: both
  }

.el-header, .el-footer {
    color: #333;
    text-align: center;
    line-height: 60px;
  }
  
    /* .el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
    line-height: 160px;
  } */

 /* #headerbg{
background:url("../assets/Nav.jpg") no-repeat;
width:100%;
height:100%;
position:fixed;
background-size:100% 100%; */
/* } */

</style>
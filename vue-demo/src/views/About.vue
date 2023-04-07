<template>
  <div class="header" :style="bg">
  <el-container>
      <el-aside><nav-menu></nav-menu></el-aside>
      <el-container>
      <el-header height="200px">
        <img src="../assets/me.jpg" alt="Avatar" width="150" height="150">
         <h1 >jia</h1>
         <el-divider></el-divider> 
      </el-header>
  
      <el-main>
  <div>
      <h4>关于我</h4>
      <p>学渣一枚,日常挣扎于DDL,致力于数据掩埋、人工智障、深度遗忘</p>
      <p>喜欢各种游戏，有好玩的请务必推荐给我</p>
                 
      <h4>友情链接</h4>
      <ul>
       <li><a href="http://http://www.snnu.edu.cn" target="_blank">校园主页</a></li>
       <li><a href="http://www.lib.snnu.edu.cn" target="_blank">图书馆</a></li>
       <li><a href="http://imooc.snnu.edu.cn/" target="_blank">imooc网站</a></li>
      </ul>
                  
      <!-- <p>欢迎打赏赞助我
        <br><img src="../assets/paid.jpg" height="200px">
      </p>                    -->
  </div>
      </el-main>
      </el-container>
  </el-container>
  </div>
  </template>
  
  <script>
    import NavMenu from '../components/common/NavMenu'
   import backGroundImg from '../assets/bg.jpg'
  export default {
      name: 'About',
      components: {NavMenu},
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
  
  <style>
  
  /* #building{
  background:url("../assets/bg.jpg") no-repeat;
  width:100%;
  height:100%;
  position:fixed;
  background-size:100% 100%;
  } */
  </style>
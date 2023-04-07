<template>

<el-container style="height: auto"  >
  <el-aside width="250px" >
    <el-menu :default-openeds="['1', '2']"
    router
    @open="handleOpen"
      @close="handleClose"
      active-text-color="#ffd04b">



      <el-menu-item index="index">
        <i class="el-icon-s-order"></i>
        <span slot="title">博客</span>
      </el-menu-item>

      <el-menu-item index="blog/add">
        <i class="el-icon-circle-plus-outline"></i>
        <span slot="title">新增博客</span>
      </el-menu-item>


      <el-menu-item index="library">
        <i class="el-icon-notebook-2"></i>
        <span slot="title">书单</span>
      </el-menu-item>
      <el-menu-item index="about">
        <i class="el-icon-user-solid"></i>
        <span slot="title">关于</span>
      </el-menu-item>
       <el-menu-item index="3" disabled>
        <i class="el-icon-question"></i>
        <span slot="title">敬请期待</span>
      </el-menu-item>
    </el-menu>
  </el-aside>
</el-container>

</template>

<style>
  .el-aside {
    color: #333;
  }

    #poster {
    background:url("/assets/Nav.jpg");
    background-position: center;
    height: 100%;
    width: 100%;
    background-size: cover;
    position: fixed;
  }
</style>

<script>
  export default {
    name: 'NavMenu',
    methods: {
      handleOpen(key, keyPath) {
        console.log(key, keyPath);
      },
      handleClose(key, keyPath) {
        console.log(key, keyPath);
      }
    }
  };
</script>

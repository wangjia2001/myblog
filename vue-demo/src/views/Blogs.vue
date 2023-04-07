<template>
  
  <div class="header" :style="bg">
  <el-container>
    <el-aside ><nav-menu></nav-menu></el-aside>

  <el-container>
  <el-header >MyBlog</el-header>

   <el-main>
       <div>
  <el-timeline>
    <el-timeline-item v-bind:timestamp="item.date" placement="top" v-for="item in blogs" :key="item">
      <el-card>
        <h4><router-link :to="{name: 'BlogDetail', params: {id: item.id}}">{{item.title}}</router-link></h4>
        <p>{{item.content}}</p>
      </el-card>
      
   <router-view></router-view>
    </el-timeline-item>
    
<!-- 
    <el-timeline-item timestamp="2018/4/3" placement="top">
      <el-card>
        <h4>更新 Github 模板</h4>
        <p>王小虎 提交于 2018/4/3 20:46</p>
      </el-card>
    </el-timeline-item>
  -->
  </el-timeline>
  


</div>
   </el-main>

  
</el-container>
</el-container>
<router-view/>
  </div>
  
</template>

<script>
  import NavMenu from '../components/common/NavMenu'
  import backGroundImg from '../assets/bg.jpg'
  export default {
    name: 'Blogs',
    components: {NavMenu},
    data () {
      return {
        blogs: {},
        backGroundImg,
        bg:{
          background:`url(${backGroundImg})`,
          backgroundSize:'100% 100%'
        }
          // {
          //   id:'',
          //   title:'',
          //   date:'',
          //   content:''
          // }
        
        }
    },
    created(){
        const _this = this
        this.$axios
          .get('/blog')
          .then((res) => {
            // console.log(res.data)
            // return res.data
            // const blog = res.data.data
            _this.blogs = res.data
          })
    }

  }
</script>

<style scoped>

/* #building{
background:url("../assets/bg.jpg") no-repeat;
width:100%;
height:100%;
position:fixed;
background-size:100% 100%;
} */
</style>
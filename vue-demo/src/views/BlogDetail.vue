<template>
    <div id="poster">
      <el-container>
    <el-aside ></el-aside>

<el-container>
  <el-header> <h2>{{ blog.title }}</h2></el-header>
   <el-main>
     
      <el-link icon="el-icon-edit" ><router-link :to="{name: 'BlogEdit', params: {id: blog.id}}">编辑</router-link></el-link>
      <el-button icon="el-icon-delete" type="text" @click="deleteForm()">删除</el-button>
      <el-divider></el-divider>
      <div class="content markdown-body" v-html="blog.content"></div>
   </el-main>
  
</el-container>
</el-container>
    </div>
</template>
<script>
  import 'github-markdown-css/github-markdown.css' // 然后添加样式markdown-body
  
  export default {
    name: "BlogDetail",
    
   
    data() {
      return {
        blog: {
          userId: null,
          title: "",
          content: ""
        },
      }
    },
    methods: {
      getBlog() {
        const id = this.$route.params.id
        const _this = this
        this.$axios
          .get('/blog/' + id).then((res) => {
          console.log(res)
          console.log(res.data.data)
          _this.blog = res.data
          // var MarkdownIt = require('markdown-it'),
          //   md = new MarkdownIt();
          // var result = md.render(_this.blog.content);
          
        });
      },
      deleteForm(){
        const id = this.$route.params.id
        this.$axios
        .delete('/blog/delete/' + id).then((res)=>{
          console.log(res)
        });
        this.$message('删除成功');
        this.$router.push('/blog');    
      }
    

    },
    created() {
      this.getBlog()
    }
  }
</script>

<style scoped>
#poster {
    background:url("../assets/bg.jpg") no-repeat;
    background-position: center;
    height: 100%;
    width: 100%;
    background-size: cover;
    position: fixed;
  }
</style>
